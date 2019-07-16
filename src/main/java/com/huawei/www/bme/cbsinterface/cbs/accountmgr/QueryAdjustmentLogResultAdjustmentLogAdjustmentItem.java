/**
 * QueryAdjustmentLogResultAdjustmentLogAdjustmentItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class QueryAdjustmentLogResultAdjustmentLogAdjustmentItem  implements java.io.Serializable {
    private java.lang.String accountType;

    private java.lang.Long adjustmentAmt;

    private java.lang.Long currBalance;

    public QueryAdjustmentLogResultAdjustmentLogAdjustmentItem() {
    }

    public QueryAdjustmentLogResultAdjustmentLogAdjustmentItem(
           java.lang.String accountType,
           java.lang.Long adjustmentAmt,
           java.lang.Long currBalance) {
           this.accountType = accountType;
           this.adjustmentAmt = adjustmentAmt;
           this.currBalance = currBalance;
    }


    /**
     * Gets the accountType value for this QueryAdjustmentLogResultAdjustmentLogAdjustmentItem.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this QueryAdjustmentLogResultAdjustmentLogAdjustmentItem.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the adjustmentAmt value for this QueryAdjustmentLogResultAdjustmentLogAdjustmentItem.
     * 
     * @return adjustmentAmt
     */
    public java.lang.Long getAdjustmentAmt() {
        return adjustmentAmt;
    }


    /**
     * Sets the adjustmentAmt value for this QueryAdjustmentLogResultAdjustmentLogAdjustmentItem.
     * 
     * @param adjustmentAmt
     */
    public void setAdjustmentAmt(java.lang.Long adjustmentAmt) {
        this.adjustmentAmt = adjustmentAmt;
    }


    /**
     * Gets the currBalance value for this QueryAdjustmentLogResultAdjustmentLogAdjustmentItem.
     * 
     * @return currBalance
     */
    public java.lang.Long getCurrBalance() {
        return currBalance;
    }


    /**
     * Sets the currBalance value for this QueryAdjustmentLogResultAdjustmentLogAdjustmentItem.
     * 
     * @param currBalance
     */
    public void setCurrBalance(java.lang.Long currBalance) {
        this.currBalance = currBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryAdjustmentLogResultAdjustmentLogAdjustmentItem)) return false;
        QueryAdjustmentLogResultAdjustmentLogAdjustmentItem other = (QueryAdjustmentLogResultAdjustmentLogAdjustmentItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.adjustmentAmt==null && other.getAdjustmentAmt()==null) || 
             (this.adjustmentAmt!=null &&
              this.adjustmentAmt.equals(other.getAdjustmentAmt()))) &&
            ((this.currBalance==null && other.getCurrBalance()==null) || 
             (this.currBalance!=null &&
              this.currBalance.equals(other.getCurrBalance())));
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
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getAdjustmentAmt() != null) {
            _hashCode += getAdjustmentAmt().hashCode();
        }
        if (getCurrBalance() != null) {
            _hashCode += getCurrBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryAdjustmentLogResultAdjustmentLogAdjustmentItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">>QueryAdjustmentLogResult>AdjustmentLog>AdjustmentItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AdjustmentAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CurrBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
