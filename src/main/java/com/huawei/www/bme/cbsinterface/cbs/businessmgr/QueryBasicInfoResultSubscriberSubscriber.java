/**
 * QueryBasicInfoResultSubscriberSubscriber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryBasicInfoResultSubscriberSubscriber  extends com.huawei.www.bme.cbsinterface.cbs.businessmgr.Subscriber  implements java.io.Serializable {
    public QueryBasicInfoResultSubscriberSubscriber() {
    }

    public QueryBasicInfoResultSubscriberSubscriber(
           java.lang.String code,
           java.lang.String brandId,
           java.lang.String registrationTime,
           java.lang.String lang,
           java.lang.String SMSLang,
           java.lang.String USSDLang,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.Paymode paidMode,
           java.lang.Integer initialCredit,
           java.lang.String belToAreaID,
           java.lang.String mainProductID,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty,
           java.lang.String lastRechargeTime,
           java.lang.String lastCallTime,
           java.lang.Integer SMSAmount,
           java.lang.String IMSI) {
        super(
            code,
            brandId,
            registrationTime,
            lang,
            SMSLang,
            USSDLang,
            paidMode,
            initialCredit,
            belToAreaID,
            mainProductID,
            simpleProperty,
            lastRechargeTime,
            lastCallTime,
            SMSAmount,
            IMSI);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBasicInfoResultSubscriberSubscriber)) return false;
        QueryBasicInfoResultSubscriberSubscriber other = (QueryBasicInfoResultSubscriberSubscriber) obj;
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
        new org.apache.axis.description.TypeDesc(QueryBasicInfoResultSubscriberSubscriber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>QueryBasicInfoResult>Subscriber>Subscriber"));
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
