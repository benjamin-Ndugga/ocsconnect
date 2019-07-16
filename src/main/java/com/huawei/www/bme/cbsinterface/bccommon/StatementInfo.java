/**
 * StatementInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class StatementInfo  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.Contact contactInfo;

    private com.huawei.www.bme.cbsinterface.bccommon.StatementMedium[] smtMedium;

    private java.lang.String smtLang;

    public StatementInfo() {
    }

    public StatementInfo(
           com.huawei.www.bme.cbsinterface.bccommon.Contact contactInfo,
           com.huawei.www.bme.cbsinterface.bccommon.StatementMedium[] smtMedium,
           java.lang.String smtLang) {
           this.contactInfo = contactInfo;
           this.smtMedium = smtMedium;
           this.smtLang = smtLang;
    }


    /**
     * Gets the contactInfo value for this StatementInfo.
     * 
     * @return contactInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Contact getContactInfo() {
        return contactInfo;
    }


    /**
     * Sets the contactInfo value for this StatementInfo.
     * 
     * @param contactInfo
     */
    public void setContactInfo(com.huawei.www.bme.cbsinterface.bccommon.Contact contactInfo) {
        this.contactInfo = contactInfo;
    }


    /**
     * Gets the smtMedium value for this StatementInfo.
     * 
     * @return smtMedium
     */
    public com.huawei.www.bme.cbsinterface.bccommon.StatementMedium[] getSmtMedium() {
        return smtMedium;
    }


    /**
     * Sets the smtMedium value for this StatementInfo.
     * 
     * @param smtMedium
     */
    public void setSmtMedium(com.huawei.www.bme.cbsinterface.bccommon.StatementMedium[] smtMedium) {
        this.smtMedium = smtMedium;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.StatementMedium getSmtMedium(int i) {
        return this.smtMedium[i];
    }

    public void setSmtMedium(int i, com.huawei.www.bme.cbsinterface.bccommon.StatementMedium _value) {
        this.smtMedium[i] = _value;
    }


    /**
     * Gets the smtLang value for this StatementInfo.
     * 
     * @return smtLang
     */
    public java.lang.String getSmtLang() {
        return smtLang;
    }


    /**
     * Sets the smtLang value for this StatementInfo.
     * 
     * @param smtLang
     */
    public void setSmtLang(java.lang.String smtLang) {
        this.smtLang = smtLang;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatementInfo)) return false;
        StatementInfo other = (StatementInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contactInfo==null && other.getContactInfo()==null) || 
             (this.contactInfo!=null &&
              this.contactInfo.equals(other.getContactInfo()))) &&
            ((this.smtMedium==null && other.getSmtMedium()==null) || 
             (this.smtMedium!=null &&
              java.util.Arrays.equals(this.smtMedium, other.getSmtMedium()))) &&
            ((this.smtLang==null && other.getSmtLang()==null) || 
             (this.smtLang!=null &&
              this.smtLang.equals(other.getSmtLang())));
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
        if (getContactInfo() != null) {
            _hashCode += getContactInfo().hashCode();
        }
        if (getSmtMedium() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSmtMedium());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSmtMedium(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSmtLang() != null) {
            _hashCode += getSmtLang().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatementInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "StatementInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ContactInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smtMedium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SmtMedium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "StatementMedium"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smtLang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SmtLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
