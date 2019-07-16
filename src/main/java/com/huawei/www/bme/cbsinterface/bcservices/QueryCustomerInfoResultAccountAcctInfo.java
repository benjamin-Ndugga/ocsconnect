/**
 * QueryCustomerInfoResultAccountAcctInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryCustomerInfoResultAccountAcctInfo  implements java.io.Serializable {
    private java.lang.String acctCode;

    private java.lang.String userCustomerKey;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfoUserCustomer userCustomer;

    /* There is a account hierarchy in the system. If a account node
     * has a parent node in the account hierarchy, this field is the parent
     * account key. */
    private java.lang.String parentAcctKey;

    private java.lang.String rootAcctKey;

    private com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo acctBasicInfo;

    private java.lang.String billCycleType;

    private java.lang.String acctType;

    private java.lang.String paymentType;

    private java.lang.String acctClass;

    private java.math.BigInteger currencyID;

    private java.lang.String acctPayMethod;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfoAutoPayChannel[] autoPayChannel;

    private com.huawei.www.bme.cbsinterface.bccommon.Address[] addressInfo;

    private java.lang.String billCycleOpenDate;

    private java.lang.String billCycleEndDate;

    public QueryCustomerInfoResultAccountAcctInfo() {
    }

    public QueryCustomerInfoResultAccountAcctInfo(
           java.lang.String acctCode,
           java.lang.String userCustomerKey,
           com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfoUserCustomer userCustomer,
           java.lang.String parentAcctKey,
           java.lang.String rootAcctKey,
           com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo acctBasicInfo,
           java.lang.String billCycleType,
           java.lang.String acctType,
           java.lang.String paymentType,
           java.lang.String acctClass,
           java.math.BigInteger currencyID,
           java.lang.String acctPayMethod,
           com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfoAutoPayChannel[] autoPayChannel,
           com.huawei.www.bme.cbsinterface.bccommon.Address[] addressInfo,
           java.lang.String billCycleOpenDate,
           java.lang.String billCycleEndDate) {
           this.acctCode = acctCode;
           this.userCustomerKey = userCustomerKey;
           this.userCustomer = userCustomer;
           this.parentAcctKey = parentAcctKey;
           this.rootAcctKey = rootAcctKey;
           this.acctBasicInfo = acctBasicInfo;
           this.billCycleType = billCycleType;
           this.acctType = acctType;
           this.paymentType = paymentType;
           this.acctClass = acctClass;
           this.currencyID = currencyID;
           this.acctPayMethod = acctPayMethod;
           this.autoPayChannel = autoPayChannel;
           this.addressInfo = addressInfo;
           this.billCycleOpenDate = billCycleOpenDate;
           this.billCycleEndDate = billCycleEndDate;
    }


    /**
     * Gets the acctCode value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @return acctCode
     */
    public java.lang.String getAcctCode() {
        return acctCode;
    }


    /**
     * Sets the acctCode value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @param acctCode
     */
    public void setAcctCode(java.lang.String acctCode) {
        this.acctCode = acctCode;
    }


    /**
     * Gets the userCustomerKey value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @return userCustomerKey
     */
    public java.lang.String getUserCustomerKey() {
        return userCustomerKey;
    }


    /**
     * Sets the userCustomerKey value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @param userCustomerKey
     */
    public void setUserCustomerKey(java.lang.String userCustomerKey) {
        this.userCustomerKey = userCustomerKey;
    }


    /**
     * Gets the userCustomer value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @return userCustomer
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfoUserCustomer getUserCustomer() {
        return userCustomer;
    }


    /**
     * Sets the userCustomer value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @param userCustomer
     */
    public void setUserCustomer(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfoUserCustomer userCustomer) {
        this.userCustomer = userCustomer;
    }


    /**
     * Gets the parentAcctKey value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @return parentAcctKey   * There is a account hierarchy in the system. If a account node
     * has a parent node in the account hierarchy, this field is the parent
     * account key.
     */
    public java.lang.String getParentAcctKey() {
        return parentAcctKey;
    }


    /**
     * Sets the parentAcctKey value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @param parentAcctKey   * There is a account hierarchy in the system. If a account node
     * has a parent node in the account hierarchy, this field is the parent
     * account key.
     */
    public void setParentAcctKey(java.lang.String parentAcctKey) {
        this.parentAcctKey = parentAcctKey;
    }


    /**
     * Gets the rootAcctKey value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @return rootAcctKey
     */
    public java.lang.String getRootAcctKey() {
        return rootAcctKey;
    }


    /**
     * Sets the rootAcctKey value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @param rootAcctKey
     */
    public void setRootAcctKey(java.lang.String rootAcctKey) {
        this.rootAcctKey = rootAcctKey;
    }


    /**
     * Gets the acctBasicInfo value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @return acctBasicInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo getAcctBasicInfo() {
        return acctBasicInfo;
    }


    /**
     * Sets the acctBasicInfo value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @param acctBasicInfo
     */
    public void setAcctBasicInfo(com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo acctBasicInfo) {
        this.acctBasicInfo = acctBasicInfo;
    }


    /**
     * Gets the billCycleType value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @return billCycleType
     */
    public java.lang.String getBillCycleType() {
        return billCycleType;
    }


    /**
     * Sets the billCycleType value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @param billCycleType
     */
    public void setBillCycleType(java.lang.String billCycleType) {
        this.billCycleType = billCycleType;
    }


    /**
     * Gets the acctType value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @return acctType
     */
    public java.lang.String getAcctType() {
        return acctType;
    }


    /**
     * Sets the acctType value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @param acctType
     */
    public void setAcctType(java.lang.String acctType) {
        this.acctType = acctType;
    }


    /**
     * Gets the paymentType value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @return paymentType
     */
    public java.lang.String getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.String paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the acctClass value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @return acctClass
     */
    public java.lang.String getAcctClass() {
        return acctClass;
    }


    /**
     * Sets the acctClass value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @param acctClass
     */
    public void setAcctClass(java.lang.String acctClass) {
        this.acctClass = acctClass;
    }


    /**
     * Gets the currencyID value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the acctPayMethod value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @return acctPayMethod
     */
    public java.lang.String getAcctPayMethod() {
        return acctPayMethod;
    }


    /**
     * Sets the acctPayMethod value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @param acctPayMethod
     */
    public void setAcctPayMethod(java.lang.String acctPayMethod) {
        this.acctPayMethod = acctPayMethod;
    }


    /**
     * Gets the autoPayChannel value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @return autoPayChannel
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfoAutoPayChannel[] getAutoPayChannel() {
        return autoPayChannel;
    }


    /**
     * Sets the autoPayChannel value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @param autoPayChannel
     */
    public void setAutoPayChannel(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfoAutoPayChannel[] autoPayChannel) {
        this.autoPayChannel = autoPayChannel;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfoAutoPayChannel getAutoPayChannel(int i) {
        return this.autoPayChannel[i];
    }

    public void setAutoPayChannel(int i, com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfoAutoPayChannel _value) {
        this.autoPayChannel[i] = _value;
    }


    /**
     * Gets the addressInfo value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @return addressInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Address[] getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(com.huawei.www.bme.cbsinterface.bccommon.Address[] addressInfo) {
        this.addressInfo = addressInfo;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.Address getAddressInfo(int i) {
        return this.addressInfo[i];
    }

    public void setAddressInfo(int i, com.huawei.www.bme.cbsinterface.bccommon.Address _value) {
        this.addressInfo[i] = _value;
    }


    /**
     * Gets the billCycleOpenDate value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @return billCycleOpenDate
     */
    public java.lang.String getBillCycleOpenDate() {
        return billCycleOpenDate;
    }


    /**
     * Sets the billCycleOpenDate value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @param billCycleOpenDate
     */
    public void setBillCycleOpenDate(java.lang.String billCycleOpenDate) {
        this.billCycleOpenDate = billCycleOpenDate;
    }


    /**
     * Gets the billCycleEndDate value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @return billCycleEndDate
     */
    public java.lang.String getBillCycleEndDate() {
        return billCycleEndDate;
    }


    /**
     * Sets the billCycleEndDate value for this QueryCustomerInfoResultAccountAcctInfo.
     * 
     * @param billCycleEndDate
     */
    public void setBillCycleEndDate(java.lang.String billCycleEndDate) {
        this.billCycleEndDate = billCycleEndDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCustomerInfoResultAccountAcctInfo)) return false;
        QueryCustomerInfoResultAccountAcctInfo other = (QueryCustomerInfoResultAccountAcctInfo) obj;
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
            ((this.userCustomer==null && other.getUserCustomer()==null) || 
             (this.userCustomer!=null &&
              this.userCustomer.equals(other.getUserCustomer()))) &&
            ((this.parentAcctKey==null && other.getParentAcctKey()==null) || 
             (this.parentAcctKey!=null &&
              this.parentAcctKey.equals(other.getParentAcctKey()))) &&
            ((this.rootAcctKey==null && other.getRootAcctKey()==null) || 
             (this.rootAcctKey!=null &&
              this.rootAcctKey.equals(other.getRootAcctKey()))) &&
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
            ((this.acctPayMethod==null && other.getAcctPayMethod()==null) || 
             (this.acctPayMethod!=null &&
              this.acctPayMethod.equals(other.getAcctPayMethod()))) &&
            ((this.autoPayChannel==null && other.getAutoPayChannel()==null) || 
             (this.autoPayChannel!=null &&
              java.util.Arrays.equals(this.autoPayChannel, other.getAutoPayChannel()))) &&
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              java.util.Arrays.equals(this.addressInfo, other.getAddressInfo()))) &&
            ((this.billCycleOpenDate==null && other.getBillCycleOpenDate()==null) || 
             (this.billCycleOpenDate!=null &&
              this.billCycleOpenDate.equals(other.getBillCycleOpenDate()))) &&
            ((this.billCycleEndDate==null && other.getBillCycleEndDate()==null) || 
             (this.billCycleEndDate!=null &&
              this.billCycleEndDate.equals(other.getBillCycleEndDate())));
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
        if (getUserCustomer() != null) {
            _hashCode += getUserCustomer().hashCode();
        }
        if (getParentAcctKey() != null) {
            _hashCode += getParentAcctKey().hashCode();
        }
        if (getRootAcctKey() != null) {
            _hashCode += getRootAcctKey().hashCode();
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
        if (getAddressInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillCycleOpenDate() != null) {
            _hashCode += getBillCycleOpenDate().hashCode();
        }
        if (getBillCycleEndDate() != null) {
            _hashCode += getBillCycleEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCustomerInfoResultAccountAcctInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>Account>AcctInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCustomerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UserCustomerKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UserCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>QueryCustomerInfoResult>Account>AcctInfo>UserCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentAcctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ParentAcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootAcctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RootAcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctBasicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctBasicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AccountBasicInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BillCycleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctPayMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctPayMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPayChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AutoPayChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>QueryCustomerInfoResult>Account>AcctInfo>AutoPayChannel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleOpenDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BillCycleOpenDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BillCycleEndDate"));
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
