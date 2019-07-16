/**
 * GroupDelMemberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class GroupDelMemberRequest  implements java.io.Serializable {
    /* 用户群接入标识。
     * 该群只能是CUG群，如果不是则BM会返回错误。 */
    private com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode;

    /* CRM删除CUG传递给CBS的业务流水号.
     * CBS需要在执行玩GroupDelMemberRequest后，根据执行结果，通过CRM提供的NotifyDelCUGMember携带该流水返回给CRM。 */
    private java.lang.String busiSeq;

    public GroupDelMemberRequest() {
    }

    public GroupDelMemberRequest(
           com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode,
           java.lang.String busiSeq) {
           this.subGroupAccessCode = subGroupAccessCode;
           this.busiSeq = busiSeq;
    }


    /**
     * Gets the subGroupAccessCode value for this GroupDelMemberRequest.
     * 
     * @return subGroupAccessCode   * 用户群接入标识。
     * 该群只能是CUG群，如果不是则BM会返回错误。
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode getSubGroupAccessCode() {
        return subGroupAccessCode;
    }


    /**
     * Sets the subGroupAccessCode value for this GroupDelMemberRequest.
     * 
     * @param subGroupAccessCode   * 用户群接入标识。
     * 该群只能是CUG群，如果不是则BM会返回错误。
     */
    public void setSubGroupAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode) {
        this.subGroupAccessCode = subGroupAccessCode;
    }


    /**
     * Gets the busiSeq value for this GroupDelMemberRequest.
     * 
     * @return busiSeq   * CRM删除CUG传递给CBS的业务流水号.
     * CBS需要在执行玩GroupDelMemberRequest后，根据执行结果，通过CRM提供的NotifyDelCUGMember携带该流水返回给CRM。
     */
    public java.lang.String getBusiSeq() {
        return busiSeq;
    }


    /**
     * Sets the busiSeq value for this GroupDelMemberRequest.
     * 
     * @param busiSeq   * CRM删除CUG传递给CBS的业务流水号.
     * CBS需要在执行玩GroupDelMemberRequest后，根据执行结果，通过CRM提供的NotifyDelCUGMember携带该流水返回给CRM。
     */
    public void setBusiSeq(java.lang.String busiSeq) {
        this.busiSeq = busiSeq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GroupDelMemberRequest)) return false;
        GroupDelMemberRequest other = (GroupDelMemberRequest) obj;
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
            ((this.busiSeq==null && other.getBusiSeq()==null) || 
             (this.busiSeq!=null &&
              this.busiSeq.equals(other.getBusiSeq())));
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
        if (getBusiSeq() != null) {
            _hashCode += getBusiSeq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GroupDelMemberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupDelMemberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGroupAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BusiSeq"));
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
