/**
 * SupplementProfileRequestNewOwnership.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class SupplementProfileRequestNewOwnership  implements java.io.Serializable {
    private java.lang.String customerKey;

    private java.lang.String accountKey;

    public SupplementProfileRequestNewOwnership() {
    }

    public SupplementProfileRequestNewOwnership(
           java.lang.String customerKey,
           java.lang.String accountKey) {
           this.customerKey = customerKey;
           this.accountKey = accountKey;
    }


    /**
     * Gets the customerKey value for this SupplementProfileRequestNewOwnership.
     * 
     * @return customerKey
     */
    public java.lang.String getCustomerKey() {
        return customerKey;
    }


    /**
     * Sets the customerKey value for this SupplementProfileRequestNewOwnership.
     * 
     * @param customerKey
     */
    public void setCustomerKey(java.lang.String customerKey) {
        this.customerKey = customerKey;
    }


    /**
     * Gets the accountKey value for this SupplementProfileRequestNewOwnership.
     * 
     * @return accountKey
     */
    public java.lang.String getAccountKey() {
        return accountKey;
    }


    /**
     * Sets the accountKey value for this SupplementProfileRequestNewOwnership.
     * 
     * @param accountKey
     */
    public void setAccountKey(java.lang.String accountKey) {
        this.accountKey = accountKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupplementProfileRequestNewOwnership)) return false;
        SupplementProfileRequestNewOwnership other = (SupplementProfileRequestNewOwnership) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerKey==null && other.getCustomerKey()==null) || 
             (this.customerKey!=null &&
              this.customerKey.equals(other.getCustomerKey()))) &&
            ((this.accountKey==null && other.getAccountKey()==null) || 
             (this.accountKey!=null &&
              this.accountKey.equals(other.getAccountKey())));
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
        if (getCustomerKey() != null) {
            _hashCode += getCustomerKey().hashCode();
        }
        if (getAccountKey() != null) {
            _hashCode += getAccountKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupplementProfileRequestNewOwnership.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileRequest>NewOwnership"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CustomerKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AccountKey"));
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
