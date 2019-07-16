/**
 * QueryConsumptionLimitRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryConsumptionLimitRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitRequestQueryObj queryObj;

    private java.lang.String limitType;

    public QueryConsumptionLimitRequest() {
    }

    public QueryConsumptionLimitRequest(
           com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitRequestQueryObj queryObj,
           java.lang.String limitType) {
           this.queryObj = queryObj;
           this.limitType = limitType;
    }


    /**
     * Gets the queryObj value for this QueryConsumptionLimitRequest.
     * 
     * @return queryObj
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitRequestQueryObj getQueryObj() {
        return queryObj;
    }


    /**
     * Sets the queryObj value for this QueryConsumptionLimitRequest.
     * 
     * @param queryObj
     */
    public void setQueryObj(com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitRequestQueryObj queryObj) {
        this.queryObj = queryObj;
    }


    /**
     * Gets the limitType value for this QueryConsumptionLimitRequest.
     * 
     * @return limitType
     */
    public java.lang.String getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this QueryConsumptionLimitRequest.
     * 
     * @param limitType
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryConsumptionLimitRequest)) return false;
        QueryConsumptionLimitRequest other = (QueryConsumptionLimitRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryObj==null && other.getQueryObj()==null) || 
             (this.queryObj!=null &&
              this.queryObj.equals(other.getQueryObj()))) &&
            ((this.limitType==null && other.getLimitType()==null) || 
             (this.limitType!=null &&
              this.limitType.equals(other.getLimitType())));
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
        if (getQueryObj() != null) {
            _hashCode += getQueryObj().hashCode();
        }
        if (getLimitType() != null) {
            _hashCode += getLimitType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryConsumptionLimitRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryConsumptionLimitRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryConsumptionLimitRequest>QueryObj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
