/**
 * DelStatementRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class DelStatementRequest  implements java.io.Serializable {
    /* The customer key of root register customer. */
    private com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode registerCust;

    private java.lang.String smtKey;

    public DelStatementRequest() {
    }

    public DelStatementRequest(
           com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode registerCust,
           java.lang.String smtKey) {
           this.registerCust = registerCust;
           this.smtKey = smtKey;
    }


    /**
     * Gets the registerCust value for this DelStatementRequest.
     * 
     * @return registerCust   * The customer key of root register customer.
     */
    public com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode getRegisterCust() {
        return registerCust;
    }


    /**
     * Sets the registerCust value for this DelStatementRequest.
     * 
     * @param registerCust   * The customer key of root register customer.
     */
    public void setRegisterCust(com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode registerCust) {
        this.registerCust = registerCust;
    }


    /**
     * Gets the smtKey value for this DelStatementRequest.
     * 
     * @return smtKey
     */
    public java.lang.String getSmtKey() {
        return smtKey;
    }


    /**
     * Sets the smtKey value for this DelStatementRequest.
     * 
     * @param smtKey
     */
    public void setSmtKey(java.lang.String smtKey) {
        this.smtKey = smtKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelStatementRequest)) return false;
        DelStatementRequest other = (DelStatementRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registerCust==null && other.getRegisterCust()==null) || 
             (this.registerCust!=null &&
              this.registerCust.equals(other.getRegisterCust()))) &&
            ((this.smtKey==null && other.getSmtKey()==null) || 
             (this.smtKey!=null &&
              this.smtKey.equals(other.getSmtKey())));
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
        if (getRegisterCust() != null) {
            _hashCode += getRegisterCust().hashCode();
        }
        if (getSmtKey() != null) {
            _hashCode += getSmtKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelStatementRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelStatementRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerCust");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RegisterCust"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smtKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SmtKey"));
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
