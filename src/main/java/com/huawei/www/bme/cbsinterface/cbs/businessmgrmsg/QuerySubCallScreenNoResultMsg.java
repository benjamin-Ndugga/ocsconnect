/**
 * QuerySubCallScreenNoResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg;

public class QuerySubCallScreenNoResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResult querySubCallScreenNoResult;

    public QuerySubCallScreenNoResultMsg() {
    }

    public QuerySubCallScreenNoResultMsg(
           com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResult querySubCallScreenNoResult) {
           this.resultHeader = resultHeader;
           this.querySubCallScreenNoResult = querySubCallScreenNoResult;
    }


    /**
     * Gets the resultHeader value for this QuerySubCallScreenNoResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.common.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this QuerySubCallScreenNoResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the querySubCallScreenNoResult value for this QuerySubCallScreenNoResultMsg.
     * 
     * @return querySubCallScreenNoResult
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResult getQuerySubCallScreenNoResult() {
        return querySubCallScreenNoResult;
    }


    /**
     * Sets the querySubCallScreenNoResult value for this QuerySubCallScreenNoResultMsg.
     * 
     * @param querySubCallScreenNoResult
     */
    public void setQuerySubCallScreenNoResult(com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResult querySubCallScreenNoResult) {
        this.querySubCallScreenNoResult = querySubCallScreenNoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubCallScreenNoResultMsg)) return false;
        QuerySubCallScreenNoResultMsg other = (QuerySubCallScreenNoResultMsg) obj;
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
            ((this.querySubCallScreenNoResult==null && other.getQuerySubCallScreenNoResult()==null) || 
             (this.querySubCallScreenNoResult!=null &&
              this.querySubCallScreenNoResult.equals(other.getQuerySubCallScreenNoResult())));
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
        if (getQuerySubCallScreenNoResult() != null) {
            _hashCode += getQuerySubCallScreenNoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySubCallScreenNoResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubCallScreenNoResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/common", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySubCallScreenNoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QuerySubCallScreenNoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubCallScreenNoResult"));
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
