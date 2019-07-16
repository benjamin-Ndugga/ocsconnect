/**
 * QueryCDRResultCDRSummaryVolumeInfoFreeUnitList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryCDRResultCDRSummaryVolumeInfoFreeUnitList  implements java.io.Serializable {
    /* 免费资源的类型编码 */
    private java.lang.String freeUnitType;

    /* 免费用量值 */
    private long amount;

    public QueryCDRResultCDRSummaryVolumeInfoFreeUnitList() {
    }

    public QueryCDRResultCDRSummaryVolumeInfoFreeUnitList(
           java.lang.String freeUnitType,
           long amount) {
           this.freeUnitType = freeUnitType;
           this.amount = amount;
    }


    /**
     * Gets the freeUnitType value for this QueryCDRResultCDRSummaryVolumeInfoFreeUnitList.
     * 
     * @return freeUnitType   * 免费资源的类型编码
     */
    public java.lang.String getFreeUnitType() {
        return freeUnitType;
    }


    /**
     * Sets the freeUnitType value for this QueryCDRResultCDRSummaryVolumeInfoFreeUnitList.
     * 
     * @param freeUnitType   * 免费资源的类型编码
     */
    public void setFreeUnitType(java.lang.String freeUnitType) {
        this.freeUnitType = freeUnitType;
    }


    /**
     * Gets the amount value for this QueryCDRResultCDRSummaryVolumeInfoFreeUnitList.
     * 
     * @return amount   * 免费用量值
     */
    public long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this QueryCDRResultCDRSummaryVolumeInfoFreeUnitList.
     * 
     * @param amount   * 免费用量值
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCDRResultCDRSummaryVolumeInfoFreeUnitList)) return false;
        QueryCDRResultCDRSummaryVolumeInfoFreeUnitList other = (QueryCDRResultCDRSummaryVolumeInfoFreeUnitList) obj;
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
            this.amount == other.getAmount();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCDRResultCDRSummaryVolumeInfoFreeUnitList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRResult>CDRSummary>VolumeInfo>FreeUnitList"));
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
