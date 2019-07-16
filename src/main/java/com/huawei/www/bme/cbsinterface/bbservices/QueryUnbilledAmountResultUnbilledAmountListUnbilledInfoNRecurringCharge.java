/**
 * QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge  implements java.io.Serializable {
    private java.lang.String subCategory;

    private java.lang.String chargeCode;

    private java.lang.String chargeTime;

    private long chargeAmount;

    private java.math.BigInteger currencyID;

    /* It is reserved for future extension */
    private com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] additionalProperty;

    public QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge() {
    }

    public QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge(
           java.lang.String subCategory,
           java.lang.String chargeCode,
           java.lang.String chargeTime,
           long chargeAmount,
           java.math.BigInteger currencyID,
           com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] additionalProperty) {
           this.subCategory = subCategory;
           this.chargeCode = chargeCode;
           this.chargeTime = chargeTime;
           this.chargeAmount = chargeAmount;
           this.currencyID = currencyID;
           this.additionalProperty = additionalProperty;
    }


    /**
     * Gets the subCategory value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge.
     * 
     * @return subCategory
     */
    public java.lang.String getSubCategory() {
        return subCategory;
    }


    /**
     * Sets the subCategory value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge.
     * 
     * @param subCategory
     */
    public void setSubCategory(java.lang.String subCategory) {
        this.subCategory = subCategory;
    }


    /**
     * Gets the chargeCode value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge.
     * 
     * @return chargeCode
     */
    public java.lang.String getChargeCode() {
        return chargeCode;
    }


    /**
     * Sets the chargeCode value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge.
     * 
     * @param chargeCode
     */
    public void setChargeCode(java.lang.String chargeCode) {
        this.chargeCode = chargeCode;
    }


    /**
     * Gets the chargeTime value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge.
     * 
     * @return chargeTime
     */
    public java.lang.String getChargeTime() {
        return chargeTime;
    }


    /**
     * Sets the chargeTime value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge.
     * 
     * @param chargeTime
     */
    public void setChargeTime(java.lang.String chargeTime) {
        this.chargeTime = chargeTime;
    }


    /**
     * Gets the chargeAmount value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge.
     * 
     * @return chargeAmount
     */
    public long getChargeAmount() {
        return chargeAmount;
    }


    /**
     * Sets the chargeAmount value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge.
     * 
     * @param chargeAmount
     */
    public void setChargeAmount(long chargeAmount) {
        this.chargeAmount = chargeAmount;
    }


    /**
     * Gets the currencyID value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the additionalProperty value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge.
     * 
     * @return additionalProperty   * It is reserved for future extension
     */
    public com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] getAdditionalProperty() {
        return additionalProperty;
    }


    /**
     * Sets the additionalProperty value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge.
     * 
     * @param additionalProperty   * It is reserved for future extension
     */
    public void setAdditionalProperty(com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty getAdditionalProperty(int i) {
        return this.additionalProperty[i];
    }

    public void setAdditionalProperty(int i, com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty _value) {
        this.additionalProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge)) return false;
        QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge other = (QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subCategory==null && other.getSubCategory()==null) || 
             (this.subCategory!=null &&
              this.subCategory.equals(other.getSubCategory()))) &&
            ((this.chargeCode==null && other.getChargeCode()==null) || 
             (this.chargeCode!=null &&
              this.chargeCode.equals(other.getChargeCode()))) &&
            ((this.chargeTime==null && other.getChargeTime()==null) || 
             (this.chargeTime!=null &&
              this.chargeTime.equals(other.getChargeTime()))) &&
            this.chargeAmount == other.getChargeAmount() &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.additionalProperty==null && other.getAdditionalProperty()==null) || 
             (this.additionalProperty!=null &&
              java.util.Arrays.equals(this.additionalProperty, other.getAdditionalProperty())));
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
        if (getSubCategory() != null) {
            _hashCode += getSubCategory().hashCode();
        }
        if (getChargeCode() != null) {
            _hashCode += getChargeCode().hashCode();
        }
        if (getChargeTime() != null) {
            _hashCode += getChargeTime().hashCode();
        }
        _hashCode += new Long(getChargeAmount()).hashCode();
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getAdditionalProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalProperty(), i);
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
        new org.apache.axis.description.TypeDesc(QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoNRecurringCharge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryUnbilledAmountResult>UnbilledAmountList>UnbilledInfo>NRecurringCharge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "SubCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ChargeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ChargeTime"));
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
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AdditionalProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SimpleProperty"));
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
