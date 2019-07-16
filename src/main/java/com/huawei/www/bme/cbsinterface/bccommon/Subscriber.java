/**
 * Subscriber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class Subscriber  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.SubBasicInfo subBasicInfo;

    /* It is actual user customer key of subscriber if the actual
     * user is not same as register customer. */
    private java.lang.String userCustomerKey;

    /* It indicates all the subscriber Identities of subscriber. For
     * example: MSISDN and IMSI are identities for GSM subscriber.
     * For each subscriber, there is one and only one primary identity. For
     * example: MSISDN is the primary identity of GSM subscriber. */
    private com.huawei.www.bme.cbsinterface.bccommon.SubIdentity[] subIdentity;

    private java.lang.String brand;

    private java.lang.String subClass;

    private java.lang.String networkType;

    private java.lang.String subPassword;

    private java.lang.String status;

    /* It is the time deadline for IDLE subscriber to active the subscriber. */
    private java.lang.String activeTimeLimit;

    private com.huawei.www.bme.cbsinterface.bccommon.SubscriberConsumptionLimit[] consumptionLimit;

    public Subscriber() {
    }

    public Subscriber(
           com.huawei.www.bme.cbsinterface.bccommon.SubBasicInfo subBasicInfo,
           java.lang.String userCustomerKey,
           com.huawei.www.bme.cbsinterface.bccommon.SubIdentity[] subIdentity,
           java.lang.String brand,
           java.lang.String subClass,
           java.lang.String networkType,
           java.lang.String subPassword,
           java.lang.String status,
           java.lang.String activeTimeLimit,
           com.huawei.www.bme.cbsinterface.bccommon.SubscriberConsumptionLimit[] consumptionLimit) {
           this.subBasicInfo = subBasicInfo;
           this.userCustomerKey = userCustomerKey;
           this.subIdentity = subIdentity;
           this.brand = brand;
           this.subClass = subClass;
           this.networkType = networkType;
           this.subPassword = subPassword;
           this.status = status;
           this.activeTimeLimit = activeTimeLimit;
           this.consumptionLimit = consumptionLimit;
    }


    /**
     * Gets the subBasicInfo value for this Subscriber.
     * 
     * @return subBasicInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubBasicInfo getSubBasicInfo() {
        return subBasicInfo;
    }


    /**
     * Sets the subBasicInfo value for this Subscriber.
     * 
     * @param subBasicInfo
     */
    public void setSubBasicInfo(com.huawei.www.bme.cbsinterface.bccommon.SubBasicInfo subBasicInfo) {
        this.subBasicInfo = subBasicInfo;
    }


    /**
     * Gets the userCustomerKey value for this Subscriber.
     * 
     * @return userCustomerKey   * It is actual user customer key of subscriber if the actual
     * user is not same as register customer.
     */
    public java.lang.String getUserCustomerKey() {
        return userCustomerKey;
    }


    /**
     * Sets the userCustomerKey value for this Subscriber.
     * 
     * @param userCustomerKey   * It is actual user customer key of subscriber if the actual
     * user is not same as register customer.
     */
    public void setUserCustomerKey(java.lang.String userCustomerKey) {
        this.userCustomerKey = userCustomerKey;
    }


    /**
     * Gets the subIdentity value for this Subscriber.
     * 
     * @return subIdentity   * It indicates all the subscriber Identities of subscriber. For
     * example: MSISDN and IMSI are identities for GSM subscriber.
     * For each subscriber, there is one and only one primary identity. For
     * example: MSISDN is the primary identity of GSM subscriber.
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubIdentity[] getSubIdentity() {
        return subIdentity;
    }


    /**
     * Sets the subIdentity value for this Subscriber.
     * 
     * @param subIdentity   * It indicates all the subscriber Identities of subscriber. For
     * example: MSISDN and IMSI are identities for GSM subscriber.
     * For each subscriber, there is one and only one primary identity. For
     * example: MSISDN is the primary identity of GSM subscriber.
     */
    public void setSubIdentity(com.huawei.www.bme.cbsinterface.bccommon.SubIdentity[] subIdentity) {
        this.subIdentity = subIdentity;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SubIdentity getSubIdentity(int i) {
        return this.subIdentity[i];
    }

    public void setSubIdentity(int i, com.huawei.www.bme.cbsinterface.bccommon.SubIdentity _value) {
        this.subIdentity[i] = _value;
    }


    /**
     * Gets the brand value for this Subscriber.
     * 
     * @return brand
     */
    public java.lang.String getBrand() {
        return brand;
    }


    /**
     * Sets the brand value for this Subscriber.
     * 
     * @param brand
     */
    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }


    /**
     * Gets the subClass value for this Subscriber.
     * 
     * @return subClass
     */
    public java.lang.String getSubClass() {
        return subClass;
    }


    /**
     * Sets the subClass value for this Subscriber.
     * 
     * @param subClass
     */
    public void setSubClass(java.lang.String subClass) {
        this.subClass = subClass;
    }


    /**
     * Gets the networkType value for this Subscriber.
     * 
     * @return networkType
     */
    public java.lang.String getNetworkType() {
        return networkType;
    }


    /**
     * Sets the networkType value for this Subscriber.
     * 
     * @param networkType
     */
    public void setNetworkType(java.lang.String networkType) {
        this.networkType = networkType;
    }


    /**
     * Gets the subPassword value for this Subscriber.
     * 
     * @return subPassword
     */
    public java.lang.String getSubPassword() {
        return subPassword;
    }


    /**
     * Sets the subPassword value for this Subscriber.
     * 
     * @param subPassword
     */
    public void setSubPassword(java.lang.String subPassword) {
        this.subPassword = subPassword;
    }


    /**
     * Gets the status value for this Subscriber.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Subscriber.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the activeTimeLimit value for this Subscriber.
     * 
     * @return activeTimeLimit   * It is the time deadline for IDLE subscriber to active the subscriber.
     */
    public java.lang.String getActiveTimeLimit() {
        return activeTimeLimit;
    }


    /**
     * Sets the activeTimeLimit value for this Subscriber.
     * 
     * @param activeTimeLimit   * It is the time deadline for IDLE subscriber to active the subscriber.
     */
    public void setActiveTimeLimit(java.lang.String activeTimeLimit) {
        this.activeTimeLimit = activeTimeLimit;
    }


    /**
     * Gets the consumptionLimit value for this Subscriber.
     * 
     * @return consumptionLimit
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubscriberConsumptionLimit[] getConsumptionLimit() {
        return consumptionLimit;
    }


    /**
     * Sets the consumptionLimit value for this Subscriber.
     * 
     * @param consumptionLimit
     */
    public void setConsumptionLimit(com.huawei.www.bme.cbsinterface.bccommon.SubscriberConsumptionLimit[] consumptionLimit) {
        this.consumptionLimit = consumptionLimit;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SubscriberConsumptionLimit getConsumptionLimit(int i) {
        return this.consumptionLimit[i];
    }

    public void setConsumptionLimit(int i, com.huawei.www.bme.cbsinterface.bccommon.SubscriberConsumptionLimit _value) {
        this.consumptionLimit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subscriber)) return false;
        Subscriber other = (Subscriber) obj;
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
            ((this.userCustomerKey==null && other.getUserCustomerKey()==null) || 
             (this.userCustomerKey!=null &&
              this.userCustomerKey.equals(other.getUserCustomerKey()))) &&
            ((this.subIdentity==null && other.getSubIdentity()==null) || 
             (this.subIdentity!=null &&
              java.util.Arrays.equals(this.subIdentity, other.getSubIdentity()))) &&
            ((this.brand==null && other.getBrand()==null) || 
             (this.brand!=null &&
              this.brand.equals(other.getBrand()))) &&
            ((this.subClass==null && other.getSubClass()==null) || 
             (this.subClass!=null &&
              this.subClass.equals(other.getSubClass()))) &&
            ((this.networkType==null && other.getNetworkType()==null) || 
             (this.networkType!=null &&
              this.networkType.equals(other.getNetworkType()))) &&
            ((this.subPassword==null && other.getSubPassword()==null) || 
             (this.subPassword!=null &&
              this.subPassword.equals(other.getSubPassword()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.activeTimeLimit==null && other.getActiveTimeLimit()==null) || 
             (this.activeTimeLimit!=null &&
              this.activeTimeLimit.equals(other.getActiveTimeLimit()))) &&
            ((this.consumptionLimit==null && other.getConsumptionLimit()==null) || 
             (this.consumptionLimit!=null &&
              java.util.Arrays.equals(this.consumptionLimit, other.getConsumptionLimit())));
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
        if (getUserCustomerKey() != null) {
            _hashCode += getUserCustomerKey().hashCode();
        }
        if (getSubIdentity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubIdentity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubIdentity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBrand() != null) {
            _hashCode += getBrand().hashCode();
        }
        if (getSubClass() != null) {
            _hashCode += getSubClass().hashCode();
        }
        if (getNetworkType() != null) {
            _hashCode += getNetworkType().hashCode();
        }
        if (getSubPassword() != null) {
            _hashCode += getSubPassword().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getActiveTimeLimit() != null) {
            _hashCode += getActiveTimeLimit().hashCode();
        }
        if (getConsumptionLimit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsumptionLimit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConsumptionLimit(), i);
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
        new org.apache.axis.description.TypeDesc(Subscriber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Subscriber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subBasicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubBasicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubBasicInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCustomerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "UserCustomerKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubIdentity"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Brand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubClass"));
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
        elemField.setFieldName("subPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubPassword"));
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
        elemField.setFieldName("activeTimeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ActiveTimeLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumptionLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ConsumptionLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">Subscriber>ConsumptionLimit"));
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
