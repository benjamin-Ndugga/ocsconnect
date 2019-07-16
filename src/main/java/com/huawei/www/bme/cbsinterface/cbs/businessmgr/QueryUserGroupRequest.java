/**
 * QueryUserGroupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryUserGroupRequest  implements java.io.Serializable {
    private java.lang.String userGroupID;

    private java.lang.String userGroupName;

    public QueryUserGroupRequest() {
    }

    public QueryUserGroupRequest(
           java.lang.String userGroupID,
           java.lang.String userGroupName) {
           this.userGroupID = userGroupID;
           this.userGroupName = userGroupName;
    }


    /**
     * Gets the userGroupID value for this QueryUserGroupRequest.
     * 
     * @return userGroupID
     */
    public java.lang.String getUserGroupID() {
        return userGroupID;
    }


    /**
     * Sets the userGroupID value for this QueryUserGroupRequest.
     * 
     * @param userGroupID
     */
    public void setUserGroupID(java.lang.String userGroupID) {
        this.userGroupID = userGroupID;
    }


    /**
     * Gets the userGroupName value for this QueryUserGroupRequest.
     * 
     * @return userGroupName
     */
    public java.lang.String getUserGroupName() {
        return userGroupName;
    }


    /**
     * Sets the userGroupName value for this QueryUserGroupRequest.
     * 
     * @param userGroupName
     */
    public void setUserGroupName(java.lang.String userGroupName) {
        this.userGroupName = userGroupName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryUserGroupRequest)) return false;
        QueryUserGroupRequest other = (QueryUserGroupRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userGroupID==null && other.getUserGroupID()==null) || 
             (this.userGroupID!=null &&
              this.userGroupID.equals(other.getUserGroupID()))) &&
            ((this.userGroupName==null && other.getUserGroupName()==null) || 
             (this.userGroupName!=null &&
              this.userGroupName.equals(other.getUserGroupName())));
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
        if (getUserGroupID() != null) {
            _hashCode += getUserGroupID().hashCode();
        }
        if (getUserGroupName() != null) {
            _hashCode += getUserGroupName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryUserGroupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryUserGroupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userGroupID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "UserGroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "UserGroupName"));
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
