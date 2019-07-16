/**
 * BatchChangeOfferingPropertyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccustomizedservices;

public class BatchChangeOfferingPropertyRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    private com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestOfferingInstProperty offeringInstProperty;

    private com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestProductInst productInst;

    private java.lang.Object fileName;

    public BatchChangeOfferingPropertyRequest() {
    }

    public BatchChangeOfferingPropertyRequest(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestOfferingInstProperty offeringInstProperty,
           com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestProductInst productInst,
           java.lang.Object fileName) {
           this.offeringKey = offeringKey;
           this.offeringInstProperty = offeringInstProperty;
           this.productInst = productInst;
           this.fileName = fileName;
    }


    /**
     * Gets the offeringKey value for this BatchChangeOfferingPropertyRequest.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this BatchChangeOfferingPropertyRequest.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the offeringInstProperty value for this BatchChangeOfferingPropertyRequest.
     * 
     * @return offeringInstProperty
     */
    public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestOfferingInstProperty getOfferingInstProperty() {
        return offeringInstProperty;
    }


    /**
     * Sets the offeringInstProperty value for this BatchChangeOfferingPropertyRequest.
     * 
     * @param offeringInstProperty
     */
    public void setOfferingInstProperty(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestOfferingInstProperty offeringInstProperty) {
        this.offeringInstProperty = offeringInstProperty;
    }


    /**
     * Gets the productInst value for this BatchChangeOfferingPropertyRequest.
     * 
     * @return productInst
     */
    public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestProductInst getProductInst() {
        return productInst;
    }


    /**
     * Sets the productInst value for this BatchChangeOfferingPropertyRequest.
     * 
     * @param productInst
     */
    public void setProductInst(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestProductInst productInst) {
        this.productInst = productInst;
    }


    /**
     * Gets the fileName value for this BatchChangeOfferingPropertyRequest.
     * 
     * @return fileName
     */
    public java.lang.Object getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BatchChangeOfferingPropertyRequest.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.Object fileName) {
        this.fileName = fileName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchChangeOfferingPropertyRequest)) return false;
        BatchChangeOfferingPropertyRequest other = (BatchChangeOfferingPropertyRequest) obj;
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
              this.offeringInstProperty.equals(other.getOfferingInstProperty()))) &&
            ((this.productInst==null && other.getProductInst()==null) || 
             (this.productInst!=null &&
              this.productInst.equals(other.getProductInst()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName())));
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
            _hashCode += getOfferingInstProperty().hashCode();
        }
        if (getProductInst() != null) {
            _hashCode += getProductInst().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchChangeOfferingPropertyRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeOfferingPropertyRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringInstProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "OfferingInstProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeOfferingPropertyRequest>OfferingInstProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productInst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "ProductInst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchChangeOfferingPropertyRequest>ProductInst"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
