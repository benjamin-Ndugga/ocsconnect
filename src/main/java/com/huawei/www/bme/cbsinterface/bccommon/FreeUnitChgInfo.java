/**
 * FreeUnitChgInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class FreeUnitChgInfo  implements java.io.Serializable {
    private java.lang.Long freeUnitInstanceID;

    private java.lang.String freeUnitType;

    private java.lang.String freeUnitTypeName;

    private java.math.BigInteger measureUnit;

    private java.lang.String measureUnitName;

    private long oldAmt;

    private long newAmt;

    public FreeUnitChgInfo() {
    }

    public FreeUnitChgInfo(
           java.lang.Long freeUnitInstanceID,
           java.lang.String freeUnitType,
           java.lang.String freeUnitTypeName,
           java.math.BigInteger measureUnit,
           java.lang.String measureUnitName,
           long oldAmt,
           long newAmt) {
           this.freeUnitInstanceID = freeUnitInstanceID;
           this.freeUnitType = freeUnitType;
           this.freeUnitTypeName = freeUnitTypeName;
           this.measureUnit = measureUnit;
           this.measureUnitName = measureUnitName;
           this.oldAmt = oldAmt;
           this.newAmt = newAmt;
    }


    /**
     * Gets the freeUnitInstanceID value for this FreeUnitChgInfo.
     * 
     * @return freeUnitInstanceID
     */
    public java.lang.Long getFreeUnitInstanceID() {
        return freeUnitInstanceID;
    }


    /**
     * Sets the freeUnitInstanceID value for this FreeUnitChgInfo.
     * 
     * @param freeUnitInstanceID
     */
    public void setFreeUnitInstanceID(java.lang.Long freeUnitInstanceID) {
        this.freeUnitInstanceID = freeUnitInstanceID;
    }


    /**
     * Gets the freeUnitType value for this FreeUnitChgInfo.
     * 
     * @return freeUnitType
     */
    public java.lang.String getFreeUnitType() {
        return freeUnitType;
    }


    /**
     * Sets the freeUnitType value for this FreeUnitChgInfo.
     * 
     * @param freeUnitType
     */
    public void setFreeUnitType(java.lang.String freeUnitType) {
        this.freeUnitType = freeUnitType;
    }


    /**
     * Gets the freeUnitTypeName value for this FreeUnitChgInfo.
     * 
     * @return freeUnitTypeName
     */
    public java.lang.String getFreeUnitTypeName() {
        return freeUnitTypeName;
    }


    /**
     * Sets the freeUnitTypeName value for this FreeUnitChgInfo.
     * 
     * @param freeUnitTypeName
     */
    public void setFreeUnitTypeName(java.lang.String freeUnitTypeName) {
        this.freeUnitTypeName = freeUnitTypeName;
    }


    /**
     * Gets the measureUnit value for this FreeUnitChgInfo.
     * 
     * @return measureUnit
     */
    public java.math.BigInteger getMeasureUnit() {
        return measureUnit;
    }


    /**
     * Sets the measureUnit value for this FreeUnitChgInfo.
     * 
     * @param measureUnit
     */
    public void setMeasureUnit(java.math.BigInteger measureUnit) {
        this.measureUnit = measureUnit;
    }


    /**
     * Gets the measureUnitName value for this FreeUnitChgInfo.
     * 
     * @return measureUnitName
     */
    public java.lang.String getMeasureUnitName() {
        return measureUnitName;
    }


    /**
     * Sets the measureUnitName value for this FreeUnitChgInfo.
     * 
     * @param measureUnitName
     */
    public void setMeasureUnitName(java.lang.String measureUnitName) {
        this.measureUnitName = measureUnitName;
    }


    /**
     * Gets the oldAmt value for this FreeUnitChgInfo.
     * 
     * @return oldAmt
     */
    public long getOldAmt() {
        return oldAmt;
    }


    /**
     * Sets the oldAmt value for this FreeUnitChgInfo.
     * 
     * @param oldAmt
     */
    public void setOldAmt(long oldAmt) {
        this.oldAmt = oldAmt;
    }


    /**
     * Gets the newAmt value for this FreeUnitChgInfo.
     * 
     * @return newAmt
     */
    public long getNewAmt() {
        return newAmt;
    }


    /**
     * Sets the newAmt value for this FreeUnitChgInfo.
     * 
     * @param newAmt
     */
    public void setNewAmt(long newAmt) {
        this.newAmt = newAmt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FreeUnitChgInfo)) return false;
        FreeUnitChgInfo other = (FreeUnitChgInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.freeUnitInstanceID==null && other.getFreeUnitInstanceID()==null) || 
             (this.freeUnitInstanceID!=null &&
              this.freeUnitInstanceID.equals(other.getFreeUnitInstanceID()))) &&
            ((this.freeUnitType==null && other.getFreeUnitType()==null) || 
             (this.freeUnitType!=null &&
              this.freeUnitType.equals(other.getFreeUnitType()))) &&
            ((this.freeUnitTypeName==null && other.getFreeUnitTypeName()==null) || 
             (this.freeUnitTypeName!=null &&
              this.freeUnitTypeName.equals(other.getFreeUnitTypeName()))) &&
            ((this.measureUnit==null && other.getMeasureUnit()==null) || 
             (this.measureUnit!=null &&
              this.measureUnit.equals(other.getMeasureUnit()))) &&
            ((this.measureUnitName==null && other.getMeasureUnitName()==null) || 
             (this.measureUnitName!=null &&
              this.measureUnitName.equals(other.getMeasureUnitName()))) &&
            this.oldAmt == other.getOldAmt() &&
            this.newAmt == other.getNewAmt();
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
        if (getFreeUnitInstanceID() != null) {
            _hashCode += getFreeUnitInstanceID().hashCode();
        }
        if (getFreeUnitType() != null) {
            _hashCode += getFreeUnitType().hashCode();
        }
        if (getFreeUnitTypeName() != null) {
            _hashCode += getFreeUnitTypeName().hashCode();
        }
        if (getMeasureUnit() != null) {
            _hashCode += getMeasureUnit().hashCode();
        }
        if (getMeasureUnitName() != null) {
            _hashCode += getMeasureUnitName().hashCode();
        }
        _hashCode += new Long(getOldAmt()).hashCode();
        _hashCode += new Long(getNewAmt()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FreeUnitChgInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "FreeUnitChgInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitInstanceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "FreeUnitInstanceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "FreeUnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "FreeUnitTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "MeasureUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "MeasureUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OldAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "NewAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
