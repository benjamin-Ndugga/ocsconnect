/**
 * QueryBasicInfoResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryBasicInfoResult  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultCustomer customer;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriber subscriber;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberAccount subscriberAccount;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultAccount[] account;

    public QueryBasicInfoResult() {
    }

    public QueryBasicInfoResult(
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultCustomer customer,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriber subscriber,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberAccount subscriberAccount,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultAccount[] account) {
           this.customer = customer;
           this.subscriber = subscriber;
           this.subscriberAccount = subscriberAccount;
           this.account = account;
    }


    /**
     * Gets the customer value for this QueryBasicInfoResult.
     * 
     * @return customer
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultCustomer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this QueryBasicInfoResult.
     * 
     * @param customer
     */
    public void setCustomer(com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultCustomer customer) {
        this.customer = customer;
    }


    /**
     * Gets the subscriber value for this QueryBasicInfoResult.
     * 
     * @return subscriber
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriber getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this QueryBasicInfoResult.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriber subscriber) {
        this.subscriber = subscriber;
    }


    /**
     * Gets the subscriberAccount value for this QueryBasicInfoResult.
     * 
     * @return subscriberAccount
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberAccount getSubscriberAccount() {
        return subscriberAccount;
    }


    /**
     * Sets the subscriberAccount value for this QueryBasicInfoResult.
     * 
     * @param subscriberAccount
     */
    public void setSubscriberAccount(com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberAccount subscriberAccount) {
        this.subscriberAccount = subscriberAccount;
    }


    /**
     * Gets the account value for this QueryBasicInfoResult.
     * 
     * @return account
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultAccount[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this QueryBasicInfoResult.
     * 
     * @param account
     */
    public void setAccount(com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultAccount[] account) {
        this.account = account;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultAccount getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultAccount _value) {
        this.account[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBasicInfoResult)) return false;
        QueryBasicInfoResult other = (QueryBasicInfoResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.subscriber==null && other.getSubscriber()==null) || 
             (this.subscriber!=null &&
              this.subscriber.equals(other.getSubscriber()))) &&
            ((this.subscriberAccount==null && other.getSubscriberAccount()==null) || 
             (this.subscriberAccount!=null &&
              this.subscriberAccount.equals(other.getSubscriberAccount()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              java.util.Arrays.equals(this.account, other.getAccount())));
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
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getSubscriber() != null) {
            _hashCode += getSubscriber().hashCode();
        }
        if (getSubscriberAccount() != null) {
            _hashCode += getSubscriberAccount().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryBasicInfoResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryBasicInfoResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryBasicInfoResult>Customer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryBasicInfoResult>Subscriber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryBasicInfoResult>SubscriberAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryBasicInfoResult>Account"));
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
