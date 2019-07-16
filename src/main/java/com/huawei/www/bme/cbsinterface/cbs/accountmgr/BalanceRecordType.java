/**
 * BalanceRecordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */
package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BalanceRecordType implements java.io.Serializable, Comparable<BalanceRecordType> {

    private java.lang.String balanceDesc;

    private long balance;

    private java.lang.Integer minMeasureId;

    private java.lang.Integer unitType;

    private java.lang.String accountType;

    private java.lang.String expireTime;

    private java.lang.Long accountCredit;

    private java.lang.String accountKey;

    private java.lang.String productID;

    private java.lang.String productOrderKey;

    private java.lang.Long initialAmount;

    private java.lang.Long usageAmount;

    public BalanceRecordType() {
    }

    public BalanceRecordType(
            java.lang.String balanceDesc,
            long balance,
            java.lang.Integer minMeasureId,
            java.lang.Integer unitType,
            java.lang.String accountType,
            java.lang.String expireTime,
            java.lang.Long accountCredit,
            java.lang.String accountKey,
            java.lang.String productID,
            java.lang.String productOrderKey,
            java.lang.Long initialAmount,
            java.lang.Long usageAmount) {
        this.balanceDesc = balanceDesc;
        this.balance = balance;
        this.minMeasureId = minMeasureId;
        this.unitType = unitType;
        this.accountType = accountType;
        this.expireTime = expireTime;
        this.accountCredit = accountCredit;
        this.accountKey = accountKey;
        this.productID = productID;
        this.productOrderKey = productOrderKey;
        this.initialAmount = initialAmount;
        this.usageAmount = usageAmount;
    }

    /**
     * Gets the balanceDesc value for this BalanceRecordType.
     *
     * @return balanceDesc
     */
    public java.lang.String getBalanceDesc() {
        return balanceDesc;
    }

    /**
     * Sets the balanceDesc value for this BalanceRecordType.
     *
     * @param balanceDesc
     */
    public void setBalanceDesc(java.lang.String balanceDesc) {
        this.balanceDesc = balanceDesc;
    }

    /**
     * Gets the balance value for this BalanceRecordType.
     *
     * @return balance
     */
    public long getBalance() {
        return balance;
    }

    /**
     * Sets the balance value for this BalanceRecordType.
     *
     * @param balance
     */
    public void setBalance(long balance) {
        this.balance = balance;
    }

    /**
     * Gets the minMeasureId value for this BalanceRecordType.
     *
     * @return minMeasureId
     */
    public java.lang.Integer getMinMeasureId() {
        return minMeasureId;
    }

    /**
     * Sets the minMeasureId value for this BalanceRecordType.
     *
     * @param minMeasureId
     */
    public void setMinMeasureId(java.lang.Integer minMeasureId) {
        this.minMeasureId = minMeasureId;
    }

    /**
     * Gets the unitType value for this BalanceRecordType.
     *
     * @return unitType
     */
    public java.lang.Integer getUnitType() {
        return unitType;
    }

    /**
     * Sets the unitType value for this BalanceRecordType.
     *
     * @param unitType
     */
    public void setUnitType(java.lang.Integer unitType) {
        this.unitType = unitType;
    }

    /**
     * Gets the accountType value for this BalanceRecordType.
     *
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }

    /**
     * Sets the accountType value for this BalanceRecordType.
     *
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }

    /**
     * Gets the expireTime value for this BalanceRecordType.
     *
     * @return expireTime
     */
    public java.lang.String getExpireTime() {
        return expireTime;
    }

    /**
     * Sets the expireTime value for this BalanceRecordType.
     *
     * @param expireTime
     */
    public void setExpireTime(java.lang.String expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * Gets the accountCredit value for this BalanceRecordType.
     *
     * @return accountCredit
     */
    public java.lang.Long getAccountCredit() {
        return accountCredit;
    }

    /**
     * Sets the accountCredit value for this BalanceRecordType.
     *
     * @param accountCredit
     */
    public void setAccountCredit(java.lang.Long accountCredit) {
        this.accountCredit = accountCredit;
    }

    /**
     * Gets the accountKey value for this BalanceRecordType.
     *
     * @return accountKey
     */
    public java.lang.String getAccountKey() {
        return accountKey;
    }

    /**
     * Sets the accountKey value for this BalanceRecordType.
     *
     * @param accountKey
     */
    public void setAccountKey(java.lang.String accountKey) {
        this.accountKey = accountKey;
    }

    /**
     * Gets the productID value for this BalanceRecordType.
     *
     * @return productID
     */
    public java.lang.String getProductID() {
        return productID;
    }

    /**
     * Sets the productID value for this BalanceRecordType.
     *
     * @param productID
     */
    public void setProductID(java.lang.String productID) {
        this.productID = productID;
    }

    /**
     * Gets the productOrderKey value for this BalanceRecordType.
     *
     * @return productOrderKey
     */
    public java.lang.String getProductOrderKey() {
        return productOrderKey;
    }

    /**
     * Sets the productOrderKey value for this BalanceRecordType.
     *
     * @param productOrderKey
     */
    public void setProductOrderKey(java.lang.String productOrderKey) {
        this.productOrderKey = productOrderKey;
    }

    /**
     * Gets the initialAmount value for this BalanceRecordType.
     *
     * @return initialAmount
     */
    public java.lang.Long getInitialAmount() {
        return initialAmount;
    }

    /**
     * Sets the initialAmount value for this BalanceRecordType.
     *
     * @param initialAmount
     */
    public void setInitialAmount(java.lang.Long initialAmount) {
        this.initialAmount = initialAmount;
    }

    /**
     * Gets the usageAmount value for this BalanceRecordType.
     *
     * @return usageAmount
     */
    public java.lang.Long getUsageAmount() {
        return usageAmount;
    }

    /**
     * Sets the usageAmount value for this BalanceRecordType.
     *
     * @param usageAmount
     */
    public void setUsageAmount(java.lang.Long usageAmount) {
        this.usageAmount = usageAmount;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceRecordType)) {
            return false;
        }
        BalanceRecordType other = (BalanceRecordType) obj;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true
                && ((this.balanceDesc == null && other.getBalanceDesc() == null)
                || (this.balanceDesc != null
                && this.balanceDesc.equals(other.getBalanceDesc())))
                && this.balance == other.getBalance()
                && ((this.minMeasureId == null && other.getMinMeasureId() == null)
                || (this.minMeasureId != null
                && this.minMeasureId.equals(other.getMinMeasureId())))
                && ((this.unitType == null && other.getUnitType() == null)
                || (this.unitType != null
                && this.unitType.equals(other.getUnitType())))
                && ((this.accountType == null && other.getAccountType() == null)
                || (this.accountType != null
                && this.accountType.equals(other.getAccountType())))
                && ((this.expireTime == null && other.getExpireTime() == null)
                || (this.expireTime != null
                && this.expireTime.equals(other.getExpireTime())))
                && ((this.accountCredit == null && other.getAccountCredit() == null)
                || (this.accountCredit != null
                && this.accountCredit.equals(other.getAccountCredit())))
                && ((this.accountKey == null && other.getAccountKey() == null)
                || (this.accountKey != null
                && this.accountKey.equals(other.getAccountKey())))
                && ((this.productID == null && other.getProductID() == null)
                || (this.productID != null
                && this.productID.equals(other.getProductID())))
                && ((this.productOrderKey == null && other.getProductOrderKey() == null)
                || (this.productOrderKey != null
                && this.productOrderKey.equals(other.getProductOrderKey())))
                && ((this.initialAmount == null && other.getInitialAmount() == null)
                || (this.initialAmount != null
                && this.initialAmount.equals(other.getInitialAmount())))
                && ((this.usageAmount == null && other.getUsageAmount() == null)
                || (this.usageAmount != null
                && this.usageAmount.equals(other.getUsageAmount())));
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
        if (getBalanceDesc() != null) {
            _hashCode += getBalanceDesc().hashCode();
        }
        _hashCode += new Long(getBalance()).hashCode();
        if (getMinMeasureId() != null) {
            _hashCode += getMinMeasureId().hashCode();
        }
        if (getUnitType() != null) {
            _hashCode += getUnitType().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getExpireTime() != null) {
            _hashCode += getExpireTime().hashCode();
        }
        if (getAccountCredit() != null) {
            _hashCode += getAccountCredit().hashCode();
        }
        if (getAccountKey() != null) {
            _hashCode += getAccountKey().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getProductOrderKey() != null) {
            _hashCode += getProductOrderKey().hashCode();
        }
        if (getInitialAmount() != null) {
            _hashCode += getInitialAmount().hashCode();
        }
        if (getUsageAmount() != null) {
            _hashCode += getUsageAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc
            = new org.apache.axis.description.TypeDesc(BalanceRecordType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "BalanceRecordType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "BalanceDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minMeasureId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "MinMeasureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "UnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ExpireTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AccountCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AccountKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOrderKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ProductOrderKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "InitialAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "UsageAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
     *
     * @param mechType
     * @param _javaType
     * @param _xmlType
     * @return
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanSerializer(
                _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanDeserializer(
                _javaType, _xmlType, typeDesc);
    }

    public Date getExpireDate() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        return dateFormat.parse(getExpireTime());
    }

    /**
     * Compares two BalanceRecordTypes for ordering.
     *
     * @param q the <code>balanceRecordType</code> to be compared.
     * @return the value <code>0</code> if the argument q's vol balance is equal
     * to this Quota vol; a value less than <code>0</code> if this Quota Vol
     * balance is greater than the q argument; and a value greater than
     * <code>0</code> if this Quota' vol is greater than the q's vol.
     *
     * @exception NullPointerException if <code>q</code> is null.
     */
    @Override
    public int compareTo(BalanceRecordType q) {

        if (q.getBalance() == getBalance()) {
            return 0;
        } else if (getBalance() > q.getBalance()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Balance Desc: {" + getBalanceDesc() + " Vol: " + getBalance() + "}";
    }

}
