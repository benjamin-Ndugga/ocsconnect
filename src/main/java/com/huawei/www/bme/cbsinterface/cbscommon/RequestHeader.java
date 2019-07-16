/**
 * RequestHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbscommon;

public class RequestHeader  implements java.io.Serializable {
    /* Version ID of CBS interface */
    private java.lang.String version;

    /* Business operation code from request system (For example: function
     * code in CRM system). */
    private java.lang.String businessCode;

    /* Unique sequence number for one message. If request system resend
     * a message, this field should be unchanged.
     * For example: CRM can use "OrderID + OrderNodeID" as this field. */
    private java.lang.String messageSeq;

    private com.huawei.www.bme.cbsinterface.cbscommon.OwnershipInfo ownershipInfo;

    /* It is for security authentication for request system. */
    private com.huawei.www.bme.cbsinterface.cbscommon.SecurityInfo accessSecurity;

    /* It indicates the operator information of the request. */
    private com.huawei.www.bme.cbsinterface.cbscommon.OperatorInfo operatorInfo;

    private java.lang.String accessMode;

    /* It is used to specify the language of description in returen
     * message. */
    private java.lang.String msgLanguageCode;

    private com.huawei.www.bme.cbsinterface.cbscommon.RequestHeaderTimeFormat timeFormat;

    /* Reserved for future extention */
    private com.huawei.www.bme.cbsinterface.cbscommon.RequestHeaderAdditionalProperty[] additionalProperty;

    public RequestHeader() {
    }

    public RequestHeader(
           java.lang.String version,
           java.lang.String businessCode,
           java.lang.String messageSeq,
           com.huawei.www.bme.cbsinterface.cbscommon.OwnershipInfo ownershipInfo,
           com.huawei.www.bme.cbsinterface.cbscommon.SecurityInfo accessSecurity,
           com.huawei.www.bme.cbsinterface.cbscommon.OperatorInfo operatorInfo,
           java.lang.String accessMode,
           java.lang.String msgLanguageCode,
           com.huawei.www.bme.cbsinterface.cbscommon.RequestHeaderTimeFormat timeFormat,
           com.huawei.www.bme.cbsinterface.cbscommon.RequestHeaderAdditionalProperty[] additionalProperty) {
           this.version = version;
           this.businessCode = businessCode;
           this.messageSeq = messageSeq;
           this.ownershipInfo = ownershipInfo;
           this.accessSecurity = accessSecurity;
           this.operatorInfo = operatorInfo;
           this.accessMode = accessMode;
           this.msgLanguageCode = msgLanguageCode;
           this.timeFormat = timeFormat;
           this.additionalProperty = additionalProperty;
    }


    /**
     * Gets the version value for this RequestHeader.
     * 
     * @return version   * Version ID of CBS interface
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this RequestHeader.
     * 
     * @param version   * Version ID of CBS interface
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the businessCode value for this RequestHeader.
     * 
     * @return businessCode   * Business operation code from request system (For example: function
     * code in CRM system).
     */
    public java.lang.String getBusinessCode() {
        return businessCode;
    }


    /**
     * Sets the businessCode value for this RequestHeader.
     * 
     * @param businessCode   * Business operation code from request system (For example: function
     * code in CRM system).
     */
    public void setBusinessCode(java.lang.String businessCode) {
        this.businessCode = businessCode;
    }


    /**
     * Gets the messageSeq value for this RequestHeader.
     * 
     * @return messageSeq   * Unique sequence number for one message. If request system resend
     * a message, this field should be unchanged.
     * For example: CRM can use "OrderID + OrderNodeID" as this field.
     */
    public java.lang.String getMessageSeq() {
        return messageSeq;
    }


    /**
     * Sets the messageSeq value for this RequestHeader.
     * 
     * @param messageSeq   * Unique sequence number for one message. If request system resend
     * a message, this field should be unchanged.
     * For example: CRM can use "OrderID + OrderNodeID" as this field.
     */
    public void setMessageSeq(java.lang.String messageSeq) {
        this.messageSeq = messageSeq;
    }


    /**
     * Gets the ownershipInfo value for this RequestHeader.
     * 
     * @return ownershipInfo
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.OwnershipInfo getOwnershipInfo() {
        return ownershipInfo;
    }


    /**
     * Sets the ownershipInfo value for this RequestHeader.
     * 
     * @param ownershipInfo
     */
    public void setOwnershipInfo(com.huawei.www.bme.cbsinterface.cbscommon.OwnershipInfo ownershipInfo) {
        this.ownershipInfo = ownershipInfo;
    }


    /**
     * Gets the accessSecurity value for this RequestHeader.
     * 
     * @return accessSecurity   * It is for security authentication for request system.
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.SecurityInfo getAccessSecurity() {
        return accessSecurity;
    }


    /**
     * Sets the accessSecurity value for this RequestHeader.
     * 
     * @param accessSecurity   * It is for security authentication for request system.
     */
    public void setAccessSecurity(com.huawei.www.bme.cbsinterface.cbscommon.SecurityInfo accessSecurity) {
        this.accessSecurity = accessSecurity;
    }


    /**
     * Gets the operatorInfo value for this RequestHeader.
     * 
     * @return operatorInfo   * It indicates the operator information of the request.
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.OperatorInfo getOperatorInfo() {
        return operatorInfo;
    }


    /**
     * Sets the operatorInfo value for this RequestHeader.
     * 
     * @param operatorInfo   * It indicates the operator information of the request.
     */
    public void setOperatorInfo(com.huawei.www.bme.cbsinterface.cbscommon.OperatorInfo operatorInfo) {
        this.operatorInfo = operatorInfo;
    }


    /**
     * Gets the accessMode value for this RequestHeader.
     * 
     * @return accessMode
     */
    public java.lang.String getAccessMode() {
        return accessMode;
    }


    /**
     * Sets the accessMode value for this RequestHeader.
     * 
     * @param accessMode
     */
    public void setAccessMode(java.lang.String accessMode) {
        this.accessMode = accessMode;
    }


    /**
     * Gets the msgLanguageCode value for this RequestHeader.
     * 
     * @return msgLanguageCode   * It is used to specify the language of description in returen
     * message.
     */
    public java.lang.String getMsgLanguageCode() {
        return msgLanguageCode;
    }


    /**
     * Sets the msgLanguageCode value for this RequestHeader.
     * 
     * @param msgLanguageCode   * It is used to specify the language of description in returen
     * message.
     */
    public void setMsgLanguageCode(java.lang.String msgLanguageCode) {
        this.msgLanguageCode = msgLanguageCode;
    }


    /**
     * Gets the timeFormat value for this RequestHeader.
     * 
     * @return timeFormat
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.RequestHeaderTimeFormat getTimeFormat() {
        return timeFormat;
    }


    /**
     * Sets the timeFormat value for this RequestHeader.
     * 
     * @param timeFormat
     */
    public void setTimeFormat(com.huawei.www.bme.cbsinterface.cbscommon.RequestHeaderTimeFormat timeFormat) {
        this.timeFormat = timeFormat;
    }


    /**
     * Gets the additionalProperty value for this RequestHeader.
     * 
     * @return additionalProperty   * Reserved for future extention
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.RequestHeaderAdditionalProperty[] getAdditionalProperty() {
        return additionalProperty;
    }


    /**
     * Sets the additionalProperty value for this RequestHeader.
     * 
     * @param additionalProperty   * Reserved for future extention
     */
    public void setAdditionalProperty(com.huawei.www.bme.cbsinterface.cbscommon.RequestHeaderAdditionalProperty[] additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public com.huawei.www.bme.cbsinterface.cbscommon.RequestHeaderAdditionalProperty getAdditionalProperty(int i) {
        return this.additionalProperty[i];
    }

    public void setAdditionalProperty(int i, com.huawei.www.bme.cbsinterface.cbscommon.RequestHeaderAdditionalProperty _value) {
        this.additionalProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestHeader)) return false;
        RequestHeader other = (RequestHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.businessCode==null && other.getBusinessCode()==null) || 
             (this.businessCode!=null &&
              this.businessCode.equals(other.getBusinessCode()))) &&
            ((this.messageSeq==null && other.getMessageSeq()==null) || 
             (this.messageSeq!=null &&
              this.messageSeq.equals(other.getMessageSeq()))) &&
            ((this.ownershipInfo==null && other.getOwnershipInfo()==null) || 
             (this.ownershipInfo!=null &&
              this.ownershipInfo.equals(other.getOwnershipInfo()))) &&
            ((this.accessSecurity==null && other.getAccessSecurity()==null) || 
             (this.accessSecurity!=null &&
              this.accessSecurity.equals(other.getAccessSecurity()))) &&
            ((this.operatorInfo==null && other.getOperatorInfo()==null) || 
             (this.operatorInfo!=null &&
              this.operatorInfo.equals(other.getOperatorInfo()))) &&
            ((this.accessMode==null && other.getAccessMode()==null) || 
             (this.accessMode!=null &&
              this.accessMode.equals(other.getAccessMode()))) &&
            ((this.msgLanguageCode==null && other.getMsgLanguageCode()==null) || 
             (this.msgLanguageCode!=null &&
              this.msgLanguageCode.equals(other.getMsgLanguageCode()))) &&
            ((this.timeFormat==null && other.getTimeFormat()==null) || 
             (this.timeFormat!=null &&
              this.timeFormat.equals(other.getTimeFormat()))) &&
            ((this.additionalProperty==null && other.getAdditionalProperty()==null) || 
             (this.additionalProperty!=null &&
              java.util.Arrays.equals(this.additionalProperty, other.getAdditionalProperty())));
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getBusinessCode() != null) {
            _hashCode += getBusinessCode().hashCode();
        }
        if (getMessageSeq() != null) {
            _hashCode += getMessageSeq().hashCode();
        }
        if (getOwnershipInfo() != null) {
            _hashCode += getOwnershipInfo().hashCode();
        }
        if (getAccessSecurity() != null) {
            _hashCode += getAccessSecurity().hashCode();
        }
        if (getOperatorInfo() != null) {
            _hashCode += getOperatorInfo().hashCode();
        }
        if (getAccessMode() != null) {
            _hashCode += getAccessMode().hashCode();
        }
        if (getMsgLanguageCode() != null) {
            _hashCode += getMsgLanguageCode().hashCode();
        }
        if (getTimeFormat() != null) {
            _hashCode += getTimeFormat().hashCode();
        }
        if (getAdditionalProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalProperty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "RequestHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "BusinessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "MessageSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownershipInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "OwnershipInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "OwnershipInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessSecurity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "AccessSecurity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "SecurityInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "OperatorInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "OperatorInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "AccessMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgLanguageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "MsgLanguageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "TimeFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", ">RequestHeader>TimeFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "AdditionalProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", ">RequestHeader>AdditionalProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
