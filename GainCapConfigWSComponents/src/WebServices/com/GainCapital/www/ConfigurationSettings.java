/**
 * ConfigurationSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class ConfigurationSettings  implements java.io.Serializable {
    private byte[] platformImage;

    private java.lang.String colorStyle;

    private int chartColorSet;

    private WebServices.com.GainCapital.www.Connection[] ratesConnection;

    private WebServices.com.GainCapital.www.Service[] services;

    private boolean success;

    private java.lang.String errorNo;

    private java.lang.String message;

    public ConfigurationSettings() {
    }

    public ConfigurationSettings(
           byte[] platformImage,
           java.lang.String colorStyle,
           int chartColorSet,
           WebServices.com.GainCapital.www.Connection[] ratesConnection,
           WebServices.com.GainCapital.www.Service[] services,
           boolean success,
           java.lang.String errorNo,
           java.lang.String message) {
           this.platformImage = platformImage;
           this.colorStyle = colorStyle;
           this.chartColorSet = chartColorSet;
           this.ratesConnection = ratesConnection;
           this.services = services;
           this.success = success;
           this.errorNo = errorNo;
           this.message = message;
    }


    /**
     * Gets the platformImage value for this ConfigurationSettings.
     * 
     * @return platformImage
     */
    public byte[] getPlatformImage() {
        return platformImage;
    }


    /**
     * Sets the platformImage value for this ConfigurationSettings.
     * 
     * @param platformImage
     */
    public void setPlatformImage(byte[] platformImage) {
        this.platformImage = platformImage;
    }


    /**
     * Gets the colorStyle value for this ConfigurationSettings.
     * 
     * @return colorStyle
     */
    public java.lang.String getColorStyle() {
        return colorStyle;
    }


    /**
     * Sets the colorStyle value for this ConfigurationSettings.
     * 
     * @param colorStyle
     */
    public void setColorStyle(java.lang.String colorStyle) {
        this.colorStyle = colorStyle;
    }


    /**
     * Gets the chartColorSet value for this ConfigurationSettings.
     * 
     * @return chartColorSet
     */
    public int getChartColorSet() {
        return chartColorSet;
    }


    /**
     * Sets the chartColorSet value for this ConfigurationSettings.
     * 
     * @param chartColorSet
     */
    public void setChartColorSet(int chartColorSet) {
        this.chartColorSet = chartColorSet;
    }


    /**
     * Gets the ratesConnection value for this ConfigurationSettings.
     * 
     * @return ratesConnection
     */
    public WebServices.com.GainCapital.www.Connection[] getRatesConnection() {
        return ratesConnection;
    }


    /**
     * Sets the ratesConnection value for this ConfigurationSettings.
     * 
     * @param ratesConnection
     */
    public void setRatesConnection(WebServices.com.GainCapital.www.Connection[] ratesConnection) {
        this.ratesConnection = ratesConnection;
    }


    /**
     * Gets the services value for this ConfigurationSettings.
     * 
     * @return services
     */
    public WebServices.com.GainCapital.www.Service[] getServices() {
        return services;
    }


    /**
     * Sets the services value for this ConfigurationSettings.
     * 
     * @param services
     */
    public void setServices(WebServices.com.GainCapital.www.Service[] services) {
        this.services = services;
    }


    /**
     * Gets the success value for this ConfigurationSettings.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this ConfigurationSettings.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }


    /**
     * Gets the errorNo value for this ConfigurationSettings.
     * 
     * @return errorNo
     */
    public java.lang.String getErrorNo() {
        return errorNo;
    }


    /**
     * Sets the errorNo value for this ConfigurationSettings.
     * 
     * @param errorNo
     */
    public void setErrorNo(java.lang.String errorNo) {
        this.errorNo = errorNo;
    }


    /**
     * Gets the message value for this ConfigurationSettings.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ConfigurationSettings.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurationSettings)) return false;
        ConfigurationSettings other = (ConfigurationSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.platformImage==null && other.getPlatformImage()==null) || 
             (this.platformImage!=null &&
              java.util.Arrays.equals(this.platformImage, other.getPlatformImage()))) &&
            ((this.colorStyle==null && other.getColorStyle()==null) || 
             (this.colorStyle!=null &&
              this.colorStyle.equals(other.getColorStyle()))) &&
            this.chartColorSet == other.getChartColorSet() &&
            ((this.ratesConnection==null && other.getRatesConnection()==null) || 
             (this.ratesConnection!=null &&
              java.util.Arrays.equals(this.ratesConnection, other.getRatesConnection()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              java.util.Arrays.equals(this.services, other.getServices()))) &&
            this.success == other.isSuccess() &&
            ((this.errorNo==null && other.getErrorNo()==null) || 
             (this.errorNo!=null &&
              this.errorNo.equals(other.getErrorNo()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPlatformImage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlatformImage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlatformImage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getColorStyle() != null) {
            _hashCode += getColorStyle().hashCode();
        }
        _hashCode += getChartColorSet();
        if (getRatesConnection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRatesConnection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRatesConnection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getErrorNo() != null) {
            _hashCode += getErrorNo().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurationSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ConfigurationSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platformImage");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "PlatformImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ColorStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chartColorSet");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ChartColorSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratesConnection");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "RatesConnection"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Connection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Connection"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Services"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Service"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorNo");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ErrorNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
