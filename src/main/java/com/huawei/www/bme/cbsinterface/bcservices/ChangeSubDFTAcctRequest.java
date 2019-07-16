/**
 * ChangeSubDFTAcctRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubDFTAcctRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestSubDFTAccount subDFTAccount;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelation DFTPayRelation;

    private com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime;

    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] controlProperty;

    public ChangeSubDFTAcctRequest() {
    }

    public ChangeSubDFTAcctRequest(
           com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestSubDFTAccount subDFTAccount,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelation DFTPayRelation,
           com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] controlProperty) {
           this.subAccessCode = subAccessCode;
           this.subDFTAccount = subDFTAccount;
           this.DFTPayRelation = DFTPayRelation;
           this.effectiveTime = effectiveTime;
           this.controlProperty = controlProperty;
    }


    /**
     * Gets the subAccessCode value for this ChangeSubDFTAcctRequest.
     * 
     * @return subAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }


    /**
     * Sets the subAccessCode value for this ChangeSubDFTAcctRequest.
     * 
     * @param subAccessCode
     */
    public void setSubAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }


    /**
     * Gets the subDFTAccount value for this ChangeSubDFTAcctRequest.
     * 
     * @return subDFTAccount
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestSubDFTAccount getSubDFTAccount() {
        return subDFTAccount;
    }


    /**
     * Sets the subDFTAccount value for this ChangeSubDFTAcctRequest.
     * 
     * @param subDFTAccount
     */
    public void setSubDFTAccount(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestSubDFTAccount subDFTAccount) {
        this.subDFTAccount = subDFTAccount;
    }


    /**
     * Gets the DFTPayRelation value for this ChangeSubDFTAcctRequest.
     * 
     * @return DFTPayRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelation getDFTPayRelation() {
        return DFTPayRelation;
    }


    /**
     * Sets the DFTPayRelation value for this ChangeSubDFTAcctRequest.
     * 
     * @param DFTPayRelation
     */
    public void setDFTPayRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelation DFTPayRelation) {
        this.DFTPayRelation = DFTPayRelation;
    }


    /**
     * Gets the effectiveTime value for this ChangeSubDFTAcctRequest.
     * 
     * @return effectiveTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.EffectMode getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this ChangeSubDFTAcctRequest.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the controlProperty value for this ChangeSubDFTAcctRequest.
     * 
     * @return controlProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getControlProperty() {
        return controlProperty;
    }


    /**
     * Sets the controlProperty value for this ChangeSubDFTAcctRequest.
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
        if (!(obj instanceof ChangeSubDFTAcctRequest)) return false;
        ChangeSubDFTAcctRequest other = (ChangeSubDFTAcctRequest) obj;
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
            ((this.subDFTAccount==null && other.getSubDFTAccount()==null) || 
             (this.subDFTAccount!=null &&
              this.subDFTAccount.equals(other.getSubDFTAccount()))) &&
            ((this.DFTPayRelation==null && other.getDFTPayRelation()==null) || 
             (this.DFTPayRelation!=null &&
              this.DFTPayRelation.equals(other.getDFTPayRelation()))) &&
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
        if (getSubAccessCode() != null) {
            _hashCode += getSubAccessCode().hashCode();
        }
        if (getSubDFTAccount() != null) {
            _hashCode += getSubDFTAccount().hashCode();
        }
        if (getDFTPayRelation() != null) {
            _hashCode += getDFTPayRelation().hashCode();
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
        new org.apache.axis.description.TypeDesc(ChangeSubDFTAcctRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubDFTAcctRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subDFTAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubDFTAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubDFTAcctRequest>SubDFTAccount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFTPayRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DFTPayRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubDFTAcctRequest>DFTPayRelation"));
        elemField.setMinOccurs(0);
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
