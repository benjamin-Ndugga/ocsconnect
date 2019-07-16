/**
 * DelGroupMemberRequestPaymentRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class DelGroupMemberRequestPaymentRelation  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelationNewDFTAcct newDFTAcct;

    private com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelationDelPayRelation[] delPayRelation;

    public DelGroupMemberRequestPaymentRelation() {
    }

    public DelGroupMemberRequestPaymentRelation(
           com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelationNewDFTAcct newDFTAcct,
           com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelationDelPayRelation[] delPayRelation) {
           this.newDFTAcct = newDFTAcct;
           this.delPayRelation = delPayRelation;
    }


    /**
     * Gets the newDFTAcct value for this DelGroupMemberRequestPaymentRelation.
     * 
     * @return newDFTAcct
     */
    public com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelationNewDFTAcct getNewDFTAcct() {
        return newDFTAcct;
    }


    /**
     * Sets the newDFTAcct value for this DelGroupMemberRequestPaymentRelation.
     * 
     * @param newDFTAcct
     */
    public void setNewDFTAcct(com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelationNewDFTAcct newDFTAcct) {
        this.newDFTAcct = newDFTAcct;
    }


    /**
     * Gets the delPayRelation value for this DelGroupMemberRequestPaymentRelation.
     * 
     * @return delPayRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelationDelPayRelation[] getDelPayRelation() {
        return delPayRelation;
    }


    /**
     * Sets the delPayRelation value for this DelGroupMemberRequestPaymentRelation.
     * 
     * @param delPayRelation
     */
    public void setDelPayRelation(com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelationDelPayRelation[] delPayRelation) {
        this.delPayRelation = delPayRelation;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelationDelPayRelation getDelPayRelation(int i) {
        return this.delPayRelation[i];
    }

    public void setDelPayRelation(int i, com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestPaymentRelationDelPayRelation _value) {
        this.delPayRelation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelGroupMemberRequestPaymentRelation)) return false;
        DelGroupMemberRequestPaymentRelation other = (DelGroupMemberRequestPaymentRelation) obj;
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
            ((this.delPayRelation==null && other.getDelPayRelation()==null) || 
             (this.delPayRelation!=null &&
              java.util.Arrays.equals(this.delPayRelation, other.getDelPayRelation())));
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
        if (getDelPayRelation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelPayRelation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelPayRelation(), i);
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
        new org.apache.axis.description.TypeDesc(DelGroupMemberRequestPaymentRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DelGroupMemberRequest>PaymentRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDFTAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewDFTAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>DelGroupMemberRequest>PaymentRelation>NewDFTAcct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delPayRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelPayRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>DelGroupMemberRequest>PaymentRelation>DelPayRelation"));
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
