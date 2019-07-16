/**
 * SupplementProfileRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class SupplementProfileRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode;

    private com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestNewOwnership newOwnership;

    private com.huawei.www.bme.cbsinterface.bccommon.SubBasicInfo subBasicInfo;

    private com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestRegisterCustomer registerCustomer;

    private com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestUserCustomer userCustomer;

    private com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccount[] account;

    private com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAddressInfo[] addressInfo;

    public SupplementProfileRequest() {
    }

    public SupplementProfileRequest(
           com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode,
           com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestNewOwnership newOwnership,
           com.huawei.www.bme.cbsinterface.bccommon.SubBasicInfo subBasicInfo,
           com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestRegisterCustomer registerCustomer,
           com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestUserCustomer userCustomer,
           com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccount[] account,
           com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAddressInfo[] addressInfo) {
           this.subAccessCode = subAccessCode;
           this.newOwnership = newOwnership;
           this.subBasicInfo = subBasicInfo;
           this.registerCustomer = registerCustomer;
           this.userCustomer = userCustomer;
           this.account = account;
           this.addressInfo = addressInfo;
    }


    /**
     * Gets the subAccessCode value for this SupplementProfileRequest.
     * 
     * @return subAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }


    /**
     * Sets the subAccessCode value for this SupplementProfileRequest.
     * 
     * @param subAccessCode
     */
    public void setSubAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }


    /**
     * Gets the newOwnership value for this SupplementProfileRequest.
     * 
     * @return newOwnership
     */
    public com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestNewOwnership getNewOwnership() {
        return newOwnership;
    }


    /**
     * Sets the newOwnership value for this SupplementProfileRequest.
     * 
     * @param newOwnership
     */
    public void setNewOwnership(com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestNewOwnership newOwnership) {
        this.newOwnership = newOwnership;
    }


    /**
     * Gets the subBasicInfo value for this SupplementProfileRequest.
     * 
     * @return subBasicInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubBasicInfo getSubBasicInfo() {
        return subBasicInfo;
    }


    /**
     * Sets the subBasicInfo value for this SupplementProfileRequest.
     * 
     * @param subBasicInfo
     */
    public void setSubBasicInfo(com.huawei.www.bme.cbsinterface.bccommon.SubBasicInfo subBasicInfo) {
        this.subBasicInfo = subBasicInfo;
    }


    /**
     * Gets the registerCustomer value for this SupplementProfileRequest.
     * 
     * @return registerCustomer
     */
    public com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestRegisterCustomer getRegisterCustomer() {
        return registerCustomer;
    }


    /**
     * Sets the registerCustomer value for this SupplementProfileRequest.
     * 
     * @param registerCustomer
     */
    public void setRegisterCustomer(com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestRegisterCustomer registerCustomer) {
        this.registerCustomer = registerCustomer;
    }


    /**
     * Gets the userCustomer value for this SupplementProfileRequest.
     * 
     * @return userCustomer
     */
    public com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestUserCustomer getUserCustomer() {
        return userCustomer;
    }


    /**
     * Sets the userCustomer value for this SupplementProfileRequest.
     * 
     * @param userCustomer
     */
    public void setUserCustomer(com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestUserCustomer userCustomer) {
        this.userCustomer = userCustomer;
    }


    /**
     * Gets the account value for this SupplementProfileRequest.
     * 
     * @return account
     */
    public com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccount[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this SupplementProfileRequest.
     * 
     * @param account
     */
    public void setAccount(com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccount[] account) {
        this.account = account;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccount getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAccount _value) {
        this.account[i] = _value;
    }


    /**
     * Gets the addressInfo value for this SupplementProfileRequest.
     * 
     * @return addressInfo
     */
    public com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAddressInfo[] getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this SupplementProfileRequest.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAddressInfo[] addressInfo) {
        this.addressInfo = addressInfo;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAddressInfo getAddressInfo(int i) {
        return this.addressInfo[i];
    }

    public void setAddressInfo(int i, com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestAddressInfo _value) {
        this.addressInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupplementProfileRequest)) return false;
        SupplementProfileRequest other = (SupplementProfileRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subAccessCode==null && other.getSubAccessCode()==null) || 
             (this.subAccessCode!=null &&
              this.subAccessCode.equals(other.getSubAccessCode()))) &&
            ((this.newOwnership==null && other.getNewOwnership()==null) || 
             (this.newOwnership!=null &&
              this.newOwnership.equals(other.getNewOwnership()))) &&
            ((this.subBasicInfo==null && other.getSubBasicInfo()==null) || 
             (this.subBasicInfo!=null &&
              this.subBasicInfo.equals(other.getSubBasicInfo()))) &&
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
              java.util.Arrays.equals(this.addressInfo, other.getAddressInfo())));
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
        if (getSubAccessCode() != null) {
            _hashCode += getSubAccessCode().hashCode();
        }
        if (getNewOwnership() != null) {
            _hashCode += getNewOwnership().hashCode();
        }
        if (getSubBasicInfo() != null) {
            _hashCode += getSubBasicInfo().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupplementProfileRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SupplementProfileRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newOwnership");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewOwnership"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileRequest>NewOwnership"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subBasicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubBasicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubBasicInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RegisterCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileRequest>RegisterCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UserCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileRequest>UserCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileRequest>Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileRequest>AddressInfo"));
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
