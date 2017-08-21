/**
 * Deal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class Deal  implements java.io.Serializable {
    private java.lang.String dealReference;

    private java.lang.String product;

    private java.lang.String buySell;

    private java.lang.String contract;

    private java.lang.String rate;

    private java.lang.String counter;

    private java.lang.String dealDate;

    private java.lang.String confirmationNumber;

    private java.lang.String status;

    private java.lang.String dealSequence;

    public Deal() {
    }

    public Deal(
           java.lang.String dealReference,
           java.lang.String product,
           java.lang.String buySell,
           java.lang.String contract,
           java.lang.String rate,
           java.lang.String counter,
           java.lang.String dealDate,
           java.lang.String confirmationNumber,
           java.lang.String status,
           java.lang.String dealSequence) {
           this.dealReference = dealReference;
           this.product = product;
           this.buySell = buySell;
           this.contract = contract;
           this.rate = rate;
           this.counter = counter;
           this.dealDate = dealDate;
           this.confirmationNumber = confirmationNumber;
           this.status = status;
           this.dealSequence = dealSequence;
    }


    /**
     * Gets the dealReference value for this Deal.
     * 
     * @return dealReference
     */
    public java.lang.String getDealReference() {
        return dealReference;
    }


    /**
     * Sets the dealReference value for this Deal.
     * 
     * @param dealReference
     */
    public void setDealReference(java.lang.String dealReference) {
        this.dealReference = dealReference;
    }


    /**
     * Gets the product value for this Deal.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this Deal.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the buySell value for this Deal.
     * 
     * @return buySell
     */
    public java.lang.String getBuySell() {
        return buySell;
    }


    /**
     * Sets the buySell value for this Deal.
     * 
     * @param buySell
     */
    public void setBuySell(java.lang.String buySell) {
        this.buySell = buySell;
    }


    /**
     * Gets the contract value for this Deal.
     * 
     * @return contract
     */
    public java.lang.String getContract() {
        return contract;
    }


    /**
     * Sets the contract value for this Deal.
     * 
     * @param contract
     */
    public void setContract(java.lang.String contract) {
        this.contract = contract;
    }


    /**
     * Gets the rate value for this Deal.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this Deal.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the counter value for this Deal.
     * 
     * @return counter
     */
    public java.lang.String getCounter() {
        return counter;
    }


    /**
     * Sets the counter value for this Deal.
     * 
     * @param counter
     */
    public void setCounter(java.lang.String counter) {
        this.counter = counter;
    }


    /**
     * Gets the dealDate value for this Deal.
     * 
     * @return dealDate
     */
    public java.lang.String getDealDate() {
        return dealDate;
    }


    /**
     * Sets the dealDate value for this Deal.
     * 
     * @param dealDate
     */
    public void setDealDate(java.lang.String dealDate) {
        this.dealDate = dealDate;
    }


    /**
     * Gets the confirmationNumber value for this Deal.
     * 
     * @return confirmationNumber
     */
    public java.lang.String getConfirmationNumber() {
        return confirmationNumber;
    }


    /**
     * Sets the confirmationNumber value for this Deal.
     * 
     * @param confirmationNumber
     */
    public void setConfirmationNumber(java.lang.String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }


    /**
     * Gets the status value for this Deal.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Deal.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the dealSequence value for this Deal.
     * 
     * @return dealSequence
     */
    public java.lang.String getDealSequence() {
        return dealSequence;
    }


    /**
     * Sets the dealSequence value for this Deal.
     * 
     * @param dealSequence
     */
    public void setDealSequence(java.lang.String dealSequence) {
        this.dealSequence = dealSequence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Deal)) return false;
        Deal other = (Deal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dealReference==null && other.getDealReference()==null) || 
             (this.dealReference!=null &&
              this.dealReference.equals(other.getDealReference()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.buySell==null && other.getBuySell()==null) || 
             (this.buySell!=null &&
              this.buySell.equals(other.getBuySell()))) &&
            ((this.contract==null && other.getContract()==null) || 
             (this.contract!=null &&
              this.contract.equals(other.getContract()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.counter==null && other.getCounter()==null) || 
             (this.counter!=null &&
              this.counter.equals(other.getCounter()))) &&
            ((this.dealDate==null && other.getDealDate()==null) || 
             (this.dealDate!=null &&
              this.dealDate.equals(other.getDealDate()))) &&
            ((this.confirmationNumber==null && other.getConfirmationNumber()==null) || 
             (this.confirmationNumber!=null &&
              this.confirmationNumber.equals(other.getConfirmationNumber()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.dealSequence==null && other.getDealSequence()==null) || 
             (this.dealSequence!=null &&
              this.dealSequence.equals(other.getDealSequence())));
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
        if (getDealReference() != null) {
            _hashCode += getDealReference().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getBuySell() != null) {
            _hashCode += getBuySell().hashCode();
        }
        if (getContract() != null) {
            _hashCode += getContract().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getCounter() != null) {
            _hashCode += getCounter().hashCode();
        }
        if (getDealDate() != null) {
            _hashCode += getDealDate().hashCode();
        }
        if (getConfirmationNumber() != null) {
            _hashCode += getConfirmationNumber().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDealSequence() != null) {
            _hashCode += getDealSequence().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Deal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Deal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealReference");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "DealReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buySell");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BuySell"));
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
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counter");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Counter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealDate");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "DealDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ConfirmationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "DealSequence"));
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
