/**
 * QueryAggregationAmountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryAggregationAmountRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode subAccessCode;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountRequestAcctAccessCode acctAccessCode;

    private java.lang.String billCycleID;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountRequestTimePeriod timePeriod;

    public QueryAggregationAmountRequest() {
    }

    public QueryAggregationAmountRequest(
           com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode subAccessCode,
           com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountRequestAcctAccessCode acctAccessCode,
           java.lang.String billCycleID,
           com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountRequestTimePeriod timePeriod) {
           this.subAccessCode = subAccessCode;
           this.acctAccessCode = acctAccessCode;
           this.billCycleID = billCycleID;
           this.timePeriod = timePeriod;
    }


    /**
     * Gets the subAccessCode value for this QueryAggregationAmountRequest.
     * 
     * @return subAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }


    /**
     * Sets the subAccessCode value for this QueryAggregationAmountRequest.
     * 
     * @param subAccessCode
     */
    public void setSubAccessCode(com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }


    /**
     * Gets the acctAccessCode value for this QueryAggregationAmountRequest.
     * 
     * @return acctAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountRequestAcctAccessCode getAcctAccessCode() {
        return acctAccessCode;
    }


    /**
     * Sets the acctAccessCode value for this QueryAggregationAmountRequest.
     * 
     * @param acctAccessCode
     */
    public void setAcctAccessCode(com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountRequestAcctAccessCode acctAccessCode) {
        this.acctAccessCode = acctAccessCode;
    }


    /**
     * Gets the billCycleID value for this QueryAggregationAmountRequest.
     * 
     * @return billCycleID
     */
    public java.lang.String getBillCycleID() {
        return billCycleID;
    }


    /**
     * Sets the billCycleID value for this QueryAggregationAmountRequest.
     * 
     * @param billCycleID
     */
    public void setBillCycleID(java.lang.String billCycleID) {
        this.billCycleID = billCycleID;
    }


    /**
     * Gets the timePeriod value for this QueryAggregationAmountRequest.
     * 
     * @return timePeriod
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountRequestTimePeriod getTimePeriod() {
        return timePeriod;
    }


    /**
     * Sets the timePeriod value for this QueryAggregationAmountRequest.
     * 
     * @param timePeriod
     */
    public void setTimePeriod(com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountRequestTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryAggregationAmountRequest)) return false;
        QueryAggregationAmountRequest other = (QueryAggregationAmountRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subAccessCode==null && other.getSubAccessCode()==null) || 
             (this.subAccessCode!=null &&
              this.subAccessCode.equals(other.getSubAccessCode()))) &&
            ((this.acctAccessCode==null && other.getAcctAccessCode()==null) || 
             (this.acctAccessCode!=null &&
              this.acctAccessCode.equals(other.getAcctAccessCode()))) &&
            ((this.billCycleID==null && other.getBillCycleID()==null) || 
             (this.billCycleID!=null &&
              this.billCycleID.equals(other.getBillCycleID()))) &&
            ((this.timePeriod==null && other.getTimePeriod()==null) || 
             (this.timePeriod!=null &&
              this.timePeriod.equals(other.getTimePeriod())));
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
        if (getSubAccessCode() != null) {
            _hashCode += getSubAccessCode().hashCode();
        }
        if (getAcctAccessCode() != null) {
            _hashCode += getAcctAccessCode().hashCode();
        }
        if (getBillCycleID() != null) {
            _hashCode += getBillCycleID().hashCode();
        }
        if (getTimePeriod() != null) {
            _hashCode += getTimePeriod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryAggregationAmountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryAggregationAmountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "SubAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SubAccessCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AcctAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryAggregationAmountRequest>AcctAccessCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "BillCycleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "TimePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryAggregationAmountRequest>TimePeriod"));
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
