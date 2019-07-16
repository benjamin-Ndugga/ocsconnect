/**
 * BindProductSubscriberNoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class BindProductSubscriberNoRequest  implements java.io.Serializable {
    private java.lang.String subscriberNo;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindProductSubscriberNoRequestBindSubNumber[] bindSubNumber;

    public BindProductSubscriberNoRequest() {
    }

    public BindProductSubscriberNoRequest(
           java.lang.String subscriberNo,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindProductSubscriberNoRequestBindSubNumber[] bindSubNumber) {
           this.subscriberNo = subscriberNo;
           this.bindSubNumber = bindSubNumber;
    }


    /**
     * Gets the subscriberNo value for this BindProductSubscriberNoRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this BindProductSubscriberNoRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the bindSubNumber value for this BindProductSubscriberNoRequest.
     * 
     * @return bindSubNumber
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindProductSubscriberNoRequestBindSubNumber[] getBindSubNumber() {
        return bindSubNumber;
    }


    /**
     * Sets the bindSubNumber value for this BindProductSubscriberNoRequest.
     * 
     * @param bindSubNumber
     */
    public void setBindSubNumber(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindProductSubscriberNoRequestBindSubNumber[] bindSubNumber) {
        this.bindSubNumber = bindSubNumber;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindProductSubscriberNoRequestBindSubNumber getBindSubNumber(int i) {
        return this.bindSubNumber[i];
    }

    public void setBindSubNumber(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindProductSubscriberNoRequestBindSubNumber _value) {
        this.bindSubNumber[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BindProductSubscriberNoRequest)) return false;
        BindProductSubscriberNoRequest other = (BindProductSubscriberNoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            ((this.bindSubNumber==null && other.getBindSubNumber()==null) || 
             (this.bindSubNumber!=null &&
              java.util.Arrays.equals(this.bindSubNumber, other.getBindSubNumber())));
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
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        if (getBindSubNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBindSubNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBindSubNumber(), i);
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
        new org.apache.axis.description.TypeDesc(BindProductSubscriberNoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BindProductSubscriberNoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindSubNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BindSubNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BindProductSubscriberNoRequest>BindSubNumber"));
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
