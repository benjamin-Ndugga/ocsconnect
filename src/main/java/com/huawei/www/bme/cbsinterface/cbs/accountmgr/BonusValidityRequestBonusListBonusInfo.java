/**
 * BonusValidityRequestBonusListBonusInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class BonusValidityRequestBonusListBonusInfo  implements java.io.Serializable {
    private int accountType;

    private long bonusAmount;

    private int validType;

    private int validityDays;

    public BonusValidityRequestBonusListBonusInfo() {
    }

    public BonusValidityRequestBonusListBonusInfo(
           int accountType,
           long bonusAmount,
           int validType,
           int validityDays) {
           this.accountType = accountType;
           this.bonusAmount = bonusAmount;
           this.validType = validType;
           this.validityDays = validityDays;
    }


    /**
     * Gets the accountType value for this BonusValidityRequestBonusListBonusInfo.
     * 
     * @return accountType
     */
    public int getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this BonusValidityRequestBonusListBonusInfo.
     * 
     * @param accountType
     */
    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the bonusAmount value for this BonusValidityRequestBonusListBonusInfo.
     * 
     * @return bonusAmount
     */
    public long getBonusAmount() {
        return bonusAmount;
    }


    /**
     * Sets the bonusAmount value for this BonusValidityRequestBonusListBonusInfo.
     * 
     * @param bonusAmount
     */
    public void setBonusAmount(long bonusAmount) {
        this.bonusAmount = bonusAmount;
    }


    /**
     * Gets the validType value for this BonusValidityRequestBonusListBonusInfo.
     * 
     * @return validType
     */
    public int getValidType() {
        return validType;
    }


    /**
     * Sets the validType value for this BonusValidityRequestBonusListBonusInfo.
     * 
     * @param validType
     */
    public void setValidType(int validType) {
        this.validType = validType;
    }


    /**
     * Gets the validityDays value for this BonusValidityRequestBonusListBonusInfo.
     * 
     * @return validityDays
     */
    public int getValidityDays() {
        return validityDays;
    }


    /**
     * Sets the validityDays value for this BonusValidityRequestBonusListBonusInfo.
     * 
     * @param validityDays
     */
    public void setValidityDays(int validityDays) {
        this.validityDays = validityDays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BonusValidityRequestBonusListBonusInfo)) return false;
        BonusValidityRequestBonusListBonusInfo other = (BonusValidityRequestBonusListBonusInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountType == other.getAccountType() &&
            this.bonusAmount == other.getBonusAmount() &&
            this.validType == other.getValidType() &&
            this.validityDays == other.getValidityDays();
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
        _hashCode += getAccountType();
        _hashCode += new Long(getBonusAmount()).hashCode();
        _hashCode += getValidType();
        _hashCode += getValidityDays();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BonusValidityRequestBonusListBonusInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">>BonusValidityRequest>BonusList>BonusInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "BonusAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ValidType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ValidityDays"));
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
