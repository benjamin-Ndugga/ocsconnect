/**
 * ChangeOfferingPropertyRequestOfferingInst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeOfferingPropertyRequestOfferingInst  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstOfferingOwner offeringOwner;

    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstOfferingInstProperty offeringInstProperty;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInst[] productInst;

    public ChangeOfferingPropertyRequestOfferingInst() {
    }

    public ChangeOfferingPropertyRequestOfferingInst(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstOfferingOwner offeringOwner,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstOfferingInstProperty offeringInstProperty,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInst[] productInst) {
           this.offeringOwner = offeringOwner;
           this.offeringKey = offeringKey;
           this.offeringInstProperty = offeringInstProperty;
           this.productInst = productInst;
    }


    /**
     * Gets the offeringOwner value for this ChangeOfferingPropertyRequestOfferingInst.
     * 
     * @return offeringOwner
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstOfferingOwner getOfferingOwner() {
        return offeringOwner;
    }


    /**
     * Sets the offeringOwner value for this ChangeOfferingPropertyRequestOfferingInst.
     * 
     * @param offeringOwner
     */
    public void setOfferingOwner(com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstOfferingOwner offeringOwner) {
        this.offeringOwner = offeringOwner;
    }


    /**
     * Gets the offeringKey value for this ChangeOfferingPropertyRequestOfferingInst.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this ChangeOfferingPropertyRequestOfferingInst.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the offeringInstProperty value for this ChangeOfferingPropertyRequestOfferingInst.
     * 
     * @return offeringInstProperty
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstOfferingInstProperty getOfferingInstProperty() {
        return offeringInstProperty;
    }


    /**
     * Sets the offeringInstProperty value for this ChangeOfferingPropertyRequestOfferingInst.
     * 
     * @param offeringInstProperty
     */
    public void setOfferingInstProperty(com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstOfferingInstProperty offeringInstProperty) {
        this.offeringInstProperty = offeringInstProperty;
    }


    /**
     * Gets the productInst value for this ChangeOfferingPropertyRequestOfferingInst.
     * 
     * @return productInst
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInst[] getProductInst() {
        return productInst;
    }


    /**
     * Sets the productInst value for this ChangeOfferingPropertyRequestOfferingInst.
     * 
     * @param productInst
     */
    public void setProductInst(com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInst[] productInst) {
        this.productInst = productInst;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInst getProductInst(int i) {
        return this.productInst[i];
    }

    public void setProductInst(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInstProductInst _value) {
        this.productInst[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeOfferingPropertyRequestOfferingInst)) return false;
        ChangeOfferingPropertyRequestOfferingInst other = (ChangeOfferingPropertyRequestOfferingInst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offeringOwner==null && other.getOfferingOwner()==null) || 
             (this.offeringOwner!=null &&
              this.offeringOwner.equals(other.getOfferingOwner()))) &&
            ((this.offeringKey==null && other.getOfferingKey()==null) || 
             (this.offeringKey!=null &&
              this.offeringKey.equals(other.getOfferingKey()))) &&
            ((this.offeringInstProperty==null && other.getOfferingInstProperty()==null) || 
             (this.offeringInstProperty!=null &&
              this.offeringInstProperty.equals(other.getOfferingInstProperty()))) &&
            ((this.productInst==null && other.getProductInst()==null) || 
             (this.productInst!=null &&
              java.util.Arrays.equals(this.productInst, other.getProductInst())));
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
        if (getOfferingOwner() != null) {
            _hashCode += getOfferingOwner().hashCode();
        }
        if (getOfferingKey() != null) {
            _hashCode += getOfferingKey().hashCode();
        }
        if (getOfferingInstProperty() != null) {
            _hashCode += getOfferingInstProperty().hashCode();
        }
        if (getProductInst() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductInst());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductInst(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeOfferingPropertyRequestOfferingInst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingPropertyRequest>OfferingInst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeOfferingPropertyRequest>OfferingInst>OfferingOwner"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringInstProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingInstProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeOfferingPropertyRequest>OfferingInst>OfferingInstProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productInst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ProductInst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeOfferingPropertyRequest>OfferingInst>ProductInst"));
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
