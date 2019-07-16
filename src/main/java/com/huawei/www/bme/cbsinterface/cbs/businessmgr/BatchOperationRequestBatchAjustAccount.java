/**
 * BatchOperationRequestBatchAjustAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class BatchOperationRequestBatchAjustAccount  implements java.io.Serializable {
    private java.lang.String fileName;

    private int operateType;

    private java.lang.Integer rtner;

    private java.lang.String additionalInfo;

    private java.lang.String SPCode;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchAjustAccountModifyAcctFeeListModifyAcctFee[] modifyAcctFeeList;

    private java.lang.Integer validityIncrement;

    private java.lang.String merchant;

    private java.lang.String service;

    public BatchOperationRequestBatchAjustAccount() {
    }

    public BatchOperationRequestBatchAjustAccount(
           java.lang.String fileName,
           int operateType,
           java.lang.Integer rtner,
           java.lang.String additionalInfo,
           java.lang.String SPCode,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchAjustAccountModifyAcctFeeListModifyAcctFee[] modifyAcctFeeList,
           java.lang.Integer validityIncrement,
           java.lang.String merchant,
           java.lang.String service) {
           this.fileName = fileName;
           this.operateType = operateType;
           this.rtner = rtner;
           this.additionalInfo = additionalInfo;
           this.SPCode = SPCode;
           this.modifyAcctFeeList = modifyAcctFeeList;
           this.validityIncrement = validityIncrement;
           this.merchant = merchant;
           this.service = service;
    }


    /**
     * Gets the fileName value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the operateType value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @return operateType
     */
    public int getOperateType() {
        return operateType;
    }


    /**
     * Sets the operateType value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @param operateType
     */
    public void setOperateType(int operateType) {
        this.operateType = operateType;
    }


    /**
     * Gets the rtner value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @return rtner
     */
    public java.lang.Integer getRtner() {
        return rtner;
    }


    /**
     * Sets the rtner value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @param rtner
     */
    public void setRtner(java.lang.Integer rtner) {
        this.rtner = rtner;
    }


    /**
     * Gets the additionalInfo value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @return additionalInfo
     */
    public java.lang.String getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(java.lang.String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the SPCode value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @return SPCode
     */
    public java.lang.String getSPCode() {
        return SPCode;
    }


    /**
     * Sets the SPCode value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @param SPCode
     */
    public void setSPCode(java.lang.String SPCode) {
        this.SPCode = SPCode;
    }


    /**
     * Gets the modifyAcctFeeList value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @return modifyAcctFeeList
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchAjustAccountModifyAcctFeeListModifyAcctFee[] getModifyAcctFeeList() {
        return modifyAcctFeeList;
    }


    /**
     * Sets the modifyAcctFeeList value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @param modifyAcctFeeList
     */
    public void setModifyAcctFeeList(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchAjustAccountModifyAcctFeeListModifyAcctFee[] modifyAcctFeeList) {
        this.modifyAcctFeeList = modifyAcctFeeList;
    }


    /**
     * Gets the validityIncrement value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @return validityIncrement
     */
    public java.lang.Integer getValidityIncrement() {
        return validityIncrement;
    }


    /**
     * Sets the validityIncrement value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @param validityIncrement
     */
    public void setValidityIncrement(java.lang.Integer validityIncrement) {
        this.validityIncrement = validityIncrement;
    }


    /**
     * Gets the merchant value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @return merchant
     */
    public java.lang.String getMerchant() {
        return merchant;
    }


    /**
     * Sets the merchant value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @param merchant
     */
    public void setMerchant(java.lang.String merchant) {
        this.merchant = merchant;
    }


    /**
     * Gets the service value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @return service
     */
    public java.lang.String getService() {
        return service;
    }


    /**
     * Sets the service value for this BatchOperationRequestBatchAjustAccount.
     * 
     * @param service
     */
    public void setService(java.lang.String service) {
        this.service = service;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchOperationRequestBatchAjustAccount)) return false;
        BatchOperationRequestBatchAjustAccount other = (BatchOperationRequestBatchAjustAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
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
            ((this.validityIncrement==null && other.getValidityIncrement()==null) || 
             (this.validityIncrement!=null &&
              this.validityIncrement.equals(other.getValidityIncrement()))) &&
            ((this.merchant==null && other.getMerchant()==null) || 
             (this.merchant!=null &&
              this.merchant.equals(other.getMerchant()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService())));
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
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
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
        if (getValidityIncrement() != null) {
            _hashCode += getValidityIncrement().hashCode();
        }
        if (getMerchant() != null) {
            _hashCode += getMerchant().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchOperationRequestBatchAjustAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchAjustAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OperateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Rtner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SPCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyAcctFeeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ModifyAcctFeeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>>BatchOperationRequest>BatchAjustAccount>ModifyAcctFeeList>ModifyAcctFee"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ModifyAcctFee"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityIncrement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ValidityIncrement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Merchant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Service"));
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
