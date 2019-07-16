/**
 * BatchCreateSubscriberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchCreateSubscriberRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.CustomerForBatch customer;

    private com.huawei.www.bme.cbsinterface.bccommon.AccountForBatch[] account;

    private com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequestSubscriber subscriber;

    private com.huawei.www.bme.cbsinterface.bccommon.POfferingInst primaryOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequestSupplementaryOffering[] supplementaryOffering;

    private com.huawei.www.bme.cbsinterface.bccommon.SalesInfo salesInfo;

    private java.lang.String fileName;

    public BatchCreateSubscriberRequest() {
    }

    public BatchCreateSubscriberRequest(
           com.huawei.www.bme.cbsinterface.bccommon.CustomerForBatch customer,
           com.huawei.www.bme.cbsinterface.bccommon.AccountForBatch[] account,
           com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequestSubscriber subscriber,
           com.huawei.www.bme.cbsinterface.bccommon.POfferingInst primaryOffering,
           com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequestSupplementaryOffering[] supplementaryOffering,
           com.huawei.www.bme.cbsinterface.bccommon.SalesInfo salesInfo,
           java.lang.String fileName) {
           this.customer = customer;
           this.account = account;
           this.subscriber = subscriber;
           this.primaryOffering = primaryOffering;
           this.supplementaryOffering = supplementaryOffering;
           this.salesInfo = salesInfo;
           this.fileName = fileName;
    }


    /**
     * Gets the customer value for this BatchCreateSubscriberRequest.
     * 
     * @return customer
     */
    public com.huawei.www.bme.cbsinterface.bccommon.CustomerForBatch getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this BatchCreateSubscriberRequest.
     * 
     * @param customer
     */
    public void setCustomer(com.huawei.www.bme.cbsinterface.bccommon.CustomerForBatch customer) {
        this.customer = customer;
    }


    /**
     * Gets the account value for this BatchCreateSubscriberRequest.
     * 
     * @return account
     */
    public com.huawei.www.bme.cbsinterface.bccommon.AccountForBatch[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this BatchCreateSubscriberRequest.
     * 
     * @param account
     */
    public void setAccount(com.huawei.www.bme.cbsinterface.bccommon.AccountForBatch[] account) {
        this.account = account;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.AccountForBatch getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, com.huawei.www.bme.cbsinterface.bccommon.AccountForBatch _value) {
        this.account[i] = _value;
    }


    /**
     * Gets the subscriber value for this BatchCreateSubscriberRequest.
     * 
     * @return subscriber
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequestSubscriber getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this BatchCreateSubscriberRequest.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequestSubscriber subscriber) {
        this.subscriber = subscriber;
    }


    /**
     * Gets the primaryOffering value for this BatchCreateSubscriberRequest.
     * 
     * @return primaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bccommon.POfferingInst getPrimaryOffering() {
        return primaryOffering;
    }


    /**
     * Sets the primaryOffering value for this BatchCreateSubscriberRequest.
     * 
     * @param primaryOffering
     */
    public void setPrimaryOffering(com.huawei.www.bme.cbsinterface.bccommon.POfferingInst primaryOffering) {
        this.primaryOffering = primaryOffering;
    }


    /**
     * Gets the supplementaryOffering value for this BatchCreateSubscriberRequest.
     * 
     * @return supplementaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequestSupplementaryOffering[] getSupplementaryOffering() {
        return supplementaryOffering;
    }


    /**
     * Sets the supplementaryOffering value for this BatchCreateSubscriberRequest.
     * 
     * @param supplementaryOffering
     */
    public void setSupplementaryOffering(com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequestSupplementaryOffering[] supplementaryOffering) {
        this.supplementaryOffering = supplementaryOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequestSupplementaryOffering getSupplementaryOffering(int i) {
        return this.supplementaryOffering[i];
    }

    public void setSupplementaryOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequestSupplementaryOffering _value) {
        this.supplementaryOffering[i] = _value;
    }


    /**
     * Gets the salesInfo value for this BatchCreateSubscriberRequest.
     * 
     * @return salesInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SalesInfo getSalesInfo() {
        return salesInfo;
    }


    /**
     * Sets the salesInfo value for this BatchCreateSubscriberRequest.
     * 
     * @param salesInfo
     */
    public void setSalesInfo(com.huawei.www.bme.cbsinterface.bccommon.SalesInfo salesInfo) {
        this.salesInfo = salesInfo;
    }


    /**
     * Gets the fileName value for this BatchCreateSubscriberRequest.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BatchCreateSubscriberRequest.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchCreateSubscriberRequest)) return false;
        BatchCreateSubscriberRequest other = (BatchCreateSubscriberRequest) obj;
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
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              java.util.Arrays.equals(this.account, other.getAccount()))) &&
            ((this.subscriber==null && other.getSubscriber()==null) || 
             (this.subscriber!=null &&
              this.subscriber.equals(other.getSubscriber()))) &&
            ((this.primaryOffering==null && other.getPrimaryOffering()==null) || 
             (this.primaryOffering!=null &&
              this.primaryOffering.equals(other.getPrimaryOffering()))) &&
            ((this.supplementaryOffering==null && other.getSupplementaryOffering()==null) || 
             (this.supplementaryOffering!=null &&
              java.util.Arrays.equals(this.supplementaryOffering, other.getSupplementaryOffering()))) &&
            ((this.salesInfo==null && other.getSalesInfo()==null) || 
             (this.salesInfo!=null &&
              this.salesInfo.equals(other.getSalesInfo()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName())));
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
        if (getSubscriber() != null) {
            _hashCode += getSubscriber().hashCode();
        }
        if (getPrimaryOffering() != null) {
            _hashCode += getPrimaryOffering().hashCode();
        }
        if (getSupplementaryOffering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupplementaryOffering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupplementaryOffering(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesInfo() != null) {
            _hashCode += getSalesInfo().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchCreateSubscriberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchCreateSubscriberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustomerForBatch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AccountForBatch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchCreateSubscriberRequest>Subscriber"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrimaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "POfferingInst"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplementaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SupplementaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchCreateSubscriberRequest>SupplementaryOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SalesInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SalesInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
