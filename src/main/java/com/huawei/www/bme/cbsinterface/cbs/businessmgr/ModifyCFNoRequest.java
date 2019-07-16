/**
 * ModifyCFNoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ModifyCFNoRequest  implements java.io.Serializable {
    private java.lang.String subscriberNo;

    private java.lang.String busyCFNo;

    private java.lang.String noAnswerCFNo;

    private java.lang.String noReachableCFNo;

    public ModifyCFNoRequest() {
    }

    public ModifyCFNoRequest(
           java.lang.String subscriberNo,
           java.lang.String busyCFNo,
           java.lang.String noAnswerCFNo,
           java.lang.String noReachableCFNo) {
           this.subscriberNo = subscriberNo;
           this.busyCFNo = busyCFNo;
           this.noAnswerCFNo = noAnswerCFNo;
           this.noReachableCFNo = noReachableCFNo;
    }


    /**
     * Gets the subscriberNo value for this ModifyCFNoRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this ModifyCFNoRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the busyCFNo value for this ModifyCFNoRequest.
     * 
     * @return busyCFNo
     */
    public java.lang.String getBusyCFNo() {
        return busyCFNo;
    }


    /**
     * Sets the busyCFNo value for this ModifyCFNoRequest.
     * 
     * @param busyCFNo
     */
    public void setBusyCFNo(java.lang.String busyCFNo) {
        this.busyCFNo = busyCFNo;
    }


    /**
     * Gets the noAnswerCFNo value for this ModifyCFNoRequest.
     * 
     * @return noAnswerCFNo
     */
    public java.lang.String getNoAnswerCFNo() {
        return noAnswerCFNo;
    }


    /**
     * Sets the noAnswerCFNo value for this ModifyCFNoRequest.
     * 
     * @param noAnswerCFNo
     */
    public void setNoAnswerCFNo(java.lang.String noAnswerCFNo) {
        this.noAnswerCFNo = noAnswerCFNo;
    }


    /**
     * Gets the noReachableCFNo value for this ModifyCFNoRequest.
     * 
     * @return noReachableCFNo
     */
    public java.lang.String getNoReachableCFNo() {
        return noReachableCFNo;
    }


    /**
     * Sets the noReachableCFNo value for this ModifyCFNoRequest.
     * 
     * @param noReachableCFNo
     */
    public void setNoReachableCFNo(java.lang.String noReachableCFNo) {
        this.noReachableCFNo = noReachableCFNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyCFNoRequest)) return false;
        ModifyCFNoRequest other = (ModifyCFNoRequest) obj;
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
            ((this.busyCFNo==null && other.getBusyCFNo()==null) || 
             (this.busyCFNo!=null &&
              this.busyCFNo.equals(other.getBusyCFNo()))) &&
            ((this.noAnswerCFNo==null && other.getNoAnswerCFNo()==null) || 
             (this.noAnswerCFNo!=null &&
              this.noAnswerCFNo.equals(other.getNoAnswerCFNo()))) &&
            ((this.noReachableCFNo==null && other.getNoReachableCFNo()==null) || 
             (this.noReachableCFNo!=null &&
              this.noReachableCFNo.equals(other.getNoReachableCFNo())));
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
        if (getBusyCFNo() != null) {
            _hashCode += getBusyCFNo().hashCode();
        }
        if (getNoAnswerCFNo() != null) {
            _hashCode += getNoAnswerCFNo().hashCode();
        }
        if (getNoReachableCFNo() != null) {
            _hashCode += getNoReachableCFNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyCFNoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ModifyCFNoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busyCFNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BusyCFNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noAnswerCFNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NoAnswerCFNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noReachableCFNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NoReachableCFNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
