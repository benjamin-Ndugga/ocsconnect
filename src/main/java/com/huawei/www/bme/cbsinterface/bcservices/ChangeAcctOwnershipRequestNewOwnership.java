/**
 * ChangeAcctOwnershipRequestNewOwnership.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAcctOwnershipRequestNewOwnership  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipRegisterCustomer registerCustomer;

    /* It is the actual user customer information if the actual user
     * is not same as register customer */
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipUserCustomer userCustomer;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipAccount account;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipSubscriber subscriber;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipPrimaryOffering primaryOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipSupplementaryOffering supplementaryOffering;

    private com.huawei.www.bme.cbsinterface.bccommon.Address[] addressInfo;

    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] controlProperty;

    public ChangeAcctOwnershipRequestNewOwnership() {
    }

    public ChangeAcctOwnershipRequestNewOwnership(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipRegisterCustomer registerCustomer,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipUserCustomer userCustomer,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipAccount account,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipSubscriber subscriber,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipPrimaryOffering primaryOffering,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipSupplementaryOffering supplementaryOffering,
           com.huawei.www.bme.cbsinterface.bccommon.Address[] addressInfo,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] controlProperty) {
           this.registerCustomer = registerCustomer;
           this.userCustomer = userCustomer;
           this.account = account;
           this.subscriber = subscriber;
           this.primaryOffering = primaryOffering;
           this.supplementaryOffering = supplementaryOffering;
           this.addressInfo = addressInfo;
           this.controlProperty = controlProperty;
    }


    /**
     * Gets the registerCustomer value for this ChangeAcctOwnershipRequestNewOwnership.
     * 
     * @return registerCustomer
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipRegisterCustomer getRegisterCustomer() {
        return registerCustomer;
    }


    /**
     * Sets the registerCustomer value for this ChangeAcctOwnershipRequestNewOwnership.
     * 
     * @param registerCustomer
     */
    public void setRegisterCustomer(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipRegisterCustomer registerCustomer) {
        this.registerCustomer = registerCustomer;
    }


    /**
     * Gets the userCustomer value for this ChangeAcctOwnershipRequestNewOwnership.
     * 
     * @return userCustomer   * It is the actual user customer information if the actual user
     * is not same as register customer
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipUserCustomer getUserCustomer() {
        return userCustomer;
    }


    /**
     * Sets the userCustomer value for this ChangeAcctOwnershipRequestNewOwnership.
     * 
     * @param userCustomer   * It is the actual user customer information if the actual user
     * is not same as register customer
     */
    public void setUserCustomer(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipUserCustomer userCustomer) {
        this.userCustomer = userCustomer;
    }


    /**
     * Gets the account value for this ChangeAcctOwnershipRequestNewOwnership.
     * 
     * @return account
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipAccount getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ChangeAcctOwnershipRequestNewOwnership.
     * 
     * @param account
     */
    public void setAccount(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipAccount account) {
        this.account = account;
    }


    /**
     * Gets the subscriber value for this ChangeAcctOwnershipRequestNewOwnership.
     * 
     * @return subscriber
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipSubscriber getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this ChangeAcctOwnershipRequestNewOwnership.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipSubscriber subscriber) {
        this.subscriber = subscriber;
    }


    /**
     * Gets the primaryOffering value for this ChangeAcctOwnershipRequestNewOwnership.
     * 
     * @return primaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipPrimaryOffering getPrimaryOffering() {
        return primaryOffering;
    }


    /**
     * Sets the primaryOffering value for this ChangeAcctOwnershipRequestNewOwnership.
     * 
     * @param primaryOffering
     */
    public void setPrimaryOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipPrimaryOffering primaryOffering) {
        this.primaryOffering = primaryOffering;
    }


    /**
     * Gets the supplementaryOffering value for this ChangeAcctOwnershipRequestNewOwnership.
     * 
     * @return supplementaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipSupplementaryOffering getSupplementaryOffering() {
        return supplementaryOffering;
    }


    /**
     * Sets the supplementaryOffering value for this ChangeAcctOwnershipRequestNewOwnership.
     * 
     * @param supplementaryOffering
     */
    public void setSupplementaryOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipSupplementaryOffering supplementaryOffering) {
        this.supplementaryOffering = supplementaryOffering;
    }


    /**
     * Gets the addressInfo value for this ChangeAcctOwnershipRequestNewOwnership.
     * 
     * @return addressInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Address[] getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this ChangeAcctOwnershipRequestNewOwnership.
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
     * Gets the controlProperty value for this ChangeAcctOwnershipRequestNewOwnership.
     * 
     * @return controlProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getControlProperty() {
        return controlProperty;
    }


    /**
     * Sets the controlProperty value for this ChangeAcctOwnershipRequestNewOwnership.
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
        if (!(obj instanceof ChangeAcctOwnershipRequestNewOwnership)) return false;
        ChangeAcctOwnershipRequestNewOwnership other = (ChangeAcctOwnershipRequestNewOwnership) obj;
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
              this.account.equals(other.getAccount()))) &&
            ((this.subscriber==null && other.getSubscriber()==null) || 
             (this.subscriber!=null &&
              this.subscriber.equals(other.getSubscriber()))) &&
            ((this.primaryOffering==null && other.getPrimaryOffering()==null) || 
             (this.primaryOffering!=null &&
              this.primaryOffering.equals(other.getPrimaryOffering()))) &&
            ((this.supplementaryOffering==null && other.getSupplementaryOffering()==null) || 
             (this.supplementaryOffering!=null &&
              this.supplementaryOffering.equals(other.getSupplementaryOffering()))) &&
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              java.util.Arrays.equals(this.addressInfo, other.getAddressInfo()))) &&
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
            _hashCode += getAccount().hashCode();
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
        new org.apache.axis.description.TypeDesc(ChangeAcctOwnershipRequestNewOwnership.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctOwnershipRequest>NewOwnership"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RegisterCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctOwnershipRequest>NewOwnership>RegisterCustomer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UserCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctOwnershipRequest>NewOwnership>UserCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctOwnershipRequest>NewOwnership>Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctOwnershipRequest>NewOwnership>Subscriber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrimaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctOwnershipRequest>NewOwnership>PrimaryOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplementaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SupplementaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctOwnershipRequest>NewOwnership>SupplementaryOffering"));
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
