/**
 * QueryCustomerInfoResultSubscriber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryCustomerInfoResultSubscriber  implements java.io.Serializable {
    private java.lang.String subscriberKey;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSubscriberInfo subscriberInfo;

    private java.lang.String paymentMode;

    private com.huawei.www.bme.cbsinterface.bccommon.POfferingInst primaryOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSupplementaryOffering[] supplementaryOffering;

    public QueryCustomerInfoResultSubscriber() {
    }

    public QueryCustomerInfoResultSubscriber(
           java.lang.String subscriberKey,
           com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSubscriberInfo subscriberInfo,
           java.lang.String paymentMode,
           com.huawei.www.bme.cbsinterface.bccommon.POfferingInst primaryOffering,
           com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSupplementaryOffering[] supplementaryOffering) {
           this.subscriberKey = subscriberKey;
           this.subscriberInfo = subscriberInfo;
           this.paymentMode = paymentMode;
           this.primaryOffering = primaryOffering;
           this.supplementaryOffering = supplementaryOffering;
    }


    /**
     * Gets the subscriberKey value for this QueryCustomerInfoResultSubscriber.
     * 
     * @return subscriberKey
     */
    public java.lang.String getSubscriberKey() {
        return subscriberKey;
    }


    /**
     * Sets the subscriberKey value for this QueryCustomerInfoResultSubscriber.
     * 
     * @param subscriberKey
     */
    public void setSubscriberKey(java.lang.String subscriberKey) {
        this.subscriberKey = subscriberKey;
    }


    /**
     * Gets the subscriberInfo value for this QueryCustomerInfoResultSubscriber.
     * 
     * @return subscriberInfo
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSubscriberInfo getSubscriberInfo() {
        return subscriberInfo;
    }


    /**
     * Sets the subscriberInfo value for this QueryCustomerInfoResultSubscriber.
     * 
     * @param subscriberInfo
     */
    public void setSubscriberInfo(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSubscriberInfo subscriberInfo) {
        this.subscriberInfo = subscriberInfo;
    }


    /**
     * Gets the paymentMode value for this QueryCustomerInfoResultSubscriber.
     * 
     * @return paymentMode
     */
    public java.lang.String getPaymentMode() {
        return paymentMode;
    }


    /**
     * Sets the paymentMode value for this QueryCustomerInfoResultSubscriber.
     * 
     * @param paymentMode
     */
    public void setPaymentMode(java.lang.String paymentMode) {
        this.paymentMode = paymentMode;
    }


    /**
     * Gets the primaryOffering value for this QueryCustomerInfoResultSubscriber.
     * 
     * @return primaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bccommon.POfferingInst getPrimaryOffering() {
        return primaryOffering;
    }


    /**
     * Sets the primaryOffering value for this QueryCustomerInfoResultSubscriber.
     * 
     * @param primaryOffering
     */
    public void setPrimaryOffering(com.huawei.www.bme.cbsinterface.bccommon.POfferingInst primaryOffering) {
        this.primaryOffering = primaryOffering;
    }


    /**
     * Gets the supplementaryOffering value for this QueryCustomerInfoResultSubscriber.
     * 
     * @return supplementaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSupplementaryOffering[] getSupplementaryOffering() {
        return supplementaryOffering;
    }


    /**
     * Sets the supplementaryOffering value for this QueryCustomerInfoResultSubscriber.
     * 
     * @param supplementaryOffering
     */
    public void setSupplementaryOffering(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSupplementaryOffering[] supplementaryOffering) {
        this.supplementaryOffering = supplementaryOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSupplementaryOffering getSupplementaryOffering(int i) {
        return this.supplementaryOffering[i];
    }

    public void setSupplementaryOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSupplementaryOffering _value) {
        this.supplementaryOffering[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCustomerInfoResultSubscriber)) return false;
        QueryCustomerInfoResultSubscriber other = (QueryCustomerInfoResultSubscriber) obj;
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
            ((this.paymentMode==null && other.getPaymentMode()==null) || 
             (this.paymentMode!=null &&
              this.paymentMode.equals(other.getPaymentMode()))) &&
            ((this.primaryOffering==null && other.getPrimaryOffering()==null) || 
             (this.primaryOffering!=null &&
              this.primaryOffering.equals(other.getPrimaryOffering()))) &&
            ((this.supplementaryOffering==null && other.getSupplementaryOffering()==null) || 
             (this.supplementaryOffering!=null &&
              java.util.Arrays.equals(this.supplementaryOffering, other.getSupplementaryOffering())));
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
        if (getPaymentMode() != null) {
            _hashCode += getPaymentMode().hashCode();
        }
        if (getPrimaryOffering() != null) {
            _hashCode += getPrimaryOffering().hashCode();
        }
        if (getSupplementaryOffering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupplementaryOffering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupplementaryOffering(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCustomerInfoResultSubscriber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoResult>Subscriber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubscriberKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubscriberInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>Subscriber>SubscriberInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrimaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "POfferingInst"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplementaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SupplementaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>Subscriber>SupplementaryOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
