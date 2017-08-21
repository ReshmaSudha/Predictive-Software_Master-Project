import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

public class GainCapDealblotterDBBackup {
	
	static String dealblotterRestEndpoint = "";
	static String mySQLDBUser = "";
	static String mySQLDBPassword = "";
	static String mySQLDBURL = "";
	static String log4jPropFile = "";
	static Logger logger;
	
	public static void main(String[] args) throws Exception {
		GainCapDealblotterDBBackup gainCapDealblotterDBBackup = new GainCapDealblotterDBBackup();
		gainCapDealblotterDBBackup.setProperties();
		System.setProperty("class_name", "GainCapDealblotterDBBackup");
		logger = Logger.getLogger(GainCapDealblotterDBBackup.class.getName());
		Properties log4jProperties = new Properties();
		log4jProperties.load(new FileInputStream(log4jPropFile));
	    org.apache.log4j.PropertyConfigurator.configure(log4jProperties);
	    logger.info("Completed setting runtime properties...");
	    GainCapDealblotterDBBackup.logger.info("Starting the batch run...");
	    gainCapDealblotterDBBackup.setRateServiceConnParams();
	    GainCapDealblotterDBBackup.logger.info("Completed the batch run!");
	}

	public void setProperties() throws Exception{
		InputStream input = null;
		try {
			Properties properties = new Properties();
			input = new FileInputStream("GainCapDealblotterDBBackup.properties");
			properties.load(input);
			
			mySQLDBUser = properties.getProperty("MySQLDBUser");
			mySQLDBPassword = properties.getProperty("MySQLDBPassword");
			mySQLDBURL = properties.getProperty("MySQLDBURL");
			dealblotterRestEndpoint = properties.getProperty("DealblotterRestEndpoint");
			log4jPropFile = properties.getProperty("Log4jPropFile");
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
			String urlString = dealblotterRestEndpoint;
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
			logger.info("Dealblotter ReST response is [" + stringBuilder.toString() + "]");	
			JSONArray responseJSON = new JSONArray(stringBuilder.toString());
			int arrayLength = responseJSON.length();
			for(int i=0; i<arrayLength; i++){
				JSONObject dealObj = responseJSON.getJSONObject(i);
				insertDealRequestToDB(dealObj);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}
	
	public void insertDealRequestToDB(JSONObject dealResJSON) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(mySQLDBURL, mySQLDBUser, mySQLDBPassword);
			GainCapDealblotterDBBackup.logger.info("Processing the deal object [" + dealResJSON.toString() + "]");
			String dealReference = dealResJSON.get("dealReference").toString();
			String confNumber = dealResJSON.get("confirmationNumber").toString();
			String dealSequence = dealResJSON.get("dealSequence").toString();
			
			GainCapDealblotterDBBackup.logger.info("Deleting the dealblotter data from MySQL database for "
													+ "[DealReference - " + dealReference + "], "
													+ "[ConfirmationNumber -" + confNumber + "], "
													+ "[DealSequence -" + dealSequence + "]...");
			String deleteStmt = "DELETE FROM dealBlotter_Response WHERE DealReference = ? AND ConfirmationNumber = ? AND DealSequence = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(deleteStmt);
			preparedStatement.setString (1, dealReference);
			preparedStatement.setString (2, confNumber);
			preparedStatement.setString (3, dealSequence);
			preparedStatement.execute();
			GainCapDealblotterDBBackup.logger.info("Deleted the data!");
			
			GainCapDealblotterDBBackup.logger.info("Inserting the dealblotter response into the MySQL database...");
			String insertStmt = 
					   "INSERT INTO dealBlotter_Response"
					   + "(" 
						   + "DealReference,"
						   + "Product,"
						   + "BuySell,"
						   + "Contract,"
						   + "Rate,"
						   + "Counter,"
						   + "DealDate,"
						   + "ConfirmationNumber,"
						   + "Status,"
						   + "DealSequence,"
						   + "sysdate"
						+ ") VALUES (?,?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(insertStmt);
			preparedStatement.setString (1, dealReference);
			preparedStatement.setString (2, dealResJSON.get("product").toString());
			preparedStatement.setString (3, dealResJSON.get("buySell").toString());
			preparedStatement.setString (4, dealResJSON.get("contract").toString());
			preparedStatement.setString (5, dealResJSON.get("rate").toString());
			preparedStatement.setString (6, dealResJSON.get("counter").toString());
			preparedStatement.setString (7, dealResJSON.get("dealDate").toString());
			preparedStatement.setString (8, confNumber);
			preparedStatement.setString (9, dealResJSON.get("status").toString());
			preparedStatement.setString (10, dealSequence);
		
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			Date recomm_datetime = simpleDateFormat.parse(dealResJSON.get("dealDate").toString());	
			java.sql.Date sql_recomm_datetime = new java.sql.Date(recomm_datetime.getTime()); 
			preparedStatement.setDate(11, sql_recomm_datetime);
			
			preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
			GainCapDealblotterDBBackup.logger.info("Dealrequest response inserted!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}
}
