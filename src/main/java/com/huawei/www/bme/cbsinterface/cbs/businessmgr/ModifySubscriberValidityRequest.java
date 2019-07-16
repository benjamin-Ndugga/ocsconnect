/**
 * ModifySubscriberValidityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ModifySubscriberValidityRequest  implements java.io.Serializable {
    private java.lang.String subscriberNo;

    private int validityIncrement;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.ModifySubscriberValidityRequestModifyType modifyType;

    private java.lang.String reserve;

    private java.lang.String merchant;

    private java.lang.String service;

    private java.lang.Integer susChgDays;

    private java.lang.Integer disChgDays;

    private java.lang.Integer updateType;

    public ModifySubscriberValidityRequest() {
    }

    public ModifySubscriberValidityRequest(
           java.lang.String subscriberNo,
           int validityIncrement,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.ModifySubscriberValidityRequestModifyType modifyType,
           java.lang.String reserve,
           java.lang.String merchant,
           java.lang.String service,
           java.lang.Integer susChgDays,
           java.lang.Integer disChgDays,
           java.lang.Integer updateType) {
           this.subscriberNo = subscriberNo;
           this.validityIncrement = validityIncrement;
           this.modifyType = modifyType;
           this.reserve = reserve;
           this.merchant = merchant;
           this.service = service;
           this.susChgDays = susChgDays;
           this.disChgDays = disChgDays;
           this.updateType = updateType;
    }


    /**
     * Gets the subscriberNo value for this ModifySubscriberValidityRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this ModifySubscriberValidityRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the validityIncrement value for this ModifySubscriberValidityRequest.
     * 
     * @return validityIncrement
     */
    public int getValidityIncrement() {
        return validityIncrement;
    }


    /**
     * Sets the validityIncrement value for this ModifySubscriberValidityRequest.
     * 
     * @param validityIncrement
     */
    public void setValidityIncrement(int validityIncrement) {
        this.validityIncrement = validityIncrement;
    }


    /**
     * Gets the modifyType value for this ModifySubscriberValidityRequest.
     * 
     * @return modifyType
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ModifySubscriberValidityRequestModifyType getModifyType() {
        return modifyType;
    }


    /**
     * Sets the modifyType value for this ModifySubscriberValidityRequest.
     * 
     * @param modifyType
     */
    public void setModifyType(com.huawei.www.bme.cbsinterface.cbs.businessmgr.ModifySubscriberValidityRequestModifyType modifyType) {
        this.modifyType = modifyType;
    }


    /**
     * Gets the reserve value for this ModifySubscriberValidityRequest.
     * 
     * @return reserve
     */
    public java.lang.String getReserve() {
        return reserve;
    }


    /**
     * Sets the reserve value for this ModifySubscriberValidityRequest.
     * 
     * @param reserve
     */
    public void setReserve(java.lang.String reserve) {
        this.reserve = reserve;
    }


    /**
     * Gets the merchant value for this ModifySubscriberValidityRequest.
     * 
     * @return merchant
     */
    public java.lang.String getMerchant() {
        return merchant;
    }


    /**
     * Sets the merchant value for this ModifySubscriberValidityRequest.
     * 
     * @param merchant
     */
    public void setMerchant(java.lang.String merchant) {
        this.merchant = merchant;
    }


    /**
     * Gets the service value for this ModifySubscriberValidityRequest.
     * 
     * @return service
     */
    public java.lang.String getService() {
        return service;
    }


    /**
     * Sets the service value for this ModifySubscriberValidityRequest.
     * 
     * @param service
     */
    public void setService(java.lang.String service) {
        this.service = service;
    }


    /**
     * Gets the susChgDays value for this ModifySubscriberValidityRequest.
     * 
     * @return susChgDays
     */
    public java.lang.Integer getSusChgDays() {
        return susChgDays;
    }


    /**
     * Sets the susChgDays value for this ModifySubscriberValidityRequest.
     * 
     * @param susChgDays
     */
    public void setSusChgDays(java.lang.Integer susChgDays) {
        this.susChgDays = susChgDays;
    }


    /**
     * Gets the disChgDays value for this ModifySubscriberValidityRequest.
     * 
     * @return disChgDays
     */
    public java.lang.Integer getDisChgDays() {
        return disChgDays;
    }


    /**
     * Sets the disChgDays value for this ModifySubscriberValidityRequest.
     * 
     * @param disChgDays
     */
    public void setDisChgDays(java.lang.Integer disChgDays) {
        this.disChgDays = disChgDays;
    }


    /**
     * Gets the updateType value for this ModifySubscriberValidityRequest.
     * 
     * @return updateType
     */
    public java.lang.Integer getUpdateType() {
        return updateType;
    }


    /**
     * Sets the updateType value for this ModifySubscriberValidityRequest.
     * 
     * @param updateType
     */
    public void setUpdateType(java.lang.Integer updateType) {
        this.updateType = updateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifySubscriberValidityRequest)) return false;
        ModifySubscriberValidityRequest other = (ModifySubscriberValidityRequest) obj;
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
            this.validityIncrement == other.getValidityIncrement() &&
            ((this.modifyType==null && other.getModifyType()==null) || 
             (this.modifyType!=null &&
              this.modifyType.equals(other.getModifyType()))) &&
            ((this.reserve==null && other.getReserve()==null) || 
             (this.reserve!=null &&
              this.reserve.equals(other.getReserve()))) &&
            ((this.merchant==null && other.getMerchant()==null) || 
             (this.merchant!=null &&
              this.merchant.equals(other.getMerchant()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.susChgDays==null && other.getSusChgDays()==null) || 
             (this.susChgDays!=null &&
              this.susChgDays.equals(other.getSusChgDays()))) &&
            ((this.disChgDays==null && other.getDisChgDays()==null) || 
             (this.disChgDays!=null &&
              this.disChgDays.equals(other.getDisChgDays()))) &&
            ((this.updateType==null && other.getUpdateType()==null) || 
             (this.updateType!=null &&
              this.updateType.equals(other.getUpdateType())));
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
        _hashCode += getValidityIncrement();
        if (getModifyType() != null) {
            _hashCode += getModifyType().hashCode();
        }
        if (getReserve() != null) {
            _hashCode += getReserve().hashCode();
        }
        if (getMerchant() != null) {
            _hashCode += getMerchant().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getSusChgDays() != null) {
            _hashCode += getSusChgDays().hashCode();
        }
        if (getDisChgDays() != null) {
            _hashCode += getDisChgDays().hashCode();
        }
        if (getUpdateType() != null) {
            _hashCode += getUpdateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifySubscriberValidityRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ModifySubscriberValidityRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityIncrement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ValidityIncrement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ModifyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ModifySubscriberValidityRequest>ModifyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserve");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Reserve"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Merchant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("susChgDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SusChgDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disChgDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "DisChgDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "UpdateType"));
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
