/**
 * AuthenticationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class AuthenticationResponse  implements java.io.Serializable {
    private boolean success;

    private java.lang.String message;

    private java.lang.String errorNo;

    private java.lang.String token;

    private java.lang.String customerName;

    private WebServices.com.GainCapital.www.AccountType accountType;

    private WebServices.com.GainCapital.www.ServiceEndPoint[] serviceEndPoints;

    private java.lang.String uniqueClientIdentifier;

    private WebServices.com.GainCapital.www.SystemDetails systemDetail;

    public AuthenticationResponse() {
    }

    public AuthenticationResponse(
           boolean success,
           java.lang.String message,
           java.lang.String errorNo,
           java.lang.String token,
           java.lang.String customerName,
           WebServices.com.GainCapital.www.AccountType accountType,
           WebServices.com.GainCapital.www.ServiceEndPoint[] serviceEndPoints,
           java.lang.String uniqueClientIdentifier,
           WebServices.com.GainCapital.www.SystemDetails systemDetail) {
           this.success = success;
           this.message = message;
           this.errorNo = errorNo;
           this.token = token;
           this.customerName = customerName;
           this.accountType = accountType;
           this.serviceEndPoints = serviceEndPoints;
           this.uniqueClientIdentifier = uniqueClientIdentifier;
           this.systemDetail = systemDetail;
    }


    /**
     * Gets the success value for this AuthenticationResponse.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this AuthenticationResponse.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }


    /**
     * Gets the message value for this AuthenticationResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this AuthenticationResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the errorNo value for this AuthenticationResponse.
     * 
     * @return errorNo
     */
    public java.lang.String getErrorNo() {
        return errorNo;
    }


    /**
     * Sets the errorNo value for this AuthenticationResponse.
     * 
     * @param errorNo
     */
    public void setErrorNo(java.lang.String errorNo) {
        this.errorNo = errorNo;
    }


    /**
     * Gets the token value for this AuthenticationResponse.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this AuthenticationResponse.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the customerName value for this AuthenticationResponse.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this AuthenticationResponse.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the accountType value for this AuthenticationResponse.
     * 
     * @return accountType
     */
    public WebServices.com.GainCapital.www.AccountType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this AuthenticationResponse.
     * 
     * @param accountType
     */
    public void setAccountType(WebServices.com.GainCapital.www.AccountType accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the serviceEndPoints value for this AuthenticationResponse.
     * 
     * @return serviceEndPoints
     */
    public WebServices.com.GainCapital.www.ServiceEndPoint[] getServiceEndPoints() {
        return serviceEndPoints;
    }


    /**
     * Sets the serviceEndPoints value for this AuthenticationResponse.
     * 
     * @param serviceEndPoints
     */
    public void setServiceEndPoints(WebServices.com.GainCapital.www.ServiceEndPoint[] serviceEndPoints) {
        this.serviceEndPoints = serviceEndPoints;
    }

    public WebServices.com.GainCapital.www.ServiceEndPoint getServiceEndPoints(int i) {
        return this.serviceEndPoints[i];
    }

    public void setServiceEndPoints(int i, WebServices.com.GainCapital.www.ServiceEndPoint _value) {
        this.serviceEndPoints[i] = _value;
    }


    /**
     * Gets the uniqueClientIdentifier value for this AuthenticationResponse.
     * 
     * @return uniqueClientIdentifier
     */
    public java.lang.String getUniqueClientIdentifier() {
        return uniqueClientIdentifier;
    }


    /**
     * Sets the uniqueClientIdentifier value for this AuthenticationResponse.
     * 
     * @param uniqueClientIdentifier
     */
    public void setUniqueClientIdentifier(java.lang.String uniqueClientIdentifier) {
        this.uniqueClientIdentifier = uniqueClientIdentifier;
    }


    /**
     * Gets the systemDetail value for this AuthenticationResponse.
     * 
     * @return systemDetail
     */
    public WebServices.com.GainCapital.www.SystemDetails getSystemDetail() {
        return systemDetail;
    }


    /**
     * Sets the systemDetail value for this AuthenticationResponse.
     * 
     * @param systemDetail
     */
    public void setSystemDetail(WebServices.com.GainCapital.www.SystemDetails systemDetail) {
        this.systemDetail = systemDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticationResponse)) return false;
        AuthenticationResponse other = (AuthenticationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.success == other.isSuccess() &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.errorNo==null && other.getErrorNo()==null) || 
             (this.errorNo!=null &&
              this.errorNo.equals(other.getErrorNo()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.serviceEndPoints==null && other.getServiceEndPoints()==null) || 
             (this.serviceEndPoints!=null &&
              java.util.Arrays.equals(this.serviceEndPoints, other.getServiceEndPoints()))) &&
            ((this.uniqueClientIdentifier==null && other.getUniqueClientIdentifier()==null) || 
             (this.uniqueClientIdentifier!=null &&
              this.uniqueClientIdentifier.equals(other.getUniqueClientIdentifier()))) &&
            ((this.systemDetail==null && other.getSystemDetail()==null) || 
             (this.systemDetail!=null &&
              this.systemDetail.equals(other.getSystemDetail())));
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
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getErrorNo() != null) {
            _hashCode += getErrorNo().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getServiceEndPoints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceEndPoints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceEndPoints(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUniqueClientIdentifier() != null) {
            _hashCode += getUniqueClientIdentifier().hashCode();
        }
        if (getSystemDetail() != null) {
            _hashCode += getSystemDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthenticationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "CustomerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceEndPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ServiceEndPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ServiceEndPoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueClientIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UniqueClientIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SystemDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SystemDetails"));
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
