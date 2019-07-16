/**
 * SubscriberForBatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class SubscriberForBatch  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.SubscriberForBatchSubBasicInfo subBasicInfo;

    private java.lang.String brand;

    private java.lang.String networkType;

    private java.lang.String status;

    private java.lang.String paymentMode;

    private java.lang.String subPassword;

    private java.lang.String activeTimeLimit;

    private java.lang.String primaryIdentityType;

    public SubscriberForBatch() {
    }

    public SubscriberForBatch(
           com.huawei.www.bme.cbsinterface.bccommon.SubscriberForBatchSubBasicInfo subBasicInfo,
           java.lang.String brand,
           java.lang.String networkType,
           java.lang.String status,
           java.lang.String paymentMode,
           java.lang.String subPassword,
           java.lang.String activeTimeLimit,
           java.lang.String primaryIdentityType) {
           this.subBasicInfo = subBasicInfo;
           this.brand = brand;
           this.networkType = networkType;
           this.status = status;
           this.paymentMode = paymentMode;
           this.subPassword = subPassword;
           this.activeTimeLimit = activeTimeLimit;
           this.primaryIdentityType = primaryIdentityType;
    }


    /**
     * Gets the subBasicInfo value for this SubscriberForBatch.
     * 
     * @return subBasicInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubscriberForBatchSubBasicInfo getSubBasicInfo() {
        return subBasicInfo;
    }


    /**
     * Sets the subBasicInfo value for this SubscriberForBatch.
     * 
     * @param subBasicInfo
     */
    public void setSubBasicInfo(com.huawei.www.bme.cbsinterface.bccommon.SubscriberForBatchSubBasicInfo subBasicInfo) {
        this.subBasicInfo = subBasicInfo;
    }


    /**
     * Gets the brand value for this SubscriberForBatch.
     * 
     * @return brand
     */
    public java.lang.String getBrand() {
        return brand;
    }


    /**
     * Sets the brand value for this SubscriberForBatch.
     * 
     * @param brand
     */
    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }


    /**
     * Gets the networkType value for this SubscriberForBatch.
     * 
     * @return networkType
     */
    public java.lang.String getNetworkType() {
        return networkType;
    }


    /**
     * Sets the networkType value for this SubscriberForBatch.
     * 
     * @param networkType
     */
    public void setNetworkType(java.lang.String networkType) {
        this.networkType = networkType;
    }


    /**
     * Gets the status value for this SubscriberForBatch.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SubscriberForBatch.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the paymentMode value for this SubscriberForBatch.
     * 
     * @return paymentMode
     */
    public java.lang.String getPaymentMode() {
        return paymentMode;
    }


    /**
     * Sets the paymentMode value for this SubscriberForBatch.
     * 
     * @param paymentMode
     */
    public void setPaymentMode(java.lang.String paymentMode) {
        this.paymentMode = paymentMode;
    }


    /**
     * Gets the subPassword value for this SubscriberForBatch.
     * 
     * @return subPassword
     */
    public java.lang.String getSubPassword() {
        return subPassword;
    }


    /**
     * Sets the subPassword value for this SubscriberForBatch.
     * 
     * @param subPassword
     */
    public void setSubPassword(java.lang.String subPassword) {
        this.subPassword = subPassword;
    }


    /**
     * Gets the activeTimeLimit value for this SubscriberForBatch.
     * 
     * @return activeTimeLimit
     */
    public java.lang.String getActiveTimeLimit() {
        return activeTimeLimit;
    }


    /**
     * Sets the activeTimeLimit value for this SubscriberForBatch.
     * 
     * @param activeTimeLimit
     */
    public void setActiveTimeLimit(java.lang.String activeTimeLimit) {
        this.activeTimeLimit = activeTimeLimit;
    }


    /**
     * Gets the primaryIdentityType value for this SubscriberForBatch.
     * 
     * @return primaryIdentityType
     */
    public java.lang.String getPrimaryIdentityType() {
        return primaryIdentityType;
    }


    /**
     * Sets the primaryIdentityType value for this SubscriberForBatch.
     * 
     * @param primaryIdentityType
     */
    public void setPrimaryIdentityType(java.lang.String primaryIdentityType) {
        this.primaryIdentityType = primaryIdentityType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberForBatch)) return false;
        SubscriberForBatch other = (SubscriberForBatch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subBasicInfo==null && other.getSubBasicInfo()==null) || 
             (this.subBasicInfo!=null &&
              this.subBasicInfo.equals(other.getSubBasicInfo()))) &&
            ((this.brand==null && other.getBrand()==null) || 
             (this.brand!=null &&
              this.brand.equals(other.getBrand()))) &&
            ((this.networkType==null && other.getNetworkType()==null) || 
             (this.networkType!=null &&
              this.networkType.equals(other.getNetworkType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.paymentMode==null && other.getPaymentMode()==null) || 
             (this.paymentMode!=null &&
              this.paymentMode.equals(other.getPaymentMode()))) &&
            ((this.subPassword==null && other.getSubPassword()==null) || 
             (this.subPassword!=null &&
              this.subPassword.equals(other.getSubPassword()))) &&
            ((this.activeTimeLimit==null && other.getActiveTimeLimit()==null) || 
             (this.activeTimeLimit!=null &&
              this.activeTimeLimit.equals(other.getActiveTimeLimit()))) &&
            ((this.primaryIdentityType==null && other.getPrimaryIdentityType()==null) || 
             (this.primaryIdentityType!=null &&
              this.primaryIdentityType.equals(other.getPrimaryIdentityType())));
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
        if (getSubBasicInfo() != null) {
            _hashCode += getSubBasicInfo().hashCode();
        }
        if (getBrand() != null) {
            _hashCode += getBrand().hashCode();
        }
        if (getNetworkType() != null) {
            _hashCode += getNetworkType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getPaymentMode() != null) {
            _hashCode += getPaymentMode().hashCode();
        }
        if (getSubPassword() != null) {
            _hashCode += getSubPassword().hashCode();
        }
        if (getActiveTimeLimit() != null) {
            _hashCode += getActiveTimeLimit().hashCode();
        }
        if (getPrimaryIdentityType() != null) {
            _hashCode += getPrimaryIdentityType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberForBatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubscriberForBatch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subBasicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubBasicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">SubscriberForBatch>SubBasicInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Brand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "NetworkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PaymentMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeTimeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ActiveTimeLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryIdentityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PrimaryIdentityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
