/**
 * ApplyProdFreeValidityResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ApplyProdFreeValidityResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader;

    private com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityResult applyProdFreeValidityResult;

    public ApplyProdFreeValidityResultMsg() {
    }

    public ApplyProdFreeValidityResultMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader,
           com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityResult applyProdFreeValidityResult) {
           this.resultHeader = resultHeader;
           this.applyProdFreeValidityResult = applyProdFreeValidityResult;
    }


    /**
     * Gets the resultHeader value for this ApplyProdFreeValidityResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this ApplyProdFreeValidityResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the applyProdFreeValidityResult value for this ApplyProdFreeValidityResultMsg.
     * 
     * @return applyProdFreeValidityResult
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityResult getApplyProdFreeValidityResult() {
        return applyProdFreeValidityResult;
    }


    /**
     * Sets the applyProdFreeValidityResult value for this ApplyProdFreeValidityResultMsg.
     * 
     * @param applyProdFreeValidityResult
     */
    public void setApplyProdFreeValidityResult(com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityResult applyProdFreeValidityResult) {
        this.applyProdFreeValidityResult = applyProdFreeValidityResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyProdFreeValidityResultMsg)) return false;
        ApplyProdFreeValidityResultMsg other = (ApplyProdFreeValidityResultMsg) obj;
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
            ((this.applyProdFreeValidityResult==null && other.getApplyProdFreeValidityResult()==null) || 
             (this.applyProdFreeValidityResult!=null &&
              this.applyProdFreeValidityResult.equals(other.getApplyProdFreeValidityResult())));
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
        if (getApplyProdFreeValidityResult() != null) {
            _hashCode += getApplyProdFreeValidityResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplyProdFreeValidityResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyProdFreeValidityResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyProdFreeValidityResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApplyProdFreeValidityResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyProdFreeValidityResult"));
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
