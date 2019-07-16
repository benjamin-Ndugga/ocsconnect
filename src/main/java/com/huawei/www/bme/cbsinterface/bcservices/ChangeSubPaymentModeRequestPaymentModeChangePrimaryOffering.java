/**
 * ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey oldPrimaryOffering;

    private com.huawei.www.bme.cbsinterface.bccommon.POfferingInst newPrimaryOffering;

    private java.lang.String newBrand;

    public ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering() {
    }

    public ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey oldPrimaryOffering,
           com.huawei.www.bme.cbsinterface.bccommon.POfferingInst newPrimaryOffering,
           java.lang.String newBrand) {
           this.oldPrimaryOffering = oldPrimaryOffering;
           this.newPrimaryOffering = newPrimaryOffering;
           this.newBrand = newBrand;
    }


    /**
     * Gets the oldPrimaryOffering value for this ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering.
     * 
     * @return oldPrimaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOldPrimaryOffering() {
        return oldPrimaryOffering;
    }


    /**
     * Sets the oldPrimaryOffering value for this ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering.
     * 
     * @param oldPrimaryOffering
     */
    public void setOldPrimaryOffering(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey oldPrimaryOffering) {
        this.oldPrimaryOffering = oldPrimaryOffering;
    }


    /**
     * Gets the newPrimaryOffering value for this ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering.
     * 
     * @return newPrimaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bccommon.POfferingInst getNewPrimaryOffering() {
        return newPrimaryOffering;
    }


    /**
     * Sets the newPrimaryOffering value for this ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering.
     * 
     * @param newPrimaryOffering
     */
    public void setNewPrimaryOffering(com.huawei.www.bme.cbsinterface.bccommon.POfferingInst newPrimaryOffering) {
        this.newPrimaryOffering = newPrimaryOffering;
    }


    /**
     * Gets the newBrand value for this ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering.
     * 
     * @return newBrand
     */
    public java.lang.String getNewBrand() {
        return newBrand;
    }


    /**
     * Sets the newBrand value for this ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering.
     * 
     * @param newBrand
     */
    public void setNewBrand(java.lang.String newBrand) {
        this.newBrand = newBrand;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering)) return false;
        ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering other = (ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering) obj;
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
            ((this.newBrand==null && other.getNewBrand()==null) || 
             (this.newBrand!=null &&
              this.newBrand.equals(other.getNewBrand())));
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
        if (getNewBrand() != null) {
            _hashCode += getNewBrand().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubPaymentModeRequestPaymentModeChangePrimaryOffering.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubPaymentModeRequest>PaymentModeChange>PrimaryOffering"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPrimaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldPrimaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPrimaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewPrimaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "POfferingInst"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBrand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewBrand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
