/**
 * OfferingKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class OfferingKey  implements java.io.Serializable {
    /* It is the offering ID which is defined in PC module. */
    private java.math.BigInteger offeringID;

    private java.lang.String offeringCode;

    /* It is the purchase seqence of this subscription. If an offering
     * can be purchased more than once, system use this field to distinguish
     * different offering subscription instance. */
    private java.lang.String purchaseSeq;

    public OfferingKey() {
    }

    public OfferingKey(
           java.math.BigInteger offeringID,
           java.lang.String offeringCode,
           java.lang.String purchaseSeq) {
           this.offeringID = offeringID;
           this.offeringCode = offeringCode;
           this.purchaseSeq = purchaseSeq;
    }


    /**
     * Gets the offeringID value for this OfferingKey.
     * 
     * @return offeringID   * It is the offering ID which is defined in PC module.
     */
    public java.math.BigInteger getOfferingID() {
        return offeringID;
    }


    /**
     * Sets the offeringID value for this OfferingKey.
     * 
     * @param offeringID   * It is the offering ID which is defined in PC module.
     */
    public void setOfferingID(java.math.BigInteger offeringID) {
        this.offeringID = offeringID;
    }


    /**
     * Gets the offeringCode value for this OfferingKey.
     * 
     * @return offeringCode
     */
    public java.lang.String getOfferingCode() {
        return offeringCode;
    }


    /**
     * Sets the offeringCode value for this OfferingKey.
     * 
     * @param offeringCode
     */
    public void setOfferingCode(java.lang.String offeringCode) {
        this.offeringCode = offeringCode;
    }


    /**
     * Gets the purchaseSeq value for this OfferingKey.
     * 
     * @return purchaseSeq   * It is the purchase seqence of this subscription. If an offering
     * can be purchased more than once, system use this field to distinguish
     * different offering subscription instance.
     */
    public java.lang.String getPurchaseSeq() {
        return purchaseSeq;
    }


    /**
     * Sets the purchaseSeq value for this OfferingKey.
     * 
     * @param purchaseSeq   * It is the purchase seqence of this subscription. If an offering
     * can be purchased more than once, system use this field to distinguish
     * different offering subscription instance.
     */
    public void setPurchaseSeq(java.lang.String purchaseSeq) {
        this.purchaseSeq = purchaseSeq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfferingKey)) return false;
        OfferingKey other = (OfferingKey) obj;
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
            ((this.offeringCode==null && other.getOfferingCode()==null) || 
             (this.offeringCode!=null &&
              this.offeringCode.equals(other.getOfferingCode()))) &&
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
        if (getOfferingCode() != null) {
            _hashCode += getOfferingCode().hashCode();
        }
        if (getPurchaseSeq() != null) {
            _hashCode += getPurchaseSeq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfferingKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "PurchaseSeq"));
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
