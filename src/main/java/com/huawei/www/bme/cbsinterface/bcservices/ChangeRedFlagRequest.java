/**
 * ChangeRedFlagRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeRedFlagRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagRequestChangeObj changeObj;

    private java.lang.String opType;

    private java.lang.String dunningRedFlag;

    private java.lang.String creditLimitRedFlag;

    private com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime;

    private java.lang.String expirationTime;

    public ChangeRedFlagRequest() {
    }

    public ChangeRedFlagRequest(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagRequestChangeObj changeObj,
           java.lang.String opType,
           java.lang.String dunningRedFlag,
           java.lang.String creditLimitRedFlag,
           com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime,
           java.lang.String expirationTime) {
           this.changeObj = changeObj;
           this.opType = opType;
           this.dunningRedFlag = dunningRedFlag;
           this.creditLimitRedFlag = creditLimitRedFlag;
           this.effectiveTime = effectiveTime;
           this.expirationTime = expirationTime;
    }


    /**
     * Gets the changeObj value for this ChangeRedFlagRequest.
     * 
     * @return changeObj
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagRequestChangeObj getChangeObj() {
        return changeObj;
    }


    /**
     * Sets the changeObj value for this ChangeRedFlagRequest.
     * 
     * @param changeObj
     */
    public void setChangeObj(com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagRequestChangeObj changeObj) {
        this.changeObj = changeObj;
    }


    /**
     * Gets the opType value for this ChangeRedFlagRequest.
     * 
     * @return opType
     */
    public java.lang.String getOpType() {
        return opType;
    }


    /**
     * Sets the opType value for this ChangeRedFlagRequest.
     * 
     * @param opType
     */
    public void setOpType(java.lang.String opType) {
        this.opType = opType;
    }


    /**
     * Gets the dunningRedFlag value for this ChangeRedFlagRequest.
     * 
     * @return dunningRedFlag
     */
    public java.lang.String getDunningRedFlag() {
        return dunningRedFlag;
    }


    /**
     * Sets the dunningRedFlag value for this ChangeRedFlagRequest.
     * 
     * @param dunningRedFlag
     */
    public void setDunningRedFlag(java.lang.String dunningRedFlag) {
        this.dunningRedFlag = dunningRedFlag;
    }


    /**
     * Gets the creditLimitRedFlag value for this ChangeRedFlagRequest.
     * 
     * @return creditLimitRedFlag
     */
    public java.lang.String getCreditLimitRedFlag() {
        return creditLimitRedFlag;
    }


    /**
     * Sets the creditLimitRedFlag value for this ChangeRedFlagRequest.
     * 
     * @param creditLimitRedFlag
     */
    public void setCreditLimitRedFlag(java.lang.String creditLimitRedFlag) {
        this.creditLimitRedFlag = creditLimitRedFlag;
    }


    /**
     * Gets the effectiveTime value for this ChangeRedFlagRequest.
     * 
     * @return effectiveTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.EffectMode getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this ChangeRedFlagRequest.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the expirationTime value for this ChangeRedFlagRequest.
     * 
     * @return expirationTime
     */
    public java.lang.String getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this ChangeRedFlagRequest.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(java.lang.String expirationTime) {
        this.expirationTime = expirationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeRedFlagRequest)) return false;
        ChangeRedFlagRequest other = (ChangeRedFlagRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeObj==null && other.getChangeObj()==null) || 
             (this.changeObj!=null &&
              this.changeObj.equals(other.getChangeObj()))) &&
            ((this.opType==null && other.getOpType()==null) || 
             (this.opType!=null &&
              this.opType.equals(other.getOpType()))) &&
            ((this.dunningRedFlag==null && other.getDunningRedFlag()==null) || 
             (this.dunningRedFlag!=null &&
              this.dunningRedFlag.equals(other.getDunningRedFlag()))) &&
            ((this.creditLimitRedFlag==null && other.getCreditLimitRedFlag()==null) || 
             (this.creditLimitRedFlag!=null &&
              this.creditLimitRedFlag.equals(other.getCreditLimitRedFlag()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime()))) &&
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
        if (getChangeObj() != null) {
            _hashCode += getChangeObj().hashCode();
        }
        if (getOpType() != null) {
            _hashCode += getOpType().hashCode();
        }
        if (getDunningRedFlag() != null) {
            _hashCode += getDunningRedFlag().hashCode();
        }
        if (getCreditLimitRedFlag() != null) {
            _hashCode += getCreditLimitRedFlag().hashCode();
        }
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        if (getExpirationTime() != null) {
            _hashCode += getExpirationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeRedFlagRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeRedFlagRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRedFlagRequest>ChangeObj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OpType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dunningRedFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DunningRedFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimitRedFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreditLimitRedFlag"));
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
