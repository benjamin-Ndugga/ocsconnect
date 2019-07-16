/**
 * ChangeSubPaymentModeResultModifyOffering.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubPaymentModeResultModifyOffering  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    private com.huawei.www.bme.cbsinterface.bccommon.OfferingOwner offeringOwner;

    private java.lang.String newEffectiveTime;

    private java.lang.String newExpirationTime;

    public ChangeSubPaymentModeResultModifyOffering() {
    }

    public ChangeSubPaymentModeResultModifyOffering(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingOwner offeringOwner,
           java.lang.String newEffectiveTime,
           java.lang.String newExpirationTime) {
           this.offeringKey = offeringKey;
           this.offeringOwner = offeringOwner;
           this.newEffectiveTime = newEffectiveTime;
           this.newExpirationTime = newExpirationTime;
    }


    /**
     * Gets the offeringKey value for this ChangeSubPaymentModeResultModifyOffering.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this ChangeSubPaymentModeResultModifyOffering.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the offeringOwner value for this ChangeSubPaymentModeResultModifyOffering.
     * 
     * @return offeringOwner
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingOwner getOfferingOwner() {
        return offeringOwner;
    }


    /**
     * Sets the offeringOwner value for this ChangeSubPaymentModeResultModifyOffering.
     * 
     * @param offeringOwner
     */
    public void setOfferingOwner(com.huawei.www.bme.cbsinterface.bccommon.OfferingOwner offeringOwner) {
        this.offeringOwner = offeringOwner;
    }


    /**
     * Gets the newEffectiveTime value for this ChangeSubPaymentModeResultModifyOffering.
     * 
     * @return newEffectiveTime
     */
    public java.lang.String getNewEffectiveTime() {
        return newEffectiveTime;
    }


    /**
     * Sets the newEffectiveTime value for this ChangeSubPaymentModeResultModifyOffering.
     * 
     * @param newEffectiveTime
     */
    public void setNewEffectiveTime(java.lang.String newEffectiveTime) {
        this.newEffectiveTime = newEffectiveTime;
    }


    /**
     * Gets the newExpirationTime value for this ChangeSubPaymentModeResultModifyOffering.
     * 
     * @return newExpirationTime
     */
    public java.lang.String getNewExpirationTime() {
        return newExpirationTime;
    }


    /**
     * Sets the newExpirationTime value for this ChangeSubPaymentModeResultModifyOffering.
     * 
     * @param newExpirationTime
     */
    public void setNewExpirationTime(java.lang.String newExpirationTime) {
        this.newExpirationTime = newExpirationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubPaymentModeResultModifyOffering)) return false;
        ChangeSubPaymentModeResultModifyOffering other = (ChangeSubPaymentModeResultModifyOffering) obj;
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
            ((this.offeringOwner==null && other.getOfferingOwner()==null) || 
             (this.offeringOwner!=null &&
              this.offeringOwner.equals(other.getOfferingOwner()))) &&
            ((this.newEffectiveTime==null && other.getNewEffectiveTime()==null) || 
             (this.newEffectiveTime!=null &&
              this.newEffectiveTime.equals(other.getNewEffectiveTime()))) &&
            ((this.newExpirationTime==null && other.getNewExpirationTime()==null) || 
             (this.newExpirationTime!=null &&
              this.newExpirationTime.equals(other.getNewExpirationTime())));
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
        if (getOfferingOwner() != null) {
            _hashCode += getOfferingOwner().hashCode();
        }
        if (getNewEffectiveTime() != null) {
            _hashCode += getNewEffectiveTime().hashCode();
        }
        if (getNewExpirationTime() != null) {
            _hashCode += getNewExpirationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubPaymentModeResultModifyOffering.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPaymentModeResult>ModifyOffering"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingOwner"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newEffectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewEffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newExpirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewExpirationTime"));
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
