/**
 * Charge2BillRollbackRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class Charge2BillRollbackRequest  implements java.io.Serializable {
    private java.lang.String charge2BillSerialNo;

    private com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestAcctAccessCode acctAccessCode;

    private com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode subAccessCode;

    private com.huawei.www.bme.cbsinterface.bbcommon.SubGroupAccessCode subGroupAccessCode;

    private com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestRollBackFeeValues[] rollBackFeeValues;

    public Charge2BillRollbackRequest() {
    }

    public Charge2BillRollbackRequest(
           java.lang.String charge2BillSerialNo,
           com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestAcctAccessCode acctAccessCode,
           com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode subAccessCode,
           com.huawei.www.bme.cbsinterface.bbcommon.SubGroupAccessCode subGroupAccessCode,
           com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestRollBackFeeValues[] rollBackFeeValues) {
           this.charge2BillSerialNo = charge2BillSerialNo;
           this.acctAccessCode = acctAccessCode;
           this.subAccessCode = subAccessCode;
           this.subGroupAccessCode = subGroupAccessCode;
           this.rollBackFeeValues = rollBackFeeValues;
    }


    /**
     * Gets the charge2BillSerialNo value for this Charge2BillRollbackRequest.
     * 
     * @return charge2BillSerialNo
     */
    public java.lang.String getCharge2BillSerialNo() {
        return charge2BillSerialNo;
    }


    /**
     * Sets the charge2BillSerialNo value for this Charge2BillRollbackRequest.
     * 
     * @param charge2BillSerialNo
     */
    public void setCharge2BillSerialNo(java.lang.String charge2BillSerialNo) {
        this.charge2BillSerialNo = charge2BillSerialNo;
    }


    /**
     * Gets the acctAccessCode value for this Charge2BillRollbackRequest.
     * 
     * @return acctAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestAcctAccessCode getAcctAccessCode() {
        return acctAccessCode;
    }


    /**
     * Sets the acctAccessCode value for this Charge2BillRollbackRequest.
     * 
     * @param acctAccessCode
     */
    public void setAcctAccessCode(com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestAcctAccessCode acctAccessCode) {
        this.acctAccessCode = acctAccessCode;
    }


    /**
     * Gets the subAccessCode value for this Charge2BillRollbackRequest.
     * 
     * @return subAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }


    /**
     * Sets the subAccessCode value for this Charge2BillRollbackRequest.
     * 
     * @param subAccessCode
     */
    public void setSubAccessCode(com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }


    /**
     * Gets the subGroupAccessCode value for this Charge2BillRollbackRequest.
     * 
     * @return subGroupAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bbcommon.SubGroupAccessCode getSubGroupAccessCode() {
        return subGroupAccessCode;
    }


    /**
     * Sets the subGroupAccessCode value for this Charge2BillRollbackRequest.
     * 
     * @param subGroupAccessCode
     */
    public void setSubGroupAccessCode(com.huawei.www.bme.cbsinterface.bbcommon.SubGroupAccessCode subGroupAccessCode) {
        this.subGroupAccessCode = subGroupAccessCode;
    }


    /**
     * Gets the rollBackFeeValues value for this Charge2BillRollbackRequest.
     * 
     * @return rollBackFeeValues
     */
    public com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestRollBackFeeValues[] getRollBackFeeValues() {
        return rollBackFeeValues;
    }


    /**
     * Sets the rollBackFeeValues value for this Charge2BillRollbackRequest.
     * 
     * @param rollBackFeeValues
     */
    public void setRollBackFeeValues(com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestRollBackFeeValues[] rollBackFeeValues) {
        this.rollBackFeeValues = rollBackFeeValues;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestRollBackFeeValues getRollBackFeeValues(int i) {
        return this.rollBackFeeValues[i];
    }

    public void setRollBackFeeValues(int i, com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestRollBackFeeValues _value) {
        this.rollBackFeeValues[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Charge2BillRollbackRequest)) return false;
        Charge2BillRollbackRequest other = (Charge2BillRollbackRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.charge2BillSerialNo==null && other.getCharge2BillSerialNo()==null) || 
             (this.charge2BillSerialNo!=null &&
              this.charge2BillSerialNo.equals(other.getCharge2BillSerialNo()))) &&
            ((this.acctAccessCode==null && other.getAcctAccessCode()==null) || 
             (this.acctAccessCode!=null &&
              this.acctAccessCode.equals(other.getAcctAccessCode()))) &&
            ((this.subAccessCode==null && other.getSubAccessCode()==null) || 
             (this.subAccessCode!=null &&
              this.subAccessCode.equals(other.getSubAccessCode()))) &&
            ((this.subGroupAccessCode==null && other.getSubGroupAccessCode()==null) || 
             (this.subGroupAccessCode!=null &&
              this.subGroupAccessCode.equals(other.getSubGroupAccessCode()))) &&
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
        if (getCharge2BillSerialNo() != null) {
            _hashCode += getCharge2BillSerialNo().hashCode();
        }
        if (getAcctAccessCode() != null) {
            _hashCode += getAcctAccessCode().hashCode();
        }
        if (getSubAccessCode() != null) {
            _hashCode += getSubAccessCode().hashCode();
        }
        if (getSubGroupAccessCode() != null) {
            _hashCode += getSubGroupAccessCode().hashCode();
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
        new org.apache.axis.description.TypeDesc(Charge2BillRollbackRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Charge2BillRollbackRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge2BillSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Charge2BillSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AcctAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillRollbackRequest>AcctAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "SubAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SubAccessCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "SubGroupAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SubGroupAccessCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rollBackFeeValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "RollBackFeeValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillRollbackRequest>RollBackFeeValues"));
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
