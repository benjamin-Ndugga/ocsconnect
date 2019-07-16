/**
 * ManAppendSubIdentityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ManAppendSubIdentityRequest  implements java.io.Serializable {
    private java.lang.String primaryIdentity;

    private int operateType;

    private com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityRequestAppendSubIdentityList[] appendSubIdentityList;

    public ManAppendSubIdentityRequest() {
    }

    public ManAppendSubIdentityRequest(
           java.lang.String primaryIdentity,
           int operateType,
           com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityRequestAppendSubIdentityList[] appendSubIdentityList) {
           this.primaryIdentity = primaryIdentity;
           this.operateType = operateType;
           this.appendSubIdentityList = appendSubIdentityList;
    }


    /**
     * Gets the primaryIdentity value for this ManAppendSubIdentityRequest.
     * 
     * @return primaryIdentity
     */
    public java.lang.String getPrimaryIdentity() {
        return primaryIdentity;
    }


    /**
     * Sets the primaryIdentity value for this ManAppendSubIdentityRequest.
     * 
     * @param primaryIdentity
     */
    public void setPrimaryIdentity(java.lang.String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }


    /**
     * Gets the operateType value for this ManAppendSubIdentityRequest.
     * 
     * @return operateType
     */
    public int getOperateType() {
        return operateType;
    }


    /**
     * Sets the operateType value for this ManAppendSubIdentityRequest.
     * 
     * @param operateType
     */
    public void setOperateType(int operateType) {
        this.operateType = operateType;
    }


    /**
     * Gets the appendSubIdentityList value for this ManAppendSubIdentityRequest.
     * 
     * @return appendSubIdentityList
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityRequestAppendSubIdentityList[] getAppendSubIdentityList() {
        return appendSubIdentityList;
    }


    /**
     * Sets the appendSubIdentityList value for this ManAppendSubIdentityRequest.
     * 
     * @param appendSubIdentityList
     */
    public void setAppendSubIdentityList(com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityRequestAppendSubIdentityList[] appendSubIdentityList) {
        this.appendSubIdentityList = appendSubIdentityList;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityRequestAppendSubIdentityList getAppendSubIdentityList(int i) {
        return this.appendSubIdentityList[i];
    }

    public void setAppendSubIdentityList(int i, com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityRequestAppendSubIdentityList _value) {
        this.appendSubIdentityList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManAppendSubIdentityRequest)) return false;
        ManAppendSubIdentityRequest other = (ManAppendSubIdentityRequest) obj;
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
            this.operateType == other.getOperateType() &&
            ((this.appendSubIdentityList==null && other.getAppendSubIdentityList()==null) || 
             (this.appendSubIdentityList!=null &&
              java.util.Arrays.equals(this.appendSubIdentityList, other.getAppendSubIdentityList())));
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
        _hashCode += getOperateType();
        if (getAppendSubIdentityList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppendSubIdentityList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppendSubIdentityList(), i);
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
        new org.apache.axis.description.TypeDesc(ManAppendSubIdentityRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManAppendSubIdentityRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrimaryIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OperateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appendSubIdentityList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AppendSubIdentityList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManAppendSubIdentityRequest>AppendSubIdentityList"));
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
