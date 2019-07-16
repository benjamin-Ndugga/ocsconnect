/**
 * FeeDeductionRollBackRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class FeeDeductionRollBackRequest  implements java.io.Serializable {
    private java.lang.String deductSerialNo;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestDeductObj deductObj;

    /* added in CBS C30 */
    private com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestRollBackFeeValues[] rollBackFeeValues;

    public FeeDeductionRollBackRequest() {
    }

    public FeeDeductionRollBackRequest(
           java.lang.String deductSerialNo,
           com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestDeductObj deductObj,
           com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestRollBackFeeValues[] rollBackFeeValues) {
           this.deductSerialNo = deductSerialNo;
           this.deductObj = deductObj;
           this.rollBackFeeValues = rollBackFeeValues;
    }


    /**
     * Gets the deductSerialNo value for this FeeDeductionRollBackRequest.
     * 
     * @return deductSerialNo
     */
    public java.lang.String getDeductSerialNo() {
        return deductSerialNo;
    }


    /**
     * Sets the deductSerialNo value for this FeeDeductionRollBackRequest.
     * 
     * @param deductSerialNo
     */
    public void setDeductSerialNo(java.lang.String deductSerialNo) {
        this.deductSerialNo = deductSerialNo;
    }


    /**
     * Gets the deductObj value for this FeeDeductionRollBackRequest.
     * 
     * @return deductObj
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestDeductObj getDeductObj() {
        return deductObj;
    }


    /**
     * Sets the deductObj value for this FeeDeductionRollBackRequest.
     * 
     * @param deductObj
     */
    public void setDeductObj(com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestDeductObj deductObj) {
        this.deductObj = deductObj;
    }


    /**
     * Gets the rollBackFeeValues value for this FeeDeductionRollBackRequest.
     * 
     * @return rollBackFeeValues   * added in CBS C30
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestRollBackFeeValues[] getRollBackFeeValues() {
        return rollBackFeeValues;
    }


    /**
     * Sets the rollBackFeeValues value for this FeeDeductionRollBackRequest.
     * 
     * @param rollBackFeeValues   * added in CBS C30
     */
    public void setRollBackFeeValues(com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestRollBackFeeValues[] rollBackFeeValues) {
        this.rollBackFeeValues = rollBackFeeValues;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestRollBackFeeValues getRollBackFeeValues(int i) {
        return this.rollBackFeeValues[i];
    }

    public void setRollBackFeeValues(int i, com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestRollBackFeeValues _value) {
        this.rollBackFeeValues[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeDeductionRollBackRequest)) return false;
        FeeDeductionRollBackRequest other = (FeeDeductionRollBackRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deductSerialNo==null && other.getDeductSerialNo()==null) || 
             (this.deductSerialNo!=null &&
              this.deductSerialNo.equals(other.getDeductSerialNo()))) &&
            ((this.deductObj==null && other.getDeductObj()==null) || 
             (this.deductObj!=null &&
              this.deductObj.equals(other.getDeductObj()))) &&
            ((this.rollBackFeeValues==null && other.getRollBackFeeValues()==null) || 
             (this.rollBackFeeValues!=null &&
              java.util.Arrays.equals(this.rollBackFeeValues, other.getRollBackFeeValues())));
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
        if (getDeductSerialNo() != null) {
            _hashCode += getDeductSerialNo().hashCode();
        }
        if (getDeductObj() != null) {
            _hashCode += getDeductObj().hashCode();
        }
        if (getRollBackFeeValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRollBackFeeValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRollBackFeeValues(), i);
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
        new org.apache.axis.description.TypeDesc(FeeDeductionRollBackRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeDeductionRollBackRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DeductSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DeductObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRollBackRequest>DeductObj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rollBackFeeValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RollBackFeeValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRollBackRequest>RollBackFeeValues"));
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
