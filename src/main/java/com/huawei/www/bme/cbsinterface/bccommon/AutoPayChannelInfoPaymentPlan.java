/**
 * AutoPayChannelInfoPaymentPlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class AutoPayChannelInfoPaymentPlan  implements java.io.Serializable {
    private java.lang.String autoPayType;

    private com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlanBillCycleSchema billCycleSchema;

    private com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlanTimeSchema timeSchema;

    private com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlanLowBalanceSchema lowBalanceSchema;

    public AutoPayChannelInfoPaymentPlan() {
    }

    public AutoPayChannelInfoPaymentPlan(
           java.lang.String autoPayType,
           com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlanBillCycleSchema billCycleSchema,
           com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlanTimeSchema timeSchema,
           com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlanLowBalanceSchema lowBalanceSchema) {
           this.autoPayType = autoPayType;
           this.billCycleSchema = billCycleSchema;
           this.timeSchema = timeSchema;
           this.lowBalanceSchema = lowBalanceSchema;
    }


    /**
     * Gets the autoPayType value for this AutoPayChannelInfoPaymentPlan.
     * 
     * @return autoPayType
     */
    public java.lang.String getAutoPayType() {
        return autoPayType;
    }


    /**
     * Sets the autoPayType value for this AutoPayChannelInfoPaymentPlan.
     * 
     * @param autoPayType
     */
    public void setAutoPayType(java.lang.String autoPayType) {
        this.autoPayType = autoPayType;
    }


    /**
     * Gets the billCycleSchema value for this AutoPayChannelInfoPaymentPlan.
     * 
     * @return billCycleSchema
     */
    public com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlanBillCycleSchema getBillCycleSchema() {
        return billCycleSchema;
    }


    /**
     * Sets the billCycleSchema value for this AutoPayChannelInfoPaymentPlan.
     * 
     * @param billCycleSchema
     */
    public void setBillCycleSchema(com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlanBillCycleSchema billCycleSchema) {
        this.billCycleSchema = billCycleSchema;
    }


    /**
     * Gets the timeSchema value for this AutoPayChannelInfoPaymentPlan.
     * 
     * @return timeSchema
     */
    public com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlanTimeSchema getTimeSchema() {
        return timeSchema;
    }


    /**
     * Sets the timeSchema value for this AutoPayChannelInfoPaymentPlan.
     * 
     * @param timeSchema
     */
    public void setTimeSchema(com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlanTimeSchema timeSchema) {
        this.timeSchema = timeSchema;
    }


    /**
     * Gets the lowBalanceSchema value for this AutoPayChannelInfoPaymentPlan.
     * 
     * @return lowBalanceSchema
     */
    public com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlanLowBalanceSchema getLowBalanceSchema() {
        return lowBalanceSchema;
    }


    /**
     * Sets the lowBalanceSchema value for this AutoPayChannelInfoPaymentPlan.
     * 
     * @param lowBalanceSchema
     */
    public void setLowBalanceSchema(com.huawei.www.bme.cbsinterface.bccommon.AutoPayChannelInfoPaymentPlanLowBalanceSchema lowBalanceSchema) {
        this.lowBalanceSchema = lowBalanceSchema;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoPayChannelInfoPaymentPlan)) return false;
        AutoPayChannelInfoPaymentPlan other = (AutoPayChannelInfoPaymentPlan) obj;
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
            ((this.billCycleSchema==null && other.getBillCycleSchema()==null) || 
             (this.billCycleSchema!=null &&
              this.billCycleSchema.equals(other.getBillCycleSchema()))) &&
            ((this.timeSchema==null && other.getTimeSchema()==null) || 
             (this.timeSchema!=null &&
              this.timeSchema.equals(other.getTimeSchema()))) &&
            ((this.lowBalanceSchema==null && other.getLowBalanceSchema()==null) || 
             (this.lowBalanceSchema!=null &&
              this.lowBalanceSchema.equals(other.getLowBalanceSchema())));
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
        if (getBillCycleSchema() != null) {
            _hashCode += getBillCycleSchema().hashCode();
        }
        if (getTimeSchema() != null) {
            _hashCode += getTimeSchema().hashCode();
        }
        if (getLowBalanceSchema() != null) {
            _hashCode += getLowBalanceSchema().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoPayChannelInfoPaymentPlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">AutoPayChannelInfo>PaymentPlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPayType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AutoPayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BillCycleSchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">>AutoPayChannelInfo>PaymentPlan>BillCycleSchema"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "TimeSchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">>AutoPayChannelInfo>PaymentPlan>TimeSchema"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowBalanceSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "LowBalanceSchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">>AutoPayChannelInfo>PaymentPlan>LowBalanceSchema"));
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
