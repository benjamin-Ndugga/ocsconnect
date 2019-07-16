/**
 * QueryExpireSubToMicroResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryExpireSubToMicroResult  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultExpireSubscriber[] expireSubscriber;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultPagingInfo pagingInfo;

    public QueryExpireSubToMicroResult() {
    }

    public QueryExpireSubToMicroResult(
           com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultExpireSubscriber[] expireSubscriber,
           com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultPagingInfo pagingInfo) {
           this.expireSubscriber = expireSubscriber;
           this.pagingInfo = pagingInfo;
    }


    /**
     * Gets the expireSubscriber value for this QueryExpireSubToMicroResult.
     * 
     * @return expireSubscriber
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultExpireSubscriber[] getExpireSubscriber() {
        return expireSubscriber;
    }


    /**
     * Sets the expireSubscriber value for this QueryExpireSubToMicroResult.
     * 
     * @param expireSubscriber
     */
    public void setExpireSubscriber(com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultExpireSubscriber[] expireSubscriber) {
        this.expireSubscriber = expireSubscriber;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultExpireSubscriber getExpireSubscriber(int i) {
        return this.expireSubscriber[i];
    }

    public void setExpireSubscriber(int i, com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultExpireSubscriber _value) {
        this.expireSubscriber[i] = _value;
    }


    /**
     * Gets the pagingInfo value for this QueryExpireSubToMicroResult.
     * 
     * @return pagingInfo
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultPagingInfo getPagingInfo() {
        return pagingInfo;
    }


    /**
     * Sets the pagingInfo value for this QueryExpireSubToMicroResult.
     * 
     * @param pagingInfo
     */
    public void setPagingInfo(com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryExpireSubToMicroResult)) return false;
        QueryExpireSubToMicroResult other = (QueryExpireSubToMicroResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.expireSubscriber==null && other.getExpireSubscriber()==null) || 
             (this.expireSubscriber!=null &&
              java.util.Arrays.equals(this.expireSubscriber, other.getExpireSubscriber()))) &&
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
        if (getExpireSubscriber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpireSubscriber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpireSubscriber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPagingInfo() != null) {
            _hashCode += getPagingInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryExpireSubToMicroResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryExpireSubToMicroResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireSubscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpireSubscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryExpireSubToMicroResult>ExpireSubscriber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PagingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryExpireSubToMicroResult>PagingInfo"));
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
