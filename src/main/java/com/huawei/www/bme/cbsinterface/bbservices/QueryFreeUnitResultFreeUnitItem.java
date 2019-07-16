/**
 * QueryFreeUnitResultFreeUnitItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryFreeUnitResultFreeUnitItem  implements java.io.Serializable {
    private java.lang.String freeUnitType;

    private java.lang.String freeUnitTypeName;

    private java.lang.String measureUnit;

    private java.lang.String measureUnitName;

    private long totalInitialAmount;

    private long totalUnusedAmount;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail[] freeUnitItemDetail;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemMemberUsageList[] memberUsageList;

    public QueryFreeUnitResultFreeUnitItem() {
    }

    public QueryFreeUnitResultFreeUnitItem(
           java.lang.String freeUnitType,
           java.lang.String freeUnitTypeName,
           java.lang.String measureUnit,
           java.lang.String measureUnitName,
           long totalInitialAmount,
           long totalUnusedAmount,
           com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail[] freeUnitItemDetail,
           com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemMemberUsageList[] memberUsageList) {
           this.freeUnitType = freeUnitType;
           this.freeUnitTypeName = freeUnitTypeName;
           this.measureUnit = measureUnit;
           this.measureUnitName = measureUnitName;
           this.totalInitialAmount = totalInitialAmount;
           this.totalUnusedAmount = totalUnusedAmount;
           this.freeUnitItemDetail = freeUnitItemDetail;
           this.memberUsageList = memberUsageList;
    }


    /**
     * Gets the freeUnitType value for this QueryFreeUnitResultFreeUnitItem.
     * 
     * @return freeUnitType
     */
    public java.lang.String getFreeUnitType() {
        return freeUnitType;
    }


    /**
     * Sets the freeUnitType value for this QueryFreeUnitResultFreeUnitItem.
     * 
     * @param freeUnitType
     */
    public void setFreeUnitType(java.lang.String freeUnitType) {
        this.freeUnitType = freeUnitType;
    }


    /**
     * Gets the freeUnitTypeName value for this QueryFreeUnitResultFreeUnitItem.
     * 
     * @return freeUnitTypeName
     */
    public java.lang.String getFreeUnitTypeName() {
        return freeUnitTypeName;
    }


    /**
     * Sets the freeUnitTypeName value for this QueryFreeUnitResultFreeUnitItem.
     * 
     * @param freeUnitTypeName
     */
    public void setFreeUnitTypeName(java.lang.String freeUnitTypeName) {
        this.freeUnitTypeName = freeUnitTypeName;
    }


    /**
     * Gets the measureUnit value for this QueryFreeUnitResultFreeUnitItem.
     * 
     * @return measureUnit
     */
    public java.lang.String getMeasureUnit() {
        return measureUnit;
    }


    /**
     * Sets the measureUnit value for this QueryFreeUnitResultFreeUnitItem.
     * 
     * @param measureUnit
     */
    public void setMeasureUnit(java.lang.String measureUnit) {
        this.measureUnit = measureUnit;
    }


    /**
     * Gets the measureUnitName value for this QueryFreeUnitResultFreeUnitItem.
     * 
     * @return measureUnitName
     */
    public java.lang.String getMeasureUnitName() {
        return measureUnitName;
    }


    /**
     * Sets the measureUnitName value for this QueryFreeUnitResultFreeUnitItem.
     * 
     * @param measureUnitName
     */
    public void setMeasureUnitName(java.lang.String measureUnitName) {
        this.measureUnitName = measureUnitName;
    }


    /**
     * Gets the totalInitialAmount value for this QueryFreeUnitResultFreeUnitItem.
     * 
     * @return totalInitialAmount
     */
    public long getTotalInitialAmount() {
        return totalInitialAmount;
    }


    /**
     * Sets the totalInitialAmount value for this QueryFreeUnitResultFreeUnitItem.
     * 
     * @param totalInitialAmount
     */
    public void setTotalInitialAmount(long totalInitialAmount) {
        this.totalInitialAmount = totalInitialAmount;
    }


    /**
     * Gets the totalUnusedAmount value for this QueryFreeUnitResultFreeUnitItem.
     * 
     * @return totalUnusedAmount
     */
    public long getTotalUnusedAmount() {
        return totalUnusedAmount;
    }


    /**
     * Sets the totalUnusedAmount value for this QueryFreeUnitResultFreeUnitItem.
     * 
     * @param totalUnusedAmount
     */
    public void setTotalUnusedAmount(long totalUnusedAmount) {
        this.totalUnusedAmount = totalUnusedAmount;
    }


    /**
     * Gets the freeUnitItemDetail value for this QueryFreeUnitResultFreeUnitItem.
     * 
     * @return freeUnitItemDetail
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail[] getFreeUnitItemDetail() {
        return freeUnitItemDetail;
    }


    /**
     * Sets the freeUnitItemDetail value for this QueryFreeUnitResultFreeUnitItem.
     * 
     * @param freeUnitItemDetail
     */
    public void setFreeUnitItemDetail(com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail[] freeUnitItemDetail) {
        this.freeUnitItemDetail = freeUnitItemDetail;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail getFreeUnitItemDetail(int i) {
        return this.freeUnitItemDetail[i];
    }

    public void setFreeUnitItemDetail(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetail _value) {
        this.freeUnitItemDetail[i] = _value;
    }


    /**
     * Gets the memberUsageList value for this QueryFreeUnitResultFreeUnitItem.
     * 
     * @return memberUsageList
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemMemberUsageList[] getMemberUsageList() {
        return memberUsageList;
    }


    /**
     * Sets the memberUsageList value for this QueryFreeUnitResultFreeUnitItem.
     * 
     * @param memberUsageList
     */
    public void setMemberUsageList(com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemMemberUsageList[] memberUsageList) {
        this.memberUsageList = memberUsageList;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemMemberUsageList getMemberUsageList(int i) {
        return this.memberUsageList[i];
    }

    public void setMemberUsageList(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemMemberUsageList _value) {
        this.memberUsageList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryFreeUnitResultFreeUnitItem)) return false;
        QueryFreeUnitResultFreeUnitItem other = (QueryFreeUnitResultFreeUnitItem) obj;
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
            ((this.freeUnitTypeName==null && other.getFreeUnitTypeName()==null) || 
             (this.freeUnitTypeName!=null &&
              this.freeUnitTypeName.equals(other.getFreeUnitTypeName()))) &&
            ((this.measureUnit==null && other.getMeasureUnit()==null) || 
             (this.measureUnit!=null &&
              this.measureUnit.equals(other.getMeasureUnit()))) &&
            ((this.measureUnitName==null && other.getMeasureUnitName()==null) || 
             (this.measureUnitName!=null &&
              this.measureUnitName.equals(other.getMeasureUnitName()))) &&
            this.totalInitialAmount == other.getTotalInitialAmount() &&
            this.totalUnusedAmount == other.getTotalUnusedAmount() &&
            ((this.freeUnitItemDetail==null && other.getFreeUnitItemDetail()==null) || 
             (this.freeUnitItemDetail!=null &&
              java.util.Arrays.equals(this.freeUnitItemDetail, other.getFreeUnitItemDetail()))) &&
            ((this.memberUsageList==null && other.getMemberUsageList()==null) || 
             (this.memberUsageList!=null &&
              java.util.Arrays.equals(this.memberUsageList, other.getMemberUsageList())));
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
        if (getFreeUnitTypeName() != null) {
            _hashCode += getFreeUnitTypeName().hashCode();
        }
        if (getMeasureUnit() != null) {
            _hashCode += getMeasureUnit().hashCode();
        }
        if (getMeasureUnitName() != null) {
            _hashCode += getMeasureUnitName().hashCode();
        }
        _hashCode += new Long(getTotalInitialAmount()).hashCode();
        _hashCode += new Long(getTotalUnusedAmount()).hashCode();
        if (getFreeUnitItemDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeUnitItemDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeUnitItemDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemberUsageList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemberUsageList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemberUsageList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryFreeUnitResultFreeUnitItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryFreeUnitResult>FreeUnitItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FreeUnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FreeUnitTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "MeasureUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "MeasureUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalInitialAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "TotalInitialAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalUnusedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "TotalUnusedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitItemDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FreeUnitItemDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryFreeUnitResult>FreeUnitItem>FreeUnitItemDetail"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberUsageList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "MemberUsageList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryFreeUnitResult>FreeUnitItem>MemberUsageList"));
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
