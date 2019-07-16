/**
 * CheckSubscribersGroupResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class CheckSubscribersGroupResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader;

    private com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResult checkSubscribersGroupResult;

    public CheckSubscribersGroupResultMsg() {
    }

    public CheckSubscribersGroupResultMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader,
           com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResult checkSubscribersGroupResult) {
           this.resultHeader = resultHeader;
           this.checkSubscribersGroupResult = checkSubscribersGroupResult;
    }


    /**
     * Gets the resultHeader value for this CheckSubscribersGroupResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this CheckSubscribersGroupResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the checkSubscribersGroupResult value for this CheckSubscribersGroupResultMsg.
     * 
     * @return checkSubscribersGroupResult
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResult getCheckSubscribersGroupResult() {
        return checkSubscribersGroupResult;
    }


    /**
     * Sets the checkSubscribersGroupResult value for this CheckSubscribersGroupResultMsg.
     * 
     * @param checkSubscribersGroupResult
     */
    public void setCheckSubscribersGroupResult(com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResult checkSubscribersGroupResult) {
        this.checkSubscribersGroupResult = checkSubscribersGroupResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckSubscribersGroupResultMsg)) return false;
        CheckSubscribersGroupResultMsg other = (CheckSubscribersGroupResultMsg) obj;
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
            ((this.checkSubscribersGroupResult==null && other.getCheckSubscribersGroupResult()==null) || 
             (this.checkSubscribersGroupResult!=null &&
              this.checkSubscribersGroupResult.equals(other.getCheckSubscribersGroupResult())));
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
        if (getCheckSubscribersGroupResult() != null) {
            _hashCode += getCheckSubscribersGroupResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckSubscribersGroupResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CheckSubscribersGroupResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkSubscribersGroupResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CheckSubscribersGroupResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CheckSubscribersGroupResult"));
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
