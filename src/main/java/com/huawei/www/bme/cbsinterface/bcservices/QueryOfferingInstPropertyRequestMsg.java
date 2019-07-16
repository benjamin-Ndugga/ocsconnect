/**
 * QueryOfferingInstPropertyRequestMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryOfferingInstPropertyRequestMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequest queryOfferingInstPropertyRequest;

    public QueryOfferingInstPropertyRequestMsg() {
    }

    public QueryOfferingInstPropertyRequestMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader,
           com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequest queryOfferingInstPropertyRequest) {
           this.requestHeader = requestHeader;
           this.queryOfferingInstPropertyRequest = queryOfferingInstPropertyRequest;
    }


    /**
     * Gets the requestHeader value for this QueryOfferingInstPropertyRequestMsg.
     * 
     * @return requestHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this QueryOfferingInstPropertyRequestMsg.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the queryOfferingInstPropertyRequest value for this QueryOfferingInstPropertyRequestMsg.
     * 
     * @return queryOfferingInstPropertyRequest
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequest getQueryOfferingInstPropertyRequest() {
        return queryOfferingInstPropertyRequest;
    }


    /**
     * Sets the queryOfferingInstPropertyRequest value for this QueryOfferingInstPropertyRequestMsg.
     * 
     * @param queryOfferingInstPropertyRequest
     */
    public void setQueryOfferingInstPropertyRequest(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequest queryOfferingInstPropertyRequest) {
        this.queryOfferingInstPropertyRequest = queryOfferingInstPropertyRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryOfferingInstPropertyRequestMsg)) return false;
        QueryOfferingInstPropertyRequestMsg other = (QueryOfferingInstPropertyRequestMsg) obj;
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
            ((this.queryOfferingInstPropertyRequest==null && other.getQueryOfferingInstPropertyRequest()==null) || 
             (this.queryOfferingInstPropertyRequest!=null &&
              this.queryOfferingInstPropertyRequest.equals(other.getQueryOfferingInstPropertyRequest())));
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
        if (getQueryOfferingInstPropertyRequest() != null) {
            _hashCode += getQueryOfferingInstPropertyRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryOfferingInstPropertyRequestMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingInstPropertyRequestMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryOfferingInstPropertyRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueryOfferingInstPropertyRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryOfferingInstPropertyRequest"));
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
