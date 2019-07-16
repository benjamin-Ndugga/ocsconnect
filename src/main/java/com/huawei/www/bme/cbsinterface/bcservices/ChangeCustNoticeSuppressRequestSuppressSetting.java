/**
 * ChangeCustNoticeSuppressRequestSuppressSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeCustNoticeSuppressRequestSuppressSetting  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSettingAddSuppressSet[] addSuppressSet;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSettingDelSuppressSet[] delSuppressSet;

    public ChangeCustNoticeSuppressRequestSuppressSetting() {
    }

    public ChangeCustNoticeSuppressRequestSuppressSetting(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSettingAddSuppressSet[] addSuppressSet,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSettingDelSuppressSet[] delSuppressSet) {
           this.addSuppressSet = addSuppressSet;
           this.delSuppressSet = delSuppressSet;
    }


    /**
     * Gets the addSuppressSet value for this ChangeCustNoticeSuppressRequestSuppressSetting.
     * 
     * @return addSuppressSet
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSettingAddSuppressSet[] getAddSuppressSet() {
        return addSuppressSet;
    }


    /**
     * Sets the addSuppressSet value for this ChangeCustNoticeSuppressRequestSuppressSetting.
     * 
     * @param addSuppressSet
     */
    public void setAddSuppressSet(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSettingAddSuppressSet[] addSuppressSet) {
        this.addSuppressSet = addSuppressSet;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSettingAddSuppressSet getAddSuppressSet(int i) {
        return this.addSuppressSet[i];
    }

    public void setAddSuppressSet(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSettingAddSuppressSet _value) {
        this.addSuppressSet[i] = _value;
    }


    /**
     * Gets the delSuppressSet value for this ChangeCustNoticeSuppressRequestSuppressSetting.
     * 
     * @return delSuppressSet
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSettingDelSuppressSet[] getDelSuppressSet() {
        return delSuppressSet;
    }


    /**
     * Sets the delSuppressSet value for this ChangeCustNoticeSuppressRequestSuppressSetting.
     * 
     * @param delSuppressSet
     */
    public void setDelSuppressSet(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSettingDelSuppressSet[] delSuppressSet) {
        this.delSuppressSet = delSuppressSet;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSettingDelSuppressSet getDelSuppressSet(int i) {
        return this.delSuppressSet[i];
    }

    public void setDelSuppressSet(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestSuppressSettingDelSuppressSet _value) {
        this.delSuppressSet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeCustNoticeSuppressRequestSuppressSetting)) return false;
        ChangeCustNoticeSuppressRequestSuppressSetting other = (ChangeCustNoticeSuppressRequestSuppressSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addSuppressSet==null && other.getAddSuppressSet()==null) || 
             (this.addSuppressSet!=null &&
              java.util.Arrays.equals(this.addSuppressSet, other.getAddSuppressSet()))) &&
            ((this.delSuppressSet==null && other.getDelSuppressSet()==null) || 
             (this.delSuppressSet!=null &&
              java.util.Arrays.equals(this.delSuppressSet, other.getDelSuppressSet())));
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
        if (getAddSuppressSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddSuppressSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddSuppressSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDelSuppressSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelSuppressSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelSuppressSet(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeCustNoticeSuppressRequestSuppressSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustNoticeSuppressRequest>SuppressSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addSuppressSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddSuppressSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeCustNoticeSuppressRequest>SuppressSetting>AddSuppressSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delSuppressSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelSuppressSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeCustNoticeSuppressRequest>SuppressSetting>DelSuppressSet"));
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
