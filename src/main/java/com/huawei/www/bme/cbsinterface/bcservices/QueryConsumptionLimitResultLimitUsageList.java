/**
 * QueryConsumptionLimitResultLimitUsageList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryConsumptionLimitResultLimitUsageList  implements java.io.Serializable {
    private java.lang.String limitType;

    private java.lang.String limitTypeName;

    private long amount;

    private long usageAmount;

    private java.lang.String limitCtrlType;

    private java.math.BigInteger currencyID;

    private java.math.BigInteger measureType;

    private java.math.BigInteger measureID;

    private java.lang.String beginDate;

    private java.lang.String endDay;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitResultLimitUsageListLimitParam[] limitParam;

    public QueryConsumptionLimitResultLimitUsageList() {
    }

    public QueryConsumptionLimitResultLimitUsageList(
           java.lang.String limitType,
           java.lang.String limitTypeName,
           long amount,
           long usageAmount,
           java.lang.String limitCtrlType,
           java.math.BigInteger currencyID,
           java.math.BigInteger measureType,
           java.math.BigInteger measureID,
           java.lang.String beginDate,
           java.lang.String endDay,
           com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitResultLimitUsageListLimitParam[] limitParam) {
           this.limitType = limitType;
           this.limitTypeName = limitTypeName;
           this.amount = amount;
           this.usageAmount = usageAmount;
           this.limitCtrlType = limitCtrlType;
           this.currencyID = currencyID;
           this.measureType = measureType;
           this.measureID = measureID;
           this.beginDate = beginDate;
           this.endDay = endDay;
           this.limitParam = limitParam;
    }


    /**
     * Gets the limitType value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @return limitType
     */
    public java.lang.String getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @param limitType
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }


    /**
     * Gets the limitTypeName value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @return limitTypeName
     */
    public java.lang.String getLimitTypeName() {
        return limitTypeName;
    }


    /**
     * Sets the limitTypeName value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @param limitTypeName
     */
    public void setLimitTypeName(java.lang.String limitTypeName) {
        this.limitTypeName = limitTypeName;
    }


    /**
     * Gets the amount value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @return amount
     */
    public long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @param amount
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }


    /**
     * Gets the usageAmount value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @return usageAmount
     */
    public long getUsageAmount() {
        return usageAmount;
    }


    /**
     * Sets the usageAmount value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @param usageAmount
     */
    public void setUsageAmount(long usageAmount) {
        this.usageAmount = usageAmount;
    }


    /**
     * Gets the limitCtrlType value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @return limitCtrlType
     */
    public java.lang.String getLimitCtrlType() {
        return limitCtrlType;
    }


    /**
     * Sets the limitCtrlType value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @param limitCtrlType
     */
    public void setLimitCtrlType(java.lang.String limitCtrlType) {
        this.limitCtrlType = limitCtrlType;
    }


    /**
     * Gets the currencyID value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the measureType value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @return measureType
     */
    public java.math.BigInteger getMeasureType() {
        return measureType;
    }


    /**
     * Sets the measureType value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @param measureType
     */
    public void setMeasureType(java.math.BigInteger measureType) {
        this.measureType = measureType;
    }


    /**
     * Gets the measureID value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @return measureID
     */
    public java.math.BigInteger getMeasureID() {
        return measureID;
    }


    /**
     * Sets the measureID value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @param measureID
     */
    public void setMeasureID(java.math.BigInteger measureID) {
        this.measureID = measureID;
    }


    /**
     * Gets the beginDate value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @return beginDate
     */
    public java.lang.String getBeginDate() {
        return beginDate;
    }


    /**
     * Sets the beginDate value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @param beginDate
     */
    public void setBeginDate(java.lang.String beginDate) {
        this.beginDate = beginDate;
    }


    /**
     * Gets the endDay value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @return endDay
     */
    public java.lang.String getEndDay() {
        return endDay;
    }


    /**
     * Sets the endDay value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @param endDay
     */
    public void setEndDay(java.lang.String endDay) {
        this.endDay = endDay;
    }


    /**
     * Gets the limitParam value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @return limitParam
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitResultLimitUsageListLimitParam[] getLimitParam() {
        return limitParam;
    }


    /**
     * Sets the limitParam value for this QueryConsumptionLimitResultLimitUsageList.
     * 
     * @param limitParam
     */
    public void setLimitParam(com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitResultLimitUsageListLimitParam[] limitParam) {
        this.limitParam = limitParam;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitResultLimitUsageListLimitParam getLimitParam(int i) {
        return this.limitParam[i];
    }

    public void setLimitParam(int i, com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitResultLimitUsageListLimitParam _value) {
        this.limitParam[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryConsumptionLimitResultLimitUsageList)) return false;
        QueryConsumptionLimitResultLimitUsageList other = (QueryConsumptionLimitResultLimitUsageList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.limitType==null && other.getLimitType()==null) || 
             (this.limitType!=null &&
              this.limitType.equals(other.getLimitType()))) &&
            ((this.limitTypeName==null && other.getLimitTypeName()==null) || 
             (this.limitTypeName!=null &&
              this.limitTypeName.equals(other.getLimitTypeName()))) &&
            this.amount == other.getAmount() &&
            this.usageAmount == other.getUsageAmount() &&
            ((this.limitCtrlType==null && other.getLimitCtrlType()==null) || 
             (this.limitCtrlType!=null &&
              this.limitCtrlType.equals(other.getLimitCtrlType()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.measureType==null && other.getMeasureType()==null) || 
             (this.measureType!=null &&
              this.measureType.equals(other.getMeasureType()))) &&
            ((this.measureID==null && other.getMeasureID()==null) || 
             (this.measureID!=null &&
              this.measureID.equals(other.getMeasureID()))) &&
            ((this.beginDate==null && other.getBeginDate()==null) || 
             (this.beginDate!=null &&
              this.beginDate.equals(other.getBeginDate()))) &&
            ((this.endDay==null && other.getEndDay()==null) || 
             (this.endDay!=null &&
              this.endDay.equals(other.getEndDay()))) &&
            ((this.limitParam==null && other.getLimitParam()==null) || 
             (this.limitParam!=null &&
              java.util.Arrays.equals(this.limitParam, other.getLimitParam())));
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
        if (getLimitType() != null) {
            _hashCode += getLimitType().hashCode();
        }
        if (getLimitTypeName() != null) {
            _hashCode += getLimitTypeName().hashCode();
        }
        _hashCode += new Long(getAmount()).hashCode();
        _hashCode += new Long(getUsageAmount()).hashCode();
        if (getLimitCtrlType() != null) {
            _hashCode += getLimitCtrlType().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getMeasureType() != null) {
            _hashCode += getMeasureType().hashCode();
        }
        if (getMeasureID() != null) {
            _hashCode += getMeasureID().hashCode();
        }
        if (getBeginDate() != null) {
            _hashCode += getBeginDate().hashCode();
        }
        if (getEndDay() != null) {
            _hashCode += getEndDay().hashCode();
        }
        if (getLimitParam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLimitParam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLimitParam(), i);
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
        new org.apache.axis.description.TypeDesc(QueryConsumptionLimitResultLimitUsageList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryConsumptionLimitResult>LimitUsageList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitTypeName"));
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
        elemField.setFieldName("usageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UsageAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitCtrlType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitCtrlType"));
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
        elemField.setFieldName("measureType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "MeasureType"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EndDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitParam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryConsumptionLimitResult>LimitUsageList>LimitParam"));
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
