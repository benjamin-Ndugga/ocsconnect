/**
 * BatchAdjustmentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchAdjustmentRequest  implements java.io.Serializable {
    /* It is used to indicate the operation is adjustment or reset */
    private java.lang.String opType;

    private java.lang.String fileName;

    private com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestAdjustmentInfo[] adjustmentInfo;

    private com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestFreeUnitAdjustmentInfo[] freeUnitAdjustmentInfo;

    private java.lang.String adjustmentReasonCode;

    public BatchAdjustmentRequest() {
    }

    public BatchAdjustmentRequest(
           java.lang.String opType,
           java.lang.String fileName,
           com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestAdjustmentInfo[] adjustmentInfo,
           com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestFreeUnitAdjustmentInfo[] freeUnitAdjustmentInfo,
           java.lang.String adjustmentReasonCode) {
           this.opType = opType;
           this.fileName = fileName;
           this.adjustmentInfo = adjustmentInfo;
           this.freeUnitAdjustmentInfo = freeUnitAdjustmentInfo;
           this.adjustmentReasonCode = adjustmentReasonCode;
    }


    /**
     * Gets the opType value for this BatchAdjustmentRequest.
     * 
     * @return opType   * It is used to indicate the operation is adjustment or reset
     */
    public java.lang.String getOpType() {
        return opType;
    }


    /**
     * Sets the opType value for this BatchAdjustmentRequest.
     * 
     * @param opType   * It is used to indicate the operation is adjustment or reset
     */
    public void setOpType(java.lang.String opType) {
        this.opType = opType;
    }


    /**
     * Gets the fileName value for this BatchAdjustmentRequest.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BatchAdjustmentRequest.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the adjustmentInfo value for this BatchAdjustmentRequest.
     * 
     * @return adjustmentInfo
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestAdjustmentInfo[] getAdjustmentInfo() {
        return adjustmentInfo;
    }


    /**
     * Sets the adjustmentInfo value for this BatchAdjustmentRequest.
     * 
     * @param adjustmentInfo
     */
    public void setAdjustmentInfo(com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestAdjustmentInfo[] adjustmentInfo) {
        this.adjustmentInfo = adjustmentInfo;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestAdjustmentInfo getAdjustmentInfo(int i) {
        return this.adjustmentInfo[i];
    }

    public void setAdjustmentInfo(int i, com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestAdjustmentInfo _value) {
        this.adjustmentInfo[i] = _value;
    }


    /**
     * Gets the freeUnitAdjustmentInfo value for this BatchAdjustmentRequest.
     * 
     * @return freeUnitAdjustmentInfo
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestFreeUnitAdjustmentInfo[] getFreeUnitAdjustmentInfo() {
        return freeUnitAdjustmentInfo;
    }


    /**
     * Sets the freeUnitAdjustmentInfo value for this BatchAdjustmentRequest.
     * 
     * @param freeUnitAdjustmentInfo
     */
    public void setFreeUnitAdjustmentInfo(com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestFreeUnitAdjustmentInfo[] freeUnitAdjustmentInfo) {
        this.freeUnitAdjustmentInfo = freeUnitAdjustmentInfo;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestFreeUnitAdjustmentInfo getFreeUnitAdjustmentInfo(int i) {
        return this.freeUnitAdjustmentInfo[i];
    }

    public void setFreeUnitAdjustmentInfo(int i, com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestFreeUnitAdjustmentInfo _value) {
        this.freeUnitAdjustmentInfo[i] = _value;
    }


    /**
     * Gets the adjustmentReasonCode value for this BatchAdjustmentRequest.
     * 
     * @return adjustmentReasonCode
     */
    public java.lang.String getAdjustmentReasonCode() {
        return adjustmentReasonCode;
    }


    /**
     * Sets the adjustmentReasonCode value for this BatchAdjustmentRequest.
     * 
     * @param adjustmentReasonCode
     */
    public void setAdjustmentReasonCode(java.lang.String adjustmentReasonCode) {
        this.adjustmentReasonCode = adjustmentReasonCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchAdjustmentRequest)) return false;
        BatchAdjustmentRequest other = (BatchAdjustmentRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.opType==null && other.getOpType()==null) || 
             (this.opType!=null &&
              this.opType.equals(other.getOpType()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.adjustmentInfo==null && other.getAdjustmentInfo()==null) || 
             (this.adjustmentInfo!=null &&
              java.util.Arrays.equals(this.adjustmentInfo, other.getAdjustmentInfo()))) &&
            ((this.freeUnitAdjustmentInfo==null && other.getFreeUnitAdjustmentInfo()==null) || 
             (this.freeUnitAdjustmentInfo!=null &&
              java.util.Arrays.equals(this.freeUnitAdjustmentInfo, other.getFreeUnitAdjustmentInfo()))) &&
            ((this.adjustmentReasonCode==null && other.getAdjustmentReasonCode()==null) || 
             (this.adjustmentReasonCode!=null &&
              this.adjustmentReasonCode.equals(other.getAdjustmentReasonCode())));
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
        if (getOpType() != null) {
            _hashCode += getOpType().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getAdjustmentInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdjustmentInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdjustmentInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFreeUnitAdjustmentInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeUnitAdjustmentInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeUnitAdjustmentInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdjustmentReasonCode() != null) {
            _hashCode += getAdjustmentReasonCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchAdjustmentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchAdjustmentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OpType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AdjustmentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchAdjustmentRequest>AdjustmentInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitAdjustmentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FreeUnitAdjustmentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchAdjustmentRequest>FreeUnitAdjustmentInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AdjustmentReasonCode"));
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
