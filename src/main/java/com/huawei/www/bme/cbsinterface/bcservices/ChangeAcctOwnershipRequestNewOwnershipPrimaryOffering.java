/**
 * ChangeAcctOwnershipRequestNewOwnershipPrimaryOffering.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAcctOwnershipRequestNewOwnershipPrimaryOffering  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey newOfferingKey;

    public ChangeAcctOwnershipRequestNewOwnershipPrimaryOffering() {
    }

    public ChangeAcctOwnershipRequestNewOwnershipPrimaryOffering(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey newOfferingKey) {
           this.newOfferingKey = newOfferingKey;
    }


    /**
     * Gets the newOfferingKey value for this ChangeAcctOwnershipRequestNewOwnershipPrimaryOffering.
     * 
     * @return newOfferingKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getNewOfferingKey() {
        return newOfferingKey;
    }


    /**
     * Sets the newOfferingKey value for this ChangeAcctOwnershipRequestNewOwnershipPrimaryOffering.
     * 
     * @param newOfferingKey
     */
    public void setNewOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey newOfferingKey) {
        this.newOfferingKey = newOfferingKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAcctOwnershipRequestNewOwnershipPrimaryOffering)) return false;
        ChangeAcctOwnershipRequestNewOwnershipPrimaryOffering other = (ChangeAcctOwnershipRequestNewOwnershipPrimaryOffering) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        if (getNewOfferingKey() != null) {
            _hashCode += getNewOfferingKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeAcctOwnershipRequestNewOwnershipPrimaryOffering.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctOwnershipRequest>NewOwnership>PrimaryOffering"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newOfferingKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewOfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
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
