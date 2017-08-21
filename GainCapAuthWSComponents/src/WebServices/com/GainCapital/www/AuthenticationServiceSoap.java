/**
 * AuthenticationServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public interface AuthenticationServiceSoap extends java.rmi.Remote {

    /**
     * Authenticates the
     * 				Account credentials
     */
    public WebServices.com.GainCapital.www.AuthenticationResult authenticateCredentials(java.lang.String userID, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * Authenticates the
     * 				Account credentials
     */
    public WebServices.com.GainCapital.www.AuthenticationResult authenticateCredentialsWithBrandCode(java.lang.String userID, java.lang.String password, java.lang.String brandCode) throws java.rmi.RemoteException;

    /**
     * Authenticates the
     * 				Linked Account
     */
    public WebServices.com.GainCapital.www.AuthenticationResult authenticateLinkedAccount(java.lang.String token, java.lang.String accountNumber) throws java.rmi.RemoteException;

    /**
     * Get Server Date
     * 				Time
     */
    public java.lang.String getServerTime() throws java.rmi.RemoteException;

    /**
     * Single Sign On
     * 				between Different Systems
     */
    public WebServices.com.GainCapital.www.AuthenticationResponse singleSignOn(WebServices.com.GainCapital.www.AuthenticationRequest authenticationRequest) throws java.rmi.RemoteException;

    /**
     * Authenticate along
     * 				with other details being returned.
     */
    public WebServices.com.GainCapital.www.AuthenticationResult2 authenticateWithDetails(java.lang.String userID, java.lang.String password) throws java.rmi.RemoteException;
}
