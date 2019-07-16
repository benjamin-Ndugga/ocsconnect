/**
 * ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit  implements java.io.Serializable {
    private long newLimitAmount;

    private com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime;

    public ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit() {
    }

    public ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit(
           long newLimitAmount,
           com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
           this.newLimitAmount = newLimitAmount;
           this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the newLimitAmount value for this ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit.
     * 
     * @return newLimitAmount
     */
    public long getNewLimitAmount() {
        return newLimitAmount;
    }


    /**
     * Sets the newLimitAmount value for this ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit.
     * 
     * @param newLimitAmount
     */
    public void setNewLimitAmount(long newLimitAmount) {
        this.newLimitAmount = newLimitAmount;
    }


    /**
     * Gets the effectiveTime value for this ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit.
     * 
     * @return effectiveTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.EffectMode getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit)) return false;
        ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit other = (ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.newLimitAmount == other.getNewLimitAmount() &&
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
        _hashCode += new Long(getNewLimitAmount()).hashCode();
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctCreditLimitRequest>AccountCredit>CommonCreditLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newLimitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewLimitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "EffectMode"));
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
