/**
 * AuthenticationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class AuthenticationResult  implements java.io.Serializable {
    private boolean success;

    private java.lang.String errorNo;

    private java.lang.String token;

    private java.lang.String customerName;

    private java.lang.String configurationService;

    private java.lang.String tradingService;

    private java.lang.String chartingService;

    private java.lang.String researchService;

    private java.lang.String profileService;

    private java.lang.String reportService;

    private boolean isMETA;

    private java.lang.String metaServerName;

    private java.lang.String metaAccountNumber;

    private java.lang.String METAService;

    private java.lang.String alertService;

    private java.lang.String uniqueClientIdentifier;

    public AuthenticationResult() {
    }

    public AuthenticationResult(
           boolean success,
           java.lang.String errorNo,
           java.lang.String token,
           java.lang.String customerName,
           java.lang.String configurationService,
           java.lang.String tradingService,
           java.lang.String chartingService,
           java.lang.String researchService,
           java.lang.String profileService,
           java.lang.String reportService,
           boolean isMETA,
           java.lang.String metaServerName,
           java.lang.String metaAccountNumber,
           java.lang.String METAService,
           java.lang.String alertService,
           java.lang.String uniqueClientIdentifier) {
           this.success = success;
           this.errorNo = errorNo;
           this.token = token;
           this.customerName = customerName;
           this.configurationService = configurationService;
           this.tradingService = tradingService;
           this.chartingService = chartingService;
           this.researchService = researchService;
           this.profileService = profileService;
           this.reportService = reportService;
           this.isMETA = isMETA;
           this.metaServerName = metaServerName;
           this.metaAccountNumber = metaAccountNumber;
           this.METAService = METAService;
           this.alertService = alertService;
           this.uniqueClientIdentifier = uniqueClientIdentifier;
    }


    /**
     * Gets the success value for this AuthenticationResult.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this AuthenticationResult.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }


    /**
     * Gets the errorNo value for this AuthenticationResult.
     * 
     * @return errorNo
     */
    public java.lang.String getErrorNo() {
        return errorNo;
    }


    /**
     * Sets the errorNo value for this AuthenticationResult.
     * 
     * @param errorNo
     */
    public void setErrorNo(java.lang.String errorNo) {
        this.errorNo = errorNo;
    }


    /**
     * Gets the token value for this AuthenticationResult.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this AuthenticationResult.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the customerName value for this AuthenticationResult.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this AuthenticationResult.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the configurationService value for this AuthenticationResult.
     * 
     * @return configurationService
     */
    public java.lang.String getConfigurationService() {
        return configurationService;
    }


    /**
     * Sets the configurationService value for this AuthenticationResult.
     * 
     * @param configurationService
     */
    public void setConfigurationService(java.lang.String configurationService) {
        this.configurationService = configurationService;
    }


    /**
     * Gets the tradingService value for this AuthenticationResult.
     * 
     * @return tradingService
     */
    public java.lang.String getTradingService() {
        return tradingService;
    }


    /**
     * Sets the tradingService value for this AuthenticationResult.
     * 
     * @param tradingService
     */
    public void setTradingService(java.lang.String tradingService) {
        this.tradingService = tradingService;
    }


    /**
     * Gets the chartingService value for this AuthenticationResult.
     * 
     * @return chartingService
     */
    public java.lang.String getChartingService() {
        return chartingService;
    }


    /**
     * Sets the chartingService value for this AuthenticationResult.
     * 
     * @param chartingService
     */
    public void setChartingService(java.lang.String chartingService) {
        this.chartingService = chartingService;
    }


    /**
     * Gets the researchService value for this AuthenticationResult.
     * 
     * @return researchService
     */
    public java.lang.String getResearchService() {
        return researchService;
    }


    /**
     * Sets the researchService value for this AuthenticationResult.
     * 
     * @param researchService
     */
    public void setResearchService(java.lang.String researchService) {
        this.researchService = researchService;
    }


    /**
     * Gets the profileService value for this AuthenticationResult.
     * 
     * @return profileService
     */
    public java.lang.String getProfileService() {
        return profileService;
    }


    /**
     * Sets the profileService value for this AuthenticationResult.
     * 
     * @param profileService
     */
    public void setProfileService(java.lang.String profileService) {
        this.profileService = profileService;
    }


    /**
     * Gets the reportService value for this AuthenticationResult.
     * 
     * @return reportService
     */
    public java.lang.String getReportService() {
        return reportService;
    }


    /**
     * Sets the reportService value for this AuthenticationResult.
     * 
     * @param reportService
     */
    public void setReportService(java.lang.String reportService) {
        this.reportService = reportService;
    }


    /**
     * Gets the isMETA value for this AuthenticationResult.
     * 
     * @return isMETA
     */
    public boolean isIsMETA() {
        return isMETA;
    }


    /**
     * Sets the isMETA value for this AuthenticationResult.
     * 
     * @param isMETA
     */
    public void setIsMETA(boolean isMETA) {
        this.isMETA = isMETA;
    }


    /**
     * Gets the metaServerName value for this AuthenticationResult.
     * 
     * @return metaServerName
     */
    public java.lang.String getMetaServerName() {
        return metaServerName;
    }


    /**
     * Sets the metaServerName value for this AuthenticationResult.
     * 
     * @param metaServerName
     */
    public void setMetaServerName(java.lang.String metaServerName) {
        this.metaServerName = metaServerName;
    }


    /**
     * Gets the metaAccountNumber value for this AuthenticationResult.
     * 
     * @return metaAccountNumber
     */
    public java.lang.String getMetaAccountNumber() {
        return metaAccountNumber;
    }


    /**
     * Sets the metaAccountNumber value for this AuthenticationResult.
     * 
     * @param metaAccountNumber
     */
    public void setMetaAccountNumber(java.lang.String metaAccountNumber) {
        this.metaAccountNumber = metaAccountNumber;
    }


    /**
     * Gets the METAService value for this AuthenticationResult.
     * 
     * @return METAService
     */
    public java.lang.String getMETAService() {
        return METAService;
    }


    /**
     * Sets the METAService value for this AuthenticationResult.
     * 
     * @param METAService
     */
    public void setMETAService(java.lang.String METAService) {
        this.METAService = METAService;
    }


    /**
     * Gets the alertService value for this AuthenticationResult.
     * 
     * @return alertService
     */
    public java.lang.String getAlertService() {
        return alertService;
    }


    /**
     * Sets the alertService value for this AuthenticationResult.
     * 
     * @param alertService
     */
    public void setAlertService(java.lang.String alertService) {
        this.alertService = alertService;
    }


    /**
     * Gets the uniqueClientIdentifier value for this AuthenticationResult.
     * 
     * @return uniqueClientIdentifier
     */
    public java.lang.String getUniqueClientIdentifier() {
        return uniqueClientIdentifier;
    }


    /**
     * Sets the uniqueClientIdentifier value for this AuthenticationResult.
     * 
     * @param uniqueClientIdentifier
     */
    public void setUniqueClientIdentifier(java.lang.String uniqueClientIdentifier) {
        this.uniqueClientIdentifier = uniqueClientIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticationResult)) return false;
        AuthenticationResult other = (AuthenticationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.success == other.isSuccess() &&
            ((this.errorNo==null && other.getErrorNo()==null) || 
             (this.errorNo!=null &&
              this.errorNo.equals(other.getErrorNo()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.configurationService==null && other.getConfigurationService()==null) || 
             (this.configurationService!=null &&
              this.configurationService.equals(other.getConfigurationService()))) &&
            ((this.tradingService==null && other.getTradingService()==null) || 
             (this.tradingService!=null &&
              this.tradingService.equals(other.getTradingService()))) &&
            ((this.chartingService==null && other.getChartingService()==null) || 
             (this.chartingService!=null &&
              this.chartingService.equals(other.getChartingService()))) &&
            ((this.researchService==null && other.getResearchService()==null) || 
             (this.researchService!=null &&
              this.researchService.equals(other.getResearchService()))) &&
            ((this.profileService==null && other.getProfileService()==null) || 
             (this.profileService!=null &&
              this.profileService.equals(other.getProfileService()))) &&
            ((this.reportService==null && other.getReportService()==null) || 
             (this.reportService!=null &&
              this.reportService.equals(other.getReportService()))) &&
            this.isMETA == other.isIsMETA() &&
            ((this.metaServerName==null && other.getMetaServerName()==null) || 
             (this.metaServerName!=null &&
              this.metaServerName.equals(other.getMetaServerName()))) &&
            ((this.metaAccountNumber==null && other.getMetaAccountNumber()==null) || 
             (this.metaAccountNumber!=null &&
              this.metaAccountNumber.equals(other.getMetaAccountNumber()))) &&
            ((this.METAService==null && other.getMETAService()==null) || 
             (this.METAService!=null &&
              this.METAService.equals(other.getMETAService()))) &&
            ((this.alertService==null && other.getAlertService()==null) || 
             (this.alertService!=null &&
              this.alertService.equals(other.getAlertService()))) &&
            ((this.uniqueClientIdentifier==null && other.getUniqueClientIdentifier()==null) || 
             (this.uniqueClientIdentifier!=null &&
              this.uniqueClientIdentifier.equals(other.getUniqueClientIdentifier())));
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
        if (getErrorNo() != null) {
            _hashCode += getErrorNo().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getConfigurationService() != null) {
            _hashCode += getConfigurationService().hashCode();
        }
        if (getTradingService() != null) {
            _hashCode += getTradingService().hashCode();
        }
        if (getChartingService() != null) {
            _hashCode += getChartingService().hashCode();
        }
        if (getResearchService() != null) {
            _hashCode += getResearchService().hashCode();
        }
        if (getProfileService() != null) {
            _hashCode += getProfileService().hashCode();
        }
        if (getReportService() != null) {
            _hashCode += getReportService().hashCode();
        }
        _hashCode += (isIsMETA() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMetaServerName() != null) {
            _hashCode += getMetaServerName().hashCode();
        }
        if (getMetaAccountNumber() != null) {
            _hashCode += getMetaAccountNumber().hashCode();
        }
        if (getMETAService() != null) {
            _hashCode += getMETAService().hashCode();
        }
        if (getAlertService() != null) {
            _hashCode += getAlertService().hashCode();
        }
        if (getUniqueClientIdentifier() != null) {
            _hashCode += getUniqueClientIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthenticationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "success"));
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
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "token"));
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
        elemField.setFieldName("configurationService");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "configurationService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradingService");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "tradingService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chartingService");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "chartingService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("researchService");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "researchService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileService");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "profileService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportService");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "reportService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMETA");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "IsMETA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaServerName");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "MetaServerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "MetaAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("METAService");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "METAService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertService");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AlertService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueClientIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UniqueClientIdentifier"));
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
