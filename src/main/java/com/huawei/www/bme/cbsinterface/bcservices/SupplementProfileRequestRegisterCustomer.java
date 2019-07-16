/**
 * SupplementProfileRequestRegisterCustomer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class SupplementProfileRequestRegisterCustomer  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.CustBasicInfo custBasicInfo;

    private com.huawei.www.bme.cbsinterface.bccommon.IndividualInfo individualInfo;

    private com.huawei.www.bme.cbsinterface.bccommon.OrgInfo orgInfo;

    public SupplementProfileRequestRegisterCustomer() {
    }

    public SupplementProfileRequestRegisterCustomer(
           com.huawei.www.bme.cbsinterface.bccommon.CustBasicInfo custBasicInfo,
           com.huawei.www.bme.cbsinterface.bccommon.IndividualInfo individualInfo,
           com.huawei.www.bme.cbsinterface.bccommon.OrgInfo orgInfo) {
           this.custBasicInfo = custBasicInfo;
           this.individualInfo = individualInfo;
           this.orgInfo = orgInfo;
    }


    /**
     * Gets the custBasicInfo value for this SupplementProfileRequestRegisterCustomer.
     * 
     * @return custBasicInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.CustBasicInfo getCustBasicInfo() {
        return custBasicInfo;
    }


    /**
     * Sets the custBasicInfo value for this SupplementProfileRequestRegisterCustomer.
     * 
     * @param custBasicInfo
     */
    public void setCustBasicInfo(com.huawei.www.bme.cbsinterface.bccommon.CustBasicInfo custBasicInfo) {
        this.custBasicInfo = custBasicInfo;
    }


    /**
     * Gets the individualInfo value for this SupplementProfileRequestRegisterCustomer.
     * 
     * @return individualInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.IndividualInfo getIndividualInfo() {
        return individualInfo;
    }


    /**
     * Sets the individualInfo value for this SupplementProfileRequestRegisterCustomer.
     * 
     * @param individualInfo
     */
    public void setIndividualInfo(com.huawei.www.bme.cbsinterface.bccommon.IndividualInfo individualInfo) {
        this.individualInfo = individualInfo;
    }


    /**
     * Gets the orgInfo value for this SupplementProfileRequestRegisterCustomer.
     * 
     * @return orgInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OrgInfo getOrgInfo() {
        return orgInfo;
    }


    /**
     * Sets the orgInfo value for this SupplementProfileRequestRegisterCustomer.
     * 
     * @param orgInfo
     */
    public void setOrgInfo(com.huawei.www.bme.cbsinterface.bccommon.OrgInfo orgInfo) {
        this.orgInfo = orgInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupplementProfileRequestRegisterCustomer)) return false;
        SupplementProfileRequestRegisterCustomer other = (SupplementProfileRequestRegisterCustomer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.custBasicInfo==null && other.getCustBasicInfo()==null) || 
             (this.custBasicInfo!=null &&
              this.custBasicInfo.equals(other.getCustBasicInfo()))) &&
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
        if (getCustBasicInfo() != null) {
            _hashCode += getCustBasicInfo().hashCode();
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
        new org.apache.axis.description.TypeDesc(SupplementProfileRequestRegisterCustomer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SupplementProfileRequest>RegisterCustomer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custBasicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CustBasicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustBasicInfo"));
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
