/**
 * QueryPaymentLimitUsageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryPaymentLimitUsageRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageRequestPayAccount payAccount;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageRequestPayObj payObj;

    public QueryPaymentLimitUsageRequest() {
    }

    public QueryPaymentLimitUsageRequest(
           com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageRequestPayAccount payAccount,
           com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageRequestPayObj payObj) {
           this.payAccount = payAccount;
           this.payObj = payObj;
    }


    /**
     * Gets the payAccount value for this QueryPaymentLimitUsageRequest.
     * 
     * @return payAccount
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageRequestPayAccount getPayAccount() {
        return payAccount;
    }


    /**
     * Sets the payAccount value for this QueryPaymentLimitUsageRequest.
     * 
     * @param payAccount
     */
    public void setPayAccount(com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageRequestPayAccount payAccount) {
        this.payAccount = payAccount;
    }


    /**
     * Gets the payObj value for this QueryPaymentLimitUsageRequest.
     * 
     * @return payObj
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageRequestPayObj getPayObj() {
        return payObj;
    }


    /**
     * Sets the payObj value for this QueryPaymentLimitUsageRequest.
     * 
     * @param payObj
     */
    public void setPayObj(com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageRequestPayObj payObj) {
        this.payObj = payObj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPaymentLimitUsageRequest)) return false;
        QueryPaymentLimitUsageRequest other = (QueryPaymentLimitUsageRequest) obj;
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
            ((this.payObj==null && other.getPayObj()==null) || 
             (this.payObj!=null &&
              this.payObj.equals(other.getPayObj())));
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
        if (getPayObj() != null) {
            _hashCode += getPayObj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryPaymentLimitUsageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryPaymentLimitUsageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentLimitUsageRequest>PayAccount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentLimitUsageRequest>PayObj"));
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
