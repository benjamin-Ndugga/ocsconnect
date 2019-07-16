/**
 * ChangeTaxExemptionRequestAddExemption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeTaxExemptionRequestAddExemption  implements java.io.Serializable {
    private java.lang.String exptPlanCODE;

    private java.lang.String objType;

    private java.lang.String objKey;

    public ChangeTaxExemptionRequestAddExemption() {
    }

    public ChangeTaxExemptionRequestAddExemption(
           java.lang.String exptPlanCODE,
           java.lang.String objType,
           java.lang.String objKey) {
           this.exptPlanCODE = exptPlanCODE;
           this.objType = objType;
           this.objKey = objKey;
    }


    /**
     * Gets the exptPlanCODE value for this ChangeTaxExemptionRequestAddExemption.
     * 
     * @return exptPlanCODE
     */
    public java.lang.String getExptPlanCODE() {
        return exptPlanCODE;
    }


    /**
     * Sets the exptPlanCODE value for this ChangeTaxExemptionRequestAddExemption.
     * 
     * @param exptPlanCODE
     */
    public void setExptPlanCODE(java.lang.String exptPlanCODE) {
        this.exptPlanCODE = exptPlanCODE;
    }


    /**
     * Gets the objType value for this ChangeTaxExemptionRequestAddExemption.
     * 
     * @return objType
     */
    public java.lang.String getObjType() {
        return objType;
    }


    /**
     * Sets the objType value for this ChangeTaxExemptionRequestAddExemption.
     * 
     * @param objType
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }


    /**
     * Gets the objKey value for this ChangeTaxExemptionRequestAddExemption.
     * 
     * @return objKey
     */
    public java.lang.String getObjKey() {
        return objKey;
    }


    /**
     * Sets the objKey value for this ChangeTaxExemptionRequestAddExemption.
     * 
     * @param objKey
     */
    public void setObjKey(java.lang.String objKey) {
        this.objKey = objKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeTaxExemptionRequestAddExemption)) return false;
        ChangeTaxExemptionRequestAddExemption other = (ChangeTaxExemptionRequestAddExemption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exptPlanCODE==null && other.getExptPlanCODE()==null) || 
             (this.exptPlanCODE!=null &&
              this.exptPlanCODE.equals(other.getExptPlanCODE()))) &&
            ((this.objType==null && other.getObjType()==null) || 
             (this.objType!=null &&
              this.objType.equals(other.getObjType()))) &&
            ((this.objKey==null && other.getObjKey()==null) || 
             (this.objKey!=null &&
              this.objKey.equals(other.getObjKey())));
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
        if (getExptPlanCODE() != null) {
            _hashCode += getExptPlanCODE().hashCode();
        }
        if (getObjType() != null) {
            _hashCode += getObjType().hashCode();
        }
        if (getObjKey() != null) {
            _hashCode += getObjKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeTaxExemptionRequestAddExemption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeTaxExemptionRequest>AddExemption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exptPlanCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExptPlanCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ObjType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ObjKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
