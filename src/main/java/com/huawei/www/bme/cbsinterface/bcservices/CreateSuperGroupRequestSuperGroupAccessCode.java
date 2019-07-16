/**
 * CreateSuperGroupRequestSuperGroupAccessCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class CreateSuperGroupRequestSuperGroupAccessCode  implements java.io.Serializable {
    private java.lang.String superGroupKey;

    private java.lang.String superGroupCode;

    public CreateSuperGroupRequestSuperGroupAccessCode() {
    }

    public CreateSuperGroupRequestSuperGroupAccessCode(
           java.lang.String superGroupKey,
           java.lang.String superGroupCode) {
           this.superGroupKey = superGroupKey;
           this.superGroupCode = superGroupCode;
    }


    /**
     * Gets the superGroupKey value for this CreateSuperGroupRequestSuperGroupAccessCode.
     * 
     * @return superGroupKey
     */
    public java.lang.String getSuperGroupKey() {
        return superGroupKey;
    }


    /**
     * Sets the superGroupKey value for this CreateSuperGroupRequestSuperGroupAccessCode.
     * 
     * @param superGroupKey
     */
    public void setSuperGroupKey(java.lang.String superGroupKey) {
        this.superGroupKey = superGroupKey;
    }


    /**
     * Gets the superGroupCode value for this CreateSuperGroupRequestSuperGroupAccessCode.
     * 
     * @return superGroupCode
     */
    public java.lang.String getSuperGroupCode() {
        return superGroupCode;
    }


    /**
     * Sets the superGroupCode value for this CreateSuperGroupRequestSuperGroupAccessCode.
     * 
     * @param superGroupCode
     */
    public void setSuperGroupCode(java.lang.String superGroupCode) {
        this.superGroupCode = superGroupCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSuperGroupRequestSuperGroupAccessCode)) return false;
        CreateSuperGroupRequestSuperGroupAccessCode other = (CreateSuperGroupRequestSuperGroupAccessCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.superGroupKey==null && other.getSuperGroupKey()==null) || 
             (this.superGroupKey!=null &&
              this.superGroupKey.equals(other.getSuperGroupKey()))) &&
            ((this.superGroupCode==null && other.getSuperGroupCode()==null) || 
             (this.superGroupCode!=null &&
              this.superGroupCode.equals(other.getSuperGroupCode())));
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
        if (getSuperGroupKey() != null) {
            _hashCode += getSuperGroupKey().hashCode();
        }
        if (getSuperGroupCode() != null) {
            _hashCode += getSuperGroupCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSuperGroupRequestSuperGroupAccessCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSuperGroupRequest>SuperGroupAccessCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superGroupKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SuperGroupKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SuperGroupCode"));
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
