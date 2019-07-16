/**
 * SubDeactivationResultAcctBalance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class SubDeactivationResultAcctBalance  implements java.io.Serializable {
    private java.lang.String acctKey;

    private com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultAcctBalanceAmountList[] amountList;

    public SubDeactivationResultAcctBalance() {
    }

    public SubDeactivationResultAcctBalance(
           java.lang.String acctKey,
           com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultAcctBalanceAmountList[] amountList) {
           this.acctKey = acctKey;
           this.amountList = amountList;
    }


    /**
     * Gets the acctKey value for this SubDeactivationResultAcctBalance.
     * 
     * @return acctKey
     */
    public java.lang.String getAcctKey() {
        return acctKey;
    }


    /**
     * Sets the acctKey value for this SubDeactivationResultAcctBalance.
     * 
     * @param acctKey
     */
    public void setAcctKey(java.lang.String acctKey) {
        this.acctKey = acctKey;
    }


    /**
     * Gets the amountList value for this SubDeactivationResultAcctBalance.
     * 
     * @return amountList
     */
    public com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultAcctBalanceAmountList[] getAmountList() {
        return amountList;
    }


    /**
     * Sets the amountList value for this SubDeactivationResultAcctBalance.
     * 
     * @param amountList
     */
    public void setAmountList(com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultAcctBalanceAmountList[] amountList) {
        this.amountList = amountList;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultAcctBalanceAmountList getAmountList(int i) {
        return this.amountList[i];
    }

    public void setAmountList(int i, com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultAcctBalanceAmountList _value) {
        this.amountList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubDeactivationResultAcctBalance)) return false;
        SubDeactivationResultAcctBalance other = (SubDeactivationResultAcctBalance) obj;
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
            ((this.amountList==null && other.getAmountList()==null) || 
             (this.amountList!=null &&
              java.util.Arrays.equals(this.amountList, other.getAmountList())));
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
        if (getAmountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmountList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmountList(), i);
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
        new org.apache.axis.description.TypeDesc(SubDeactivationResultAcctBalance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SubDeactivationResult>AcctBalance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AmountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>SubDeactivationResult>AcctBalance>AmountList"));
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
