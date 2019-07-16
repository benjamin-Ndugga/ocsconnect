/**
 * ChangeOfferingPropertyRequestOfferingInstProductInst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeOfferingPropertyRequestOfferingInstProductInst  implements java.io.Serializable {
    private java.lang.String productID;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInstAddProperty[] addProperty;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty[] delProperty;

    public ChangeOfferingPropertyRequestOfferingInstProductInst() {
    }

    public ChangeOfferingPropertyRequestOfferingInstProductInst(
           java.lang.String productID,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInstAddProperty[] addProperty,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty[] delProperty) {
           this.productID = productID;
           this.addProperty = addProperty;
           this.delProperty = delProperty;
    }


    /**
     * Gets the productID value for this ChangeOfferingPropertyRequestOfferingInstProductInst.
     * 
     * @return productID
     */
    public java.lang.String getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this ChangeOfferingPropertyRequestOfferingInstProductInst.
     * 
     * @param productID
     */
    public void setProductID(java.lang.String productID) {
        this.productID = productID;
    }


    /**
     * Gets the addProperty value for this ChangeOfferingPropertyRequestOfferingInstProductInst.
     * 
     * @return addProperty
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInstAddProperty[] getAddProperty() {
        return addProperty;
    }


    /**
     * Sets the addProperty value for this ChangeOfferingPropertyRequestOfferingInstProductInst.
     * 
     * @param addProperty
     */
    public void setAddProperty(com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInstAddProperty[] addProperty) {
        this.addProperty = addProperty;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInstAddProperty getAddProperty(int i) {
        return this.addProperty[i];
    }

    public void setAddProperty(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInstAddProperty _value) {
        this.addProperty[i] = _value;
    }


    /**
     * Gets the delProperty value for this ChangeOfferingPropertyRequestOfferingInstProductInst.
     * 
     * @return delProperty
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty[] getDelProperty() {
        return delProperty;
    }


    /**
     * Sets the delProperty value for this ChangeOfferingPropertyRequestOfferingInstProductInst.
     * 
     * @param delProperty
     */
    public void setDelProperty(com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty[] delProperty) {
        this.delProperty = delProperty;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty getDelProperty(int i) {
        return this.delProperty[i];
    }

    public void setDelProperty(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty _value) {
        this.delProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeOfferingPropertyRequestOfferingInstProductInst)) return false;
        ChangeOfferingPropertyRequestOfferingInstProductInst other = (ChangeOfferingPropertyRequestOfferingInstProductInst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.addProperty==null && other.getAddProperty()==null) || 
             (this.addProperty!=null &&
              java.util.Arrays.equals(this.addProperty, other.getAddProperty()))) &&
            ((this.delProperty==null && other.getDelProperty()==null) || 
             (this.delProperty!=null &&
              java.util.Arrays.equals(this.delProperty, other.getDelProperty())));
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
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getAddProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddProperty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDelProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelProperty(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeOfferingPropertyRequestOfferingInstProductInst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeOfferingPropertyRequest>OfferingInst>ProductInst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeOfferingPropertyRequest>OfferingInst>ProductInst>AddProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeOfferingPropertyRequest>OfferingInst>ProductInst>DelProperty"));
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
