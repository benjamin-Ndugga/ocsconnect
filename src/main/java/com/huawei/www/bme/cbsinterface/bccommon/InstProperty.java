/**
 * InstProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class InstProperty  implements java.io.Serializable {
    private java.lang.String propCode;

    private java.lang.String propType;

    private java.lang.String value;

    private com.huawei.www.bme.cbsinterface.bccommon.InstPropertySubPropInst[] subPropInst;

    public InstProperty() {
    }

    public InstProperty(
           java.lang.String propCode,
           java.lang.String propType,
           java.lang.String value,
           com.huawei.www.bme.cbsinterface.bccommon.InstPropertySubPropInst[] subPropInst) {
           this.propCode = propCode;
           this.propType = propType;
           this.value = value;
           this.subPropInst = subPropInst;
    }


    /**
     * Gets the propCode value for this InstProperty.
     * 
     * @return propCode
     */
    public java.lang.String getPropCode() {
        return propCode;
    }


    /**
     * Sets the propCode value for this InstProperty.
     * 
     * @param propCode
     */
    public void setPropCode(java.lang.String propCode) {
        this.propCode = propCode;
    }


    /**
     * Gets the propType value for this InstProperty.
     * 
     * @return propType
     */
    public java.lang.String getPropType() {
        return propType;
    }


    /**
     * Sets the propType value for this InstProperty.
     * 
     * @param propType
     */
    public void setPropType(java.lang.String propType) {
        this.propType = propType;
    }


    /**
     * Gets the value value for this InstProperty.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this InstProperty.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the subPropInst value for this InstProperty.
     * 
     * @return subPropInst
     */
    public com.huawei.www.bme.cbsinterface.bccommon.InstPropertySubPropInst[] getSubPropInst() {
        return subPropInst;
    }


    /**
     * Sets the subPropInst value for this InstProperty.
     * 
     * @param subPropInst
     */
    public void setSubPropInst(com.huawei.www.bme.cbsinterface.bccommon.InstPropertySubPropInst[] subPropInst) {
        this.subPropInst = subPropInst;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.InstPropertySubPropInst getSubPropInst(int i) {
        return this.subPropInst[i];
    }

    public void setSubPropInst(int i, com.huawei.www.bme.cbsinterface.bccommon.InstPropertySubPropInst _value) {
        this.subPropInst[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstProperty)) return false;
        InstProperty other = (InstProperty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.propCode==null && other.getPropCode()==null) || 
             (this.propCode!=null &&
              this.propCode.equals(other.getPropCode()))) &&
            ((this.propType==null && other.getPropType()==null) || 
             (this.propType!=null &&
              this.propType.equals(other.getPropType()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.subPropInst==null && other.getSubPropInst()==null) || 
             (this.subPropInst!=null &&
              java.util.Arrays.equals(this.subPropInst, other.getSubPropInst())));
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
        if (getPropCode() != null) {
            _hashCode += getPropCode().hashCode();
        }
        if (getPropType() != null) {
            _hashCode += getPropType().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getSubPropInst() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubPropInst());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubPropInst(), i);
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
        new org.apache.axis.description.TypeDesc(InstProperty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "InstProperty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PropCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PropType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subPropInst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubPropInst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">InstProperty>SubPropInst"));
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
