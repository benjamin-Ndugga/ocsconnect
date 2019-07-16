/**
 * QueryGroupListBySubscriberResultGroupList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryGroupListBySubscriberResultGroupList  implements java.io.Serializable {
    private java.lang.String subGroupKey;

    private java.lang.String subGroupCode;

    private java.lang.String subGroupType;

    private java.lang.String memberTypeCode;

    private java.lang.String memberShortNo;

    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] memberProperty;

    private java.lang.String effectiveTime;

    private java.lang.String expirationTime;

    public QueryGroupListBySubscriberResultGroupList() {
    }

    public QueryGroupListBySubscriberResultGroupList(
           java.lang.String subGroupKey,
           java.lang.String subGroupCode,
           java.lang.String subGroupType,
           java.lang.String memberTypeCode,
           java.lang.String memberShortNo,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] memberProperty,
           java.lang.String effectiveTime,
           java.lang.String expirationTime) {
           this.subGroupKey = subGroupKey;
           this.subGroupCode = subGroupCode;
           this.subGroupType = subGroupType;
           this.memberTypeCode = memberTypeCode;
           this.memberShortNo = memberShortNo;
           this.memberProperty = memberProperty;
           this.effectiveTime = effectiveTime;
           this.expirationTime = expirationTime;
    }


    /**
     * Gets the subGroupKey value for this QueryGroupListBySubscriberResultGroupList.
     * 
     * @return subGroupKey
     */
    public java.lang.String getSubGroupKey() {
        return subGroupKey;
    }


    /**
     * Sets the subGroupKey value for this QueryGroupListBySubscriberResultGroupList.
     * 
     * @param subGroupKey
     */
    public void setSubGroupKey(java.lang.String subGroupKey) {
        this.subGroupKey = subGroupKey;
    }


    /**
     * Gets the subGroupCode value for this QueryGroupListBySubscriberResultGroupList.
     * 
     * @return subGroupCode
     */
    public java.lang.String getSubGroupCode() {
        return subGroupCode;
    }


    /**
     * Sets the subGroupCode value for this QueryGroupListBySubscriberResultGroupList.
     * 
     * @param subGroupCode
     */
    public void setSubGroupCode(java.lang.String subGroupCode) {
        this.subGroupCode = subGroupCode;
    }


    /**
     * Gets the subGroupType value for this QueryGroupListBySubscriberResultGroupList.
     * 
     * @return subGroupType
     */
    public java.lang.String getSubGroupType() {
        return subGroupType;
    }


    /**
     * Sets the subGroupType value for this QueryGroupListBySubscriberResultGroupList.
     * 
     * @param subGroupType
     */
    public void setSubGroupType(java.lang.String subGroupType) {
        this.subGroupType = subGroupType;
    }


    /**
     * Gets the memberTypeCode value for this QueryGroupListBySubscriberResultGroupList.
     * 
     * @return memberTypeCode
     */
    public java.lang.String getMemberTypeCode() {
        return memberTypeCode;
    }


    /**
     * Sets the memberTypeCode value for this QueryGroupListBySubscriberResultGroupList.
     * 
     * @param memberTypeCode
     */
    public void setMemberTypeCode(java.lang.String memberTypeCode) {
        this.memberTypeCode = memberTypeCode;
    }


    /**
     * Gets the memberShortNo value for this QueryGroupListBySubscriberResultGroupList.
     * 
     * @return memberShortNo
     */
    public java.lang.String getMemberShortNo() {
        return memberShortNo;
    }


    /**
     * Sets the memberShortNo value for this QueryGroupListBySubscriberResultGroupList.
     * 
     * @param memberShortNo
     */
    public void setMemberShortNo(java.lang.String memberShortNo) {
        this.memberShortNo = memberShortNo;
    }


    /**
     * Gets the memberProperty value for this QueryGroupListBySubscriberResultGroupList.
     * 
     * @return memberProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getMemberProperty() {
        return memberProperty;
    }


    /**
     * Sets the memberProperty value for this QueryGroupListBySubscriberResultGroupList.
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


    /**
     * Gets the effectiveTime value for this QueryGroupListBySubscriberResultGroupList.
     * 
     * @return effectiveTime
     */
    public java.lang.String getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this QueryGroupListBySubscriberResultGroupList.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(java.lang.String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the expirationTime value for this QueryGroupListBySubscriberResultGroupList.
     * 
     * @return expirationTime
     */
    public java.lang.String getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this QueryGroupListBySubscriberResultGroupList.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(java.lang.String expirationTime) {
        this.expirationTime = expirationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryGroupListBySubscriberResultGroupList)) return false;
        QueryGroupListBySubscriberResultGroupList other = (QueryGroupListBySubscriberResultGroupList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subGroupKey==null && other.getSubGroupKey()==null) || 
             (this.subGroupKey!=null &&
              this.subGroupKey.equals(other.getSubGroupKey()))) &&
            ((this.subGroupCode==null && other.getSubGroupCode()==null) || 
             (this.subGroupCode!=null &&
              this.subGroupCode.equals(other.getSubGroupCode()))) &&
            ((this.subGroupType==null && other.getSubGroupType()==null) || 
             (this.subGroupType!=null &&
              this.subGroupType.equals(other.getSubGroupType()))) &&
            ((this.memberTypeCode==null && other.getMemberTypeCode()==null) || 
             (this.memberTypeCode!=null &&
              this.memberTypeCode.equals(other.getMemberTypeCode()))) &&
            ((this.memberShortNo==null && other.getMemberShortNo()==null) || 
             (this.memberShortNo!=null &&
              this.memberShortNo.equals(other.getMemberShortNo()))) &&
            ((this.memberProperty==null && other.getMemberProperty()==null) || 
             (this.memberProperty!=null &&
              java.util.Arrays.equals(this.memberProperty, other.getMemberProperty()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime()))) &&
            ((this.expirationTime==null && other.getExpirationTime()==null) || 
             (this.expirationTime!=null &&
              this.expirationTime.equals(other.getExpirationTime())));
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
        if (getSubGroupKey() != null) {
            _hashCode += getSubGroupKey().hashCode();
        }
        if (getSubGroupCode() != null) {
            _hashCode += getSubGroupCode().hashCode();
        }
        if (getSubGroupType() != null) {
            _hashCode += getSubGroupType().hashCode();
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
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        if (getExpirationTime() != null) {
            _hashCode += getExpirationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryGroupListBySubscriberResultGroupList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupListBySubscriberResult>GroupList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGroupKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGroupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGroupType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpirationTime"));
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
