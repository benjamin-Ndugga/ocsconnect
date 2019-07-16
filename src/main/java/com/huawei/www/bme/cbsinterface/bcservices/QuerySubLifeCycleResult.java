/**
 * QuerySubLifeCycleResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QuerySubLifeCycleResult  implements java.io.Serializable {
    private java.lang.String currentStatusIndex;

    private com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleResultLifeCycleStatus[] lifeCycleStatus;

    private java.lang.String RBlacklistStatus;

    private java.math.BigInteger fraudTimes;

    public QuerySubLifeCycleResult() {
    }

    public QuerySubLifeCycleResult(
           java.lang.String currentStatusIndex,
           com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleResultLifeCycleStatus[] lifeCycleStatus,
           java.lang.String RBlacklistStatus,
           java.math.BigInteger fraudTimes) {
           this.currentStatusIndex = currentStatusIndex;
           this.lifeCycleStatus = lifeCycleStatus;
           this.RBlacklistStatus = RBlacklistStatus;
           this.fraudTimes = fraudTimes;
    }


    /**
     * Gets the currentStatusIndex value for this QuerySubLifeCycleResult.
     * 
     * @return currentStatusIndex
     */
    public java.lang.String getCurrentStatusIndex() {
        return currentStatusIndex;
    }


    /**
     * Sets the currentStatusIndex value for this QuerySubLifeCycleResult.
     * 
     * @param currentStatusIndex
     */
    public void setCurrentStatusIndex(java.lang.String currentStatusIndex) {
        this.currentStatusIndex = currentStatusIndex;
    }


    /**
     * Gets the lifeCycleStatus value for this QuerySubLifeCycleResult.
     * 
     * @return lifeCycleStatus
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleResultLifeCycleStatus[] getLifeCycleStatus() {
        return lifeCycleStatus;
    }


    /**
     * Sets the lifeCycleStatus value for this QuerySubLifeCycleResult.
     * 
     * @param lifeCycleStatus
     */
    public void setLifeCycleStatus(com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleResultLifeCycleStatus[] lifeCycleStatus) {
        this.lifeCycleStatus = lifeCycleStatus;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleResultLifeCycleStatus getLifeCycleStatus(int i) {
        return this.lifeCycleStatus[i];
    }

    public void setLifeCycleStatus(int i, com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleResultLifeCycleStatus _value) {
        this.lifeCycleStatus[i] = _value;
    }


    /**
     * Gets the RBlacklistStatus value for this QuerySubLifeCycleResult.
     * 
     * @return RBlacklistStatus
     */
    public java.lang.String getRBlacklistStatus() {
        return RBlacklistStatus;
    }


    /**
     * Sets the RBlacklistStatus value for this QuerySubLifeCycleResult.
     * 
     * @param RBlacklistStatus
     */
    public void setRBlacklistStatus(java.lang.String RBlacklistStatus) {
        this.RBlacklistStatus = RBlacklistStatus;
    }


    /**
     * Gets the fraudTimes value for this QuerySubLifeCycleResult.
     * 
     * @return fraudTimes
     */
    public java.math.BigInteger getFraudTimes() {
        return fraudTimes;
    }


    /**
     * Sets the fraudTimes value for this QuerySubLifeCycleResult.
     * 
     * @param fraudTimes
     */
    public void setFraudTimes(java.math.BigInteger fraudTimes) {
        this.fraudTimes = fraudTimes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubLifeCycleResult)) return false;
        QuerySubLifeCycleResult other = (QuerySubLifeCycleResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currentStatusIndex==null && other.getCurrentStatusIndex()==null) || 
             (this.currentStatusIndex!=null &&
              this.currentStatusIndex.equals(other.getCurrentStatusIndex()))) &&
            ((this.lifeCycleStatus==null && other.getLifeCycleStatus()==null) || 
             (this.lifeCycleStatus!=null &&
              java.util.Arrays.equals(this.lifeCycleStatus, other.getLifeCycleStatus()))) &&
            ((this.RBlacklistStatus==null && other.getRBlacklistStatus()==null) || 
             (this.RBlacklistStatus!=null &&
              this.RBlacklistStatus.equals(other.getRBlacklistStatus()))) &&
            ((this.fraudTimes==null && other.getFraudTimes()==null) || 
             (this.fraudTimes!=null &&
              this.fraudTimes.equals(other.getFraudTimes())));
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
        if (getCurrentStatusIndex() != null) {
            _hashCode += getCurrentStatusIndex().hashCode();
        }
        if (getLifeCycleStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLifeCycleStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLifeCycleStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRBlacklistStatus() != null) {
            _hashCode += getRBlacklistStatus().hashCode();
        }
        if (getFraudTimes() != null) {
            _hashCode += getFraudTimes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySubLifeCycleResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QuerySubLifeCycleResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentStatusIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CurrentStatusIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeCycleStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "LifeCycleStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubLifeCycleResult>LifeCycleStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RBlacklistStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RBlacklistStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudTimes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FraudTimes"));
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
