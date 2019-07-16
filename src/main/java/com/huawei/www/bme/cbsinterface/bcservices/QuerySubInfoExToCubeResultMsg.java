/**
 * QuerySubInfoExToCubeResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QuerySubInfoExToCubeResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader;

    private com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResult querySubInfoExToCubeResult;

    public QuerySubInfoExToCubeResultMsg() {
    }

    public QuerySubInfoExToCubeResultMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader,
           com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResult querySubInfoExToCubeResult) {
           this.resultHeader = resultHeader;
           this.querySubInfoExToCubeResult = querySubInfoExToCubeResult;
    }


    /**
     * Gets the resultHeader value for this QuerySubInfoExToCubeResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this QuerySubInfoExToCubeResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the querySubInfoExToCubeResult value for this QuerySubInfoExToCubeResultMsg.
     * 
     * @return querySubInfoExToCubeResult
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResult getQuerySubInfoExToCubeResult() {
        return querySubInfoExToCubeResult;
    }


    /**
     * Sets the querySubInfoExToCubeResult value for this QuerySubInfoExToCubeResultMsg.
     * 
     * @param querySubInfoExToCubeResult
     */
    public void setQuerySubInfoExToCubeResult(com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResult querySubInfoExToCubeResult) {
        this.querySubInfoExToCubeResult = querySubInfoExToCubeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubInfoExToCubeResultMsg)) return false;
        QuerySubInfoExToCubeResultMsg other = (QuerySubInfoExToCubeResultMsg) obj;
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
            ((this.querySubInfoExToCubeResult==null && other.getQuerySubInfoExToCubeResult()==null) || 
             (this.querySubInfoExToCubeResult!=null &&
              this.querySubInfoExToCubeResult.equals(other.getQuerySubInfoExToCubeResult())));
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
        if (getQuerySubInfoExToCubeResult() != null) {
            _hashCode += getQuerySubInfoExToCubeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySubInfoExToCubeResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInfoExToCubeResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySubInfoExToCubeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QuerySubInfoExToCubeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QuerySubInfoExToCubeResult"));
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
