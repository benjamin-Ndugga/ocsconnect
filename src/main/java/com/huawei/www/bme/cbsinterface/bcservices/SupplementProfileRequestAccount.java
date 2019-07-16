/**
 * SupplementProfileRequestAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class SupplementProfileRequestAccount  implements java.io.Serializable {
    private java.lang.String acctKey;

    private com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo acctBasicInfo;

    private java.lang.String billCycleType;

    private java.math.BigInteger currencyID;

    private java.lang.Long initBalance;

    private com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccountCreditLimit[] creditLimit;

    private java.lang.String acctPayMethod;

    private com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccountAutoPayChannel[] autoPayChannel;

    public SupplementProfileRequestAccount() {
    }

    public SupplementProfileRequestAccount(
           java.lang.String acctKey,
           com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo acctBasicInfo,
           java.lang.String billCycleType,
           java.math.BigInteger currencyID,
           java.lang.Long initBalance,
           com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccountCreditLimit[] creditLimit,
           java.lang.String acctPayMethod,
           com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccountAutoPayChannel[] autoPayChannel) {
           this.acctKey = acctKey;
           this.acctBasicInfo = acctBasicInfo;
           this.billCycleType = billCycleType;
           this.currencyID = currencyID;
           this.initBalance = initBalance;
           this.creditLimit = creditLimit;
           this.acctPayMethod = acctPayMethod;
           this.autoPayChannel = autoPayChannel;
    }


    /**
     * Gets the acctKey value for this SupplementProfileRequestAccount.
     * 
     * @return acctKey
     */
    public java.lang.String getAcctKey() {
        return acctKey;
    }


    /**
     * Sets the acctKey value for this SupplementProfileRequestAccount.
     * 
     * @param acctKey
     */
    public void setAcctKey(java.lang.String acctKey) {
        this.acctKey = acctKey;
    }


    /**
     * Gets the acctBasicInfo value for this SupplementProfileRequestAccount.
     * 
     * @return acctBasicInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo getAcctBasicInfo() {
        return acctBasicInfo;
    }


    /**
     * Sets the acctBasicInfo value for this SupplementProfileRequestAccount.
     * 
     * @param acctBasicInfo
     */
    public void setAcctBasicInfo(com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo acctBasicInfo) {
        this.acctBasicInfo = acctBasicInfo;
    }


    /**
     * Gets the billCycleType value for this SupplementProfileRequestAccount.
     * 
     * @return billCycleType
     */
    public java.lang.String getBillCycleType() {
        return billCycleType;
    }


    /**
     * Sets the billCycleType value for this SupplementProfileRequestAccount.
     * 
     * @param billCycleType
     */
    public void setBillCycleType(java.lang.String billCycleType) {
        this.billCycleType = billCycleType;
    }


    /**
     * Gets the currencyID value for this SupplementProfileRequestAccount.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this SupplementProfileRequestAccount.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the initBalance value for this SupplementProfileRequestAccount.
     * 
     * @return initBalance
     */
    public java.lang.Long getInitBalance() {
        return initBalance;
    }


    /**
     * Sets the initBalance value for this SupplementProfileRequestAccount.
     * 
     * @param initBalance
     */
    public void setInitBalance(java.lang.Long initBalance) {
        this.initBalance = initBalance;
    }


    /**
     * Gets the creditLimit value for this SupplementProfileRequestAccount.
     * 
     * @return creditLimit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccountCreditLimit[] getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this SupplementProfileRequestAccount.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccountCreditLimit[] creditLimit) {
        this.creditLimit = creditLimit;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccountCreditLimit getCreditLimit(int i) {
        return this.creditLimit[i];
    }

    public void setCreditLimit(int i, com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccountCreditLimit _value) {
        this.creditLimit[i] = _value;
    }


    /**
     * Gets the acctPayMethod value for this SupplementProfileRequestAccount.
     * 
     * @return acctPayMethod
     */
    public java.lang.String getAcctPayMethod() {
        return acctPayMethod;
    }


    /**
     * Sets the acctPayMethod value for this SupplementProfileRequestAccount.
     * 
     * @param acctPayMethod
     */
    public void setAcctPayMethod(java.lang.String acctPayMethod) {
        this.acctPayMethod = acctPayMethod;
    }


    /**
     * Gets the autoPayChannel value for this SupplementProfileRequestAccount.
     * 
     * @return autoPayChannel
     */
    public com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccountAutoPayChannel[] getAutoPayChannel() {
        return autoPayChannel;
    }


    /**
     * Sets the autoPayChannel value for this SupplementProfileRequestAccount.
     * 
     * @param autoPayChannel
     */
    public void setAutoPayChannel(com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccountAutoPayChannel[] autoPayChannel) {
        this.autoPayChannel = autoPayChannel;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccountAutoPayChannel getAutoPayChannel(int i) {
        return this.autoPayChannel[i];
    }

    public void setAutoPayChannel(int i, com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccountAutoPayChannel _value) {
        this.autoPayChannel[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupplementProfileRequestAccount)) return false;
        SupplementProfileRequestAccount other = (SupplementProfileRequestAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctKey==null && other.getAcctKey()==null) || 
             (this.acctKey!=null &&
              this.acctKey.equals(other.getAcctKey()))) &&
            ((this.acctBasicInfo==null && other.getAcctBasicInfo()==null) || 
             (this.acctBasicInfo!=null &&
              this.acctBasicInfo.equals(other.getAcctBasicInfo()))) &&
            ((this.billCycleType==null && other.getBillCycleType()==null) || 
             (this.billCycleType!=null &&
              this.billCycleType.equals(other.getBillCycleType()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.initBalance==null && other.getInitBalance()==null) || 
             (this.initBalance!=null &&
              this.initBalance.equals(other.getInitBalance()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              java.util.Arrays.equals(this.creditLimit, other.getCreditLimit()))) &&
            ((this.acctPayMethod==null && other.getAcctPayMethod()==null) || 
             (this.acctPayMethod!=null &&
              this.acctPayMethod.equals(other.getAcctPayMethod()))) &&
            ((this.autoPayChannel==null && other.getAutoPayChannel()==null) || 
             (this.autoPayChannel!=null &&
              java.util.Arrays.equals(this.autoPayChannel, other.getAutoPayChannel())));
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
        if (getAcctKey() != null) {
            _hashCode += getAcctKey().hashCode();
        }
        if (getAcctBasicInfo() != null) {
            _hashCode += getAcctBasicInfo().hashCode();
        }
        if (getBillCycleType() != null) {
            _hashCode += getBillCycleType().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
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
        if (getAcctPayMethod() != null) {
            _hashCode += getAcctPayMethod().hashCode();
        }
        if (getAutoPayChannel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoPayChannel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoPayChannel(), i);
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
        new org.apache.axis.description.TypeDesc(SupplementProfileRequestAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileRequest>Account"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctBasicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctBasicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AccountBasicInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BillCycleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("initBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "InitBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>SupplementProfileRequest>Account>CreditLimit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctPayMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctPayMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPayChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AutoPayChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>SupplementProfileRequest>Account>AutoPayChannel"));
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
