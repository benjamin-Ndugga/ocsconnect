/**
 * ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel  implements java.io.Serializable {
    private java.lang.String oldAutoPayChannelKey;

    private java.lang.String newAutoPayChannelKey;

    public ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel() {
    }

    public ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel(
           java.lang.String oldAutoPayChannelKey,
           java.lang.String newAutoPayChannelKey) {
           this.oldAutoPayChannelKey = oldAutoPayChannelKey;
           this.newAutoPayChannelKey = newAutoPayChannelKey;
    }


    /**
     * Gets the oldAutoPayChannelKey value for this ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel.
     * 
     * @return oldAutoPayChannelKey
     */
    public java.lang.String getOldAutoPayChannelKey() {
        return oldAutoPayChannelKey;
    }


    /**
     * Sets the oldAutoPayChannelKey value for this ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel.
     * 
     * @param oldAutoPayChannelKey
     */
    public void setOldAutoPayChannelKey(java.lang.String oldAutoPayChannelKey) {
        this.oldAutoPayChannelKey = oldAutoPayChannelKey;
    }


    /**
     * Gets the newAutoPayChannelKey value for this ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel.
     * 
     * @return newAutoPayChannelKey
     */
    public java.lang.String getNewAutoPayChannelKey() {
        return newAutoPayChannelKey;
    }


    /**
     * Sets the newAutoPayChannelKey value for this ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel.
     * 
     * @param newAutoPayChannelKey
     */
    public void setNewAutoPayChannelKey(java.lang.String newAutoPayChannelKey) {
        this.newAutoPayChannelKey = newAutoPayChannelKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel)) return false;
        ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel other = (ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldAutoPayChannelKey==null && other.getOldAutoPayChannelKey()==null) || 
             (this.oldAutoPayChannelKey!=null &&
              this.oldAutoPayChannelKey.equals(other.getOldAutoPayChannelKey()))) &&
            ((this.newAutoPayChannelKey==null && other.getNewAutoPayChannelKey()==null) || 
             (this.newAutoPayChannelKey!=null &&
              this.newAutoPayChannelKey.equals(other.getNewAutoPayChannelKey())));
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
        if (getOldAutoPayChannelKey() != null) {
            _hashCode += getOldAutoPayChannelKey().hashCode();
        }
        if (getNewAutoPayChannelKey() != null) {
            _hashCode += getNewAutoPayChannelKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeAcctOwnershipRequest>NewOwnership>Account>AutoPayChannel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldAutoPayChannelKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldAutoPayChannelKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAutoPayChannelKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewAutoPayChannelKey"));
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
