/**
 * BatchChangeScatteredSubOwnershipRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccustomizedservices;

public class BatchChangeScatteredSubOwnershipRequest  implements java.io.Serializable {
    private java.lang.String fileName;

    /* 外部客户键值.新创建的或者已存在的客户键值 */
    private java.lang.String custKey;

    /* 预付费账期.CRM传入“01”账期。 */
    private java.lang.String prepaidBillCycleType;

    /* 1:“Code”取值为  “keepVPNGroupRelationFlag”。“Value”取值为“Y” (表示保留VPN群关系)
     * 或“N” (表示不保留VPN群关系) 。该属性不传递，则CBS默认保留群关系。
     * 2:“Code”取值为“keepCUGGroupRelationFlag”。“Value”取值为“Y” (表示保留CUG群关系) 或“N”
     * (表示不保留CUG群关系) 。该属性不传递，则CBS默认保留群关系。 */
    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] controlProperty;

    public BatchChangeScatteredSubOwnershipRequest() {
    }

    public BatchChangeScatteredSubOwnershipRequest(
           java.lang.String fileName,
           java.lang.String custKey,
           java.lang.String prepaidBillCycleType,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] controlProperty) {
           this.fileName = fileName;
           this.custKey = custKey;
           this.prepaidBillCycleType = prepaidBillCycleType;
           this.controlProperty = controlProperty;
    }


    /**
     * Gets the fileName value for this BatchChangeScatteredSubOwnershipRequest.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BatchChangeScatteredSubOwnershipRequest.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the custKey value for this BatchChangeScatteredSubOwnershipRequest.
     * 
     * @return custKey   * 外部客户键值.新创建的或者已存在的客户键值
     */
    public java.lang.String getCustKey() {
        return custKey;
    }


    /**
     * Sets the custKey value for this BatchChangeScatteredSubOwnershipRequest.
     * 
     * @param custKey   * 外部客户键值.新创建的或者已存在的客户键值
     */
    public void setCustKey(java.lang.String custKey) {
        this.custKey = custKey;
    }


    /**
     * Gets the prepaidBillCycleType value for this BatchChangeScatteredSubOwnershipRequest.
     * 
     * @return prepaidBillCycleType   * 预付费账期.CRM传入“01”账期。
     */
    public java.lang.String getPrepaidBillCycleType() {
        return prepaidBillCycleType;
    }


    /**
     * Sets the prepaidBillCycleType value for this BatchChangeScatteredSubOwnershipRequest.
     * 
     * @param prepaidBillCycleType   * 预付费账期.CRM传入“01”账期。
     */
    public void setPrepaidBillCycleType(java.lang.String prepaidBillCycleType) {
        this.prepaidBillCycleType = prepaidBillCycleType;
    }


    /**
     * Gets the controlProperty value for this BatchChangeScatteredSubOwnershipRequest.
     * 
     * @return controlProperty   * 1:“Code”取值为  “keepVPNGroupRelationFlag”。“Value”取值为“Y” (表示保留VPN群关系)
     * 或“N” (表示不保留VPN群关系) 。该属性不传递，则CBS默认保留群关系。
     * 2:“Code”取值为“keepCUGGroupRelationFlag”。“Value”取值为“Y” (表示保留CUG群关系) 或“N”
     * (表示不保留CUG群关系) 。该属性不传递，则CBS默认保留群关系。
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getControlProperty() {
        return controlProperty;
    }


    /**
     * Sets the controlProperty value for this BatchChangeScatteredSubOwnershipRequest.
     * 
     * @param controlProperty   * 1:“Code”取值为  “keepVPNGroupRelationFlag”。“Value”取值为“Y” (表示保留VPN群关系)
     * 或“N” (表示不保留VPN群关系) 。该属性不传递，则CBS默认保留群关系。
     * 2:“Code”取值为“keepCUGGroupRelationFlag”。“Value”取值为“Y” (表示保留CUG群关系) 或“N”
     * (表示不保留CUG群关系) 。该属性不传递，则CBS默认保留群关系。
     */
    public void setControlProperty(com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] controlProperty) {
        this.controlProperty = controlProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty getControlProperty(int i) {
        return this.controlProperty[i];
    }

    public void setControlProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty _value) {
        this.controlProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchChangeScatteredSubOwnershipRequest)) return false;
        BatchChangeScatteredSubOwnershipRequest other = (BatchChangeScatteredSubOwnershipRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.custKey==null && other.getCustKey()==null) || 
             (this.custKey!=null &&
              this.custKey.equals(other.getCustKey()))) &&
            ((this.prepaidBillCycleType==null && other.getPrepaidBillCycleType()==null) || 
             (this.prepaidBillCycleType!=null &&
              this.prepaidBillCycleType.equals(other.getPrepaidBillCycleType()))) &&
            ((this.controlProperty==null && other.getControlProperty()==null) || 
             (this.controlProperty!=null &&
              java.util.Arrays.equals(this.controlProperty, other.getControlProperty())));
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
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getCustKey() != null) {
            _hashCode += getCustKey().hashCode();
        }
        if (getPrepaidBillCycleType() != null) {
            _hashCode += getPrepaidBillCycleType().hashCode();
        }
        if (getControlProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getControlProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getControlProperty(), i);
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
        new org.apache.axis.description.TypeDesc(BatchChangeScatteredSubOwnershipRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "BatchChangeScatteredSubOwnershipRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "CustKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidBillCycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "PrepaidBillCycleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "ControlProperty"));
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
