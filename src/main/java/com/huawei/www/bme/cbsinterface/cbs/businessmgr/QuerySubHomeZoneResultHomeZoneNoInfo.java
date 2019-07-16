/**
 * QuerySubHomeZoneResultHomeZoneNoInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QuerySubHomeZoneResultHomeZoneNoInfo  implements java.io.Serializable {
    private java.lang.Integer homeZoneNo;

    private java.lang.String effectiveDate;

    private java.lang.String expireDate;

    private java.lang.String zoneName;

    public QuerySubHomeZoneResultHomeZoneNoInfo() {
    }

    public QuerySubHomeZoneResultHomeZoneNoInfo(
           java.lang.Integer homeZoneNo,
           java.lang.String effectiveDate,
           java.lang.String expireDate,
           java.lang.String zoneName) {
           this.homeZoneNo = homeZoneNo;
           this.effectiveDate = effectiveDate;
           this.expireDate = expireDate;
           this.zoneName = zoneName;
    }


    /**
     * Gets the homeZoneNo value for this QuerySubHomeZoneResultHomeZoneNoInfo.
     * 
     * @return homeZoneNo
     */
    public java.lang.Integer getHomeZoneNo() {
        return homeZoneNo;
    }


    /**
     * Sets the homeZoneNo value for this QuerySubHomeZoneResultHomeZoneNoInfo.
     * 
     * @param homeZoneNo
     */
    public void setHomeZoneNo(java.lang.Integer homeZoneNo) {
        this.homeZoneNo = homeZoneNo;
    }


    /**
     * Gets the effectiveDate value for this QuerySubHomeZoneResultHomeZoneNoInfo.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this QuerySubHomeZoneResultHomeZoneNoInfo.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expireDate value for this QuerySubHomeZoneResultHomeZoneNoInfo.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this QuerySubHomeZoneResultHomeZoneNoInfo.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the zoneName value for this QuerySubHomeZoneResultHomeZoneNoInfo.
     * 
     * @return zoneName
     */
    public java.lang.String getZoneName() {
        return zoneName;
    }


    /**
     * Sets the zoneName value for this QuerySubHomeZoneResultHomeZoneNoInfo.
     * 
     * @param zoneName
     */
    public void setZoneName(java.lang.String zoneName) {
        this.zoneName = zoneName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubHomeZoneResultHomeZoneNoInfo)) return false;
        QuerySubHomeZoneResultHomeZoneNoInfo other = (QuerySubHomeZoneResultHomeZoneNoInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.homeZoneNo==null && other.getHomeZoneNo()==null) || 
             (this.homeZoneNo!=null &&
              this.homeZoneNo.equals(other.getHomeZoneNo()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.zoneName==null && other.getZoneName()==null) || 
             (this.zoneName!=null &&
              this.zoneName.equals(other.getZoneName())));
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
        if (getHomeZoneNo() != null) {
            _hashCode += getHomeZoneNo().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getZoneName() != null) {
            _hashCode += getZoneName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySubHomeZoneResultHomeZoneNoInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubHomeZoneResult>HomeZoneNoInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeZoneNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "HomeZoneNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ZoneName"));
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
