/**
 * QueryCustomerInfoResultSubscriberSubscriberInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryCustomerInfoResultSubscriberSubscriberInfo  extends com.huawei.www.bme.cbsinterface.bccommon.Subscriber  implements java.io.Serializable {
    private java.lang.String statusDetail;

    private java.lang.String activationTime;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSubscriberInfoUserCustomer userCustomer;

    private com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo;

    public QueryCustomerInfoResultSubscriberSubscriberInfo() {
    }

    public QueryCustomerInfoResultSubscriberSubscriberInfo(
           com.huawei.www.bme.cbsinterface.bccommon.SubBasicInfo subBasicInfo,
           java.lang.String userCustomerKey,
           com.huawei.www.bme.cbsinterface.bccommon.SubIdentity[] subIdentity,
           java.lang.String brand,
           java.lang.String subClass,
           java.lang.String networkType,
           java.lang.String subPassword,
           java.lang.String status,
           java.lang.String activeTimeLimit,
           com.huawei.www.bme.cbsinterface.bccommon.SubscriberConsumptionLimit[] consumptionLimit,
           java.lang.String statusDetail,
           java.lang.String activationTime,
           com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSubscriberInfoUserCustomer userCustomer,
           com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo) {
        super(
            subBasicInfo,
            userCustomerKey,
            subIdentity,
            brand,
            subClass,
            networkType,
            subPassword,
            status,
            activeTimeLimit,
            consumptionLimit);
        this.statusDetail = statusDetail;
        this.activationTime = activationTime;
        this.userCustomer = userCustomer;
        this.addressInfo = addressInfo;
    }


    /**
     * Gets the statusDetail value for this QueryCustomerInfoResultSubscriberSubscriberInfo.
     * 
     * @return statusDetail
     */
    public java.lang.String getStatusDetail() {
        return statusDetail;
    }


    /**
     * Sets the statusDetail value for this QueryCustomerInfoResultSubscriberSubscriberInfo.
     * 
     * @param statusDetail
     */
    public void setStatusDetail(java.lang.String statusDetail) {
        this.statusDetail = statusDetail;
    }


    /**
     * Gets the activationTime value for this QueryCustomerInfoResultSubscriberSubscriberInfo.
     * 
     * @return activationTime
     */
    public java.lang.String getActivationTime() {
        return activationTime;
    }


    /**
     * Sets the activationTime value for this QueryCustomerInfoResultSubscriberSubscriberInfo.
     * 
     * @param activationTime
     */
    public void setActivationTime(java.lang.String activationTime) {
        this.activationTime = activationTime;
    }


    /**
     * Gets the userCustomer value for this QueryCustomerInfoResultSubscriberSubscriberInfo.
     * 
     * @return userCustomer
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSubscriberInfoUserCustomer getUserCustomer() {
        return userCustomer;
    }


    /**
     * Sets the userCustomer value for this QueryCustomerInfoResultSubscriberSubscriberInfo.
     * 
     * @param userCustomer
     */
    public void setUserCustomer(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriberSubscriberInfoUserCustomer userCustomer) {
        this.userCustomer = userCustomer;
    }


    /**
     * Gets the addressInfo value for this QueryCustomerInfoResultSubscriberSubscriberInfo.
     * 
     * @return addressInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Address getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this QueryCustomerInfoResultSubscriberSubscriberInfo.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo) {
        this.addressInfo = addressInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCustomerInfoResultSubscriberSubscriberInfo)) return false;
        QueryCustomerInfoResultSubscriberSubscriberInfo other = (QueryCustomerInfoResultSubscriberSubscriberInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.statusDetail==null && other.getStatusDetail()==null) || 
             (this.statusDetail!=null &&
              this.statusDetail.equals(other.getStatusDetail()))) &&
            ((this.activationTime==null && other.getActivationTime()==null) || 
             (this.activationTime!=null &&
              this.activationTime.equals(other.getActivationTime()))) &&
            ((this.userCustomer==null && other.getUserCustomer()==null) || 
             (this.userCustomer!=null &&
              this.userCustomer.equals(other.getUserCustomer()))) &&
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
        int _hashCode = super.hashCode();
        if (getStatusDetail() != null) {
            _hashCode += getStatusDetail().hashCode();
        }
        if (getActivationTime() != null) {
            _hashCode += getActivationTime().hashCode();
        }
        if (getUserCustomer() != null) {
            _hashCode += getUserCustomer().hashCode();
        }
        if (getAddressInfo() != null) {
            _hashCode += getAddressInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCustomerInfoResultSubscriberSubscriberInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>Subscriber>SubscriberInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "StatusDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ActivationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UserCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>QueryCustomerInfoResult>Subscriber>SubscriberInfo>UserCustomer"));
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
