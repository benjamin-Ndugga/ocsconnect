/**
 * FeeDeductionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class FeeDeductionRequest  implements java.io.Serializable {
    private java.lang.String deductSerialNo;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestDeductObj deductObj;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestOperationInfo operationInfo;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestDeductInfo[] deductInfo;

    /* It is reserved for future extension */
    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] additionalProperty;

    public FeeDeductionRequest() {
    }

    public FeeDeductionRequest(
           java.lang.String deductSerialNo,
           com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestDeductObj deductObj,
           com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestOperationInfo operationInfo,
           com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestDeductInfo[] deductInfo,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] additionalProperty) {
           this.deductSerialNo = deductSerialNo;
           this.deductObj = deductObj;
           this.operationInfo = operationInfo;
           this.deductInfo = deductInfo;
           this.additionalProperty = additionalProperty;
    }


    /**
     * Gets the deductSerialNo value for this FeeDeductionRequest.
     * 
     * @return deductSerialNo
     */
    public java.lang.String getDeductSerialNo() {
        return deductSerialNo;
    }


    /**
     * Sets the deductSerialNo value for this FeeDeductionRequest.
     * 
     * @param deductSerialNo
     */
    public void setDeductSerialNo(java.lang.String deductSerialNo) {
        this.deductSerialNo = deductSerialNo;
    }


    /**
     * Gets the deductObj value for this FeeDeductionRequest.
     * 
     * @return deductObj
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestDeductObj getDeductObj() {
        return deductObj;
    }


    /**
     * Sets the deductObj value for this FeeDeductionRequest.
     * 
     * @param deductObj
     */
    public void setDeductObj(com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestDeductObj deductObj) {
        this.deductObj = deductObj;
    }


    /**
     * Gets the operationInfo value for this FeeDeductionRequest.
     * 
     * @return operationInfo
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestOperationInfo getOperationInfo() {
        return operationInfo;
    }


    /**
     * Sets the operationInfo value for this FeeDeductionRequest.
     * 
     * @param operationInfo
     */
    public void setOperationInfo(com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestOperationInfo operationInfo) {
        this.operationInfo = operationInfo;
    }


    /**
     * Gets the deductInfo value for this FeeDeductionRequest.
     * 
     * @return deductInfo
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestDeductInfo[] getDeductInfo() {
        return deductInfo;
    }


    /**
     * Sets the deductInfo value for this FeeDeductionRequest.
     * 
     * @param deductInfo
     */
    public void setDeductInfo(com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestDeductInfo[] deductInfo) {
        this.deductInfo = deductInfo;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestDeductInfo getDeductInfo(int i) {
        return this.deductInfo[i];
    }

    public void setDeductInfo(int i, com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestDeductInfo _value) {
        this.deductInfo[i] = _value;
    }


    /**
     * Gets the additionalProperty value for this FeeDeductionRequest.
     * 
     * @return additionalProperty   * It is reserved for future extension
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getAdditionalProperty() {
        return additionalProperty;
    }


    /**
     * Sets the additionalProperty value for this FeeDeductionRequest.
     * 
     * @param additionalProperty   * It is reserved for future extension
     */
    public void setAdditionalProperty(com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty getAdditionalProperty(int i) {
        return this.additionalProperty[i];
    }

    public void setAdditionalProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty _value) {
        this.additionalProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeDeductionRequest)) return false;
        FeeDeductionRequest other = (FeeDeductionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deductSerialNo==null && other.getDeductSerialNo()==null) || 
             (this.deductSerialNo!=null &&
              this.deductSerialNo.equals(other.getDeductSerialNo()))) &&
            ((this.deductObj==null && other.getDeductObj()==null) || 
             (this.deductObj!=null &&
              this.deductObj.equals(other.getDeductObj()))) &&
            ((this.operationInfo==null && other.getOperationInfo()==null) || 
             (this.operationInfo!=null &&
              this.operationInfo.equals(other.getOperationInfo()))) &&
            ((this.deductInfo==null && other.getDeductInfo()==null) || 
             (this.deductInfo!=null &&
              java.util.Arrays.equals(this.deductInfo, other.getDeductInfo()))) &&
            ((this.additionalProperty==null && other.getAdditionalProperty()==null) || 
             (this.additionalProperty!=null &&
              java.util.Arrays.equals(this.additionalProperty, other.getAdditionalProperty())));
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
        if (getDeductSerialNo() != null) {
            _hashCode += getDeductSerialNo().hashCode();
        }
        if (getDeductObj() != null) {
            _hashCode += getDeductObj().hashCode();
        }
        if (getOperationInfo() != null) {
            _hashCode += getOperationInfo().hashCode();
        }
        if (getDeductInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeductInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeductInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdditionalProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalProperty(), i);
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
        new org.apache.axis.description.TypeDesc(FeeDeductionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeDeductionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DeductSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DeductObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRequest>DeductObj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OperationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRequest>OperationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DeductInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeDeductionRequest>DeductInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AdditionalProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SimpleProperty"));
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
