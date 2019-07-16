/**
 * ChangeProductStatusRequestOfferingInst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeProductStatusRequestOfferingInst  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestOfferingInstOfferingOwner offeringOwner;

    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestOfferingInstProductInst[] productInst;

    public ChangeProductStatusRequestOfferingInst() {
    }

    public ChangeProductStatusRequestOfferingInst(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestOfferingInstOfferingOwner offeringOwner,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestOfferingInstProductInst[] productInst) {
           this.offeringOwner = offeringOwner;
           this.offeringKey = offeringKey;
           this.productInst = productInst;
    }


    /**
     * Gets the offeringOwner value for this ChangeProductStatusRequestOfferingInst.
     * 
     * @return offeringOwner
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestOfferingInstOfferingOwner getOfferingOwner() {
        return offeringOwner;
    }


    /**
     * Sets the offeringOwner value for this ChangeProductStatusRequestOfferingInst.
     * 
     * @param offeringOwner
     */
    public void setOfferingOwner(com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestOfferingInstOfferingOwner offeringOwner) {
        this.offeringOwner = offeringOwner;
    }


    /**
     * Gets the offeringKey value for this ChangeProductStatusRequestOfferingInst.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this ChangeProductStatusRequestOfferingInst.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the productInst value for this ChangeProductStatusRequestOfferingInst.
     * 
     * @return productInst
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestOfferingInstProductInst[] getProductInst() {
        return productInst;
    }


    /**
     * Sets the productInst value for this ChangeProductStatusRequestOfferingInst.
     * 
     * @param productInst
     */
    public void setProductInst(com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestOfferingInstProductInst[] productInst) {
        this.productInst = productInst;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestOfferingInstProductInst getProductInst(int i) {
        return this.productInst[i];
    }

    public void setProductInst(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestOfferingInstProductInst _value) {
        this.productInst[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeProductStatusRequestOfferingInst)) return false;
        ChangeProductStatusRequestOfferingInst other = (ChangeProductStatusRequestOfferingInst) obj;
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
        new org.apache.axis.description.TypeDesc(ChangeProductStatusRequestOfferingInst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeProductStatusRequest>OfferingInst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeProductStatusRequest>OfferingInst>OfferingOwner"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productInst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ProductInst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeProductStatusRequest>OfferingInst>ProductInst"));
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
