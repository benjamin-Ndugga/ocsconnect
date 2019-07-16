/**
 * FeeQuotationResultConsumptionLimitChangeList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class FeeQuotationResultConsumptionLimitChangeList  implements java.io.Serializable {
    private java.lang.String limitCategory;

    private java.lang.String limitOwnerType;

    private java.lang.String limitOwnerKey;

    private java.lang.String limitType;

    private long limitInstID;

    private long originLimitAmt;

    private long paidAmt;

    private long currentAmt;

    private java.math.BigInteger currencyID;

    private java.lang.String accmBeginDate;

    private java.lang.String accmEndDate;

    public FeeQuotationResultConsumptionLimitChangeList() {
    }

    public FeeQuotationResultConsumptionLimitChangeList(
           java.lang.String limitCategory,
           java.lang.String limitOwnerType,
           java.lang.String limitOwnerKey,
           java.lang.String limitType,
           long limitInstID,
           long originLimitAmt,
           long paidAmt,
           long currentAmt,
           java.math.BigInteger currencyID,
           java.lang.String accmBeginDate,
           java.lang.String accmEndDate) {
           this.limitCategory = limitCategory;
           this.limitOwnerType = limitOwnerType;
           this.limitOwnerKey = limitOwnerKey;
           this.limitType = limitType;
           this.limitInstID = limitInstID;
           this.originLimitAmt = originLimitAmt;
           this.paidAmt = paidAmt;
           this.currentAmt = currentAmt;
           this.currencyID = currencyID;
           this.accmBeginDate = accmBeginDate;
           this.accmEndDate = accmEndDate;
    }


    /**
     * Gets the limitCategory value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @return limitCategory
     */
    public java.lang.String getLimitCategory() {
        return limitCategory;
    }


    /**
     * Sets the limitCategory value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @param limitCategory
     */
    public void setLimitCategory(java.lang.String limitCategory) {
        this.limitCategory = limitCategory;
    }


    /**
     * Gets the limitOwnerType value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @return limitOwnerType
     */
    public java.lang.String getLimitOwnerType() {
        return limitOwnerType;
    }


    /**
     * Sets the limitOwnerType value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @param limitOwnerType
     */
    public void setLimitOwnerType(java.lang.String limitOwnerType) {
        this.limitOwnerType = limitOwnerType;
    }


    /**
     * Gets the limitOwnerKey value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @return limitOwnerKey
     */
    public java.lang.String getLimitOwnerKey() {
        return limitOwnerKey;
    }


    /**
     * Sets the limitOwnerKey value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @param limitOwnerKey
     */
    public void setLimitOwnerKey(java.lang.String limitOwnerKey) {
        this.limitOwnerKey = limitOwnerKey;
    }


    /**
     * Gets the limitType value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @return limitType
     */
    public java.lang.String getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @param limitType
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }


    /**
     * Gets the limitInstID value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @return limitInstID
     */
    public long getLimitInstID() {
        return limitInstID;
    }


    /**
     * Sets the limitInstID value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @param limitInstID
     */
    public void setLimitInstID(long limitInstID) {
        this.limitInstID = limitInstID;
    }


    /**
     * Gets the originLimitAmt value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @return originLimitAmt
     */
    public long getOriginLimitAmt() {
        return originLimitAmt;
    }


    /**
     * Sets the originLimitAmt value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @param originLimitAmt
     */
    public void setOriginLimitAmt(long originLimitAmt) {
        this.originLimitAmt = originLimitAmt;
    }


    /**
     * Gets the paidAmt value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @return paidAmt
     */
    public long getPaidAmt() {
        return paidAmt;
    }


    /**
     * Sets the paidAmt value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @param paidAmt
     */
    public void setPaidAmt(long paidAmt) {
        this.paidAmt = paidAmt;
    }


    /**
     * Gets the currentAmt value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @return currentAmt
     */
    public long getCurrentAmt() {
        return currentAmt;
    }


    /**
     * Sets the currentAmt value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @param currentAmt
     */
    public void setCurrentAmt(long currentAmt) {
        this.currentAmt = currentAmt;
    }


    /**
     * Gets the currencyID value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the accmBeginDate value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @return accmBeginDate
     */
    public java.lang.String getAccmBeginDate() {
        return accmBeginDate;
    }


    /**
     * Sets the accmBeginDate value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @param accmBeginDate
     */
    public void setAccmBeginDate(java.lang.String accmBeginDate) {
        this.accmBeginDate = accmBeginDate;
    }


    /**
     * Gets the accmEndDate value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @return accmEndDate
     */
    public java.lang.String getAccmEndDate() {
        return accmEndDate;
    }


    /**
     * Sets the accmEndDate value for this FeeQuotationResultConsumptionLimitChangeList.
     * 
     * @param accmEndDate
     */
    public void setAccmEndDate(java.lang.String accmEndDate) {
        this.accmEndDate = accmEndDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeQuotationResultConsumptionLimitChangeList)) return false;
        FeeQuotationResultConsumptionLimitChangeList other = (FeeQuotationResultConsumptionLimitChangeList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.limitCategory==null && other.getLimitCategory()==null) || 
             (this.limitCategory!=null &&
              this.limitCategory.equals(other.getLimitCategory()))) &&
            ((this.limitOwnerType==null && other.getLimitOwnerType()==null) || 
             (this.limitOwnerType!=null &&
              this.limitOwnerType.equals(other.getLimitOwnerType()))) &&
            ((this.limitOwnerKey==null && other.getLimitOwnerKey()==null) || 
             (this.limitOwnerKey!=null &&
              this.limitOwnerKey.equals(other.getLimitOwnerKey()))) &&
            ((this.limitType==null && other.getLimitType()==null) || 
             (this.limitType!=null &&
              this.limitType.equals(other.getLimitType()))) &&
            this.limitInstID == other.getLimitInstID() &&
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
        if (getLimitCategory() != null) {
            _hashCode += getLimitCategory().hashCode();
        }
        if (getLimitOwnerType() != null) {
            _hashCode += getLimitOwnerType().hashCode();
        }
        if (getLimitOwnerKey() != null) {
            _hashCode += getLimitOwnerKey().hashCode();
        }
        if (getLimitType() != null) {
            _hashCode += getLimitType().hashCode();
        }
        _hashCode += new Long(getLimitInstID()).hashCode();
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
        new org.apache.axis.description.TypeDesc(FeeQuotationResultConsumptionLimitChangeList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationResult>ConsumptionLimitChangeList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitOwnerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitOwnerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitOwnerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitOwnerKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitInstID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitInstID"));
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
