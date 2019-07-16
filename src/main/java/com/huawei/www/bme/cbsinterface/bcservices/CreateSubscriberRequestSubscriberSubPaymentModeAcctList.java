/**
 * CreateSubscriberRequestSubscriberSubPaymentModeAcctList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class CreateSubscriberRequestSubscriberSubPaymentModeAcctList  implements java.io.Serializable {
    private java.lang.String acctKey;

    private java.lang.String DEFAcctFlag;

    public CreateSubscriberRequestSubscriberSubPaymentModeAcctList() {
    }

    public CreateSubscriberRequestSubscriberSubPaymentModeAcctList(
           java.lang.String acctKey,
           java.lang.String DEFAcctFlag) {
           this.acctKey = acctKey;
           this.DEFAcctFlag = DEFAcctFlag;
    }


    /**
     * Gets the acctKey value for this CreateSubscriberRequestSubscriberSubPaymentModeAcctList.
     * 
     * @return acctKey
     */
    public java.lang.String getAcctKey() {
        return acctKey;
    }


    /**
     * Sets the acctKey value for this CreateSubscriberRequestSubscriberSubPaymentModeAcctList.
     * 
     * @param acctKey
     */
    public void setAcctKey(java.lang.String acctKey) {
        this.acctKey = acctKey;
    }


    /**
     * Gets the DEFAcctFlag value for this CreateSubscriberRequestSubscriberSubPaymentModeAcctList.
     * 
     * @return DEFAcctFlag
     */
    public java.lang.String getDEFAcctFlag() {
        return DEFAcctFlag;
    }


    /**
     * Sets the DEFAcctFlag value for this CreateSubscriberRequestSubscriberSubPaymentModeAcctList.
     * 
     * @param DEFAcctFlag
     */
    public void setDEFAcctFlag(java.lang.String DEFAcctFlag) {
        this.DEFAcctFlag = DEFAcctFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSubscriberRequestSubscriberSubPaymentModeAcctList)) return false;
        CreateSubscriberRequestSubscriberSubPaymentModeAcctList other = (CreateSubscriberRequestSubscriberSubPaymentModeAcctList) obj;
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
            ((this.DEFAcctFlag==null && other.getDEFAcctFlag()==null) || 
             (this.DEFAcctFlag!=null &&
              this.DEFAcctFlag.equals(other.getDEFAcctFlag())));
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
        if (getDEFAcctFlag() != null) {
            _hashCode += getDEFAcctFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSubscriberRequestSubscriberSubPaymentModeAcctList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>CreateSubscriberRequest>Subscriber>SubPaymentMode>AcctList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEFAcctFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DEFAcctFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
