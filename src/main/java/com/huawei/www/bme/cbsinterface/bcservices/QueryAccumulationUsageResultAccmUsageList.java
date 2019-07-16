/**
 * QueryAccumulationUsageResultAccmUsageList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryAccumulationUsageResultAccmUsageList  implements java.io.Serializable {
    private java.lang.String accmType;

    private java.lang.String accmTypeName;

    private long amount;

    private java.lang.String unitType;

    private java.math.BigInteger currencyID;

    private java.math.BigInteger measureID;

    private java.lang.String beginDate;

    private java.lang.String endDate;

    public QueryAccumulationUsageResultAccmUsageList() {
    }

    public QueryAccumulationUsageResultAccmUsageList(
           java.lang.String accmType,
           java.lang.String accmTypeName,
           long amount,
           java.lang.String unitType,
           java.math.BigInteger currencyID,
           java.math.BigInteger measureID,
           java.lang.String beginDate,
           java.lang.String endDate) {
           this.accmType = accmType;
           this.accmTypeName = accmTypeName;
           this.amount = amount;
           this.unitType = unitType;
           this.currencyID = currencyID;
           this.measureID = measureID;
           this.beginDate = beginDate;
           this.endDate = endDate;
    }


    /**
     * Gets the accmType value for this QueryAccumulationUsageResultAccmUsageList.
     * 
     * @return accmType
     */
    public java.lang.String getAccmType() {
        return accmType;
    }


    /**
     * Sets the accmType value for this QueryAccumulationUsageResultAccmUsageList.
     * 
     * @param accmType
     */
    public void setAccmType(java.lang.String accmType) {
        this.accmType = accmType;
    }


    /**
     * Gets the accmTypeName value for this QueryAccumulationUsageResultAccmUsageList.
     * 
     * @return accmTypeName
     */
    public java.lang.String getAccmTypeName() {
        return accmTypeName;
    }


    /**
     * Sets the accmTypeName value for this QueryAccumulationUsageResultAccmUsageList.
     * 
     * @param accmTypeName
     */
    public void setAccmTypeName(java.lang.String accmTypeName) {
        this.accmTypeName = accmTypeName;
    }


    /**
     * Gets the amount value for this QueryAccumulationUsageResultAccmUsageList.
     * 
     * @return amount
     */
    public long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this QueryAccumulationUsageResultAccmUsageList.
     * 
     * @param amount
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }


    /**
     * Gets the unitType value for this QueryAccumulationUsageResultAccmUsageList.
     * 
     * @return unitType
     */
    public java.lang.String getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this QueryAccumulationUsageResultAccmUsageList.
     * 
     * @param unitType
     */
    public void setUnitType(java.lang.String unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the currencyID value for this QueryAccumulationUsageResultAccmUsageList.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this QueryAccumulationUsageResultAccmUsageList.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the measureID value for this QueryAccumulationUsageResultAccmUsageList.
     * 
     * @return measureID
     */
    public java.math.BigInteger getMeasureID() {
        return measureID;
    }


    /**
     * Sets the measureID value for this QueryAccumulationUsageResultAccmUsageList.
     * 
     * @param measureID
     */
    public void setMeasureID(java.math.BigInteger measureID) {
        this.measureID = measureID;
    }


    /**
     * Gets the beginDate value for this QueryAccumulationUsageResultAccmUsageList.
     * 
     * @return beginDate
     */
    public java.lang.String getBeginDate() {
        return beginDate;
    }


    /**
     * Sets the beginDate value for this QueryAccumulationUsageResultAccmUsageList.
     * 
     * @param beginDate
     */
    public void setBeginDate(java.lang.String beginDate) {
        this.beginDate = beginDate;
    }


    /**
     * Gets the endDate value for this QueryAccumulationUsageResultAccmUsageList.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this QueryAccumulationUsageResultAccmUsageList.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryAccumulationUsageResultAccmUsageList)) return false;
        QueryAccumulationUsageResultAccmUsageList other = (QueryAccumulationUsageResultAccmUsageList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accmType==null && other.getAccmType()==null) || 
             (this.accmType!=null &&
              this.accmType.equals(other.getAccmType()))) &&
            ((this.accmTypeName==null && other.getAccmTypeName()==null) || 
             (this.accmTypeName!=null &&
              this.accmTypeName.equals(other.getAccmTypeName()))) &&
            this.amount == other.getAmount() &&
            ((this.unitType==null && other.getUnitType()==null) || 
             (this.unitType!=null &&
              this.unitType.equals(other.getUnitType()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.measureID==null && other.getMeasureID()==null) || 
             (this.measureID!=null &&
              this.measureID.equals(other.getMeasureID()))) &&
            ((this.beginDate==null && other.getBeginDate()==null) || 
             (this.beginDate!=null &&
              this.beginDate.equals(other.getBeginDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate())));
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
        if (getAccmType() != null) {
            _hashCode += getAccmType().hashCode();
        }
        if (getAccmTypeName() != null) {
            _hashCode += getAccmTypeName().hashCode();
        }
        _hashCode += new Long(getAmount()).hashCode();
        if (getUnitType() != null) {
            _hashCode += getUnitType().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getMeasureID() != null) {
            _hashCode += getMeasureID().hashCode();
        }
        if (getBeginDate() != null) {
            _hashCode += getBeginDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryAccumulationUsageResultAccmUsageList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryAccumulationUsageResult>AccmUsageList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accmType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AccmType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accmTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AccmTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("measureID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "MeasureID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BeginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EndDate"));
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
