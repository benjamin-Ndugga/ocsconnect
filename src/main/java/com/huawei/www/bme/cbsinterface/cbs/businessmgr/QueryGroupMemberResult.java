/**
 * QueryGroupMemberResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryGroupMemberResult  implements java.io.Serializable {
    private java.lang.String[] subscriberNo;

    private java.lang.String resultFileName;

    private int totalCount;

    public QueryGroupMemberResult() {
    }

    public QueryGroupMemberResult(
           java.lang.String[] subscriberNo,
           java.lang.String resultFileName,
           int totalCount) {
           this.subscriberNo = subscriberNo;
           this.resultFileName = resultFileName;
           this.totalCount = totalCount;
    }


    /**
     * Gets the subscriberNo value for this QueryGroupMemberResult.
     * 
     * @return subscriberNo
     */
    public java.lang.String[] getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this QueryGroupMemberResult.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String[] subscriberNo) {
        this.subscriberNo = subscriberNo;
    }

    public java.lang.String getSubscriberNo(int i) {
        return this.subscriberNo[i];
    }

    public void setSubscriberNo(int i, java.lang.String _value) {
        this.subscriberNo[i] = _value;
    }


    /**
     * Gets the resultFileName value for this QueryGroupMemberResult.
     * 
     * @return resultFileName
     */
    public java.lang.String getResultFileName() {
        return resultFileName;
    }


    /**
     * Sets the resultFileName value for this QueryGroupMemberResult.
     * 
     * @param resultFileName
     */
    public void setResultFileName(java.lang.String resultFileName) {
        this.resultFileName = resultFileName;
    }


    /**
     * Gets the totalCount value for this QueryGroupMemberResult.
     * 
     * @return totalCount
     */
    public int getTotalCount() {
        return totalCount;
    }


    /**
     * Sets the totalCount value for this QueryGroupMemberResult.
     * 
     * @param totalCount
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryGroupMemberResult)) return false;
        QueryGroupMemberResult other = (QueryGroupMemberResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              java.util.Arrays.equals(this.subscriberNo, other.getSubscriberNo()))) &&
            ((this.resultFileName==null && other.getResultFileName()==null) || 
             (this.resultFileName!=null &&
              this.resultFileName.equals(other.getResultFileName()))) &&
            this.totalCount == other.getTotalCount();
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
        if (getSubscriberNo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriberNo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriberNo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResultFileName() != null) {
            _hashCode += getResultFileName().hashCode();
        }
        _hashCode += getTotalCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryGroupMemberResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryGroupMemberResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ResultFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "TotalCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
