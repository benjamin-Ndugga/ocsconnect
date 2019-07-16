/**
 * QueryDataPackageUsageResultUsageList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryDataPackageUsageResultUsageList  implements java.io.Serializable {
    private java.lang.String freeUnitType;

    private long initialAmount;

    private long currentAmount;

    private long usedAmount;

    private java.math.BigInteger measureUnit;

    private java.lang.Long todayUsedAmount;

    public QueryDataPackageUsageResultUsageList() {
    }

    public QueryDataPackageUsageResultUsageList(
           java.lang.String freeUnitType,
           long initialAmount,
           long currentAmount,
           long usedAmount,
           java.math.BigInteger measureUnit,
           java.lang.Long todayUsedAmount) {
           this.freeUnitType = freeUnitType;
           this.initialAmount = initialAmount;
           this.currentAmount = currentAmount;
           this.usedAmount = usedAmount;
           this.measureUnit = measureUnit;
           this.todayUsedAmount = todayUsedAmount;
    }


    /**
     * Gets the freeUnitType value for this QueryDataPackageUsageResultUsageList.
     * 
     * @return freeUnitType
     */
    public java.lang.String getFreeUnitType() {
        return freeUnitType;
    }


    /**
     * Sets the freeUnitType value for this QueryDataPackageUsageResultUsageList.
     * 
     * @param freeUnitType
     */
    public void setFreeUnitType(java.lang.String freeUnitType) {
        this.freeUnitType = freeUnitType;
    }


    /**
     * Gets the initialAmount value for this QueryDataPackageUsageResultUsageList.
     * 
     * @return initialAmount
     */
    public long getInitialAmount() {
        return initialAmount;
    }


    /**
     * Sets the initialAmount value for this QueryDataPackageUsageResultUsageList.
     * 
     * @param initialAmount
     */
    public void setInitialAmount(long initialAmount) {
        this.initialAmount = initialAmount;
    }


    /**
     * Gets the currentAmount value for this QueryDataPackageUsageResultUsageList.
     * 
     * @return currentAmount
     */
    public long getCurrentAmount() {
        return currentAmount;
    }


    /**
     * Sets the currentAmount value for this QueryDataPackageUsageResultUsageList.
     * 
     * @param currentAmount
     */
    public void setCurrentAmount(long currentAmount) {
        this.currentAmount = currentAmount;
    }


    /**
     * Gets the usedAmount value for this QueryDataPackageUsageResultUsageList.
     * 
     * @return usedAmount
     */
    public long getUsedAmount() {
        return usedAmount;
    }


    /**
     * Sets the usedAmount value for this QueryDataPackageUsageResultUsageList.
     * 
     * @param usedAmount
     */
    public void setUsedAmount(long usedAmount) {
        this.usedAmount = usedAmount;
    }


    /**
     * Gets the measureUnit value for this QueryDataPackageUsageResultUsageList.
     * 
     * @return measureUnit
     */
    public java.math.BigInteger getMeasureUnit() {
        return measureUnit;
    }


    /**
     * Sets the measureUnit value for this QueryDataPackageUsageResultUsageList.
     * 
     * @param measureUnit
     */
    public void setMeasureUnit(java.math.BigInteger measureUnit) {
        this.measureUnit = measureUnit;
    }


    /**
     * Gets the todayUsedAmount value for this QueryDataPackageUsageResultUsageList.
     * 
     * @return todayUsedAmount
     */
    public java.lang.Long getTodayUsedAmount() {
        return todayUsedAmount;
    }


    /**
     * Sets the todayUsedAmount value for this QueryDataPackageUsageResultUsageList.
     * 
     * @param todayUsedAmount
     */
    public void setTodayUsedAmount(java.lang.Long todayUsedAmount) {
        this.todayUsedAmount = todayUsedAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryDataPackageUsageResultUsageList)) return false;
        QueryDataPackageUsageResultUsageList other = (QueryDataPackageUsageResultUsageList) obj;
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
            this.initialAmount == other.getInitialAmount() &&
            this.currentAmount == other.getCurrentAmount() &&
            this.usedAmount == other.getUsedAmount() &&
            ((this.measureUnit==null && other.getMeasureUnit()==null) || 
             (this.measureUnit!=null &&
              this.measureUnit.equals(other.getMeasureUnit()))) &&
            ((this.todayUsedAmount==null && other.getTodayUsedAmount()==null) || 
             (this.todayUsedAmount!=null &&
              this.todayUsedAmount.equals(other.getTodayUsedAmount())));
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
        _hashCode += new Long(getInitialAmount()).hashCode();
        _hashCode += new Long(getCurrentAmount()).hashCode();
        _hashCode += new Long(getUsedAmount()).hashCode();
        if (getMeasureUnit() != null) {
            _hashCode += getMeasureUnit().hashCode();
        }
        if (getTodayUsedAmount() != null) {
            _hashCode += getTodayUsedAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryDataPackageUsageResultUsageList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryDataPackageUsageResult>UsageList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FreeUnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "InitialAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CurrentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UsedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "MeasureUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("todayUsedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "TodayUsedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
