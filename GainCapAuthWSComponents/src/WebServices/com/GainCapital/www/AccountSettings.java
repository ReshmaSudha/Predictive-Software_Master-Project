/**
 * AccountSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class AccountSettings  implements java.io.Serializable {
    private java.lang.String basePair;

    private java.lang.String features;

    private java.lang.String blowoutLevel;

    private boolean isNFARegulated;

    private boolean isDealAtMarket;

    private boolean isAgency;

    public AccountSettings() {
    }

    public AccountSettings(
           java.lang.String basePair,
           java.lang.String features,
           java.lang.String blowoutLevel,
           boolean isNFARegulated,
           boolean isDealAtMarket,
           boolean isAgency) {
           this.basePair = basePair;
           this.features = features;
           this.blowoutLevel = blowoutLevel;
           this.isNFARegulated = isNFARegulated;
           this.isDealAtMarket = isDealAtMarket;
           this.isAgency = isAgency;
    }


    /**
     * Gets the basePair value for this AccountSettings.
     * 
     * @return basePair
     */
    public java.lang.String getBasePair() {
        return basePair;
    }


    /**
     * Sets the basePair value for this AccountSettings.
     * 
     * @param basePair
     */
    public void setBasePair(java.lang.String basePair) {
        this.basePair = basePair;
    }


    /**
     * Gets the features value for this AccountSettings.
     * 
     * @return features
     */
    public java.lang.String getFeatures() {
        return features;
    }


    /**
     * Sets the features value for this AccountSettings.
     * 
     * @param features
     */
    public void setFeatures(java.lang.String features) {
        this.features = features;
    }


    /**
     * Gets the blowoutLevel value for this AccountSettings.
     * 
     * @return blowoutLevel
     */
    public java.lang.String getBlowoutLevel() {
        return blowoutLevel;
    }


    /**
     * Sets the blowoutLevel value for this AccountSettings.
     * 
     * @param blowoutLevel
     */
    public void setBlowoutLevel(java.lang.String blowoutLevel) {
        this.blowoutLevel = blowoutLevel;
    }


    /**
     * Gets the isNFARegulated value for this AccountSettings.
     * 
     * @return isNFARegulated
     */
    public boolean isIsNFARegulated() {
        return isNFARegulated;
    }


    /**
     * Sets the isNFARegulated value for this AccountSettings.
     * 
     * @param isNFARegulated
     */
    public void setIsNFARegulated(boolean isNFARegulated) {
        this.isNFARegulated = isNFARegulated;
    }


    /**
     * Gets the isDealAtMarket value for this AccountSettings.
     * 
     * @return isDealAtMarket
     */
    public boolean isIsDealAtMarket() {
        return isDealAtMarket;
    }


    /**
     * Sets the isDealAtMarket value for this AccountSettings.
     * 
     * @param isDealAtMarket
     */
    public void setIsDealAtMarket(boolean isDealAtMarket) {
        this.isDealAtMarket = isDealAtMarket;
    }


    /**
     * Gets the isAgency value for this AccountSettings.
     * 
     * @return isAgency
     */
    public boolean isIsAgency() {
        return isAgency;
    }


    /**
     * Sets the isAgency value for this AccountSettings.
     * 
     * @param isAgency
     */
    public void setIsAgency(boolean isAgency) {
        this.isAgency = isAgency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountSettings)) return false;
        AccountSettings other = (AccountSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.basePair==null && other.getBasePair()==null) || 
             (this.basePair!=null &&
              this.basePair.equals(other.getBasePair()))) &&
            ((this.features==null && other.getFeatures()==null) || 
             (this.features!=null &&
              this.features.equals(other.getFeatures()))) &&
            ((this.blowoutLevel==null && other.getBlowoutLevel()==null) || 
             (this.blowoutLevel!=null &&
              this.blowoutLevel.equals(other.getBlowoutLevel()))) &&
            this.isNFARegulated == other.isIsNFARegulated() &&
            this.isDealAtMarket == other.isIsDealAtMarket() &&
            this.isAgency == other.isIsAgency();
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
        if (getBasePair() != null) {
            _hashCode += getBasePair().hashCode();
        }
        if (getFeatures() != null) {
            _hashCode += getFeatures().hashCode();
        }
        if (getBlowoutLevel() != null) {
            _hashCode += getBlowoutLevel().hashCode();
        }
        _hashCode += (isIsNFARegulated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsDealAtMarket() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsAgency() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AccountSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basePair");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BasePair"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("features");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Features"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blowoutLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlowoutLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNFARegulated");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "IsNFARegulated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDealAtMarket");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "IsDealAtMarket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAgency");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "IsAgency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
