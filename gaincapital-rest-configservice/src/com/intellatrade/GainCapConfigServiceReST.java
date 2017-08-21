package com.intellatrade;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.json.JSONObject;

import com.sun.jersey.api.client.ClientResponse.Status;

import WebServices.com.GainCapital.www.AuthenticationResult;
import WebServices.com.GainCapital.www.BlotterOfProductSetting;
import WebServices.com.GainCapital.www.ConfigurationSettings;
import WebServices.com.GainCapital.www.ProductSetting;

@Path("/")
public class GainCapConfigServiceReST {
	@Context 
	ServletConfig servletConfig;
	
	static String userID = "";
	static String password = "";
	static String apiKey = "";
	static String reqWSTopicName = "";
	static String resWSTopicName = "";
	private static String mySQLDBUser = "";
	private static String mySQLDBPassword = "";
	private static String mySQLDBURL = "";
	static String log4jPropFile = "";
	static int reqProcThreadCount = 0;

	
	static boolean completedInitialSetUp = false;
	final static Logger logger = Logger.getLogger(GainCapConfigServiceReST.class.getName());
	static String configService = "";
	static String authService = "";
	static boolean shutDown = false;
	
	@Path("/anonymousproductsettings")
	@GET
	@Produces("application/json")
	public Response getAnonymousProductSettings(){	
		String opDataStr = "";
		try{
			if (!completedInitialSetUp) {
				setProperties(servletConfig);
				setUpLog4jForLogging(servletConfig);
				setAPIKey();
				setconfigService();
				completedInitialSetUp = true;
				logger.debug("Setting completedInitialSetUp to TRUE");
			}
			GainCapConfigWSClient gainCapConfigWSClient = new GainCapConfigWSClient();
			GainCapConfigServiceReST.logger.info("Received a request to invoke GainCapital Configuration WebService!");
			GainCapConfigServiceReST.logger.info("Requested webservice request type is: [ConfigurationService]");
			GainCapConfigServiceReST.logger.info("Requested webservice operation is: [getAnonymousProductSettings]");
			
			BlotterOfProductSetting blotterOfProductSetting = gainCapConfigWSClient.getAnonProdSettings();
			ProductSetting[] productSettings = blotterOfProductSetting.getOutput();
			if (blotterOfProductSetting.isSuccess()){
				opDataStr = gainCapConfigWSClient.mapAnonymousProductSettingsResponse(productSettings);
			} else {							
				GainCapConfigServiceReST.logger.error("WebService request is errored out!!");
				GainCapConfigServiceReST.logger.error("Error message is: [" + blotterOfProductSetting.getErrorNo() 
								+ "] " + blotterOfProductSetting.getMessage());
				GainCapConfigServiceReST.logger.error("Resetting the API Token...");
				GainCapConfigServiceReST.resetAPIKey();
				blotterOfProductSetting = gainCapConfigWSClient.getAnonProdSettings();
				productSettings = blotterOfProductSetting.getOutput();
				opDataStr = gainCapConfigWSClient.mapAnonymousProductSettingsResponse(productSettings);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
		GainCapConfigServiceReST.logger.info("Response is: [" + opDataStr + "]");
		return Response.status(Status.OK).entity(opDataStr).build();
	}

	@Path("/configurationsettings")
	@GET
	@Produces("application/json")
	public Response getConfigurationSettings(){	
		String opDataStr = "";
		try{
			if (!completedInitialSetUp) {
				setProperties(servletConfig);
				setUpLog4jForLogging(servletConfig);
				setAPIKey();
				setconfigService();
				completedInitialSetUp = true;
				logger.debug("Setting completedInitialSetUp to TRUE");
			}
			GainCapConfigWSClient gainCapConfigWSClient = new GainCapConfigWSClient();
			GainCapConfigServiceReST.logger.info("Received a request to invoke GainCapital Configuration WebService!");
			GainCapConfigServiceReST.logger.info("Requested webservice request type is: [ConfigurationService]");
			GainCapConfigServiceReST.logger.info("Requested webservice operation is: [getConfigurationSettings]");
			
			ConfigurationSettings configurationSettings = gainCapConfigWSClient.getConfigSettings();
			if (configurationSettings.isSuccess()){
				opDataStr = gainCapConfigWSClient.mapConfigurationSettingsResponse(configurationSettings);
			} else {
				GainCapConfigServiceReST.logger.error("WebService request is errored out!!");
				GainCapConfigServiceReST.logger.error("Error message is: [" + configurationSettings.getErrorNo() 
								+ "] " + configurationSettings.getMessage());
				GainCapConfigServiceReST.logger.error("Resetting the API Token...");									
				GainCapConfigServiceReST.resetAPIKey();
				configurationSettings = gainCapConfigWSClient.getConfigSettings();
				opDataStr = gainCapConfigWSClient.mapConfigurationSettingsResponse(configurationSettings);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
		GainCapConfigServiceReST.logger.info("Response is: [" + opDataStr + "]");
		return Response.status(Status.OK).entity(opDataStr).build();
	}

	public void setProperties(ServletConfig servletConfig) throws Exception{
		InputStream input = null;
		try {
			System.out.println("Setting up gaincapital-rest-configservice properties...... ");
			String log4jLocation = servletConfig.getInitParameter("gaincapital-rest-configservice-properties-location");
			ServletContext servletContext = servletConfig.getServletContext();
			String webAppPath = servletContext.getRealPath("/");			
			String GainCapConfigReSTIntImplPropPath = webAppPath + log4jLocation;
			System.out.println("GainCapConfigReSTIntImplPropPath is :" + GainCapConfigReSTIntImplPropPath);
			Properties properties = new Properties();
			input = new FileInputStream(GainCapConfigReSTIntImplPropPath);
			properties.load(input);
			userID = properties.getProperty("UserID");
			password = properties.getProperty("Password");
			reqWSTopicName = properties.getProperty("ReqWSTopicName");
			resWSTopicName = properties.getProperty("ResWSTopicName");
			mySQLDBUser = properties.getProperty("MySQLDBUser");
			mySQLDBPassword = properties.getProperty("MySQLDBPassword");
			mySQLDBURL = properties.getProperty("MySQLDBURL");
			log4jPropFile = properties.getProperty("Log4jPropFile");
			authService = properties.getProperty("AuthServiceEndPoint");			
			System.out.println("GainCapConfigServiceReST properties set-up is completed!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			try{
				if (input != null ){input.close();}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception(e);
			}
		}
	}
	
	
	public void setconfigService() throws Exception {
		try {
			AuthenticationResult authenticationResult = new GainCapConfigWSClient().getAuthenticationResults(userID, password);
			if (authenticationResult.getErrorNo().equals("")) {
				if (authenticationResult.getConfigurationService().indexOf("$") != -1) {
					configService = authenticationResult.getConfigurationService().substring(0, authenticationResult.getConfigurationService().indexOf("$"));
				}
				logger.info("Configuration Service endpoint is: " + configService);
			} else {
				throw new Exception("Credentails are invalid or expired!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}
	
	public static synchronized void setAPIKey() throws Exception {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(mySQLDBURL, mySQLDBUser, mySQLDBPassword);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT APIKEY FROM APIKEY WHERE KEY_TYPE = 'B'");
			boolean isRSEmpty = true;
			while (resultSet.next()) {
				isRSEmpty = false;
			}
			if (isRSEmpty == true){
				AuthenticationResult authenticationResult = new GainCapConfigWSClient().getAuthenticationResults(userID, password);
				apiKey = authenticationResult.getToken();
				logger.debug("API Key is: [" + apiKey + "]");
				logger.info("Inserting the API Key into MySQL DB table (APIKEY) !!");
				statement.executeUpdate("INSERT INTO APIKEY (KEY_TYPE, APIKEY) VALUES ('B', '" + apiKey + "')");
			} else {
				logger.info("API Key is already set in the MySQL DB table (APIKEY) !!");
			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}
	
	public static synchronized void resetAPIKey() throws Exception {
		try{
			apiKey = new GainCapConfigWSClient().getAuthenticationResults(userID, password).getToken();
			logger.debug("API Key is: [" + apiKey + "]");
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(mySQLDBURL, mySQLDBUser, mySQLDBPassword);
			Statement statement = connection.createStatement();
			statement.execute("DELETE FROM APIKEY WHERE KEY_TYPE = 'B'");
			statement.executeUpdate("INSERT INTO APIKEY (KEY_TYPE, APIKEY) VALUES ('B', '" + apiKey + "')");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}

	
	public void setUpLog4jForLogging(ServletConfig servletConfig) throws Exception{
		try {
			System.setProperty("class_name", "GainCapConfigServiceReST");
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
}