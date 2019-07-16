/**
 * BatchChangeSubInitBalanceRequestMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchChangeSubInitBalanceRequestMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader;

    private com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubInitBalanceRequest batchChangeSubInitBalanceRequest;

    public BatchChangeSubInitBalanceRequestMsg() {
    }

    public BatchChangeSubInitBalanceRequestMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader,
           com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubInitBalanceRequest batchChangeSubInitBalanceRequest) {
           this.requestHeader = requestHeader;
           this.batchChangeSubInitBalanceRequest = batchChangeSubInitBalanceRequest;
    }


    /**
     * Gets the requestHeader value for this BatchChangeSubInitBalanceRequestMsg.
     * 
     * @return requestHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this BatchChangeSubInitBalanceRequestMsg.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the batchChangeSubInitBalanceRequest value for this BatchChangeSubInitBalanceRequestMsg.
     * 
     * @return batchChangeSubInitBalanceRequest
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubInitBalanceRequest getBatchChangeSubInitBalanceRequest() {
        return batchChangeSubInitBalanceRequest;
    }


    /**
     * Sets the batchChangeSubInitBalanceRequest value for this BatchChangeSubInitBalanceRequestMsg.
     * 
     * @param batchChangeSubInitBalanceRequest
     */
    public void setBatchChangeSubInitBalanceRequest(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubInitBalanceRequest batchChangeSubInitBalanceRequest) {
        this.batchChangeSubInitBalanceRequest = batchChangeSubInitBalanceRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchChangeSubInitBalanceRequestMsg)) return false;
        BatchChangeSubInitBalanceRequestMsg other = (BatchChangeSubInitBalanceRequestMsg) obj;
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
            ((this.batchChangeSubInitBalanceRequest==null && other.getBatchChangeSubInitBalanceRequest()==null) || 
             (this.batchChangeSubInitBalanceRequest!=null &&
              this.batchChangeSubInitBalanceRequest.equals(other.getBatchChangeSubInitBalanceRequest())));
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
        if (getBatchChangeSubInitBalanceRequest() != null) {
            _hashCode += getBatchChangeSubInitBalanceRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchChangeSubInitBalanceRequestMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchChangeSubInitBalanceRequestMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchChangeSubInitBalanceRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BatchChangeSubInitBalanceRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchChangeSubInitBalanceRequest"));
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
