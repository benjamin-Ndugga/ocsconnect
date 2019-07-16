/**
 * ManParentChildRequestChildSubscriberInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ManParentChildRequestChildSubscriberInfo  implements java.io.Serializable {
    private java.lang.String childSubNo;

    private java.lang.Integer childSubType;

    private java.lang.Integer childSubLimitAmt;

    private java.lang.String effectiveDate;

    private java.lang.String expireDate;

    private java.lang.Integer payFormeVoiceFlag;

    private java.lang.Integer payFormeSmsFlag;

    private java.lang.Integer multiSurfFlag;

    public ManParentChildRequestChildSubscriberInfo() {
    }

    public ManParentChildRequestChildSubscriberInfo(
           java.lang.String childSubNo,
           java.lang.Integer childSubType,
           java.lang.Integer childSubLimitAmt,
           java.lang.String effectiveDate,
           java.lang.String expireDate,
           java.lang.Integer payFormeVoiceFlag,
           java.lang.Integer payFormeSmsFlag,
           java.lang.Integer multiSurfFlag) {
           this.childSubNo = childSubNo;
           this.childSubType = childSubType;
           this.childSubLimitAmt = childSubLimitAmt;
           this.effectiveDate = effectiveDate;
           this.expireDate = expireDate;
           this.payFormeVoiceFlag = payFormeVoiceFlag;
           this.payFormeSmsFlag = payFormeSmsFlag;
           this.multiSurfFlag = multiSurfFlag;
    }


    /**
     * Gets the childSubNo value for this ManParentChildRequestChildSubscriberInfo.
     * 
     * @return childSubNo
     */
    public java.lang.String getChildSubNo() {
        return childSubNo;
    }


    /**
     * Sets the childSubNo value for this ManParentChildRequestChildSubscriberInfo.
     * 
     * @param childSubNo
     */
    public void setChildSubNo(java.lang.String childSubNo) {
        this.childSubNo = childSubNo;
    }


    /**
     * Gets the childSubType value for this ManParentChildRequestChildSubscriberInfo.
     * 
     * @return childSubType
     */
    public java.lang.Integer getChildSubType() {
        return childSubType;
    }


    /**
     * Sets the childSubType value for this ManParentChildRequestChildSubscriberInfo.
     * 
     * @param childSubType
     */
    public void setChildSubType(java.lang.Integer childSubType) {
        this.childSubType = childSubType;
    }


    /**
     * Gets the childSubLimitAmt value for this ManParentChildRequestChildSubscriberInfo.
     * 
     * @return childSubLimitAmt
     */
    public java.lang.Integer getChildSubLimitAmt() {
        return childSubLimitAmt;
    }


    /**
     * Sets the childSubLimitAmt value for this ManParentChildRequestChildSubscriberInfo.
     * 
     * @param childSubLimitAmt
     */
    public void setChildSubLimitAmt(java.lang.Integer childSubLimitAmt) {
        this.childSubLimitAmt = childSubLimitAmt;
    }


    /**
     * Gets the effectiveDate value for this ManParentChildRequestChildSubscriberInfo.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ManParentChildRequestChildSubscriberInfo.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expireDate value for this ManParentChildRequestChildSubscriberInfo.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this ManParentChildRequestChildSubscriberInfo.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the payFormeVoiceFlag value for this ManParentChildRequestChildSubscriberInfo.
     * 
     * @return payFormeVoiceFlag
     */
    public java.lang.Integer getPayFormeVoiceFlag() {
        return payFormeVoiceFlag;
    }


    /**
     * Sets the payFormeVoiceFlag value for this ManParentChildRequestChildSubscriberInfo.
     * 
     * @param payFormeVoiceFlag
     */
    public void setPayFormeVoiceFlag(java.lang.Integer payFormeVoiceFlag) {
        this.payFormeVoiceFlag = payFormeVoiceFlag;
    }


    /**
     * Gets the payFormeSmsFlag value for this ManParentChildRequestChildSubscriberInfo.
     * 
     * @return payFormeSmsFlag
     */
    public java.lang.Integer getPayFormeSmsFlag() {
        return payFormeSmsFlag;
    }


    /**
     * Sets the payFormeSmsFlag value for this ManParentChildRequestChildSubscriberInfo.
     * 
     * @param payFormeSmsFlag
     */
    public void setPayFormeSmsFlag(java.lang.Integer payFormeSmsFlag) {
        this.payFormeSmsFlag = payFormeSmsFlag;
    }


    /**
     * Gets the multiSurfFlag value for this ManParentChildRequestChildSubscriberInfo.
     * 
     * @return multiSurfFlag
     */
    public java.lang.Integer getMultiSurfFlag() {
        return multiSurfFlag;
    }


    /**
     * Sets the multiSurfFlag value for this ManParentChildRequestChildSubscriberInfo.
     * 
     * @param multiSurfFlag
     */
    public void setMultiSurfFlag(java.lang.Integer multiSurfFlag) {
        this.multiSurfFlag = multiSurfFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManParentChildRequestChildSubscriberInfo)) return false;
        ManParentChildRequestChildSubscriberInfo other = (ManParentChildRequestChildSubscriberInfo) obj;
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
            ((this.childSubType==null && other.getChildSubType()==null) || 
             (this.childSubType!=null &&
              this.childSubType.equals(other.getChildSubType()))) &&
            ((this.childSubLimitAmt==null && other.getChildSubLimitAmt()==null) || 
             (this.childSubLimitAmt!=null &&
              this.childSubLimitAmt.equals(other.getChildSubLimitAmt()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.payFormeVoiceFlag==null && other.getPayFormeVoiceFlag()==null) || 
             (this.payFormeVoiceFlag!=null &&
              this.payFormeVoiceFlag.equals(other.getPayFormeVoiceFlag()))) &&
            ((this.payFormeSmsFlag==null && other.getPayFormeSmsFlag()==null) || 
             (this.payFormeSmsFlag!=null &&
              this.payFormeSmsFlag.equals(other.getPayFormeSmsFlag()))) &&
            ((this.multiSurfFlag==null && other.getMultiSurfFlag()==null) || 
             (this.multiSurfFlag!=null &&
              this.multiSurfFlag.equals(other.getMultiSurfFlag())));
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
        if (getChildSubType() != null) {
            _hashCode += getChildSubType().hashCode();
        }
        if (getChildSubLimitAmt() != null) {
            _hashCode += getChildSubLimitAmt().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getPayFormeVoiceFlag() != null) {
            _hashCode += getPayFormeVoiceFlag().hashCode();
        }
        if (getPayFormeSmsFlag() != null) {
            _hashCode += getPayFormeSmsFlag().hashCode();
        }
        if (getMultiSurfFlag() != null) {
            _hashCode += getMultiSurfFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManParentChildRequestChildSubscriberInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ManParentChildRequest>ChildSubscriberInfo"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childSubLimitAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChildSubLimitAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payFormeVoiceFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "PayFormeVoiceFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payFormeSmsFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "PayFormeSmsFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiSurfFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "MultiSurfFlag"));
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
