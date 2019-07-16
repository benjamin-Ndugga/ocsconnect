/**
 * BatchSwitchGroupMemberRequestPaymentRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BatchSwitchGroupMemberRequestPaymentRelation  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestPaymentRelationNewDFTAcct newDFTAcct;

    private com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestPaymentRelationAddPayRelation addPayRelation;

    public BatchSwitchGroupMemberRequestPaymentRelation() {
    }

    public BatchSwitchGroupMemberRequestPaymentRelation(
           com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestPaymentRelationNewDFTAcct newDFTAcct,
           com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestPaymentRelationAddPayRelation addPayRelation) {
           this.newDFTAcct = newDFTAcct;
           this.addPayRelation = addPayRelation;
    }


    /**
     * Gets the newDFTAcct value for this BatchSwitchGroupMemberRequestPaymentRelation.
     * 
     * @return newDFTAcct
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestPaymentRelationNewDFTAcct getNewDFTAcct() {
        return newDFTAcct;
    }


    /**
     * Sets the newDFTAcct value for this BatchSwitchGroupMemberRequestPaymentRelation.
     * 
     * @param newDFTAcct
     */
    public void setNewDFTAcct(com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestPaymentRelationNewDFTAcct newDFTAcct) {
        this.newDFTAcct = newDFTAcct;
    }


    /**
     * Gets the addPayRelation value for this BatchSwitchGroupMemberRequestPaymentRelation.
     * 
     * @return addPayRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestPaymentRelationAddPayRelation getAddPayRelation() {
        return addPayRelation;
    }


    /**
     * Sets the addPayRelation value for this BatchSwitchGroupMemberRequestPaymentRelation.
     * 
     * @param addPayRelation
     */
    public void setAddPayRelation(com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestPaymentRelationAddPayRelation addPayRelation) {
        this.addPayRelation = addPayRelation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchSwitchGroupMemberRequestPaymentRelation)) return false;
        BatchSwitchGroupMemberRequestPaymentRelation other = (BatchSwitchGroupMemberRequestPaymentRelation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.newDFTAcct==null && other.getNewDFTAcct()==null) || 
             (this.newDFTAcct!=null &&
              this.newDFTAcct.equals(other.getNewDFTAcct()))) &&
            ((this.addPayRelation==null && other.getAddPayRelation()==null) || 
             (this.addPayRelation!=null &&
              this.addPayRelation.equals(other.getAddPayRelation())));
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
        if (getNewDFTAcct() != null) {
            _hashCode += getNewDFTAcct().hashCode();
        }
        if (getAddPayRelation() != null) {
            _hashCode += getAddPayRelation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchSwitchGroupMemberRequestPaymentRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">BatchSwitchGroupMemberRequest>PaymentRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDFTAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewDFTAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchSwitchGroupMemberRequest>PaymentRelation>NewDFTAcct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addPayRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddPayRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>BatchSwitchGroupMemberRequest>PaymentRelation>AddPayRelation"));
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
