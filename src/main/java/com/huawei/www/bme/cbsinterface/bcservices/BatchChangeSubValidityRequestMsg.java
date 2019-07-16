/**
 * BatchChangeSubValidityRequestMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchChangeSubValidityRequestMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader;

    private com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubValidityRequest batchChangeSubValidityRequest;

    public BatchChangeSubValidityRequestMsg() {
    }

    public BatchChangeSubValidityRequestMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader,
           com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubValidityRequest batchChangeSubValidityRequest) {
           this.requestHeader = requestHeader;
           this.batchChangeSubValidityRequest = batchChangeSubValidityRequest;
    }


    /**
     * Gets the requestHeader value for this BatchChangeSubValidityRequestMsg.
     * 
     * @return requestHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this BatchChangeSubValidityRequestMsg.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the batchChangeSubValidityRequest value for this BatchChangeSubValidityRequestMsg.
     * 
     * @return batchChangeSubValidityRequest
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubValidityRequest getBatchChangeSubValidityRequest() {
        return batchChangeSubValidityRequest;
    }


    /**
     * Sets the batchChangeSubValidityRequest value for this BatchChangeSubValidityRequestMsg.
     * 
     * @param batchChangeSubValidityRequest
     */
    public void setBatchChangeSubValidityRequest(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubValidityRequest batchChangeSubValidityRequest) {
        this.batchChangeSubValidityRequest = batchChangeSubValidityRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchChangeSubValidityRequestMsg)) return false;
        BatchChangeSubValidityRequestMsg other = (BatchChangeSubValidityRequestMsg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestHeader==null && other.getRequestHeader()==null) || 
             (this.requestHeader!=null &&
              this.requestHeader.equals(other.getRequestHeader()))) &&
            ((this.batchChangeSubValidityRequest==null && other.getBatchChangeSubValidityRequest()==null) || 
             (this.batchChangeSubValidityRequest!=null &&
              this.batchChangeSubValidityRequest.equals(other.getBatchChangeSubValidityRequest())));
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
        if (getRequestHeader() != null) {
            _hashCode += getRequestHeader().hashCode();
        }
        if (getBatchChangeSubValidityRequest() != null) {
            _hashCode += getBatchChangeSubValidityRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchChangeSubValidityRequestMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubValidityRequestMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchChangeSubValidityRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BatchChangeSubValidityRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubValidityRequest"));
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
