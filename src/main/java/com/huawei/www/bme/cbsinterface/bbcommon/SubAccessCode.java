/**
 * SubAccessCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbcommon;

public class SubAccessCode  implements java.io.Serializable {
    private java.lang.String primaryIdentity;

    private java.lang.String subscriberKey;

    public SubAccessCode() {
    }

    public SubAccessCode(
           java.lang.String primaryIdentity,
           java.lang.String subscriberKey) {
           this.primaryIdentity = primaryIdentity;
           this.subscriberKey = subscriberKey;
    }


    /**
     * Gets the primaryIdentity value for this SubAccessCode.
     * 
     * @return primaryIdentity
     */
    public java.lang.String getPrimaryIdentity() {
        return primaryIdentity;
    }


    /**
     * Sets the primaryIdentity value for this SubAccessCode.
     * 
     * @param primaryIdentity
     */
    public void setPrimaryIdentity(java.lang.String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }


    /**
     * Gets the subscriberKey value for this SubAccessCode.
     * 
     * @return subscriberKey
     */
    public java.lang.String getSubscriberKey() {
        return subscriberKey;
    }


    /**
     * Sets the subscriberKey value for this SubAccessCode.
     * 
     * @param subscriberKey
     */
    public void setSubscriberKey(java.lang.String subscriberKey) {
        this.subscriberKey = subscriberKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubAccessCode)) return false;
        SubAccessCode other = (SubAccessCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.primaryIdentity==null && other.getPrimaryIdentity()==null) || 
             (this.primaryIdentity!=null &&
              this.primaryIdentity.equals(other.getPrimaryIdentity()))) &&
            ((this.subscriberKey==null && other.getSubscriberKey()==null) || 
             (this.subscriberKey!=null &&
              this.subscriberKey.equals(other.getSubscriberKey())));
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
        if (getPrimaryIdentity() != null) {
            _hashCode += getPrimaryIdentity().hashCode();
        }
        if (getSubscriberKey() != null) {
            _hashCode += getSubscriberKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubAccessCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SubAccessCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "PrimaryIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SubscriberKey"));
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
