/**
 * QuerySubLowBalPrtResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg;

public class QuerySubLowBalPrtResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubLowBalPrtResultSubLowBalPrt[] querySubLowBalPrtResult;

    public QuerySubLowBalPrtResultMsg() {
    }

    public QuerySubLowBalPrtResultMsg(
           com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubLowBalPrtResultSubLowBalPrt[] querySubLowBalPrtResult) {
           this.resultHeader = resultHeader;
           this.querySubLowBalPrtResult = querySubLowBalPrtResult;
    }


    /**
     * Gets the resultHeader value for this QuerySubLowBalPrtResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.common.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this QuerySubLowBalPrtResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the querySubLowBalPrtResult value for this QuerySubLowBalPrtResultMsg.
     * 
     * @return querySubLowBalPrtResult
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubLowBalPrtResultSubLowBalPrt[] getQuerySubLowBalPrtResult() {
        return querySubLowBalPrtResult;
    }


    /**
     * Sets the querySubLowBalPrtResult value for this QuerySubLowBalPrtResultMsg.
     * 
     * @param querySubLowBalPrtResult
     */
    public void setQuerySubLowBalPrtResult(com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubLowBalPrtResultSubLowBalPrt[] querySubLowBalPrtResult) {
        this.querySubLowBalPrtResult = querySubLowBalPrtResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubLowBalPrtResultMsg)) return false;
        QuerySubLowBalPrtResultMsg other = (QuerySubLowBalPrtResultMsg) obj;
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
            ((this.querySubLowBalPrtResult==null && other.getQuerySubLowBalPrtResult()==null) || 
             (this.querySubLowBalPrtResult!=null &&
              java.util.Arrays.equals(this.querySubLowBalPrtResult, other.getQuerySubLowBalPrtResult())));
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
        if (getQuerySubLowBalPrtResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuerySubLowBalPrtResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuerySubLowBalPrtResult(), i);
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
        new org.apache.axis.description.TypeDesc(QuerySubLowBalPrtResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubLowBalPrtResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/common", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySubLowBalPrtResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QuerySubLowBalPrtResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubLowBalPrtResult>SubLowBalPrt"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubLowBalPrt"));
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
