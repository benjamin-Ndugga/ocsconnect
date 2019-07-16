/**
 * AutoPayChannelInfoPaymentPlanBillCycleSchema.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class AutoPayChannelInfoPaymentPlanBillCycleSchema  implements java.io.Serializable {
    private java.lang.String autoPayDate;

    private java.lang.Long autoPayMaxAmt;

    public AutoPayChannelInfoPaymentPlanBillCycleSchema() {
    }

    public AutoPayChannelInfoPaymentPlanBillCycleSchema(
           java.lang.String autoPayDate,
           java.lang.Long autoPayMaxAmt) {
           this.autoPayDate = autoPayDate;
           this.autoPayMaxAmt = autoPayMaxAmt;
    }


    /**
     * Gets the autoPayDate value for this AutoPayChannelInfoPaymentPlanBillCycleSchema.
     * 
     * @return autoPayDate
     */
    public java.lang.String getAutoPayDate() {
        return autoPayDate;
    }


    /**
     * Sets the autoPayDate value for this AutoPayChannelInfoPaymentPlanBillCycleSchema.
     * 
     * @param autoPayDate
     */
    public void setAutoPayDate(java.lang.String autoPayDate) {
        this.autoPayDate = autoPayDate;
    }


    /**
     * Gets the autoPayMaxAmt value for this AutoPayChannelInfoPaymentPlanBillCycleSchema.
     * 
     * @return autoPayMaxAmt
     */
    public java.lang.Long getAutoPayMaxAmt() {
        return autoPayMaxAmt;
    }


    /**
     * Sets the autoPayMaxAmt value for this AutoPayChannelInfoPaymentPlanBillCycleSchema.
     * 
     * @param autoPayMaxAmt
     */
    public void setAutoPayMaxAmt(java.lang.Long autoPayMaxAmt) {
        this.autoPayMaxAmt = autoPayMaxAmt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoPayChannelInfoPaymentPlanBillCycleSchema)) return false;
        AutoPayChannelInfoPaymentPlanBillCycleSchema other = (AutoPayChannelInfoPaymentPlanBillCycleSchema) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoPayDate==null && other.getAutoPayDate()==null) || 
             (this.autoPayDate!=null &&
              this.autoPayDate.equals(other.getAutoPayDate()))) &&
            ((this.autoPayMaxAmt==null && other.getAutoPayMaxAmt()==null) || 
             (this.autoPayMaxAmt!=null &&
              this.autoPayMaxAmt.equals(other.getAutoPayMaxAmt())));
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
        if (getAutoPayDate() != null) {
            _hashCode += getAutoPayDate().hashCode();
        }
        if (getAutoPayMaxAmt() != null) {
            _hashCode += getAutoPayMaxAmt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoPayChannelInfoPaymentPlanBillCycleSchema.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">>AutoPayChannelInfo>PaymentPlan>BillCycleSchema"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPayDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AutoPayDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPayMaxAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AutoPayMaxAmt"));
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
