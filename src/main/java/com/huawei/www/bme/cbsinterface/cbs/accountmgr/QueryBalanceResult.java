/**
 * QueryBalanceResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class QueryBalanceResult  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.BalanceRecordType[] balanceRecord;

    private java.lang.Long loanAmount;

    public QueryBalanceResult() {
    }

    public QueryBalanceResult(
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.BalanceRecordType[] balanceRecord,
           java.lang.Long loanAmount) {
           this.balanceRecord = balanceRecord;
           this.loanAmount = loanAmount;
    }


    /**
     * Gets the balanceRecord value for this QueryBalanceResult.
     * 
     * @return balanceRecord
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.BalanceRecordType[] getBalanceRecord() {
        return balanceRecord;
    }


    /**
     * Sets the balanceRecord value for this QueryBalanceResult.
     * 
     * @param balanceRecord
     */
    public void setBalanceRecord(com.huawei.www.bme.cbsinterface.cbs.accountmgr.BalanceRecordType[] balanceRecord) {
        this.balanceRecord = balanceRecord;
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.BalanceRecordType getBalanceRecord(int i) {
        return this.balanceRecord[i];
    }

    public void setBalanceRecord(int i, com.huawei.www.bme.cbsinterface.cbs.accountmgr.BalanceRecordType _value) {
        this.balanceRecord[i] = _value;
    }


    /**
     * Gets the loanAmount value for this QueryBalanceResult.
     * 
     * @return loanAmount
     */
    public java.lang.Long getLoanAmount() {
        return loanAmount;
    }


    /**
     * Sets the loanAmount value for this QueryBalanceResult.
     * 
     * @param loanAmount
     */
    public void setLoanAmount(java.lang.Long loanAmount) {
        this.loanAmount = loanAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBalanceResult)) return false;
        QueryBalanceResult other = (QueryBalanceResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balanceRecord==null && other.getBalanceRecord()==null) || 
             (this.balanceRecord!=null &&
              java.util.Arrays.equals(this.balanceRecord, other.getBalanceRecord()))) &&
            ((this.loanAmount==null && other.getLoanAmount()==null) || 
             (this.loanAmount!=null &&
              this.loanAmount.equals(other.getLoanAmount())));
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
        if (getBalanceRecord() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalanceRecord());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalanceRecord(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLoanAmount() != null) {
            _hashCode += getLoanAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryBalanceResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "QueryBalanceResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "BalanceRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "BalanceRecordType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LoanAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
