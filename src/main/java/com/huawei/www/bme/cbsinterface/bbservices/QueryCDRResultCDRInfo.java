/**
 * QueryCDRResultCDRInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryCDRResultCDRInfo  implements java.io.Serializable {
    private java.lang.String cdrSeq;

    /* 业务分类，如 呼叫，短信，彩信 */
    private java.lang.String serviceCategory;

    /* 业务类型，如国内固话呼叫、国内移动呼叫、国际移动呼叫 */
    private java.lang.String seriveType;

    private java.lang.String serviceTypeName;

    private java.lang.String subKey;

    private java.lang.String primaryIdentity;

    private java.lang.String accountKey;

    private java.lang.String otherNumber;

    /* 原被叫方,CF流程 */
    private java.lang.String originalCalledParty;

    /* 例如：MO, MT, MF
     * 对于Voice, SMS, MMS等存在主被叫的业务有效 */
    private java.lang.String flowType;

    private java.lang.String chargingPartyNumber;

    private java.lang.String roamFlag;

    private java.lang.String callingCellID;

    private java.lang.String calledCellID;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoAreaInfo areaInfo;

    /* 标识扣费还是回补 */
    private java.lang.String refundIndicator;

    /* 短消息特殊号码类型，主要标识出免费号码，A2P/P2A等类型 */
    private java.lang.String specialNumberIndicator;

    /* 对于数据业务类有效 */
    private java.lang.String URL;

    /* 业务编号 */
    private java.lang.String serviceID;

    private java.lang.String spCpID;

    /* 服务分类 */
    private java.lang.String categoryID;

    /* 内容ID */
    private java.lang.String contentID;

    /* CDR 开始时间，用户归属地时间 */
    private java.lang.String startTime;

    /* CDR 结束时间，用户归属地时间 */
    private java.lang.String endTime;

    private java.lang.String billCycleID;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoVolumeInfo volumeInfo;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfo totalChargeInfo;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoChargeDetail[] chargeDetail;

    private java.lang.Long mainBalanceDeduct;

    private java.lang.Long mainBalanceLeft;

    private java.lang.String visitedPartner;

    /* It is reserved for future extension */
    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoAdditionalProperty[] additionalProperty;

    public QueryCDRResultCDRInfo() {
    }

    public QueryCDRResultCDRInfo(
           java.lang.String cdrSeq,
           java.lang.String serviceCategory,
           java.lang.String seriveType,
           java.lang.String serviceTypeName,
           java.lang.String subKey,
           java.lang.String primaryIdentity,
           java.lang.String accountKey,
           java.lang.String otherNumber,
           java.lang.String originalCalledParty,
           java.lang.String flowType,
           java.lang.String chargingPartyNumber,
           java.lang.String roamFlag,
           java.lang.String callingCellID,
           java.lang.String calledCellID,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoAreaInfo areaInfo,
           java.lang.String refundIndicator,
           java.lang.String specialNumberIndicator,
           java.lang.String URL,
           java.lang.String serviceID,
           java.lang.String spCpID,
           java.lang.String categoryID,
           java.lang.String contentID,
           java.lang.String startTime,
           java.lang.String endTime,
           java.lang.String billCycleID,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoVolumeInfo volumeInfo,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfo totalChargeInfo,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoChargeDetail[] chargeDetail,
           java.lang.Long mainBalanceDeduct,
           java.lang.Long mainBalanceLeft,
           java.lang.String visitedPartner,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoAdditionalProperty[] additionalProperty) {
           this.cdrSeq = cdrSeq;
           this.serviceCategory = serviceCategory;
           this.seriveType = seriveType;
           this.serviceTypeName = serviceTypeName;
           this.subKey = subKey;
           this.primaryIdentity = primaryIdentity;
           this.accountKey = accountKey;
           this.otherNumber = otherNumber;
           this.originalCalledParty = originalCalledParty;
           this.flowType = flowType;
           this.chargingPartyNumber = chargingPartyNumber;
           this.roamFlag = roamFlag;
           this.callingCellID = callingCellID;
           this.calledCellID = calledCellID;
           this.areaInfo = areaInfo;
           this.refundIndicator = refundIndicator;
           this.specialNumberIndicator = specialNumberIndicator;
           this.URL = URL;
           this.serviceID = serviceID;
           this.spCpID = spCpID;
           this.categoryID = categoryID;
           this.contentID = contentID;
           this.startTime = startTime;
           this.endTime = endTime;
           this.billCycleID = billCycleID;
           this.volumeInfo = volumeInfo;
           this.totalChargeInfo = totalChargeInfo;
           this.chargeDetail = chargeDetail;
           this.mainBalanceDeduct = mainBalanceDeduct;
           this.mainBalanceLeft = mainBalanceLeft;
           this.visitedPartner = visitedPartner;
           this.additionalProperty = additionalProperty;
    }


    /**
     * Gets the cdrSeq value for this QueryCDRResultCDRInfo.
     * 
     * @return cdrSeq
     */
    public java.lang.String getCdrSeq() {
        return cdrSeq;
    }


    /**
     * Sets the cdrSeq value for this QueryCDRResultCDRInfo.
     * 
     * @param cdrSeq
     */
    public void setCdrSeq(java.lang.String cdrSeq) {
        this.cdrSeq = cdrSeq;
    }


    /**
     * Gets the serviceCategory value for this QueryCDRResultCDRInfo.
     * 
     * @return serviceCategory   * 业务分类，如 呼叫，短信，彩信
     */
    public java.lang.String getServiceCategory() {
        return serviceCategory;
    }


    /**
     * Sets the serviceCategory value for this QueryCDRResultCDRInfo.
     * 
     * @param serviceCategory   * 业务分类，如 呼叫，短信，彩信
     */
    public void setServiceCategory(java.lang.String serviceCategory) {
        this.serviceCategory = serviceCategory;
    }


    /**
     * Gets the seriveType value for this QueryCDRResultCDRInfo.
     * 
     * @return seriveType   * 业务类型，如国内固话呼叫、国内移动呼叫、国际移动呼叫
     */
    public java.lang.String getSeriveType() {
        return seriveType;
    }


    /**
     * Sets the seriveType value for this QueryCDRResultCDRInfo.
     * 
     * @param seriveType   * 业务类型，如国内固话呼叫、国内移动呼叫、国际移动呼叫
     */
    public void setSeriveType(java.lang.String seriveType) {
        this.seriveType = seriveType;
    }


    /**
     * Gets the serviceTypeName value for this QueryCDRResultCDRInfo.
     * 
     * @return serviceTypeName
     */
    public java.lang.String getServiceTypeName() {
        return serviceTypeName;
    }


    /**
     * Sets the serviceTypeName value for this QueryCDRResultCDRInfo.
     * 
     * @param serviceTypeName
     */
    public void setServiceTypeName(java.lang.String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }


    /**
     * Gets the subKey value for this QueryCDRResultCDRInfo.
     * 
     * @return subKey
     */
    public java.lang.String getSubKey() {
        return subKey;
    }


    /**
     * Sets the subKey value for this QueryCDRResultCDRInfo.
     * 
     * @param subKey
     */
    public void setSubKey(java.lang.String subKey) {
        this.subKey = subKey;
    }


    /**
     * Gets the primaryIdentity value for this QueryCDRResultCDRInfo.
     * 
     * @return primaryIdentity
     */
    public java.lang.String getPrimaryIdentity() {
        return primaryIdentity;
    }


    /**
     * Sets the primaryIdentity value for this QueryCDRResultCDRInfo.
     * 
     * @param primaryIdentity
     */
    public void setPrimaryIdentity(java.lang.String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }


    /**
     * Gets the accountKey value for this QueryCDRResultCDRInfo.
     * 
     * @return accountKey
     */
    public java.lang.String getAccountKey() {
        return accountKey;
    }


    /**
     * Sets the accountKey value for this QueryCDRResultCDRInfo.
     * 
     * @param accountKey
     */
    public void setAccountKey(java.lang.String accountKey) {
        this.accountKey = accountKey;
    }


    /**
     * Gets the otherNumber value for this QueryCDRResultCDRInfo.
     * 
     * @return otherNumber
     */
    public java.lang.String getOtherNumber() {
        return otherNumber;
    }


    /**
     * Sets the otherNumber value for this QueryCDRResultCDRInfo.
     * 
     * @param otherNumber
     */
    public void setOtherNumber(java.lang.String otherNumber) {
        this.otherNumber = otherNumber;
    }


    /**
     * Gets the originalCalledParty value for this QueryCDRResultCDRInfo.
     * 
     * @return originalCalledParty   * 原被叫方,CF流程
     */
    public java.lang.String getOriginalCalledParty() {
        return originalCalledParty;
    }


    /**
     * Sets the originalCalledParty value for this QueryCDRResultCDRInfo.
     * 
     * @param originalCalledParty   * 原被叫方,CF流程
     */
    public void setOriginalCalledParty(java.lang.String originalCalledParty) {
        this.originalCalledParty = originalCalledParty;
    }


    /**
     * Gets the flowType value for this QueryCDRResultCDRInfo.
     * 
     * @return flowType   * 例如：MO, MT, MF
     * 对于Voice, SMS, MMS等存在主被叫的业务有效
     */
    public java.lang.String getFlowType() {
        return flowType;
    }


    /**
     * Sets the flowType value for this QueryCDRResultCDRInfo.
     * 
     * @param flowType   * 例如：MO, MT, MF
     * 对于Voice, SMS, MMS等存在主被叫的业务有效
     */
    public void setFlowType(java.lang.String flowType) {
        this.flowType = flowType;
    }


    /**
     * Gets the chargingPartyNumber value for this QueryCDRResultCDRInfo.
     * 
     * @return chargingPartyNumber
     */
    public java.lang.String getChargingPartyNumber() {
        return chargingPartyNumber;
    }


    /**
     * Sets the chargingPartyNumber value for this QueryCDRResultCDRInfo.
     * 
     * @param chargingPartyNumber
     */
    public void setChargingPartyNumber(java.lang.String chargingPartyNumber) {
        this.chargingPartyNumber = chargingPartyNumber;
    }


    /**
     * Gets the roamFlag value for this QueryCDRResultCDRInfo.
     * 
     * @return roamFlag
     */
    public java.lang.String getRoamFlag() {
        return roamFlag;
    }


    /**
     * Sets the roamFlag value for this QueryCDRResultCDRInfo.
     * 
     * @param roamFlag
     */
    public void setRoamFlag(java.lang.String roamFlag) {
        this.roamFlag = roamFlag;
    }


    /**
     * Gets the callingCellID value for this QueryCDRResultCDRInfo.
     * 
     * @return callingCellID
     */
    public java.lang.String getCallingCellID() {
        return callingCellID;
    }


    /**
     * Sets the callingCellID value for this QueryCDRResultCDRInfo.
     * 
     * @param callingCellID
     */
    public void setCallingCellID(java.lang.String callingCellID) {
        this.callingCellID = callingCellID;
    }


    /**
     * Gets the calledCellID value for this QueryCDRResultCDRInfo.
     * 
     * @return calledCellID
     */
    public java.lang.String getCalledCellID() {
        return calledCellID;
    }


    /**
     * Sets the calledCellID value for this QueryCDRResultCDRInfo.
     * 
     * @param calledCellID
     */
    public void setCalledCellID(java.lang.String calledCellID) {
        this.calledCellID = calledCellID;
    }


    /**
     * Gets the areaInfo value for this QueryCDRResultCDRInfo.
     * 
     * @return areaInfo
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoAreaInfo getAreaInfo() {
        return areaInfo;
    }


    /**
     * Sets the areaInfo value for this QueryCDRResultCDRInfo.
     * 
     * @param areaInfo
     */
    public void setAreaInfo(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoAreaInfo areaInfo) {
        this.areaInfo = areaInfo;
    }


    /**
     * Gets the refundIndicator value for this QueryCDRResultCDRInfo.
     * 
     * @return refundIndicator   * 标识扣费还是回补
     */
    public java.lang.String getRefundIndicator() {
        return refundIndicator;
    }


    /**
     * Sets the refundIndicator value for this QueryCDRResultCDRInfo.
     * 
     * @param refundIndicator   * 标识扣费还是回补
     */
    public void setRefundIndicator(java.lang.String refundIndicator) {
        this.refundIndicator = refundIndicator;
    }


    /**
     * Gets the specialNumberIndicator value for this QueryCDRResultCDRInfo.
     * 
     * @return specialNumberIndicator   * 短消息特殊号码类型，主要标识出免费号码，A2P/P2A等类型
     */
    public java.lang.String getSpecialNumberIndicator() {
        return specialNumberIndicator;
    }


    /**
     * Sets the specialNumberIndicator value for this QueryCDRResultCDRInfo.
     * 
     * @param specialNumberIndicator   * 短消息特殊号码类型，主要标识出免费号码，A2P/P2A等类型
     */
    public void setSpecialNumberIndicator(java.lang.String specialNumberIndicator) {
        this.specialNumberIndicator = specialNumberIndicator;
    }


    /**
     * Gets the URL value for this QueryCDRResultCDRInfo.
     * 
     * @return URL   * 对于数据业务类有效
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this QueryCDRResultCDRInfo.
     * 
     * @param URL   * 对于数据业务类有效
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the serviceID value for this QueryCDRResultCDRInfo.
     * 
     * @return serviceID   * 业务编号
     */
    public java.lang.String getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this QueryCDRResultCDRInfo.
     * 
     * @param serviceID   * 业务编号
     */
    public void setServiceID(java.lang.String serviceID) {
        this.serviceID = serviceID;
    }


    /**
     * Gets the spCpID value for this QueryCDRResultCDRInfo.
     * 
     * @return spCpID
     */
    public java.lang.String getSpCpID() {
        return spCpID;
    }


    /**
     * Sets the spCpID value for this QueryCDRResultCDRInfo.
     * 
     * @param spCpID
     */
    public void setSpCpID(java.lang.String spCpID) {
        this.spCpID = spCpID;
    }


    /**
     * Gets the categoryID value for this QueryCDRResultCDRInfo.
     * 
     * @return categoryID   * 服务分类
     */
    public java.lang.String getCategoryID() {
        return categoryID;
    }


    /**
     * Sets the categoryID value for this QueryCDRResultCDRInfo.
     * 
     * @param categoryID   * 服务分类
     */
    public void setCategoryID(java.lang.String categoryID) {
        this.categoryID = categoryID;
    }


    /**
     * Gets the contentID value for this QueryCDRResultCDRInfo.
     * 
     * @return contentID   * 内容ID
     */
    public java.lang.String getContentID() {
        return contentID;
    }


    /**
     * Sets the contentID value for this QueryCDRResultCDRInfo.
     * 
     * @param contentID   * 内容ID
     */
    public void setContentID(java.lang.String contentID) {
        this.contentID = contentID;
    }


    /**
     * Gets the startTime value for this QueryCDRResultCDRInfo.
     * 
     * @return startTime   * CDR 开始时间，用户归属地时间
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this QueryCDRResultCDRInfo.
     * 
     * @param startTime   * CDR 开始时间，用户归属地时间
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this QueryCDRResultCDRInfo.
     * 
     * @return endTime   * CDR 结束时间，用户归属地时间
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this QueryCDRResultCDRInfo.
     * 
     * @param endTime   * CDR 结束时间，用户归属地时间
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the billCycleID value for this QueryCDRResultCDRInfo.
     * 
     * @return billCycleID
     */
    public java.lang.String getBillCycleID() {
        return billCycleID;
    }


    /**
     * Sets the billCycleID value for this QueryCDRResultCDRInfo.
     * 
     * @param billCycleID
     */
    public void setBillCycleID(java.lang.String billCycleID) {
        this.billCycleID = billCycleID;
    }


    /**
     * Gets the volumeInfo value for this QueryCDRResultCDRInfo.
     * 
     * @return volumeInfo
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoVolumeInfo getVolumeInfo() {
        return volumeInfo;
    }


    /**
     * Sets the volumeInfo value for this QueryCDRResultCDRInfo.
     * 
     * @param volumeInfo
     */
    public void setVolumeInfo(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoVolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }


    /**
     * Gets the totalChargeInfo value for this QueryCDRResultCDRInfo.
     * 
     * @return totalChargeInfo
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfo getTotalChargeInfo() {
        return totalChargeInfo;
    }


    /**
     * Sets the totalChargeInfo value for this QueryCDRResultCDRInfo.
     * 
     * @param totalChargeInfo
     */
    public void setTotalChargeInfo(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfo totalChargeInfo) {
        this.totalChargeInfo = totalChargeInfo;
    }


    /**
     * Gets the chargeDetail value for this QueryCDRResultCDRInfo.
     * 
     * @return chargeDetail
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoChargeDetail[] getChargeDetail() {
        return chargeDetail;
    }


    /**
     * Sets the chargeDetail value for this QueryCDRResultCDRInfo.
     * 
     * @param chargeDetail
     */
    public void setChargeDetail(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoChargeDetail[] chargeDetail) {
        this.chargeDetail = chargeDetail;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoChargeDetail getChargeDetail(int i) {
        return this.chargeDetail[i];
    }

    public void setChargeDetail(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoChargeDetail _value) {
        this.chargeDetail[i] = _value;
    }


    /**
     * Gets the mainBalanceDeduct value for this QueryCDRResultCDRInfo.
     * 
     * @return mainBalanceDeduct
     */
    public java.lang.Long getMainBalanceDeduct() {
        return mainBalanceDeduct;
    }


    /**
     * Sets the mainBalanceDeduct value for this QueryCDRResultCDRInfo.
     * 
     * @param mainBalanceDeduct
     */
    public void setMainBalanceDeduct(java.lang.Long mainBalanceDeduct) {
        this.mainBalanceDeduct = mainBalanceDeduct;
    }


    /**
     * Gets the mainBalanceLeft value for this QueryCDRResultCDRInfo.
     * 
     * @return mainBalanceLeft
     */
    public java.lang.Long getMainBalanceLeft() {
        return mainBalanceLeft;
    }


    /**
     * Sets the mainBalanceLeft value for this QueryCDRResultCDRInfo.
     * 
     * @param mainBalanceLeft
     */
    public void setMainBalanceLeft(java.lang.Long mainBalanceLeft) {
        this.mainBalanceLeft = mainBalanceLeft;
    }


    /**
     * Gets the visitedPartner value for this QueryCDRResultCDRInfo.
     * 
     * @return visitedPartner
     */
    public java.lang.String getVisitedPartner() {
        return visitedPartner;
    }


    /**
     * Sets the visitedPartner value for this QueryCDRResultCDRInfo.
     * 
     * @param visitedPartner
     */
    public void setVisitedPartner(java.lang.String visitedPartner) {
        this.visitedPartner = visitedPartner;
    }


    /**
     * Gets the additionalProperty value for this QueryCDRResultCDRInfo.
     * 
     * @return additionalProperty   * It is reserved for future extension
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoAdditionalProperty[] getAdditionalProperty() {
        return additionalProperty;
    }


    /**
     * Sets the additionalProperty value for this QueryCDRResultCDRInfo.
     * 
     * @param additionalProperty   * It is reserved for future extension
     */
    public void setAdditionalProperty(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoAdditionalProperty[] additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoAdditionalProperty getAdditionalProperty(int i) {
        return this.additionalProperty[i];
    }

    public void setAdditionalProperty(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoAdditionalProperty _value) {
        this.additionalProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCDRResultCDRInfo)) return false;
        QueryCDRResultCDRInfo other = (QueryCDRResultCDRInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdrSeq==null && other.getCdrSeq()==null) || 
             (this.cdrSeq!=null &&
              this.cdrSeq.equals(other.getCdrSeq()))) &&
            ((this.serviceCategory==null && other.getServiceCategory()==null) || 
             (this.serviceCategory!=null &&
              this.serviceCategory.equals(other.getServiceCategory()))) &&
            ((this.seriveType==null && other.getSeriveType()==null) || 
             (this.seriveType!=null &&
              this.seriveType.equals(other.getSeriveType()))) &&
            ((this.serviceTypeName==null && other.getServiceTypeName()==null) || 
             (this.serviceTypeName!=null &&
              this.serviceTypeName.equals(other.getServiceTypeName()))) &&
            ((this.subKey==null && other.getSubKey()==null) || 
             (this.subKey!=null &&
              this.subKey.equals(other.getSubKey()))) &&
            ((this.primaryIdentity==null && other.getPrimaryIdentity()==null) || 
             (this.primaryIdentity!=null &&
              this.primaryIdentity.equals(other.getPrimaryIdentity()))) &&
            ((this.accountKey==null && other.getAccountKey()==null) || 
             (this.accountKey!=null &&
              this.accountKey.equals(other.getAccountKey()))) &&
            ((this.otherNumber==null && other.getOtherNumber()==null) || 
             (this.otherNumber!=null &&
              this.otherNumber.equals(other.getOtherNumber()))) &&
            ((this.originalCalledParty==null && other.getOriginalCalledParty()==null) || 
             (this.originalCalledParty!=null &&
              this.originalCalledParty.equals(other.getOriginalCalledParty()))) &&
            ((this.flowType==null && other.getFlowType()==null) || 
             (this.flowType!=null &&
              this.flowType.equals(other.getFlowType()))) &&
            ((this.chargingPartyNumber==null && other.getChargingPartyNumber()==null) || 
             (this.chargingPartyNumber!=null &&
              this.chargingPartyNumber.equals(other.getChargingPartyNumber()))) &&
            ((this.roamFlag==null && other.getRoamFlag()==null) || 
             (this.roamFlag!=null &&
              this.roamFlag.equals(other.getRoamFlag()))) &&
            ((this.callingCellID==null && other.getCallingCellID()==null) || 
             (this.callingCellID!=null &&
              this.callingCellID.equals(other.getCallingCellID()))) &&
            ((this.calledCellID==null && other.getCalledCellID()==null) || 
             (this.calledCellID!=null &&
              this.calledCellID.equals(other.getCalledCellID()))) &&
            ((this.areaInfo==null && other.getAreaInfo()==null) || 
             (this.areaInfo!=null &&
              this.areaInfo.equals(other.getAreaInfo()))) &&
            ((this.refundIndicator==null && other.getRefundIndicator()==null) || 
             (this.refundIndicator!=null &&
              this.refundIndicator.equals(other.getRefundIndicator()))) &&
            ((this.specialNumberIndicator==null && other.getSpecialNumberIndicator()==null) || 
             (this.specialNumberIndicator!=null &&
              this.specialNumberIndicator.equals(other.getSpecialNumberIndicator()))) &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              this.serviceID.equals(other.getServiceID()))) &&
            ((this.spCpID==null && other.getSpCpID()==null) || 
             (this.spCpID!=null &&
              this.spCpID.equals(other.getSpCpID()))) &&
            ((this.categoryID==null && other.getCategoryID()==null) || 
             (this.categoryID!=null &&
              this.categoryID.equals(other.getCategoryID()))) &&
            ((this.contentID==null && other.getContentID()==null) || 
             (this.contentID!=null &&
              this.contentID.equals(other.getContentID()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.billCycleID==null && other.getBillCycleID()==null) || 
             (this.billCycleID!=null &&
              this.billCycleID.equals(other.getBillCycleID()))) &&
            ((this.volumeInfo==null && other.getVolumeInfo()==null) || 
             (this.volumeInfo!=null &&
              this.volumeInfo.equals(other.getVolumeInfo()))) &&
            ((this.totalChargeInfo==null && other.getTotalChargeInfo()==null) || 
             (this.totalChargeInfo!=null &&
              this.totalChargeInfo.equals(other.getTotalChargeInfo()))) &&
            ((this.chargeDetail==null && other.getChargeDetail()==null) || 
             (this.chargeDetail!=null &&
              java.util.Arrays.equals(this.chargeDetail, other.getChargeDetail()))) &&
            ((this.mainBalanceDeduct==null && other.getMainBalanceDeduct()==null) || 
             (this.mainBalanceDeduct!=null &&
              this.mainBalanceDeduct.equals(other.getMainBalanceDeduct()))) &&
            ((this.mainBalanceLeft==null && other.getMainBalanceLeft()==null) || 
             (this.mainBalanceLeft!=null &&
              this.mainBalanceLeft.equals(other.getMainBalanceLeft()))) &&
            ((this.visitedPartner==null && other.getVisitedPartner()==null) || 
             (this.visitedPartner!=null &&
              this.visitedPartner.equals(other.getVisitedPartner()))) &&
            ((this.additionalProperty==null && other.getAdditionalProperty()==null) || 
             (this.additionalProperty!=null &&
              java.util.Arrays.equals(this.additionalProperty, other.getAdditionalProperty())));
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
        if (getCdrSeq() != null) {
            _hashCode += getCdrSeq().hashCode();
        }
        if (getServiceCategory() != null) {
            _hashCode += getServiceCategory().hashCode();
        }
        if (getSeriveType() != null) {
            _hashCode += getSeriveType().hashCode();
        }
        if (getServiceTypeName() != null) {
            _hashCode += getServiceTypeName().hashCode();
        }
        if (getSubKey() != null) {
            _hashCode += getSubKey().hashCode();
        }
        if (getPrimaryIdentity() != null) {
            _hashCode += getPrimaryIdentity().hashCode();
        }
        if (getAccountKey() != null) {
            _hashCode += getAccountKey().hashCode();
        }
        if (getOtherNumber() != null) {
            _hashCode += getOtherNumber().hashCode();
        }
        if (getOriginalCalledParty() != null) {
            _hashCode += getOriginalCalledParty().hashCode();
        }
        if (getFlowType() != null) {
            _hashCode += getFlowType().hashCode();
        }
        if (getChargingPartyNumber() != null) {
            _hashCode += getChargingPartyNumber().hashCode();
        }
        if (getRoamFlag() != null) {
            _hashCode += getRoamFlag().hashCode();
        }
        if (getCallingCellID() != null) {
            _hashCode += getCallingCellID().hashCode();
        }
        if (getCalledCellID() != null) {
            _hashCode += getCalledCellID().hashCode();
        }
        if (getAreaInfo() != null) {
            _hashCode += getAreaInfo().hashCode();
        }
        if (getRefundIndicator() != null) {
            _hashCode += getRefundIndicator().hashCode();
        }
        if (getSpecialNumberIndicator() != null) {
            _hashCode += getSpecialNumberIndicator().hashCode();
        }
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
        }
        if (getSpCpID() != null) {
            _hashCode += getSpCpID().hashCode();
        }
        if (getCategoryID() != null) {
            _hashCode += getCategoryID().hashCode();
        }
        if (getContentID() != null) {
            _hashCode += getContentID().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getBillCycleID() != null) {
            _hashCode += getBillCycleID().hashCode();
        }
        if (getVolumeInfo() != null) {
            _hashCode += getVolumeInfo().hashCode();
        }
        if (getTotalChargeInfo() != null) {
            _hashCode += getTotalChargeInfo().hashCode();
        }
        if (getChargeDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChargeDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChargeDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMainBalanceDeduct() != null) {
            _hashCode += getMainBalanceDeduct().hashCode();
        }
        if (getMainBalanceLeft() != null) {
            _hashCode += getMainBalanceLeft().hashCode();
        }
        if (getVisitedPartner() != null) {
            _hashCode += getVisitedPartner().hashCode();
        }
        if (getAdditionalProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalProperty(), i);
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
        new org.apache.axis.description.TypeDesc(QueryCDRResultCDRInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRResult>CDRInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdrSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CdrSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ServiceCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seriveType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "SeriveType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ServiceTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "SubKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "PrimaryIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AccountKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "OtherNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalCalledParty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "OriginalCalledParty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FlowType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingPartyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ChargingPartyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roamFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "RoamFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingCellID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CallingCellID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledCellID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CalledCellID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AreaInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRInfo>AreaInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "RefundIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialNumberIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "SpecialNumberIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ServiceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spCpID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "SpCpID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CategoryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ContentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "BillCycleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "VolumeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRInfo>VolumeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalChargeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "TotalChargeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRInfo>TotalChargeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ChargeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRInfo>ChargeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainBalanceDeduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "MainBalanceDeduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainBalanceLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "MainBalanceLeft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visitedPartner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "VisitedPartner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AdditionalProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRInfo>AdditionalProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
