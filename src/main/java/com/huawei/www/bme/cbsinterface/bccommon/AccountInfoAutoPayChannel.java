/**
 * AccountInfoAutoPayChannel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class AccountInfoAutoPayChannel  implements java.io.Serializable {
    private java.lang.String autoPayChannelKey;

    private com.huawei.www.bme.cbsinterface.bccommon.AccountInfoAutoPayChannelAutoPayChannelInfo autoPayChannelInfo;

    public AccountInfoAutoPayChannel() {
    }

    public AccountInfoAutoPayChannel(
           java.lang.String autoPayChannelKey,
           com.huawei.www.bme.cbsinterface.bccommon.AccountInfoAutoPayChannelAutoPayChannelInfo autoPayChannelInfo) {
           this.autoPayChannelKey = autoPayChannelKey;
           this.autoPayChannelInfo = autoPayChannelInfo;
    }


    /**
     * Gets the autoPayChannelKey value for this AccountInfoAutoPayChannel.
     * 
     * @return autoPayChannelKey
     */
    public java.lang.String getAutoPayChannelKey() {
        return autoPayChannelKey;
    }


    /**
     * Sets the autoPayChannelKey value for this AccountInfoAutoPayChannel.
     * 
     * @param autoPayChannelKey
     */
    public void setAutoPayChannelKey(java.lang.String autoPayChannelKey) {
        this.autoPayChannelKey = autoPayChannelKey;
    }


    /**
     * Gets the autoPayChannelInfo value for this AccountInfoAutoPayChannel.
     * 
     * @return autoPayChannelInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.AccountInfoAutoPayChannelAutoPayChannelInfo getAutoPayChannelInfo() {
        return autoPayChannelInfo;
    }


    /**
     * Sets the autoPayChannelInfo value for this AccountInfoAutoPayChannel.
     * 
     * @param autoPayChannelInfo
     */
    public void setAutoPayChannelInfo(com.huawei.www.bme.cbsinterface.bccommon.AccountInfoAutoPayChannelAutoPayChannelInfo autoPayChannelInfo) {
        this.autoPayChannelInfo = autoPayChannelInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountInfoAutoPayChannel)) return false;
        AccountInfoAutoPayChannel other = (AccountInfoAutoPayChannel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoPayChannelKey==null && other.getAutoPayChannelKey()==null) || 
             (this.autoPayChannelKey!=null &&
              this.autoPayChannelKey.equals(other.getAutoPayChannelKey()))) &&
            ((this.autoPayChannelInfo==null && other.getAutoPayChannelInfo()==null) || 
             (this.autoPayChannelInfo!=null &&
              this.autoPayChannelInfo.equals(other.getAutoPayChannelInfo())));
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
        if (getAutoPayChannelKey() != null) {
            _hashCode += getAutoPayChannelKey().hashCode();
        }
        if (getAutoPayChannelInfo() != null) {
            _hashCode += getAutoPayChannelInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountInfoAutoPayChannel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">AccountInfo>AutoPayChannel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPayChannelKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AutoPayChannelKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPayChannelInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AutoPayChannelInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">>AccountInfo>AutoPayChannel>AutoPayChannelInfo"));
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
