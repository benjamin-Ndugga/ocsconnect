/**
 * ChangeRscRelationRequestRscRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeRscRelationRequestRscRelation  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.RscRelation addRelation;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationDelRelation[] delRelation;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelation modRelation;

    public ChangeRscRelationRequestRscRelation() {
    }

    public ChangeRscRelationRequestRscRelation(
           com.huawei.www.bme.cbsinterface.bccommon.RscRelation addRelation,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationDelRelation[] delRelation,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelation modRelation) {
           this.addRelation = addRelation;
           this.delRelation = delRelation;
           this.modRelation = modRelation;
    }


    /**
     * Gets the addRelation value for this ChangeRscRelationRequestRscRelation.
     * 
     * @return addRelation
     */
    public com.huawei.www.bme.cbsinterface.bccommon.RscRelation getAddRelation() {
        return addRelation;
    }


    /**
     * Sets the addRelation value for this ChangeRscRelationRequestRscRelation.
     * 
     * @param addRelation
     */
    public void setAddRelation(com.huawei.www.bme.cbsinterface.bccommon.RscRelation addRelation) {
        this.addRelation = addRelation;
    }


    /**
     * Gets the delRelation value for this ChangeRscRelationRequestRscRelation.
     * 
     * @return delRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationDelRelation[] getDelRelation() {
        return delRelation;
    }


    /**
     * Sets the delRelation value for this ChangeRscRelationRequestRscRelation.
     * 
     * @param delRelation
     */
    public void setDelRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationDelRelation[] delRelation) {
        this.delRelation = delRelation;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationDelRelation getDelRelation(int i) {
        return this.delRelation[i];
    }

    public void setDelRelation(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationDelRelation _value) {
        this.delRelation[i] = _value;
    }


    /**
     * Gets the modRelation value for this ChangeRscRelationRequestRscRelation.
     * 
     * @return modRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelation getModRelation() {
        return modRelation;
    }


    /**
     * Sets the modRelation value for this ChangeRscRelationRequestRscRelation.
     * 
     * @param modRelation
     */
    public void setModRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelation modRelation) {
        this.modRelation = modRelation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeRscRelationRequestRscRelation)) return false;
        ChangeRscRelationRequestRscRelation other = (ChangeRscRelationRequestRscRelation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addRelation==null && other.getAddRelation()==null) || 
             (this.addRelation!=null &&
              this.addRelation.equals(other.getAddRelation()))) &&
            ((this.delRelation==null && other.getDelRelation()==null) || 
             (this.delRelation!=null &&
              java.util.Arrays.equals(this.delRelation, other.getDelRelation()))) &&
            ((this.modRelation==null && other.getModRelation()==null) || 
             (this.modRelation!=null &&
              this.modRelation.equals(other.getModRelation())));
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
        if (getAddRelation() != null) {
            _hashCode += getAddRelation().hashCode();
        }
        if (getDelRelation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelRelation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelRelation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModRelation() != null) {
            _hashCode += getModRelation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeRscRelationRequestRscRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeRscRelationRequest>RscRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "RscRelation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeRscRelationRequest>RscRelation>DelRelation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeRscRelationRequest>RscRelation>ModRelation"));
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
