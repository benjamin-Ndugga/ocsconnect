/**
 * ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation  implements java.io.Serializable {
    private java.lang.String payRelationKey;

    private java.lang.String acctKey;

    private java.math.BigInteger priority;

    private com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule payRelExtRule;

    private java.lang.String onlyPayRelFlag;

    private java.lang.String paymentLimitKey;

    private java.lang.String originType;

    private java.lang.String originKey;

    private com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime;

    private java.lang.String expirationTime;

    public ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation() {
    }

    public ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation(
           java.lang.String payRelationKey,
           java.lang.String acctKey,
           java.math.BigInteger priority,
           com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule payRelExtRule,
           java.lang.String onlyPayRelFlag,
           java.lang.String paymentLimitKey,
           java.lang.String originType,
           java.lang.String originKey,
           com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime,
           java.lang.String expirationTime) {
           this.payRelationKey = payRelationKey;
           this.acctKey = acctKey;
           this.priority = priority;
           this.payRelExtRule = payRelExtRule;
           this.onlyPayRelFlag = onlyPayRelFlag;
           this.paymentLimitKey = paymentLimitKey;
           this.originType = originType;
           this.originKey = originKey;
           this.effectiveTime = effectiveTime;
           this.expirationTime = expirationTime;
    }


    /**
     * Gets the payRelationKey value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @return payRelationKey
     */
    public java.lang.String getPayRelationKey() {
        return payRelationKey;
    }


    /**
     * Sets the payRelationKey value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @param payRelationKey
     */
    public void setPayRelationKey(java.lang.String payRelationKey) {
        this.payRelationKey = payRelationKey;
    }


    /**
     * Gets the acctKey value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @return acctKey
     */
    public java.lang.String getAcctKey() {
        return acctKey;
    }


    /**
     * Sets the acctKey value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @param acctKey
     */
    public void setAcctKey(java.lang.String acctKey) {
        this.acctKey = acctKey;
    }


    /**
     * Gets the priority value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @return priority
     */
    public java.math.BigInteger getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @param priority
     */
    public void setPriority(java.math.BigInteger priority) {
        this.priority = priority;
    }


    /**
     * Gets the payRelExtRule value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @return payRelExtRule
     */
    public com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule getPayRelExtRule() {
        return payRelExtRule;
    }


    /**
     * Sets the payRelExtRule value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @param payRelExtRule
     */
    public void setPayRelExtRule(com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule payRelExtRule) {
        this.payRelExtRule = payRelExtRule;
    }


    /**
     * Gets the onlyPayRelFlag value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @return onlyPayRelFlag
     */
    public java.lang.String getOnlyPayRelFlag() {
        return onlyPayRelFlag;
    }


    /**
     * Sets the onlyPayRelFlag value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @param onlyPayRelFlag
     */
    public void setOnlyPayRelFlag(java.lang.String onlyPayRelFlag) {
        this.onlyPayRelFlag = onlyPayRelFlag;
    }


    /**
     * Gets the paymentLimitKey value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @return paymentLimitKey
     */
    public java.lang.String getPaymentLimitKey() {
        return paymentLimitKey;
    }


    /**
     * Sets the paymentLimitKey value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @param paymentLimitKey
     */
    public void setPaymentLimitKey(java.lang.String paymentLimitKey) {
        this.paymentLimitKey = paymentLimitKey;
    }


    /**
     * Gets the originType value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @return originType
     */
    public java.lang.String getOriginType() {
        return originType;
    }


    /**
     * Sets the originType value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @param originType
     */
    public void setOriginType(java.lang.String originType) {
        this.originType = originType;
    }


    /**
     * Gets the originKey value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @return originKey
     */
    public java.lang.String getOriginKey() {
        return originKey;
    }


    /**
     * Sets the originKey value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @param originKey
     */
    public void setOriginKey(java.lang.String originKey) {
        this.originKey = originKey;
    }


    /**
     * Gets the effectiveTime value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @return effectiveTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.EffectMode getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the expirationTime value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @return expirationTime
     */
    public java.lang.String getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(java.lang.String expirationTime) {
        this.expirationTime = expirationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation)) return false;
        ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation other = (ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation) obj;
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
            ((this.acctKey==null && other.getAcctKey()==null) || 
             (this.acctKey!=null &&
              this.acctKey.equals(other.getAcctKey()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.payRelExtRule==null && other.getPayRelExtRule()==null) || 
             (this.payRelExtRule!=null &&
              this.payRelExtRule.equals(other.getPayRelExtRule()))) &&
            ((this.onlyPayRelFlag==null && other.getOnlyPayRelFlag()==null) || 
             (this.onlyPayRelFlag!=null &&
              this.onlyPayRelFlag.equals(other.getOnlyPayRelFlag()))) &&
            ((this.paymentLimitKey==null && other.getPaymentLimitKey()==null) || 
             (this.paymentLimitKey!=null &&
              this.paymentLimitKey.equals(other.getPaymentLimitKey()))) &&
            ((this.originType==null && other.getOriginType()==null) || 
             (this.originType!=null &&
              this.originType.equals(other.getOriginType()))) &&
            ((this.originKey==null && other.getOriginKey()==null) || 
             (this.originKey!=null &&
              this.originKey.equals(other.getOriginKey()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime()))) &&
            ((this.expirationTime==null && other.getExpirationTime()==null) || 
             (this.expirationTime!=null &&
              this.expirationTime.equals(other.getExpirationTime())));
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
        if (getAcctKey() != null) {
            _hashCode += getAcctKey().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getPayRelExtRule() != null) {
            _hashCode += getPayRelExtRule().hashCode();
        }
        if (getOnlyPayRelFlag() != null) {
            _hashCode += getOnlyPayRelFlag().hashCode();
        }
        if (getPaymentLimitKey() != null) {
            _hashCode += getPaymentLimitKey().hashCode();
        }
        if (getOriginType() != null) {
            _hashCode += getOriginType().hashCode();
        }
        if (getOriginKey() != null) {
            _hashCode += getOriginKey().hashCode();
        }
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        if (getExpirationTime() != null) {
            _hashCode += getExpirationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePayRelationRequestPaymentRelationAddPayRelationPayRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangePayRelationRequest>PaymentRelation>AddPayRelation>PayRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRelationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayRelationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctKey"));
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
        elemField.setFieldName("onlyPayRelFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OnlyPayRelFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentLimitKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentLimitKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OriginType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OriginKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "EffectMode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpirationTime"));
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
