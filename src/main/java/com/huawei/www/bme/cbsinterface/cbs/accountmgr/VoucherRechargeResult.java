/**
 * VoucherRechargeResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class VoucherRechargeResult  implements java.io.Serializable {
    private java.lang.Long faceValue;

    private java.lang.Long newBalance;

    private java.lang.String newActiveStop;

    private java.lang.Integer validityPeriod;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeResultRechargeBonus[] rechargeBonus;

    private java.lang.Integer loanAmount;

    private java.lang.Integer loanPayment;

    private java.lang.Integer loanPoundage;

    public VoucherRechargeResult() {
    }

    public VoucherRechargeResult(
           java.lang.Long faceValue,
           java.lang.Long newBalance,
           java.lang.String newActiveStop,
           java.lang.Integer validityPeriod,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeResultRechargeBonus[] rechargeBonus,
           java.lang.Integer loanAmount,
           java.lang.Integer loanPayment,
           java.lang.Integer loanPoundage) {
           this.faceValue = faceValue;
           this.newBalance = newBalance;
           this.newActiveStop = newActiveStop;
           this.validityPeriod = validityPeriod;
           this.rechargeBonus = rechargeBonus;
           this.loanAmount = loanAmount;
           this.loanPayment = loanPayment;
           this.loanPoundage = loanPoundage;
    }


    /**
     * Gets the faceValue value for this VoucherRechargeResult.
     * 
     * @return faceValue
     */
    public java.lang.Long getFaceValue() {
        return faceValue;
    }


    /**
     * Sets the faceValue value for this VoucherRechargeResult.
     * 
     * @param faceValue
     */
    public void setFaceValue(java.lang.Long faceValue) {
        this.faceValue = faceValue;
    }


    /**
     * Gets the newBalance value for this VoucherRechargeResult.
     * 
     * @return newBalance
     */
    public java.lang.Long getNewBalance() {
        return newBalance;
    }


    /**
     * Sets the newBalance value for this VoucherRechargeResult.
     * 
     * @param newBalance
     */
    public void setNewBalance(java.lang.Long newBalance) {
        this.newBalance = newBalance;
    }


    /**
     * Gets the newActiveStop value for this VoucherRechargeResult.
     * 
     * @return newActiveStop
     */
    public java.lang.String getNewActiveStop() {
        return newActiveStop;
    }


    /**
     * Sets the newActiveStop value for this VoucherRechargeResult.
     * 
     * @param newActiveStop
     */
    public void setNewActiveStop(java.lang.String newActiveStop) {
        this.newActiveStop = newActiveStop;
    }


    /**
     * Gets the validityPeriod value for this VoucherRechargeResult.
     * 
     * @return validityPeriod
     */
    public java.lang.Integer getValidityPeriod() {
        return validityPeriod;
    }


    /**
     * Sets the validityPeriod value for this VoucherRechargeResult.
     * 
     * @param validityPeriod
     */
    public void setValidityPeriod(java.lang.Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
    }


    /**
     * Gets the rechargeBonus value for this VoucherRechargeResult.
     * 
     * @return rechargeBonus
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeResultRechargeBonus[] getRechargeBonus() {
        return rechargeBonus;
    }


    /**
     * Sets the rechargeBonus value for this VoucherRechargeResult.
     * 
     * @param rechargeBonus
     */
    public void setRechargeBonus(com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeResultRechargeBonus[] rechargeBonus) {
        this.rechargeBonus = rechargeBonus;
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeResultRechargeBonus getRechargeBonus(int i) {
        return this.rechargeBonus[i];
    }

    public void setRechargeBonus(int i, com.huawei.www.bme.cbsinterface.cbs.accountmgr.VoucherRechargeResultRechargeBonus _value) {
        this.rechargeBonus[i] = _value;
    }


    /**
     * Gets the loanAmount value for this VoucherRechargeResult.
     * 
     * @return loanAmount
     */
    public java.lang.Integer getLoanAmount() {
        return loanAmount;
    }


    /**
     * Sets the loanAmount value for this VoucherRechargeResult.
     * 
     * @param loanAmount
     */
    public void setLoanAmount(java.lang.Integer loanAmount) {
        this.loanAmount = loanAmount;
    }


    /**
     * Gets the loanPayment value for this VoucherRechargeResult.
     * 
     * @return loanPayment
     */
    public java.lang.Integer getLoanPayment() {
        return loanPayment;
    }


    /**
     * Sets the loanPayment value for this VoucherRechargeResult.
     * 
     * @param loanPayment
     */
    public void setLoanPayment(java.lang.Integer loanPayment) {
        this.loanPayment = loanPayment;
    }


    /**
     * Gets the loanPoundage value for this VoucherRechargeResult.
     * 
     * @return loanPoundage
     */
    public java.lang.Integer getLoanPoundage() {
        return loanPoundage;
    }


    /**
     * Sets the loanPoundage value for this VoucherRechargeResult.
     * 
     * @param loanPoundage
     */
    public void setLoanPoundage(java.lang.Integer loanPoundage) {
        this.loanPoundage = loanPoundage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoucherRechargeResult)) return false;
        VoucherRechargeResult other = (VoucherRechargeResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.faceValue==null && other.getFaceValue()==null) || 
             (this.faceValue!=null &&
              this.faceValue.equals(other.getFaceValue()))) &&
            ((this.newBalance==null && other.getNewBalance()==null) || 
             (this.newBalance!=null &&
              this.newBalance.equals(other.getNewBalance()))) &&
            ((this.newActiveStop==null && other.getNewActiveStop()==null) || 
             (this.newActiveStop!=null &&
              this.newActiveStop.equals(other.getNewActiveStop()))) &&
            ((this.validityPeriod==null && other.getValidityPeriod()==null) || 
             (this.validityPeriod!=null &&
              this.validityPeriod.equals(other.getValidityPeriod()))) &&
            ((this.rechargeBonus==null && other.getRechargeBonus()==null) || 
             (this.rechargeBonus!=null &&
              java.util.Arrays.equals(this.rechargeBonus, other.getRechargeBonus()))) &&
            ((this.loanAmount==null && other.getLoanAmount()==null) || 
             (this.loanAmount!=null &&
              this.loanAmount.equals(other.getLoanAmount()))) &&
            ((this.loanPayment==null && other.getLoanPayment()==null) || 
             (this.loanPayment!=null &&
              this.loanPayment.equals(other.getLoanPayment()))) &&
            ((this.loanPoundage==null && other.getLoanPoundage()==null) || 
             (this.loanPoundage!=null &&
              this.loanPoundage.equals(other.getLoanPoundage())));
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
        if (getFaceValue() != null) {
            _hashCode += getFaceValue().hashCode();
        }
        if (getNewBalance() != null) {
            _hashCode += getNewBalance().hashCode();
        }
        if (getNewActiveStop() != null) {
            _hashCode += getNewActiveStop().hashCode();
        }
        if (getValidityPeriod() != null) {
            _hashCode += getValidityPeriod().hashCode();
        }
        if (getRechargeBonus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRechargeBonus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRechargeBonus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLoanAmount() != null) {
            _hashCode += getLoanAmount().hashCode();
        }
        if (getLoanPayment() != null) {
            _hashCode += getLoanPayment().hashCode();
        }
        if (getLoanPoundage() != null) {
            _hashCode += getLoanPoundage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoucherRechargeResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "VoucherRechargeResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "FaceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "NewBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newActiveStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "NewActiveStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ValidityPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeBonus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "RechargeBonus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">VoucherRechargeResult>RechargeBonus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LoanAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LoanPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanPoundage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LoanPoundage"));
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
