/**
 * QueryPaymentPlanResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryPaymentPlanResult  implements java.io.Serializable {
    /* My account pay for other subscribers */
    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPaymentPlanResultPaymentPlanForOther[] paymentPlanForOther;

    /* Other subscribers pay for me. */
    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPaymentPlanResultPaymentPlanForMe[] paymentPlanForMe;

    public QueryPaymentPlanResult() {
    }

    public QueryPaymentPlanResult(
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPaymentPlanResultPaymentPlanForOther[] paymentPlanForOther,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPaymentPlanResultPaymentPlanForMe[] paymentPlanForMe) {
           this.paymentPlanForOther = paymentPlanForOther;
           this.paymentPlanForMe = paymentPlanForMe;
    }


    /**
     * Gets the paymentPlanForOther value for this QueryPaymentPlanResult.
     * 
     * @return paymentPlanForOther   * My account pay for other subscribers
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPaymentPlanResultPaymentPlanForOther[] getPaymentPlanForOther() {
        return paymentPlanForOther;
    }


    /**
     * Sets the paymentPlanForOther value for this QueryPaymentPlanResult.
     * 
     * @param paymentPlanForOther   * My account pay for other subscribers
     */
    public void setPaymentPlanForOther(com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPaymentPlanResultPaymentPlanForOther[] paymentPlanForOther) {
        this.paymentPlanForOther = paymentPlanForOther;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPaymentPlanResultPaymentPlanForOther getPaymentPlanForOther(int i) {
        return this.paymentPlanForOther[i];
    }

    public void setPaymentPlanForOther(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPaymentPlanResultPaymentPlanForOther _value) {
        this.paymentPlanForOther[i] = _value;
    }


    /**
     * Gets the paymentPlanForMe value for this QueryPaymentPlanResult.
     * 
     * @return paymentPlanForMe   * Other subscribers pay for me.
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPaymentPlanResultPaymentPlanForMe[] getPaymentPlanForMe() {
        return paymentPlanForMe;
    }


    /**
     * Sets the paymentPlanForMe value for this QueryPaymentPlanResult.
     * 
     * @param paymentPlanForMe   * Other subscribers pay for me.
     */
    public void setPaymentPlanForMe(com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPaymentPlanResultPaymentPlanForMe[] paymentPlanForMe) {
        this.paymentPlanForMe = paymentPlanForMe;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPaymentPlanResultPaymentPlanForMe getPaymentPlanForMe(int i) {
        return this.paymentPlanForMe[i];
    }

    public void setPaymentPlanForMe(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryPaymentPlanResultPaymentPlanForMe _value) {
        this.paymentPlanForMe[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPaymentPlanResult)) return false;
        QueryPaymentPlanResult other = (QueryPaymentPlanResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentPlanForOther==null && other.getPaymentPlanForOther()==null) || 
             (this.paymentPlanForOther!=null &&
              java.util.Arrays.equals(this.paymentPlanForOther, other.getPaymentPlanForOther()))) &&
            ((this.paymentPlanForMe==null && other.getPaymentPlanForMe()==null) || 
             (this.paymentPlanForMe!=null &&
              java.util.Arrays.equals(this.paymentPlanForMe, other.getPaymentPlanForMe())));
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
        if (getPaymentPlanForOther() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentPlanForOther());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentPlanForOther(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentPlanForMe() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentPlanForMe());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentPlanForMe(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryPaymentPlanResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryPaymentPlanResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentPlanForOther");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "PaymentPlanForOther"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryPaymentPlanResult>PaymentPlanForOther"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentPlanForMe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "PaymentPlanForMe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryPaymentPlanResult>PaymentPlanForMe"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
