/**
 * SubGroupMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class SubGroupMember  implements java.io.Serializable {
    private java.lang.String memberShortNo;

    private com.huawei.www.bme.cbsinterface.bccommon.SubGroupMemberInfo subGrpMemberInfo;

    public SubGroupMember() {
    }

    public SubGroupMember(
           java.lang.String memberShortNo,
           com.huawei.www.bme.cbsinterface.bccommon.SubGroupMemberInfo subGrpMemberInfo) {
           this.memberShortNo = memberShortNo;
           this.subGrpMemberInfo = subGrpMemberInfo;
    }


    /**
     * Gets the memberShortNo value for this SubGroupMember.
     * 
     * @return memberShortNo
     */
    public java.lang.String getMemberShortNo() {
        return memberShortNo;
    }


    /**
     * Sets the memberShortNo value for this SubGroupMember.
     * 
     * @param memberShortNo
     */
    public void setMemberShortNo(java.lang.String memberShortNo) {
        this.memberShortNo = memberShortNo;
    }


    /**
     * Gets the subGrpMemberInfo value for this SubGroupMember.
     * 
     * @return subGrpMemberInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubGroupMemberInfo getSubGrpMemberInfo() {
        return subGrpMemberInfo;
    }


    /**
     * Sets the subGrpMemberInfo value for this SubGroupMember.
     * 
     * @param subGrpMemberInfo
     */
    public void setSubGrpMemberInfo(com.huawei.www.bme.cbsinterface.bccommon.SubGroupMemberInfo subGrpMemberInfo) {
        this.subGrpMemberInfo = subGrpMemberInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubGroupMember)) return false;
        SubGroupMember other = (SubGroupMember) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.memberShortNo==null && other.getMemberShortNo()==null) || 
             (this.memberShortNo!=null &&
              this.memberShortNo.equals(other.getMemberShortNo()))) &&
            ((this.subGrpMemberInfo==null && other.getSubGrpMemberInfo()==null) || 
             (this.subGrpMemberInfo!=null &&
              this.subGrpMemberInfo.equals(other.getSubGrpMemberInfo())));
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
        if (getMemberShortNo() != null) {
            _hashCode += getMemberShortNo().hashCode();
        }
        if (getSubGrpMemberInfo() != null) {
            _hashCode += getSubGrpMemberInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubGroupMember.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupMember"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberShortNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "MemberShortNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGrpMemberInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGrpMemberInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupMemberInfo"));
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
