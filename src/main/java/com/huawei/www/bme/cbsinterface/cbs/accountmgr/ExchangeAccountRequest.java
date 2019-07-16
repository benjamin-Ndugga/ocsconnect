/**
 * ExchangeAccountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class ExchangeAccountRequest  implements java.io.Serializable {
    private java.lang.String logId;

    private java.lang.String subscriberNo;

    private int oriAccountType;

    private java.lang.Long oriAccountKey;

    private int desAccountType;

    private java.lang.Long desAccountKey;

    private int ammount;

    private java.lang.Integer handlingChargeFlag;

    private java.lang.String custID;

    public ExchangeAccountRequest() {
    }

    public ExchangeAccountRequest(
           java.lang.String logId,
           java.lang.String subscriberNo,
           int oriAccountType,
           java.lang.Long oriAccountKey,
           int desAccountType,
           java.lang.Long desAccountKey,
           int ammount,
           java.lang.Integer handlingChargeFlag,
           java.lang.String custID) {
           this.logId = logId;
           this.subscriberNo = subscriberNo;
           this.oriAccountType = oriAccountType;
           this.oriAccountKey = oriAccountKey;
           this.desAccountType = desAccountType;
           this.desAccountKey = desAccountKey;
           this.ammount = ammount;
           this.handlingChargeFlag = handlingChargeFlag;
           this.custID = custID;
    }


    /**
     * Gets the logId value for this ExchangeAccountRequest.
     * 
     * @return logId
     */
    public java.lang.String getLogId() {
        return logId;
    }


    /**
     * Sets the logId value for this ExchangeAccountRequest.
     * 
     * @param logId
     */
    public void setLogId(java.lang.String logId) {
        this.logId = logId;
    }


    /**
     * Gets the subscriberNo value for this ExchangeAccountRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this ExchangeAccountRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the oriAccountType value for this ExchangeAccountRequest.
     * 
     * @return oriAccountType
     */
    public int getOriAccountType() {
        return oriAccountType;
    }


    /**
     * Sets the oriAccountType value for this ExchangeAccountRequest.
     * 
     * @param oriAccountType
     */
    public void setOriAccountType(int oriAccountType) {
        this.oriAccountType = oriAccountType;
    }


    /**
     * Gets the oriAccountKey value for this ExchangeAccountRequest.
     * 
     * @return oriAccountKey
     */
    public java.lang.Long getOriAccountKey() {
        return oriAccountKey;
    }


    /**
     * Sets the oriAccountKey value for this ExchangeAccountRequest.
     * 
     * @param oriAccountKey
     */
    public void setOriAccountKey(java.lang.Long oriAccountKey) {
        this.oriAccountKey = oriAccountKey;
    }


    /**
     * Gets the desAccountType value for this ExchangeAccountRequest.
     * 
     * @return desAccountType
     */
    public int getDesAccountType() {
        return desAccountType;
    }


    /**
     * Sets the desAccountType value for this ExchangeAccountRequest.
     * 
     * @param desAccountType
     */
    public void setDesAccountType(int desAccountType) {
        this.desAccountType = desAccountType;
    }


    /**
     * Gets the desAccountKey value for this ExchangeAccountRequest.
     * 
     * @return desAccountKey
     */
    public java.lang.Long getDesAccountKey() {
        return desAccountKey;
    }


    /**
     * Sets the desAccountKey value for this ExchangeAccountRequest.
     * 
     * @param desAccountKey
     */
    public void setDesAccountKey(java.lang.Long desAccountKey) {
        this.desAccountKey = desAccountKey;
    }


    /**
     * Gets the ammount value for this ExchangeAccountRequest.
     * 
     * @return ammount
     */
    public int getAmmount() {
        return ammount;
    }


    /**
     * Sets the ammount value for this ExchangeAccountRequest.
     * 
     * @param ammount
     */
    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }


    /**
     * Gets the handlingChargeFlag value for this ExchangeAccountRequest.
     * 
     * @return handlingChargeFlag
     */
    public java.lang.Integer getHandlingChargeFlag() {
        return handlingChargeFlag;
    }


    /**
     * Sets the handlingChargeFlag value for this ExchangeAccountRequest.
     * 
     * @param handlingChargeFlag
     */
    public void setHandlingChargeFlag(java.lang.Integer handlingChargeFlag) {
        this.handlingChargeFlag = handlingChargeFlag;
    }


    /**
     * Gets the custID value for this ExchangeAccountRequest.
     * 
     * @return custID
     */
    public java.lang.String getCustID() {
        return custID;
    }


    /**
     * Sets the custID value for this ExchangeAccountRequest.
     * 
     * @param custID
     */
    public void setCustID(java.lang.String custID) {
        this.custID = custID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExchangeAccountRequest)) return false;
        ExchangeAccountRequest other = (ExchangeAccountRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.logId==null && other.getLogId()==null) || 
             (this.logId!=null &&
              this.logId.equals(other.getLogId()))) &&
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            this.oriAccountType == other.getOriAccountType() &&
            ((this.oriAccountKey==null && other.getOriAccountKey()==null) || 
             (this.oriAccountKey!=null &&
              this.oriAccountKey.equals(other.getOriAccountKey()))) &&
            this.desAccountType == other.getDesAccountType() &&
            ((this.desAccountKey==null && other.getDesAccountKey()==null) || 
             (this.desAccountKey!=null &&
              this.desAccountKey.equals(other.getDesAccountKey()))) &&
            this.ammount == other.getAmmount() &&
            ((this.handlingChargeFlag==null && other.getHandlingChargeFlag()==null) || 
             (this.handlingChargeFlag!=null &&
              this.handlingChargeFlag.equals(other.getHandlingChargeFlag()))) &&
            ((this.custID==null && other.getCustID()==null) || 
             (this.custID!=null &&
              this.custID.equals(other.getCustID())));
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
        if (getLogId() != null) {
            _hashCode += getLogId().hashCode();
        }
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        _hashCode += getOriAccountType();
        if (getOriAccountKey() != null) {
            _hashCode += getOriAccountKey().hashCode();
        }
        _hashCode += getDesAccountType();
        if (getDesAccountKey() != null) {
            _hashCode += getDesAccountKey().hashCode();
        }
        _hashCode += getAmmount();
        if (getHandlingChargeFlag() != null) {
            _hashCode += getHandlingChargeFlag().hashCode();
        }
        if (getCustID() != null) {
            _hashCode += getCustID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExchangeAccountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ExchangeAccountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LogId"));
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
        elemField.setFieldName("oriAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OriAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oriAccountKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OriAccountKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "DesAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desAccountKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "DesAccountKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ammount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Ammount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingChargeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "HandlingChargeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CustID"));
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
