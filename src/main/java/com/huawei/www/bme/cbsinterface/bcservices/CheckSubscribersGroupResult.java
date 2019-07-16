/**
 * CheckSubscribersGroupResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class CheckSubscribersGroupResult  implements java.io.Serializable {
    private int groupRelation;

    private com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResultUserGroup[] userGroup;

    public CheckSubscribersGroupResult() {
    }

    public CheckSubscribersGroupResult(
           int groupRelation,
           com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResultUserGroup[] userGroup) {
           this.groupRelation = groupRelation;
           this.userGroup = userGroup;
    }


    /**
     * Gets the groupRelation value for this CheckSubscribersGroupResult.
     * 
     * @return groupRelation
     */
    public int getGroupRelation() {
        return groupRelation;
    }


    /**
     * Sets the groupRelation value for this CheckSubscribersGroupResult.
     * 
     * @param groupRelation
     */
    public void setGroupRelation(int groupRelation) {
        this.groupRelation = groupRelation;
    }


    /**
     * Gets the userGroup value for this CheckSubscribersGroupResult.
     * 
     * @return userGroup
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResultUserGroup[] getUserGroup() {
        return userGroup;
    }


    /**
     * Sets the userGroup value for this CheckSubscribersGroupResult.
     * 
     * @param userGroup
     */
    public void setUserGroup(com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResultUserGroup[] userGroup) {
        this.userGroup = userGroup;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResultUserGroup getUserGroup(int i) {
        return this.userGroup[i];
    }

    public void setUserGroup(int i, com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResultUserGroup _value) {
        this.userGroup[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckSubscribersGroupResult)) return false;
        CheckSubscribersGroupResult other = (CheckSubscribersGroupResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.groupRelation == other.getGroupRelation() &&
            ((this.userGroup==null && other.getUserGroup()==null) || 
             (this.userGroup!=null &&
              java.util.Arrays.equals(this.userGroup, other.getUserGroup())));
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
        _hashCode += getGroupRelation();
        if (getUserGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserGroup(), i);
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
        new org.apache.axis.description.TypeDesc(CheckSubscribersGroupResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CheckSubscribersGroupResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UserGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CheckSubscribersGroupResult>UserGroup"));
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
