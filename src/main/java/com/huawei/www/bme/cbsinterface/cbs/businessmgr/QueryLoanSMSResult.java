/**
 * QueryLoanSMSResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryLoanSMSResult  implements java.io.Serializable {
    private java.lang.String subscirberNo;

    private int SMSAmount;

    public QueryLoanSMSResult() {
    }

    public QueryLoanSMSResult(
           java.lang.String subscirberNo,
           int SMSAmount) {
           this.subscirberNo = subscirberNo;
           this.SMSAmount = SMSAmount;
    }


    /**
     * Gets the subscirberNo value for this QueryLoanSMSResult.
     * 
     * @return subscirberNo
     */
    public java.lang.String getSubscirberNo() {
        return subscirberNo;
    }


    /**
     * Sets the subscirberNo value for this QueryLoanSMSResult.
     * 
     * @param subscirberNo
     */
    public void setSubscirberNo(java.lang.String subscirberNo) {
        this.subscirberNo = subscirberNo;
    }


    /**
     * Gets the SMSAmount value for this QueryLoanSMSResult.
     * 
     * @return SMSAmount
     */
    public int getSMSAmount() {
        return SMSAmount;
    }


    /**
     * Sets the SMSAmount value for this QueryLoanSMSResult.
     * 
     * @param SMSAmount
     */
    public void setSMSAmount(int SMSAmount) {
        this.SMSAmount = SMSAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryLoanSMSResult)) return false;
        QueryLoanSMSResult other = (QueryLoanSMSResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscirberNo==null && other.getSubscirberNo()==null) || 
             (this.subscirberNo!=null &&
              this.subscirberNo.equals(other.getSubscirberNo()))) &&
            this.SMSAmount == other.getSMSAmount();
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
        if (getSubscirberNo() != null) {
            _hashCode += getSubscirberNo().hashCode();
        }
        _hashCode += getSMSAmount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryLoanSMSResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryLoanSMSResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscirberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscirberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SMSAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
