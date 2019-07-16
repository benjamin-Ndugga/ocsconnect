/**
 * QueryExpireSubToMicroResultPagingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryExpireSubToMicroResultPagingInfo  implements java.io.Serializable {
    /* Entity ID type. 
     * 1:Customer ID.   
     * 2:Account ID.   
     * 3:Subscriber ID.   
     * 4:Service Number.  
     * 5:ICCID */
    private java.math.BigInteger totalRowNum;

    private java.math.BigInteger beginRowNum;

    private java.math.BigInteger fetchRowNum;

    public QueryExpireSubToMicroResultPagingInfo() {
    }

    public QueryExpireSubToMicroResultPagingInfo(
           java.math.BigInteger totalRowNum,
           java.math.BigInteger beginRowNum,
           java.math.BigInteger fetchRowNum) {
           this.totalRowNum = totalRowNum;
           this.beginRowNum = beginRowNum;
           this.fetchRowNum = fetchRowNum;
    }


    /**
     * Gets the totalRowNum value for this QueryExpireSubToMicroResultPagingInfo.
     * 
     * @return totalRowNum   * Entity ID type. 
     * 1:Customer ID.   
     * 2:Account ID.   
     * 3:Subscriber ID.   
     * 4:Service Number.  
     * 5:ICCID
     */
    public java.math.BigInteger getTotalRowNum() {
        return totalRowNum;
    }


    /**
     * Sets the totalRowNum value for this QueryExpireSubToMicroResultPagingInfo.
     * 
     * @param totalRowNum   * Entity ID type. 
     * 1:Customer ID.   
     * 2:Account ID.   
     * 3:Subscriber ID.   
     * 4:Service Number.  
     * 5:ICCID
     */
    public void setTotalRowNum(java.math.BigInteger totalRowNum) {
        this.totalRowNum = totalRowNum;
    }


    /**
     * Gets the beginRowNum value for this QueryExpireSubToMicroResultPagingInfo.
     * 
     * @return beginRowNum
     */
    public java.math.BigInteger getBeginRowNum() {
        return beginRowNum;
    }


    /**
     * Sets the beginRowNum value for this QueryExpireSubToMicroResultPagingInfo.
     * 
     * @param beginRowNum
     */
    public void setBeginRowNum(java.math.BigInteger beginRowNum) {
        this.beginRowNum = beginRowNum;
    }


    /**
     * Gets the fetchRowNum value for this QueryExpireSubToMicroResultPagingInfo.
     * 
     * @return fetchRowNum
     */
    public java.math.BigInteger getFetchRowNum() {
        return fetchRowNum;
    }


    /**
     * Sets the fetchRowNum value for this QueryExpireSubToMicroResultPagingInfo.
     * 
     * @param fetchRowNum
     */
    public void setFetchRowNum(java.math.BigInteger fetchRowNum) {
        this.fetchRowNum = fetchRowNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryExpireSubToMicroResultPagingInfo)) return false;
        QueryExpireSubToMicroResultPagingInfo other = (QueryExpireSubToMicroResultPagingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalRowNum==null && other.getTotalRowNum()==null) || 
             (this.totalRowNum!=null &&
              this.totalRowNum.equals(other.getTotalRowNum()))) &&
            ((this.beginRowNum==null && other.getBeginRowNum()==null) || 
             (this.beginRowNum!=null &&
              this.beginRowNum.equals(other.getBeginRowNum()))) &&
            ((this.fetchRowNum==null && other.getFetchRowNum()==null) || 
             (this.fetchRowNum!=null &&
              this.fetchRowNum.equals(other.getFetchRowNum())));
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
        if (getTotalRowNum() != null) {
            _hashCode += getTotalRowNum().hashCode();
        }
        if (getBeginRowNum() != null) {
            _hashCode += getBeginRowNum().hashCode();
        }
        if (getFetchRowNum() != null) {
            _hashCode += getFetchRowNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryExpireSubToMicroResultPagingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryExpireSubToMicroResult>PagingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRowNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "TotalRowNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginRowNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BeginRowNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fetchRowNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FetchRowNum"));
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
