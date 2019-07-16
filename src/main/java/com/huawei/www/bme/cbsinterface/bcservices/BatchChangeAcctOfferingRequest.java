/**
 * BatchChangeAcctOfferingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchChangeAcctOfferingRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOffering acctOffering;

    private java.lang.String fileName;

    public BatchChangeAcctOfferingRequest() {
    }

    public BatchChangeAcctOfferingRequest(
           com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOffering acctOffering,
           java.lang.String fileName) {
           this.acctOffering = acctOffering;
           this.fileName = fileName;
    }


    /**
     * Gets the acctOffering value for this BatchChangeAcctOfferingRequest.
     * 
     * @return acctOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOffering getAcctOffering() {
        return acctOffering;
    }


    /**
     * Sets the acctOffering value for this BatchChangeAcctOfferingRequest.
     * 
     * @param acctOffering
     */
    public void setAcctOffering(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestAcctOffering acctOffering) {
        this.acctOffering = acctOffering;
    }


    /**
     * Gets the fileName value for this BatchChangeAcctOfferingRequest.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BatchChangeAcctOfferingRequest.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchChangeAcctOfferingRequest)) return false;
        BatchChangeAcctOfferingRequest other = (BatchChangeAcctOfferingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctOffering==null && other.getAcctOffering()==null) || 
             (this.acctOffering!=null &&
              this.acctOffering.equals(other.getAcctOffering()))) &&
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
        if (getAcctOffering() != null) {
            _hashCode += getAcctOffering().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchChangeAcctOfferingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeAcctOfferingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeAcctOfferingRequest>AcctOffering"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
