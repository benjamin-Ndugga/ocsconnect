/**
 * ChangeOfferingPropertyRequestMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeOfferingPropertyRequestMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInst[] changeOfferingPropertyRequest;

    public ChangeOfferingPropertyRequestMsg() {
    }

    public ChangeOfferingPropertyRequestMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInst[] changeOfferingPropertyRequest) {
           this.requestHeader = requestHeader;
           this.changeOfferingPropertyRequest = changeOfferingPropertyRequest;
    }


    /**
     * Gets the requestHeader value for this ChangeOfferingPropertyRequestMsg.
     * 
     * @return requestHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this ChangeOfferingPropertyRequestMsg.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(com.huawei.www.bme.cbsinterface.cbscommon.RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the changeOfferingPropertyRequest value for this ChangeOfferingPropertyRequestMsg.
     * 
     * @return changeOfferingPropertyRequest
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInst[] getChangeOfferingPropertyRequest() {
        return changeOfferingPropertyRequest;
    }


    /**
     * Sets the changeOfferingPropertyRequest value for this ChangeOfferingPropertyRequestMsg.
     * 
     * @param changeOfferingPropertyRequest
     */
    public void setChangeOfferingPropertyRequest(com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestOfferingInst[] changeOfferingPropertyRequest) {
        this.changeOfferingPropertyRequest = changeOfferingPropertyRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeOfferingPropertyRequestMsg)) return false;
        ChangeOfferingPropertyRequestMsg other = (ChangeOfferingPropertyRequestMsg) obj;
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
            ((this.changeOfferingPropertyRequest==null && other.getChangeOfferingPropertyRequest()==null) || 
             (this.changeOfferingPropertyRequest!=null &&
              java.util.Arrays.equals(this.changeOfferingPropertyRequest, other.getChangeOfferingPropertyRequest())));
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
        if (getChangeOfferingPropertyRequest() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangeOfferingPropertyRequest());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangeOfferingPropertyRequest(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeOfferingPropertyRequestMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingPropertyRequestMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeOfferingPropertyRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChangeOfferingPropertyRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeOfferingPropertyRequest>OfferingInst"));
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
