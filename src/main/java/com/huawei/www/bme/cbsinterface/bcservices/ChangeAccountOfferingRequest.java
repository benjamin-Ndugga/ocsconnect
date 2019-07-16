/**
 * ChangeAccountOfferingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAccountOfferingRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestAcctAccessCode acctAccessCode;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestAddOffering[] addOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestDelOffering[] delOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestModifyOffering[] modifyOffering;

    public ChangeAccountOfferingRequest() {
    }

    public ChangeAccountOfferingRequest(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestAcctAccessCode acctAccessCode,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestAddOffering[] addOffering,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestDelOffering[] delOffering,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestModifyOffering[] modifyOffering) {
           this.acctAccessCode = acctAccessCode;
           this.addOffering = addOffering;
           this.delOffering = delOffering;
           this.modifyOffering = modifyOffering;
    }


    /**
     * Gets the acctAccessCode value for this ChangeAccountOfferingRequest.
     * 
     * @return acctAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestAcctAccessCode getAcctAccessCode() {
        return acctAccessCode;
    }


    /**
     * Sets the acctAccessCode value for this ChangeAccountOfferingRequest.
     * 
     * @param acctAccessCode
     */
    public void setAcctAccessCode(com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestAcctAccessCode acctAccessCode) {
        this.acctAccessCode = acctAccessCode;
    }


    /**
     * Gets the addOffering value for this ChangeAccountOfferingRequest.
     * 
     * @return addOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestAddOffering[] getAddOffering() {
        return addOffering;
    }


    /**
     * Sets the addOffering value for this ChangeAccountOfferingRequest.
     * 
     * @param addOffering
     */
    public void setAddOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestAddOffering[] addOffering) {
        this.addOffering = addOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestAddOffering getAddOffering(int i) {
        return this.addOffering[i];
    }

    public void setAddOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestAddOffering _value) {
        this.addOffering[i] = _value;
    }


    /**
     * Gets the delOffering value for this ChangeAccountOfferingRequest.
     * 
     * @return delOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestDelOffering[] getDelOffering() {
        return delOffering;
    }


    /**
     * Sets the delOffering value for this ChangeAccountOfferingRequest.
     * 
     * @param delOffering
     */
    public void setDelOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestDelOffering[] delOffering) {
        this.delOffering = delOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestDelOffering getDelOffering(int i) {
        return this.delOffering[i];
    }

    public void setDelOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestDelOffering _value) {
        this.delOffering[i] = _value;
    }


    /**
     * Gets the modifyOffering value for this ChangeAccountOfferingRequest.
     * 
     * @return modifyOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestModifyOffering[] getModifyOffering() {
        return modifyOffering;
    }


    /**
     * Sets the modifyOffering value for this ChangeAccountOfferingRequest.
     * 
     * @param modifyOffering
     */
    public void setModifyOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestModifyOffering[] modifyOffering) {
        this.modifyOffering = modifyOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestModifyOffering getModifyOffering(int i) {
        return this.modifyOffering[i];
    }

    public void setModifyOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestModifyOffering _value) {
        this.modifyOffering[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAccountOfferingRequest)) return false;
        ChangeAccountOfferingRequest other = (ChangeAccountOfferingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctAccessCode==null && other.getAcctAccessCode()==null) || 
             (this.acctAccessCode!=null &&
              this.acctAccessCode.equals(other.getAcctAccessCode()))) &&
            ((this.addOffering==null && other.getAddOffering()==null) || 
             (this.addOffering!=null &&
              java.util.Arrays.equals(this.addOffering, other.getAddOffering()))) &&
            ((this.delOffering==null && other.getDelOffering()==null) || 
             (this.delOffering!=null &&
              java.util.Arrays.equals(this.delOffering, other.getDelOffering()))) &&
            ((this.modifyOffering==null && other.getModifyOffering()==null) || 
             (this.modifyOffering!=null &&
              java.util.Arrays.equals(this.modifyOffering, other.getModifyOffering())));
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
        if (getAcctAccessCode() != null) {
            _hashCode += getAcctAccessCode().hashCode();
        }
        if (getAddOffering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddOffering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddOffering(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDelOffering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelOffering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelOffering(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModifyOffering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModifyOffering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModifyOffering(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeAccountOfferingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAccountOfferingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAccountOfferingRequest>AcctAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAccountOfferingRequest>AddOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DelOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAccountOfferingRequest>DelOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifyOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAccountOfferingRequest>ModifyOffering"));
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
