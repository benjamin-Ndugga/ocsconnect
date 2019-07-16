/**
 * ChangeSubDFTAcctRequestDFTPayRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubDFTAcctRequestDFTPayRelation  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationDelPayRelation[] delPayRelation;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationAddPayRelation[] addPayRelation;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationPaymentLimit paymentLimit;

    public ChangeSubDFTAcctRequestDFTPayRelation() {
    }

    public ChangeSubDFTAcctRequestDFTPayRelation(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationDelPayRelation[] delPayRelation,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationAddPayRelation[] addPayRelation,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationPaymentLimit paymentLimit) {
           this.delPayRelation = delPayRelation;
           this.addPayRelation = addPayRelation;
           this.paymentLimit = paymentLimit;
    }


    /**
     * Gets the delPayRelation value for this ChangeSubDFTAcctRequestDFTPayRelation.
     * 
     * @return delPayRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationDelPayRelation[] getDelPayRelation() {
        return delPayRelation;
    }


    /**
     * Sets the delPayRelation value for this ChangeSubDFTAcctRequestDFTPayRelation.
     * 
     * @param delPayRelation
     */
    public void setDelPayRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationDelPayRelation[] delPayRelation) {
        this.delPayRelation = delPayRelation;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationDelPayRelation getDelPayRelation(int i) {
        return this.delPayRelation[i];
    }

    public void setDelPayRelation(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationDelPayRelation _value) {
        this.delPayRelation[i] = _value;
    }


    /**
     * Gets the addPayRelation value for this ChangeSubDFTAcctRequestDFTPayRelation.
     * 
     * @return addPayRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationAddPayRelation[] getAddPayRelation() {
        return addPayRelation;
    }


    /**
     * Sets the addPayRelation value for this ChangeSubDFTAcctRequestDFTPayRelation.
     * 
     * @param addPayRelation
     */
    public void setAddPayRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationAddPayRelation[] addPayRelation) {
        this.addPayRelation = addPayRelation;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationAddPayRelation getAddPayRelation(int i) {
        return this.addPayRelation[i];
    }

    public void setAddPayRelation(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationAddPayRelation _value) {
        this.addPayRelation[i] = _value;
    }


    /**
     * Gets the paymentLimit value for this ChangeSubDFTAcctRequestDFTPayRelation.
     * 
     * @return paymentLimit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationPaymentLimit getPaymentLimit() {
        return paymentLimit;
    }


    /**
     * Sets the paymentLimit value for this ChangeSubDFTAcctRequestDFTPayRelation.
     * 
     * @param paymentLimit
     */
    public void setPaymentLimit(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestDFTPayRelationPaymentLimit paymentLimit) {
        this.paymentLimit = paymentLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubDFTAcctRequestDFTPayRelation)) return false;
        ChangeSubDFTAcctRequestDFTPayRelation other = (ChangeSubDFTAcctRequestDFTPayRelation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.delPayRelation==null && other.getDelPayRelation()==null) || 
             (this.delPayRelation!=null &&
              java.util.Arrays.equals(this.delPayRelation, other.getDelPayRelation()))) &&
            ((this.addPayRelation==null && other.getAddPayRelation()==null) || 
             (this.addPayRelation!=null &&
              java.util.Arrays.equals(this.addPayRelation, other.getAddPayRelation()))) &&
            ((this.paymentLimit==null && other.getPaymentLimit()==null) || 
             (this.paymentLimit!=null &&
              this.paymentLimit.equals(other.getPaymentLimit())));
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
        if (getAddPayRelation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddPayRelation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddPayRelation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentLimit() != null) {
            _hashCode += getPaymentLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubDFTAcctRequestDFTPayRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubDFTAcctRequest>DFTPayRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delPayRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelPayRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubDFTAcctRequest>DFTPayRelation>DelPayRelation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addPayRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddPayRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubDFTAcctRequest>DFTPayRelation>AddPayRelation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubDFTAcctRequest>DFTPayRelation>PaymentLimit"));
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
