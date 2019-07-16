/**
 * QueryPaymentRelationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryPaymentRelationResult  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationList paymentRelationList;

    public QueryPaymentRelationResult() {
    }

    public QueryPaymentRelationResult(
           com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationList paymentRelationList) {
           this.paymentRelationList = paymentRelationList;
    }


    /**
     * Gets the paymentRelationList value for this QueryPaymentRelationResult.
     * 
     * @return paymentRelationList
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationList getPaymentRelationList() {
        return paymentRelationList;
    }


    /**
     * Sets the paymentRelationList value for this QueryPaymentRelationResult.
     * 
     * @param paymentRelationList
     */
    public void setPaymentRelationList(com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultPaymentRelationList paymentRelationList) {
        this.paymentRelationList = paymentRelationList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPaymentRelationResult)) return false;
        QueryPaymentRelationResult other = (QueryPaymentRelationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentRelationList==null && other.getPaymentRelationList()==null) || 
             (this.paymentRelationList!=null &&
              this.paymentRelationList.equals(other.getPaymentRelationList())));
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
        if (getPaymentRelationList() != null) {
            _hashCode += getPaymentRelationList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryPaymentRelationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryPaymentRelationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentRelationList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentRelationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentRelationResult>PaymentRelationList"));
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
