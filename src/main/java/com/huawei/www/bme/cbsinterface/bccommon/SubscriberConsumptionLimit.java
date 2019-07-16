/**
 * SubscriberConsumptionLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class SubscriberConsumptionLimit  implements java.io.Serializable {
    private java.lang.String limitType;

    private java.lang.String unitType;

    private java.math.BigInteger mesureType;

    private java.math.BigInteger mesureID;

    private long limitValue;

    private java.math.BigInteger currencyID;

    private long limitValue2;

    private com.huawei.www.bme.cbsinterface.bccommon.SubscriberConsumptionLimitLimitParam[] limitParam;

    public SubscriberConsumptionLimit() {
    }

    public SubscriberConsumptionLimit(
           java.lang.String limitType,
           java.lang.String unitType,
           java.math.BigInteger mesureType,
           java.math.BigInteger mesureID,
           long limitValue,
           java.math.BigInteger currencyID,
           long limitValue2,
           com.huawei.www.bme.cbsinterface.bccommon.SubscriberConsumptionLimitLimitParam[] limitParam) {
           this.limitType = limitType;
           this.unitType = unitType;
           this.mesureType = mesureType;
           this.mesureID = mesureID;
           this.limitValue = limitValue;
           this.currencyID = currencyID;
           this.limitValue2 = limitValue2;
           this.limitParam = limitParam;
    }


    /**
     * Gets the limitType value for this SubscriberConsumptionLimit.
     * 
     * @return limitType
     */
    public java.lang.String getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this SubscriberConsumptionLimit.
     * 
     * @param limitType
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }


    /**
     * Gets the unitType value for this SubscriberConsumptionLimit.
     * 
     * @return unitType
     */
    public java.lang.String getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this SubscriberConsumptionLimit.
     * 
     * @param unitType
     */
    public void setUnitType(java.lang.String unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the mesureType value for this SubscriberConsumptionLimit.
     * 
     * @return mesureType
     */
    public java.math.BigInteger getMesureType() {
        return mesureType;
    }


    /**
     * Sets the mesureType value for this SubscriberConsumptionLimit.
     * 
     * @param mesureType
     */
    public void setMesureType(java.math.BigInteger mesureType) {
        this.mesureType = mesureType;
    }


    /**
     * Gets the mesureID value for this SubscriberConsumptionLimit.
     * 
     * @return mesureID
     */
    public java.math.BigInteger getMesureID() {
        return mesureID;
    }


    /**
     * Sets the mesureID value for this SubscriberConsumptionLimit.
     * 
     * @param mesureID
     */
    public void setMesureID(java.math.BigInteger mesureID) {
        this.mesureID = mesureID;
    }


    /**
     * Gets the limitValue value for this SubscriberConsumptionLimit.
     * 
     * @return limitValue
     */
    public long getLimitValue() {
        return limitValue;
    }


    /**
     * Sets the limitValue value for this SubscriberConsumptionLimit.
     * 
     * @param limitValue
     */
    public void setLimitValue(long limitValue) {
        this.limitValue = limitValue;
    }


    /**
     * Gets the currencyID value for this SubscriberConsumptionLimit.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this SubscriberConsumptionLimit.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the limitValue2 value for this SubscriberConsumptionLimit.
     * 
     * @return limitValue2
     */
    public long getLimitValue2() {
        return limitValue2;
    }


    /**
     * Sets the limitValue2 value for this SubscriberConsumptionLimit.
     * 
     * @param limitValue2
     */
    public void setLimitValue2(long limitValue2) {
        this.limitValue2 = limitValue2;
    }


    /**
     * Gets the limitParam value for this SubscriberConsumptionLimit.
     * 
     * @return limitParam
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubscriberConsumptionLimitLimitParam[] getLimitParam() {
        return limitParam;
    }


    /**
     * Sets the limitParam value for this SubscriberConsumptionLimit.
     * 
     * @param limitParam
     */
    public void setLimitParam(com.huawei.www.bme.cbsinterface.bccommon.SubscriberConsumptionLimitLimitParam[] limitParam) {
        this.limitParam = limitParam;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SubscriberConsumptionLimitLimitParam getLimitParam(int i) {
        return this.limitParam[i];
    }

    public void setLimitParam(int i, com.huawei.www.bme.cbsinterface.bccommon.SubscriberConsumptionLimitLimitParam _value) {
        this.limitParam[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberConsumptionLimit)) return false;
        SubscriberConsumptionLimit other = (SubscriberConsumptionLimit) obj;
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberConsumptionLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">Subscriber>ConsumptionLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "LimitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "UnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesureType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "MesureType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesureID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "MesureID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "LimitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "LimitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitParam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "LimitParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">>Subscriber>ConsumptionLimit>LimitParam"));
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
