/**
 * RequestHeaderTimeFormat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbscommon;

public class RequestHeaderTimeFormat  implements java.io.Serializable {
    private java.lang.String timeType;

    private java.lang.String timeZoneID;

    public RequestHeaderTimeFormat() {
    }

    public RequestHeaderTimeFormat(
           java.lang.String timeType,
           java.lang.String timeZoneID) {
           this.timeType = timeType;
           this.timeZoneID = timeZoneID;
    }


    /**
     * Gets the timeType value for this RequestHeaderTimeFormat.
     * 
     * @return timeType
     */
    public java.lang.String getTimeType() {
        return timeType;
    }


    /**
     * Sets the timeType value for this RequestHeaderTimeFormat.
     * 
     * @param timeType
     */
    public void setTimeType(java.lang.String timeType) {
        this.timeType = timeType;
    }


    /**
     * Gets the timeZoneID value for this RequestHeaderTimeFormat.
     * 
     * @return timeZoneID
     */
    public java.lang.String getTimeZoneID() {
        return timeZoneID;
    }


    /**
     * Sets the timeZoneID value for this RequestHeaderTimeFormat.
     * 
     * @param timeZoneID
     */
    public void setTimeZoneID(java.lang.String timeZoneID) {
        this.timeZoneID = timeZoneID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestHeaderTimeFormat)) return false;
        RequestHeaderTimeFormat other = (RequestHeaderTimeFormat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timeType==null && other.getTimeType()==null) || 
             (this.timeType!=null &&
              this.timeType.equals(other.getTimeType()))) &&
            ((this.timeZoneID==null && other.getTimeZoneID()==null) || 
             (this.timeZoneID!=null &&
              this.timeZoneID.equals(other.getTimeZoneID())));
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
        if (getTimeType() != null) {
            _hashCode += getTimeType().hashCode();
        }
        if (getTimeZoneID() != null) {
            _hashCode += getTimeZoneID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestHeaderTimeFormat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", ">RequestHeader>TimeFormat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "TimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "TimeZoneID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
