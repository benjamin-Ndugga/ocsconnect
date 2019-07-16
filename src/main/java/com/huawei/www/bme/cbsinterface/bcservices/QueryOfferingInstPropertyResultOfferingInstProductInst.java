/**
 * QueryOfferingInstPropertyResultOfferingInstProductInst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryOfferingInstPropertyResultOfferingInstProductInst  implements java.io.Serializable {
    private java.lang.String productID;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstProductInstProductInstProperty[] productInstProperty;

    public QueryOfferingInstPropertyResultOfferingInstProductInst() {
    }

    public QueryOfferingInstPropertyResultOfferingInstProductInst(
           java.lang.String productID,
           com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstProductInstProductInstProperty[] productInstProperty) {
           this.productID = productID;
           this.productInstProperty = productInstProperty;
    }


    /**
     * Gets the productID value for this QueryOfferingInstPropertyResultOfferingInstProductInst.
     * 
     * @return productID
     */
    public java.lang.String getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this QueryOfferingInstPropertyResultOfferingInstProductInst.
     * 
     * @param productID
     */
    public void setProductID(java.lang.String productID) {
        this.productID = productID;
    }


    /**
     * Gets the productInstProperty value for this QueryOfferingInstPropertyResultOfferingInstProductInst.
     * 
     * @return productInstProperty
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstProductInstProductInstProperty[] getProductInstProperty() {
        return productInstProperty;
    }


    /**
     * Sets the productInstProperty value for this QueryOfferingInstPropertyResultOfferingInstProductInst.
     * 
     * @param productInstProperty
     */
    public void setProductInstProperty(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstProductInstProductInstProperty[] productInstProperty) {
        this.productInstProperty = productInstProperty;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstProductInstProductInstProperty getProductInstProperty(int i) {
        return this.productInstProperty[i];
    }

    public void setProductInstProperty(int i, com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstProductInstProductInstProperty _value) {
        this.productInstProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryOfferingInstPropertyResultOfferingInstProductInst)) return false;
        QueryOfferingInstPropertyResultOfferingInstProductInst other = (QueryOfferingInstPropertyResultOfferingInstProductInst) obj;
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
            ((this.productInstProperty==null && other.getProductInstProperty()==null) || 
             (this.productInstProperty!=null &&
              java.util.Arrays.equals(this.productInstProperty, other.getProductInstProperty())));
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
        if (getProductInstProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductInstProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductInstProperty(), i);
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
        new org.apache.axis.description.TypeDesc(QueryOfferingInstPropertyResultOfferingInstProductInst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingInstPropertyResult>OfferingInst>ProductInst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productInstProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ProductInstProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>QueryOfferingInstPropertyResult>OfferingInst>ProductInst>ProductInstProperty"));
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
