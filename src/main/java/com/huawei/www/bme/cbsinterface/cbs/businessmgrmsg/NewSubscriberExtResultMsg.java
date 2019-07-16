/**
 * NewSubscriberExtResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg;

public class NewSubscriberExtResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtResult newSubscriberExtResult;

    public NewSubscriberExtResultMsg() {
    }

    public NewSubscriberExtResultMsg(
           com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtResult newSubscriberExtResult) {
           this.resultHeader = resultHeader;
           this.newSubscriberExtResult = newSubscriberExtResult;
    }


    /**
     * Gets the resultHeader value for this NewSubscriberExtResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.common.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this NewSubscriberExtResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.common.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the newSubscriberExtResult value for this NewSubscriberExtResultMsg.
     * 
     * @return newSubscriberExtResult
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtResult getNewSubscriberExtResult() {
        return newSubscriberExtResult;
    }


    /**
     * Sets the newSubscriberExtResult value for this NewSubscriberExtResultMsg.
     * 
     * @param newSubscriberExtResult
     */
    public void setNewSubscriberExtResult(com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtResult newSubscriberExtResult) {
        this.newSubscriberExtResult = newSubscriberExtResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewSubscriberExtResultMsg)) return false;
        NewSubscriberExtResultMsg other = (NewSubscriberExtResultMsg) obj;
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
            ((this.newSubscriberExtResult==null && other.getNewSubscriberExtResult()==null) || 
             (this.newSubscriberExtResult!=null &&
              this.newSubscriberExtResult.equals(other.getNewSubscriberExtResult())));
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
        if (getNewSubscriberExtResult() != null) {
            _hashCode += getNewSubscriberExtResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NewSubscriberExtResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg", ">NewSubscriberExtResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/common", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSubscriberExtResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NewSubscriberExtResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewSubscriberExtResult"));
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
