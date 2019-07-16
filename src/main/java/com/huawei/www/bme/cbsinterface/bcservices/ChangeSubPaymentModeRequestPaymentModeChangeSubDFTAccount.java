/**
 * ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountOldDFTAcct oldDFTAcct;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct newDFTAcct;

    public ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount() {
    }

    public ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountOldDFTAcct oldDFTAcct,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct newDFTAcct) {
           this.oldDFTAcct = oldDFTAcct;
           this.newDFTAcct = newDFTAcct;
    }


    /**
     * Gets the oldDFTAcct value for this ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount.
     * 
     * @return oldDFTAcct
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountOldDFTAcct getOldDFTAcct() {
        return oldDFTAcct;
    }


    /**
     * Sets the oldDFTAcct value for this ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount.
     * 
     * @param oldDFTAcct
     */
    public void setOldDFTAcct(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountOldDFTAcct oldDFTAcct) {
        this.oldDFTAcct = oldDFTAcct;
    }


    /**
     * Gets the newDFTAcct value for this ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount.
     * 
     * @return newDFTAcct
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct getNewDFTAcct() {
        return newDFTAcct;
    }


    /**
     * Sets the newDFTAcct value for this ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount.
     * 
     * @param newDFTAcct
     */
    public void setNewDFTAcct(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct newDFTAcct) {
        this.newDFTAcct = newDFTAcct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount)) return false;
        ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount other = (ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldDFTAcct==null && other.getOldDFTAcct()==null) || 
             (this.oldDFTAcct!=null &&
              this.oldDFTAcct.equals(other.getOldDFTAcct()))) &&
            ((this.newDFTAcct==null && other.getNewDFTAcct()==null) || 
             (this.newDFTAcct!=null &&
              this.newDFTAcct.equals(other.getNewDFTAcct())));
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
        if (getOldDFTAcct() != null) {
            _hashCode += getOldDFTAcct().hashCode();
        }
        if (getNewDFTAcct() != null) {
            _hashCode += getNewDFTAcct().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubPaymentModeRequest>PaymentModeChange>SubDFTAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldDFTAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldDFTAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubPaymentModeRequest>PaymentModeChange>SubDFTAccount>OldDFTAcct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDFTAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewDFTAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubPaymentModeRequest>PaymentModeChange>SubDFTAccount>NewDFTAcct"));
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
