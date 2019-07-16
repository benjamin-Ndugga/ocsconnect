/**
 * BatchChangeAcctOfferingRequestAcctOffering.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchChangeAcctOfferingRequestAcctOffering  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingAddOffering[] addOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingDelOffering[] delOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingModifyOffering[] modifyOffering;

    public BatchChangeAcctOfferingRequestAcctOffering() {
    }

    public BatchChangeAcctOfferingRequestAcctOffering(
           com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingAddOffering[] addOffering,
           com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingDelOffering[] delOffering,
           com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingModifyOffering[] modifyOffering) {
           this.addOffering = addOffering;
           this.delOffering = delOffering;
           this.modifyOffering = modifyOffering;
    }


    /**
     * Gets the addOffering value for this BatchChangeAcctOfferingRequestAcctOffering.
     * 
     * @return addOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingAddOffering[] getAddOffering() {
        return addOffering;
    }


    /**
     * Sets the addOffering value for this BatchChangeAcctOfferingRequestAcctOffering.
     * 
     * @param addOffering
     */
    public void setAddOffering(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingAddOffering[] addOffering) {
        this.addOffering = addOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingAddOffering getAddOffering(int i) {
        return this.addOffering[i];
    }

    public void setAddOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingAddOffering _value) {
        this.addOffering[i] = _value;
    }


    /**
     * Gets the delOffering value for this BatchChangeAcctOfferingRequestAcctOffering.
     * 
     * @return delOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingDelOffering[] getDelOffering() {
        return delOffering;
    }


    /**
     * Sets the delOffering value for this BatchChangeAcctOfferingRequestAcctOffering.
     * 
     * @param delOffering
     */
    public void setDelOffering(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingDelOffering[] delOffering) {
        this.delOffering = delOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingDelOffering getDelOffering(int i) {
        return this.delOffering[i];
    }

    public void setDelOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingDelOffering _value) {
        this.delOffering[i] = _value;
    }


    /**
     * Gets the modifyOffering value for this BatchChangeAcctOfferingRequestAcctOffering.
     * 
     * @return modifyOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingModifyOffering[] getModifyOffering() {
        return modifyOffering;
    }


    /**
     * Sets the modifyOffering value for this BatchChangeAcctOfferingRequestAcctOffering.
     * 
     * @param modifyOffering
     */
    public void setModifyOffering(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingModifyOffering[] modifyOffering) {
        this.modifyOffering = modifyOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingModifyOffering getModifyOffering(int i) {
        return this.modifyOffering[i];
    }

    public void setModifyOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOfferingModifyOffering _value) {
        this.modifyOffering[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchChangeAcctOfferingRequestAcctOffering)) return false;
        BatchChangeAcctOfferingRequestAcctOffering other = (BatchChangeAcctOfferingRequestAcctOffering) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addOffering==null && other.getAddOffering()==null) || 
             (this.addOffering!=null &&
              java.util.Arrays.equals(this.addOffering, other.getAddOffering()))) &&
            ((this.delOffering==null && other.getDelOffering()==null) || 
             (this.delOffering!=null &&
              java.util.Arrays.equals(this.delOffering, other.getDelOffering()))) &&
            ((this.modifyOffering==null && other.getModifyOffering()==null) || 
             (this.modifyOffering!=null &&
              java.util.Arrays.equals(this.modifyOffering, other.getModifyOffering())));
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
        if (getModifyOffering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModifyOffering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModifyOffering(), i);
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
        new org.apache.axis.description.TypeDesc(BatchChangeAcctOfferingRequestAcctOffering.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeAcctOfferingRequest>AcctOffering"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangeAcctOfferingRequest>AcctOffering>AddOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangeAcctOfferingRequest>AcctOffering>DelOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifyOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangeAcctOfferingRequest>AcctOffering>ModifyOffering"));
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
