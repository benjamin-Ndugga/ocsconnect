/**
 * BatchAddGroupMemberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchAddGroupMemberRequest  implements java.io.Serializable {
    private java.lang.String fileName;

    private com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode;

    private com.huawei.www.bme.cbsinterface.bccommon.OfferingInst[] groupMemberOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequestPaymentRelation paymentRelation;

    private com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime;

    public BatchAddGroupMemberRequest() {
    }

    public BatchAddGroupMemberRequest(
           java.lang.String fileName,
           com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingInst[] groupMemberOffering,
           com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequestPaymentRelation paymentRelation,
           com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
           this.fileName = fileName;
           this.subGroupAccessCode = subGroupAccessCode;
           this.groupMemberOffering = groupMemberOffering;
           this.paymentRelation = paymentRelation;
           this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the fileName value for this BatchAddGroupMemberRequest.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BatchAddGroupMemberRequest.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the subGroupAccessCode value for this BatchAddGroupMemberRequest.
     * 
     * @return subGroupAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode getSubGroupAccessCode() {
        return subGroupAccessCode;
    }


    /**
     * Sets the subGroupAccessCode value for this BatchAddGroupMemberRequest.
     * 
     * @param subGroupAccessCode
     */
    public void setSubGroupAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode) {
        this.subGroupAccessCode = subGroupAccessCode;
    }


    /**
     * Gets the groupMemberOffering value for this BatchAddGroupMemberRequest.
     * 
     * @return groupMemberOffering
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingInst[] getGroupMemberOffering() {
        return groupMemberOffering;
    }


    /**
     * Sets the groupMemberOffering value for this BatchAddGroupMemberRequest.
     * 
     * @param groupMemberOffering
     */
    public void setGroupMemberOffering(com.huawei.www.bme.cbsinterface.bccommon.OfferingInst[] groupMemberOffering) {
        this.groupMemberOffering = groupMemberOffering;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.OfferingInst getGroupMemberOffering(int i) {
        return this.groupMemberOffering[i];
    }

    public void setGroupMemberOffering(int i, com.huawei.www.bme.cbsinterface.bccommon.OfferingInst _value) {
        this.groupMemberOffering[i] = _value;
    }


    /**
     * Gets the paymentRelation value for this BatchAddGroupMemberRequest.
     * 
     * @return paymentRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequestPaymentRelation getPaymentRelation() {
        return paymentRelation;
    }


    /**
     * Sets the paymentRelation value for this BatchAddGroupMemberRequest.
     * 
     * @param paymentRelation
     */
    public void setPaymentRelation(com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequestPaymentRelation paymentRelation) {
        this.paymentRelation = paymentRelation;
    }


    /**
     * Gets the effectiveTime value for this BatchAddGroupMemberRequest.
     * 
     * @return effectiveTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.EffectMode getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this BatchAddGroupMemberRequest.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchAddGroupMemberRequest)) return false;
        BatchAddGroupMemberRequest other = (BatchAddGroupMemberRequest) obj;
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
            ((this.subGroupAccessCode==null && other.getSubGroupAccessCode()==null) || 
             (this.subGroupAccessCode!=null &&
              this.subGroupAccessCode.equals(other.getSubGroupAccessCode()))) &&
            ((this.groupMemberOffering==null && other.getGroupMemberOffering()==null) || 
             (this.groupMemberOffering!=null &&
              java.util.Arrays.equals(this.groupMemberOffering, other.getGroupMemberOffering()))) &&
            ((this.paymentRelation==null && other.getPaymentRelation()==null) || 
             (this.paymentRelation!=null &&
              this.paymentRelation.equals(other.getPaymentRelation()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime())));
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
        if (getSubGroupAccessCode() != null) {
            _hashCode += getSubGroupAccessCode().hashCode();
        }
        if (getGroupMemberOffering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupMemberOffering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupMemberOffering(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentRelation() != null) {
            _hashCode += getPaymentRelation().hashCode();
        }
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchAddGroupMemberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BatchAddGroupMemberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGroupAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMemberOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupMemberOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingInst"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchAddGroupMemberRequest>PaymentRelation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "EffectMode"));
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
