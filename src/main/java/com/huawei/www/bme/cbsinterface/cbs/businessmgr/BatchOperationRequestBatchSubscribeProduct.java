/**
 * BatchOperationRequestBatchSubscribeProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class BatchOperationRequestBatchSubscribeProduct  extends com.huawei.www.bme.cbsinterface.cbs.businessmgr.Product  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.Service[] service;

    public BatchOperationRequestBatchSubscribeProduct() {
    }

    public BatchOperationRequestBatchSubscribeProduct(
           java.lang.String id,
           java.lang.String name,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.Service[] service) {
        super(
            id,
            name,
            simpleProperty);
        this.service = service;
    }


    /**
     * Gets the service value for this BatchOperationRequestBatchSubscribeProduct.
     * 
     * @return service
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.Service[] getService() {
        return service;
    }


    /**
     * Sets the service value for this BatchOperationRequestBatchSubscribeProduct.
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
        if (!(obj instanceof BatchOperationRequestBatchSubscribeProduct)) return false;
        BatchOperationRequestBatchSubscribeProduct other = (BatchOperationRequestBatchSubscribeProduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
        int _hashCode = super.hashCode();
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
        new org.apache.axis.description.TypeDesc(BatchOperationRequestBatchSubscribeProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>BatchOperationRequest>BatchSubscribe>Product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Service"));
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
