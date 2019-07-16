/**
 * ChangeGroupMemberOfferingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeGroupMemberOfferingRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode;

    private com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestAddOffering[] addOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestDelOffering[] delOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestModifyOffering[] modifyOffering;

    public ChangeGroupMemberOfferingRequest() {
    }

    public ChangeGroupMemberOfferingRequest(
           com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode,
           com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestAddOffering[] addOffering,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestDelOffering[] delOffering,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestModifyOffering[] modifyOffering) {
           this.subGroupAccessCode = subGroupAccessCode;
           this.subAccessCode = subAccessCode;
           this.addOffering = addOffering;
           this.delOffering = delOffering;
           this.modifyOffering = modifyOffering;
    }


    /**
     * Gets the subGroupAccessCode value for this ChangeGroupMemberOfferingRequest.
     * 
     * @return subGroupAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode getSubGroupAccessCode() {
        return subGroupAccessCode;
    }


    /**
     * Sets the subGroupAccessCode value for this ChangeGroupMemberOfferingRequest.
     * 
     * @param subGroupAccessCode
     */
    public void setSubGroupAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode) {
        this.subGroupAccessCode = subGroupAccessCode;
    }


    /**
     * Gets the subAccessCode value for this ChangeGroupMemberOfferingRequest.
     * 
     * @return subAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }


    /**
     * Sets the subAccessCode value for this ChangeGroupMemberOfferingRequest.
     * 
     * @param subAccessCode
     */
    public void setSubAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }


    /**
     * Gets the addOffering value for this ChangeGroupMemberOfferingRequest.
     * 
     * @return addOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestAddOffering[] getAddOffering() {
        return addOffering;
    }


    /**
     * Sets the addOffering value for this ChangeGroupMemberOfferingRequest.
     * 
     * @param addOffering
     */
    public void setAddOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestAddOffering[] addOffering) {
        this.addOffering = addOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestAddOffering getAddOffering(int i) {
        return this.addOffering[i];
    }

    public void setAddOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestAddOffering _value) {
        this.addOffering[i] = _value;
    }


    /**
     * Gets the delOffering value for this ChangeGroupMemberOfferingRequest.
     * 
     * @return delOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestDelOffering[] getDelOffering() {
        return delOffering;
    }


    /**
     * Sets the delOffering value for this ChangeGroupMemberOfferingRequest.
     * 
     * @param delOffering
     */
    public void setDelOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestDelOffering[] delOffering) {
        this.delOffering = delOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestDelOffering getDelOffering(int i) {
        return this.delOffering[i];
    }

    public void setDelOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestDelOffering _value) {
        this.delOffering[i] = _value;
    }


    /**
     * Gets the modifyOffering value for this ChangeGroupMemberOfferingRequest.
     * 
     * @return modifyOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestModifyOffering[] getModifyOffering() {
        return modifyOffering;
    }


    /**
     * Sets the modifyOffering value for this ChangeGroupMemberOfferingRequest.
     * 
     * @param modifyOffering
     */
    public void setModifyOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestModifyOffering[] modifyOffering) {
        this.modifyOffering = modifyOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestModifyOffering getModifyOffering(int i) {
        return this.modifyOffering[i];
    }

    public void setModifyOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestModifyOffering _value) {
        this.modifyOffering[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeGroupMemberOfferingRequest)) return false;
        ChangeGroupMemberOfferingRequest other = (ChangeGroupMemberOfferingRequest) obj;
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
            ((this.subAccessCode==null && other.getSubAccessCode()==null) || 
             (this.subAccessCode!=null &&
              this.subAccessCode.equals(other.getSubAccessCode()))) &&
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
        if (getSubAccessCode() != null) {
            _hashCode += getSubAccessCode().hashCode();
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
        new org.apache.axis.description.TypeDesc(ChangeGroupMemberOfferingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupMemberOfferingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGroupAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberOfferingRequest>AddOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberOfferingRequest>DelOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifyOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemberOfferingRequest>ModifyOffering"));
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
