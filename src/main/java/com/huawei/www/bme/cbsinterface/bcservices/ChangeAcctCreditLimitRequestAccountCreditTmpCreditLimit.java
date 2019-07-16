/**
 * ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit  implements java.io.Serializable {
    private java.lang.String opType;

    private java.lang.Long creditInstID;

    private java.lang.Long newTmpLimitAmount;

    private com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime;

    private java.lang.String expirationTime;

    public ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit() {
    }

    public ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit(
           java.lang.String opType,
           java.lang.Long creditInstID,
           java.lang.Long newTmpLimitAmount,
           com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime,
           java.lang.String expirationTime) {
           this.opType = opType;
           this.creditInstID = creditInstID;
           this.newTmpLimitAmount = newTmpLimitAmount;
           this.effectiveTime = effectiveTime;
           this.expirationTime = expirationTime;
    }


    /**
     * Gets the opType value for this ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit.
     * 
     * @return opType
     */
    public java.lang.String getOpType() {
        return opType;
    }


    /**
     * Sets the opType value for this ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit.
     * 
     * @param opType
     */
    public void setOpType(java.lang.String opType) {
        this.opType = opType;
    }


    /**
     * Gets the creditInstID value for this ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit.
     * 
     * @return creditInstID
     */
    public java.lang.Long getCreditInstID() {
        return creditInstID;
    }


    /**
     * Sets the creditInstID value for this ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit.
     * 
     * @param creditInstID
     */
    public void setCreditInstID(java.lang.Long creditInstID) {
        this.creditInstID = creditInstID;
    }


    /**
     * Gets the newTmpLimitAmount value for this ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit.
     * 
     * @return newTmpLimitAmount
     */
    public java.lang.Long getNewTmpLimitAmount() {
        return newTmpLimitAmount;
    }


    /**
     * Sets the newTmpLimitAmount value for this ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit.
     * 
     * @param newTmpLimitAmount
     */
    public void setNewTmpLimitAmount(java.lang.Long newTmpLimitAmount) {
        this.newTmpLimitAmount = newTmpLimitAmount;
    }


    /**
     * Gets the effectiveTime value for this ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit.
     * 
     * @return effectiveTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.EffectMode getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the expirationTime value for this ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit.
     * 
     * @return expirationTime
     */
    public java.lang.String getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(java.lang.String expirationTime) {
        this.expirationTime = expirationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit)) return false;
        ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit other = (ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.opType==null && other.getOpType()==null) || 
             (this.opType!=null &&
              this.opType.equals(other.getOpType()))) &&
            ((this.creditInstID==null && other.getCreditInstID()==null) || 
             (this.creditInstID!=null &&
              this.creditInstID.equals(other.getCreditInstID()))) &&
            ((this.newTmpLimitAmount==null && other.getNewTmpLimitAmount()==null) || 
             (this.newTmpLimitAmount!=null &&
              this.newTmpLimitAmount.equals(other.getNewTmpLimitAmount()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime()))) &&
            ((this.expirationTime==null && other.getExpirationTime()==null) || 
             (this.expirationTime!=null &&
              this.expirationTime.equals(other.getExpirationTime())));
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
        if (getOpType() != null) {
            _hashCode += getOpType().hashCode();
        }
        if (getCreditInstID() != null) {
            _hashCode += getCreditInstID().hashCode();
        }
        if (getNewTmpLimitAmount() != null) {
            _hashCode += getNewTmpLimitAmount().hashCode();
        }
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        if (getExpirationTime() != null) {
            _hashCode += getExpirationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeAcctCreditLimitRequestAccountCreditTmpCreditLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctCreditLimitRequest>AccountCredit>TmpCreditLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OpType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditInstID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreditInstID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newTmpLimitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewTmpLimitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "EffectMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpirationTime"));
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
