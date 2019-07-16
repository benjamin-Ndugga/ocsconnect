/**
 * ChangeConsumptionLimitRequestMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeConsumptionLimitRequestMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequest changeConsumptionLimitRequest;

    public ChangeConsumptionLimitRequestMsg() {
    }

    public ChangeConsumptionLimitRequestMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequest changeConsumptionLimitRequest) {
           this.requestHeader = requestHeader;
           this.changeConsumptionLimitRequest = changeConsumptionLimitRequest;
    }


    /**
     * Gets the requestHeader value for this ChangeConsumptionLimitRequestMsg.
     * 
     * @return requestHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this ChangeConsumptionLimitRequestMsg.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the changeConsumptionLimitRequest value for this ChangeConsumptionLimitRequestMsg.
     * 
     * @return changeConsumptionLimitRequest
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequest getChangeConsumptionLimitRequest() {
        return changeConsumptionLimitRequest;
    }


    /**
     * Sets the changeConsumptionLimitRequest value for this ChangeConsumptionLimitRequestMsg.
     * 
     * @param changeConsumptionLimitRequest
     */
    public void setChangeConsumptionLimitRequest(com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequest changeConsumptionLimitRequest) {
        this.changeConsumptionLimitRequest = changeConsumptionLimitRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeConsumptionLimitRequestMsg)) return false;
        ChangeConsumptionLimitRequestMsg other = (ChangeConsumptionLimitRequestMsg) obj;
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
            ((this.changeConsumptionLimitRequest==null && other.getChangeConsumptionLimitRequest()==null) || 
             (this.changeConsumptionLimitRequest!=null &&
              this.changeConsumptionLimitRequest.equals(other.getChangeConsumptionLimitRequest())));
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
        if (getChangeConsumptionLimitRequest() != null) {
            _hashCode += getChangeConsumptionLimitRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeConsumptionLimitRequestMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeConsumptionLimitRequestMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeConsumptionLimitRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChangeConsumptionLimitRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeConsumptionLimitRequest"));
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
