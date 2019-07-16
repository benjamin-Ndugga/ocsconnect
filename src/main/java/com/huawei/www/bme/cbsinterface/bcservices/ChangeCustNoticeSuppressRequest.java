/**
 * ChangeCustNoticeSuppressRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeCustNoticeSuppressRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode custAccessCode;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSetting suppressSetting;

    public ChangeCustNoticeSuppressRequest() {
    }

    public ChangeCustNoticeSuppressRequest(
           com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode custAccessCode,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSetting suppressSetting) {
           this.custAccessCode = custAccessCode;
           this.suppressSetting = suppressSetting;
    }


    /**
     * Gets the custAccessCode value for this ChangeCustNoticeSuppressRequest.
     * 
     * @return custAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode getCustAccessCode() {
        return custAccessCode;
    }


    /**
     * Sets the custAccessCode value for this ChangeCustNoticeSuppressRequest.
     * 
     * @param custAccessCode
     */
    public void setCustAccessCode(com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode custAccessCode) {
        this.custAccessCode = custAccessCode;
    }


    /**
     * Gets the suppressSetting value for this ChangeCustNoticeSuppressRequest.
     * 
     * @return suppressSetting
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSetting getSuppressSetting() {
        return suppressSetting;
    }


    /**
     * Sets the suppressSetting value for this ChangeCustNoticeSuppressRequest.
     * 
     * @param suppressSetting
     */
    public void setSuppressSetting(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSetting suppressSetting) {
        this.suppressSetting = suppressSetting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeCustNoticeSuppressRequest)) return false;
        ChangeCustNoticeSuppressRequest other = (ChangeCustNoticeSuppressRequest) obj;
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
            ((this.suppressSetting==null && other.getSuppressSetting()==null) || 
             (this.suppressSetting!=null &&
              this.suppressSetting.equals(other.getSuppressSetting())));
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
        if (getSuppressSetting() != null) {
            _hashCode += getSuppressSetting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeCustNoticeSuppressRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustNoticeSuppressRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CustAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppressSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SuppressSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustNoticeSuppressRequest>SuppressSetting"));
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
