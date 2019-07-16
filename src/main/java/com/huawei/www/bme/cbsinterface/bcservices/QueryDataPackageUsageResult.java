/**
 * QueryDataPackageUsageResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryDataPackageUsageResult  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageResultUsageList[] usageList;

    private java.lang.String billCycleOpenDate;

    private java.lang.String billCycleEndDate;

    private java.math.BigInteger billCycleID;

    public QueryDataPackageUsageResult() {
    }

    public QueryDataPackageUsageResult(
           com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageResultUsageList[] usageList,
           java.lang.String billCycleOpenDate,
           java.lang.String billCycleEndDate,
           java.math.BigInteger billCycleID) {
           this.usageList = usageList;
           this.billCycleOpenDate = billCycleOpenDate;
           this.billCycleEndDate = billCycleEndDate;
           this.billCycleID = billCycleID;
    }


    /**
     * Gets the usageList value for this QueryDataPackageUsageResult.
     * 
     * @return usageList
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageResultUsageList[] getUsageList() {
        return usageList;
    }


    /**
     * Sets the usageList value for this QueryDataPackageUsageResult.
     * 
     * @param usageList
     */
    public void setUsageList(com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageResultUsageList[] usageList) {
        this.usageList = usageList;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageResultUsageList getUsageList(int i) {
        return this.usageList[i];
    }

    public void setUsageList(int i, com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageResultUsageList _value) {
        this.usageList[i] = _value;
    }


    /**
     * Gets the billCycleOpenDate value for this QueryDataPackageUsageResult.
     * 
     * @return billCycleOpenDate
     */
    public java.lang.String getBillCycleOpenDate() {
        return billCycleOpenDate;
    }


    /**
     * Sets the billCycleOpenDate value for this QueryDataPackageUsageResult.
     * 
     * @param billCycleOpenDate
     */
    public void setBillCycleOpenDate(java.lang.String billCycleOpenDate) {
        this.billCycleOpenDate = billCycleOpenDate;
    }


    /**
     * Gets the billCycleEndDate value for this QueryDataPackageUsageResult.
     * 
     * @return billCycleEndDate
     */
    public java.lang.String getBillCycleEndDate() {
        return billCycleEndDate;
    }


    /**
     * Sets the billCycleEndDate value for this QueryDataPackageUsageResult.
     * 
     * @param billCycleEndDate
     */
    public void setBillCycleEndDate(java.lang.String billCycleEndDate) {
        this.billCycleEndDate = billCycleEndDate;
    }


    /**
     * Gets the billCycleID value for this QueryDataPackageUsageResult.
     * 
     * @return billCycleID
     */
    public java.math.BigInteger getBillCycleID() {
        return billCycleID;
    }


    /**
     * Sets the billCycleID value for this QueryDataPackageUsageResult.
     * 
     * @param billCycleID
     */
    public void setBillCycleID(java.math.BigInteger billCycleID) {
        this.billCycleID = billCycleID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryDataPackageUsageResult)) return false;
        QueryDataPackageUsageResult other = (QueryDataPackageUsageResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usageList==null && other.getUsageList()==null) || 
             (this.usageList!=null &&
              java.util.Arrays.equals(this.usageList, other.getUsageList()))) &&
            ((this.billCycleOpenDate==null && other.getBillCycleOpenDate()==null) || 
             (this.billCycleOpenDate!=null &&
              this.billCycleOpenDate.equals(other.getBillCycleOpenDate()))) &&
            ((this.billCycleEndDate==null && other.getBillCycleEndDate()==null) || 
             (this.billCycleEndDate!=null &&
              this.billCycleEndDate.equals(other.getBillCycleEndDate()))) &&
            ((this.billCycleID==null && other.getBillCycleID()==null) || 
             (this.billCycleID!=null &&
              this.billCycleID.equals(other.getBillCycleID())));
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
        if (getUsageList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsageList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsageList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillCycleOpenDate() != null) {
            _hashCode += getBillCycleOpenDate().hashCode();
        }
        if (getBillCycleEndDate() != null) {
            _hashCode += getBillCycleEndDate().hashCode();
        }
        if (getBillCycleID() != null) {
            _hashCode += getBillCycleID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryDataPackageUsageResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryDataPackageUsageResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UsageList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryDataPackageUsageResult>UsageList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleOpenDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BillCycleOpenDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BillCycleEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BillCycleID"));
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
