/**
 * IntegrationEnquiryResultCumulativeItemListCumulativeItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class IntegrationEnquiryResultCumulativeItemListCumulativeItem  implements java.io.Serializable {
    private java.lang.Integer cumulateID;

    private java.lang.String cumulateBeginTime;

    private java.lang.String cumulateEndTime;

    private java.lang.Long cumulativeAmt;

    public IntegrationEnquiryResultCumulativeItemListCumulativeItem() {
    }

    public IntegrationEnquiryResultCumulativeItemListCumulativeItem(
           java.lang.Integer cumulateID,
           java.lang.String cumulateBeginTime,
           java.lang.String cumulateEndTime,
           java.lang.Long cumulativeAmt) {
           this.cumulateID = cumulateID;
           this.cumulateBeginTime = cumulateBeginTime;
           this.cumulateEndTime = cumulateEndTime;
           this.cumulativeAmt = cumulativeAmt;
    }


    /**
     * Gets the cumulateID value for this IntegrationEnquiryResultCumulativeItemListCumulativeItem.
     * 
     * @return cumulateID
     */
    public java.lang.Integer getCumulateID() {
        return cumulateID;
    }


    /**
     * Sets the cumulateID value for this IntegrationEnquiryResultCumulativeItemListCumulativeItem.
     * 
     * @param cumulateID
     */
    public void setCumulateID(java.lang.Integer cumulateID) {
        this.cumulateID = cumulateID;
    }


    /**
     * Gets the cumulateBeginTime value for this IntegrationEnquiryResultCumulativeItemListCumulativeItem.
     * 
     * @return cumulateBeginTime
     */
    public java.lang.String getCumulateBeginTime() {
        return cumulateBeginTime;
    }


    /**
     * Sets the cumulateBeginTime value for this IntegrationEnquiryResultCumulativeItemListCumulativeItem.
     * 
     * @param cumulateBeginTime
     */
    public void setCumulateBeginTime(java.lang.String cumulateBeginTime) {
        this.cumulateBeginTime = cumulateBeginTime;
    }


    /**
     * Gets the cumulateEndTime value for this IntegrationEnquiryResultCumulativeItemListCumulativeItem.
     * 
     * @return cumulateEndTime
     */
    public java.lang.String getCumulateEndTime() {
        return cumulateEndTime;
    }


    /**
     * Sets the cumulateEndTime value for this IntegrationEnquiryResultCumulativeItemListCumulativeItem.
     * 
     * @param cumulateEndTime
     */
    public void setCumulateEndTime(java.lang.String cumulateEndTime) {
        this.cumulateEndTime = cumulateEndTime;
    }


    /**
     * Gets the cumulativeAmt value for this IntegrationEnquiryResultCumulativeItemListCumulativeItem.
     * 
     * @return cumulativeAmt
     */
    public java.lang.Long getCumulativeAmt() {
        return cumulativeAmt;
    }


    /**
     * Sets the cumulativeAmt value for this IntegrationEnquiryResultCumulativeItemListCumulativeItem.
     * 
     * @param cumulativeAmt
     */
    public void setCumulativeAmt(java.lang.Long cumulativeAmt) {
        this.cumulativeAmt = cumulativeAmt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegrationEnquiryResultCumulativeItemListCumulativeItem)) return false;
        IntegrationEnquiryResultCumulativeItemListCumulativeItem other = (IntegrationEnquiryResultCumulativeItemListCumulativeItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cumulateID==null && other.getCumulateID()==null) || 
             (this.cumulateID!=null &&
              this.cumulateID.equals(other.getCumulateID()))) &&
            ((this.cumulateBeginTime==null && other.getCumulateBeginTime()==null) || 
             (this.cumulateBeginTime!=null &&
              this.cumulateBeginTime.equals(other.getCumulateBeginTime()))) &&
            ((this.cumulateEndTime==null && other.getCumulateEndTime()==null) || 
             (this.cumulateEndTime!=null &&
              this.cumulateEndTime.equals(other.getCumulateEndTime()))) &&
            ((this.cumulativeAmt==null && other.getCumulativeAmt()==null) || 
             (this.cumulativeAmt!=null &&
              this.cumulativeAmt.equals(other.getCumulativeAmt())));
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
        if (getCumulateID() != null) {
            _hashCode += getCumulateID().hashCode();
        }
        if (getCumulateBeginTime() != null) {
            _hashCode += getCumulateBeginTime().hashCode();
        }
        if (getCumulateEndTime() != null) {
            _hashCode += getCumulateEndTime().hashCode();
        }
        if (getCumulativeAmt() != null) {
            _hashCode += getCumulativeAmt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntegrationEnquiryResultCumulativeItemListCumulativeItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>IntegrationEnquiryResult>CumulativeItemList>CumulativeItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cumulateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CumulateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cumulateBeginTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CumulateBeginTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cumulateEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CumulateEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cumulativeAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CumulativeAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
