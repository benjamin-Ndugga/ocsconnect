/**
 * ActivateOfferingRequestOfferingInst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ActivateOfferingRequestOfferingInst  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    private java.lang.String trialStartTime;

    private java.lang.String trialEndTime;

    private java.lang.String expirationTime;

    public ActivateOfferingRequestOfferingInst() {
    }

    public ActivateOfferingRequestOfferingInst(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           java.lang.String trialStartTime,
           java.lang.String trialEndTime,
           java.lang.String expirationTime) {
           this.offeringKey = offeringKey;
           this.trialStartTime = trialStartTime;
           this.trialEndTime = trialEndTime;
           this.expirationTime = expirationTime;
    }


    /**
     * Gets the offeringKey value for this ActivateOfferingRequestOfferingInst.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this ActivateOfferingRequestOfferingInst.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the trialStartTime value for this ActivateOfferingRequestOfferingInst.
     * 
     * @return trialStartTime
     */
    public java.lang.String getTrialStartTime() {
        return trialStartTime;
    }


    /**
     * Sets the trialStartTime value for this ActivateOfferingRequestOfferingInst.
     * 
     * @param trialStartTime
     */
    public void setTrialStartTime(java.lang.String trialStartTime) {
        this.trialStartTime = trialStartTime;
    }


    /**
     * Gets the trialEndTime value for this ActivateOfferingRequestOfferingInst.
     * 
     * @return trialEndTime
     */
    public java.lang.String getTrialEndTime() {
        return trialEndTime;
    }


    /**
     * Sets the trialEndTime value for this ActivateOfferingRequestOfferingInst.
     * 
     * @param trialEndTime
     */
    public void setTrialEndTime(java.lang.String trialEndTime) {
        this.trialEndTime = trialEndTime;
    }


    /**
     * Gets the expirationTime value for this ActivateOfferingRequestOfferingInst.
     * 
     * @return expirationTime
     */
    public java.lang.String getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this ActivateOfferingRequestOfferingInst.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(java.lang.String expirationTime) {
        this.expirationTime = expirationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivateOfferingRequestOfferingInst)) return false;
        ActivateOfferingRequestOfferingInst other = (ActivateOfferingRequestOfferingInst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offeringKey==null && other.getOfferingKey()==null) || 
             (this.offeringKey!=null &&
              this.offeringKey.equals(other.getOfferingKey()))) &&
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
        if (getOfferingKey() != null) {
            _hashCode += getOfferingKey().hashCode();
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
        new org.apache.axis.description.TypeDesc(ActivateOfferingRequestOfferingInst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ActivateOfferingRequest>OfferingInst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
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
