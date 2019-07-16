/**
 * AutoPaymentPlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class AutoPaymentPlan  implements java.io.Serializable {
    /* B: billing cycle pay
     * R: real time pay(Credit Control Trigger) */
    private java.lang.String autoPayType;

    private java.lang.String paymentObjectType;

    private java.lang.String paymentObjectID;

    private java.lang.String paymentDate;

    private java.lang.Long amount;

    private java.math.BigInteger limitTimes;

    public AutoPaymentPlan() {
    }

    public AutoPaymentPlan(
           java.lang.String autoPayType,
           java.lang.String paymentObjectType,
           java.lang.String paymentObjectID,
           java.lang.String paymentDate,
           java.lang.Long amount,
           java.math.BigInteger limitTimes) {
           this.autoPayType = autoPayType;
           this.paymentObjectType = paymentObjectType;
           this.paymentObjectID = paymentObjectID;
           this.paymentDate = paymentDate;
           this.amount = amount;
           this.limitTimes = limitTimes;
    }


    /**
     * Gets the autoPayType value for this AutoPaymentPlan.
     * 
     * @return autoPayType   * B: billing cycle pay
     * R: real time pay(Credit Control Trigger)
     */
    public java.lang.String getAutoPayType() {
        return autoPayType;
    }


    /**
     * Sets the autoPayType value for this AutoPaymentPlan.
     * 
     * @param autoPayType   * B: billing cycle pay
     * R: real time pay(Credit Control Trigger)
     */
    public void setAutoPayType(java.lang.String autoPayType) {
        this.autoPayType = autoPayType;
    }


    /**
     * Gets the paymentObjectType value for this AutoPaymentPlan.
     * 
     * @return paymentObjectType
     */
    public java.lang.String getPaymentObjectType() {
        return paymentObjectType;
    }


    /**
     * Sets the paymentObjectType value for this AutoPaymentPlan.
     * 
     * @param paymentObjectType
     */
    public void setPaymentObjectType(java.lang.String paymentObjectType) {
        this.paymentObjectType = paymentObjectType;
    }


    /**
     * Gets the paymentObjectID value for this AutoPaymentPlan.
     * 
     * @return paymentObjectID
     */
    public java.lang.String getPaymentObjectID() {
        return paymentObjectID;
    }


    /**
     * Sets the paymentObjectID value for this AutoPaymentPlan.
     * 
     * @param paymentObjectID
     */
    public void setPaymentObjectID(java.lang.String paymentObjectID) {
        this.paymentObjectID = paymentObjectID;
    }


    /**
     * Gets the paymentDate value for this AutoPaymentPlan.
     * 
     * @return paymentDate
     */
    public java.lang.String getPaymentDate() {
        return paymentDate;
    }


    /**
     * Sets the paymentDate value for this AutoPaymentPlan.
     * 
     * @param paymentDate
     */
    public void setPaymentDate(java.lang.String paymentDate) {
        this.paymentDate = paymentDate;
    }


    /**
     * Gets the amount value for this AutoPaymentPlan.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AutoPaymentPlan.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the limitTimes value for this AutoPaymentPlan.
     * 
     * @return limitTimes
     */
    public java.math.BigInteger getLimitTimes() {
        return limitTimes;
    }


    /**
     * Sets the limitTimes value for this AutoPaymentPlan.
     * 
     * @param limitTimes
     */
    public void setLimitTimes(java.math.BigInteger limitTimes) {
        this.limitTimes = limitTimes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoPaymentPlan)) return false;
        AutoPaymentPlan other = (AutoPaymentPlan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoPayType==null && other.getAutoPayType()==null) || 
             (this.autoPayType!=null &&
              this.autoPayType.equals(other.getAutoPayType()))) &&
            ((this.paymentObjectType==null && other.getPaymentObjectType()==null) || 
             (this.paymentObjectType!=null &&
              this.paymentObjectType.equals(other.getPaymentObjectType()))) &&
            ((this.paymentObjectID==null && other.getPaymentObjectID()==null) || 
             (this.paymentObjectID!=null &&
              this.paymentObjectID.equals(other.getPaymentObjectID()))) &&
            ((this.paymentDate==null && other.getPaymentDate()==null) || 
             (this.paymentDate!=null &&
              this.paymentDate.equals(other.getPaymentDate()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.limitTimes==null && other.getLimitTimes()==null) || 
             (this.limitTimes!=null &&
              this.limitTimes.equals(other.getLimitTimes())));
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
        if (getAutoPayType() != null) {
            _hashCode += getAutoPayType().hashCode();
        }
        if (getPaymentObjectType() != null) {
            _hashCode += getPaymentObjectType().hashCode();
        }
        if (getPaymentObjectID() != null) {
            _hashCode += getPaymentObjectID().hashCode();
        }
        if (getPaymentDate() != null) {
            _hashCode += getPaymentDate().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getLimitTimes() != null) {
            _hashCode += getLimitTimes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoPaymentPlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AutoPaymentPlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPayType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AutoPayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentObjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PaymentObjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentObjectID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PaymentObjectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PaymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitTimes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "LimitTimes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
