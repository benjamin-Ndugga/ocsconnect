/**
 * ChkPrefixOpResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChkPrefixOpResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader;

    private com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpResultNetworkDetails[] chkPrefixOpResult;

    public ChkPrefixOpResultMsg() {
    }

    public ChkPrefixOpResultMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader,
           com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpResultNetworkDetails[] chkPrefixOpResult) {
           this.resultHeader = resultHeader;
           this.chkPrefixOpResult = chkPrefixOpResult;
    }


    /**
     * Gets the resultHeader value for this ChkPrefixOpResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this ChkPrefixOpResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the chkPrefixOpResult value for this ChkPrefixOpResultMsg.
     * 
     * @return chkPrefixOpResult
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpResultNetworkDetails[] getChkPrefixOpResult() {
        return chkPrefixOpResult;
    }


    /**
     * Sets the chkPrefixOpResult value for this ChkPrefixOpResultMsg.
     * 
     * @param chkPrefixOpResult
     */
    public void setChkPrefixOpResult(com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpResultNetworkDetails[] chkPrefixOpResult) {
        this.chkPrefixOpResult = chkPrefixOpResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChkPrefixOpResultMsg)) return false;
        ChkPrefixOpResultMsg other = (ChkPrefixOpResultMsg) obj;
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
            ((this.chkPrefixOpResult==null && other.getChkPrefixOpResult()==null) || 
             (this.chkPrefixOpResult!=null &&
              java.util.Arrays.equals(this.chkPrefixOpResult, other.getChkPrefixOpResult())));
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
        if (getChkPrefixOpResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChkPrefixOpResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChkPrefixOpResult(), i);
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
        new org.apache.axis.description.TypeDesc(ChkPrefixOpResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChkPrefixOpResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chkPrefixOpResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChkPrefixOpResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChkPrefixOpResult>NetworkDetails"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NetworkDetails"));
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
