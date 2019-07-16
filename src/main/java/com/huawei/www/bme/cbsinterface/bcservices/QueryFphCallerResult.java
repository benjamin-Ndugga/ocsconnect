/**
 * QueryFphCallerResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryFphCallerResult  implements java.io.Serializable {
    private java.lang.String subscriberNo;

    private com.huawei.www.bme.cbsinterface.bcservices.FphCaller[] fphCaller;

    public QueryFphCallerResult() {
    }

    public QueryFphCallerResult(
           java.lang.String subscriberNo,
           com.huawei.www.bme.cbsinterface.bcservices.FphCaller[] fphCaller) {
           this.subscriberNo = subscriberNo;
           this.fphCaller = fphCaller;
    }


    /**
     * Gets the subscriberNo value for this QueryFphCallerResult.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this QueryFphCallerResult.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the fphCaller value for this QueryFphCallerResult.
     * 
     * @return fphCaller
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FphCaller[] getFphCaller() {
        return fphCaller;
    }


    /**
     * Sets the fphCaller value for this QueryFphCallerResult.
     * 
     * @param fphCaller
     */
    public void setFphCaller(com.huawei.www.bme.cbsinterface.bcservices.FphCaller[] fphCaller) {
        this.fphCaller = fphCaller;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FphCaller getFphCaller(int i) {
        return this.fphCaller[i];
    }

    public void setFphCaller(int i, com.huawei.www.bme.cbsinterface.bcservices.FphCaller _value) {
        this.fphCaller[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryFphCallerResult)) return false;
        QueryFphCallerResult other = (QueryFphCallerResult) obj;
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
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            ((this.fphCaller==null && other.getFphCaller()==null) || 
             (this.fphCaller!=null &&
              java.util.Arrays.equals(this.fphCaller, other.getFphCaller())));
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
            _hashCode += getSubscriberNo().hashCode();
        }
        if (getFphCaller() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFphCaller());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFphCaller(), i);
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
        new org.apache.axis.description.TypeDesc(QueryFphCallerResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryFphCallerResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fphCaller");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FphCaller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FphCaller"));
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
