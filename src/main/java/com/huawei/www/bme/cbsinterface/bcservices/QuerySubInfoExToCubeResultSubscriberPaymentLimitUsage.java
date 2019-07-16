/**
 * QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage  implements java.io.Serializable {
    private long amount;

    private long usedAmount;

    private java.lang.String limitType;

    public QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage() {
    }

    public QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage(
           long amount,
           long usedAmount,
           java.lang.String limitType) {
           this.amount = amount;
           this.usedAmount = usedAmount;
           this.limitType = limitType;
    }


    /**
     * Gets the amount value for this QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage.
     * 
     * @return amount
     */
    public long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage.
     * 
     * @param amount
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }


    /**
     * Gets the usedAmount value for this QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage.
     * 
     * @return usedAmount
     */
    public long getUsedAmount() {
        return usedAmount;
    }


    /**
     * Sets the usedAmount value for this QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage.
     * 
     * @param usedAmount
     */
    public void setUsedAmount(long usedAmount) {
        this.usedAmount = usedAmount;
    }


    /**
     * Gets the limitType value for this QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage.
     * 
     * @return limitType
     */
    public java.lang.String getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage.
     * 
     * @param limitType
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage)) return false;
        QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage other = (QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.amount == other.getAmount() &&
            this.usedAmount == other.getUsedAmount() &&
            ((this.limitType==null && other.getLimitType()==null) || 
             (this.limitType!=null &&
              this.limitType.equals(other.getLimitType())));
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
        _hashCode += new Long(getAmount()).hashCode();
        _hashCode += new Long(getUsedAmount()).hashCode();
        if (getLimitType() != null) {
            _hashCode += getLimitType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInfoExToCubeResult>Subscriber>PaymentLimitUsage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UsedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitType"));
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
