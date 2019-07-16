/**
 * ApplyInstallmentResultInatallmentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ApplyInstallmentResultInatallmentDetail  implements java.io.Serializable {
    private long installmentInstID;

    private java.math.BigInteger cycleSequence;

    /* 某期分期付款的初始金额 */
    private long initialAmount;

    /* 某期分期付款待偿还金额 */
    private long amount;

    private java.math.BigInteger currencyID;

    private java.lang.String cycleClass;

    private java.lang.String status;

    private java.lang.String cycleDueDate;

    private java.lang.String realRepayDate;

    public ApplyInstallmentResultInatallmentDetail() {
    }

    public ApplyInstallmentResultInatallmentDetail(
           long installmentInstID,
           java.math.BigInteger cycleSequence,
           long initialAmount,
           long amount,
           java.math.BigInteger currencyID,
           java.lang.String cycleClass,
           java.lang.String status,
           java.lang.String cycleDueDate,
           java.lang.String realRepayDate) {
           this.installmentInstID = installmentInstID;
           this.cycleSequence = cycleSequence;
           this.initialAmount = initialAmount;
           this.amount = amount;
           this.currencyID = currencyID;
           this.cycleClass = cycleClass;
           this.status = status;
           this.cycleDueDate = cycleDueDate;
           this.realRepayDate = realRepayDate;
    }


    /**
     * Gets the installmentInstID value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @return installmentInstID
     */
    public long getInstallmentInstID() {
        return installmentInstID;
    }


    /**
     * Sets the installmentInstID value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @param installmentInstID
     */
    public void setInstallmentInstID(long installmentInstID) {
        this.installmentInstID = installmentInstID;
    }


    /**
     * Gets the cycleSequence value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @return cycleSequence
     */
    public java.math.BigInteger getCycleSequence() {
        return cycleSequence;
    }


    /**
     * Sets the cycleSequence value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @param cycleSequence
     */
    public void setCycleSequence(java.math.BigInteger cycleSequence) {
        this.cycleSequence = cycleSequence;
    }


    /**
     * Gets the initialAmount value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @return initialAmount   * 某期分期付款的初始金额
     */
    public long getInitialAmount() {
        return initialAmount;
    }


    /**
     * Sets the initialAmount value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @param initialAmount   * 某期分期付款的初始金额
     */
    public void setInitialAmount(long initialAmount) {
        this.initialAmount = initialAmount;
    }


    /**
     * Gets the amount value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @return amount   * 某期分期付款待偿还金额
     */
    public long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @param amount   * 某期分期付款待偿还金额
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }


    /**
     * Gets the currencyID value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the cycleClass value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @return cycleClass
     */
    public java.lang.String getCycleClass() {
        return cycleClass;
    }


    /**
     * Sets the cycleClass value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @param cycleClass
     */
    public void setCycleClass(java.lang.String cycleClass) {
        this.cycleClass = cycleClass;
    }


    /**
     * Gets the status value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the cycleDueDate value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @return cycleDueDate
     */
    public java.lang.String getCycleDueDate() {
        return cycleDueDate;
    }


    /**
     * Sets the cycleDueDate value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @param cycleDueDate
     */
    public void setCycleDueDate(java.lang.String cycleDueDate) {
        this.cycleDueDate = cycleDueDate;
    }


    /**
     * Gets the realRepayDate value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @return realRepayDate
     */
    public java.lang.String getRealRepayDate() {
        return realRepayDate;
    }


    /**
     * Sets the realRepayDate value for this ApplyInstallmentResultInatallmentDetail.
     * 
     * @param realRepayDate
     */
    public void setRealRepayDate(java.lang.String realRepayDate) {
        this.realRepayDate = realRepayDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyInstallmentResultInatallmentDetail)) return false;
        ApplyInstallmentResultInatallmentDetail other = (ApplyInstallmentResultInatallmentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.installmentInstID == other.getInstallmentInstID() &&
            ((this.cycleSequence==null && other.getCycleSequence()==null) || 
             (this.cycleSequence!=null &&
              this.cycleSequence.equals(other.getCycleSequence()))) &&
            this.initialAmount == other.getInitialAmount() &&
            this.amount == other.getAmount() &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.cycleClass==null && other.getCycleClass()==null) || 
             (this.cycleClass!=null &&
              this.cycleClass.equals(other.getCycleClass()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.cycleDueDate==null && other.getCycleDueDate()==null) || 
             (this.cycleDueDate!=null &&
              this.cycleDueDate.equals(other.getCycleDueDate()))) &&
            ((this.realRepayDate==null && other.getRealRepayDate()==null) || 
             (this.realRepayDate!=null &&
              this.realRepayDate.equals(other.getRealRepayDate())));
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
        _hashCode += new Long(getInstallmentInstID()).hashCode();
        if (getCycleSequence() != null) {
            _hashCode += getCycleSequence().hashCode();
        }
        _hashCode += new Long(getInitialAmount()).hashCode();
        _hashCode += new Long(getAmount()).hashCode();
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getCycleClass() != null) {
            _hashCode += getCycleClass().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCycleDueDate() != null) {
            _hashCode += getCycleDueDate().hashCode();
        }
        if (getRealRepayDate() != null) {
            _hashCode += getRealRepayDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplyInstallmentResultInatallmentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentResult>InatallmentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installmentInstID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "InstallmentInstID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CycleSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "InitialAmount"));
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
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CycleClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CycleDueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realRepayDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RealRepayDate"));
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
