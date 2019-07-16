/**
 * ChangeSubPwdResultCreditLimitChangeList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubPwdResultCreditLimitChangeList  implements java.io.Serializable {
    private java.lang.String acctKey;

    private java.lang.String creditLimitType;

    private long creditInstID;

    private long originLimitAmt;

    private long paidAmt;

    private long currentAmt;

    private java.math.BigInteger currencyID;

    private java.lang.String accmBeginDate;

    private java.lang.String accmEndDate;

    public ChangeSubPwdResultCreditLimitChangeList() {
    }

    public ChangeSubPwdResultCreditLimitChangeList(
           java.lang.String acctKey,
           java.lang.String creditLimitType,
           long creditInstID,
           long originLimitAmt,
           long paidAmt,
           long currentAmt,
           java.math.BigInteger currencyID,
           java.lang.String accmBeginDate,
           java.lang.String accmEndDate) {
           this.acctKey = acctKey;
           this.creditLimitType = creditLimitType;
           this.creditInstID = creditInstID;
           this.originLimitAmt = originLimitAmt;
           this.paidAmt = paidAmt;
           this.currentAmt = currentAmt;
           this.currencyID = currencyID;
           this.accmBeginDate = accmBeginDate;
           this.accmEndDate = accmEndDate;
    }


    /**
     * Gets the acctKey value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @return acctKey
     */
    public java.lang.String getAcctKey() {
        return acctKey;
    }


    /**
     * Sets the acctKey value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @param acctKey
     */
    public void setAcctKey(java.lang.String acctKey) {
        this.acctKey = acctKey;
    }


    /**
     * Gets the creditLimitType value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @return creditLimitType
     */
    public java.lang.String getCreditLimitType() {
        return creditLimitType;
    }


    /**
     * Sets the creditLimitType value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @param creditLimitType
     */
    public void setCreditLimitType(java.lang.String creditLimitType) {
        this.creditLimitType = creditLimitType;
    }


    /**
     * Gets the creditInstID value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @return creditInstID
     */
    public long getCreditInstID() {
        return creditInstID;
    }


    /**
     * Sets the creditInstID value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @param creditInstID
     */
    public void setCreditInstID(long creditInstID) {
        this.creditInstID = creditInstID;
    }


    /**
     * Gets the originLimitAmt value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @return originLimitAmt
     */
    public long getOriginLimitAmt() {
        return originLimitAmt;
    }


    /**
     * Sets the originLimitAmt value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @param originLimitAmt
     */
    public void setOriginLimitAmt(long originLimitAmt) {
        this.originLimitAmt = originLimitAmt;
    }


    /**
     * Gets the paidAmt value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @return paidAmt
     */
    public long getPaidAmt() {
        return paidAmt;
    }


    /**
     * Sets the paidAmt value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @param paidAmt
     */
    public void setPaidAmt(long paidAmt) {
        this.paidAmt = paidAmt;
    }


    /**
     * Gets the currentAmt value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @return currentAmt
     */
    public long getCurrentAmt() {
        return currentAmt;
    }


    /**
     * Sets the currentAmt value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @param currentAmt
     */
    public void setCurrentAmt(long currentAmt) {
        this.currentAmt = currentAmt;
    }


    /**
     * Gets the currencyID value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the accmBeginDate value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @return accmBeginDate
     */
    public java.lang.String getAccmBeginDate() {
        return accmBeginDate;
    }


    /**
     * Sets the accmBeginDate value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @param accmBeginDate
     */
    public void setAccmBeginDate(java.lang.String accmBeginDate) {
        this.accmBeginDate = accmBeginDate;
    }


    /**
     * Gets the accmEndDate value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @return accmEndDate
     */
    public java.lang.String getAccmEndDate() {
        return accmEndDate;
    }


    /**
     * Sets the accmEndDate value for this ChangeSubPwdResultCreditLimitChangeList.
     * 
     * @param accmEndDate
     */
    public void setAccmEndDate(java.lang.String accmEndDate) {
        this.accmEndDate = accmEndDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubPwdResultCreditLimitChangeList)) return false;
        ChangeSubPwdResultCreditLimitChangeList other = (ChangeSubPwdResultCreditLimitChangeList) obj;
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
            ((this.creditLimitType==null && other.getCreditLimitType()==null) || 
             (this.creditLimitType!=null &&
              this.creditLimitType.equals(other.getCreditLimitType()))) &&
            this.creditInstID == other.getCreditInstID() &&
            this.originLimitAmt == other.getOriginLimitAmt() &&
            this.paidAmt == other.getPaidAmt() &&
            this.currentAmt == other.getCurrentAmt() &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.accmBeginDate==null && other.getAccmBeginDate()==null) || 
             (this.accmBeginDate!=null &&
              this.accmBeginDate.equals(other.getAccmBeginDate()))) &&
            ((this.accmEndDate==null && other.getAccmEndDate()==null) || 
             (this.accmEndDate!=null &&
              this.accmEndDate.equals(other.getAccmEndDate())));
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
        if (getCreditLimitType() != null) {
            _hashCode += getCreditLimitType().hashCode();
        }
        _hashCode += new Long(getCreditInstID()).hashCode();
        _hashCode += new Long(getOriginLimitAmt()).hashCode();
        _hashCode += new Long(getPaidAmt()).hashCode();
        _hashCode += new Long(getCurrentAmt()).hashCode();
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getAccmBeginDate() != null) {
            _hashCode += getAccmBeginDate().hashCode();
        }
        if (getAccmEndDate() != null) {
            _hashCode += getAccmEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubPwdResultCreditLimitChangeList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPwdResult>CreditLimitChangeList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreditLimitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditInstID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreditInstID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originLimitAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OriginLimitAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaidAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CurrentAmt"));
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
        elemField.setFieldName("accmBeginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AccmBeginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accmEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AccmEndDate"));
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
