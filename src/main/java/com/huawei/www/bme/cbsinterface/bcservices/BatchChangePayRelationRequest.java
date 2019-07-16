/**
 * BatchChangePayRelationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchChangePayRelationRequest  implements java.io.Serializable {
    private java.lang.String paymentAcctKey;

    private com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelation payRelation;

    private java.lang.String fileName;

    public BatchChangePayRelationRequest() {
    }

    public BatchChangePayRelationRequest(
           java.lang.String paymentAcctKey,
           com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelation payRelation,
           java.lang.String fileName) {
           this.paymentAcctKey = paymentAcctKey;
           this.payRelation = payRelation;
           this.fileName = fileName;
    }


    /**
     * Gets the paymentAcctKey value for this BatchChangePayRelationRequest.
     * 
     * @return paymentAcctKey
     */
    public java.lang.String getPaymentAcctKey() {
        return paymentAcctKey;
    }


    /**
     * Sets the paymentAcctKey value for this BatchChangePayRelationRequest.
     * 
     * @param paymentAcctKey
     */
    public void setPaymentAcctKey(java.lang.String paymentAcctKey) {
        this.paymentAcctKey = paymentAcctKey;
    }


    /**
     * Gets the payRelation value for this BatchChangePayRelationRequest.
     * 
     * @return payRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelation getPayRelation() {
        return payRelation;
    }


    /**
     * Sets the payRelation value for this BatchChangePayRelationRequest.
     * 
     * @param payRelation
     */
    public void setPayRelation(com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelation payRelation) {
        this.payRelation = payRelation;
    }


    /**
     * Gets the fileName value for this BatchChangePayRelationRequest.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BatchChangePayRelationRequest.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchChangePayRelationRequest)) return false;
        BatchChangePayRelationRequest other = (BatchChangePayRelationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentAcctKey==null && other.getPaymentAcctKey()==null) || 
             (this.paymentAcctKey!=null &&
              this.paymentAcctKey.equals(other.getPaymentAcctKey()))) &&
            ((this.payRelation==null && other.getPayRelation()==null) || 
             (this.payRelation!=null &&
              this.payRelation.equals(other.getPayRelation()))) &&
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
        if (getPaymentAcctKey() != null) {
            _hashCode += getPaymentAcctKey().hashCode();
        }
        if (getPayRelation() != null) {
            _hashCode += getPayRelation().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchChangePayRelationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangePayRelationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAcctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentAcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangePayRelationRequest>PayRelation"));
        elemField.setMinOccurs(0);
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
