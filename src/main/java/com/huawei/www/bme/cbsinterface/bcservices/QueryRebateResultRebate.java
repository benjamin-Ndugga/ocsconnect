/**
 * QueryRebateResultRebate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryRebateResultRebate  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    private java.math.BigInteger processedCycleNum;

    private java.math.BigInteger successCycleNum;

    private java.lang.String lastRebateDate;

    public QueryRebateResultRebate() {
    }

    public QueryRebateResultRebate(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           java.math.BigInteger processedCycleNum,
           java.math.BigInteger successCycleNum,
           java.lang.String lastRebateDate) {
           this.offeringKey = offeringKey;
           this.processedCycleNum = processedCycleNum;
           this.successCycleNum = successCycleNum;
           this.lastRebateDate = lastRebateDate;
    }


    /**
     * Gets the offeringKey value for this QueryRebateResultRebate.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this QueryRebateResultRebate.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the processedCycleNum value for this QueryRebateResultRebate.
     * 
     * @return processedCycleNum
     */
    public java.math.BigInteger getProcessedCycleNum() {
        return processedCycleNum;
    }


    /**
     * Sets the processedCycleNum value for this QueryRebateResultRebate.
     * 
     * @param processedCycleNum
     */
    public void setProcessedCycleNum(java.math.BigInteger processedCycleNum) {
        this.processedCycleNum = processedCycleNum;
    }


    /**
     * Gets the successCycleNum value for this QueryRebateResultRebate.
     * 
     * @return successCycleNum
     */
    public java.math.BigInteger getSuccessCycleNum() {
        return successCycleNum;
    }


    /**
     * Sets the successCycleNum value for this QueryRebateResultRebate.
     * 
     * @param successCycleNum
     */
    public void setSuccessCycleNum(java.math.BigInteger successCycleNum) {
        this.successCycleNum = successCycleNum;
    }


    /**
     * Gets the lastRebateDate value for this QueryRebateResultRebate.
     * 
     * @return lastRebateDate
     */
    public java.lang.String getLastRebateDate() {
        return lastRebateDate;
    }


    /**
     * Sets the lastRebateDate value for this QueryRebateResultRebate.
     * 
     * @param lastRebateDate
     */
    public void setLastRebateDate(java.lang.String lastRebateDate) {
        this.lastRebateDate = lastRebateDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryRebateResultRebate)) return false;
        QueryRebateResultRebate other = (QueryRebateResultRebate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offeringKey==null && other.getOfferingKey()==null) || 
             (this.offeringKey!=null &&
              this.offeringKey.equals(other.getOfferingKey()))) &&
            ((this.processedCycleNum==null && other.getProcessedCycleNum()==null) || 
             (this.processedCycleNum!=null &&
              this.processedCycleNum.equals(other.getProcessedCycleNum()))) &&
            ((this.successCycleNum==null && other.getSuccessCycleNum()==null) || 
             (this.successCycleNum!=null &&
              this.successCycleNum.equals(other.getSuccessCycleNum()))) &&
            ((this.lastRebateDate==null && other.getLastRebateDate()==null) || 
             (this.lastRebateDate!=null &&
              this.lastRebateDate.equals(other.getLastRebateDate())));
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
        if (getOfferingKey() != null) {
            _hashCode += getOfferingKey().hashCode();
        }
        if (getProcessedCycleNum() != null) {
            _hashCode += getProcessedCycleNum().hashCode();
        }
        if (getSuccessCycleNum() != null) {
            _hashCode += getSuccessCycleNum().hashCode();
        }
        if (getLastRebateDate() != null) {
            _hashCode += getLastRebateDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryRebateResultRebate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryRebateResult>Rebate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRebateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LastRebateDate"));
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
