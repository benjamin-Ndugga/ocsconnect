/**
 * ManageMemberOfGroupCugRequestGroupMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ManageMemberOfGroupCugRequestGroupMember  implements java.io.Serializable {
    private java.lang.String grpMemberNo;

    private java.lang.String effectiveDate;

    private java.lang.String expireDate;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty;

    public ManageMemberOfGroupCugRequestGroupMember() {
    }

    public ManageMemberOfGroupCugRequestGroupMember(
           java.lang.String grpMemberNo,
           java.lang.String effectiveDate,
           java.lang.String expireDate,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty) {
           this.grpMemberNo = grpMemberNo;
           this.effectiveDate = effectiveDate;
           this.expireDate = expireDate;
           this.simpleProperty = simpleProperty;
    }


    /**
     * Gets the grpMemberNo value for this ManageMemberOfGroupCugRequestGroupMember.
     * 
     * @return grpMemberNo
     */
    public java.lang.String getGrpMemberNo() {
        return grpMemberNo;
    }


    /**
     * Sets the grpMemberNo value for this ManageMemberOfGroupCugRequestGroupMember.
     * 
     * @param grpMemberNo
     */
    public void setGrpMemberNo(java.lang.String grpMemberNo) {
        this.grpMemberNo = grpMemberNo;
    }


    /**
     * Gets the effectiveDate value for this ManageMemberOfGroupCugRequestGroupMember.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ManageMemberOfGroupCugRequestGroupMember.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expireDate value for this ManageMemberOfGroupCugRequestGroupMember.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this ManageMemberOfGroupCugRequestGroupMember.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the simpleProperty value for this ManageMemberOfGroupCugRequestGroupMember.
     * 
     * @return simpleProperty
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] getSimpleProperty() {
        return simpleProperty;
    }


    /**
     * Sets the simpleProperty value for this ManageMemberOfGroupCugRequestGroupMember.
     * 
     * @param simpleProperty
     */
    public void setSimpleProperty(com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty) {
        this.simpleProperty = simpleProperty;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty getSimpleProperty(int i) {
        return this.simpleProperty[i];
    }

    public void setSimpleProperty(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty _value) {
        this.simpleProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageMemberOfGroupCugRequestGroupMember)) return false;
        ManageMemberOfGroupCugRequestGroupMember other = (ManageMemberOfGroupCugRequestGroupMember) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.grpMemberNo==null && other.getGrpMemberNo()==null) || 
             (this.grpMemberNo!=null &&
              this.grpMemberNo.equals(other.getGrpMemberNo()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.simpleProperty==null && other.getSimpleProperty()==null) || 
             (this.simpleProperty!=null &&
              java.util.Arrays.equals(this.simpleProperty, other.getSimpleProperty())));
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
        if (getGrpMemberNo() != null) {
            _hashCode += getGrpMemberNo().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getSimpleProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimpleProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimpleProperty(), i);
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
        new org.apache.axis.description.TypeDesc(ManageMemberOfGroupCugRequestGroupMember.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ManageMemberOfGroupCugRequest>GroupMember"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpMemberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "GrpMemberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simpleProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SimpleProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SimpleProperty"));
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
