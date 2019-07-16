/**
 * QueryTransferLogRequestMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg;

public class QueryTransferLogRequestMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.common.RequestHeader requestHeader;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryTransferLogRequest queryTransferLogRequest;

    public QueryTransferLogRequestMsg() {
    }

    public QueryTransferLogRequestMsg(
           com.huawei.www.bme.cbsinterface.common.RequestHeader requestHeader,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryTransferLogRequest queryTransferLogRequest) {
           this.requestHeader = requestHeader;
           this.queryTransferLogRequest = queryTransferLogRequest;
    }


    /**
     * Gets the requestHeader value for this QueryTransferLogRequestMsg.
     * 
     * @return requestHeader
     */
    public com.huawei.www.bme.cbsinterface.common.RequestHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this QueryTransferLogRequestMsg.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(com.huawei.www.bme.cbsinterface.common.RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the queryTransferLogRequest value for this QueryTransferLogRequestMsg.
     * 
     * @return queryTransferLogRequest
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryTransferLogRequest getQueryTransferLogRequest() {
        return queryTransferLogRequest;
    }


    /**
     * Sets the queryTransferLogRequest value for this QueryTransferLogRequestMsg.
     * 
     * @param queryTransferLogRequest
     */
    public void setQueryTransferLogRequest(com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryTransferLogRequest queryTransferLogRequest) {
        this.queryTransferLogRequest = queryTransferLogRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryTransferLogRequestMsg)) return false;
        QueryTransferLogRequestMsg other = (QueryTransferLogRequestMsg) obj;
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
            ((this.queryTransferLogRequest==null && other.getQueryTransferLogRequest()==null) || 
             (this.queryTransferLogRequest!=null &&
              this.queryTransferLogRequest.equals(other.getQueryTransferLogRequest())));
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
        if (getQueryTransferLogRequest() != null) {
            _hashCode += getQueryTransferLogRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryTransferLogRequestMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">QueryTransferLogRequestMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/common", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryTransferLogRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueryTransferLogRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "QueryTransferLogRequest"));
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
