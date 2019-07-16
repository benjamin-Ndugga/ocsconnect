/**
 * QueryOfferingInstPropertyRequestOfferingOwnerAcctAccessCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryOfferingInstPropertyRequestOfferingOwnerAcctAccessCode  extends com.huawei.www.bme.cbsinterface.bccommon.AcctAccessCode  implements java.io.Serializable {
    private java.lang.String payType;

    public QueryOfferingInstPropertyRequestOfferingOwnerAcctAccessCode() {
    }

    public QueryOfferingInstPropertyRequestOfferingOwnerAcctAccessCode(
           java.lang.String primaryIdentity,
           java.lang.String accountKey,
           java.lang.String accountCode,
           java.lang.String payType) {
        super(
            primaryIdentity,
            accountKey,
            accountCode);
        this.payType = payType;
    }


    /**
     * Gets the payType value for this QueryOfferingInstPropertyRequestOfferingOwnerAcctAccessCode.
     * 
     * @return payType
     */
    public java.lang.String getPayType() {
        return payType;
    }


    /**
     * Sets the payType value for this QueryOfferingInstPropertyRequestOfferingOwnerAcctAccessCode.
     * 
     * @param payType
     */
    public void setPayType(java.lang.String payType) {
        this.payType = payType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryOfferingInstPropertyRequestOfferingOwnerAcctAccessCode)) return false;
        QueryOfferingInstPropertyRequestOfferingOwnerAcctAccessCode other = (QueryOfferingInstPropertyRequestOfferingOwnerAcctAccessCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.payType==null && other.getPayType()==null) || 
             (this.payType!=null &&
              this.payType.equals(other.getPayType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPayType() != null) {
            _hashCode += getPayType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryOfferingInstPropertyRequestOfferingOwnerAcctAccessCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingInstPropertyRequest>OfferingOwner>AcctAccessCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayType"));
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
