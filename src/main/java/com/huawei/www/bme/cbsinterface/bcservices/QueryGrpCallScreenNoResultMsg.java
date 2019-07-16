/**
 * QueryGrpCallScreenNoResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryGrpCallScreenNoResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoResultCallScreenNoInfo[] queryGrpCallScreenNoResult;

    public QueryGrpCallScreenNoResultMsg() {
    }

    public QueryGrpCallScreenNoResultMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader,
           com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoResultCallScreenNoInfo[] queryGrpCallScreenNoResult) {
           this.resultHeader = resultHeader;
           this.queryGrpCallScreenNoResult = queryGrpCallScreenNoResult;
    }


    /**
     * Gets the resultHeader value for this QueryGrpCallScreenNoResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this QueryGrpCallScreenNoResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the queryGrpCallScreenNoResult value for this QueryGrpCallScreenNoResultMsg.
     * 
     * @return queryGrpCallScreenNoResult
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoResultCallScreenNoInfo[] getQueryGrpCallScreenNoResult() {
        return queryGrpCallScreenNoResult;
    }


    /**
     * Sets the queryGrpCallScreenNoResult value for this QueryGrpCallScreenNoResultMsg.
     * 
     * @param queryGrpCallScreenNoResult
     */
    public void setQueryGrpCallScreenNoResult(com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoResultCallScreenNoInfo[] queryGrpCallScreenNoResult) {
        this.queryGrpCallScreenNoResult = queryGrpCallScreenNoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryGrpCallScreenNoResultMsg)) return false;
        QueryGrpCallScreenNoResultMsg other = (QueryGrpCallScreenNoResultMsg) obj;
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
            ((this.queryGrpCallScreenNoResult==null && other.getQueryGrpCallScreenNoResult()==null) || 
             (this.queryGrpCallScreenNoResult!=null &&
              java.util.Arrays.equals(this.queryGrpCallScreenNoResult, other.getQueryGrpCallScreenNoResult())));
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
        if (getQueryGrpCallScreenNoResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueryGrpCallScreenNoResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueryGrpCallScreenNoResult(), i);
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
        new org.apache.axis.description.TypeDesc(QueryGrpCallScreenNoResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGrpCallScreenNoResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryGrpCallScreenNoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueryGrpCallScreenNoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGrpCallScreenNoResult>CallScreenNoInfo"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CallScreenNoInfo"));
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
