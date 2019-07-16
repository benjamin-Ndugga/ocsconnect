/**
 * AddGroupMemberRequestPaymentRelationNewDFTAcct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class AddGroupMemberRequestPaymentRelationNewDFTAcct  implements java.io.Serializable {
    private java.lang.String payRelationKey;

    private java.lang.String acctKey;

    private com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationNewDFTAcctPaymentLimit paymentLimit;

    public AddGroupMemberRequestPaymentRelationNewDFTAcct() {
    }

    public AddGroupMemberRequestPaymentRelationNewDFTAcct(
           java.lang.String payRelationKey,
           java.lang.String acctKey,
           com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationNewDFTAcctPaymentLimit paymentLimit) {
           this.payRelationKey = payRelationKey;
           this.acctKey = acctKey;
           this.paymentLimit = paymentLimit;
    }


    /**
     * Gets the payRelationKey value for this AddGroupMemberRequestPaymentRelationNewDFTAcct.
     * 
     * @return payRelationKey
     */
    public java.lang.String getPayRelationKey() {
        return payRelationKey;
    }


    /**
     * Sets the payRelationKey value for this AddGroupMemberRequestPaymentRelationNewDFTAcct.
     * 
     * @param payRelationKey
     */
    public void setPayRelationKey(java.lang.String payRelationKey) {
        this.payRelationKey = payRelationKey;
    }


    /**
     * Gets the acctKey value for this AddGroupMemberRequestPaymentRelationNewDFTAcct.
     * 
     * @return acctKey
     */
    public java.lang.String getAcctKey() {
        return acctKey;
    }


    /**
     * Sets the acctKey value for this AddGroupMemberRequestPaymentRelationNewDFTAcct.
     * 
     * @param acctKey
     */
    public void setAcctKey(java.lang.String acctKey) {
        this.acctKey = acctKey;
    }


    /**
     * Gets the paymentLimit value for this AddGroupMemberRequestPaymentRelationNewDFTAcct.
     * 
     * @return paymentLimit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationNewDFTAcctPaymentLimit getPaymentLimit() {
        return paymentLimit;
    }


    /**
     * Sets the paymentLimit value for this AddGroupMemberRequestPaymentRelationNewDFTAcct.
     * 
     * @param paymentLimit
     */
    public void setPaymentLimit(com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestPaymentRelationNewDFTAcctPaymentLimit paymentLimit) {
        this.paymentLimit = paymentLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddGroupMemberRequestPaymentRelationNewDFTAcct)) return false;
        AddGroupMemberRequestPaymentRelationNewDFTAcct other = (AddGroupMemberRequestPaymentRelationNewDFTAcct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payRelationKey==null && other.getPayRelationKey()==null) || 
             (this.payRelationKey!=null &&
              this.payRelationKey.equals(other.getPayRelationKey()))) &&
            ((this.acctKey==null && other.getAcctKey()==null) || 
             (this.acctKey!=null &&
              this.acctKey.equals(other.getAcctKey()))) &&
            ((this.paymentLimit==null && other.getPaymentLimit()==null) || 
             (this.paymentLimit!=null &&
              this.paymentLimit.equals(other.getPaymentLimit())));
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
        if (getPayRelationKey() != null) {
            _hashCode += getPayRelationKey().hashCode();
        }
        if (getAcctKey() != null) {
            _hashCode += getAcctKey().hashCode();
        }
        if (getPaymentLimit() != null) {
            _hashCode += getPaymentLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddGroupMemberRequestPaymentRelationNewDFTAcct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>AddGroupMemberRequest>PaymentRelation>NewDFTAcct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRelationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PayRelationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>AddGroupMemberRequest>PaymentRelation>NewDFTAcct>PaymentLimit"));
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
