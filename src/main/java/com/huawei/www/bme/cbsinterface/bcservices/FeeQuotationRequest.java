/**
 * FeeQuotationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class FeeQuotationRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeObj chargeObj;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElement chargeElement;

    public FeeQuotationRequest() {
    }

    public FeeQuotationRequest(
           com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeObj chargeObj,
           com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElement chargeElement) {
           this.chargeObj = chargeObj;
           this.chargeElement = chargeElement;
    }


    /**
     * Gets the chargeObj value for this FeeQuotationRequest.
     * 
     * @return chargeObj
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeObj getChargeObj() {
        return chargeObj;
    }


    /**
     * Sets the chargeObj value for this FeeQuotationRequest.
     * 
     * @param chargeObj
     */
    public void setChargeObj(com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeObj chargeObj) {
        this.chargeObj = chargeObj;
    }


    /**
     * Gets the chargeElement value for this FeeQuotationRequest.
     * 
     * @return chargeElement
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElement getChargeElement() {
        return chargeElement;
    }


    /**
     * Sets the chargeElement value for this FeeQuotationRequest.
     * 
     * @param chargeElement
     */
    public void setChargeElement(com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElement chargeElement) {
        this.chargeElement = chargeElement;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeQuotationRequest)) return false;
        FeeQuotationRequest other = (FeeQuotationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chargeObj==null && other.getChargeObj()==null) || 
             (this.chargeObj!=null &&
              this.chargeObj.equals(other.getChargeObj()))) &&
            ((this.chargeElement==null && other.getChargeElement()==null) || 
             (this.chargeElement!=null &&
              this.chargeElement.equals(other.getChargeElement())));
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
        if (getChargeObj() != null) {
            _hashCode += getChargeObj().hashCode();
        }
        if (getChargeElement() != null) {
            _hashCode += getChargeElement().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeeQuotationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeQuotationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChargeObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationRequest>ChargeObj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeElement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChargeElement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationRequest>ChargeElement"));
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
