/**
 * QuerySubInforToMicroRequestAccessInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QuerySubInforToMicroRequestAccessInfo  implements java.io.Serializable {
    /* Entity ID type. 
     * 1:Customer ID.   
     * 2:Account ID.   
     * 3:Subscriber ID.   
     * 4:Service Number.  
     * 5:ICCID */
    private java.lang.String objectIdType;

    /* The ID of the object you want to operate. E.g. if you want
     * to change the customer. This value is customer ID, if you want to
     * change the account this value is account ID. */
    private java.lang.String objectId;

    public QuerySubInforToMicroRequestAccessInfo() {
    }

    public QuerySubInforToMicroRequestAccessInfo(
           java.lang.String objectIdType,
           java.lang.String objectId) {
           this.objectIdType = objectIdType;
           this.objectId = objectId;
    }


    /**
     * Gets the objectIdType value for this QuerySubInforToMicroRequestAccessInfo.
     * 
     * @return objectIdType   * Entity ID type. 
     * 1:Customer ID.   
     * 2:Account ID.   
     * 3:Subscriber ID.   
     * 4:Service Number.  
     * 5:ICCID
     */
    public java.lang.String getObjectIdType() {
        return objectIdType;
    }


    /**
     * Sets the objectIdType value for this QuerySubInforToMicroRequestAccessInfo.
     * 
     * @param objectIdType   * Entity ID type. 
     * 1:Customer ID.   
     * 2:Account ID.   
     * 3:Subscriber ID.   
     * 4:Service Number.  
     * 5:ICCID
     */
    public void setObjectIdType(java.lang.String objectIdType) {
        this.objectIdType = objectIdType;
    }


    /**
     * Gets the objectId value for this QuerySubInforToMicroRequestAccessInfo.
     * 
     * @return objectId   * The ID of the object you want to operate. E.g. if you want
     * to change the customer. This value is customer ID, if you want to
     * change the account this value is account ID.
     */
    public java.lang.String getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this QuerySubInforToMicroRequestAccessInfo.
     * 
     * @param objectId   * The ID of the object you want to operate. E.g. if you want
     * to change the customer. This value is customer ID, if you want to
     * change the account this value is account ID.
     */
    public void setObjectId(java.lang.String objectId) {
        this.objectId = objectId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubInforToMicroRequestAccessInfo)) return false;
        QuerySubInforToMicroRequestAccessInfo other = (QuerySubInforToMicroRequestAccessInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectIdType==null && other.getObjectIdType()==null) || 
             (this.objectIdType!=null &&
              this.objectIdType.equals(other.getObjectIdType()))) &&
            ((this.objectId==null && other.getObjectId()==null) || 
             (this.objectId!=null &&
              this.objectId.equals(other.getObjectId())));
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
        if (getObjectIdType() != null) {
            _hashCode += getObjectIdType().hashCode();
        }
        if (getObjectId() != null) {
            _hashCode += getObjectId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySubInforToMicroRequestAccessInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInforToMicroRequest>AccessInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ObjectIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ObjectId"));
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
