/**
 * QueryPairNumberResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryPairNumberResult  implements java.io.Serializable {
    private int queryResult;

    private java.lang.String pairNumber;

    public QueryPairNumberResult() {
    }

    public QueryPairNumberResult(
           int queryResult,
           java.lang.String pairNumber) {
           this.queryResult = queryResult;
           this.pairNumber = pairNumber;
    }


    /**
     * Gets the queryResult value for this QueryPairNumberResult.
     * 
     * @return queryResult
     */
    public int getQueryResult() {
        return queryResult;
    }


    /**
     * Sets the queryResult value for this QueryPairNumberResult.
     * 
     * @param queryResult
     */
    public void setQueryResult(int queryResult) {
        this.queryResult = queryResult;
    }


    /**
     * Gets the pairNumber value for this QueryPairNumberResult.
     * 
     * @return pairNumber
     */
    public java.lang.String getPairNumber() {
        return pairNumber;
    }


    /**
     * Sets the pairNumber value for this QueryPairNumberResult.
     * 
     * @param pairNumber
     */
    public void setPairNumber(java.lang.String pairNumber) {
        this.pairNumber = pairNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPairNumberResult)) return false;
        QueryPairNumberResult other = (QueryPairNumberResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.queryResult == other.getQueryResult() &&
            ((this.pairNumber==null && other.getPairNumber()==null) || 
             (this.pairNumber!=null &&
              this.pairNumber.equals(other.getPairNumber())));
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
        _hashCode += getQueryResult();
        if (getPairNumber() != null) {
            _hashCode += getPairNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryPairNumberResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryPairNumberResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pairNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "PairNumber"));
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
