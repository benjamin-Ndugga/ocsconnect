/**
 * ReversePaymentResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class ReversePaymentResult  implements java.io.Serializable {
    private java.lang.Long newBalance;

    private java.lang.String newActiveStop;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] acctChgRecList;

    private java.lang.Integer loanPayment;

    private java.lang.String internalSerialNo;

    private java.lang.Integer loanPoundage;

    public ReversePaymentResult() {
    }

    public ReversePaymentResult(
           java.lang.Long newBalance,
           java.lang.String newActiveStop,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] acctChgRecList,
           java.lang.Integer loanPayment,
           java.lang.String internalSerialNo,
           java.lang.Integer loanPoundage) {
           this.newBalance = newBalance;
           this.newActiveStop = newActiveStop;
           this.acctChgRecList = acctChgRecList;
           this.loanPayment = loanPayment;
           this.internalSerialNo = internalSerialNo;
           this.loanPoundage = loanPoundage;
    }


    /**
     * Gets the newBalance value for this ReversePaymentResult.
     * 
     * @return newBalance
     */
    public java.lang.Long getNewBalance() {
        return newBalance;
    }


    /**
     * Sets the newBalance value for this ReversePaymentResult.
     * 
     * @param newBalance
     */
    public void setNewBalance(java.lang.Long newBalance) {
        this.newBalance = newBalance;
    }


    /**
     * Gets the newActiveStop value for this ReversePaymentResult.
     * 
     * @return newActiveStop
     */
    public java.lang.String getNewActiveStop() {
        return newActiveStop;
    }


    /**
     * Sets the newActiveStop value for this ReversePaymentResult.
     * 
     * @param newActiveStop
     */
    public void setNewActiveStop(java.lang.String newActiveStop) {
        this.newActiveStop = newActiveStop;
    }


    /**
     * Gets the acctChgRecList value for this ReversePaymentResult.
     * 
     * @return acctChgRecList
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] getAcctChgRecList() {
        return acctChgRecList;
    }


    /**
     * Sets the acctChgRecList value for this ReversePaymentResult.
     * 
     * @param acctChgRecList
     */
    public void setAcctChgRecList(com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] acctChgRecList) {
        this.acctChgRecList = acctChgRecList;
    }


    /**
     * Gets the loanPayment value for this ReversePaymentResult.
     * 
     * @return loanPayment
     */
    public java.lang.Integer getLoanPayment() {
        return loanPayment;
    }


    /**
     * Sets the loanPayment value for this ReversePaymentResult.
     * 
     * @param loanPayment
     */
    public void setLoanPayment(java.lang.Integer loanPayment) {
        this.loanPayment = loanPayment;
    }


    /**
     * Gets the internalSerialNo value for this ReversePaymentResult.
     * 
     * @return internalSerialNo
     */
    public java.lang.String getInternalSerialNo() {
        return internalSerialNo;
    }


    /**
     * Sets the internalSerialNo value for this ReversePaymentResult.
     * 
     * @param internalSerialNo
     */
    public void setInternalSerialNo(java.lang.String internalSerialNo) {
        this.internalSerialNo = internalSerialNo;
    }


    /**
     * Gets the loanPoundage value for this ReversePaymentResult.
     * 
     * @return loanPoundage
     */
    public java.lang.Integer getLoanPoundage() {
        return loanPoundage;
    }


    /**
     * Sets the loanPoundage value for this ReversePaymentResult.
     * 
     * @param loanPoundage
     */
    public void setLoanPoundage(java.lang.Integer loanPoundage) {
        this.loanPoundage = loanPoundage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReversePaymentResult)) return false;
        ReversePaymentResult other = (ReversePaymentResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.newBalance==null && other.getNewBalance()==null) || 
             (this.newBalance!=null &&
              this.newBalance.equals(other.getNewBalance()))) &&
            ((this.newActiveStop==null && other.getNewActiveStop()==null) || 
             (this.newActiveStop!=null &&
              this.newActiveStop.equals(other.getNewActiveStop()))) &&
            ((this.acctChgRecList==null && other.getAcctChgRecList()==null) || 
             (this.acctChgRecList!=null &&
              java.util.Arrays.equals(this.acctChgRecList, other.getAcctChgRecList()))) &&
            ((this.loanPayment==null && other.getLoanPayment()==null) || 
             (this.loanPayment!=null &&
              this.loanPayment.equals(other.getLoanPayment()))) &&
            ((this.internalSerialNo==null && other.getInternalSerialNo()==null) || 
             (this.internalSerialNo!=null &&
              this.internalSerialNo.equals(other.getInternalSerialNo()))) &&
            ((this.loanPoundage==null && other.getLoanPoundage()==null) || 
             (this.loanPoundage!=null &&
              this.loanPoundage.equals(other.getLoanPoundage())));
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
        if (getNewBalance() != null) {
            _hashCode += getNewBalance().hashCode();
        }
        if (getNewActiveStop() != null) {
            _hashCode += getNewActiveStop().hashCode();
        }
        if (getAcctChgRecList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcctChgRecList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcctChgRecList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLoanPayment() != null) {
            _hashCode += getLoanPayment().hashCode();
        }
        if (getInternalSerialNo() != null) {
            _hashCode += getInternalSerialNo().hashCode();
        }
        if (getLoanPoundage() != null) {
            _hashCode += getLoanPoundage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReversePaymentResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ReversePaymentResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "NewBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newActiveStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "NewActiveStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctChgRecList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LoanPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "InternalSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanPoundage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LoanPoundage"));
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
