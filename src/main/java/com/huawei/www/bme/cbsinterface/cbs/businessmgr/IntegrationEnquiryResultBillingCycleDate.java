/**
 * IntegrationEnquiryResultBillingCycleDate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class IntegrationEnquiryResultBillingCycleDate  implements java.io.Serializable {
    private java.lang.String billCycleOpenDate;

    private java.lang.String billCycleEndDate;

    private java.lang.Integer billCycleType;

    public IntegrationEnquiryResultBillingCycleDate() {
    }

    public IntegrationEnquiryResultBillingCycleDate(
           java.lang.String billCycleOpenDate,
           java.lang.String billCycleEndDate,
           java.lang.Integer billCycleType) {
           this.billCycleOpenDate = billCycleOpenDate;
           this.billCycleEndDate = billCycleEndDate;
           this.billCycleType = billCycleType;
    }


    /**
     * Gets the billCycleOpenDate value for this IntegrationEnquiryResultBillingCycleDate.
     * 
     * @return billCycleOpenDate
     */
    public java.lang.String getBillCycleOpenDate() {
        return billCycleOpenDate;
    }


    /**
     * Sets the billCycleOpenDate value for this IntegrationEnquiryResultBillingCycleDate.
     * 
     * @param billCycleOpenDate
     */
    public void setBillCycleOpenDate(java.lang.String billCycleOpenDate) {
        this.billCycleOpenDate = billCycleOpenDate;
    }


    /**
     * Gets the billCycleEndDate value for this IntegrationEnquiryResultBillingCycleDate.
     * 
     * @return billCycleEndDate
     */
    public java.lang.String getBillCycleEndDate() {
        return billCycleEndDate;
    }


    /**
     * Sets the billCycleEndDate value for this IntegrationEnquiryResultBillingCycleDate.
     * 
     * @param billCycleEndDate
     */
    public void setBillCycleEndDate(java.lang.String billCycleEndDate) {
        this.billCycleEndDate = billCycleEndDate;
    }


    /**
     * Gets the billCycleType value for this IntegrationEnquiryResultBillingCycleDate.
     * 
     * @return billCycleType
     */
    public java.lang.Integer getBillCycleType() {
        return billCycleType;
    }


    /**
     * Sets the billCycleType value for this IntegrationEnquiryResultBillingCycleDate.
     * 
     * @param billCycleType
     */
    public void setBillCycleType(java.lang.Integer billCycleType) {
        this.billCycleType = billCycleType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegrationEnquiryResultBillingCycleDate)) return false;
        IntegrationEnquiryResultBillingCycleDate other = (IntegrationEnquiryResultBillingCycleDate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billCycleOpenDate==null && other.getBillCycleOpenDate()==null) || 
             (this.billCycleOpenDate!=null &&
              this.billCycleOpenDate.equals(other.getBillCycleOpenDate()))) &&
            ((this.billCycleEndDate==null && other.getBillCycleEndDate()==null) || 
             (this.billCycleEndDate!=null &&
              this.billCycleEndDate.equals(other.getBillCycleEndDate()))) &&
            ((this.billCycleType==null && other.getBillCycleType()==null) || 
             (this.billCycleType!=null &&
              this.billCycleType.equals(other.getBillCycleType())));
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
        if (getBillCycleOpenDate() != null) {
            _hashCode += getBillCycleOpenDate().hashCode();
        }
        if (getBillCycleEndDate() != null) {
            _hashCode += getBillCycleEndDate().hashCode();
        }
        if (getBillCycleType() != null) {
            _hashCode += getBillCycleType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntegrationEnquiryResultBillingCycleDate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">IntegrationEnquiryResult>BillingCycleDate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleOpenDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BillCycleOpenDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BillCycleEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BillCycleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
