/**
 * QueryCustomerInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryCustomerInfoRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoRequestQueryObj queryObj;

    public QueryCustomerInfoRequest() {
    }

    public QueryCustomerInfoRequest(
           com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoRequestQueryObj queryObj) {
           this.queryObj = queryObj;
    }


    /**
     * Gets the queryObj value for this QueryCustomerInfoRequest.
     * 
     * @return queryObj
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoRequestQueryObj getQueryObj() {
        return queryObj;
    }


    /**
     * Sets the queryObj value for this QueryCustomerInfoRequest.
     * 
     * @param queryObj
     */
    public void setQueryObj(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoRequestQueryObj queryObj) {
        this.queryObj = queryObj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCustomerInfoRequest)) return false;
        QueryCustomerInfoRequest other = (QueryCustomerInfoRequest) obj;
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
              this.queryObj.equals(other.getQueryObj())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCustomerInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryCustomerInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoRequest>QueryObj"));
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
