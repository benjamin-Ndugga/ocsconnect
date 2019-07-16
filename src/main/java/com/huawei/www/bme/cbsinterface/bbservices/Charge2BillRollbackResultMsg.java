/**
 * Charge2BillRollbackResultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class Charge2BillRollbackResultMsg  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader;

    private com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackResult charge2BillRollbackResult;

    public Charge2BillRollbackResultMsg() {
    }

    public Charge2BillRollbackResultMsg(
           com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader,
           com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackResult charge2BillRollbackResult) {
           this.resultHeader = resultHeader;
           this.charge2BillRollbackResult = charge2BillRollbackResult;
    }


    /**
     * Gets the resultHeader value for this Charge2BillRollbackResultMsg.
     * 
     * @return resultHeader
     */
    public com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader getResultHeader() {
        return resultHeader;
    }


    /**
     * Sets the resultHeader value for this Charge2BillRollbackResultMsg.
     * 
     * @param resultHeader
     */
    public void setResultHeader(com.huawei.www.bme.cbsinterface.cbscommon.ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }


    /**
     * Gets the charge2BillRollbackResult value for this Charge2BillRollbackResultMsg.
     * 
     * @return charge2BillRollbackResult
     */
    public com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackResult getCharge2BillRollbackResult() {
        return charge2BillRollbackResult;
    }


    /**
     * Sets the charge2BillRollbackResult value for this Charge2BillRollbackResultMsg.
     * 
     * @param charge2BillRollbackResult
     */
    public void setCharge2BillRollbackResult(com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackResult charge2BillRollbackResult) {
        this.charge2BillRollbackResult = charge2BillRollbackResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Charge2BillRollbackResultMsg)) return false;
        Charge2BillRollbackResultMsg other = (Charge2BillRollbackResultMsg) obj;
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
            ((this.charge2BillRollbackResult==null && other.getCharge2BillRollbackResult()==null) || 
             (this.charge2BillRollbackResult!=null &&
              this.charge2BillRollbackResult.equals(other.getCharge2BillRollbackResult())));
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
        if (getCharge2BillRollbackResult() != null) {
            _hashCode += getCharge2BillRollbackResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Charge2BillRollbackResultMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillRollbackResultMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "ResultHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge2BillRollbackResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Charge2BillRollbackResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Charge2BillRollbackResult"));
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
