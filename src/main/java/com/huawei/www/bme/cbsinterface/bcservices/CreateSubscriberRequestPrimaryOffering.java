/**
 * CreateSubscriberRequestPrimaryOffering.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class CreateSubscriberRequestPrimaryOffering  extends com.huawei.www.bme.cbsinterface.bccommon.POfferingInst  implements java.io.Serializable {
    private java.lang.String effectiveTime;

    public CreateSubscriberRequestPrimaryOffering() {
    }

    public CreateSubscriberRequestPrimaryOffering(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           java.lang.String bundledFlag,
           java.lang.String offeringClass,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey parentOfferingKey,
           java.lang.String status,
           java.lang.String trialStartTime,
           java.lang.String trialEndTime,
           com.huawei.www.bme.cbsinterface.bccommon.ProductInst[] productInst,
           com.huawei.www.bme.cbsinterface.bccommon.POfferingInstOfferingInstProperty[] offeringInstProperty,
           java.lang.String effectiveTime) {
        super(
            offeringKey,
            bundledFlag,
            offeringClass,
            parentOfferingKey,
            status,
            trialStartTime,
            trialEndTime,
            productInst,
            offeringInstProperty);
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the effectiveTime value for this CreateSubscriberRequestPrimaryOffering.
     * 
     * @return effectiveTime
     */
    public java.lang.String getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this CreateSubscriberRequestPrimaryOffering.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(java.lang.String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSubscriberRequestPrimaryOffering)) return false;
        CreateSubscriberRequestPrimaryOffering other = (CreateSubscriberRequestPrimaryOffering) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSubscriberRequestPrimaryOffering.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberRequest>PrimaryOffering"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
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
