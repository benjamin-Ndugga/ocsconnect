/**
 * ChangePaymentPlanRequestPaymentPlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ChangePaymentPlanRequestPaymentPlan  implements java.io.Serializable {
    private java.lang.String destSubNo;

    private java.lang.String accountType;

    private java.lang.Integer limitValue;

    private java.lang.Integer priority;

    private java.lang.String feegroup;

    /* Add/Delete/Modify */
    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.OperationType operationType;

    private java.lang.Integer paymentPlanKey;

    public ChangePaymentPlanRequestPaymentPlan() {
    }

    public ChangePaymentPlanRequestPaymentPlan(
           java.lang.String destSubNo,
           java.lang.String accountType,
           java.lang.Integer limitValue,
           java.lang.Integer priority,
           java.lang.String feegroup,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.OperationType operationType,
           java.lang.Integer paymentPlanKey) {
           this.destSubNo = destSubNo;
           this.accountType = accountType;
           this.limitValue = limitValue;
           this.priority = priority;
           this.feegroup = feegroup;
           this.operationType = operationType;
           this.paymentPlanKey = paymentPlanKey;
    }


    /**
     * Gets the destSubNo value for this ChangePaymentPlanRequestPaymentPlan.
     * 
     * @return destSubNo
     */
    public java.lang.String getDestSubNo() {
        return destSubNo;
    }


    /**
     * Sets the destSubNo value for this ChangePaymentPlanRequestPaymentPlan.
     * 
     * @param destSubNo
     */
    public void setDestSubNo(java.lang.String destSubNo) {
        this.destSubNo = destSubNo;
    }


    /**
     * Gets the accountType value for this ChangePaymentPlanRequestPaymentPlan.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this ChangePaymentPlanRequestPaymentPlan.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the limitValue value for this ChangePaymentPlanRequestPaymentPlan.
     * 
     * @return limitValue
     */
    public java.lang.Integer getLimitValue() {
        return limitValue;
    }


    /**
     * Sets the limitValue value for this ChangePaymentPlanRequestPaymentPlan.
     * 
     * @param limitValue
     */
    public void setLimitValue(java.lang.Integer limitValue) {
        this.limitValue = limitValue;
    }


    /**
     * Gets the priority value for this ChangePaymentPlanRequestPaymentPlan.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this ChangePaymentPlanRequestPaymentPlan.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the feegroup value for this ChangePaymentPlanRequestPaymentPlan.
     * 
     * @return feegroup
     */
    public java.lang.String getFeegroup() {
        return feegroup;
    }


    /**
     * Sets the feegroup value for this ChangePaymentPlanRequestPaymentPlan.
     * 
     * @param feegroup
     */
    public void setFeegroup(java.lang.String feegroup) {
        this.feegroup = feegroup;
    }


    /**
     * Gets the operationType value for this ChangePaymentPlanRequestPaymentPlan.
     * 
     * @return operationType   * Add/Delete/Modify
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.OperationType getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this ChangePaymentPlanRequestPaymentPlan.
     * 
     * @param operationType   * Add/Delete/Modify
     */
    public void setOperationType(com.huawei.www.bme.cbsinterface.cbs.businessmgr.OperationType operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the paymentPlanKey value for this ChangePaymentPlanRequestPaymentPlan.
     * 
     * @return paymentPlanKey
     */
    public java.lang.Integer getPaymentPlanKey() {
        return paymentPlanKey;
    }


    /**
     * Sets the paymentPlanKey value for this ChangePaymentPlanRequestPaymentPlan.
     * 
     * @param paymentPlanKey
     */
    public void setPaymentPlanKey(java.lang.Integer paymentPlanKey) {
        this.paymentPlanKey = paymentPlanKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePaymentPlanRequestPaymentPlan)) return false;
        ChangePaymentPlanRequestPaymentPlan other = (ChangePaymentPlanRequestPaymentPlan) obj;
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
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.limitValue==null && other.getLimitValue()==null) || 
             (this.limitValue!=null &&
              this.limitValue.equals(other.getLimitValue()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.feegroup==null && other.getFeegroup()==null) || 
             (this.feegroup!=null &&
              this.feegroup.equals(other.getFeegroup()))) &&
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType()))) &&
            ((this.paymentPlanKey==null && other.getPaymentPlanKey()==null) || 
             (this.paymentPlanKey!=null &&
              this.paymentPlanKey.equals(other.getPaymentPlanKey())));
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
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getLimitValue() != null) {
            _hashCode += getLimitValue().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getFeegroup() != null) {
            _hashCode += getFeegroup().hashCode();
        }
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        if (getPaymentPlanKey() != null) {
            _hashCode += getPaymentPlanKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePaymentPlanRequestPaymentPlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ChangePaymentPlanRequest>PaymentPlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destSubNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "DestSubNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "LimitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feegroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Feegroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OperationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OperationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentPlanKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "PaymentPlanKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
