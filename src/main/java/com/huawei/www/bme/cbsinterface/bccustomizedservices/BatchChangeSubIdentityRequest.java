/**
 * BatchChangeSubIdentityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccustomizedservices;

public class BatchChangeSubIdentityRequest  implements java.io.Serializable {
    private java.lang.String fileName;

    /* 识别码类型。
     * 	1: MSISDN
     * 	2: IMSI
     * 	3: SIP_URI
     * 	4: NAI
     * 	5: Voip SIM */
    private java.lang.String subIdentityType;

    public BatchChangeSubIdentityRequest() {
    }

    public BatchChangeSubIdentityRequest(
           java.lang.String fileName,
           java.lang.String subIdentityType) {
           this.fileName = fileName;
           this.subIdentityType = subIdentityType;
    }


    /**
     * Gets the fileName value for this BatchChangeSubIdentityRequest.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BatchChangeSubIdentityRequest.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the subIdentityType value for this BatchChangeSubIdentityRequest.
     * 
     * @return subIdentityType   * 识别码类型。
     * 	1: MSISDN
     * 	2: IMSI
     * 	3: SIP_URI
     * 	4: NAI
     * 	5: Voip SIM
     */
    public java.lang.String getSubIdentityType() {
        return subIdentityType;
    }


    /**
     * Sets the subIdentityType value for this BatchChangeSubIdentityRequest.
     * 
     * @param subIdentityType   * 识别码类型。
     * 	1: MSISDN
     * 	2: IMSI
     * 	3: SIP_URI
     * 	4: NAI
     * 	5: Voip SIM
     */
    public void setSubIdentityType(java.lang.String subIdentityType) {
        this.subIdentityType = subIdentityType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchChangeSubIdentityRequest)) return false;
        BatchChangeSubIdentityRequest other = (BatchChangeSubIdentityRequest) obj;
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
            ((this.subIdentityType==null && other.getSubIdentityType()==null) || 
             (this.subIdentityType!=null &&
              this.subIdentityType.equals(other.getSubIdentityType())));
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
        if (getSubIdentityType() != null) {
            _hashCode += getSubIdentityType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchChangeSubIdentityRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeSubIdentityRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subIdentityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "SubIdentityType"));
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
