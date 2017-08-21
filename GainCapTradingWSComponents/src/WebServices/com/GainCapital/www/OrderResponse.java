/**
 * OrderResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class OrderResponse  implements java.io.Serializable {
    private WebServices.com.GainCapital.www.OrderType type;

    private WebServices.com.GainCapital.www.Action orderAction;

    private java.lang.String product;

    private java.lang.String expiry;

    private java.lang.String orderDate;

    private java.lang.String trailingStopPoints;

    private java.lang.String referenceNumber;

    private WebServices.com.GainCapital.www.OrderSection orderLeg1;

    private WebServices.com.GainCapital.www.OrderSection orderLeg2;

    private WebServices.com.GainCapital.www.OrderSection orderLeg3;

    private boolean success;

    private java.lang.String errorNo;

    private java.lang.String message;

    public OrderResponse() {
    }

    public OrderResponse(
           WebServices.com.GainCapital.www.OrderType type,
           WebServices.com.GainCapital.www.Action orderAction,
           java.lang.String product,
           java.lang.String expiry,
           java.lang.String orderDate,
           java.lang.String trailingStopPoints,
           java.lang.String referenceNumber,
           WebServices.com.GainCapital.www.OrderSection orderLeg1,
           WebServices.com.GainCapital.www.OrderSection orderLeg2,
           WebServices.com.GainCapital.www.OrderSection orderLeg3,
           boolean success,
           java.lang.String errorNo,
           java.lang.String message) {
           this.type = type;
           this.orderAction = orderAction;
           this.product = product;
           this.expiry = expiry;
           this.orderDate = orderDate;
           this.trailingStopPoints = trailingStopPoints;
           this.referenceNumber = referenceNumber;
           this.orderLeg1 = orderLeg1;
           this.orderLeg2 = orderLeg2;
           this.orderLeg3 = orderLeg3;
           this.success = success;
           this.errorNo = errorNo;
           this.message = message;
    }


    /**
     * Gets the type value for this OrderResponse.
     * 
     * @return type
     */
    public WebServices.com.GainCapital.www.OrderType getType() {
        return type;
    }


    /**
     * Sets the type value for this OrderResponse.
     * 
     * @param type
     */
    public void setType(WebServices.com.GainCapital.www.OrderType type) {
        this.type = type;
    }


    /**
     * Gets the orderAction value for this OrderResponse.
     * 
     * @return orderAction
     */
    public WebServices.com.GainCapital.www.Action getOrderAction() {
        return orderAction;
    }


    /**
     * Sets the orderAction value for this OrderResponse.
     * 
     * @param orderAction
     */
    public void setOrderAction(WebServices.com.GainCapital.www.Action orderAction) {
        this.orderAction = orderAction;
    }


    /**
     * Gets the product value for this OrderResponse.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this OrderResponse.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the expiry value for this OrderResponse.
     * 
     * @return expiry
     */
    public java.lang.String getExpiry() {
        return expiry;
    }


    /**
     * Sets the expiry value for this OrderResponse.
     * 
     * @param expiry
     */
    public void setExpiry(java.lang.String expiry) {
        this.expiry = expiry;
    }


    /**
     * Gets the orderDate value for this OrderResponse.
     * 
     * @return orderDate
     */
    public java.lang.String getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this OrderResponse.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.lang.String orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the trailingStopPoints value for this OrderResponse.
     * 
     * @return trailingStopPoints
     */
    public java.lang.String getTrailingStopPoints() {
        return trailingStopPoints;
    }


    /**
     * Sets the trailingStopPoints value for this OrderResponse.
     * 
     * @param trailingStopPoints
     */
    public void setTrailingStopPoints(java.lang.String trailingStopPoints) {
        this.trailingStopPoints = trailingStopPoints;
    }


    /**
     * Gets the referenceNumber value for this OrderResponse.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this OrderResponse.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the orderLeg1 value for this OrderResponse.
     * 
     * @return orderLeg1
     */
    public WebServices.com.GainCapital.www.OrderSection getOrderLeg1() {
        return orderLeg1;
    }


    /**
     * Sets the orderLeg1 value for this OrderResponse.
     * 
     * @param orderLeg1
     */
    public void setOrderLeg1(WebServices.com.GainCapital.www.OrderSection orderLeg1) {
        this.orderLeg1 = orderLeg1;
    }


    /**
     * Gets the orderLeg2 value for this OrderResponse.
     * 
     * @return orderLeg2
     */
    public WebServices.com.GainCapital.www.OrderSection getOrderLeg2() {
        return orderLeg2;
    }


    /**
     * Sets the orderLeg2 value for this OrderResponse.
     * 
     * @param orderLeg2
     */
    public void setOrderLeg2(WebServices.com.GainCapital.www.OrderSection orderLeg2) {
        this.orderLeg2 = orderLeg2;
    }


    /**
     * Gets the orderLeg3 value for this OrderResponse.
     * 
     * @return orderLeg3
     */
    public WebServices.com.GainCapital.www.OrderSection getOrderLeg3() {
        return orderLeg3;
    }


    /**
     * Sets the orderLeg3 value for this OrderResponse.
     * 
     * @param orderLeg3
     */
    public void setOrderLeg3(WebServices.com.GainCapital.www.OrderSection orderLeg3) {
        this.orderLeg3 = orderLeg3;
    }


    /**
     * Gets the success value for this OrderResponse.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this OrderResponse.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }


    /**
     * Gets the errorNo value for this OrderResponse.
     * 
     * @return errorNo
     */
    public java.lang.String getErrorNo() {
        return errorNo;
    }


    /**
     * Sets the errorNo value for this OrderResponse.
     * 
     * @param errorNo
     */
    public void setErrorNo(java.lang.String errorNo) {
        this.errorNo = errorNo;
    }


    /**
     * Gets the message value for this OrderResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this OrderResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderResponse)) return false;
        OrderResponse other = (OrderResponse) obj;
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
            ((this.orderAction==null && other.getOrderAction()==null) || 
             (this.orderAction!=null &&
              this.orderAction.equals(other.getOrderAction()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.expiry==null && other.getExpiry()==null) || 
             (this.expiry!=null &&
              this.expiry.equals(other.getExpiry()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.trailingStopPoints==null && other.getTrailingStopPoints()==null) || 
             (this.trailingStopPoints!=null &&
              this.trailingStopPoints.equals(other.getTrailingStopPoints()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.orderLeg1==null && other.getOrderLeg1()==null) || 
             (this.orderLeg1!=null &&
              this.orderLeg1.equals(other.getOrderLeg1()))) &&
            ((this.orderLeg2==null && other.getOrderLeg2()==null) || 
             (this.orderLeg2!=null &&
              this.orderLeg2.equals(other.getOrderLeg2()))) &&
            ((this.orderLeg3==null && other.getOrderLeg3()==null) || 
             (this.orderLeg3!=null &&
              this.orderLeg3.equals(other.getOrderLeg3()))) &&
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getOrderAction() != null) {
            _hashCode += getOrderAction().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getExpiry() != null) {
            _hashCode += getExpiry().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getTrailingStopPoints() != null) {
            _hashCode += getTrailingStopPoints().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getOrderLeg1() != null) {
            _hashCode += getOrderLeg1().hashCode();
        }
        if (getOrderLeg2() != null) {
            _hashCode += getOrderLeg2().hashCode();
        }
        if (getOrderLeg3() != null) {
            _hashCode += getOrderLeg3().hashCode();
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
        new org.apache.axis.description.TypeDesc(OrderResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OrderResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OrderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderAction");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OrderAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Action"));
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
        elemField.setFieldName("expiry");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Expiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OrderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trailingStopPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TrailingStopPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderLeg1");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OrderLeg1"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OrderSection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderLeg2");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OrderLeg2"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OrderSection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderLeg3");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OrderLeg3"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OrderSection"));
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
        elemField.setFieldName("errorNo");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ErrorNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Message"));
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
