/**
 * ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty  extends com.huawei.www.bme.cbsinterface.bccommon.InstProperty  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.EffectMode expirationTime;

    public ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty() {
    }

    public ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty(
           java.lang.String propCode,
           java.lang.String propType,
           java.lang.String value,
           com.huawei.www.bme.cbsinterface.bccommon.InstPropertySubPropInst[] subPropInst,
           com.huawei.www.bme.cbsinterface.bccommon.EffectMode expirationTime) {
        super(
            propCode,
            propType,
            value,
            subPropInst);
        this.expirationTime = expirationTime;
    }


    /**
     * Gets the expirationTime value for this ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty.
     * 
     * @return expirationTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.EffectMode getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(com.huawei.www.bme.cbsinterface.bccommon.EffectMode expirationTime) {
        this.expirationTime = expirationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty)) return false;
        ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty other = (ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expirationTime==null && other.getExpirationTime()==null) || 
             (this.expirationTime!=null &&
              this.expirationTime.equals(other.getExpirationTime())));
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
        if (getExpirationTime() != null) {
            _hashCode += getExpirationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeOfferingPropertyRequestOfferingInstProductInstDelProperty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeOfferingPropertyRequest>OfferingInst>ProductInst>DelProperty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpirationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "EffectMode"));
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
