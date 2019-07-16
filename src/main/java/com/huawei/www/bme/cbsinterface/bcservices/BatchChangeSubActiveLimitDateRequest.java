/**
 * BatchChangeSubActiveLimitDateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchChangeSubActiveLimitDateRequest  implements java.io.Serializable {
    private java.lang.String fileName;

    private java.lang.String newActiveLimitDate;

    public BatchChangeSubActiveLimitDateRequest() {
    }

    public BatchChangeSubActiveLimitDateRequest(
           java.lang.String fileName,
           java.lang.String newActiveLimitDate) {
           this.fileName = fileName;
           this.newActiveLimitDate = newActiveLimitDate;
    }


    /**
     * Gets the fileName value for this BatchChangeSubActiveLimitDateRequest.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BatchChangeSubActiveLimitDateRequest.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the newActiveLimitDate value for this BatchChangeSubActiveLimitDateRequest.
     * 
     * @return newActiveLimitDate
     */
    public java.lang.String getNewActiveLimitDate() {
        return newActiveLimitDate;
    }


    /**
     * Sets the newActiveLimitDate value for this BatchChangeSubActiveLimitDateRequest.
     * 
     * @param newActiveLimitDate
     */
    public void setNewActiveLimitDate(java.lang.String newActiveLimitDate) {
        this.newActiveLimitDate = newActiveLimitDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchChangeSubActiveLimitDateRequest)) return false;
        BatchChangeSubActiveLimitDateRequest other = (BatchChangeSubActiveLimitDateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.newActiveLimitDate==null && other.getNewActiveLimitDate()==null) || 
             (this.newActiveLimitDate!=null &&
              this.newActiveLimitDate.equals(other.getNewActiveLimitDate())));
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
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getNewActiveLimitDate() != null) {
            _hashCode += getNewActiveLimitDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchChangeSubActiveLimitDateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubActiveLimitDateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newActiveLimitDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewActiveLimitDate"));
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
