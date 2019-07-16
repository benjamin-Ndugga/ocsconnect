/**
 * VoucherRechargeEnquiryResultRechargeLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class VoucherRechargeEnquiryResultRechargeLog  implements java.io.Serializable {
    private java.lang.String subscriberNo;

    private java.lang.Integer subCosID;

    private java.lang.String tradeTime;

    private java.lang.String errorType;

    private java.lang.String rechargeType;

    private java.lang.String batch;

    private java.lang.String sequence;

    private java.lang.Integer cardCosID;

    private java.lang.String oldActiveStop;

    private java.lang.String newActiveStop;

    private java.lang.String oldSuspendStop;

    private java.lang.String newSuspendStop;

    private java.lang.String oldDisableStop;

    private java.lang.String newDisableStop;

    private java.lang.Long oldBalance;

    private java.lang.Long newBalance;

    private java.lang.Long rechargeAmt;

    private java.lang.String currency;

    private java.lang.Integer validity;

    private int prmValidity;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeEnquiryResultRechargeLogRechargeBonus[] rechargeBonus;

    private java.lang.String operatorID;

    private java.lang.Integer rechargeTax;

    private java.lang.Integer rechargePenalty;

    private java.lang.String callingPartyNo;

    private java.lang.String cardSPID;

    private java.lang.Long oldPOSBalance;

    private java.lang.Long newPOSBalance;

    private java.lang.Integer loanPayment;

    private java.lang.Integer loanPoundage;

    public VoucherRechargeEnquiryResultRechargeLog() {
    }

    public VoucherRechargeEnquiryResultRechargeLog(
           java.lang.String subscriberNo,
           java.lang.Integer subCosID,
           java.lang.String tradeTime,
           java.lang.String errorType,
           java.lang.String rechargeType,
           java.lang.String batch,
           java.lang.String sequence,
           java.lang.Integer cardCosID,
           java.lang.String oldActiveStop,
           java.lang.String newActiveStop,
           java.lang.String oldSuspendStop,
           java.lang.String newSuspendStop,
           java.lang.String oldDisableStop,
           java.lang.String newDisableStop,
           java.lang.Long oldBalance,
           java.lang.Long newBalance,
           java.lang.Long rechargeAmt,
           java.lang.String currency,
           java.lang.Integer validity,
           int prmValidity,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeEnquiryResultRechargeLogRechargeBonus[] rechargeBonus,
           java.lang.String operatorID,
           java.lang.Integer rechargeTax,
           java.lang.Integer rechargePenalty,
           java.lang.String callingPartyNo,
           java.lang.String cardSPID,
           java.lang.Long oldPOSBalance,
           java.lang.Long newPOSBalance,
           java.lang.Integer loanPayment,
           java.lang.Integer loanPoundage) {
           this.subscriberNo = subscriberNo;
           this.subCosID = subCosID;
           this.tradeTime = tradeTime;
           this.errorType = errorType;
           this.rechargeType = rechargeType;
           this.batch = batch;
           this.sequence = sequence;
           this.cardCosID = cardCosID;
           this.oldActiveStop = oldActiveStop;
           this.newActiveStop = newActiveStop;
           this.oldSuspendStop = oldSuspendStop;
           this.newSuspendStop = newSuspendStop;
           this.oldDisableStop = oldDisableStop;
           this.newDisableStop = newDisableStop;
           this.oldBalance = oldBalance;
           this.newBalance = newBalance;
           this.rechargeAmt = rechargeAmt;
           this.currency = currency;
           this.validity = validity;
           this.prmValidity = prmValidity;
           this.rechargeBonus = rechargeBonus;
           this.operatorID = operatorID;
           this.rechargeTax = rechargeTax;
           this.rechargePenalty = rechargePenalty;
           this.callingPartyNo = callingPartyNo;
           this.cardSPID = cardSPID;
           this.oldPOSBalance = oldPOSBalance;
           this.newPOSBalance = newPOSBalance;
           this.loanPayment = loanPayment;
           this.loanPoundage = loanPoundage;
    }


    /**
     * Gets the subscriberNo value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the subCosID value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return subCosID
     */
    public java.lang.Integer getSubCosID() {
        return subCosID;
    }


    /**
     * Sets the subCosID value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param subCosID
     */
    public void setSubCosID(java.lang.Integer subCosID) {
        this.subCosID = subCosID;
    }


    /**
     * Gets the tradeTime value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return tradeTime
     */
    public java.lang.String getTradeTime() {
        return tradeTime;
    }


    /**
     * Sets the tradeTime value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param tradeTime
     */
    public void setTradeTime(java.lang.String tradeTime) {
        this.tradeTime = tradeTime;
    }


    /**
     * Gets the errorType value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return errorType
     */
    public java.lang.String getErrorType() {
        return errorType;
    }


    /**
     * Sets the errorType value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param errorType
     */
    public void setErrorType(java.lang.String errorType) {
        this.errorType = errorType;
    }


    /**
     * Gets the rechargeType value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return rechargeType
     */
    public java.lang.String getRechargeType() {
        return rechargeType;
    }


    /**
     * Sets the rechargeType value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param rechargeType
     */
    public void setRechargeType(java.lang.String rechargeType) {
        this.rechargeType = rechargeType;
    }


    /**
     * Gets the batch value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return batch
     */
    public java.lang.String getBatch() {
        return batch;
    }


    /**
     * Sets the batch value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param batch
     */
    public void setBatch(java.lang.String batch) {
        this.batch = batch;
    }


    /**
     * Gets the sequence value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return sequence
     */
    public java.lang.String getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param sequence
     */
    public void setSequence(java.lang.String sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the cardCosID value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return cardCosID
     */
    public java.lang.Integer getCardCosID() {
        return cardCosID;
    }


    /**
     * Sets the cardCosID value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param cardCosID
     */
    public void setCardCosID(java.lang.Integer cardCosID) {
        this.cardCosID = cardCosID;
    }


    /**
     * Gets the oldActiveStop value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return oldActiveStop
     */
    public java.lang.String getOldActiveStop() {
        return oldActiveStop;
    }


    /**
     * Sets the oldActiveStop value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param oldActiveStop
     */
    public void setOldActiveStop(java.lang.String oldActiveStop) {
        this.oldActiveStop = oldActiveStop;
    }


    /**
     * Gets the newActiveStop value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return newActiveStop
     */
    public java.lang.String getNewActiveStop() {
        return newActiveStop;
    }


    /**
     * Sets the newActiveStop value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param newActiveStop
     */
    public void setNewActiveStop(java.lang.String newActiveStop) {
        this.newActiveStop = newActiveStop;
    }


    /**
     * Gets the oldSuspendStop value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return oldSuspendStop
     */
    public java.lang.String getOldSuspendStop() {
        return oldSuspendStop;
    }


    /**
     * Sets the oldSuspendStop value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param oldSuspendStop
     */
    public void setOldSuspendStop(java.lang.String oldSuspendStop) {
        this.oldSuspendStop = oldSuspendStop;
    }


    /**
     * Gets the newSuspendStop value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return newSuspendStop
     */
    public java.lang.String getNewSuspendStop() {
        return newSuspendStop;
    }


    /**
     * Sets the newSuspendStop value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param newSuspendStop
     */
    public void setNewSuspendStop(java.lang.String newSuspendStop) {
        this.newSuspendStop = newSuspendStop;
    }


    /**
     * Gets the oldDisableStop value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return oldDisableStop
     */
    public java.lang.String getOldDisableStop() {
        return oldDisableStop;
    }


    /**
     * Sets the oldDisableStop value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param oldDisableStop
     */
    public void setOldDisableStop(java.lang.String oldDisableStop) {
        this.oldDisableStop = oldDisableStop;
    }


    /**
     * Gets the newDisableStop value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return newDisableStop
     */
    public java.lang.String getNewDisableStop() {
        return newDisableStop;
    }


    /**
     * Sets the newDisableStop value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param newDisableStop
     */
    public void setNewDisableStop(java.lang.String newDisableStop) {
        this.newDisableStop = newDisableStop;
    }


    /**
     * Gets the oldBalance value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return oldBalance
     */
    public java.lang.Long getOldBalance() {
        return oldBalance;
    }


    /**
     * Sets the oldBalance value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param oldBalance
     */
    public void setOldBalance(java.lang.Long oldBalance) {
        this.oldBalance = oldBalance;
    }


    /**
     * Gets the newBalance value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return newBalance
     */
    public java.lang.Long getNewBalance() {
        return newBalance;
    }


    /**
     * Sets the newBalance value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param newBalance
     */
    public void setNewBalance(java.lang.Long newBalance) {
        this.newBalance = newBalance;
    }


    /**
     * Gets the rechargeAmt value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return rechargeAmt
     */
    public java.lang.Long getRechargeAmt() {
        return rechargeAmt;
    }


    /**
     * Sets the rechargeAmt value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param rechargeAmt
     */
    public void setRechargeAmt(java.lang.Long rechargeAmt) {
        this.rechargeAmt = rechargeAmt;
    }


    /**
     * Gets the currency value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the validity value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return validity
     */
    public java.lang.Integer getValidity() {
        return validity;
    }


    /**
     * Sets the validity value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param validity
     */
    public void setValidity(java.lang.Integer validity) {
        this.validity = validity;
    }


    /**
     * Gets the prmValidity value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return prmValidity
     */
    public int getPrmValidity() {
        return prmValidity;
    }


    /**
     * Sets the prmValidity value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param prmValidity
     */
    public void setPrmValidity(int prmValidity) {
        this.prmValidity = prmValidity;
    }


    /**
     * Gets the rechargeBonus value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return rechargeBonus
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeEnquiryResultRechargeLogRechargeBonus[] getRechargeBonus() {
        return rechargeBonus;
    }


    /**
     * Sets the rechargeBonus value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param rechargeBonus
     */
    public void setRechargeBonus(com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeEnquiryResultRechargeLogRechargeBonus[] rechargeBonus) {
        this.rechargeBonus = rechargeBonus;
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeEnquiryResultRechargeLogRechargeBonus getRechargeBonus(int i) {
        return this.rechargeBonus[i];
    }

    public void setRechargeBonus(int i, com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeEnquiryResultRechargeLogRechargeBonus _value) {
        this.rechargeBonus[i] = _value;
    }


    /**
     * Gets the operatorID value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return operatorID
     */
    public java.lang.String getOperatorID() {
        return operatorID;
    }


    /**
     * Sets the operatorID value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param operatorID
     */
    public void setOperatorID(java.lang.String operatorID) {
        this.operatorID = operatorID;
    }


    /**
     * Gets the rechargeTax value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return rechargeTax
     */
    public java.lang.Integer getRechargeTax() {
        return rechargeTax;
    }


    /**
     * Sets the rechargeTax value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param rechargeTax
     */
    public void setRechargeTax(java.lang.Integer rechargeTax) {
        this.rechargeTax = rechargeTax;
    }


    /**
     * Gets the rechargePenalty value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return rechargePenalty
     */
    public java.lang.Integer getRechargePenalty() {
        return rechargePenalty;
    }


    /**
     * Sets the rechargePenalty value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param rechargePenalty
     */
    public void setRechargePenalty(java.lang.Integer rechargePenalty) {
        this.rechargePenalty = rechargePenalty;
    }


    /**
     * Gets the callingPartyNo value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return callingPartyNo
     */
    public java.lang.String getCallingPartyNo() {
        return callingPartyNo;
    }


    /**
     * Sets the callingPartyNo value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param callingPartyNo
     */
    public void setCallingPartyNo(java.lang.String callingPartyNo) {
        this.callingPartyNo = callingPartyNo;
    }


    /**
     * Gets the cardSPID value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return cardSPID
     */
    public java.lang.String getCardSPID() {
        return cardSPID;
    }


    /**
     * Sets the cardSPID value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param cardSPID
     */
    public void setCardSPID(java.lang.String cardSPID) {
        this.cardSPID = cardSPID;
    }


    /**
     * Gets the oldPOSBalance value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return oldPOSBalance
     */
    public java.lang.Long getOldPOSBalance() {
        return oldPOSBalance;
    }


    /**
     * Sets the oldPOSBalance value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param oldPOSBalance
     */
    public void setOldPOSBalance(java.lang.Long oldPOSBalance) {
        this.oldPOSBalance = oldPOSBalance;
    }


    /**
     * Gets the newPOSBalance value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return newPOSBalance
     */
    public java.lang.Long getNewPOSBalance() {
        return newPOSBalance;
    }


    /**
     * Sets the newPOSBalance value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param newPOSBalance
     */
    public void setNewPOSBalance(java.lang.Long newPOSBalance) {
        this.newPOSBalance = newPOSBalance;
    }


    /**
     * Gets the loanPayment value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return loanPayment
     */
    public java.lang.Integer getLoanPayment() {
        return loanPayment;
    }


    /**
     * Sets the loanPayment value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param loanPayment
     */
    public void setLoanPayment(java.lang.Integer loanPayment) {
        this.loanPayment = loanPayment;
    }


    /**
     * Gets the loanPoundage value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @return loanPoundage
     */
    public java.lang.Integer getLoanPoundage() {
        return loanPoundage;
    }


    /**
     * Sets the loanPoundage value for this VoucherRechargeEnquiryResultRechargeLog.
     * 
     * @param loanPoundage
     */
    public void setLoanPoundage(java.lang.Integer loanPoundage) {
        this.loanPoundage = loanPoundage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoucherRechargeEnquiryResultRechargeLog)) return false;
        VoucherRechargeEnquiryResultRechargeLog other = (VoucherRechargeEnquiryResultRechargeLog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
            ((this.rechargeType==null && other.getRechargeType()==null) || 
             (this.rechargeType!=null &&
              this.rechargeType.equals(other.getRechargeType()))) &&
            ((this.batch==null && other.getBatch()==null) || 
             (this.batch!=null &&
              this.batch.equals(other.getBatch()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.cardCosID==null && other.getCardCosID()==null) || 
             (this.cardCosID!=null &&
              this.cardCosID.equals(other.getCardCosID()))) &&
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
            ((this.rechargeAmt==null && other.getRechargeAmt()==null) || 
             (this.rechargeAmt!=null &&
              this.rechargeAmt.equals(other.getRechargeAmt()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.validity==null && other.getValidity()==null) || 
             (this.validity!=null &&
              this.validity.equals(other.getValidity()))) &&
            this.prmValidity == other.getPrmValidity() &&
            ((this.rechargeBonus==null && other.getRechargeBonus()==null) || 
             (this.rechargeBonus!=null &&
              java.util.Arrays.equals(this.rechargeBonus, other.getRechargeBonus()))) &&
            ((this.operatorID==null && other.getOperatorID()==null) || 
             (this.operatorID!=null &&
              this.operatorID.equals(other.getOperatorID()))) &&
            ((this.rechargeTax==null && other.getRechargeTax()==null) || 
             (this.rechargeTax!=null &&
              this.rechargeTax.equals(other.getRechargeTax()))) &&
            ((this.rechargePenalty==null && other.getRechargePenalty()==null) || 
             (this.rechargePenalty!=null &&
              this.rechargePenalty.equals(other.getRechargePenalty()))) &&
            ((this.callingPartyNo==null && other.getCallingPartyNo()==null) || 
             (this.callingPartyNo!=null &&
              this.callingPartyNo.equals(other.getCallingPartyNo()))) &&
            ((this.cardSPID==null && other.getCardSPID()==null) || 
             (this.cardSPID!=null &&
              this.cardSPID.equals(other.getCardSPID()))) &&
            ((this.oldPOSBalance==null && other.getOldPOSBalance()==null) || 
             (this.oldPOSBalance!=null &&
              this.oldPOSBalance.equals(other.getOldPOSBalance()))) &&
            ((this.newPOSBalance==null && other.getNewPOSBalance()==null) || 
             (this.newPOSBalance!=null &&
              this.newPOSBalance.equals(other.getNewPOSBalance()))) &&
            ((this.loanPayment==null && other.getLoanPayment()==null) || 
             (this.loanPayment!=null &&
              this.loanPayment.equals(other.getLoanPayment()))) &&
            ((this.loanPoundage==null && other.getLoanPoundage()==null) || 
             (this.loanPoundage!=null &&
              this.loanPoundage.equals(other.getLoanPoundage())));
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
        if (getRechargeType() != null) {
            _hashCode += getRechargeType().hashCode();
        }
        if (getBatch() != null) {
            _hashCode += getBatch().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getCardCosID() != null) {
            _hashCode += getCardCosID().hashCode();
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
        if (getRechargeAmt() != null) {
            _hashCode += getRechargeAmt().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getValidity() != null) {
            _hashCode += getValidity().hashCode();
        }
        _hashCode += getPrmValidity();
        if (getRechargeBonus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRechargeBonus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRechargeBonus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperatorID() != null) {
            _hashCode += getOperatorID().hashCode();
        }
        if (getRechargeTax() != null) {
            _hashCode += getRechargeTax().hashCode();
        }
        if (getRechargePenalty() != null) {
            _hashCode += getRechargePenalty().hashCode();
        }
        if (getCallingPartyNo() != null) {
            _hashCode += getCallingPartyNo().hashCode();
        }
        if (getCardSPID() != null) {
            _hashCode += getCardSPID().hashCode();
        }
        if (getOldPOSBalance() != null) {
            _hashCode += getOldPOSBalance().hashCode();
        }
        if (getNewPOSBalance() != null) {
            _hashCode += getNewPOSBalance().hashCode();
        }
        if (getLoanPayment() != null) {
            _hashCode += getLoanPayment().hashCode();
        }
        if (getLoanPoundage() != null) {
            _hashCode += getLoanPoundage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoucherRechargeEnquiryResultRechargeLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">VoucherRechargeEnquiryResult>RechargeLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("rechargeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "RechargeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Batch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardCosID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CardCosID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
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
        elemField.setFieldName("rechargeAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "RechargeAmt"));
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
        elemField.setFieldName("rechargeBonus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "RechargeBonus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">>VoucherRechargeEnquiryResult>RechargeLog>RechargeBonus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OperatorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "RechargeTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargePenalty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "RechargePenalty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingPartyNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CallingPartyNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardSPID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CardSPID"));
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
        elemField.setFieldName("loanPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LoanPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanPoundage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LoanPoundage"));
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
