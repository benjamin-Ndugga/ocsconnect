/**
 * QueryPaymentPlanResultPaymentPlanForOther.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryPaymentPlanResultPaymentPlanForOther  implements java.io.Serializable {
    private java.lang.String destSubNo;

    private java.lang.String feeGroup;

    private java.lang.String accountType;

    private int limitValue;

    private int priority;

    private int paymentPlanKey;

    public QueryPaymentPlanResultPaymentPlanForOther() {
    }

    public QueryPaymentPlanResultPaymentPlanForOther(
           java.lang.String destSubNo,
           java.lang.String feeGroup,
           java.lang.String accountType,
           int limitValue,
           int priority,
           int paymentPlanKey) {
           this.destSubNo = destSubNo;
           this.feeGroup = feeGroup;
           this.accountType = accountType;
           this.limitValue = limitValue;
           this.priority = priority;
           this.paymentPlanKey = paymentPlanKey;
    }


    /**
     * Gets the destSubNo value for this QueryPaymentPlanResultPaymentPlanForOther.
     * 
     * @return destSubNo
     */
    public java.lang.String getDestSubNo() {
        return destSubNo;
    }


    /**
     * Sets the destSubNo value for this QueryPaymentPlanResultPaymentPlanForOther.
     * 
     * @param destSubNo
     */
    public void setDestSubNo(java.lang.String destSubNo) {
        this.destSubNo = destSubNo;
    }


    /**
     * Gets the feeGroup value for this QueryPaymentPlanResultPaymentPlanForOther.
     * 
     * @return feeGroup
     */
    public java.lang.String getFeeGroup() {
        return feeGroup;
    }


    /**
     * Sets the feeGroup value for this QueryPaymentPlanResultPaymentPlanForOther.
     * 
     * @param feeGroup
     */
    public void setFeeGroup(java.lang.String feeGroup) {
        this.feeGroup = feeGroup;
    }


    /**
     * Gets the accountType value for this QueryPaymentPlanResultPaymentPlanForOther.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this QueryPaymentPlanResultPaymentPlanForOther.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the limitValue value for this QueryPaymentPlanResultPaymentPlanForOther.
     * 
     * @return limitValue
     */
    public int getLimitValue() {
        return limitValue;
    }


    /**
     * Sets the limitValue value for this QueryPaymentPlanResultPaymentPlanForOther.
     * 
     * @param limitValue
     */
    public void setLimitValue(int limitValue) {
        this.limitValue = limitValue;
    }


    /**
     * Gets the priority value for this QueryPaymentPlanResultPaymentPlanForOther.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this QueryPaymentPlanResultPaymentPlanForOther.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the paymentPlanKey value for this QueryPaymentPlanResultPaymentPlanForOther.
     * 
     * @return paymentPlanKey
     */
    public int getPaymentPlanKey() {
        return paymentPlanKey;
    }


    /**
     * Sets the paymentPlanKey value for this QueryPaymentPlanResultPaymentPlanForOther.
     * 
     * @param paymentPlanKey
     */
    public void setPaymentPlanKey(int paymentPlanKey) {
        this.paymentPlanKey = paymentPlanKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPaymentPlanResultPaymentPlanForOther)) return false;
        QueryPaymentPlanResultPaymentPlanForOther other = (QueryPaymentPlanResultPaymentPlanForOther) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.destSubNo==null && other.getDestSubNo()==null) || 
             (this.destSubNo!=null &&
              this.destSubNo.equals(other.getDestSubNo()))) &&
            ((this.feeGroup==null && other.getFeeGroup()==null) || 
             (this.feeGroup!=null &&
              this.feeGroup.equals(other.getFeeGroup()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            this.limitValue == other.getLimitValue() &&
            this.priority == other.getPriority() &&
            this.paymentPlanKey == other.getPaymentPlanKey();
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
        if (getDestSubNo() != null) {
            _hashCode += getDestSubNo().hashCode();
        }
        if (getFeeGroup() != null) {
            _hashCode += getFeeGroup().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        _hashCode += getLimitValue();
        _hashCode += getPriority();
        _hashCode += getPaymentPlanKey();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryPaymentPlanResultPaymentPlanForOther.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryPaymentPlanResult>PaymentPlanForOther"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destSubNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "DestSubNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "FeeGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "LimitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentPlanKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "PaymentPlanKey"));
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
