/**
 * QueryExpireSubToMicroResultExpireSubscriber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryExpireSubToMicroResultExpireSubscriber  implements java.io.Serializable {
    /* The subscriber’s MSISDN */
    private java.lang.String serviceNum;

    /* Format is YYYYMMDD24hhmmss */
    private java.lang.String expireTime;

    public QueryExpireSubToMicroResultExpireSubscriber() {
    }

    public QueryExpireSubToMicroResultExpireSubscriber(
           java.lang.String serviceNum,
           java.lang.String expireTime) {
           this.serviceNum = serviceNum;
           this.expireTime = expireTime;
    }


    /**
     * Gets the serviceNum value for this QueryExpireSubToMicroResultExpireSubscriber.
     * 
     * @return serviceNum   * The subscriber’s MSISDN
     */
    public java.lang.String getServiceNum() {
        return serviceNum;
    }


    /**
     * Sets the serviceNum value for this QueryExpireSubToMicroResultExpireSubscriber.
     * 
     * @param serviceNum   * The subscriber’s MSISDN
     */
    public void setServiceNum(java.lang.String serviceNum) {
        this.serviceNum = serviceNum;
    }


    /**
     * Gets the expireTime value for this QueryExpireSubToMicroResultExpireSubscriber.
     * 
     * @return expireTime   * Format is YYYYMMDD24hhmmss
     */
    public java.lang.String getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the expireTime value for this QueryExpireSubToMicroResultExpireSubscriber.
     * 
     * @param expireTime   * Format is YYYYMMDD24hhmmss
     */
    public void setExpireTime(java.lang.String expireTime) {
        this.expireTime = expireTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryExpireSubToMicroResultExpireSubscriber)) return false;
        QueryExpireSubToMicroResultExpireSubscriber other = (QueryExpireSubToMicroResultExpireSubscriber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceNum==null && other.getServiceNum()==null) || 
             (this.serviceNum!=null &&
              this.serviceNum.equals(other.getServiceNum()))) &&
            ((this.expireTime==null && other.getExpireTime()==null) || 
             (this.expireTime!=null &&
              this.expireTime.equals(other.getExpireTime())));
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
        if (getServiceNum() != null) {
            _hashCode += getServiceNum().hashCode();
        }
        if (getExpireTime() != null) {
            _hashCode += getExpireTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryExpireSubToMicroResultExpireSubscriber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryExpireSubToMicroResult>ExpireSubscriber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ServiceNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpireTime"));
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
