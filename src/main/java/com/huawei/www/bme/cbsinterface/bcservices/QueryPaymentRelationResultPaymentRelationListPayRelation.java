/**
 * QueryPaymentRelationResultPaymentRelationListPayRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryPaymentRelationResultPaymentRelationListPayRelation  implements java.io.Serializable {
    private java.lang.String payRelationKey;

    /* Y/N */
    private java.lang.String defaultPayFlag;

    private java.lang.String acctKey;

    private java.lang.String payObjType;

    private java.lang.String payObjKey;

    private java.lang.String payObjCode;

    private java.math.BigInteger priority;

    private com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule payRelExtRule;

    private java.lang.String onlyPayRelFlag;

    private java.lang.String paymentLimitKey;

    private java.lang.String originType;

    private java.lang.String originKey;

    private java.lang.String effectiveTime;

    private java.lang.String expirationTime;

    public QueryPaymentRelationResultPaymentRelationListPayRelation() {
    }

    public QueryPaymentRelationResultPaymentRelationListPayRelation(
           java.lang.String payRelationKey,
           java.lang.String defaultPayFlag,
           java.lang.String acctKey,
           java.lang.String payObjType,
           java.lang.String payObjKey,
           java.lang.String payObjCode,
           java.math.BigInteger priority,
           com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule payRelExtRule,
           java.lang.String onlyPayRelFlag,
           java.lang.String paymentLimitKey,
           java.lang.String originType,
           java.lang.String originKey,
           java.lang.String effectiveTime,
           java.lang.String expirationTime) {
           this.payRelationKey = payRelationKey;
           this.defaultPayFlag = defaultPayFlag;
           this.acctKey = acctKey;
           this.payObjType = payObjType;
           this.payObjKey = payObjKey;
           this.payObjCode = payObjCode;
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
     * Gets the payRelationKey value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @return payRelationKey
     */
    public java.lang.String getPayRelationKey() {
        return payRelationKey;
    }


    /**
     * Sets the payRelationKey value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @param payRelationKey
     */
    public void setPayRelationKey(java.lang.String payRelationKey) {
        this.payRelationKey = payRelationKey;
    }


    /**
     * Gets the defaultPayFlag value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @return defaultPayFlag   * Y/N
     */
    public java.lang.String getDefaultPayFlag() {
        return defaultPayFlag;
    }


    /**
     * Sets the defaultPayFlag value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @param defaultPayFlag   * Y/N
     */
    public void setDefaultPayFlag(java.lang.String defaultPayFlag) {
        this.defaultPayFlag = defaultPayFlag;
    }


    /**
     * Gets the acctKey value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @return acctKey
     */
    public java.lang.String getAcctKey() {
        return acctKey;
    }


    /**
     * Sets the acctKey value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @param acctKey
     */
    public void setAcctKey(java.lang.String acctKey) {
        this.acctKey = acctKey;
    }


    /**
     * Gets the payObjType value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @return payObjType
     */
    public java.lang.String getPayObjType() {
        return payObjType;
    }


    /**
     * Sets the payObjType value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @param payObjType
     */
    public void setPayObjType(java.lang.String payObjType) {
        this.payObjType = payObjType;
    }


    /**
     * Gets the payObjKey value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @return payObjKey
     */
    public java.lang.String getPayObjKey() {
        return payObjKey;
    }


    /**
     * Sets the payObjKey value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @param payObjKey
     */
    public void setPayObjKey(java.lang.String payObjKey) {
        this.payObjKey = payObjKey;
    }


    /**
     * Gets the payObjCode value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @return payObjCode
     */
    public java.lang.String getPayObjCode() {
        return payObjCode;
    }


    /**
     * Sets the payObjCode value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @param payObjCode
     */
    public void setPayObjCode(java.lang.String payObjCode) {
        this.payObjCode = payObjCode;
    }


    /**
     * Gets the priority value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @return priority
     */
    public java.math.BigInteger getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @param priority
     */
    public void setPriority(java.math.BigInteger priority) {
        this.priority = priority;
    }


    /**
     * Gets the payRelExtRule value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @return payRelExtRule
     */
    public com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule getPayRelExtRule() {
        return payRelExtRule;
    }


    /**
     * Sets the payRelExtRule value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @param payRelExtRule
     */
    public void setPayRelExtRule(com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule payRelExtRule) {
        this.payRelExtRule = payRelExtRule;
    }


    /**
     * Gets the onlyPayRelFlag value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @return onlyPayRelFlag
     */
    public java.lang.String getOnlyPayRelFlag() {
        return onlyPayRelFlag;
    }


    /**
     * Sets the onlyPayRelFlag value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @param onlyPayRelFlag
     */
    public void setOnlyPayRelFlag(java.lang.String onlyPayRelFlag) {
        this.onlyPayRelFlag = onlyPayRelFlag;
    }


    /**
     * Gets the paymentLimitKey value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @return paymentLimitKey
     */
    public java.lang.String getPaymentLimitKey() {
        return paymentLimitKey;
    }


    /**
     * Sets the paymentLimitKey value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @param paymentLimitKey
     */
    public void setPaymentLimitKey(java.lang.String paymentLimitKey) {
        this.paymentLimitKey = paymentLimitKey;
    }


    /**
     * Gets the originType value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @return originType
     */
    public java.lang.String getOriginType() {
        return originType;
    }


    /**
     * Sets the originType value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @param originType
     */
    public void setOriginType(java.lang.String originType) {
        this.originType = originType;
    }


    /**
     * Gets the originKey value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @return originKey
     */
    public java.lang.String getOriginKey() {
        return originKey;
    }


    /**
     * Sets the originKey value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @param originKey
     */
    public void setOriginKey(java.lang.String originKey) {
        this.originKey = originKey;
    }


    /**
     * Gets the effectiveTime value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @return effectiveTime
     */
    public java.lang.String getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(java.lang.String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the expirationTime value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @return expirationTime
     */
    public java.lang.String getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this QueryPaymentRelationResultPaymentRelationListPayRelation.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(java.lang.String expirationTime) {
        this.expirationTime = expirationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPaymentRelationResultPaymentRelationListPayRelation)) return false;
        QueryPaymentRelationResultPaymentRelationListPayRelation other = (QueryPaymentRelationResultPaymentRelationListPayRelation) obj;
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
            ((this.defaultPayFlag==null && other.getDefaultPayFlag()==null) || 
             (this.defaultPayFlag!=null &&
              this.defaultPayFlag.equals(other.getDefaultPayFlag()))) &&
            ((this.acctKey==null && other.getAcctKey()==null) || 
             (this.acctKey!=null &&
              this.acctKey.equals(other.getAcctKey()))) &&
            ((this.payObjType==null && other.getPayObjType()==null) || 
             (this.payObjType!=null &&
              this.payObjType.equals(other.getPayObjType()))) &&
            ((this.payObjKey==null && other.getPayObjKey()==null) || 
             (this.payObjKey!=null &&
              this.payObjKey.equals(other.getPayObjKey()))) &&
            ((this.payObjCode==null && other.getPayObjCode()==null) || 
             (this.payObjCode!=null &&
              this.payObjCode.equals(other.getPayObjCode()))) &&
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
        if (getDefaultPayFlag() != null) {
            _hashCode += getDefaultPayFlag().hashCode();
        }
        if (getAcctKey() != null) {
            _hashCode += getAcctKey().hashCode();
        }
        if (getPayObjType() != null) {
            _hashCode += getPayObjType().hashCode();
        }
        if (getPayObjKey() != null) {
            _hashCode += getPayObjKey().hashCode();
        }
        if (getPayObjCode() != null) {
            _hashCode += getPayObjCode().hashCode();
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
        new org.apache.axis.description.TypeDesc(QueryPaymentRelationResultPaymentRelationListPayRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryPaymentRelationResult>PaymentRelationList>PayRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRelationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayRelationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPayFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DefaultPayFlag"));
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
        elemField.setFieldName("payObjType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayObjType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payObjKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayObjKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payObjCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayObjCode"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
