/**
 * AccountInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class AccountInfo  implements java.io.Serializable {
    private java.lang.String acctCode;

    private java.lang.String userCustomerKey;

    /* There is a account hierarchy in the system. If a account node
     * has a parent node in the account hierarchy, this field is the parent
     * account key. */
    private java.lang.String parentAcctKey;

    private com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo acctBasicInfo;

    private java.lang.String billCycleType;

    private java.lang.String acctType;

    private java.lang.String paymentType;

    private java.lang.String acctClass;

    private java.math.BigInteger currencyID;

    private java.lang.Long initBalance;

    private com.huawei.www.bme.cbsinterface.bccommon.AccountInfoCreditLimit[] creditLimit;

    private java.lang.String acctPayMethod;

    private com.huawei.www.bme.cbsinterface.bccommon.AccountInfoAutoPayChannel[] autoPayChannel;

    public AccountInfo() {
    }

    public AccountInfo(
           java.lang.String acctCode,
           java.lang.String userCustomerKey,
           java.lang.String parentAcctKey,
           com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo acctBasicInfo,
           java.lang.String billCycleType,
           java.lang.String acctType,
           java.lang.String paymentType,
           java.lang.String acctClass,
           java.math.BigInteger currencyID,
           java.lang.Long initBalance,
           com.huawei.www.bme.cbsinterface.bccommon.AccountInfoCreditLimit[] creditLimit,
           java.lang.String acctPayMethod,
           com.huawei.www.bme.cbsinterface.bccommon.AccountInfoAutoPayChannel[] autoPayChannel) {
           this.acctCode = acctCode;
           this.userCustomerKey = userCustomerKey;
           this.parentAcctKey = parentAcctKey;
           this.acctBasicInfo = acctBasicInfo;
           this.billCycleType = billCycleType;
           this.acctType = acctType;
           this.paymentType = paymentType;
           this.acctClass = acctClass;
           this.currencyID = currencyID;
           this.initBalance = initBalance;
           this.creditLimit = creditLimit;
           this.acctPayMethod = acctPayMethod;
           this.autoPayChannel = autoPayChannel;
    }


    /**
     * Gets the acctCode value for this AccountInfo.
     * 
     * @return acctCode
     */
    public java.lang.String getAcctCode() {
        return acctCode;
    }


    /**
     * Sets the acctCode value for this AccountInfo.
     * 
     * @param acctCode
     */
    public void setAcctCode(java.lang.String acctCode) {
        this.acctCode = acctCode;
    }


    /**
     * Gets the userCustomerKey value for this AccountInfo.
     * 
     * @return userCustomerKey
     */
    public java.lang.String getUserCustomerKey() {
        return userCustomerKey;
    }


    /**
     * Sets the userCustomerKey value for this AccountInfo.
     * 
     * @param userCustomerKey
     */
    public void setUserCustomerKey(java.lang.String userCustomerKey) {
        this.userCustomerKey = userCustomerKey;
    }


    /**
     * Gets the parentAcctKey value for this AccountInfo.
     * 
     * @return parentAcctKey   * There is a account hierarchy in the system. If a account node
     * has a parent node in the account hierarchy, this field is the parent
     * account key.
     */
    public java.lang.String getParentAcctKey() {
        return parentAcctKey;
    }


    /**
     * Sets the parentAcctKey value for this AccountInfo.
     * 
     * @param parentAcctKey   * There is a account hierarchy in the system. If a account node
     * has a parent node in the account hierarchy, this field is the parent
     * account key.
     */
    public void setParentAcctKey(java.lang.String parentAcctKey) {
        this.parentAcctKey = parentAcctKey;
    }


    /**
     * Gets the acctBasicInfo value for this AccountInfo.
     * 
     * @return acctBasicInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo getAcctBasicInfo() {
        return acctBasicInfo;
    }


    /**
     * Sets the acctBasicInfo value for this AccountInfo.
     * 
     * @param acctBasicInfo
     */
    public void setAcctBasicInfo(com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo acctBasicInfo) {
        this.acctBasicInfo = acctBasicInfo;
    }


    /**
     * Gets the billCycleType value for this AccountInfo.
     * 
     * @return billCycleType
     */
    public java.lang.String getBillCycleType() {
        return billCycleType;
    }


    /**
     * Sets the billCycleType value for this AccountInfo.
     * 
     * @param billCycleType
     */
    public void setBillCycleType(java.lang.String billCycleType) {
        this.billCycleType = billCycleType;
    }


    /**
     * Gets the acctType value for this AccountInfo.
     * 
     * @return acctType
     */
    public java.lang.String getAcctType() {
        return acctType;
    }


    /**
     * Sets the acctType value for this AccountInfo.
     * 
     * @param acctType
     */
    public void setAcctType(java.lang.String acctType) {
        this.acctType = acctType;
    }


    /**
     * Gets the paymentType value for this AccountInfo.
     * 
     * @return paymentType
     */
    public java.lang.String getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this AccountInfo.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.String paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the acctClass value for this AccountInfo.
     * 
     * @return acctClass
     */
    public java.lang.String getAcctClass() {
        return acctClass;
    }


    /**
     * Sets the acctClass value for this AccountInfo.
     * 
     * @param acctClass
     */
    public void setAcctClass(java.lang.String acctClass) {
        this.acctClass = acctClass;
    }


    /**
     * Gets the currencyID value for this AccountInfo.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this AccountInfo.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the initBalance value for this AccountInfo.
     * 
     * @return initBalance
     */
    public java.lang.Long getInitBalance() {
        return initBalance;
    }


    /**
     * Sets the initBalance value for this AccountInfo.
     * 
     * @param initBalance
     */
    public void setInitBalance(java.lang.Long initBalance) {
        this.initBalance = initBalance;
    }


    /**
     * Gets the creditLimit value for this AccountInfo.
     * 
     * @return creditLimit
     */
    public com.huawei.www.bme.cbsinterface.bccommon.AccountInfoCreditLimit[] getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this AccountInfo.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(com.huawei.www.bme.cbsinterface.bccommon.AccountInfoCreditLimit[] creditLimit) {
        this.creditLimit = creditLimit;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.AccountInfoCreditLimit getCreditLimit(int i) {
        return this.creditLimit[i];
    }

    public void setCreditLimit(int i, com.huawei.www.bme.cbsinterface.bccommon.AccountInfoCreditLimit _value) {
        this.creditLimit[i] = _value;
    }


    /**
     * Gets the acctPayMethod value for this AccountInfo.
     * 
     * @return acctPayMethod
     */
    public java.lang.String getAcctPayMethod() {
        return acctPayMethod;
    }


    /**
     * Sets the acctPayMethod value for this AccountInfo.
     * 
     * @param acctPayMethod
     */
    public void setAcctPayMethod(java.lang.String acctPayMethod) {
        this.acctPayMethod = acctPayMethod;
    }


    /**
     * Gets the autoPayChannel value for this AccountInfo.
     * 
     * @return autoPayChannel
     */
    public com.huawei.www.bme.cbsinterface.bccommon.AccountInfoAutoPayChannel[] getAutoPayChannel() {
        return autoPayChannel;
    }


    /**
     * Sets the autoPayChannel value for this AccountInfo.
     * 
     * @param autoPayChannel
     */
    public void setAutoPayChannel(com.huawei.www.bme.cbsinterface.bccommon.AccountInfoAutoPayChannel[] autoPayChannel) {
        this.autoPayChannel = autoPayChannel;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.AccountInfoAutoPayChannel getAutoPayChannel(int i) {
        return this.autoPayChannel[i];
    }

    public void setAutoPayChannel(int i, com.huawei.www.bme.cbsinterface.bccommon.AccountInfoAutoPayChannel _value) {
        this.autoPayChannel[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountInfo)) return false;
        AccountInfo other = (AccountInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctCode==null && other.getAcctCode()==null) || 
             (this.acctCode!=null &&
              this.acctCode.equals(other.getAcctCode()))) &&
            ((this.userCustomerKey==null && other.getUserCustomerKey()==null) || 
             (this.userCustomerKey!=null &&
              this.userCustomerKey.equals(other.getUserCustomerKey()))) &&
            ((this.parentAcctKey==null && other.getParentAcctKey()==null) || 
             (this.parentAcctKey!=null &&
              this.parentAcctKey.equals(other.getParentAcctKey()))) &&
            ((this.acctBasicInfo==null && other.getAcctBasicInfo()==null) || 
             (this.acctBasicInfo!=null &&
              this.acctBasicInfo.equals(other.getAcctBasicInfo()))) &&
            ((this.billCycleType==null && other.getBillCycleType()==null) || 
             (this.billCycleType!=null &&
              this.billCycleType.equals(other.getBillCycleType()))) &&
            ((this.acctType==null && other.getAcctType()==null) || 
             (this.acctType!=null &&
              this.acctType.equals(other.getAcctType()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.acctClass==null && other.getAcctClass()==null) || 
             (this.acctClass!=null &&
              this.acctClass.equals(other.getAcctClass()))) &&
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
        if (getAcctCode() != null) {
            _hashCode += getAcctCode().hashCode();
        }
        if (getUserCustomerKey() != null) {
            _hashCode += getUserCustomerKey().hashCode();
        }
        if (getParentAcctKey() != null) {
            _hashCode += getParentAcctKey().hashCode();
        }
        if (getAcctBasicInfo() != null) {
            _hashCode += getAcctBasicInfo().hashCode();
        }
        if (getBillCycleType() != null) {
            _hashCode += getBillCycleType().hashCode();
        }
        if (getAcctType() != null) {
            _hashCode += getAcctType().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getAcctClass() != null) {
            _hashCode += getAcctClass().hashCode();
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
        new org.apache.axis.description.TypeDesc(AccountInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AccountInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AcctCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCustomerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "UserCustomerKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentAcctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ParentAcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctBasicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AcctBasicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AccountBasicInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BillCycleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AcctType"));
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
        elemField.setFieldName("acctClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AcctClass"));
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
        elemField.setFieldName("initBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "InitBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CreditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">AccountInfo>CreditLimit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctPayMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AcctPayMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPayChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AutoPayChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">AccountInfo>AutoPayChannel"));
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
