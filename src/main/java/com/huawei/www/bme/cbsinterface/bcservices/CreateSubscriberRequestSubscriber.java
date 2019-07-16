/**
 * CreateSubscriberRequestSubscriber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class CreateSubscriberRequestSubscriber  implements java.io.Serializable {
    private java.lang.String subscriberKey;

    private com.huawei.www.bme.cbsinterface.bccommon.Subscriber subscriberInfo;

    private com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentMode subPaymentMode;

    public CreateSubscriberRequestSubscriber() {
    }

    public CreateSubscriberRequestSubscriber(
           java.lang.String subscriberKey,
           com.huawei.www.bme.cbsinterface.bccommon.Subscriber subscriberInfo,
           com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentMode subPaymentMode) {
           this.subscriberKey = subscriberKey;
           this.subscriberInfo = subscriberInfo;
           this.subPaymentMode = subPaymentMode;
    }


    /**
     * Gets the subscriberKey value for this CreateSubscriberRequestSubscriber.
     * 
     * @return subscriberKey
     */
    public java.lang.String getSubscriberKey() {
        return subscriberKey;
    }


    /**
     * Sets the subscriberKey value for this CreateSubscriberRequestSubscriber.
     * 
     * @param subscriberKey
     */
    public void setSubscriberKey(java.lang.String subscriberKey) {
        this.subscriberKey = subscriberKey;
    }


    /**
     * Gets the subscriberInfo value for this CreateSubscriberRequestSubscriber.
     * 
     * @return subscriberInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Subscriber getSubscriberInfo() {
        return subscriberInfo;
    }


    /**
     * Sets the subscriberInfo value for this CreateSubscriberRequestSubscriber.
     * 
     * @param subscriberInfo
     */
    public void setSubscriberInfo(com.huawei.www.bme.cbsinterface.bccommon.Subscriber subscriberInfo) {
        this.subscriberInfo = subscriberInfo;
    }


    /**
     * Gets the subPaymentMode value for this CreateSubscriberRequestSubscriber.
     * 
     * @return subPaymentMode
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentMode getSubPaymentMode() {
        return subPaymentMode;
    }


    /**
     * Sets the subPaymentMode value for this CreateSubscriberRequestSubscriber.
     * 
     * @param subPaymentMode
     */
    public void setSubPaymentMode(com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentMode subPaymentMode) {
        this.subPaymentMode = subPaymentMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSubscriberRequestSubscriber)) return false;
        CreateSubscriberRequestSubscriber other = (CreateSubscriberRequestSubscriber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberKey==null && other.getSubscriberKey()==null) || 
             (this.subscriberKey!=null &&
              this.subscriberKey.equals(other.getSubscriberKey()))) &&
            ((this.subscriberInfo==null && other.getSubscriberInfo()==null) || 
             (this.subscriberInfo!=null &&
              this.subscriberInfo.equals(other.getSubscriberInfo()))) &&
            ((this.subPaymentMode==null && other.getSubPaymentMode()==null) || 
             (this.subPaymentMode!=null &&
              this.subPaymentMode.equals(other.getSubPaymentMode())));
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
        if (getSubscriberKey() != null) {
            _hashCode += getSubscriberKey().hashCode();
        }
        if (getSubscriberInfo() != null) {
            _hashCode += getSubscriberInfo().hashCode();
        }
        if (getSubPaymentMode() != null) {
            _hashCode += getSubPaymentMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSubscriberRequestSubscriber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberRequest>Subscriber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubscriberKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubscriberInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Subscriber"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subPaymentMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubPaymentMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>CreateSubscriberRequest>Subscriber>SubPaymentMode"));
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
