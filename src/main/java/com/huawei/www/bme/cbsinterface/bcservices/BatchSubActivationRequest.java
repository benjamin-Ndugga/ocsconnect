/**
 * BatchSubActivationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;


/**
 * 批量激活一批号段号码
 */
public class BatchSubActivationRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequestSubBasicInfo subBasicInfo;

    private com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequestOfferingInst[] offeringInst;

    private java.lang.String fileName;

    public BatchSubActivationRequest() {
    }

    public BatchSubActivationRequest(
           com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequestSubBasicInfo subBasicInfo,
           com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequestOfferingInst[] offeringInst,
           java.lang.String fileName) {
           this.subBasicInfo = subBasicInfo;
           this.offeringInst = offeringInst;
           this.fileName = fileName;
    }


    /**
     * Gets the subBasicInfo value for this BatchSubActivationRequest.
     * 
     * @return subBasicInfo
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequestSubBasicInfo getSubBasicInfo() {
        return subBasicInfo;
    }


    /**
     * Sets the subBasicInfo value for this BatchSubActivationRequest.
     * 
     * @param subBasicInfo
     */
    public void setSubBasicInfo(com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequestSubBasicInfo subBasicInfo) {
        this.subBasicInfo = subBasicInfo;
    }


    /**
     * Gets the offeringInst value for this BatchSubActivationRequest.
     * 
     * @return offeringInst
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequestOfferingInst[] getOfferingInst() {
        return offeringInst;
    }


    /**
     * Sets the offeringInst value for this BatchSubActivationRequest.
     * 
     * @param offeringInst
     */
    public void setOfferingInst(com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequestOfferingInst[] offeringInst) {
        this.offeringInst = offeringInst;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequestOfferingInst getOfferingInst(int i) {
        return this.offeringInst[i];
    }

    public void setOfferingInst(int i, com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequestOfferingInst _value) {
        this.offeringInst[i] = _value;
    }


    /**
     * Gets the fileName value for this BatchSubActivationRequest.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BatchSubActivationRequest.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchSubActivationRequest)) return false;
        BatchSubActivationRequest other = (BatchSubActivationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subBasicInfo==null && other.getSubBasicInfo()==null) || 
             (this.subBasicInfo!=null &&
              this.subBasicInfo.equals(other.getSubBasicInfo()))) &&
            ((this.offeringInst==null && other.getOfferingInst()==null) || 
             (this.offeringInst!=null &&
              java.util.Arrays.equals(this.offeringInst, other.getOfferingInst()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName())));
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
        if (getSubBasicInfo() != null) {
            _hashCode += getSubBasicInfo().hashCode();
        }
        if (getOfferingInst() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferingInst());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferingInst(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchSubActivationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchSubActivationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subBasicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubBasicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSubActivationRequest>SubBasicInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringInst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingInst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSubActivationRequest>OfferingInst"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
