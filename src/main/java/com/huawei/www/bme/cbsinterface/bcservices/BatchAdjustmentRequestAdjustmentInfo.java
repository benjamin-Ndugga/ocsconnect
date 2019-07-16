/**
 * BatchAdjustmentRequestAdjustmentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchAdjustmentRequestAdjustmentInfo  implements java.io.Serializable {
    private java.lang.String balanceType;

    private java.lang.Long balanceID;

    /* It indicates the adjustment is up or down */
    private java.lang.String adjustmentType;

    private java.lang.Long adjustmentAmt;

    private java.math.BigInteger currencyID;

    private java.lang.String effectiveTime;

    private java.lang.String expireTime;

    /* add at EMTS for adjustment */
    private java.lang.Integer extendDays;

    public BatchAdjustmentRequestAdjustmentInfo() {
    }

    public BatchAdjustmentRequestAdjustmentInfo(
           java.lang.String balanceType,
           java.lang.Long balanceID,
           java.lang.String adjustmentType,
           java.lang.Long adjustmentAmt,
           java.math.BigInteger currencyID,
           java.lang.String effectiveTime,
           java.lang.String expireTime,
           java.lang.Integer extendDays) {
           this.balanceType = balanceType;
           this.balanceID = balanceID;
           this.adjustmentType = adjustmentType;
           this.adjustmentAmt = adjustmentAmt;
           this.currencyID = currencyID;
           this.effectiveTime = effectiveTime;
           this.expireTime = expireTime;
           this.extendDays = extendDays;
    }


    /**
     * Gets the balanceType value for this BatchAdjustmentRequestAdjustmentInfo.
     * 
     * @return balanceType
     */
    public java.lang.String getBalanceType() {
        return balanceType;
    }


    /**
     * Sets the balanceType value for this BatchAdjustmentRequestAdjustmentInfo.
     * 
     * @param balanceType
     */
    public void setBalanceType(java.lang.String balanceType) {
        this.balanceType = balanceType;
    }


    /**
     * Gets the balanceID value for this BatchAdjustmentRequestAdjustmentInfo.
     * 
     * @return balanceID
     */
    public java.lang.Long getBalanceID() {
        return balanceID;
    }


    /**
     * Sets the balanceID value for this BatchAdjustmentRequestAdjustmentInfo.
     * 
     * @param balanceID
     */
    public void setBalanceID(java.lang.Long balanceID) {
        this.balanceID = balanceID;
    }


    /**
     * Gets the adjustmentType value for this BatchAdjustmentRequestAdjustmentInfo.
     * 
     * @return adjustmentType   * It indicates the adjustment is up or down
     */
    public java.lang.String getAdjustmentType() {
        return adjustmentType;
    }


    /**
     * Sets the adjustmentType value for this BatchAdjustmentRequestAdjustmentInfo.
     * 
     * @param adjustmentType   * It indicates the adjustment is up or down
     */
    public void setAdjustmentType(java.lang.String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }


    /**
     * Gets the adjustmentAmt value for this BatchAdjustmentRequestAdjustmentInfo.
     * 
     * @return adjustmentAmt
     */
    public java.lang.Long getAdjustmentAmt() {
        return adjustmentAmt;
    }


    /**
     * Sets the adjustmentAmt value for this BatchAdjustmentRequestAdjustmentInfo.
     * 
     * @param adjustmentAmt
     */
    public void setAdjustmentAmt(java.lang.Long adjustmentAmt) {
        this.adjustmentAmt = adjustmentAmt;
    }


    /**
     * Gets the currencyID value for this BatchAdjustmentRequestAdjustmentInfo.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this BatchAdjustmentRequestAdjustmentInfo.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the effectiveTime value for this BatchAdjustmentRequestAdjustmentInfo.
     * 
     * @return effectiveTime
     */
    public java.lang.String getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this BatchAdjustmentRequestAdjustmentInfo.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(java.lang.String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the expireTime value for this BatchAdjustmentRequestAdjustmentInfo.
     * 
     * @return expireTime
     */
    public java.lang.String getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the expireTime value for this BatchAdjustmentRequestAdjustmentInfo.
     * 
     * @param expireTime
     */
    public void setExpireTime(java.lang.String expireTime) {
        this.expireTime = expireTime;
    }


    /**
     * Gets the extendDays value for this BatchAdjustmentRequestAdjustmentInfo.
     * 
     * @return extendDays   * add at EMTS for adjustment
     */
    public java.lang.Integer getExtendDays() {
        return extendDays;
    }


    /**
     * Sets the extendDays value for this BatchAdjustmentRequestAdjustmentInfo.
     * 
     * @param extendDays   * add at EMTS for adjustment
     */
    public void setExtendDays(java.lang.Integer extendDays) {
        this.extendDays = extendDays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchAdjustmentRequestAdjustmentInfo)) return false;
        BatchAdjustmentRequestAdjustmentInfo other = (BatchAdjustmentRequestAdjustmentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balanceType==null && other.getBalanceType()==null) || 
             (this.balanceType!=null &&
              this.balanceType.equals(other.getBalanceType()))) &&
            ((this.balanceID==null && other.getBalanceID()==null) || 
             (this.balanceID!=null &&
              this.balanceID.equals(other.getBalanceID()))) &&
            ((this.adjustmentType==null && other.getAdjustmentType()==null) || 
             (this.adjustmentType!=null &&
              this.adjustmentType.equals(other.getAdjustmentType()))) &&
            ((this.adjustmentAmt==null && other.getAdjustmentAmt()==null) || 
             (this.adjustmentAmt!=null &&
              this.adjustmentAmt.equals(other.getAdjustmentAmt()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime()))) &&
            ((this.expireTime==null && other.getExpireTime()==null) || 
             (this.expireTime!=null &&
              this.expireTime.equals(other.getExpireTime()))) &&
            ((this.extendDays==null && other.getExtendDays()==null) || 
             (this.extendDays!=null &&
              this.extendDays.equals(other.getExtendDays())));
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
        if (getBalanceType() != null) {
            _hashCode += getBalanceType().hashCode();
        }
        if (getBalanceID() != null) {
            _hashCode += getBalanceID().hashCode();
        }
        if (getAdjustmentType() != null) {
            _hashCode += getAdjustmentType().hashCode();
        }
        if (getAdjustmentAmt() != null) {
            _hashCode += getAdjustmentAmt().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        if (getExpireTime() != null) {
            _hashCode += getExpireTime().hashCode();
        }
        if (getExtendDays() != null) {
            _hashCode += getExtendDays().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchAdjustmentRequestAdjustmentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchAdjustmentRequest>AdjustmentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BalanceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BalanceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AdjustmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AdjustmentAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpireTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExtendDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
