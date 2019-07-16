/**
 * CreateCustomerRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;


/**
 * This interface is used to create a node of customer hierarchy,
 * including Root Register Customer and User Customer (Org Unit or Person).
 */
public class CreateCustomerRequest  implements java.io.Serializable {
    /* The customer key of register customer from request system. */
    private java.lang.String registerCustKey;

    private com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerRequestCustomer customer;

    private com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerRequestDFTAccount DFTAccount;

    private com.huawei.www.bme.cbsinterface.bccommon.Address[] addressInfo;

    /* It is the salesman information who create the register customer. */
    private com.huawei.www.bme.cbsinterface.bccommon.SalesInfo salesInfo;

    public CreateCustomerRequest() {
    }

    public CreateCustomerRequest(
           java.lang.String registerCustKey,
           com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerRequestCustomer customer,
           com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerRequestDFTAccount DFTAccount,
           com.huawei.www.bme.cbsinterface.bccommon.Address[] addressInfo,
           com.huawei.www.bme.cbsinterface.bccommon.SalesInfo salesInfo) {
           this.registerCustKey = registerCustKey;
           this.customer = customer;
           this.DFTAccount = DFTAccount;
           this.addressInfo = addressInfo;
           this.salesInfo = salesInfo;
    }


    /**
     * Gets the registerCustKey value for this CreateCustomerRequest.
     * 
     * @return registerCustKey   * The customer key of register customer from request system.
     */
    public java.lang.String getRegisterCustKey() {
        return registerCustKey;
    }


    /**
     * Sets the registerCustKey value for this CreateCustomerRequest.
     * 
     * @param registerCustKey   * The customer key of register customer from request system.
     */
    public void setRegisterCustKey(java.lang.String registerCustKey) {
        this.registerCustKey = registerCustKey;
    }


    /**
     * Gets the customer value for this CreateCustomerRequest.
     * 
     * @return customer
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerRequestCustomer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this CreateCustomerRequest.
     * 
     * @param customer
     */
    public void setCustomer(com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerRequestCustomer customer) {
        this.customer = customer;
    }


    /**
     * Gets the DFTAccount value for this CreateCustomerRequest.
     * 
     * @return DFTAccount
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerRequestDFTAccount getDFTAccount() {
        return DFTAccount;
    }


    /**
     * Sets the DFTAccount value for this CreateCustomerRequest.
     * 
     * @param DFTAccount
     */
    public void setDFTAccount(com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerRequestDFTAccount DFTAccount) {
        this.DFTAccount = DFTAccount;
    }


    /**
     * Gets the addressInfo value for this CreateCustomerRequest.
     * 
     * @return addressInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Address[] getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this CreateCustomerRequest.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(com.huawei.www.bme.cbsinterface.bccommon.Address[] addressInfo) {
        this.addressInfo = addressInfo;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.Address getAddressInfo(int i) {
        return this.addressInfo[i];
    }

    public void setAddressInfo(int i, com.huawei.www.bme.cbsinterface.bccommon.Address _value) {
        this.addressInfo[i] = _value;
    }


    /**
     * Gets the salesInfo value for this CreateCustomerRequest.
     * 
     * @return salesInfo   * It is the salesman information who create the register customer.
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SalesInfo getSalesInfo() {
        return salesInfo;
    }


    /**
     * Sets the salesInfo value for this CreateCustomerRequest.
     * 
     * @param salesInfo   * It is the salesman information who create the register customer.
     */
    public void setSalesInfo(com.huawei.www.bme.cbsinterface.bccommon.SalesInfo salesInfo) {
        this.salesInfo = salesInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateCustomerRequest)) return false;
        CreateCustomerRequest other = (CreateCustomerRequest) obj;
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
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.DFTAccount==null && other.getDFTAccount()==null) || 
             (this.DFTAccount!=null &&
              this.DFTAccount.equals(other.getDFTAccount()))) &&
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              java.util.Arrays.equals(this.addressInfo, other.getAddressInfo()))) &&
            ((this.salesInfo==null && other.getSalesInfo()==null) || 
             (this.salesInfo!=null &&
              this.salesInfo.equals(other.getSalesInfo())));
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
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getDFTAccount() != null) {
            _hashCode += getDFTAccount().hashCode();
        }
        if (getAddressInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesInfo() != null) {
            _hashCode += getSalesInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCustomerRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateCustomerRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerCustKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RegisterCustKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateCustomerRequest>Customer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFTAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DFTAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateCustomerRequest>DFTAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SalesInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SalesInfo"));
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
