/**
 * QueryGroupMemOffNetNumberResultGroupMemOffNetNumber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryGroupMemOffNetNumberResultGroupMemOffNetNumber  implements java.io.Serializable {
    private java.lang.String offNetNumber;

    private java.lang.String offNetNumberGroupID;

    private java.lang.String effectiveTime;

    private java.lang.String expirationTime;

    public QueryGroupMemOffNetNumberResultGroupMemOffNetNumber() {
    }

    public QueryGroupMemOffNetNumberResultGroupMemOffNetNumber(
           java.lang.String offNetNumber,
           java.lang.String offNetNumberGroupID,
           java.lang.String effectiveTime,
           java.lang.String expirationTime) {
           this.offNetNumber = offNetNumber;
           this.offNetNumberGroupID = offNetNumberGroupID;
           this.effectiveTime = effectiveTime;
           this.expirationTime = expirationTime;
    }


    /**
     * Gets the offNetNumber value for this QueryGroupMemOffNetNumberResultGroupMemOffNetNumber.
     * 
     * @return offNetNumber
     */
    public java.lang.String getOffNetNumber() {
        return offNetNumber;
    }


    /**
     * Sets the offNetNumber value for this QueryGroupMemOffNetNumberResultGroupMemOffNetNumber.
     * 
     * @param offNetNumber
     */
    public void setOffNetNumber(java.lang.String offNetNumber) {
        this.offNetNumber = offNetNumber;
    }


    /**
     * Gets the offNetNumberGroupID value for this QueryGroupMemOffNetNumberResultGroupMemOffNetNumber.
     * 
     * @return offNetNumberGroupID
     */
    public java.lang.String getOffNetNumberGroupID() {
        return offNetNumberGroupID;
    }


    /**
     * Sets the offNetNumberGroupID value for this QueryGroupMemOffNetNumberResultGroupMemOffNetNumber.
     * 
     * @param offNetNumberGroupID
     */
    public void setOffNetNumberGroupID(java.lang.String offNetNumberGroupID) {
        this.offNetNumberGroupID = offNetNumberGroupID;
    }


    /**
     * Gets the effectiveTime value for this QueryGroupMemOffNetNumberResultGroupMemOffNetNumber.
     * 
     * @return effectiveTime
     */
    public java.lang.String getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this QueryGroupMemOffNetNumberResultGroupMemOffNetNumber.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(java.lang.String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the expirationTime value for this QueryGroupMemOffNetNumberResultGroupMemOffNetNumber.
     * 
     * @return expirationTime
     */
    public java.lang.String getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this QueryGroupMemOffNetNumberResultGroupMemOffNetNumber.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(java.lang.String expirationTime) {
        this.expirationTime = expirationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryGroupMemOffNetNumberResultGroupMemOffNetNumber)) return false;
        QueryGroupMemOffNetNumberResultGroupMemOffNetNumber other = (QueryGroupMemOffNetNumberResultGroupMemOffNetNumber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offNetNumber==null && other.getOffNetNumber()==null) || 
             (this.offNetNumber!=null &&
              this.offNetNumber.equals(other.getOffNetNumber()))) &&
            ((this.offNetNumberGroupID==null && other.getOffNetNumberGroupID()==null) || 
             (this.offNetNumberGroupID!=null &&
              this.offNetNumberGroupID.equals(other.getOffNetNumberGroupID()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime()))) &&
            ((this.expirationTime==null && other.getExpirationTime()==null) || 
             (this.expirationTime!=null &&
              this.expirationTime.equals(other.getExpirationTime())));
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
        if (getOffNetNumber() != null) {
            _hashCode += getOffNetNumber().hashCode();
        }
        if (getOffNetNumberGroupID() != null) {
            _hashCode += getOffNetNumberGroupID().hashCode();
        }
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        if (getExpirationTime() != null) {
            _hashCode += getExpirationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryGroupMemOffNetNumberResultGroupMemOffNetNumber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupMemOffNetNumberResult>GroupMemOffNetNumber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offNetNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OffNetNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offNetNumberGroupID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OffNetNumberGroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpirationTime"));
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
