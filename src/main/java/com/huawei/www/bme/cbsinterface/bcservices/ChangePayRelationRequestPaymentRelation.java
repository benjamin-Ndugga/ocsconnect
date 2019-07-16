/**
 * ChangePayRelationRequestPaymentRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangePayRelationRequestPaymentRelation  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationAddPayRelation addPayRelation;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationDelPayRelation[] delPayRelation;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationModPayRelation modPayRelation;

    public ChangePayRelationRequestPaymentRelation() {
    }

    public ChangePayRelationRequestPaymentRelation(
           com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationAddPayRelation addPayRelation,
           com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationDelPayRelation[] delPayRelation,
           com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationModPayRelation modPayRelation) {
           this.addPayRelation = addPayRelation;
           this.delPayRelation = delPayRelation;
           this.modPayRelation = modPayRelation;
    }


    /**
     * Gets the addPayRelation value for this ChangePayRelationRequestPaymentRelation.
     * 
     * @return addPayRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationAddPayRelation getAddPayRelation() {
        return addPayRelation;
    }


    /**
     * Sets the addPayRelation value for this ChangePayRelationRequestPaymentRelation.
     * 
     * @param addPayRelation
     */
    public void setAddPayRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationAddPayRelation addPayRelation) {
        this.addPayRelation = addPayRelation;
    }


    /**
     * Gets the delPayRelation value for this ChangePayRelationRequestPaymentRelation.
     * 
     * @return delPayRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationDelPayRelation[] getDelPayRelation() {
        return delPayRelation;
    }


    /**
     * Sets the delPayRelation value for this ChangePayRelationRequestPaymentRelation.
     * 
     * @param delPayRelation
     */
    public void setDelPayRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationDelPayRelation[] delPayRelation) {
        this.delPayRelation = delPayRelation;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationDelPayRelation getDelPayRelation(int i) {
        return this.delPayRelation[i];
    }

    public void setDelPayRelation(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationDelPayRelation _value) {
        this.delPayRelation[i] = _value;
    }


    /**
     * Gets the modPayRelation value for this ChangePayRelationRequestPaymentRelation.
     * 
     * @return modPayRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationModPayRelation getModPayRelation() {
        return modPayRelation;
    }


    /**
     * Sets the modPayRelation value for this ChangePayRelationRequestPaymentRelation.
     * 
     * @param modPayRelation
     */
    public void setModPayRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestPaymentRelationModPayRelation modPayRelation) {
        this.modPayRelation = modPayRelation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePayRelationRequestPaymentRelation)) return false;
        ChangePayRelationRequestPaymentRelation other = (ChangePayRelationRequestPaymentRelation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addPayRelation==null && other.getAddPayRelation()==null) || 
             (this.addPayRelation!=null &&
              this.addPayRelation.equals(other.getAddPayRelation()))) &&
            ((this.delPayRelation==null && other.getDelPayRelation()==null) || 
             (this.delPayRelation!=null &&
              java.util.Arrays.equals(this.delPayRelation, other.getDelPayRelation()))) &&
            ((this.modPayRelation==null && other.getModPayRelation()==null) || 
             (this.modPayRelation!=null &&
              this.modPayRelation.equals(other.getModPayRelation())));
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
        if (getAddPayRelation() != null) {
            _hashCode += getAddPayRelation().hashCode();
        }
        if (getDelPayRelation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelPayRelation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelPayRelation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModPayRelation() != null) {
            _hashCode += getModPayRelation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePayRelationRequestPaymentRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangePayRelationRequest>PaymentRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addPayRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddPayRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangePayRelationRequest>PaymentRelation>AddPayRelation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delPayRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelPayRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangePayRelationRequest>PaymentRelation>DelPayRelation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modPayRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModPayRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangePayRelationRequest>PaymentRelation>ModPayRelation"));
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
