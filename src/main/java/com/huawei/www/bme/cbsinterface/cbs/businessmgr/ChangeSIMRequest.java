/**
 * ChangeSIMRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ChangeSIMRequest  implements java.io.Serializable {
    private java.lang.String subscriberNo;

    private java.lang.String oldIMSI;

    private java.lang.String newIMSI;

    private java.lang.Integer handlingChargeFlag;

    private java.lang.String additionalInfo;

    private java.lang.Integer accessMethod;

    private java.lang.String oldPin;

    private java.lang.Integer validatePINFlag;

    public ChangeSIMRequest() {
    }

    public ChangeSIMRequest(
           java.lang.String subscriberNo,
           java.lang.String oldIMSI,
           java.lang.String newIMSI,
           java.lang.Integer handlingChargeFlag,
           java.lang.String additionalInfo,
           java.lang.Integer accessMethod,
           java.lang.String oldPin,
           java.lang.Integer validatePINFlag) {
           this.subscriberNo = subscriberNo;
           this.oldIMSI = oldIMSI;
           this.newIMSI = newIMSI;
           this.handlingChargeFlag = handlingChargeFlag;
           this.additionalInfo = additionalInfo;
           this.accessMethod = accessMethod;
           this.oldPin = oldPin;
           this.validatePINFlag = validatePINFlag;
    }


    /**
     * Gets the subscriberNo value for this ChangeSIMRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this ChangeSIMRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the oldIMSI value for this ChangeSIMRequest.
     * 
     * @return oldIMSI
     */
    public java.lang.String getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this ChangeSIMRequest.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(java.lang.String oldIMSI) {
        this.oldIMSI = oldIMSI;
    }


    /**
     * Gets the newIMSI value for this ChangeSIMRequest.
     * 
     * @return newIMSI
     */
    public java.lang.String getNewIMSI() {
        return newIMSI;
    }


    /**
     * Sets the newIMSI value for this ChangeSIMRequest.
     * 
     * @param newIMSI
     */
    public void setNewIMSI(java.lang.String newIMSI) {
        this.newIMSI = newIMSI;
    }


    /**
     * Gets the handlingChargeFlag value for this ChangeSIMRequest.
     * 
     * @return handlingChargeFlag
     */
    public java.lang.Integer getHandlingChargeFlag() {
        return handlingChargeFlag;
    }


    /**
     * Sets the handlingChargeFlag value for this ChangeSIMRequest.
     * 
     * @param handlingChargeFlag
     */
    public void setHandlingChargeFlag(java.lang.Integer handlingChargeFlag) {
        this.handlingChargeFlag = handlingChargeFlag;
    }


    /**
     * Gets the additionalInfo value for this ChangeSIMRequest.
     * 
     * @return additionalInfo
     */
    public java.lang.String getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this ChangeSIMRequest.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(java.lang.String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the accessMethod value for this ChangeSIMRequest.
     * 
     * @return accessMethod
     */
    public java.lang.Integer getAccessMethod() {
        return accessMethod;
    }


    /**
     * Sets the accessMethod value for this ChangeSIMRequest.
     * 
     * @param accessMethod
     */
    public void setAccessMethod(java.lang.Integer accessMethod) {
        this.accessMethod = accessMethod;
    }


    /**
     * Gets the oldPin value for this ChangeSIMRequest.
     * 
     * @return oldPin
     */
    public java.lang.String getOldPin() {
        return oldPin;
    }


    /**
     * Sets the oldPin value for this ChangeSIMRequest.
     * 
     * @param oldPin
     */
    public void setOldPin(java.lang.String oldPin) {
        this.oldPin = oldPin;
    }


    /**
     * Gets the validatePINFlag value for this ChangeSIMRequest.
     * 
     * @return validatePINFlag
     */
    public java.lang.Integer getValidatePINFlag() {
        return validatePINFlag;
    }


    /**
     * Sets the validatePINFlag value for this ChangeSIMRequest.
     * 
     * @param validatePINFlag
     */
    public void setValidatePINFlag(java.lang.Integer validatePINFlag) {
        this.validatePINFlag = validatePINFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSIMRequest)) return false;
        ChangeSIMRequest other = (ChangeSIMRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              this.oldIMSI.equals(other.getOldIMSI()))) &&
            ((this.newIMSI==null && other.getNewIMSI()==null) || 
             (this.newIMSI!=null &&
              this.newIMSI.equals(other.getNewIMSI()))) &&
            ((this.handlingChargeFlag==null && other.getHandlingChargeFlag()==null) || 
             (this.handlingChargeFlag!=null &&
              this.handlingChargeFlag.equals(other.getHandlingChargeFlag()))) &&
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              this.additionalInfo.equals(other.getAdditionalInfo()))) &&
            ((this.accessMethod==null && other.getAccessMethod()==null) || 
             (this.accessMethod!=null &&
              this.accessMethod.equals(other.getAccessMethod()))) &&
            ((this.oldPin==null && other.getOldPin()==null) || 
             (this.oldPin!=null &&
              this.oldPin.equals(other.getOldPin()))) &&
            ((this.validatePINFlag==null && other.getValidatePINFlag()==null) || 
             (this.validatePINFlag!=null &&
              this.validatePINFlag.equals(other.getValidatePINFlag())));
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
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        if (getOldIMSI() != null) {
            _hashCode += getOldIMSI().hashCode();
        }
        if (getNewIMSI() != null) {
            _hashCode += getNewIMSI().hashCode();
        }
        if (getHandlingChargeFlag() != null) {
            _hashCode += getHandlingChargeFlag().hashCode();
        }
        if (getAdditionalInfo() != null) {
            _hashCode += getAdditionalInfo().hashCode();
        }
        if (getAccessMethod() != null) {
            _hashCode += getAccessMethod().hashCode();
        }
        if (getOldPin() != null) {
            _hashCode += getOldPin().hashCode();
        }
        if (getValidatePINFlag() != null) {
            _hashCode += getValidatePINFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSIMRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeSIMRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OldIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingChargeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "HandlingChargeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "AccessMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OldPin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validatePINFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ValidatePINFlag"));
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
