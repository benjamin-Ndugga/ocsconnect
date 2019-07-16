/**
 * QueryOfferingRentFailedFeeResultOfferingRentFailedFee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryOfferingRentFailedFeeResultOfferingRentFailedFee  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeResultOfferingRentFailedFeeOfferingOwner offeringOwner;

    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    private java.lang.String billCycleId;

    private java.lang.String billCycleBeginTime;

    private java.lang.String billCycleEndTime;

    private long unpaidRentAmount;

    private java.math.BigInteger currencyID;

    public QueryOfferingRentFailedFeeResultOfferingRentFailedFee() {
    }

    public QueryOfferingRentFailedFeeResultOfferingRentFailedFee(
           com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeResultOfferingRentFailedFeeOfferingOwner offeringOwner,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           java.lang.String billCycleId,
           java.lang.String billCycleBeginTime,
           java.lang.String billCycleEndTime,
           long unpaidRentAmount,
           java.math.BigInteger currencyID) {
           this.offeringOwner = offeringOwner;
           this.offeringKey = offeringKey;
           this.billCycleId = billCycleId;
           this.billCycleBeginTime = billCycleBeginTime;
           this.billCycleEndTime = billCycleEndTime;
           this.unpaidRentAmount = unpaidRentAmount;
           this.currencyID = currencyID;
    }


    /**
     * Gets the offeringOwner value for this QueryOfferingRentFailedFeeResultOfferingRentFailedFee.
     * 
     * @return offeringOwner
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeResultOfferingRentFailedFeeOfferingOwner getOfferingOwner() {
        return offeringOwner;
    }


    /**
     * Sets the offeringOwner value for this QueryOfferingRentFailedFeeResultOfferingRentFailedFee.
     * 
     * @param offeringOwner
     */
    public void setOfferingOwner(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeResultOfferingRentFailedFeeOfferingOwner offeringOwner) {
        this.offeringOwner = offeringOwner;
    }


    /**
     * Gets the offeringKey value for this QueryOfferingRentFailedFeeResultOfferingRentFailedFee.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this QueryOfferingRentFailedFeeResultOfferingRentFailedFee.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the billCycleId value for this QueryOfferingRentFailedFeeResultOfferingRentFailedFee.
     * 
     * @return billCycleId
     */
    public java.lang.String getBillCycleId() {
        return billCycleId;
    }


    /**
     * Sets the billCycleId value for this QueryOfferingRentFailedFeeResultOfferingRentFailedFee.
     * 
     * @param billCycleId
     */
    public void setBillCycleId(java.lang.String billCycleId) {
        this.billCycleId = billCycleId;
    }


    /**
     * Gets the billCycleBeginTime value for this QueryOfferingRentFailedFeeResultOfferingRentFailedFee.
     * 
     * @return billCycleBeginTime
     */
    public java.lang.String getBillCycleBeginTime() {
        return billCycleBeginTime;
    }


    /**
     * Sets the billCycleBeginTime value for this QueryOfferingRentFailedFeeResultOfferingRentFailedFee.
     * 
     * @param billCycleBeginTime
     */
    public void setBillCycleBeginTime(java.lang.String billCycleBeginTime) {
        this.billCycleBeginTime = billCycleBeginTime;
    }


    /**
     * Gets the billCycleEndTime value for this QueryOfferingRentFailedFeeResultOfferingRentFailedFee.
     * 
     * @return billCycleEndTime
     */
    public java.lang.String getBillCycleEndTime() {
        return billCycleEndTime;
    }


    /**
     * Sets the billCycleEndTime value for this QueryOfferingRentFailedFeeResultOfferingRentFailedFee.
     * 
     * @param billCycleEndTime
     */
    public void setBillCycleEndTime(java.lang.String billCycleEndTime) {
        this.billCycleEndTime = billCycleEndTime;
    }


    /**
     * Gets the unpaidRentAmount value for this QueryOfferingRentFailedFeeResultOfferingRentFailedFee.
     * 
     * @return unpaidRentAmount
     */
    public long getUnpaidRentAmount() {
        return unpaidRentAmount;
    }


    /**
     * Sets the unpaidRentAmount value for this QueryOfferingRentFailedFeeResultOfferingRentFailedFee.
     * 
     * @param unpaidRentAmount
     */
    public void setUnpaidRentAmount(long unpaidRentAmount) {
        this.unpaidRentAmount = unpaidRentAmount;
    }


    /**
     * Gets the currencyID value for this QueryOfferingRentFailedFeeResultOfferingRentFailedFee.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this QueryOfferingRentFailedFeeResultOfferingRentFailedFee.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryOfferingRentFailedFeeResultOfferingRentFailedFee)) return false;
        QueryOfferingRentFailedFeeResultOfferingRentFailedFee other = (QueryOfferingRentFailedFeeResultOfferingRentFailedFee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offeringOwner==null && other.getOfferingOwner()==null) || 
             (this.offeringOwner!=null &&
              this.offeringOwner.equals(other.getOfferingOwner()))) &&
            ((this.offeringKey==null && other.getOfferingKey()==null) || 
             (this.offeringKey!=null &&
              this.offeringKey.equals(other.getOfferingKey()))) &&
            ((this.billCycleId==null && other.getBillCycleId()==null) || 
             (this.billCycleId!=null &&
              this.billCycleId.equals(other.getBillCycleId()))) &&
            ((this.billCycleBeginTime==null && other.getBillCycleBeginTime()==null) || 
             (this.billCycleBeginTime!=null &&
              this.billCycleBeginTime.equals(other.getBillCycleBeginTime()))) &&
            ((this.billCycleEndTime==null && other.getBillCycleEndTime()==null) || 
             (this.billCycleEndTime!=null &&
              this.billCycleEndTime.equals(other.getBillCycleEndTime()))) &&
            this.unpaidRentAmount == other.getUnpaidRentAmount() &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID())));
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
        if (getOfferingOwner() != null) {
            _hashCode += getOfferingOwner().hashCode();
        }
        if (getOfferingKey() != null) {
            _hashCode += getOfferingKey().hashCode();
        }
        if (getBillCycleId() != null) {
            _hashCode += getBillCycleId().hashCode();
        }
        if (getBillCycleBeginTime() != null) {
            _hashCode += getBillCycleBeginTime().hashCode();
        }
        if (getBillCycleEndTime() != null) {
            _hashCode += getBillCycleEndTime().hashCode();
        }
        _hashCode += new Long(getUnpaidRentAmount()).hashCode();
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryOfferingRentFailedFeeResultOfferingRentFailedFee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentFailedFeeResult>OfferingRentFailedFee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingRentFailedFeeResult>OfferingRentFailedFee>OfferingOwner"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BillCycleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleBeginTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BillCycleBeginTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BillCycleEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unpaidRentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UnpaidRentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
