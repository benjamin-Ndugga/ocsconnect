/**
 * BatchOperationRequestBatchModifyVoucherState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class BatchOperationRequestBatchModifyVoucherState  implements java.io.Serializable {
    private java.lang.String fileName;

    private int cardFlag;

    private java.lang.String operationDes;

    public BatchOperationRequestBatchModifyVoucherState() {
    }

    public BatchOperationRequestBatchModifyVoucherState(
           java.lang.String fileName,
           int cardFlag,
           java.lang.String operationDes) {
           this.fileName = fileName;
           this.cardFlag = cardFlag;
           this.operationDes = operationDes;
    }


    /**
     * Gets the fileName value for this BatchOperationRequestBatchModifyVoucherState.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BatchOperationRequestBatchModifyVoucherState.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the cardFlag value for this BatchOperationRequestBatchModifyVoucherState.
     * 
     * @return cardFlag
     */
    public int getCardFlag() {
        return cardFlag;
    }


    /**
     * Sets the cardFlag value for this BatchOperationRequestBatchModifyVoucherState.
     * 
     * @param cardFlag
     */
    public void setCardFlag(int cardFlag) {
        this.cardFlag = cardFlag;
    }


    /**
     * Gets the operationDes value for this BatchOperationRequestBatchModifyVoucherState.
     * 
     * @return operationDes
     */
    public java.lang.String getOperationDes() {
        return operationDes;
    }


    /**
     * Sets the operationDes value for this BatchOperationRequestBatchModifyVoucherState.
     * 
     * @param operationDes
     */
    public void setOperationDes(java.lang.String operationDes) {
        this.operationDes = operationDes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchOperationRequestBatchModifyVoucherState)) return false;
        BatchOperationRequestBatchModifyVoucherState other = (BatchOperationRequestBatchModifyVoucherState) obj;
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
            this.cardFlag == other.getCardFlag() &&
            ((this.operationDes==null && other.getOperationDes()==null) || 
             (this.operationDes!=null &&
              this.operationDes.equals(other.getOperationDes())));
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
        _hashCode += getCardFlag();
        if (getOperationDes() != null) {
            _hashCode += getOperationDes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchOperationRequestBatchModifyVoucherState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchModifyVoucherState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CardFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OperationDes"));
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
