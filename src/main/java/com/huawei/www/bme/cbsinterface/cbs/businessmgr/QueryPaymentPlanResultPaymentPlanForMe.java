/**
 * QueryPaymentPlanResultPaymentPlanForMe.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryPaymentPlanResultPaymentPlanForMe  implements java.io.Serializable {
    private java.lang.String srcSubNo;

    private java.lang.String feeGroup;

    private java.lang.String accountType;

    private int limitValue;

    private int priority;

    private int paymentPlanKey;

    public QueryPaymentPlanResultPaymentPlanForMe() {
    }

    public QueryPaymentPlanResultPaymentPlanForMe(
           java.lang.String srcSubNo,
           java.lang.String feeGroup,
           java.lang.String accountType,
           int limitValue,
           int priority,
           int paymentPlanKey) {
           this.srcSubNo = srcSubNo;
           this.feeGroup = feeGroup;
           this.accountType = accountType;
           this.limitValue = limitValue;
           this.priority = priority;
           this.paymentPlanKey = paymentPlanKey;
    }


    /**
     * Gets the srcSubNo value for this QueryPaymentPlanResultPaymentPlanForMe.
     * 
     * @return srcSubNo
     */
    public java.lang.String getSrcSubNo() {
        return srcSubNo;
    }


    /**
     * Sets the srcSubNo value for this QueryPaymentPlanResultPaymentPlanForMe.
     * 
     * @param srcSubNo
     */
    public void setSrcSubNo(java.lang.String srcSubNo) {
        this.srcSubNo = srcSubNo;
    }


    /**
     * Gets the feeGroup value for this QueryPaymentPlanResultPaymentPlanForMe.
     * 
     * @return feeGroup
     */
    public java.lang.String getFeeGroup() {
        return feeGroup;
    }


    /**
     * Sets the feeGroup value for this QueryPaymentPlanResultPaymentPlanForMe.
     * 
     * @param feeGroup
     */
    public void setFeeGroup(java.lang.String feeGroup) {
        this.feeGroup = feeGroup;
    }


    /**
     * Gets the accountType value for this QueryPaymentPlanResultPaymentPlanForMe.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this QueryPaymentPlanResultPaymentPlanForMe.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the limitValue value for this QueryPaymentPlanResultPaymentPlanForMe.
     * 
     * @return limitValue
     */
    public int getLimitValue() {
        return limitValue;
    }


    /**
     * Sets the limitValue value for this QueryPaymentPlanResultPaymentPlanForMe.
     * 
     * @param limitValue
     */
    public void setLimitValue(int limitValue) {
        this.limitValue = limitValue;
    }


    /**
     * Gets the priority value for this QueryPaymentPlanResultPaymentPlanForMe.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this QueryPaymentPlanResultPaymentPlanForMe.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the paymentPlanKey value for this QueryPaymentPlanResultPaymentPlanForMe.
     * 
     * @return paymentPlanKey
     */
    public int getPaymentPlanKey() {
        return paymentPlanKey;
    }


    /**
     * Sets the paymentPlanKey value for this QueryPaymentPlanResultPaymentPlanForMe.
     * 
     * @param paymentPlanKey
     */
    public void setPaymentPlanKey(int paymentPlanKey) {
        this.paymentPlanKey = paymentPlanKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPaymentPlanResultPaymentPlanForMe)) return false;
        QueryPaymentPlanResultPaymentPlanForMe other = (QueryPaymentPlanResultPaymentPlanForMe) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.srcSubNo==null && other.getSrcSubNo()==null) || 
             (this.srcSubNo!=null &&
              this.srcSubNo.equals(other.getSrcSubNo()))) &&
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
        if (getSrcSubNo() != null) {
            _hashCode += getSrcSubNo().hashCode();
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
        new org.apache.axis.description.TypeDesc(QueryPaymentPlanResultPaymentPlanForMe.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryPaymentPlanResult>PaymentPlanForMe"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcSubNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SrcSubNo"));
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
