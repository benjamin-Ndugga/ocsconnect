/**
 * QueryGrpCallScreenNoRequestMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryGrpCallScreenNoRequestMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoRequest queryGrpCallScreenNoRequest;

    public QueryGrpCallScreenNoRequestMsg() {
    }

    public QueryGrpCallScreenNoRequestMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader,
           com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoRequest queryGrpCallScreenNoRequest) {
           this.requestHeader = requestHeader;
           this.queryGrpCallScreenNoRequest = queryGrpCallScreenNoRequest;
    }


    /**
     * Gets the requestHeader value for this QueryGrpCallScreenNoRequestMsg.
     * 
     * @return requestHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this QueryGrpCallScreenNoRequestMsg.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the queryGrpCallScreenNoRequest value for this QueryGrpCallScreenNoRequestMsg.
     * 
     * @return queryGrpCallScreenNoRequest
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoRequest getQueryGrpCallScreenNoRequest() {
        return queryGrpCallScreenNoRequest;
    }


    /**
     * Sets the queryGrpCallScreenNoRequest value for this QueryGrpCallScreenNoRequestMsg.
     * 
     * @param queryGrpCallScreenNoRequest
     */
    public void setQueryGrpCallScreenNoRequest(com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoRequest queryGrpCallScreenNoRequest) {
        this.queryGrpCallScreenNoRequest = queryGrpCallScreenNoRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryGrpCallScreenNoRequestMsg)) return false;
        QueryGrpCallScreenNoRequestMsg other = (QueryGrpCallScreenNoRequestMsg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestHeader==null && other.getRequestHeader()==null) || 
             (this.requestHeader!=null &&
              this.requestHeader.equals(other.getRequestHeader()))) &&
            ((this.queryGrpCallScreenNoRequest==null && other.getQueryGrpCallScreenNoRequest()==null) || 
             (this.queryGrpCallScreenNoRequest!=null &&
              this.queryGrpCallScreenNoRequest.equals(other.getQueryGrpCallScreenNoRequest())));
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
        if (getRequestHeader() != null) {
            _hashCode += getRequestHeader().hashCode();
        }
        if (getQueryGrpCallScreenNoRequest() != null) {
            _hashCode += getQueryGrpCallScreenNoRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryGrpCallScreenNoRequestMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGrpCallScreenNoRequestMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryGrpCallScreenNoRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueryGrpCallScreenNoRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGrpCallScreenNoRequest"));
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
