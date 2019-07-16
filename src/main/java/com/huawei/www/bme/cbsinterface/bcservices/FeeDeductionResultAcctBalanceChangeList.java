/**
 * FeeDeductionResultAcctBalanceChangeList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class FeeDeductionResultAcctBalanceChangeList  implements java.io.Serializable {
    private java.lang.String acctKey;

    private com.huawei.www.bme.cbsinterface.bccommon.BalanceChgInfo[] balanceChgInfo;

    public FeeDeductionResultAcctBalanceChangeList() {
    }

    public FeeDeductionResultAcctBalanceChangeList(
           java.lang.String acctKey,
           com.huawei.www.bme.cbsinterface.bccommon.BalanceChgInfo[] balanceChgInfo) {
           this.acctKey = acctKey;
           this.balanceChgInfo = balanceChgInfo;
    }


    /**
     * Gets the acctKey value for this FeeDeductionResultAcctBalanceChangeList.
     * 
     * @return acctKey
     */
    public java.lang.String getAcctKey() {
        return acctKey;
    }


    /**
     * Sets the acctKey value for this FeeDeductionResultAcctBalanceChangeList.
     * 
     * @param acctKey
     */
    public void setAcctKey(java.lang.String acctKey) {
        this.acctKey = acctKey;
    }


    /**
     * Gets the balanceChgInfo value for this FeeDeductionResultAcctBalanceChangeList.
     * 
     * @return balanceChgInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.BalanceChgInfo[] getBalanceChgInfo() {
        return balanceChgInfo;
    }


    /**
     * Sets the balanceChgInfo value for this FeeDeductionResultAcctBalanceChangeList.
     * 
     * @param balanceChgInfo
     */
    public void setBalanceChgInfo(com.huawei.www.bme.cbsinterface.bccommon.BalanceChgInfo[] balanceChgInfo) {
        this.balanceChgInfo = balanceChgInfo;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.BalanceChgInfo getBalanceChgInfo(int i) {
        return this.balanceChgInfo[i];
    }

    public void setBalanceChgInfo(int i, com.huawei.www.bme.cbsinterface.bccommon.BalanceChgInfo _value) {
        this.balanceChgInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeDeductionResultAcctBalanceChangeList)) return false;
        FeeDeductionResultAcctBalanceChangeList other = (FeeDeductionResultAcctBalanceChangeList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctKey==null && other.getAcctKey()==null) || 
             (this.acctKey!=null &&
              this.acctKey.equals(other.getAcctKey()))) &&
            ((this.balanceChgInfo==null && other.getBalanceChgInfo()==null) || 
             (this.balanceChgInfo!=null &&
              java.util.Arrays.equals(this.balanceChgInfo, other.getBalanceChgInfo())));
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
        if (getAcctKey() != null) {
            _hashCode += getAcctKey().hashCode();
        }
        if (getBalanceChgInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalanceChgInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalanceChgInfo(), i);
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
        new org.apache.axis.description.TypeDesc(FeeDeductionResultAcctBalanceChangeList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionResult>AcctBalanceChangeList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceChgInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BalanceChgInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BalanceChgInfo"));
        elemField.setNillable(true);
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
