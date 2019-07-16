/**
 * ChangeSubDFTAcctRequestSubDFTAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubDFTAcctRequestSubDFTAccount  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestSubDFTAccountOldDFTAcct oldDFTAcct;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestSubDFTAccountNewDFTAcct newDFTAcct;

    public ChangeSubDFTAcctRequestSubDFTAccount() {
    }

    public ChangeSubDFTAcctRequestSubDFTAccount(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestSubDFTAccountOldDFTAcct oldDFTAcct,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestSubDFTAccountNewDFTAcct newDFTAcct) {
           this.oldDFTAcct = oldDFTAcct;
           this.newDFTAcct = newDFTAcct;
    }


    /**
     * Gets the oldDFTAcct value for this ChangeSubDFTAcctRequestSubDFTAccount.
     * 
     * @return oldDFTAcct
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestSubDFTAccountOldDFTAcct getOldDFTAcct() {
        return oldDFTAcct;
    }


    /**
     * Sets the oldDFTAcct value for this ChangeSubDFTAcctRequestSubDFTAccount.
     * 
     * @param oldDFTAcct
     */
    public void setOldDFTAcct(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestSubDFTAccountOldDFTAcct oldDFTAcct) {
        this.oldDFTAcct = oldDFTAcct;
    }


    /**
     * Gets the newDFTAcct value for this ChangeSubDFTAcctRequestSubDFTAccount.
     * 
     * @return newDFTAcct
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestSubDFTAccountNewDFTAcct getNewDFTAcct() {
        return newDFTAcct;
    }


    /**
     * Sets the newDFTAcct value for this ChangeSubDFTAcctRequestSubDFTAccount.
     * 
     * @param newDFTAcct
     */
    public void setNewDFTAcct(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestSubDFTAccountNewDFTAcct newDFTAcct) {
        this.newDFTAcct = newDFTAcct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubDFTAcctRequestSubDFTAccount)) return false;
        ChangeSubDFTAcctRequestSubDFTAccount other = (ChangeSubDFTAcctRequestSubDFTAccount) obj;
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
        new org.apache.axis.description.TypeDesc(ChangeSubDFTAcctRequestSubDFTAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubDFTAcctRequest>SubDFTAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldDFTAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldDFTAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubDFTAcctRequest>SubDFTAccount>OldDFTAcct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDFTAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewDFTAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubDFTAcctRequest>SubDFTAccount>NewDFTAcct"));
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
