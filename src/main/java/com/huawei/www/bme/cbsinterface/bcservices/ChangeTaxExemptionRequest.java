/**
 * ChangeTaxExemptionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeTaxExemptionRequest  implements java.io.Serializable {
    /* Register Customer Key */
    private com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode registerCust;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestAddExemption[] addExemption;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestDelExemption[] delExemption;

    public ChangeTaxExemptionRequest() {
    }

    public ChangeTaxExemptionRequest(
           com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode registerCust,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestAddExemption[] addExemption,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestDelExemption[] delExemption) {
           this.registerCust = registerCust;
           this.addExemption = addExemption;
           this.delExemption = delExemption;
    }


    /**
     * Gets the registerCust value for this ChangeTaxExemptionRequest.
     * 
     * @return registerCust   * Register Customer Key
     */
    public com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode getRegisterCust() {
        return registerCust;
    }


    /**
     * Sets the registerCust value for this ChangeTaxExemptionRequest.
     * 
     * @param registerCust   * Register Customer Key
     */
    public void setRegisterCust(com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode registerCust) {
        this.registerCust = registerCust;
    }


    /**
     * Gets the addExemption value for this ChangeTaxExemptionRequest.
     * 
     * @return addExemption
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestAddExemption[] getAddExemption() {
        return addExemption;
    }


    /**
     * Sets the addExemption value for this ChangeTaxExemptionRequest.
     * 
     * @param addExemption
     */
    public void setAddExemption(com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestAddExemption[] addExemption) {
        this.addExemption = addExemption;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestAddExemption getAddExemption(int i) {
        return this.addExemption[i];
    }

    public void setAddExemption(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestAddExemption _value) {
        this.addExemption[i] = _value;
    }


    /**
     * Gets the delExemption value for this ChangeTaxExemptionRequest.
     * 
     * @return delExemption
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestDelExemption[] getDelExemption() {
        return delExemption;
    }


    /**
     * Sets the delExemption value for this ChangeTaxExemptionRequest.
     * 
     * @param delExemption
     */
    public void setDelExemption(com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestDelExemption[] delExemption) {
        this.delExemption = delExemption;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestDelExemption getDelExemption(int i) {
        return this.delExemption[i];
    }

    public void setDelExemption(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestDelExemption _value) {
        this.delExemption[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeTaxExemptionRequest)) return false;
        ChangeTaxExemptionRequest other = (ChangeTaxExemptionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registerCust==null && other.getRegisterCust()==null) || 
             (this.registerCust!=null &&
              this.registerCust.equals(other.getRegisterCust()))) &&
            ((this.addExemption==null && other.getAddExemption()==null) || 
             (this.addExemption!=null &&
              java.util.Arrays.equals(this.addExemption, other.getAddExemption()))) &&
            ((this.delExemption==null && other.getDelExemption()==null) || 
             (this.delExemption!=null &&
              java.util.Arrays.equals(this.delExemption, other.getDelExemption())));
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
        if (getRegisterCust() != null) {
            _hashCode += getRegisterCust().hashCode();
        }
        if (getAddExemption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddExemption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddExemption(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDelExemption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelExemption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelExemption(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeTaxExemptionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeTaxExemptionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerCust");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RegisterCust"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addExemption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddExemption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeTaxExemptionRequest>AddExemption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delExemption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelExemption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeTaxExemptionRequest>DelExemption"));
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
