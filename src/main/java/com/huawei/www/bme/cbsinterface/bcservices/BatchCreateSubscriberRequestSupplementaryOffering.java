/**
 * BatchCreateSubscriberRequestSupplementaryOffering.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchCreateSubscriberRequestSupplementaryOffering  extends com.huawei.www.bme.cbsinterface.bccommon.OfferingInst  implements java.io.Serializable {
    private java.lang.String ownerType;

    private java.lang.String acctPaymentMode;

    private com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime;

    private java.lang.String expirationTime;

    private com.huawei.www.bme.cbsinterface.bccommon.ActiveMode activationTime;

    public BatchCreateSubscriberRequestSupplementaryOffering() {
    }

    public BatchCreateSubscriberRequestSupplementaryOffering(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           java.lang.String bundledFlag,
           java.lang.String offeringClass,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey parentOfferingKey,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey relGOfferingKey,
           java.lang.String status,
           java.lang.String trialStartTime,
           java.lang.String trialEndTime,
           com.huawei.www.bme.cbsinterface.bccommon.ProductInst[] productInst,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingInstOInstProperty[] OInstProperty,
           java.lang.String ownerType,
           java.lang.String acctPaymentMode,
           com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime,
           java.lang.String expirationTime,
           com.huawei.www.bme.cbsinterface.bccommon.ActiveMode activationTime) {
        super(
            offeringKey,
            bundledFlag,
            offeringClass,
            parentOfferingKey,
            relGOfferingKey,
            status,
            trialStartTime,
            trialEndTime,
            productInst,
            OInstProperty);
        this.ownerType = ownerType;
        this.acctPaymentMode = acctPaymentMode;
        this.effectiveTime = effectiveTime;
        this.expirationTime = expirationTime;
        this.activationTime = activationTime;
    }


    /**
     * Gets the ownerType value for this BatchCreateSubscriberRequestSupplementaryOffering.
     * 
     * @return ownerType
     */
    public java.lang.String getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this BatchCreateSubscriberRequestSupplementaryOffering.
     * 
     * @param ownerType
     */
    public void setOwnerType(java.lang.String ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the acctPaymentMode value for this BatchCreateSubscriberRequestSupplementaryOffering.
     * 
     * @return acctPaymentMode
     */
    public java.lang.String getAcctPaymentMode() {
        return acctPaymentMode;
    }


    /**
     * Sets the acctPaymentMode value for this BatchCreateSubscriberRequestSupplementaryOffering.
     * 
     * @param acctPaymentMode
     */
    public void setAcctPaymentMode(java.lang.String acctPaymentMode) {
        this.acctPaymentMode = acctPaymentMode;
    }


    /**
     * Gets the effectiveTime value for this BatchCreateSubscriberRequestSupplementaryOffering.
     * 
     * @return effectiveTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.EffectMode getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this BatchCreateSubscriberRequestSupplementaryOffering.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the expirationTime value for this BatchCreateSubscriberRequestSupplementaryOffering.
     * 
     * @return expirationTime
     */
    public java.lang.String getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this BatchCreateSubscriberRequestSupplementaryOffering.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(java.lang.String expirationTime) {
        this.expirationTime = expirationTime;
    }


    /**
     * Gets the activationTime value for this BatchCreateSubscriberRequestSupplementaryOffering.
     * 
     * @return activationTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.ActiveMode getActivationTime() {
        return activationTime;
    }


    /**
     * Sets the activationTime value for this BatchCreateSubscriberRequestSupplementaryOffering.
     * 
     * @param activationTime
     */
    public void setActivationTime(com.huawei.www.bme.cbsinterface.bccommon.ActiveMode activationTime) {
        this.activationTime = activationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchCreateSubscriberRequestSupplementaryOffering)) return false;
        BatchCreateSubscriberRequestSupplementaryOffering other = (BatchCreateSubscriberRequestSupplementaryOffering) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ownerType==null && other.getOwnerType()==null) || 
             (this.ownerType!=null &&
              this.ownerType.equals(other.getOwnerType()))) &&
            ((this.acctPaymentMode==null && other.getAcctPaymentMode()==null) || 
             (this.acctPaymentMode!=null &&
              this.acctPaymentMode.equals(other.getAcctPaymentMode()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime()))) &&
            ((this.expirationTime==null && other.getExpirationTime()==null) || 
             (this.expirationTime!=null &&
              this.expirationTime.equals(other.getExpirationTime()))) &&
            ((this.activationTime==null && other.getActivationTime()==null) || 
             (this.activationTime!=null &&
              this.activationTime.equals(other.getActivationTime())));
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
        if (getOwnerType() != null) {
            _hashCode += getOwnerType().hashCode();
        }
        if (getAcctPaymentMode() != null) {
            _hashCode += getAcctPaymentMode().hashCode();
        }
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        if (getExpirationTime() != null) {
            _hashCode += getExpirationTime().hashCode();
        }
        if (getActivationTime() != null) {
            _hashCode += getActivationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchCreateSubscriberRequestSupplementaryOffering.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchCreateSubscriberRequest>SupplementaryOffering"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OwnerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctPaymentMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctPaymentMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "EffectMode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpirationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ActivationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ActiveMode"));
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
