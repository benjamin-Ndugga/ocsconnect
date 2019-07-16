/**
 * ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam  implements java.io.Serializable {
    private java.lang.String paramCode;

    private long paramValue;

    public ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam() {
    }

    public ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam(
           java.lang.String paramCode,
           long paramValue) {
           this.paramCode = paramCode;
           this.paramValue = paramValue;
    }


    /**
     * Gets the paramCode value for this ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam.
     * 
     * @return paramCode
     */
    public java.lang.String getParamCode() {
        return paramCode;
    }


    /**
     * Sets the paramCode value for this ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam.
     * 
     * @param paramCode
     */
    public void setParamCode(java.lang.String paramCode) {
        this.paramCode = paramCode;
    }


    /**
     * Gets the paramValue value for this ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam.
     * 
     * @return paramValue
     */
    public long getParamValue() {
        return paramValue;
    }


    /**
     * Sets the paramValue value for this ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam.
     * 
     * @param paramValue
     */
    public void setParamValue(long paramValue) {
        this.paramValue = paramValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam)) return false;
        ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam other = (ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam) obj;
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
            this.paramValue == other.getParamValue();
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
        _hashCode += new Long(getParamValue()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeConsumptionLimitRequest>ModifyLimit>LimitParam>AddLimitParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ParamCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ParamValue"));
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
