/**
 * PlatformSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class PlatformSettings  implements java.io.Serializable {
    private java.lang.String platformSettings;

    private java.lang.String platformPreferences;

    private java.lang.String chartPreferences;

    public PlatformSettings() {
    }

    public PlatformSettings(
           java.lang.String platformSettings,
           java.lang.String platformPreferences,
           java.lang.String chartPreferences) {
           this.platformSettings = platformSettings;
           this.platformPreferences = platformPreferences;
           this.chartPreferences = chartPreferences;
    }


    /**
     * Gets the platformSettings value for this PlatformSettings.
     * 
     * @return platformSettings
     */
    public java.lang.String getPlatformSettings() {
        return platformSettings;
    }


    /**
     * Sets the platformSettings value for this PlatformSettings.
     * 
     * @param platformSettings
     */
    public void setPlatformSettings(java.lang.String platformSettings) {
        this.platformSettings = platformSettings;
    }


    /**
     * Gets the platformPreferences value for this PlatformSettings.
     * 
     * @return platformPreferences
     */
    public java.lang.String getPlatformPreferences() {
        return platformPreferences;
    }


    /**
     * Sets the platformPreferences value for this PlatformSettings.
     * 
     * @param platformPreferences
     */
    public void setPlatformPreferences(java.lang.String platformPreferences) {
        this.platformPreferences = platformPreferences;
    }


    /**
     * Gets the chartPreferences value for this PlatformSettings.
     * 
     * @return chartPreferences
     */
    public java.lang.String getChartPreferences() {
        return chartPreferences;
    }


    /**
     * Sets the chartPreferences value for this PlatformSettings.
     * 
     * @param chartPreferences
     */
    public void setChartPreferences(java.lang.String chartPreferences) {
        this.chartPreferences = chartPreferences;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlatformSettings)) return false;
        PlatformSettings other = (PlatformSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.platformSettings==null && other.getPlatformSettings()==null) || 
             (this.platformSettings!=null &&
              this.platformSettings.equals(other.getPlatformSettings()))) &&
            ((this.platformPreferences==null && other.getPlatformPreferences()==null) || 
             (this.platformPreferences!=null &&
              this.platformPreferences.equals(other.getPlatformPreferences()))) &&
            ((this.chartPreferences==null && other.getChartPreferences()==null) || 
             (this.chartPreferences!=null &&
              this.chartPreferences.equals(other.getChartPreferences())));
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
        if (getPlatformSettings() != null) {
            _hashCode += getPlatformSettings().hashCode();
        }
        if (getPlatformPreferences() != null) {
            _hashCode += getPlatformPreferences().hashCode();
        }
        if (getChartPreferences() != null) {
            _hashCode += getChartPreferences().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlatformSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "PlatformSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platformSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "PlatformSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platformPreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "PlatformPreferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chartPreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ChartPreferences"));
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
