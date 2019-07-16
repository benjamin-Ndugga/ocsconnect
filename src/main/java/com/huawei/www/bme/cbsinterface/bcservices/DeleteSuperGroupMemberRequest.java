/**
 * DeleteSuperGroupMemberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class DeleteSuperGroupMemberRequest  implements java.io.Serializable {
    /* SuperGroup id/code信息 */
    private com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequestSuperGroupAccess superGroupAccess;

    private com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequestMembers[] members;

    public DeleteSuperGroupMemberRequest() {
    }

    public DeleteSuperGroupMemberRequest(
           com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequestSuperGroupAccess superGroupAccess,
           com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequestMembers[] members) {
           this.superGroupAccess = superGroupAccess;
           this.members = members;
    }


    /**
     * Gets the superGroupAccess value for this DeleteSuperGroupMemberRequest.
     * 
     * @return superGroupAccess   * SuperGroup id/code信息
     */
    public com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequestSuperGroupAccess getSuperGroupAccess() {
        return superGroupAccess;
    }


    /**
     * Sets the superGroupAccess value for this DeleteSuperGroupMemberRequest.
     * 
     * @param superGroupAccess   * SuperGroup id/code信息
     */
    public void setSuperGroupAccess(com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequestSuperGroupAccess superGroupAccess) {
        this.superGroupAccess = superGroupAccess;
    }


    /**
     * Gets the members value for this DeleteSuperGroupMemberRequest.
     * 
     * @return members
     */
    public com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequestMembers[] getMembers() {
        return members;
    }


    /**
     * Sets the members value for this DeleteSuperGroupMemberRequest.
     * 
     * @param members
     */
    public void setMembers(com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequestMembers[] members) {
        this.members = members;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequestMembers getMembers(int i) {
        return this.members[i];
    }

    public void setMembers(int i, com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequestMembers _value) {
        this.members[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteSuperGroupMemberRequest)) return false;
        DeleteSuperGroupMemberRequest other = (DeleteSuperGroupMemberRequest) obj;
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
        new org.apache.axis.description.TypeDesc(DeleteSuperGroupMemberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DeleteSuperGroupMemberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superGroupAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SuperGroupAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DeleteSuperGroupMemberRequest>SuperGroupAccess"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("members");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "members"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DeleteSuperGroupMemberRequest>members"));
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
