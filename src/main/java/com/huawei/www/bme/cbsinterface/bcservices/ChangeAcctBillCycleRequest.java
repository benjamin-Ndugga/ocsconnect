/**
 * ChangeAcctBillCycleRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAcctBillCycleRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccount account;

    private java.lang.String oldBillCycleType;

    private java.lang.String newBillCycleType;

    private com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime;

    public ChangeAcctBillCycleRequest() {
    }

    public ChangeAcctBillCycleRequest(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccount account,
           java.lang.String oldBillCycleType,
           java.lang.String newBillCycleType,
           com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
           this.account = account;
           this.oldBillCycleType = oldBillCycleType;
           this.newBillCycleType = newBillCycleType;
           this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the account value for this ChangeAcctBillCycleRequest.
     * 
     * @return account
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccount getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ChangeAcctBillCycleRequest.
     * 
     * @param account
     */
    public void setAccount(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccount account) {
        this.account = account;
    }


    /**
     * Gets the oldBillCycleType value for this ChangeAcctBillCycleRequest.
     * 
     * @return oldBillCycleType
     */
    public java.lang.String getOldBillCycleType() {
        return oldBillCycleType;
    }


    /**
     * Sets the oldBillCycleType value for this ChangeAcctBillCycleRequest.
     * 
     * @param oldBillCycleType
     */
    public void setOldBillCycleType(java.lang.String oldBillCycleType) {
        this.oldBillCycleType = oldBillCycleType;
    }


    /**
     * Gets the newBillCycleType value for this ChangeAcctBillCycleRequest.
     * 
     * @return newBillCycleType
     */
    public java.lang.String getNewBillCycleType() {
        return newBillCycleType;
    }


    /**
     * Sets the newBillCycleType value for this ChangeAcctBillCycleRequest.
     * 
     * @param newBillCycleType
     */
    public void setNewBillCycleType(java.lang.String newBillCycleType) {
        this.newBillCycleType = newBillCycleType;
    }


    /**
     * Gets the effectiveTime value for this ChangeAcctBillCycleRequest.
     * 
     * @return effectiveTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.EffectMode getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this ChangeAcctBillCycleRequest.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAcctBillCycleRequest)) return false;
        ChangeAcctBillCycleRequest other = (ChangeAcctBillCycleRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.oldBillCycleType==null && other.getOldBillCycleType()==null) || 
             (this.oldBillCycleType!=null &&
              this.oldBillCycleType.equals(other.getOldBillCycleType()))) &&
            ((this.newBillCycleType==null && other.getNewBillCycleType()==null) || 
             (this.newBillCycleType!=null &&
              this.newBillCycleType.equals(other.getNewBillCycleType()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getOldBillCycleType() != null) {
            _hashCode += getOldBillCycleType().hashCode();
        }
        if (getNewBillCycleType() != null) {
            _hashCode += getNewBillCycleType().hashCode();
        }
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeAcctBillCycleRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctBillCycleRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctBillCycleRequest>Account"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldBillCycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldBillCycleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBillCycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewBillCycleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "EffectMode"));
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
