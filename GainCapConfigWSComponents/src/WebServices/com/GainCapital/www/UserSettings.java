/**
 * UserSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class UserSettings  implements java.io.Serializable {
    private java.lang.String product;

    private int defaultTradeLots;

    private int defaultOrderLots;

    private int order;

    private boolean active;

    private int orderPipsAway;

    private int tolerance;

    private int dealBoxSortOrder;

    public UserSettings() {
    }

    public UserSettings(
           java.lang.String product,
           int defaultTradeLots,
           int defaultOrderLots,
           int order,
           boolean active,
           int orderPipsAway,
           int tolerance,
           int dealBoxSortOrder) {
           this.product = product;
           this.defaultTradeLots = defaultTradeLots;
           this.defaultOrderLots = defaultOrderLots;
           this.order = order;
           this.active = active;
           this.orderPipsAway = orderPipsAway;
           this.tolerance = tolerance;
           this.dealBoxSortOrder = dealBoxSortOrder;
    }


    /**
     * Gets the product value for this UserSettings.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this UserSettings.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the defaultTradeLots value for this UserSettings.
     * 
     * @return defaultTradeLots
     */
    public int getDefaultTradeLots() {
        return defaultTradeLots;
    }


    /**
     * Sets the defaultTradeLots value for this UserSettings.
     * 
     * @param defaultTradeLots
     */
    public void setDefaultTradeLots(int defaultTradeLots) {
        this.defaultTradeLots = defaultTradeLots;
    }


    /**
     * Gets the defaultOrderLots value for this UserSettings.
     * 
     * @return defaultOrderLots
     */
    public int getDefaultOrderLots() {
        return defaultOrderLots;
    }


    /**
     * Sets the defaultOrderLots value for this UserSettings.
     * 
     * @param defaultOrderLots
     */
    public void setDefaultOrderLots(int defaultOrderLots) {
        this.defaultOrderLots = defaultOrderLots;
    }


    /**
     * Gets the order value for this UserSettings.
     * 
     * @return order
     */
    public int getOrder() {
        return order;
    }


    /**
     * Sets the order value for this UserSettings.
     * 
     * @param order
     */
    public void setOrder(int order) {
        this.order = order;
    }


    /**
     * Gets the active value for this UserSettings.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this UserSettings.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the orderPipsAway value for this UserSettings.
     * 
     * @return orderPipsAway
     */
    public int getOrderPipsAway() {
        return orderPipsAway;
    }


    /**
     * Sets the orderPipsAway value for this UserSettings.
     * 
     * @param orderPipsAway
     */
    public void setOrderPipsAway(int orderPipsAway) {
        this.orderPipsAway = orderPipsAway;
    }


    /**
     * Gets the tolerance value for this UserSettings.
     * 
     * @return tolerance
     */
    public int getTolerance() {
        return tolerance;
    }


    /**
     * Sets the tolerance value for this UserSettings.
     * 
     * @param tolerance
     */
    public void setTolerance(int tolerance) {
        this.tolerance = tolerance;
    }


    /**
     * Gets the dealBoxSortOrder value for this UserSettings.
     * 
     * @return dealBoxSortOrder
     */
    public int getDealBoxSortOrder() {
        return dealBoxSortOrder;
    }


    /**
     * Sets the dealBoxSortOrder value for this UserSettings.
     * 
     * @param dealBoxSortOrder
     */
    public void setDealBoxSortOrder(int dealBoxSortOrder) {
        this.dealBoxSortOrder = dealBoxSortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserSettings)) return false;
        UserSettings other = (UserSettings) obj;
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
            this.defaultTradeLots == other.getDefaultTradeLots() &&
            this.defaultOrderLots == other.getDefaultOrderLots() &&
            this.order == other.getOrder() &&
            this.active == other.isActive() &&
            this.orderPipsAway == other.getOrderPipsAway() &&
            this.tolerance == other.getTolerance() &&
            this.dealBoxSortOrder == other.getDealBoxSortOrder();
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
        _hashCode += getDefaultTradeLots();
        _hashCode += getDefaultOrderLots();
        _hashCode += getOrder();
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getOrderPipsAway();
        _hashCode += getTolerance();
        _hashCode += getDealBoxSortOrder();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UserSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultTradeLots");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "DefaultTradeLots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultOrderLots");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "DefaultOrderLots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderPipsAway");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OrderPipsAway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tolerance");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Tolerance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealBoxSortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "DealBoxSortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
