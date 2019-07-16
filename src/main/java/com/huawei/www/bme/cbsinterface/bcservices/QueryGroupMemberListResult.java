/**
 * QueryGroupMemberListResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryGroupMemberListResult  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListResultGroupMemberList[] groupMemberList;

    private java.math.BigInteger totalNumber;

    private java.math.BigInteger beginRowNum;

    private java.math.BigInteger fetchRowNum;

    public QueryGroupMemberListResult() {
    }

    public QueryGroupMemberListResult(
           com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListResultGroupMemberList[] groupMemberList,
           java.math.BigInteger totalNumber,
           java.math.BigInteger beginRowNum,
           java.math.BigInteger fetchRowNum) {
           this.groupMemberList = groupMemberList;
           this.totalNumber = totalNumber;
           this.beginRowNum = beginRowNum;
           this.fetchRowNum = fetchRowNum;
    }


    /**
     * Gets the groupMemberList value for this QueryGroupMemberListResult.
     * 
     * @return groupMemberList
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListResultGroupMemberList[] getGroupMemberList() {
        return groupMemberList;
    }


    /**
     * Sets the groupMemberList value for this QueryGroupMemberListResult.
     * 
     * @param groupMemberList
     */
    public void setGroupMemberList(com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListResultGroupMemberList[] groupMemberList) {
        this.groupMemberList = groupMemberList;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListResultGroupMemberList getGroupMemberList(int i) {
        return this.groupMemberList[i];
    }

    public void setGroupMemberList(int i, com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListResultGroupMemberList _value) {
        this.groupMemberList[i] = _value;
    }


    /**
     * Gets the totalNumber value for this QueryGroupMemberListResult.
     * 
     * @return totalNumber
     */
    public java.math.BigInteger getTotalNumber() {
        return totalNumber;
    }


    /**
     * Sets the totalNumber value for this QueryGroupMemberListResult.
     * 
     * @param totalNumber
     */
    public void setTotalNumber(java.math.BigInteger totalNumber) {
        this.totalNumber = totalNumber;
    }


    /**
     * Gets the beginRowNum value for this QueryGroupMemberListResult.
     * 
     * @return beginRowNum
     */
    public java.math.BigInteger getBeginRowNum() {
        return beginRowNum;
    }


    /**
     * Sets the beginRowNum value for this QueryGroupMemberListResult.
     * 
     * @param beginRowNum
     */
    public void setBeginRowNum(java.math.BigInteger beginRowNum) {
        this.beginRowNum = beginRowNum;
    }


    /**
     * Gets the fetchRowNum value for this QueryGroupMemberListResult.
     * 
     * @return fetchRowNum
     */
    public java.math.BigInteger getFetchRowNum() {
        return fetchRowNum;
    }


    /**
     * Sets the fetchRowNum value for this QueryGroupMemberListResult.
     * 
     * @param fetchRowNum
     */
    public void setFetchRowNum(java.math.BigInteger fetchRowNum) {
        this.fetchRowNum = fetchRowNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryGroupMemberListResult)) return false;
        QueryGroupMemberListResult other = (QueryGroupMemberListResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupMemberList==null && other.getGroupMemberList()==null) || 
             (this.groupMemberList!=null &&
              java.util.Arrays.equals(this.groupMemberList, other.getGroupMemberList()))) &&
            ((this.totalNumber==null && other.getTotalNumber()==null) || 
             (this.totalNumber!=null &&
              this.totalNumber.equals(other.getTotalNumber()))) &&
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
        if (getGroupMemberList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupMemberList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupMemberList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalNumber() != null) {
            _hashCode += getTotalNumber().hashCode();
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
        new org.apache.axis.description.TypeDesc(QueryGroupMemberListResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryGroupMemberListResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMemberList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupMemberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryGroupMemberListResult>GroupMemberList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "TotalNumber"));
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
