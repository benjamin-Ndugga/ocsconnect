/**
 * ChangeAcctCreditLimitRequestAccountCredit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAcctCreditLimitRequestAccountCredit  implements java.io.Serializable {
    private java.lang.String creditLimitType;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit commonCreditLimit;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit tmpCreditLimit;

    public ChangeAcctCreditLimitRequestAccountCredit() {
    }

    public ChangeAcctCreditLimitRequestAccountCredit(
           java.lang.String creditLimitType,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit commonCreditLimit,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit tmpCreditLimit) {
           this.creditLimitType = creditLimitType;
           this.commonCreditLimit = commonCreditLimit;
           this.tmpCreditLimit = tmpCreditLimit;
    }


    /**
     * Gets the creditLimitType value for this ChangeAcctCreditLimitRequestAccountCredit.
     * 
     * @return creditLimitType
     */
    public java.lang.String getCreditLimitType() {
        return creditLimitType;
    }


    /**
     * Sets the creditLimitType value for this ChangeAcctCreditLimitRequestAccountCredit.
     * 
     * @param creditLimitType
     */
    public void setCreditLimitType(java.lang.String creditLimitType) {
        this.creditLimitType = creditLimitType;
    }


    /**
     * Gets the commonCreditLimit value for this ChangeAcctCreditLimitRequestAccountCredit.
     * 
     * @return commonCreditLimit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit getCommonCreditLimit() {
        return commonCreditLimit;
    }


    /**
     * Sets the commonCreditLimit value for this ChangeAcctCreditLimitRequestAccountCredit.
     * 
     * @param commonCreditLimit
     */
    public void setCommonCreditLimit(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCreditCommonCreditLimit commonCreditLimit) {
        this.commonCreditLimit = commonCreditLimit;
    }


    /**
     * Gets the tmpCreditLimit value for this ChangeAcctCreditLimitRequestAccountCredit.
     * 
     * @return tmpCreditLimit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit getTmpCreditLimit() {
        return tmpCreditLimit;
    }


    /**
     * Sets the tmpCreditLimit value for this ChangeAcctCreditLimitRequestAccountCredit.
     * 
     * @param tmpCreditLimit
     */
    public void setTmpCreditLimit(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit tmpCreditLimit) {
        this.tmpCreditLimit = tmpCreditLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAcctCreditLimitRequestAccountCredit)) return false;
        ChangeAcctCreditLimitRequestAccountCredit other = (ChangeAcctCreditLimitRequestAccountCredit) obj;
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
            ((this.commonCreditLimit==null && other.getCommonCreditLimit()==null) || 
             (this.commonCreditLimit!=null &&
              this.commonCreditLimit.equals(other.getCommonCreditLimit()))) &&
            ((this.tmpCreditLimit==null && other.getTmpCreditLimit()==null) || 
             (this.tmpCreditLimit!=null &&
              this.tmpCreditLimit.equals(other.getTmpCreditLimit())));
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
        if (getCommonCreditLimit() != null) {
            _hashCode += getCommonCreditLimit().hashCode();
        }
        if (getTmpCreditLimit() != null) {
            _hashCode += getTmpCreditLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeAcctCreditLimitRequestAccountCredit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitRequest>AccountCredit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreditLimitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonCreditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CommonCreditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctCreditLimitRequest>AccountCredit>CommonCreditLimit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmpCreditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "TmpCreditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctCreditLimitRequest>AccountCredit>TmpCreditLimit"));
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
