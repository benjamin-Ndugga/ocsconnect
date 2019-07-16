/**
 * ActiveFirstRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class ActiveFirstRequest  implements java.io.Serializable {
    private java.lang.String logID;

    private java.lang.String subscriberNo;

    private java.lang.Integer accessMethod;

    private java.lang.String location;

    private java.lang.Integer IVRLang;

    private java.lang.Integer SMSLang;

    private java.lang.Integer USSDLang;

    private java.lang.String cardPINNumber;

    private java.lang.Integer rechargeAmount;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.SimpleProperty[] simplePropertyList;

    public ActiveFirstRequest() {
    }

    public ActiveFirstRequest(
           java.lang.String logID,
           java.lang.String subscriberNo,
           java.lang.Integer accessMethod,
           java.lang.String location,
           java.lang.Integer IVRLang,
           java.lang.Integer SMSLang,
           java.lang.Integer USSDLang,
           java.lang.String cardPINNumber,
           java.lang.Integer rechargeAmount,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.SimpleProperty[] simplePropertyList) {
           this.logID = logID;
           this.subscriberNo = subscriberNo;
           this.accessMethod = accessMethod;
           this.location = location;
           this.IVRLang = IVRLang;
           this.SMSLang = SMSLang;
           this.USSDLang = USSDLang;
           this.cardPINNumber = cardPINNumber;
           this.rechargeAmount = rechargeAmount;
           this.simplePropertyList = simplePropertyList;
    }


    /**
     * Gets the logID value for this ActiveFirstRequest.
     * 
     * @return logID
     */
    public java.lang.String getLogID() {
        return logID;
    }


    /**
     * Sets the logID value for this ActiveFirstRequest.
     * 
     * @param logID
     */
    public void setLogID(java.lang.String logID) {
        this.logID = logID;
    }


    /**
     * Gets the subscriberNo value for this ActiveFirstRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this ActiveFirstRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the accessMethod value for this ActiveFirstRequest.
     * 
     * @return accessMethod
     */
    public java.lang.Integer getAccessMethod() {
        return accessMethod;
    }


    /**
     * Sets the accessMethod value for this ActiveFirstRequest.
     * 
     * @param accessMethod
     */
    public void setAccessMethod(java.lang.Integer accessMethod) {
        this.accessMethod = accessMethod;
    }


    /**
     * Gets the location value for this ActiveFirstRequest.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ActiveFirstRequest.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the IVRLang value for this ActiveFirstRequest.
     * 
     * @return IVRLang
     */
    public java.lang.Integer getIVRLang() {
        return IVRLang;
    }


    /**
     * Sets the IVRLang value for this ActiveFirstRequest.
     * 
     * @param IVRLang
     */
    public void setIVRLang(java.lang.Integer IVRLang) {
        this.IVRLang = IVRLang;
    }


    /**
     * Gets the SMSLang value for this ActiveFirstRequest.
     * 
     * @return SMSLang
     */
    public java.lang.Integer getSMSLang() {
        return SMSLang;
    }


    /**
     * Sets the SMSLang value for this ActiveFirstRequest.
     * 
     * @param SMSLang
     */
    public void setSMSLang(java.lang.Integer SMSLang) {
        this.SMSLang = SMSLang;
    }


    /**
     * Gets the USSDLang value for this ActiveFirstRequest.
     * 
     * @return USSDLang
     */
    public java.lang.Integer getUSSDLang() {
        return USSDLang;
    }


    /**
     * Sets the USSDLang value for this ActiveFirstRequest.
     * 
     * @param USSDLang
     */
    public void setUSSDLang(java.lang.Integer USSDLang) {
        this.USSDLang = USSDLang;
    }


    /**
     * Gets the cardPINNumber value for this ActiveFirstRequest.
     * 
     * @return cardPINNumber
     */
    public java.lang.String getCardPINNumber() {
        return cardPINNumber;
    }


    /**
     * Sets the cardPINNumber value for this ActiveFirstRequest.
     * 
     * @param cardPINNumber
     */
    public void setCardPINNumber(java.lang.String cardPINNumber) {
        this.cardPINNumber = cardPINNumber;
    }


    /**
     * Gets the rechargeAmount value for this ActiveFirstRequest.
     * 
     * @return rechargeAmount
     */
    public java.lang.Integer getRechargeAmount() {
        return rechargeAmount;
    }


    /**
     * Sets the rechargeAmount value for this ActiveFirstRequest.
     * 
     * @param rechargeAmount
     */
    public void setRechargeAmount(java.lang.Integer rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }


    /**
     * Gets the simplePropertyList value for this ActiveFirstRequest.
     * 
     * @return simplePropertyList
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.SimpleProperty[] getSimplePropertyList() {
        return simplePropertyList;
    }


    /**
     * Sets the simplePropertyList value for this ActiveFirstRequest.
     * 
     * @param simplePropertyList
     */
    public void setSimplePropertyList(com.huawei.www.bme.cbsinterface.cbs.accountmgr.SimpleProperty[] simplePropertyList) {
        this.simplePropertyList = simplePropertyList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActiveFirstRequest)) return false;
        ActiveFirstRequest other = (ActiveFirstRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.logID==null && other.getLogID()==null) || 
             (this.logID!=null &&
              this.logID.equals(other.getLogID()))) &&
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            ((this.accessMethod==null && other.getAccessMethod()==null) || 
             (this.accessMethod!=null &&
              this.accessMethod.equals(other.getAccessMethod()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.IVRLang==null && other.getIVRLang()==null) || 
             (this.IVRLang!=null &&
              this.IVRLang.equals(other.getIVRLang()))) &&
            ((this.SMSLang==null && other.getSMSLang()==null) || 
             (this.SMSLang!=null &&
              this.SMSLang.equals(other.getSMSLang()))) &&
            ((this.USSDLang==null && other.getUSSDLang()==null) || 
             (this.USSDLang!=null &&
              this.USSDLang.equals(other.getUSSDLang()))) &&
            ((this.cardPINNumber==null && other.getCardPINNumber()==null) || 
             (this.cardPINNumber!=null &&
              this.cardPINNumber.equals(other.getCardPINNumber()))) &&
            ((this.rechargeAmount==null && other.getRechargeAmount()==null) || 
             (this.rechargeAmount!=null &&
              this.rechargeAmount.equals(other.getRechargeAmount()))) &&
            ((this.simplePropertyList==null && other.getSimplePropertyList()==null) || 
             (this.simplePropertyList!=null &&
              java.util.Arrays.equals(this.simplePropertyList, other.getSimplePropertyList())));
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
        if (getLogID() != null) {
            _hashCode += getLogID().hashCode();
        }
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        if (getAccessMethod() != null) {
            _hashCode += getAccessMethod().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getIVRLang() != null) {
            _hashCode += getIVRLang().hashCode();
        }
        if (getSMSLang() != null) {
            _hashCode += getSMSLang().hashCode();
        }
        if (getUSSDLang() != null) {
            _hashCode += getUSSDLang().hashCode();
        }
        if (getCardPINNumber() != null) {
            _hashCode += getCardPINNumber().hashCode();
        }
        if (getRechargeAmount() != null) {
            _hashCode += getRechargeAmount().hashCode();
        }
        if (getSimplePropertyList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimplePropertyList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimplePropertyList(), i);
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
        new org.apache.axis.description.TypeDesc(ActiveFirstRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ActiveFirstRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LogID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AccessMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IVRLang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "IVRLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSLang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SMSLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USSDLang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "USSDLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardPINNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CardPINNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "RechargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simplePropertyList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SimplePropertyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SimpleProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SimleProperty"));
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
