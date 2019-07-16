/**
 * NewSubscriberRequestSubscriber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class NewSubscriberRequestSubscriber  extends com.huawei.www.bme.cbsinterface.cbs.businessmgr.Subscriber  implements java.io.Serializable {
    private java.lang.String password;

    private java.lang.Integer SCPID;

    private java.lang.Integer CBPID;

    private java.lang.String IMSI2;

    private java.lang.String IMSI3;

    public NewSubscriberRequestSubscriber() {
    }

    public NewSubscriberRequestSubscriber(
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
           java.lang.String password,
           java.lang.Integer SCPID,
           java.lang.Integer CBPID,
           java.lang.String IMSI2,
           java.lang.String IMSI3) {
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
        this.password = password;
        this.SCPID = SCPID;
        this.CBPID = CBPID;
        this.IMSI2 = IMSI2;
        this.IMSI3 = IMSI3;
    }


    /**
     * Gets the password value for this NewSubscriberRequestSubscriber.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this NewSubscriberRequestSubscriber.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the SCPID value for this NewSubscriberRequestSubscriber.
     * 
     * @return SCPID
     */
    public java.lang.Integer getSCPID() {
        return SCPID;
    }


    /**
     * Sets the SCPID value for this NewSubscriberRequestSubscriber.
     * 
     * @param SCPID
     */
    public void setSCPID(java.lang.Integer SCPID) {
        this.SCPID = SCPID;
    }


    /**
     * Gets the CBPID value for this NewSubscriberRequestSubscriber.
     * 
     * @return CBPID
     */
    public java.lang.Integer getCBPID() {
        return CBPID;
    }


    /**
     * Sets the CBPID value for this NewSubscriberRequestSubscriber.
     * 
     * @param CBPID
     */
    public void setCBPID(java.lang.Integer CBPID) {
        this.CBPID = CBPID;
    }


    /**
     * Gets the IMSI2 value for this NewSubscriberRequestSubscriber.
     * 
     * @return IMSI2
     */
    public java.lang.String getIMSI2() {
        return IMSI2;
    }


    /**
     * Sets the IMSI2 value for this NewSubscriberRequestSubscriber.
     * 
     * @param IMSI2
     */
    public void setIMSI2(java.lang.String IMSI2) {
        this.IMSI2 = IMSI2;
    }


    /**
     * Gets the IMSI3 value for this NewSubscriberRequestSubscriber.
     * 
     * @return IMSI3
     */
    public java.lang.String getIMSI3() {
        return IMSI3;
    }


    /**
     * Sets the IMSI3 value for this NewSubscriberRequestSubscriber.
     * 
     * @param IMSI3
     */
    public void setIMSI3(java.lang.String IMSI3) {
        this.IMSI3 = IMSI3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewSubscriberRequestSubscriber)) return false;
        NewSubscriberRequestSubscriber other = (NewSubscriberRequestSubscriber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.SCPID==null && other.getSCPID()==null) || 
             (this.SCPID!=null &&
              this.SCPID.equals(other.getSCPID()))) &&
            ((this.CBPID==null && other.getCBPID()==null) || 
             (this.CBPID!=null &&
              this.CBPID.equals(other.getCBPID()))) &&
            ((this.IMSI2==null && other.getIMSI2()==null) || 
             (this.IMSI2!=null &&
              this.IMSI2.equals(other.getIMSI2()))) &&
            ((this.IMSI3==null && other.getIMSI3()==null) || 
             (this.IMSI3!=null &&
              this.IMSI3.equals(other.getIMSI3())));
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
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getSCPID() != null) {
            _hashCode += getSCPID().hashCode();
        }
        if (getCBPID() != null) {
            _hashCode += getCBPID().hashCode();
        }
        if (getIMSI2() != null) {
            _hashCode += getIMSI2().hashCode();
        }
        if (getIMSI3() != null) {
            _hashCode += getIMSI3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NewSubscriberRequestSubscriber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">NewSubscriberRequest>Subscriber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IMSI2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IMSI3"));
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
