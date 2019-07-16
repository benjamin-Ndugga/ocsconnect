/**
 * ResultHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbscommon;

public class ResultHeader  implements java.io.Serializable {
    /* Version ID of CBS interface */
    private java.lang.String version;

    /* 0: success                              Other values: failure
     * code */
    private java.lang.String resultCode;

    /* It is used to specify the language of description in returen
     * message. */
    private java.lang.String msgLanguageCode;

    /* The brief description of result code. */
    private java.lang.String resultDesc;

    /* Reserved for future extention */
    private com.huawei.www.bme.cbsinterface.cbscommon.ResultHeaderAdditionalProperty[] additionalProperty;

    public ResultHeader() {
    }

    public ResultHeader(
           java.lang.String version,
           java.lang.String resultCode,
           java.lang.String msgLanguageCode,
           java.lang.String resultDesc,
           com.huawei.www.bme.cbsinterface.cbscommon.ResultHeaderAdditionalProperty[] additionalProperty) {
           this.version = version;
           this.resultCode = resultCode;
           this.msgLanguageCode = msgLanguageCode;
           this.resultDesc = resultDesc;
           this.additionalProperty = additionalProperty;
    }


    /**
     * Gets the version value for this ResultHeader.
     * 
     * @return version   * Version ID of CBS interface
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ResultHeader.
     * 
     * @param version   * Version ID of CBS interface
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the resultCode value for this ResultHeader.
     * 
     * @return resultCode   * 0: success                              Other values: failure
     * code
     */
    public java.lang.String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this ResultHeader.
     * 
     * @param resultCode   * 0: success                              Other values: failure
     * code
     */
    public void setResultCode(java.lang.String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the msgLanguageCode value for this ResultHeader.
     * 
     * @return msgLanguageCode   * It is used to specify the language of description in returen
     * message.
     */
    public java.lang.String getMsgLanguageCode() {
        return msgLanguageCode;
    }


    /**
     * Sets the msgLanguageCode value for this ResultHeader.
     * 
     * @param msgLanguageCode   * It is used to specify the language of description in returen
     * message.
     */
    public void setMsgLanguageCode(java.lang.String msgLanguageCode) {
        this.msgLanguageCode = msgLanguageCode;
    }


    /**
     * Gets the resultDesc value for this ResultHeader.
     * 
     * @return resultDesc   * The brief description of result code.
     */
    public java.lang.String getResultDesc() {
        return resultDesc;
    }


    /**
     * Sets the resultDesc value for this ResultHeader.
     * 
     * @param resultDesc   * The brief description of result code.
     */
    public void setResultDesc(java.lang.String resultDesc) {
        this.resultDesc = resultDesc;
    }


    /**
     * Gets the additionalProperty value for this ResultHeader.
     * 
     * @return additionalProperty   * Reserved for future extention
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.ResultHeaderAdditionalProperty[] getAdditionalProperty() {
        return additionalProperty;
    }


    /**
     * Sets the additionalProperty value for this ResultHeader.
     * 
     * @param additionalProperty   * Reserved for future extention
     */
    public void setAdditionalProperty(com.huawei.www.bme.cbsinterface.cbscommon.ResultHeaderAdditionalProperty[] additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public com.huawei.www.bme.cbsinterface.cbscommon.ResultHeaderAdditionalProperty getAdditionalProperty(int i) {
        return this.additionalProperty[i];
    }

    public void setAdditionalProperty(int i, com.huawei.www.bme.cbsinterface.cbscommon.ResultHeaderAdditionalProperty _value) {
        this.additionalProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultHeader)) return false;
        ResultHeader other = (ResultHeader) obj;
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
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.msgLanguageCode==null && other.getMsgLanguageCode()==null) || 
             (this.msgLanguageCode!=null &&
              this.msgLanguageCode.equals(other.getMsgLanguageCode()))) &&
            ((this.resultDesc==null && other.getResultDesc()==null) || 
             (this.resultDesc!=null &&
              this.resultDesc.equals(other.getResultDesc()))) &&
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
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getMsgLanguageCode() != null) {
            _hashCode += getMsgLanguageCode().hashCode();
        }
        if (getResultDesc() != null) {
            _hashCode += getResultDesc().hashCode();
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
        new org.apache.axis.description.TypeDesc(ResultHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "ResultHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "ResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("resultDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "ResultDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "AdditionalProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", ">ResultHeader>AdditionalProperty"));
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
