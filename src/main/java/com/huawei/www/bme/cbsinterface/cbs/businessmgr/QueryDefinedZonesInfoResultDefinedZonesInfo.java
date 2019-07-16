/**
 * QueryDefinedZonesInfoResultDefinedZonesInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryDefinedZonesInfoResultDefinedZonesInfo  implements java.io.Serializable {
    private java.math.BigInteger zoneID;

    private java.lang.String zoneName;

    private java.lang.Integer zoneType;

    public QueryDefinedZonesInfoResultDefinedZonesInfo() {
    }

    public QueryDefinedZonesInfoResultDefinedZonesInfo(
           java.math.BigInteger zoneID,
           java.lang.String zoneName,
           java.lang.Integer zoneType) {
           this.zoneID = zoneID;
           this.zoneName = zoneName;
           this.zoneType = zoneType;
    }


    /**
     * Gets the zoneID value for this QueryDefinedZonesInfoResultDefinedZonesInfo.
     * 
     * @return zoneID
     */
    public java.math.BigInteger getZoneID() {
        return zoneID;
    }


    /**
     * Sets the zoneID value for this QueryDefinedZonesInfoResultDefinedZonesInfo.
     * 
     * @param zoneID
     */
    public void setZoneID(java.math.BigInteger zoneID) {
        this.zoneID = zoneID;
    }


    /**
     * Gets the zoneName value for this QueryDefinedZonesInfoResultDefinedZonesInfo.
     * 
     * @return zoneName
     */
    public java.lang.String getZoneName() {
        return zoneName;
    }


    /**
     * Sets the zoneName value for this QueryDefinedZonesInfoResultDefinedZonesInfo.
     * 
     * @param zoneName
     */
    public void setZoneName(java.lang.String zoneName) {
        this.zoneName = zoneName;
    }


    /**
     * Gets the zoneType value for this QueryDefinedZonesInfoResultDefinedZonesInfo.
     * 
     * @return zoneType
     */
    public java.lang.Integer getZoneType() {
        return zoneType;
    }


    /**
     * Sets the zoneType value for this QueryDefinedZonesInfoResultDefinedZonesInfo.
     * 
     * @param zoneType
     */
    public void setZoneType(java.lang.Integer zoneType) {
        this.zoneType = zoneType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryDefinedZonesInfoResultDefinedZonesInfo)) return false;
        QueryDefinedZonesInfoResultDefinedZonesInfo other = (QueryDefinedZonesInfoResultDefinedZonesInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.zoneID==null && other.getZoneID()==null) || 
             (this.zoneID!=null &&
              this.zoneID.equals(other.getZoneID()))) &&
            ((this.zoneName==null && other.getZoneName()==null) || 
             (this.zoneName!=null &&
              this.zoneName.equals(other.getZoneName()))) &&
            ((this.zoneType==null && other.getZoneType()==null) || 
             (this.zoneType!=null &&
              this.zoneType.equals(other.getZoneType())));
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
        if (getZoneID() != null) {
            _hashCode += getZoneID().hashCode();
        }
        if (getZoneName() != null) {
            _hashCode += getZoneName().hashCode();
        }
        if (getZoneType() != null) {
            _hashCode += getZoneType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryDefinedZonesInfoResultDefinedZonesInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryDefinedZonesInfoResult>DefinedZonesInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ZoneID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ZoneName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ZoneType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
