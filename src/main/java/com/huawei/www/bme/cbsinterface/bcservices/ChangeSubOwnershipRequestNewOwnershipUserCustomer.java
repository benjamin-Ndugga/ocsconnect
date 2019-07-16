/**
 * ChangeSubOwnershipRequestNewOwnershipUserCustomer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubOwnershipRequestNewOwnershipUserCustomer  implements java.io.Serializable {
    private java.lang.String custKey;

    private com.huawei.www.bme.cbsinterface.bccommon.CustInfo custInfo;

    private com.huawei.www.bme.cbsinterface.bccommon.IndividualInfo individualInfo;

    private com.huawei.www.bme.cbsinterface.bccommon.OrgInfo orgInfo;

    public ChangeSubOwnershipRequestNewOwnershipUserCustomer() {
    }

    public ChangeSubOwnershipRequestNewOwnershipUserCustomer(
           java.lang.String custKey,
           com.huawei.www.bme.cbsinterface.bccommon.CustInfo custInfo,
           com.huawei.www.bme.cbsinterface.bccommon.IndividualInfo individualInfo,
           com.huawei.www.bme.cbsinterface.bccommon.OrgInfo orgInfo) {
           this.custKey = custKey;
           this.custInfo = custInfo;
           this.individualInfo = individualInfo;
           this.orgInfo = orgInfo;
    }


    /**
     * Gets the custKey value for this ChangeSubOwnershipRequestNewOwnershipUserCustomer.
     * 
     * @return custKey
     */
    public java.lang.String getCustKey() {
        return custKey;
    }


    /**
     * Sets the custKey value for this ChangeSubOwnershipRequestNewOwnershipUserCustomer.
     * 
     * @param custKey
     */
    public void setCustKey(java.lang.String custKey) {
        this.custKey = custKey;
    }


    /**
     * Gets the custInfo value for this ChangeSubOwnershipRequestNewOwnershipUserCustomer.
     * 
     * @return custInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.CustInfo getCustInfo() {
        return custInfo;
    }


    /**
     * Sets the custInfo value for this ChangeSubOwnershipRequestNewOwnershipUserCustomer.
     * 
     * @param custInfo
     */
    public void setCustInfo(com.huawei.www.bme.cbsinterface.bccommon.CustInfo custInfo) {
        this.custInfo = custInfo;
    }


    /**
     * Gets the individualInfo value for this ChangeSubOwnershipRequestNewOwnershipUserCustomer.
     * 
     * @return individualInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.IndividualInfo getIndividualInfo() {
        return individualInfo;
    }


    /**
     * Sets the individualInfo value for this ChangeSubOwnershipRequestNewOwnershipUserCustomer.
     * 
     * @param individualInfo
     */
    public void setIndividualInfo(com.huawei.www.bme.cbsinterface.bccommon.IndividualInfo individualInfo) {
        this.individualInfo = individualInfo;
    }


    /**
     * Gets the orgInfo value for this ChangeSubOwnershipRequestNewOwnershipUserCustomer.
     * 
     * @return orgInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OrgInfo getOrgInfo() {
        return orgInfo;
    }


    /**
     * Sets the orgInfo value for this ChangeSubOwnershipRequestNewOwnershipUserCustomer.
     * 
     * @param orgInfo
     */
    public void setOrgInfo(com.huawei.www.bme.cbsinterface.bccommon.OrgInfo orgInfo) {
        this.orgInfo = orgInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubOwnershipRequestNewOwnershipUserCustomer)) return false;
        ChangeSubOwnershipRequestNewOwnershipUserCustomer other = (ChangeSubOwnershipRequestNewOwnershipUserCustomer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.custKey==null && other.getCustKey()==null) || 
             (this.custKey!=null &&
              this.custKey.equals(other.getCustKey()))) &&
            ((this.custInfo==null && other.getCustInfo()==null) || 
             (this.custInfo!=null &&
              this.custInfo.equals(other.getCustInfo()))) &&
            ((this.individualInfo==null && other.getIndividualInfo()==null) || 
             (this.individualInfo!=null &&
              this.individualInfo.equals(other.getIndividualInfo()))) &&
            ((this.orgInfo==null && other.getOrgInfo()==null) || 
             (this.orgInfo!=null &&
              this.orgInfo.equals(other.getOrgInfo())));
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
        if (getCustKey() != null) {
            _hashCode += getCustKey().hashCode();
        }
        if (getCustInfo() != null) {
            _hashCode += getCustInfo().hashCode();
        }
        if (getIndividualInfo() != null) {
            _hashCode += getIndividualInfo().hashCode();
        }
        if (getOrgInfo() != null) {
            _hashCode += getOrgInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubOwnershipRequestNewOwnershipUserCustomer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOwnershipRequest>NewOwnership>UserCustomer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CustKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CustInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "IndividualInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "IndividualInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OrgInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OrgInfo"));
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
