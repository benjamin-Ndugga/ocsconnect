/**
 * QueryCDRDetailResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryCDRDetailResult  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfo CDRInfo;

    public QueryCDRDetailResult() {
    }

    public QueryCDRDetailResult(
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfo CDRInfo) {
           this.CDRInfo = CDRInfo;
    }


    /**
     * Gets the CDRInfo value for this QueryCDRDetailResult.
     * 
     * @return CDRInfo
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfo getCDRInfo() {
        return CDRInfo;
    }


    /**
     * Sets the CDRInfo value for this QueryCDRDetailResult.
     * 
     * @param CDRInfo
     */
    public void setCDRInfo(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfo CDRInfo) {
        this.CDRInfo = CDRInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCDRDetailResult)) return false;
        QueryCDRDetailResult other = (QueryCDRDetailResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CDRInfo==null && other.getCDRInfo()==null) || 
             (this.CDRInfo!=null &&
              this.CDRInfo.equals(other.getCDRInfo())));
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
        if (getCDRInfo() != null) {
            _hashCode += getCDRInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCDRDetailResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryCDRDetailResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDRInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CDRInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRDetailResult>CDRInfo"));
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
