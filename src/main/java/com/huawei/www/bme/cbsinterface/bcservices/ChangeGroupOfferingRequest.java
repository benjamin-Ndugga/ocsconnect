/**
 * ChangeGroupOfferingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeGroupOfferingRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestPrimaryOffering primaryOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestAddOffering[] addOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestDelOffering[] delOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestModifyOffering[] modifyOffering;

    public ChangeGroupOfferingRequest() {
    }

    public ChangeGroupOfferingRequest(
           com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestPrimaryOffering primaryOffering,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestAddOffering[] addOffering,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestDelOffering[] delOffering,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestModifyOffering[] modifyOffering) {
           this.subGroupAccessCode = subGroupAccessCode;
           this.primaryOffering = primaryOffering;
           this.addOffering = addOffering;
           this.delOffering = delOffering;
           this.modifyOffering = modifyOffering;
    }


    /**
     * Gets the subGroupAccessCode value for this ChangeGroupOfferingRequest.
     * 
     * @return subGroupAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode getSubGroupAccessCode() {
        return subGroupAccessCode;
    }


    /**
     * Sets the subGroupAccessCode value for this ChangeGroupOfferingRequest.
     * 
     * @param subGroupAccessCode
     */
    public void setSubGroupAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode) {
        this.subGroupAccessCode = subGroupAccessCode;
    }


    /**
     * Gets the primaryOffering value for this ChangeGroupOfferingRequest.
     * 
     * @return primaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestPrimaryOffering getPrimaryOffering() {
        return primaryOffering;
    }


    /**
     * Sets the primaryOffering value for this ChangeGroupOfferingRequest.
     * 
     * @param primaryOffering
     */
    public void setPrimaryOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestPrimaryOffering primaryOffering) {
        this.primaryOffering = primaryOffering;
    }


    /**
     * Gets the addOffering value for this ChangeGroupOfferingRequest.
     * 
     * @return addOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestAddOffering[] getAddOffering() {
        return addOffering;
    }


    /**
     * Sets the addOffering value for this ChangeGroupOfferingRequest.
     * 
     * @param addOffering
     */
    public void setAddOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestAddOffering[] addOffering) {
        this.addOffering = addOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestAddOffering getAddOffering(int i) {
        return this.addOffering[i];
    }

    public void setAddOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestAddOffering _value) {
        this.addOffering[i] = _value;
    }


    /**
     * Gets the delOffering value for this ChangeGroupOfferingRequest.
     * 
     * @return delOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestDelOffering[] getDelOffering() {
        return delOffering;
    }


    /**
     * Sets the delOffering value for this ChangeGroupOfferingRequest.
     * 
     * @param delOffering
     */
    public void setDelOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestDelOffering[] delOffering) {
        this.delOffering = delOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestDelOffering getDelOffering(int i) {
        return this.delOffering[i];
    }

    public void setDelOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestDelOffering _value) {
        this.delOffering[i] = _value;
    }


    /**
     * Gets the modifyOffering value for this ChangeGroupOfferingRequest.
     * 
     * @return modifyOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestModifyOffering[] getModifyOffering() {
        return modifyOffering;
    }


    /**
     * Sets the modifyOffering value for this ChangeGroupOfferingRequest.
     * 
     * @param modifyOffering
     */
    public void setModifyOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestModifyOffering[] modifyOffering) {
        this.modifyOffering = modifyOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestModifyOffering getModifyOffering(int i) {
        return this.modifyOffering[i];
    }

    public void setModifyOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestModifyOffering _value) {
        this.modifyOffering[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeGroupOfferingRequest)) return false;
        ChangeGroupOfferingRequest other = (ChangeGroupOfferingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subGroupAccessCode==null && other.getSubGroupAccessCode()==null) || 
             (this.subGroupAccessCode!=null &&
              this.subGroupAccessCode.equals(other.getSubGroupAccessCode()))) &&
            ((this.primaryOffering==null && other.getPrimaryOffering()==null) || 
             (this.primaryOffering!=null &&
              this.primaryOffering.equals(other.getPrimaryOffering()))) &&
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
        if (getSubGroupAccessCode() != null) {
            _hashCode += getSubGroupAccessCode().hashCode();
        }
        if (getPrimaryOffering() != null) {
            _hashCode += getPrimaryOffering().hashCode();
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
        new org.apache.axis.description.TypeDesc(ChangeGroupOfferingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupOfferingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGroupAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrimaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOfferingRequest>PrimaryOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOfferingRequest>AddOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOfferingRequest>DelOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifyOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOfferingRequest>ModifyOffering"));
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
