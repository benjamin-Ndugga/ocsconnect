/**
 * QuerySubLifeCycleResultLifeCycleStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QuerySubLifeCycleResultLifeCycleStatus  implements java.io.Serializable {
    private java.lang.String statusName;

    private java.lang.String statusExpireTime;

    private java.lang.String statusIndex;

    public QuerySubLifeCycleResultLifeCycleStatus() {
    }

    public QuerySubLifeCycleResultLifeCycleStatus(
           java.lang.String statusName,
           java.lang.String statusExpireTime,
           java.lang.String statusIndex) {
           this.statusName = statusName;
           this.statusExpireTime = statusExpireTime;
           this.statusIndex = statusIndex;
    }


    /**
     * Gets the statusName value for this QuerySubLifeCycleResultLifeCycleStatus.
     * 
     * @return statusName
     */
    public java.lang.String getStatusName() {
        return statusName;
    }


    /**
     * Sets the statusName value for this QuerySubLifeCycleResultLifeCycleStatus.
     * 
     * @param statusName
     */
    public void setStatusName(java.lang.String statusName) {
        this.statusName = statusName;
    }


    /**
     * Gets the statusExpireTime value for this QuerySubLifeCycleResultLifeCycleStatus.
     * 
     * @return statusExpireTime
     */
    public java.lang.String getStatusExpireTime() {
        return statusExpireTime;
    }


    /**
     * Sets the statusExpireTime value for this QuerySubLifeCycleResultLifeCycleStatus.
     * 
     * @param statusExpireTime
     */
    public void setStatusExpireTime(java.lang.String statusExpireTime) {
        this.statusExpireTime = statusExpireTime;
    }


    /**
     * Gets the statusIndex value for this QuerySubLifeCycleResultLifeCycleStatus.
     * 
     * @return statusIndex
     */
    public java.lang.String getStatusIndex() {
        return statusIndex;
    }


    /**
     * Sets the statusIndex value for this QuerySubLifeCycleResultLifeCycleStatus.
     * 
     * @param statusIndex
     */
    public void setStatusIndex(java.lang.String statusIndex) {
        this.statusIndex = statusIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubLifeCycleResultLifeCycleStatus)) return false;
        QuerySubLifeCycleResultLifeCycleStatus other = (QuerySubLifeCycleResultLifeCycleStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusName==null && other.getStatusName()==null) || 
             (this.statusName!=null &&
              this.statusName.equals(other.getStatusName()))) &&
            ((this.statusExpireTime==null && other.getStatusExpireTime()==null) || 
             (this.statusExpireTime!=null &&
              this.statusExpireTime.equals(other.getStatusExpireTime()))) &&
            ((this.statusIndex==null && other.getStatusIndex()==null) || 
             (this.statusIndex!=null &&
              this.statusIndex.equals(other.getStatusIndex())));
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
        if (getStatusName() != null) {
            _hashCode += getStatusName().hashCode();
        }
        if (getStatusExpireTime() != null) {
            _hashCode += getStatusExpireTime().hashCode();
        }
        if (getStatusIndex() != null) {
            _hashCode += getStatusIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySubLifeCycleResultLifeCycleStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubLifeCycleResult>LifeCycleStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "StatusName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusExpireTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "StatusExpireTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "StatusIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
