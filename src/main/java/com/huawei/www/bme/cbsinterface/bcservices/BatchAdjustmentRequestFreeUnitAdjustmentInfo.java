/**
 * BatchAdjustmentRequestFreeUnitAdjustmentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchAdjustmentRequestFreeUnitAdjustmentInfo  implements java.io.Serializable {
    private java.lang.Long freeUnitInstanceID;

    private java.lang.String freeUnitType;

    /* It indicates the adjustment is up or down */
    private java.lang.String adjustmentType;

    private java.lang.Long adjustmentAmt;

    private java.lang.String effectiveTime;

    private java.lang.String expireTime;

    /* add at EMTS */
    private java.lang.Integer extendDays;

    public BatchAdjustmentRequestFreeUnitAdjustmentInfo() {
    }

    public BatchAdjustmentRequestFreeUnitAdjustmentInfo(
           java.lang.Long freeUnitInstanceID,
           java.lang.String freeUnitType,
           java.lang.String adjustmentType,
           java.lang.Long adjustmentAmt,
           java.lang.String effectiveTime,
           java.lang.String expireTime,
           java.lang.Integer extendDays) {
           this.freeUnitInstanceID = freeUnitInstanceID;
           this.freeUnitType = freeUnitType;
           this.adjustmentType = adjustmentType;
           this.adjustmentAmt = adjustmentAmt;
           this.effectiveTime = effectiveTime;
           this.expireTime = expireTime;
           this.extendDays = extendDays;
    }


    /**
     * Gets the freeUnitInstanceID value for this BatchAdjustmentRequestFreeUnitAdjustmentInfo.
     * 
     * @return freeUnitInstanceID
     */
    public java.lang.Long getFreeUnitInstanceID() {
        return freeUnitInstanceID;
    }


    /**
     * Sets the freeUnitInstanceID value for this BatchAdjustmentRequestFreeUnitAdjustmentInfo.
     * 
     * @param freeUnitInstanceID
     */
    public void setFreeUnitInstanceID(java.lang.Long freeUnitInstanceID) {
        this.freeUnitInstanceID = freeUnitInstanceID;
    }


    /**
     * Gets the freeUnitType value for this BatchAdjustmentRequestFreeUnitAdjustmentInfo.
     * 
     * @return freeUnitType
     */
    public java.lang.String getFreeUnitType() {
        return freeUnitType;
    }


    /**
     * Sets the freeUnitType value for this BatchAdjustmentRequestFreeUnitAdjustmentInfo.
     * 
     * @param freeUnitType
     */
    public void setFreeUnitType(java.lang.String freeUnitType) {
        this.freeUnitType = freeUnitType;
    }


    /**
     * Gets the adjustmentType value for this BatchAdjustmentRequestFreeUnitAdjustmentInfo.
     * 
     * @return adjustmentType   * It indicates the adjustment is up or down
     */
    public java.lang.String getAdjustmentType() {
        return adjustmentType;
    }


    /**
     * Sets the adjustmentType value for this BatchAdjustmentRequestFreeUnitAdjustmentInfo.
     * 
     * @param adjustmentType   * It indicates the adjustment is up or down
     */
    public void setAdjustmentType(java.lang.String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }


    /**
     * Gets the adjustmentAmt value for this BatchAdjustmentRequestFreeUnitAdjustmentInfo.
     * 
     * @return adjustmentAmt
     */
    public java.lang.Long getAdjustmentAmt() {
        return adjustmentAmt;
    }


    /**
     * Sets the adjustmentAmt value for this BatchAdjustmentRequestFreeUnitAdjustmentInfo.
     * 
     * @param adjustmentAmt
     */
    public void setAdjustmentAmt(java.lang.Long adjustmentAmt) {
        this.adjustmentAmt = adjustmentAmt;
    }


    /**
     * Gets the effectiveTime value for this BatchAdjustmentRequestFreeUnitAdjustmentInfo.
     * 
     * @return effectiveTime
     */
    public java.lang.String getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this BatchAdjustmentRequestFreeUnitAdjustmentInfo.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(java.lang.String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the expireTime value for this BatchAdjustmentRequestFreeUnitAdjustmentInfo.
     * 
     * @return expireTime
     */
    public java.lang.String getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the expireTime value for this BatchAdjustmentRequestFreeUnitAdjustmentInfo.
     * 
     * @param expireTime
     */
    public void setExpireTime(java.lang.String expireTime) {
        this.expireTime = expireTime;
    }


    /**
     * Gets the extendDays value for this BatchAdjustmentRequestFreeUnitAdjustmentInfo.
     * 
     * @return extendDays   * add at EMTS
     */
    public java.lang.Integer getExtendDays() {
        return extendDays;
    }


    /**
     * Sets the extendDays value for this BatchAdjustmentRequestFreeUnitAdjustmentInfo.
     * 
     * @param extendDays   * add at EMTS
     */
    public void setExtendDays(java.lang.Integer extendDays) {
        this.extendDays = extendDays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchAdjustmentRequestFreeUnitAdjustmentInfo)) return false;
        BatchAdjustmentRequestFreeUnitAdjustmentInfo other = (BatchAdjustmentRequestFreeUnitAdjustmentInfo) obj;
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
            ((this.adjustmentType==null && other.getAdjustmentType()==null) || 
             (this.adjustmentType!=null &&
              this.adjustmentType.equals(other.getAdjustmentType()))) &&
            ((this.adjustmentAmt==null && other.getAdjustmentAmt()==null) || 
             (this.adjustmentAmt!=null &&
              this.adjustmentAmt.equals(other.getAdjustmentAmt()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime()))) &&
            ((this.expireTime==null && other.getExpireTime()==null) || 
             (this.expireTime!=null &&
              this.expireTime.equals(other.getExpireTime()))) &&
            ((this.extendDays==null && other.getExtendDays()==null) || 
             (this.extendDays!=null &&
              this.extendDays.equals(other.getExtendDays())));
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
        if (getAdjustmentType() != null) {
            _hashCode += getAdjustmentType().hashCode();
        }
        if (getAdjustmentAmt() != null) {
            _hashCode += getAdjustmentAmt().hashCode();
        }
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        if (getExpireTime() != null) {
            _hashCode += getExpireTime().hashCode();
        }
        if (getExtendDays() != null) {
            _hashCode += getExtendDays().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchAdjustmentRequestFreeUnitAdjustmentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchAdjustmentRequest>FreeUnitAdjustmentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitInstanceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FreeUnitInstanceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FreeUnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AdjustmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AdjustmentAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpireTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExtendDays"));
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
