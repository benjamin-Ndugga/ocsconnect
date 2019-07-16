/**
 * QueryCDRResultCDRInfoVolumeInfoFreeVolumeListOffering.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryCDRResultCDRInfoVolumeInfoFreeVolumeListOffering  implements java.io.Serializable {
    private java.math.BigInteger offeringID;

    private java.lang.String purchaseSeq;

    public QueryCDRResultCDRInfoVolumeInfoFreeVolumeListOffering() {
    }

    public QueryCDRResultCDRInfoVolumeInfoFreeVolumeListOffering(
           java.math.BigInteger offeringID,
           java.lang.String purchaseSeq) {
           this.offeringID = offeringID;
           this.purchaseSeq = purchaseSeq;
    }


    /**
     * Gets the offeringID value for this QueryCDRResultCDRInfoVolumeInfoFreeVolumeListOffering.
     * 
     * @return offeringID
     */
    public java.math.BigInteger getOfferingID() {
        return offeringID;
    }


    /**
     * Sets the offeringID value for this QueryCDRResultCDRInfoVolumeInfoFreeVolumeListOffering.
     * 
     * @param offeringID
     */
    public void setOfferingID(java.math.BigInteger offeringID) {
        this.offeringID = offeringID;
    }


    /**
     * Gets the purchaseSeq value for this QueryCDRResultCDRInfoVolumeInfoFreeVolumeListOffering.
     * 
     * @return purchaseSeq
     */
    public java.lang.String getPurchaseSeq() {
        return purchaseSeq;
    }


    /**
     * Sets the purchaseSeq value for this QueryCDRResultCDRInfoVolumeInfoFreeVolumeListOffering.
     * 
     * @param purchaseSeq
     */
    public void setPurchaseSeq(java.lang.String purchaseSeq) {
        this.purchaseSeq = purchaseSeq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCDRResultCDRInfoVolumeInfoFreeVolumeListOffering)) return false;
        QueryCDRResultCDRInfoVolumeInfoFreeVolumeListOffering other = (QueryCDRResultCDRInfoVolumeInfoFreeVolumeListOffering) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offeringID==null && other.getOfferingID()==null) || 
             (this.offeringID!=null &&
              this.offeringID.equals(other.getOfferingID()))) &&
            ((this.purchaseSeq==null && other.getPurchaseSeq()==null) || 
             (this.purchaseSeq!=null &&
              this.purchaseSeq.equals(other.getPurchaseSeq())));
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
        if (getOfferingID() != null) {
            _hashCode += getOfferingID().hashCode();
        }
        if (getPurchaseSeq() != null) {
            _hashCode += getPurchaseSeq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCDRResultCDRInfoVolumeInfoFreeVolumeListOffering.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>>QueryCDRResult>CDRInfo>VolumeInfo>FreeVolumeList>Offering"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "OfferingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "PurchaseSeq"));
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
