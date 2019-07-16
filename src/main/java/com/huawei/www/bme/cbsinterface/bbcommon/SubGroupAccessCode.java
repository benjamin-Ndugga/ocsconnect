/**
 * SubGroupAccessCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbcommon;

public class SubGroupAccessCode  implements java.io.Serializable {
    private java.lang.String subGroupKey;

    private java.lang.String subGroupCode;

    public SubGroupAccessCode() {
    }

    public SubGroupAccessCode(
           java.lang.String subGroupKey,
           java.lang.String subGroupCode) {
           this.subGroupKey = subGroupKey;
           this.subGroupCode = subGroupCode;
    }


    /**
     * Gets the subGroupKey value for this SubGroupAccessCode.
     * 
     * @return subGroupKey
     */
    public java.lang.String getSubGroupKey() {
        return subGroupKey;
    }


    /**
     * Sets the subGroupKey value for this SubGroupAccessCode.
     * 
     * @param subGroupKey
     */
    public void setSubGroupKey(java.lang.String subGroupKey) {
        this.subGroupKey = subGroupKey;
    }


    /**
     * Gets the subGroupCode value for this SubGroupAccessCode.
     * 
     * @return subGroupCode
     */
    public java.lang.String getSubGroupCode() {
        return subGroupCode;
    }


    /**
     * Sets the subGroupCode value for this SubGroupAccessCode.
     * 
     * @param subGroupCode
     */
    public void setSubGroupCode(java.lang.String subGroupCode) {
        this.subGroupCode = subGroupCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubGroupAccessCode)) return false;
        SubGroupAccessCode other = (SubGroupAccessCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subGroupKey==null && other.getSubGroupKey()==null) || 
             (this.subGroupKey!=null &&
              this.subGroupKey.equals(other.getSubGroupKey()))) &&
            ((this.subGroupCode==null && other.getSubGroupCode()==null) || 
             (this.subGroupCode!=null &&
              this.subGroupCode.equals(other.getSubGroupCode())));
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
        if (getSubGroupKey() != null) {
            _hashCode += getSubGroupKey().hashCode();
        }
        if (getSubGroupCode() != null) {
            _hashCode += getSubGroupCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubGroupAccessCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SubGroupAccessCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SubGroupKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SubGroupCode"));
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
