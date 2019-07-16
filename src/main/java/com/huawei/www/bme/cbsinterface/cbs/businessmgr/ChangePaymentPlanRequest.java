/**
 * ChangePaymentPlanRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ChangePaymentPlanRequest  extends com.huawei.www.bme.cbsinterface.cbs.businessmgr.Common  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangePaymentPlanRequestPaymentPlan[] paymentPlan;

    private java.lang.String custID;

    public ChangePaymentPlanRequest() {
    }

    public ChangePaymentPlanRequest(
           java.lang.String subscriberNo,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangePaymentPlanRequestPaymentPlan[] paymentPlan,
           java.lang.String custID) {
        super(
            subscriberNo);
        this.paymentPlan = paymentPlan;
        this.custID = custID;
    }


    /**
     * Gets the paymentPlan value for this ChangePaymentPlanRequest.
     * 
     * @return paymentPlan
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangePaymentPlanRequestPaymentPlan[] getPaymentPlan() {
        return paymentPlan;
    }


    /**
     * Sets the paymentPlan value for this ChangePaymentPlanRequest.
     * 
     * @param paymentPlan
     */
    public void setPaymentPlan(com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangePaymentPlanRequestPaymentPlan[] paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangePaymentPlanRequestPaymentPlan getPaymentPlan(int i) {
        return this.paymentPlan[i];
    }

    public void setPaymentPlan(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangePaymentPlanRequestPaymentPlan _value) {
        this.paymentPlan[i] = _value;
    }


    /**
     * Gets the custID value for this ChangePaymentPlanRequest.
     * 
     * @return custID
     */
    public java.lang.String getCustID() {
        return custID;
    }


    /**
     * Sets the custID value for this ChangePaymentPlanRequest.
     * 
     * @param custID
     */
    public void setCustID(java.lang.String custID) {
        this.custID = custID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePaymentPlanRequest)) return false;
        ChangePaymentPlanRequest other = (ChangePaymentPlanRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.paymentPlan==null && other.getPaymentPlan()==null) || 
             (this.paymentPlan!=null &&
              java.util.Arrays.equals(this.paymentPlan, other.getPaymentPlan()))) &&
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
        int _hashCode = super.hashCode();
        if (getPaymentPlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentPlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentPlan(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustID() != null) {
            _hashCode += getCustID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePaymentPlanRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangePaymentPlanRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "PaymentPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ChangePaymentPlanRequest>PaymentPlan"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CustID"));
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
