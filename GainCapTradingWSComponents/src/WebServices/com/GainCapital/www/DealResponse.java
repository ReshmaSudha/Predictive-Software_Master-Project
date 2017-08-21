/**
 * DealResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class DealResponse  implements java.io.Serializable {
    private java.lang.String product;

    private java.lang.String buySell;

    private java.lang.String amount;

    private java.lang.String rate;

    private java.lang.String dealId;

    private java.lang.String errorNo;

    private java.lang.String dealDate;

    private java.lang.String bankConfirmation;

    private java.lang.String message;

    private boolean success;

    private boolean isClosePosition;

    private double outgoingMarginPositionInUSD;

    private double hedgeSplitFactor;

    private double outgoingMarginPosted;

    private int dealProcessingTime;

    private double outgoingMarginPostedInCcy;

    private double outgoingMarginRealized;

    private double outgoingMarginRealizedInBase;

    private double outgoingMarginRealizedInCcy;

    private double outgoingPositionCcy;

    private double outgoingPosition;

    private double outgoingPositionUSDValue;

    private double outgoingPositionAverageRate;

    private int hedging;

    private long pointAndShootDealID;

    private java.lang.String positionAction;

    private java.lang.String uniqueSocketID;

    public DealResponse() {
    }

    public DealResponse(
           java.lang.String product,
           java.lang.String buySell,
           java.lang.String amount,
           java.lang.String rate,
           java.lang.String dealId,
           java.lang.String errorNo,
           java.lang.String dealDate,
           java.lang.String bankConfirmation,
           java.lang.String message,
           boolean success,
           boolean isClosePosition,
           double outgoingMarginPositionInUSD,
           double hedgeSplitFactor,
           double outgoingMarginPosted,
           int dealProcessingTime,
           double outgoingMarginPostedInCcy,
           double outgoingMarginRealized,
           double outgoingMarginRealizedInBase,
           double outgoingMarginRealizedInCcy,
           double outgoingPositionCcy,
           double outgoingPosition,
           double outgoingPositionUSDValue,
           double outgoingPositionAverageRate,
           int hedging,
           long pointAndShootDealID,
           java.lang.String positionAction,
           java.lang.String uniqueSocketID) {
           this.product = product;
           this.buySell = buySell;
           this.amount = amount;
           this.rate = rate;
           this.dealId = dealId;
           this.errorNo = errorNo;
           this.dealDate = dealDate;
           this.bankConfirmation = bankConfirmation;
           this.message = message;
           this.success = success;
           this.isClosePosition = isClosePosition;
           this.outgoingMarginPositionInUSD = outgoingMarginPositionInUSD;
           this.hedgeSplitFactor = hedgeSplitFactor;
           this.outgoingMarginPosted = outgoingMarginPosted;
           this.dealProcessingTime = dealProcessingTime;
           this.outgoingMarginPostedInCcy = outgoingMarginPostedInCcy;
           this.outgoingMarginRealized = outgoingMarginRealized;
           this.outgoingMarginRealizedInBase = outgoingMarginRealizedInBase;
           this.outgoingMarginRealizedInCcy = outgoingMarginRealizedInCcy;
           this.outgoingPositionCcy = outgoingPositionCcy;
           this.outgoingPosition = outgoingPosition;
           this.outgoingPositionUSDValue = outgoingPositionUSDValue;
           this.outgoingPositionAverageRate = outgoingPositionAverageRate;
           this.hedging = hedging;
           this.pointAndShootDealID = pointAndShootDealID;
           this.positionAction = positionAction;
           this.uniqueSocketID = uniqueSocketID;
    }


    /**
     * Gets the product value for this DealResponse.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this DealResponse.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the buySell value for this DealResponse.
     * 
     * @return buySell
     */
    public java.lang.String getBuySell() {
        return buySell;
    }


    /**
     * Sets the buySell value for this DealResponse.
     * 
     * @param buySell
     */
    public void setBuySell(java.lang.String buySell) {
        this.buySell = buySell;
    }


    /**
     * Gets the amount value for this DealResponse.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DealResponse.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the rate value for this DealResponse.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this DealResponse.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the dealId value for this DealResponse.
     * 
     * @return dealId
     */
    public java.lang.String getDealId() {
        return dealId;
    }


    /**
     * Sets the dealId value for this DealResponse.
     * 
     * @param dealId
     */
    public void setDealId(java.lang.String dealId) {
        this.dealId = dealId;
    }


    /**
     * Gets the errorNo value for this DealResponse.
     * 
     * @return errorNo
     */
    public java.lang.String getErrorNo() {
        return errorNo;
    }


    /**
     * Sets the errorNo value for this DealResponse.
     * 
     * @param errorNo
     */
    public void setErrorNo(java.lang.String errorNo) {
        this.errorNo = errorNo;
    }


    /**
     * Gets the dealDate value for this DealResponse.
     * 
     * @return dealDate
     */
    public java.lang.String getDealDate() {
        return dealDate;
    }


    /**
     * Sets the dealDate value for this DealResponse.
     * 
     * @param dealDate
     */
    public void setDealDate(java.lang.String dealDate) {
        this.dealDate = dealDate;
    }


    /**
     * Gets the bankConfirmation value for this DealResponse.
     * 
     * @return bankConfirmation
     */
    public java.lang.String getBankConfirmation() {
        return bankConfirmation;
    }


    /**
     * Sets the bankConfirmation value for this DealResponse.
     * 
     * @param bankConfirmation
     */
    public void setBankConfirmation(java.lang.String bankConfirmation) {
        this.bankConfirmation = bankConfirmation;
    }


    /**
     * Gets the message value for this DealResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this DealResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the success value for this DealResponse.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this DealResponse.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }


    /**
     * Gets the isClosePosition value for this DealResponse.
     * 
     * @return isClosePosition
     */
    public boolean isIsClosePosition() {
        return isClosePosition;
    }


    /**
     * Sets the isClosePosition value for this DealResponse.
     * 
     * @param isClosePosition
     */
    public void setIsClosePosition(boolean isClosePosition) {
        this.isClosePosition = isClosePosition;
    }


    /**
     * Gets the outgoingMarginPositionInUSD value for this DealResponse.
     * 
     * @return outgoingMarginPositionInUSD
     */
    public double getOutgoingMarginPositionInUSD() {
        return outgoingMarginPositionInUSD;
    }


    /**
     * Sets the outgoingMarginPositionInUSD value for this DealResponse.
     * 
     * @param outgoingMarginPositionInUSD
     */
    public void setOutgoingMarginPositionInUSD(double outgoingMarginPositionInUSD) {
        this.outgoingMarginPositionInUSD = outgoingMarginPositionInUSD;
    }


    /**
     * Gets the hedgeSplitFactor value for this DealResponse.
     * 
     * @return hedgeSplitFactor
     */
    public double getHedgeSplitFactor() {
        return hedgeSplitFactor;
    }


    /**
     * Sets the hedgeSplitFactor value for this DealResponse.
     * 
     * @param hedgeSplitFactor
     */
    public void setHedgeSplitFactor(double hedgeSplitFactor) {
        this.hedgeSplitFactor = hedgeSplitFactor;
    }


    /**
     * Gets the outgoingMarginPosted value for this DealResponse.
     * 
     * @return outgoingMarginPosted
     */
    public double getOutgoingMarginPosted() {
        return outgoingMarginPosted;
    }


    /**
     * Sets the outgoingMarginPosted value for this DealResponse.
     * 
     * @param outgoingMarginPosted
     */
    public void setOutgoingMarginPosted(double outgoingMarginPosted) {
        this.outgoingMarginPosted = outgoingMarginPosted;
    }


    /**
     * Gets the dealProcessingTime value for this DealResponse.
     * 
     * @return dealProcessingTime
     */
    public int getDealProcessingTime() {
        return dealProcessingTime;
    }


    /**
     * Sets the dealProcessingTime value for this DealResponse.
     * 
     * @param dealProcessingTime
     */
    public void setDealProcessingTime(int dealProcessingTime) {
        this.dealProcessingTime = dealProcessingTime;
    }


    /**
     * Gets the outgoingMarginPostedInCcy value for this DealResponse.
     * 
     * @return outgoingMarginPostedInCcy
     */
    public double getOutgoingMarginPostedInCcy() {
        return outgoingMarginPostedInCcy;
    }


    /**
     * Sets the outgoingMarginPostedInCcy value for this DealResponse.
     * 
     * @param outgoingMarginPostedInCcy
     */
    public void setOutgoingMarginPostedInCcy(double outgoingMarginPostedInCcy) {
        this.outgoingMarginPostedInCcy = outgoingMarginPostedInCcy;
    }


    /**
     * Gets the outgoingMarginRealized value for this DealResponse.
     * 
     * @return outgoingMarginRealized
     */
    public double getOutgoingMarginRealized() {
        return outgoingMarginRealized;
    }


    /**
     * Sets the outgoingMarginRealized value for this DealResponse.
     * 
     * @param outgoingMarginRealized
     */
    public void setOutgoingMarginRealized(double outgoingMarginRealized) {
        this.outgoingMarginRealized = outgoingMarginRealized;
    }


    /**
     * Gets the outgoingMarginRealizedInBase value for this DealResponse.
     * 
     * @return outgoingMarginRealizedInBase
     */
    public double getOutgoingMarginRealizedInBase() {
        return outgoingMarginRealizedInBase;
    }


    /**
     * Sets the outgoingMarginRealizedInBase value for this DealResponse.
     * 
     * @param outgoingMarginRealizedInBase
     */
    public void setOutgoingMarginRealizedInBase(double outgoingMarginRealizedInBase) {
        this.outgoingMarginRealizedInBase = outgoingMarginRealizedInBase;
    }


    /**
     * Gets the outgoingMarginRealizedInCcy value for this DealResponse.
     * 
     * @return outgoingMarginRealizedInCcy
     */
    public double getOutgoingMarginRealizedInCcy() {
        return outgoingMarginRealizedInCcy;
    }


    /**
     * Sets the outgoingMarginRealizedInCcy value for this DealResponse.
     * 
     * @param outgoingMarginRealizedInCcy
     */
    public void setOutgoingMarginRealizedInCcy(double outgoingMarginRealizedInCcy) {
        this.outgoingMarginRealizedInCcy = outgoingMarginRealizedInCcy;
    }


    /**
     * Gets the outgoingPositionCcy value for this DealResponse.
     * 
     * @return outgoingPositionCcy
     */
    public double getOutgoingPositionCcy() {
        return outgoingPositionCcy;
    }


    /**
     * Sets the outgoingPositionCcy value for this DealResponse.
     * 
     * @param outgoingPositionCcy
     */
    public void setOutgoingPositionCcy(double outgoingPositionCcy) {
        this.outgoingPositionCcy = outgoingPositionCcy;
    }


    /**
     * Gets the outgoingPosition value for this DealResponse.
     * 
     * @return outgoingPosition
     */
    public double getOutgoingPosition() {
        return outgoingPosition;
    }


    /**
     * Sets the outgoingPosition value for this DealResponse.
     * 
     * @param outgoingPosition
     */
    public void setOutgoingPosition(double outgoingPosition) {
        this.outgoingPosition = outgoingPosition;
    }


    /**
     * Gets the outgoingPositionUSDValue value for this DealResponse.
     * 
     * @return outgoingPositionUSDValue
     */
    public double getOutgoingPositionUSDValue() {
        return outgoingPositionUSDValue;
    }


    /**
     * Sets the outgoingPositionUSDValue value for this DealResponse.
     * 
     * @param outgoingPositionUSDValue
     */
    public void setOutgoingPositionUSDValue(double outgoingPositionUSDValue) {
        this.outgoingPositionUSDValue = outgoingPositionUSDValue;
    }


    /**
     * Gets the outgoingPositionAverageRate value for this DealResponse.
     * 
     * @return outgoingPositionAverageRate
     */
    public double getOutgoingPositionAverageRate() {
        return outgoingPositionAverageRate;
    }


    /**
     * Sets the outgoingPositionAverageRate value for this DealResponse.
     * 
     * @param outgoingPositionAverageRate
     */
    public void setOutgoingPositionAverageRate(double outgoingPositionAverageRate) {
        this.outgoingPositionAverageRate = outgoingPositionAverageRate;
    }


    /**
     * Gets the hedging value for this DealResponse.
     * 
     * @return hedging
     */
    public int getHedging() {
        return hedging;
    }


    /**
     * Sets the hedging value for this DealResponse.
     * 
     * @param hedging
     */
    public void setHedging(int hedging) {
        this.hedging = hedging;
    }


    /**
     * Gets the pointAndShootDealID value for this DealResponse.
     * 
     * @return pointAndShootDealID
     */
    public long getPointAndShootDealID() {
        return pointAndShootDealID;
    }


    /**
     * Sets the pointAndShootDealID value for this DealResponse.
     * 
     * @param pointAndShootDealID
     */
    public void setPointAndShootDealID(long pointAndShootDealID) {
        this.pointAndShootDealID = pointAndShootDealID;
    }


    /**
     * Gets the positionAction value for this DealResponse.
     * 
     * @return positionAction
     */
    public java.lang.String getPositionAction() {
        return positionAction;
    }


    /**
     * Sets the positionAction value for this DealResponse.
     * 
     * @param positionAction
     */
    public void setPositionAction(java.lang.String positionAction) {
        this.positionAction = positionAction;
    }


    /**
     * Gets the uniqueSocketID value for this DealResponse.
     * 
     * @return uniqueSocketID
     */
    public java.lang.String getUniqueSocketID() {
        return uniqueSocketID;
    }


    /**
     * Sets the uniqueSocketID value for this DealResponse.
     * 
     * @param uniqueSocketID
     */
    public void setUniqueSocketID(java.lang.String uniqueSocketID) {
        this.uniqueSocketID = uniqueSocketID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DealResponse)) return false;
        DealResponse other = (DealResponse) obj;
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
            ((this.buySell==null && other.getBuySell()==null) || 
             (this.buySell!=null &&
              this.buySell.equals(other.getBuySell()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.dealId==null && other.getDealId()==null) || 
             (this.dealId!=null &&
              this.dealId.equals(other.getDealId()))) &&
            ((this.errorNo==null && other.getErrorNo()==null) || 
             (this.errorNo!=null &&
              this.errorNo.equals(other.getErrorNo()))) &&
            ((this.dealDate==null && other.getDealDate()==null) || 
             (this.dealDate!=null &&
              this.dealDate.equals(other.getDealDate()))) &&
            ((this.bankConfirmation==null && other.getBankConfirmation()==null) || 
             (this.bankConfirmation!=null &&
              this.bankConfirmation.equals(other.getBankConfirmation()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            this.success == other.isSuccess() &&
            this.isClosePosition == other.isIsClosePosition() &&
            this.outgoingMarginPositionInUSD == other.getOutgoingMarginPositionInUSD() &&
            this.hedgeSplitFactor == other.getHedgeSplitFactor() &&
            this.outgoingMarginPosted == other.getOutgoingMarginPosted() &&
            this.dealProcessingTime == other.getDealProcessingTime() &&
            this.outgoingMarginPostedInCcy == other.getOutgoingMarginPostedInCcy() &&
            this.outgoingMarginRealized == other.getOutgoingMarginRealized() &&
            this.outgoingMarginRealizedInBase == other.getOutgoingMarginRealizedInBase() &&
            this.outgoingMarginRealizedInCcy == other.getOutgoingMarginRealizedInCcy() &&
            this.outgoingPositionCcy == other.getOutgoingPositionCcy() &&
            this.outgoingPosition == other.getOutgoingPosition() &&
            this.outgoingPositionUSDValue == other.getOutgoingPositionUSDValue() &&
            this.outgoingPositionAverageRate == other.getOutgoingPositionAverageRate() &&
            this.hedging == other.getHedging() &&
            this.pointAndShootDealID == other.getPointAndShootDealID() &&
            ((this.positionAction==null && other.getPositionAction()==null) || 
             (this.positionAction!=null &&
              this.positionAction.equals(other.getPositionAction()))) &&
            ((this.uniqueSocketID==null && other.getUniqueSocketID()==null) || 
             (this.uniqueSocketID!=null &&
              this.uniqueSocketID.equals(other.getUniqueSocketID())));
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
        if (getBuySell() != null) {
            _hashCode += getBuySell().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getDealId() != null) {
            _hashCode += getDealId().hashCode();
        }
        if (getErrorNo() != null) {
            _hashCode += getErrorNo().hashCode();
        }
        if (getDealDate() != null) {
            _hashCode += getDealDate().hashCode();
        }
        if (getBankConfirmation() != null) {
            _hashCode += getBankConfirmation().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsClosePosition() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getOutgoingMarginPositionInUSD()).hashCode();
        _hashCode += new Double(getHedgeSplitFactor()).hashCode();
        _hashCode += new Double(getOutgoingMarginPosted()).hashCode();
        _hashCode += getDealProcessingTime();
        _hashCode += new Double(getOutgoingMarginPostedInCcy()).hashCode();
        _hashCode += new Double(getOutgoingMarginRealized()).hashCode();
        _hashCode += new Double(getOutgoingMarginRealizedInBase()).hashCode();
        _hashCode += new Double(getOutgoingMarginRealizedInCcy()).hashCode();
        _hashCode += new Double(getOutgoingPositionCcy()).hashCode();
        _hashCode += new Double(getOutgoingPosition()).hashCode();
        _hashCode += new Double(getOutgoingPositionUSDValue()).hashCode();
        _hashCode += new Double(getOutgoingPositionAverageRate()).hashCode();
        _hashCode += getHedging();
        _hashCode += new Long(getPointAndShootDealID()).hashCode();
        if (getPositionAction() != null) {
            _hashCode += getPositionAction().hashCode();
        }
        if (getUniqueSocketID() != null) {
            _hashCode += getUniqueSocketID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DealResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "DealResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buySell");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "buySell"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealId");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "dealId"));
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
        elemField.setFieldName("dealDate");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "dealDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankConfirmation");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "bankConfirmation"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isClosePosition");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "IsClosePosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outgoingMarginPositionInUSD");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OutgoingMarginPositionInUSD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hedgeSplitFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "HedgeSplitFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outgoingMarginPosted");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OutgoingMarginPosted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealProcessingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "DealProcessingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outgoingMarginPostedInCcy");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OutgoingMarginPostedInCcy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outgoingMarginRealized");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OutgoingMarginRealized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outgoingMarginRealizedInBase");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OutgoingMarginRealizedInBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outgoingMarginRealizedInCcy");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OutgoingMarginRealizedInCcy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outgoingPositionCcy");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OutgoingPositionCcy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outgoingPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OutgoingPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outgoingPositionUSDValue");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OutgoingPositionUSDValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outgoingPositionAverageRate");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OutgoingPositionAverageRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hedging");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Hedging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointAndShootDealID");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "PointAndShootDealID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positionAction");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "PositionAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueSocketID");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UniqueSocketID"));
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
