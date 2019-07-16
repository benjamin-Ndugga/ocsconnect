/**
 * CreateSubscriberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class CreateSubscriberRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestRegisterCustomer registerCustomer;

    /* It is the actual user customer information if the actual user
     * is not same as register customer */
    private com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestUserCustomer userCustomer;

    /* For prepaid or postpaid subscriber, there is only one corresponding
     * account. 
     * For Hybrid subscriber, there can be one prepaid account and one postpaid
     * account with same billing cycle. */
    private com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestAccount[] account;

    private com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriber subscriber;

    private java.lang.String parentNumber;

    private com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestPrimaryOffering primaryOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSupplementaryOffering[] supplementaryOffering;

    private com.huawei.www.bme.cbsinterface.bccommon.Address[] addressInfo;

    private com.huawei.www.bme.cbsinterface.bccommon.SalesInfo salesInfo;

    public CreateSubscriberRequest() {
    }

    public CreateSubscriberRequest(
           com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestRegisterCustomer registerCustomer,
           com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestUserCustomer userCustomer,
           com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestAccount[] account,
           com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriber subscriber,
           java.lang.String parentNumber,
           com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestPrimaryOffering primaryOffering,
           com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSupplementaryOffering[] supplementaryOffering,
           com.huawei.www.bme.cbsinterface.bccommon.Address[] addressInfo,
           com.huawei.www.bme.cbsinterface.bccommon.SalesInfo salesInfo) {
           this.registerCustomer = registerCustomer;
           this.userCustomer = userCustomer;
           this.account = account;
           this.subscriber = subscriber;
           this.parentNumber = parentNumber;
           this.primaryOffering = primaryOffering;
           this.supplementaryOffering = supplementaryOffering;
           this.addressInfo = addressInfo;
           this.salesInfo = salesInfo;
    }


    /**
     * Gets the registerCustomer value for this CreateSubscriberRequest.
     * 
     * @return registerCustomer
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestRegisterCustomer getRegisterCustomer() {
        return registerCustomer;
    }


    /**
     * Sets the registerCustomer value for this CreateSubscriberRequest.
     * 
     * @param registerCustomer
     */
    public void setRegisterCustomer(com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestRegisterCustomer registerCustomer) {
        this.registerCustomer = registerCustomer;
    }


    /**
     * Gets the userCustomer value for this CreateSubscriberRequest.
     * 
     * @return userCustomer   * It is the actual user customer information if the actual user
     * is not same as register customer
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestUserCustomer getUserCustomer() {
        return userCustomer;
    }


    /**
     * Sets the userCustomer value for this CreateSubscriberRequest.
     * 
     * @param userCustomer   * It is the actual user customer information if the actual user
     * is not same as register customer
     */
    public void setUserCustomer(com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestUserCustomer userCustomer) {
        this.userCustomer = userCustomer;
    }


    /**
     * Gets the account value for this CreateSubscriberRequest.
     * 
     * @return account   * For prepaid or postpaid subscriber, there is only one corresponding
     * account. 
     * For Hybrid subscriber, there can be one prepaid account and one postpaid
     * account with same billing cycle.
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestAccount[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this CreateSubscriberRequest.
     * 
     * @param account   * For prepaid or postpaid subscriber, there is only one corresponding
     * account. 
     * For Hybrid subscriber, there can be one prepaid account and one postpaid
     * account with same billing cycle.
     */
    public void setAccount(com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestAccount[] account) {
        this.account = account;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestAccount getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestAccount _value) {
        this.account[i] = _value;
    }


    /**
     * Gets the subscriber value for this CreateSubscriberRequest.
     * 
     * @return subscriber
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriber getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this CreateSubscriberRequest.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSubscriber subscriber) {
        this.subscriber = subscriber;
    }


    /**
     * Gets the parentNumber value for this CreateSubscriberRequest.
     * 
     * @return parentNumber
     */
    public java.lang.String getParentNumber() {
        return parentNumber;
    }


    /**
     * Sets the parentNumber value for this CreateSubscriberRequest.
     * 
     * @param parentNumber
     */
    public void setParentNumber(java.lang.String parentNumber) {
        this.parentNumber = parentNumber;
    }


    /**
     * Gets the primaryOffering value for this CreateSubscriberRequest.
     * 
     * @return primaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestPrimaryOffering getPrimaryOffering() {
        return primaryOffering;
    }


    /**
     * Sets the primaryOffering value for this CreateSubscriberRequest.
     * 
     * @param primaryOffering
     */
    public void setPrimaryOffering(com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestPrimaryOffering primaryOffering) {
        this.primaryOffering = primaryOffering;
    }


    /**
     * Gets the supplementaryOffering value for this CreateSubscriberRequest.
     * 
     * @return supplementaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSupplementaryOffering[] getSupplementaryOffering() {
        return supplementaryOffering;
    }


    /**
     * Sets the supplementaryOffering value for this CreateSubscriberRequest.
     * 
     * @param supplementaryOffering
     */
    public void setSupplementaryOffering(com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSupplementaryOffering[] supplementaryOffering) {
        this.supplementaryOffering = supplementaryOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSupplementaryOffering getSupplementaryOffering(int i) {
        return this.supplementaryOffering[i];
    }

    public void setSupplementaryOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestSupplementaryOffering _value) {
        this.supplementaryOffering[i] = _value;
    }


    /**
     * Gets the addressInfo value for this CreateSubscriberRequest.
     * 
     * @return addressInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Address[] getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this CreateSubscriberRequest.
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
     * Gets the salesInfo value for this CreateSubscriberRequest.
     * 
     * @return salesInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SalesInfo getSalesInfo() {
        return salesInfo;
    }


    /**
     * Sets the salesInfo value for this CreateSubscriberRequest.
     * 
     * @param salesInfo
     */
    public void setSalesInfo(com.huawei.www.bme.cbsinterface.bccommon.SalesInfo salesInfo) {
        this.salesInfo = salesInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSubscriberRequest)) return false;
        CreateSubscriberRequest other = (CreateSubscriberRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registerCustomer==null && other.getRegisterCustomer()==null) || 
             (this.registerCustomer!=null &&
              this.registerCustomer.equals(other.getRegisterCustomer()))) &&
            ((this.userCustomer==null && other.getUserCustomer()==null) || 
             (this.userCustomer!=null &&
              this.userCustomer.equals(other.getUserCustomer()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              java.util.Arrays.equals(this.account, other.getAccount()))) &&
            ((this.subscriber==null && other.getSubscriber()==null) || 
             (this.subscriber!=null &&
              this.subscriber.equals(other.getSubscriber()))) &&
            ((this.parentNumber==null && other.getParentNumber()==null) || 
             (this.parentNumber!=null &&
              this.parentNumber.equals(other.getParentNumber()))) &&
            ((this.primaryOffering==null && other.getPrimaryOffering()==null) || 
             (this.primaryOffering!=null &&
              this.primaryOffering.equals(other.getPrimaryOffering()))) &&
            ((this.supplementaryOffering==null && other.getSupplementaryOffering()==null) || 
             (this.supplementaryOffering!=null &&
              java.util.Arrays.equals(this.supplementaryOffering, other.getSupplementaryOffering()))) &&
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
        if (getRegisterCustomer() != null) {
            _hashCode += getRegisterCustomer().hashCode();
        }
        if (getUserCustomer() != null) {
            _hashCode += getUserCustomer().hashCode();
        }
        if (getAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriber() != null) {
            _hashCode += getSubscriber().hashCode();
        }
        if (getParentNumber() != null) {
            _hashCode += getParentNumber().hashCode();
        }
        if (getPrimaryOffering() != null) {
            _hashCode += getPrimaryOffering().hashCode();
        }
        if (getSupplementaryOffering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupplementaryOffering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupplementaryOffering(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(CreateSubscriberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateSubscriberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RegisterCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberRequest>RegisterCustomer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UserCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberRequest>UserCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberRequest>Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberRequest>Subscriber"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ParentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrimaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberRequest>PrimaryOffering"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplementaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SupplementaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateSubscriberRequest>SupplementaryOffering"));
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
