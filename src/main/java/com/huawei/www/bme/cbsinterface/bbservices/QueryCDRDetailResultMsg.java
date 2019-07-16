/**
 * QueryCDRDetailResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryCDRDetailResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResult queryCDRDetailResult;

    public QueryCDRDetailResultMsg() {
    }

    public QueryCDRDetailResultMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResult queryCDRDetailResult) {
           this.resultHeader = resultHeader;
           this.queryCDRDetailResult = queryCDRDetailResult;
    }


    /**
     * Gets the resultHeader value for this QueryCDRDetailResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this QueryCDRDetailResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the queryCDRDetailResult value for this QueryCDRDetailResultMsg.
     * 
     * @return queryCDRDetailResult
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResult getQueryCDRDetailResult() {
        return queryCDRDetailResult;
    }


    /**
     * Sets the queryCDRDetailResult value for this QueryCDRDetailResultMsg.
     * 
     * @param queryCDRDetailResult
     */
    public void setQueryCDRDetailResult(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResult queryCDRDetailResult) {
        this.queryCDRDetailResult = queryCDRDetailResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCDRDetailResultMsg)) return false;
        QueryCDRDetailResultMsg other = (QueryCDRDetailResultMsg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultHeader==null && other.getResultHeader()==null) || 
             (this.resultHeader!=null &&
              this.resultHeader.equals(other.getResultHeader()))) &&
            ((this.queryCDRDetailResult==null && other.getQueryCDRDetailResult()==null) || 
             (this.queryCDRDetailResult!=null &&
              this.queryCDRDetailResult.equals(other.getQueryCDRDetailResult())));
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
        if (getResultHeader() != null) {
            _hashCode += getResultHeader().hashCode();
        }
        if (getQueryCDRDetailResult() != null) {
            _hashCode += getQueryCDRDetailResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCDRDetailResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRDetailResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryCDRDetailResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueryCDRDetailResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryCDRDetailResult"));
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
