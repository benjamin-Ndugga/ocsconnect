/**
 * ChangeOfferingStatusRequestMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeOfferingStatusRequestMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusRequestOfferingInst[] changeOfferingStatusRequest;

    public ChangeOfferingStatusRequestMsg() {
    }

    public ChangeOfferingStatusRequestMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusRequestOfferingInst[] changeOfferingStatusRequest) {
           this.requestHeader = requestHeader;
           this.changeOfferingStatusRequest = changeOfferingStatusRequest;
    }


    /**
     * Gets the requestHeader value for this ChangeOfferingStatusRequestMsg.
     * 
     * @return requestHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this ChangeOfferingStatusRequestMsg.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the changeOfferingStatusRequest value for this ChangeOfferingStatusRequestMsg.
     * 
     * @return changeOfferingStatusRequest
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusRequestOfferingInst[] getChangeOfferingStatusRequest() {
        return changeOfferingStatusRequest;
    }


    /**
     * Sets the changeOfferingStatusRequest value for this ChangeOfferingStatusRequestMsg.
     * 
     * @param changeOfferingStatusRequest
     */
    public void setChangeOfferingStatusRequest(com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusRequestOfferingInst[] changeOfferingStatusRequest) {
        this.changeOfferingStatusRequest = changeOfferingStatusRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeOfferingStatusRequestMsg)) return false;
        ChangeOfferingStatusRequestMsg other = (ChangeOfferingStatusRequestMsg) obj;
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
            ((this.changeOfferingStatusRequest==null && other.getChangeOfferingStatusRequest()==null) || 
             (this.changeOfferingStatusRequest!=null &&
              java.util.Arrays.equals(this.changeOfferingStatusRequest, other.getChangeOfferingStatusRequest())));
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
        if (getChangeOfferingStatusRequest() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangeOfferingStatusRequest());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangeOfferingStatusRequest(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeOfferingStatusRequestMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingStatusRequestMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeOfferingStatusRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChangeOfferingStatusRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingStatusRequest>OfferingInst"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingInst"));
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
