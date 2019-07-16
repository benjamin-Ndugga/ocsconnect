/**
 * QueryAggregationAmountResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryAggregationAmountResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultAggregationAmountList[] queryAggregationAmountResult;

    public QueryAggregationAmountResultMsg() {
    }

    public QueryAggregationAmountResultMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader,
           com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultAggregationAmountList[] queryAggregationAmountResult) {
           this.resultHeader = resultHeader;
           this.queryAggregationAmountResult = queryAggregationAmountResult;
    }


    /**
     * Gets the resultHeader value for this QueryAggregationAmountResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this QueryAggregationAmountResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the queryAggregationAmountResult value for this QueryAggregationAmountResultMsg.
     * 
     * @return queryAggregationAmountResult
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultAggregationAmountList[] getQueryAggregationAmountResult() {
        return queryAggregationAmountResult;
    }


    /**
     * Sets the queryAggregationAmountResult value for this QueryAggregationAmountResultMsg.
     * 
     * @param queryAggregationAmountResult
     */
    public void setQueryAggregationAmountResult(com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultAggregationAmountList[] queryAggregationAmountResult) {
        this.queryAggregationAmountResult = queryAggregationAmountResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryAggregationAmountResultMsg)) return false;
        QueryAggregationAmountResultMsg other = (QueryAggregationAmountResultMsg) obj;
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
            ((this.queryAggregationAmountResult==null && other.getQueryAggregationAmountResult()==null) || 
             (this.queryAggregationAmountResult!=null &&
              java.util.Arrays.equals(this.queryAggregationAmountResult, other.getQueryAggregationAmountResult())));
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
        if (getQueryAggregationAmountResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueryAggregationAmountResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueryAggregationAmountResult(), i);
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
        new org.apache.axis.description.TypeDesc(QueryAggregationAmountResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryAggregationAmountResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryAggregationAmountResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueryAggregationAmountResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryAggregationAmountResult>AggregationAmountList"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AggregationAmountList"));
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
