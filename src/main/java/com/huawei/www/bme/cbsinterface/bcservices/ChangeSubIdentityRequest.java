/**
 * ChangeSubIdentityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubIdentityRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestAddSubIdentity[] addSubIdentity;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestDelSubIdentity[] delSubIdentity;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestModifySubIdentity[] modifySubIdentity;

    public ChangeSubIdentityRequest() {
    }

    public ChangeSubIdentityRequest(
           com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestAddSubIdentity[] addSubIdentity,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestDelSubIdentity[] delSubIdentity,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestModifySubIdentity[] modifySubIdentity) {
           this.subAccessCode = subAccessCode;
           this.addSubIdentity = addSubIdentity;
           this.delSubIdentity = delSubIdentity;
           this.modifySubIdentity = modifySubIdentity;
    }


    /**
     * Gets the subAccessCode value for this ChangeSubIdentityRequest.
     * 
     * @return subAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }


    /**
     * Sets the subAccessCode value for this ChangeSubIdentityRequest.
     * 
     * @param subAccessCode
     */
    public void setSubAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }


    /**
     * Gets the addSubIdentity value for this ChangeSubIdentityRequest.
     * 
     * @return addSubIdentity
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestAddSubIdentity[] getAddSubIdentity() {
        return addSubIdentity;
    }


    /**
     * Sets the addSubIdentity value for this ChangeSubIdentityRequest.
     * 
     * @param addSubIdentity
     */
    public void setAddSubIdentity(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestAddSubIdentity[] addSubIdentity) {
        this.addSubIdentity = addSubIdentity;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestAddSubIdentity getAddSubIdentity(int i) {
        return this.addSubIdentity[i];
    }

    public void setAddSubIdentity(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestAddSubIdentity _value) {
        this.addSubIdentity[i] = _value;
    }


    /**
     * Gets the delSubIdentity value for this ChangeSubIdentityRequest.
     * 
     * @return delSubIdentity
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestDelSubIdentity[] getDelSubIdentity() {
        return delSubIdentity;
    }


    /**
     * Sets the delSubIdentity value for this ChangeSubIdentityRequest.
     * 
     * @param delSubIdentity
     */
    public void setDelSubIdentity(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestDelSubIdentity[] delSubIdentity) {
        this.delSubIdentity = delSubIdentity;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestDelSubIdentity getDelSubIdentity(int i) {
        return this.delSubIdentity[i];
    }

    public void setDelSubIdentity(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestDelSubIdentity _value) {
        this.delSubIdentity[i] = _value;
    }


    /**
     * Gets the modifySubIdentity value for this ChangeSubIdentityRequest.
     * 
     * @return modifySubIdentity
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestModifySubIdentity[] getModifySubIdentity() {
        return modifySubIdentity;
    }


    /**
     * Sets the modifySubIdentity value for this ChangeSubIdentityRequest.
     * 
     * @param modifySubIdentity
     */
    public void setModifySubIdentity(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestModifySubIdentity[] modifySubIdentity) {
        this.modifySubIdentity = modifySubIdentity;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestModifySubIdentity getModifySubIdentity(int i) {
        return this.modifySubIdentity[i];
    }

    public void setModifySubIdentity(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestModifySubIdentity _value) {
        this.modifySubIdentity[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubIdentityRequest)) return false;
        ChangeSubIdentityRequest other = (ChangeSubIdentityRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subAccessCode==null && other.getSubAccessCode()==null) || 
             (this.subAccessCode!=null &&
              this.subAccessCode.equals(other.getSubAccessCode()))) &&
            ((this.addSubIdentity==null && other.getAddSubIdentity()==null) || 
             (this.addSubIdentity!=null &&
              java.util.Arrays.equals(this.addSubIdentity, other.getAddSubIdentity()))) &&
            ((this.delSubIdentity==null && other.getDelSubIdentity()==null) || 
             (this.delSubIdentity!=null &&
              java.util.Arrays.equals(this.delSubIdentity, other.getDelSubIdentity()))) &&
            ((this.modifySubIdentity==null && other.getModifySubIdentity()==null) || 
             (this.modifySubIdentity!=null &&
              java.util.Arrays.equals(this.modifySubIdentity, other.getModifySubIdentity())));
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
        if (getSubAccessCode() != null) {
            _hashCode += getSubAccessCode().hashCode();
        }
        if (getAddSubIdentity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddSubIdentity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddSubIdentity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDelSubIdentity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelSubIdentity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelSubIdentity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModifySubIdentity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModifySubIdentity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModifySubIdentity(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeSubIdentityRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubIdentityRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addSubIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddSubIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubIdentityRequest>AddSubIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delSubIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelSubIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubIdentityRequest>DelSubIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifySubIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifySubIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubIdentityRequest>ModifySubIdentity"));
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
