/**
 * QuerySubCallScreenNoResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QuerySubCallScreenNoResult  implements java.io.Serializable {
    private java.lang.String callScreenType;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResultCallScreenNoInfo[] callScreenNoInfo;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResultNonCallScreenNoInfo[] nonCallScreenNoInfo;

    public QuerySubCallScreenNoResult() {
    }

    public QuerySubCallScreenNoResult(
           java.lang.String callScreenType,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResultCallScreenNoInfo[] callScreenNoInfo,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResultNonCallScreenNoInfo[] nonCallScreenNoInfo) {
           this.callScreenType = callScreenType;
           this.callScreenNoInfo = callScreenNoInfo;
           this.nonCallScreenNoInfo = nonCallScreenNoInfo;
    }


    /**
     * Gets the callScreenType value for this QuerySubCallScreenNoResult.
     * 
     * @return callScreenType
     */
    public java.lang.String getCallScreenType() {
        return callScreenType;
    }


    /**
     * Sets the callScreenType value for this QuerySubCallScreenNoResult.
     * 
     * @param callScreenType
     */
    public void setCallScreenType(java.lang.String callScreenType) {
        this.callScreenType = callScreenType;
    }


    /**
     * Gets the callScreenNoInfo value for this QuerySubCallScreenNoResult.
     * 
     * @return callScreenNoInfo
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResultCallScreenNoInfo[] getCallScreenNoInfo() {
        return callScreenNoInfo;
    }


    /**
     * Sets the callScreenNoInfo value for this QuerySubCallScreenNoResult.
     * 
     * @param callScreenNoInfo
     */
    public void setCallScreenNoInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResultCallScreenNoInfo[] callScreenNoInfo) {
        this.callScreenNoInfo = callScreenNoInfo;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResultCallScreenNoInfo getCallScreenNoInfo(int i) {
        return this.callScreenNoInfo[i];
    }

    public void setCallScreenNoInfo(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResultCallScreenNoInfo _value) {
        this.callScreenNoInfo[i] = _value;
    }


    /**
     * Gets the nonCallScreenNoInfo value for this QuerySubCallScreenNoResult.
     * 
     * @return nonCallScreenNoInfo
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResultNonCallScreenNoInfo[] getNonCallScreenNoInfo() {
        return nonCallScreenNoInfo;
    }


    /**
     * Sets the nonCallScreenNoInfo value for this QuerySubCallScreenNoResult.
     * 
     * @param nonCallScreenNoInfo
     */
    public void setNonCallScreenNoInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResultNonCallScreenNoInfo[] nonCallScreenNoInfo) {
        this.nonCallScreenNoInfo = nonCallScreenNoInfo;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResultNonCallScreenNoInfo getNonCallScreenNoInfo(int i) {
        return this.nonCallScreenNoInfo[i];
    }

    public void setNonCallScreenNoInfo(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.QuerySubCallScreenNoResultNonCallScreenNoInfo _value) {
        this.nonCallScreenNoInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubCallScreenNoResult)) return false;
        QuerySubCallScreenNoResult other = (QuerySubCallScreenNoResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.callScreenType==null && other.getCallScreenType()==null) || 
             (this.callScreenType!=null &&
              this.callScreenType.equals(other.getCallScreenType()))) &&
            ((this.callScreenNoInfo==null && other.getCallScreenNoInfo()==null) || 
             (this.callScreenNoInfo!=null &&
              java.util.Arrays.equals(this.callScreenNoInfo, other.getCallScreenNoInfo()))) &&
            ((this.nonCallScreenNoInfo==null && other.getNonCallScreenNoInfo()==null) || 
             (this.nonCallScreenNoInfo!=null &&
              java.util.Arrays.equals(this.nonCallScreenNoInfo, other.getNonCallScreenNoInfo())));
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
        if (getCallScreenType() != null) {
            _hashCode += getCallScreenType().hashCode();
        }
        if (getCallScreenNoInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCallScreenNoInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCallScreenNoInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNonCallScreenNoInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNonCallScreenNoInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNonCallScreenNoInfo(), i);
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
        new org.apache.axis.description.TypeDesc(QuerySubCallScreenNoResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QuerySubCallScreenNoResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callScreenType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CallScreenType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callScreenNoInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CallScreenNoInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubCallScreenNoResult>CallScreenNoInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonCallScreenNoInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NonCallScreenNoInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubCallScreenNoResult>NonCallScreenNoInfo"));
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
