package WebServices.com.GainCapital.www;

public class TradingServiceSoapProxy implements WebServices.com.GainCapital.www.TradingServiceSoap {
  private String _endpoint = null;
  private WebServices.com.GainCapital.www.TradingServiceSoap tradingServiceSoap = null;
  
  public TradingServiceSoapProxy() {
    _initTradingServiceSoapProxy();
  }
  
  public TradingServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initTradingServiceSoapProxy();
  }
  
  private void _initTradingServiceSoapProxy() {
    try {
      tradingServiceSoap = (new WebServices.com.GainCapital.www.TradingServiceLocator()).getTradingServiceSoap();
      if (tradingServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tradingServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)tradingServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (tradingServiceSoap != null)
      ((javax.xml.rpc.Stub)tradingServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public WebServices.com.GainCapital.www.TradingServiceSoap getTradingServiceSoap() {
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap;
  }
  
  public WebServices.com.GainCapital.www.DealResponse instantExecution(java.lang.String token, java.lang.String product, java.lang.String buySell, java.lang.String amount, java.lang.String rate, int tolerance) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.instantExecution(token, product, buySell, amount, rate, tolerance);
  }
  
  public WebServices.com.GainCapital.www.DealResponse dealRequest(java.lang.String token, java.lang.String product, java.lang.String buySell, java.lang.String amount, java.lang.String rate) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.dealRequest(token, product, buySell, amount, rate);
  }
  
  public WebServices.com.GainCapital.www.DealResponse dealRequestAtBest(java.lang.String token, java.lang.String product, java.lang.String buySell, java.lang.String amount) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.dealRequestAtBest(token, product, buySell, amount);
  }
  
  public WebServices.com.GainCapital.www.DealResponse closeDeal(java.lang.String token, java.lang.String product, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String dealSequence) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.closeDeal(token, product, buySell, amount, rate, dealSequence);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfDealResponse liquidateAll(java.lang.String token) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.liquidateAll(token);
  }
  
  public WebServices.com.GainCapital.www.Confirmation cancelOrder(java.lang.String token, java.lang.String orderReferenceNumber) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.cancelOrder(token, orderReferenceNumber);
  }
  
  public WebServices.com.GainCapital.www.OrderResponse placeSingleOrder(java.lang.String token, java.lang.String product, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String basis) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.placeSingleOrder(token, product, expiry, buySell, amount, rate, basis);
  }
  
  public WebServices.com.GainCapital.www.OrderResponse placeOCOOrder(java.lang.String token, java.lang.String product, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String basis, java.lang.String buySell1, java.lang.String amount1, java.lang.String rate1, java.lang.String basis1) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.placeOCOOrder(token, product, expiry, buySell, amount, rate, basis, buySell1, amount1, rate1, basis1);
  }
  
  public WebServices.com.GainCapital.www.OrderResponse placeIfThenOrder(java.lang.String token, java.lang.String product, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String basis, java.lang.String buySell1, java.lang.String amount1, java.lang.String rate1, java.lang.String basis1) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.placeIfThenOrder(token, product, expiry, buySell, amount, rate, basis, buySell1, amount1, rate1, basis1);
  }
  
  public WebServices.com.GainCapital.www.OrderResponse placeIfThenOCOOrder(java.lang.String token, java.lang.String product, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String basis, java.lang.String buySell1, java.lang.String amount1, java.lang.String rate1, java.lang.String basis1, java.lang.String buySell2, java.lang.String amount2, java.lang.String rate2, java.lang.String basis2) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.placeIfThenOCOOrder(token, product, expiry, buySell, amount, rate, basis, buySell1, amount1, rate1, basis1, buySell2, amount2, rate2, basis2);
  }
  
  public WebServices.com.GainCapital.www.OrderResponse placeTrailingStopOrder(java.lang.String token, java.lang.String product, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String trailingPoints) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.placeTrailingStopOrder(token, product, expiry, buySell, amount, rate, trailingPoints);
  }
  
  public WebServices.com.GainCapital.www.OrderResponse placeSingleASSPOrder(java.lang.String token, java.lang.String product, java.lang.String rate, java.lang.String basis) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.placeSingleASSPOrder(token, product, rate, basis);
  }
  
  public WebServices.com.GainCapital.www.OrderResponse placeOCOASSPOrder(java.lang.String token, java.lang.String product, java.lang.String limitRate, java.lang.String stopRate) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.placeOCOASSPOrder(token, product, limitRate, stopRate);
  }
  
  public WebServices.com.GainCapital.www.OrderResponse placeTrailingStopASSPOrder(java.lang.String token, java.lang.String product, java.lang.String rate, java.lang.String trailingPoints) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.placeTrailingStopASSPOrder(token, product, rate, trailingPoints);
  }
  
  public WebServices.com.GainCapital.www.OrderResponse modifyTrailingStopASSPOrder(java.lang.String token, java.lang.String orderReference, java.lang.String rate, java.lang.String trailingPoints) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.modifyTrailingStopASSPOrder(token, orderReference, rate, trailingPoints);
  }
  
  public WebServices.com.GainCapital.www.OrderResponse modifySingleOrder(java.lang.String token, java.lang.String orderReference, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String basis) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.modifySingleOrder(token, orderReference, expiry, buySell, amount, rate, basis);
  }
  
  public WebServices.com.GainCapital.www.OrderResponse modifyOCOOrder(java.lang.String token, java.lang.String orderReference, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String basis, java.lang.String buySell1, java.lang.String amount1, java.lang.String rate1, java.lang.String basis1) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.modifyOCOOrder(token, orderReference, expiry, buySell, amount, rate, basis, buySell1, amount1, rate1, basis1);
  }
  
  public WebServices.com.GainCapital.www.OrderResponse modifyIfThenOrder(java.lang.String token, java.lang.String orderReference, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String basis, java.lang.String buySell1, java.lang.String amount1, java.lang.String rate1, java.lang.String basis1) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.modifyIfThenOrder(token, orderReference, expiry, buySell, amount, rate, basis, buySell1, amount1, rate1, basis1);
  }
  
  public WebServices.com.GainCapital.www.OrderResponse modifyIfThenOCOOrder(java.lang.String token, java.lang.String orderReference, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String basis, java.lang.String buySell1, java.lang.String amount1, java.lang.String rate1, java.lang.String basis1, java.lang.String buySell2, java.lang.String amount2, java.lang.String rate2, java.lang.String basis2) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.modifyIfThenOCOOrder(token, orderReference, expiry, buySell, amount, rate, basis, buySell1, amount1, rate1, basis1, buySell2, amount2, rate2, basis2);
  }
  
  public WebServices.com.GainCapital.www.OrderResponse modifySingleASSPOrder(java.lang.String token, java.lang.String orderReference, java.lang.String rate, java.lang.String basis) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.modifySingleASSPOrder(token, orderReference, rate, basis);
  }
  
  public WebServices.com.GainCapital.www.OrderResponse modifyOCOASSPOrder(java.lang.String token, java.lang.String orderReference, java.lang.String limitRate, java.lang.String stopLossRate) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.modifyOCOASSPOrder(token, orderReference, limitRate, stopLossRate);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfPosition getPositionBlotter(java.lang.String token) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getPositionBlotter(token);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfPosition getPositionBlotterWithFilter(java.lang.String token, java.lang.String product) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getPositionBlotterWithFilter(token, product);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfOrder getOrderBlotter(java.lang.String token) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getOrderBlotter(token);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfOrder getOrderBlotterInCustomerTimeZone(java.lang.String token, boolean convertToCustomerTimeZone) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getOrderBlotterInCustomerTimeZone(token, convertToCustomerTimeZone);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfOrder getOrderBlotterWithFilter(java.lang.String token, java.lang.String product) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getOrderBlotterWithFilter(token, product);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfOrder getOrderBlotterWithFilterInCustomerTimeZone(java.lang.String token, java.lang.String product, boolean convertToCustomerTimeZone) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getOrderBlotterWithFilterInCustomerTimeZone(token, product, convertToCustomerTimeZone);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfOrder getOrderDetails(java.lang.String token, java.lang.String product, java.lang.String orderReferenceNumber) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getOrderDetails(token, product, orderReferenceNumber);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfOrder getOrderDetailsInCustomerTimeZone(java.lang.String token, java.lang.String product, java.lang.String orderReferenceNumber, boolean convertToCustomerTimeZone) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getOrderDetailsInCustomerTimeZone(token, product, orderReferenceNumber, convertToCustomerTimeZone);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfDeal getDealBlotter(java.lang.String token) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getDealBlotter(token);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfDeal getDealBlotterInCustomerTimeZone(java.lang.String token, boolean convertToCustomerTimeZone) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getDealBlotterInCustomerTimeZone(token, convertToCustomerTimeZone);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfDeal getDealBlotterWithFilter(java.lang.String token, java.lang.String product) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getDealBlotterWithFilter(token, product);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfDeal getDealBlotterWithFilterInCustomerTimeZone(java.lang.String token, java.lang.String product, boolean convertToCustomerTimeZone) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getDealBlotterWithFilterInCustomerTimeZone(token, product, convertToCustomerTimeZone);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfDeal getOpenDealBlotter(java.lang.String token) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getOpenDealBlotter(token);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfDeal getOpenDealBlotterInCustomerTimeZone(java.lang.String token, boolean convertToCustomerTimeZone) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getOpenDealBlotterInCustomerTimeZone(token, convertToCustomerTimeZone);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfDeal getOpenDealBlotterWithFilter(java.lang.String token, java.lang.String product) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getOpenDealBlotterWithFilter(token, product);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfDeal getOpenDealBlotterWithFilterInCustomerTimeZone(java.lang.String token, java.lang.String product, boolean convertToCustomerTimeZone) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getOpenDealBlotterWithFilterInCustomerTimeZone(token, product, convertToCustomerTimeZone);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfMargin getMarginBlotter(java.lang.String token) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getMarginBlotter(token);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfActivity getActivityBlotter(java.lang.String token) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getActivityBlotter(token);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfActivity getActivityBlotterInCustomerTimeZone(java.lang.String token, boolean convertToCustomerTimeZone) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getActivityBlotterInCustomerTimeZone(token, convertToCustomerTimeZone);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfDealInfo getDealInfoBlotter(java.lang.String token, java.lang.String product, java.lang.String confirmationNumber, java.lang.String dealReference) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.getDealInfoBlotter(token, product, confirmationNumber, dealReference);
  }
  
  public WebServices.com.GainCapital.www.DealResponse closePosition(java.lang.String token, java.lang.String product) throws java.rmi.RemoteException{
    if (tradingServiceSoap == null)
      _initTradingServiceSoapProxy();
    return tradingServiceSoap.closePosition(token, product);
  }
  
  
}