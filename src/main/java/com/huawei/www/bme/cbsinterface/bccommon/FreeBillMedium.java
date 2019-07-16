/**
 * FreeBillMedium.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class FreeBillMedium  implements java.io.Serializable {
    private java.lang.String BMCode;

    private java.lang.String BMType;

    public FreeBillMedium() {
    }

    public FreeBillMedium(
           java.lang.String BMCode,
           java.lang.String BMType) {
           this.BMCode = BMCode;
           this.BMType = BMType;
    }


    /**
     * Gets the BMCode value for this FreeBillMedium.
     * 
     * @return BMCode
     */
    public java.lang.String getBMCode() {
        return BMCode;
    }


    /**
     * Sets the BMCode value for this FreeBillMedium.
     * 
     * @param BMCode
     */
    public void setBMCode(java.lang.String BMCode) {
        this.BMCode = BMCode;
    }


    /**
     * Gets the BMType value for this FreeBillMedium.
     * 
     * @return BMType
     */
    public java.lang.String getBMType() {
        return BMType;
    }


    /**
     * Sets the BMType value for this FreeBillMedium.
     * 
     * @param BMType
     */
    public void setBMType(java.lang.String BMType) {
        this.BMType = BMType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FreeBillMedium)) return false;
        FreeBillMedium other = (FreeBillMedium) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BMCode==null && other.getBMCode()==null) || 
             (this.BMCode!=null &&
              this.BMCode.equals(other.getBMCode()))) &&
            ((this.BMType==null && other.getBMType()==null) || 
             (this.BMType!=null &&
              this.BMType.equals(other.getBMType())));
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
        if (getBMCode() != null) {
            _hashCode += getBMCode().hashCode();
        }
        if (getBMType() != null) {
            _hashCode += getBMType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FreeBillMedium.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "FreeBillMedium"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BMCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BMCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BMType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BMType"));
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
