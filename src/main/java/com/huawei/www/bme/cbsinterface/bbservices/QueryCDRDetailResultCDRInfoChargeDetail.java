/**
 * QueryCDRDetailResultCDRInfoChargeDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryCDRDetailResultCDRInfoChargeDetail  implements java.io.Serializable {
    private java.lang.String chargeCode;

    private java.lang.String chargeCodeName;

    private long chargeAmount;

    private java.lang.String payAcctKey;

    private java.lang.String payObjClass;

    private java.lang.String payObjType;

    private long payObjID;

    /* 具体的批价Offering ID, 0 表示全局资费 */
    private java.math.BigInteger offeringID;

    /* 全局的计划标识 */
    private java.lang.Long planID;

    private java.math.BigInteger currencyID;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoChargeDetailTax[] tax;

    /* 当前账本金额 azerfon需求 */
    private long currentAmount;

    /* 帐本失效时间 azerfon需求 */
    private java.lang.String curExpireTime;

    public QueryCDRDetailResultCDRInfoChargeDetail() {
    }

    public QueryCDRDetailResultCDRInfoChargeDetail(
           java.lang.String chargeCode,
           java.lang.String chargeCodeName,
           long chargeAmount,
           java.lang.String payAcctKey,
           java.lang.String payObjClass,
           java.lang.String payObjType,
           long payObjID,
           java.math.BigInteger offeringID,
           java.lang.Long planID,
           java.math.BigInteger currencyID,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoChargeDetailTax[] tax,
           long currentAmount,
           java.lang.String curExpireTime) {
           this.chargeCode = chargeCode;
           this.chargeCodeName = chargeCodeName;
           this.chargeAmount = chargeAmount;
           this.payAcctKey = payAcctKey;
           this.payObjClass = payObjClass;
           this.payObjType = payObjType;
           this.payObjID = payObjID;
           this.offeringID = offeringID;
           this.planID = planID;
           this.currencyID = currencyID;
           this.tax = tax;
           this.currentAmount = currentAmount;
           this.curExpireTime = curExpireTime;
    }


    /**
     * Gets the chargeCode value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @return chargeCode
     */
    public java.lang.String getChargeCode() {
        return chargeCode;
    }


    /**
     * Sets the chargeCode value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @param chargeCode
     */
    public void setChargeCode(java.lang.String chargeCode) {
        this.chargeCode = chargeCode;
    }


    /**
     * Gets the chargeCodeName value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @return chargeCodeName
     */
    public java.lang.String getChargeCodeName() {
        return chargeCodeName;
    }


    /**
     * Sets the chargeCodeName value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @param chargeCodeName
     */
    public void setChargeCodeName(java.lang.String chargeCodeName) {
        this.chargeCodeName = chargeCodeName;
    }


    /**
     * Gets the chargeAmount value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @return chargeAmount
     */
    public long getChargeAmount() {
        return chargeAmount;
    }


    /**
     * Sets the chargeAmount value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @param chargeAmount
     */
    public void setChargeAmount(long chargeAmount) {
        this.chargeAmount = chargeAmount;
    }


    /**
     * Gets the payAcctKey value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @return payAcctKey
     */
    public java.lang.String getPayAcctKey() {
        return payAcctKey;
    }


    /**
     * Sets the payAcctKey value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @param payAcctKey
     */
    public void setPayAcctKey(java.lang.String payAcctKey) {
        this.payAcctKey = payAcctKey;
    }


    /**
     * Gets the payObjClass value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @return payObjClass
     */
    public java.lang.String getPayObjClass() {
        return payObjClass;
    }


    /**
     * Sets the payObjClass value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @param payObjClass
     */
    public void setPayObjClass(java.lang.String payObjClass) {
        this.payObjClass = payObjClass;
    }


    /**
     * Gets the payObjType value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @return payObjType
     */
    public java.lang.String getPayObjType() {
        return payObjType;
    }


    /**
     * Sets the payObjType value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @param payObjType
     */
    public void setPayObjType(java.lang.String payObjType) {
        this.payObjType = payObjType;
    }


    /**
     * Gets the payObjID value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @return payObjID
     */
    public long getPayObjID() {
        return payObjID;
    }


    /**
     * Sets the payObjID value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @param payObjID
     */
    public void setPayObjID(long payObjID) {
        this.payObjID = payObjID;
    }


    /**
     * Gets the offeringID value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @return offeringID   * 具体的批价Offering ID, 0 表示全局资费
     */
    public java.math.BigInteger getOfferingID() {
        return offeringID;
    }


    /**
     * Sets the offeringID value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @param offeringID   * 具体的批价Offering ID, 0 表示全局资费
     */
    public void setOfferingID(java.math.BigInteger offeringID) {
        this.offeringID = offeringID;
    }


    /**
     * Gets the planID value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @return planID   * 全局的计划标识
     */
    public java.lang.Long getPlanID() {
        return planID;
    }


    /**
     * Sets the planID value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @param planID   * 全局的计划标识
     */
    public void setPlanID(java.lang.Long planID) {
        this.planID = planID;
    }


    /**
     * Gets the currencyID value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the tax value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @return tax
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoChargeDetailTax[] getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @param tax
     */
    public void setTax(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoChargeDetailTax[] tax) {
        this.tax = tax;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoChargeDetailTax getTax(int i) {
        return this.tax[i];
    }

    public void setTax(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoChargeDetailTax _value) {
        this.tax[i] = _value;
    }


    /**
     * Gets the currentAmount value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @return currentAmount   * 当前账本金额 azerfon需求
     */
    public long getCurrentAmount() {
        return currentAmount;
    }


    /**
     * Sets the currentAmount value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @param currentAmount   * 当前账本金额 azerfon需求
     */
    public void setCurrentAmount(long currentAmount) {
        this.currentAmount = currentAmount;
    }


    /**
     * Gets the curExpireTime value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @return curExpireTime   * 帐本失效时间 azerfon需求
     */
    public java.lang.String getCurExpireTime() {
        return curExpireTime;
    }


    /**
     * Sets the curExpireTime value for this QueryCDRDetailResultCDRInfoChargeDetail.
     * 
     * @param curExpireTime   * 帐本失效时间 azerfon需求
     */
    public void setCurExpireTime(java.lang.String curExpireTime) {
        this.curExpireTime = curExpireTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCDRDetailResultCDRInfoChargeDetail)) return false;
        QueryCDRDetailResultCDRInfoChargeDetail other = (QueryCDRDetailResultCDRInfoChargeDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chargeCode==null && other.getChargeCode()==null) || 
             (this.chargeCode!=null &&
              this.chargeCode.equals(other.getChargeCode()))) &&
            ((this.chargeCodeName==null && other.getChargeCodeName()==null) || 
             (this.chargeCodeName!=null &&
              this.chargeCodeName.equals(other.getChargeCodeName()))) &&
            this.chargeAmount == other.getChargeAmount() &&
            ((this.payAcctKey==null && other.getPayAcctKey()==null) || 
             (this.payAcctKey!=null &&
              this.payAcctKey.equals(other.getPayAcctKey()))) &&
            ((this.payObjClass==null && other.getPayObjClass()==null) || 
             (this.payObjClass!=null &&
              this.payObjClass.equals(other.getPayObjClass()))) &&
            ((this.payObjType==null && other.getPayObjType()==null) || 
             (this.payObjType!=null &&
              this.payObjType.equals(other.getPayObjType()))) &&
            this.payObjID == other.getPayObjID() &&
            ((this.offeringID==null && other.getOfferingID()==null) || 
             (this.offeringID!=null &&
              this.offeringID.equals(other.getOfferingID()))) &&
            ((this.planID==null && other.getPlanID()==null) || 
             (this.planID!=null &&
              this.planID.equals(other.getPlanID()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              java.util.Arrays.equals(this.tax, other.getTax()))) &&
            this.currentAmount == other.getCurrentAmount() &&
            ((this.curExpireTime==null && other.getCurExpireTime()==null) || 
             (this.curExpireTime!=null &&
              this.curExpireTime.equals(other.getCurExpireTime())));
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
        if (getChargeCode() != null) {
            _hashCode += getChargeCode().hashCode();
        }
        if (getChargeCodeName() != null) {
            _hashCode += getChargeCodeName().hashCode();
        }
        _hashCode += new Long(getChargeAmount()).hashCode();
        if (getPayAcctKey() != null) {
            _hashCode += getPayAcctKey().hashCode();
        }
        if (getPayObjClass() != null) {
            _hashCode += getPayObjClass().hashCode();
        }
        if (getPayObjType() != null) {
            _hashCode += getPayObjType().hashCode();
        }
        _hashCode += new Long(getPayObjID()).hashCode();
        if (getOfferingID() != null) {
            _hashCode += getOfferingID().hashCode();
        }
        if (getPlanID() != null) {
            _hashCode += getPlanID().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getTax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTax(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getCurrentAmount()).hashCode();
        if (getCurExpireTime() != null) {
            _hashCode += getCurExpireTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCDRDetailResultCDRInfoChargeDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRDetailResult>CDRInfo>ChargeDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ChargeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCodeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ChargeCodeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ChargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payAcctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "PayAcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payObjClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "PayObjClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payObjType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "PayObjType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payObjID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "PayObjID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "OfferingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "PlanID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRDetailResult>CDRInfo>ChargeDetail>Tax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CurrentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curExpireTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CurExpireTime"));
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
