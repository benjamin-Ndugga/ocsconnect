/**
 * ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey oldOfferingKey;

    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey newOfferingKey;

    public ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering() {
    }

    public ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey oldOfferingKey,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey newOfferingKey) {
           this.oldOfferingKey = oldOfferingKey;
           this.newOfferingKey = newOfferingKey;
    }


    /**
     * Gets the oldOfferingKey value for this ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering.
     * 
     * @return oldOfferingKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOldOfferingKey() {
        return oldOfferingKey;
    }


    /**
     * Sets the oldOfferingKey value for this ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering.
     * 
     * @param oldOfferingKey
     */
    public void setOldOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey oldOfferingKey) {
        this.oldOfferingKey = oldOfferingKey;
    }


    /**
     * Gets the newOfferingKey value for this ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering.
     * 
     * @return newOfferingKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getNewOfferingKey() {
        return newOfferingKey;
    }


    /**
     * Sets the newOfferingKey value for this ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering.
     * 
     * @param newOfferingKey
     */
    public void setNewOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey newOfferingKey) {
        this.newOfferingKey = newOfferingKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering)) return false;
        ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering other = (ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldOfferingKey==null && other.getOldOfferingKey()==null) || 
             (this.oldOfferingKey!=null &&
              this.oldOfferingKey.equals(other.getOldOfferingKey()))) &&
            ((this.newOfferingKey==null && other.getNewOfferingKey()==null) || 
             (this.newOfferingKey!=null &&
              this.newOfferingKey.equals(other.getNewOfferingKey())));
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
        if (getOldOfferingKey() != null) {
            _hashCode += getOldOfferingKey().hashCode();
        }
        if (getNewOfferingKey() != null) {
            _hashCode += getNewOfferingKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubOwnershipRequest>NewOwnership>SupplementaryOffering>ShiftOffering"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldOfferingKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldOfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newOfferingKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewOfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setNillable(true);
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
