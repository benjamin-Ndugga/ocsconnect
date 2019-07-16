/**
 * FeeDeductionRollBackRequestRollBackFeeValues.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class FeeDeductionRollBackRequestRollBackFeeValues  implements java.io.Serializable {
    private java.lang.String chargeSeq;

    public FeeDeductionRollBackRequestRollBackFeeValues() {
    }

    public FeeDeductionRollBackRequestRollBackFeeValues(
           java.lang.String chargeSeq) {
           this.chargeSeq = chargeSeq;
    }


    /**
     * Gets the chargeSeq value for this FeeDeductionRollBackRequestRollBackFeeValues.
     * 
     * @return chargeSeq
     */
    public java.lang.String getChargeSeq() {
        return chargeSeq;
    }


    /**
     * Sets the chargeSeq value for this FeeDeductionRollBackRequestRollBackFeeValues.
     * 
     * @param chargeSeq
     */
    public void setChargeSeq(java.lang.String chargeSeq) {
        this.chargeSeq = chargeSeq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeDeductionRollBackRequestRollBackFeeValues)) return false;
        FeeDeductionRollBackRequestRollBackFeeValues other = (FeeDeductionRollBackRequestRollBackFeeValues) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chargeSeq==null && other.getChargeSeq()==null) || 
             (this.chargeSeq!=null &&
              this.chargeSeq.equals(other.getChargeSeq())));
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
        if (getChargeSeq() != null) {
            _hashCode += getChargeSeq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeeDeductionRollBackRequestRollBackFeeValues.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRollBackRequest>RollBackFeeValues"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChargeSeq"));
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
