/**
 * ChangeMemberShortNoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeMemberShortNoRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode;

    private com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode groupMember;

    private java.lang.String oldMemberShortNo;

    private java.lang.String newMemberShortNo;

    public ChangeMemberShortNoRequest() {
    }

    public ChangeMemberShortNoRequest(
           com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode,
           com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode groupMember,
           java.lang.String oldMemberShortNo,
           java.lang.String newMemberShortNo) {
           this.subGroupAccessCode = subGroupAccessCode;
           this.groupMember = groupMember;
           this.oldMemberShortNo = oldMemberShortNo;
           this.newMemberShortNo = newMemberShortNo;
    }


    /**
     * Gets the subGroupAccessCode value for this ChangeMemberShortNoRequest.
     * 
     * @return subGroupAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode getSubGroupAccessCode() {
        return subGroupAccessCode;
    }


    /**
     * Sets the subGroupAccessCode value for this ChangeMemberShortNoRequest.
     * 
     * @param subGroupAccessCode
     */
    public void setSubGroupAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode) {
        this.subGroupAccessCode = subGroupAccessCode;
    }


    /**
     * Gets the groupMember value for this ChangeMemberShortNoRequest.
     * 
     * @return groupMember
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode getGroupMember() {
        return groupMember;
    }


    /**
     * Sets the groupMember value for this ChangeMemberShortNoRequest.
     * 
     * @param groupMember
     */
    public void setGroupMember(com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode groupMember) {
        this.groupMember = groupMember;
    }


    /**
     * Gets the oldMemberShortNo value for this ChangeMemberShortNoRequest.
     * 
     * @return oldMemberShortNo
     */
    public java.lang.String getOldMemberShortNo() {
        return oldMemberShortNo;
    }


    /**
     * Sets the oldMemberShortNo value for this ChangeMemberShortNoRequest.
     * 
     * @param oldMemberShortNo
     */
    public void setOldMemberShortNo(java.lang.String oldMemberShortNo) {
        this.oldMemberShortNo = oldMemberShortNo;
    }


    /**
     * Gets the newMemberShortNo value for this ChangeMemberShortNoRequest.
     * 
     * @return newMemberShortNo
     */
    public java.lang.String getNewMemberShortNo() {
        return newMemberShortNo;
    }


    /**
     * Sets the newMemberShortNo value for this ChangeMemberShortNoRequest.
     * 
     * @param newMemberShortNo
     */
    public void setNewMemberShortNo(java.lang.String newMemberShortNo) {
        this.newMemberShortNo = newMemberShortNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeMemberShortNoRequest)) return false;
        ChangeMemberShortNoRequest other = (ChangeMemberShortNoRequest) obj;
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
            ((this.groupMember==null && other.getGroupMember()==null) || 
             (this.groupMember!=null &&
              this.groupMember.equals(other.getGroupMember()))) &&
            ((this.oldMemberShortNo==null && other.getOldMemberShortNo()==null) || 
             (this.oldMemberShortNo!=null &&
              this.oldMemberShortNo.equals(other.getOldMemberShortNo()))) &&
            ((this.newMemberShortNo==null && other.getNewMemberShortNo()==null) || 
             (this.newMemberShortNo!=null &&
              this.newMemberShortNo.equals(other.getNewMemberShortNo())));
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
        if (getGroupMember() != null) {
            _hashCode += getGroupMember().hashCode();
        }
        if (getOldMemberShortNo() != null) {
            _hashCode += getOldMemberShortNo().hashCode();
        }
        if (getNewMemberShortNo() != null) {
            _hashCode += getNewMemberShortNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeMemberShortNoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeMemberShortNoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGroupAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMember");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMemberShortNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldMemberShortNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMemberShortNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewMemberShortNo"));
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
