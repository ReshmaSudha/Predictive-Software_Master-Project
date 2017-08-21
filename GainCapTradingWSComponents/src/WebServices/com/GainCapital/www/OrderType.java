/**
 * OrderType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class OrderType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OrderType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SINGLE_ORDER = "SINGLE_ORDER";
    public static final java.lang.String _SINGLE_ORDER_ASSP = "SINGLE_ORDER_ASSP";
    public static final java.lang.String _SINGLE_ORDER_TRAILINGSTOP = "SINGLE_ORDER_TRAILINGSTOP";
    public static final java.lang.String _OCO_ORDER = "OCO_ORDER";
    public static final java.lang.String _OCO_ORDER_ASSP = "OCO_ORDER_ASSP";
    public static final java.lang.String _IF_THEN_SINGLE = "IF_THEN_SINGLE";
    public static final java.lang.String _IF_THEN_OCO = "IF_THEN_OCO";
    public static final java.lang.String _SINGLE_ORDER_TRAILINGSTOP_ASSP = "SINGLE_ORDER_TRAILINGSTOP_ASSP";
    public static final OrderType SINGLE_ORDER = new OrderType(_SINGLE_ORDER);
    public static final OrderType SINGLE_ORDER_ASSP = new OrderType(_SINGLE_ORDER_ASSP);
    public static final OrderType SINGLE_ORDER_TRAILINGSTOP = new OrderType(_SINGLE_ORDER_TRAILINGSTOP);
    public static final OrderType OCO_ORDER = new OrderType(_OCO_ORDER);
    public static final OrderType OCO_ORDER_ASSP = new OrderType(_OCO_ORDER_ASSP);
    public static final OrderType IF_THEN_SINGLE = new OrderType(_IF_THEN_SINGLE);
    public static final OrderType IF_THEN_OCO = new OrderType(_IF_THEN_OCO);
    public static final OrderType SINGLE_ORDER_TRAILINGSTOP_ASSP = new OrderType(_SINGLE_ORDER_TRAILINGSTOP_ASSP);
    public java.lang.String getValue() { return _value_;}
    public static OrderType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OrderType enumeration = (OrderType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OrderType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OrderType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
