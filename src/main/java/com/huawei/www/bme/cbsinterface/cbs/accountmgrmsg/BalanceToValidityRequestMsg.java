/**
 * BalanceToValidityRequestMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg;

public class BalanceToValidityRequestMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.common.RequestHeader requestHeader;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.BalanceToValidityRequest balanceToValidityRequest;

    public BalanceToValidityRequestMsg() {
    }

    public BalanceToValidityRequestMsg(
           com.huawei.www.bme.cbsinterface.common.RequestHeader requestHeader,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.BalanceToValidityRequest balanceToValidityRequest) {
           this.requestHeader = requestHeader;
           this.balanceToValidityRequest = balanceToValidityRequest;
    }


    /**
     * Gets the requestHeader value for this BalanceToValidityRequestMsg.
     * 
     * @return requestHeader
     */
    public com.huawei.www.bme.cbsinterface.common.RequestHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this BalanceToValidityRequestMsg.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(com.huawei.www.bme.cbsinterface.common.RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the balanceToValidityRequest value for this BalanceToValidityRequestMsg.
     * 
     * @return balanceToValidityRequest
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.BalanceToValidityRequest getBalanceToValidityRequest() {
        return balanceToValidityRequest;
    }


    /**
     * Sets the balanceToValidityRequest value for this BalanceToValidityRequestMsg.
     * 
     * @param balanceToValidityRequest
     */
    public void setBalanceToValidityRequest(com.huawei.www.bme.cbsinterface.cbs.accountmgr.BalanceToValidityRequest balanceToValidityRequest) {
        this.balanceToValidityRequest = balanceToValidityRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceToValidityRequestMsg)) return false;
        BalanceToValidityRequestMsg other = (BalanceToValidityRequestMsg) obj;
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
            ((this.balanceToValidityRequest==null && other.getBalanceToValidityRequest()==null) || 
             (this.balanceToValidityRequest!=null &&
              this.balanceToValidityRequest.equals(other.getBalanceToValidityRequest())));
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
        if (getBalanceToValidityRequest() != null) {
            _hashCode += getBalanceToValidityRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalanceToValidityRequestMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg", ">BalanceToValidityRequestMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/common", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceToValidityRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BalanceToValidityRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "BalanceToValidityRequest"));
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
