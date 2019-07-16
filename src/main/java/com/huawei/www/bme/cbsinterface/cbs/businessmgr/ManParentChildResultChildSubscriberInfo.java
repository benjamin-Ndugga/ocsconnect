/**
 * ManParentChildResultChildSubscriberInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ManParentChildResultChildSubscriberInfo  implements java.io.Serializable {
    private java.lang.String childSubNo;

    private int childSubType;

    private int childSubLimitation;

    private java.lang.String effectiveTime;

    private java.lang.String expireTime;

    private int screenType;

    private java.lang.String featureFlag;

    public ManParentChildResultChildSubscriberInfo() {
    }

    public ManParentChildResultChildSubscriberInfo(
           java.lang.String childSubNo,
           int childSubType,
           int childSubLimitation,
           java.lang.String effectiveTime,
           java.lang.String expireTime,
           int screenType,
           java.lang.String featureFlag) {
           this.childSubNo = childSubNo;
           this.childSubType = childSubType;
           this.childSubLimitation = childSubLimitation;
           this.effectiveTime = effectiveTime;
           this.expireTime = expireTime;
           this.screenType = screenType;
           this.featureFlag = featureFlag;
    }


    /**
     * Gets the childSubNo value for this ManParentChildResultChildSubscriberInfo.
     * 
     * @return childSubNo
     */
    public java.lang.String getChildSubNo() {
        return childSubNo;
    }


    /**
     * Sets the childSubNo value for this ManParentChildResultChildSubscriberInfo.
     * 
     * @param childSubNo
     */
    public void setChildSubNo(java.lang.String childSubNo) {
        this.childSubNo = childSubNo;
    }


    /**
     * Gets the childSubType value for this ManParentChildResultChildSubscriberInfo.
     * 
     * @return childSubType
     */
    public int getChildSubType() {
        return childSubType;
    }


    /**
     * Sets the childSubType value for this ManParentChildResultChildSubscriberInfo.
     * 
     * @param childSubType
     */
    public void setChildSubType(int childSubType) {
        this.childSubType = childSubType;
    }


    /**
     * Gets the childSubLimitation value for this ManParentChildResultChildSubscriberInfo.
     * 
     * @return childSubLimitation
     */
    public int getChildSubLimitation() {
        return childSubLimitation;
    }


    /**
     * Sets the childSubLimitation value for this ManParentChildResultChildSubscriberInfo.
     * 
     * @param childSubLimitation
     */
    public void setChildSubLimitation(int childSubLimitation) {
        this.childSubLimitation = childSubLimitation;
    }


    /**
     * Gets the effectiveTime value for this ManParentChildResultChildSubscriberInfo.
     * 
     * @return effectiveTime
     */
    public java.lang.String getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this ManParentChildResultChildSubscriberInfo.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(java.lang.String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the expireTime value for this ManParentChildResultChildSubscriberInfo.
     * 
     * @return expireTime
     */
    public java.lang.String getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the expireTime value for this ManParentChildResultChildSubscriberInfo.
     * 
     * @param expireTime
     */
    public void setExpireTime(java.lang.String expireTime) {
        this.expireTime = expireTime;
    }


    /**
     * Gets the screenType value for this ManParentChildResultChildSubscriberInfo.
     * 
     * @return screenType
     */
    public int getScreenType() {
        return screenType;
    }


    /**
     * Sets the screenType value for this ManParentChildResultChildSubscriberInfo.
     * 
     * @param screenType
     */
    public void setScreenType(int screenType) {
        this.screenType = screenType;
    }


    /**
     * Gets the featureFlag value for this ManParentChildResultChildSubscriberInfo.
     * 
     * @return featureFlag
     */
    public java.lang.String getFeatureFlag() {
        return featureFlag;
    }


    /**
     * Sets the featureFlag value for this ManParentChildResultChildSubscriberInfo.
     * 
     * @param featureFlag
     */
    public void setFeatureFlag(java.lang.String featureFlag) {
        this.featureFlag = featureFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManParentChildResultChildSubscriberInfo)) return false;
        ManParentChildResultChildSubscriberInfo other = (ManParentChildResultChildSubscriberInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.childSubNo==null && other.getChildSubNo()==null) || 
             (this.childSubNo!=null &&
              this.childSubNo.equals(other.getChildSubNo()))) &&
            this.childSubType == other.getChildSubType() &&
            this.childSubLimitation == other.getChildSubLimitation() &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime()))) &&
            ((this.expireTime==null && other.getExpireTime()==null) || 
             (this.expireTime!=null &&
              this.expireTime.equals(other.getExpireTime()))) &&
            this.screenType == other.getScreenType() &&
            ((this.featureFlag==null && other.getFeatureFlag()==null) || 
             (this.featureFlag!=null &&
              this.featureFlag.equals(other.getFeatureFlag())));
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
        if (getChildSubNo() != null) {
            _hashCode += getChildSubNo().hashCode();
        }
        _hashCode += getChildSubType();
        _hashCode += getChildSubLimitation();
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        if (getExpireTime() != null) {
            _hashCode += getExpireTime().hashCode();
        }
        _hashCode += getScreenType();
        if (getFeatureFlag() != null) {
            _hashCode += getFeatureFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManParentChildResultChildSubscriberInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ManParentChildResult>ChildSubscriberInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childSubNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChildSubNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChildSubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childSubLimitation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChildSubLimitation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ExpireTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screenType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ScreenType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "FeatureFlag"));
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
