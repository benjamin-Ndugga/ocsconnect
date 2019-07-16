/**
 * QueryOfferingRentCycleResultOfferingRentCycle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryOfferingRentCycleResultOfferingRentCycle  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleResultOfferingRentCycleOfferingOwner offeringOwner;

    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    private java.lang.String openDay;

    private java.lang.String endDay;

    private java.lang.Long rentAmount;

    private java.math.BigInteger currencyID;

    private java.math.BigInteger processedCycleNum;

    private java.math.BigInteger successCycleNum;

    public QueryOfferingRentCycleResultOfferingRentCycle() {
    }

    public QueryOfferingRentCycleResultOfferingRentCycle(
           com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleResultOfferingRentCycleOfferingOwner offeringOwner,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           java.lang.String openDay,
           java.lang.String endDay,
           java.lang.Long rentAmount,
           java.math.BigInteger currencyID,
           java.math.BigInteger processedCycleNum,
           java.math.BigInteger successCycleNum) {
           this.offeringOwner = offeringOwner;
           this.offeringKey = offeringKey;
           this.openDay = openDay;
           this.endDay = endDay;
           this.rentAmount = rentAmount;
           this.currencyID = currencyID;
           this.processedCycleNum = processedCycleNum;
           this.successCycleNum = successCycleNum;
    }


    /**
     * Gets the offeringOwner value for this QueryOfferingRentCycleResultOfferingRentCycle.
     * 
     * @return offeringOwner
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleResultOfferingRentCycleOfferingOwner getOfferingOwner() {
        return offeringOwner;
    }


    /**
     * Sets the offeringOwner value for this QueryOfferingRentCycleResultOfferingRentCycle.
     * 
     * @param offeringOwner
     */
    public void setOfferingOwner(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleResultOfferingRentCycleOfferingOwner offeringOwner) {
        this.offeringOwner = offeringOwner;
    }


    /**
     * Gets the offeringKey value for this QueryOfferingRentCycleResultOfferingRentCycle.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this QueryOfferingRentCycleResultOfferingRentCycle.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the openDay value for this QueryOfferingRentCycleResultOfferingRentCycle.
     * 
     * @return openDay
     */
    public java.lang.String getOpenDay() {
        return openDay;
    }


    /**
     * Sets the openDay value for this QueryOfferingRentCycleResultOfferingRentCycle.
     * 
     * @param openDay
     */
    public void setOpenDay(java.lang.String openDay) {
        this.openDay = openDay;
    }


    /**
     * Gets the endDay value for this QueryOfferingRentCycleResultOfferingRentCycle.
     * 
     * @return endDay
     */
    public java.lang.String getEndDay() {
        return endDay;
    }


    /**
     * Sets the endDay value for this QueryOfferingRentCycleResultOfferingRentCycle.
     * 
     * @param endDay
     */
    public void setEndDay(java.lang.String endDay) {
        this.endDay = endDay;
    }


    /**
     * Gets the rentAmount value for this QueryOfferingRentCycleResultOfferingRentCycle.
     * 
     * @return rentAmount
     */
    public java.lang.Long getRentAmount() {
        return rentAmount;
    }


    /**
     * Sets the rentAmount value for this QueryOfferingRentCycleResultOfferingRentCycle.
     * 
     * @param rentAmount
     */
    public void setRentAmount(java.lang.Long rentAmount) {
        this.rentAmount = rentAmount;
    }


    /**
     * Gets the currencyID value for this QueryOfferingRentCycleResultOfferingRentCycle.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this QueryOfferingRentCycleResultOfferingRentCycle.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the processedCycleNum value for this QueryOfferingRentCycleResultOfferingRentCycle.
     * 
     * @return processedCycleNum
     */
    public java.math.BigInteger getProcessedCycleNum() {
        return processedCycleNum;
    }


    /**
     * Sets the processedCycleNum value for this QueryOfferingRentCycleResultOfferingRentCycle.
     * 
     * @param processedCycleNum
     */
    public void setProcessedCycleNum(java.math.BigInteger processedCycleNum) {
        this.processedCycleNum = processedCycleNum;
    }


    /**
     * Gets the successCycleNum value for this QueryOfferingRentCycleResultOfferingRentCycle.
     * 
     * @return successCycleNum
     */
    public java.math.BigInteger getSuccessCycleNum() {
        return successCycleNum;
    }


    /**
     * Sets the successCycleNum value for this QueryOfferingRentCycleResultOfferingRentCycle.
     * 
     * @param successCycleNum
     */
    public void setSuccessCycleNum(java.math.BigInteger successCycleNum) {
        this.successCycleNum = successCycleNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryOfferingRentCycleResultOfferingRentCycle)) return false;
        QueryOfferingRentCycleResultOfferingRentCycle other = (QueryOfferingRentCycleResultOfferingRentCycle) obj;
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
            ((this.openDay==null && other.getOpenDay()==null) || 
             (this.openDay!=null &&
              this.openDay.equals(other.getOpenDay()))) &&
            ((this.endDay==null && other.getEndDay()==null) || 
             (this.endDay!=null &&
              this.endDay.equals(other.getEndDay()))) &&
            ((this.rentAmount==null && other.getRentAmount()==null) || 
             (this.rentAmount!=null &&
              this.rentAmount.equals(other.getRentAmount()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.processedCycleNum==null && other.getProcessedCycleNum()==null) || 
             (this.processedCycleNum!=null &&
              this.processedCycleNum.equals(other.getProcessedCycleNum()))) &&
            ((this.successCycleNum==null && other.getSuccessCycleNum()==null) || 
             (this.successCycleNum!=null &&
              this.successCycleNum.equals(other.getSuccessCycleNum())));
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
        if (getOpenDay() != null) {
            _hashCode += getOpenDay().hashCode();
        }
        if (getEndDay() != null) {
            _hashCode += getEndDay().hashCode();
        }
        if (getRentAmount() != null) {
            _hashCode += getRentAmount().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getProcessedCycleNum() != null) {
            _hashCode += getProcessedCycleNum().hashCode();
        }
        if (getSuccessCycleNum() != null) {
            _hashCode += getSuccessCycleNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryOfferingRentCycleResultOfferingRentCycle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentCycleResult>OfferingRentCycle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingRentCycleResult>OfferingRentCycle>OfferingOwner"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OpenDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EndDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processedCycleNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ProcessedCycleNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successCycleNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SuccessCycleNum"));
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
