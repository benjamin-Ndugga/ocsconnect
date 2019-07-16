/**
 * QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax  implements java.io.Serializable {
    private java.lang.String taxCode;

    private long taxAmount;

    private java.math.BigInteger currencyID;

    /* It is reserved for future extension */
    private com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] additionalProperty;

    public QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax() {
    }

    public QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax(
           java.lang.String taxCode,
           long taxAmount,
           java.math.BigInteger currencyID,
           com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] additionalProperty) {
           this.taxCode = taxCode;
           this.taxAmount = taxAmount;
           this.currencyID = currencyID;
           this.additionalProperty = additionalProperty;
    }


    /**
     * Gets the taxCode value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax.
     * 
     * @return taxCode
     */
    public java.lang.String getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.String taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxAmount value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax.
     * 
     * @return taxAmount
     */
    public long getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(long taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the currencyID value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the additionalProperty value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax.
     * 
     * @return additionalProperty   * It is reserved for future extension
     */
    public com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] getAdditionalProperty() {
        return additionalProperty;
    }


    /**
     * Sets the additionalProperty value for this QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax.
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
        if (!(obj instanceof QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax)) return false;
        QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax other = (QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            this.taxAmount == other.getTaxAmount() &&
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
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        _hashCode += new Long(getTaxAmount()).hashCode();
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
        new org.apache.axis.description.TypeDesc(QueryUnbilledAmountResultUnbilledAmountListUnbilledInfoTax.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryUnbilledAmountResult>UnbilledAmountList>UnbilledInfo>Tax"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "TaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "TaxAmount"));
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
