/**
 * QueryGroupListBySubscriberResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryGroupListBySubscriberResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberResultGroupList[] queryGroupListBySubscriberResult;

    public QueryGroupListBySubscriberResultMsg() {
    }

    public QueryGroupListBySubscriberResultMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader,
           com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberResultGroupList[] queryGroupListBySubscriberResult) {
           this.resultHeader = resultHeader;
           this.queryGroupListBySubscriberResult = queryGroupListBySubscriberResult;
    }


    /**
     * Gets the resultHeader value for this QueryGroupListBySubscriberResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this QueryGroupListBySubscriberResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the queryGroupListBySubscriberResult value for this QueryGroupListBySubscriberResultMsg.
     * 
     * @return queryGroupListBySubscriberResult
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberResultGroupList[] getQueryGroupListBySubscriberResult() {
        return queryGroupListBySubscriberResult;
    }


    /**
     * Sets the queryGroupListBySubscriberResult value for this QueryGroupListBySubscriberResultMsg.
     * 
     * @param queryGroupListBySubscriberResult
     */
    public void setQueryGroupListBySubscriberResult(com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberResultGroupList[] queryGroupListBySubscriberResult) {
        this.queryGroupListBySubscriberResult = queryGroupListBySubscriberResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryGroupListBySubscriberResultMsg)) return false;
        QueryGroupListBySubscriberResultMsg other = (QueryGroupListBySubscriberResultMsg) obj;
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
            ((this.queryGroupListBySubscriberResult==null && other.getQueryGroupListBySubscriberResult()==null) || 
             (this.queryGroupListBySubscriberResult!=null &&
              java.util.Arrays.equals(this.queryGroupListBySubscriberResult, other.getQueryGroupListBySubscriberResult())));
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
        if (getQueryGroupListBySubscriberResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueryGroupListBySubscriberResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueryGroupListBySubscriberResult(), i);
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
        new org.apache.axis.description.TypeDesc(QueryGroupListBySubscriberResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupListBySubscriberResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryGroupListBySubscriberResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueryGroupListBySubscriberResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupListBySubscriberResult>GroupList"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupList"));
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
