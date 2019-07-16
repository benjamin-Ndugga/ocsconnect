/**
 * SuspendRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class SuspendRequest  extends com.huawei.www.bme.cbsinterface.cbs.businessmgr.Common  implements java.io.Serializable {
    private java.lang.Integer suspendDays;

    private java.lang.Integer initiateType;

    private java.lang.Integer handlingChargeFlag;

    public SuspendRequest() {
    }

    public SuspendRequest(
           java.lang.String subscriberNo,
           java.lang.Integer suspendDays,
           java.lang.Integer initiateType,
           java.lang.Integer handlingChargeFlag) {
        super(
            subscriberNo);
        this.suspendDays = suspendDays;
        this.initiateType = initiateType;
        this.handlingChargeFlag = handlingChargeFlag;
    }


    /**
     * Gets the suspendDays value for this SuspendRequest.
     * 
     * @return suspendDays
     */
    public java.lang.Integer getSuspendDays() {
        return suspendDays;
    }


    /**
     * Sets the suspendDays value for this SuspendRequest.
     * 
     * @param suspendDays
     */
    public void setSuspendDays(java.lang.Integer suspendDays) {
        this.suspendDays = suspendDays;
    }


    /**
     * Gets the initiateType value for this SuspendRequest.
     * 
     * @return initiateType
     */
    public java.lang.Integer getInitiateType() {
        return initiateType;
    }


    /**
     * Sets the initiateType value for this SuspendRequest.
     * 
     * @param initiateType
     */
    public void setInitiateType(java.lang.Integer initiateType) {
        this.initiateType = initiateType;
    }


    /**
     * Gets the handlingChargeFlag value for this SuspendRequest.
     * 
     * @return handlingChargeFlag
     */
    public java.lang.Integer getHandlingChargeFlag() {
        return handlingChargeFlag;
    }


    /**
     * Sets the handlingChargeFlag value for this SuspendRequest.
     * 
     * @param handlingChargeFlag
     */
    public void setHandlingChargeFlag(java.lang.Integer handlingChargeFlag) {
        this.handlingChargeFlag = handlingChargeFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuspendRequest)) return false;
        SuspendRequest other = (SuspendRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.suspendDays==null && other.getSuspendDays()==null) || 
             (this.suspendDays!=null &&
              this.suspendDays.equals(other.getSuspendDays()))) &&
            ((this.initiateType==null && other.getInitiateType()==null) || 
             (this.initiateType!=null &&
              this.initiateType.equals(other.getInitiateType()))) &&
            ((this.handlingChargeFlag==null && other.getHandlingChargeFlag()==null) || 
             (this.handlingChargeFlag!=null &&
              this.handlingChargeFlag.equals(other.getHandlingChargeFlag())));
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
        if (getSuspendDays() != null) {
            _hashCode += getSuspendDays().hashCode();
        }
        if (getInitiateType() != null) {
            _hashCode += getInitiateType().hashCode();
        }
        if (getHandlingChargeFlag() != null) {
            _hashCode += getHandlingChargeFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SuspendRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SuspendRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SuspendDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "InitiateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingChargeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "HandlingChargeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
