/**
 * UserTimeZone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class UserTimeZone  implements java.io.Serializable {
    private java.lang.String userTimeZoneID;

    private java.lang.String timeZoneName;

    private java.lang.String timeZoneStandardName;

    private boolean isSupportDayLightSaving;

    private java.lang.String dayLightName;

    private java.lang.String easternToCustomerTimeZoneOffsetInMinutes;

    private java.lang.String customerToGMTTimeZoneOffsetInMinutes;

    public UserTimeZone() {
    }

    public UserTimeZone(
           java.lang.String userTimeZoneID,
           java.lang.String timeZoneName,
           java.lang.String timeZoneStandardName,
           boolean isSupportDayLightSaving,
           java.lang.String dayLightName,
           java.lang.String easternToCustomerTimeZoneOffsetInMinutes,
           java.lang.String customerToGMTTimeZoneOffsetInMinutes) {
           this.userTimeZoneID = userTimeZoneID;
           this.timeZoneName = timeZoneName;
           this.timeZoneStandardName = timeZoneStandardName;
           this.isSupportDayLightSaving = isSupportDayLightSaving;
           this.dayLightName = dayLightName;
           this.easternToCustomerTimeZoneOffsetInMinutes = easternToCustomerTimeZoneOffsetInMinutes;
           this.customerToGMTTimeZoneOffsetInMinutes = customerToGMTTimeZoneOffsetInMinutes;
    }


    /**
     * Gets the userTimeZoneID value for this UserTimeZone.
     * 
     * @return userTimeZoneID
     */
    public java.lang.String getUserTimeZoneID() {
        return userTimeZoneID;
    }


    /**
     * Sets the userTimeZoneID value for this UserTimeZone.
     * 
     * @param userTimeZoneID
     */
    public void setUserTimeZoneID(java.lang.String userTimeZoneID) {
        this.userTimeZoneID = userTimeZoneID;
    }


    /**
     * Gets the timeZoneName value for this UserTimeZone.
     * 
     * @return timeZoneName
     */
    public java.lang.String getTimeZoneName() {
        return timeZoneName;
    }


    /**
     * Sets the timeZoneName value for this UserTimeZone.
     * 
     * @param timeZoneName
     */
    public void setTimeZoneName(java.lang.String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }


    /**
     * Gets the timeZoneStandardName value for this UserTimeZone.
     * 
     * @return timeZoneStandardName
     */
    public java.lang.String getTimeZoneStandardName() {
        return timeZoneStandardName;
    }


    /**
     * Sets the timeZoneStandardName value for this UserTimeZone.
     * 
     * @param timeZoneStandardName
     */
    public void setTimeZoneStandardName(java.lang.String timeZoneStandardName) {
        this.timeZoneStandardName = timeZoneStandardName;
    }


    /**
     * Gets the isSupportDayLightSaving value for this UserTimeZone.
     * 
     * @return isSupportDayLightSaving
     */
    public boolean isIsSupportDayLightSaving() {
        return isSupportDayLightSaving;
    }


    /**
     * Sets the isSupportDayLightSaving value for this UserTimeZone.
     * 
     * @param isSupportDayLightSaving
     */
    public void setIsSupportDayLightSaving(boolean isSupportDayLightSaving) {
        this.isSupportDayLightSaving = isSupportDayLightSaving;
    }


    /**
     * Gets the dayLightName value for this UserTimeZone.
     * 
     * @return dayLightName
     */
    public java.lang.String getDayLightName() {
        return dayLightName;
    }


    /**
     * Sets the dayLightName value for this UserTimeZone.
     * 
     * @param dayLightName
     */
    public void setDayLightName(java.lang.String dayLightName) {
        this.dayLightName = dayLightName;
    }


    /**
     * Gets the easternToCustomerTimeZoneOffsetInMinutes value for this UserTimeZone.
     * 
     * @return easternToCustomerTimeZoneOffsetInMinutes
     */
    public java.lang.String getEasternToCustomerTimeZoneOffsetInMinutes() {
        return easternToCustomerTimeZoneOffsetInMinutes;
    }


    /**
     * Sets the easternToCustomerTimeZoneOffsetInMinutes value for this UserTimeZone.
     * 
     * @param easternToCustomerTimeZoneOffsetInMinutes
     */
    public void setEasternToCustomerTimeZoneOffsetInMinutes(java.lang.String easternToCustomerTimeZoneOffsetInMinutes) {
        this.easternToCustomerTimeZoneOffsetInMinutes = easternToCustomerTimeZoneOffsetInMinutes;
    }


    /**
     * Gets the customerToGMTTimeZoneOffsetInMinutes value for this UserTimeZone.
     * 
     * @return customerToGMTTimeZoneOffsetInMinutes
     */
    public java.lang.String getCustomerToGMTTimeZoneOffsetInMinutes() {
        return customerToGMTTimeZoneOffsetInMinutes;
    }


    /**
     * Sets the customerToGMTTimeZoneOffsetInMinutes value for this UserTimeZone.
     * 
     * @param customerToGMTTimeZoneOffsetInMinutes
     */
    public void setCustomerToGMTTimeZoneOffsetInMinutes(java.lang.String customerToGMTTimeZoneOffsetInMinutes) {
        this.customerToGMTTimeZoneOffsetInMinutes = customerToGMTTimeZoneOffsetInMinutes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserTimeZone)) return false;
        UserTimeZone other = (UserTimeZone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userTimeZoneID==null && other.getUserTimeZoneID()==null) || 
             (this.userTimeZoneID!=null &&
              this.userTimeZoneID.equals(other.getUserTimeZoneID()))) &&
            ((this.timeZoneName==null && other.getTimeZoneName()==null) || 
             (this.timeZoneName!=null &&
              this.timeZoneName.equals(other.getTimeZoneName()))) &&
            ((this.timeZoneStandardName==null && other.getTimeZoneStandardName()==null) || 
             (this.timeZoneStandardName!=null &&
              this.timeZoneStandardName.equals(other.getTimeZoneStandardName()))) &&
            this.isSupportDayLightSaving == other.isIsSupportDayLightSaving() &&
            ((this.dayLightName==null && other.getDayLightName()==null) || 
             (this.dayLightName!=null &&
              this.dayLightName.equals(other.getDayLightName()))) &&
            ((this.easternToCustomerTimeZoneOffsetInMinutes==null && other.getEasternToCustomerTimeZoneOffsetInMinutes()==null) || 
             (this.easternToCustomerTimeZoneOffsetInMinutes!=null &&
              this.easternToCustomerTimeZoneOffsetInMinutes.equals(other.getEasternToCustomerTimeZoneOffsetInMinutes()))) &&
            ((this.customerToGMTTimeZoneOffsetInMinutes==null && other.getCustomerToGMTTimeZoneOffsetInMinutes()==null) || 
             (this.customerToGMTTimeZoneOffsetInMinutes!=null &&
              this.customerToGMTTimeZoneOffsetInMinutes.equals(other.getCustomerToGMTTimeZoneOffsetInMinutes())));
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
        if (getUserTimeZoneID() != null) {
            _hashCode += getUserTimeZoneID().hashCode();
        }
        if (getTimeZoneName() != null) {
            _hashCode += getTimeZoneName().hashCode();
        }
        if (getTimeZoneStandardName() != null) {
            _hashCode += getTimeZoneStandardName().hashCode();
        }
        _hashCode += (isIsSupportDayLightSaving() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDayLightName() != null) {
            _hashCode += getDayLightName().hashCode();
        }
        if (getEasternToCustomerTimeZoneOffsetInMinutes() != null) {
            _hashCode += getEasternToCustomerTimeZoneOffsetInMinutes().hashCode();
        }
        if (getCustomerToGMTTimeZoneOffsetInMinutes() != null) {
            _hashCode += getCustomerToGMTTimeZoneOffsetInMinutes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserTimeZone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UserTimeZone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTimeZoneID");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UserTimeZoneID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneName");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TimeZoneName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneStandardName");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TimeZoneStandardName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSupportDayLightSaving");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "IsSupportDayLightSaving"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayLightName");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "DayLightName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("easternToCustomerTimeZoneOffsetInMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "EasternToCustomerTimeZoneOffsetInMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerToGMTTimeZoneOffsetInMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "CustomerToGMTTimeZoneOffsetInMinutes"));
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
