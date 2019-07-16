/**
 * Charge2BillRollbackRequestMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class Charge2BillRollbackRequestMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader;

    private com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequest charge2BillRollbackRequest;

    public Charge2BillRollbackRequestMsg() {
    }

    public Charge2BillRollbackRequestMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader,
           com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequest charge2BillRollbackRequest) {
           this.requestHeader = requestHeader;
           this.charge2BillRollbackRequest = charge2BillRollbackRequest;
    }


    /**
     * Gets the requestHeader value for this Charge2BillRollbackRequestMsg.
     * 
     * @return requestHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this Charge2BillRollbackRequestMsg.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the charge2BillRollbackRequest value for this Charge2BillRollbackRequestMsg.
     * 
     * @return charge2BillRollbackRequest
     */
    public com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequest getCharge2BillRollbackRequest() {
        return charge2BillRollbackRequest;
    }


    /**
     * Sets the charge2BillRollbackRequest value for this Charge2BillRollbackRequestMsg.
     * 
     * @param charge2BillRollbackRequest
     */
    public void setCharge2BillRollbackRequest(com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequest charge2BillRollbackRequest) {
        this.charge2BillRollbackRequest = charge2BillRollbackRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Charge2BillRollbackRequestMsg)) return false;
        Charge2BillRollbackRequestMsg other = (Charge2BillRollbackRequestMsg) obj;
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
            ((this.charge2BillRollbackRequest==null && other.getCharge2BillRollbackRequest()==null) || 
             (this.charge2BillRollbackRequest!=null &&
              this.charge2BillRollbackRequest.equals(other.getCharge2BillRollbackRequest())));
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
        if (getCharge2BillRollbackRequest() != null) {
            _hashCode += getCharge2BillRollbackRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Charge2BillRollbackRequestMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillRollbackRequestMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge2BillRollbackRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Charge2BillRollbackRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Charge2BillRollbackRequest"));
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
