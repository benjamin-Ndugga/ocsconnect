/**
 * QueryGroupMemberListResultGroupMemberList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryGroupMemberListResultGroupMemberList  implements java.io.Serializable {
    private java.lang.String primaryIdentity;

    private java.lang.String memberTypeCode;

    private java.lang.String memberShortNo;

    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] memberProperty;

    public QueryGroupMemberListResultGroupMemberList() {
    }

    public QueryGroupMemberListResultGroupMemberList(
           java.lang.String primaryIdentity,
           java.lang.String memberTypeCode,
           java.lang.String memberShortNo,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] memberProperty) {
           this.primaryIdentity = primaryIdentity;
           this.memberTypeCode = memberTypeCode;
           this.memberShortNo = memberShortNo;
           this.memberProperty = memberProperty;
    }


    /**
     * Gets the primaryIdentity value for this QueryGroupMemberListResultGroupMemberList.
     * 
     * @return primaryIdentity
     */
    public java.lang.String getPrimaryIdentity() {
        return primaryIdentity;
    }


    /**
     * Sets the primaryIdentity value for this QueryGroupMemberListResultGroupMemberList.
     * 
     * @param primaryIdentity
     */
    public void setPrimaryIdentity(java.lang.String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }


    /**
     * Gets the memberTypeCode value for this QueryGroupMemberListResultGroupMemberList.
     * 
     * @return memberTypeCode
     */
    public java.lang.String getMemberTypeCode() {
        return memberTypeCode;
    }


    /**
     * Sets the memberTypeCode value for this QueryGroupMemberListResultGroupMemberList.
     * 
     * @param memberTypeCode
     */
    public void setMemberTypeCode(java.lang.String memberTypeCode) {
        this.memberTypeCode = memberTypeCode;
    }


    /**
     * Gets the memberShortNo value for this QueryGroupMemberListResultGroupMemberList.
     * 
     * @return memberShortNo
     */
    public java.lang.String getMemberShortNo() {
        return memberShortNo;
    }


    /**
     * Sets the memberShortNo value for this QueryGroupMemberListResultGroupMemberList.
     * 
     * @param memberShortNo
     */
    public void setMemberShortNo(java.lang.String memberShortNo) {
        this.memberShortNo = memberShortNo;
    }


    /**
     * Gets the memberProperty value for this QueryGroupMemberListResultGroupMemberList.
     * 
     * @return memberProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getMemberProperty() {
        return memberProperty;
    }


    /**
     * Sets the memberProperty value for this QueryGroupMemberListResultGroupMemberList.
     * 
     * @param memberProperty
     */
    public void setMemberProperty(com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] memberProperty) {
        this.memberProperty = memberProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty getMemberProperty(int i) {
        return this.memberProperty[i];
    }

    public void setMemberProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty _value) {
        this.memberProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryGroupMemberListResultGroupMemberList)) return false;
        QueryGroupMemberListResultGroupMemberList other = (QueryGroupMemberListResultGroupMemberList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.primaryIdentity==null && other.getPrimaryIdentity()==null) || 
             (this.primaryIdentity!=null &&
              this.primaryIdentity.equals(other.getPrimaryIdentity()))) &&
            ((this.memberTypeCode==null && other.getMemberTypeCode()==null) || 
             (this.memberTypeCode!=null &&
              this.memberTypeCode.equals(other.getMemberTypeCode()))) &&
            ((this.memberShortNo==null && other.getMemberShortNo()==null) || 
             (this.memberShortNo!=null &&
              this.memberShortNo.equals(other.getMemberShortNo()))) &&
            ((this.memberProperty==null && other.getMemberProperty()==null) || 
             (this.memberProperty!=null &&
              java.util.Arrays.equals(this.memberProperty, other.getMemberProperty())));
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
        if (getPrimaryIdentity() != null) {
            _hashCode += getPrimaryIdentity().hashCode();
        }
        if (getMemberTypeCode() != null) {
            _hashCode += getMemberTypeCode().hashCode();
        }
        if (getMemberShortNo() != null) {
            _hashCode += getMemberShortNo().hashCode();
        }
        if (getMemberProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemberProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemberProperty(), i);
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
        new org.apache.axis.description.TypeDesc(QueryGroupMemberListResultGroupMemberList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupMemberListResult>GroupMemberList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrimaryIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "MemberTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberShortNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "MemberShortNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "MemberProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SimpleProperty"));
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
