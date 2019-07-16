/**
 * ReNewSubscriberRequestSubscriber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ReNewSubscriberRequestSubscriber  extends com.huawei.www.bme.cbsinterface.cbs.businessmgr.Subscriber  implements java.io.Serializable {
    private java.lang.String subscriberNo;

    private java.lang.String password;

    private java.lang.Integer SCPID;

    private java.lang.Integer CBPID;

    public ReNewSubscriberRequestSubscriber() {
    }

    public ReNewSubscriberRequestSubscriber(
           java.lang.String code,
           java.lang.String brandId,
           java.lang.String registrationTime,
           java.lang.String lang,
           java.lang.String SMSLang,
           java.lang.String USSDLang,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.Paymode paidMode,
           java.lang.Integer initialCredit,
           java.lang.String belToAreaID,
           java.lang.String mainProductID,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty,
           java.lang.String lastRechargeTime,
           java.lang.String lastCallTime,
           java.lang.Integer SMSAmount,
           java.lang.String IMSI,
           java.lang.String subscriberNo,
           java.lang.String password,
           java.lang.Integer SCPID,
           java.lang.Integer CBPID) {
        super(
            code,
            brandId,
            registrationTime,
            lang,
            SMSLang,
            USSDLang,
            paidMode,
            initialCredit,
            belToAreaID,
            mainProductID,
            simpleProperty,
            lastRechargeTime,
            lastCallTime,
            SMSAmount,
            IMSI);
        this.subscriberNo = subscriberNo;
        this.password = password;
        this.SCPID = SCPID;
        this.CBPID = CBPID;
    }


    /**
     * Gets the subscriberNo value for this ReNewSubscriberRequestSubscriber.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this ReNewSubscriberRequestSubscriber.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the password value for this ReNewSubscriberRequestSubscriber.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ReNewSubscriberRequestSubscriber.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the SCPID value for this ReNewSubscriberRequestSubscriber.
     * 
     * @return SCPID
     */
    public java.lang.Integer getSCPID() {
        return SCPID;
    }


    /**
     * Sets the SCPID value for this ReNewSubscriberRequestSubscriber.
     * 
     * @param SCPID
     */
    public void setSCPID(java.lang.Integer SCPID) {
        this.SCPID = SCPID;
    }


    /**
     * Gets the CBPID value for this ReNewSubscriberRequestSubscriber.
     * 
     * @return CBPID
     */
    public java.lang.Integer getCBPID() {
        return CBPID;
    }


    /**
     * Sets the CBPID value for this ReNewSubscriberRequestSubscriber.
     * 
     * @param CBPID
     */
    public void setCBPID(java.lang.Integer CBPID) {
        this.CBPID = CBPID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReNewSubscriberRequestSubscriber)) return false;
        ReNewSubscriberRequestSubscriber other = (ReNewSubscriberRequestSubscriber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.SCPID==null && other.getSCPID()==null) || 
             (this.SCPID!=null &&
              this.SCPID.equals(other.getSCPID()))) &&
            ((this.CBPID==null && other.getCBPID()==null) || 
             (this.CBPID!=null &&
              this.CBPID.equals(other.getCBPID())));
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
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getSCPID() != null) {
            _hashCode += getSCPID().hashCode();
        }
        if (getCBPID() != null) {
            _hashCode += getCBPID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReNewSubscriberRequestSubscriber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ReNewSubscriberRequest>Subscriber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
