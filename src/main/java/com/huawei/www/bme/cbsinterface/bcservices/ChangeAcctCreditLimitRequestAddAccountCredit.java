/**
 * ChangeAcctCreditLimitRequestAddAccountCredit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAcctCreditLimitRequestAddAccountCredit  implements java.io.Serializable {
    private java.lang.String creditLimitType;

    private long limitAmount;

    private com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime;

    public ChangeAcctCreditLimitRequestAddAccountCredit() {
    }

    public ChangeAcctCreditLimitRequestAddAccountCredit(
           java.lang.String creditLimitType,
           long limitAmount,
           com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
           this.creditLimitType = creditLimitType;
           this.limitAmount = limitAmount;
           this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the creditLimitType value for this ChangeAcctCreditLimitRequestAddAccountCredit.
     * 
     * @return creditLimitType
     */
    public java.lang.String getCreditLimitType() {
        return creditLimitType;
    }


    /**
     * Sets the creditLimitType value for this ChangeAcctCreditLimitRequestAddAccountCredit.
     * 
     * @param creditLimitType
     */
    public void setCreditLimitType(java.lang.String creditLimitType) {
        this.creditLimitType = creditLimitType;
    }


    /**
     * Gets the limitAmount value for this ChangeAcctCreditLimitRequestAddAccountCredit.
     * 
     * @return limitAmount
     */
    public long getLimitAmount() {
        return limitAmount;
    }


    /**
     * Sets the limitAmount value for this ChangeAcctCreditLimitRequestAddAccountCredit.
     * 
     * @param limitAmount
     */
    public void setLimitAmount(long limitAmount) {
        this.limitAmount = limitAmount;
    }


    /**
     * Gets the effectiveTime value for this ChangeAcctCreditLimitRequestAddAccountCredit.
     * 
     * @return effectiveTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.EffectMode getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this ChangeAcctCreditLimitRequestAddAccountCredit.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAcctCreditLimitRequestAddAccountCredit)) return false;
        ChangeAcctCreditLimitRequestAddAccountCredit other = (ChangeAcctCreditLimitRequestAddAccountCredit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditLimitType==null && other.getCreditLimitType()==null) || 
             (this.creditLimitType!=null &&
              this.creditLimitType.equals(other.getCreditLimitType()))) &&
            this.limitAmount == other.getLimitAmount() &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime())));
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
        if (getCreditLimitType() != null) {
            _hashCode += getCreditLimitType().hashCode();
        }
        _hashCode += new Long(getLimitAmount()).hashCode();
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeAcctCreditLimitRequestAddAccountCredit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitRequest>AddAccountCredit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreditLimitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "EffectMode"));
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
