/**
 * TradingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public interface TradingService extends javax.xml.rpc.Service {

/**
 * Provides interface
 * 			to Forex trading System
 */
    public java.lang.String getTradingServiceSoapAddress();

    public WebServices.com.GainCapital.www.TradingServiceSoap getTradingServiceSoap() throws javax.xml.rpc.ServiceException;

    public WebServices.com.GainCapital.www.TradingServiceSoap getTradingServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
