package com.intellatrade;

import org.codehaus.jackson.map.ObjectMapper;

import WebServices.com.GainCapital.www.Activity;
import WebServices.com.GainCapital.www.AuthenticationResult;
import WebServices.com.GainCapital.www.AuthenticationServiceSoapProxy;
import WebServices.com.GainCapital.www.BlotterOfActivity;
import WebServices.com.GainCapital.www.BlotterOfDealInfo;
import WebServices.com.GainCapital.www.BlotterOfMargin;
import WebServices.com.GainCapital.www.BlotterOfDeal;
import WebServices.com.GainCapital.www.Confirmation;
import WebServices.com.GainCapital.www.Deal;
import WebServices.com.GainCapital.www.DealInfo;
import WebServices.com.GainCapital.www.DealResponse;
import WebServices.com.GainCapital.www.Margin;
import WebServices.com.GainCapital.www.OrderResponse;
import WebServices.com.GainCapital.www.TradingServiceSoapProxy;

public class GainCapTradingWSClient {

	public AuthenticationResult getAuthenticationResults(String userID, String password) throws Exception {
		try {
			AuthenticationServiceSoapProxy authenticationServiceSoapProxy = new AuthenticationServiceSoapProxy();
			authenticationServiceSoapProxy.setEndpoint(GainCapTradingServiceReST.authService);
			return authenticationServiceSoapProxy.authenticateCredentials(userID, password);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}

	// -----------------------Close Deal ---------------------//
	public DealResponse closeDeal(String product, String buySell, String amount, String rate, String dealSequence)
			throws Exception {
		try {
			TradingServiceSoapProxy tradingServiceSoapProxy = new TradingServiceSoapProxy();
			DealResponse dealResponse = tradingServiceSoapProxy.closeDeal(GainCapTradingServiceReST.buyApiKey,
						product, buySell, amount, rate, dealSequence);
			return dealResponse;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}

	public String mapcloseDealResponse(DealResponse dealResponse) throws Exception {
		String jsonString = "";
		try {
			ObjectMapper mapper = new ObjectMapper();
			jsonString = mapper.writeValueAsString(dealResponse);
			GainCapTradingServiceReST.logger.debug("Response from Gain Capital Service: [" + jsonString + "]");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return jsonString;
	}

	// -----------------------Deal Request --------------------------//
	public DealResponse getDealRequest(String product, String buySell, String amount, String rate) throws Exception {
		try {
			TradingServiceSoapProxy tradingServiceSoapProxy = new TradingServiceSoapProxy();
			DealResponse dealResponse = tradingServiceSoapProxy.dealRequest(GainCapTradingServiceReST.buyApiKey,
						product, buySell, amount, rate);
			return dealResponse;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}

	public String mapDealRequestResponse(DealResponse dealResponse) throws Exception {
		String jsonString = "";
		try {
			ObjectMapper mapper = new ObjectMapper();
			jsonString = mapper.writeValueAsString(dealResponse);
			GainCapTradingServiceReST.logger.debug("Response from Gain Capital Service: [" + jsonString + "]");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return jsonString;
	}
	
	// ----------Deal Request With Filter -------------//
	public BlotterOfDeal getDealBlotterWithFilter(String product) throws Exception {
		try {
			TradingServiceSoapProxy tradingServiceSoapProxy = new TradingServiceSoapProxy();
			BlotterOfDeal blotterOfDeal = tradingServiceSoapProxy
											.getDealBlotterWithFilter(GainCapTradingServiceReST.buyApiKey, product);
			return blotterOfDeal;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}

	public String mapDealBlotterWithFilterResponse(BlotterOfDeal blotterOfDeal) throws Exception {
		String jsonString = "";
		try {
			ObjectMapper mapper = new ObjectMapper();
			jsonString = mapper.writeValueAsString(blotterOfDeal);
			GainCapTradingServiceReST.logger.debug("Response from Gain Capital Service: [" + jsonString + "]");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return jsonString;
	}

	// --------Get Deal Blotter ----------//
	public BlotterOfDeal getDealBlotter() throws Exception {
		try {
			TradingServiceSoapProxy tradingServiceSoapProxy = new TradingServiceSoapProxy();
			BlotterOfDeal blotterOfDeal = tradingServiceSoapProxy.getDealBlotter(GainCapTradingServiceReST.buyApiKey);
			return blotterOfDeal;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}

	public String mapDealBlotterResponse(Deal[] deal) throws Exception {
		String jsonString = "";
		try {
			ObjectMapper mapper = new ObjectMapper();
			jsonString = mapper.writeValueAsString(deal);
			GainCapTradingServiceReST.logger.debug("Response from Gain Capital Service: [" + jsonString + "]");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return jsonString;
	}

	// ------------Get Open Deal Blotter ------------//
	public BlotterOfDeal getOpenDealBlotter() throws Exception {
		try {
			TradingServiceSoapProxy tradingServiceSoapProxy = new TradingServiceSoapProxy();
			BlotterOfDeal blotterOfDeal = tradingServiceSoapProxy.getOpenDealBlotter(GainCapTradingServiceReST.buyApiKey);
			return blotterOfDeal;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}

	public String mapOpenDealBlotterResponse(Deal[] deal) throws Exception {
		String jsonString = "";
		try {
			ObjectMapper mapper = new ObjectMapper();
			jsonString = mapper.writeValueAsString(deal);
			GainCapTradingServiceReST.logger.debug("Response from Gain Capital Service: [" + jsonString + "]");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return jsonString;
	}
	
	// ----------Get Deal Info Blotter -----------------//
	public BlotterOfDealInfo getDealInfoBlotter(String product, String confirmationNumber, String dealReference)
			throws Exception {
		try {
			TradingServiceSoapProxy tradingServiceSoapProxy = new TradingServiceSoapProxy();
			BlotterOfDealInfo blotterOfDealInfo = tradingServiceSoapProxy.getDealInfoBlotter(
					GainCapTradingServiceReST.buyApiKey, product, confirmationNumber, dealReference);
			return blotterOfDealInfo;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}

	public String mapDealInfoBlotterResponse(DealInfo[] dealInfo) throws Exception {
		String jsonString = "";
		try {
			ObjectMapper mapper = new ObjectMapper();
			jsonString = mapper.writeValueAsString(dealInfo);
			GainCapTradingServiceReST.logger.debug("Response from Gain Capital Service: [" + jsonString + "]");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return jsonString;
	}

	// ---------- Deal Request At Best ------------//
	public DealResponse getDealRequestAtBest(String product, String buySell, String amount) throws Exception {
		try {
			TradingServiceSoapProxy tradingServiceSoapProxy = new TradingServiceSoapProxy();
			DealResponse dealResponse = tradingServiceSoapProxy.dealRequestAtBest(GainCapTradingServiceReST.buyApiKey,product, buySell, amount);
			return dealResponse;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}

	public String mapDealRequestAtBestResponse(DealResponse dealResponse) throws Exception {
		String jsonString = "";
		try {
			ObjectMapper mapper = new ObjectMapper();
			jsonString = mapper.writeValueAsString(dealResponse);
			GainCapTradingServiceReST.logger.debug("Response from Gain Capital Service: [" + jsonString + "]");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return jsonString;
	}

}