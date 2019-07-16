/**
 * ChangeConsumptionLimitRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeConsumptionLimitRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestLimitObj limitObj;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestAddLimit[] addLimit;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestDelLimit[] delLimit;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimit[] modifyLimit;

    public ChangeConsumptionLimitRequest() {
    }

    public ChangeConsumptionLimitRequest(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestLimitObj limitObj,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestAddLimit[] addLimit,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestDelLimit[] delLimit,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimit[] modifyLimit) {
           this.limitObj = limitObj;
           this.addLimit = addLimit;
           this.delLimit = delLimit;
           this.modifyLimit = modifyLimit;
    }


    /**
     * Gets the limitObj value for this ChangeConsumptionLimitRequest.
     * 
     * @return limitObj
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestLimitObj getLimitObj() {
        return limitObj;
    }


    /**
     * Sets the limitObj value for this ChangeConsumptionLimitRequest.
     * 
     * @param limitObj
     */
    public void setLimitObj(com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestLimitObj limitObj) {
        this.limitObj = limitObj;
    }


    /**
     * Gets the addLimit value for this ChangeConsumptionLimitRequest.
     * 
     * @return addLimit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestAddLimit[] getAddLimit() {
        return addLimit;
    }


    /**
     * Sets the addLimit value for this ChangeConsumptionLimitRequest.
     * 
     * @param addLimit
     */
    public void setAddLimit(com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestAddLimit[] addLimit) {
        this.addLimit = addLimit;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestAddLimit getAddLimit(int i) {
        return this.addLimit[i];
    }

    public void setAddLimit(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestAddLimit _value) {
        this.addLimit[i] = _value;
    }


    /**
     * Gets the delLimit value for this ChangeConsumptionLimitRequest.
     * 
     * @return delLimit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestDelLimit[] getDelLimit() {
        return delLimit;
    }


    /**
     * Sets the delLimit value for this ChangeConsumptionLimitRequest.
     * 
     * @param delLimit
     */
    public void setDelLimit(com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestDelLimit[] delLimit) {
        this.delLimit = delLimit;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestDelLimit getDelLimit(int i) {
        return this.delLimit[i];
    }

    public void setDelLimit(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestDelLimit _value) {
        this.delLimit[i] = _value;
    }


    /**
     * Gets the modifyLimit value for this ChangeConsumptionLimitRequest.
     * 
     * @return modifyLimit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimit[] getModifyLimit() {
        return modifyLimit;
    }


    /**
     * Sets the modifyLimit value for this ChangeConsumptionLimitRequest.
     * 
     * @param modifyLimit
     */
    public void setModifyLimit(com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimit[] modifyLimit) {
        this.modifyLimit = modifyLimit;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimit getModifyLimit(int i) {
        return this.modifyLimit[i];
    }

    public void setModifyLimit(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestModifyLimit _value) {
        this.modifyLimit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeConsumptionLimitRequest)) return false;
        ChangeConsumptionLimitRequest other = (ChangeConsumptionLimitRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.limitObj==null && other.getLimitObj()==null) || 
             (this.limitObj!=null &&
              this.limitObj.equals(other.getLimitObj()))) &&
            ((this.addLimit==null && other.getAddLimit()==null) || 
             (this.addLimit!=null &&
              java.util.Arrays.equals(this.addLimit, other.getAddLimit()))) &&
            ((this.delLimit==null && other.getDelLimit()==null) || 
             (this.delLimit!=null &&
              java.util.Arrays.equals(this.delLimit, other.getDelLimit()))) &&
            ((this.modifyLimit==null && other.getModifyLimit()==null) || 
             (this.modifyLimit!=null &&
              java.util.Arrays.equals(this.modifyLimit, other.getModifyLimit())));
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
        if (getLimitObj() != null) {
            _hashCode += getLimitObj().hashCode();
        }
        if (getAddLimit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddLimit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddLimit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDelLimit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelLimit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelLimit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModifyLimit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModifyLimit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModifyLimit(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeConsumptionLimitRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeConsumptionLimitRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeConsumptionLimitRequest>LimitObj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeConsumptionLimitRequest>AddLimit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeConsumptionLimitRequest>DelLimit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifyLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeConsumptionLimitRequest>ModifyLimit"));
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
