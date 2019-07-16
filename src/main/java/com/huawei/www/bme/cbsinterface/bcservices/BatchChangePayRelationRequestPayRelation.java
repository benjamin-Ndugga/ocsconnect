/**
 * BatchChangePayRelationRequestPayRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchChangePayRelationRequestPayRelation  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelation[] addPayRelation;

    private com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationModPayRelation[] modPayRelation;

    public BatchChangePayRelationRequestPayRelation() {
    }

    public BatchChangePayRelationRequestPayRelation(
           com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelation[] addPayRelation,
           com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationModPayRelation[] modPayRelation) {
           this.addPayRelation = addPayRelation;
           this.modPayRelation = modPayRelation;
    }


    /**
     * Gets the addPayRelation value for this BatchChangePayRelationRequestPayRelation.
     * 
     * @return addPayRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelation[] getAddPayRelation() {
        return addPayRelation;
    }


    /**
     * Sets the addPayRelation value for this BatchChangePayRelationRequestPayRelation.
     * 
     * @param addPayRelation
     */
    public void setAddPayRelation(com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelation[] addPayRelation) {
        this.addPayRelation = addPayRelation;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelation getAddPayRelation(int i) {
        return this.addPayRelation[i];
    }

    public void setAddPayRelation(int i, com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelation _value) {
        this.addPayRelation[i] = _value;
    }


    /**
     * Gets the modPayRelation value for this BatchChangePayRelationRequestPayRelation.
     * 
     * @return modPayRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationModPayRelation[] getModPayRelation() {
        return modPayRelation;
    }


    /**
     * Sets the modPayRelation value for this BatchChangePayRelationRequestPayRelation.
     * 
     * @param modPayRelation
     */
    public void setModPayRelation(com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationModPayRelation[] modPayRelation) {
        this.modPayRelation = modPayRelation;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationModPayRelation getModPayRelation(int i) {
        return this.modPayRelation[i];
    }

    public void setModPayRelation(int i, com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationModPayRelation _value) {
        this.modPayRelation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchChangePayRelationRequestPayRelation)) return false;
        BatchChangePayRelationRequestPayRelation other = (BatchChangePayRelationRequestPayRelation) obj;
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
              java.util.Arrays.equals(this.addPayRelation, other.getAddPayRelation()))) &&
            ((this.modPayRelation==null && other.getModPayRelation()==null) || 
             (this.modPayRelation!=null &&
              java.util.Arrays.equals(this.modPayRelation, other.getModPayRelation())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddPayRelation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddPayRelation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModPayRelation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModPayRelation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModPayRelation(), i);
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
        new org.apache.axis.description.TypeDesc(BatchChangePayRelationRequestPayRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangePayRelationRequest>PayRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addPayRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddPayRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangePayRelationRequest>PayRelation>AddPayRelation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modPayRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModPayRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangePayRelationRequest>PayRelation>ModPayRelation"));
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
