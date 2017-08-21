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
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
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

public class GainCapRateServiceTcpClientKafka {
	static String apiKey = "";
	static Properties kafkaConnProps = null;
	
	static String userID = "";
	static String password = "";
	String rsDataTopicName = "";
	static String mySQLDBUser = "";
	static String mySQLDBPassword = "";
	static String mySQLDBURL = "";
	static String rateServiceHost = "";
	static String log4jPropFile = "";
	static int rateServicePort = 0;
	static String configSettingRestEndpoint = "";
	static Logger logger;
	static int kafkaPublisherThreadCount = 0;
	
	static DataOutputStream dataOutputStream = null;
	static BufferedReader bufferedReader = null;
	static Socket socket = null;
	
	private static ExecutorService executorService = null;
	private static HashMap <String, KafkaProducer<String, String>> kafkaProducerHashMap = null;
	private static HashMap <String, String> ccyPairHashMap = null;
	
	public static void main(String[] args) throws Exception {
		GainCapRateServiceTcpClientKafka gainCapRateServiceClient = new GainCapRateServiceTcpClientKafka();
		gainCapRateServiceClient.setProperties();
		System.setProperty("class_name", "GainCapRateServiceTcpClientKafka");
		logger = Logger.getLogger(GainCapRateServiceTcpClientKafka.class.getName());
		Properties log4jProperties = new Properties();
		log4jProperties.load(new FileInputStream(log4jPropFile));
	    org.apache.log4j.PropertyConfigurator.configure(log4jProperties);
	    logger.info("Completed setting runtime properties...");
		gainCapRateServiceClient.setRateServiceConnParams();
		gainCapRateServiceClient.createKafkaProducers();
		gainCapRateServiceClient.connectToRateService();
	}
	
	public void createKafkaProducers() {
		kafkaProducerHashMap = new HashMap<String, KafkaProducer<String, String>>();
		for(int i=0; i<kafkaPublisherThreadCount; i++) {
			kafkaProducerHashMap.put(Integer.toString(i), new KafkaProducer<String, String>(kafkaConnProps));
		}
		logger.info("Populated kafkaProducerHashMap. kafkaProducerHashMap size is [" + kafkaProducerHashMap.size() + "]");
	}
	
	public void setProperties() throws Exception{
		InputStream input = null;
		try {
			Properties properties = new Properties();
			input = new FileInputStream("GainCapRateServiceTcpClientKafka.properties");
			properties.load(input);
			
			userID = properties.getProperty("UserID");
			password = properties.getProperty("Password");
			mySQLDBUser = properties.getProperty("MySQLDBUser");
			mySQLDBPassword = properties.getProperty("MySQLDBPassword");
			mySQLDBURL = properties.getProperty("MySQLDBURL");
			rsDataTopicName = properties.getProperty("WSDataTopicName");
			configSettingRestEndpoint = properties.getProperty("ConfigSettingRestEndpoint");
			log4jPropFile = properties.getProperty("Log4jPropFile");
			kafkaPublisherThreadCount = Integer.parseInt(properties.getProperty("KafkaPublisherThreadCount"));
			kafkaConnProps = new Properties();
			kafkaConnProps.put("bootstrap.servers", 
								properties.getProperty("KafkaBootstrapServer") 
								+ ":" 
								+ properties.getProperty("KafkaBootstrapPort"));
			kafkaConnProps.put("group.id", properties.getProperty("KafkaGroupId"));
			kafkaConnProps.put("enable.auto.commit", properties.getProperty("KafkaEnableAutoCommit"));
			kafkaConnProps.put("auto.commit.interval.ms", properties.getProperty("KafkaAutoCommitIntervalMS"));
			kafkaConnProps.put("session.timeout.ms", properties.getProperty("KafkaSessionTimeoutMS"));
			kafkaConnProps.put("key.serializer", properties.getProperty("KafkaKeySerializer"));
			kafkaConnProps.put("key.deserializer", properties.getProperty("KafkaKeyDeserializer"));
			kafkaConnProps.put("value.deserializer", properties.getProperty("KafkaValueDeserializer"));
			kafkaConnProps.put("value.serializer", properties.getProperty("KafkaValueSerializer"));
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
			ccyPairHashMap = new HashMap<String, String>();
			socket = new Socket(rateServiceHost, rateServicePort);
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
            String AuthMessage = getAPIKey() + "\r";
            byte[] authMessageByteArray = AuthMessage.getBytes(StandardCharsets.US_ASCII);
            dataOutputStream.write(authMessageByteArray);
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			executorService = new ThreadPoolExecutor(
														kafkaPublisherThreadCount, 
														kafkaPublisherThreadCount, 
														0L, 
														TimeUnit.MILLISECONDS,
														new ArrayBlockingQueue<Runnable>(1000), 
														new ThreadPoolExecutor.CallerRunsPolicy()
													);
			while (true) {
				String rateData = bufferedReader.readLine();
				if (rateData != null && !rateData.trim().equals("")) {
					logger.info("Data from RateServiceAPI: [" + rateData + "]");
					String opMsg = "";
					JSONObject dictionaryMsgJSONObj;
					if (rateData.startsWith("S")) {
						JSONArray dictionaryMsgJSONArray = new JSONArray();
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
							ccyPairHashMap.put(alphaCCYToken, ccyPair);
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
							int iTemp = resCount % kafkaPublisherThreadCount;
							executorService.submit(new GainCapConfigWSResponder(resCount, opMsg, kafkaProducerHashMap.get((Integer.toString(iTemp)))));
							resCount++;
							
							rateData = rateData.substring(rateData.indexOf("$") + 1, rateData.length());
						}
						
					} else if (rateData.startsWith("R")) {
						dictionaryMsgJSONObj = new JSONObject();
						JSONObject tempJSONObject = new JSONObject();
						String alphaCCYToken = rateData.substring(1, rateData.indexOf("\\"));
						tempJSONObject.put("alphaCCYToken", alphaCCYToken);
						tempJSONObject.put("ccyPair", ccyPairHashMap.get(alphaCCYToken));
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
						int iTemp = resCount % kafkaPublisherThreadCount;
						executorService.submit(new GainCapConfigWSResponder(resCount, opMsg, kafkaProducerHashMap.get((Integer.toString(iTemp)))));
						resCount++;
					} else {
						opMsg = rateData;
					}
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
	
	public class GainCapConfigWSResponder implements Runnable{
		String responseMsg = "";
		int key = 0;
		Producer<String, String> producer = null;
		
		public GainCapConfigWSResponder(int key, String responseMsg, Producer<String, String> producer){
			this.responseMsg = responseMsg;
			this.key = key;
			this.producer = producer;
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
		
		public void sendRateData(int key, String responseMsg){
			Producer<String, String> producer = new KafkaProducer<String, String>(kafkaConnProps);
			producer.send(new ProducerRecord<String, String>(rsDataTopicName, Integer.toString(key), responseMsg));
	        logger.info("Rate data successfully published to Kafka Topic!");
		}		
	}
}
