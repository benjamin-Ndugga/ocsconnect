/**
 * AddGroupMemberRequestPaymentRelationAddPayRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class AddGroupMemberRequestPaymentRelationAddPayRelation  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPayRelation[] payRelation;

    private com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimit[] paymentLimit;

    public AddGroupMemberRequestPaymentRelationAddPayRelation() {
    }

    public AddGroupMemberRequestPaymentRelationAddPayRelation(
           com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPayRelation[] payRelation,
           com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimit[] paymentLimit) {
           this.payRelation = payRelation;
           this.paymentLimit = paymentLimit;
    }


    /**
     * Gets the payRelation value for this AddGroupMemberRequestPaymentRelationAddPayRelation.
     * 
     * @return payRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPayRelation[] getPayRelation() {
        return payRelation;
    }


    /**
     * Sets the payRelation value for this AddGroupMemberRequestPaymentRelationAddPayRelation.
     * 
     * @param payRelation
     */
    public void setPayRelation(com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPayRelation[] payRelation) {
        this.payRelation = payRelation;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPayRelation getPayRelation(int i) {
        return this.payRelation[i];
    }

    public void setPayRelation(int i, com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPayRelation _value) {
        this.payRelation[i] = _value;
    }


    /**
     * Gets the paymentLimit value for this AddGroupMemberRequestPaymentRelationAddPayRelation.
     * 
     * @return paymentLimit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimit[] getPaymentLimit() {
        return paymentLimit;
    }


    /**
     * Sets the paymentLimit value for this AddGroupMemberRequestPaymentRelationAddPayRelation.
     * 
     * @param paymentLimit
     */
    public void setPaymentLimit(com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimit[] paymentLimit) {
        this.paymentLimit = paymentLimit;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimit getPaymentLimit(int i) {
        return this.paymentLimit[i];
    }

    public void setPaymentLimit(int i, com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimit _value) {
        this.paymentLimit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddGroupMemberRequestPaymentRelationAddPayRelation)) return false;
        AddGroupMemberRequestPaymentRelationAddPayRelation other = (AddGroupMemberRequestPaymentRelationAddPayRelation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payRelation==null && other.getPayRelation()==null) || 
             (this.payRelation!=null &&
              java.util.Arrays.equals(this.payRelation, other.getPayRelation()))) &&
            ((this.paymentLimit==null && other.getPaymentLimit()==null) || 
             (this.paymentLimit!=null &&
              java.util.Arrays.equals(this.paymentLimit, other.getPaymentLimit())));
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
        if (getPayRelation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayRelation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayRelation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentLimit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentLimit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentLimit(), i);
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
        new org.apache.axis.description.TypeDesc(AddGroupMemberRequestPaymentRelationAddPayRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>AddGroupMemberRequest>PaymentRelation>AddPayRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>AddGroupMemberRequest>PaymentRelation>AddPayRelation>PayRelation"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>AddGroupMemberRequest>PaymentRelation>AddPayRelation>PaymentLimit"));
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
