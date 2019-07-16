/**
 * RscRelationShareLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class RscRelationShareLimit  implements java.io.Serializable {
    private java.lang.String limitCycleType;

    private long limitValue;

    private java.math.BigInteger measureUnit;

    public RscRelationShareLimit() {
    }

    public RscRelationShareLimit(
           java.lang.String limitCycleType,
           long limitValue,
           java.math.BigInteger measureUnit) {
           this.limitCycleType = limitCycleType;
           this.limitValue = limitValue;
           this.measureUnit = measureUnit;
    }


    /**
     * Gets the limitCycleType value for this RscRelationShareLimit.
     * 
     * @return limitCycleType
     */
    public java.lang.String getLimitCycleType() {
        return limitCycleType;
    }


    /**
     * Sets the limitCycleType value for this RscRelationShareLimit.
     * 
     * @param limitCycleType
     */
    public void setLimitCycleType(java.lang.String limitCycleType) {
        this.limitCycleType = limitCycleType;
    }


    /**
     * Gets the limitValue value for this RscRelationShareLimit.
     * 
     * @return limitValue
     */
    public long getLimitValue() {
        return limitValue;
    }


    /**
     * Sets the limitValue value for this RscRelationShareLimit.
     * 
     * @param limitValue
     */
    public void setLimitValue(long limitValue) {
        this.limitValue = limitValue;
    }


    /**
     * Gets the measureUnit value for this RscRelationShareLimit.
     * 
     * @return measureUnit
     */
    public java.math.BigInteger getMeasureUnit() {
        return measureUnit;
    }


    /**
     * Sets the measureUnit value for this RscRelationShareLimit.
     * 
     * @param measureUnit
     */
    public void setMeasureUnit(java.math.BigInteger measureUnit) {
        this.measureUnit = measureUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RscRelationShareLimit)) return false;
        RscRelationShareLimit other = (RscRelationShareLimit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.limitCycleType==null && other.getLimitCycleType()==null) || 
             (this.limitCycleType!=null &&
              this.limitCycleType.equals(other.getLimitCycleType()))) &&
            this.limitValue == other.getLimitValue() &&
            ((this.measureUnit==null && other.getMeasureUnit()==null) || 
             (this.measureUnit!=null &&
              this.measureUnit.equals(other.getMeasureUnit())));
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
        if (getLimitCycleType() != null) {
            _hashCode += getLimitCycleType().hashCode();
        }
        _hashCode += new Long(getLimitValue()).hashCode();
        if (getMeasureUnit() != null) {
            _hashCode += getMeasureUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RscRelationShareLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">RscRelation>ShareLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitCycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "LimitCycleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "LimitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "MeasureUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
