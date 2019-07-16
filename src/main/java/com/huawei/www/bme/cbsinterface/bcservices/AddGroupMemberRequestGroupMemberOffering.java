/**
 * AddGroupMemberRequestGroupMemberOffering.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class AddGroupMemberRequestGroupMemberOffering  extends com.huawei.www.bme.cbsinterface.bccommon.OfferingInst  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.ActiveMode activationTime;

    public AddGroupMemberRequestGroupMemberOffering() {
    }

    public AddGroupMemberRequestGroupMemberOffering(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           java.lang.String bundledFlag,
           java.lang.String offeringClass,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey parentOfferingKey,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey relGOfferingKey,
           java.lang.String status,
           java.lang.String trialStartTime,
           java.lang.String trialEndTime,
           com.huawei.www.bme.cbsinterface.bccommon.ProductInst[] productInst,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingInstOInstProperty[] OInstProperty,
           com.huawei.www.bme.cbsinterface.bccommon.ActiveMode activationTime) {
        super(
            offeringKey,
            bundledFlag,
            offeringClass,
            parentOfferingKey,
            relGOfferingKey,
            status,
            trialStartTime,
            trialEndTime,
            productInst,
            OInstProperty);
        this.activationTime = activationTime;
    }


    /**
     * Gets the activationTime value for this AddGroupMemberRequestGroupMemberOffering.
     * 
     * @return activationTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.ActiveMode getActivationTime() {
        return activationTime;
    }


    /**
     * Sets the activationTime value for this AddGroupMemberRequestGroupMemberOffering.
     * 
     * @param activationTime
     */
    public void setActivationTime(com.huawei.www.bme.cbsinterface.bccommon.ActiveMode activationTime) {
        this.activationTime = activationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddGroupMemberRequestGroupMemberOffering)) return false;
        AddGroupMemberRequestGroupMemberOffering other = (AddGroupMemberRequestGroupMemberOffering) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activationTime==null && other.getActivationTime()==null) || 
             (this.activationTime!=null &&
              this.activationTime.equals(other.getActivationTime())));
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
        if (getActivationTime() != null) {
            _hashCode += getActivationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddGroupMemberRequestGroupMemberOffering.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">AddGroupMemberRequest>GroupMemberOffering"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ActivationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ActiveMode"));
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
