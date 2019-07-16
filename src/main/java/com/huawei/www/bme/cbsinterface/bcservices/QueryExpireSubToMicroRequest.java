/**
 * QueryExpireSubToMicroRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryExpireSubToMicroRequest  implements java.io.Serializable {
    /* The “TimePeriod” parameter presents date and time of the subscriber
     * , CBS system will return subscriber list who is in pool state from
     * start time to end time. */
    private com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroRequestTimePeriod timePeriod;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroRequestPagingInfo pagingInfo;

    public QueryExpireSubToMicroRequest() {
    }

    public QueryExpireSubToMicroRequest(
           com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroRequestTimePeriod timePeriod,
           com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroRequestPagingInfo pagingInfo) {
           this.timePeriod = timePeriod;
           this.pagingInfo = pagingInfo;
    }


    /**
     * Gets the timePeriod value for this QueryExpireSubToMicroRequest.
     * 
     * @return timePeriod   * The “TimePeriod” parameter presents date and time of the subscriber
     * , CBS system will return subscriber list who is in pool state from
     * start time to end time.
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroRequestTimePeriod getTimePeriod() {
        return timePeriod;
    }


    /**
     * Sets the timePeriod value for this QueryExpireSubToMicroRequest.
     * 
     * @param timePeriod   * The “TimePeriod” parameter presents date and time of the subscriber
     * , CBS system will return subscriber list who is in pool state from
     * start time to end time.
     */
    public void setTimePeriod(com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroRequestTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }


    /**
     * Gets the pagingInfo value for this QueryExpireSubToMicroRequest.
     * 
     * @return pagingInfo
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroRequestPagingInfo getPagingInfo() {
        return pagingInfo;
    }


    /**
     * Sets the pagingInfo value for this QueryExpireSubToMicroRequest.
     * 
     * @param pagingInfo
     */
    public void setPagingInfo(com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroRequestPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryExpireSubToMicroRequest)) return false;
        QueryExpireSubToMicroRequest other = (QueryExpireSubToMicroRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timePeriod==null && other.getTimePeriod()==null) || 
             (this.timePeriod!=null &&
              this.timePeriod.equals(other.getTimePeriod()))) &&
            ((this.pagingInfo==null && other.getPagingInfo()==null) || 
             (this.pagingInfo!=null &&
              this.pagingInfo.equals(other.getPagingInfo())));
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
        if (getTimePeriod() != null) {
            _hashCode += getTimePeriod().hashCode();
        }
        if (getPagingInfo() != null) {
            _hashCode += getPagingInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryExpireSubToMicroRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryExpireSubToMicroRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "TimePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryExpireSubToMicroRequest>TimePeriod"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PagingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryExpireSubToMicroRequest>PagingInfo"));
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
