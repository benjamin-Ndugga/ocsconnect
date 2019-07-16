/**
 * QueryCustomerInfoResultSubscriberSupplementaryOffering.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryCustomerInfoResultSubscriberSupplementaryOffering  extends com.huawei.www.bme.cbsinterface.bccommon.OfferingInst  implements java.io.Serializable {
    private java.lang.String effectiveTime;

    private java.lang.String expirationTime;

    private java.lang.String activationMode;

    private java.lang.String activationTime;

    private java.lang.String activeTimeLimit;

    public QueryCustomerInfoResultSubscriberSupplementaryOffering() {
    }

    public QueryCustomerInfoResultSubscriberSupplementaryOffering(
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
           java.lang.String effectiveTime,
           java.lang.String expirationTime,
           java.lang.String activationMode,
           java.lang.String activationTime,
           java.lang.String activeTimeLimit) {
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
        this.effectiveTime = effectiveTime;
        this.expirationTime = expirationTime;
        this.activationMode = activationMode;
        this.activationTime = activationTime;
        this.activeTimeLimit = activeTimeLimit;
    }


    /**
     * Gets the effectiveTime value for this QueryCustomerInfoResultSubscriberSupplementaryOffering.
     * 
     * @return effectiveTime
     */
    public java.lang.String getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this QueryCustomerInfoResultSubscriberSupplementaryOffering.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(java.lang.String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the expirationTime value for this QueryCustomerInfoResultSubscriberSupplementaryOffering.
     * 
     * @return expirationTime
     */
    public java.lang.String getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this QueryCustomerInfoResultSubscriberSupplementaryOffering.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(java.lang.String expirationTime) {
        this.expirationTime = expirationTime;
    }


    /**
     * Gets the activationMode value for this QueryCustomerInfoResultSubscriberSupplementaryOffering.
     * 
     * @return activationMode
     */
    public java.lang.String getActivationMode() {
        return activationMode;
    }


    /**
     * Sets the activationMode value for this QueryCustomerInfoResultSubscriberSupplementaryOffering.
     * 
     * @param activationMode
     */
    public void setActivationMode(java.lang.String activationMode) {
        this.activationMode = activationMode;
    }


    /**
     * Gets the activationTime value for this QueryCustomerInfoResultSubscriberSupplementaryOffering.
     * 
     * @return activationTime
     */
    public java.lang.String getActivationTime() {
        return activationTime;
    }


    /**
     * Sets the activationTime value for this QueryCustomerInfoResultSubscriberSupplementaryOffering.
     * 
     * @param activationTime
     */
    public void setActivationTime(java.lang.String activationTime) {
        this.activationTime = activationTime;
    }


    /**
     * Gets the activeTimeLimit value for this QueryCustomerInfoResultSubscriberSupplementaryOffering.
     * 
     * @return activeTimeLimit
     */
    public java.lang.String getActiveTimeLimit() {
        return activeTimeLimit;
    }


    /**
     * Sets the activeTimeLimit value for this QueryCustomerInfoResultSubscriberSupplementaryOffering.
     * 
     * @param activeTimeLimit
     */
    public void setActiveTimeLimit(java.lang.String activeTimeLimit) {
        this.activeTimeLimit = activeTimeLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCustomerInfoResultSubscriberSupplementaryOffering)) return false;
        QueryCustomerInfoResultSubscriberSupplementaryOffering other = (QueryCustomerInfoResultSubscriberSupplementaryOffering) obj;
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
              this.effectiveTime.equals(other.getEffectiveTime()))) &&
            ((this.expirationTime==null && other.getExpirationTime()==null) || 
             (this.expirationTime!=null &&
              this.expirationTime.equals(other.getExpirationTime()))) &&
            ((this.activationMode==null && other.getActivationMode()==null) || 
             (this.activationMode!=null &&
              this.activationMode.equals(other.getActivationMode()))) &&
            ((this.activationTime==null && other.getActivationTime()==null) || 
             (this.activationTime!=null &&
              this.activationTime.equals(other.getActivationTime()))) &&
            ((this.activeTimeLimit==null && other.getActiveTimeLimit()==null) || 
             (this.activeTimeLimit!=null &&
              this.activeTimeLimit.equals(other.getActiveTimeLimit())));
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
        if (getExpirationTime() != null) {
            _hashCode += getExpirationTime().hashCode();
        }
        if (getActivationMode() != null) {
            _hashCode += getActivationMode().hashCode();
        }
        if (getActivationTime() != null) {
            _hashCode += getActivationTime().hashCode();
        }
        if (getActiveTimeLimit() != null) {
            _hashCode += getActiveTimeLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCustomerInfoResultSubscriberSupplementaryOffering.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>Subscriber>SupplementaryOffering"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpirationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ActivationMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ActivationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeTimeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ActiveTimeLimit"));
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
