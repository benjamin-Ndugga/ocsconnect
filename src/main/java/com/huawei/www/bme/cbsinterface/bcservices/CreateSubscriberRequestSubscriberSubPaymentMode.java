/**
 * CreateSubscriberRequestSubscriberSubPaymentMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class CreateSubscriberRequestSubscriberSubPaymentMode  implements java.io.Serializable {
    private java.lang.String paymentMode;

    private java.lang.String payRelationKey;

    private java.lang.String acctKey;

    /* For Postpaid or Prepaid subscriber, there is only one postpaid
     * or prepaid account for this subscriber.
     * For Hybrid subscriber, it can has prepaid account and postpaid account
     * at the same time, but it should select one account as default. */
    private com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModeAcctList[] acctList;

    private com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePayRelation[] payRelation;

    private com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit[] paymentLimit;

    public CreateSubscriberRequestSubscriberSubPaymentMode() {
    }

    public CreateSubscriberRequestSubscriberSubPaymentMode(
           java.lang.String paymentMode,
           java.lang.String payRelationKey,
           java.lang.String acctKey,
           com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModeAcctList[] acctList,
           com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePayRelation[] payRelation,
           com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit[] paymentLimit) {
           this.paymentMode = paymentMode;
           this.payRelationKey = payRelationKey;
           this.acctKey = acctKey;
           this.acctList = acctList;
           this.payRelation = payRelation;
           this.paymentLimit = paymentLimit;
    }


    /**
     * Gets the paymentMode value for this CreateSubscriberRequestSubscriberSubPaymentMode.
     * 
     * @return paymentMode
     */
    public java.lang.String getPaymentMode() {
        return paymentMode;
    }


    /**
     * Sets the paymentMode value for this CreateSubscriberRequestSubscriberSubPaymentMode.
     * 
     * @param paymentMode
     */
    public void setPaymentMode(java.lang.String paymentMode) {
        this.paymentMode = paymentMode;
    }


    /**
     * Gets the payRelationKey value for this CreateSubscriberRequestSubscriberSubPaymentMode.
     * 
     * @return payRelationKey
     */
    public java.lang.String getPayRelationKey() {
        return payRelationKey;
    }


    /**
     * Sets the payRelationKey value for this CreateSubscriberRequestSubscriberSubPaymentMode.
     * 
     * @param payRelationKey
     */
    public void setPayRelationKey(java.lang.String payRelationKey) {
        this.payRelationKey = payRelationKey;
    }


    /**
     * Gets the acctKey value for this CreateSubscriberRequestSubscriberSubPaymentMode.
     * 
     * @return acctKey
     */
    public java.lang.String getAcctKey() {
        return acctKey;
    }


    /**
     * Sets the acctKey value for this CreateSubscriberRequestSubscriberSubPaymentMode.
     * 
     * @param acctKey
     */
    public void setAcctKey(java.lang.String acctKey) {
        this.acctKey = acctKey;
    }


    /**
     * Gets the acctList value for this CreateSubscriberRequestSubscriberSubPaymentMode.
     * 
     * @return acctList   * For Postpaid or Prepaid subscriber, there is only one postpaid
     * or prepaid account for this subscriber.
     * For Hybrid subscriber, it can has prepaid account and postpaid account
     * at the same time, but it should select one account as default.
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModeAcctList[] getAcctList() {
        return acctList;
    }


    /**
     * Sets the acctList value for this CreateSubscriberRequestSubscriberSubPaymentMode.
     * 
     * @param acctList   * For Postpaid or Prepaid subscriber, there is only one postpaid
     * or prepaid account for this subscriber.
     * For Hybrid subscriber, it can has prepaid account and postpaid account
     * at the same time, but it should select one account as default.
     */
    public void setAcctList(com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModeAcctList[] acctList) {
        this.acctList = acctList;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModeAcctList getAcctList(int i) {
        return this.acctList[i];
    }

    public void setAcctList(int i, com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModeAcctList _value) {
        this.acctList[i] = _value;
    }


    /**
     * Gets the payRelation value for this CreateSubscriberRequestSubscriberSubPaymentMode.
     * 
     * @return payRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePayRelation[] getPayRelation() {
        return payRelation;
    }


    /**
     * Sets the payRelation value for this CreateSubscriberRequestSubscriberSubPaymentMode.
     * 
     * @param payRelation
     */
    public void setPayRelation(com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePayRelation[] payRelation) {
        this.payRelation = payRelation;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePayRelation getPayRelation(int i) {
        return this.payRelation[i];
    }

    public void setPayRelation(int i, com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePayRelation _value) {
        this.payRelation[i] = _value;
    }


    /**
     * Gets the paymentLimit value for this CreateSubscriberRequestSubscriberSubPaymentMode.
     * 
     * @return paymentLimit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit[] getPaymentLimit() {
        return paymentLimit;
    }


    /**
     * Sets the paymentLimit value for this CreateSubscriberRequestSubscriberSubPaymentMode.
     * 
     * @param paymentLimit
     */
    public void setPaymentLimit(com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit[] paymentLimit) {
        this.paymentLimit = paymentLimit;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit getPaymentLimit(int i) {
        return this.paymentLimit[i];
    }

    public void setPaymentLimit(int i, com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriberSubPaymentModePaymentLimit _value) {
        this.paymentLimit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSubscriberRequestSubscriberSubPaymentMode)) return false;
        CreateSubscriberRequestSubscriberSubPaymentMode other = (CreateSubscriberRequestSubscriberSubPaymentMode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentMode==null && other.getPaymentMode()==null) || 
             (this.paymentMode!=null &&
              this.paymentMode.equals(other.getPaymentMode()))) &&
            ((this.payRelationKey==null && other.getPayRelationKey()==null) || 
             (this.payRelationKey!=null &&
              this.payRelationKey.equals(other.getPayRelationKey()))) &&
            ((this.acctKey==null && other.getAcctKey()==null) || 
             (this.acctKey!=null &&
              this.acctKey.equals(other.getAcctKey()))) &&
            ((this.acctList==null && other.getAcctList()==null) || 
             (this.acctList!=null &&
              java.util.Arrays.equals(this.acctList, other.getAcctList()))) &&
            ((this.payRelation==null && other.getPayRelation()==null) || 
             (this.payRelation!=null &&
              java.util.Arrays.equals(this.payRelation, other.getPayRelation()))) &&
            ((this.paymentLimit==null && other.getPaymentLimit()==null) || 
             (this.paymentLimit!=null &&
              java.util.Arrays.equals(this.paymentLimit, other.getPaymentLimit())));
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
        if (getPaymentMode() != null) {
            _hashCode += getPaymentMode().hashCode();
        }
        if (getPayRelationKey() != null) {
            _hashCode += getPayRelationKey().hashCode();
        }
        if (getAcctKey() != null) {
            _hashCode += getAcctKey().hashCode();
        }
        if (getAcctList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcctList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcctList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayRelation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayRelation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayRelation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentLimit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentLimit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentLimit(), i);
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
        new org.apache.axis.description.TypeDesc(CreateSubscriberRequestSubscriberSubPaymentMode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>CreateSubscriberRequest>Subscriber>SubPaymentMode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRelationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayRelationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>CreateSubscriberRequest>Subscriber>SubPaymentMode>AcctList"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>CreateSubscriberRequest>Subscriber>SubPaymentMode>PayRelation"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>CreateSubscriberRequest>Subscriber>SubPaymentMode>PaymentLimit"));
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
