/**
 * SubActivationRequestOfferingInstOfferingKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class SubActivationRequestOfferingInstOfferingKey  extends com.huawei.www.bme.cbsinterface.bccommon.OfferingKey  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingOwner offeringOwner;

    public SubActivationRequestOfferingInstOfferingKey() {
    }

    public SubActivationRequestOfferingInstOfferingKey(
           java.math.BigInteger offeringID,
           java.lang.String offeringCode,
           java.lang.String purchaseSeq,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingOwner offeringOwner) {
        super(
            offeringID,
            offeringCode,
            purchaseSeq);
        this.offeringOwner = offeringOwner;
    }


    /**
     * Gets the offeringOwner value for this SubActivationRequestOfferingInstOfferingKey.
     * 
     * @return offeringOwner
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingOwner getOfferingOwner() {
        return offeringOwner;
    }


    /**
     * Sets the offeringOwner value for this SubActivationRequestOfferingInstOfferingKey.
     * 
     * @param offeringOwner
     */
    public void setOfferingOwner(com.huawei.www.bme.cbsinterface.bccommon.OfferingOwner offeringOwner) {
        this.offeringOwner = offeringOwner;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubActivationRequestOfferingInstOfferingKey)) return false;
        SubActivationRequestOfferingInstOfferingKey other = (SubActivationRequestOfferingInstOfferingKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
        int _hashCode = super.hashCode();
        if (getOfferingOwner() != null) {
            _hashCode += getOfferingOwner().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubActivationRequestOfferingInstOfferingKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>SubActivationRequest>OfferingInst>OfferingKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
