/**
 * CustAccessCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class CustAccessCode  implements java.io.Serializable {
    /* Identify the Customer which the Primary Identity belongs to. */
    private java.lang.String primaryIdentity;

    private java.lang.String customerKey;

    private java.lang.String customerCode;

    public CustAccessCode() {
    }

    public CustAccessCode(
           java.lang.String primaryIdentity,
           java.lang.String customerKey,
           java.lang.String customerCode) {
           this.primaryIdentity = primaryIdentity;
           this.customerKey = customerKey;
           this.customerCode = customerCode;
    }


    /**
     * Gets the primaryIdentity value for this CustAccessCode.
     * 
     * @return primaryIdentity   * Identify the Customer which the Primary Identity belongs to.
     */
    public java.lang.String getPrimaryIdentity() {
        return primaryIdentity;
    }


    /**
     * Sets the primaryIdentity value for this CustAccessCode.
     * 
     * @param primaryIdentity   * Identify the Customer which the Primary Identity belongs to.
     */
    public void setPrimaryIdentity(java.lang.String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }


    /**
     * Gets the customerKey value for this CustAccessCode.
     * 
     * @return customerKey
     */
    public java.lang.String getCustomerKey() {
        return customerKey;
    }


    /**
     * Sets the customerKey value for this CustAccessCode.
     * 
     * @param customerKey
     */
    public void setCustomerKey(java.lang.String customerKey) {
        this.customerKey = customerKey;
    }


    /**
     * Gets the customerCode value for this CustAccessCode.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this CustAccessCode.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustAccessCode)) return false;
        CustAccessCode other = (CustAccessCode) obj;
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
            ((this.customerKey==null && other.getCustomerKey()==null) || 
             (this.customerKey!=null &&
              this.customerKey.equals(other.getCustomerKey()))) &&
            ((this.customerCode==null && other.getCustomerCode()==null) || 
             (this.customerCode!=null &&
              this.customerCode.equals(other.getCustomerCode())));
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
        if (getCustomerKey() != null) {
            _hashCode += getCustomerKey().hashCode();
        }
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustAccessCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustAccessCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PrimaryIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustomerKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustomerCode"));
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
