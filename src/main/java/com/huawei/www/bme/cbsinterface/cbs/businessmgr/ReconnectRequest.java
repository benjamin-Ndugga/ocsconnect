/**
 * ReconnectRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ReconnectRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.Common subscriberNo;

    public ReconnectRequest() {
    }

    public ReconnectRequest(
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.Common subscriberNo) {
           this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the subscriberNo value for this ReconnectRequest.
     * 
     * @return subscriberNo
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.Common getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this ReconnectRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(com.huawei.www.bme.cbsinterface.cbs.businessmgr.Common subscriberNo) {
        this.subscriberNo = subscriberNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReconnectRequest)) return false;
        ReconnectRequest other = (ReconnectRequest) obj;
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
              this.subscriberNo.equals(other.getSubscriberNo())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReconnectRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ReconnectRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Common"));
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
