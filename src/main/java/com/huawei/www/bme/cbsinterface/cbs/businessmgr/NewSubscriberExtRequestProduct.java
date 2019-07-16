/**
 * NewSubscriberExtRequestProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class NewSubscriberExtRequestProduct  extends com.huawei.www.bme.cbsinterface.cbs.businessmgr.Product  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindSubscriberNo[] bindSubscriberNo;

    public NewSubscriberExtRequestProduct() {
    }

    public NewSubscriberExtRequestProduct(
           java.lang.String id,
           java.lang.String name,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindSubscriberNo[] bindSubscriberNo) {
        super(
            id,
            name,
            simpleProperty);
        this.bindSubscriberNo = bindSubscriberNo;
    }


    /**
     * Gets the bindSubscriberNo value for this NewSubscriberExtRequestProduct.
     * 
     * @return bindSubscriberNo
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindSubscriberNo[] getBindSubscriberNo() {
        return bindSubscriberNo;
    }


    /**
     * Sets the bindSubscriberNo value for this NewSubscriberExtRequestProduct.
     * 
     * @param bindSubscriberNo
     */
    public void setBindSubscriberNo(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindSubscriberNo[] bindSubscriberNo) {
        this.bindSubscriberNo = bindSubscriberNo;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindSubscriberNo getBindSubscriberNo(int i) {
        return this.bindSubscriberNo[i];
    }

    public void setBindSubscriberNo(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindSubscriberNo _value) {
        this.bindSubscriberNo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewSubscriberExtRequestProduct)) return false;
        NewSubscriberExtRequestProduct other = (NewSubscriberExtRequestProduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bindSubscriberNo==null && other.getBindSubscriberNo()==null) || 
             (this.bindSubscriberNo!=null &&
              java.util.Arrays.equals(this.bindSubscriberNo, other.getBindSubscriberNo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBindSubscriberNo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBindSubscriberNo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBindSubscriberNo(), i);
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
        new org.apache.axis.description.TypeDesc(NewSubscriberExtRequestProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">NewSubscriberExtRequest>Product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindSubscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BindSubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BindSubscriberNo"));
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
