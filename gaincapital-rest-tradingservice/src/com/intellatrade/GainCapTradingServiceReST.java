package com.intellatrade;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import com.sun.jersey.api.client.ClientResponse.Status;

import WebServices.com.GainCapital.www.Activity;
import WebServices.com.GainCapital.www.AuthenticationResult;
import WebServices.com.GainCapital.www.BlotterOfActivity;
import WebServices.com.GainCapital.www.BlotterOfDealInfo;
import WebServices.com.GainCapital.www.BlotterOfMargin;
import WebServices.com.GainCapital.www.Confirmation;
import WebServices.com.GainCapital.www.Deal;
import WebServices.com.GainCapital.www.DealInfo;
import WebServices.com.GainCapital.www.DealResponse;
import WebServices.com.GainCapital.www.Margin;
import WebServices.com.GainCapital.www.OrderResponse;
import WebServices.com.GainCapital.www.BlotterOfDeal;

@Path("/")
public class GainCapTradingServiceReST {
	@Context ServletConfig servletConfig;

	static String buyUserID = "";
	static String buyPassword = "";
	static String sellUserID = "";
	static String sellPassword = "";
	static String buyApiKey = "";
	static String sellApiKey = "";
	private static String mySQLDBUser = "";
	private static String mySQLDBPassword = "";
	private static String mySQLDBURL = "";
	static String log4jPropFile = "";
	static int reqProcThreadCount = 0;

	static boolean completedInitialSetUp = false;
	final static Logger logger = Logger.getLogger(GainCapTradingServiceReST.class.getName());
	static String authService = "";
	static boolean shutDown = false;

	// -----------------------------Close Deal -------------------------//
	@Path("/closedeal")
	@GET
	@Produces("application/json")
	public Response closeDeal(
			@QueryParam("product") String product,
			@QueryParam("buySell") String buySell,
			@QueryParam("amount") String amount,
			@QueryParam("rate") String rate,
			@QueryParam("dealSequence") String dealSequence) 
	{
		String opDataStr = "";
		try {
			if (!completedInitialSetUp) {
				setProperties(servletConfig);
				setUpLog4jForLogging(servletConfig);
				setAPIKey();
				completedInitialSetUp = true;
				logger.debug("Setting completedInitialSetUp to TRUE");
			}
			GainCapTradingWSClient gainCapTradingWSClient = new GainCapTradingWSClient();
			GainCapTradingServiceReST.logger.info("Received a request to invoke GainCapital Trading WebService!");
			GainCapTradingServiceReST.logger.info("Requested webservice request type is: [TradingService]");
			GainCapTradingServiceReST.logger.info("Requested webservice operation is: [closeDeal]");
			DealResponse dealResponse = gainCapTradingWSClient.closeDeal(product, buySell, amount, rate, dealSequence);
			if (dealResponse.isSuccess()) {
				opDataStr = gainCapTradingWSClient.mapcloseDealResponse(dealResponse);
			} else if (dealResponse.getErrorNo().trim().equals("1001")) {
				GainCapTradingServiceReST.logger.error("WebService request is errored out!!");
				GainCapTradingServiceReST.logger.error("Error message is: ["
														+ dealResponse.getErrorNo() + "] "
														+ dealResponse.getMessage());
				GainCapTradingServiceReST.logger.error("Resetting the API Token...");
				GainCapTradingServiceReST.resetAPIKey();
				dealResponse = gainCapTradingWSClient.closeDeal(product,buySell, amount, rate, dealSequence);
				opDataStr = gainCapTradingWSClient.mapcloseDealResponse(dealResponse);
			} else {
				opDataStr = dealResponse.getMessage() + ". Error No is: [" + dealResponse.getErrorNo() + "].";
				GainCapTradingServiceReST.logger.info("Response is: [" + opDataStr + "]");
				return Response.status(Status.OK)
						.header("Access-Control-Allow-Origin", "*")
						.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
						.entity(opDataStr).build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.INTERNAL_SERVER_ERROR)
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
					.entity(e.getMessage()).build();
			
		}
		GainCapTradingServiceReST.logger.info("Response is: [" + opDataStr + "]");
		return Response.status(Status.OK)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.entity(opDataStr).build();
	}

	// -----------------------------Get Deal Blotter -------------------------//
	@Path("/dealblotter")
	@GET
	@Produces("application/json")
	public Response getDealBlotter() {
		String opDataStr = "";
		try {
			if (!completedInitialSetUp) {
				setProperties(servletConfig);
				setUpLog4jForLogging(servletConfig);
				setAPIKey();
				completedInitialSetUp = true;
				logger.debug("Setting completedInitialSetUp to TRUE");
			}
			GainCapTradingWSClient gainCapTradingWSClient = new GainCapTradingWSClient();
			GainCapTradingServiceReST.logger.info("Received a request to invoke GainCapital Trading WebService!");
			GainCapTradingServiceReST.logger.info("Requested webservice request type is: [TradingService]");
			GainCapTradingServiceReST.logger.info("Requested webservice operation is: [getDealBlotter]");
			BlotterOfDeal blotterofDeal = gainCapTradingWSClient.getDealBlotter();
			Deal[] deal = blotterofDeal.getOutput();
			if (blotterofDeal.isSuccess()) {
				opDataStr = gainCapTradingWSClient.mapDealBlotterResponse(deal);
			} else if (blotterofDeal.getErrorNo().trim().equals("1001")) {
				GainCapTradingServiceReST.logger.error("WebService request is errored out!!");
				GainCapTradingServiceReST.logger.error("Error message is: ["
														+ blotterofDeal.getErrorNo() + "] "
														+ blotterofDeal.getMessage());
				GainCapTradingServiceReST.logger.error("Resetting the API Token...");
				GainCapTradingServiceReST.resetAPIKey();
				blotterofDeal = gainCapTradingWSClient.getDealBlotter();
				deal = blotterofDeal.getOutput();
				opDataStr = gainCapTradingWSClient.mapDealBlotterResponse(deal);
			} else  {
				opDataStr = blotterofDeal.getMessage() + ". Error No is: [" + blotterofDeal.getErrorNo() + "].";
				GainCapTradingServiceReST.logger.info("Response is: [" + opDataStr + "]");
				return Response.status(Status.OK)
						.header("Access-Control-Allow-Origin", "*")
						.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
						.entity(opDataStr).build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.INTERNAL_SERVER_ERROR)
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
					.entity(e.getMessage()).build();
		}
		GainCapTradingServiceReST.logger.info("Response is: [" + opDataStr + "]");
		return Response.status(Status.OK)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.entity(opDataStr).build();
	}
	
	
	// -----------------------------Get Open Deal Blotter -------------------------//
		@Path("/opendealblotter")
		@GET
		@Produces("application/json")
		public Response getOpenDealBlotter() {
			String opDataStr = "";
			try {
				if (!completedInitialSetUp) {
					setProperties(servletConfig);
					setUpLog4jForLogging(servletConfig);
					setAPIKey();
					completedInitialSetUp = true;
					logger.debug("Setting completedInitialSetUp to TRUE");
				}
				GainCapTradingWSClient gainCapTradingWSClient = new GainCapTradingWSClient();
				GainCapTradingServiceReST.logger.info("Received a request to invoke GainCapital Trading WebService!");
				GainCapTradingServiceReST.logger.info("Requested webservice request type is: [TradingService]");
				GainCapTradingServiceReST.logger.info("Requested webservice operation is: [getOpenDealBlotter]");
				BlotterOfDeal blotterofDeal = gainCapTradingWSClient.getOpenDealBlotter();
				Deal[] deal = blotterofDeal.getOutput();
				if (blotterofDeal.isSuccess()) {
					opDataStr = gainCapTradingWSClient.mapDealBlotterResponse(deal);
				} else if (blotterofDeal.getErrorNo().trim().equals("1001")){
					GainCapTradingServiceReST.logger.error("WebService request is errored out!!");
					GainCapTradingServiceReST.logger.error("Error message is: ["
															+ blotterofDeal.getErrorNo() + "] "
															+ blotterofDeal.getMessage());
					GainCapTradingServiceReST.logger.error("Resetting the API Token...");
					GainCapTradingServiceReST.resetAPIKey();
					blotterofDeal = gainCapTradingWSClient.getOpenDealBlotter();
					deal = blotterofDeal.getOutput();
					opDataStr = gainCapTradingWSClient.mapOpenDealBlotterResponse(deal);
				} else  {
					opDataStr = blotterofDeal.getMessage() + ". Error No is: [" + blotterofDeal.getErrorNo() + "].";
					GainCapTradingServiceReST.logger.info("Response is: [" + opDataStr + "]");
					return Response.status(Status.OK)
							.header("Access-Control-Allow-Origin", "*")
							.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
							.entity(opDataStr).build();
				}
			} catch (Exception e) {
				e.printStackTrace();
				return Response.status(Status.INTERNAL_SERVER_ERROR)
						.header("Access-Control-Allow-Origin", "*")
						.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
						.entity(e.getMessage()).build();
			}
			GainCapTradingServiceReST.logger.info("Response is: [" + opDataStr + "]");
			return Response.status(Status.OK)
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
					.entity(opDataStr).build();
		}
		
		
		// -----------------------------Get  Deal Info Blotter -------------------------//
		@Path("/dealinfoblotter")
		@GET
		@Produces("application/json")
		public Response getDealInfoBlotter(
				@QueryParam("product") String product,
		        @QueryParam("confirmationNumber") String  confirmationNumber,
		        @QueryParam("dealReference") String  dealReference)
		{
			String opDataStr = "";
			try {
				if (!completedInitialSetUp) {
					setProperties(servletConfig);
					setUpLog4jForLogging(servletConfig);
					setAPIKey();
					completedInitialSetUp = true;
					logger.debug("Setting completedInitialSetUp to TRUE");
				}
				GainCapTradingWSClient gainCapTradingWSClient = new GainCapTradingWSClient();
				GainCapTradingServiceReST.logger.info("Received a request to invoke GainCapital Trading WebService!");
				GainCapTradingServiceReST.logger.info("Requested webservice request type is: [TradingService]");
				GainCapTradingServiceReST.logger.info("Requested webservice operation is: [dealInfoBlotter]");
				BlotterOfDealInfo blotterofDeaInfo = gainCapTradingWSClient.getDealInfoBlotter(product, confirmationNumber, dealReference);
				DealInfo[] dealInfo = blotterofDeaInfo.getOutput();
				if (blotterofDeaInfo.isSuccess()) {
					opDataStr = gainCapTradingWSClient.mapDealInfoBlotterResponse(dealInfo);
				} else if (blotterofDeaInfo.getErrorNo().trim().equals("1001")) {
					GainCapTradingServiceReST.logger.error("WebService request is errored out!!");
					GainCapTradingServiceReST.logger.error("Error message is: ["
															+ blotterofDeaInfo.getErrorNo() + "] "
															+ blotterofDeaInfo.getMessage());
					GainCapTradingServiceReST.logger.error("Resetting the API Token...");
					GainCapTradingServiceReST.resetAPIKey();
					blotterofDeaInfo = gainCapTradingWSClient.getDealInfoBlotter(product, confirmationNumber, dealReference);
					dealInfo = blotterofDeaInfo.getOutput();
					opDataStr = gainCapTradingWSClient.mapDealInfoBlotterResponse(dealInfo);
				} else  {
					opDataStr = blotterofDeaInfo.getMessage() + ". Error No is: [" + blotterofDeaInfo.getErrorNo() + "].";
					GainCapTradingServiceReST.logger.info("Response is: [" + opDataStr + "]");
					return Response.status(Status.OK)
							.header("Access-Control-Allow-Origin", "*")
							.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
							.entity(opDataStr).build();
				}
			} catch (Exception e) {
				e.printStackTrace();
				return Response.status(Status.INTERNAL_SERVER_ERROR)
						.header("Access-Control-Allow-Origin", "*")
						.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
						.entity(e.getMessage()).build();
			}
			GainCapTradingServiceReST.logger.info("Response is: [" + opDataStr + "]");
			return Response.status(Status.OK)
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
					.entity(opDataStr).build();
		}
		
		// -----------------------------Get  Deal Request At  Best -------------------------//
		@Path("/dealrequestatbest")
		@POST
		@Produces("application/json")
		public Response dealRequestAtBest(
				@QueryParam("product") String product,
		        @QueryParam("buySell") String  buySell,
		        @QueryParam("amount") String  amount, 
		        @QueryParam("userName") String  userName, 
		        String inputString)
		{
			String opDataStr = "";
			
			try {
				if (!completedInitialSetUp) {
					setProperties(servletConfig);
					setUpLog4jForLogging(servletConfig);
					setAPIKey();
					completedInitialSetUp = true;
					logger.debug("Setting completedInitialSetUp to TRUE");
				}
				if(product == null 
						|| buySell == null 
						|| amount == null  
						|| userName == null 
					)
				{
					GainCapTradingServiceReST.logger.info("Missing request params!!");
					return Response.status(Status.BAD_REQUEST)
							.header("Access-Control-Allow-Origin", "*")
							.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
							.entity("Missing request params!!").build();
				}
				
				GainCapTradingWSClient gainCapTradingWSClient = new GainCapTradingWSClient();
				GainCapTradingServiceReST.logger.info("Received a request to invoke GainCapital Trading WebService!");
				GainCapTradingServiceReST.logger.info("Requested webservice request type is: [TradingService]");
				GainCapTradingServiceReST.logger.info("Requested webservice operation is: [dealRequestAtBest]");
				DealResponse dealResponse = gainCapTradingWSClient.getDealRequestAtBest(product, buySell, amount);
				if (dealResponse.isSuccess()) {
					opDataStr = gainCapTradingWSClient.mapDealRequestAtBestResponse(dealResponse);
					insertDealRequestToDB(userName, opDataStr, inputString);				
				} else if (dealResponse.getErrorNo().trim().equals("1001")) {
					GainCapTradingServiceReST.logger.error("WebService request is errored out!!");
					GainCapTradingServiceReST.logger.error("Error message is: ["
															+ dealResponse.getErrorNo() + "] "
															+ dealResponse.getMessage());
					GainCapTradingServiceReST.logger.error("Resetting the API Token...");
					GainCapTradingServiceReST.resetAPIKey();
					dealResponse = gainCapTradingWSClient.getDealRequestAtBest(product, buySell, amount);
					opDataStr = gainCapTradingWSClient.mapDealRequestAtBestResponse(dealResponse);
					insertDealRequestToDB(userName, opDataStr, inputString);
				} else  {
					opDataStr = dealResponse.getMessage() + ". Error No is: [" + dealResponse.getErrorNo() + "].";
					GainCapTradingServiceReST.logger.info("Response is: [" + opDataStr + "]");
					return Response.status(Status.OK)
							.header("Access-Control-Allow-Origin", "*")
							.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
							.entity(opDataStr).build();
				}
			} catch (Exception e) {
				e.printStackTrace();
				return Response.status(Status.INTERNAL_SERVER_ERROR)
						.header("Access-Control-Allow-Origin", "*")
						.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
						.entity(e.getMessage()).build();
			}
			GainCapTradingServiceReST.logger.info("Response is: [" + opDataStr + "]");
			return Response.status(Status.OK)
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
					.entity(opDataStr).build();
		}

	// -----------------------------Get Deal Request -------------------------//
	@Path("/dealrequest")
	@POST
	@Produces("application/json")
	public Response getDealRequest(
			@QueryParam("product") String product,
			@QueryParam("buySell") String buySell,
			@QueryParam("amount") String amount, 
			@QueryParam("rate") String rate,
			@QueryParam("userName") String  userName, 
	        String inputString) 
	{
		String opDataStr = "";
		if(product == null 
				|| buySell == null 
				|| amount == null  
				|| userName == null 
			)
		{
			GainCapTradingServiceReST.logger.info("Missing request params!!");
			return Response.status(Status.BAD_REQUEST)
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
					.entity("Missing request params!!").build();
		}
		try {
			if (!completedInitialSetUp) {
				setProperties(servletConfig);
				setUpLog4jForLogging(servletConfig);
				setAPIKey();
				completedInitialSetUp = true;
				logger.debug("Setting completedInitialSetUp to TRUE");
			}
			GainCapTradingWSClient gainCapTradingWSClient = new GainCapTradingWSClient();
			GainCapTradingServiceReST.logger.info("Received a request to invoke GainCapital Trading WebService!");
			GainCapTradingServiceReST.logger.info("Requested webservice request type is: [TradingService]");
			GainCapTradingServiceReST.logger.info("Requested webservice operation is: [getDealRequest]");
			DealResponse dealResponse = gainCapTradingWSClient.getDealRequest(product, buySell, amount, rate);
			if (dealResponse.isSuccess()) {
				opDataStr = gainCapTradingWSClient.mapDealRequestResponse(dealResponse);
				insertDealRequestToDB(userName, opDataStr, inputString);			
			} else if (dealResponse.getErrorNo().trim().equals("1001")) {
				GainCapTradingServiceReST.logger.error("WebService request is errored out!!");
				GainCapTradingServiceReST.logger.error("Error message is: ["
														+ dealResponse.getErrorNo() + "] "
														+ dealResponse.getMessage());
				GainCapTradingServiceReST.logger.error("Resetting the API Token...");
				GainCapTradingServiceReST.resetAPIKey();
				dealResponse = gainCapTradingWSClient.getDealRequest(product, buySell, amount, rate);
				opDataStr = gainCapTradingWSClient.mapDealRequestResponse(dealResponse);
				insertDealRequestToDB(userName, opDataStr, inputString);
			} else  {
				opDataStr = dealResponse.getMessage() + ". Error No is: [" + dealResponse.getErrorNo() + "].";
				GainCapTradingServiceReST.logger.info("Response is: [" + opDataStr + "]");
				return Response.status(Status.OK)
						.header("Access-Control-Allow-Origin", "*")
						.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
						.entity(opDataStr).build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.INTERNAL_SERVER_ERROR)
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
					.entity(e.getMessage()).build();
		}
		GainCapTradingServiceReST.logger.info("Response is: [" + opDataStr + "]");
		return Response.status(Status.OK)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.entity(opDataStr).build();
	}
	
	

	// -----------------------------Get Deal Request With Filter -------------------------//
		@Path("/dealrequestfilter")
		@GET
		@Produces("application/json")
		public Response getDealRequest(@QueryParam("product") String product) {
			String opDataStr = "";
			try {
				if (!completedInitialSetUp) {
					setProperties(servletConfig);
					setUpLog4jForLogging(servletConfig);
					setAPIKey();
					completedInitialSetUp = true;
					logger.debug("Setting completedInitialSetUp to TRUE");
				}
				GainCapTradingWSClient gainCapTradingWSClient = new GainCapTradingWSClient();
				GainCapTradingServiceReST.logger.info("Received a request to invoke GainCapital Trading WebService!");
				GainCapTradingServiceReST.logger.info("Requested webservice request type is: [TradingService]");
				GainCapTradingServiceReST.logger.info("Requested webservice operation is: [closeDeal]");
				BlotterOfDeal blotterOfDeal = gainCapTradingWSClient.getDealBlotterWithFilter(product);
				if (blotterOfDeal.isSuccess()) {
					opDataStr = gainCapTradingWSClient.mapDealBlotterWithFilterResponse(blotterOfDeal);
				} else if (blotterOfDeal.getErrorNo().trim().equals("1001")) {
					GainCapTradingServiceReST.logger.error("WebService request is errored out!!");
					GainCapTradingServiceReST.logger.error("Error message is: ["
															+ blotterOfDeal.getErrorNo() + "] "
															+ blotterOfDeal.getMessage());
					GainCapTradingServiceReST.logger.error("Resetting the API Token...");
					GainCapTradingServiceReST.resetAPIKey();
					blotterOfDeal = gainCapTradingWSClient.getDealBlotterWithFilter(product);
					opDataStr = gainCapTradingWSClient.mapDealBlotterWithFilterResponse(blotterOfDeal);
				} else  {
					opDataStr = blotterOfDeal.getMessage() + ". Error No is: [" + blotterOfDeal.getErrorNo() + "].";
					GainCapTradingServiceReST.logger.info("Response is: [" + opDataStr + "]");
					return Response.status(Status.OK)
							.header("Access-Control-Allow-Origin", "*")
							.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
							.entity(opDataStr).build();
				}
			} catch (Exception e) {
				e.printStackTrace();
				return Response.status(Status.INTERNAL_SERVER_ERROR)
						.header("Access-Control-Allow-Origin", "*")
						.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
						.entity(e.getMessage()).build();
			}
			GainCapTradingServiceReST.logger.info("Response is: [" + opDataStr + "]");
			return Response.status(Status.OK)
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
					.entity(opDataStr).build();
		}
		
	public void setProperties(ServletConfig servletConfig) throws Exception {
		InputStream input = null;
		try {
			System.out.println("Setting up gaincapital-rest-tradingservice properties...... ");
			String log4jLocation = servletConfig.getInitParameter("gaincapital-rest-tradingservice-properties-location");
			ServletContext servletContext = servletConfig.getServletContext();
			String webAppPath = servletContext.getRealPath("/");
			String GainCapTradingReSTIntImplPropPath = webAppPath + log4jLocation;
			System.out.println("GainCapTradingReSTIntImplPropPath is :" + GainCapTradingReSTIntImplPropPath);
			Properties properties = new Properties();
			input = new FileInputStream(GainCapTradingReSTIntImplPropPath);
			properties.load(input);
			buyUserID = properties.getProperty("BuyUserID");
			buyPassword = properties.getProperty("BuyPassword");
			sellUserID = properties.getProperty("SellUserID");
			sellPassword = properties.getProperty("SellPassword");
			mySQLDBUser = properties.getProperty("MySQLDBUser");
			mySQLDBPassword = properties.getProperty("MySQLDBPassword");
			mySQLDBURL = properties.getProperty("MySQLDBURL");
			log4jPropFile = properties.getProperty("Log4jPropFile");
			authService = properties.getProperty("AuthServiceEndPoint");
			System.out.println("GainCapTradingServiceReST properties set-up is completed!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			try {
				if (input != null) { input.close();	}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception(e);
			}
		}
	}


	public static synchronized void setAPIKey() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(mySQLDBURL, mySQLDBUser, mySQLDBPassword);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM APIKEY WHERE KEY_TYPE = 'B'");
			boolean isRSEmpty = true;
			while (resultSet.next()) {
				isRSEmpty = false;
			}
			if (isRSEmpty == true) {
				AuthenticationResult authenticationResult;
				authenticationResult = new GainCapTradingWSClient().getAuthenticationResults(buyUserID, buyPassword);
				buyApiKey = authenticationResult.getToken();
				logger.debug("API Key is: [" + buyApiKey + "]");
				logger.info("Inserting the API Key into MySQL DB table (APIKEY) !!");
				statement.executeUpdate("INSERT INTO APIKEY (KEY_TYPE, APIKEY) VALUES ('B', '" + buyApiKey + "')");
				statement.close();
				connection.close();
			} else {
				logger.info("API Key is already set in the MySQL DB table (APIKEY) !!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}

	public static synchronized void resetAPIKey() throws Exception {
		try {
			AuthenticationResult authenticationResult;
			authenticationResult = new GainCapTradingWSClient().getAuthenticationResults(buyUserID, buyPassword);
			buyApiKey = authenticationResult.getToken();
			logger.debug("API Key is: [" + buyApiKey + "]");
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(mySQLDBURL, mySQLDBUser, mySQLDBPassword);
			Statement statement = connection.createStatement();
			statement.execute("DELETE FROM APIKEY WHERE KEY_TYPE = 'B'");
			logger.info("Inserting the API Key into MySQL DB table (APIKEY) !!");
			statement.executeUpdate("INSERT INTO APIKEY (KEY_TYPE, APIKEY) VALUES ('B', '" + buyApiKey + "')");
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}


	public void setUpLog4jForLogging(ServletConfig servletConfig)
			throws Exception {
		try {
			System.setProperty("class_name", "GainCapTradingServiceReST");
			System.out.println("Setting up Log4j...... ");
			String log4jLocation = servletConfig.getInitParameter("log4j-properties-location");
			ServletContext servletContext = servletConfig.getServletContext();
			String webAppPath = servletContext.getRealPath("/");
			String log4jPropPath = webAppPath + log4jLocation;
			System.out.println("log4jPropPath is :" + log4jPropPath);
			File log4jPropFile = new File(log4jPropPath);
			Properties log4jProperties = new Properties();
			log4jProperties.load(new FileInputStream(log4jPropFile));
			org.apache.log4j.PropertyConfigurator.configure(log4jProperties);
			System.out.println("Log4j set-up with PropertyConfigurator is completed!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}
	
	public void insertDealRequestToDB(String userName, String opDataStr, String inputString ) throws Exception {
		try {
		JSONObject dealResJSON = new JSONObject(opDataStr);
		JSONObject recommendationObjJSON = null;
		if (inputString != null && !inputString.equals("")){
			recommendationObjJSON = new JSONObject(inputString);
		}
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(mySQLDBURL, mySQLDBUser, mySQLDBPassword);
		GainCapTradingServiceReST.logger.info("Inserting the dealrequest response into the MySQL database...");
		String insertStmt = "";
		if (inputString == null || inputString.equals("")){
			insertStmt = 
					   "INSERT INTO dealRequest_Response"
					   + "(" 
							+ "product,"
							+ "buySell,"
							+ "amount,"
							+ "rate,"
							+ "dealId,"
							+ "ErrorNo,"
							+ "dealDate,"
							+ "bankConfirmation,"
							+ "Message,"
							+ "success,"
							+ "IsClosePosition,"
							+ "OutgoingMarginPositionInUSD,"
							+ "HedgeSplitFactor,"
							+ "OutgoingMarginPosted,"
							+ "DealProcessingTime,"
							+ "OutgoingMarginPostedInCcy,"
							+ "OutgoingMarginRealized,"
							+ "OutgoingMarginRealizedInBase,"
							+ "OutgoingMarginRealizedInCcy,"
							+ "OutgoingPositionCcy,"
							+ "OutgoingPosition,"
							+ "OutgoingPositionUSDValue,"
							+ "OutgoingPositionAverageRat,"
							+ "Hedging,"
							+ "PointAndShootDealID,"
							+ "PositionAction,"
							+ "UniqueSocketID,"
							+ "username,"
							+ "sysdate"
						+ ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		} else {
			insertStmt = 
					   "INSERT INTO dealRequest_Response"
					   + "(" 
							+ "product,"
							+ "buySell,"
							+ "amount,"
							+ "rate,"
							+ "dealId,"
							+ "ErrorNo,"
							+ "dealDate,"
							+ "bankConfirmation,"
							+ "Message,"
							+ "success,"
							+ "IsClosePosition,"
							+ "OutgoingMarginPositionInUSD,"
							+ "HedgeSplitFactor,"
							+ "OutgoingMarginPosted,"
							+ "DealProcessingTime,"
							+ "OutgoingMarginPostedInCcy,"
							+ "OutgoingMarginRealized,"
							+ "OutgoingMarginRealizedInBase,"
							+ "OutgoingMarginRealizedInCcy,"
							+ "OutgoingPositionCcy,"
							+ "OutgoingPosition,"
							+ "OutgoingPositionUSDValue,"
							+ "OutgoingPositionAverageRat,"
							+ "Hedging,"
							+ "PointAndShootDealID,"
							+ "PositionAction,"
							+ "UniqueSocketID,"
							+ "username,"
							+ "recommendation_datetime,"
							+ "recommendation_day,"
							+ "recommendation_type,"
							+ "recommendation_symbol,"
							+ "recommendation_price,"
							+ "recommendation_stoploss,"
							+ "recommendation_takeprofit,"
							+ "sysdate"
						+ ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		}

					PreparedStatement preparedStatement = connection.prepareStatement(insertStmt);
					preparedStatement.setString (1, dealResJSON.get("product").toString());
					preparedStatement.setString (2, dealResJSON.get("buySell").toString());
					preparedStatement.setString (3, dealResJSON.get("amount").toString());
					preparedStatement.setString (4, dealResJSON.get("rate").toString());
					preparedStatement.setString (5, dealResJSON.get("dealId").toString());
					preparedStatement.setString (6, dealResJSON.get("errorNo").toString());
					preparedStatement.setString (7, dealResJSON.get("dealDate").toString());
					preparedStatement.setString (8, dealResJSON.get("bankConfirmation").toString());
					preparedStatement.setString (9, dealResJSON.get("message").toString());
					preparedStatement.setBoolean(10, Boolean.parseBoolean(dealResJSON.get("success").toString()));
					preparedStatement.setBoolean(11, Boolean.parseBoolean(dealResJSON.get("isClosePosition").toString()));
					preparedStatement.setDouble(12, Double.parseDouble(dealResJSON.get("outgoingMarginPositionInUSD").toString()));   
					preparedStatement.setDouble(13, Double.parseDouble(dealResJSON.get("hedgeSplitFactor").toString()));
					preparedStatement.setDouble(14, Double.parseDouble(dealResJSON.get("outgoingMarginPosted").toString()));
					preparedStatement.setInt(15, Integer.parseInt(dealResJSON.get("dealProcessingTime").toString()));
					preparedStatement.setDouble(16, Double.parseDouble(dealResJSON.get("outgoingMarginPostedInCcy").toString()));
					preparedStatement.setDouble(17, Double.parseDouble(dealResJSON.get("outgoingMarginRealized").toString()));
					preparedStatement.setDouble(18, Double.parseDouble(dealResJSON.get("outgoingMarginRealizedInBase").toString()));
					preparedStatement.setDouble(19, Double.parseDouble(dealResJSON.get("outgoingMarginRealizedInCcy").toString()));
					preparedStatement.setDouble(20, Double.parseDouble(dealResJSON.get("outgoingPositionCcy").toString()));
					preparedStatement.setDouble(21, Double.parseDouble(dealResJSON.get("outgoingPosition").toString()));
					preparedStatement.setDouble(22, Double.parseDouble(dealResJSON.get("outgoingPositionUSDValue").toString()));
					preparedStatement.setDouble(23, Double.parseDouble(dealResJSON.get("outgoingPositionAverageRate").toString()));
					preparedStatement.setInt(24, (int) dealResJSON.get("hedging"));
					preparedStatement.setInt(25, (int) dealResJSON.get("pointAndShootDealID"));
					preparedStatement.setString(26, dealResJSON.get("positionAction").toString());
					preparedStatement.setString(27, dealResJSON.get("uniqueSocketID").toString());
					preparedStatement.setString(28, userName);
					if (inputString == null || inputString.equals("")){
						SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/d/yyyy HH:mm:ss aa");
						Date recomm_datetime = simpleDateFormat.parse(dealResJSON.get("dealDate").toString());	
						java.sql.Date sql_recomm_datetime = new java.sql.Date(recomm_datetime.getTime()); 
						preparedStatement.setDate(29, sql_recomm_datetime);
					} else {
						SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/d/yyyy HH:mm:ss");
						Date recomm_datetime = simpleDateFormat.parse(recommendationObjJSON.get("recommendation_datetime").toString());	
						java.sql.Date sql_recomm_datetime = new java.sql.Date(recomm_datetime.getTime()); 
						preparedStatement.setDate(29, sql_recomm_datetime);
						preparedStatement.setString(30, recommendationObjJSON.get("recommendation_day").toString());
						preparedStatement.setString(31, recommendationObjJSON.get("recommendation_type").toString());
						preparedStatement.setString(32, recommendationObjJSON.get("recommendation_symbol").toString());
						preparedStatement.setDouble(33, Double.parseDouble(recommendationObjJSON.get("recommendation_price").toString()));
						preparedStatement.setDouble(34, Double.parseDouble(recommendationObjJSON.get("recommendation_stoploss").toString()));
						preparedStatement.setDouble(35, Double.parseDouble(recommendationObjJSON.get("recommendation_takeprofit").toString()));
						simpleDateFormat = new SimpleDateFormat("M/d/yyyy HH:mm:ss aa");
						recomm_datetime = simpleDateFormat.parse(dealResJSON.get("dealDate").toString());	
						sql_recomm_datetime = new java.sql.Date(recomm_datetime.getTime());
						preparedStatement.setDate(36, sql_recomm_datetime);
					}
					preparedStatement.executeUpdate();
					preparedStatement.close();
					connection.close();
					GainCapTradingServiceReST.logger.info("Dealrequest response inserted!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}
}

