/**
 * ChangeAcctInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAcctInfoRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctAccessCode acctAccessCode;

    private com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo acctBasicInfo;

    private com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethod acctPayMethod;

    public ChangeAcctInfoRequest() {
    }

    public ChangeAcctInfoRequest(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctAccessCode acctAccessCode,
           com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo acctBasicInfo,
           com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethod acctPayMethod) {
           this.acctAccessCode = acctAccessCode;
           this.acctBasicInfo = acctBasicInfo;
           this.addressInfo = addressInfo;
           this.acctPayMethod = acctPayMethod;
    }


    /**
     * Gets the acctAccessCode value for this ChangeAcctInfoRequest.
     * 
     * @return acctAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctAccessCode getAcctAccessCode() {
        return acctAccessCode;
    }


    /**
     * Sets the acctAccessCode value for this ChangeAcctInfoRequest.
     * 
     * @param acctAccessCode
     */
    public void setAcctAccessCode(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctAccessCode acctAccessCode) {
        this.acctAccessCode = acctAccessCode;
    }


    /**
     * Gets the acctBasicInfo value for this ChangeAcctInfoRequest.
     * 
     * @return acctBasicInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo getAcctBasicInfo() {
        return acctBasicInfo;
    }


    /**
     * Sets the acctBasicInfo value for this ChangeAcctInfoRequest.
     * 
     * @param acctBasicInfo
     */
    public void setAcctBasicInfo(com.huawei.www.bme.cbsinterface.bccommon.AccountBasicInfo acctBasicInfo) {
        this.acctBasicInfo = acctBasicInfo;
    }


    /**
     * Gets the addressInfo value for this ChangeAcctInfoRequest.
     * 
     * @return addressInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Address getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this ChangeAcctInfoRequest.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo) {
        this.addressInfo = addressInfo;
    }


    /**
     * Gets the acctPayMethod value for this ChangeAcctInfoRequest.
     * 
     * @return acctPayMethod
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethod getAcctPayMethod() {
        return acctPayMethod;
    }


    /**
     * Sets the acctPayMethod value for this ChangeAcctInfoRequest.
     * 
     * @param acctPayMethod
     */
    public void setAcctPayMethod(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethod acctPayMethod) {
        this.acctPayMethod = acctPayMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAcctInfoRequest)) return false;
        ChangeAcctInfoRequest other = (ChangeAcctInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctAccessCode==null && other.getAcctAccessCode()==null) || 
             (this.acctAccessCode!=null &&
              this.acctAccessCode.equals(other.getAcctAccessCode()))) &&
            ((this.acctBasicInfo==null && other.getAcctBasicInfo()==null) || 
             (this.acctBasicInfo!=null &&
              this.acctBasicInfo.equals(other.getAcctBasicInfo()))) &&
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              this.addressInfo.equals(other.getAddressInfo()))) &&
            ((this.acctPayMethod==null && other.getAcctPayMethod()==null) || 
             (this.acctPayMethod!=null &&
              this.acctPayMethod.equals(other.getAcctPayMethod())));
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
        if (getAcctAccessCode() != null) {
            _hashCode += getAcctAccessCode().hashCode();
        }
        if (getAcctBasicInfo() != null) {
            _hashCode += getAcctBasicInfo().hashCode();
        }
        if (getAddressInfo() != null) {
            _hashCode += getAddressInfo().hashCode();
        }
        if (getAcctPayMethod() != null) {
            _hashCode += getAcctPayMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeAcctInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctInfoRequest>AcctAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctBasicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctBasicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AccountBasicInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctPayMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctPayMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctInfoRequest>AcctPayMethod"));
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
