/**
 * QueryOfferingInstPropertyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryOfferingInstPropertyRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingOwner offeringOwner;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingInst[] offeringInst;

    public QueryOfferingInstPropertyRequest() {
    }

    public QueryOfferingInstPropertyRequest(
           com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingOwner offeringOwner,
           com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingInst[] offeringInst) {
           this.offeringOwner = offeringOwner;
           this.offeringInst = offeringInst;
    }


    /**
     * Gets the offeringOwner value for this QueryOfferingInstPropertyRequest.
     * 
     * @return offeringOwner
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingOwner getOfferingOwner() {
        return offeringOwner;
    }


    /**
     * Sets the offeringOwner value for this QueryOfferingInstPropertyRequest.
     * 
     * @param offeringOwner
     */
    public void setOfferingOwner(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingOwner offeringOwner) {
        this.offeringOwner = offeringOwner;
    }


    /**
     * Gets the offeringInst value for this QueryOfferingInstPropertyRequest.
     * 
     * @return offeringInst
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingInst[] getOfferingInst() {
        return offeringInst;
    }


    /**
     * Sets the offeringInst value for this QueryOfferingInstPropertyRequest.
     * 
     * @param offeringInst
     */
    public void setOfferingInst(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingInst[] offeringInst) {
        this.offeringInst = offeringInst;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingInst getOfferingInst(int i) {
        return this.offeringInst[i];
    }

    public void setOfferingInst(int i, com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestOfferingInst _value) {
        this.offeringInst[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryOfferingInstPropertyRequest)) return false;
        QueryOfferingInstPropertyRequest other = (QueryOfferingInstPropertyRequest) obj;
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
            ((this.offeringInst==null && other.getOfferingInst()==null) || 
             (this.offeringInst!=null &&
              java.util.Arrays.equals(this.offeringInst, other.getOfferingInst())));
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
        if (getOfferingInst() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferingInst());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferingInst(), i);
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
        new org.apache.axis.description.TypeDesc(QueryOfferingInstPropertyRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryOfferingInstPropertyRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingInstPropertyRequest>OfferingOwner"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringInst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingInst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingInstPropertyRequest>OfferingInst"));
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
