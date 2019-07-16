/**
 * QueryCDRResultCDRInfoTotalChargeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryCDRResultCDRInfoTotalChargeInfo  implements java.io.Serializable {
    /* 应用了免费资源后的实际批价总费用（含税） */
    private long actualChargeAmt;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfoActualTax[] actualTax;

    /* 应用的免费资源部分抵了多少总费用（含税） */
    private long freeChargeAmt;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfoFreeTax[] freeTax;

    private java.math.BigInteger currencyID;

    public QueryCDRResultCDRInfoTotalChargeInfo() {
    }

    public QueryCDRResultCDRInfoTotalChargeInfo(
           long actualChargeAmt,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfoActualTax[] actualTax,
           long freeChargeAmt,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfoFreeTax[] freeTax,
           java.math.BigInteger currencyID) {
           this.actualChargeAmt = actualChargeAmt;
           this.actualTax = actualTax;
           this.freeChargeAmt = freeChargeAmt;
           this.freeTax = freeTax;
           this.currencyID = currencyID;
    }


    /**
     * Gets the actualChargeAmt value for this QueryCDRResultCDRInfoTotalChargeInfo.
     * 
     * @return actualChargeAmt   * 应用了免费资源后的实际批价总费用（含税）
     */
    public long getActualChargeAmt() {
        return actualChargeAmt;
    }


    /**
     * Sets the actualChargeAmt value for this QueryCDRResultCDRInfoTotalChargeInfo.
     * 
     * @param actualChargeAmt   * 应用了免费资源后的实际批价总费用（含税）
     */
    public void setActualChargeAmt(long actualChargeAmt) {
        this.actualChargeAmt = actualChargeAmt;
    }


    /**
     * Gets the actualTax value for this QueryCDRResultCDRInfoTotalChargeInfo.
     * 
     * @return actualTax
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfoActualTax[] getActualTax() {
        return actualTax;
    }


    /**
     * Sets the actualTax value for this QueryCDRResultCDRInfoTotalChargeInfo.
     * 
     * @param actualTax
     */
    public void setActualTax(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfoActualTax[] actualTax) {
        this.actualTax = actualTax;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfoActualTax getActualTax(int i) {
        return this.actualTax[i];
    }

    public void setActualTax(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfoActualTax _value) {
        this.actualTax[i] = _value;
    }


    /**
     * Gets the freeChargeAmt value for this QueryCDRResultCDRInfoTotalChargeInfo.
     * 
     * @return freeChargeAmt   * 应用的免费资源部分抵了多少总费用（含税）
     */
    public long getFreeChargeAmt() {
        return freeChargeAmt;
    }


    /**
     * Sets the freeChargeAmt value for this QueryCDRResultCDRInfoTotalChargeInfo.
     * 
     * @param freeChargeAmt   * 应用的免费资源部分抵了多少总费用（含税）
     */
    public void setFreeChargeAmt(long freeChargeAmt) {
        this.freeChargeAmt = freeChargeAmt;
    }


    /**
     * Gets the freeTax value for this QueryCDRResultCDRInfoTotalChargeInfo.
     * 
     * @return freeTax
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfoFreeTax[] getFreeTax() {
        return freeTax;
    }


    /**
     * Sets the freeTax value for this QueryCDRResultCDRInfoTotalChargeInfo.
     * 
     * @param freeTax
     */
    public void setFreeTax(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfoFreeTax[] freeTax) {
        this.freeTax = freeTax;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfoFreeTax getFreeTax(int i) {
        return this.freeTax[i];
    }

    public void setFreeTax(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfoTotalChargeInfoFreeTax _value) {
        this.freeTax[i] = _value;
    }


    /**
     * Gets the currencyID value for this QueryCDRResultCDRInfoTotalChargeInfo.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this QueryCDRResultCDRInfoTotalChargeInfo.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCDRResultCDRInfoTotalChargeInfo)) return false;
        QueryCDRResultCDRInfoTotalChargeInfo other = (QueryCDRResultCDRInfoTotalChargeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.actualChargeAmt == other.getActualChargeAmt() &&
            ((this.actualTax==null && other.getActualTax()==null) || 
             (this.actualTax!=null &&
              java.util.Arrays.equals(this.actualTax, other.getActualTax()))) &&
            this.freeChargeAmt == other.getFreeChargeAmt() &&
            ((this.freeTax==null && other.getFreeTax()==null) || 
             (this.freeTax!=null &&
              java.util.Arrays.equals(this.freeTax, other.getFreeTax()))) &&
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
        _hashCode += new Long(getActualChargeAmt()).hashCode();
        if (getActualTax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActualTax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActualTax(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getFreeChargeAmt()).hashCode();
        if (getFreeTax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeTax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeTax(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCDRResultCDRInfoTotalChargeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRInfo>TotalChargeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualChargeAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ActualChargeAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ActualTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRResult>CDRInfo>TotalChargeInfo>ActualTax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeChargeAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FreeChargeAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FreeTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRResult>CDRInfo>TotalChargeInfo>FreeTax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
