/**
 * FeeDeductionRollBackResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class FeeDeductionRollBackResult  implements java.io.Serializable {
    private java.lang.String deductSerialNo;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultBalanceRollBack[] balanceRollBack;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultFreeUnitRollBack[] freeUnitRollBack;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultCreditLimitChangeList[] creditLimitChangeList;

    public FeeDeductionRollBackResult() {
    }

    public FeeDeductionRollBackResult(
           java.lang.String deductSerialNo,
           com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultBalanceRollBack[] balanceRollBack,
           com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultFreeUnitRollBack[] freeUnitRollBack,
           com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultCreditLimitChangeList[] creditLimitChangeList) {
           this.deductSerialNo = deductSerialNo;
           this.balanceRollBack = balanceRollBack;
           this.freeUnitRollBack = freeUnitRollBack;
           this.creditLimitChangeList = creditLimitChangeList;
    }


    /**
     * Gets the deductSerialNo value for this FeeDeductionRollBackResult.
     * 
     * @return deductSerialNo
     */
    public java.lang.String getDeductSerialNo() {
        return deductSerialNo;
    }


    /**
     * Sets the deductSerialNo value for this FeeDeductionRollBackResult.
     * 
     * @param deductSerialNo
     */
    public void setDeductSerialNo(java.lang.String deductSerialNo) {
        this.deductSerialNo = deductSerialNo;
    }


    /**
     * Gets the balanceRollBack value for this FeeDeductionRollBackResult.
     * 
     * @return balanceRollBack
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultBalanceRollBack[] getBalanceRollBack() {
        return balanceRollBack;
    }


    /**
     * Sets the balanceRollBack value for this FeeDeductionRollBackResult.
     * 
     * @param balanceRollBack
     */
    public void setBalanceRollBack(com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultBalanceRollBack[] balanceRollBack) {
        this.balanceRollBack = balanceRollBack;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultBalanceRollBack getBalanceRollBack(int i) {
        return this.balanceRollBack[i];
    }

    public void setBalanceRollBack(int i, com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultBalanceRollBack _value) {
        this.balanceRollBack[i] = _value;
    }


    /**
     * Gets the freeUnitRollBack value for this FeeDeductionRollBackResult.
     * 
     * @return freeUnitRollBack
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultFreeUnitRollBack[] getFreeUnitRollBack() {
        return freeUnitRollBack;
    }


    /**
     * Sets the freeUnitRollBack value for this FeeDeductionRollBackResult.
     * 
     * @param freeUnitRollBack
     */
    public void setFreeUnitRollBack(com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultFreeUnitRollBack[] freeUnitRollBack) {
        this.freeUnitRollBack = freeUnitRollBack;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultFreeUnitRollBack getFreeUnitRollBack(int i) {
        return this.freeUnitRollBack[i];
    }

    public void setFreeUnitRollBack(int i, com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultFreeUnitRollBack _value) {
        this.freeUnitRollBack[i] = _value;
    }


    /**
     * Gets the creditLimitChangeList value for this FeeDeductionRollBackResult.
     * 
     * @return creditLimitChangeList
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultCreditLimitChangeList[] getCreditLimitChangeList() {
        return creditLimitChangeList;
    }


    /**
     * Sets the creditLimitChangeList value for this FeeDeductionRollBackResult.
     * 
     * @param creditLimitChangeList
     */
    public void setCreditLimitChangeList(com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultCreditLimitChangeList[] creditLimitChangeList) {
        this.creditLimitChangeList = creditLimitChangeList;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultCreditLimitChangeList getCreditLimitChangeList(int i) {
        return this.creditLimitChangeList[i];
    }

    public void setCreditLimitChangeList(int i, com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultCreditLimitChangeList _value) {
        this.creditLimitChangeList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeDeductionRollBackResult)) return false;
        FeeDeductionRollBackResult other = (FeeDeductionRollBackResult) obj;
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
            ((this.balanceRollBack==null && other.getBalanceRollBack()==null) || 
             (this.balanceRollBack!=null &&
              java.util.Arrays.equals(this.balanceRollBack, other.getBalanceRollBack()))) &&
            ((this.freeUnitRollBack==null && other.getFreeUnitRollBack()==null) || 
             (this.freeUnitRollBack!=null &&
              java.util.Arrays.equals(this.freeUnitRollBack, other.getFreeUnitRollBack()))) &&
            ((this.creditLimitChangeList==null && other.getCreditLimitChangeList()==null) || 
             (this.creditLimitChangeList!=null &&
              java.util.Arrays.equals(this.creditLimitChangeList, other.getCreditLimitChangeList())));
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
        if (getBalanceRollBack() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalanceRollBack());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalanceRollBack(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFreeUnitRollBack() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeUnitRollBack());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeUnitRollBack(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditLimitChangeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditLimitChangeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditLimitChangeList(), i);
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
        new org.apache.axis.description.TypeDesc(FeeDeductionRollBackResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeDeductionRollBackResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DeductSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceRollBack");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BalanceRollBack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRollBackResult>BalanceRollBack"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitRollBack");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FreeUnitRollBack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRollBackResult>FreeUnitRollBack"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimitChangeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreditLimitChangeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRollBackResult>CreditLimitChangeList"));
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
