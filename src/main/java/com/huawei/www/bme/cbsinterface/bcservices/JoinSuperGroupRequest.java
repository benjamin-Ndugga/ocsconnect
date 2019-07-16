/**
 * JoinSuperGroupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class JoinSuperGroupRequest  implements java.io.Serializable {
    /* SuperGroup id/code信息 */
    private com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequestSuperGroupAccess superGroupAccess;

    private com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequestMembers[] members;

    public JoinSuperGroupRequest() {
    }

    public JoinSuperGroupRequest(
           com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequestSuperGroupAccess superGroupAccess,
           com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequestMembers[] members) {
           this.superGroupAccess = superGroupAccess;
           this.members = members;
    }


    /**
     * Gets the superGroupAccess value for this JoinSuperGroupRequest.
     * 
     * @return superGroupAccess   * SuperGroup id/code信息
     */
    public com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequestSuperGroupAccess getSuperGroupAccess() {
        return superGroupAccess;
    }


    /**
     * Sets the superGroupAccess value for this JoinSuperGroupRequest.
     * 
     * @param superGroupAccess   * SuperGroup id/code信息
     */
    public void setSuperGroupAccess(com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequestSuperGroupAccess superGroupAccess) {
        this.superGroupAccess = superGroupAccess;
    }


    /**
     * Gets the members value for this JoinSuperGroupRequest.
     * 
     * @return members
     */
    public com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequestMembers[] getMembers() {
        return members;
    }


    /**
     * Sets the members value for this JoinSuperGroupRequest.
     * 
     * @param members
     */
    public void setMembers(com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequestMembers[] members) {
        this.members = members;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequestMembers getMembers(int i) {
        return this.members[i];
    }

    public void setMembers(int i, com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequestMembers _value) {
        this.members[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JoinSuperGroupRequest)) return false;
        JoinSuperGroupRequest other = (JoinSuperGroupRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.superGroupAccess==null && other.getSuperGroupAccess()==null) || 
             (this.superGroupAccess!=null &&
              this.superGroupAccess.equals(other.getSuperGroupAccess()))) &&
            ((this.members==null && other.getMembers()==null) || 
             (this.members!=null &&
              java.util.Arrays.equals(this.members, other.getMembers())));
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
        if (getSuperGroupAccess() != null) {
            _hashCode += getSuperGroupAccess().hashCode();
        }
        if (getMembers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMembers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMembers(), i);
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
        new org.apache.axis.description.TypeDesc(JoinSuperGroupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "JoinSuperGroupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superGroupAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SuperGroupAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">JoinSuperGroupRequest>SuperGroupAccess"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("members");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "members"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">JoinSuperGroupRequest>members"));
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
