/**
 * CreateGroupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class CreateGroupRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestRegisterCustomer registerCustomer;

    /* It is the actual user customer information if the actual user
     * is not same as register customer */
    private com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestUserCustomer userCustomer;

    private com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestAccount account;

    private com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestGroup group;

    private com.huawei.www.bme.cbsinterface.bccommon.POfferingInst primaryOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestSupplementaryOffering[] supplementaryOffering;

    private com.huawei.www.bme.cbsinterface.bccommon.Address[] addressInfo;

    private com.huawei.www.bme.cbsinterface.bccommon.SalesInfo salesInfo;

    public CreateGroupRequest() {
    }

    public CreateGroupRequest(
           com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestRegisterCustomer registerCustomer,
           com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestUserCustomer userCustomer,
           com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestAccount account,
           com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestGroup group,
           com.huawei.www.bme.cbsinterface.bccommon.POfferingInst primaryOffering,
           com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestSupplementaryOffering[] supplementaryOffering,
           com.huawei.www.bme.cbsinterface.bccommon.Address[] addressInfo,
           com.huawei.www.bme.cbsinterface.bccommon.SalesInfo salesInfo) {
           this.registerCustomer = registerCustomer;
           this.userCustomer = userCustomer;
           this.account = account;
           this.group = group;
           this.primaryOffering = primaryOffering;
           this.supplementaryOffering = supplementaryOffering;
           this.addressInfo = addressInfo;
           this.salesInfo = salesInfo;
    }


    /**
     * Gets the registerCustomer value for this CreateGroupRequest.
     * 
     * @return registerCustomer
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestRegisterCustomer getRegisterCustomer() {
        return registerCustomer;
    }


    /**
     * Sets the registerCustomer value for this CreateGroupRequest.
     * 
     * @param registerCustomer
     */
    public void setRegisterCustomer(com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestRegisterCustomer registerCustomer) {
        this.registerCustomer = registerCustomer;
    }


    /**
     * Gets the userCustomer value for this CreateGroupRequest.
     * 
     * @return userCustomer   * It is the actual user customer information if the actual user
     * is not same as register customer
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestUserCustomer getUserCustomer() {
        return userCustomer;
    }


    /**
     * Sets the userCustomer value for this CreateGroupRequest.
     * 
     * @param userCustomer   * It is the actual user customer information if the actual user
     * is not same as register customer
     */
    public void setUserCustomer(com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestUserCustomer userCustomer) {
        this.userCustomer = userCustomer;
    }


    /**
     * Gets the account value for this CreateGroupRequest.
     * 
     * @return account
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestAccount getAccount() {
        return account;
    }


    /**
     * Sets the account value for this CreateGroupRequest.
     * 
     * @param account
     */
    public void setAccount(com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestAccount account) {
        this.account = account;
    }


    /**
     * Gets the group value for this CreateGroupRequest.
     * 
     * @return group
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestGroup getGroup() {
        return group;
    }


    /**
     * Sets the group value for this CreateGroupRequest.
     * 
     * @param group
     */
    public void setGroup(com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestGroup group) {
        this.group = group;
    }


    /**
     * Gets the primaryOffering value for this CreateGroupRequest.
     * 
     * @return primaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bccommon.POfferingInst getPrimaryOffering() {
        return primaryOffering;
    }


    /**
     * Sets the primaryOffering value for this CreateGroupRequest.
     * 
     * @param primaryOffering
     */
    public void setPrimaryOffering(com.huawei.www.bme.cbsinterface.bccommon.POfferingInst primaryOffering) {
        this.primaryOffering = primaryOffering;
    }


    /**
     * Gets the supplementaryOffering value for this CreateGroupRequest.
     * 
     * @return supplementaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestSupplementaryOffering[] getSupplementaryOffering() {
        return supplementaryOffering;
    }


    /**
     * Sets the supplementaryOffering value for this CreateGroupRequest.
     * 
     * @param supplementaryOffering
     */
    public void setSupplementaryOffering(com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestSupplementaryOffering[] supplementaryOffering) {
        this.supplementaryOffering = supplementaryOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestSupplementaryOffering getSupplementaryOffering(int i) {
        return this.supplementaryOffering[i];
    }

    public void setSupplementaryOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestSupplementaryOffering _value) {
        this.supplementaryOffering[i] = _value;
    }


    /**
     * Gets the addressInfo value for this CreateGroupRequest.
     * 
     * @return addressInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Address[] getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this CreateGroupRequest.
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
     * Gets the salesInfo value for this CreateGroupRequest.
     * 
     * @return salesInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SalesInfo getSalesInfo() {
        return salesInfo;
    }


    /**
     * Sets the salesInfo value for this CreateGroupRequest.
     * 
     * @param salesInfo
     */
    public void setSalesInfo(com.huawei.www.bme.cbsinterface.bccommon.SalesInfo salesInfo) {
        this.salesInfo = salesInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateGroupRequest)) return false;
        CreateGroupRequest other = (CreateGroupRequest) obj;
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
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
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
            _hashCode += getAccount().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
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
        new org.apache.axis.description.TypeDesc(CreateGroupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreateGroupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RegisterCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateGroupRequest>RegisterCustomer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UserCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateGroupRequest>UserCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateGroupRequest>Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateGroupRequest>Group"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrimaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "POfferingInst"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplementaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SupplementaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">CreateGroupRequest>SupplementaryOffering"));
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
