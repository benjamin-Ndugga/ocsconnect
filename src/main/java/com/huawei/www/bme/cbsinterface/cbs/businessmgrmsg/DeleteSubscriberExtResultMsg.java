/**
 * DeleteSubscriberExtResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg;

public class DeleteSubscriberExtResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader;

    private java.lang.String[] deleteSubscriberExtResult;

    public DeleteSubscriberExtResultMsg() {
    }

    public DeleteSubscriberExtResultMsg(
           com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader,
           java.lang.String[] deleteSubscriberExtResult) {
           this.resultHeader = resultHeader;
           this.deleteSubscriberExtResult = deleteSubscriberExtResult;
    }


    /**
     * Gets the resultHeader value for this DeleteSubscriberExtResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.common.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this DeleteSubscriberExtResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the deleteSubscriberExtResult value for this DeleteSubscriberExtResultMsg.
     * 
     * @return deleteSubscriberExtResult
     */
    public java.lang.String[] getDeleteSubscriberExtResult() {
        return deleteSubscriberExtResult;
    }


    /**
     * Sets the deleteSubscriberExtResult value for this DeleteSubscriberExtResultMsg.
     * 
     * @param deleteSubscriberExtResult
     */
    public void setDeleteSubscriberExtResult(java.lang.String[] deleteSubscriberExtResult) {
        this.deleteSubscriberExtResult = deleteSubscriberExtResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteSubscriberExtResultMsg)) return false;
        DeleteSubscriberExtResultMsg other = (DeleteSubscriberExtResultMsg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultHeader==null && other.getResultHeader()==null) || 
             (this.resultHeader!=null &&
              this.resultHeader.equals(other.getResultHeader()))) &&
            ((this.deleteSubscriberExtResult==null && other.getDeleteSubscriberExtResult()==null) || 
             (this.deleteSubscriberExtResult!=null &&
              java.util.Arrays.equals(this.deleteSubscriberExtResult, other.getDeleteSubscriberExtResult())));
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
        if (getResultHeader() != null) {
            _hashCode += getResultHeader().hashCode();
        }
        if (getDeleteSubscriberExtResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeleteSubscriberExtResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeleteSubscriberExtResult(), i);
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
        new org.apache.axis.description.TypeDesc(DeleteSubscriberExtResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">DeleteSubscriberExtResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/common", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteSubscriberExtResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeleteSubscriberExtResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberNo"));
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
