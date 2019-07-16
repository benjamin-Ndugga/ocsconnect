/**
 * QueryUnbilledAmountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryUnbilledAmountRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountRequestAcctAccessCode acctAccessCode;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountRequestChargeObj chargeObj;

    public QueryUnbilledAmountRequest() {
    }

    public QueryUnbilledAmountRequest(
           com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountRequestAcctAccessCode acctAccessCode,
           com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountRequestChargeObj chargeObj) {
           this.acctAccessCode = acctAccessCode;
           this.chargeObj = chargeObj;
    }


    /**
     * Gets the acctAccessCode value for this QueryUnbilledAmountRequest.
     * 
     * @return acctAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountRequestAcctAccessCode getAcctAccessCode() {
        return acctAccessCode;
    }


    /**
     * Sets the acctAccessCode value for this QueryUnbilledAmountRequest.
     * 
     * @param acctAccessCode
     */
    public void setAcctAccessCode(com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountRequestAcctAccessCode acctAccessCode) {
        this.acctAccessCode = acctAccessCode;
    }


    /**
     * Gets the chargeObj value for this QueryUnbilledAmountRequest.
     * 
     * @return chargeObj
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountRequestChargeObj getChargeObj() {
        return chargeObj;
    }


    /**
     * Sets the chargeObj value for this QueryUnbilledAmountRequest.
     * 
     * @param chargeObj
     */
    public void setChargeObj(com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountRequestChargeObj chargeObj) {
        this.chargeObj = chargeObj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryUnbilledAmountRequest)) return false;
        QueryUnbilledAmountRequest other = (QueryUnbilledAmountRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctAccessCode==null && other.getAcctAccessCode()==null) || 
             (this.acctAccessCode!=null &&
              this.acctAccessCode.equals(other.getAcctAccessCode()))) &&
            ((this.chargeObj==null && other.getChargeObj()==null) || 
             (this.chargeObj!=null &&
              this.chargeObj.equals(other.getChargeObj())));
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
        if (getAcctAccessCode() != null) {
            _hashCode += getAcctAccessCode().hashCode();
        }
        if (getChargeObj() != null) {
            _hashCode += getChargeObj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryUnbilledAmountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryUnbilledAmountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AcctAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryUnbilledAmountRequest>AcctAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ChargeObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryUnbilledAmountRequest>ChargeObj"));
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
