/**
 * QueryOfferingInstPropertyResultOfferingInst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryOfferingInstPropertyResultOfferingInst  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstOfferingInstProperty[] offeringInstProperty;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstProductInst[] productInst;

    public QueryOfferingInstPropertyResultOfferingInst() {
    }

    public QueryOfferingInstPropertyResultOfferingInst(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstOfferingInstProperty[] offeringInstProperty,
           com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstProductInst[] productInst) {
           this.offeringKey = offeringKey;
           this.offeringInstProperty = offeringInstProperty;
           this.productInst = productInst;
    }


    /**
     * Gets the offeringKey value for this QueryOfferingInstPropertyResultOfferingInst.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this QueryOfferingInstPropertyResultOfferingInst.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the offeringInstProperty value for this QueryOfferingInstPropertyResultOfferingInst.
     * 
     * @return offeringInstProperty
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstOfferingInstProperty[] getOfferingInstProperty() {
        return offeringInstProperty;
    }


    /**
     * Sets the offeringInstProperty value for this QueryOfferingInstPropertyResultOfferingInst.
     * 
     * @param offeringInstProperty
     */
    public void setOfferingInstProperty(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstOfferingInstProperty[] offeringInstProperty) {
        this.offeringInstProperty = offeringInstProperty;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstOfferingInstProperty getOfferingInstProperty(int i) {
        return this.offeringInstProperty[i];
    }

    public void setOfferingInstProperty(int i, com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstOfferingInstProperty _value) {
        this.offeringInstProperty[i] = _value;
    }


    /**
     * Gets the productInst value for this QueryOfferingInstPropertyResultOfferingInst.
     * 
     * @return productInst
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstProductInst[] getProductInst() {
        return productInst;
    }


    /**
     * Sets the productInst value for this QueryOfferingInstPropertyResultOfferingInst.
     * 
     * @param productInst
     */
    public void setProductInst(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstProductInst[] productInst) {
        this.productInst = productInst;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstProductInst getProductInst(int i) {
        return this.productInst[i];
    }

    public void setProductInst(int i, com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultOfferingInstProductInst _value) {
        this.productInst[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryOfferingInstPropertyResultOfferingInst)) return false;
        QueryOfferingInstPropertyResultOfferingInst other = (QueryOfferingInstPropertyResultOfferingInst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offeringKey==null && other.getOfferingKey()==null) || 
             (this.offeringKey!=null &&
              this.offeringKey.equals(other.getOfferingKey()))) &&
            ((this.offeringInstProperty==null && other.getOfferingInstProperty()==null) || 
             (this.offeringInstProperty!=null &&
              java.util.Arrays.equals(this.offeringInstProperty, other.getOfferingInstProperty()))) &&
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
        if (getOfferingKey() != null) {
            _hashCode += getOfferingKey().hashCode();
        }
        if (getOfferingInstProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferingInstProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferingInstProperty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(QueryOfferingInstPropertyResultOfferingInst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingInstPropertyResult>OfferingInst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringInstProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingInstProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingInstPropertyResult>OfferingInst>OfferingInstProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productInst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ProductInst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingInstPropertyResult>OfferingInst>ProductInst"));
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
