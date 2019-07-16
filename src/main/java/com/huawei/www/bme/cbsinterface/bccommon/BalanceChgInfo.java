/**
 * BalanceChgInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class BalanceChgInfo  implements java.io.Serializable {
    private java.lang.String balanceType;

    private java.lang.Long balanceID;

    private java.lang.String balanceTypeName;

    private long oldBalanceAmt;

    private long newBalanceAmt;

    private java.math.BigInteger currencyID;

    public BalanceChgInfo() {
    }

    public BalanceChgInfo(
           java.lang.String balanceType,
           java.lang.Long balanceID,
           java.lang.String balanceTypeName,
           long oldBalanceAmt,
           long newBalanceAmt,
           java.math.BigInteger currencyID) {
           this.balanceType = balanceType;
           this.balanceID = balanceID;
           this.balanceTypeName = balanceTypeName;
           this.oldBalanceAmt = oldBalanceAmt;
           this.newBalanceAmt = newBalanceAmt;
           this.currencyID = currencyID;
    }


    /**
     * Gets the balanceType value for this BalanceChgInfo.
     * 
     * @return balanceType
     */
    public java.lang.String getBalanceType() {
        return balanceType;
    }


    /**
     * Sets the balanceType value for this BalanceChgInfo.
     * 
     * @param balanceType
     */
    public void setBalanceType(java.lang.String balanceType) {
        this.balanceType = balanceType;
    }


    /**
     * Gets the balanceID value for this BalanceChgInfo.
     * 
     * @return balanceID
     */
    public java.lang.Long getBalanceID() {
        return balanceID;
    }


    /**
     * Sets the balanceID value for this BalanceChgInfo.
     * 
     * @param balanceID
     */
    public void setBalanceID(java.lang.Long balanceID) {
        this.balanceID = balanceID;
    }


    /**
     * Gets the balanceTypeName value for this BalanceChgInfo.
     * 
     * @return balanceTypeName
     */
    public java.lang.String getBalanceTypeName() {
        return balanceTypeName;
    }


    /**
     * Sets the balanceTypeName value for this BalanceChgInfo.
     * 
     * @param balanceTypeName
     */
    public void setBalanceTypeName(java.lang.String balanceTypeName) {
        this.balanceTypeName = balanceTypeName;
    }


    /**
     * Gets the oldBalanceAmt value for this BalanceChgInfo.
     * 
     * @return oldBalanceAmt
     */
    public long getOldBalanceAmt() {
        return oldBalanceAmt;
    }


    /**
     * Sets the oldBalanceAmt value for this BalanceChgInfo.
     * 
     * @param oldBalanceAmt
     */
    public void setOldBalanceAmt(long oldBalanceAmt) {
        this.oldBalanceAmt = oldBalanceAmt;
    }


    /**
     * Gets the newBalanceAmt value for this BalanceChgInfo.
     * 
     * @return newBalanceAmt
     */
    public long getNewBalanceAmt() {
        return newBalanceAmt;
    }


    /**
     * Sets the newBalanceAmt value for this BalanceChgInfo.
     * 
     * @param newBalanceAmt
     */
    public void setNewBalanceAmt(long newBalanceAmt) {
        this.newBalanceAmt = newBalanceAmt;
    }


    /**
     * Gets the currencyID value for this BalanceChgInfo.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this BalanceChgInfo.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceChgInfo)) return false;
        BalanceChgInfo other = (BalanceChgInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balanceType==null && other.getBalanceType()==null) || 
             (this.balanceType!=null &&
              this.balanceType.equals(other.getBalanceType()))) &&
            ((this.balanceID==null && other.getBalanceID()==null) || 
             (this.balanceID!=null &&
              this.balanceID.equals(other.getBalanceID()))) &&
            ((this.balanceTypeName==null && other.getBalanceTypeName()==null) || 
             (this.balanceTypeName!=null &&
              this.balanceTypeName.equals(other.getBalanceTypeName()))) &&
            this.oldBalanceAmt == other.getOldBalanceAmt() &&
            this.newBalanceAmt == other.getNewBalanceAmt() &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID())));
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
        if (getBalanceType() != null) {
            _hashCode += getBalanceType().hashCode();
        }
        if (getBalanceID() != null) {
            _hashCode += getBalanceID().hashCode();
        }
        if (getBalanceTypeName() != null) {
            _hashCode += getBalanceTypeName().hashCode();
        }
        _hashCode += new Long(getOldBalanceAmt()).hashCode();
        _hashCode += new Long(getNewBalanceAmt()).hashCode();
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalanceChgInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BalanceChgInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BalanceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BalanceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BalanceTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldBalanceAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OldBalanceAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalanceAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "NewBalanceAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
