/**
 * QueryUnbilledAmountResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryUnbilledAmountResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountList[] queryUnbilledAmountResult;

    public QueryUnbilledAmountResultMsg() {
    }

    public QueryUnbilledAmountResultMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader,
           com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountList[] queryUnbilledAmountResult) {
           this.resultHeader = resultHeader;
           this.queryUnbilledAmountResult = queryUnbilledAmountResult;
    }


    /**
     * Gets the resultHeader value for this QueryUnbilledAmountResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this QueryUnbilledAmountResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the queryUnbilledAmountResult value for this QueryUnbilledAmountResultMsg.
     * 
     * @return queryUnbilledAmountResult
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountList[] getQueryUnbilledAmountResult() {
        return queryUnbilledAmountResult;
    }


    /**
     * Sets the queryUnbilledAmountResult value for this QueryUnbilledAmountResultMsg.
     * 
     * @param queryUnbilledAmountResult
     */
    public void setQueryUnbilledAmountResult(com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountList[] queryUnbilledAmountResult) {
        this.queryUnbilledAmountResult = queryUnbilledAmountResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryUnbilledAmountResultMsg)) return false;
        QueryUnbilledAmountResultMsg other = (QueryUnbilledAmountResultMsg) obj;
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
            ((this.queryUnbilledAmountResult==null && other.getQueryUnbilledAmountResult()==null) || 
             (this.queryUnbilledAmountResult!=null &&
              java.util.Arrays.equals(this.queryUnbilledAmountResult, other.getQueryUnbilledAmountResult())));
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
        if (getQueryUnbilledAmountResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueryUnbilledAmountResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueryUnbilledAmountResult(), i);
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
        new org.apache.axis.description.TypeDesc(QueryUnbilledAmountResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryUnbilledAmountResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryUnbilledAmountResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueryUnbilledAmountResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryUnbilledAmountResult>UnbilledAmountList"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "UnbilledAmountList"));
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
