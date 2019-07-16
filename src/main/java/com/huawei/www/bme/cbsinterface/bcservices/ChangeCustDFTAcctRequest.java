/**
 * ChangeCustDFTAcctRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeCustDFTAcctRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode custAccessCode;

    /* 1: Set Default Account
     * 2: Change Default Account */
    private java.lang.String opType;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctRequestNewDFTAcct newDFTAcct;

    private com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime;

    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] controlProperty;

    public ChangeCustDFTAcctRequest() {
    }

    public ChangeCustDFTAcctRequest(
           com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode custAccessCode,
           java.lang.String opType,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctRequestNewDFTAcct newDFTAcct,
           com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] controlProperty) {
           this.custAccessCode = custAccessCode;
           this.opType = opType;
           this.newDFTAcct = newDFTAcct;
           this.effectiveTime = effectiveTime;
           this.controlProperty = controlProperty;
    }


    /**
     * Gets the custAccessCode value for this ChangeCustDFTAcctRequest.
     * 
     * @return custAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode getCustAccessCode() {
        return custAccessCode;
    }


    /**
     * Sets the custAccessCode value for this ChangeCustDFTAcctRequest.
     * 
     * @param custAccessCode
     */
    public void setCustAccessCode(com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode custAccessCode) {
        this.custAccessCode = custAccessCode;
    }


    /**
     * Gets the opType value for this ChangeCustDFTAcctRequest.
     * 
     * @return opType   * 1: Set Default Account
     * 2: Change Default Account
     */
    public java.lang.String getOpType() {
        return opType;
    }


    /**
     * Sets the opType value for this ChangeCustDFTAcctRequest.
     * 
     * @param opType   * 1: Set Default Account
     * 2: Change Default Account
     */
    public void setOpType(java.lang.String opType) {
        this.opType = opType;
    }


    /**
     * Gets the newDFTAcct value for this ChangeCustDFTAcctRequest.
     * 
     * @return newDFTAcct
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctRequestNewDFTAcct getNewDFTAcct() {
        return newDFTAcct;
    }


    /**
     * Sets the newDFTAcct value for this ChangeCustDFTAcctRequest.
     * 
     * @param newDFTAcct
     */
    public void setNewDFTAcct(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctRequestNewDFTAcct newDFTAcct) {
        this.newDFTAcct = newDFTAcct;
    }


    /**
     * Gets the effectiveTime value for this ChangeCustDFTAcctRequest.
     * 
     * @return effectiveTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.EffectMode getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this ChangeCustDFTAcctRequest.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the controlProperty value for this ChangeCustDFTAcctRequest.
     * 
     * @return controlProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getControlProperty() {
        return controlProperty;
    }


    /**
     * Sets the controlProperty value for this ChangeCustDFTAcctRequest.
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
        if (!(obj instanceof ChangeCustDFTAcctRequest)) return false;
        ChangeCustDFTAcctRequest other = (ChangeCustDFTAcctRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.custAccessCode==null && other.getCustAccessCode()==null) || 
             (this.custAccessCode!=null &&
              this.custAccessCode.equals(other.getCustAccessCode()))) &&
            ((this.opType==null && other.getOpType()==null) || 
             (this.opType!=null &&
              this.opType.equals(other.getOpType()))) &&
            ((this.newDFTAcct==null && other.getNewDFTAcct()==null) || 
             (this.newDFTAcct!=null &&
              this.newDFTAcct.equals(other.getNewDFTAcct()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime()))) &&
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
        if (getCustAccessCode() != null) {
            _hashCode += getCustAccessCode().hashCode();
        }
        if (getOpType() != null) {
            _hashCode += getOpType().hashCode();
        }
        if (getNewDFTAcct() != null) {
            _hashCode += getNewDFTAcct().hashCode();
        }
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
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
        new org.apache.axis.description.TypeDesc(ChangeCustDFTAcctRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustDFTAcctRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CustAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OpType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDFTAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewDFTAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustDFTAcctRequest>NewDFTAcct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "EffectMode"));
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
