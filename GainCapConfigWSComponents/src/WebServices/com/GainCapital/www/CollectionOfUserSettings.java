/**
 * CollectionOfUserSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class CollectionOfUserSettings  implements java.io.Serializable {
    private WebServices.com.GainCapital.www.UserSettings[] input;

    public CollectionOfUserSettings() {
    }

    public CollectionOfUserSettings(
           WebServices.com.GainCapital.www.UserSettings[] input) {
           this.input = input;
    }


    /**
     * Gets the input value for this CollectionOfUserSettings.
     * 
     * @return input
     */
    public WebServices.com.GainCapital.www.UserSettings[] getInput() {
        return input;
    }


    /**
     * Sets the input value for this CollectionOfUserSettings.
     * 
     * @param input
     */
    public void setInput(WebServices.com.GainCapital.www.UserSettings[] input) {
        this.input = input;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CollectionOfUserSettings)) return false;
        CollectionOfUserSettings other = (CollectionOfUserSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.input==null && other.getInput()==null) || 
             (this.input!=null &&
              java.util.Arrays.equals(this.input, other.getInput())));
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
        if (getInput() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInput());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInput(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CollectionOfUserSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "CollectionOfUserSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Input"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UserSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UserSettings"));
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
