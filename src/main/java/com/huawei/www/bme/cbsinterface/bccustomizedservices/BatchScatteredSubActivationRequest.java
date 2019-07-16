/**
 * BatchScatteredSubActivationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccustomizedservices;


/**
 * 批量激活散号号码
 */
public class BatchScatteredSubActivationRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationRequestSubBasicInfo subBasicInfo;

    private java.lang.String fileName;

    public BatchScatteredSubActivationRequest() {
    }

    public BatchScatteredSubActivationRequest(
           com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationRequestSubBasicInfo subBasicInfo,
           java.lang.String fileName) {
           this.subBasicInfo = subBasicInfo;
           this.fileName = fileName;
    }


    /**
     * Gets the subBasicInfo value for this BatchScatteredSubActivationRequest.
     * 
     * @return subBasicInfo
     */
    public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationRequestSubBasicInfo getSubBasicInfo() {
        return subBasicInfo;
    }


    /**
     * Sets the subBasicInfo value for this BatchScatteredSubActivationRequest.
     * 
     * @param subBasicInfo
     */
    public void setSubBasicInfo(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationRequestSubBasicInfo subBasicInfo) {
        this.subBasicInfo = subBasicInfo;
    }


    /**
     * Gets the fileName value for this BatchScatteredSubActivationRequest.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BatchScatteredSubActivationRequest.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchScatteredSubActivationRequest)) return false;
        BatchScatteredSubActivationRequest other = (BatchScatteredSubActivationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subBasicInfo==null && other.getSubBasicInfo()==null) || 
             (this.subBasicInfo!=null &&
              this.subBasicInfo.equals(other.getSubBasicInfo()))) &&
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
        if (getSubBasicInfo() != null) {
            _hashCode += getSubBasicInfo().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchScatteredSubActivationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchScatteredSubActivationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subBasicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "SubBasicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", ">BatchScatteredSubActivationRequest>SubBasicInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "FileName"));
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
