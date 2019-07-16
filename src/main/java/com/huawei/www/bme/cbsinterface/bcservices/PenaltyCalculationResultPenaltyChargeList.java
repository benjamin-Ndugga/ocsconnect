/**
 * PenaltyCalculationResultPenaltyChargeList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class PenaltyCalculationResultPenaltyChargeList  implements java.io.Serializable {
    private java.lang.Long chargeAmt;

    private com.huawei.www.bme.cbsinterface.bccommon.Tax[] tax;

    public PenaltyCalculationResultPenaltyChargeList() {
    }

    public PenaltyCalculationResultPenaltyChargeList(
           java.lang.Long chargeAmt,
           com.huawei.www.bme.cbsinterface.bccommon.Tax[] tax) {
           this.chargeAmt = chargeAmt;
           this.tax = tax;
    }


    /**
     * Gets the chargeAmt value for this PenaltyCalculationResultPenaltyChargeList.
     * 
     * @return chargeAmt
     */
    public java.lang.Long getChargeAmt() {
        return chargeAmt;
    }


    /**
     * Sets the chargeAmt value for this PenaltyCalculationResultPenaltyChargeList.
     * 
     * @param chargeAmt
     */
    public void setChargeAmt(java.lang.Long chargeAmt) {
        this.chargeAmt = chargeAmt;
    }


    /**
     * Gets the tax value for this PenaltyCalculationResultPenaltyChargeList.
     * 
     * @return tax
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Tax[] getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this PenaltyCalculationResultPenaltyChargeList.
     * 
     * @param tax
     */
    public void setTax(com.huawei.www.bme.cbsinterface.bccommon.Tax[] tax) {
        this.tax = tax;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.Tax getTax(int i) {
        return this.tax[i];
    }

    public void setTax(int i, com.huawei.www.bme.cbsinterface.bccommon.Tax _value) {
        this.tax[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PenaltyCalculationResultPenaltyChargeList)) return false;
        PenaltyCalculationResultPenaltyChargeList other = (PenaltyCalculationResultPenaltyChargeList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chargeAmt==null && other.getChargeAmt()==null) || 
             (this.chargeAmt!=null &&
              this.chargeAmt.equals(other.getChargeAmt()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              java.util.Arrays.equals(this.tax, other.getTax())));
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
        if (getChargeAmt() != null) {
            _hashCode += getChargeAmt().hashCode();
        }
        if (getTax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTax(), i);
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
        new org.apache.axis.description.TypeDesc(PenaltyCalculationResultPenaltyChargeList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">PenaltyCalculationResult>PenaltyChargeList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChargeAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Tax"));
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
