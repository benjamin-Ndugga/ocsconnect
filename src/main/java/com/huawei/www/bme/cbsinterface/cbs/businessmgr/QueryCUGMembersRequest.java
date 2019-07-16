/**
 * QueryCUGMembersRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryCUGMembersRequest  implements java.io.Serializable {
    /* Query CUG Memger Information */
    private java.math.BigInteger operationType;

    private java.lang.String CUGID;

    public QueryCUGMembersRequest() {
    }

    public QueryCUGMembersRequest(
           java.math.BigInteger operationType,
           java.lang.String CUGID) {
           this.operationType = operationType;
           this.CUGID = CUGID;
    }


    /**
     * Gets the operationType value for this QueryCUGMembersRequest.
     * 
     * @return operationType   * Query CUG Memger Information
     */
    public java.math.BigInteger getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this QueryCUGMembersRequest.
     * 
     * @param operationType   * Query CUG Memger Information
     */
    public void setOperationType(java.math.BigInteger operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the CUGID value for this QueryCUGMembersRequest.
     * 
     * @return CUGID
     */
    public java.lang.String getCUGID() {
        return CUGID;
    }


    /**
     * Sets the CUGID value for this QueryCUGMembersRequest.
     * 
     * @param CUGID
     */
    public void setCUGID(java.lang.String CUGID) {
        this.CUGID = CUGID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCUGMembersRequest)) return false;
        QueryCUGMembersRequest other = (QueryCUGMembersRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType()))) &&
            ((this.CUGID==null && other.getCUGID()==null) || 
             (this.CUGID!=null &&
              this.CUGID.equals(other.getCUGID())));
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
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        if (getCUGID() != null) {
            _hashCode += getCUGID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCUGMembersRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryCUGMembersRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OperationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUGID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CUGID"));
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
