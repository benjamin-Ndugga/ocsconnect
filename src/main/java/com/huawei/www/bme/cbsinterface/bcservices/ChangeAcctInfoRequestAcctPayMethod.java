/**
 * ChangeAcctInfoRequestAcctPayMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAcctInfoRequestAcctPayMethod  implements java.io.Serializable {
    private java.lang.String oldPayMethod;

    private java.lang.String newPayMethod;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethodAddAutoPayChannel[] addAutoPayChannel;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethodDelAutoPayChannel[] delAutoPayChannel;

    public ChangeAcctInfoRequestAcctPayMethod() {
    }

    public ChangeAcctInfoRequestAcctPayMethod(
           java.lang.String oldPayMethod,
           java.lang.String newPayMethod,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethodAddAutoPayChannel[] addAutoPayChannel,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethodDelAutoPayChannel[] delAutoPayChannel) {
           this.oldPayMethod = oldPayMethod;
           this.newPayMethod = newPayMethod;
           this.addAutoPayChannel = addAutoPayChannel;
           this.delAutoPayChannel = delAutoPayChannel;
    }


    /**
     * Gets the oldPayMethod value for this ChangeAcctInfoRequestAcctPayMethod.
     * 
     * @return oldPayMethod
     */
    public java.lang.String getOldPayMethod() {
        return oldPayMethod;
    }


    /**
     * Sets the oldPayMethod value for this ChangeAcctInfoRequestAcctPayMethod.
     * 
     * @param oldPayMethod
     */
    public void setOldPayMethod(java.lang.String oldPayMethod) {
        this.oldPayMethod = oldPayMethod;
    }


    /**
     * Gets the newPayMethod value for this ChangeAcctInfoRequestAcctPayMethod.
     * 
     * @return newPayMethod
     */
    public java.lang.String getNewPayMethod() {
        return newPayMethod;
    }


    /**
     * Sets the newPayMethod value for this ChangeAcctInfoRequestAcctPayMethod.
     * 
     * @param newPayMethod
     */
    public void setNewPayMethod(java.lang.String newPayMethod) {
        this.newPayMethod = newPayMethod;
    }


    /**
     * Gets the addAutoPayChannel value for this ChangeAcctInfoRequestAcctPayMethod.
     * 
     * @return addAutoPayChannel
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethodAddAutoPayChannel[] getAddAutoPayChannel() {
        return addAutoPayChannel;
    }


    /**
     * Sets the addAutoPayChannel value for this ChangeAcctInfoRequestAcctPayMethod.
     * 
     * @param addAutoPayChannel
     */
    public void setAddAutoPayChannel(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethodAddAutoPayChannel[] addAutoPayChannel) {
        this.addAutoPayChannel = addAutoPayChannel;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethodAddAutoPayChannel getAddAutoPayChannel(int i) {
        return this.addAutoPayChannel[i];
    }

    public void setAddAutoPayChannel(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethodAddAutoPayChannel _value) {
        this.addAutoPayChannel[i] = _value;
    }


    /**
     * Gets the delAutoPayChannel value for this ChangeAcctInfoRequestAcctPayMethod.
     * 
     * @return delAutoPayChannel
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethodDelAutoPayChannel[] getDelAutoPayChannel() {
        return delAutoPayChannel;
    }


    /**
     * Sets the delAutoPayChannel value for this ChangeAcctInfoRequestAcctPayMethod.
     * 
     * @param delAutoPayChannel
     */
    public void setDelAutoPayChannel(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethodDelAutoPayChannel[] delAutoPayChannel) {
        this.delAutoPayChannel = delAutoPayChannel;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethodDelAutoPayChannel getDelAutoPayChannel(int i) {
        return this.delAutoPayChannel[i];
    }

    public void setDelAutoPayChannel(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestAcctPayMethodDelAutoPayChannel _value) {
        this.delAutoPayChannel[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAcctInfoRequestAcctPayMethod)) return false;
        ChangeAcctInfoRequestAcctPayMethod other = (ChangeAcctInfoRequestAcctPayMethod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldPayMethod==null && other.getOldPayMethod()==null) || 
             (this.oldPayMethod!=null &&
              this.oldPayMethod.equals(other.getOldPayMethod()))) &&
            ((this.newPayMethod==null && other.getNewPayMethod()==null) || 
             (this.newPayMethod!=null &&
              this.newPayMethod.equals(other.getNewPayMethod()))) &&
            ((this.addAutoPayChannel==null && other.getAddAutoPayChannel()==null) || 
             (this.addAutoPayChannel!=null &&
              java.util.Arrays.equals(this.addAutoPayChannel, other.getAddAutoPayChannel()))) &&
            ((this.delAutoPayChannel==null && other.getDelAutoPayChannel()==null) || 
             (this.delAutoPayChannel!=null &&
              java.util.Arrays.equals(this.delAutoPayChannel, other.getDelAutoPayChannel())));
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
        if (getOldPayMethod() != null) {
            _hashCode += getOldPayMethod().hashCode();
        }
        if (getNewPayMethod() != null) {
            _hashCode += getNewPayMethod().hashCode();
        }
        if (getAddAutoPayChannel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddAutoPayChannel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddAutoPayChannel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDelAutoPayChannel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelAutoPayChannel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelAutoPayChannel(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeAcctInfoRequestAcctPayMethod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctInfoRequest>AcctPayMethod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPayMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldPayMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPayMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewPayMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addAutoPayChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddAutoPayChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctInfoRequest>AcctPayMethod>AddAutoPayChannel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delAutoPayChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelAutoPayChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctInfoRequest>AcctPayMethod>DelAutoPayChannel"));
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
