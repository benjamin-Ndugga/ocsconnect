/**
 * ChangeConsumptionLimitRequestModifyLimitLimitParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeConsumptionLimitRequestModifyLimitLimitParam  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam[] addLimitParam;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamDelLimitParam[] delLimitParam;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam[] modifyLimitParam;

    public ChangeConsumptionLimitRequestModifyLimitLimitParam() {
    }

    public ChangeConsumptionLimitRequestModifyLimitLimitParam(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam[] addLimitParam,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamDelLimitParam[] delLimitParam,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam[] modifyLimitParam) {
           this.addLimitParam = addLimitParam;
           this.delLimitParam = delLimitParam;
           this.modifyLimitParam = modifyLimitParam;
    }


    /**
     * Gets the addLimitParam value for this ChangeConsumptionLimitRequestModifyLimitLimitParam.
     * 
     * @return addLimitParam
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam[] getAddLimitParam() {
        return addLimitParam;
    }


    /**
     * Sets the addLimitParam value for this ChangeConsumptionLimitRequestModifyLimitLimitParam.
     * 
     * @param addLimitParam
     */
    public void setAddLimitParam(com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam[] addLimitParam) {
        this.addLimitParam = addLimitParam;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam getAddLimitParam(int i) {
        return this.addLimitParam[i];
    }

    public void setAddLimitParam(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamAddLimitParam _value) {
        this.addLimitParam[i] = _value;
    }


    /**
     * Gets the delLimitParam value for this ChangeConsumptionLimitRequestModifyLimitLimitParam.
     * 
     * @return delLimitParam
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamDelLimitParam[] getDelLimitParam() {
        return delLimitParam;
    }


    /**
     * Sets the delLimitParam value for this ChangeConsumptionLimitRequestModifyLimitLimitParam.
     * 
     * @param delLimitParam
     */
    public void setDelLimitParam(com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamDelLimitParam[] delLimitParam) {
        this.delLimitParam = delLimitParam;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamDelLimitParam getDelLimitParam(int i) {
        return this.delLimitParam[i];
    }

    public void setDelLimitParam(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamDelLimitParam _value) {
        this.delLimitParam[i] = _value;
    }


    /**
     * Gets the modifyLimitParam value for this ChangeConsumptionLimitRequestModifyLimitLimitParam.
     * 
     * @return modifyLimitParam
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam[] getModifyLimitParam() {
        return modifyLimitParam;
    }


    /**
     * Sets the modifyLimitParam value for this ChangeConsumptionLimitRequestModifyLimitLimitParam.
     * 
     * @param modifyLimitParam
     */
    public void setModifyLimitParam(com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam[] modifyLimitParam) {
        this.modifyLimitParam = modifyLimitParam;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam getModifyLimitParam(int i) {
        return this.modifyLimitParam[i];
    }

    public void setModifyLimitParam(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimitLimitParamModifyLimitParam _value) {
        this.modifyLimitParam[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeConsumptionLimitRequestModifyLimitLimitParam)) return false;
        ChangeConsumptionLimitRequestModifyLimitLimitParam other = (ChangeConsumptionLimitRequestModifyLimitLimitParam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addLimitParam==null && other.getAddLimitParam()==null) || 
             (this.addLimitParam!=null &&
              java.util.Arrays.equals(this.addLimitParam, other.getAddLimitParam()))) &&
            ((this.delLimitParam==null && other.getDelLimitParam()==null) || 
             (this.delLimitParam!=null &&
              java.util.Arrays.equals(this.delLimitParam, other.getDelLimitParam()))) &&
            ((this.modifyLimitParam==null && other.getModifyLimitParam()==null) || 
             (this.modifyLimitParam!=null &&
              java.util.Arrays.equals(this.modifyLimitParam, other.getModifyLimitParam())));
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
        if (getAddLimitParam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddLimitParam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddLimitParam(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDelLimitParam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelLimitParam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelLimitParam(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModifyLimitParam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModifyLimitParam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModifyLimitParam(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeConsumptionLimitRequestModifyLimitLimitParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeConsumptionLimitRequest>ModifyLimit>LimitParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addLimitParam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddLimitParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeConsumptionLimitRequest>ModifyLimit>LimitParam>AddLimitParam"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delLimitParam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelLimitParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeConsumptionLimitRequest>ModifyLimit>LimitParam>DelLimitParam"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyLimitParam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifyLimitParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeConsumptionLimitRequest>ModifyLimit>LimitParam>ModifyLimitParam"));
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
