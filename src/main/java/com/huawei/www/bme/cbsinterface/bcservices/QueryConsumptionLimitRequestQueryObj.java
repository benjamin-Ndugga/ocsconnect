/**
 * QueryConsumptionLimitRequestQueryObj.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryConsumptionLimitRequestQueryObj  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode custAccessCode;

    private com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode;

    public QueryConsumptionLimitRequestQueryObj() {
    }

    public QueryConsumptionLimitRequestQueryObj(
           com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode custAccessCode,
           com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode) {
           this.custAccessCode = custAccessCode;
           this.subAccessCode = subAccessCode;
    }


    /**
     * Gets the custAccessCode value for this QueryConsumptionLimitRequestQueryObj.
     * 
     * @return custAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode getCustAccessCode() {
        return custAccessCode;
    }


    /**
     * Sets the custAccessCode value for this QueryConsumptionLimitRequestQueryObj.
     * 
     * @param custAccessCode
     */
    public void setCustAccessCode(com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode custAccessCode) {
        this.custAccessCode = custAccessCode;
    }


    /**
     * Gets the subAccessCode value for this QueryConsumptionLimitRequestQueryObj.
     * 
     * @return subAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }


    /**
     * Sets the subAccessCode value for this QueryConsumptionLimitRequestQueryObj.
     * 
     * @param subAccessCode
     */
    public void setSubAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryConsumptionLimitRequestQueryObj)) return false;
        QueryConsumptionLimitRequestQueryObj other = (QueryConsumptionLimitRequestQueryObj) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.custAccessCode==null && other.getCustAccessCode()==null) || 
             (this.custAccessCode!=null &&
              this.custAccessCode.equals(other.getCustAccessCode()))) &&
            ((this.subAccessCode==null && other.getSubAccessCode()==null) || 
             (this.subAccessCode!=null &&
              this.subAccessCode.equals(other.getSubAccessCode())));
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
        if (getCustAccessCode() != null) {
            _hashCode += getCustAccessCode().hashCode();
        }
        if (getSubAccessCode() != null) {
            _hashCode += getSubAccessCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryConsumptionLimitRequestQueryObj.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryConsumptionLimitRequest>QueryObj"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CustAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustAccessCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubAccessCode"));
        elemField.setMinOccurs(0);
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
