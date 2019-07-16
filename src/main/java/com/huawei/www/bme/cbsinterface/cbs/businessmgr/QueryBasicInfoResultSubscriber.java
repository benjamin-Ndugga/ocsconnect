/**
 * QueryBasicInfoResultSubscriber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryBasicInfoResultSubscriber  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberSubscriber subscriber;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberProduct[] product;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.Service[] service;

    public QueryBasicInfoResultSubscriber() {
    }

    public QueryBasicInfoResultSubscriber(
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberSubscriber subscriber,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberProduct[] product,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.Service[] service) {
           this.subscriber = subscriber;
           this.product = product;
           this.service = service;
    }


    /**
     * Gets the subscriber value for this QueryBasicInfoResultSubscriber.
     * 
     * @return subscriber
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberSubscriber getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this QueryBasicInfoResultSubscriber.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberSubscriber subscriber) {
        this.subscriber = subscriber;
    }


    /**
     * Gets the product value for this QueryBasicInfoResultSubscriber.
     * 
     * @return product
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberProduct[] getProduct() {
        return product;
    }


    /**
     * Sets the product value for this QueryBasicInfoResultSubscriber.
     * 
     * @param product
     */
    public void setProduct(com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberProduct[] product) {
        this.product = product;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberProduct getProduct(int i) {
        return this.product[i];
    }

    public void setProduct(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResultSubscriberProduct _value) {
        this.product[i] = _value;
    }


    /**
     * Gets the service value for this QueryBasicInfoResultSubscriber.
     * 
     * @return service
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.Service[] getService() {
        return service;
    }


    /**
     * Sets the service value for this QueryBasicInfoResultSubscriber.
     * 
     * @param service
     */
    public void setService(com.huawei.www.bme.cbsinterface.cbs.businessmgr.Service[] service) {
        this.service = service;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.Service getService(int i) {
        return this.service[i];
    }

    public void setService(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.Service _value) {
        this.service[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBasicInfoResultSubscriber)) return false;
        QueryBasicInfoResultSubscriber other = (QueryBasicInfoResultSubscriber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriber==null && other.getSubscriber()==null) || 
             (this.subscriber!=null &&
              this.subscriber.equals(other.getSubscriber()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              java.util.Arrays.equals(this.product, other.getProduct()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              java.util.Arrays.equals(this.service, other.getService())));
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
        if (getSubscriber() != null) {
            _hashCode += getSubscriber().hashCode();
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
        if (getService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getService(), i);
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
        new org.apache.axis.description.TypeDesc(QueryBasicInfoResultSubscriber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryBasicInfoResult>Subscriber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>QueryBasicInfoResult>Subscriber>Subscriber"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>QueryBasicInfoResult>Subscriber>Product"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Service"));
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
