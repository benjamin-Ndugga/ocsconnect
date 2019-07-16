/**
 * ChangeCustInfoRequestCustInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeCustInfoRequestCustInfo  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.CustBasicInfo custBasicInfo;

    private com.huawei.www.bme.cbsinterface.bccommon.IndividualInfo individual;

    private com.huawei.www.bme.cbsinterface.bccommon.OrgInfo organization;

    public ChangeCustInfoRequestCustInfo() {
    }

    public ChangeCustInfoRequestCustInfo(
           com.huawei.www.bme.cbsinterface.bccommon.CustBasicInfo custBasicInfo,
           com.huawei.www.bme.cbsinterface.bccommon.IndividualInfo individual,
           com.huawei.www.bme.cbsinterface.bccommon.OrgInfo organization) {
           this.custBasicInfo = custBasicInfo;
           this.individual = individual;
           this.organization = organization;
    }


    /**
     * Gets the custBasicInfo value for this ChangeCustInfoRequestCustInfo.
     * 
     * @return custBasicInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.CustBasicInfo getCustBasicInfo() {
        return custBasicInfo;
    }


    /**
     * Sets the custBasicInfo value for this ChangeCustInfoRequestCustInfo.
     * 
     * @param custBasicInfo
     */
    public void setCustBasicInfo(com.huawei.www.bme.cbsinterface.bccommon.CustBasicInfo custBasicInfo) {
        this.custBasicInfo = custBasicInfo;
    }


    /**
     * Gets the individual value for this ChangeCustInfoRequestCustInfo.
     * 
     * @return individual
     */
    public com.huawei.www.bme.cbsinterface.bccommon.IndividualInfo getIndividual() {
        return individual;
    }


    /**
     * Sets the individual value for this ChangeCustInfoRequestCustInfo.
     * 
     * @param individual
     */
    public void setIndividual(com.huawei.www.bme.cbsinterface.bccommon.IndividualInfo individual) {
        this.individual = individual;
    }


    /**
     * Gets the organization value for this ChangeCustInfoRequestCustInfo.
     * 
     * @return organization
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OrgInfo getOrganization() {
        return organization;
    }


    /**
     * Sets the organization value for this ChangeCustInfoRequestCustInfo.
     * 
     * @param organization
     */
    public void setOrganization(com.huawei.www.bme.cbsinterface.bccommon.OrgInfo organization) {
        this.organization = organization;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeCustInfoRequestCustInfo)) return false;
        ChangeCustInfoRequestCustInfo other = (ChangeCustInfoRequestCustInfo) obj;
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
            ((this.individual==null && other.getIndividual()==null) || 
             (this.individual!=null &&
              this.individual.equals(other.getIndividual()))) &&
            ((this.organization==null && other.getOrganization()==null) || 
             (this.organization!=null &&
              this.organization.equals(other.getOrganization())));
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
        if (getIndividual() != null) {
            _hashCode += getIndividual().hashCode();
        }
        if (getOrganization() != null) {
            _hashCode += getOrganization().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeCustInfoRequestCustInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeCustInfoRequest>CustInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custBasicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CustBasicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustBasicInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Individual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "IndividualInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Organization"));
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
