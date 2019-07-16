/**
 * SubGroupBasicInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class SubGroupBasicInfo  implements java.io.Serializable {
    private java.lang.String subGroupName;

    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] subGroupProperty;

    public SubGroupBasicInfo() {
    }

    public SubGroupBasicInfo(
           java.lang.String subGroupName,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] subGroupProperty) {
           this.subGroupName = subGroupName;
           this.subGroupProperty = subGroupProperty;
    }


    /**
     * Gets the subGroupName value for this SubGroupBasicInfo.
     * 
     * @return subGroupName
     */
    public java.lang.String getSubGroupName() {
        return subGroupName;
    }


    /**
     * Sets the subGroupName value for this SubGroupBasicInfo.
     * 
     * @param subGroupName
     */
    public void setSubGroupName(java.lang.String subGroupName) {
        this.subGroupName = subGroupName;
    }


    /**
     * Gets the subGroupProperty value for this SubGroupBasicInfo.
     * 
     * @return subGroupProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getSubGroupProperty() {
        return subGroupProperty;
    }


    /**
     * Sets the subGroupProperty value for this SubGroupBasicInfo.
     * 
     * @param subGroupProperty
     */
    public void setSubGroupProperty(com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] subGroupProperty) {
        this.subGroupProperty = subGroupProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty getSubGroupProperty(int i) {
        return this.subGroupProperty[i];
    }

    public void setSubGroupProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty _value) {
        this.subGroupProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubGroupBasicInfo)) return false;
        SubGroupBasicInfo other = (SubGroupBasicInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subGroupName==null && other.getSubGroupName()==null) || 
             (this.subGroupName!=null &&
              this.subGroupName.equals(other.getSubGroupName()))) &&
            ((this.subGroupProperty==null && other.getSubGroupProperty()==null) || 
             (this.subGroupProperty!=null &&
              java.util.Arrays.equals(this.subGroupProperty, other.getSubGroupProperty())));
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
        if (getSubGroupName() != null) {
            _hashCode += getSubGroupName().hashCode();
        }
        if (getSubGroupProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubGroupProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubGroupProperty(), i);
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
        new org.apache.axis.description.TypeDesc(SubGroupBasicInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupBasicInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupProperty"));
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
