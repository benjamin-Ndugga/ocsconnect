/**
 * CreateAccountRequestAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class CreateAccountRequestAccount  implements java.io.Serializable {
    private java.lang.String acctKey;

    private com.huawei.www.bme.cbsinterface.bccommon.AccountInfo acctInfo;

    public CreateAccountRequestAccount() {
    }

    public CreateAccountRequestAccount(
           java.lang.String acctKey,
           com.huawei.www.bme.cbsinterface.bccommon.AccountInfo acctInfo) {
           this.acctKey = acctKey;
           this.acctInfo = acctInfo;
    }


    /**
     * Gets the acctKey value for this CreateAccountRequestAccount.
     * 
     * @return acctKey
     */
    public java.lang.String getAcctKey() {
        return acctKey;
    }


    /**
     * Sets the acctKey value for this CreateAccountRequestAccount.
     * 
     * @param acctKey
     */
    public void setAcctKey(java.lang.String acctKey) {
        this.acctKey = acctKey;
    }


    /**
     * Gets the acctInfo value for this CreateAccountRequestAccount.
     * 
     * @return acctInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.AccountInfo getAcctInfo() {
        return acctInfo;
    }


    /**
     * Sets the acctInfo value for this CreateAccountRequestAccount.
     * 
     * @param acctInfo
     */
    public void setAcctInfo(com.huawei.www.bme.cbsinterface.bccommon.AccountInfo acctInfo) {
        this.acctInfo = acctInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateAccountRequestAccount)) return false;
        CreateAccountRequestAccount other = (CreateAccountRequestAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctKey==null && other.getAcctKey()==null) || 
             (this.acctKey!=null &&
              this.acctKey.equals(other.getAcctKey()))) &&
            ((this.acctInfo==null && other.getAcctInfo()==null) || 
             (this.acctInfo!=null &&
              this.acctInfo.equals(other.getAcctInfo())));
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
        if (getAcctKey() != null) {
            _hashCode += getAcctKey().hashCode();
        }
        if (getAcctInfo() != null) {
            _hashCode += getAcctInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateAccountRequestAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateAccountRequest>Account"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AccountInfo"));
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
