/**
 * Settings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class Settings  implements java.io.Serializable {
    private WebServices.com.GainCapital.www.AccountSettings accountSettings;

    private WebServices.com.GainCapital.www.ProductSetting[] productSettings;

    private WebServices.com.GainCapital.www.UserTimeZone userTimeZones;

    private boolean success;

    private java.lang.String message;

    private java.lang.String errorNo;

    public Settings() {
    }

    public Settings(
           WebServices.com.GainCapital.www.AccountSettings accountSettings,
           WebServices.com.GainCapital.www.ProductSetting[] productSettings,
           WebServices.com.GainCapital.www.UserTimeZone userTimeZones,
           boolean success,
           java.lang.String message,
           java.lang.String errorNo) {
           this.accountSettings = accountSettings;
           this.productSettings = productSettings;
           this.userTimeZones = userTimeZones;
           this.success = success;
           this.message = message;
           this.errorNo = errorNo;
    }


    /**
     * Gets the accountSettings value for this Settings.
     * 
     * @return accountSettings
     */
    public WebServices.com.GainCapital.www.AccountSettings getAccountSettings() {
        return accountSettings;
    }


    /**
     * Sets the accountSettings value for this Settings.
     * 
     * @param accountSettings
     */
    public void setAccountSettings(WebServices.com.GainCapital.www.AccountSettings accountSettings) {
        this.accountSettings = accountSettings;
    }


    /**
     * Gets the productSettings value for this Settings.
     * 
     * @return productSettings
     */
    public WebServices.com.GainCapital.www.ProductSetting[] getProductSettings() {
        return productSettings;
    }


    /**
     * Sets the productSettings value for this Settings.
     * 
     * @param productSettings
     */
    public void setProductSettings(WebServices.com.GainCapital.www.ProductSetting[] productSettings) {
        this.productSettings = productSettings;
    }


    /**
     * Gets the userTimeZones value for this Settings.
     * 
     * @return userTimeZones
     */
    public WebServices.com.GainCapital.www.UserTimeZone getUserTimeZones() {
        return userTimeZones;
    }


    /**
     * Sets the userTimeZones value for this Settings.
     * 
     * @param userTimeZones
     */
    public void setUserTimeZones(WebServices.com.GainCapital.www.UserTimeZone userTimeZones) {
        this.userTimeZones = userTimeZones;
    }


    /**
     * Gets the success value for this Settings.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this Settings.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }


    /**
     * Gets the message value for this Settings.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this Settings.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the errorNo value for this Settings.
     * 
     * @return errorNo
     */
    public java.lang.String getErrorNo() {
        return errorNo;
    }


    /**
     * Sets the errorNo value for this Settings.
     * 
     * @param errorNo
     */
    public void setErrorNo(java.lang.String errorNo) {
        this.errorNo = errorNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Settings)) return false;
        Settings other = (Settings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountSettings==null && other.getAccountSettings()==null) || 
             (this.accountSettings!=null &&
              this.accountSettings.equals(other.getAccountSettings()))) &&
            ((this.productSettings==null && other.getProductSettings()==null) || 
             (this.productSettings!=null &&
              java.util.Arrays.equals(this.productSettings, other.getProductSettings()))) &&
            ((this.userTimeZones==null && other.getUserTimeZones()==null) || 
             (this.userTimeZones!=null &&
              this.userTimeZones.equals(other.getUserTimeZones()))) &&
            this.success == other.isSuccess() &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.errorNo==null && other.getErrorNo()==null) || 
             (this.errorNo!=null &&
              this.errorNo.equals(other.getErrorNo())));
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
        if (getAccountSettings() != null) {
            _hashCode += getAccountSettings().hashCode();
        }
        if (getProductSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserTimeZones() != null) {
            _hashCode += getUserTimeZones().hashCode();
        }
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getErrorNo() != null) {
            _hashCode += getErrorNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Settings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Settings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AccountSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AccountSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ProductSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ProductSetting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ProductSetting"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTimeZones");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UserTimeZones"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UserTimeZone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorNo");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ErrorNo"));
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
