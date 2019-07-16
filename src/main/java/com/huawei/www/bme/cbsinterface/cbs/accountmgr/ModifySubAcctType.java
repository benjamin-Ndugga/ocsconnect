/**
 * ModifySubAcctType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class ModifySubAcctType  implements java.io.Serializable {
    private java.lang.String accountID;

    private long currAcctChgAmt;

    private int currAcctChgValidity;

    public ModifySubAcctType() {
    }

    public ModifySubAcctType(
           java.lang.String accountID,
           long currAcctChgAmt,
           int currAcctChgValidity) {
           this.accountID = accountID;
           this.currAcctChgAmt = currAcctChgAmt;
           this.currAcctChgValidity = currAcctChgValidity;
    }


    /**
     * Gets the accountID value for this ModifySubAcctType.
     * 
     * @return accountID
     */
    public java.lang.String getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this ModifySubAcctType.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.String accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the currAcctChgAmt value for this ModifySubAcctType.
     * 
     * @return currAcctChgAmt
     */
    public long getCurrAcctChgAmt() {
        return currAcctChgAmt;
    }


    /**
     * Sets the currAcctChgAmt value for this ModifySubAcctType.
     * 
     * @param currAcctChgAmt
     */
    public void setCurrAcctChgAmt(long currAcctChgAmt) {
        this.currAcctChgAmt = currAcctChgAmt;
    }


    /**
     * Gets the currAcctChgValidity value for this ModifySubAcctType.
     * 
     * @return currAcctChgValidity
     */
    public int getCurrAcctChgValidity() {
        return currAcctChgValidity;
    }


    /**
     * Sets the currAcctChgValidity value for this ModifySubAcctType.
     * 
     * @param currAcctChgValidity
     */
    public void setCurrAcctChgValidity(int currAcctChgValidity) {
        this.currAcctChgValidity = currAcctChgValidity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifySubAcctType)) return false;
        ModifySubAcctType other = (ModifySubAcctType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            this.currAcctChgAmt == other.getCurrAcctChgAmt() &&
            this.currAcctChgValidity == other.getCurrAcctChgValidity();
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
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        _hashCode += new Long(getCurrAcctChgAmt()).hashCode();
        _hashCode += getCurrAcctChgValidity();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifySubAcctType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifySubAcctType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currAcctChgAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CurrAcctChgAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currAcctChgValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CurrAcctChgValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
