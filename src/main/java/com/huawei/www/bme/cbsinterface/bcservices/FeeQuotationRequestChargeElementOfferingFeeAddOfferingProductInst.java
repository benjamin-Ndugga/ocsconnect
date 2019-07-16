/**
 * FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst  implements java.io.Serializable {
    /* It is product ID which is defined in PC module. */
    private long productID;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInstPInstProperty[] PInstProperty;

    public FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst() {
    }

    public FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst(
           long productID,
           com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInstPInstProperty[] PInstProperty) {
           this.productID = productID;
           this.PInstProperty = PInstProperty;
    }


    /**
     * Gets the productID value for this FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst.
     * 
     * @return productID   * It is product ID which is defined in PC module.
     */
    public long getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst.
     * 
     * @param productID   * It is product ID which is defined in PC module.
     */
    public void setProductID(long productID) {
        this.productID = productID;
    }


    /**
     * Gets the PInstProperty value for this FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst.
     * 
     * @return PInstProperty
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInstPInstProperty[] getPInstProperty() {
        return PInstProperty;
    }


    /**
     * Sets the PInstProperty value for this FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst.
     * 
     * @param PInstProperty
     */
    public void setPInstProperty(com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInstPInstProperty[] PInstProperty) {
        this.PInstProperty = PInstProperty;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInstPInstProperty getPInstProperty(int i) {
        return this.PInstProperty[i];
    }

    public void setPInstProperty(int i, com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInstPInstProperty _value) {
        this.PInstProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst)) return false;
        FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst other = (FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.productID == other.getProductID() &&
            ((this.PInstProperty==null && other.getPInstProperty()==null) || 
             (this.PInstProperty!=null &&
              java.util.Arrays.equals(this.PInstProperty, other.getPInstProperty())));
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
        _hashCode += new Long(getProductID()).hashCode();
        if (getPInstProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPInstProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPInstProperty(), i);
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
        new org.apache.axis.description.TypeDesc(FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>FeeQuotationRequest>ChargeElement>OfferingFee>AddOffering>ProductInst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PInstProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PInstProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>>FeeQuotationRequest>ChargeElement>OfferingFee>AddOffering>ProductInst>PInstProperty"));
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
