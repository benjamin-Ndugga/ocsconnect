/**
 * StatementScenario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class StatementScenario  implements java.io.Serializable {
    private java.lang.String[] accountKey;

    private java.lang.String[] subscriberKey;

    public StatementScenario() {
    }

    public StatementScenario(
           java.lang.String[] accountKey,
           java.lang.String[] subscriberKey) {
           this.accountKey = accountKey;
           this.subscriberKey = subscriberKey;
    }


    /**
     * Gets the accountKey value for this StatementScenario.
     * 
     * @return accountKey
     */
    public java.lang.String[] getAccountKey() {
        return accountKey;
    }


    /**
     * Sets the accountKey value for this StatementScenario.
     * 
     * @param accountKey
     */
    public void setAccountKey(java.lang.String[] accountKey) {
        this.accountKey = accountKey;
    }

    public java.lang.String getAccountKey(int i) {
        return this.accountKey[i];
    }

    public void setAccountKey(int i, java.lang.String _value) {
        this.accountKey[i] = _value;
    }


    /**
     * Gets the subscriberKey value for this StatementScenario.
     * 
     * @return subscriberKey
     */
    public java.lang.String[] getSubscriberKey() {
        return subscriberKey;
    }


    /**
     * Sets the subscriberKey value for this StatementScenario.
     * 
     * @param subscriberKey
     */
    public void setSubscriberKey(java.lang.String[] subscriberKey) {
        this.subscriberKey = subscriberKey;
    }

    public java.lang.String getSubscriberKey(int i) {
        return this.subscriberKey[i];
    }

    public void setSubscriberKey(int i, java.lang.String _value) {
        this.subscriberKey[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatementScenario)) return false;
        StatementScenario other = (StatementScenario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountKey==null && other.getAccountKey()==null) || 
             (this.accountKey!=null &&
              java.util.Arrays.equals(this.accountKey, other.getAccountKey()))) &&
            ((this.subscriberKey==null && other.getSubscriberKey()==null) || 
             (this.subscriberKey!=null &&
              java.util.Arrays.equals(this.subscriberKey, other.getSubscriberKey())));
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
        if (getAccountKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountKey(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriberKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriberKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriberKey(), i);
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
        new org.apache.axis.description.TypeDesc(StatementScenario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "StatementScenario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AccountKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubscriberKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
