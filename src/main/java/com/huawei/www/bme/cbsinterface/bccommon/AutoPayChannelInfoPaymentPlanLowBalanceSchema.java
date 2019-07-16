/**
 * AutoPayChannelInfoPaymentPlanLowBalanceSchema.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class AutoPayChannelInfoPaymentPlanLowBalanceSchema  implements java.io.Serializable {
    private long balanceThreshold;

    private long autoRechargeAmt;

    private java.lang.String controlPeriodType;

    private java.math.BigInteger maxTimes;

    public AutoPayChannelInfoPaymentPlanLowBalanceSchema() {
    }

    public AutoPayChannelInfoPaymentPlanLowBalanceSchema(
           long balanceThreshold,
           long autoRechargeAmt,
           java.lang.String controlPeriodType,
           java.math.BigInteger maxTimes) {
           this.balanceThreshold = balanceThreshold;
           this.autoRechargeAmt = autoRechargeAmt;
           this.controlPeriodType = controlPeriodType;
           this.maxTimes = maxTimes;
    }


    /**
     * Gets the balanceThreshold value for this AutoPayChannelInfoPaymentPlanLowBalanceSchema.
     * 
     * @return balanceThreshold
     */
    public long getBalanceThreshold() {
        return balanceThreshold;
    }


    /**
     * Sets the balanceThreshold value for this AutoPayChannelInfoPaymentPlanLowBalanceSchema.
     * 
     * @param balanceThreshold
     */
    public void setBalanceThreshold(long balanceThreshold) {
        this.balanceThreshold = balanceThreshold;
    }


    /**
     * Gets the autoRechargeAmt value for this AutoPayChannelInfoPaymentPlanLowBalanceSchema.
     * 
     * @return autoRechargeAmt
     */
    public long getAutoRechargeAmt() {
        return autoRechargeAmt;
    }


    /**
     * Sets the autoRechargeAmt value for this AutoPayChannelInfoPaymentPlanLowBalanceSchema.
     * 
     * @param autoRechargeAmt
     */
    public void setAutoRechargeAmt(long autoRechargeAmt) {
        this.autoRechargeAmt = autoRechargeAmt;
    }


    /**
     * Gets the controlPeriodType value for this AutoPayChannelInfoPaymentPlanLowBalanceSchema.
     * 
     * @return controlPeriodType
     */
    public java.lang.String getControlPeriodType() {
        return controlPeriodType;
    }


    /**
     * Sets the controlPeriodType value for this AutoPayChannelInfoPaymentPlanLowBalanceSchema.
     * 
     * @param controlPeriodType
     */
    public void setControlPeriodType(java.lang.String controlPeriodType) {
        this.controlPeriodType = controlPeriodType;
    }


    /**
     * Gets the maxTimes value for this AutoPayChannelInfoPaymentPlanLowBalanceSchema.
     * 
     * @return maxTimes
     */
    public java.math.BigInteger getMaxTimes() {
        return maxTimes;
    }


    /**
     * Sets the maxTimes value for this AutoPayChannelInfoPaymentPlanLowBalanceSchema.
     * 
     * @param maxTimes
     */
    public void setMaxTimes(java.math.BigInteger maxTimes) {
        this.maxTimes = maxTimes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoPayChannelInfoPaymentPlanLowBalanceSchema)) return false;
        AutoPayChannelInfoPaymentPlanLowBalanceSchema other = (AutoPayChannelInfoPaymentPlanLowBalanceSchema) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.balanceThreshold == other.getBalanceThreshold() &&
            this.autoRechargeAmt == other.getAutoRechargeAmt() &&
            ((this.controlPeriodType==null && other.getControlPeriodType()==null) || 
             (this.controlPeriodType!=null &&
              this.controlPeriodType.equals(other.getControlPeriodType()))) &&
            ((this.maxTimes==null && other.getMaxTimes()==null) || 
             (this.maxTimes!=null &&
              this.maxTimes.equals(other.getMaxTimes())));
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
        _hashCode += new Long(getBalanceThreshold()).hashCode();
        _hashCode += new Long(getAutoRechargeAmt()).hashCode();
        if (getControlPeriodType() != null) {
            _hashCode += getControlPeriodType().hashCode();
        }
        if (getMaxTimes() != null) {
            _hashCode += getMaxTimes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoPayChannelInfoPaymentPlanLowBalanceSchema.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">>AutoPayChannelInfo>PaymentPlan>LowBalanceSchema"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BalanceThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRechargeAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AutoRechargeAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlPeriodType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ControlPeriodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTimes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "MaxTimes"));
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
