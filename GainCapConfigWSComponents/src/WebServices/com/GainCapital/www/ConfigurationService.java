/**
 * ConfigurationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public interface ConfigurationService extends javax.xml.rpc.Service {

/**
 * Provides configuration parameters for various features to be made
 * available
 * 			to the application
 */
    public java.lang.String getConfigurationServiceSoapAddress();

    public WebServices.com.GainCapital.www.ConfigurationServiceSoap getConfigurationServiceSoap() throws javax.xml.rpc.ServiceException;

    public WebServices.com.GainCapital.www.ConfigurationServiceSoap getConfigurationServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
