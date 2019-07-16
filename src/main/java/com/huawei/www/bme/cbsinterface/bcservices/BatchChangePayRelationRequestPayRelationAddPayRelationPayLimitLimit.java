/**
 * BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit  implements java.io.Serializable {
    private java.lang.String limitType;

    private java.lang.String limitValueType;

    private java.math.BigInteger limitMeasureUnit;

    private long limitValue;

    public BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit() {
    }

    public BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit(
           java.lang.String limitType,
           java.lang.String limitValueType,
           java.math.BigInteger limitMeasureUnit,
           long limitValue) {
           this.limitType = limitType;
           this.limitValueType = limitValueType;
           this.limitMeasureUnit = limitMeasureUnit;
           this.limitValue = limitValue;
    }


    /**
     * Gets the limitType value for this BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit.
     * 
     * @return limitType
     */
    public java.lang.String getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit.
     * 
     * @param limitType
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }


    /**
     * Gets the limitValueType value for this BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit.
     * 
     * @return limitValueType
     */
    public java.lang.String getLimitValueType() {
        return limitValueType;
    }


    /**
     * Sets the limitValueType value for this BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit.
     * 
     * @param limitValueType
     */
    public void setLimitValueType(java.lang.String limitValueType) {
        this.limitValueType = limitValueType;
    }


    /**
     * Gets the limitMeasureUnit value for this BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit.
     * 
     * @return limitMeasureUnit
     */
    public java.math.BigInteger getLimitMeasureUnit() {
        return limitMeasureUnit;
    }


    /**
     * Sets the limitMeasureUnit value for this BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit.
     * 
     * @param limitMeasureUnit
     */
    public void setLimitMeasureUnit(java.math.BigInteger limitMeasureUnit) {
        this.limitMeasureUnit = limitMeasureUnit;
    }


    /**
     * Gets the limitValue value for this BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit.
     * 
     * @return limitValue
     */
    public long getLimitValue() {
        return limitValue;
    }


    /**
     * Sets the limitValue value for this BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit.
     * 
     * @param limitValue
     */
    public void setLimitValue(long limitValue) {
        this.limitValue = limitValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit)) return false;
        BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit other = (BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.limitType==null && other.getLimitType()==null) || 
             (this.limitType!=null &&
              this.limitType.equals(other.getLimitType()))) &&
            ((this.limitValueType==null && other.getLimitValueType()==null) || 
             (this.limitValueType!=null &&
              this.limitValueType.equals(other.getLimitValueType()))) &&
            ((this.limitMeasureUnit==null && other.getLimitMeasureUnit()==null) || 
             (this.limitMeasureUnit!=null &&
              this.limitMeasureUnit.equals(other.getLimitMeasureUnit()))) &&
            this.limitValue == other.getLimitValue();
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
        if (getLimitType() != null) {
            _hashCode += getLimitType().hashCode();
        }
        if (getLimitValueType() != null) {
            _hashCode += getLimitValueType().hashCode();
        }
        if (getLimitMeasureUnit() != null) {
            _hashCode += getLimitMeasureUnit().hashCode();
        }
        _hashCode += new Long(getLimitValue()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>BatchChangePayRelationRequest>PayRelation>AddPayRelation>PayLimit>Limit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitValueType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitValueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitMeasureUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitMeasureUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
