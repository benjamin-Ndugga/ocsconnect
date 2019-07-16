/**
 * ChangeAcctOwnershipRequestNewOwnershipSubscriberSubPayRelationShiftPayRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAcctOwnershipRequestNewOwnershipSubscriberSubPayRelationShiftPayRelation  implements java.io.Serializable {
    private java.lang.String oldPayRelationKey;

    private java.lang.String newPayRelationKey;

    public ChangeAcctOwnershipRequestNewOwnershipSubscriberSubPayRelationShiftPayRelation() {
    }

    public ChangeAcctOwnershipRequestNewOwnershipSubscriberSubPayRelationShiftPayRelation(
           java.lang.String oldPayRelationKey,
           java.lang.String newPayRelationKey) {
           this.oldPayRelationKey = oldPayRelationKey;
           this.newPayRelationKey = newPayRelationKey;
    }


    /**
     * Gets the oldPayRelationKey value for this ChangeAcctOwnershipRequestNewOwnershipSubscriberSubPayRelationShiftPayRelation.
     * 
     * @return oldPayRelationKey
     */
    public java.lang.String getOldPayRelationKey() {
        return oldPayRelationKey;
    }


    /**
     * Sets the oldPayRelationKey value for this ChangeAcctOwnershipRequestNewOwnershipSubscriberSubPayRelationShiftPayRelation.
     * 
     * @param oldPayRelationKey
     */
    public void setOldPayRelationKey(java.lang.String oldPayRelationKey) {
        this.oldPayRelationKey = oldPayRelationKey;
    }


    /**
     * Gets the newPayRelationKey value for this ChangeAcctOwnershipRequestNewOwnershipSubscriberSubPayRelationShiftPayRelation.
     * 
     * @return newPayRelationKey
     */
    public java.lang.String getNewPayRelationKey() {
        return newPayRelationKey;
    }


    /**
     * Sets the newPayRelationKey value for this ChangeAcctOwnershipRequestNewOwnershipSubscriberSubPayRelationShiftPayRelation.
     * 
     * @param newPayRelationKey
     */
    public void setNewPayRelationKey(java.lang.String newPayRelationKey) {
        this.newPayRelationKey = newPayRelationKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAcctOwnershipRequestNewOwnershipSubscriberSubPayRelationShiftPayRelation)) return false;
        ChangeAcctOwnershipRequestNewOwnershipSubscriberSubPayRelationShiftPayRelation other = (ChangeAcctOwnershipRequestNewOwnershipSubscriberSubPayRelationShiftPayRelation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldPayRelationKey==null && other.getOldPayRelationKey()==null) || 
             (this.oldPayRelationKey!=null &&
              this.oldPayRelationKey.equals(other.getOldPayRelationKey()))) &&
            ((this.newPayRelationKey==null && other.getNewPayRelationKey()==null) || 
             (this.newPayRelationKey!=null &&
              this.newPayRelationKey.equals(other.getNewPayRelationKey())));
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
        if (getOldPayRelationKey() != null) {
            _hashCode += getOldPayRelationKey().hashCode();
        }
        if (getNewPayRelationKey() != null) {
            _hashCode += getNewPayRelationKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeAcctOwnershipRequestNewOwnershipSubscriberSubPayRelationShiftPayRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>ChangeAcctOwnershipRequest>NewOwnership>Subscriber>SubPayRelation>ShiftPayRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPayRelationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldPayRelationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPayRelationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewPayRelationKey"));
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
