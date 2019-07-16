/**
 * ChangeSubOwnershipRequestNewOwnership.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubOwnershipRequestNewOwnership  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipRegisterCustomer registerCustomer;

    /* It is the actual user customer information if the actual user
     * is not same as register customer */
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipUserCustomer userCustomer;

    /* For prepaid or postpaid subscriber, there is only one corresponding
     * account. 
     * For Hybrid subscriber, there can be one prepaid account and one postpaid
     * account with same billing cycle. */
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipAccount[] account;

    private com.huawei.www.bme.cbsinterface.bccommon.Address[] addressInfo;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriber subscriber;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipPrimaryOffering primaryOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering supplementaryOffering;

    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] controlProperty;

    public ChangeSubOwnershipRequestNewOwnership() {
    }

    public ChangeSubOwnershipRequestNewOwnership(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipRegisterCustomer registerCustomer,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipUserCustomer userCustomer,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipAccount[] account,
           com.huawei.www.bme.cbsinterface.bccommon.Address[] addressInfo,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriber subscriber,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipPrimaryOffering primaryOffering,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering supplementaryOffering,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] controlProperty) {
           this.registerCustomer = registerCustomer;
           this.userCustomer = userCustomer;
           this.account = account;
           this.addressInfo = addressInfo;
           this.subscriber = subscriber;
           this.primaryOffering = primaryOffering;
           this.supplementaryOffering = supplementaryOffering;
           this.controlProperty = controlProperty;
    }


    /**
     * Gets the registerCustomer value for this ChangeSubOwnershipRequestNewOwnership.
     * 
     * @return registerCustomer
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipRegisterCustomer getRegisterCustomer() {
        return registerCustomer;
    }


    /**
     * Sets the registerCustomer value for this ChangeSubOwnershipRequestNewOwnership.
     * 
     * @param registerCustomer
     */
    public void setRegisterCustomer(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipRegisterCustomer registerCustomer) {
        this.registerCustomer = registerCustomer;
    }


    /**
     * Gets the userCustomer value for this ChangeSubOwnershipRequestNewOwnership.
     * 
     * @return userCustomer   * It is the actual user customer information if the actual user
     * is not same as register customer
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipUserCustomer getUserCustomer() {
        return userCustomer;
    }


    /**
     * Sets the userCustomer value for this ChangeSubOwnershipRequestNewOwnership.
     * 
     * @param userCustomer   * It is the actual user customer information if the actual user
     * is not same as register customer
     */
    public void setUserCustomer(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipUserCustomer userCustomer) {
        this.userCustomer = userCustomer;
    }


    /**
     * Gets the account value for this ChangeSubOwnershipRequestNewOwnership.
     * 
     * @return account   * For prepaid or postpaid subscriber, there is only one corresponding
     * account. 
     * For Hybrid subscriber, there can be one prepaid account and one postpaid
     * account with same billing cycle.
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipAccount[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ChangeSubOwnershipRequestNewOwnership.
     * 
     * @param account   * For prepaid or postpaid subscriber, there is only one corresponding
     * account. 
     * For Hybrid subscriber, there can be one prepaid account and one postpaid
     * account with same billing cycle.
     */
    public void setAccount(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipAccount[] account) {
        this.account = account;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipAccount getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipAccount _value) {
        this.account[i] = _value;
    }


    /**
     * Gets the addressInfo value for this ChangeSubOwnershipRequestNewOwnership.
     * 
     * @return addressInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Address[] getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this ChangeSubOwnershipRequestNewOwnership.
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
     * Gets the subscriber value for this ChangeSubOwnershipRequestNewOwnership.
     * 
     * @return subscriber
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriber getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this ChangeSubOwnershipRequestNewOwnership.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriber subscriber) {
        this.subscriber = subscriber;
    }


    /**
     * Gets the primaryOffering value for this ChangeSubOwnershipRequestNewOwnership.
     * 
     * @return primaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipPrimaryOffering getPrimaryOffering() {
        return primaryOffering;
    }


    /**
     * Sets the primaryOffering value for this ChangeSubOwnershipRequestNewOwnership.
     * 
     * @param primaryOffering
     */
    public void setPrimaryOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipPrimaryOffering primaryOffering) {
        this.primaryOffering = primaryOffering;
    }


    /**
     * Gets the supplementaryOffering value for this ChangeSubOwnershipRequestNewOwnership.
     * 
     * @return supplementaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering getSupplementaryOffering() {
        return supplementaryOffering;
    }


    /**
     * Sets the supplementaryOffering value for this ChangeSubOwnershipRequestNewOwnership.
     * 
     * @param supplementaryOffering
     */
    public void setSupplementaryOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSupplementaryOffering supplementaryOffering) {
        this.supplementaryOffering = supplementaryOffering;
    }


    /**
     * Gets the controlProperty value for this ChangeSubOwnershipRequestNewOwnership.
     * 
     * @return controlProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getControlProperty() {
        return controlProperty;
    }


    /**
     * Sets the controlProperty value for this ChangeSubOwnershipRequestNewOwnership.
     * 
     * @param controlProperty
     */
    public void setControlProperty(com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] controlProperty) {
        this.controlProperty = controlProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty getControlProperty(int i) {
        return this.controlProperty[i];
    }

    public void setControlProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty _value) {
        this.controlProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubOwnershipRequestNewOwnership)) return false;
        ChangeSubOwnershipRequestNewOwnership other = (ChangeSubOwnershipRequestNewOwnership) obj;
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
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              java.util.Arrays.equals(this.addressInfo, other.getAddressInfo()))) &&
            ((this.subscriber==null && other.getSubscriber()==null) || 
             (this.subscriber!=null &&
              this.subscriber.equals(other.getSubscriber()))) &&
            ((this.primaryOffering==null && other.getPrimaryOffering()==null) || 
             (this.primaryOffering!=null &&
              this.primaryOffering.equals(other.getPrimaryOffering()))) &&
            ((this.supplementaryOffering==null && other.getSupplementaryOffering()==null) || 
             (this.supplementaryOffering!=null &&
              this.supplementaryOffering.equals(other.getSupplementaryOffering()))) &&
            ((this.controlProperty==null && other.getControlProperty()==null) || 
             (this.controlProperty!=null &&
              java.util.Arrays.equals(this.controlProperty, other.getControlProperty())));
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
        if (getSubscriber() != null) {
            _hashCode += getSubscriber().hashCode();
        }
        if (getPrimaryOffering() != null) {
            _hashCode += getPrimaryOffering().hashCode();
        }
        if (getSupplementaryOffering() != null) {
            _hashCode += getSupplementaryOffering().hashCode();
        }
        if (getControlProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getControlProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getControlProperty(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeSubOwnershipRequestNewOwnership.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubOwnershipRequest>NewOwnership"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RegisterCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOwnershipRequest>NewOwnership>RegisterCustomer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UserCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOwnershipRequest>NewOwnership>UserCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOwnershipRequest>NewOwnership>Account"));
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
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOwnershipRequest>NewOwnership>Subscriber"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrimaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOwnershipRequest>NewOwnership>PrimaryOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplementaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SupplementaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOwnershipRequest>NewOwnership>SupplementaryOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ControlProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SimpleProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
