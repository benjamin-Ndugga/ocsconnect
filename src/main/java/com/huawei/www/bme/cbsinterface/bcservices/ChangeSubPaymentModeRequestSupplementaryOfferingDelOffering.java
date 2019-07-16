/**
 * ChangeSubPaymentModeRequestSupplementaryOfferingDelOffering.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubPaymentModeRequestSupplementaryOfferingDelOffering  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    private com.huawei.www.bme.cbsinterface.bccommon.OfferingOwner offeringOwner;

    public ChangeSubPaymentModeRequestSupplementaryOfferingDelOffering() {
    }

    public ChangeSubPaymentModeRequestSupplementaryOfferingDelOffering(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingOwner offeringOwner) {
           this.offeringKey = offeringKey;
           this.offeringOwner = offeringOwner;
    }


    /**
     * Gets the offeringKey value for this ChangeSubPaymentModeRequestSupplementaryOfferingDelOffering.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this ChangeSubPaymentModeRequestSupplementaryOfferingDelOffering.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the offeringOwner value for this ChangeSubPaymentModeRequestSupplementaryOfferingDelOffering.
     * 
     * @return offeringOwner
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingOwner getOfferingOwner() {
        return offeringOwner;
    }


    /**
     * Sets the offeringOwner value for this ChangeSubPaymentModeRequestSupplementaryOfferingDelOffering.
     * 
     * @param offeringOwner
     */
    public void setOfferingOwner(com.huawei.www.bme.cbsinterface.bccommon.OfferingOwner offeringOwner) {
        this.offeringOwner = offeringOwner;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubPaymentModeRequestSupplementaryOfferingDelOffering)) return false;
        ChangeSubPaymentModeRequestSupplementaryOfferingDelOffering other = (ChangeSubPaymentModeRequestSupplementaryOfferingDelOffering) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offeringKey==null && other.getOfferingKey()==null) || 
             (this.offeringKey!=null &&
              this.offeringKey.equals(other.getOfferingKey()))) &&
            ((this.offeringOwner==null && other.getOfferingOwner()==null) || 
             (this.offeringOwner!=null &&
              this.offeringOwner.equals(other.getOfferingOwner())));
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
        if (getOfferingKey() != null) {
            _hashCode += getOfferingKey().hashCode();
        }
        if (getOfferingOwner() != null) {
            _hashCode += getOfferingOwner().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubPaymentModeRequestSupplementaryOfferingDelOffering.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubPaymentModeRequest>SupplementaryOffering>DelOffering"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingOwner"));
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
