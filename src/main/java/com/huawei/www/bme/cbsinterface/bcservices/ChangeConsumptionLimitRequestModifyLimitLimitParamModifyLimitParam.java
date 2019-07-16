/**
 * ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam  implements java.io.Serializable {
    private java.lang.String paramCode;

    private long oldParamValue;

    private long newParamValue;

    public ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam() {
    }

    public ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam(
           java.lang.String paramCode,
           long oldParamValue,
           long newParamValue) {
           this.paramCode = paramCode;
           this.oldParamValue = oldParamValue;
           this.newParamValue = newParamValue;
    }


    /**
     * Gets the paramCode value for this ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam.
     * 
     * @return paramCode
     */
    public java.lang.String getParamCode() {
        return paramCode;
    }


    /**
     * Sets the paramCode value for this ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam.
     * 
     * @param paramCode
     */
    public void setParamCode(java.lang.String paramCode) {
        this.paramCode = paramCode;
    }


    /**
     * Gets the oldParamValue value for this ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam.
     * 
     * @return oldParamValue
     */
    public long getOldParamValue() {
        return oldParamValue;
    }


    /**
     * Sets the oldParamValue value for this ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam.
     * 
     * @param oldParamValue
     */
    public void setOldParamValue(long oldParamValue) {
        this.oldParamValue = oldParamValue;
    }


    /**
     * Gets the newParamValue value for this ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam.
     * 
     * @return newParamValue
     */
    public long getNewParamValue() {
        return newParamValue;
    }


    /**
     * Sets the newParamValue value for this ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam.
     * 
     * @param newParamValue
     */
    public void setNewParamValue(long newParamValue) {
        this.newParamValue = newParamValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam)) return false;
        ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam other = (ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paramCode==null && other.getParamCode()==null) || 
             (this.paramCode!=null &&
              this.paramCode.equals(other.getParamCode()))) &&
            this.oldParamValue == other.getOldParamValue() &&
            this.newParamValue == other.getNewParamValue();
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
        if (getParamCode() != null) {
            _hashCode += getParamCode().hashCode();
        }
        _hashCode += new Long(getOldParamValue()).hashCode();
        _hashCode += new Long(getNewParamValue()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeConsumptionLimitRequest>ModifyLimit>LimitParam>ModifyLimitParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ParamCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldParamValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldParamValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newParamValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewParamValue"));
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
