package com.intellatrade;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

public class GainCapRateServiceTcpClientWebSocket {
	static String apiKey = "";
	
	static String userID = "";
	static String password = "";

	static String mySQLDBUser = "";
	static String mySQLDBPassword = "";
	static String mySQLDBURL = "";
	static String rateServiceHost = "";
	static String log4jPropFile = "";
	static String rateDataBroadcastRestEndpoint="";
	static int rateServicePort = 0;
	static String configSettingRestEndpoint = "";
	static Logger logger;
	static int publisherThreadCount = 0;
	static String webSocketServerEndPoint = "";
	
	static DataOutputStream dataOutputStream = null;
	static BufferedReader bufferedReader = null;
	static Socket socket = null;
	
	public static WebsocketClientEndpoint clientEndPoint;
	
	private static ExecutorService executorService = null;
	
	public static synchronized WebsocketClientEndpoint getWebsocketClientEndpoint(){
		return clientEndPoint;
	}

	public static synchronized void resetWebsocketClientEndpoint() throws Exception{
		try {
			URI uri = new URI(webSocketServerEndPoint);
			clientEndPoint = new WebsocketClientEndpoint(uri);
	        clientEndPoint.addMessageHandler (new WebsocketClientEndpoint.MessageHandler() {
	            public void handleMessage(String message) { }
	        });
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} 
	}
	
	public static void main(String[] args) throws Exception {       
		GainCapRateServiceTcpClientWebSocket gainCapRateServiceTcpClient = new GainCapRateServiceTcpClientWebSocket();
		gainCapRateServiceTcpClient.setProperties();
		System.setProperty("class_name", "GainCapRateServiceTcpClientWebSocket");
		logger = Logger.getLogger(GainCapRateServiceTcpClientWebSocket.class.getName());
		Properties log4jProperties = new Properties();
		log4jProperties.load(new FileInputStream(log4jPropFile));
	    org.apache.log4j.PropertyConfigurator.configure(log4jProperties);
	    logger.info("Completed setting runtime properties...");
	    gainCapRateServiceTcpClient.setRateServiceConnParams();
	    gainCapRateServiceTcpClient.connectToRateService();
	}

	
	public void setProperties() throws Exception{
		InputStream input = null;
		try {
			Properties properties = new Properties();
			input = new FileInputStream("GainCapRateServiceTcpClientWebSocket.properties");
			properties.load(input);
			
			userID = properties.getProperty("UserID");
			password = properties.getProperty("Password");
			mySQLDBUser = properties.getProperty("MySQLDBUser");
			mySQLDBPassword = properties.getProperty("MySQLDBPassword");
			mySQLDBURL = properties.getProperty("MySQLDBURL");

			configSettingRestEndpoint = properties.getProperty("ConfigSettingRestEndpoint");
			log4jPropFile = properties.getProperty("Log4jPropFile");
			rateDataBroadcastRestEndpoint = properties.getProperty("RateDataBroadcastRestEndpoint");
			publisherThreadCount = Integer.parseInt(properties.getProperty("PublisherThreadCount"));
			webSocketServerEndPoint = properties.getProperty("WebSocketServerEndPoint");			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			try{
				input.close();
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception(e);
			}
		}
	}

	public void setRateServiceConnParams() throws Exception {
		try{        
			String urlString = configSettingRestEndpoint;
			URL url = new URL(urlString);
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setRequestMethod("GET");
			
			InputStream inputStream = new BufferedInputStream(httpURLConnection.getInputStream());
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"), 8);
			
			StringBuilder stringBuilder = new StringBuilder();
			String line = null;
			while ((line =bufferedReader.readLine()) != null ){
				stringBuilder.append(line);
			}
			logger.info("ConfigSetting ReST response is [" + stringBuilder.toString() + "]");	
			JSONObject responseJSON = new JSONObject(stringBuilder.toString());
			
			JSONArray jsonArray = responseJSON.getJSONArray("ratesConnection");
			rateServiceHost = jsonArray.getJSONObject(3).get("ip").toString();
			rateServicePort = Integer.parseInt(jsonArray.getJSONObject(3).get("port").toString());
			logger.info("rateServiceHost is [" + rateServiceHost + "]");
			logger.info("rateServicePort is [" + rateServicePort + "]");
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}
	
	public void connectToRateService() throws Exception {
		try {
			int resCount = 1;
			socket = new Socket(rateServiceHost, rateServicePort);
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
            String AuthMessage = getAPIKey() + "\r";
            byte[] authMessageByteArray = AuthMessage.getBytes(StandardCharsets.US_ASCII);
            dataOutputStream.write(authMessageByteArray);
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			executorService = new ThreadPoolExecutor(
														publisherThreadCount, 
														publisherThreadCount, 
														0L, 
														TimeUnit.MILLISECONDS,
														new ArrayBlockingQueue<Runnable>(1000), 
														new ThreadPoolExecutor.CallerRunsPolicy()
													);
			
			URI uri = new URI(webSocketServerEndPoint);
			clientEndPoint = new WebsocketClientEndpoint(uri);
	        clientEndPoint.addMessageHandler (new WebsocketClientEndpoint.MessageHandler() {
	            public void handleMessage(String message) { }
	        });
			
			while (true) {
				String rateData = bufferedReader.readLine();
				if (rateData != null && !rateData.trim().equals("")) {
					executorService.submit(new GainCapConfigWSResponder(resCount, rateData));
					resCount++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}

	public void closeConnection() throws Exception {
		try {
			if (socket != null) {socket.close();}
			if (dataOutputStream != null) {dataOutputStream.close();}
			if (bufferedReader != null) {bufferedReader.close();}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}

	public String getAPIKey() throws Exception {
		String apiKey = "";
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(mySQLDBURL, mySQLDBUser, mySQLDBPassword);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT APIKEY FROM APIKEY WHERE KEY_TYPE = 'B'");
		while (resultSet.next()) {
			apiKey = resultSet.getString("APIKEY");
		}
		connection.close();
		return apiKey;
	}
	

	
	public void updateCcyPairDBTable(String alphaCCYToken, String ccyPair) throws Exception {
		logger.info("alphaCCYToken: [" + alphaCCYToken + "], ccyPair: [" + ccyPair + "]");
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(mySQLDBURL, mySQLDBUser, mySQLDBPassword);
		String deleteQuery = "DELETE FROM CCYPAIR_KEY_VAL WHERE ALPHACCYTOKEN = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
		preparedStatement.setString(1, alphaCCYToken);
		preparedStatement.execute();
		
		String insertQuery = "INSERT INTO CCYPAIR_KEY_VAL (ALPHACCYTOKEN, CCYPAIR) VALUES (?, ?)";
		preparedStatement = connection.prepareStatement(insertQuery);
		preparedStatement.setString(1, alphaCCYToken);
		preparedStatement.setString(2, ccyPair);
		preparedStatement.execute();
		preparedStatement.close();
		connection.close();
	}
	
	public String fetchCcyPairDBTable(String alphaCCYToken) throws Exception {
		String ccYPair = "";
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(mySQLDBURL, mySQLDBUser, mySQLDBPassword);
		String selectQuery = "SELECT CCYPAIR FROM CCYPAIR_KEY_VAL WHERE ALPHACCYTOKEN = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
		preparedStatement.setString(1, alphaCCYToken);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			ccYPair = resultSet.getString("CCYPAIR");
		}
		connection.close();
		return ccYPair;
	}
	
	public class GainCapConfigWSResponder implements Runnable{
		String responseMsg = "";
		int key = 0;
		
		public GainCapConfigWSResponder(int key, String responseMsg){
			this.responseMsg = responseMsg;
			this.key = key;
		}
		
		@Override
		public void run() {
			try{
				sendRateData(key, responseMsg);
			} catch (Exception e) {
				e.printStackTrace();
				logger.info("Exception occured in GainCapConfigWSResponder.run()");
				logger.info("Exception messsage is :" + e.getMessage());
			}
		}
		
		public void sendRateData(int key, String rateData){
			String opMsg = "";
			try{
				logger.info("Data from RateServiceAPI: [" + rateData + "]");
				JSONObject dictionaryMsgJSONObj;
				if (rateData.startsWith("S")) {
					while ((rateData.indexOf("\\$") != -1) && (rateData.length() > 0) ) {
						String tempStr = "";
						if (rateData.startsWith("S")){
							tempStr = rateData.substring(rateData.indexOf("S") + 1, rateData.indexOf("\\$"));
						} else {
							tempStr = rateData.substring(0, rateData.indexOf("\\$"));
						}
						dictionaryMsgJSONObj = new JSONObject();
						JSONObject tempJSONObject = new JSONObject();
						String alphaCCYToken = tempStr.substring(0, tempStr.indexOf("\\"));
						tempJSONObject.put("alphaCCYToken", alphaCCYToken);
						tempStr = tempStr.substring(tempStr.indexOf("\\") + 1, tempStr.length());
						String ccyPair = tempStr.substring(0, tempStr.indexOf("\\"));
						tempJSONObject.put("ccyPair", ccyPair);
						tempStr = tempStr.substring(tempStr.indexOf("\\") + 1, tempStr.length());
						tempJSONObject.put("bid", tempStr.substring(0, tempStr.indexOf("\\")));
						tempStr = tempStr.substring(tempStr.indexOf("\\") + 1, tempStr.length());
						tempJSONObject.put("ask", tempStr.substring(0, tempStr.indexOf("\\")));
						tempStr = tempStr.substring(tempStr.indexOf("\\") + 1, tempStr.length());
						tempJSONObject.put("high", tempStr.substring(0, tempStr.indexOf("\\")));
						tempStr = tempStr.substring(tempStr.indexOf("\\") + 1, tempStr.length());
						tempJSONObject.put("low", tempStr.substring(0, tempStr.indexOf("\\")));
						tempStr = tempStr.substring(tempStr.indexOf("\\") + 1, tempStr.length());
						tempJSONObject.put("status", tempStr.substring(0, tempStr.indexOf("\\")));
						tempStr = tempStr.substring(tempStr.indexOf("\\") + 1, tempStr.length());
						tempJSONObject.put("type", tempStr.substring(0, tempStr.indexOf("\\")));
						tempStr = tempStr.substring(tempStr.indexOf("\\") + 1, tempStr.length());
						tempJSONObject.put("decimals", tempStr.substring(0, tempStr.indexOf("\\")));
						tempStr = tempStr.substring(tempStr.indexOf("\\") + 1, tempStr.length());
						tempJSONObject.put("prevDayClosePrice", tempStr.substring(0, tempStr.length()));
						dictionaryMsgJSONObj.put("messageType", "S");
						dictionaryMsgJSONObj.put("rateDictionary", tempJSONObject);
						opMsg = dictionaryMsgJSONObj.toString();
						
						logger.info("Rate Service JSON converted message: [ " + opMsg + "]");
						try {
							getWebsocketClientEndpoint().sendMessage(opMsg);
						} catch (Exception e){
							logger.info("Resetting connection to WebSocket server...");
							resetWebsocketClientEndpoint();
						}
						new GainCapRateServiceTcpClientWebSocket().updateCcyPairDBTable(alphaCCYToken, ccyPair);
						rateData = rateData.substring(rateData.indexOf("$") + 1, rateData.length());
					}
					
				} else if (rateData.startsWith("R")) {
					dictionaryMsgJSONObj = new JSONObject();
					JSONObject tempJSONObject = new JSONObject();
					String alphaCCYToken = rateData.substring(1, rateData.indexOf("\\"));
					boolean wait = true;
					String ccyPair = "";
					int iCount = 0;
					while (wait == true) {
						ccyPair = new GainCapRateServiceTcpClientWebSocket().fetchCcyPairDBTable(alphaCCYToken);
						if (ccyPair.trim().equals("")) {
							logger.info("CCYPair-Token hashmap table doesn't have entry for [" + alphaCCYToken + "]. Sleeping (" + iCount + ")...");
							Thread.sleep(100);
							iCount++;
							if (iCount == 25) {
								wait = false;
							}
						} else {
							wait = false;
						}
					}
					tempJSONObject.put("alphaCCYToken", alphaCCYToken);
					tempJSONObject.put("ccyPair", ccyPair);
					rateData = rateData.substring(rateData.indexOf("\\") + 1, rateData.length());
					tempJSONObject.put("bid", rateData.substring(0, rateData.indexOf("\\")));
					rateData = rateData.substring(rateData.indexOf("\\") + 1, rateData.length());
					tempJSONObject.put("ask", rateData.substring(0, rateData.indexOf("\\")));
					rateData = rateData.substring(rateData.indexOf("\\") + 1, rateData.length());
					tempJSONObject.put("status", rateData.substring(0, rateData.indexOf("\\")));
					rateData = rateData.substring(rateData.indexOf("\\") + 1, rateData.length());				
					rateData = rateData.substring(rateData.indexOf("\\") + 1, rateData.length());
					rateData = rateData.substring(rateData.indexOf("\\") + 1, rateData.length());
					tempJSONObject.put("pubTimestamp", rateData.substring(0, rateData.indexOf("\\")));
					dictionaryMsgJSONObj.put("messageType", "R");
					dictionaryMsgJSONObj.put("rateDelta", tempJSONObject);
					opMsg = dictionaryMsgJSONObj.toString();
					logger.info("Rate Service JSON converted message: [ " + opMsg + "]");
					try {
						getWebsocketClientEndpoint().sendMessage(opMsg);
					} catch (Exception e){
						logger.info("Resetting connection to WebSocket server...");
						resetWebsocketClientEndpoint();
					}
					
				} else {
					opMsg = rateData;
					logger.info("Unhandled message type from GainCapital RateService: [ " + opMsg + "]");
					try {
						getWebsocketClientEndpoint().sendMessage(opMsg);
					} catch (Exception e){
						logger.info("Resetting connection to WebSocket server...");
						resetWebsocketClientEndpoint();
					}
				}

			} catch (Exception e) {
				logger.info("Exception occured in GainCapConfigWSResponder.sendRateData()");
				logger.info("Exception messsage is :" + e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
