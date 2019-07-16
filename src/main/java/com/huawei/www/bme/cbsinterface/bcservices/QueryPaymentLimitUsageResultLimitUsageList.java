/**
 * QueryPaymentLimitUsageResultLimitUsageList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryPaymentLimitUsageResultLimitUsageList  implements java.io.Serializable {
    private java.lang.String payRelationKey;

    private java.math.BigInteger priority;

    private com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule payRelExtRule;

    private long limitInstID;

    private long amount;

    private long usageAmount;

    private java.lang.String limitType;

    private java.math.BigInteger currencyID;

    private java.math.BigInteger measureID;

    public QueryPaymentLimitUsageResultLimitUsageList() {
    }

    public QueryPaymentLimitUsageResultLimitUsageList(
           java.lang.String payRelationKey,
           java.math.BigInteger priority,
           com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule payRelExtRule,
           long limitInstID,
           long amount,
           long usageAmount,
           java.lang.String limitType,
           java.math.BigInteger currencyID,
           java.math.BigInteger measureID) {
           this.payRelationKey = payRelationKey;
           this.priority = priority;
           this.payRelExtRule = payRelExtRule;
           this.limitInstID = limitInstID;
           this.amount = amount;
           this.usageAmount = usageAmount;
           this.limitType = limitType;
           this.currencyID = currencyID;
           this.measureID = measureID;
    }


    /**
     * Gets the payRelationKey value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @return payRelationKey
     */
    public java.lang.String getPayRelationKey() {
        return payRelationKey;
    }


    /**
     * Sets the payRelationKey value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @param payRelationKey
     */
    public void setPayRelationKey(java.lang.String payRelationKey) {
        this.payRelationKey = payRelationKey;
    }


    /**
     * Gets the priority value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @return priority
     */
    public java.math.BigInteger getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @param priority
     */
    public void setPriority(java.math.BigInteger priority) {
        this.priority = priority;
    }


    /**
     * Gets the payRelExtRule value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @return payRelExtRule
     */
    public com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule getPayRelExtRule() {
        return payRelExtRule;
    }


    /**
     * Sets the payRelExtRule value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @param payRelExtRule
     */
    public void setPayRelExtRule(com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule payRelExtRule) {
        this.payRelExtRule = payRelExtRule;
    }


    /**
     * Gets the limitInstID value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @return limitInstID
     */
    public long getLimitInstID() {
        return limitInstID;
    }


    /**
     * Sets the limitInstID value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @param limitInstID
     */
    public void setLimitInstID(long limitInstID) {
        this.limitInstID = limitInstID;
    }


    /**
     * Gets the amount value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @return amount
     */
    public long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @param amount
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }


    /**
     * Gets the usageAmount value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @return usageAmount
     */
    public long getUsageAmount() {
        return usageAmount;
    }


    /**
     * Sets the usageAmount value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @param usageAmount
     */
    public void setUsageAmount(long usageAmount) {
        this.usageAmount = usageAmount;
    }


    /**
     * Gets the limitType value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @return limitType
     */
    public java.lang.String getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @param limitType
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }


    /**
     * Gets the currencyID value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the measureID value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @return measureID
     */
    public java.math.BigInteger getMeasureID() {
        return measureID;
    }


    /**
     * Sets the measureID value for this QueryPaymentLimitUsageResultLimitUsageList.
     * 
     * @param measureID
     */
    public void setMeasureID(java.math.BigInteger measureID) {
        this.measureID = measureID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPaymentLimitUsageResultLimitUsageList)) return false;
        QueryPaymentLimitUsageResultLimitUsageList other = (QueryPaymentLimitUsageResultLimitUsageList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payRelationKey==null && other.getPayRelationKey()==null) || 
             (this.payRelationKey!=null &&
              this.payRelationKey.equals(other.getPayRelationKey()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.payRelExtRule==null && other.getPayRelExtRule()==null) || 
             (this.payRelExtRule!=null &&
              this.payRelExtRule.equals(other.getPayRelExtRule()))) &&
            this.limitInstID == other.getLimitInstID() &&
            this.amount == other.getAmount() &&
            this.usageAmount == other.getUsageAmount() &&
            ((this.limitType==null && other.getLimitType()==null) || 
             (this.limitType!=null &&
              this.limitType.equals(other.getLimitType()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.measureID==null && other.getMeasureID()==null) || 
             (this.measureID!=null &&
              this.measureID.equals(other.getMeasureID())));
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
        if (getPayRelationKey() != null) {
            _hashCode += getPayRelationKey().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getPayRelExtRule() != null) {
            _hashCode += getPayRelExtRule().hashCode();
        }
        _hashCode += new Long(getLimitInstID()).hashCode();
        _hashCode += new Long(getAmount()).hashCode();
        _hashCode += new Long(getUsageAmount()).hashCode();
        if (getLimitType() != null) {
            _hashCode += getLimitType().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getMeasureID() != null) {
            _hashCode += getMeasureID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryPaymentLimitUsageResultLimitUsageList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryPaymentLimitUsageResult>LimitUsageList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRelationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayRelationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRelExtRule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayRelExtRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PayRelExtRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitInstID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitInstID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UsageAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "MeasureID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
