/**
 * QuerySubInfoExToCubeResultSubscriber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QuerySubInfoExToCubeResultSubscriber  implements java.io.Serializable {
    /* This type is used to identify the subscriber's primary service
     * number. E.g. MSISDN.
     * The number format depend on the solution, normally it is:
     * 1) National number
     * 2) Country code+national number */
    private java.lang.String serviceNum;

    /* Payment type of an account. 
     * 0:Prepaid. 
     * 1:Postpaid. */
    private java.lang.String paymentType;

    /* Subscriber’s main account balance, unit is AZN, e.g 12.34 */
    private long balanceAmount;

    private java.lang.String primaryOfferName;

    private java.math.BigInteger primaryOfferKey;

    /* Subscriber status：
     * 1:Idle  
     * 2:Active  
     * 3:Baring (B1W)  
     * 4:Suspended (B2W)  
     * 5:Pre-deactivate  
     * 9:Deactive. */
    private java.lang.String lifeCycleStatus;

    /* Subscriber management status：
     * 1: claim missing
     * 2: blocked the subscriber by bank */
    private java.lang.String managementSatus;

    /* BlacklistStatu：
     * 0: Recharge Blacklist
     * 2:Active */
    private java.lang.String blacklistStatus;

    private com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultSubscriberAdditionalProperty[] additionalProperty;

    private com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage paymentLimitUsage;

    public QuerySubInfoExToCubeResultSubscriber() {
    }

    public QuerySubInfoExToCubeResultSubscriber(
           java.lang.String serviceNum,
           java.lang.String paymentType,
           long balanceAmount,
           java.lang.String primaryOfferName,
           java.math.BigInteger primaryOfferKey,
           java.lang.String lifeCycleStatus,
           java.lang.String managementSatus,
           java.lang.String blacklistStatus,
           com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultSubscriberAdditionalProperty[] additionalProperty,
           com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage paymentLimitUsage) {
           this.serviceNum = serviceNum;
           this.paymentType = paymentType;
           this.balanceAmount = balanceAmount;
           this.primaryOfferName = primaryOfferName;
           this.primaryOfferKey = primaryOfferKey;
           this.lifeCycleStatus = lifeCycleStatus;
           this.managementSatus = managementSatus;
           this.blacklistStatus = blacklistStatus;
           this.additionalProperty = additionalProperty;
           this.paymentLimitUsage = paymentLimitUsage;
    }


    /**
     * Gets the serviceNum value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @return serviceNum   * This type is used to identify the subscriber's primary service
     * number. E.g. MSISDN.
     * The number format depend on the solution, normally it is:
     * 1) National number
     * 2) Country code+national number
     */
    public java.lang.String getServiceNum() {
        return serviceNum;
    }


    /**
     * Sets the serviceNum value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @param serviceNum   * This type is used to identify the subscriber's primary service
     * number. E.g. MSISDN.
     * The number format depend on the solution, normally it is:
     * 1) National number
     * 2) Country code+national number
     */
    public void setServiceNum(java.lang.String serviceNum) {
        this.serviceNum = serviceNum;
    }


    /**
     * Gets the paymentType value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @return paymentType   * Payment type of an account. 
     * 0:Prepaid. 
     * 1:Postpaid.
     */
    public java.lang.String getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @param paymentType   * Payment type of an account. 
     * 0:Prepaid. 
     * 1:Postpaid.
     */
    public void setPaymentType(java.lang.String paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the balanceAmount value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @return balanceAmount   * Subscriber’s main account balance, unit is AZN, e.g 12.34
     */
    public long getBalanceAmount() {
        return balanceAmount;
    }


    /**
     * Sets the balanceAmount value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @param balanceAmount   * Subscriber’s main account balance, unit is AZN, e.g 12.34
     */
    public void setBalanceAmount(long balanceAmount) {
        this.balanceAmount = balanceAmount;
    }


    /**
     * Gets the primaryOfferName value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @return primaryOfferName
     */
    public java.lang.String getPrimaryOfferName() {
        return primaryOfferName;
    }


    /**
     * Sets the primaryOfferName value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @param primaryOfferName
     */
    public void setPrimaryOfferName(java.lang.String primaryOfferName) {
        this.primaryOfferName = primaryOfferName;
    }


    /**
     * Gets the primaryOfferKey value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @return primaryOfferKey
     */
    public java.math.BigInteger getPrimaryOfferKey() {
        return primaryOfferKey;
    }


    /**
     * Sets the primaryOfferKey value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @param primaryOfferKey
     */
    public void setPrimaryOfferKey(java.math.BigInteger primaryOfferKey) {
        this.primaryOfferKey = primaryOfferKey;
    }


    /**
     * Gets the lifeCycleStatus value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @return lifeCycleStatus   * Subscriber status：
     * 1:Idle  
     * 2:Active  
     * 3:Baring (B1W)  
     * 4:Suspended (B2W)  
     * 5:Pre-deactivate  
     * 9:Deactive.
     */
    public java.lang.String getLifeCycleStatus() {
        return lifeCycleStatus;
    }


    /**
     * Sets the lifeCycleStatus value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @param lifeCycleStatus   * Subscriber status：
     * 1:Idle  
     * 2:Active  
     * 3:Baring (B1W)  
     * 4:Suspended (B2W)  
     * 5:Pre-deactivate  
     * 9:Deactive.
     */
    public void setLifeCycleStatus(java.lang.String lifeCycleStatus) {
        this.lifeCycleStatus = lifeCycleStatus;
    }


    /**
     * Gets the managementSatus value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @return managementSatus   * Subscriber management status：
     * 1: claim missing
     * 2: blocked the subscriber by bank
     */
    public java.lang.String getManagementSatus() {
        return managementSatus;
    }


    /**
     * Sets the managementSatus value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @param managementSatus   * Subscriber management status：
     * 1: claim missing
     * 2: blocked the subscriber by bank
     */
    public void setManagementSatus(java.lang.String managementSatus) {
        this.managementSatus = managementSatus;
    }


    /**
     * Gets the blacklistStatus value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @return blacklistStatus   * BlacklistStatu：
     * 0: Recharge Blacklist
     * 2:Active
     */
    public java.lang.String getBlacklistStatus() {
        return blacklistStatus;
    }


    /**
     * Sets the blacklistStatus value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @param blacklistStatus   * BlacklistStatu：
     * 0: Recharge Blacklist
     * 2:Active
     */
    public void setBlacklistStatus(java.lang.String blacklistStatus) {
        this.blacklistStatus = blacklistStatus;
    }


    /**
     * Gets the additionalProperty value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @return additionalProperty
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultSubscriberAdditionalProperty[] getAdditionalProperty() {
        return additionalProperty;
    }


    /**
     * Sets the additionalProperty value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @param additionalProperty
     */
    public void setAdditionalProperty(com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultSubscriberAdditionalProperty[] additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultSubscriberAdditionalProperty getAdditionalProperty(int i) {
        return this.additionalProperty[i];
    }

    public void setAdditionalProperty(int i, com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultSubscriberAdditionalProperty _value) {
        this.additionalProperty[i] = _value;
    }


    /**
     * Gets the paymentLimitUsage value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @return paymentLimitUsage
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage getPaymentLimitUsage() {
        return paymentLimitUsage;
    }


    /**
     * Sets the paymentLimitUsage value for this QuerySubInfoExToCubeResultSubscriber.
     * 
     * @param paymentLimitUsage
     */
    public void setPaymentLimitUsage(com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultSubscriberPaymentLimitUsage paymentLimitUsage) {
        this.paymentLimitUsage = paymentLimitUsage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubInfoExToCubeResultSubscriber)) return false;
        QuerySubInfoExToCubeResultSubscriber other = (QuerySubInfoExToCubeResultSubscriber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceNum==null && other.getServiceNum()==null) || 
             (this.serviceNum!=null &&
              this.serviceNum.equals(other.getServiceNum()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            this.balanceAmount == other.getBalanceAmount() &&
            ((this.primaryOfferName==null && other.getPrimaryOfferName()==null) || 
             (this.primaryOfferName!=null &&
              this.primaryOfferName.equals(other.getPrimaryOfferName()))) &&
            ((this.primaryOfferKey==null && other.getPrimaryOfferKey()==null) || 
             (this.primaryOfferKey!=null &&
              this.primaryOfferKey.equals(other.getPrimaryOfferKey()))) &&
            ((this.lifeCycleStatus==null && other.getLifeCycleStatus()==null) || 
             (this.lifeCycleStatus!=null &&
              this.lifeCycleStatus.equals(other.getLifeCycleStatus()))) &&
            ((this.managementSatus==null && other.getManagementSatus()==null) || 
             (this.managementSatus!=null &&
              this.managementSatus.equals(other.getManagementSatus()))) &&
            ((this.blacklistStatus==null && other.getBlacklistStatus()==null) || 
             (this.blacklistStatus!=null &&
              this.blacklistStatus.equals(other.getBlacklistStatus()))) &&
            ((this.additionalProperty==null && other.getAdditionalProperty()==null) || 
             (this.additionalProperty!=null &&
              java.util.Arrays.equals(this.additionalProperty, other.getAdditionalProperty()))) &&
            ((this.paymentLimitUsage==null && other.getPaymentLimitUsage()==null) || 
             (this.paymentLimitUsage!=null &&
              this.paymentLimitUsage.equals(other.getPaymentLimitUsage())));
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
        if (getServiceNum() != null) {
            _hashCode += getServiceNum().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        _hashCode += new Long(getBalanceAmount()).hashCode();
        if (getPrimaryOfferName() != null) {
            _hashCode += getPrimaryOfferName().hashCode();
        }
        if (getPrimaryOfferKey() != null) {
            _hashCode += getPrimaryOfferKey().hashCode();
        }
        if (getLifeCycleStatus() != null) {
            _hashCode += getLifeCycleStatus().hashCode();
        }
        if (getManagementSatus() != null) {
            _hashCode += getManagementSatus().hashCode();
        }
        if (getBlacklistStatus() != null) {
            _hashCode += getBlacklistStatus().hashCode();
        }
        if (getAdditionalProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalProperty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentLimitUsage() != null) {
            _hashCode += getPaymentLimitUsage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySubInfoExToCubeResultSubscriber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInfoExToCubeResult>Subscriber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ServiceNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BalanceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryOfferName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrimaryOfferName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryOfferKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrimaryOfferKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeCycleStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LifeCycleStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managementSatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManagementSatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blacklistStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BlacklistStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AdditionalProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInfoExToCubeResult>Subscriber>AdditionalProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentLimitUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentLimitUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QuerySubInfoExToCubeResult>Subscriber>PaymentLimitUsage"));
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
