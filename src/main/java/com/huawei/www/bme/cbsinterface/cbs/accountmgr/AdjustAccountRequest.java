/**
 * AdjustAccountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class AdjustAccountRequest  implements java.io.Serializable {
    private java.lang.String logID;

    private java.lang.String oldLogID;

    private java.lang.String subscriberNo;

    private int operateType;

    private java.lang.Integer rtner;

    private java.lang.String additionalInfo;

    private java.lang.String SPCode;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.ModifyAcctFeeType[] modifyAcctFeeList;

    private java.lang.String custID;

    private java.lang.Integer validityIncrement;

    private java.lang.String merchant;

    private java.lang.String service;

    private java.lang.String reserve;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.AdjustAccountRequestModifyType modifyType;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.AdjustAccountRequestOverDraftFlag overDraftFlag;

    public AdjustAccountRequest() {
    }

    public AdjustAccountRequest(
           java.lang.String logID,
           java.lang.String oldLogID,
           java.lang.String subscriberNo,
           int operateType,
           java.lang.Integer rtner,
           java.lang.String additionalInfo,
           java.lang.String SPCode,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.ModifyAcctFeeType[] modifyAcctFeeList,
           java.lang.String custID,
           java.lang.Integer validityIncrement,
           java.lang.String merchant,
           java.lang.String service,
           java.lang.String reserve,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.AdjustAccountRequestModifyType modifyType,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.AdjustAccountRequestOverDraftFlag overDraftFlag) {
           this.logID = logID;
           this.oldLogID = oldLogID;
           this.subscriberNo = subscriberNo;
           this.operateType = operateType;
           this.rtner = rtner;
           this.additionalInfo = additionalInfo;
           this.SPCode = SPCode;
           this.modifyAcctFeeList = modifyAcctFeeList;
           this.custID = custID;
           this.validityIncrement = validityIncrement;
           this.merchant = merchant;
           this.service = service;
           this.reserve = reserve;
           this.modifyType = modifyType;
           this.overDraftFlag = overDraftFlag;
    }


    /**
     * Gets the logID value for this AdjustAccountRequest.
     * 
     * @return logID
     */
    public java.lang.String getLogID() {
        return logID;
    }


    /**
     * Sets the logID value for this AdjustAccountRequest.
     * 
     * @param logID
     */
    public void setLogID(java.lang.String logID) {
        this.logID = logID;
    }


    /**
     * Gets the oldLogID value for this AdjustAccountRequest.
     * 
     * @return oldLogID
     */
    public java.lang.String getOldLogID() {
        return oldLogID;
    }


    /**
     * Sets the oldLogID value for this AdjustAccountRequest.
     * 
     * @param oldLogID
     */
    public void setOldLogID(java.lang.String oldLogID) {
        this.oldLogID = oldLogID;
    }


    /**
     * Gets the subscriberNo value for this AdjustAccountRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this AdjustAccountRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the operateType value for this AdjustAccountRequest.
     * 
     * @return operateType
     */
    public int getOperateType() {
        return operateType;
    }


    /**
     * Sets the operateType value for this AdjustAccountRequest.
     * 
     * @param operateType
     */
    public void setOperateType(int operateType) {
        this.operateType = operateType;
    }


    /**
     * Gets the rtner value for this AdjustAccountRequest.
     * 
     * @return rtner
     */
    public java.lang.Integer getRtner() {
        return rtner;
    }


    /**
     * Sets the rtner value for this AdjustAccountRequest.
     * 
     * @param rtner
     */
    public void setRtner(java.lang.Integer rtner) {
        this.rtner = rtner;
    }


    /**
     * Gets the additionalInfo value for this AdjustAccountRequest.
     * 
     * @return additionalInfo
     */
    public java.lang.String getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this AdjustAccountRequest.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(java.lang.String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the SPCode value for this AdjustAccountRequest.
     * 
     * @return SPCode
     */
    public java.lang.String getSPCode() {
        return SPCode;
    }


    /**
     * Sets the SPCode value for this AdjustAccountRequest.
     * 
     * @param SPCode
     */
    public void setSPCode(java.lang.String SPCode) {
        this.SPCode = SPCode;
    }


    /**
     * Gets the modifyAcctFeeList value for this AdjustAccountRequest.
     * 
     * @return modifyAcctFeeList
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.ModifyAcctFeeType[] getModifyAcctFeeList() {
        return modifyAcctFeeList;
    }


    /**
     * Sets the modifyAcctFeeList value for this AdjustAccountRequest.
     * 
     * @param modifyAcctFeeList
     */
    public void setModifyAcctFeeList(com.huawei.www.bme.cbsinterface.cbs.accountmgr.ModifyAcctFeeType[] modifyAcctFeeList) {
        this.modifyAcctFeeList = modifyAcctFeeList;
    }


    /**
     * Gets the custID value for this AdjustAccountRequest.
     * 
     * @return custID
     */
    public java.lang.String getCustID() {
        return custID;
    }


    /**
     * Sets the custID value for this AdjustAccountRequest.
     * 
     * @param custID
     */
    public void setCustID(java.lang.String custID) {
        this.custID = custID;
    }


    /**
     * Gets the validityIncrement value for this AdjustAccountRequest.
     * 
     * @return validityIncrement
     */
    public java.lang.Integer getValidityIncrement() {
        return validityIncrement;
    }


    /**
     * Sets the validityIncrement value for this AdjustAccountRequest.
     * 
     * @param validityIncrement
     */
    public void setValidityIncrement(java.lang.Integer validityIncrement) {
        this.validityIncrement = validityIncrement;
    }


    /**
     * Gets the merchant value for this AdjustAccountRequest.
     * 
     * @return merchant
     */
    public java.lang.String getMerchant() {
        return merchant;
    }


    /**
     * Sets the merchant value for this AdjustAccountRequest.
     * 
     * @param merchant
     */
    public void setMerchant(java.lang.String merchant) {
        this.merchant = merchant;
    }


    /**
     * Gets the service value for this AdjustAccountRequest.
     * 
     * @return service
     */
    public java.lang.String getService() {
        return service;
    }


    /**
     * Sets the service value for this AdjustAccountRequest.
     * 
     * @param service
     */
    public void setService(java.lang.String service) {
        this.service = service;
    }


    /**
     * Gets the reserve value for this AdjustAccountRequest.
     * 
     * @return reserve
     */
    public java.lang.String getReserve() {
        return reserve;
    }


    /**
     * Sets the reserve value for this AdjustAccountRequest.
     * 
     * @param reserve
     */
    public void setReserve(java.lang.String reserve) {
        this.reserve = reserve;
    }


    /**
     * Gets the modifyType value for this AdjustAccountRequest.
     * 
     * @return modifyType
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.AdjustAccountRequestModifyType getModifyType() {
        return modifyType;
    }


    /**
     * Sets the modifyType value for this AdjustAccountRequest.
     * 
     * @param modifyType
     */
    public void setModifyType(com.huawei.www.bme.cbsinterface.cbs.accountmgr.AdjustAccountRequestModifyType modifyType) {
        this.modifyType = modifyType;
    }


    /**
     * Gets the overDraftFlag value for this AdjustAccountRequest.
     * 
     * @return overDraftFlag
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.AdjustAccountRequestOverDraftFlag getOverDraftFlag() {
        return overDraftFlag;
    }


    /**
     * Sets the overDraftFlag value for this AdjustAccountRequest.
     * 
     * @param overDraftFlag
     */
    public void setOverDraftFlag(com.huawei.www.bme.cbsinterface.cbs.accountmgr.AdjustAccountRequestOverDraftFlag overDraftFlag) {
        this.overDraftFlag = overDraftFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdjustAccountRequest)) return false;
        AdjustAccountRequest other = (AdjustAccountRequest) obj;
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
            ((this.oldLogID==null && other.getOldLogID()==null) || 
             (this.oldLogID!=null &&
              this.oldLogID.equals(other.getOldLogID()))) &&
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            this.operateType == other.getOperateType() &&
            ((this.rtner==null && other.getRtner()==null) || 
             (this.rtner!=null &&
              this.rtner.equals(other.getRtner()))) &&
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              this.additionalInfo.equals(other.getAdditionalInfo()))) &&
            ((this.SPCode==null && other.getSPCode()==null) || 
             (this.SPCode!=null &&
              this.SPCode.equals(other.getSPCode()))) &&
            ((this.modifyAcctFeeList==null && other.getModifyAcctFeeList()==null) || 
             (this.modifyAcctFeeList!=null &&
              java.util.Arrays.equals(this.modifyAcctFeeList, other.getModifyAcctFeeList()))) &&
            ((this.custID==null && other.getCustID()==null) || 
             (this.custID!=null &&
              this.custID.equals(other.getCustID()))) &&
            ((this.validityIncrement==null && other.getValidityIncrement()==null) || 
             (this.validityIncrement!=null &&
              this.validityIncrement.equals(other.getValidityIncrement()))) &&
            ((this.merchant==null && other.getMerchant()==null) || 
             (this.merchant!=null &&
              this.merchant.equals(other.getMerchant()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.reserve==null && other.getReserve()==null) || 
             (this.reserve!=null &&
              this.reserve.equals(other.getReserve()))) &&
            ((this.modifyType==null && other.getModifyType()==null) || 
             (this.modifyType!=null &&
              this.modifyType.equals(other.getModifyType()))) &&
            ((this.overDraftFlag==null && other.getOverDraftFlag()==null) || 
             (this.overDraftFlag!=null &&
              this.overDraftFlag.equals(other.getOverDraftFlag())));
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
        if (getOldLogID() != null) {
            _hashCode += getOldLogID().hashCode();
        }
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        _hashCode += getOperateType();
        if (getRtner() != null) {
            _hashCode += getRtner().hashCode();
        }
        if (getAdditionalInfo() != null) {
            _hashCode += getAdditionalInfo().hashCode();
        }
        if (getSPCode() != null) {
            _hashCode += getSPCode().hashCode();
        }
        if (getModifyAcctFeeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModifyAcctFeeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModifyAcctFeeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustID() != null) {
            _hashCode += getCustID().hashCode();
        }
        if (getValidityIncrement() != null) {
            _hashCode += getValidityIncrement().hashCode();
        }
        if (getMerchant() != null) {
            _hashCode += getMerchant().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getReserve() != null) {
            _hashCode += getReserve().hashCode();
        }
        if (getModifyType() != null) {
            _hashCode += getModifyType().hashCode();
        }
        if (getOverDraftFlag() != null) {
            _hashCode += getOverDraftFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdjustAccountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AdjustAccountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LogID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldLogID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OldLogID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OperateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Rtner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SPCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyAcctFeeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifyAcctFeeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifyAcctFeeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifyAcctFee"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CustID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityIncrement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ValidityIncrement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Merchant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserve");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Reserve"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">AdjustAccountRequest>ModifyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overDraftFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OverDraftFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">AdjustAccountRequest>OverDraftFlag"));
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
