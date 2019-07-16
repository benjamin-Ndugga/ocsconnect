/**
 * SubIdentity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class SubIdentity  implements java.io.Serializable {
    private java.lang.String subIdentityType;

    private java.lang.String subIdentity;

    private java.lang.String primaryFlag;

    private java.lang.String relatedSubIdentity;

    public SubIdentity() {
    }

    public SubIdentity(
           java.lang.String subIdentityType,
           java.lang.String subIdentity,
           java.lang.String primaryFlag,
           java.lang.String relatedSubIdentity) {
           this.subIdentityType = subIdentityType;
           this.subIdentity = subIdentity;
           this.primaryFlag = primaryFlag;
           this.relatedSubIdentity = relatedSubIdentity;
    }


    /**
     * Gets the subIdentityType value for this SubIdentity.
     * 
     * @return subIdentityType
     */
    public java.lang.String getSubIdentityType() {
        return subIdentityType;
    }


    /**
     * Sets the subIdentityType value for this SubIdentity.
     * 
     * @param subIdentityType
     */
    public void setSubIdentityType(java.lang.String subIdentityType) {
        this.subIdentityType = subIdentityType;
    }


    /**
     * Gets the subIdentity value for this SubIdentity.
     * 
     * @return subIdentity
     */
    public java.lang.String getSubIdentity() {
        return subIdentity;
    }


    /**
     * Sets the subIdentity value for this SubIdentity.
     * 
     * @param subIdentity
     */
    public void setSubIdentity(java.lang.String subIdentity) {
        this.subIdentity = subIdentity;
    }


    /**
     * Gets the primaryFlag value for this SubIdentity.
     * 
     * @return primaryFlag
     */
    public java.lang.String getPrimaryFlag() {
        return primaryFlag;
    }


    /**
     * Sets the primaryFlag value for this SubIdentity.
     * 
     * @param primaryFlag
     */
    public void setPrimaryFlag(java.lang.String primaryFlag) {
        this.primaryFlag = primaryFlag;
    }


    /**
     * Gets the relatedSubIdentity value for this SubIdentity.
     * 
     * @return relatedSubIdentity
     */
    public java.lang.String getRelatedSubIdentity() {
        return relatedSubIdentity;
    }


    /**
     * Sets the relatedSubIdentity value for this SubIdentity.
     * 
     * @param relatedSubIdentity
     */
    public void setRelatedSubIdentity(java.lang.String relatedSubIdentity) {
        this.relatedSubIdentity = relatedSubIdentity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubIdentity)) return false;
        SubIdentity other = (SubIdentity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subIdentityType==null && other.getSubIdentityType()==null) || 
             (this.subIdentityType!=null &&
              this.subIdentityType.equals(other.getSubIdentityType()))) &&
            ((this.subIdentity==null && other.getSubIdentity()==null) || 
             (this.subIdentity!=null &&
              this.subIdentity.equals(other.getSubIdentity()))) &&
            ((this.primaryFlag==null && other.getPrimaryFlag()==null) || 
             (this.primaryFlag!=null &&
              this.primaryFlag.equals(other.getPrimaryFlag()))) &&
            ((this.relatedSubIdentity==null && other.getRelatedSubIdentity()==null) || 
             (this.relatedSubIdentity!=null &&
              this.relatedSubIdentity.equals(other.getRelatedSubIdentity())));
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
        if (getSubIdentityType() != null) {
            _hashCode += getSubIdentityType().hashCode();
        }
        if (getSubIdentity() != null) {
            _hashCode += getSubIdentity().hashCode();
        }
        if (getPrimaryFlag() != null) {
            _hashCode += getPrimaryFlag().hashCode();
        }
        if (getRelatedSubIdentity() != null) {
            _hashCode += getRelatedSubIdentity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubIdentity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubIdentity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subIdentityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubIdentityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PrimaryFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedSubIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "RelatedSubIdentity"));
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
