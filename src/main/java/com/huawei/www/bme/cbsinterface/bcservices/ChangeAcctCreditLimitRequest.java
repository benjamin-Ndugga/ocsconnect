/**
 * ChangeAcctCreditLimitRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAcctCreditLimitRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAcctAccessCode acctAccessCode;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCredit[] accountCredit;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAddAccountCredit addAccountCredit;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestDelAccountCredit delAccountCredit;

    public ChangeAcctCreditLimitRequest() {
    }

    public ChangeAcctCreditLimitRequest(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAcctAccessCode acctAccessCode,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCredit[] accountCredit,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAddAccountCredit addAccountCredit,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestDelAccountCredit delAccountCredit) {
           this.acctAccessCode = acctAccessCode;
           this.accountCredit = accountCredit;
           this.addAccountCredit = addAccountCredit;
           this.delAccountCredit = delAccountCredit;
    }


    /**
     * Gets the acctAccessCode value for this ChangeAcctCreditLimitRequest.
     * 
     * @return acctAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAcctAccessCode getAcctAccessCode() {
        return acctAccessCode;
    }


    /**
     * Sets the acctAccessCode value for this ChangeAcctCreditLimitRequest.
     * 
     * @param acctAccessCode
     */
    public void setAcctAccessCode(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAcctAccessCode acctAccessCode) {
        this.acctAccessCode = acctAccessCode;
    }


    /**
     * Gets the accountCredit value for this ChangeAcctCreditLimitRequest.
     * 
     * @return accountCredit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCredit[] getAccountCredit() {
        return accountCredit;
    }


    /**
     * Sets the accountCredit value for this ChangeAcctCreditLimitRequest.
     * 
     * @param accountCredit
     */
    public void setAccountCredit(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCredit[] accountCredit) {
        this.accountCredit = accountCredit;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCredit getAccountCredit(int i) {
        return this.accountCredit[i];
    }

    public void setAccountCredit(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAccountCredit _value) {
        this.accountCredit[i] = _value;
    }


    /**
     * Gets the addAccountCredit value for this ChangeAcctCreditLimitRequest.
     * 
     * @return addAccountCredit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAddAccountCredit getAddAccountCredit() {
        return addAccountCredit;
    }


    /**
     * Sets the addAccountCredit value for this ChangeAcctCreditLimitRequest.
     * 
     * @param addAccountCredit
     */
    public void setAddAccountCredit(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestAddAccountCredit addAccountCredit) {
        this.addAccountCredit = addAccountCredit;
    }


    /**
     * Gets the delAccountCredit value for this ChangeAcctCreditLimitRequest.
     * 
     * @return delAccountCredit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestDelAccountCredit getDelAccountCredit() {
        return delAccountCredit;
    }


    /**
     * Sets the delAccountCredit value for this ChangeAcctCreditLimitRequest.
     * 
     * @param delAccountCredit
     */
    public void setDelAccountCredit(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestDelAccountCredit delAccountCredit) {
        this.delAccountCredit = delAccountCredit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAcctCreditLimitRequest)) return false;
        ChangeAcctCreditLimitRequest other = (ChangeAcctCreditLimitRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctAccessCode==null && other.getAcctAccessCode()==null) || 
             (this.acctAccessCode!=null &&
              this.acctAccessCode.equals(other.getAcctAccessCode()))) &&
            ((this.accountCredit==null && other.getAccountCredit()==null) || 
             (this.accountCredit!=null &&
              java.util.Arrays.equals(this.accountCredit, other.getAccountCredit()))) &&
            ((this.addAccountCredit==null && other.getAddAccountCredit()==null) || 
             (this.addAccountCredit!=null &&
              this.addAccountCredit.equals(other.getAddAccountCredit()))) &&
            ((this.delAccountCredit==null && other.getDelAccountCredit()==null) || 
             (this.delAccountCredit!=null &&
              this.delAccountCredit.equals(other.getDelAccountCredit())));
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
        if (getAcctAccessCode() != null) {
            _hashCode += getAcctAccessCode().hashCode();
        }
        if (getAccountCredit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountCredit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountCredit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddAccountCredit() != null) {
            _hashCode += getAddAccountCredit().hashCode();
        }
        if (getDelAccountCredit() != null) {
            _hashCode += getDelAccountCredit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeAcctCreditLimitRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctCreditLimitRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitRequest>AcctAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AccountCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitRequest>AccountCredit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addAccountCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddAccountCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitRequest>AddAccountCredit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delAccountCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelAccountCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctCreditLimitRequest>DelAccountCredit"));
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
