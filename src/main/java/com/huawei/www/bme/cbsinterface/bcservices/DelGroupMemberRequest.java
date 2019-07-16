/**
 * DelGroupMemberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class DelGroupMemberRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode;

    private com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode groupMember;

    private com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelation paymentRelation;

    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey[] delGroupMemberOffering;

    private com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime;

    public DelGroupMemberRequest() {
    }

    public DelGroupMemberRequest(
           com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode,
           com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode groupMember,
           com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelation paymentRelation,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey[] delGroupMemberOffering,
           com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
           this.subGroupAccessCode = subGroupAccessCode;
           this.groupMember = groupMember;
           this.paymentRelation = paymentRelation;
           this.delGroupMemberOffering = delGroupMemberOffering;
           this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the subGroupAccessCode value for this DelGroupMemberRequest.
     * 
     * @return subGroupAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode getSubGroupAccessCode() {
        return subGroupAccessCode;
    }


    /**
     * Sets the subGroupAccessCode value for this DelGroupMemberRequest.
     * 
     * @param subGroupAccessCode
     */
    public void setSubGroupAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode) {
        this.subGroupAccessCode = subGroupAccessCode;
    }


    /**
     * Gets the groupMember value for this DelGroupMemberRequest.
     * 
     * @return groupMember
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode getGroupMember() {
        return groupMember;
    }


    /**
     * Sets the groupMember value for this DelGroupMemberRequest.
     * 
     * @param groupMember
     */
    public void setGroupMember(com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode groupMember) {
        this.groupMember = groupMember;
    }


    /**
     * Gets the paymentRelation value for this DelGroupMemberRequest.
     * 
     * @return paymentRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelation getPaymentRelation() {
        return paymentRelation;
    }


    /**
     * Sets the paymentRelation value for this DelGroupMemberRequest.
     * 
     * @param paymentRelation
     */
    public void setPaymentRelation(com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelation paymentRelation) {
        this.paymentRelation = paymentRelation;
    }


    /**
     * Gets the delGroupMemberOffering value for this DelGroupMemberRequest.
     * 
     * @return delGroupMemberOffering
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey[] getDelGroupMemberOffering() {
        return delGroupMemberOffering;
    }


    /**
     * Sets the delGroupMemberOffering value for this DelGroupMemberRequest.
     * 
     * @param delGroupMemberOffering
     */
    public void setDelGroupMemberOffering(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey[] delGroupMemberOffering) {
        this.delGroupMemberOffering = delGroupMemberOffering;
    }


    /**
     * Gets the effectiveTime value for this DelGroupMemberRequest.
     * 
     * @return effectiveTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.EffectMode getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this DelGroupMemberRequest.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelGroupMemberRequest)) return false;
        DelGroupMemberRequest other = (DelGroupMemberRequest) obj;
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
            ((this.groupMember==null && other.getGroupMember()==null) || 
             (this.groupMember!=null &&
              this.groupMember.equals(other.getGroupMember()))) &&
            ((this.paymentRelation==null && other.getPaymentRelation()==null) || 
             (this.paymentRelation!=null &&
              this.paymentRelation.equals(other.getPaymentRelation()))) &&
            ((this.delGroupMemberOffering==null && other.getDelGroupMemberOffering()==null) || 
             (this.delGroupMemberOffering!=null &&
              java.util.Arrays.equals(this.delGroupMemberOffering, other.getDelGroupMemberOffering()))) &&
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
        if (getSubGroupAccessCode() != null) {
            _hashCode += getSubGroupAccessCode().hashCode();
        }
        if (getGroupMember() != null) {
            _hashCode += getGroupMember().hashCode();
        }
        if (getPaymentRelation() != null) {
            _hashCode += getPaymentRelation().hashCode();
        }
        if (getDelGroupMemberOffering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelGroupMemberOffering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelGroupMemberOffering(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelGroupMemberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelGroupMemberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGroupAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMember");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DelGroupMemberRequest>PaymentRelation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delGroupMemberOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelGroupMemberOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
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
