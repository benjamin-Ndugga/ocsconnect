/**
 * ChangeConsumptionLimitRequestModifyLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeConsumptionLimitRequestModifyLimit  implements java.io.Serializable {
    private java.lang.String limitType;

    private java.lang.Long oldAmount;

    private java.lang.Long newAmount;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParam limitParam;

    public ChangeConsumptionLimitRequestModifyLimit() {
    }

    public ChangeConsumptionLimitRequestModifyLimit(
           java.lang.String limitType,
           java.lang.Long oldAmount,
           java.lang.Long newAmount,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParam limitParam) {
           this.limitType = limitType;
           this.oldAmount = oldAmount;
           this.newAmount = newAmount;
           this.limitParam = limitParam;
    }


    /**
     * Gets the limitType value for this ChangeConsumptionLimitRequestModifyLimit.
     * 
     * @return limitType
     */
    public java.lang.String getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this ChangeConsumptionLimitRequestModifyLimit.
     * 
     * @param limitType
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }


    /**
     * Gets the oldAmount value for this ChangeConsumptionLimitRequestModifyLimit.
     * 
     * @return oldAmount
     */
    public java.lang.Long getOldAmount() {
        return oldAmount;
    }


    /**
     * Sets the oldAmount value for this ChangeConsumptionLimitRequestModifyLimit.
     * 
     * @param oldAmount
     */
    public void setOldAmount(java.lang.Long oldAmount) {
        this.oldAmount = oldAmount;
    }


    /**
     * Gets the newAmount value for this ChangeConsumptionLimitRequestModifyLimit.
     * 
     * @return newAmount
     */
    public java.lang.Long getNewAmount() {
        return newAmount;
    }


    /**
     * Sets the newAmount value for this ChangeConsumptionLimitRequestModifyLimit.
     * 
     * @param newAmount
     */
    public void setNewAmount(java.lang.Long newAmount) {
        this.newAmount = newAmount;
    }


    /**
     * Gets the limitParam value for this ChangeConsumptionLimitRequestModifyLimit.
     * 
     * @return limitParam
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParam getLimitParam() {
        return limitParam;
    }


    /**
     * Sets the limitParam value for this ChangeConsumptionLimitRequestModifyLimit.
     * 
     * @param limitParam
     */
    public void setLimitParam(com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParam limitParam) {
        this.limitParam = limitParam;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeConsumptionLimitRequestModifyLimit)) return false;
        ChangeConsumptionLimitRequestModifyLimit other = (ChangeConsumptionLimitRequestModifyLimit) obj;
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
            ((this.oldAmount==null && other.getOldAmount()==null) || 
             (this.oldAmount!=null &&
              this.oldAmount.equals(other.getOldAmount()))) &&
            ((this.newAmount==null && other.getNewAmount()==null) || 
             (this.newAmount!=null &&
              this.newAmount.equals(other.getNewAmount()))) &&
            ((this.limitParam==null && other.getLimitParam()==null) || 
             (this.limitParam!=null &&
              this.limitParam.equals(other.getLimitParam())));
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
        if (getOldAmount() != null) {
            _hashCode += getOldAmount().hashCode();
        }
        if (getNewAmount() != null) {
            _hashCode += getNewAmount().hashCode();
        }
        if (getLimitParam() != null) {
            _hashCode += getLimitParam().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeConsumptionLimitRequestModifyLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeConsumptionLimitRequest>ModifyLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitParam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeConsumptionLimitRequest>ModifyLimit>LimitParam"));
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
