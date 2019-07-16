/**
 * QueryOfferingRentCycleRequestOfferingInst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryOfferingRentCycleRequestOfferingInst  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleRequestOfferingInstOfferingOwner offeringOwner;

    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    public QueryOfferingRentCycleRequestOfferingInst() {
    }

    public QueryOfferingRentCycleRequestOfferingInst(
           com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleRequestOfferingInstOfferingOwner offeringOwner,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
           this.offeringOwner = offeringOwner;
           this.offeringKey = offeringKey;
    }


    /**
     * Gets the offeringOwner value for this QueryOfferingRentCycleRequestOfferingInst.
     * 
     * @return offeringOwner
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleRequestOfferingInstOfferingOwner getOfferingOwner() {
        return offeringOwner;
    }


    /**
     * Sets the offeringOwner value for this QueryOfferingRentCycleRequestOfferingInst.
     * 
     * @param offeringOwner
     */
    public void setOfferingOwner(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleRequestOfferingInstOfferingOwner offeringOwner) {
        this.offeringOwner = offeringOwner;
    }


    /**
     * Gets the offeringKey value for this QueryOfferingRentCycleRequestOfferingInst.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this QueryOfferingRentCycleRequestOfferingInst.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryOfferingRentCycleRequestOfferingInst)) return false;
        QueryOfferingRentCycleRequestOfferingInst other = (QueryOfferingRentCycleRequestOfferingInst) obj;
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
              this.offeringKey.equals(other.getOfferingKey())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryOfferingRentCycleRequestOfferingInst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentCycleRequest>OfferingInst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingRentCycleRequest>OfferingInst>OfferingOwner"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
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
