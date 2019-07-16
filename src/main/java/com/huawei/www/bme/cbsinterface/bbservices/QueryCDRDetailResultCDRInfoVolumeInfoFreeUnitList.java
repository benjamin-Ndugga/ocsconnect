/**
 * QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList  implements java.io.Serializable {
    /* 免费资源的类型编码 */
    private java.lang.String freeUnitType;

    /* 免费用量值 */
    private long amount;

    /* 免费资源标识 azerfon需求 */
    private java.lang.String freeUnitId;

    /* 当前的免费资源值 azerfon需求 */
    private long curAmount;

    /* 免费资源的失效时间 azerfon需求 */
    private java.lang.String curExpireTime;

    public QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList() {
    }

    public QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList(
           java.lang.String freeUnitType,
           long amount,
           java.lang.String freeUnitId,
           long curAmount,
           java.lang.String curExpireTime) {
           this.freeUnitType = freeUnitType;
           this.amount = amount;
           this.freeUnitId = freeUnitId;
           this.curAmount = curAmount;
           this.curExpireTime = curExpireTime;
    }


    /**
     * Gets the freeUnitType value for this QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList.
     * 
     * @return freeUnitType   * 免费资源的类型编码
     */
    public java.lang.String getFreeUnitType() {
        return freeUnitType;
    }


    /**
     * Sets the freeUnitType value for this QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList.
     * 
     * @param freeUnitType   * 免费资源的类型编码
     */
    public void setFreeUnitType(java.lang.String freeUnitType) {
        this.freeUnitType = freeUnitType;
    }


    /**
     * Gets the amount value for this QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList.
     * 
     * @return amount   * 免费用量值
     */
    public long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList.
     * 
     * @param amount   * 免费用量值
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }


    /**
     * Gets the freeUnitId value for this QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList.
     * 
     * @return freeUnitId   * 免费资源标识 azerfon需求
     */
    public java.lang.String getFreeUnitId() {
        return freeUnitId;
    }


    /**
     * Sets the freeUnitId value for this QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList.
     * 
     * @param freeUnitId   * 免费资源标识 azerfon需求
     */
    public void setFreeUnitId(java.lang.String freeUnitId) {
        this.freeUnitId = freeUnitId;
    }


    /**
     * Gets the curAmount value for this QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList.
     * 
     * @return curAmount   * 当前的免费资源值 azerfon需求
     */
    public long getCurAmount() {
        return curAmount;
    }


    /**
     * Sets the curAmount value for this QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList.
     * 
     * @param curAmount   * 当前的免费资源值 azerfon需求
     */
    public void setCurAmount(long curAmount) {
        this.curAmount = curAmount;
    }


    /**
     * Gets the curExpireTime value for this QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList.
     * 
     * @return curExpireTime   * 免费资源的失效时间 azerfon需求
     */
    public java.lang.String getCurExpireTime() {
        return curExpireTime;
    }


    /**
     * Sets the curExpireTime value for this QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList.
     * 
     * @param curExpireTime   * 免费资源的失效时间 azerfon需求
     */
    public void setCurExpireTime(java.lang.String curExpireTime) {
        this.curExpireTime = curExpireTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList)) return false;
        QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList other = (QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.freeUnitType==null && other.getFreeUnitType()==null) || 
             (this.freeUnitType!=null &&
              this.freeUnitType.equals(other.getFreeUnitType()))) &&
            this.amount == other.getAmount() &&
            ((this.freeUnitId==null && other.getFreeUnitId()==null) || 
             (this.freeUnitId!=null &&
              this.freeUnitId.equals(other.getFreeUnitId()))) &&
            this.curAmount == other.getCurAmount() &&
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
        if (getFreeUnitType() != null) {
            _hashCode += getFreeUnitType().hashCode();
        }
        _hashCode += new Long(getAmount()).hashCode();
        if (getFreeUnitId() != null) {
            _hashCode += getFreeUnitId().hashCode();
        }
        _hashCode += new Long(getCurAmount()).hashCode();
        if (getCurExpireTime() != null) {
            _hashCode += getCurExpireTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRDetailResult>CDRInfo>VolumeInfo>FreeUnitList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FreeUnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FreeUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CurAmount"));
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
