/**
 * ChangeSubLowBalPrtRequestMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg;

public class ChangeSubLowBalPrtRequestMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.common.RequestHeader requestHeader;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeSubLowBalPrtRequest changeSubLowBalPrtRequest;

    public ChangeSubLowBalPrtRequestMsg() {
    }

    public ChangeSubLowBalPrtRequestMsg(
           com.huawei.www.bme.cbsinterface.common.RequestHeader requestHeader,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeSubLowBalPrtRequest changeSubLowBalPrtRequest) {
           this.requestHeader = requestHeader;
           this.changeSubLowBalPrtRequest = changeSubLowBalPrtRequest;
    }


    /**
     * Gets the requestHeader value for this ChangeSubLowBalPrtRequestMsg.
     * 
     * @return requestHeader
     */
    public com.huawei.www.bme.cbsinterface.common.RequestHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this ChangeSubLowBalPrtRequestMsg.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(com.huawei.www.bme.cbsinterface.common.RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the changeSubLowBalPrtRequest value for this ChangeSubLowBalPrtRequestMsg.
     * 
     * @return changeSubLowBalPrtRequest
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeSubLowBalPrtRequest getChangeSubLowBalPrtRequest() {
        return changeSubLowBalPrtRequest;
    }


    /**
     * Sets the changeSubLowBalPrtRequest value for this ChangeSubLowBalPrtRequestMsg.
     * 
     * @param changeSubLowBalPrtRequest
     */
    public void setChangeSubLowBalPrtRequest(com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeSubLowBalPrtRequest changeSubLowBalPrtRequest) {
        this.changeSubLowBalPrtRequest = changeSubLowBalPrtRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubLowBalPrtRequestMsg)) return false;
        ChangeSubLowBalPrtRequestMsg other = (ChangeSubLowBalPrtRequestMsg) obj;
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
            ((this.changeSubLowBalPrtRequest==null && other.getChangeSubLowBalPrtRequest()==null) || 
             (this.changeSubLowBalPrtRequest!=null &&
              this.changeSubLowBalPrtRequest.equals(other.getChangeSubLowBalPrtRequest())));
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
        if (getChangeSubLowBalPrtRequest() != null) {
            _hashCode += getChangeSubLowBalPrtRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubLowBalPrtRequestMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeSubLowBalPrtRequestMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/common", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeSubLowBalPrtRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChangeSubLowBalPrtRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeSubLowBalPrtRequest"));
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
