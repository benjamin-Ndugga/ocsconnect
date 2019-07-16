/**
 * QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge  implements java.io.Serializable {
    private java.math.BigInteger offeringID;

    private long chargeAmount;

    private java.math.BigInteger currencyID;

    /* It is reserved for future extension */
    private com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] additionalProperty;

    public QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge() {
    }

    public QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge(
           java.math.BigInteger offeringID,
           long chargeAmount,
           java.math.BigInteger currencyID,
           com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] additionalProperty) {
           this.offeringID = offeringID;
           this.chargeAmount = chargeAmount;
           this.currencyID = currencyID;
           this.additionalProperty = additionalProperty;
    }


    /**
     * Gets the offeringID value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge.
     * 
     * @return offeringID
     */
    public java.math.BigInteger getOfferingID() {
        return offeringID;
    }


    /**
     * Sets the offeringID value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge.
     * 
     * @param offeringID
     */
    public void setOfferingID(java.math.BigInteger offeringID) {
        this.offeringID = offeringID;
    }


    /**
     * Gets the chargeAmount value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge.
     * 
     * @return chargeAmount
     */
    public long getChargeAmount() {
        return chargeAmount;
    }


    /**
     * Sets the chargeAmount value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge.
     * 
     * @param chargeAmount
     */
    public void setChargeAmount(long chargeAmount) {
        this.chargeAmount = chargeAmount;
    }


    /**
     * Gets the currencyID value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the additionalProperty value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge.
     * 
     * @return additionalProperty   * It is reserved for future extension
     */
    public com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] getAdditionalProperty() {
        return additionalProperty;
    }


    /**
     * Sets the additionalProperty value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge.
     * 
     * @param additionalProperty   * It is reserved for future extension
     */
    public void setAdditionalProperty(com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty getAdditionalProperty(int i) {
        return this.additionalProperty[i];
    }

    public void setAdditionalProperty(int i, com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty _value) {
        this.additionalProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge)) return false;
        QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge other = (QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge) obj;
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
            this.chargeAmount == other.getChargeAmount() &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.additionalProperty==null && other.getAdditionalProperty()==null) || 
             (this.additionalProperty!=null &&
              java.util.Arrays.equals(this.additionalProperty, other.getAdditionalProperty())));
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
        _hashCode += new Long(getChargeAmount()).hashCode();
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getAdditionalProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalProperty(), i);
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
        new org.apache.axis.description.TypeDesc(QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoMinCommitmentCharge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryUnbilledAmountResult>UnbilledAmountList>UnbilledInfo>MinCommitmentCharge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "OfferingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ChargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AdditionalProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SimpleProperty"));
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
