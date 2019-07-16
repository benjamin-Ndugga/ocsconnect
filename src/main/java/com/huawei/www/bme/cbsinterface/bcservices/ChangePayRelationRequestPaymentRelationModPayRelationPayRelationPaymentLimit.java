/**
 * ChangePayRelationRequestPaymentRelationModPayRelationPayRelationPaymentLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangePayRelationRequestPaymentRelationModPayRelationPayRelationPaymentLimit  implements java.io.Serializable {
    private java.lang.String opType;

    private java.lang.String paymentLimitKey;

    private java.lang.Long limitValue;

    public ChangePayRelationRequestPaymentRelationModPayRelationPayRelationPaymentLimit() {
    }

    public ChangePayRelationRequestPaymentRelationModPayRelationPayRelationPaymentLimit(
           java.lang.String opType,
           java.lang.String paymentLimitKey,
           java.lang.Long limitValue) {
           this.opType = opType;
           this.paymentLimitKey = paymentLimitKey;
           this.limitValue = limitValue;
    }


    /**
     * Gets the opType value for this ChangePayRelationRequestPaymentRelationModPayRelationPayRelationPaymentLimit.
     * 
     * @return opType
     */
    public java.lang.String getOpType() {
        return opType;
    }


    /**
     * Sets the opType value for this ChangePayRelationRequestPaymentRelationModPayRelationPayRelationPaymentLimit.
     * 
     * @param opType
     */
    public void setOpType(java.lang.String opType) {
        this.opType = opType;
    }


    /**
     * Gets the paymentLimitKey value for this ChangePayRelationRequestPaymentRelationModPayRelationPayRelationPaymentLimit.
     * 
     * @return paymentLimitKey
     */
    public java.lang.String getPaymentLimitKey() {
        return paymentLimitKey;
    }


    /**
     * Sets the paymentLimitKey value for this ChangePayRelationRequestPaymentRelationModPayRelationPayRelationPaymentLimit.
     * 
     * @param paymentLimitKey
     */
    public void setPaymentLimitKey(java.lang.String paymentLimitKey) {
        this.paymentLimitKey = paymentLimitKey;
    }


    /**
     * Gets the limitValue value for this ChangePayRelationRequestPaymentRelationModPayRelationPayRelationPaymentLimit.
     * 
     * @return limitValue
     */
    public java.lang.Long getLimitValue() {
        return limitValue;
    }


    /**
     * Sets the limitValue value for this ChangePayRelationRequestPaymentRelationModPayRelationPayRelationPaymentLimit.
     * 
     * @param limitValue
     */
    public void setLimitValue(java.lang.Long limitValue) {
        this.limitValue = limitValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePayRelationRequestPaymentRelationModPayRelationPayRelationPaymentLimit)) return false;
        ChangePayRelationRequestPaymentRelationModPayRelationPayRelationPaymentLimit other = (ChangePayRelationRequestPaymentRelationModPayRelationPayRelationPaymentLimit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.opType==null && other.getOpType()==null) || 
             (this.opType!=null &&
              this.opType.equals(other.getOpType()))) &&
            ((this.paymentLimitKey==null && other.getPaymentLimitKey()==null) || 
             (this.paymentLimitKey!=null &&
              this.paymentLimitKey.equals(other.getPaymentLimitKey()))) &&
            ((this.limitValue==null && other.getLimitValue()==null) || 
             (this.limitValue!=null &&
              this.limitValue.equals(other.getLimitValue())));
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
        if (getOpType() != null) {
            _hashCode += getOpType().hashCode();
        }
        if (getPaymentLimitKey() != null) {
            _hashCode += getPaymentLimitKey().hashCode();
        }
        if (getLimitValue() != null) {
            _hashCode += getLimitValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePayRelationRequestPaymentRelationModPayRelationPayRelationPaymentLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>ChangePayRelationRequest>PaymentRelation>ModPayRelation>PayRelation>PaymentLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OpType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentLimitKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentLimitKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
