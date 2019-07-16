/**
 * ModifyStatementRequestStatementScenario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ModifyStatementRequestStatementScenario  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenarioAddStatementScenario[] addStatementScenario;

    private com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenarioDelStatementScenario[] delStatementScenario;

    public ModifyStatementRequestStatementScenario() {
    }

    public ModifyStatementRequestStatementScenario(
           com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenarioAddStatementScenario[] addStatementScenario,
           com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenarioDelStatementScenario[] delStatementScenario) {
           this.addStatementScenario = addStatementScenario;
           this.delStatementScenario = delStatementScenario;
    }


    /**
     * Gets the addStatementScenario value for this ModifyStatementRequestStatementScenario.
     * 
     * @return addStatementScenario
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenarioAddStatementScenario[] getAddStatementScenario() {
        return addStatementScenario;
    }


    /**
     * Sets the addStatementScenario value for this ModifyStatementRequestStatementScenario.
     * 
     * @param addStatementScenario
     */
    public void setAddStatementScenario(com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenarioAddStatementScenario[] addStatementScenario) {
        this.addStatementScenario = addStatementScenario;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenarioAddStatementScenario getAddStatementScenario(int i) {
        return this.addStatementScenario[i];
    }

    public void setAddStatementScenario(int i, com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenarioAddStatementScenario _value) {
        this.addStatementScenario[i] = _value;
    }


    /**
     * Gets the delStatementScenario value for this ModifyStatementRequestStatementScenario.
     * 
     * @return delStatementScenario
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenarioDelStatementScenario[] getDelStatementScenario() {
        return delStatementScenario;
    }


    /**
     * Sets the delStatementScenario value for this ModifyStatementRequestStatementScenario.
     * 
     * @param delStatementScenario
     */
    public void setDelStatementScenario(com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenarioDelStatementScenario[] delStatementScenario) {
        this.delStatementScenario = delStatementScenario;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenarioDelStatementScenario getDelStatementScenario(int i) {
        return this.delStatementScenario[i];
    }

    public void setDelStatementScenario(int i, com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenarioDelStatementScenario _value) {
        this.delStatementScenario[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyStatementRequestStatementScenario)) return false;
        ModifyStatementRequestStatementScenario other = (ModifyStatementRequestStatementScenario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addStatementScenario==null && other.getAddStatementScenario()==null) || 
             (this.addStatementScenario!=null &&
              java.util.Arrays.equals(this.addStatementScenario, other.getAddStatementScenario()))) &&
            ((this.delStatementScenario==null && other.getDelStatementScenario()==null) || 
             (this.delStatementScenario!=null &&
              java.util.Arrays.equals(this.delStatementScenario, other.getDelStatementScenario())));
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
        if (getAddStatementScenario() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddStatementScenario());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddStatementScenario(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDelStatementScenario() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelStatementScenario());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelStatementScenario(), i);
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
        new org.apache.axis.description.TypeDesc(ModifyStatementRequestStatementScenario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ModifyStatementRequest>StatementScenario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addStatementScenario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddStatementScenario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ModifyStatementRequest>StatementScenario>AddStatementScenario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delStatementScenario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelStatementScenario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ModifyStatementRequest>StatementScenario>DelStatementScenario"));
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
