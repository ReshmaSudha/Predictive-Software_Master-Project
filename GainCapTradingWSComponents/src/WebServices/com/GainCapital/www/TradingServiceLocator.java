/**
 * TradingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class TradingServiceLocator extends org.apache.axis.client.Service implements WebServices.com.GainCapital.www.TradingService {

/**
 * Provides interface
 * 			to Forex trading System
 */

    public TradingServiceLocator() {
    }


    public TradingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TradingServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TradingServiceSoap
    private java.lang.String TradingServiceSoap_address = "http://demoweb.efxnow.com/gaincapitalwebservices/trading/tradingservice.asmx";

    public java.lang.String getTradingServiceSoapAddress() {
        return TradingServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TradingServiceSoapWSDDServiceName = "TradingServiceSoap";

    public java.lang.String getTradingServiceSoapWSDDServiceName() {
        return TradingServiceSoapWSDDServiceName;
    }

    public void setTradingServiceSoapWSDDServiceName(java.lang.String name) {
        TradingServiceSoapWSDDServiceName = name;
    }

    public WebServices.com.GainCapital.www.TradingServiceSoap getTradingServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TradingServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTradingServiceSoap(endpoint);
    }

    public WebServices.com.GainCapital.www.TradingServiceSoap getTradingServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            WebServices.com.GainCapital.www.TradingServiceSoapStub _stub = new WebServices.com.GainCapital.www.TradingServiceSoapStub(portAddress, this);
            _stub.setPortName(getTradingServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTradingServiceSoapEndpointAddress(java.lang.String address) {
        TradingServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (WebServices.com.GainCapital.www.TradingServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                WebServices.com.GainCapital.www.TradingServiceSoapStub _stub = new WebServices.com.GainCapital.www.TradingServiceSoapStub(new java.net.URL(TradingServiceSoap_address), this);
                _stub.setPortName(getTradingServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TradingServiceSoap".equals(inputPortName)) {
            return getTradingServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TradingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TradingServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TradingServiceSoap".equals(portName)) {
            setTradingServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
