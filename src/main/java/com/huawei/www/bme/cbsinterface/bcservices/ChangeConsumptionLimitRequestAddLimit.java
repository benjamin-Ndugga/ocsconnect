/**
 * ChangeConsumptionLimitRequestAddLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeConsumptionLimitRequestAddLimit  implements java.io.Serializable {
    private java.lang.String limitType;

    private java.lang.String unitType;

    private java.math.BigInteger mesureType;

    private java.math.BigInteger mesureID;

    private long limitValue;

    private java.math.BigInteger currencyID;

    private long limitValue2;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestAddLimitLimitParam[] limitParam;

    private java.lang.String effectiveTime;

    private java.lang.String expirationTime;

    public ChangeConsumptionLimitRequestAddLimit() {
    }

    public ChangeConsumptionLimitRequestAddLimit(
           java.lang.String limitType,
           java.lang.String unitType,
           java.math.BigInteger mesureType,
           java.math.BigInteger mesureID,
           long limitValue,
           java.math.BigInteger currencyID,
           long limitValue2,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestAddLimitLimitParam[] limitParam,
           java.lang.String effectiveTime,
           java.lang.String expirationTime) {
           this.limitType = limitType;
           this.unitType = unitType;
           this.mesureType = mesureType;
           this.mesureID = mesureID;
           this.limitValue = limitValue;
           this.currencyID = currencyID;
           this.limitValue2 = limitValue2;
           this.limitParam = limitParam;
           this.effectiveTime = effectiveTime;
           this.expirationTime = expirationTime;
    }


    /**
     * Gets the limitType value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @return limitType
     */
    public java.lang.String getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @param limitType
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }


    /**
     * Gets the unitType value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @return unitType
     */
    public java.lang.String getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @param unitType
     */
    public void setUnitType(java.lang.String unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the mesureType value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @return mesureType
     */
    public java.math.BigInteger getMesureType() {
        return mesureType;
    }


    /**
     * Sets the mesureType value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @param mesureType
     */
    public void setMesureType(java.math.BigInteger mesureType) {
        this.mesureType = mesureType;
    }


    /**
     * Gets the mesureID value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @return mesureID
     */
    public java.math.BigInteger getMesureID() {
        return mesureID;
    }


    /**
     * Sets the mesureID value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @param mesureID
     */
    public void setMesureID(java.math.BigInteger mesureID) {
        this.mesureID = mesureID;
    }


    /**
     * Gets the limitValue value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @return limitValue
     */
    public long getLimitValue() {
        return limitValue;
    }


    /**
     * Sets the limitValue value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @param limitValue
     */
    public void setLimitValue(long limitValue) {
        this.limitValue = limitValue;
    }


    /**
     * Gets the currencyID value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the limitValue2 value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @return limitValue2
     */
    public long getLimitValue2() {
        return limitValue2;
    }


    /**
     * Sets the limitValue2 value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @param limitValue2
     */
    public void setLimitValue2(long limitValue2) {
        this.limitValue2 = limitValue2;
    }


    /**
     * Gets the limitParam value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @return limitParam
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestAddLimitLimitParam[] getLimitParam() {
        return limitParam;
    }


    /**
     * Sets the limitParam value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @param limitParam
     */
    public void setLimitParam(com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestAddLimitLimitParam[] limitParam) {
        this.limitParam = limitParam;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestAddLimitLimitParam getLimitParam(int i) {
        return this.limitParam[i];
    }

    public void setLimitParam(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestAddLimitLimitParam _value) {
        this.limitParam[i] = _value;
    }


    /**
     * Gets the effectiveTime value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @return effectiveTime
     */
    public java.lang.String getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(java.lang.String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the expirationTime value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @return expirationTime
     */
    public java.lang.String getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this ChangeConsumptionLimitRequestAddLimit.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(java.lang.String expirationTime) {
        this.expirationTime = expirationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeConsumptionLimitRequestAddLimit)) return false;
        ChangeConsumptionLimitRequestAddLimit other = (ChangeConsumptionLimitRequestAddLimit) obj;
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
            ((this.unitType==null && other.getUnitType()==null) || 
             (this.unitType!=null &&
              this.unitType.equals(other.getUnitType()))) &&
            ((this.mesureType==null && other.getMesureType()==null) || 
             (this.mesureType!=null &&
              this.mesureType.equals(other.getMesureType()))) &&
            ((this.mesureID==null && other.getMesureID()==null) || 
             (this.mesureID!=null &&
              this.mesureID.equals(other.getMesureID()))) &&
            this.limitValue == other.getLimitValue() &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            this.limitValue2 == other.getLimitValue2() &&
            ((this.limitParam==null && other.getLimitParam()==null) || 
             (this.limitParam!=null &&
              java.util.Arrays.equals(this.limitParam, other.getLimitParam()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime()))) &&
            ((this.expirationTime==null && other.getExpirationTime()==null) || 
             (this.expirationTime!=null &&
              this.expirationTime.equals(other.getExpirationTime())));
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
        if (getUnitType() != null) {
            _hashCode += getUnitType().hashCode();
        }
        if (getMesureType() != null) {
            _hashCode += getMesureType().hashCode();
        }
        if (getMesureID() != null) {
            _hashCode += getMesureID().hashCode();
        }
        _hashCode += new Long(getLimitValue()).hashCode();
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        _hashCode += new Long(getLimitValue2()).hashCode();
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
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        if (getExpirationTime() != null) {
            _hashCode += getExpirationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeConsumptionLimitRequestAddLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeConsumptionLimitRequest>AddLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesureType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "MesureType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesureID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "MesureID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitParam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeConsumptionLimitRequest>AddLimit>LimitParam"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpirationTime"));
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
