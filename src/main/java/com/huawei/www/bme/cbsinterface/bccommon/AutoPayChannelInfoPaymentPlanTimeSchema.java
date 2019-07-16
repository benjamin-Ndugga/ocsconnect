/**
 * AutoPayChannelInfoPaymentPlanTimeSchema.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class AutoPayChannelInfoPaymentPlanTimeSchema  implements java.io.Serializable {
    private java.lang.String periodType;

    private java.lang.String autoRechargeDate;

    private long autoRechargeAmt;

    public AutoPayChannelInfoPaymentPlanTimeSchema() {
    }

    public AutoPayChannelInfoPaymentPlanTimeSchema(
           java.lang.String periodType,
           java.lang.String autoRechargeDate,
           long autoRechargeAmt) {
           this.periodType = periodType;
           this.autoRechargeDate = autoRechargeDate;
           this.autoRechargeAmt = autoRechargeAmt;
    }


    /**
     * Gets the periodType value for this AutoPayChannelInfoPaymentPlanTimeSchema.
     * 
     * @return periodType
     */
    public java.lang.String getPeriodType() {
        return periodType;
    }


    /**
     * Sets the periodType value for this AutoPayChannelInfoPaymentPlanTimeSchema.
     * 
     * @param periodType
     */
    public void setPeriodType(java.lang.String periodType) {
        this.periodType = periodType;
    }


    /**
     * Gets the autoRechargeDate value for this AutoPayChannelInfoPaymentPlanTimeSchema.
     * 
     * @return autoRechargeDate
     */
    public java.lang.String getAutoRechargeDate() {
        return autoRechargeDate;
    }


    /**
     * Sets the autoRechargeDate value for this AutoPayChannelInfoPaymentPlanTimeSchema.
     * 
     * @param autoRechargeDate
     */
    public void setAutoRechargeDate(java.lang.String autoRechargeDate) {
        this.autoRechargeDate = autoRechargeDate;
    }


    /**
     * Gets the autoRechargeAmt value for this AutoPayChannelInfoPaymentPlanTimeSchema.
     * 
     * @return autoRechargeAmt
     */
    public long getAutoRechargeAmt() {
        return autoRechargeAmt;
    }


    /**
     * Sets the autoRechargeAmt value for this AutoPayChannelInfoPaymentPlanTimeSchema.
     * 
     * @param autoRechargeAmt
     */
    public void setAutoRechargeAmt(long autoRechargeAmt) {
        this.autoRechargeAmt = autoRechargeAmt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoPayChannelInfoPaymentPlanTimeSchema)) return false;
        AutoPayChannelInfoPaymentPlanTimeSchema other = (AutoPayChannelInfoPaymentPlanTimeSchema) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.periodType==null && other.getPeriodType()==null) || 
             (this.periodType!=null &&
              this.periodType.equals(other.getPeriodType()))) &&
            ((this.autoRechargeDate==null && other.getAutoRechargeDate()==null) || 
             (this.autoRechargeDate!=null &&
              this.autoRechargeDate.equals(other.getAutoRechargeDate()))) &&
            this.autoRechargeAmt == other.getAutoRechargeAmt();
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
        if (getPeriodType() != null) {
            _hashCode += getPeriodType().hashCode();
        }
        if (getAutoRechargeDate() != null) {
            _hashCode += getAutoRechargeDate().hashCode();
        }
        _hashCode += new Long(getAutoRechargeAmt()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoPayChannelInfoPaymentPlanTimeSchema.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">>AutoPayChannelInfo>PaymentPlan>TimeSchema"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PeriodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRechargeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AutoRechargeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRechargeAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AutoRechargeAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
