/**
 * BatchSubActivationRequestOfferingInst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchSubActivationRequestOfferingInst  implements java.io.Serializable {
    /* It is the offering ID which is defined in PC module. */
    private java.math.BigInteger offeringID;

    private java.lang.String ownerType;

    private java.lang.String activeTime;

    /* It means the offering should be activated before this time. */
    private java.lang.String activeTimeLimit;

    private java.lang.String trialStartTime;

    private java.lang.String trialEndTime;

    private java.lang.String expirationTime;

    public BatchSubActivationRequestOfferingInst() {
    }

    public BatchSubActivationRequestOfferingInst(
           java.math.BigInteger offeringID,
           java.lang.String ownerType,
           java.lang.String activeTime,
           java.lang.String activeTimeLimit,
           java.lang.String trialStartTime,
           java.lang.String trialEndTime,
           java.lang.String expirationTime) {
           this.offeringID = offeringID;
           this.ownerType = ownerType;
           this.activeTime = activeTime;
           this.activeTimeLimit = activeTimeLimit;
           this.trialStartTime = trialStartTime;
           this.trialEndTime = trialEndTime;
           this.expirationTime = expirationTime;
    }


    /**
     * Gets the offeringID value for this BatchSubActivationRequestOfferingInst.
     * 
     * @return offeringID   * It is the offering ID which is defined in PC module.
     */
    public java.math.BigInteger getOfferingID() {
        return offeringID;
    }


    /**
     * Sets the offeringID value for this BatchSubActivationRequestOfferingInst.
     * 
     * @param offeringID   * It is the offering ID which is defined in PC module.
     */
    public void setOfferingID(java.math.BigInteger offeringID) {
        this.offeringID = offeringID;
    }


    /**
     * Gets the ownerType value for this BatchSubActivationRequestOfferingInst.
     * 
     * @return ownerType
     */
    public java.lang.String getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this BatchSubActivationRequestOfferingInst.
     * 
     * @param ownerType
     */
    public void setOwnerType(java.lang.String ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the activeTime value for this BatchSubActivationRequestOfferingInst.
     * 
     * @return activeTime
     */
    public java.lang.String getActiveTime() {
        return activeTime;
    }


    /**
     * Sets the activeTime value for this BatchSubActivationRequestOfferingInst.
     * 
     * @param activeTime
     */
    public void setActiveTime(java.lang.String activeTime) {
        this.activeTime = activeTime;
    }


    /**
     * Gets the activeTimeLimit value for this BatchSubActivationRequestOfferingInst.
     * 
     * @return activeTimeLimit   * It means the offering should be activated before this time.
     */
    public java.lang.String getActiveTimeLimit() {
        return activeTimeLimit;
    }


    /**
     * Sets the activeTimeLimit value for this BatchSubActivationRequestOfferingInst.
     * 
     * @param activeTimeLimit   * It means the offering should be activated before this time.
     */
    public void setActiveTimeLimit(java.lang.String activeTimeLimit) {
        this.activeTimeLimit = activeTimeLimit;
    }


    /**
     * Gets the trialStartTime value for this BatchSubActivationRequestOfferingInst.
     * 
     * @return trialStartTime
     */
    public java.lang.String getTrialStartTime() {
        return trialStartTime;
    }


    /**
     * Sets the trialStartTime value for this BatchSubActivationRequestOfferingInst.
     * 
     * @param trialStartTime
     */
    public void setTrialStartTime(java.lang.String trialStartTime) {
        this.trialStartTime = trialStartTime;
    }


    /**
     * Gets the trialEndTime value for this BatchSubActivationRequestOfferingInst.
     * 
     * @return trialEndTime
     */
    public java.lang.String getTrialEndTime() {
        return trialEndTime;
    }


    /**
     * Sets the trialEndTime value for this BatchSubActivationRequestOfferingInst.
     * 
     * @param trialEndTime
     */
    public void setTrialEndTime(java.lang.String trialEndTime) {
        this.trialEndTime = trialEndTime;
    }


    /**
     * Gets the expirationTime value for this BatchSubActivationRequestOfferingInst.
     * 
     * @return expirationTime
     */
    public java.lang.String getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this BatchSubActivationRequestOfferingInst.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(java.lang.String expirationTime) {
        this.expirationTime = expirationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchSubActivationRequestOfferingInst)) return false;
        BatchSubActivationRequestOfferingInst other = (BatchSubActivationRequestOfferingInst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offeringID==null && other.getOfferingID()==null) || 
             (this.offeringID!=null &&
              this.offeringID.equals(other.getOfferingID()))) &&
            ((this.ownerType==null && other.getOwnerType()==null) || 
             (this.ownerType!=null &&
              this.ownerType.equals(other.getOwnerType()))) &&
            ((this.activeTime==null && other.getActiveTime()==null) || 
             (this.activeTime!=null &&
              this.activeTime.equals(other.getActiveTime()))) &&
            ((this.activeTimeLimit==null && other.getActiveTimeLimit()==null) || 
             (this.activeTimeLimit!=null &&
              this.activeTimeLimit.equals(other.getActiveTimeLimit()))) &&
            ((this.trialStartTime==null && other.getTrialStartTime()==null) || 
             (this.trialStartTime!=null &&
              this.trialStartTime.equals(other.getTrialStartTime()))) &&
            ((this.trialEndTime==null && other.getTrialEndTime()==null) || 
             (this.trialEndTime!=null &&
              this.trialEndTime.equals(other.getTrialEndTime()))) &&
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
        if (getOfferingID() != null) {
            _hashCode += getOfferingID().hashCode();
        }
        if (getOwnerType() != null) {
            _hashCode += getOwnerType().hashCode();
        }
        if (getActiveTime() != null) {
            _hashCode += getActiveTime().hashCode();
        }
        if (getActiveTimeLimit() != null) {
            _hashCode += getActiveTimeLimit().hashCode();
        }
        if (getTrialStartTime() != null) {
            _hashCode += getTrialStartTime().hashCode();
        }
        if (getTrialEndTime() != null) {
            _hashCode += getTrialEndTime().hashCode();
        }
        if (getExpirationTime() != null) {
            _hashCode += getExpirationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchSubActivationRequestOfferingInst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSubActivationRequest>OfferingInst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OwnerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ActiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeTimeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ActiveTimeLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trialStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "TrialStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trialEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "TrialEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpirationTime"));
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
