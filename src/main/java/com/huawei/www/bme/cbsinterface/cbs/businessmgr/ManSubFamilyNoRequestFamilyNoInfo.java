/**
 * ManSubFamilyNoRequestFamilyNoInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ManSubFamilyNoRequestFamilyNoInfo  implements java.io.Serializable {
    private java.lang.String familyNo;

    private java.lang.Integer phoneNoOrder;

    private java.lang.String newFamilyNo;

    private java.lang.String subGroupType;

    private java.lang.String effectiveDate;

    private java.lang.String expireDate;

    public ManSubFamilyNoRequestFamilyNoInfo() {
    }

    public ManSubFamilyNoRequestFamilyNoInfo(
           java.lang.String familyNo,
           java.lang.Integer phoneNoOrder,
           java.lang.String newFamilyNo,
           java.lang.String subGroupType,
           java.lang.String effectiveDate,
           java.lang.String expireDate) {
           this.familyNo = familyNo;
           this.phoneNoOrder = phoneNoOrder;
           this.newFamilyNo = newFamilyNo;
           this.subGroupType = subGroupType;
           this.effectiveDate = effectiveDate;
           this.expireDate = expireDate;
    }


    /**
     * Gets the familyNo value for this ManSubFamilyNoRequestFamilyNoInfo.
     * 
     * @return familyNo
     */
    public java.lang.String getFamilyNo() {
        return familyNo;
    }


    /**
     * Sets the familyNo value for this ManSubFamilyNoRequestFamilyNoInfo.
     * 
     * @param familyNo
     */
    public void setFamilyNo(java.lang.String familyNo) {
        this.familyNo = familyNo;
    }


    /**
     * Gets the phoneNoOrder value for this ManSubFamilyNoRequestFamilyNoInfo.
     * 
     * @return phoneNoOrder
     */
    public java.lang.Integer getPhoneNoOrder() {
        return phoneNoOrder;
    }


    /**
     * Sets the phoneNoOrder value for this ManSubFamilyNoRequestFamilyNoInfo.
     * 
     * @param phoneNoOrder
     */
    public void setPhoneNoOrder(java.lang.Integer phoneNoOrder) {
        this.phoneNoOrder = phoneNoOrder;
    }


    /**
     * Gets the newFamilyNo value for this ManSubFamilyNoRequestFamilyNoInfo.
     * 
     * @return newFamilyNo
     */
    public java.lang.String getNewFamilyNo() {
        return newFamilyNo;
    }


    /**
     * Sets the newFamilyNo value for this ManSubFamilyNoRequestFamilyNoInfo.
     * 
     * @param newFamilyNo
     */
    public void setNewFamilyNo(java.lang.String newFamilyNo) {
        this.newFamilyNo = newFamilyNo;
    }


    /**
     * Gets the subGroupType value for this ManSubFamilyNoRequestFamilyNoInfo.
     * 
     * @return subGroupType
     */
    public java.lang.String getSubGroupType() {
        return subGroupType;
    }


    /**
     * Sets the subGroupType value for this ManSubFamilyNoRequestFamilyNoInfo.
     * 
     * @param subGroupType
     */
    public void setSubGroupType(java.lang.String subGroupType) {
        this.subGroupType = subGroupType;
    }


    /**
     * Gets the effectiveDate value for this ManSubFamilyNoRequestFamilyNoInfo.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ManSubFamilyNoRequestFamilyNoInfo.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expireDate value for this ManSubFamilyNoRequestFamilyNoInfo.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this ManSubFamilyNoRequestFamilyNoInfo.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManSubFamilyNoRequestFamilyNoInfo)) return false;
        ManSubFamilyNoRequestFamilyNoInfo other = (ManSubFamilyNoRequestFamilyNoInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.familyNo==null && other.getFamilyNo()==null) || 
             (this.familyNo!=null &&
              this.familyNo.equals(other.getFamilyNo()))) &&
            ((this.phoneNoOrder==null && other.getPhoneNoOrder()==null) || 
             (this.phoneNoOrder!=null &&
              this.phoneNoOrder.equals(other.getPhoneNoOrder()))) &&
            ((this.newFamilyNo==null && other.getNewFamilyNo()==null) || 
             (this.newFamilyNo!=null &&
              this.newFamilyNo.equals(other.getNewFamilyNo()))) &&
            ((this.subGroupType==null && other.getSubGroupType()==null) || 
             (this.subGroupType!=null &&
              this.subGroupType.equals(other.getSubGroupType()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate())));
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
        if (getFamilyNo() != null) {
            _hashCode += getFamilyNo().hashCode();
        }
        if (getPhoneNoOrder() != null) {
            _hashCode += getPhoneNoOrder().hashCode();
        }
        if (getNewFamilyNo() != null) {
            _hashCode += getNewFamilyNo().hashCode();
        }
        if (getSubGroupType() != null) {
            _hashCode += getSubGroupType().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManSubFamilyNoRequestFamilyNoInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ManSubFamilyNoRequest>FamilyNoInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "FamilyNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNoOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "phoneNoOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newFamilyNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewFamilyNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "subGroupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
