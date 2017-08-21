/**
 * AuthenticationResult2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class AuthenticationResult2  extends WebServices.com.GainCapital.www.AuthenticationResult  implements java.io.Serializable {
    private WebServices.com.GainCapital.www.Settings settings;

    private WebServices.com.GainCapital.www.ConfigurationSettings configurationSettings;

    private WebServices.com.GainCapital.www.BlotterOfMargin marginBlotter;

    private WebServices.com.GainCapital.www.BlotterOfPosition positionBlotter;

    private WebServices.com.GainCapital.www.BlotterOfOrder orderBlotter;

    private WebServices.com.GainCapital.www.BlotterOfTimeZones timeZoneBlotter;

    private WebServices.com.GainCapital.www.BlotterOfActivity activityBlotter;

    public AuthenticationResult2() {
    }

    public AuthenticationResult2(
           boolean success,
           java.lang.String errorNo,
           java.lang.String token,
           java.lang.String customerName,
           java.lang.String configurationService,
           java.lang.String tradingService,
           java.lang.String chartingService,
           java.lang.String researchService,
           java.lang.String profileService,
           java.lang.String reportService,
           boolean isMETA,
           java.lang.String metaServerName,
           java.lang.String metaAccountNumber,
           java.lang.String METAService,
           java.lang.String alertService,
           java.lang.String uniqueClientIdentifier,
           WebServices.com.GainCapital.www.Settings settings,
           WebServices.com.GainCapital.www.ConfigurationSettings configurationSettings,
           WebServices.com.GainCapital.www.BlotterOfMargin marginBlotter,
           WebServices.com.GainCapital.www.BlotterOfPosition positionBlotter,
           WebServices.com.GainCapital.www.BlotterOfOrder orderBlotter,
           WebServices.com.GainCapital.www.BlotterOfTimeZones timeZoneBlotter,
           WebServices.com.GainCapital.www.BlotterOfActivity activityBlotter) {
        super(
            success,
            errorNo,
            token,
            customerName,
            configurationService,
            tradingService,
            chartingService,
            researchService,
            profileService,
            reportService,
            isMETA,
            metaServerName,
            metaAccountNumber,
            METAService,
            alertService,
            uniqueClientIdentifier);
        this.settings = settings;
        this.configurationSettings = configurationSettings;
        this.marginBlotter = marginBlotter;
        this.positionBlotter = positionBlotter;
        this.orderBlotter = orderBlotter;
        this.timeZoneBlotter = timeZoneBlotter;
        this.activityBlotter = activityBlotter;
    }


    /**
     * Gets the settings value for this AuthenticationResult2.
     * 
     * @return settings
     */
    public WebServices.com.GainCapital.www.Settings getSettings() {
        return settings;
    }


    /**
     * Sets the settings value for this AuthenticationResult2.
     * 
     * @param settings
     */
    public void setSettings(WebServices.com.GainCapital.www.Settings settings) {
        this.settings = settings;
    }


    /**
     * Gets the configurationSettings value for this AuthenticationResult2.
     * 
     * @return configurationSettings
     */
    public WebServices.com.GainCapital.www.ConfigurationSettings getConfigurationSettings() {
        return configurationSettings;
    }


    /**
     * Sets the configurationSettings value for this AuthenticationResult2.
     * 
     * @param configurationSettings
     */
    public void setConfigurationSettings(WebServices.com.GainCapital.www.ConfigurationSettings configurationSettings) {
        this.configurationSettings = configurationSettings;
    }


    /**
     * Gets the marginBlotter value for this AuthenticationResult2.
     * 
     * @return marginBlotter
     */
    public WebServices.com.GainCapital.www.BlotterOfMargin getMarginBlotter() {
        return marginBlotter;
    }


    /**
     * Sets the marginBlotter value for this AuthenticationResult2.
     * 
     * @param marginBlotter
     */
    public void setMarginBlotter(WebServices.com.GainCapital.www.BlotterOfMargin marginBlotter) {
        this.marginBlotter = marginBlotter;
    }


    /**
     * Gets the positionBlotter value for this AuthenticationResult2.
     * 
     * @return positionBlotter
     */
    public WebServices.com.GainCapital.www.BlotterOfPosition getPositionBlotter() {
        return positionBlotter;
    }


    /**
     * Sets the positionBlotter value for this AuthenticationResult2.
     * 
     * @param positionBlotter
     */
    public void setPositionBlotter(WebServices.com.GainCapital.www.BlotterOfPosition positionBlotter) {
        this.positionBlotter = positionBlotter;
    }


    /**
     * Gets the orderBlotter value for this AuthenticationResult2.
     * 
     * @return orderBlotter
     */
    public WebServices.com.GainCapital.www.BlotterOfOrder getOrderBlotter() {
        return orderBlotter;
    }


    /**
     * Sets the orderBlotter value for this AuthenticationResult2.
     * 
     * @param orderBlotter
     */
    public void setOrderBlotter(WebServices.com.GainCapital.www.BlotterOfOrder orderBlotter) {
        this.orderBlotter = orderBlotter;
    }


    /**
     * Gets the timeZoneBlotter value for this AuthenticationResult2.
     * 
     * @return timeZoneBlotter
     */
    public WebServices.com.GainCapital.www.BlotterOfTimeZones getTimeZoneBlotter() {
        return timeZoneBlotter;
    }


    /**
     * Sets the timeZoneBlotter value for this AuthenticationResult2.
     * 
     * @param timeZoneBlotter
     */
    public void setTimeZoneBlotter(WebServices.com.GainCapital.www.BlotterOfTimeZones timeZoneBlotter) {
        this.timeZoneBlotter = timeZoneBlotter;
    }


    /**
     * Gets the activityBlotter value for this AuthenticationResult2.
     * 
     * @return activityBlotter
     */
    public WebServices.com.GainCapital.www.BlotterOfActivity getActivityBlotter() {
        return activityBlotter;
    }


    /**
     * Sets the activityBlotter value for this AuthenticationResult2.
     * 
     * @param activityBlotter
     */
    public void setActivityBlotter(WebServices.com.GainCapital.www.BlotterOfActivity activityBlotter) {
        this.activityBlotter = activityBlotter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticationResult2)) return false;
        AuthenticationResult2 other = (AuthenticationResult2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.settings==null && other.getSettings()==null) || 
             (this.settings!=null &&
              this.settings.equals(other.getSettings()))) &&
            ((this.configurationSettings==null && other.getConfigurationSettings()==null) || 
             (this.configurationSettings!=null &&
              this.configurationSettings.equals(other.getConfigurationSettings()))) &&
            ((this.marginBlotter==null && other.getMarginBlotter()==null) || 
             (this.marginBlotter!=null &&
              this.marginBlotter.equals(other.getMarginBlotter()))) &&
            ((this.positionBlotter==null && other.getPositionBlotter()==null) || 
             (this.positionBlotter!=null &&
              this.positionBlotter.equals(other.getPositionBlotter()))) &&
            ((this.orderBlotter==null && other.getOrderBlotter()==null) || 
             (this.orderBlotter!=null &&
              this.orderBlotter.equals(other.getOrderBlotter()))) &&
            ((this.timeZoneBlotter==null && other.getTimeZoneBlotter()==null) || 
             (this.timeZoneBlotter!=null &&
              this.timeZoneBlotter.equals(other.getTimeZoneBlotter()))) &&
            ((this.activityBlotter==null && other.getActivityBlotter()==null) || 
             (this.activityBlotter!=null &&
              this.activityBlotter.equals(other.getActivityBlotter())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSettings() != null) {
            _hashCode += getSettings().hashCode();
        }
        if (getConfigurationSettings() != null) {
            _hashCode += getConfigurationSettings().hashCode();
        }
        if (getMarginBlotter() != null) {
            _hashCode += getMarginBlotter().hashCode();
        }
        if (getPositionBlotter() != null) {
            _hashCode += getPositionBlotter().hashCode();
        }
        if (getOrderBlotter() != null) {
            _hashCode += getOrderBlotter().hashCode();
        }
        if (getTimeZoneBlotter() != null) {
            _hashCode += getTimeZoneBlotter().hashCode();
        }
        if (getActivityBlotter() != null) {
            _hashCode += getActivityBlotter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthenticationResult2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationResult2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settings");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Settings"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Settings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurationSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ConfigurationSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ConfigurationSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marginBlotter");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "MarginBlotter"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfMargin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positionBlotter");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "PositionBlotter"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfPosition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderBlotter");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OrderBlotter"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneBlotter");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TimeZoneBlotter"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfTimeZones"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityBlotter");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ActivityBlotter"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfActivity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
