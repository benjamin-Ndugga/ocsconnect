/**
 * ChangeCustBasicInforRequestMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg;

public class ChangeCustBasicInforRequestMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.common.RequestHeader requestHeader;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeCustBasicInforRequest changeCustBasicInforRequest;

    public ChangeCustBasicInforRequestMsg() {
    }

    public ChangeCustBasicInforRequestMsg(
           com.huawei.www.bme.cbsinterface.common.RequestHeader requestHeader,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeCustBasicInforRequest changeCustBasicInforRequest) {
           this.requestHeader = requestHeader;
           this.changeCustBasicInforRequest = changeCustBasicInforRequest;
    }


    /**
     * Gets the requestHeader value for this ChangeCustBasicInforRequestMsg.
     * 
     * @return requestHeader
     */
    public com.huawei.www.bme.cbsinterface.common.RequestHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this ChangeCustBasicInforRequestMsg.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(com.huawei.www.bme.cbsinterface.common.RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the changeCustBasicInforRequest value for this ChangeCustBasicInforRequestMsg.
     * 
     * @return changeCustBasicInforRequest
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeCustBasicInforRequest getChangeCustBasicInforRequest() {
        return changeCustBasicInforRequest;
    }


    /**
     * Sets the changeCustBasicInforRequest value for this ChangeCustBasicInforRequestMsg.
     * 
     * @param changeCustBasicInforRequest
     */
    public void setChangeCustBasicInforRequest(com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeCustBasicInforRequest changeCustBasicInforRequest) {
        this.changeCustBasicInforRequest = changeCustBasicInforRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeCustBasicInforRequestMsg)) return false;
        ChangeCustBasicInforRequestMsg other = (ChangeCustBasicInforRequestMsg) obj;
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
            ((this.changeCustBasicInforRequest==null && other.getChangeCustBasicInforRequest()==null) || 
             (this.changeCustBasicInforRequest!=null &&
              this.changeCustBasicInforRequest.equals(other.getChangeCustBasicInforRequest())));
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
        if (getChangeCustBasicInforRequest() != null) {
            _hashCode += getChangeCustBasicInforRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeCustBasicInforRequestMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">ChangeCustBasicInforRequestMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/common", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeCustBasicInforRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChangeCustBasicInforRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeCustBasicInforRequest"));
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
