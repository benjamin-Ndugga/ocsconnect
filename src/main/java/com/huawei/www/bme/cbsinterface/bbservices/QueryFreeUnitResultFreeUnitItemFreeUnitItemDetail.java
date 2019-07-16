/**
 * QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail  implements java.io.Serializable {
    private long freeUnitInstanceID;

    private long initialAmount;

    private long currentAmount;

    private java.lang.String effectiveTime;

    private java.lang.String expireTime;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin freeUnitOrigin;

    private java.lang.String rollOverFlag;

    private java.lang.String lastRollOveredTime;

    public QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail() {
    }

    public QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail(
           long freeUnitInstanceID,
           long initialAmount,
           long currentAmount,
           java.lang.String effectiveTime,
           java.lang.String expireTime,
           com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin freeUnitOrigin,
           java.lang.String rollOverFlag,
           java.lang.String lastRollOveredTime) {
           this.freeUnitInstanceID = freeUnitInstanceID;
           this.initialAmount = initialAmount;
           this.currentAmount = currentAmount;
           this.effectiveTime = effectiveTime;
           this.expireTime = expireTime;
           this.freeUnitOrigin = freeUnitOrigin;
           this.rollOverFlag = rollOverFlag;
           this.lastRollOveredTime = lastRollOveredTime;
    }


    /**
     * Gets the freeUnitInstanceID value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.
     * 
     * @return freeUnitInstanceID
     */
    public long getFreeUnitInstanceID() {
        return freeUnitInstanceID;
    }


    /**
     * Sets the freeUnitInstanceID value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.
     * 
     * @param freeUnitInstanceID
     */
    public void setFreeUnitInstanceID(long freeUnitInstanceID) {
        this.freeUnitInstanceID = freeUnitInstanceID;
    }


    /**
     * Gets the initialAmount value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.
     * 
     * @return initialAmount
     */
    public long getInitialAmount() {
        return initialAmount;
    }


    /**
     * Sets the initialAmount value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.
     * 
     * @param initialAmount
     */
    public void setInitialAmount(long initialAmount) {
        this.initialAmount = initialAmount;
    }


    /**
     * Gets the currentAmount value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.
     * 
     * @return currentAmount
     */
    public long getCurrentAmount() {
        return currentAmount;
    }


    /**
     * Sets the currentAmount value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.
     * 
     * @param currentAmount
     */
    public void setCurrentAmount(long currentAmount) {
        this.currentAmount = currentAmount;
    }


    /**
     * Gets the effectiveTime value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.
     * 
     * @return effectiveTime
     */
    public java.lang.String getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(java.lang.String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the expireTime value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.
     * 
     * @return expireTime
     */
    public java.lang.String getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the expireTime value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.
     * 
     * @param expireTime
     */
    public void setExpireTime(java.lang.String expireTime) {
        this.expireTime = expireTime;
    }


    /**
     * Gets the freeUnitOrigin value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.
     * 
     * @return freeUnitOrigin
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin getFreeUnitOrigin() {
        return freeUnitOrigin;
    }


    /**
     * Sets the freeUnitOrigin value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.
     * 
     * @param freeUnitOrigin
     */
    public void setFreeUnitOrigin(com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin freeUnitOrigin) {
        this.freeUnitOrigin = freeUnitOrigin;
    }


    /**
     * Gets the rollOverFlag value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.
     * 
     * @return rollOverFlag
     */
    public java.lang.String getRollOverFlag() {
        return rollOverFlag;
    }


    /**
     * Sets the rollOverFlag value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.
     * 
     * @param rollOverFlag
     */
    public void setRollOverFlag(java.lang.String rollOverFlag) {
        this.rollOverFlag = rollOverFlag;
    }


    /**
     * Gets the lastRollOveredTime value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.
     * 
     * @return lastRollOveredTime
     */
    public java.lang.String getLastRollOveredTime() {
        return lastRollOveredTime;
    }


    /**
     * Sets the lastRollOveredTime value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.
     * 
     * @param lastRollOveredTime
     */
    public void setLastRollOveredTime(java.lang.String lastRollOveredTime) {
        this.lastRollOveredTime = lastRollOveredTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail)) return false;
        QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail other = (QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.freeUnitInstanceID == other.getFreeUnitInstanceID() &&
            this.initialAmount == other.getInitialAmount() &&
            this.currentAmount == other.getCurrentAmount() &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime()))) &&
            ((this.expireTime==null && other.getExpireTime()==null) || 
             (this.expireTime!=null &&
              this.expireTime.equals(other.getExpireTime()))) &&
            ((this.freeUnitOrigin==null && other.getFreeUnitOrigin()==null) || 
             (this.freeUnitOrigin!=null &&
              this.freeUnitOrigin.equals(other.getFreeUnitOrigin()))) &&
            ((this.rollOverFlag==null && other.getRollOverFlag()==null) || 
             (this.rollOverFlag!=null &&
              this.rollOverFlag.equals(other.getRollOverFlag()))) &&
            ((this.lastRollOveredTime==null && other.getLastRollOveredTime()==null) || 
             (this.lastRollOveredTime!=null &&
              this.lastRollOveredTime.equals(other.getLastRollOveredTime())));
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
        _hashCode += new Long(getFreeUnitInstanceID()).hashCode();
        _hashCode += new Long(getInitialAmount()).hashCode();
        _hashCode += new Long(getCurrentAmount()).hashCode();
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        if (getExpireTime() != null) {
            _hashCode += getExpireTime().hashCode();
        }
        if (getFreeUnitOrigin() != null) {
            _hashCode += getFreeUnitOrigin().hashCode();
        }
        if (getRollOverFlag() != null) {
            _hashCode += getRollOverFlag().hashCode();
        }
        if (getLastRollOveredTime() != null) {
            _hashCode += getLastRollOveredTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryFreeUnitResult>FreeUnitItem>FreeUnitItemDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitInstanceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FreeUnitInstanceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "InitialAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CurrentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ExpireTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FreeUnitOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryFreeUnitResult>FreeUnitItem>FreeUnitItemDetail>FreeUnitOrigin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rollOverFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "RollOverFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRollOveredTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "LastRollOveredTime"));
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
