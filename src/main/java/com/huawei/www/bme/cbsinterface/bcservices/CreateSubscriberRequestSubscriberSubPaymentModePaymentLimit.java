/**
 * CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit  implements java.io.Serializable {
    private java.lang.String paymentLimitKey;

    private com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePaymentLimitPaymentLimitInfo paymentLimitInfo;

    public CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit() {
    }

    public CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit(
           java.lang.String paymentLimitKey,
           com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePaymentLimitPaymentLimitInfo paymentLimitInfo) {
           this.paymentLimitKey = paymentLimitKey;
           this.paymentLimitInfo = paymentLimitInfo;
    }


    /**
     * Gets the paymentLimitKey value for this CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit.
     * 
     * @return paymentLimitKey
     */
    public java.lang.String getPaymentLimitKey() {
        return paymentLimitKey;
    }


    /**
     * Sets the paymentLimitKey value for this CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit.
     * 
     * @param paymentLimitKey
     */
    public void setPaymentLimitKey(java.lang.String paymentLimitKey) {
        this.paymentLimitKey = paymentLimitKey;
    }


    /**
     * Gets the paymentLimitInfo value for this CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit.
     * 
     * @return paymentLimitInfo
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePaymentLimitPaymentLimitInfo getPaymentLimitInfo() {
        return paymentLimitInfo;
    }


    /**
     * Sets the paymentLimitInfo value for this CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit.
     * 
     * @param paymentLimitInfo
     */
    public void setPaymentLimitInfo(com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePaymentLimitPaymentLimitInfo paymentLimitInfo) {
        this.paymentLimitInfo = paymentLimitInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit)) return false;
        CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit other = (CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentLimitKey==null && other.getPaymentLimitKey()==null) || 
             (this.paymentLimitKey!=null &&
              this.paymentLimitKey.equals(other.getPaymentLimitKey()))) &&
            ((this.paymentLimitInfo==null && other.getPaymentLimitInfo()==null) || 
             (this.paymentLimitInfo!=null &&
              this.paymentLimitInfo.equals(other.getPaymentLimitInfo())));
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
        if (getPaymentLimitKey() != null) {
            _hashCode += getPaymentLimitKey().hashCode();
        }
        if (getPaymentLimitInfo() != null) {
            _hashCode += getPaymentLimitInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>CreateSubscriberRequest>Subscriber>SubPaymentMode>PaymentLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentLimitKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentLimitKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentLimitInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentLimitInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>CreateSubscriberRequest>Subscriber>SubPaymentMode>PaymentLimit>PaymentLimitInfo"));
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
