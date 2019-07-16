/**
 * SubGroupMemberInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class SubGroupMemberInfo  implements java.io.Serializable {
    private java.lang.String memberTypeCode;

    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] memberProperty;

    public SubGroupMemberInfo() {
    }

    public SubGroupMemberInfo(
           java.lang.String memberTypeCode,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] memberProperty) {
           this.memberTypeCode = memberTypeCode;
           this.memberProperty = memberProperty;
    }


    /**
     * Gets the memberTypeCode value for this SubGroupMemberInfo.
     * 
     * @return memberTypeCode
     */
    public java.lang.String getMemberTypeCode() {
        return memberTypeCode;
    }


    /**
     * Sets the memberTypeCode value for this SubGroupMemberInfo.
     * 
     * @param memberTypeCode
     */
    public void setMemberTypeCode(java.lang.String memberTypeCode) {
        this.memberTypeCode = memberTypeCode;
    }


    /**
     * Gets the memberProperty value for this SubGroupMemberInfo.
     * 
     * @return memberProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getMemberProperty() {
        return memberProperty;
    }


    /**
     * Sets the memberProperty value for this SubGroupMemberInfo.
     * 
     * @param memberProperty
     */
    public void setMemberProperty(com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] memberProperty) {
        this.memberProperty = memberProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty getMemberProperty(int i) {
        return this.memberProperty[i];
    }

    public void setMemberProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty _value) {
        this.memberProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubGroupMemberInfo)) return false;
        SubGroupMemberInfo other = (SubGroupMemberInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.memberTypeCode==null && other.getMemberTypeCode()==null) || 
             (this.memberTypeCode!=null &&
              this.memberTypeCode.equals(other.getMemberTypeCode()))) &&
            ((this.memberProperty==null && other.getMemberProperty()==null) || 
             (this.memberProperty!=null &&
              java.util.Arrays.equals(this.memberProperty, other.getMemberProperty())));
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
        if (getMemberTypeCode() != null) {
            _hashCode += getMemberTypeCode().hashCode();
        }
        if (getMemberProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemberProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemberProperty(), i);
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
        new org.apache.axis.description.TypeDesc(SubGroupMemberInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupMemberInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "MemberTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "MemberProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SimpleProperty"));
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
