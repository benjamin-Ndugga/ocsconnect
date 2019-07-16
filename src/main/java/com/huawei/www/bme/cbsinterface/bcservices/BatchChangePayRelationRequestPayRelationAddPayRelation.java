/**
 * BatchChangePayRelationRequestPayRelationAddPayRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchChangePayRelationRequestPayRelationAddPayRelation  implements java.io.Serializable {
    private java.math.BigInteger priority;

    private java.lang.String onlyPayRelFlag;

    private java.lang.String chargeCode;

    private java.lang.String controlRule;

    private com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit payLimit;

    public BatchChangePayRelationRequestPayRelationAddPayRelation() {
    }

    public BatchChangePayRelationRequestPayRelationAddPayRelation(
           java.math.BigInteger priority,
           java.lang.String onlyPayRelFlag,
           java.lang.String chargeCode,
           java.lang.String controlRule,
           com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit payLimit) {
           this.priority = priority;
           this.onlyPayRelFlag = onlyPayRelFlag;
           this.chargeCode = chargeCode;
           this.controlRule = controlRule;
           this.payLimit = payLimit;
    }


    /**
     * Gets the priority value for this BatchChangePayRelationRequestPayRelationAddPayRelation.
     * 
     * @return priority
     */
    public java.math.BigInteger getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this BatchChangePayRelationRequestPayRelationAddPayRelation.
     * 
     * @param priority
     */
    public void setPriority(java.math.BigInteger priority) {
        this.priority = priority;
    }


    /**
     * Gets the onlyPayRelFlag value for this BatchChangePayRelationRequestPayRelationAddPayRelation.
     * 
     * @return onlyPayRelFlag
     */
    public java.lang.String getOnlyPayRelFlag() {
        return onlyPayRelFlag;
    }


    /**
     * Sets the onlyPayRelFlag value for this BatchChangePayRelationRequestPayRelationAddPayRelation.
     * 
     * @param onlyPayRelFlag
     */
    public void setOnlyPayRelFlag(java.lang.String onlyPayRelFlag) {
        this.onlyPayRelFlag = onlyPayRelFlag;
    }


    /**
     * Gets the chargeCode value for this BatchChangePayRelationRequestPayRelationAddPayRelation.
     * 
     * @return chargeCode
     */
    public java.lang.String getChargeCode() {
        return chargeCode;
    }


    /**
     * Sets the chargeCode value for this BatchChangePayRelationRequestPayRelationAddPayRelation.
     * 
     * @param chargeCode
     */
    public void setChargeCode(java.lang.String chargeCode) {
        this.chargeCode = chargeCode;
    }


    /**
     * Gets the controlRule value for this BatchChangePayRelationRequestPayRelationAddPayRelation.
     * 
     * @return controlRule
     */
    public java.lang.String getControlRule() {
        return controlRule;
    }


    /**
     * Sets the controlRule value for this BatchChangePayRelationRequestPayRelationAddPayRelation.
     * 
     * @param controlRule
     */
    public void setControlRule(java.lang.String controlRule) {
        this.controlRule = controlRule;
    }


    /**
     * Gets the payLimit value for this BatchChangePayRelationRequestPayRelationAddPayRelation.
     * 
     * @return payLimit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit getPayLimit() {
        return payLimit;
    }


    /**
     * Sets the payLimit value for this BatchChangePayRelationRequestPayRelationAddPayRelation.
     * 
     * @param payLimit
     */
    public void setPayLimit(com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit payLimit) {
        this.payLimit = payLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchChangePayRelationRequestPayRelationAddPayRelation)) return false;
        BatchChangePayRelationRequestPayRelationAddPayRelation other = (BatchChangePayRelationRequestPayRelationAddPayRelation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.onlyPayRelFlag==null && other.getOnlyPayRelFlag()==null) || 
             (this.onlyPayRelFlag!=null &&
              this.onlyPayRelFlag.equals(other.getOnlyPayRelFlag()))) &&
            ((this.chargeCode==null && other.getChargeCode()==null) || 
             (this.chargeCode!=null &&
              this.chargeCode.equals(other.getChargeCode()))) &&
            ((this.controlRule==null && other.getControlRule()==null) || 
             (this.controlRule!=null &&
              this.controlRule.equals(other.getControlRule()))) &&
            ((this.payLimit==null && other.getPayLimit()==null) || 
             (this.payLimit!=null &&
              this.payLimit.equals(other.getPayLimit())));
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
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getOnlyPayRelFlag() != null) {
            _hashCode += getOnlyPayRelFlag().hashCode();
        }
        if (getChargeCode() != null) {
            _hashCode += getChargeCode().hashCode();
        }
        if (getControlRule() != null) {
            _hashCode += getControlRule().hashCode();
        }
        if (getPayLimit() != null) {
            _hashCode += getPayLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchChangePayRelationRequestPayRelationAddPayRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchChangePayRelationRequest>PayRelation>AddPayRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
        elemField.setFieldName("chargeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChargeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlRule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ControlRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>BatchChangePayRelationRequest>PayRelation>AddPayRelation>PayLimit"));
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
