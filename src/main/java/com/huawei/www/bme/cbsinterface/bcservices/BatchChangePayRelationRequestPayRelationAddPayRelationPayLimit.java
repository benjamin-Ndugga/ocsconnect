/**
 * BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit  implements java.io.Serializable {
    private java.lang.String limitCycleType;

    private com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit limit;

    private java.math.BigInteger currencyID;

    public BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit() {
    }

    public BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit(
           java.lang.String limitCycleType,
           com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit limit,
           java.math.BigInteger currencyID) {
           this.limitCycleType = limitCycleType;
           this.limit = limit;
           this.currencyID = currencyID;
    }


    /**
     * Gets the limitCycleType value for this BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit.
     * 
     * @return limitCycleType
     */
    public java.lang.String getLimitCycleType() {
        return limitCycleType;
    }


    /**
     * Sets the limitCycleType value for this BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit.
     * 
     * @param limitCycleType
     */
    public void setLimitCycleType(java.lang.String limitCycleType) {
        this.limitCycleType = limitCycleType;
    }


    /**
     * Gets the limit value for this BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit.
     * 
     * @return limit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit.
     * 
     * @param limit
     */
    public void setLimit(com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestPayRelationAddPayRelationPayLimitLimit limit) {
        this.limit = limit;
    }


    /**
     * Gets the currencyID value for this BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit)) return false;
        BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit other = (BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.limitCycleType==null && other.getLimitCycleType()==null) || 
             (this.limitCycleType!=null &&
              this.limitCycleType.equals(other.getLimitCycleType()))) &&
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
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
        if (getLimitCycleType() != null) {
            _hashCode += getLimitCycleType().hashCode();
        }
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchChangePayRelationRequestPayRelationAddPayRelationPayLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>BatchChangePayRelationRequest>PayRelation>AddPayRelation>PayLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitCycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LimitCycleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>BatchChangePayRelationRequest>PayRelation>AddPayRelation>PayLimit>Limit"));
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
