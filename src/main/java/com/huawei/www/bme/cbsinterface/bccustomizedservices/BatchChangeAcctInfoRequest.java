/**
 * BatchChangeAcctInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccustomizedservices;

public class BatchChangeAcctInfoRequest  implements java.io.Serializable {
    private java.lang.String fileName;

    /* 仅仅支持该节点下的以下两个信息批量修改：
     * 1、AcctBasicInfo -> BillLang
     * 2、AcctBasicInfo -> AcctProperty为C_ACCT_COLLECTION_CENTER */
    private com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo acctBasicInfo;

    public BatchChangeAcctInfoRequest() {
    }

    public BatchChangeAcctInfoRequest(
           java.lang.String fileName,
           com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo acctBasicInfo) {
           this.fileName = fileName;
           this.acctBasicInfo = acctBasicInfo;
    }


    /**
     * Gets the fileName value for this BatchChangeAcctInfoRequest.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BatchChangeAcctInfoRequest.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the acctBasicInfo value for this BatchChangeAcctInfoRequest.
     * 
     * @return acctBasicInfo   * 仅仅支持该节点下的以下两个信息批量修改：
     * 1、AcctBasicInfo -> BillLang
     * 2、AcctBasicInfo -> AcctProperty为C_ACCT_COLLECTION_CENTER
     */
    public com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo getAcctBasicInfo() {
        return acctBasicInfo;
    }


    /**
     * Sets the acctBasicInfo value for this BatchChangeAcctInfoRequest.
     * 
     * @param acctBasicInfo   * 仅仅支持该节点下的以下两个信息批量修改：
     * 1、AcctBasicInfo -> BillLang
     * 2、AcctBasicInfo -> AcctProperty为C_ACCT_COLLECTION_CENTER
     */
    public void setAcctBasicInfo(com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo acctBasicInfo) {
        this.acctBasicInfo = acctBasicInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchChangeAcctInfoRequest)) return false;
        BatchChangeAcctInfoRequest other = (BatchChangeAcctInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.acctBasicInfo==null && other.getAcctBasicInfo()==null) || 
             (this.acctBasicInfo!=null &&
              this.acctBasicInfo.equals(other.getAcctBasicInfo())));
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
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getAcctBasicInfo() != null) {
            _hashCode += getAcctBasicInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchChangeAcctInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeAcctInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctBasicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "AcctBasicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AccountBasicInfo"));
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
