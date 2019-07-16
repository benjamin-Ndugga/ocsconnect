/**
 * PenaltyCalculationRequestMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class PenaltyCalculationRequestMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader;

    private com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationRequest penaltyCalculationRequest;

    public PenaltyCalculationRequestMsg() {
    }

    public PenaltyCalculationRequestMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader,
           com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationRequest penaltyCalculationRequest) {
           this.requestHeader = requestHeader;
           this.penaltyCalculationRequest = penaltyCalculationRequest;
    }


    /**
     * Gets the requestHeader value for this PenaltyCalculationRequestMsg.
     * 
     * @return requestHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this PenaltyCalculationRequestMsg.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the penaltyCalculationRequest value for this PenaltyCalculationRequestMsg.
     * 
     * @return penaltyCalculationRequest
     */
    public com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationRequest getPenaltyCalculationRequest() {
        return penaltyCalculationRequest;
    }


    /**
     * Sets the penaltyCalculationRequest value for this PenaltyCalculationRequestMsg.
     * 
     * @param penaltyCalculationRequest
     */
    public void setPenaltyCalculationRequest(com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationRequest penaltyCalculationRequest) {
        this.penaltyCalculationRequest = penaltyCalculationRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PenaltyCalculationRequestMsg)) return false;
        PenaltyCalculationRequestMsg other = (PenaltyCalculationRequestMsg) obj;
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
            ((this.penaltyCalculationRequest==null && other.getPenaltyCalculationRequest()==null) || 
             (this.penaltyCalculationRequest!=null &&
              this.penaltyCalculationRequest.equals(other.getPenaltyCalculationRequest())));
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
        if (getPenaltyCalculationRequest() != null) {
            _hashCode += getPenaltyCalculationRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PenaltyCalculationRequestMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">PenaltyCalculationRequestMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("penaltyCalculationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PenaltyCalculationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PenaltyCalculationRequest"));
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
