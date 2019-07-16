/**
 * SynDTDiscountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class SynDTDiscountRequest  implements java.io.Serializable {
    private java.lang.String applyDate;

    private java.lang.String fileName;

    private java.math.BigInteger operateType;

    private java.lang.String expiryTime;

    public SynDTDiscountRequest() {
    }

    public SynDTDiscountRequest(
           java.lang.String applyDate,
           java.lang.String fileName,
           java.math.BigInteger operateType,
           java.lang.String expiryTime) {
           this.applyDate = applyDate;
           this.fileName = fileName;
           this.operateType = operateType;
           this.expiryTime = expiryTime;
    }


    /**
     * Gets the applyDate value for this SynDTDiscountRequest.
     * 
     * @return applyDate
     */
    public java.lang.String getApplyDate() {
        return applyDate;
    }


    /**
     * Sets the applyDate value for this SynDTDiscountRequest.
     * 
     * @param applyDate
     */
    public void setApplyDate(java.lang.String applyDate) {
        this.applyDate = applyDate;
    }


    /**
     * Gets the fileName value for this SynDTDiscountRequest.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this SynDTDiscountRequest.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the operateType value for this SynDTDiscountRequest.
     * 
     * @return operateType
     */
    public java.math.BigInteger getOperateType() {
        return operateType;
    }


    /**
     * Sets the operateType value for this SynDTDiscountRequest.
     * 
     * @param operateType
     */
    public void setOperateType(java.math.BigInteger operateType) {
        this.operateType = operateType;
    }


    /**
     * Gets the expiryTime value for this SynDTDiscountRequest.
     * 
     * @return expiryTime
     */
    public java.lang.String getExpiryTime() {
        return expiryTime;
    }


    /**
     * Sets the expiryTime value for this SynDTDiscountRequest.
     * 
     * @param expiryTime
     */
    public void setExpiryTime(java.lang.String expiryTime) {
        this.expiryTime = expiryTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SynDTDiscountRequest)) return false;
        SynDTDiscountRequest other = (SynDTDiscountRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applyDate==null && other.getApplyDate()==null) || 
             (this.applyDate!=null &&
              this.applyDate.equals(other.getApplyDate()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.operateType==null && other.getOperateType()==null) || 
             (this.operateType!=null &&
              this.operateType.equals(other.getOperateType()))) &&
            ((this.expiryTime==null && other.getExpiryTime()==null) || 
             (this.expiryTime!=null &&
              this.expiryTime.equals(other.getExpiryTime())));
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
        if (getApplyDate() != null) {
            _hashCode += getApplyDate().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getOperateType() != null) {
            _hashCode += getOperateType().hashCode();
        }
        if (getExpiryTime() != null) {
            _hashCode += getExpiryTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SynDTDiscountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SynDTDiscountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OperateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpiryTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
