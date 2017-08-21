/**
 * TimeZones.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class TimeZones  extends WebServices.com.GainCapital.www.UserTimeZone  implements java.io.Serializable {
    private long ID;

    private java.lang.String timeZoneID;

    public TimeZones() {
    }

    public TimeZones(
           java.lang.String userTimeZoneID,
           java.lang.String timeZoneName,
           java.lang.String timeZoneStandardName,
           boolean isSupportDayLightSaving,
           java.lang.String dayLightName,
           java.lang.String easternToCustomerTimeZoneOffsetInMinutes,
           java.lang.String customerToGMTTimeZoneOffsetInMinutes,
           long ID,
           java.lang.String timeZoneID) {
        super(
            userTimeZoneID,
            timeZoneName,
            timeZoneStandardName,
            isSupportDayLightSaving,
            dayLightName,
            easternToCustomerTimeZoneOffsetInMinutes,
            customerToGMTTimeZoneOffsetInMinutes);
        this.ID = ID;
        this.timeZoneID = timeZoneID;
    }


    /**
     * Gets the ID value for this TimeZones.
     * 
     * @return ID
     */
    public long getID() {
        return ID;
    }


    /**
     * Sets the ID value for this TimeZones.
     * 
     * @param ID
     */
    public void setID(long ID) {
        this.ID = ID;
    }


    /**
     * Gets the timeZoneID value for this TimeZones.
     * 
     * @return timeZoneID
     */
    public java.lang.String getTimeZoneID() {
        return timeZoneID;
    }


    /**
     * Sets the timeZoneID value for this TimeZones.
     * 
     * @param timeZoneID
     */
    public void setTimeZoneID(java.lang.String timeZoneID) {
        this.timeZoneID = timeZoneID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeZones)) return false;
        TimeZones other = (TimeZones) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.ID == other.getID() &&
            ((this.timeZoneID==null && other.getTimeZoneID()==null) || 
             (this.timeZoneID!=null &&
              this.timeZoneID.equals(other.getTimeZoneID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += new Long(getID()).hashCode();
        if (getTimeZoneID() != null) {
            _hashCode += getTimeZoneID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeZones.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TimeZones"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneID");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TimeZoneID"));
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
