/**
 * NewSubscriberExtRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class NewSubscriberExtRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.IndividualCustomer customer;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtRequestSubscriber subscriber;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.Account account;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtRequestProduct[] product;

    public NewSubscriberExtRequest() {
    }

    public NewSubscriberExtRequest(
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.IndividualCustomer customer,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtRequestSubscriber subscriber,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.Account account,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtRequestProduct[] product) {
           this.customer = customer;
           this.subscriber = subscriber;
           this.account = account;
           this.product = product;
    }


    /**
     * Gets the customer value for this NewSubscriberExtRequest.
     * 
     * @return customer
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.IndividualCustomer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this NewSubscriberExtRequest.
     * 
     * @param customer
     */
    public void setCustomer(com.huawei.www.bme.cbsinterface.cbs.businessmgr.IndividualCustomer customer) {
        this.customer = customer;
    }


    /**
     * Gets the subscriber value for this NewSubscriberExtRequest.
     * 
     * @return subscriber
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtRequestSubscriber getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this NewSubscriberExtRequest.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtRequestSubscriber subscriber) {
        this.subscriber = subscriber;
    }


    /**
     * Gets the account value for this NewSubscriberExtRequest.
     * 
     * @return account
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.Account getAccount() {
        return account;
    }


    /**
     * Sets the account value for this NewSubscriberExtRequest.
     * 
     * @param account
     */
    public void setAccount(com.huawei.www.bme.cbsinterface.cbs.businessmgr.Account account) {
        this.account = account;
    }


    /**
     * Gets the product value for this NewSubscriberExtRequest.
     * 
     * @return product
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtRequestProduct[] getProduct() {
        return product;
    }


    /**
     * Sets the product value for this NewSubscriberExtRequest.
     * 
     * @param product
     */
    public void setProduct(com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtRequestProduct[] product) {
        this.product = product;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtRequestProduct getProduct(int i) {
        return this.product[i];
    }

    public void setProduct(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.NewSubscriberExtRequestProduct _value) {
        this.product[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewSubscriberExtRequest)) return false;
        NewSubscriberExtRequest other = (NewSubscriberExtRequest) obj;
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
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              java.util.Arrays.equals(this.product, other.getProduct())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProduct(), i);
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
        new org.apache.axis.description.TypeDesc(NewSubscriberExtRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewSubscriberExtRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IndividualCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">NewSubscriberExtRequest>Subscriber"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">NewSubscriberExtRequest>Product"));
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
