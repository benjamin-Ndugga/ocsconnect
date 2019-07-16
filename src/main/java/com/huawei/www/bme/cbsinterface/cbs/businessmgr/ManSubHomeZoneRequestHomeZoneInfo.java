/**
 * ManSubHomeZoneRequestHomeZoneInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ManSubHomeZoneRequestHomeZoneInfo  implements java.io.Serializable {
    private java.lang.String homeZoneID;

    private java.lang.String effectiveDate;

    private java.lang.String expireDate;

    private java.lang.String newHomeZoneID;

    public ManSubHomeZoneRequestHomeZoneInfo() {
    }

    public ManSubHomeZoneRequestHomeZoneInfo(
           java.lang.String homeZoneID,
           java.lang.String effectiveDate,
           java.lang.String expireDate,
           java.lang.String newHomeZoneID) {
           this.homeZoneID = homeZoneID;
           this.effectiveDate = effectiveDate;
           this.expireDate = expireDate;
           this.newHomeZoneID = newHomeZoneID;
    }


    /**
     * Gets the homeZoneID value for this ManSubHomeZoneRequestHomeZoneInfo.
     * 
     * @return homeZoneID
     */
    public java.lang.String getHomeZoneID() {
        return homeZoneID;
    }


    /**
     * Sets the homeZoneID value for this ManSubHomeZoneRequestHomeZoneInfo.
     * 
     * @param homeZoneID
     */
    public void setHomeZoneID(java.lang.String homeZoneID) {
        this.homeZoneID = homeZoneID;
    }


    /**
     * Gets the effectiveDate value for this ManSubHomeZoneRequestHomeZoneInfo.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ManSubHomeZoneRequestHomeZoneInfo.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expireDate value for this ManSubHomeZoneRequestHomeZoneInfo.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this ManSubHomeZoneRequestHomeZoneInfo.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the newHomeZoneID value for this ManSubHomeZoneRequestHomeZoneInfo.
     * 
     * @return newHomeZoneID
     */
    public java.lang.String getNewHomeZoneID() {
        return newHomeZoneID;
    }


    /**
     * Sets the newHomeZoneID value for this ManSubHomeZoneRequestHomeZoneInfo.
     * 
     * @param newHomeZoneID
     */
    public void setNewHomeZoneID(java.lang.String newHomeZoneID) {
        this.newHomeZoneID = newHomeZoneID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManSubHomeZoneRequestHomeZoneInfo)) return false;
        ManSubHomeZoneRequestHomeZoneInfo other = (ManSubHomeZoneRequestHomeZoneInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.homeZoneID==null && other.getHomeZoneID()==null) || 
             (this.homeZoneID!=null &&
              this.homeZoneID.equals(other.getHomeZoneID()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.newHomeZoneID==null && other.getNewHomeZoneID()==null) || 
             (this.newHomeZoneID!=null &&
              this.newHomeZoneID.equals(other.getNewHomeZoneID())));
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
        if (getHomeZoneID() != null) {
            _hashCode += getHomeZoneID().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getNewHomeZoneID() != null) {
            _hashCode += getNewHomeZoneID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManSubHomeZoneRequestHomeZoneInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ManSubHomeZoneRequest>HomeZoneInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeZoneID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "HomeZoneID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newHomeZoneID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewHomeZoneID"));
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
