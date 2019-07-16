/**
 * QueryBasicInfoResultAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryBasicInfoResultAccount  extends com.huawei.www.bme.cbsinterface.cbs.businessmgr.Account  implements java.io.Serializable {
    private java.lang.String[] subscriberNo;

    public QueryBasicInfoResultAccount() {
    }

    public QueryBasicInfoResultAccount(
           java.lang.String name,
           java.lang.String code,
           java.lang.String address,
           java.lang.String title,
           java.lang.String billcycleType,
           java.lang.Integer relationCustomer,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty,
           java.lang.String[] subscriberNo) {
        super(
            name,
            code,
            address,
            title,
            billcycleType,
            relationCustomer,
            simpleProperty);
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the subscriberNo value for this QueryBasicInfoResultAccount.
     * 
     * @return subscriberNo
     */
    public java.lang.String[] getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this QueryBasicInfoResultAccount.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String[] subscriberNo) {
        this.subscriberNo = subscriberNo;
    }

    public java.lang.String getSubscriberNo(int i) {
        return this.subscriberNo[i];
    }

    public void setSubscriberNo(int i, java.lang.String _value) {
        this.subscriberNo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBasicInfoResultAccount)) return false;
        QueryBasicInfoResultAccount other = (QueryBasicInfoResultAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              java.util.Arrays.equals(this.subscriberNo, other.getSubscriberNo())));
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
        if (getSubscriberNo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriberNo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriberNo(), i);
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
        new org.apache.axis.description.TypeDesc(QueryBasicInfoResultAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryBasicInfoResult>Account"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
