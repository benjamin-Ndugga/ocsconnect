/**
 * QueryCDRResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryCDRResult  implements java.io.Serializable {
    private java.math.BigInteger totalCDRNum;

    private java.math.BigInteger beginRowNum;

    private java.math.BigInteger fetchRowNum;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummary[] CDRSummary;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfo[] CDRInfo;

    public QueryCDRResult() {
    }

    public QueryCDRResult(
           java.math.BigInteger totalCDRNum,
           java.math.BigInteger beginRowNum,
           java.math.BigInteger fetchRowNum,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummary[] CDRSummary,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfo[] CDRInfo) {
           this.totalCDRNum = totalCDRNum;
           this.beginRowNum = beginRowNum;
           this.fetchRowNum = fetchRowNum;
           this.CDRSummary = CDRSummary;
           this.CDRInfo = CDRInfo;
    }


    /**
     * Gets the totalCDRNum value for this QueryCDRResult.
     * 
     * @return totalCDRNum
     */
    public java.math.BigInteger getTotalCDRNum() {
        return totalCDRNum;
    }


    /**
     * Sets the totalCDRNum value for this QueryCDRResult.
     * 
     * @param totalCDRNum
     */
    public void setTotalCDRNum(java.math.BigInteger totalCDRNum) {
        this.totalCDRNum = totalCDRNum;
    }


    /**
     * Gets the beginRowNum value for this QueryCDRResult.
     * 
     * @return beginRowNum
     */
    public java.math.BigInteger getBeginRowNum() {
        return beginRowNum;
    }


    /**
     * Sets the beginRowNum value for this QueryCDRResult.
     * 
     * @param beginRowNum
     */
    public void setBeginRowNum(java.math.BigInteger beginRowNum) {
        this.beginRowNum = beginRowNum;
    }


    /**
     * Gets the fetchRowNum value for this QueryCDRResult.
     * 
     * @return fetchRowNum
     */
    public java.math.BigInteger getFetchRowNum() {
        return fetchRowNum;
    }


    /**
     * Sets the fetchRowNum value for this QueryCDRResult.
     * 
     * @param fetchRowNum
     */
    public void setFetchRowNum(java.math.BigInteger fetchRowNum) {
        this.fetchRowNum = fetchRowNum;
    }


    /**
     * Gets the CDRSummary value for this QueryCDRResult.
     * 
     * @return CDRSummary
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummary[] getCDRSummary() {
        return CDRSummary;
    }


    /**
     * Sets the CDRSummary value for this QueryCDRResult.
     * 
     * @param CDRSummary
     */
    public void setCDRSummary(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummary[] CDRSummary) {
        this.CDRSummary = CDRSummary;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummary getCDRSummary(int i) {
        return this.CDRSummary[i];
    }

    public void setCDRSummary(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummary _value) {
        this.CDRSummary[i] = _value;
    }


    /**
     * Gets the CDRInfo value for this QueryCDRResult.
     * 
     * @return CDRInfo
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfo[] getCDRInfo() {
        return CDRInfo;
    }


    /**
     * Sets the CDRInfo value for this QueryCDRResult.
     * 
     * @param CDRInfo
     */
    public void setCDRInfo(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfo[] CDRInfo) {
        this.CDRInfo = CDRInfo;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfo getCDRInfo(int i) {
        return this.CDRInfo[i];
    }

    public void setCDRInfo(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRInfo _value) {
        this.CDRInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCDRResult)) return false;
        QueryCDRResult other = (QueryCDRResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalCDRNum==null && other.getTotalCDRNum()==null) || 
             (this.totalCDRNum!=null &&
              this.totalCDRNum.equals(other.getTotalCDRNum()))) &&
            ((this.beginRowNum==null && other.getBeginRowNum()==null) || 
             (this.beginRowNum!=null &&
              this.beginRowNum.equals(other.getBeginRowNum()))) &&
            ((this.fetchRowNum==null && other.getFetchRowNum()==null) || 
             (this.fetchRowNum!=null &&
              this.fetchRowNum.equals(other.getFetchRowNum()))) &&
            ((this.CDRSummary==null && other.getCDRSummary()==null) || 
             (this.CDRSummary!=null &&
              java.util.Arrays.equals(this.CDRSummary, other.getCDRSummary()))) &&
            ((this.CDRInfo==null && other.getCDRInfo()==null) || 
             (this.CDRInfo!=null &&
              java.util.Arrays.equals(this.CDRInfo, other.getCDRInfo())));
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
        if (getTotalCDRNum() != null) {
            _hashCode += getTotalCDRNum().hashCode();
        }
        if (getBeginRowNum() != null) {
            _hashCode += getBeginRowNum().hashCode();
        }
        if (getFetchRowNum() != null) {
            _hashCode += getFetchRowNum().hashCode();
        }
        if (getCDRSummary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCDRSummary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCDRSummary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCDRInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCDRInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCDRInfo(), i);
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
        new org.apache.axis.description.TypeDesc(QueryCDRResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryCDRResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCDRNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "TotalCDRNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginRowNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "BeginRowNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fetchRowNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FetchRowNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDRSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CDRSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRResult>CDRSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDRInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CDRInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRResult>CDRInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
