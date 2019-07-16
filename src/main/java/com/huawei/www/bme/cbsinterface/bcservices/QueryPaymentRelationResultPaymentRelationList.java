/**
 * QueryPaymentRelationResultPaymentRelationList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryPaymentRelationResultPaymentRelationList  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationListPayRelation[] payRelation;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationListPaymentLimit[] paymentLimit;

    public QueryPaymentRelationResultPaymentRelationList() {
    }

    public QueryPaymentRelationResultPaymentRelationList(
           com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationListPayRelation[] payRelation,
           com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationListPaymentLimit[] paymentLimit) {
           this.payRelation = payRelation;
           this.paymentLimit = paymentLimit;
    }


    /**
     * Gets the payRelation value for this QueryPaymentRelationResultPaymentRelationList.
     * 
     * @return payRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationListPayRelation[] getPayRelation() {
        return payRelation;
    }


    /**
     * Sets the payRelation value for this QueryPaymentRelationResultPaymentRelationList.
     * 
     * @param payRelation
     */
    public void setPayRelation(com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationListPayRelation[] payRelation) {
        this.payRelation = payRelation;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationListPayRelation getPayRelation(int i) {
        return this.payRelation[i];
    }

    public void setPayRelation(int i, com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationListPayRelation _value) {
        this.payRelation[i] = _value;
    }


    /**
     * Gets the paymentLimit value for this QueryPaymentRelationResultPaymentRelationList.
     * 
     * @return paymentLimit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationListPaymentLimit[] getPaymentLimit() {
        return paymentLimit;
    }


    /**
     * Sets the paymentLimit value for this QueryPaymentRelationResultPaymentRelationList.
     * 
     * @param paymentLimit
     */
    public void setPaymentLimit(com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationListPaymentLimit[] paymentLimit) {
        this.paymentLimit = paymentLimit;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationListPaymentLimit getPaymentLimit(int i) {
        return this.paymentLimit[i];
    }

    public void setPaymentLimit(int i, com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationListPaymentLimit _value) {
        this.paymentLimit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPaymentRelationResultPaymentRelationList)) return false;
        QueryPaymentRelationResultPaymentRelationList other = (QueryPaymentRelationResultPaymentRelationList) obj;
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
        new org.apache.axis.description.TypeDesc(QueryPaymentRelationResultPaymentRelationList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentRelationResult>PaymentRelationList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryPaymentRelationResult>PaymentRelationList>PayRelation"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryPaymentRelationResult>PaymentRelationList>PaymentLimit"));
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
