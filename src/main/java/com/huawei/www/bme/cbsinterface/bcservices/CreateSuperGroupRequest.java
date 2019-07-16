/**
 * CreateSuperGroupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class CreateSuperGroupRequest  implements java.io.Serializable {
    /* SuperGroup id/code信息 */
    private com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupRequestSuperGroupAccessCode superGroupAccessCode;

    private java.lang.String superGroupName;

    public CreateSuperGroupRequest() {
    }

    public CreateSuperGroupRequest(
           com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupRequestSuperGroupAccessCode superGroupAccessCode,
           java.lang.String superGroupName) {
           this.superGroupAccessCode = superGroupAccessCode;
           this.superGroupName = superGroupName;
    }


    /**
     * Gets the superGroupAccessCode value for this CreateSuperGroupRequest.
     * 
     * @return superGroupAccessCode   * SuperGroup id/code信息
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupRequestSuperGroupAccessCode getSuperGroupAccessCode() {
        return superGroupAccessCode;
    }


    /**
     * Sets the superGroupAccessCode value for this CreateSuperGroupRequest.
     * 
     * @param superGroupAccessCode   * SuperGroup id/code信息
     */
    public void setSuperGroupAccessCode(com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupRequestSuperGroupAccessCode superGroupAccessCode) {
        this.superGroupAccessCode = superGroupAccessCode;
    }


    /**
     * Gets the superGroupName value for this CreateSuperGroupRequest.
     * 
     * @return superGroupName
     */
    public java.lang.String getSuperGroupName() {
        return superGroupName;
    }


    /**
     * Sets the superGroupName value for this CreateSuperGroupRequest.
     * 
     * @param superGroupName
     */
    public void setSuperGroupName(java.lang.String superGroupName) {
        this.superGroupName = superGroupName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSuperGroupRequest)) return false;
        CreateSuperGroupRequest other = (CreateSuperGroupRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.superGroupAccessCode==null && other.getSuperGroupAccessCode()==null) || 
             (this.superGroupAccessCode!=null &&
              this.superGroupAccessCode.equals(other.getSuperGroupAccessCode()))) &&
            ((this.superGroupName==null && other.getSuperGroupName()==null) || 
             (this.superGroupName!=null &&
              this.superGroupName.equals(other.getSuperGroupName())));
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
        if (getSuperGroupAccessCode() != null) {
            _hashCode += getSuperGroupAccessCode().hashCode();
        }
        if (getSuperGroupName() != null) {
            _hashCode += getSuperGroupName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSuperGroupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateSuperGroupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superGroupAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SuperGroupAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSuperGroupRequest>SuperGroupAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SuperGroupName"));
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
