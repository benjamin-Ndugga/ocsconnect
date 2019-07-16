/**
 * QueryHotBillingStatusRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryHotBillingStatusRequest  implements java.io.Serializable {
    private java.lang.String hotbillingSerialNo;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusRequestAcctAccessCode acctAccessCode;

    public QueryHotBillingStatusRequest() {
    }

    public QueryHotBillingStatusRequest(
           java.lang.String hotbillingSerialNo,
           com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusRequestAcctAccessCode acctAccessCode) {
           this.hotbillingSerialNo = hotbillingSerialNo;
           this.acctAccessCode = acctAccessCode;
    }


    /**
     * Gets the hotbillingSerialNo value for this QueryHotBillingStatusRequest.
     * 
     * @return hotbillingSerialNo
     */
    public java.lang.String getHotbillingSerialNo() {
        return hotbillingSerialNo;
    }


    /**
     * Sets the hotbillingSerialNo value for this QueryHotBillingStatusRequest.
     * 
     * @param hotbillingSerialNo
     */
    public void setHotbillingSerialNo(java.lang.String hotbillingSerialNo) {
        this.hotbillingSerialNo = hotbillingSerialNo;
    }


    /**
     * Gets the acctAccessCode value for this QueryHotBillingStatusRequest.
     * 
     * @return acctAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusRequestAcctAccessCode getAcctAccessCode() {
        return acctAccessCode;
    }


    /**
     * Sets the acctAccessCode value for this QueryHotBillingStatusRequest.
     * 
     * @param acctAccessCode
     */
    public void setAcctAccessCode(com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusRequestAcctAccessCode acctAccessCode) {
        this.acctAccessCode = acctAccessCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryHotBillingStatusRequest)) return false;
        QueryHotBillingStatusRequest other = (QueryHotBillingStatusRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hotbillingSerialNo==null && other.getHotbillingSerialNo()==null) || 
             (this.hotbillingSerialNo!=null &&
              this.hotbillingSerialNo.equals(other.getHotbillingSerialNo()))) &&
            ((this.acctAccessCode==null && other.getAcctAccessCode()==null) || 
             (this.acctAccessCode!=null &&
              this.acctAccessCode.equals(other.getAcctAccessCode())));
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
        if (getHotbillingSerialNo() != null) {
            _hashCode += getHotbillingSerialNo().hashCode();
        }
        if (getAcctAccessCode() != null) {
            _hashCode += getAcctAccessCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryHotBillingStatusRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryHotBillingStatusRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotbillingSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "hotbillingSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AcctAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryHotBillingStatusRequest>AcctAccessCode"));
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
