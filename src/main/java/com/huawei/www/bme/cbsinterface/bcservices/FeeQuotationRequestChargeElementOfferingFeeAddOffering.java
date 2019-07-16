/**
 * FeeQuotationRequestChargeElementOfferingFeeAddOffering.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class FeeQuotationRequestChargeElementOfferingFeeAddOffering  implements java.io.Serializable {
    private java.math.BigInteger offeringID;

    /* If this offering is a member of a bundled offering, this field
     * indicates the corresponding bundled offering subscription instance
     * key. */
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey parentOfferingKey;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingOInstProperty[] OInstProperty;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst[] productInst;

    private java.lang.String trialStartTime;

    private java.lang.String trialEndTime;

    public FeeQuotationRequestChargeElementOfferingFeeAddOffering() {
    }

    public FeeQuotationRequestChargeElementOfferingFeeAddOffering(
           java.math.BigInteger offeringID,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey parentOfferingKey,
           com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingOInstProperty[] OInstProperty,
           com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst[] productInst,
           java.lang.String trialStartTime,
           java.lang.String trialEndTime) {
           this.offeringID = offeringID;
           this.parentOfferingKey = parentOfferingKey;
           this.OInstProperty = OInstProperty;
           this.productInst = productInst;
           this.trialStartTime = trialStartTime;
           this.trialEndTime = trialEndTime;
    }


    /**
     * Gets the offeringID value for this FeeQuotationRequestChargeElementOfferingFeeAddOffering.
     * 
     * @return offeringID
     */
    public java.math.BigInteger getOfferingID() {
        return offeringID;
    }


    /**
     * Sets the offeringID value for this FeeQuotationRequestChargeElementOfferingFeeAddOffering.
     * 
     * @param offeringID
     */
    public void setOfferingID(java.math.BigInteger offeringID) {
        this.offeringID = offeringID;
    }


    /**
     * Gets the parentOfferingKey value for this FeeQuotationRequestChargeElementOfferingFeeAddOffering.
     * 
     * @return parentOfferingKey   * If this offering is a member of a bundled offering, this field
     * indicates the corresponding bundled offering subscription instance
     * key.
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getParentOfferingKey() {
        return parentOfferingKey;
    }


    /**
     * Sets the parentOfferingKey value for this FeeQuotationRequestChargeElementOfferingFeeAddOffering.
     * 
     * @param parentOfferingKey   * If this offering is a member of a bundled offering, this field
     * indicates the corresponding bundled offering subscription instance
     * key.
     */
    public void setParentOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey parentOfferingKey) {
        this.parentOfferingKey = parentOfferingKey;
    }


    /**
     * Gets the OInstProperty value for this FeeQuotationRequestChargeElementOfferingFeeAddOffering.
     * 
     * @return OInstProperty
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingOInstProperty[] getOInstProperty() {
        return OInstProperty;
    }


    /**
     * Sets the OInstProperty value for this FeeQuotationRequestChargeElementOfferingFeeAddOffering.
     * 
     * @param OInstProperty
     */
    public void setOInstProperty(com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingOInstProperty[] OInstProperty) {
        this.OInstProperty = OInstProperty;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingOInstProperty getOInstProperty(int i) {
        return this.OInstProperty[i];
    }

    public void setOInstProperty(int i, com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingOInstProperty _value) {
        this.OInstProperty[i] = _value;
    }


    /**
     * Gets the productInst value for this FeeQuotationRequestChargeElementOfferingFeeAddOffering.
     * 
     * @return productInst
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst[] getProductInst() {
        return productInst;
    }


    /**
     * Sets the productInst value for this FeeQuotationRequestChargeElementOfferingFeeAddOffering.
     * 
     * @param productInst
     */
    public void setProductInst(com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst[] productInst) {
        this.productInst = productInst;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst getProductInst(int i) {
        return this.productInst[i];
    }

    public void setProductInst(int i, com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestChargeElementOfferingFeeAddOfferingProductInst _value) {
        this.productInst[i] = _value;
    }


    /**
     * Gets the trialStartTime value for this FeeQuotationRequestChargeElementOfferingFeeAddOffering.
     * 
     * @return trialStartTime
     */
    public java.lang.String getTrialStartTime() {
        return trialStartTime;
    }


    /**
     * Sets the trialStartTime value for this FeeQuotationRequestChargeElementOfferingFeeAddOffering.
     * 
     * @param trialStartTime
     */
    public void setTrialStartTime(java.lang.String trialStartTime) {
        this.trialStartTime = trialStartTime;
    }


    /**
     * Gets the trialEndTime value for this FeeQuotationRequestChargeElementOfferingFeeAddOffering.
     * 
     * @return trialEndTime
     */
    public java.lang.String getTrialEndTime() {
        return trialEndTime;
    }


    /**
     * Sets the trialEndTime value for this FeeQuotationRequestChargeElementOfferingFeeAddOffering.
     * 
     * @param trialEndTime
     */
    public void setTrialEndTime(java.lang.String trialEndTime) {
        this.trialEndTime = trialEndTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeQuotationRequestChargeElementOfferingFeeAddOffering)) return false;
        FeeQuotationRequestChargeElementOfferingFeeAddOffering other = (FeeQuotationRequestChargeElementOfferingFeeAddOffering) obj;
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
            ((this.parentOfferingKey==null && other.getParentOfferingKey()==null) || 
             (this.parentOfferingKey!=null &&
              this.parentOfferingKey.equals(other.getParentOfferingKey()))) &&
            ((this.OInstProperty==null && other.getOInstProperty()==null) || 
             (this.OInstProperty!=null &&
              java.util.Arrays.equals(this.OInstProperty, other.getOInstProperty()))) &&
            ((this.productInst==null && other.getProductInst()==null) || 
             (this.productInst!=null &&
              java.util.Arrays.equals(this.productInst, other.getProductInst()))) &&
            ((this.trialStartTime==null && other.getTrialStartTime()==null) || 
             (this.trialStartTime!=null &&
              this.trialStartTime.equals(other.getTrialStartTime()))) &&
            ((this.trialEndTime==null && other.getTrialEndTime()==null) || 
             (this.trialEndTime!=null &&
              this.trialEndTime.equals(other.getTrialEndTime())));
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
        if (getParentOfferingKey() != null) {
            _hashCode += getParentOfferingKey().hashCode();
        }
        if (getOInstProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOInstProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOInstProperty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductInst() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductInst());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductInst(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrialStartTime() != null) {
            _hashCode += getTrialStartTime().hashCode();
        }
        if (getTrialEndTime() != null) {
            _hashCode += getTrialEndTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeeQuotationRequestChargeElementOfferingFeeAddOffering.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>FeeQuotationRequest>ChargeElement>OfferingFee>AddOffering"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentOfferingKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ParentOfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OInstProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OInstProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>FeeQuotationRequest>ChargeElement>OfferingFee>AddOffering>OInstProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productInst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ProductInst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>FeeQuotationRequest>ChargeElement>OfferingFee>AddOffering>ProductInst"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trialStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "TrialStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trialEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "TrialEndTime"));
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
