/**
 * BatchOperationRequestBatchNewSubscriberSubscriber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class BatchOperationRequestBatchNewSubscriberSubscriber  extends com.huawei.www.bme.cbsinterface.cbs.businessmgr.SubscriberBasic  implements java.io.Serializable {
    private java.lang.Integer CBPID;

    private java.lang.Integer SCPID;

    private java.lang.String password;

    public BatchOperationRequestBatchNewSubscriberSubscriber() {
    }

    public BatchOperationRequestBatchNewSubscriberSubscriber(
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
           java.lang.Integer CBPID,
           java.lang.Integer SCPID,
           java.lang.String password) {
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
            SMSAmount);
        this.CBPID = CBPID;
        this.SCPID = SCPID;
        this.password = password;
    }


    /**
     * Gets the CBPID value for this BatchOperationRequestBatchNewSubscriberSubscriber.
     * 
     * @return CBPID
     */
    public java.lang.Integer getCBPID() {
        return CBPID;
    }


    /**
     * Sets the CBPID value for this BatchOperationRequestBatchNewSubscriberSubscriber.
     * 
     * @param CBPID
     */
    public void setCBPID(java.lang.Integer CBPID) {
        this.CBPID = CBPID;
    }


    /**
     * Gets the SCPID value for this BatchOperationRequestBatchNewSubscriberSubscriber.
     * 
     * @return SCPID
     */
    public java.lang.Integer getSCPID() {
        return SCPID;
    }


    /**
     * Sets the SCPID value for this BatchOperationRequestBatchNewSubscriberSubscriber.
     * 
     * @param SCPID
     */
    public void setSCPID(java.lang.Integer SCPID) {
        this.SCPID = SCPID;
    }


    /**
     * Gets the password value for this BatchOperationRequestBatchNewSubscriberSubscriber.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this BatchOperationRequestBatchNewSubscriberSubscriber.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchOperationRequestBatchNewSubscriberSubscriber)) return false;
        BatchOperationRequestBatchNewSubscriberSubscriber other = (BatchOperationRequestBatchNewSubscriberSubscriber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.CBPID==null && other.getCBPID()==null) || 
             (this.CBPID!=null &&
              this.CBPID.equals(other.getCBPID()))) &&
            ((this.SCPID==null && other.getSCPID()==null) || 
             (this.SCPID!=null &&
              this.SCPID.equals(other.getSCPID()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword())));
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
        if (getCBPID() != null) {
            _hashCode += getCBPID().hashCode();
        }
        if (getSCPID() != null) {
            _hashCode += getSCPID().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchOperationRequestBatchNewSubscriberSubscriber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>BatchOperationRequest>BatchNewSubscriber>Subscriber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CBPID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CBPID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Password"));
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
