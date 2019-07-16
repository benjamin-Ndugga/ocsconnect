/**
 * ChangeAcctCreditLimitRequestDelAccountCredit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAcctCreditLimitRequestDelAccountCredit  implements java.io.Serializable {
    private java.lang.String creditLimitType;

    private java.lang.String expirationTime;

    public ChangeAcctCreditLimitRequestDelAccountCredit() {
    }

    public ChangeAcctCreditLimitRequestDelAccountCredit(
           java.lang.String creditLimitType,
           java.lang.String expirationTime) {
           this.creditLimitType = creditLimitType;
           this.expirationTime = expirationTime;
    }


    /**
     * Gets the creditLimitType value for this ChangeAcctCreditLimitRequestDelAccountCredit.
     * 
     * @return creditLimitType
     */
    public java.lang.String getCreditLimitType() {
        return creditLimitType;
    }


    /**
     * Sets the creditLimitType value for this ChangeAcctCreditLimitRequestDelAccountCredit.
     * 
     * @param creditLimitType
     */
    public void setCreditLimitType(java.lang.String creditLimitType) {
        this.creditLimitType = creditLimitType;
    }


    /**
     * Gets the expirationTime value for this ChangeAcctCreditLimitRequestDelAccountCredit.
     * 
     * @return expirationTime
     */
    public java.lang.String getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this ChangeAcctCreditLimitRequestDelAccountCredit.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(java.lang.String expirationTime) {
        this.expirationTime = expirationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAcctCreditLimitRequestDelAccountCredit)) return false;
        ChangeAcctCreditLimitRequestDelAccountCredit other = (ChangeAcctCreditLimitRequestDelAccountCredit) obj;
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
            ((this.expirationTime==null && other.getExpirationTime()==null) || 
             (this.expirationTime!=null &&
              this.expirationTime.equals(other.getExpirationTime())));
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
        if (getExpirationTime() != null) {
            _hashCode += getExpirationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeAcctCreditLimitRequestDelAccountCredit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitRequest>DelAccountCredit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreditLimitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpirationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
