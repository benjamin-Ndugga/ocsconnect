/**
 * ChangeSubPaymentModeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubPaymentModeRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode;

    /* It is the transferation type between prepaid, postpaid and
     * hybrid. */
    private java.lang.String opType;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChange paymentModeChange;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestSupplementaryOffering supplementaryOffering;

    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] controlProperty;

    public ChangeSubPaymentModeRequest() {
    }

    public ChangeSubPaymentModeRequest(
           com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode,
           java.lang.String opType,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChange paymentModeChange,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestSupplementaryOffering supplementaryOffering,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] controlProperty) {
           this.subAccessCode = subAccessCode;
           this.opType = opType;
           this.paymentModeChange = paymentModeChange;
           this.supplementaryOffering = supplementaryOffering;
           this.controlProperty = controlProperty;
    }


    /**
     * Gets the subAccessCode value for this ChangeSubPaymentModeRequest.
     * 
     * @return subAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }


    /**
     * Sets the subAccessCode value for this ChangeSubPaymentModeRequest.
     * 
     * @param subAccessCode
     */
    public void setSubAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }


    /**
     * Gets the opType value for this ChangeSubPaymentModeRequest.
     * 
     * @return opType   * It is the transferation type between prepaid, postpaid and
     * hybrid.
     */
    public java.lang.String getOpType() {
        return opType;
    }


    /**
     * Sets the opType value for this ChangeSubPaymentModeRequest.
     * 
     * @param opType   * It is the transferation type between prepaid, postpaid and
     * hybrid.
     */
    public void setOpType(java.lang.String opType) {
        this.opType = opType;
    }


    /**
     * Gets the paymentModeChange value for this ChangeSubPaymentModeRequest.
     * 
     * @return paymentModeChange
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChange getPaymentModeChange() {
        return paymentModeChange;
    }


    /**
     * Sets the paymentModeChange value for this ChangeSubPaymentModeRequest.
     * 
     * @param paymentModeChange
     */
    public void setPaymentModeChange(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChange paymentModeChange) {
        this.paymentModeChange = paymentModeChange;
    }


    /**
     * Gets the supplementaryOffering value for this ChangeSubPaymentModeRequest.
     * 
     * @return supplementaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestSupplementaryOffering getSupplementaryOffering() {
        return supplementaryOffering;
    }


    /**
     * Sets the supplementaryOffering value for this ChangeSubPaymentModeRequest.
     * 
     * @param supplementaryOffering
     */
    public void setSupplementaryOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestSupplementaryOffering supplementaryOffering) {
        this.supplementaryOffering = supplementaryOffering;
    }


    /**
     * Gets the controlProperty value for this ChangeSubPaymentModeRequest.
     * 
     * @return controlProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getControlProperty() {
        return controlProperty;
    }


    /**
     * Sets the controlProperty value for this ChangeSubPaymentModeRequest.
     * 
     * @param controlProperty
     */
    public void setControlProperty(com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] controlProperty) {
        this.controlProperty = controlProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty getControlProperty(int i) {
        return this.controlProperty[i];
    }

    public void setControlProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty _value) {
        this.controlProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubPaymentModeRequest)) return false;
        ChangeSubPaymentModeRequest other = (ChangeSubPaymentModeRequest) obj;
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
            ((this.paymentModeChange==null && other.getPaymentModeChange()==null) || 
             (this.paymentModeChange!=null &&
              this.paymentModeChange.equals(other.getPaymentModeChange()))) &&
            ((this.supplementaryOffering==null && other.getSupplementaryOffering()==null) || 
             (this.supplementaryOffering!=null &&
              this.supplementaryOffering.equals(other.getSupplementaryOffering()))) &&
            ((this.controlProperty==null && other.getControlProperty()==null) || 
             (this.controlProperty!=null &&
              java.util.Arrays.equals(this.controlProperty, other.getControlProperty())));
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
        if (getPaymentModeChange() != null) {
            _hashCode += getPaymentModeChange().hashCode();
        }
        if (getSupplementaryOffering() != null) {
            _hashCode += getSupplementaryOffering().hashCode();
        }
        if (getControlProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getControlProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getControlProperty(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeSubPaymentModeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubPaymentModeRequest"));
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
        elemField.setFieldName("paymentModeChange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentModeChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPaymentModeRequest>PaymentModeChange"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplementaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SupplementaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPaymentModeRequest>SupplementaryOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ControlProperty"));
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
