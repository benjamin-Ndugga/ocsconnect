/**
 * ManSubHomeZoneRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ManSubHomeZoneRequest  implements java.io.Serializable {
    private java.lang.String subscriberNo;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubHomeZoneRequestHomeZoneInfo[] homeZoneInfo;

    private int operationType;

    private java.lang.Integer handlingChargeFlag;

    public ManSubHomeZoneRequest() {
    }

    public ManSubHomeZoneRequest(
           java.lang.String subscriberNo,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubHomeZoneRequestHomeZoneInfo[] homeZoneInfo,
           int operationType,
           java.lang.Integer handlingChargeFlag) {
           this.subscriberNo = subscriberNo;
           this.homeZoneInfo = homeZoneInfo;
           this.operationType = operationType;
           this.handlingChargeFlag = handlingChargeFlag;
    }


    /**
     * Gets the subscriberNo value for this ManSubHomeZoneRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this ManSubHomeZoneRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the homeZoneInfo value for this ManSubHomeZoneRequest.
     * 
     * @return homeZoneInfo
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubHomeZoneRequestHomeZoneInfo[] getHomeZoneInfo() {
        return homeZoneInfo;
    }


    /**
     * Sets the homeZoneInfo value for this ManSubHomeZoneRequest.
     * 
     * @param homeZoneInfo
     */
    public void setHomeZoneInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubHomeZoneRequestHomeZoneInfo[] homeZoneInfo) {
        this.homeZoneInfo = homeZoneInfo;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubHomeZoneRequestHomeZoneInfo getHomeZoneInfo(int i) {
        return this.homeZoneInfo[i];
    }

    public void setHomeZoneInfo(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManSubHomeZoneRequestHomeZoneInfo _value) {
        this.homeZoneInfo[i] = _value;
    }


    /**
     * Gets the operationType value for this ManSubHomeZoneRequest.
     * 
     * @return operationType
     */
    public int getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this ManSubHomeZoneRequest.
     * 
     * @param operationType
     */
    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the handlingChargeFlag value for this ManSubHomeZoneRequest.
     * 
     * @return handlingChargeFlag
     */
    public java.lang.Integer getHandlingChargeFlag() {
        return handlingChargeFlag;
    }


    /**
     * Sets the handlingChargeFlag value for this ManSubHomeZoneRequest.
     * 
     * @param handlingChargeFlag
     */
    public void setHandlingChargeFlag(java.lang.Integer handlingChargeFlag) {
        this.handlingChargeFlag = handlingChargeFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManSubHomeZoneRequest)) return false;
        ManSubHomeZoneRequest other = (ManSubHomeZoneRequest) obj;
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
            ((this.homeZoneInfo==null && other.getHomeZoneInfo()==null) || 
             (this.homeZoneInfo!=null &&
              java.util.Arrays.equals(this.homeZoneInfo, other.getHomeZoneInfo()))) &&
            this.operationType == other.getOperationType() &&
            ((this.handlingChargeFlag==null && other.getHandlingChargeFlag()==null) || 
             (this.handlingChargeFlag!=null &&
              this.handlingChargeFlag.equals(other.getHandlingChargeFlag())));
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
        if (getHomeZoneInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHomeZoneInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHomeZoneInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getOperationType();
        if (getHandlingChargeFlag() != null) {
            _hashCode += getHandlingChargeFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManSubHomeZoneRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ManSubHomeZoneRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeZoneInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "HomeZoneInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ManSubHomeZoneRequest>HomeZoneInfo"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OperationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingChargeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "HandlingChargeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
