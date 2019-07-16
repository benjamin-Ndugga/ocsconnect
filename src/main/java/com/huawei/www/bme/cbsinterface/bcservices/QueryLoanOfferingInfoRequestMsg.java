/**
 * QueryLoanOfferingInfoRequestMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryLoanOfferingInfoRequestMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoRequest queryLoanOfferingInfoRequest;

    public QueryLoanOfferingInfoRequestMsg() {
    }

    public QueryLoanOfferingInfoRequestMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader,
           com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoRequest queryLoanOfferingInfoRequest) {
           this.requestHeader = requestHeader;
           this.queryLoanOfferingInfoRequest = queryLoanOfferingInfoRequest;
    }


    /**
     * Gets the requestHeader value for this QueryLoanOfferingInfoRequestMsg.
     * 
     * @return requestHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this QueryLoanOfferingInfoRequestMsg.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the queryLoanOfferingInfoRequest value for this QueryLoanOfferingInfoRequestMsg.
     * 
     * @return queryLoanOfferingInfoRequest
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoRequest getQueryLoanOfferingInfoRequest() {
        return queryLoanOfferingInfoRequest;
    }


    /**
     * Sets the queryLoanOfferingInfoRequest value for this QueryLoanOfferingInfoRequestMsg.
     * 
     * @param queryLoanOfferingInfoRequest
     */
    public void setQueryLoanOfferingInfoRequest(com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoRequest queryLoanOfferingInfoRequest) {
        this.queryLoanOfferingInfoRequest = queryLoanOfferingInfoRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryLoanOfferingInfoRequestMsg)) return false;
        QueryLoanOfferingInfoRequestMsg other = (QueryLoanOfferingInfoRequestMsg) obj;
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
            ((this.queryLoanOfferingInfoRequest==null && other.getQueryLoanOfferingInfoRequest()==null) || 
             (this.queryLoanOfferingInfoRequest!=null &&
              this.queryLoanOfferingInfoRequest.equals(other.getQueryLoanOfferingInfoRequest())));
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
        if (getQueryLoanOfferingInfoRequest() != null) {
            _hashCode += getQueryLoanOfferingInfoRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryLoanOfferingInfoRequestMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryLoanOfferingInfoRequestMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryLoanOfferingInfoRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueryLoanOfferingInfoRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryLoanOfferingInfoRequest"));
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
