/**
 * ManSubCallScreenNoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ManSubCallScreenNoRequest  implements java.io.Serializable {
    private java.lang.String subscriberNo;

    private java.lang.String callScreenType;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubCallScreenNoRequestCallScreenNoInfo[] callScreenNoInfo;

    private int operationType;

    public ManSubCallScreenNoRequest() {
    }

    public ManSubCallScreenNoRequest(
           java.lang.String subscriberNo,
           java.lang.String callScreenType,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubCallScreenNoRequestCallScreenNoInfo[] callScreenNoInfo,
           int operationType) {
           this.subscriberNo = subscriberNo;
           this.callScreenType = callScreenType;
           this.callScreenNoInfo = callScreenNoInfo;
           this.operationType = operationType;
    }


    /**
     * Gets the subscriberNo value for this ManSubCallScreenNoRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this ManSubCallScreenNoRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the callScreenType value for this ManSubCallScreenNoRequest.
     * 
     * @return callScreenType
     */
    public java.lang.String getCallScreenType() {
        return callScreenType;
    }


    /**
     * Sets the callScreenType value for this ManSubCallScreenNoRequest.
     * 
     * @param callScreenType
     */
    public void setCallScreenType(java.lang.String callScreenType) {
        this.callScreenType = callScreenType;
    }


    /**
     * Gets the callScreenNoInfo value for this ManSubCallScreenNoRequest.
     * 
     * @return callScreenNoInfo
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubCallScreenNoRequestCallScreenNoInfo[] getCallScreenNoInfo() {
        return callScreenNoInfo;
    }


    /**
     * Sets the callScreenNoInfo value for this ManSubCallScreenNoRequest.
     * 
     * @param callScreenNoInfo
     */
    public void setCallScreenNoInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubCallScreenNoRequestCallScreenNoInfo[] callScreenNoInfo) {
        this.callScreenNoInfo = callScreenNoInfo;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubCallScreenNoRequestCallScreenNoInfo getCallScreenNoInfo(int i) {
        return this.callScreenNoInfo[i];
    }

    public void setCallScreenNoInfo(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubCallScreenNoRequestCallScreenNoInfo _value) {
        this.callScreenNoInfo[i] = _value;
    }


    /**
     * Gets the operationType value for this ManSubCallScreenNoRequest.
     * 
     * @return operationType
     */
    public int getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this ManSubCallScreenNoRequest.
     * 
     * @param operationType
     */
    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManSubCallScreenNoRequest)) return false;
        ManSubCallScreenNoRequest other = (ManSubCallScreenNoRequest) obj;
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
            ((this.callScreenType==null && other.getCallScreenType()==null) || 
             (this.callScreenType!=null &&
              this.callScreenType.equals(other.getCallScreenType()))) &&
            ((this.callScreenNoInfo==null && other.getCallScreenNoInfo()==null) || 
             (this.callScreenNoInfo!=null &&
              java.util.Arrays.equals(this.callScreenNoInfo, other.getCallScreenNoInfo()))) &&
            this.operationType == other.getOperationType();
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
        _hashCode += getOperationType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManSubCallScreenNoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ManSubCallScreenNoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callScreenType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CallScreenType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callScreenNoInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CallScreenNoInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ManSubCallScreenNoRequest>CallScreenNoInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OperationType"));
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
