/**
 * ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering[] shiftOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingDelOffering[] delOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingAddOffering[] addOffering;

    public ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering() {
    }

    public ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering[] shiftOffering,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingDelOffering[] delOffering,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingAddOffering[] addOffering) {
           this.shiftOffering = shiftOffering;
           this.delOffering = delOffering;
           this.addOffering = addOffering;
    }


    /**
     * Gets the shiftOffering value for this ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering.
     * 
     * @return shiftOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering[] getShiftOffering() {
        return shiftOffering;
    }


    /**
     * Sets the shiftOffering value for this ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering.
     * 
     * @param shiftOffering
     */
    public void setShiftOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering[] shiftOffering) {
        this.shiftOffering = shiftOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering getShiftOffering(int i) {
        return this.shiftOffering[i];
    }

    public void setShiftOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingShiftOffering _value) {
        this.shiftOffering[i] = _value;
    }


    /**
     * Gets the delOffering value for this ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering.
     * 
     * @return delOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingDelOffering[] getDelOffering() {
        return delOffering;
    }


    /**
     * Sets the delOffering value for this ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering.
     * 
     * @param delOffering
     */
    public void setDelOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingDelOffering[] delOffering) {
        this.delOffering = delOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingDelOffering getDelOffering(int i) {
        return this.delOffering[i];
    }

    public void setDelOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingDelOffering _value) {
        this.delOffering[i] = _value;
    }


    /**
     * Gets the addOffering value for this ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering.
     * 
     * @return addOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingAddOffering[] getAddOffering() {
        return addOffering;
    }


    /**
     * Sets the addOffering value for this ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering.
     * 
     * @param addOffering
     */
    public void setAddOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingAddOffering[] addOffering) {
        this.addOffering = addOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingAddOffering getAddOffering(int i) {
        return this.addOffering[i];
    }

    public void setAddOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOfferingAddOffering _value) {
        this.addOffering[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering)) return false;
        ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering other = (ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shiftOffering==null && other.getShiftOffering()==null) || 
             (this.shiftOffering!=null &&
              java.util.Arrays.equals(this.shiftOffering, other.getShiftOffering()))) &&
            ((this.delOffering==null && other.getDelOffering()==null) || 
             (this.delOffering!=null &&
              java.util.Arrays.equals(this.delOffering, other.getDelOffering()))) &&
            ((this.addOffering==null && other.getAddOffering()==null) || 
             (this.addOffering!=null &&
              java.util.Arrays.equals(this.addOffering, other.getAddOffering())));
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
        if (getShiftOffering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShiftOffering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShiftOffering(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDelOffering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelOffering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelOffering(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddOffering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddOffering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddOffering(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOwnershipRequest>NewOwnership>SupplementaryOffering"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shiftOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ShiftOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubOwnershipRequest>NewOwnership>SupplementaryOffering>ShiftOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubOwnershipRequest>NewOwnership>SupplementaryOffering>DelOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubOwnershipRequest>NewOwnership>SupplementaryOffering>AddOffering"));
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
