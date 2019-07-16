/**
 * SubGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class SubGroup  implements java.io.Serializable {
    /* For example:
     * Formal Subscriber Group
     * Test Subscriber Group */
    private java.lang.String subGroupClass;

    private java.lang.String subGroupCode;

    private java.lang.String userCustomerKey;

    private java.lang.String PGroupKey;

    private java.lang.String password;

    private com.huawei.www.bme.cbsinterface.bccommon.SubGroupBasicInfo subGroupBasicInfo;

    public SubGroup() {
    }

    public SubGroup(
           java.lang.String subGroupClass,
           java.lang.String subGroupCode,
           java.lang.String userCustomerKey,
           java.lang.String PGroupKey,
           java.lang.String password,
           com.huawei.www.bme.cbsinterface.bccommon.SubGroupBasicInfo subGroupBasicInfo) {
           this.subGroupClass = subGroupClass;
           this.subGroupCode = subGroupCode;
           this.userCustomerKey = userCustomerKey;
           this.PGroupKey = PGroupKey;
           this.password = password;
           this.subGroupBasicInfo = subGroupBasicInfo;
    }


    /**
     * Gets the subGroupClass value for this SubGroup.
     * 
     * @return subGroupClass   * For example:
     * Formal Subscriber Group
     * Test Subscriber Group
     */
    public java.lang.String getSubGroupClass() {
        return subGroupClass;
    }


    /**
     * Sets the subGroupClass value for this SubGroup.
     * 
     * @param subGroupClass   * For example:
     * Formal Subscriber Group
     * Test Subscriber Group
     */
    public void setSubGroupClass(java.lang.String subGroupClass) {
        this.subGroupClass = subGroupClass;
    }


    /**
     * Gets the subGroupCode value for this SubGroup.
     * 
     * @return subGroupCode
     */
    public java.lang.String getSubGroupCode() {
        return subGroupCode;
    }


    /**
     * Sets the subGroupCode value for this SubGroup.
     * 
     * @param subGroupCode
     */
    public void setSubGroupCode(java.lang.String subGroupCode) {
        this.subGroupCode = subGroupCode;
    }


    /**
     * Gets the userCustomerKey value for this SubGroup.
     * 
     * @return userCustomerKey
     */
    public java.lang.String getUserCustomerKey() {
        return userCustomerKey;
    }


    /**
     * Sets the userCustomerKey value for this SubGroup.
     * 
     * @param userCustomerKey
     */
    public void setUserCustomerKey(java.lang.String userCustomerKey) {
        this.userCustomerKey = userCustomerKey;
    }


    /**
     * Gets the PGroupKey value for this SubGroup.
     * 
     * @return PGroupKey
     */
    public java.lang.String getPGroupKey() {
        return PGroupKey;
    }


    /**
     * Sets the PGroupKey value for this SubGroup.
     * 
     * @param PGroupKey
     */
    public void setPGroupKey(java.lang.String PGroupKey) {
        this.PGroupKey = PGroupKey;
    }


    /**
     * Gets the password value for this SubGroup.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this SubGroup.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the subGroupBasicInfo value for this SubGroup.
     * 
     * @return subGroupBasicInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubGroupBasicInfo getSubGroupBasicInfo() {
        return subGroupBasicInfo;
    }


    /**
     * Sets the subGroupBasicInfo value for this SubGroup.
     * 
     * @param subGroupBasicInfo
     */
    public void setSubGroupBasicInfo(com.huawei.www.bme.cbsinterface.bccommon.SubGroupBasicInfo subGroupBasicInfo) {
        this.subGroupBasicInfo = subGroupBasicInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubGroup)) return false;
        SubGroup other = (SubGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subGroupClass==null && other.getSubGroupClass()==null) || 
             (this.subGroupClass!=null &&
              this.subGroupClass.equals(other.getSubGroupClass()))) &&
            ((this.subGroupCode==null && other.getSubGroupCode()==null) || 
             (this.subGroupCode!=null &&
              this.subGroupCode.equals(other.getSubGroupCode()))) &&
            ((this.userCustomerKey==null && other.getUserCustomerKey()==null) || 
             (this.userCustomerKey!=null &&
              this.userCustomerKey.equals(other.getUserCustomerKey()))) &&
            ((this.PGroupKey==null && other.getPGroupKey()==null) || 
             (this.PGroupKey!=null &&
              this.PGroupKey.equals(other.getPGroupKey()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.subGroupBasicInfo==null && other.getSubGroupBasicInfo()==null) || 
             (this.subGroupBasicInfo!=null &&
              this.subGroupBasicInfo.equals(other.getSubGroupBasicInfo())));
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
        if (getSubGroupClass() != null) {
            _hashCode += getSubGroupClass().hashCode();
        }
        if (getSubGroupCode() != null) {
            _hashCode += getSubGroupCode().hashCode();
        }
        if (getUserCustomerKey() != null) {
            _hashCode += getUserCustomerKey().hashCode();
        }
        if (getPGroupKey() != null) {
            _hashCode += getPGroupKey().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getSubGroupBasicInfo() != null) {
            _hashCode += getSubGroupBasicInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCustomerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "UserCustomerKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGroupKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PGroupKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupBasicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupBasicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupBasicInfo"));
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
