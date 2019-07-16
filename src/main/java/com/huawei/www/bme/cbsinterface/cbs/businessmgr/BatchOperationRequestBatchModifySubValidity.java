/**
 * BatchOperationRequestBatchModifySubValidity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class BatchOperationRequestBatchModifySubValidity  implements java.io.Serializable {
    private java.lang.String fileName;

    private int validityIncrement;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifySubValidityModifyType modifyType;

    private java.lang.String operationDes;

    private java.lang.Integer SUSCHGDAYS;

    private java.lang.Integer DISCHGDAYS;

    private java.lang.Integer updateType;

    public BatchOperationRequestBatchModifySubValidity() {
    }

    public BatchOperationRequestBatchModifySubValidity(
           java.lang.String fileName,
           int validityIncrement,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifySubValidityModifyType modifyType,
           java.lang.String operationDes,
           java.lang.Integer SUSCHGDAYS,
           java.lang.Integer DISCHGDAYS,
           java.lang.Integer updateType) {
           this.fileName = fileName;
           this.validityIncrement = validityIncrement;
           this.modifyType = modifyType;
           this.operationDes = operationDes;
           this.SUSCHGDAYS = SUSCHGDAYS;
           this.DISCHGDAYS = DISCHGDAYS;
           this.updateType = updateType;
    }


    /**
     * Gets the fileName value for this BatchOperationRequestBatchModifySubValidity.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BatchOperationRequestBatchModifySubValidity.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the validityIncrement value for this BatchOperationRequestBatchModifySubValidity.
     * 
     * @return validityIncrement
     */
    public int getValidityIncrement() {
        return validityIncrement;
    }


    /**
     * Sets the validityIncrement value for this BatchOperationRequestBatchModifySubValidity.
     * 
     * @param validityIncrement
     */
    public void setValidityIncrement(int validityIncrement) {
        this.validityIncrement = validityIncrement;
    }


    /**
     * Gets the modifyType value for this BatchOperationRequestBatchModifySubValidity.
     * 
     * @return modifyType
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifySubValidityModifyType getModifyType() {
        return modifyType;
    }


    /**
     * Sets the modifyType value for this BatchOperationRequestBatchModifySubValidity.
     * 
     * @param modifyType
     */
    public void setModifyType(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchModifySubValidityModifyType modifyType) {
        this.modifyType = modifyType;
    }


    /**
     * Gets the operationDes value for this BatchOperationRequestBatchModifySubValidity.
     * 
     * @return operationDes
     */
    public java.lang.String getOperationDes() {
        return operationDes;
    }


    /**
     * Sets the operationDes value for this BatchOperationRequestBatchModifySubValidity.
     * 
     * @param operationDes
     */
    public void setOperationDes(java.lang.String operationDes) {
        this.operationDes = operationDes;
    }


    /**
     * Gets the SUSCHGDAYS value for this BatchOperationRequestBatchModifySubValidity.
     * 
     * @return SUSCHGDAYS
     */
    public java.lang.Integer getSUSCHGDAYS() {
        return SUSCHGDAYS;
    }


    /**
     * Sets the SUSCHGDAYS value for this BatchOperationRequestBatchModifySubValidity.
     * 
     * @param SUSCHGDAYS
     */
    public void setSUSCHGDAYS(java.lang.Integer SUSCHGDAYS) {
        this.SUSCHGDAYS = SUSCHGDAYS;
    }


    /**
     * Gets the DISCHGDAYS value for this BatchOperationRequestBatchModifySubValidity.
     * 
     * @return DISCHGDAYS
     */
    public java.lang.Integer getDISCHGDAYS() {
        return DISCHGDAYS;
    }


    /**
     * Sets the DISCHGDAYS value for this BatchOperationRequestBatchModifySubValidity.
     * 
     * @param DISCHGDAYS
     */
    public void setDISCHGDAYS(java.lang.Integer DISCHGDAYS) {
        this.DISCHGDAYS = DISCHGDAYS;
    }


    /**
     * Gets the updateType value for this BatchOperationRequestBatchModifySubValidity.
     * 
     * @return updateType
     */
    public java.lang.Integer getUpdateType() {
        return updateType;
    }


    /**
     * Sets the updateType value for this BatchOperationRequestBatchModifySubValidity.
     * 
     * @param updateType
     */
    public void setUpdateType(java.lang.Integer updateType) {
        this.updateType = updateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchOperationRequestBatchModifySubValidity)) return false;
        BatchOperationRequestBatchModifySubValidity other = (BatchOperationRequestBatchModifySubValidity) obj;
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
            this.validityIncrement == other.getValidityIncrement() &&
            ((this.modifyType==null && other.getModifyType()==null) || 
             (this.modifyType!=null &&
              this.modifyType.equals(other.getModifyType()))) &&
            ((this.operationDes==null && other.getOperationDes()==null) || 
             (this.operationDes!=null &&
              this.operationDes.equals(other.getOperationDes()))) &&
            ((this.SUSCHGDAYS==null && other.getSUSCHGDAYS()==null) || 
             (this.SUSCHGDAYS!=null &&
              this.SUSCHGDAYS.equals(other.getSUSCHGDAYS()))) &&
            ((this.DISCHGDAYS==null && other.getDISCHGDAYS()==null) || 
             (this.DISCHGDAYS!=null &&
              this.DISCHGDAYS.equals(other.getDISCHGDAYS()))) &&
            ((this.updateType==null && other.getUpdateType()==null) || 
             (this.updateType!=null &&
              this.updateType.equals(other.getUpdateType())));
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
        _hashCode += getValidityIncrement();
        if (getModifyType() != null) {
            _hashCode += getModifyType().hashCode();
        }
        if (getOperationDes() != null) {
            _hashCode += getOperationDes().hashCode();
        }
        if (getSUSCHGDAYS() != null) {
            _hashCode += getSUSCHGDAYS().hashCode();
        }
        if (getDISCHGDAYS() != null) {
            _hashCode += getDISCHGDAYS().hashCode();
        }
        if (getUpdateType() != null) {
            _hashCode += getUpdateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchOperationRequestBatchModifySubValidity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchModifySubValidity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityIncrement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ValidityIncrement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ModifyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>BatchOperationRequest>BatchModifySubValidity>ModifyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OperationDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUSCHGDAYS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SUSCHGDAYS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISCHGDAYS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "DISCHGDAYS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "UpdateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
