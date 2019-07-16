/**
 * ChangeSubPaymentModeRequestPaymentModeChange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubPaymentModeRequestPaymentModeChange  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering primaryOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount subDFTAccount;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelation DFTPayRelation;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeAccount account;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeAddressInfo addressInfo;

    private com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime;

    public ChangeSubPaymentModeRequestPaymentModeChange() {
    }

    public ChangeSubPaymentModeRequestPaymentModeChange(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering primaryOffering,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount subDFTAccount,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelation DFTPayRelation,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeAccount account,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeAddressInfo addressInfo,
           com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
           this.primaryOffering = primaryOffering;
           this.subDFTAccount = subDFTAccount;
           this.DFTPayRelation = DFTPayRelation;
           this.account = account;
           this.addressInfo = addressInfo;
           this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the primaryOffering value for this ChangeSubPaymentModeRequestPaymentModeChange.
     * 
     * @return primaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering getPrimaryOffering() {
        return primaryOffering;
    }


    /**
     * Sets the primaryOffering value for this ChangeSubPaymentModeRequestPaymentModeChange.
     * 
     * @param primaryOffering
     */
    public void setPrimaryOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering primaryOffering) {
        this.primaryOffering = primaryOffering;
    }


    /**
     * Gets the subDFTAccount value for this ChangeSubPaymentModeRequestPaymentModeChange.
     * 
     * @return subDFTAccount
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount getSubDFTAccount() {
        return subDFTAccount;
    }


    /**
     * Sets the subDFTAccount value for this ChangeSubPaymentModeRequestPaymentModeChange.
     * 
     * @param subDFTAccount
     */
    public void setSubDFTAccount(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount subDFTAccount) {
        this.subDFTAccount = subDFTAccount;
    }


    /**
     * Gets the DFTPayRelation value for this ChangeSubPaymentModeRequestPaymentModeChange.
     * 
     * @return DFTPayRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelation getDFTPayRelation() {
        return DFTPayRelation;
    }


    /**
     * Sets the DFTPayRelation value for this ChangeSubPaymentModeRequestPaymentModeChange.
     * 
     * @param DFTPayRelation
     */
    public void setDFTPayRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeDFTPayRelation DFTPayRelation) {
        this.DFTPayRelation = DFTPayRelation;
    }


    /**
     * Gets the account value for this ChangeSubPaymentModeRequestPaymentModeChange.
     * 
     * @return account
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeAccount getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ChangeSubPaymentModeRequestPaymentModeChange.
     * 
     * @param account
     */
    public void setAccount(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeAccount account) {
        this.account = account;
    }


    /**
     * Gets the addressInfo value for this ChangeSubPaymentModeRequestPaymentModeChange.
     * 
     * @return addressInfo
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeAddressInfo getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this ChangeSubPaymentModeRequestPaymentModeChange.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeAddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }


    /**
     * Gets the effectiveTime value for this ChangeSubPaymentModeRequestPaymentModeChange.
     * 
     * @return effectiveTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.EffectMode getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this ChangeSubPaymentModeRequestPaymentModeChange.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubPaymentModeRequestPaymentModeChange)) return false;
        ChangeSubPaymentModeRequestPaymentModeChange other = (ChangeSubPaymentModeRequestPaymentModeChange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.primaryOffering==null && other.getPrimaryOffering()==null) || 
             (this.primaryOffering!=null &&
              this.primaryOffering.equals(other.getPrimaryOffering()))) &&
            ((this.subDFTAccount==null && other.getSubDFTAccount()==null) || 
             (this.subDFTAccount!=null &&
              this.subDFTAccount.equals(other.getSubDFTAccount()))) &&
            ((this.DFTPayRelation==null && other.getDFTPayRelation()==null) || 
             (this.DFTPayRelation!=null &&
              this.DFTPayRelation.equals(other.getDFTPayRelation()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              this.addressInfo.equals(other.getAddressInfo()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime())));
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
        if (getPrimaryOffering() != null) {
            _hashCode += getPrimaryOffering().hashCode();
        }
        if (getSubDFTAccount() != null) {
            _hashCode += getSubDFTAccount().hashCode();
        }
        if (getDFTPayRelation() != null) {
            _hashCode += getDFTPayRelation().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAddressInfo() != null) {
            _hashCode += getAddressInfo().hashCode();
        }
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubPaymentModeRequestPaymentModeChange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPaymentModeRequest>PaymentModeChange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrimaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubPaymentModeRequest>PaymentModeChange>PrimaryOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subDFTAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubDFTAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubPaymentModeRequest>PaymentModeChange>SubDFTAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFTPayRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DFTPayRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubPaymentModeRequest>PaymentModeChange>DFTPayRelation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubPaymentModeRequest>PaymentModeChange>Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubPaymentModeRequest>PaymentModeChange>AddressInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "EffectMode"));
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
