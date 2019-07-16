/**
 * CreateGroupRequestGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class CreateGroupRequestGroup  implements java.io.Serializable {
    private java.lang.String subGroupKey;

    private com.huawei.www.bme.cbsinterface.bccommon.SubGroup subGroupInfo;

    public CreateGroupRequestGroup() {
    }

    public CreateGroupRequestGroup(
           java.lang.String subGroupKey,
           com.huawei.www.bme.cbsinterface.bccommon.SubGroup subGroupInfo) {
           this.subGroupKey = subGroupKey;
           this.subGroupInfo = subGroupInfo;
    }


    /**
     * Gets the subGroupKey value for this CreateGroupRequestGroup.
     * 
     * @return subGroupKey
     */
    public java.lang.String getSubGroupKey() {
        return subGroupKey;
    }


    /**
     * Sets the subGroupKey value for this CreateGroupRequestGroup.
     * 
     * @param subGroupKey
     */
    public void setSubGroupKey(java.lang.String subGroupKey) {
        this.subGroupKey = subGroupKey;
    }


    /**
     * Gets the subGroupInfo value for this CreateGroupRequestGroup.
     * 
     * @return subGroupInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubGroup getSubGroupInfo() {
        return subGroupInfo;
    }


    /**
     * Sets the subGroupInfo value for this CreateGroupRequestGroup.
     * 
     * @param subGroupInfo
     */
    public void setSubGroupInfo(com.huawei.www.bme.cbsinterface.bccommon.SubGroup subGroupInfo) {
        this.subGroupInfo = subGroupInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateGroupRequestGroup)) return false;
        CreateGroupRequestGroup other = (CreateGroupRequestGroup) obj;
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
            ((this.subGroupInfo==null && other.getSubGroupInfo()==null) || 
             (this.subGroupInfo!=null &&
              this.subGroupInfo.equals(other.getSubGroupInfo())));
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
        if (getSubGroupInfo() != null) {
            _hashCode += getSubGroupInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateGroupRequestGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateGroupRequest>Group"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGroupKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGroupInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroup"));
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
