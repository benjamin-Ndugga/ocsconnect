/**
 * Statement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class Statement  implements java.io.Serializable {
    private java.lang.String smtKey;

    private java.math.BigInteger invoiceType;

    private java.lang.String smtClass;

    private com.huawei.www.bme.cbsinterface.bccommon.StatementInfo smtInfo;

    public Statement() {
    }

    public Statement(
           java.lang.String smtKey,
           java.math.BigInteger invoiceType,
           java.lang.String smtClass,
           com.huawei.www.bme.cbsinterface.bccommon.StatementInfo smtInfo) {
           this.smtKey = smtKey;
           this.invoiceType = invoiceType;
           this.smtClass = smtClass;
           this.smtInfo = smtInfo;
    }


    /**
     * Gets the smtKey value for this Statement.
     * 
     * @return smtKey
     */
    public java.lang.String getSmtKey() {
        return smtKey;
    }


    /**
     * Sets the smtKey value for this Statement.
     * 
     * @param smtKey
     */
    public void setSmtKey(java.lang.String smtKey) {
        this.smtKey = smtKey;
    }


    /**
     * Gets the invoiceType value for this Statement.
     * 
     * @return invoiceType
     */
    public java.math.BigInteger getInvoiceType() {
        return invoiceType;
    }


    /**
     * Sets the invoiceType value for this Statement.
     * 
     * @param invoiceType
     */
    public void setInvoiceType(java.math.BigInteger invoiceType) {
        this.invoiceType = invoiceType;
    }


    /**
     * Gets the smtClass value for this Statement.
     * 
     * @return smtClass
     */
    public java.lang.String getSmtClass() {
        return smtClass;
    }


    /**
     * Sets the smtClass value for this Statement.
     * 
     * @param smtClass
     */
    public void setSmtClass(java.lang.String smtClass) {
        this.smtClass = smtClass;
    }


    /**
     * Gets the smtInfo value for this Statement.
     * 
     * @return smtInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.StatementInfo getSmtInfo() {
        return smtInfo;
    }


    /**
     * Sets the smtInfo value for this Statement.
     * 
     * @param smtInfo
     */
    public void setSmtInfo(com.huawei.www.bme.cbsinterface.bccommon.StatementInfo smtInfo) {
        this.smtInfo = smtInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Statement)) return false;
        Statement other = (Statement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.smtKey==null && other.getSmtKey()==null) || 
             (this.smtKey!=null &&
              this.smtKey.equals(other.getSmtKey()))) &&
            ((this.invoiceType==null && other.getInvoiceType()==null) || 
             (this.invoiceType!=null &&
              this.invoiceType.equals(other.getInvoiceType()))) &&
            ((this.smtClass==null && other.getSmtClass()==null) || 
             (this.smtClass!=null &&
              this.smtClass.equals(other.getSmtClass()))) &&
            ((this.smtInfo==null && other.getSmtInfo()==null) || 
             (this.smtInfo!=null &&
              this.smtInfo.equals(other.getSmtInfo())));
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
        if (getSmtKey() != null) {
            _hashCode += getSmtKey().hashCode();
        }
        if (getInvoiceType() != null) {
            _hashCode += getInvoiceType().hashCode();
        }
        if (getSmtClass() != null) {
            _hashCode += getSmtClass().hashCode();
        }
        if (getSmtInfo() != null) {
            _hashCode += getSmtInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Statement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Statement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smtKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SmtKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "InvoiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smtClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SmtClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smtInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SmtInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "StatementInfo"));
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
