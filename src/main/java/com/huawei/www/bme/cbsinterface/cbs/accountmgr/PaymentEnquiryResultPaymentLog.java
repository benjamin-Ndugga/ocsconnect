/**
 * PaymentEnquiryResultPaymentLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class PaymentEnquiryResultPaymentLog  implements java.io.Serializable {
    private java.lang.String logID;

    private java.lang.String internalSerialNo;

    private java.lang.String subscriberNo;

    private java.lang.Integer subCosID;

    private java.lang.String tradeTime;

    private java.lang.String errorType;

    private java.lang.String paymentMode;

    private java.lang.String oldActiveStop;

    private java.lang.String newActiveStop;

    private java.lang.String oldSuspendStop;

    private java.lang.String newSuspendStop;

    private java.lang.String oldDisableStop;

    private java.lang.String newDisableStop;

    private java.lang.Long oldBalance;

    private java.lang.Long newBalance;

    private java.lang.Long paymentAmt;

    private java.lang.String currency;

    private java.lang.Integer validity;

    private int prmValidity;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.PaymentEnquiryResultPaymentLogPaymentBonus[] paymentBonus;

    private java.lang.Integer canceledFlag;

    private java.lang.String cancelLogID;

    private java.lang.String additiontalInfo;

    private java.lang.String operatorID;

    private java.lang.Integer paymentTax;

    private java.lang.Integer paymentPenalty;

    private java.lang.String operationDes;

    private java.lang.String bankCode;

    private java.lang.Long oldPOSBalance;

    private java.lang.Long newPOSBalance;

    private java.lang.Integer location;

    private java.lang.String agentName;

    private java.lang.String batchNo;

    private java.lang.String sequence;

    private java.lang.Integer loan;

    private java.lang.Integer poundage;

    public PaymentEnquiryResultPaymentLog() {
    }

    public PaymentEnquiryResultPaymentLog(
           java.lang.String logID,
           java.lang.String internalSerialNo,
           java.lang.String subscriberNo,
           java.lang.Integer subCosID,
           java.lang.String tradeTime,
           java.lang.String errorType,
           java.lang.String paymentMode,
           java.lang.String oldActiveStop,
           java.lang.String newActiveStop,
           java.lang.String oldSuspendStop,
           java.lang.String newSuspendStop,
           java.lang.String oldDisableStop,
           java.lang.String newDisableStop,
           java.lang.Long oldBalance,
           java.lang.Long newBalance,
           java.lang.Long paymentAmt,
           java.lang.String currency,
           java.lang.Integer validity,
           int prmValidity,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.PaymentEnquiryResultPaymentLogPaymentBonus[] paymentBonus,
           java.lang.Integer canceledFlag,
           java.lang.String cancelLogID,
           java.lang.String additiontalInfo,
           java.lang.String operatorID,
           java.lang.Integer paymentTax,
           java.lang.Integer paymentPenalty,
           java.lang.String operationDes,
           java.lang.String bankCode,
           java.lang.Long oldPOSBalance,
           java.lang.Long newPOSBalance,
           java.lang.Integer location,
           java.lang.String agentName,
           java.lang.String batchNo,
           java.lang.String sequence,
           java.lang.Integer loan,
           java.lang.Integer poundage) {
           this.logID = logID;
           this.internalSerialNo = internalSerialNo;
           this.subscriberNo = subscriberNo;
           this.subCosID = subCosID;
           this.tradeTime = tradeTime;
           this.errorType = errorType;
           this.paymentMode = paymentMode;
           this.oldActiveStop = oldActiveStop;
           this.newActiveStop = newActiveStop;
           this.oldSuspendStop = oldSuspendStop;
           this.newSuspendStop = newSuspendStop;
           this.oldDisableStop = oldDisableStop;
           this.newDisableStop = newDisableStop;
           this.oldBalance = oldBalance;
           this.newBalance = newBalance;
           this.paymentAmt = paymentAmt;
           this.currency = currency;
           this.validity = validity;
           this.prmValidity = prmValidity;
           this.paymentBonus = paymentBonus;
           this.canceledFlag = canceledFlag;
           this.cancelLogID = cancelLogID;
           this.additiontalInfo = additiontalInfo;
           this.operatorID = operatorID;
           this.paymentTax = paymentTax;
           this.paymentPenalty = paymentPenalty;
           this.operationDes = operationDes;
           this.bankCode = bankCode;
           this.oldPOSBalance = oldPOSBalance;
           this.newPOSBalance = newPOSBalance;
           this.location = location;
           this.agentName = agentName;
           this.batchNo = batchNo;
           this.sequence = sequence;
           this.loan = loan;
           this.poundage = poundage;
    }


    /**
     * Gets the logID value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return logID
     */
    public java.lang.String getLogID() {
        return logID;
    }


    /**
     * Sets the logID value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param logID
     */
    public void setLogID(java.lang.String logID) {
        this.logID = logID;
    }


    /**
     * Gets the internalSerialNo value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return internalSerialNo
     */
    public java.lang.String getInternalSerialNo() {
        return internalSerialNo;
    }


    /**
     * Sets the internalSerialNo value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param internalSerialNo
     */
    public void setInternalSerialNo(java.lang.String internalSerialNo) {
        this.internalSerialNo = internalSerialNo;
    }


    /**
     * Gets the subscriberNo value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the subCosID value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return subCosID
     */
    public java.lang.Integer getSubCosID() {
        return subCosID;
    }


    /**
     * Sets the subCosID value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param subCosID
     */
    public void setSubCosID(java.lang.Integer subCosID) {
        this.subCosID = subCosID;
    }


    /**
     * Gets the tradeTime value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return tradeTime
     */
    public java.lang.String getTradeTime() {
        return tradeTime;
    }


    /**
     * Sets the tradeTime value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param tradeTime
     */
    public void setTradeTime(java.lang.String tradeTime) {
        this.tradeTime = tradeTime;
    }


    /**
     * Gets the errorType value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return errorType
     */
    public java.lang.String getErrorType() {
        return errorType;
    }


    /**
     * Sets the errorType value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param errorType
     */
    public void setErrorType(java.lang.String errorType) {
        this.errorType = errorType;
    }


    /**
     * Gets the paymentMode value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return paymentMode
     */
    public java.lang.String getPaymentMode() {
        return paymentMode;
    }


    /**
     * Sets the paymentMode value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param paymentMode
     */
    public void setPaymentMode(java.lang.String paymentMode) {
        this.paymentMode = paymentMode;
    }


    /**
     * Gets the oldActiveStop value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return oldActiveStop
     */
    public java.lang.String getOldActiveStop() {
        return oldActiveStop;
    }


    /**
     * Sets the oldActiveStop value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param oldActiveStop
     */
    public void setOldActiveStop(java.lang.String oldActiveStop) {
        this.oldActiveStop = oldActiveStop;
    }


    /**
     * Gets the newActiveStop value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return newActiveStop
     */
    public java.lang.String getNewActiveStop() {
        return newActiveStop;
    }


    /**
     * Sets the newActiveStop value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param newActiveStop
     */
    public void setNewActiveStop(java.lang.String newActiveStop) {
        this.newActiveStop = newActiveStop;
    }


    /**
     * Gets the oldSuspendStop value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return oldSuspendStop
     */
    public java.lang.String getOldSuspendStop() {
        return oldSuspendStop;
    }


    /**
     * Sets the oldSuspendStop value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param oldSuspendStop
     */
    public void setOldSuspendStop(java.lang.String oldSuspendStop) {
        this.oldSuspendStop = oldSuspendStop;
    }


    /**
     * Gets the newSuspendStop value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return newSuspendStop
     */
    public java.lang.String getNewSuspendStop() {
        return newSuspendStop;
    }


    /**
     * Sets the newSuspendStop value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param newSuspendStop
     */
    public void setNewSuspendStop(java.lang.String newSuspendStop) {
        this.newSuspendStop = newSuspendStop;
    }


    /**
     * Gets the oldDisableStop value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return oldDisableStop
     */
    public java.lang.String getOldDisableStop() {
        return oldDisableStop;
    }


    /**
     * Sets the oldDisableStop value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param oldDisableStop
     */
    public void setOldDisableStop(java.lang.String oldDisableStop) {
        this.oldDisableStop = oldDisableStop;
    }


    /**
     * Gets the newDisableStop value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return newDisableStop
     */
    public java.lang.String getNewDisableStop() {
        return newDisableStop;
    }


    /**
     * Sets the newDisableStop value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param newDisableStop
     */
    public void setNewDisableStop(java.lang.String newDisableStop) {
        this.newDisableStop = newDisableStop;
    }


    /**
     * Gets the oldBalance value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return oldBalance
     */
    public java.lang.Long getOldBalance() {
        return oldBalance;
    }


    /**
     * Sets the oldBalance value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param oldBalance
     */
    public void setOldBalance(java.lang.Long oldBalance) {
        this.oldBalance = oldBalance;
    }


    /**
     * Gets the newBalance value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return newBalance
     */
    public java.lang.Long getNewBalance() {
        return newBalance;
    }


    /**
     * Sets the newBalance value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param newBalance
     */
    public void setNewBalance(java.lang.Long newBalance) {
        this.newBalance = newBalance;
    }


    /**
     * Gets the paymentAmt value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return paymentAmt
     */
    public java.lang.Long getPaymentAmt() {
        return paymentAmt;
    }


    /**
     * Sets the paymentAmt value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param paymentAmt
     */
    public void setPaymentAmt(java.lang.Long paymentAmt) {
        this.paymentAmt = paymentAmt;
    }


    /**
     * Gets the currency value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the validity value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return validity
     */
    public java.lang.Integer getValidity() {
        return validity;
    }


    /**
     * Sets the validity value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param validity
     */
    public void setValidity(java.lang.Integer validity) {
        this.validity = validity;
    }


    /**
     * Gets the prmValidity value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return prmValidity
     */
    public int getPrmValidity() {
        return prmValidity;
    }


    /**
     * Sets the prmValidity value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param prmValidity
     */
    public void setPrmValidity(int prmValidity) {
        this.prmValidity = prmValidity;
    }


    /**
     * Gets the paymentBonus value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return paymentBonus
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.PaymentEnquiryResultPaymentLogPaymentBonus[] getPaymentBonus() {
        return paymentBonus;
    }


    /**
     * Sets the paymentBonus value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param paymentBonus
     */
    public void setPaymentBonus(com.huawei.www.bme.cbsinterface.cbs.accountmgr.PaymentEnquiryResultPaymentLogPaymentBonus[] paymentBonus) {
        this.paymentBonus = paymentBonus;
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.PaymentEnquiryResultPaymentLogPaymentBonus getPaymentBonus(int i) {
        return this.paymentBonus[i];
    }

    public void setPaymentBonus(int i, com.huawei.www.bme.cbsinterface.cbs.accountmgr.PaymentEnquiryResultPaymentLogPaymentBonus _value) {
        this.paymentBonus[i] = _value;
    }


    /**
     * Gets the canceledFlag value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return canceledFlag
     */
    public java.lang.Integer getCanceledFlag() {
        return canceledFlag;
    }


    /**
     * Sets the canceledFlag value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param canceledFlag
     */
    public void setCanceledFlag(java.lang.Integer canceledFlag) {
        this.canceledFlag = canceledFlag;
    }


    /**
     * Gets the cancelLogID value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return cancelLogID
     */
    public java.lang.String getCancelLogID() {
        return cancelLogID;
    }


    /**
     * Sets the cancelLogID value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param cancelLogID
     */
    public void setCancelLogID(java.lang.String cancelLogID) {
        this.cancelLogID = cancelLogID;
    }


    /**
     * Gets the additiontalInfo value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return additiontalInfo
     */
    public java.lang.String getAdditiontalInfo() {
        return additiontalInfo;
    }


    /**
     * Sets the additiontalInfo value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param additiontalInfo
     */
    public void setAdditiontalInfo(java.lang.String additiontalInfo) {
        this.additiontalInfo = additiontalInfo;
    }


    /**
     * Gets the operatorID value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return operatorID
     */
    public java.lang.String getOperatorID() {
        return operatorID;
    }


    /**
     * Sets the operatorID value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param operatorID
     */
    public void setOperatorID(java.lang.String operatorID) {
        this.operatorID = operatorID;
    }


    /**
     * Gets the paymentTax value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return paymentTax
     */
    public java.lang.Integer getPaymentTax() {
        return paymentTax;
    }


    /**
     * Sets the paymentTax value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param paymentTax
     */
    public void setPaymentTax(java.lang.Integer paymentTax) {
        this.paymentTax = paymentTax;
    }


    /**
     * Gets the paymentPenalty value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return paymentPenalty
     */
    public java.lang.Integer getPaymentPenalty() {
        return paymentPenalty;
    }


    /**
     * Sets the paymentPenalty value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param paymentPenalty
     */
    public void setPaymentPenalty(java.lang.Integer paymentPenalty) {
        this.paymentPenalty = paymentPenalty;
    }


    /**
     * Gets the operationDes value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return operationDes
     */
    public java.lang.String getOperationDes() {
        return operationDes;
    }


    /**
     * Sets the operationDes value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param operationDes
     */
    public void setOperationDes(java.lang.String operationDes) {
        this.operationDes = operationDes;
    }


    /**
     * Gets the bankCode value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return bankCode
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param bankCode
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the oldPOSBalance value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return oldPOSBalance
     */
    public java.lang.Long getOldPOSBalance() {
        return oldPOSBalance;
    }


    /**
     * Sets the oldPOSBalance value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param oldPOSBalance
     */
    public void setOldPOSBalance(java.lang.Long oldPOSBalance) {
        this.oldPOSBalance = oldPOSBalance;
    }


    /**
     * Gets the newPOSBalance value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return newPOSBalance
     */
    public java.lang.Long getNewPOSBalance() {
        return newPOSBalance;
    }


    /**
     * Sets the newPOSBalance value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param newPOSBalance
     */
    public void setNewPOSBalance(java.lang.Long newPOSBalance) {
        this.newPOSBalance = newPOSBalance;
    }


    /**
     * Gets the location value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return location
     */
    public java.lang.Integer getLocation() {
        return location;
    }


    /**
     * Sets the location value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param location
     */
    public void setLocation(java.lang.Integer location) {
        this.location = location;
    }


    /**
     * Gets the agentName value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return agentName
     */
    public java.lang.String getAgentName() {
        return agentName;
    }


    /**
     * Sets the agentName value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param agentName
     */
    public void setAgentName(java.lang.String agentName) {
        this.agentName = agentName;
    }


    /**
     * Gets the batchNo value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return batchNo
     */
    public java.lang.String getBatchNo() {
        return batchNo;
    }


    /**
     * Sets the batchNo value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param batchNo
     */
    public void setBatchNo(java.lang.String batchNo) {
        this.batchNo = batchNo;
    }


    /**
     * Gets the sequence value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return sequence
     */
    public java.lang.String getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param sequence
     */
    public void setSequence(java.lang.String sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the loan value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return loan
     */
    public java.lang.Integer getLoan() {
        return loan;
    }


    /**
     * Sets the loan value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param loan
     */
    public void setLoan(java.lang.Integer loan) {
        this.loan = loan;
    }


    /**
     * Gets the poundage value for this PaymentEnquiryResultPaymentLog.
     * 
     * @return poundage
     */
    public java.lang.Integer getPoundage() {
        return poundage;
    }


    /**
     * Sets the poundage value for this PaymentEnquiryResultPaymentLog.
     * 
     * @param poundage
     */
    public void setPoundage(java.lang.Integer poundage) {
        this.poundage = poundage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentEnquiryResultPaymentLog)) return false;
        PaymentEnquiryResultPaymentLog other = (PaymentEnquiryResultPaymentLog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.logID==null && other.getLogID()==null) || 
             (this.logID!=null &&
              this.logID.equals(other.getLogID()))) &&
            ((this.internalSerialNo==null && other.getInternalSerialNo()==null) || 
             (this.internalSerialNo!=null &&
              this.internalSerialNo.equals(other.getInternalSerialNo()))) &&
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            ((this.subCosID==null && other.getSubCosID()==null) || 
             (this.subCosID!=null &&
              this.subCosID.equals(other.getSubCosID()))) &&
            ((this.tradeTime==null && other.getTradeTime()==null) || 
             (this.tradeTime!=null &&
              this.tradeTime.equals(other.getTradeTime()))) &&
            ((this.errorType==null && other.getErrorType()==null) || 
             (this.errorType!=null &&
              this.errorType.equals(other.getErrorType()))) &&
            ((this.paymentMode==null && other.getPaymentMode()==null) || 
             (this.paymentMode!=null &&
              this.paymentMode.equals(other.getPaymentMode()))) &&
            ((this.oldActiveStop==null && other.getOldActiveStop()==null) || 
             (this.oldActiveStop!=null &&
              this.oldActiveStop.equals(other.getOldActiveStop()))) &&
            ((this.newActiveStop==null && other.getNewActiveStop()==null) || 
             (this.newActiveStop!=null &&
              this.newActiveStop.equals(other.getNewActiveStop()))) &&
            ((this.oldSuspendStop==null && other.getOldSuspendStop()==null) || 
             (this.oldSuspendStop!=null &&
              this.oldSuspendStop.equals(other.getOldSuspendStop()))) &&
            ((this.newSuspendStop==null && other.getNewSuspendStop()==null) || 
             (this.newSuspendStop!=null &&
              this.newSuspendStop.equals(other.getNewSuspendStop()))) &&
            ((this.oldDisableStop==null && other.getOldDisableStop()==null) || 
             (this.oldDisableStop!=null &&
              this.oldDisableStop.equals(other.getOldDisableStop()))) &&
            ((this.newDisableStop==null && other.getNewDisableStop()==null) || 
             (this.newDisableStop!=null &&
              this.newDisableStop.equals(other.getNewDisableStop()))) &&
            ((this.oldBalance==null && other.getOldBalance()==null) || 
             (this.oldBalance!=null &&
              this.oldBalance.equals(other.getOldBalance()))) &&
            ((this.newBalance==null && other.getNewBalance()==null) || 
             (this.newBalance!=null &&
              this.newBalance.equals(other.getNewBalance()))) &&
            ((this.paymentAmt==null && other.getPaymentAmt()==null) || 
             (this.paymentAmt!=null &&
              this.paymentAmt.equals(other.getPaymentAmt()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.validity==null && other.getValidity()==null) || 
             (this.validity!=null &&
              this.validity.equals(other.getValidity()))) &&
            this.prmValidity == other.getPrmValidity() &&
            ((this.paymentBonus==null && other.getPaymentBonus()==null) || 
             (this.paymentBonus!=null &&
              java.util.Arrays.equals(this.paymentBonus, other.getPaymentBonus()))) &&
            ((this.canceledFlag==null && other.getCanceledFlag()==null) || 
             (this.canceledFlag!=null &&
              this.canceledFlag.equals(other.getCanceledFlag()))) &&
            ((this.cancelLogID==null && other.getCancelLogID()==null) || 
             (this.cancelLogID!=null &&
              this.cancelLogID.equals(other.getCancelLogID()))) &&
            ((this.additiontalInfo==null && other.getAdditiontalInfo()==null) || 
             (this.additiontalInfo!=null &&
              this.additiontalInfo.equals(other.getAdditiontalInfo()))) &&
            ((this.operatorID==null && other.getOperatorID()==null) || 
             (this.operatorID!=null &&
              this.operatorID.equals(other.getOperatorID()))) &&
            ((this.paymentTax==null && other.getPaymentTax()==null) || 
             (this.paymentTax!=null &&
              this.paymentTax.equals(other.getPaymentTax()))) &&
            ((this.paymentPenalty==null && other.getPaymentPenalty()==null) || 
             (this.paymentPenalty!=null &&
              this.paymentPenalty.equals(other.getPaymentPenalty()))) &&
            ((this.operationDes==null && other.getOperationDes()==null) || 
             (this.operationDes!=null &&
              this.operationDes.equals(other.getOperationDes()))) &&
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.oldPOSBalance==null && other.getOldPOSBalance()==null) || 
             (this.oldPOSBalance!=null &&
              this.oldPOSBalance.equals(other.getOldPOSBalance()))) &&
            ((this.newPOSBalance==null && other.getNewPOSBalance()==null) || 
             (this.newPOSBalance!=null &&
              this.newPOSBalance.equals(other.getNewPOSBalance()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.agentName==null && other.getAgentName()==null) || 
             (this.agentName!=null &&
              this.agentName.equals(other.getAgentName()))) &&
            ((this.batchNo==null && other.getBatchNo()==null) || 
             (this.batchNo!=null &&
              this.batchNo.equals(other.getBatchNo()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.loan==null && other.getLoan()==null) || 
             (this.loan!=null &&
              this.loan.equals(other.getLoan()))) &&
            ((this.poundage==null && other.getPoundage()==null) || 
             (this.poundage!=null &&
              this.poundage.equals(other.getPoundage())));
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
        if (getLogID() != null) {
            _hashCode += getLogID().hashCode();
        }
        if (getInternalSerialNo() != null) {
            _hashCode += getInternalSerialNo().hashCode();
        }
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        if (getSubCosID() != null) {
            _hashCode += getSubCosID().hashCode();
        }
        if (getTradeTime() != null) {
            _hashCode += getTradeTime().hashCode();
        }
        if (getErrorType() != null) {
            _hashCode += getErrorType().hashCode();
        }
        if (getPaymentMode() != null) {
            _hashCode += getPaymentMode().hashCode();
        }
        if (getOldActiveStop() != null) {
            _hashCode += getOldActiveStop().hashCode();
        }
        if (getNewActiveStop() != null) {
            _hashCode += getNewActiveStop().hashCode();
        }
        if (getOldSuspendStop() != null) {
            _hashCode += getOldSuspendStop().hashCode();
        }
        if (getNewSuspendStop() != null) {
            _hashCode += getNewSuspendStop().hashCode();
        }
        if (getOldDisableStop() != null) {
            _hashCode += getOldDisableStop().hashCode();
        }
        if (getNewDisableStop() != null) {
            _hashCode += getNewDisableStop().hashCode();
        }
        if (getOldBalance() != null) {
            _hashCode += getOldBalance().hashCode();
        }
        if (getNewBalance() != null) {
            _hashCode += getNewBalance().hashCode();
        }
        if (getPaymentAmt() != null) {
            _hashCode += getPaymentAmt().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getValidity() != null) {
            _hashCode += getValidity().hashCode();
        }
        _hashCode += getPrmValidity();
        if (getPaymentBonus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentBonus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentBonus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCanceledFlag() != null) {
            _hashCode += getCanceledFlag().hashCode();
        }
        if (getCancelLogID() != null) {
            _hashCode += getCancelLogID().hashCode();
        }
        if (getAdditiontalInfo() != null) {
            _hashCode += getAdditiontalInfo().hashCode();
        }
        if (getOperatorID() != null) {
            _hashCode += getOperatorID().hashCode();
        }
        if (getPaymentTax() != null) {
            _hashCode += getPaymentTax().hashCode();
        }
        if (getPaymentPenalty() != null) {
            _hashCode += getPaymentPenalty().hashCode();
        }
        if (getOperationDes() != null) {
            _hashCode += getOperationDes().hashCode();
        }
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getOldPOSBalance() != null) {
            _hashCode += getOldPOSBalance().hashCode();
        }
        if (getNewPOSBalance() != null) {
            _hashCode += getNewPOSBalance().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getAgentName() != null) {
            _hashCode += getAgentName().hashCode();
        }
        if (getBatchNo() != null) {
            _hashCode += getBatchNo().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getLoan() != null) {
            _hashCode += getLoan().hashCode();
        }
        if (getPoundage() != null) {
            _hashCode += getPoundage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentEnquiryResultPaymentLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">PaymentEnquiryResult>PaymentLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LogID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "InternalSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCosID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SubCosID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TradeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ErrorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PaymentMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldActiveStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OldActiveStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newActiveStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "NewActiveStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldSuspendStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OldSuspendStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSuspendStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "NewSuspendStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldDisableStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OldDisableStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDisableStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "NewDisableStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OldBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "NewBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PaymentAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Validity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prmValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PrmValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentBonus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PaymentBonus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">>PaymentEnquiryResult>PaymentLog>PaymentBonus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canceledFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CanceledFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelLogID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CancelLogID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additiontalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AdditiontalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OperatorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PaymentTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentPenalty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PaymentPenalty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OperationDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "BankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPOSBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OldPOSBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPOSBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "NewPOSBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AgentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "BatchNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Loan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poundage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Poundage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
