/**
 * ChangeCustHierachyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeCustHierachyRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode custAccessCode;

    private com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode newParentCust;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyRequestAcctAccessCode acctAccessCode;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyRequestNewParentAcct newParentAcct;

    public ChangeCustHierachyRequest() {
    }

    public ChangeCustHierachyRequest(
           com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode custAccessCode,
           com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode newParentCust,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyRequestAcctAccessCode acctAccessCode,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyRequestNewParentAcct newParentAcct) {
           this.custAccessCode = custAccessCode;
           this.newParentCust = newParentCust;
           this.acctAccessCode = acctAccessCode;
           this.newParentAcct = newParentAcct;
    }


    /**
     * Gets the custAccessCode value for this ChangeCustHierachyRequest.
     * 
     * @return custAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode getCustAccessCode() {
        return custAccessCode;
    }


    /**
     * Sets the custAccessCode value for this ChangeCustHierachyRequest.
     * 
     * @param custAccessCode
     */
    public void setCustAccessCode(com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode custAccessCode) {
        this.custAccessCode = custAccessCode;
    }


    /**
     * Gets the newParentCust value for this ChangeCustHierachyRequest.
     * 
     * @return newParentCust
     */
    public com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode getNewParentCust() {
        return newParentCust;
    }


    /**
     * Sets the newParentCust value for this ChangeCustHierachyRequest.
     * 
     * @param newParentCust
     */
    public void setNewParentCust(com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode newParentCust) {
        this.newParentCust = newParentCust;
    }


    /**
     * Gets the acctAccessCode value for this ChangeCustHierachyRequest.
     * 
     * @return acctAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyRequestAcctAccessCode getAcctAccessCode() {
        return acctAccessCode;
    }


    /**
     * Sets the acctAccessCode value for this ChangeCustHierachyRequest.
     * 
     * @param acctAccessCode
     */
    public void setAcctAccessCode(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyRequestAcctAccessCode acctAccessCode) {
        this.acctAccessCode = acctAccessCode;
    }


    /**
     * Gets the newParentAcct value for this ChangeCustHierachyRequest.
     * 
     * @return newParentAcct
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyRequestNewParentAcct getNewParentAcct() {
        return newParentAcct;
    }


    /**
     * Sets the newParentAcct value for this ChangeCustHierachyRequest.
     * 
     * @param newParentAcct
     */
    public void setNewParentAcct(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyRequestNewParentAcct newParentAcct) {
        this.newParentAcct = newParentAcct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeCustHierachyRequest)) return false;
        ChangeCustHierachyRequest other = (ChangeCustHierachyRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.custAccessCode==null && other.getCustAccessCode()==null) || 
             (this.custAccessCode!=null &&
              this.custAccessCode.equals(other.getCustAccessCode()))) &&
            ((this.newParentCust==null && other.getNewParentCust()==null) || 
             (this.newParentCust!=null &&
              this.newParentCust.equals(other.getNewParentCust()))) &&
            ((this.acctAccessCode==null && other.getAcctAccessCode()==null) || 
             (this.acctAccessCode!=null &&
              this.acctAccessCode.equals(other.getAcctAccessCode()))) &&
            ((this.newParentAcct==null && other.getNewParentAcct()==null) || 
             (this.newParentAcct!=null &&
              this.newParentAcct.equals(other.getNewParentAcct())));
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
        if (getCustAccessCode() != null) {
            _hashCode += getCustAccessCode().hashCode();
        }
        if (getNewParentCust() != null) {
            _hashCode += getNewParentCust().hashCode();
        }
        if (getAcctAccessCode() != null) {
            _hashCode += getAcctAccessCode().hashCode();
        }
        if (getNewParentAcct() != null) {
            _hashCode += getNewParentAcct().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeCustHierachyRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeCustHierachyRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CustAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustAccessCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newParentCust");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewParentCust"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustAccessCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustHierachyRequest>AcctAccessCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newParentAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewParentAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustHierachyRequest>NewParentAcct"));
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
