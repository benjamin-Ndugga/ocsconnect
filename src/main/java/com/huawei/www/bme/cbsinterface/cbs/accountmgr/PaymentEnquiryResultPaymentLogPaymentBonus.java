/**
 * PaymentEnquiryResultPaymentLogPaymentBonus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class PaymentEnquiryResultPaymentLogPaymentBonus  implements java.io.Serializable {
    private java.lang.Integer prmAcctType;

    private java.lang.Integer prmAmt;

    private java.lang.Integer currPrmAcctBalance;

    public PaymentEnquiryResultPaymentLogPaymentBonus() {
    }

    public PaymentEnquiryResultPaymentLogPaymentBonus(
           java.lang.Integer prmAcctType,
           java.lang.Integer prmAmt,
           java.lang.Integer currPrmAcctBalance) {
           this.prmAcctType = prmAcctType;
           this.prmAmt = prmAmt;
           this.currPrmAcctBalance = currPrmAcctBalance;
    }


    /**
     * Gets the prmAcctType value for this PaymentEnquiryResultPaymentLogPaymentBonus.
     * 
     * @return prmAcctType
     */
    public java.lang.Integer getPrmAcctType() {
        return prmAcctType;
    }


    /**
     * Sets the prmAcctType value for this PaymentEnquiryResultPaymentLogPaymentBonus.
     * 
     * @param prmAcctType
     */
    public void setPrmAcctType(java.lang.Integer prmAcctType) {
        this.prmAcctType = prmAcctType;
    }


    /**
     * Gets the prmAmt value for this PaymentEnquiryResultPaymentLogPaymentBonus.
     * 
     * @return prmAmt
     */
    public java.lang.Integer getPrmAmt() {
        return prmAmt;
    }


    /**
     * Sets the prmAmt value for this PaymentEnquiryResultPaymentLogPaymentBonus.
     * 
     * @param prmAmt
     */
    public void setPrmAmt(java.lang.Integer prmAmt) {
        this.prmAmt = prmAmt;
    }


    /**
     * Gets the currPrmAcctBalance value for this PaymentEnquiryResultPaymentLogPaymentBonus.
     * 
     * @return currPrmAcctBalance
     */
    public java.lang.Integer getCurrPrmAcctBalance() {
        return currPrmAcctBalance;
    }


    /**
     * Sets the currPrmAcctBalance value for this PaymentEnquiryResultPaymentLogPaymentBonus.
     * 
     * @param currPrmAcctBalance
     */
    public void setCurrPrmAcctBalance(java.lang.Integer currPrmAcctBalance) {
        this.currPrmAcctBalance = currPrmAcctBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentEnquiryResultPaymentLogPaymentBonus)) return false;
        PaymentEnquiryResultPaymentLogPaymentBonus other = (PaymentEnquiryResultPaymentLogPaymentBonus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prmAcctType==null && other.getPrmAcctType()==null) || 
             (this.prmAcctType!=null &&
              this.prmAcctType.equals(other.getPrmAcctType()))) &&
            ((this.prmAmt==null && other.getPrmAmt()==null) || 
             (this.prmAmt!=null &&
              this.prmAmt.equals(other.getPrmAmt()))) &&
            ((this.currPrmAcctBalance==null && other.getCurrPrmAcctBalance()==null) || 
             (this.currPrmAcctBalance!=null &&
              this.currPrmAcctBalance.equals(other.getCurrPrmAcctBalance())));
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
        if (getPrmAcctType() != null) {
            _hashCode += getPrmAcctType().hashCode();
        }
        if (getPrmAmt() != null) {
            _hashCode += getPrmAmt().hashCode();
        }
        if (getCurrPrmAcctBalance() != null) {
            _hashCode += getCurrPrmAcctBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentEnquiryResultPaymentLogPaymentBonus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">>PaymentEnquiryResult>PaymentLog>PaymentBonus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prmAcctType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PrmAcctType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prmAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PrmAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currPrmAcctBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CurrPrmAcctBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
