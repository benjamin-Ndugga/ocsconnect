/**
 * FeeQuotationResultChargeAmountList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class FeeQuotationResultChargeAmountList  implements java.io.Serializable {
    private java.lang.String chargeCode;

    private long chargeAmt;

    private java.math.BigInteger currencyID;

    private com.huawei.www.bme.cbsinterface.bccommon.Tax[] tax;

    public FeeQuotationResultChargeAmountList() {
    }

    public FeeQuotationResultChargeAmountList(
           java.lang.String chargeCode,
           long chargeAmt,
           java.math.BigInteger currencyID,
           com.huawei.www.bme.cbsinterface.bccommon.Tax[] tax) {
           this.chargeCode = chargeCode;
           this.chargeAmt = chargeAmt;
           this.currencyID = currencyID;
           this.tax = tax;
    }


    /**
     * Gets the chargeCode value for this FeeQuotationResultChargeAmountList.
     * 
     * @return chargeCode
     */
    public java.lang.String getChargeCode() {
        return chargeCode;
    }


    /**
     * Sets the chargeCode value for this FeeQuotationResultChargeAmountList.
     * 
     * @param chargeCode
     */
    public void setChargeCode(java.lang.String chargeCode) {
        this.chargeCode = chargeCode;
    }


    /**
     * Gets the chargeAmt value for this FeeQuotationResultChargeAmountList.
     * 
     * @return chargeAmt
     */
    public long getChargeAmt() {
        return chargeAmt;
    }


    /**
     * Sets the chargeAmt value for this FeeQuotationResultChargeAmountList.
     * 
     * @param chargeAmt
     */
    public void setChargeAmt(long chargeAmt) {
        this.chargeAmt = chargeAmt;
    }


    /**
     * Gets the currencyID value for this FeeQuotationResultChargeAmountList.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this FeeQuotationResultChargeAmountList.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the tax value for this FeeQuotationResultChargeAmountList.
     * 
     * @return tax
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Tax[] getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this FeeQuotationResultChargeAmountList.
     * 
     * @param tax
     */
    public void setTax(com.huawei.www.bme.cbsinterface.bccommon.Tax[] tax) {
        this.tax = tax;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.Tax getTax(int i) {
        return this.tax[i];
    }

    public void setTax(int i, com.huawei.www.bme.cbsinterface.bccommon.Tax _value) {
        this.tax[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeQuotationResultChargeAmountList)) return false;
        FeeQuotationResultChargeAmountList other = (FeeQuotationResultChargeAmountList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chargeCode==null && other.getChargeCode()==null) || 
             (this.chargeCode!=null &&
              this.chargeCode.equals(other.getChargeCode()))) &&
            this.chargeAmt == other.getChargeAmt() &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              java.util.Arrays.equals(this.tax, other.getTax())));
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
        if (getChargeCode() != null) {
            _hashCode += getChargeCode().hashCode();
        }
        _hashCode += new Long(getChargeAmt()).hashCode();
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getTax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTax(), i);
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
        new org.apache.axis.description.TypeDesc(FeeQuotationResultChargeAmountList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationResult>ChargeAmountList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChargeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChargeAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Tax"));
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
