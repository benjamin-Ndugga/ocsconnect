/**
 * SalesInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class SalesInfo  implements java.io.Serializable {
    private java.lang.String salesChannelID;

    private java.lang.String salesID;

    public SalesInfo() {
    }

    public SalesInfo(
           java.lang.String salesChannelID,
           java.lang.String salesID) {
           this.salesChannelID = salesChannelID;
           this.salesID = salesID;
    }


    /**
     * Gets the salesChannelID value for this SalesInfo.
     * 
     * @return salesChannelID
     */
    public java.lang.String getSalesChannelID() {
        return salesChannelID;
    }


    /**
     * Sets the salesChannelID value for this SalesInfo.
     * 
     * @param salesChannelID
     */
    public void setSalesChannelID(java.lang.String salesChannelID) {
        this.salesChannelID = salesChannelID;
    }


    /**
     * Gets the salesID value for this SalesInfo.
     * 
     * @return salesID
     */
    public java.lang.String getSalesID() {
        return salesID;
    }


    /**
     * Sets the salesID value for this SalesInfo.
     * 
     * @param salesID
     */
    public void setSalesID(java.lang.String salesID) {
        this.salesID = salesID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesInfo)) return false;
        SalesInfo other = (SalesInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.salesChannelID==null && other.getSalesChannelID()==null) || 
             (this.salesChannelID!=null &&
              this.salesChannelID.equals(other.getSalesChannelID()))) &&
            ((this.salesID==null && other.getSalesID()==null) || 
             (this.salesID!=null &&
              this.salesID.equals(other.getSalesID())));
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
        if (getSalesChannelID() != null) {
            _hashCode += getSalesChannelID().hashCode();
        }
        if (getSalesID() != null) {
            _hashCode += getSalesID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SalesInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesChannelID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SalesChannelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SalesID"));
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
