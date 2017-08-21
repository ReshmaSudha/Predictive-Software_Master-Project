/**
 * OrderSection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class OrderSection  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String buySell;

    private java.lang.String contract;

    private java.lang.String rate;

    private java.lang.String confirmationNumber;

    private java.lang.String basis;

    private java.lang.String status;

    private java.lang.String ASSP;

    private java.lang.String dealReference;

    public OrderSection() {
    }

    public OrderSection(
           java.lang.String type,
           java.lang.String buySell,
           java.lang.String contract,
           java.lang.String rate,
           java.lang.String confirmationNumber,
           java.lang.String basis,
           java.lang.String status,
           java.lang.String ASSP,
           java.lang.String dealReference) {
           this.type = type;
           this.buySell = buySell;
           this.contract = contract;
           this.rate = rate;
           this.confirmationNumber = confirmationNumber;
           this.basis = basis;
           this.status = status;
           this.ASSP = ASSP;
           this.dealReference = dealReference;
    }


    /**
     * Gets the type value for this OrderSection.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OrderSection.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the buySell value for this OrderSection.
     * 
     * @return buySell
     */
    public java.lang.String getBuySell() {
        return buySell;
    }


    /**
     * Sets the buySell value for this OrderSection.
     * 
     * @param buySell
     */
    public void setBuySell(java.lang.String buySell) {
        this.buySell = buySell;
    }


    /**
     * Gets the contract value for this OrderSection.
     * 
     * @return contract
     */
    public java.lang.String getContract() {
        return contract;
    }


    /**
     * Sets the contract value for this OrderSection.
     * 
     * @param contract
     */
    public void setContract(java.lang.String contract) {
        this.contract = contract;
    }


    /**
     * Gets the rate value for this OrderSection.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this OrderSection.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the confirmationNumber value for this OrderSection.
     * 
     * @return confirmationNumber
     */
    public java.lang.String getConfirmationNumber() {
        return confirmationNumber;
    }


    /**
     * Sets the confirmationNumber value for this OrderSection.
     * 
     * @param confirmationNumber
     */
    public void setConfirmationNumber(java.lang.String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }


    /**
     * Gets the basis value for this OrderSection.
     * 
     * @return basis
     */
    public java.lang.String getBasis() {
        return basis;
    }


    /**
     * Sets the basis value for this OrderSection.
     * 
     * @param basis
     */
    public void setBasis(java.lang.String basis) {
        this.basis = basis;
    }


    /**
     * Gets the status value for this OrderSection.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OrderSection.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the ASSP value for this OrderSection.
     * 
     * @return ASSP
     */
    public java.lang.String getASSP() {
        return ASSP;
    }


    /**
     * Sets the ASSP value for this OrderSection.
     * 
     * @param ASSP
     */
    public void setASSP(java.lang.String ASSP) {
        this.ASSP = ASSP;
    }


    /**
     * Gets the dealReference value for this OrderSection.
     * 
     * @return dealReference
     */
    public java.lang.String getDealReference() {
        return dealReference;
    }


    /**
     * Sets the dealReference value for this OrderSection.
     * 
     * @param dealReference
     */
    public void setDealReference(java.lang.String dealReference) {
        this.dealReference = dealReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderSection)) return false;
        OrderSection other = (OrderSection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.buySell==null && other.getBuySell()==null) || 
             (this.buySell!=null &&
              this.buySell.equals(other.getBuySell()))) &&
            ((this.contract==null && other.getContract()==null) || 
             (this.contract!=null &&
              this.contract.equals(other.getContract()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.confirmationNumber==null && other.getConfirmationNumber()==null) || 
             (this.confirmationNumber!=null &&
              this.confirmationNumber.equals(other.getConfirmationNumber()))) &&
            ((this.basis==null && other.getBasis()==null) || 
             (this.basis!=null &&
              this.basis.equals(other.getBasis()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.ASSP==null && other.getASSP()==null) || 
             (this.ASSP!=null &&
              this.ASSP.equals(other.getASSP()))) &&
            ((this.dealReference==null && other.getDealReference()==null) || 
             (this.dealReference!=null &&
              this.dealReference.equals(other.getDealReference())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
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
        if (getConfirmationNumber() != null) {
            _hashCode += getConfirmationNumber().hashCode();
        }
        if (getBasis() != null) {
            _hashCode += getBasis().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getASSP() != null) {
            _hashCode += getASSP().hashCode();
        }
        if (getDealReference() != null) {
            _hashCode += getDealReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderSection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OrderSection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Type"));
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
        elemField.setFieldName("confirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ConfirmationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basis");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Basis"));
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
        elemField.setFieldName("ASSP");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ASSP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealReference");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "DealReference"));
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
