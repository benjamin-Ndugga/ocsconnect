/**
 * QuerySubHomeZoneResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg;

public class QuerySubHomeZoneResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubHomeZoneResultHomeZoneNoInfo[] querySubHomeZoneResult;

    public QuerySubHomeZoneResultMsg() {
    }

    public QuerySubHomeZoneResultMsg(
           com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubHomeZoneResultHomeZoneNoInfo[] querySubHomeZoneResult) {
           this.resultHeader = resultHeader;
           this.querySubHomeZoneResult = querySubHomeZoneResult;
    }


    /**
     * Gets the resultHeader value for this QuerySubHomeZoneResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.common.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this QuerySubHomeZoneResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the querySubHomeZoneResult value for this QuerySubHomeZoneResultMsg.
     * 
     * @return querySubHomeZoneResult
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubHomeZoneResultHomeZoneNoInfo[] getQuerySubHomeZoneResult() {
        return querySubHomeZoneResult;
    }


    /**
     * Sets the querySubHomeZoneResult value for this QuerySubHomeZoneResultMsg.
     * 
     * @param querySubHomeZoneResult
     */
    public void setQuerySubHomeZoneResult(com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubHomeZoneResultHomeZoneNoInfo[] querySubHomeZoneResult) {
        this.querySubHomeZoneResult = querySubHomeZoneResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubHomeZoneResultMsg)) return false;
        QuerySubHomeZoneResultMsg other = (QuerySubHomeZoneResultMsg) obj;
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
            ((this.querySubHomeZoneResult==null && other.getQuerySubHomeZoneResult()==null) || 
             (this.querySubHomeZoneResult!=null &&
              java.util.Arrays.equals(this.querySubHomeZoneResult, other.getQuerySubHomeZoneResult())));
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
        if (getQuerySubHomeZoneResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuerySubHomeZoneResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuerySubHomeZoneResult(), i);
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
        new org.apache.axis.description.TypeDesc(QuerySubHomeZoneResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubHomeZoneResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/common", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySubHomeZoneResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QuerySubHomeZoneResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubHomeZoneResult>HomeZoneNoInfo"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "HomeZoneNoInfo"));
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
