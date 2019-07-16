/**
 * ChangeGroupOfferingRequestPrimaryOffering.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeGroupOfferingRequestPrimaryOffering  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey oldPrimaryOffering;

    private com.huawei.www.bme.cbsinterface.bccommon.POfferingInst newPrimaryOffering;

    private com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime;

    public ChangeGroupOfferingRequestPrimaryOffering() {
    }

    public ChangeGroupOfferingRequestPrimaryOffering(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey oldPrimaryOffering,
           com.huawei.www.bme.cbsinterface.bccommon.POfferingInst newPrimaryOffering,
           com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
           this.oldPrimaryOffering = oldPrimaryOffering;
           this.newPrimaryOffering = newPrimaryOffering;
           this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the oldPrimaryOffering value for this ChangeGroupOfferingRequestPrimaryOffering.
     * 
     * @return oldPrimaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOldPrimaryOffering() {
        return oldPrimaryOffering;
    }


    /**
     * Sets the oldPrimaryOffering value for this ChangeGroupOfferingRequestPrimaryOffering.
     * 
     * @param oldPrimaryOffering
     */
    public void setOldPrimaryOffering(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey oldPrimaryOffering) {
        this.oldPrimaryOffering = oldPrimaryOffering;
    }


    /**
     * Gets the newPrimaryOffering value for this ChangeGroupOfferingRequestPrimaryOffering.
     * 
     * @return newPrimaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bccommon.POfferingInst getNewPrimaryOffering() {
        return newPrimaryOffering;
    }


    /**
     * Sets the newPrimaryOffering value for this ChangeGroupOfferingRequestPrimaryOffering.
     * 
     * @param newPrimaryOffering
     */
    public void setNewPrimaryOffering(com.huawei.www.bme.cbsinterface.bccommon.POfferingInst newPrimaryOffering) {
        this.newPrimaryOffering = newPrimaryOffering;
    }


    /**
     * Gets the effectiveTime value for this ChangeGroupOfferingRequestPrimaryOffering.
     * 
     * @return effectiveTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.EffectMode getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this ChangeGroupOfferingRequestPrimaryOffering.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeGroupOfferingRequestPrimaryOffering)) return false;
        ChangeGroupOfferingRequestPrimaryOffering other = (ChangeGroupOfferingRequestPrimaryOffering) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldPrimaryOffering==null && other.getOldPrimaryOffering()==null) || 
             (this.oldPrimaryOffering!=null &&
              this.oldPrimaryOffering.equals(other.getOldPrimaryOffering()))) &&
            ((this.newPrimaryOffering==null && other.getNewPrimaryOffering()==null) || 
             (this.newPrimaryOffering!=null &&
              this.newPrimaryOffering.equals(other.getNewPrimaryOffering()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime())));
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
        if (getOldPrimaryOffering() != null) {
            _hashCode += getOldPrimaryOffering().hashCode();
        }
        if (getNewPrimaryOffering() != null) {
            _hashCode += getNewPrimaryOffering().hashCode();
        }
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeGroupOfferingRequestPrimaryOffering.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupOfferingRequest>PrimaryOffering"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPrimaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldPrimaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPrimaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewPrimaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "POfferingInst"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
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
