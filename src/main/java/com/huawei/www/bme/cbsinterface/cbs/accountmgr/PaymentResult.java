/**
 * PaymentResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class PaymentResult  implements java.io.Serializable {
    private java.lang.String internalSerialNo;

    private java.lang.Long newBalance;

    private java.lang.String newActiveStop;

    private java.lang.Integer validityPeriod;

    private java.lang.Integer extraValidity;

    private java.lang.Integer loan;

    private java.lang.Integer poundage;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] acctChgRecList;

    public PaymentResult() {
    }

    public PaymentResult(
           java.lang.String internalSerialNo,
           java.lang.Long newBalance,
           java.lang.String newActiveStop,
           java.lang.Integer validityPeriod,
           java.lang.Integer extraValidity,
           java.lang.Integer loan,
           java.lang.Integer poundage,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] acctChgRecList) {
           this.internalSerialNo = internalSerialNo;
           this.newBalance = newBalance;
           this.newActiveStop = newActiveStop;
           this.validityPeriod = validityPeriod;
           this.extraValidity = extraValidity;
           this.loan = loan;
           this.poundage = poundage;
           this.acctChgRecList = acctChgRecList;
    }


    /**
     * Gets the internalSerialNo value for this PaymentResult.
     * 
     * @return internalSerialNo
     */
    public java.lang.String getInternalSerialNo() {
        return internalSerialNo;
    }


    /**
     * Sets the internalSerialNo value for this PaymentResult.
     * 
     * @param internalSerialNo
     */
    public void setInternalSerialNo(java.lang.String internalSerialNo) {
        this.internalSerialNo = internalSerialNo;
    }


    /**
     * Gets the newBalance value for this PaymentResult.
     * 
     * @return newBalance
     */
    public java.lang.Long getNewBalance() {
        return newBalance;
    }


    /**
     * Sets the newBalance value for this PaymentResult.
     * 
     * @param newBalance
     */
    public void setNewBalance(java.lang.Long newBalance) {
        this.newBalance = newBalance;
    }


    /**
     * Gets the newActiveStop value for this PaymentResult.
     * 
     * @return newActiveStop
     */
    public java.lang.String getNewActiveStop() {
        return newActiveStop;
    }


    /**
     * Sets the newActiveStop value for this PaymentResult.
     * 
     * @param newActiveStop
     */
    public void setNewActiveStop(java.lang.String newActiveStop) {
        this.newActiveStop = newActiveStop;
    }


    /**
     * Gets the validityPeriod value for this PaymentResult.
     * 
     * @return validityPeriod
     */
    public java.lang.Integer getValidityPeriod() {
        return validityPeriod;
    }


    /**
     * Sets the validityPeriod value for this PaymentResult.
     * 
     * @param validityPeriod
     */
    public void setValidityPeriod(java.lang.Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
    }


    /**
     * Gets the extraValidity value for this PaymentResult.
     * 
     * @return extraValidity
     */
    public java.lang.Integer getExtraValidity() {
        return extraValidity;
    }


    /**
     * Sets the extraValidity value for this PaymentResult.
     * 
     * @param extraValidity
     */
    public void setExtraValidity(java.lang.Integer extraValidity) {
        this.extraValidity = extraValidity;
    }


    /**
     * Gets the loan value for this PaymentResult.
     * 
     * @return loan
     */
    public java.lang.Integer getLoan() {
        return loan;
    }


    /**
     * Sets the loan value for this PaymentResult.
     * 
     * @param loan
     */
    public void setLoan(java.lang.Integer loan) {
        this.loan = loan;
    }


    /**
     * Gets the poundage value for this PaymentResult.
     * 
     * @return poundage
     */
    public java.lang.Integer getPoundage() {
        return poundage;
    }


    /**
     * Sets the poundage value for this PaymentResult.
     * 
     * @param poundage
     */
    public void setPoundage(java.lang.Integer poundage) {
        this.poundage = poundage;
    }


    /**
     * Gets the acctChgRecList value for this PaymentResult.
     * 
     * @return acctChgRecList
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] getAcctChgRecList() {
        return acctChgRecList;
    }


    /**
     * Sets the acctChgRecList value for this PaymentResult.
     * 
     * @param acctChgRecList
     */
    public void setAcctChgRecList(com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] acctChgRecList) {
        this.acctChgRecList = acctChgRecList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentResult)) return false;
        PaymentResult other = (PaymentResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.internalSerialNo==null && other.getInternalSerialNo()==null) || 
             (this.internalSerialNo!=null &&
              this.internalSerialNo.equals(other.getInternalSerialNo()))) &&
            ((this.newBalance==null && other.getNewBalance()==null) || 
             (this.newBalance!=null &&
              this.newBalance.equals(other.getNewBalance()))) &&
            ((this.newActiveStop==null && other.getNewActiveStop()==null) || 
             (this.newActiveStop!=null &&
              this.newActiveStop.equals(other.getNewActiveStop()))) &&
            ((this.validityPeriod==null && other.getValidityPeriod()==null) || 
             (this.validityPeriod!=null &&
              this.validityPeriod.equals(other.getValidityPeriod()))) &&
            ((this.extraValidity==null && other.getExtraValidity()==null) || 
             (this.extraValidity!=null &&
              this.extraValidity.equals(other.getExtraValidity()))) &&
            ((this.loan==null && other.getLoan()==null) || 
             (this.loan!=null &&
              this.loan.equals(other.getLoan()))) &&
            ((this.poundage==null && other.getPoundage()==null) || 
             (this.poundage!=null &&
              this.poundage.equals(other.getPoundage()))) &&
            ((this.acctChgRecList==null && other.getAcctChgRecList()==null) || 
             (this.acctChgRecList!=null &&
              java.util.Arrays.equals(this.acctChgRecList, other.getAcctChgRecList())));
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
        if (getInternalSerialNo() != null) {
            _hashCode += getInternalSerialNo().hashCode();
        }
        if (getNewBalance() != null) {
            _hashCode += getNewBalance().hashCode();
        }
        if (getNewActiveStop() != null) {
            _hashCode += getNewActiveStop().hashCode();
        }
        if (getValidityPeriod() != null) {
            _hashCode += getValidityPeriod().hashCode();
        }
        if (getExtraValidity() != null) {
            _hashCode += getExtraValidity().hashCode();
        }
        if (getLoan() != null) {
            _hashCode += getLoan().hashCode();
        }
        if (getPoundage() != null) {
            _hashCode += getPoundage().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PaymentResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "InternalSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("validityPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ValidityPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ExtraValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Loan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poundage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Poundage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctChgRecList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec"));
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
