/**
 * QueryBasicInfoResultCustomer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryBasicInfoResultCustomer  extends com.huawei.www.bme.cbsinterface.cbs.businessmgr.IndividualCustomer  implements java.io.Serializable {
    public QueryBasicInfoResultCustomer() {
    }

    public QueryBasicInfoResultCustomer(
           java.lang.String name,
           java.lang.String code,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.IDType idType,
           java.lang.String idCode,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.Gender gender,
           java.lang.String birthday,
           java.lang.String address,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.CustomerGrade grade,
           java.lang.String belToAreaID,
           java.lang.String email,
           java.lang.String zipCode,
           java.lang.String registrationTime,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty,
           java.math.BigInteger customerType,
           java.math.BigInteger country,
           java.math.BigInteger nativePlace,
           java.math.BigInteger nationType,
           java.math.BigInteger jobType,
           java.math.BigInteger education,
           java.math.BigInteger creditGrade,
           java.math.BigInteger creditAmount,
           java.math.BigInteger customerState,
           java.math.BigInteger maritalStatus,
           java.lang.String skill,
           java.lang.String socialNo,
           java.math.BigInteger timeZone) {
        super(
            name,
            code,
            idType,
            idCode,
            gender,
            birthday,
            address,
            grade,
            belToAreaID,
            email,
            zipCode,
            registrationTime,
            simpleProperty,
            customerType,
            country,
            nativePlace,
            nationType,
            jobType,
            education,
            creditGrade,
            creditAmount,
            customerState,
            maritalStatus,
            skill,
            socialNo,
            timeZone);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBasicInfoResultCustomer)) return false;
        QueryBasicInfoResultCustomer other = (QueryBasicInfoResultCustomer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryBasicInfoResultCustomer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryBasicInfoResult>Customer"));
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
