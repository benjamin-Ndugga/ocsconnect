/**
 * TaxException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class TaxException  implements java.io.Serializable {
    private java.math.BigInteger taxChargeCode;

    private java.math.BigInteger exceptionRate;

    public TaxException() {
    }

    public TaxException(
           java.math.BigInteger taxChargeCode,
           java.math.BigInteger exceptionRate) {
           this.taxChargeCode = taxChargeCode;
           this.exceptionRate = exceptionRate;
    }


    /**
     * Gets the taxChargeCode value for this TaxException.
     * 
     * @return taxChargeCode
     */
    public java.math.BigInteger getTaxChargeCode() {
        return taxChargeCode;
    }


    /**
     * Sets the taxChargeCode value for this TaxException.
     * 
     * @param taxChargeCode
     */
    public void setTaxChargeCode(java.math.BigInteger taxChargeCode) {
        this.taxChargeCode = taxChargeCode;
    }


    /**
     * Gets the exceptionRate value for this TaxException.
     * 
     * @return exceptionRate
     */
    public java.math.BigInteger getExceptionRate() {
        return exceptionRate;
    }


    /**
     * Sets the exceptionRate value for this TaxException.
     * 
     * @param exceptionRate
     */
    public void setExceptionRate(java.math.BigInteger exceptionRate) {
        this.exceptionRate = exceptionRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxException)) return false;
        TaxException other = (TaxException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxChargeCode==null && other.getTaxChargeCode()==null) || 
             (this.taxChargeCode!=null &&
              this.taxChargeCode.equals(other.getTaxChargeCode()))) &&
            ((this.exceptionRate==null && other.getExceptionRate()==null) || 
             (this.exceptionRate!=null &&
              this.exceptionRate.equals(other.getExceptionRate())));
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
        if (getTaxChargeCode() != null) {
            _hashCode += getTaxChargeCode().hashCode();
        }
        if (getExceptionRate() != null) {
            _hashCode += getExceptionRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "TaxException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxChargeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "TaxChargeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ExceptionRate"));
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
