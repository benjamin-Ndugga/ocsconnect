/**
 * SubscribeAppendantProductRequestProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class SubscribeAppendantProductRequestProduct  extends com.huawei.www.bme.cbsinterface.cbs.businessmgr.Product  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.Service[] service;

    private java.lang.String effectiveDate;

    private java.lang.String expireDate;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.ValidMode validMode;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindSubscriberNo[] bindSubscriberNo;

    public SubscribeAppendantProductRequestProduct() {
    }

    public SubscribeAppendantProductRequestProduct(
           java.lang.String id,
           java.lang.String name,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.Service[] service,
           java.lang.String effectiveDate,
           java.lang.String expireDate,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.ValidMode validMode,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindSubscriberNo[] bindSubscriberNo) {
        super(
            id,
            name,
            simpleProperty);
        this.service = service;
        this.effectiveDate = effectiveDate;
        this.expireDate = expireDate;
        this.validMode = validMode;
        this.bindSubscriberNo = bindSubscriberNo;
    }


    /**
     * Gets the service value for this SubscribeAppendantProductRequestProduct.
     * 
     * @return service
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.Service[] getService() {
        return service;
    }


    /**
     * Sets the service value for this SubscribeAppendantProductRequestProduct.
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


    /**
     * Gets the effectiveDate value for this SubscribeAppendantProductRequestProduct.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this SubscribeAppendantProductRequestProduct.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expireDate value for this SubscribeAppendantProductRequestProduct.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this SubscribeAppendantProductRequestProduct.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the validMode value for this SubscribeAppendantProductRequestProduct.
     * 
     * @return validMode
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ValidMode getValidMode() {
        return validMode;
    }


    /**
     * Sets the validMode value for this SubscribeAppendantProductRequestProduct.
     * 
     * @param validMode
     */
    public void setValidMode(com.huawei.www.bme.cbsinterface.cbs.businessmgr.ValidMode validMode) {
        this.validMode = validMode;
    }


    /**
     * Gets the bindSubscriberNo value for this SubscribeAppendantProductRequestProduct.
     * 
     * @return bindSubscriberNo
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindSubscriberNo[] getBindSubscriberNo() {
        return bindSubscriberNo;
    }


    /**
     * Sets the bindSubscriberNo value for this SubscribeAppendantProductRequestProduct.
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
        if (!(obj instanceof SubscribeAppendantProductRequestProduct)) return false;
        SubscribeAppendantProductRequestProduct other = (SubscribeAppendantProductRequestProduct) obj;
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
              java.util.Arrays.equals(this.service, other.getService()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.validMode==null && other.getValidMode()==null) || 
             (this.validMode!=null &&
              this.validMode.equals(other.getValidMode()))) &&
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
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getValidMode() != null) {
            _hashCode += getValidMode().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(SubscribeAppendantProductRequestProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">SubscribeAppendantProductRequest>Product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ValidMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ValidMode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
