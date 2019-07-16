/**
 * TransferAccountResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class TransferAccountResult  implements java.io.Serializable {
    private java.lang.Long transfereeHandlingCharge;

    private java.lang.Long transferorHandlingCharge;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] transfereeAcctChgList;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] transferorAcctChgList;

    private java.lang.String transfereeOldActiveStop;

    private java.lang.String transfereeNewActiveStop;

    private java.lang.String transferorOldActiveStop;

    private java.lang.String transferorNewActiveStop;

    private java.lang.Integer loanPayment;

    private java.lang.Integer loanPoundage;

    public TransferAccountResult() {
    }

    public TransferAccountResult(
           java.lang.Long transfereeHandlingCharge,
           java.lang.Long transferorHandlingCharge,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] transfereeAcctChgList,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] transferorAcctChgList,
           java.lang.String transfereeOldActiveStop,
           java.lang.String transfereeNewActiveStop,
           java.lang.String transferorOldActiveStop,
           java.lang.String transferorNewActiveStop,
           java.lang.Integer loanPayment,
           java.lang.Integer loanPoundage) {
           this.transfereeHandlingCharge = transfereeHandlingCharge;
           this.transferorHandlingCharge = transferorHandlingCharge;
           this.transfereeAcctChgList = transfereeAcctChgList;
           this.transferorAcctChgList = transferorAcctChgList;
           this.transfereeOldActiveStop = transfereeOldActiveStop;
           this.transfereeNewActiveStop = transfereeNewActiveStop;
           this.transferorOldActiveStop = transferorOldActiveStop;
           this.transferorNewActiveStop = transferorNewActiveStop;
           this.loanPayment = loanPayment;
           this.loanPoundage = loanPoundage;
    }


    /**
     * Gets the transfereeHandlingCharge value for this TransferAccountResult.
     * 
     * @return transfereeHandlingCharge
     */
    public java.lang.Long getTransfereeHandlingCharge() {
        return transfereeHandlingCharge;
    }


    /**
     * Sets the transfereeHandlingCharge value for this TransferAccountResult.
     * 
     * @param transfereeHandlingCharge
     */
    public void setTransfereeHandlingCharge(java.lang.Long transfereeHandlingCharge) {
        this.transfereeHandlingCharge = transfereeHandlingCharge;
    }


    /**
     * Gets the transferorHandlingCharge value for this TransferAccountResult.
     * 
     * @return transferorHandlingCharge
     */
    public java.lang.Long getTransferorHandlingCharge() {
        return transferorHandlingCharge;
    }


    /**
     * Sets the transferorHandlingCharge value for this TransferAccountResult.
     * 
     * @param transferorHandlingCharge
     */
    public void setTransferorHandlingCharge(java.lang.Long transferorHandlingCharge) {
        this.transferorHandlingCharge = transferorHandlingCharge;
    }


    /**
     * Gets the transfereeAcctChgList value for this TransferAccountResult.
     * 
     * @return transfereeAcctChgList
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] getTransfereeAcctChgList() {
        return transfereeAcctChgList;
    }


    /**
     * Sets the transfereeAcctChgList value for this TransferAccountResult.
     * 
     * @param transfereeAcctChgList
     */
    public void setTransfereeAcctChgList(com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] transfereeAcctChgList) {
        this.transfereeAcctChgList = transfereeAcctChgList;
    }


    /**
     * Gets the transferorAcctChgList value for this TransferAccountResult.
     * 
     * @return transferorAcctChgList
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] getTransferorAcctChgList() {
        return transferorAcctChgList;
    }


    /**
     * Sets the transferorAcctChgList value for this TransferAccountResult.
     * 
     * @param transferorAcctChgList
     */
    public void setTransferorAcctChgList(com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] transferorAcctChgList) {
        this.transferorAcctChgList = transferorAcctChgList;
    }


    /**
     * Gets the transfereeOldActiveStop value for this TransferAccountResult.
     * 
     * @return transfereeOldActiveStop
     */
    public java.lang.String getTransfereeOldActiveStop() {
        return transfereeOldActiveStop;
    }


    /**
     * Sets the transfereeOldActiveStop value for this TransferAccountResult.
     * 
     * @param transfereeOldActiveStop
     */
    public void setTransfereeOldActiveStop(java.lang.String transfereeOldActiveStop) {
        this.transfereeOldActiveStop = transfereeOldActiveStop;
    }


    /**
     * Gets the transfereeNewActiveStop value for this TransferAccountResult.
     * 
     * @return transfereeNewActiveStop
     */
    public java.lang.String getTransfereeNewActiveStop() {
        return transfereeNewActiveStop;
    }


    /**
     * Sets the transfereeNewActiveStop value for this TransferAccountResult.
     * 
     * @param transfereeNewActiveStop
     */
    public void setTransfereeNewActiveStop(java.lang.String transfereeNewActiveStop) {
        this.transfereeNewActiveStop = transfereeNewActiveStop;
    }


    /**
     * Gets the transferorOldActiveStop value for this TransferAccountResult.
     * 
     * @return transferorOldActiveStop
     */
    public java.lang.String getTransferorOldActiveStop() {
        return transferorOldActiveStop;
    }


    /**
     * Sets the transferorOldActiveStop value for this TransferAccountResult.
     * 
     * @param transferorOldActiveStop
     */
    public void setTransferorOldActiveStop(java.lang.String transferorOldActiveStop) {
        this.transferorOldActiveStop = transferorOldActiveStop;
    }


    /**
     * Gets the transferorNewActiveStop value for this TransferAccountResult.
     * 
     * @return transferorNewActiveStop
     */
    public java.lang.String getTransferorNewActiveStop() {
        return transferorNewActiveStop;
    }


    /**
     * Sets the transferorNewActiveStop value for this TransferAccountResult.
     * 
     * @param transferorNewActiveStop
     */
    public void setTransferorNewActiveStop(java.lang.String transferorNewActiveStop) {
        this.transferorNewActiveStop = transferorNewActiveStop;
    }


    /**
     * Gets the loanPayment value for this TransferAccountResult.
     * 
     * @return loanPayment
     */
    public java.lang.Integer getLoanPayment() {
        return loanPayment;
    }


    /**
     * Sets the loanPayment value for this TransferAccountResult.
     * 
     * @param loanPayment
     */
    public void setLoanPayment(java.lang.Integer loanPayment) {
        this.loanPayment = loanPayment;
    }


    /**
     * Gets the loanPoundage value for this TransferAccountResult.
     * 
     * @return loanPoundage
     */
    public java.lang.Integer getLoanPoundage() {
        return loanPoundage;
    }


    /**
     * Sets the loanPoundage value for this TransferAccountResult.
     * 
     * @param loanPoundage
     */
    public void setLoanPoundage(java.lang.Integer loanPoundage) {
        this.loanPoundage = loanPoundage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferAccountResult)) return false;
        TransferAccountResult other = (TransferAccountResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transfereeHandlingCharge==null && other.getTransfereeHandlingCharge()==null) || 
             (this.transfereeHandlingCharge!=null &&
              this.transfereeHandlingCharge.equals(other.getTransfereeHandlingCharge()))) &&
            ((this.transferorHandlingCharge==null && other.getTransferorHandlingCharge()==null) || 
             (this.transferorHandlingCharge!=null &&
              this.transferorHandlingCharge.equals(other.getTransferorHandlingCharge()))) &&
            ((this.transfereeAcctChgList==null && other.getTransfereeAcctChgList()==null) || 
             (this.transfereeAcctChgList!=null &&
              java.util.Arrays.equals(this.transfereeAcctChgList, other.getTransfereeAcctChgList()))) &&
            ((this.transferorAcctChgList==null && other.getTransferorAcctChgList()==null) || 
             (this.transferorAcctChgList!=null &&
              java.util.Arrays.equals(this.transferorAcctChgList, other.getTransferorAcctChgList()))) &&
            ((this.transfereeOldActiveStop==null && other.getTransfereeOldActiveStop()==null) || 
             (this.transfereeOldActiveStop!=null &&
              this.transfereeOldActiveStop.equals(other.getTransfereeOldActiveStop()))) &&
            ((this.transfereeNewActiveStop==null && other.getTransfereeNewActiveStop()==null) || 
             (this.transfereeNewActiveStop!=null &&
              this.transfereeNewActiveStop.equals(other.getTransfereeNewActiveStop()))) &&
            ((this.transferorOldActiveStop==null && other.getTransferorOldActiveStop()==null) || 
             (this.transferorOldActiveStop!=null &&
              this.transferorOldActiveStop.equals(other.getTransferorOldActiveStop()))) &&
            ((this.transferorNewActiveStop==null && other.getTransferorNewActiveStop()==null) || 
             (this.transferorNewActiveStop!=null &&
              this.transferorNewActiveStop.equals(other.getTransferorNewActiveStop()))) &&
            ((this.loanPayment==null && other.getLoanPayment()==null) || 
             (this.loanPayment!=null &&
              this.loanPayment.equals(other.getLoanPayment()))) &&
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
        if (getTransfereeHandlingCharge() != null) {
            _hashCode += getTransfereeHandlingCharge().hashCode();
        }
        if (getTransferorHandlingCharge() != null) {
            _hashCode += getTransferorHandlingCharge().hashCode();
        }
        if (getTransfereeAcctChgList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransfereeAcctChgList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransfereeAcctChgList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferorAcctChgList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferorAcctChgList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferorAcctChgList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransfereeOldActiveStop() != null) {
            _hashCode += getTransfereeOldActiveStop().hashCode();
        }
        if (getTransfereeNewActiveStop() != null) {
            _hashCode += getTransfereeNewActiveStop().hashCode();
        }
        if (getTransferorOldActiveStop() != null) {
            _hashCode += getTransferorOldActiveStop().hashCode();
        }
        if (getTransferorNewActiveStop() != null) {
            _hashCode += getTransferorNewActiveStop().hashCode();
        }
        if (getLoanPayment() != null) {
            _hashCode += getLoanPayment().hashCode();
        }
        if (getLoanPoundage() != null) {
            _hashCode += getLoanPoundage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferAccountResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransferAccountResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transfereeHandlingCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransfereeHandlingCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferorHandlingCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransferorHandlingCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transfereeAcctChgList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransfereeAcctChgList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferorAcctChgList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransferorAcctChgList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transfereeOldActiveStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransfereeOldActiveStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transfereeNewActiveStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransfereeNewActiveStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferorOldActiveStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransferorOldActiveStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferorNewActiveStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransferorNewActiveStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LoanPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanPoundage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LoanPoundage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
