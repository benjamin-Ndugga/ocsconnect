/**
 * QuerySubscriberProductInfoResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg;

public class QuerySubscriberProductInfoResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubscriberProductInfoResult querySubscriberProductInfoResult;

    public QuerySubscriberProductInfoResultMsg() {
    }

    public QuerySubscriberProductInfoResultMsg(
           com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubscriberProductInfoResult querySubscriberProductInfoResult) {
           this.resultHeader = resultHeader;
           this.querySubscriberProductInfoResult = querySubscriberProductInfoResult;
    }


    /**
     * Gets the resultHeader value for this QuerySubscriberProductInfoResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.common.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this QuerySubscriberProductInfoResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the querySubscriberProductInfoResult value for this QuerySubscriberProductInfoResultMsg.
     * 
     * @return querySubscriberProductInfoResult
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubscriberProductInfoResult getQuerySubscriberProductInfoResult() {
        return querySubscriberProductInfoResult;
    }


    /**
     * Sets the querySubscriberProductInfoResult value for this QuerySubscriberProductInfoResultMsg.
     * 
     * @param querySubscriberProductInfoResult
     */
    public void setQuerySubscriberProductInfoResult(com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubscriberProductInfoResult querySubscriberProductInfoResult) {
        this.querySubscriberProductInfoResult = querySubscriberProductInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubscriberProductInfoResultMsg)) return false;
        QuerySubscriberProductInfoResultMsg other = (QuerySubscriberProductInfoResultMsg) obj;
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
            ((this.querySubscriberProductInfoResult==null && other.getQuerySubscriberProductInfoResult()==null) || 
             (this.querySubscriberProductInfoResult!=null &&
              this.querySubscriberProductInfoResult.equals(other.getQuerySubscriberProductInfoResult())));
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
        if (getQuerySubscriberProductInfoResult() != null) {
            _hashCode += getQuerySubscriberProductInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySubscriberProductInfoResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">QuerySubscriberProductInfoResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/common", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySubscriberProductInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QuerySubscriberProductInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubscriberProductInfoResult"));
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
