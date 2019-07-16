/**
 * FeeQuotationRequestChargeElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class FeeQuotationRequestChargeElement  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementFeeAmount[] feeAmount;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFee offeringFee;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOperationFee operationFee;

    public FeeQuotationRequestChargeElement() {
    }

    public FeeQuotationRequestChargeElement(
           com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementFeeAmount[] feeAmount,
           com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFee offeringFee,
           com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOperationFee operationFee) {
           this.feeAmount = feeAmount;
           this.offeringFee = offeringFee;
           this.operationFee = operationFee;
    }


    /**
     * Gets the feeAmount value for this FeeQuotationRequestChargeElement.
     * 
     * @return feeAmount
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementFeeAmount[] getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this FeeQuotationRequestChargeElement.
     * 
     * @param feeAmount
     */
    public void setFeeAmount(com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementFeeAmount[] feeAmount) {
        this.feeAmount = feeAmount;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementFeeAmount getFeeAmount(int i) {
        return this.feeAmount[i];
    }

    public void setFeeAmount(int i, com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementFeeAmount _value) {
        this.feeAmount[i] = _value;
    }


    /**
     * Gets the offeringFee value for this FeeQuotationRequestChargeElement.
     * 
     * @return offeringFee
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFee getOfferingFee() {
        return offeringFee;
    }


    /**
     * Sets the offeringFee value for this FeeQuotationRequestChargeElement.
     * 
     * @param offeringFee
     */
    public void setOfferingFee(com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFee offeringFee) {
        this.offeringFee = offeringFee;
    }


    /**
     * Gets the operationFee value for this FeeQuotationRequestChargeElement.
     * 
     * @return operationFee
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOperationFee getOperationFee() {
        return operationFee;
    }


    /**
     * Sets the operationFee value for this FeeQuotationRequestChargeElement.
     * 
     * @param operationFee
     */
    public void setOperationFee(com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOperationFee operationFee) {
        this.operationFee = operationFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeQuotationRequestChargeElement)) return false;
        FeeQuotationRequestChargeElement other = (FeeQuotationRequestChargeElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feeAmount==null && other.getFeeAmount()==null) || 
             (this.feeAmount!=null &&
              java.util.Arrays.equals(this.feeAmount, other.getFeeAmount()))) &&
            ((this.offeringFee==null && other.getOfferingFee()==null) || 
             (this.offeringFee!=null &&
              this.offeringFee.equals(other.getOfferingFee()))) &&
            ((this.operationFee==null && other.getOperationFee()==null) || 
             (this.operationFee!=null &&
              this.operationFee.equals(other.getOperationFee())));
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
        if (getFeeAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeeAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeeAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOfferingFee() != null) {
            _hashCode += getOfferingFee().hashCode();
        }
        if (getOperationFee() != null) {
            _hashCode += getOperationFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeeQuotationRequestChargeElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationRequest>ChargeElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>FeeQuotationRequest>ChargeElement>FeeAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>FeeQuotationRequest>ChargeElement>OfferingFee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OperationFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>FeeQuotationRequest>ChargeElement>OperationFee"));
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
