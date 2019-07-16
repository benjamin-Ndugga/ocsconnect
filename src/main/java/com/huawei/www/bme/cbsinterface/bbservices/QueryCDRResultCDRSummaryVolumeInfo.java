/**
 * QueryCDRResultCDRSummaryVolumeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryCDRResultCDRSummaryVolumeInfo  implements java.io.Serializable {
    /* 实际用量值 */
    private long actualVolume;

    /* 批价用量值 */
    private long ratingVolume;

    /* 免费用量值 */
    private long freeVolume;

    private java.math.BigInteger measureUnit;

    /* 免费用量使用的免费资源列表 */
    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryVolumeInfoFreeUnitList[] freeUnitList;

    public QueryCDRResultCDRSummaryVolumeInfo() {
    }

    public QueryCDRResultCDRSummaryVolumeInfo(
           long actualVolume,
           long ratingVolume,
           long freeVolume,
           java.math.BigInteger measureUnit,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryVolumeInfoFreeUnitList[] freeUnitList) {
           this.actualVolume = actualVolume;
           this.ratingVolume = ratingVolume;
           this.freeVolume = freeVolume;
           this.measureUnit = measureUnit;
           this.freeUnitList = freeUnitList;
    }


    /**
     * Gets the actualVolume value for this QueryCDRResultCDRSummaryVolumeInfo.
     * 
     * @return actualVolume   * 实际用量值
     */
    public long getActualVolume() {
        return actualVolume;
    }


    /**
     * Sets the actualVolume value for this QueryCDRResultCDRSummaryVolumeInfo.
     * 
     * @param actualVolume   * 实际用量值
     */
    public void setActualVolume(long actualVolume) {
        this.actualVolume = actualVolume;
    }


    /**
     * Gets the ratingVolume value for this QueryCDRResultCDRSummaryVolumeInfo.
     * 
     * @return ratingVolume   * 批价用量值
     */
    public long getRatingVolume() {
        return ratingVolume;
    }


    /**
     * Sets the ratingVolume value for this QueryCDRResultCDRSummaryVolumeInfo.
     * 
     * @param ratingVolume   * 批价用量值
     */
    public void setRatingVolume(long ratingVolume) {
        this.ratingVolume = ratingVolume;
    }


    /**
     * Gets the freeVolume value for this QueryCDRResultCDRSummaryVolumeInfo.
     * 
     * @return freeVolume   * 免费用量值
     */
    public long getFreeVolume() {
        return freeVolume;
    }


    /**
     * Sets the freeVolume value for this QueryCDRResultCDRSummaryVolumeInfo.
     * 
     * @param freeVolume   * 免费用量值
     */
    public void setFreeVolume(long freeVolume) {
        this.freeVolume = freeVolume;
    }


    /**
     * Gets the measureUnit value for this QueryCDRResultCDRSummaryVolumeInfo.
     * 
     * @return measureUnit
     */
    public java.math.BigInteger getMeasureUnit() {
        return measureUnit;
    }


    /**
     * Sets the measureUnit value for this QueryCDRResultCDRSummaryVolumeInfo.
     * 
     * @param measureUnit
     */
    public void setMeasureUnit(java.math.BigInteger measureUnit) {
        this.measureUnit = measureUnit;
    }


    /**
     * Gets the freeUnitList value for this QueryCDRResultCDRSummaryVolumeInfo.
     * 
     * @return freeUnitList   * 免费用量使用的免费资源列表
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryVolumeInfoFreeUnitList[] getFreeUnitList() {
        return freeUnitList;
    }


    /**
     * Sets the freeUnitList value for this QueryCDRResultCDRSummaryVolumeInfo.
     * 
     * @param freeUnitList   * 免费用量使用的免费资源列表
     */
    public void setFreeUnitList(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryVolumeInfoFreeUnitList[] freeUnitList) {
        this.freeUnitList = freeUnitList;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryVolumeInfoFreeUnitList getFreeUnitList(int i) {
        return this.freeUnitList[i];
    }

    public void setFreeUnitList(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryVolumeInfoFreeUnitList _value) {
        this.freeUnitList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCDRResultCDRSummaryVolumeInfo)) return false;
        QueryCDRResultCDRSummaryVolumeInfo other = (QueryCDRResultCDRSummaryVolumeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.actualVolume == other.getActualVolume() &&
            this.ratingVolume == other.getRatingVolume() &&
            this.freeVolume == other.getFreeVolume() &&
            ((this.measureUnit==null && other.getMeasureUnit()==null) || 
             (this.measureUnit!=null &&
              this.measureUnit.equals(other.getMeasureUnit()))) &&
            ((this.freeUnitList==null && other.getFreeUnitList()==null) || 
             (this.freeUnitList!=null &&
              java.util.Arrays.equals(this.freeUnitList, other.getFreeUnitList())));
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
        _hashCode += new Long(getActualVolume()).hashCode();
        _hashCode += new Long(getRatingVolume()).hashCode();
        _hashCode += new Long(getFreeVolume()).hashCode();
        if (getMeasureUnit() != null) {
            _hashCode += getMeasureUnit().hashCode();
        }
        if (getFreeUnitList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeUnitList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeUnitList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryCDRResultCDRSummaryVolumeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRSummary>VolumeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ActualVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratingVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "RatingVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FreeVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "MeasureUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FreeUnitList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRResult>CDRSummary>VolumeInfo>FreeUnitList"));
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
