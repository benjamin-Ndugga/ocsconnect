/**
 * ProductInst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class ProductInst  implements java.io.Serializable {
    /* It is product ID which is defined in PC module. */
    private long productID;

    private java.lang.String primaryFlag;

    private java.lang.String packageFlag;

    private java.math.BigInteger parentProdID;

    private java.lang.String networkType;

    private java.lang.String productType;

    private com.huawei.www.bme.cbsinterface.bccommon.ProductInstPInstProperty[] PInstProperty;

    public ProductInst() {
    }

    public ProductInst(
           long productID,
           java.lang.String primaryFlag,
           java.lang.String packageFlag,
           java.math.BigInteger parentProdID,
           java.lang.String networkType,
           java.lang.String productType,
           com.huawei.www.bme.cbsinterface.bccommon.ProductInstPInstProperty[] PInstProperty) {
           this.productID = productID;
           this.primaryFlag = primaryFlag;
           this.packageFlag = packageFlag;
           this.parentProdID = parentProdID;
           this.networkType = networkType;
           this.productType = productType;
           this.PInstProperty = PInstProperty;
    }


    /**
     * Gets the productID value for this ProductInst.
     * 
     * @return productID   * It is product ID which is defined in PC module.
     */
    public long getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this ProductInst.
     * 
     * @param productID   * It is product ID which is defined in PC module.
     */
    public void setProductID(long productID) {
        this.productID = productID;
    }


    /**
     * Gets the primaryFlag value for this ProductInst.
     * 
     * @return primaryFlag
     */
    public java.lang.String getPrimaryFlag() {
        return primaryFlag;
    }


    /**
     * Sets the primaryFlag value for this ProductInst.
     * 
     * @param primaryFlag
     */
    public void setPrimaryFlag(java.lang.String primaryFlag) {
        this.primaryFlag = primaryFlag;
    }


    /**
     * Gets the packageFlag value for this ProductInst.
     * 
     * @return packageFlag
     */
    public java.lang.String getPackageFlag() {
        return packageFlag;
    }


    /**
     * Sets the packageFlag value for this ProductInst.
     * 
     * @param packageFlag
     */
    public void setPackageFlag(java.lang.String packageFlag) {
        this.packageFlag = packageFlag;
    }


    /**
     * Gets the parentProdID value for this ProductInst.
     * 
     * @return parentProdID
     */
    public java.math.BigInteger getParentProdID() {
        return parentProdID;
    }


    /**
     * Sets the parentProdID value for this ProductInst.
     * 
     * @param parentProdID
     */
    public void setParentProdID(java.math.BigInteger parentProdID) {
        this.parentProdID = parentProdID;
    }


    /**
     * Gets the networkType value for this ProductInst.
     * 
     * @return networkType
     */
    public java.lang.String getNetworkType() {
        return networkType;
    }


    /**
     * Sets the networkType value for this ProductInst.
     * 
     * @param networkType
     */
    public void setNetworkType(java.lang.String networkType) {
        this.networkType = networkType;
    }


    /**
     * Gets the productType value for this ProductInst.
     * 
     * @return productType
     */
    public java.lang.String getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this ProductInst.
     * 
     * @param productType
     */
    public void setProductType(java.lang.String productType) {
        this.productType = productType;
    }


    /**
     * Gets the PInstProperty value for this ProductInst.
     * 
     * @return PInstProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.ProductInstPInstProperty[] getPInstProperty() {
        return PInstProperty;
    }


    /**
     * Sets the PInstProperty value for this ProductInst.
     * 
     * @param PInstProperty
     */
    public void setPInstProperty(com.huawei.www.bme.cbsinterface.bccommon.ProductInstPInstProperty[] PInstProperty) {
        this.PInstProperty = PInstProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.ProductInstPInstProperty getPInstProperty(int i) {
        return this.PInstProperty[i];
    }

    public void setPInstProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.ProductInstPInstProperty _value) {
        this.PInstProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductInst)) return false;
        ProductInst other = (ProductInst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.productID == other.getProductID() &&
            ((this.primaryFlag==null && other.getPrimaryFlag()==null) || 
             (this.primaryFlag!=null &&
              this.primaryFlag.equals(other.getPrimaryFlag()))) &&
            ((this.packageFlag==null && other.getPackageFlag()==null) || 
             (this.packageFlag!=null &&
              this.packageFlag.equals(other.getPackageFlag()))) &&
            ((this.parentProdID==null && other.getParentProdID()==null) || 
             (this.parentProdID!=null &&
              this.parentProdID.equals(other.getParentProdID()))) &&
            ((this.networkType==null && other.getNetworkType()==null) || 
             (this.networkType!=null &&
              this.networkType.equals(other.getNetworkType()))) &&
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            ((this.PInstProperty==null && other.getPInstProperty()==null) || 
             (this.PInstProperty!=null &&
              java.util.Arrays.equals(this.PInstProperty, other.getPInstProperty())));
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
        _hashCode += new Long(getProductID()).hashCode();
        if (getPrimaryFlag() != null) {
            _hashCode += getPrimaryFlag().hashCode();
        }
        if (getPackageFlag() != null) {
            _hashCode += getPackageFlag().hashCode();
        }
        if (getParentProdID() != null) {
            _hashCode += getParentProdID().hashCode();
        }
        if (getNetworkType() != null) {
            _hashCode += getNetworkType().hashCode();
        }
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        if (getPInstProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPInstProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPInstProperty(), i);
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
        new org.apache.axis.description.TypeDesc(ProductInst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ProductInst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PrimaryFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PackageFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentProdID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ParentProdID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "NetworkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ProductType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PInstProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PInstProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">ProductInst>PInstProperty"));
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
