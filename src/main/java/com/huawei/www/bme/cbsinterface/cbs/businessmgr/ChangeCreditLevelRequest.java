/**
 * ChangeCreditLevelRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ChangeCreditLevelRequest  implements java.io.Serializable {
    private java.lang.String subscriberID;

    private java.lang.String subscriberNo;

    private int payModeType;

    private java.lang.Integer creditLevel;

    private int operationType;

    private java.lang.Long credit;

    public ChangeCreditLevelRequest() {
    }

    public ChangeCreditLevelRequest(
           java.lang.String subscriberID,
           java.lang.String subscriberNo,
           int payModeType,
           java.lang.Integer creditLevel,
           int operationType,
           java.lang.Long credit) {
           this.subscriberID = subscriberID;
           this.subscriberNo = subscriberNo;
           this.payModeType = payModeType;
           this.creditLevel = creditLevel;
           this.operationType = operationType;
           this.credit = credit;
    }


    /**
     * Gets the subscriberID value for this ChangeCreditLevelRequest.
     * 
     * @return subscriberID
     */
    public java.lang.String getSubscriberID() {
        return subscriberID;
    }


    /**
     * Sets the subscriberID value for this ChangeCreditLevelRequest.
     * 
     * @param subscriberID
     */
    public void setSubscriberID(java.lang.String subscriberID) {
        this.subscriberID = subscriberID;
    }


    /**
     * Gets the subscriberNo value for this ChangeCreditLevelRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this ChangeCreditLevelRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the payModeType value for this ChangeCreditLevelRequest.
     * 
     * @return payModeType
     */
    public int getPayModeType() {
        return payModeType;
    }


    /**
     * Sets the payModeType value for this ChangeCreditLevelRequest.
     * 
     * @param payModeType
     */
    public void setPayModeType(int payModeType) {
        this.payModeType = payModeType;
    }


    /**
     * Gets the creditLevel value for this ChangeCreditLevelRequest.
     * 
     * @return creditLevel
     */
    public java.lang.Integer getCreditLevel() {
        return creditLevel;
    }


    /**
     * Sets the creditLevel value for this ChangeCreditLevelRequest.
     * 
     * @param creditLevel
     */
    public void setCreditLevel(java.lang.Integer creditLevel) {
        this.creditLevel = creditLevel;
    }


    /**
     * Gets the operationType value for this ChangeCreditLevelRequest.
     * 
     * @return operationType
     */
    public int getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this ChangeCreditLevelRequest.
     * 
     * @param operationType
     */
    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the credit value for this ChangeCreditLevelRequest.
     * 
     * @return credit
     */
    public java.lang.Long getCredit() {
        return credit;
    }


    /**
     * Sets the credit value for this ChangeCreditLevelRequest.
     * 
     * @param credit
     */
    public void setCredit(java.lang.Long credit) {
        this.credit = credit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeCreditLevelRequest)) return false;
        ChangeCreditLevelRequest other = (ChangeCreditLevelRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberID==null && other.getSubscriberID()==null) || 
             (this.subscriberID!=null &&
              this.subscriberID.equals(other.getSubscriberID()))) &&
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            this.payModeType == other.getPayModeType() &&
            ((this.creditLevel==null && other.getCreditLevel()==null) || 
             (this.creditLevel!=null &&
              this.creditLevel.equals(other.getCreditLevel()))) &&
            this.operationType == other.getOperationType() &&
            ((this.credit==null && other.getCredit()==null) || 
             (this.credit!=null &&
              this.credit.equals(other.getCredit())));
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
        if (getSubscriberID() != null) {
            _hashCode += getSubscriberID().hashCode();
        }
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        _hashCode += getPayModeType();
        if (getCreditLevel() != null) {
            _hashCode += getCreditLevel().hashCode();
        }
        _hashCode += getOperationType();
        if (getCredit() != null) {
            _hashCode += getCredit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeCreditLevelRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeCreditLevelRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "subscriberID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "subscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payModeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "PayModeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CreditLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OperationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
