/**
 * ChangeSubOfferingRequestSupplementaryOfferingDelOffering.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubOfferingRequestSupplementaryOfferingDelOffering  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    /* 2014.12.12 create this node, and add property C_DELOFFER_REMOVEROURCE,
     * if value is 0.then not to delete free resource ; if value is 1, then
     * to delete free resource; if there is no this property, then not to
     * delete free resource. */
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequestSupplementaryOfferingDelOfferingAdditionalProperty[] additionalProperty;

    public ChangeSubOfferingRequestSupplementaryOfferingDelOffering() {
    }

    public ChangeSubOfferingRequestSupplementaryOfferingDelOffering(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequestSupplementaryOfferingDelOfferingAdditionalProperty[] additionalProperty) {
           this.offeringKey = offeringKey;
           this.additionalProperty = additionalProperty;
    }


    /**
     * Gets the offeringKey value for this ChangeSubOfferingRequestSupplementaryOfferingDelOffering.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this ChangeSubOfferingRequestSupplementaryOfferingDelOffering.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the additionalProperty value for this ChangeSubOfferingRequestSupplementaryOfferingDelOffering.
     * 
     * @return additionalProperty   * 2014.12.12 create this node, and add property C_DELOFFER_REMOVEROURCE,
     * if value is 0.then not to delete free resource ; if value is 1, then
     * to delete free resource; if there is no this property, then not to
     * delete free resource.
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequestSupplementaryOfferingDelOfferingAdditionalProperty[] getAdditionalProperty() {
        return additionalProperty;
    }


    /**
     * Sets the additionalProperty value for this ChangeSubOfferingRequestSupplementaryOfferingDelOffering.
     * 
     * @param additionalProperty   * 2014.12.12 create this node, and add property C_DELOFFER_REMOVEROURCE,
     * if value is 0.then not to delete free resource ; if value is 1, then
     * to delete free resource; if there is no this property, then not to
     * delete free resource.
     */
    public void setAdditionalProperty(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequestSupplementaryOfferingDelOfferingAdditionalProperty[] additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequestSupplementaryOfferingDelOfferingAdditionalProperty getAdditionalProperty(int i) {
        return this.additionalProperty[i];
    }

    public void setAdditionalProperty(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequestSupplementaryOfferingDelOfferingAdditionalProperty _value) {
        this.additionalProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubOfferingRequestSupplementaryOfferingDelOffering)) return false;
        ChangeSubOfferingRequestSupplementaryOfferingDelOffering other = (ChangeSubOfferingRequestSupplementaryOfferingDelOffering) obj;
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
        if (getOfferingKey() != null) {
            _hashCode += getOfferingKey().hashCode();
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
        new org.apache.axis.description.TypeDesc(ChangeSubOfferingRequestSupplementaryOfferingDelOffering.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOfferingRequest>SupplementaryOffering>DelOffering"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AdditionalProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubOfferingRequest>SupplementaryOffering>DelOffering>AdditionalProperty"));
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
