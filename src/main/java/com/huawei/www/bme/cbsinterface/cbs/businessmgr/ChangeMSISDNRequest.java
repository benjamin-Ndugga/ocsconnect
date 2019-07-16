/**
 * ChangeMSISDNRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ChangeMSISDNRequest  implements java.io.Serializable {
    private java.lang.String subscriberNo;

    private java.lang.String newSubscriberNo;

    private java.lang.Integer SCPID;

    private java.lang.Integer CBPID;

    private java.lang.Integer AIP;

    private java.lang.Integer handlingChargeFlag;

    public ChangeMSISDNRequest() {
    }

    public ChangeMSISDNRequest(
           java.lang.String subscriberNo,
           java.lang.String newSubscriberNo,
           java.lang.Integer SCPID,
           java.lang.Integer CBPID,
           java.lang.Integer AIP,
           java.lang.Integer handlingChargeFlag) {
           this.subscriberNo = subscriberNo;
           this.newSubscriberNo = newSubscriberNo;
           this.SCPID = SCPID;
           this.CBPID = CBPID;
           this.AIP = AIP;
           this.handlingChargeFlag = handlingChargeFlag;
    }


    /**
     * Gets the subscriberNo value for this ChangeMSISDNRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this ChangeMSISDNRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the newSubscriberNo value for this ChangeMSISDNRequest.
     * 
     * @return newSubscriberNo
     */
    public java.lang.String getNewSubscriberNo() {
        return newSubscriberNo;
    }


    /**
     * Sets the newSubscriberNo value for this ChangeMSISDNRequest.
     * 
     * @param newSubscriberNo
     */
    public void setNewSubscriberNo(java.lang.String newSubscriberNo) {
        this.newSubscriberNo = newSubscriberNo;
    }


    /**
     * Gets the SCPID value for this ChangeMSISDNRequest.
     * 
     * @return SCPID
     */
    public java.lang.Integer getSCPID() {
        return SCPID;
    }


    /**
     * Sets the SCPID value for this ChangeMSISDNRequest.
     * 
     * @param SCPID
     */
    public void setSCPID(java.lang.Integer SCPID) {
        this.SCPID = SCPID;
    }


    /**
     * Gets the CBPID value for this ChangeMSISDNRequest.
     * 
     * @return CBPID
     */
    public java.lang.Integer getCBPID() {
        return CBPID;
    }


    /**
     * Sets the CBPID value for this ChangeMSISDNRequest.
     * 
     * @param CBPID
     */
    public void setCBPID(java.lang.Integer CBPID) {
        this.CBPID = CBPID;
    }


    /**
     * Gets the AIP value for this ChangeMSISDNRequest.
     * 
     * @return AIP
     */
    public java.lang.Integer getAIP() {
        return AIP;
    }


    /**
     * Sets the AIP value for this ChangeMSISDNRequest.
     * 
     * @param AIP
     */
    public void setAIP(java.lang.Integer AIP) {
        this.AIP = AIP;
    }


    /**
     * Gets the handlingChargeFlag value for this ChangeMSISDNRequest.
     * 
     * @return handlingChargeFlag
     */
    public java.lang.Integer getHandlingChargeFlag() {
        return handlingChargeFlag;
    }


    /**
     * Sets the handlingChargeFlag value for this ChangeMSISDNRequest.
     * 
     * @param handlingChargeFlag
     */
    public void setHandlingChargeFlag(java.lang.Integer handlingChargeFlag) {
        this.handlingChargeFlag = handlingChargeFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeMSISDNRequest)) return false;
        ChangeMSISDNRequest other = (ChangeMSISDNRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            ((this.newSubscriberNo==null && other.getNewSubscriberNo()==null) || 
             (this.newSubscriberNo!=null &&
              this.newSubscriberNo.equals(other.getNewSubscriberNo()))) &&
            ((this.SCPID==null && other.getSCPID()==null) || 
             (this.SCPID!=null &&
              this.SCPID.equals(other.getSCPID()))) &&
            ((this.CBPID==null && other.getCBPID()==null) || 
             (this.CBPID!=null &&
              this.CBPID.equals(other.getCBPID()))) &&
            ((this.AIP==null && other.getAIP()==null) || 
             (this.AIP!=null &&
              this.AIP.equals(other.getAIP()))) &&
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
        int _hashCode = 1;
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        if (getNewSubscriberNo() != null) {
            _hashCode += getNewSubscriberNo().hashCode();
        }
        if (getSCPID() != null) {
            _hashCode += getSCPID().hashCode();
        }
        if (getCBPID() != null) {
            _hashCode += getCBPID().hashCode();
        }
        if (getAIP() != null) {
            _hashCode += getAIP().hashCode();
        }
        if (getHandlingChargeFlag() != null) {
            _hashCode += getHandlingChargeFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeMSISDNRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeMSISDNRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSubscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewSubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCPID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SCPID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CBPID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CBPID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "AIP"));
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
