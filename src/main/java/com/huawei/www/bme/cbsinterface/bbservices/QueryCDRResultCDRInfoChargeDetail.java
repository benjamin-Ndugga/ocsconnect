/**
 * QueryCDRResultCDRInfoChargeDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryCDRResultCDRInfoChargeDetail  implements java.io.Serializable {
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

    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoChargeDetailTax[] tax;

    public QueryCDRResultCDRInfoChargeDetail() {
    }

    public QueryCDRResultCDRInfoChargeDetail(
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
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoChargeDetailTax[] tax) {
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
    }


    /**
     * Gets the chargeCode value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @return chargeCode
     */
    public java.lang.String getChargeCode() {
        return chargeCode;
    }


    /**
     * Sets the chargeCode value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @param chargeCode
     */
    public void setChargeCode(java.lang.String chargeCode) {
        this.chargeCode = chargeCode;
    }


    /**
     * Gets the chargeCodeName value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @return chargeCodeName
     */
    public java.lang.String getChargeCodeName() {
        return chargeCodeName;
    }


    /**
     * Sets the chargeCodeName value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @param chargeCodeName
     */
    public void setChargeCodeName(java.lang.String chargeCodeName) {
        this.chargeCodeName = chargeCodeName;
    }


    /**
     * Gets the chargeAmount value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @return chargeAmount
     */
    public long getChargeAmount() {
        return chargeAmount;
    }


    /**
     * Sets the chargeAmount value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @param chargeAmount
     */
    public void setChargeAmount(long chargeAmount) {
        this.chargeAmount = chargeAmount;
    }


    /**
     * Gets the payAcctKey value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @return payAcctKey
     */
    public java.lang.String getPayAcctKey() {
        return payAcctKey;
    }


    /**
     * Sets the payAcctKey value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @param payAcctKey
     */
    public void setPayAcctKey(java.lang.String payAcctKey) {
        this.payAcctKey = payAcctKey;
    }


    /**
     * Gets the payObjClass value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @return payObjClass
     */
    public java.lang.String getPayObjClass() {
        return payObjClass;
    }


    /**
     * Sets the payObjClass value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @param payObjClass
     */
    public void setPayObjClass(java.lang.String payObjClass) {
        this.payObjClass = payObjClass;
    }


    /**
     * Gets the payObjType value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @return payObjType
     */
    public java.lang.String getPayObjType() {
        return payObjType;
    }


    /**
     * Sets the payObjType value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @param payObjType
     */
    public void setPayObjType(java.lang.String payObjType) {
        this.payObjType = payObjType;
    }


    /**
     * Gets the payObjID value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @return payObjID
     */
    public long getPayObjID() {
        return payObjID;
    }


    /**
     * Sets the payObjID value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @param payObjID
     */
    public void setPayObjID(long payObjID) {
        this.payObjID = payObjID;
    }


    /**
     * Gets the offeringID value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @return offeringID   * 具体的批价Offering ID, 0 表示全局资费
     */
    public java.math.BigInteger getOfferingID() {
        return offeringID;
    }


    /**
     * Sets the offeringID value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @param offeringID   * 具体的批价Offering ID, 0 表示全局资费
     */
    public void setOfferingID(java.math.BigInteger offeringID) {
        this.offeringID = offeringID;
    }


    /**
     * Gets the planID value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @return planID   * 全局的计划标识
     */
    public java.lang.Long getPlanID() {
        return planID;
    }


    /**
     * Sets the planID value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @param planID   * 全局的计划标识
     */
    public void setPlanID(java.lang.Long planID) {
        this.planID = planID;
    }


    /**
     * Gets the currencyID value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the tax value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @return tax
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoChargeDetailTax[] getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this QueryCDRResultCDRInfoChargeDetail.
     * 
     * @param tax
     */
    public void setTax(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoChargeDetailTax[] tax) {
        this.tax = tax;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoChargeDetailTax getTax(int i) {
        return this.tax[i];
    }

    public void setTax(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoChargeDetailTax _value) {
        this.tax[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCDRResultCDRInfoChargeDetail)) return false;
        QueryCDRResultCDRInfoChargeDetail other = (QueryCDRResultCDRInfoChargeDetail) obj;
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
              java.util.Arrays.equals(this.tax, other.getTax())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCDRResultCDRInfoChargeDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRInfo>ChargeDetail"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRResult>CDRInfo>ChargeDetail>Tax"));
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
