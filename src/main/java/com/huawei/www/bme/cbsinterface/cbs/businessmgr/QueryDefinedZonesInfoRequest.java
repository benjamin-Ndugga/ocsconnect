/**
 * QueryDefinedZonesInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryDefinedZonesInfoRequest  implements java.io.Serializable {
    private java.math.BigInteger operationType;

    private java.lang.String cellId;

    public QueryDefinedZonesInfoRequest() {
    }

    public QueryDefinedZonesInfoRequest(
           java.math.BigInteger operationType,
           java.lang.String cellId) {
           this.operationType = operationType;
           this.cellId = cellId;
    }


    /**
     * Gets the operationType value for this QueryDefinedZonesInfoRequest.
     * 
     * @return operationType
     */
    public java.math.BigInteger getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this QueryDefinedZonesInfoRequest.
     * 
     * @param operationType
     */
    public void setOperationType(java.math.BigInteger operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the cellId value for this QueryDefinedZonesInfoRequest.
     * 
     * @return cellId
     */
    public java.lang.String getCellId() {
        return cellId;
    }


    /**
     * Sets the cellId value for this QueryDefinedZonesInfoRequest.
     * 
     * @param cellId
     */
    public void setCellId(java.lang.String cellId) {
        this.cellId = cellId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryDefinedZonesInfoRequest)) return false;
        QueryDefinedZonesInfoRequest other = (QueryDefinedZonesInfoRequest) obj;
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
            ((this.cellId==null && other.getCellId()==null) || 
             (this.cellId!=null &&
              this.cellId.equals(other.getCellId())));
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
        if (getCellId() != null) {
            _hashCode += getCellId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryDefinedZonesInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryDefinedZonesInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OperationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CellId"));
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
