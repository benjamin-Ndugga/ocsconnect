/**
 * AutoPayChannelInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class AutoPayChannelInfo  implements java.io.Serializable {
    private java.lang.String bankCode;

    private java.lang.String bankBranchCode;

    private java.lang.String acctType;

    private java.lang.String creditCardType;

    private java.lang.String acctNo;

    private java.lang.String acctName;

    private java.lang.String CVVNumber;

    private java.lang.String expDate;

    private java.math.BigInteger priority;

    private java.lang.String[] chargeCode;

    private com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlan[] paymentPlan;

    public AutoPayChannelInfo() {
    }

    public AutoPayChannelInfo(
           java.lang.String bankCode,
           java.lang.String bankBranchCode,
           java.lang.String acctType,
           java.lang.String creditCardType,
           java.lang.String acctNo,
           java.lang.String acctName,
           java.lang.String CVVNumber,
           java.lang.String expDate,
           java.math.BigInteger priority,
           java.lang.String[] chargeCode,
           com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlan[] paymentPlan) {
           this.bankCode = bankCode;
           this.bankBranchCode = bankBranchCode;
           this.acctType = acctType;
           this.creditCardType = creditCardType;
           this.acctNo = acctNo;
           this.acctName = acctName;
           this.CVVNumber = CVVNumber;
           this.expDate = expDate;
           this.priority = priority;
           this.chargeCode = chargeCode;
           this.paymentPlan = paymentPlan;
    }


    /**
     * Gets the bankCode value for this AutoPayChannelInfo.
     * 
     * @return bankCode
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this AutoPayChannelInfo.
     * 
     * @param bankCode
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the bankBranchCode value for this AutoPayChannelInfo.
     * 
     * @return bankBranchCode
     */
    public java.lang.String getBankBranchCode() {
        return bankBranchCode;
    }


    /**
     * Sets the bankBranchCode value for this AutoPayChannelInfo.
     * 
     * @param bankBranchCode
     */
    public void setBankBranchCode(java.lang.String bankBranchCode) {
        this.bankBranchCode = bankBranchCode;
    }


    /**
     * Gets the acctType value for this AutoPayChannelInfo.
     * 
     * @return acctType
     */
    public java.lang.String getAcctType() {
        return acctType;
    }


    /**
     * Sets the acctType value for this AutoPayChannelInfo.
     * 
     * @param acctType
     */
    public void setAcctType(java.lang.String acctType) {
        this.acctType = acctType;
    }


    /**
     * Gets the creditCardType value for this AutoPayChannelInfo.
     * 
     * @return creditCardType
     */
    public java.lang.String getCreditCardType() {
        return creditCardType;
    }


    /**
     * Sets the creditCardType value for this AutoPayChannelInfo.
     * 
     * @param creditCardType
     */
    public void setCreditCardType(java.lang.String creditCardType) {
        this.creditCardType = creditCardType;
    }


    /**
     * Gets the acctNo value for this AutoPayChannelInfo.
     * 
     * @return acctNo
     */
    public java.lang.String getAcctNo() {
        return acctNo;
    }


    /**
     * Sets the acctNo value for this AutoPayChannelInfo.
     * 
     * @param acctNo
     */
    public void setAcctNo(java.lang.String acctNo) {
        this.acctNo = acctNo;
    }


    /**
     * Gets the acctName value for this AutoPayChannelInfo.
     * 
     * @return acctName
     */
    public java.lang.String getAcctName() {
        return acctName;
    }


    /**
     * Sets the acctName value for this AutoPayChannelInfo.
     * 
     * @param acctName
     */
    public void setAcctName(java.lang.String acctName) {
        this.acctName = acctName;
    }


    /**
     * Gets the CVVNumber value for this AutoPayChannelInfo.
     * 
     * @return CVVNumber
     */
    public java.lang.String getCVVNumber() {
        return CVVNumber;
    }


    /**
     * Sets the CVVNumber value for this AutoPayChannelInfo.
     * 
     * @param CVVNumber
     */
    public void setCVVNumber(java.lang.String CVVNumber) {
        this.CVVNumber = CVVNumber;
    }


    /**
     * Gets the expDate value for this AutoPayChannelInfo.
     * 
     * @return expDate
     */
    public java.lang.String getExpDate() {
        return expDate;
    }


    /**
     * Sets the expDate value for this AutoPayChannelInfo.
     * 
     * @param expDate
     */
    public void setExpDate(java.lang.String expDate) {
        this.expDate = expDate;
    }


    /**
     * Gets the priority value for this AutoPayChannelInfo.
     * 
     * @return priority
     */
    public java.math.BigInteger getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this AutoPayChannelInfo.
     * 
     * @param priority
     */
    public void setPriority(java.math.BigInteger priority) {
        this.priority = priority;
    }


    /**
     * Gets the chargeCode value for this AutoPayChannelInfo.
     * 
     * @return chargeCode
     */
    public java.lang.String[] getChargeCode() {
        return chargeCode;
    }


    /**
     * Sets the chargeCode value for this AutoPayChannelInfo.
     * 
     * @param chargeCode
     */
    public void setChargeCode(java.lang.String[] chargeCode) {
        this.chargeCode = chargeCode;
    }

    public java.lang.String getChargeCode(int i) {
        return this.chargeCode[i];
    }

    public void setChargeCode(int i, java.lang.String _value) {
        this.chargeCode[i] = _value;
    }


    /**
     * Gets the paymentPlan value for this AutoPayChannelInfo.
     * 
     * @return paymentPlan
     */
    public com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlan[] getPaymentPlan() {
        return paymentPlan;
    }


    /**
     * Sets the paymentPlan value for this AutoPayChannelInfo.
     * 
     * @param paymentPlan
     */
    public void setPaymentPlan(com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlan[] paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlan getPaymentPlan(int i) {
        return this.paymentPlan[i];
    }

    public void setPaymentPlan(int i, com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlan _value) {
        this.paymentPlan[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoPayChannelInfo)) return false;
        AutoPayChannelInfo other = (AutoPayChannelInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.bankBranchCode==null && other.getBankBranchCode()==null) || 
             (this.bankBranchCode!=null &&
              this.bankBranchCode.equals(other.getBankBranchCode()))) &&
            ((this.acctType==null && other.getAcctType()==null) || 
             (this.acctType!=null &&
              this.acctType.equals(other.getAcctType()))) &&
            ((this.creditCardType==null && other.getCreditCardType()==null) || 
             (this.creditCardType!=null &&
              this.creditCardType.equals(other.getCreditCardType()))) &&
            ((this.acctNo==null && other.getAcctNo()==null) || 
             (this.acctNo!=null &&
              this.acctNo.equals(other.getAcctNo()))) &&
            ((this.acctName==null && other.getAcctName()==null) || 
             (this.acctName!=null &&
              this.acctName.equals(other.getAcctName()))) &&
            ((this.CVVNumber==null && other.getCVVNumber()==null) || 
             (this.CVVNumber!=null &&
              this.CVVNumber.equals(other.getCVVNumber()))) &&
            ((this.expDate==null && other.getExpDate()==null) || 
             (this.expDate!=null &&
              this.expDate.equals(other.getExpDate()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.chargeCode==null && other.getChargeCode()==null) || 
             (this.chargeCode!=null &&
              java.util.Arrays.equals(this.chargeCode, other.getChargeCode()))) &&
            ((this.paymentPlan==null && other.getPaymentPlan()==null) || 
             (this.paymentPlan!=null &&
              java.util.Arrays.equals(this.paymentPlan, other.getPaymentPlan())));
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
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getBankBranchCode() != null) {
            _hashCode += getBankBranchCode().hashCode();
        }
        if (getAcctType() != null) {
            _hashCode += getAcctType().hashCode();
        }
        if (getCreditCardType() != null) {
            _hashCode += getCreditCardType().hashCode();
        }
        if (getAcctNo() != null) {
            _hashCode += getAcctNo().hashCode();
        }
        if (getAcctName() != null) {
            _hashCode += getAcctName().hashCode();
        }
        if (getCVVNumber() != null) {
            _hashCode += getCVVNumber().hashCode();
        }
        if (getExpDate() != null) {
            _hashCode += getExpDate().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getChargeCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChargeCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChargeCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentPlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentPlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentPlan(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoPayChannelInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AutoPayChannelInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankBranchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BankBranchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AcctType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CreditCardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AcctNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AcctName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CVVNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CVVNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ChargeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PaymentPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">AutoPayChannelInfo>PaymentPlan"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
