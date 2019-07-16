/**
 * FeeDeductionRequestOperationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class FeeDeductionRequestOperationInfo  implements java.io.Serializable {
    private java.lang.String operationCode;

    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] operationProperty;

    public FeeDeductionRequestOperationInfo() {
    }

    public FeeDeductionRequestOperationInfo(
           java.lang.String operationCode,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] operationProperty) {
           this.operationCode = operationCode;
           this.operationProperty = operationProperty;
    }


    /**
     * Gets the operationCode value for this FeeDeductionRequestOperationInfo.
     * 
     * @return operationCode
     */
    public java.lang.String getOperationCode() {
        return operationCode;
    }


    /**
     * Sets the operationCode value for this FeeDeductionRequestOperationInfo.
     * 
     * @param operationCode
     */
    public void setOperationCode(java.lang.String operationCode) {
        this.operationCode = operationCode;
    }


    /**
     * Gets the operationProperty value for this FeeDeductionRequestOperationInfo.
     * 
     * @return operationProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getOperationProperty() {
        return operationProperty;
    }


    /**
     * Sets the operationProperty value for this FeeDeductionRequestOperationInfo.
     * 
     * @param operationProperty
     */
    public void setOperationProperty(com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] operationProperty) {
        this.operationProperty = operationProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty getOperationProperty(int i) {
        return this.operationProperty[i];
    }

    public void setOperationProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty _value) {
        this.operationProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeDeductionRequestOperationInfo)) return false;
        FeeDeductionRequestOperationInfo other = (FeeDeductionRequestOperationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationCode==null && other.getOperationCode()==null) || 
             (this.operationCode!=null &&
              this.operationCode.equals(other.getOperationCode()))) &&
            ((this.operationProperty==null && other.getOperationProperty()==null) || 
             (this.operationProperty!=null &&
              java.util.Arrays.equals(this.operationProperty, other.getOperationProperty())));
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
        if (getOperationCode() != null) {
            _hashCode += getOperationCode().hashCode();
        }
        if (getOperationProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationProperty(), i);
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
        new org.apache.axis.description.TypeDesc(FeeDeductionRequestOperationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRequest>OperationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OperationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OperationProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SimpleProperty"));
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
