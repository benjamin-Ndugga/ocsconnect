/**
 * QueryZoneMappingResultZoneDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryZoneMappingResultZoneDetail  implements java.io.Serializable {
    private long zonetID;

    /* Zone type. The options are as follows:
     * S: special zone
     * H: home zone
     * D: data zone */
    private java.lang.String zoneType;

    private java.lang.String zoneName;

    public QueryZoneMappingResultZoneDetail() {
    }

    public QueryZoneMappingResultZoneDetail(
           long zonetID,
           java.lang.String zoneType,
           java.lang.String zoneName) {
           this.zonetID = zonetID;
           this.zoneType = zoneType;
           this.zoneName = zoneName;
    }


    /**
     * Gets the zonetID value for this QueryZoneMappingResultZoneDetail.
     * 
     * @return zonetID
     */
    public long getZonetID() {
        return zonetID;
    }


    /**
     * Sets the zonetID value for this QueryZoneMappingResultZoneDetail.
     * 
     * @param zonetID
     */
    public void setZonetID(long zonetID) {
        this.zonetID = zonetID;
    }


    /**
     * Gets the zoneType value for this QueryZoneMappingResultZoneDetail.
     * 
     * @return zoneType   * Zone type. The options are as follows:
     * S: special zone
     * H: home zone
     * D: data zone
     */
    public java.lang.String getZoneType() {
        return zoneType;
    }


    /**
     * Sets the zoneType value for this QueryZoneMappingResultZoneDetail.
     * 
     * @param zoneType   * Zone type. The options are as follows:
     * S: special zone
     * H: home zone
     * D: data zone
     */
    public void setZoneType(java.lang.String zoneType) {
        this.zoneType = zoneType;
    }


    /**
     * Gets the zoneName value for this QueryZoneMappingResultZoneDetail.
     * 
     * @return zoneName
     */
    public java.lang.String getZoneName() {
        return zoneName;
    }


    /**
     * Sets the zoneName value for this QueryZoneMappingResultZoneDetail.
     * 
     * @param zoneName
     */
    public void setZoneName(java.lang.String zoneName) {
        this.zoneName = zoneName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryZoneMappingResultZoneDetail)) return false;
        QueryZoneMappingResultZoneDetail other = (QueryZoneMappingResultZoneDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.zonetID == other.getZonetID() &&
            ((this.zoneType==null && other.getZoneType()==null) || 
             (this.zoneType!=null &&
              this.zoneType.equals(other.getZoneType()))) &&
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
        _hashCode += new Long(getZonetID()).hashCode();
        if (getZoneType() != null) {
            _hashCode += getZoneType().hashCode();
        }
        if (getZoneName() != null) {
            _hashCode += getZoneName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryZoneMappingResultZoneDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryZoneMappingResult>zoneDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zonetID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "zonetID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "zoneType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "zoneName"));
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
