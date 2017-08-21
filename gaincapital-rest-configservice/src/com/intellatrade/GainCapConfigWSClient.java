package com.intellatrade;


import org.codehaus.jackson.map.ObjectMapper;

import WebServices.com.GainCapital.www.AccountSettings;
import WebServices.com.GainCapital.www.AuthenticationResult;
import WebServices.com.GainCapital.www.AuthenticationServiceSoapProxy;
import WebServices.com.GainCapital.www.BlotterOfProductSetting;
import WebServices.com.GainCapital.www.ConfigurationServiceSoapProxy;
import WebServices.com.GainCapital.www.ConfigurationSettings;
import WebServices.com.GainCapital.www.Languages;
import WebServices.com.GainCapital.www.ProductSetting;
import WebServices.com.GainCapital.www.Settings;

public class GainCapConfigWSClient {
	
	public AuthenticationResult getAuthenticationResults(String userID, String password) throws Exception {
		AuthenticationResult authenticationResult = null;
		try{
			AuthenticationServiceSoapProxy authenticationServiceSoapProxy = new AuthenticationServiceSoapProxy();
			authenticationServiceSoapProxy.setEndpoint(GainCapConfigServiceReST.authService);
			System.out.println("Auth Service userID is : [" + userID + "]");
			System.out.println("Auth Service password is : [" + password + "]");
			System.out.println("Auth Service endpoint is : [" + GainCapConfigServiceReST.authService + "]");
			authenticationResult = authenticationServiceSoapProxy.authenticateCredentials(userID, password);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return authenticationResult;
	}
	
	public ConfigurationSettings getConfigSettings() throws Exception{
		try {
			ConfigurationServiceSoapProxy configurationServiceSoapProxy	= new ConfigurationServiceSoapProxy();
			configurationServiceSoapProxy.setEndpoint(GainCapConfigServiceReST.configService);
			ConfigurationSettings configurationSettings 
					= configurationServiceSoapProxy.getConfigurationSettings(GainCapConfigServiceReST.apiKey);
			return configurationSettings;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}	
	public String mapConfigurationSettingsResponse(ConfigurationSettings configurationSettings) throws Exception{
		String jsonString = "";
		try{        
	        ObjectMapper mapper = new ObjectMapper();
	        jsonString = mapper.writeValueAsString(configurationSettings);
	        GainCapConfigServiceReST.logger.debug("Response from Gain Capital Service: [" + jsonString + "]");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return jsonString;
	}

	public Settings getAcctTradeSettings() throws Exception{
		try {
			ConfigurationServiceSoapProxy configurationServiceSoapProxy	= new ConfigurationServiceSoapProxy();
			configurationServiceSoapProxy.setEndpoint(GainCapConfigServiceReST.configService);
			Settings accountTradeSettings 
					= configurationServiceSoapProxy.getAccountTradeSettings(GainCapConfigServiceReST.apiKey);
			return accountTradeSettings;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}	
	public String mapAccountTradeSettingsResponse(AccountSettings accountSettings) throws Exception{
		String jsonString = "";
		try{        
	        ObjectMapper mapper = new ObjectMapper();
	        jsonString = mapper.writeValueAsString(accountSettings);
	        GainCapConfigServiceReST.logger.debug("Response from Gain Capital Service: [" + jsonString + "]");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return jsonString;
	}	
	
	public BlotterOfProductSetting getAnonProdSettings() throws Exception{
		try {
			ConfigurationServiceSoapProxy configurationServiceSoapProxy	= new ConfigurationServiceSoapProxy();
			configurationServiceSoapProxy.setEndpoint(GainCapConfigServiceReST.configService);
			BlotterOfProductSetting blotterOfProductSetting 
					= configurationServiceSoapProxy.getAnonymousProductSettings(GainCapConfigServiceReST.apiKey, Languages.English);
			return blotterOfProductSetting;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}
	public String mapAnonymousProductSettingsResponse(ProductSetting[] productSettings) throws Exception{
		String jsonString = "";
		try{        
	        ObjectMapper mapper = new ObjectMapper();
	        jsonString = mapper.writeValueAsString(productSettings);
	        GainCapConfigServiceReST.logger.debug("Response from Gain Capital Service: [" + jsonString + "]");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return jsonString;
	}
}