/**
 * QueryPaymentRelationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryPaymentRelationRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationRequestPayAccount payAccount;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationRequestPaymentObj paymentObj;

    public QueryPaymentRelationRequest() {
    }

    public QueryPaymentRelationRequest(
           com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationRequestPayAccount payAccount,
           com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationRequestPaymentObj paymentObj) {
           this.payAccount = payAccount;
           this.paymentObj = paymentObj;
    }


    /**
     * Gets the payAccount value for this QueryPaymentRelationRequest.
     * 
     * @return payAccount
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationRequestPayAccount getPayAccount() {
        return payAccount;
    }


    /**
     * Sets the payAccount value for this QueryPaymentRelationRequest.
     * 
     * @param payAccount
     */
    public void setPayAccount(com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationRequestPayAccount payAccount) {
        this.payAccount = payAccount;
    }


    /**
     * Gets the paymentObj value for this QueryPaymentRelationRequest.
     * 
     * @return paymentObj
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationRequestPaymentObj getPaymentObj() {
        return paymentObj;
    }


    /**
     * Sets the paymentObj value for this QueryPaymentRelationRequest.
     * 
     * @param paymentObj
     */
    public void setPaymentObj(com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationRequestPaymentObj paymentObj) {
        this.paymentObj = paymentObj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPaymentRelationRequest)) return false;
        QueryPaymentRelationRequest other = (QueryPaymentRelationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payAccount==null && other.getPayAccount()==null) || 
             (this.payAccount!=null &&
              this.payAccount.equals(other.getPayAccount()))) &&
            ((this.paymentObj==null && other.getPaymentObj()==null) || 
             (this.paymentObj!=null &&
              this.paymentObj.equals(other.getPaymentObj())));
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
        if (getPayAccount() != null) {
            _hashCode += getPayAccount().hashCode();
        }
        if (getPaymentObj() != null) {
            _hashCode += getPaymentObj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryPaymentRelationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryPaymentRelationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentRelationRequest>PayAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentRelationRequest>PaymentObj"));
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
