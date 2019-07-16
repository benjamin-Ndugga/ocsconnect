/**
 * CreateAccountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class CreateAccountRequest  implements java.io.Serializable {
    /* The register customer key which this account belongs to. */
    private java.lang.String registerCustKey;

    private com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequestAccount account;

    private com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequestOffering[] offering;

    private com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo;

    public CreateAccountRequest() {
    }

    public CreateAccountRequest(
           java.lang.String registerCustKey,
           com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequestAccount account,
           com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequestOffering[] offering,
           com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo) {
           this.registerCustKey = registerCustKey;
           this.account = account;
           this.offering = offering;
           this.addressInfo = addressInfo;
    }


    /**
     * Gets the registerCustKey value for this CreateAccountRequest.
     * 
     * @return registerCustKey   * The register customer key which this account belongs to.
     */
    public java.lang.String getRegisterCustKey() {
        return registerCustKey;
    }


    /**
     * Sets the registerCustKey value for this CreateAccountRequest.
     * 
     * @param registerCustKey   * The register customer key which this account belongs to.
     */
    public void setRegisterCustKey(java.lang.String registerCustKey) {
        this.registerCustKey = registerCustKey;
    }


    /**
     * Gets the account value for this CreateAccountRequest.
     * 
     * @return account
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequestAccount getAccount() {
        return account;
    }


    /**
     * Sets the account value for this CreateAccountRequest.
     * 
     * @param account
     */
    public void setAccount(com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequestAccount account) {
        this.account = account;
    }


    /**
     * Gets the offering value for this CreateAccountRequest.
     * 
     * @return offering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequestOffering[] getOffering() {
        return offering;
    }


    /**
     * Sets the offering value for this CreateAccountRequest.
     * 
     * @param offering
     */
    public void setOffering(com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequestOffering[] offering) {
        this.offering = offering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequestOffering getOffering(int i) {
        return this.offering[i];
    }

    public void setOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequestOffering _value) {
        this.offering[i] = _value;
    }


    /**
     * Gets the addressInfo value for this CreateAccountRequest.
     * 
     * @return addressInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Address getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this CreateAccountRequest.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo) {
        this.addressInfo = addressInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateAccountRequest)) return false;
        CreateAccountRequest other = (CreateAccountRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registerCustKey==null && other.getRegisterCustKey()==null) || 
             (this.registerCustKey!=null &&
              this.registerCustKey.equals(other.getRegisterCustKey()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.offering==null && other.getOffering()==null) || 
             (this.offering!=null &&
              java.util.Arrays.equals(this.offering, other.getOffering()))) &&
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              this.addressInfo.equals(other.getAddressInfo())));
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
        if (getRegisterCustKey() != null) {
            _hashCode += getRegisterCustKey().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getOffering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOffering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOffering(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddressInfo() != null) {
            _hashCode += getAddressInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateAccountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateAccountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerCustKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RegisterCustKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateAccountRequest>Account"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Offering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateAccountRequest>Offering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Address"));
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
