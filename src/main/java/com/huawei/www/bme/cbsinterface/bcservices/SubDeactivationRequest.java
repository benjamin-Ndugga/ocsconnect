/**
 * SubDeactivationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class SubDeactivationRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode;

    /* It indicates the Pre-Deactivation or Deactivation */
    private java.lang.String opType;

    /* It is reserved for future extension */
    private com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationRequestAdditionalProperty[] additionalProperty;

    public SubDeactivationRequest() {
    }

    public SubDeactivationRequest(
           com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode,
           java.lang.String opType,
           com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationRequestAdditionalProperty[] additionalProperty) {
           this.subAccessCode = subAccessCode;
           this.opType = opType;
           this.additionalProperty = additionalProperty;
    }


    /**
     * Gets the subAccessCode value for this SubDeactivationRequest.
     * 
     * @return subAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }


    /**
     * Sets the subAccessCode value for this SubDeactivationRequest.
     * 
     * @param subAccessCode
     */
    public void setSubAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }


    /**
     * Gets the opType value for this SubDeactivationRequest.
     * 
     * @return opType   * It indicates the Pre-Deactivation or Deactivation
     */
    public java.lang.String getOpType() {
        return opType;
    }


    /**
     * Sets the opType value for this SubDeactivationRequest.
     * 
     * @param opType   * It indicates the Pre-Deactivation or Deactivation
     */
    public void setOpType(java.lang.String opType) {
        this.opType = opType;
    }


    /**
     * Gets the additionalProperty value for this SubDeactivationRequest.
     * 
     * @return additionalProperty   * It is reserved for future extension
     */
    public com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationRequestAdditionalProperty[] getAdditionalProperty() {
        return additionalProperty;
    }


    /**
     * Sets the additionalProperty value for this SubDeactivationRequest.
     * 
     * @param additionalProperty   * It is reserved for future extension
     */
    public void setAdditionalProperty(com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationRequestAdditionalProperty[] additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationRequestAdditionalProperty getAdditionalProperty(int i) {
        return this.additionalProperty[i];
    }

    public void setAdditionalProperty(int i, com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationRequestAdditionalProperty _value) {
        this.additionalProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubDeactivationRequest)) return false;
        SubDeactivationRequest other = (SubDeactivationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subAccessCode==null && other.getSubAccessCode()==null) || 
             (this.subAccessCode!=null &&
              this.subAccessCode.equals(other.getSubAccessCode()))) &&
            ((this.opType==null && other.getOpType()==null) || 
             (this.opType!=null &&
              this.opType.equals(other.getOpType()))) &&
            ((this.additionalProperty==null && other.getAdditionalProperty()==null) || 
             (this.additionalProperty!=null &&
              java.util.Arrays.equals(this.additionalProperty, other.getAdditionalProperty())));
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
        if (getSubAccessCode() != null) {
            _hashCode += getSubAccessCode().hashCode();
        }
        if (getOpType() != null) {
            _hashCode += getOpType().hashCode();
        }
        if (getAdditionalProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalProperty(), i);
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
        new org.apache.axis.description.TypeDesc(SubDeactivationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubDeactivationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OpType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AdditionalProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SubDeactivationRequest>AdditionalProperty"));
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
