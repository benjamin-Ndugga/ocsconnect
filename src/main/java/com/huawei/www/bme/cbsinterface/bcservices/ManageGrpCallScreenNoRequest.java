/**
 * ManageGrpCallScreenNoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ManageGrpCallScreenNoRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode;

    private java.lang.String callScreenType;

    private com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoRequestCallScreenNoInfo[] callScreenNoInfo;

    private java.math.BigInteger operationType;

    public ManageGrpCallScreenNoRequest() {
    }

    public ManageGrpCallScreenNoRequest(
           com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode,
           java.lang.String callScreenType,
           com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoRequestCallScreenNoInfo[] callScreenNoInfo,
           java.math.BigInteger operationType) {
           this.subGroupAccessCode = subGroupAccessCode;
           this.callScreenType = callScreenType;
           this.callScreenNoInfo = callScreenNoInfo;
           this.operationType = operationType;
    }


    /**
     * Gets the subGroupAccessCode value for this ManageGrpCallScreenNoRequest.
     * 
     * @return subGroupAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode getSubGroupAccessCode() {
        return subGroupAccessCode;
    }


    /**
     * Sets the subGroupAccessCode value for this ManageGrpCallScreenNoRequest.
     * 
     * @param subGroupAccessCode
     */
    public void setSubGroupAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode) {
        this.subGroupAccessCode = subGroupAccessCode;
    }


    /**
     * Gets the callScreenType value for this ManageGrpCallScreenNoRequest.
     * 
     * @return callScreenType
     */
    public java.lang.String getCallScreenType() {
        return callScreenType;
    }


    /**
     * Sets the callScreenType value for this ManageGrpCallScreenNoRequest.
     * 
     * @param callScreenType
     */
    public void setCallScreenType(java.lang.String callScreenType) {
        this.callScreenType = callScreenType;
    }


    /**
     * Gets the callScreenNoInfo value for this ManageGrpCallScreenNoRequest.
     * 
     * @return callScreenNoInfo
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoRequestCallScreenNoInfo[] getCallScreenNoInfo() {
        return callScreenNoInfo;
    }


    /**
     * Sets the callScreenNoInfo value for this ManageGrpCallScreenNoRequest.
     * 
     * @param callScreenNoInfo
     */
    public void setCallScreenNoInfo(com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoRequestCallScreenNoInfo[] callScreenNoInfo) {
        this.callScreenNoInfo = callScreenNoInfo;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoRequestCallScreenNoInfo getCallScreenNoInfo(int i) {
        return this.callScreenNoInfo[i];
    }

    public void setCallScreenNoInfo(int i, com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoRequestCallScreenNoInfo _value) {
        this.callScreenNoInfo[i] = _value;
    }


    /**
     * Gets the operationType value for this ManageGrpCallScreenNoRequest.
     * 
     * @return operationType
     */
    public java.math.BigInteger getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this ManageGrpCallScreenNoRequest.
     * 
     * @param operationType
     */
    public void setOperationType(java.math.BigInteger operationType) {
        this.operationType = operationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageGrpCallScreenNoRequest)) return false;
        ManageGrpCallScreenNoRequest other = (ManageGrpCallScreenNoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subGroupAccessCode==null && other.getSubGroupAccessCode()==null) || 
             (this.subGroupAccessCode!=null &&
              this.subGroupAccessCode.equals(other.getSubGroupAccessCode()))) &&
            ((this.callScreenType==null && other.getCallScreenType()==null) || 
             (this.callScreenType!=null &&
              this.callScreenType.equals(other.getCallScreenType()))) &&
            ((this.callScreenNoInfo==null && other.getCallScreenNoInfo()==null) || 
             (this.callScreenNoInfo!=null &&
              java.util.Arrays.equals(this.callScreenNoInfo, other.getCallScreenNoInfo()))) &&
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType())));
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
        if (getSubGroupAccessCode() != null) {
            _hashCode += getSubGroupAccessCode().hashCode();
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
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageGrpCallScreenNoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManageGrpCallScreenNoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGroupAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callScreenType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CallScreenType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callScreenNoInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CallScreenNoInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManageGrpCallScreenNoRequest>CallScreenNoInfo"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OperationType"));
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
