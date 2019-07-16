/**
 * ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation  implements java.io.Serializable {
    private java.lang.String payRelationKey;

    private java.lang.String acctKey;

    private java.math.BigInteger priority;

    private com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule payRelExtRule;

    private java.lang.String onlyPayRelFlag;

    private java.lang.String paymentLimitKey;

    public ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation() {
    }

    public ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation(
           java.lang.String payRelationKey,
           java.lang.String acctKey,
           java.math.BigInteger priority,
           com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule payRelExtRule,
           java.lang.String onlyPayRelFlag,
           java.lang.String paymentLimitKey) {
           this.payRelationKey = payRelationKey;
           this.acctKey = acctKey;
           this.priority = priority;
           this.payRelExtRule = payRelExtRule;
           this.onlyPayRelFlag = onlyPayRelFlag;
           this.paymentLimitKey = paymentLimitKey;
    }


    /**
     * Gets the payRelationKey value for this ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation.
     * 
     * @return payRelationKey
     */
    public java.lang.String getPayRelationKey() {
        return payRelationKey;
    }


    /**
     * Sets the payRelationKey value for this ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation.
     * 
     * @param payRelationKey
     */
    public void setPayRelationKey(java.lang.String payRelationKey) {
        this.payRelationKey = payRelationKey;
    }


    /**
     * Gets the acctKey value for this ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation.
     * 
     * @return acctKey
     */
    public java.lang.String getAcctKey() {
        return acctKey;
    }


    /**
     * Sets the acctKey value for this ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation.
     * 
     * @param acctKey
     */
    public void setAcctKey(java.lang.String acctKey) {
        this.acctKey = acctKey;
    }


    /**
     * Gets the priority value for this ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation.
     * 
     * @return priority
     */
    public java.math.BigInteger getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation.
     * 
     * @param priority
     */
    public void setPriority(java.math.BigInteger priority) {
        this.priority = priority;
    }


    /**
     * Gets the payRelExtRule value for this ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation.
     * 
     * @return payRelExtRule
     */
    public com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule getPayRelExtRule() {
        return payRelExtRule;
    }


    /**
     * Sets the payRelExtRule value for this ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation.
     * 
     * @param payRelExtRule
     */
    public void setPayRelExtRule(com.huawei.www.bme.cbsinterface.bccommon.PayRelExtRule payRelExtRule) {
        this.payRelExtRule = payRelExtRule;
    }


    /**
     * Gets the onlyPayRelFlag value for this ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation.
     * 
     * @return onlyPayRelFlag
     */
    public java.lang.String getOnlyPayRelFlag() {
        return onlyPayRelFlag;
    }


    /**
     * Sets the onlyPayRelFlag value for this ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation.
     * 
     * @param onlyPayRelFlag
     */
    public void setOnlyPayRelFlag(java.lang.String onlyPayRelFlag) {
        this.onlyPayRelFlag = onlyPayRelFlag;
    }


    /**
     * Gets the paymentLimitKey value for this ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation.
     * 
     * @return paymentLimitKey
     */
    public java.lang.String getPaymentLimitKey() {
        return paymentLimitKey;
    }


    /**
     * Sets the paymentLimitKey value for this ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation.
     * 
     * @param paymentLimitKey
     */
    public void setPaymentLimitKey(java.lang.String paymentLimitKey) {
        this.paymentLimitKey = paymentLimitKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation)) return false;
        ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation other = (ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation) obj;
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
              this.paymentLimitKey.equals(other.getPaymentLimitKey())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelationAddPayRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubPaymentModeRequest>PaymentModeChange>DFTPayRelation>AddPayRelation"));
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
        elemField.setMinOccurs(0);
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
