/**
 * FeeQuotationResultFreeUnitChangeList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class FeeQuotationResultFreeUnitChangeList  implements java.io.Serializable {
    private java.lang.String ownerType;

    private java.lang.String ownerKey;

    private com.huawei.www.bme.cbsinterface.bccommon.FreeUnitChgInfo[] freeUnitChgInfo;

    public FeeQuotationResultFreeUnitChangeList() {
    }

    public FeeQuotationResultFreeUnitChangeList(
           java.lang.String ownerType,
           java.lang.String ownerKey,
           com.huawei.www.bme.cbsinterface.bccommon.FreeUnitChgInfo[] freeUnitChgInfo) {
           this.ownerType = ownerType;
           this.ownerKey = ownerKey;
           this.freeUnitChgInfo = freeUnitChgInfo;
    }


    /**
     * Gets the ownerType value for this FeeQuotationResultFreeUnitChangeList.
     * 
     * @return ownerType
     */
    public java.lang.String getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this FeeQuotationResultFreeUnitChangeList.
     * 
     * @param ownerType
     */
    public void setOwnerType(java.lang.String ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the ownerKey value for this FeeQuotationResultFreeUnitChangeList.
     * 
     * @return ownerKey
     */
    public java.lang.String getOwnerKey() {
        return ownerKey;
    }


    /**
     * Sets the ownerKey value for this FeeQuotationResultFreeUnitChangeList.
     * 
     * @param ownerKey
     */
    public void setOwnerKey(java.lang.String ownerKey) {
        this.ownerKey = ownerKey;
    }


    /**
     * Gets the freeUnitChgInfo value for this FeeQuotationResultFreeUnitChangeList.
     * 
     * @return freeUnitChgInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.FreeUnitChgInfo[] getFreeUnitChgInfo() {
        return freeUnitChgInfo;
    }


    /**
     * Sets the freeUnitChgInfo value for this FeeQuotationResultFreeUnitChangeList.
     * 
     * @param freeUnitChgInfo
     */
    public void setFreeUnitChgInfo(com.huawei.www.bme.cbsinterface.bccommon.FreeUnitChgInfo[] freeUnitChgInfo) {
        this.freeUnitChgInfo = freeUnitChgInfo;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.FreeUnitChgInfo getFreeUnitChgInfo(int i) {
        return this.freeUnitChgInfo[i];
    }

    public void setFreeUnitChgInfo(int i, com.huawei.www.bme.cbsinterface.bccommon.FreeUnitChgInfo _value) {
        this.freeUnitChgInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeQuotationResultFreeUnitChangeList)) return false;
        FeeQuotationResultFreeUnitChangeList other = (FeeQuotationResultFreeUnitChangeList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ownerType==null && other.getOwnerType()==null) || 
             (this.ownerType!=null &&
              this.ownerType.equals(other.getOwnerType()))) &&
            ((this.ownerKey==null && other.getOwnerKey()==null) || 
             (this.ownerKey!=null &&
              this.ownerKey.equals(other.getOwnerKey()))) &&
            ((this.freeUnitChgInfo==null && other.getFreeUnitChgInfo()==null) || 
             (this.freeUnitChgInfo!=null &&
              java.util.Arrays.equals(this.freeUnitChgInfo, other.getFreeUnitChgInfo())));
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
        if (getOwnerType() != null) {
            _hashCode += getOwnerType().hashCode();
        }
        if (getOwnerKey() != null) {
            _hashCode += getOwnerKey().hashCode();
        }
        if (getFreeUnitChgInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeUnitChgInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeUnitChgInfo(), i);
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
        new org.apache.axis.description.TypeDesc(FeeQuotationResultFreeUnitChangeList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationResult>FreeUnitChangeList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OwnerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OwnerKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitChgInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FreeUnitChgInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "FreeUnitChgInfo"));
        elemField.setNillable(true);
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
