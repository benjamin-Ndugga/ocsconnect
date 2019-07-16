/**
 * ChangePayRelationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangePayRelationRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentObj paymentObj;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelation paymentRelation;

    public ChangePayRelationRequest() {
    }

    public ChangePayRelationRequest(
           com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentObj paymentObj,
           com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelation paymentRelation) {
           this.paymentObj = paymentObj;
           this.paymentRelation = paymentRelation;
    }


    /**
     * Gets the paymentObj value for this ChangePayRelationRequest.
     * 
     * @return paymentObj
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentObj getPaymentObj() {
        return paymentObj;
    }


    /**
     * Sets the paymentObj value for this ChangePayRelationRequest.
     * 
     * @param paymentObj
     */
    public void setPaymentObj(com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentObj paymentObj) {
        this.paymentObj = paymentObj;
    }


    /**
     * Gets the paymentRelation value for this ChangePayRelationRequest.
     * 
     * @return paymentRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelation getPaymentRelation() {
        return paymentRelation;
    }


    /**
     * Sets the paymentRelation value for this ChangePayRelationRequest.
     * 
     * @param paymentRelation
     */
    public void setPaymentRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelation paymentRelation) {
        this.paymentRelation = paymentRelation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePayRelationRequest)) return false;
        ChangePayRelationRequest other = (ChangePayRelationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentObj==null && other.getPaymentObj()==null) || 
             (this.paymentObj!=null &&
              this.paymentObj.equals(other.getPaymentObj()))) &&
            ((this.paymentRelation==null && other.getPaymentRelation()==null) || 
             (this.paymentRelation!=null &&
              this.paymentRelation.equals(other.getPaymentRelation())));
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
        if (getPaymentObj() != null) {
            _hashCode += getPaymentObj().hashCode();
        }
        if (getPaymentRelation() != null) {
            _hashCode += getPaymentRelation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePayRelationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangePayRelationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangePayRelationRequest>PaymentObj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangePayRelationRequest>PaymentRelation"));
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
