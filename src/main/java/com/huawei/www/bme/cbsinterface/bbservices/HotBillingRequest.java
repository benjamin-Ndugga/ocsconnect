/**
 * HotBillingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class HotBillingRequest  implements java.io.Serializable {
    private java.lang.String hotbillingSerialNo;

    private java.lang.String demandType;

    private com.huawei.www.bme.cbsinterface.bbservices.HotBillingRequestAcctAccessCode acctAccessCode;

    /* It is reserved for future extension */
    private com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] additionalProperty;

    public HotBillingRequest() {
    }

    public HotBillingRequest(
           java.lang.String hotbillingSerialNo,
           java.lang.String demandType,
           com.huawei.www.bme.cbsinterface.bbservices.HotBillingRequestAcctAccessCode acctAccessCode,
           com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] additionalProperty) {
           this.hotbillingSerialNo = hotbillingSerialNo;
           this.demandType = demandType;
           this.acctAccessCode = acctAccessCode;
           this.additionalProperty = additionalProperty;
    }


    /**
     * Gets the hotbillingSerialNo value for this HotBillingRequest.
     * 
     * @return hotbillingSerialNo
     */
    public java.lang.String getHotbillingSerialNo() {
        return hotbillingSerialNo;
    }


    /**
     * Sets the hotbillingSerialNo value for this HotBillingRequest.
     * 
     * @param hotbillingSerialNo
     */
    public void setHotbillingSerialNo(java.lang.String hotbillingSerialNo) {
        this.hotbillingSerialNo = hotbillingSerialNo;
    }


    /**
     * Gets the demandType value for this HotBillingRequest.
     * 
     * @return demandType
     */
    public java.lang.String getDemandType() {
        return demandType;
    }


    /**
     * Sets the demandType value for this HotBillingRequest.
     * 
     * @param demandType
     */
    public void setDemandType(java.lang.String demandType) {
        this.demandType = demandType;
    }


    /**
     * Gets the acctAccessCode value for this HotBillingRequest.
     * 
     * @return acctAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bbservices.HotBillingRequestAcctAccessCode getAcctAccessCode() {
        return acctAccessCode;
    }


    /**
     * Sets the acctAccessCode value for this HotBillingRequest.
     * 
     * @param acctAccessCode
     */
    public void setAcctAccessCode(com.huawei.www.bme.cbsinterface.bbservices.HotBillingRequestAcctAccessCode acctAccessCode) {
        this.acctAccessCode = acctAccessCode;
    }


    /**
     * Gets the additionalProperty value for this HotBillingRequest.
     * 
     * @return additionalProperty   * It is reserved for future extension
     */
    public com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] getAdditionalProperty() {
        return additionalProperty;
    }


    /**
     * Sets the additionalProperty value for this HotBillingRequest.
     * 
     * @param additionalProperty   * It is reserved for future extension
     */
    public void setAdditionalProperty(com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty getAdditionalProperty(int i) {
        return this.additionalProperty[i];
    }

    public void setAdditionalProperty(int i, com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty _value) {
        this.additionalProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HotBillingRequest)) return false;
        HotBillingRequest other = (HotBillingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hotbillingSerialNo==null && other.getHotbillingSerialNo()==null) || 
             (this.hotbillingSerialNo!=null &&
              this.hotbillingSerialNo.equals(other.getHotbillingSerialNo()))) &&
            ((this.demandType==null && other.getDemandType()==null) || 
             (this.demandType!=null &&
              this.demandType.equals(other.getDemandType()))) &&
            ((this.acctAccessCode==null && other.getAcctAccessCode()==null) || 
             (this.acctAccessCode!=null &&
              this.acctAccessCode.equals(other.getAcctAccessCode()))) &&
            ((this.additionalProperty==null && other.getAdditionalProperty()==null) || 
             (this.additionalProperty!=null &&
              java.util.Arrays.equals(this.additionalProperty, other.getAdditionalProperty())));
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
        if (getHotbillingSerialNo() != null) {
            _hashCode += getHotbillingSerialNo().hashCode();
        }
        if (getDemandType() != null) {
            _hashCode += getDemandType().hashCode();
        }
        if (getAcctAccessCode() != null) {
            _hashCode += getAcctAccessCode().hashCode();
        }
        if (getAdditionalProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalProperty(), i);
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
        new org.apache.axis.description.TypeDesc(HotBillingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "HotBillingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotbillingSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "hotbillingSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demandType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "DemandType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AcctAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">HotBillingRequest>AcctAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AdditionalProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SimpleProperty"));
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
