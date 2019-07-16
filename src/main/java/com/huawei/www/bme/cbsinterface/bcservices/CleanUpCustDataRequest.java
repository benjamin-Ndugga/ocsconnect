/**
 * CleanUpCustDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class CleanUpCustDataRequest  implements java.io.Serializable {
    /* The customer key of root register customer. */
    private java.lang.String registerCustKey;

    public CleanUpCustDataRequest() {
    }

    public CleanUpCustDataRequest(
           java.lang.String registerCustKey) {
           this.registerCustKey = registerCustKey;
    }


    /**
     * Gets the registerCustKey value for this CleanUpCustDataRequest.
     * 
     * @return registerCustKey   * The customer key of root register customer.
     */
    public java.lang.String getRegisterCustKey() {
        return registerCustKey;
    }


    /**
     * Sets the registerCustKey value for this CleanUpCustDataRequest.
     * 
     * @param registerCustKey   * The customer key of root register customer.
     */
    public void setRegisterCustKey(java.lang.String registerCustKey) {
        this.registerCustKey = registerCustKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CleanUpCustDataRequest)) return false;
        CleanUpCustDataRequest other = (CleanUpCustDataRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registerCustKey==null && other.getRegisterCustKey()==null) || 
             (this.registerCustKey!=null &&
              this.registerCustKey.equals(other.getRegisterCustKey())));
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
        if (getRegisterCustKey() != null) {
            _hashCode += getRegisterCustKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CleanUpCustDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CleanUpCustDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerCustKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RegisterCustKey"));
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
