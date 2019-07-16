/**
 * UnSubscribeAppendantProductExtRequestProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class UnSubscribeAppendantProductExtRequestProduct  implements java.io.Serializable {
    private java.lang.String productID;

    private java.lang.String productOrderKey;

    private java.lang.String validMode;

    private java.lang.String expireDate;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.UnSubscribeAppendantProductExtRequestProductService[] service;

    public UnSubscribeAppendantProductExtRequestProduct() {
    }

    public UnSubscribeAppendantProductExtRequestProduct(
           java.lang.String productID,
           java.lang.String productOrderKey,
           java.lang.String validMode,
           java.lang.String expireDate,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.UnSubscribeAppendantProductExtRequestProductService[] service) {
           this.productID = productID;
           this.productOrderKey = productOrderKey;
           this.validMode = validMode;
           this.expireDate = expireDate;
           this.service = service;
    }


    /**
     * Gets the productID value for this UnSubscribeAppendantProductExtRequestProduct.
     * 
     * @return productID
     */
    public java.lang.String getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this UnSubscribeAppendantProductExtRequestProduct.
     * 
     * @param productID
     */
    public void setProductID(java.lang.String productID) {
        this.productID = productID;
    }


    /**
     * Gets the productOrderKey value for this UnSubscribeAppendantProductExtRequestProduct.
     * 
     * @return productOrderKey
     */
    public java.lang.String getProductOrderKey() {
        return productOrderKey;
    }


    /**
     * Sets the productOrderKey value for this UnSubscribeAppendantProductExtRequestProduct.
     * 
     * @param productOrderKey
     */
    public void setProductOrderKey(java.lang.String productOrderKey) {
        this.productOrderKey = productOrderKey;
    }


    /**
     * Gets the validMode value for this UnSubscribeAppendantProductExtRequestProduct.
     * 
     * @return validMode
     */
    public java.lang.String getValidMode() {
        return validMode;
    }


    /**
     * Sets the validMode value for this UnSubscribeAppendantProductExtRequestProduct.
     * 
     * @param validMode
     */
    public void setValidMode(java.lang.String validMode) {
        this.validMode = validMode;
    }


    /**
     * Gets the expireDate value for this UnSubscribeAppendantProductExtRequestProduct.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this UnSubscribeAppendantProductExtRequestProduct.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the service value for this UnSubscribeAppendantProductExtRequestProduct.
     * 
     * @return service
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.UnSubscribeAppendantProductExtRequestProductService[] getService() {
        return service;
    }


    /**
     * Sets the service value for this UnSubscribeAppendantProductExtRequestProduct.
     * 
     * @param service
     */
    public void setService(com.huawei.www.bme.cbsinterface.cbs.businessmgr.UnSubscribeAppendantProductExtRequestProductService[] service) {
        this.service = service;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.UnSubscribeAppendantProductExtRequestProductService getService(int i) {
        return this.service[i];
    }

    public void setService(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.UnSubscribeAppendantProductExtRequestProductService _value) {
        this.service[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnSubscribeAppendantProductExtRequestProduct)) return false;
        UnSubscribeAppendantProductExtRequestProduct other = (UnSubscribeAppendantProductExtRequestProduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.productOrderKey==null && other.getProductOrderKey()==null) || 
             (this.productOrderKey!=null &&
              this.productOrderKey.equals(other.getProductOrderKey()))) &&
            ((this.validMode==null && other.getValidMode()==null) || 
             (this.validMode!=null &&
              this.validMode.equals(other.getValidMode()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
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
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getProductOrderKey() != null) {
            _hashCode += getProductOrderKey().hashCode();
        }
        if (getValidMode() != null) {
            _hashCode += getValidMode().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(UnSubscribeAppendantProductExtRequestProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">UnSubscribeAppendantProductExtRequest>Product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOrderKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ProductOrderKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ValidMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>UnSubscribeAppendantProductExtRequest>Product>Service"));
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
