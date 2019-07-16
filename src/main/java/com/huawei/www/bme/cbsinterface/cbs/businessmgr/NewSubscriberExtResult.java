/**
 * NewSubscriberExtResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class NewSubscriberExtResult  implements java.io.Serializable {
    private java.lang.String subscriberID;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.ProductOrderInfoType[] productOrderInfo;

    public NewSubscriberExtResult() {
    }

    public NewSubscriberExtResult(
           java.lang.String subscriberID,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.ProductOrderInfoType[] productOrderInfo) {
           this.subscriberID = subscriberID;
           this.productOrderInfo = productOrderInfo;
    }


    /**
     * Gets the subscriberID value for this NewSubscriberExtResult.
     * 
     * @return subscriberID
     */
    public java.lang.String getSubscriberID() {
        return subscriberID;
    }


    /**
     * Sets the subscriberID value for this NewSubscriberExtResult.
     * 
     * @param subscriberID
     */
    public void setSubscriberID(java.lang.String subscriberID) {
        this.subscriberID = subscriberID;
    }


    /**
     * Gets the productOrderInfo value for this NewSubscriberExtResult.
     * 
     * @return productOrderInfo
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ProductOrderInfoType[] getProductOrderInfo() {
        return productOrderInfo;
    }


    /**
     * Sets the productOrderInfo value for this NewSubscriberExtResult.
     * 
     * @param productOrderInfo
     */
    public void setProductOrderInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgr.ProductOrderInfoType[] productOrderInfo) {
        this.productOrderInfo = productOrderInfo;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ProductOrderInfoType getProductOrderInfo(int i) {
        return this.productOrderInfo[i];
    }

    public void setProductOrderInfo(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.ProductOrderInfoType _value) {
        this.productOrderInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewSubscriberExtResult)) return false;
        NewSubscriberExtResult other = (NewSubscriberExtResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberID==null && other.getSubscriberID()==null) || 
             (this.subscriberID!=null &&
              this.subscriberID.equals(other.getSubscriberID()))) &&
            ((this.productOrderInfo==null && other.getProductOrderInfo()==null) || 
             (this.productOrderInfo!=null &&
              java.util.Arrays.equals(this.productOrderInfo, other.getProductOrderInfo())));
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
        if (getSubscriberID() != null) {
            _hashCode += getSubscriberID().hashCode();
        }
        if (getProductOrderInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductOrderInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductOrderInfo(), i);
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
        new org.apache.axis.description.TypeDesc(NewSubscriberExtResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewSubscriberExtResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOrderInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ProductOrderInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ProductOrderInfoType"));
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
