/**
 * Charge2BillRollbackResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class Charge2BillRollbackResult  implements java.io.Serializable {
    private java.lang.String charge2BillSerialNo;

    public Charge2BillRollbackResult() {
    }

    public Charge2BillRollbackResult(
           java.lang.String charge2BillSerialNo) {
           this.charge2BillSerialNo = charge2BillSerialNo;
    }


    /**
     * Gets the charge2BillSerialNo value for this Charge2BillRollbackResult.
     * 
     * @return charge2BillSerialNo
     */
    public java.lang.String getCharge2BillSerialNo() {
        return charge2BillSerialNo;
    }


    /**
     * Sets the charge2BillSerialNo value for this Charge2BillRollbackResult.
     * 
     * @param charge2BillSerialNo
     */
    public void setCharge2BillSerialNo(java.lang.String charge2BillSerialNo) {
        this.charge2BillSerialNo = charge2BillSerialNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Charge2BillRollbackResult)) return false;
        Charge2BillRollbackResult other = (Charge2BillRollbackResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.charge2BillSerialNo==null && other.getCharge2BillSerialNo()==null) || 
             (this.charge2BillSerialNo!=null &&
              this.charge2BillSerialNo.equals(other.getCharge2BillSerialNo())));
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
        if (getCharge2BillSerialNo() != null) {
            _hashCode += getCharge2BillSerialNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Charge2BillRollbackResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Charge2BillRollbackResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge2BillSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Charge2BillSerialNo"));
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