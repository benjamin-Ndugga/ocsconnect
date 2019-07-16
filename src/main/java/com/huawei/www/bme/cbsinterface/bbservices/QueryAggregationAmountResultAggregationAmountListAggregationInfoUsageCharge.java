/**
 * QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge  implements java.io.Serializable {
    private java.lang.String subCategory;

    private java.lang.String chargeCode;

    private long chargeAmount;

    private java.math.BigInteger currencyID;

    /* 实际业务量 */
    private java.lang.Long actualVolume;

    /* 批价折扣 */
    private java.lang.Long ratingDiscVolume;

    /* 免费业务量 */
    private java.lang.Long freeVolume;

    /* 批价业务量 */
    private java.lang.Long ratingVolume;

    /* 业务量的度量单位， 如 KB , MB */
    private java.math.BigInteger measureUnit;

    /* It is reserved for future extension */
    private com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] additionalProperty;

    public QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge() {
    }

    public QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge(
           java.lang.String subCategory,
           java.lang.String chargeCode,
           long chargeAmount,
           java.math.BigInteger currencyID,
           java.lang.Long actualVolume,
           java.lang.Long ratingDiscVolume,
           java.lang.Long freeVolume,
           java.lang.Long ratingVolume,
           java.math.BigInteger measureUnit,
           com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] additionalProperty) {
           this.subCategory = subCategory;
           this.chargeCode = chargeCode;
           this.chargeAmount = chargeAmount;
           this.currencyID = currencyID;
           this.actualVolume = actualVolume;
           this.ratingDiscVolume = ratingDiscVolume;
           this.freeVolume = freeVolume;
           this.ratingVolume = ratingVolume;
           this.measureUnit = measureUnit;
           this.additionalProperty = additionalProperty;
    }


    /**
     * Gets the subCategory value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @return subCategory
     */
    public java.lang.String getSubCategory() {
        return subCategory;
    }


    /**
     * Sets the subCategory value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @param subCategory
     */
    public void setSubCategory(java.lang.String subCategory) {
        this.subCategory = subCategory;
    }


    /**
     * Gets the chargeCode value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @return chargeCode
     */
    public java.lang.String getChargeCode() {
        return chargeCode;
    }


    /**
     * Sets the chargeCode value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @param chargeCode
     */
    public void setChargeCode(java.lang.String chargeCode) {
        this.chargeCode = chargeCode;
    }


    /**
     * Gets the chargeAmount value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @return chargeAmount
     */
    public long getChargeAmount() {
        return chargeAmount;
    }


    /**
     * Sets the chargeAmount value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @param chargeAmount
     */
    public void setChargeAmount(long chargeAmount) {
        this.chargeAmount = chargeAmount;
    }


    /**
     * Gets the currencyID value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the actualVolume value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @return actualVolume   * 实际业务量
     */
    public java.lang.Long getActualVolume() {
        return actualVolume;
    }


    /**
     * Sets the actualVolume value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @param actualVolume   * 实际业务量
     */
    public void setActualVolume(java.lang.Long actualVolume) {
        this.actualVolume = actualVolume;
    }


    /**
     * Gets the ratingDiscVolume value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @return ratingDiscVolume   * 批价折扣
     */
    public java.lang.Long getRatingDiscVolume() {
        return ratingDiscVolume;
    }


    /**
     * Sets the ratingDiscVolume value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @param ratingDiscVolume   * 批价折扣
     */
    public void setRatingDiscVolume(java.lang.Long ratingDiscVolume) {
        this.ratingDiscVolume = ratingDiscVolume;
    }


    /**
     * Gets the freeVolume value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @return freeVolume   * 免费业务量
     */
    public java.lang.Long getFreeVolume() {
        return freeVolume;
    }


    /**
     * Sets the freeVolume value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @param freeVolume   * 免费业务量
     */
    public void setFreeVolume(java.lang.Long freeVolume) {
        this.freeVolume = freeVolume;
    }


    /**
     * Gets the ratingVolume value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @return ratingVolume   * 批价业务量
     */
    public java.lang.Long getRatingVolume() {
        return ratingVolume;
    }


    /**
     * Sets the ratingVolume value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @param ratingVolume   * 批价业务量
     */
    public void setRatingVolume(java.lang.Long ratingVolume) {
        this.ratingVolume = ratingVolume;
    }


    /**
     * Gets the measureUnit value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @return measureUnit   * 业务量的度量单位， 如 KB , MB
     */
    public java.math.BigInteger getMeasureUnit() {
        return measureUnit;
    }


    /**
     * Sets the measureUnit value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @param measureUnit   * 业务量的度量单位， 如 KB , MB
     */
    public void setMeasureUnit(java.math.BigInteger measureUnit) {
        this.measureUnit = measureUnit;
    }


    /**
     * Gets the additionalProperty value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
     * 
     * @return additionalProperty   * It is reserved for future extension
     */
    public com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] getAdditionalProperty() {
        return additionalProperty;
    }


    /**
     * Sets the additionalProperty value for this QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.
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
        if (!(obj instanceof QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge)) return false;
        QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge other = (QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge) obj;
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
            this.chargeAmount == other.getChargeAmount() &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.actualVolume==null && other.getActualVolume()==null) || 
             (this.actualVolume!=null &&
              this.actualVolume.equals(other.getActualVolume()))) &&
            ((this.ratingDiscVolume==null && other.getRatingDiscVolume()==null) || 
             (this.ratingDiscVolume!=null &&
              this.ratingDiscVolume.equals(other.getRatingDiscVolume()))) &&
            ((this.freeVolume==null && other.getFreeVolume()==null) || 
             (this.freeVolume!=null &&
              this.freeVolume.equals(other.getFreeVolume()))) &&
            ((this.ratingVolume==null && other.getRatingVolume()==null) || 
             (this.ratingVolume!=null &&
              this.ratingVolume.equals(other.getRatingVolume()))) &&
            ((this.measureUnit==null && other.getMeasureUnit()==null) || 
             (this.measureUnit!=null &&
              this.measureUnit.equals(other.getMeasureUnit()))) &&
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
        _hashCode += new Long(getChargeAmount()).hashCode();
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getActualVolume() != null) {
            _hashCode += getActualVolume().hashCode();
        }
        if (getRatingDiscVolume() != null) {
            _hashCode += getRatingDiscVolume().hashCode();
        }
        if (getFreeVolume() != null) {
            _hashCode += getFreeVolume().hashCode();
        }
        if (getRatingVolume() != null) {
            _hashCode += getRatingVolume().hashCode();
        }
        if (getMeasureUnit() != null) {
            _hashCode += getMeasureUnit().hashCode();
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
        new org.apache.axis.description.TypeDesc(QueryAggregationAmountResultAggregationAmountListAggregationInfoUsageCharge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryAggregationAmountResult>AggregationAmountList>AggregationInfo>UsageCharge"));
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
        elemField.setFieldName("actualVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ActualVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratingDiscVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "RatingDiscVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FreeVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratingVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "RatingVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "MeasureUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
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
