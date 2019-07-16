/**
 * AddGroupMemberRequestGroupMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class AddGroupMemberRequestGroupMember  implements java.io.Serializable {
    private java.lang.String subClass;

    private com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode;

    private com.huawei.www.bme.cbsinterface.bccommon.SubGroupMember subGrpMember;

    private com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestGroupMemberSubInfo subInfo;

    public AddGroupMemberRequestGroupMember() {
    }

    public AddGroupMemberRequestGroupMember(
           java.lang.String subClass,
           com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode,
           com.huawei.www.bme.cbsinterface.bccommon.SubGroupMember subGrpMember,
           com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestGroupMemberSubInfo subInfo) {
           this.subClass = subClass;
           this.subAccessCode = subAccessCode;
           this.subGrpMember = subGrpMember;
           this.subInfo = subInfo;
    }


    /**
     * Gets the subClass value for this AddGroupMemberRequestGroupMember.
     * 
     * @return subClass
     */
    public java.lang.String getSubClass() {
        return subClass;
    }


    /**
     * Sets the subClass value for this AddGroupMemberRequestGroupMember.
     * 
     * @param subClass
     */
    public void setSubClass(java.lang.String subClass) {
        this.subClass = subClass;
    }


    /**
     * Gets the subAccessCode value for this AddGroupMemberRequestGroupMember.
     * 
     * @return subAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }


    /**
     * Sets the subAccessCode value for this AddGroupMemberRequestGroupMember.
     * 
     * @param subAccessCode
     */
    public void setSubAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }


    /**
     * Gets the subGrpMember value for this AddGroupMemberRequestGroupMember.
     * 
     * @return subGrpMember
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubGroupMember getSubGrpMember() {
        return subGrpMember;
    }


    /**
     * Sets the subGrpMember value for this AddGroupMemberRequestGroupMember.
     * 
     * @param subGrpMember
     */
    public void setSubGrpMember(com.huawei.www.bme.cbsinterface.bccommon.SubGroupMember subGrpMember) {
        this.subGrpMember = subGrpMember;
    }


    /**
     * Gets the subInfo value for this AddGroupMemberRequestGroupMember.
     * 
     * @return subInfo
     */
    public com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestGroupMemberSubInfo getSubInfo() {
        return subInfo;
    }


    /**
     * Sets the subInfo value for this AddGroupMemberRequestGroupMember.
     * 
     * @param subInfo
     */
    public void setSubInfo(com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestGroupMemberSubInfo subInfo) {
        this.subInfo = subInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddGroupMemberRequestGroupMember)) return false;
        AddGroupMemberRequestGroupMember other = (AddGroupMemberRequestGroupMember) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subClass==null && other.getSubClass()==null) || 
             (this.subClass!=null &&
              this.subClass.equals(other.getSubClass()))) &&
            ((this.subAccessCode==null && other.getSubAccessCode()==null) || 
             (this.subAccessCode!=null &&
              this.subAccessCode.equals(other.getSubAccessCode()))) &&
            ((this.subGrpMember==null && other.getSubGrpMember()==null) || 
             (this.subGrpMember!=null &&
              this.subGrpMember.equals(other.getSubGrpMember()))) &&
            ((this.subInfo==null && other.getSubInfo()==null) || 
             (this.subInfo!=null &&
              this.subInfo.equals(other.getSubInfo())));
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
        if (getSubClass() != null) {
            _hashCode += getSubClass().hashCode();
        }
        if (getSubAccessCode() != null) {
            _hashCode += getSubAccessCode().hashCode();
        }
        if (getSubGrpMember() != null) {
            _hashCode += getSubGrpMember().hashCode();
        }
        if (getSubInfo() != null) {
            _hashCode += getSubInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddGroupMemberRequestGroupMember.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AddGroupMemberRequest>GroupMember"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGrpMember");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGrpMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupMember"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>AddGroupMemberRequest>GroupMember>SubInfo"));
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
