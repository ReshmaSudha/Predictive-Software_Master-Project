/**
 * AuthenticationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public interface AuthenticationService extends javax.xml.rpc.Service {

/**
 * Authenticates the
 * 			User Credentials and returns an object containg the security
 * 			token and
 * 			Service url
 */
    public java.lang.String getAuthenticationServiceSoapAddress();

    public WebServices.com.GainCapital.www.AuthenticationServiceSoap getAuthenticationServiceSoap() throws javax.xml.rpc.ServiceException;

    public WebServices.com.GainCapital.www.AuthenticationServiceSoap getAuthenticationServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
