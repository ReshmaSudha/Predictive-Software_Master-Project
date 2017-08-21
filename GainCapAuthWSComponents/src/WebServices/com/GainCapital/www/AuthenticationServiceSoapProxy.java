package WebServices.com.GainCapital.www;

public class AuthenticationServiceSoapProxy implements WebServices.com.GainCapital.www.AuthenticationServiceSoap {
  private String _endpoint = null;
  private WebServices.com.GainCapital.www.AuthenticationServiceSoap authenticationServiceSoap = null;
  
  public AuthenticationServiceSoapProxy() {
    _initAuthenticationServiceSoapProxy();
  }
  
  public AuthenticationServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initAuthenticationServiceSoapProxy();
  }
  
  private void _initAuthenticationServiceSoapProxy() {
    try {
      authenticationServiceSoap = (new WebServices.com.GainCapital.www.AuthenticationServiceLocator()).getAuthenticationServiceSoap();
      if (authenticationServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)authenticationServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)authenticationServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (authenticationServiceSoap != null)
      ((javax.xml.rpc.Stub)authenticationServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public WebServices.com.GainCapital.www.AuthenticationServiceSoap getAuthenticationServiceSoap() {
    if (authenticationServiceSoap == null)
      _initAuthenticationServiceSoapProxy();
    return authenticationServiceSoap;
  }
  
  public WebServices.com.GainCapital.www.AuthenticationResult authenticateCredentials(java.lang.String userID, java.lang.String password) throws java.rmi.RemoteException{
    if (authenticationServiceSoap == null)
      _initAuthenticationServiceSoapProxy();
    return authenticationServiceSoap.authenticateCredentials(userID, password);
  }
  
  public WebServices.com.GainCapital.www.AuthenticationResult authenticateCredentialsWithBrandCode(java.lang.String userID, java.lang.String password, java.lang.String brandCode) throws java.rmi.RemoteException{
    if (authenticationServiceSoap == null)
      _initAuthenticationServiceSoapProxy();
    return authenticationServiceSoap.authenticateCredentialsWithBrandCode(userID, password, brandCode);
  }
  
  public WebServices.com.GainCapital.www.AuthenticationResult authenticateLinkedAccount(java.lang.String token, java.lang.String accountNumber) throws java.rmi.RemoteException{
    if (authenticationServiceSoap == null)
      _initAuthenticationServiceSoapProxy();
    return authenticationServiceSoap.authenticateLinkedAccount(token, accountNumber);
  }
  
  public java.lang.String getServerTime() throws java.rmi.RemoteException{
    if (authenticationServiceSoap == null)
      _initAuthenticationServiceSoapProxy();
    return authenticationServiceSoap.getServerTime();
  }
  
  public WebServices.com.GainCapital.www.AuthenticationResponse singleSignOn(WebServices.com.GainCapital.www.AuthenticationRequest authenticationRequest) throws java.rmi.RemoteException{
    if (authenticationServiceSoap == null)
      _initAuthenticationServiceSoapProxy();
    return authenticationServiceSoap.singleSignOn(authenticationRequest);
  }
  
  public WebServices.com.GainCapital.www.AuthenticationResult2 authenticateWithDetails(java.lang.String userID, java.lang.String password) throws java.rmi.RemoteException{
    if (authenticationServiceSoap == null)
      _initAuthenticationServiceSoapProxy();
    return authenticationServiceSoap.authenticateWithDetails(userID, password);
  }
  
  
}