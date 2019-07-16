/**
 * ManAppendSubIdentityRequestAppendSubIdentityList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ManAppendSubIdentityRequestAppendSubIdentityList  implements java.io.Serializable {
    private java.lang.String subIdentity;

    private java.lang.Integer subIdentityType;

    private java.lang.String relatedSubIdentity;

    private java.lang.String newSubIdentity;

    public ManAppendSubIdentityRequestAppendSubIdentityList() {
    }

    public ManAppendSubIdentityRequestAppendSubIdentityList(
           java.lang.String subIdentity,
           java.lang.Integer subIdentityType,
           java.lang.String relatedSubIdentity,
           java.lang.String newSubIdentity) {
           this.subIdentity = subIdentity;
           this.subIdentityType = subIdentityType;
           this.relatedSubIdentity = relatedSubIdentity;
           this.newSubIdentity = newSubIdentity;
    }


    /**
     * Gets the subIdentity value for this ManAppendSubIdentityRequestAppendSubIdentityList.
     * 
     * @return subIdentity
     */
    public java.lang.String getSubIdentity() {
        return subIdentity;
    }


    /**
     * Sets the subIdentity value for this ManAppendSubIdentityRequestAppendSubIdentityList.
     * 
     * @param subIdentity
     */
    public void setSubIdentity(java.lang.String subIdentity) {
        this.subIdentity = subIdentity;
    }


    /**
     * Gets the subIdentityType value for this ManAppendSubIdentityRequestAppendSubIdentityList.
     * 
     * @return subIdentityType
     */
    public java.lang.Integer getSubIdentityType() {
        return subIdentityType;
    }


    /**
     * Sets the subIdentityType value for this ManAppendSubIdentityRequestAppendSubIdentityList.
     * 
     * @param subIdentityType
     */
    public void setSubIdentityType(java.lang.Integer subIdentityType) {
        this.subIdentityType = subIdentityType;
    }


    /**
     * Gets the relatedSubIdentity value for this ManAppendSubIdentityRequestAppendSubIdentityList.
     * 
     * @return relatedSubIdentity
     */
    public java.lang.String getRelatedSubIdentity() {
        return relatedSubIdentity;
    }


    /**
     * Sets the relatedSubIdentity value for this ManAppendSubIdentityRequestAppendSubIdentityList.
     * 
     * @param relatedSubIdentity
     */
    public void setRelatedSubIdentity(java.lang.String relatedSubIdentity) {
        this.relatedSubIdentity = relatedSubIdentity;
    }


    /**
     * Gets the newSubIdentity value for this ManAppendSubIdentityRequestAppendSubIdentityList.
     * 
     * @return newSubIdentity
     */
    public java.lang.String getNewSubIdentity() {
        return newSubIdentity;
    }


    /**
     * Sets the newSubIdentity value for this ManAppendSubIdentityRequestAppendSubIdentityList.
     * 
     * @param newSubIdentity
     */
    public void setNewSubIdentity(java.lang.String newSubIdentity) {
        this.newSubIdentity = newSubIdentity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManAppendSubIdentityRequestAppendSubIdentityList)) return false;
        ManAppendSubIdentityRequestAppendSubIdentityList other = (ManAppendSubIdentityRequestAppendSubIdentityList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subIdentity==null && other.getSubIdentity()==null) || 
             (this.subIdentity!=null &&
              this.subIdentity.equals(other.getSubIdentity()))) &&
            ((this.subIdentityType==null && other.getSubIdentityType()==null) || 
             (this.subIdentityType!=null &&
              this.subIdentityType.equals(other.getSubIdentityType()))) &&
            ((this.relatedSubIdentity==null && other.getRelatedSubIdentity()==null) || 
             (this.relatedSubIdentity!=null &&
              this.relatedSubIdentity.equals(other.getRelatedSubIdentity()))) &&
            ((this.newSubIdentity==null && other.getNewSubIdentity()==null) || 
             (this.newSubIdentity!=null &&
              this.newSubIdentity.equals(other.getNewSubIdentity())));
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
        if (getSubIdentity() != null) {
            _hashCode += getSubIdentity().hashCode();
        }
        if (getSubIdentityType() != null) {
            _hashCode += getSubIdentityType().hashCode();
        }
        if (getRelatedSubIdentity() != null) {
            _hashCode += getRelatedSubIdentity().hashCode();
        }
        if (getNewSubIdentity() != null) {
            _hashCode += getNewSubIdentity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManAppendSubIdentityRequestAppendSubIdentityList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManAppendSubIdentityRequest>AppendSubIdentityList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subIdentityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubIdentityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedSubIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RelatedSubIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSubIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewSubIdentity"));
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
