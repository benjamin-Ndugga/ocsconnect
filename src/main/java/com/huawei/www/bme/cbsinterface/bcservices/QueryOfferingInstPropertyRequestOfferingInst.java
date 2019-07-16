/**
 * QueryOfferingInstPropertyRequestOfferingInst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryOfferingInstPropertyRequestOfferingInst  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingInstProductInst[] productInst;

    public QueryOfferingInstPropertyRequestOfferingInst() {
    }

    public QueryOfferingInstPropertyRequestOfferingInst(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingInstProductInst[] productInst) {
           this.offeringKey = offeringKey;
           this.productInst = productInst;
    }


    /**
     * Gets the offeringKey value for this QueryOfferingInstPropertyRequestOfferingInst.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this QueryOfferingInstPropertyRequestOfferingInst.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the productInst value for this QueryOfferingInstPropertyRequestOfferingInst.
     * 
     * @return productInst
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingInstProductInst[] getProductInst() {
        return productInst;
    }


    /**
     * Sets the productInst value for this QueryOfferingInstPropertyRequestOfferingInst.
     * 
     * @param productInst
     */
    public void setProductInst(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingInstProductInst[] productInst) {
        this.productInst = productInst;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingInstProductInst getProductInst(int i) {
        return this.productInst[i];
    }

    public void setProductInst(int i, com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingInstProductInst _value) {
        this.productInst[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryOfferingInstPropertyRequestOfferingInst)) return false;
        QueryOfferingInstPropertyRequestOfferingInst other = (QueryOfferingInstPropertyRequestOfferingInst) obj;
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
        new org.apache.axis.description.TypeDesc(QueryOfferingInstPropertyRequestOfferingInst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingInstPropertyRequest>OfferingInst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productInst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ProductInst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingInstPropertyRequest>OfferingInst>ProductInst"));
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
