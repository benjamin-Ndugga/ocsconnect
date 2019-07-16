/**
 * QueryInstallmentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryInstallmentRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentRequestQueryObj queryObj;

    private java.lang.String contractID;

    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    public QueryInstallmentRequest() {
    }

    public QueryInstallmentRequest(
           com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentRequestQueryObj queryObj,
           java.lang.String contractID,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
           this.queryObj = queryObj;
           this.contractID = contractID;
           this.offeringKey = offeringKey;
    }


    /**
     * Gets the queryObj value for this QueryInstallmentRequest.
     * 
     * @return queryObj
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentRequestQueryObj getQueryObj() {
        return queryObj;
    }


    /**
     * Sets the queryObj value for this QueryInstallmentRequest.
     * 
     * @param queryObj
     */
    public void setQueryObj(com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentRequestQueryObj queryObj) {
        this.queryObj = queryObj;
    }


    /**
     * Gets the contractID value for this QueryInstallmentRequest.
     * 
     * @return contractID
     */
    public java.lang.String getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this QueryInstallmentRequest.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.String contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the offeringKey value for this QueryInstallmentRequest.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this QueryInstallmentRequest.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryInstallmentRequest)) return false;
        QueryInstallmentRequest other = (QueryInstallmentRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryObj==null && other.getQueryObj()==null) || 
             (this.queryObj!=null &&
              this.queryObj.equals(other.getQueryObj()))) &&
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.offeringKey==null && other.getOfferingKey()==null) || 
             (this.offeringKey!=null &&
              this.offeringKey.equals(other.getOfferingKey())));
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
        if (getQueryObj() != null) {
            _hashCode += getQueryObj().hashCode();
        }
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getOfferingKey() != null) {
            _hashCode += getOfferingKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryInstallmentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryInstallmentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryInstallmentRequest>QueryObj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setMinOccurs(0);
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
