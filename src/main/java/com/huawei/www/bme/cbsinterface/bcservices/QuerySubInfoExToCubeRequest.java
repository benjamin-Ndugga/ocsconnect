/**
 * QuerySubInfoExToCubeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QuerySubInfoExToCubeRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeRequestAccessInfo accessInfo;

    public QuerySubInfoExToCubeRequest() {
    }

    public QuerySubInfoExToCubeRequest(
           com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeRequestAccessInfo accessInfo) {
           this.accessInfo = accessInfo;
    }


    /**
     * Gets the accessInfo value for this QuerySubInfoExToCubeRequest.
     * 
     * @return accessInfo
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeRequestAccessInfo getAccessInfo() {
        return accessInfo;
    }


    /**
     * Sets the accessInfo value for this QuerySubInfoExToCubeRequest.
     * 
     * @param accessInfo
     */
    public void setAccessInfo(com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeRequestAccessInfo accessInfo) {
        this.accessInfo = accessInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubInfoExToCubeRequest)) return false;
        QuerySubInfoExToCubeRequest other = (QuerySubInfoExToCubeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessInfo==null && other.getAccessInfo()==null) || 
             (this.accessInfo!=null &&
              this.accessInfo.equals(other.getAccessInfo())));
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
        if (getAccessInfo() != null) {
            _hashCode += getAccessInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySubInfoExToCubeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QuerySubInfoExToCubeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AccessInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInfoExToCubeRequest>AccessInfo"));
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
