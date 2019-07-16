/**
 * AcctChgRecType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class AcctChgRecType  implements java.io.Serializable {
    private java.lang.Long currAcctBal;

    private java.lang.Long chgAcctBal;

    private java.lang.String currExpTime;

    private int chgExpTime;

    private java.lang.String accountType;

    private java.lang.String accountID;

    private java.lang.Integer minMeasureId;

    public AcctChgRecType() {
    }

    public AcctChgRecType(
           java.lang.Long currAcctBal,
           java.lang.Long chgAcctBal,
           java.lang.String currExpTime,
           int chgExpTime,
           java.lang.String accountType,
           java.lang.String accountID,
           java.lang.Integer minMeasureId) {
           this.currAcctBal = currAcctBal;
           this.chgAcctBal = chgAcctBal;
           this.currExpTime = currExpTime;
           this.chgExpTime = chgExpTime;
           this.accountType = accountType;
           this.accountID = accountID;
           this.minMeasureId = minMeasureId;
    }


    /**
     * Gets the currAcctBal value for this AcctChgRecType.
     * 
     * @return currAcctBal
     */
    public java.lang.Long getCurrAcctBal() {
        return currAcctBal;
    }


    /**
     * Sets the currAcctBal value for this AcctChgRecType.
     * 
     * @param currAcctBal
     */
    public void setCurrAcctBal(java.lang.Long currAcctBal) {
        this.currAcctBal = currAcctBal;
    }


    /**
     * Gets the chgAcctBal value for this AcctChgRecType.
     * 
     * @return chgAcctBal
     */
    public java.lang.Long getChgAcctBal() {
        return chgAcctBal;
    }


    /**
     * Sets the chgAcctBal value for this AcctChgRecType.
     * 
     * @param chgAcctBal
     */
    public void setChgAcctBal(java.lang.Long chgAcctBal) {
        this.chgAcctBal = chgAcctBal;
    }


    /**
     * Gets the currExpTime value for this AcctChgRecType.
     * 
     * @return currExpTime
     */
    public java.lang.String getCurrExpTime() {
        return currExpTime;
    }


    /**
     * Sets the currExpTime value for this AcctChgRecType.
     * 
     * @param currExpTime
     */
    public void setCurrExpTime(java.lang.String currExpTime) {
        this.currExpTime = currExpTime;
    }


    /**
     * Gets the chgExpTime value for this AcctChgRecType.
     * 
     * @return chgExpTime
     */
    public int getChgExpTime() {
        return chgExpTime;
    }


    /**
     * Sets the chgExpTime value for this AcctChgRecType.
     * 
     * @param chgExpTime
     */
    public void setChgExpTime(int chgExpTime) {
        this.chgExpTime = chgExpTime;
    }


    /**
     * Gets the accountType value for this AcctChgRecType.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this AcctChgRecType.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the accountID value for this AcctChgRecType.
     * 
     * @return accountID
     */
    public java.lang.String getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this AcctChgRecType.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.String accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the minMeasureId value for this AcctChgRecType.
     * 
     * @return minMeasureId
     */
    public java.lang.Integer getMinMeasureId() {
        return minMeasureId;
    }


    /**
     * Sets the minMeasureId value for this AcctChgRecType.
     * 
     * @param minMeasureId
     */
    public void setMinMeasureId(java.lang.Integer minMeasureId) {
        this.minMeasureId = minMeasureId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AcctChgRecType)) return false;
        AcctChgRecType other = (AcctChgRecType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currAcctBal==null && other.getCurrAcctBal()==null) || 
             (this.currAcctBal!=null &&
              this.currAcctBal.equals(other.getCurrAcctBal()))) &&
            ((this.chgAcctBal==null && other.getChgAcctBal()==null) || 
             (this.chgAcctBal!=null &&
              this.chgAcctBal.equals(other.getChgAcctBal()))) &&
            ((this.currExpTime==null && other.getCurrExpTime()==null) || 
             (this.currExpTime!=null &&
              this.currExpTime.equals(other.getCurrExpTime()))) &&
            this.chgExpTime == other.getChgExpTime() &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.minMeasureId==null && other.getMinMeasureId()==null) || 
             (this.minMeasureId!=null &&
              this.minMeasureId.equals(other.getMinMeasureId())));
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
        if (getCurrAcctBal() != null) {
            _hashCode += getCurrAcctBal().hashCode();
        }
        if (getChgAcctBal() != null) {
            _hashCode += getChgAcctBal().hashCode();
        }
        if (getCurrExpTime() != null) {
            _hashCode += getCurrExpTime().hashCode();
        }
        _hashCode += getChgExpTime();
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getMinMeasureId() != null) {
            _hashCode += getMinMeasureId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AcctChgRecType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currAcctBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CurrAcctBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chgAcctBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ChgAcctBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currExpTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CurrExpTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chgExpTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ChgExpTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minMeasureId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "MinMeasureId"));
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
