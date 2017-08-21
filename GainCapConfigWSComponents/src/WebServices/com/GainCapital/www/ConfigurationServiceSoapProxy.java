package WebServices.com.GainCapital.www;

public class ConfigurationServiceSoapProxy implements WebServices.com.GainCapital.www.ConfigurationServiceSoap {
  private String _endpoint = null;
  private WebServices.com.GainCapital.www.ConfigurationServiceSoap configurationServiceSoap = null;
  
  public ConfigurationServiceSoapProxy() {
    _initConfigurationServiceSoapProxy();
  }
  
  public ConfigurationServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initConfigurationServiceSoapProxy();
  }
  
  private void _initConfigurationServiceSoapProxy() {
    try {
      configurationServiceSoap = (new WebServices.com.GainCapital.www.ConfigurationServiceLocator()).getConfigurationServiceSoap();
      if (configurationServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)configurationServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)configurationServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (configurationServiceSoap != null)
      ((javax.xml.rpc.Stub)configurationServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public WebServices.com.GainCapital.www.ConfigurationServiceSoap getConfigurationServiceSoap() {
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap;
  }
  
  public WebServices.com.GainCapital.www.Settings getAccountTradeSettings(java.lang.String token) throws java.rmi.RemoteException{
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap.getAccountTradeSettings(token);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfProductSetting getProductSetting(java.lang.String token, java.lang.String product) throws java.rmi.RemoteException{
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap.getProductSetting(token, product);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfTimeZones getTimeZones(java.lang.String token, WebServices.com.GainCapital.www.Languages language) throws java.rmi.RemoteException{
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap.getTimeZones(token, language);
  }
  
  public WebServices.com.GainCapital.www.ConfigurationSettings getConfigurationSettings(java.lang.String token) throws java.rmi.RemoteException{
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap.getConfigurationSettings(token);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfUserSettings saveUserSettings(java.lang.String token, WebServices.com.GainCapital.www.BlotterOfUserSettings userSettingsCollection) throws java.rmi.RemoteException{
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap.saveUserSettings(token, userSettingsCollection);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfUserSettings saveUserSetting(java.lang.String token, WebServices.com.GainCapital.www.CollectionOfUserSettings userSettingsCollection) throws java.rmi.RemoteException{
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap.saveUserSetting(token, userSettingsCollection);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfString saveUserProductSubscriptionSettings(java.lang.String token, WebServices.com.GainCapital.www.BlotterOfString userSettingsProductSubscriptionCollection) throws java.rmi.RemoteException{
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap.saveUserProductSubscriptionSettings(token, userSettingsProductSubscriptionCollection);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfString saveUserProductSubscriptionSetting(java.lang.String token, WebServices.com.GainCapital.www.CollectionOfString userSettingsProductSubscriptionCollection) throws java.rmi.RemoteException{
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap.saveUserProductSubscriptionSetting(token, userSettingsProductSubscriptionCollection);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfString saveUserQuickPairSetting(java.lang.String token, WebServices.com.GainCapital.www.CollectionOfString userSettingsQuickPairsCollection) throws java.rmi.RemoteException{
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap.saveUserQuickPairSetting(token, userSettingsQuickPairsCollection);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfString saveUserTradeSettings(java.lang.String token, WebServices.com.GainCapital.www.TradeSettings tradeSetting) throws java.rmi.RemoteException{
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap.saveUserTradeSettings(token, tradeSetting);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfUserTimeZone saveUserTimeZoneSettings(java.lang.String token, long timeZoneID) throws java.rmi.RemoteException{
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap.saveUserTimeZoneSettings(token, timeZoneID);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfProductSetting getAnonymousProductSettings(java.lang.String token, WebServices.com.GainCapital.www.Languages lang) throws java.rmi.RemoteException{
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap.getAnonymousProductSettings(token, lang);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfSubAccount getSubAccounts(java.lang.String token) throws java.rmi.RemoteException{
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap.getSubAccounts(token);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfPlatformSettings getPlatformSettings(java.lang.String token) throws java.rmi.RemoteException{
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap.getPlatformSettings(token);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfString savePlatformSettings(java.lang.String token, WebServices.com.GainCapital.www.PlatformSettings platformSetting) throws java.rmi.RemoteException{
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap.savePlatformSettings(token, platformSetting);
  }
  
  public WebServices.com.GainCapital.www.BlotterOfString updateUserWatchList(java.lang.String token, WebServices.com.GainCapital.www.WatchListSettings[] watchList) throws java.rmi.RemoteException{
    if (configurationServiceSoap == null)
      _initConfigurationServiceSoapProxy();
    return configurationServiceSoap.updateUserWatchList(token, watchList);
  }
  
  
}