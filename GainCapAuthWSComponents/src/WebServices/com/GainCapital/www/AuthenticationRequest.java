/**
 * AuthenticationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class AuthenticationRequest  implements java.io.Serializable {
    private java.lang.String token;

    private java.lang.String userID;

    private java.lang.String password;

    private java.lang.String brandCode;

    private java.lang.String accountNumber;

    private java.lang.String tradingAccountID;

    private java.lang.String fromApplication;

    private java.lang.String toApplication;

    private WebServices.com.GainCapital.www.LoginRequestType requestType;

    private java.lang.String thirdPartyToken;

    public AuthenticationRequest() {
    }

    public AuthenticationRequest(
           java.lang.String token,
           java.lang.String userID,
           java.lang.String password,
           java.lang.String brandCode,
           java.lang.String accountNumber,
           java.lang.String tradingAccountID,
           java.lang.String fromApplication,
           java.lang.String toApplication,
           WebServices.com.GainCapital.www.LoginRequestType requestType,
           java.lang.String thirdPartyToken) {
           this.token = token;
           this.userID = userID;
           this.password = password;
           this.brandCode = brandCode;
           this.accountNumber = accountNumber;
           this.tradingAccountID = tradingAccountID;
           this.fromApplication = fromApplication;
           this.toApplication = toApplication;
           this.requestType = requestType;
           this.thirdPartyToken = thirdPartyToken;
    }


    /**
     * Gets the token value for this AuthenticationRequest.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this AuthenticationRequest.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the userID value for this AuthenticationRequest.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this AuthenticationRequest.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }


    /**
     * Gets the password value for this AuthenticationRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this AuthenticationRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the brandCode value for this AuthenticationRequest.
     * 
     * @return brandCode
     */
    public java.lang.String getBrandCode() {
        return brandCode;
    }


    /**
     * Sets the brandCode value for this AuthenticationRequest.
     * 
     * @param brandCode
     */
    public void setBrandCode(java.lang.String brandCode) {
        this.brandCode = brandCode;
    }


    /**
     * Gets the accountNumber value for this AuthenticationRequest.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this AuthenticationRequest.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the tradingAccountID value for this AuthenticationRequest.
     * 
     * @return tradingAccountID
     */
    public java.lang.String getTradingAccountID() {
        return tradingAccountID;
    }


    /**
     * Sets the tradingAccountID value for this AuthenticationRequest.
     * 
     * @param tradingAccountID
     */
    public void setTradingAccountID(java.lang.String tradingAccountID) {
        this.tradingAccountID = tradingAccountID;
    }


    /**
     * Gets the fromApplication value for this AuthenticationRequest.
     * 
     * @return fromApplication
     */
    public java.lang.String getFromApplication() {
        return fromApplication;
    }


    /**
     * Sets the fromApplication value for this AuthenticationRequest.
     * 
     * @param fromApplication
     */
    public void setFromApplication(java.lang.String fromApplication) {
        this.fromApplication = fromApplication;
    }


    /**
     * Gets the toApplication value for this AuthenticationRequest.
     * 
     * @return toApplication
     */
    public java.lang.String getToApplication() {
        return toApplication;
    }


    /**
     * Sets the toApplication value for this AuthenticationRequest.
     * 
     * @param toApplication
     */
    public void setToApplication(java.lang.String toApplication) {
        this.toApplication = toApplication;
    }


    /**
     * Gets the requestType value for this AuthenticationRequest.
     * 
     * @return requestType
     */
    public WebServices.com.GainCapital.www.LoginRequestType getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this AuthenticationRequest.
     * 
     * @param requestType
     */
    public void setRequestType(WebServices.com.GainCapital.www.LoginRequestType requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the thirdPartyToken value for this AuthenticationRequest.
     * 
     * @return thirdPartyToken
     */
    public java.lang.String getThirdPartyToken() {
        return thirdPartyToken;
    }


    /**
     * Sets the thirdPartyToken value for this AuthenticationRequest.
     * 
     * @param thirdPartyToken
     */
    public void setThirdPartyToken(java.lang.String thirdPartyToken) {
        this.thirdPartyToken = thirdPartyToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticationRequest)) return false;
        AuthenticationRequest other = (AuthenticationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.brandCode==null && other.getBrandCode()==null) || 
             (this.brandCode!=null &&
              this.brandCode.equals(other.getBrandCode()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.tradingAccountID==null && other.getTradingAccountID()==null) || 
             (this.tradingAccountID!=null &&
              this.tradingAccountID.equals(other.getTradingAccountID()))) &&
            ((this.fromApplication==null && other.getFromApplication()==null) || 
             (this.fromApplication!=null &&
              this.fromApplication.equals(other.getFromApplication()))) &&
            ((this.toApplication==null && other.getToApplication()==null) || 
             (this.toApplication!=null &&
              this.toApplication.equals(other.getToApplication()))) &&
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType()))) &&
            ((this.thirdPartyToken==null && other.getThirdPartyToken()==null) || 
             (this.thirdPartyToken!=null &&
              this.thirdPartyToken.equals(other.getThirdPartyToken())));
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
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getBrandCode() != null) {
            _hashCode += getBrandCode().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getTradingAccountID() != null) {
            _hashCode += getTradingAccountID().hashCode();
        }
        if (getFromApplication() != null) {
            _hashCode += getFromApplication().hashCode();
        }
        if (getToApplication() != null) {
            _hashCode += getToApplication().hashCode();
        }
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        if (getThirdPartyToken() != null) {
            _hashCode += getThirdPartyToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthenticationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandCode");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BrandCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradingAccountID");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TradingAccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromApplication");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "FromApplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toApplication");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ToApplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "RequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "LoginRequestType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyToken");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ThirdPartyToken"));
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
