/**
 * ChangeSubIdentityRequestModifySubIdentity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubIdentityRequestModifySubIdentity  implements java.io.Serializable {
    private java.lang.String oldSubIdentity;

    private java.lang.String oldSubIdentityType;

    private java.lang.String newSubIdentity;

    public ChangeSubIdentityRequestModifySubIdentity() {
    }

    public ChangeSubIdentityRequestModifySubIdentity(
           java.lang.String oldSubIdentity,
           java.lang.String oldSubIdentityType,
           java.lang.String newSubIdentity) {
           this.oldSubIdentity = oldSubIdentity;
           this.oldSubIdentityType = oldSubIdentityType;
           this.newSubIdentity = newSubIdentity;
    }


    /**
     * Gets the oldSubIdentity value for this ChangeSubIdentityRequestModifySubIdentity.
     * 
     * @return oldSubIdentity
     */
    public java.lang.String getOldSubIdentity() {
        return oldSubIdentity;
    }


    /**
     * Sets the oldSubIdentity value for this ChangeSubIdentityRequestModifySubIdentity.
     * 
     * @param oldSubIdentity
     */
    public void setOldSubIdentity(java.lang.String oldSubIdentity) {
        this.oldSubIdentity = oldSubIdentity;
    }


    /**
     * Gets the oldSubIdentityType value for this ChangeSubIdentityRequestModifySubIdentity.
     * 
     * @return oldSubIdentityType
     */
    public java.lang.String getOldSubIdentityType() {
        return oldSubIdentityType;
    }


    /**
     * Sets the oldSubIdentityType value for this ChangeSubIdentityRequestModifySubIdentity.
     * 
     * @param oldSubIdentityType
     */
    public void setOldSubIdentityType(java.lang.String oldSubIdentityType) {
        this.oldSubIdentityType = oldSubIdentityType;
    }


    /**
     * Gets the newSubIdentity value for this ChangeSubIdentityRequestModifySubIdentity.
     * 
     * @return newSubIdentity
     */
    public java.lang.String getNewSubIdentity() {
        return newSubIdentity;
    }


    /**
     * Sets the newSubIdentity value for this ChangeSubIdentityRequestModifySubIdentity.
     * 
     * @param newSubIdentity
     */
    public void setNewSubIdentity(java.lang.String newSubIdentity) {
        this.newSubIdentity = newSubIdentity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubIdentityRequestModifySubIdentity)) return false;
        ChangeSubIdentityRequestModifySubIdentity other = (ChangeSubIdentityRequestModifySubIdentity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldSubIdentity==null && other.getOldSubIdentity()==null) || 
             (this.oldSubIdentity!=null &&
              this.oldSubIdentity.equals(other.getOldSubIdentity()))) &&
            ((this.oldSubIdentityType==null && other.getOldSubIdentityType()==null) || 
             (this.oldSubIdentityType!=null &&
              this.oldSubIdentityType.equals(other.getOldSubIdentityType()))) &&
            ((this.newSubIdentity==null && other.getNewSubIdentity()==null) || 
             (this.newSubIdentity!=null &&
              this.newSubIdentity.equals(other.getNewSubIdentity())));
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
        if (getOldSubIdentity() != null) {
            _hashCode += getOldSubIdentity().hashCode();
        }
        if (getOldSubIdentityType() != null) {
            _hashCode += getOldSubIdentityType().hashCode();
        }
        if (getNewSubIdentity() != null) {
            _hashCode += getNewSubIdentity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubIdentityRequestModifySubIdentity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubIdentityRequest>ModifySubIdentity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldSubIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldSubIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldSubIdentityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldSubIdentityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSubIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewSubIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
