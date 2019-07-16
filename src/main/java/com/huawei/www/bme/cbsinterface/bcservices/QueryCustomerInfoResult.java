/**
 * QueryCustomerInfoResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryCustomerInfoResult  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultCustomer customer;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriber subscriber;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroup subGroup;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccount[] account;

    public QueryCustomerInfoResult() {
    }

    public QueryCustomerInfoResult(
           com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultCustomer customer,
           com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriber subscriber,
           com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroup subGroup,
           com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccount[] account) {
           this.customer = customer;
           this.subscriber = subscriber;
           this.subGroup = subGroup;
           this.account = account;
    }


    /**
     * Gets the customer value for this QueryCustomerInfoResult.
     * 
     * @return customer
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultCustomer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this QueryCustomerInfoResult.
     * 
     * @param customer
     */
    public void setCustomer(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultCustomer customer) {
        this.customer = customer;
    }


    /**
     * Gets the subscriber value for this QueryCustomerInfoResult.
     * 
     * @return subscriber
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriber getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this QueryCustomerInfoResult.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubscriber subscriber) {
        this.subscriber = subscriber;
    }


    /**
     * Gets the subGroup value for this QueryCustomerInfoResult.
     * 
     * @return subGroup
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroup getSubGroup() {
        return subGroup;
    }


    /**
     * Sets the subGroup value for this QueryCustomerInfoResult.
     * 
     * @param subGroup
     */
    public void setSubGroup(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroup subGroup) {
        this.subGroup = subGroup;
    }


    /**
     * Gets the account value for this QueryCustomerInfoResult.
     * 
     * @return account
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccount[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this QueryCustomerInfoResult.
     * 
     * @param account
     */
    public void setAccount(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccount[] account) {
        this.account = account;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccount getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccount _value) {
        this.account[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCustomerInfoResult)) return false;
        QueryCustomerInfoResult other = (QueryCustomerInfoResult) obj;
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
            ((this.subGroup==null && other.getSubGroup()==null) || 
             (this.subGroup!=null &&
              this.subGroup.equals(other.getSubGroup()))) &&
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
        if (getSubGroup() != null) {
            _hashCode += getSubGroup().hashCode();
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
        new org.apache.axis.description.TypeDesc(QueryCustomerInfoResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryCustomerInfoResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoResult>Customer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoResult>Subscriber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoResult>SubGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoResult>Account"));
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
