/**
 * AccountForBatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class AccountForBatch  implements java.io.Serializable {
    private java.lang.String billCycleType;

    /* For example:
     * Prepaid                                 Postpaid */
    private java.lang.String paymentType;

    private java.math.BigInteger currencyID;

    private java.lang.String billLang;

    private java.lang.String dunningFlag;

    private java.lang.String lateFeeChargeable;

    private java.lang.Long initBalance;

    private com.huawei.www.bme.cbsinterface.bccommon.AccountForBatchCreditLimit[] creditLimit;

    private com.huawei.www.bme.cbsinterface.bccommon.FreeBillMedium[] freeBillMedium;

    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] acctProperty;

    public AccountForBatch() {
    }

    public AccountForBatch(
           java.lang.String billCycleType,
           java.lang.String paymentType,
           java.math.BigInteger currencyID,
           java.lang.String billLang,
           java.lang.String dunningFlag,
           java.lang.String lateFeeChargeable,
           java.lang.Long initBalance,
           com.huawei.www.bme.cbsinterface.bccommon.AccountForBatchCreditLimit[] creditLimit,
           com.huawei.www.bme.cbsinterface.bccommon.FreeBillMedium[] freeBillMedium,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] acctProperty) {
           this.billCycleType = billCycleType;
           this.paymentType = paymentType;
           this.currencyID = currencyID;
           this.billLang = billLang;
           this.dunningFlag = dunningFlag;
           this.lateFeeChargeable = lateFeeChargeable;
           this.initBalance = initBalance;
           this.creditLimit = creditLimit;
           this.freeBillMedium = freeBillMedium;
           this.acctProperty = acctProperty;
    }


    /**
     * Gets the billCycleType value for this AccountForBatch.
     * 
     * @return billCycleType
     */
    public java.lang.String getBillCycleType() {
        return billCycleType;
    }


    /**
     * Sets the billCycleType value for this AccountForBatch.
     * 
     * @param billCycleType
     */
    public void setBillCycleType(java.lang.String billCycleType) {
        this.billCycleType = billCycleType;
    }


    /**
     * Gets the paymentType value for this AccountForBatch.
     * 
     * @return paymentType   * For example:
     * Prepaid                                 Postpaid
     */
    public java.lang.String getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this AccountForBatch.
     * 
     * @param paymentType   * For example:
     * Prepaid                                 Postpaid
     */
    public void setPaymentType(java.lang.String paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the currencyID value for this AccountForBatch.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this AccountForBatch.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the billLang value for this AccountForBatch.
     * 
     * @return billLang
     */
    public java.lang.String getBillLang() {
        return billLang;
    }


    /**
     * Sets the billLang value for this AccountForBatch.
     * 
     * @param billLang
     */
    public void setBillLang(java.lang.String billLang) {
        this.billLang = billLang;
    }


    /**
     * Gets the dunningFlag value for this AccountForBatch.
     * 
     * @return dunningFlag
     */
    public java.lang.String getDunningFlag() {
        return dunningFlag;
    }


    /**
     * Sets the dunningFlag value for this AccountForBatch.
     * 
     * @param dunningFlag
     */
    public void setDunningFlag(java.lang.String dunningFlag) {
        this.dunningFlag = dunningFlag;
    }


    /**
     * Gets the lateFeeChargeable value for this AccountForBatch.
     * 
     * @return lateFeeChargeable
     */
    public java.lang.String getLateFeeChargeable() {
        return lateFeeChargeable;
    }


    /**
     * Sets the lateFeeChargeable value for this AccountForBatch.
     * 
     * @param lateFeeChargeable
     */
    public void setLateFeeChargeable(java.lang.String lateFeeChargeable) {
        this.lateFeeChargeable = lateFeeChargeable;
    }


    /**
     * Gets the initBalance value for this AccountForBatch.
     * 
     * @return initBalance
     */
    public java.lang.Long getInitBalance() {
        return initBalance;
    }


    /**
     * Sets the initBalance value for this AccountForBatch.
     * 
     * @param initBalance
     */
    public void setInitBalance(java.lang.Long initBalance) {
        this.initBalance = initBalance;
    }


    /**
     * Gets the creditLimit value for this AccountForBatch.
     * 
     * @return creditLimit
     */
    public com.huawei.www.bme.cbsinterface.bccommon.AccountForBatchCreditLimit[] getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this AccountForBatch.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(com.huawei.www.bme.cbsinterface.bccommon.AccountForBatchCreditLimit[] creditLimit) {
        this.creditLimit = creditLimit;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.AccountForBatchCreditLimit getCreditLimit(int i) {
        return this.creditLimit[i];
    }

    public void setCreditLimit(int i, com.huawei.www.bme.cbsinterface.bccommon.AccountForBatchCreditLimit _value) {
        this.creditLimit[i] = _value;
    }


    /**
     * Gets the freeBillMedium value for this AccountForBatch.
     * 
     * @return freeBillMedium
     */
    public com.huawei.www.bme.cbsinterface.bccommon.FreeBillMedium[] getFreeBillMedium() {
        return freeBillMedium;
    }


    /**
     * Sets the freeBillMedium value for this AccountForBatch.
     * 
     * @param freeBillMedium
     */
    public void setFreeBillMedium(com.huawei.www.bme.cbsinterface.bccommon.FreeBillMedium[] freeBillMedium) {
        this.freeBillMedium = freeBillMedium;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.FreeBillMedium getFreeBillMedium(int i) {
        return this.freeBillMedium[i];
    }

    public void setFreeBillMedium(int i, com.huawei.www.bme.cbsinterface.bccommon.FreeBillMedium _value) {
        this.freeBillMedium[i] = _value;
    }


    /**
     * Gets the acctProperty value for this AccountForBatch.
     * 
     * @return acctProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getAcctProperty() {
        return acctProperty;
    }


    /**
     * Sets the acctProperty value for this AccountForBatch.
     * 
     * @param acctProperty
     */
    public void setAcctProperty(com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] acctProperty) {
        this.acctProperty = acctProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty getAcctProperty(int i) {
        return this.acctProperty[i];
    }

    public void setAcctProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty _value) {
        this.acctProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountForBatch)) return false;
        AccountForBatch other = (AccountForBatch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billCycleType==null && other.getBillCycleType()==null) || 
             (this.billCycleType!=null &&
              this.billCycleType.equals(other.getBillCycleType()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.billLang==null && other.getBillLang()==null) || 
             (this.billLang!=null &&
              this.billLang.equals(other.getBillLang()))) &&
            ((this.dunningFlag==null && other.getDunningFlag()==null) || 
             (this.dunningFlag!=null &&
              this.dunningFlag.equals(other.getDunningFlag()))) &&
            ((this.lateFeeChargeable==null && other.getLateFeeChargeable()==null) || 
             (this.lateFeeChargeable!=null &&
              this.lateFeeChargeable.equals(other.getLateFeeChargeable()))) &&
            ((this.initBalance==null && other.getInitBalance()==null) || 
             (this.initBalance!=null &&
              this.initBalance.equals(other.getInitBalance()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              java.util.Arrays.equals(this.creditLimit, other.getCreditLimit()))) &&
            ((this.freeBillMedium==null && other.getFreeBillMedium()==null) || 
             (this.freeBillMedium!=null &&
              java.util.Arrays.equals(this.freeBillMedium, other.getFreeBillMedium()))) &&
            ((this.acctProperty==null && other.getAcctProperty()==null) || 
             (this.acctProperty!=null &&
              java.util.Arrays.equals(this.acctProperty, other.getAcctProperty())));
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
        if (getBillCycleType() != null) {
            _hashCode += getBillCycleType().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getBillLang() != null) {
            _hashCode += getBillLang().hashCode();
        }
        if (getDunningFlag() != null) {
            _hashCode += getDunningFlag().hashCode();
        }
        if (getLateFeeChargeable() != null) {
            _hashCode += getLateFeeChargeable().hashCode();
        }
        if (getInitBalance() != null) {
            _hashCode += getInitBalance().hashCode();
        }
        if (getCreditLimit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditLimit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditLimit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFreeBillMedium() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeBillMedium());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeBillMedium(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAcctProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcctProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcctProperty(), i);
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
        new org.apache.axis.description.TypeDesc(AccountForBatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AccountForBatch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BillCycleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billLang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BillLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dunningFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "DunningFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lateFeeChargeable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "LateFeeChargeable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "InitBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CreditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">AccountForBatch>CreditLimit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeBillMedium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "FreeBillMedium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "FreeBillMedium"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AcctProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SimpleProperty"));
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
