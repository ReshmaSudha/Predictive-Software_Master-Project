/**
 * Margin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class Margin  implements java.io.Serializable {
    private java.lang.String postedMargin;

    private java.lang.String USDPostedMargin;

    private java.lang.String realizedProfit;

    private java.lang.String USDRealizedProfit;

    private java.lang.String unrealizedProfit;

    private java.lang.String marginBalance;

    private java.lang.String marginFactor;

    private java.lang.String availablePosition;

    private java.lang.String openPosition;

    private java.lang.String maxDealAvailable;

    public Margin() {
    }

    public Margin(
           java.lang.String postedMargin,
           java.lang.String USDPostedMargin,
           java.lang.String realizedProfit,
           java.lang.String USDRealizedProfit,
           java.lang.String unrealizedProfit,
           java.lang.String marginBalance,
           java.lang.String marginFactor,
           java.lang.String availablePosition,
           java.lang.String openPosition,
           java.lang.String maxDealAvailable) {
           this.postedMargin = postedMargin;
           this.USDPostedMargin = USDPostedMargin;
           this.realizedProfit = realizedProfit;
           this.USDRealizedProfit = USDRealizedProfit;
           this.unrealizedProfit = unrealizedProfit;
           this.marginBalance = marginBalance;
           this.marginFactor = marginFactor;
           this.availablePosition = availablePosition;
           this.openPosition = openPosition;
           this.maxDealAvailable = maxDealAvailable;
    }


    /**
     * Gets the postedMargin value for this Margin.
     * 
     * @return postedMargin
     */
    public java.lang.String getPostedMargin() {
        return postedMargin;
    }


    /**
     * Sets the postedMargin value for this Margin.
     * 
     * @param postedMargin
     */
    public void setPostedMargin(java.lang.String postedMargin) {
        this.postedMargin = postedMargin;
    }


    /**
     * Gets the USDPostedMargin value for this Margin.
     * 
     * @return USDPostedMargin
     */
    public java.lang.String getUSDPostedMargin() {
        return USDPostedMargin;
    }


    /**
     * Sets the USDPostedMargin value for this Margin.
     * 
     * @param USDPostedMargin
     */
    public void setUSDPostedMargin(java.lang.String USDPostedMargin) {
        this.USDPostedMargin = USDPostedMargin;
    }


    /**
     * Gets the realizedProfit value for this Margin.
     * 
     * @return realizedProfit
     */
    public java.lang.String getRealizedProfit() {
        return realizedProfit;
    }


    /**
     * Sets the realizedProfit value for this Margin.
     * 
     * @param realizedProfit
     */
    public void setRealizedProfit(java.lang.String realizedProfit) {
        this.realizedProfit = realizedProfit;
    }


    /**
     * Gets the USDRealizedProfit value for this Margin.
     * 
     * @return USDRealizedProfit
     */
    public java.lang.String getUSDRealizedProfit() {
        return USDRealizedProfit;
    }


    /**
     * Sets the USDRealizedProfit value for this Margin.
     * 
     * @param USDRealizedProfit
     */
    public void setUSDRealizedProfit(java.lang.String USDRealizedProfit) {
        this.USDRealizedProfit = USDRealizedProfit;
    }


    /**
     * Gets the unrealizedProfit value for this Margin.
     * 
     * @return unrealizedProfit
     */
    public java.lang.String getUnrealizedProfit() {
        return unrealizedProfit;
    }


    /**
     * Sets the unrealizedProfit value for this Margin.
     * 
     * @param unrealizedProfit
     */
    public void setUnrealizedProfit(java.lang.String unrealizedProfit) {
        this.unrealizedProfit = unrealizedProfit;
    }


    /**
     * Gets the marginBalance value for this Margin.
     * 
     * @return marginBalance
     */
    public java.lang.String getMarginBalance() {
        return marginBalance;
    }


    /**
     * Sets the marginBalance value for this Margin.
     * 
     * @param marginBalance
     */
    public void setMarginBalance(java.lang.String marginBalance) {
        this.marginBalance = marginBalance;
    }


    /**
     * Gets the marginFactor value for this Margin.
     * 
     * @return marginFactor
     */
    public java.lang.String getMarginFactor() {
        return marginFactor;
    }


    /**
     * Sets the marginFactor value for this Margin.
     * 
     * @param marginFactor
     */
    public void setMarginFactor(java.lang.String marginFactor) {
        this.marginFactor = marginFactor;
    }


    /**
     * Gets the availablePosition value for this Margin.
     * 
     * @return availablePosition
     */
    public java.lang.String getAvailablePosition() {
        return availablePosition;
    }


    /**
     * Sets the availablePosition value for this Margin.
     * 
     * @param availablePosition
     */
    public void setAvailablePosition(java.lang.String availablePosition) {
        this.availablePosition = availablePosition;
    }


    /**
     * Gets the openPosition value for this Margin.
     * 
     * @return openPosition
     */
    public java.lang.String getOpenPosition() {
        return openPosition;
    }


    /**
     * Sets the openPosition value for this Margin.
     * 
     * @param openPosition
     */
    public void setOpenPosition(java.lang.String openPosition) {
        this.openPosition = openPosition;
    }


    /**
     * Gets the maxDealAvailable value for this Margin.
     * 
     * @return maxDealAvailable
     */
    public java.lang.String getMaxDealAvailable() {
        return maxDealAvailable;
    }


    /**
     * Sets the maxDealAvailable value for this Margin.
     * 
     * @param maxDealAvailable
     */
    public void setMaxDealAvailable(java.lang.String maxDealAvailable) {
        this.maxDealAvailable = maxDealAvailable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Margin)) return false;
        Margin other = (Margin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postedMargin==null && other.getPostedMargin()==null) || 
             (this.postedMargin!=null &&
              this.postedMargin.equals(other.getPostedMargin()))) &&
            ((this.USDPostedMargin==null && other.getUSDPostedMargin()==null) || 
             (this.USDPostedMargin!=null &&
              this.USDPostedMargin.equals(other.getUSDPostedMargin()))) &&
            ((this.realizedProfit==null && other.getRealizedProfit()==null) || 
             (this.realizedProfit!=null &&
              this.realizedProfit.equals(other.getRealizedProfit()))) &&
            ((this.USDRealizedProfit==null && other.getUSDRealizedProfit()==null) || 
             (this.USDRealizedProfit!=null &&
              this.USDRealizedProfit.equals(other.getUSDRealizedProfit()))) &&
            ((this.unrealizedProfit==null && other.getUnrealizedProfit()==null) || 
             (this.unrealizedProfit!=null &&
              this.unrealizedProfit.equals(other.getUnrealizedProfit()))) &&
            ((this.marginBalance==null && other.getMarginBalance()==null) || 
             (this.marginBalance!=null &&
              this.marginBalance.equals(other.getMarginBalance()))) &&
            ((this.marginFactor==null && other.getMarginFactor()==null) || 
             (this.marginFactor!=null &&
              this.marginFactor.equals(other.getMarginFactor()))) &&
            ((this.availablePosition==null && other.getAvailablePosition()==null) || 
             (this.availablePosition!=null &&
              this.availablePosition.equals(other.getAvailablePosition()))) &&
            ((this.openPosition==null && other.getOpenPosition()==null) || 
             (this.openPosition!=null &&
              this.openPosition.equals(other.getOpenPosition()))) &&
            ((this.maxDealAvailable==null && other.getMaxDealAvailable()==null) || 
             (this.maxDealAvailable!=null &&
              this.maxDealAvailable.equals(other.getMaxDealAvailable())));
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
        if (getPostedMargin() != null) {
            _hashCode += getPostedMargin().hashCode();
        }
        if (getUSDPostedMargin() != null) {
            _hashCode += getUSDPostedMargin().hashCode();
        }
        if (getRealizedProfit() != null) {
            _hashCode += getRealizedProfit().hashCode();
        }
        if (getUSDRealizedProfit() != null) {
            _hashCode += getUSDRealizedProfit().hashCode();
        }
        if (getUnrealizedProfit() != null) {
            _hashCode += getUnrealizedProfit().hashCode();
        }
        if (getMarginBalance() != null) {
            _hashCode += getMarginBalance().hashCode();
        }
        if (getMarginFactor() != null) {
            _hashCode += getMarginFactor().hashCode();
        }
        if (getAvailablePosition() != null) {
            _hashCode += getAvailablePosition().hashCode();
        }
        if (getOpenPosition() != null) {
            _hashCode += getOpenPosition().hashCode();
        }
        if (getMaxDealAvailable() != null) {
            _hashCode += getMaxDealAvailable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Margin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Margin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postedMargin");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "PostedMargin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USDPostedMargin");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "USDPostedMargin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realizedProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "RealizedProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USDRealizedProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "USDRealizedProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unrealizedProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UnrealizedProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marginBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "MarginBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marginFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "MarginFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availablePosition");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AvailablePosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OpenPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDealAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "MaxDealAvailable"));
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
