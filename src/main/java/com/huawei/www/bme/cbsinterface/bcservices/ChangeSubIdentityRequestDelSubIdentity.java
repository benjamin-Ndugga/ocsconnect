/**
 * ChangeSubIdentityRequestDelSubIdentity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubIdentityRequestDelSubIdentity  implements java.io.Serializable {
    private java.lang.String subIdentityType;

    private java.lang.String subIdentity;

    public ChangeSubIdentityRequestDelSubIdentity() {
    }

    public ChangeSubIdentityRequestDelSubIdentity(
           java.lang.String subIdentityType,
           java.lang.String subIdentity) {
           this.subIdentityType = subIdentityType;
           this.subIdentity = subIdentity;
    }


    /**
     * Gets the subIdentityType value for this ChangeSubIdentityRequestDelSubIdentity.
     * 
     * @return subIdentityType
     */
    public java.lang.String getSubIdentityType() {
        return subIdentityType;
    }


    /**
     * Sets the subIdentityType value for this ChangeSubIdentityRequestDelSubIdentity.
     * 
     * @param subIdentityType
     */
    public void setSubIdentityType(java.lang.String subIdentityType) {
        this.subIdentityType = subIdentityType;
    }


    /**
     * Gets the subIdentity value for this ChangeSubIdentityRequestDelSubIdentity.
     * 
     * @return subIdentity
     */
    public java.lang.String getSubIdentity() {
        return subIdentity;
    }


    /**
     * Sets the subIdentity value for this ChangeSubIdentityRequestDelSubIdentity.
     * 
     * @param subIdentity
     */
    public void setSubIdentity(java.lang.String subIdentity) {
        this.subIdentity = subIdentity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubIdentityRequestDelSubIdentity)) return false;
        ChangeSubIdentityRequestDelSubIdentity other = (ChangeSubIdentityRequestDelSubIdentity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subIdentityType==null && other.getSubIdentityType()==null) || 
             (this.subIdentityType!=null &&
              this.subIdentityType.equals(other.getSubIdentityType()))) &&
            ((this.subIdentity==null && other.getSubIdentity()==null) || 
             (this.subIdentity!=null &&
              this.subIdentity.equals(other.getSubIdentity())));
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
        if (getSubIdentityType() != null) {
            _hashCode += getSubIdentityType().hashCode();
        }
        if (getSubIdentity() != null) {
            _hashCode += getSubIdentity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubIdentityRequestDelSubIdentity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubIdentityRequest>DelSubIdentity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subIdentityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubIdentityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubIdentity"));
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
