/**
 * ApplyInstallmentExtendResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ApplyInstallmentExtendResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader;

    private com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendResult applyInstallmentExtendResult;

    public ApplyInstallmentExtendResultMsg() {
    }

    public ApplyInstallmentExtendResultMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader,
           com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendResult applyInstallmentExtendResult) {
           this.resultHeader = resultHeader;
           this.applyInstallmentExtendResult = applyInstallmentExtendResult;
    }


    /**
     * Gets the resultHeader value for this ApplyInstallmentExtendResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this ApplyInstallmentExtendResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the applyInstallmentExtendResult value for this ApplyInstallmentExtendResultMsg.
     * 
     * @return applyInstallmentExtendResult
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendResult getApplyInstallmentExtendResult() {
        return applyInstallmentExtendResult;
    }


    /**
     * Sets the applyInstallmentExtendResult value for this ApplyInstallmentExtendResultMsg.
     * 
     * @param applyInstallmentExtendResult
     */
    public void setApplyInstallmentExtendResult(com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendResult applyInstallmentExtendResult) {
        this.applyInstallmentExtendResult = applyInstallmentExtendResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyInstallmentExtendResultMsg)) return false;
        ApplyInstallmentExtendResultMsg other = (ApplyInstallmentExtendResultMsg) obj;
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
            ((this.applyInstallmentExtendResult==null && other.getApplyInstallmentExtendResult()==null) || 
             (this.applyInstallmentExtendResult!=null &&
              this.applyInstallmentExtendResult.equals(other.getApplyInstallmentExtendResult())));
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
        if (getApplyInstallmentExtendResult() != null) {
            _hashCode += getApplyInstallmentExtendResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplyInstallmentExtendResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentExtendResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyInstallmentExtendResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApplyInstallmentExtendResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyInstallmentExtendResult"));
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
