/**
 * Position.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class Position  implements java.io.Serializable {
    private java.lang.String product;

    private java.lang.String contract;

    private java.lang.String unrealized;

    private java.lang.String USDValue;

    private java.lang.String currencyValue;

    private java.lang.String averageRate;

    private java.lang.String baseCurrencyValue;

    private java.lang.String limitRate;

    private java.lang.String stopRate;

    public Position() {
    }

    public Position(
           java.lang.String product,
           java.lang.String contract,
           java.lang.String unrealized,
           java.lang.String USDValue,
           java.lang.String currencyValue,
           java.lang.String averageRate,
           java.lang.String baseCurrencyValue,
           java.lang.String limitRate,
           java.lang.String stopRate) {
           this.product = product;
           this.contract = contract;
           this.unrealized = unrealized;
           this.USDValue = USDValue;
           this.currencyValue = currencyValue;
           this.averageRate = averageRate;
           this.baseCurrencyValue = baseCurrencyValue;
           this.limitRate = limitRate;
           this.stopRate = stopRate;
    }


    /**
     * Gets the product value for this Position.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this Position.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the contract value for this Position.
     * 
     * @return contract
     */
    public java.lang.String getContract() {
        return contract;
    }


    /**
     * Sets the contract value for this Position.
     * 
     * @param contract
     */
    public void setContract(java.lang.String contract) {
        this.contract = contract;
    }


    /**
     * Gets the unrealized value for this Position.
     * 
     * @return unrealized
     */
    public java.lang.String getUnrealized() {
        return unrealized;
    }


    /**
     * Sets the unrealized value for this Position.
     * 
     * @param unrealized
     */
    public void setUnrealized(java.lang.String unrealized) {
        this.unrealized = unrealized;
    }


    /**
     * Gets the USDValue value for this Position.
     * 
     * @return USDValue
     */
    public java.lang.String getUSDValue() {
        return USDValue;
    }


    /**
     * Sets the USDValue value for this Position.
     * 
     * @param USDValue
     */
    public void setUSDValue(java.lang.String USDValue) {
        this.USDValue = USDValue;
    }


    /**
     * Gets the currencyValue value for this Position.
     * 
     * @return currencyValue
     */
    public java.lang.String getCurrencyValue() {
        return currencyValue;
    }


    /**
     * Sets the currencyValue value for this Position.
     * 
     * @param currencyValue
     */
    public void setCurrencyValue(java.lang.String currencyValue) {
        this.currencyValue = currencyValue;
    }


    /**
     * Gets the averageRate value for this Position.
     * 
     * @return averageRate
     */
    public java.lang.String getAverageRate() {
        return averageRate;
    }


    /**
     * Sets the averageRate value for this Position.
     * 
     * @param averageRate
     */
    public void setAverageRate(java.lang.String averageRate) {
        this.averageRate = averageRate;
    }


    /**
     * Gets the baseCurrencyValue value for this Position.
     * 
     * @return baseCurrencyValue
     */
    public java.lang.String getBaseCurrencyValue() {
        return baseCurrencyValue;
    }


    /**
     * Sets the baseCurrencyValue value for this Position.
     * 
     * @param baseCurrencyValue
     */
    public void setBaseCurrencyValue(java.lang.String baseCurrencyValue) {
        this.baseCurrencyValue = baseCurrencyValue;
    }


    /**
     * Gets the limitRate value for this Position.
     * 
     * @return limitRate
     */
    public java.lang.String getLimitRate() {
        return limitRate;
    }


    /**
     * Sets the limitRate value for this Position.
     * 
     * @param limitRate
     */
    public void setLimitRate(java.lang.String limitRate) {
        this.limitRate = limitRate;
    }


    /**
     * Gets the stopRate value for this Position.
     * 
     * @return stopRate
     */
    public java.lang.String getStopRate() {
        return stopRate;
    }


    /**
     * Sets the stopRate value for this Position.
     * 
     * @param stopRate
     */
    public void setStopRate(java.lang.String stopRate) {
        this.stopRate = stopRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Position)) return false;
        Position other = (Position) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.contract==null && other.getContract()==null) || 
             (this.contract!=null &&
              this.contract.equals(other.getContract()))) &&
            ((this.unrealized==null && other.getUnrealized()==null) || 
             (this.unrealized!=null &&
              this.unrealized.equals(other.getUnrealized()))) &&
            ((this.USDValue==null && other.getUSDValue()==null) || 
             (this.USDValue!=null &&
              this.USDValue.equals(other.getUSDValue()))) &&
            ((this.currencyValue==null && other.getCurrencyValue()==null) || 
             (this.currencyValue!=null &&
              this.currencyValue.equals(other.getCurrencyValue()))) &&
            ((this.averageRate==null && other.getAverageRate()==null) || 
             (this.averageRate!=null &&
              this.averageRate.equals(other.getAverageRate()))) &&
            ((this.baseCurrencyValue==null && other.getBaseCurrencyValue()==null) || 
             (this.baseCurrencyValue!=null &&
              this.baseCurrencyValue.equals(other.getBaseCurrencyValue()))) &&
            ((this.limitRate==null && other.getLimitRate()==null) || 
             (this.limitRate!=null &&
              this.limitRate.equals(other.getLimitRate()))) &&
            ((this.stopRate==null && other.getStopRate()==null) || 
             (this.stopRate!=null &&
              this.stopRate.equals(other.getStopRate())));
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
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getContract() != null) {
            _hashCode += getContract().hashCode();
        }
        if (getUnrealized() != null) {
            _hashCode += getUnrealized().hashCode();
        }
        if (getUSDValue() != null) {
            _hashCode += getUSDValue().hashCode();
        }
        if (getCurrencyValue() != null) {
            _hashCode += getCurrencyValue().hashCode();
        }
        if (getAverageRate() != null) {
            _hashCode += getAverageRate().hashCode();
        }
        if (getBaseCurrencyValue() != null) {
            _hashCode += getBaseCurrencyValue().hashCode();
        }
        if (getLimitRate() != null) {
            _hashCode += getLimitRate().hashCode();
        }
        if (getStopRate() != null) {
            _hashCode += getStopRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Position.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Position"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Contract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unrealized");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Unrealized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USDValue");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "USDValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyValue");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "CurrencyValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageRate");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AverageRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCurrencyValue");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BaseCurrencyValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitRate");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "LimitRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopRate");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "StopRate"));
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
