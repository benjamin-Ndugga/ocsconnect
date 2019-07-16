/**
 * Charge2BillRequestChargeItemList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class Charge2BillRequestChargeItemList  implements java.io.Serializable {
    /* added in CBS C30 */
    private java.lang.String chargeSeq;

    private java.lang.String chargeCode;

    private java.lang.String salesTime;

    private java.lang.String invoiceTime;

    private long chargeAmt;

    private java.lang.Long discountAmt;

    private java.lang.Long waiveAmt;

    private java.math.BigInteger currencyID;

    private com.huawei.www.bme.cbsinterface.bbcommon.Tax[] tax;

    private java.lang.String additionalInfo;

    /* It is reserved for future extension */
    private com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] additionalProperty;

    public Charge2BillRequestChargeItemList() {
    }

    public Charge2BillRequestChargeItemList(
           java.lang.String chargeSeq,
           java.lang.String chargeCode,
           java.lang.String salesTime,
           java.lang.String invoiceTime,
           long chargeAmt,
           java.lang.Long discountAmt,
           java.lang.Long waiveAmt,
           java.math.BigInteger currencyID,
           com.huawei.www.bme.cbsinterface.bbcommon.Tax[] tax,
           java.lang.String additionalInfo,
           com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] additionalProperty) {
           this.chargeSeq = chargeSeq;
           this.chargeCode = chargeCode;
           this.salesTime = salesTime;
           this.invoiceTime = invoiceTime;
           this.chargeAmt = chargeAmt;
           this.discountAmt = discountAmt;
           this.waiveAmt = waiveAmt;
           this.currencyID = currencyID;
           this.tax = tax;
           this.additionalInfo = additionalInfo;
           this.additionalProperty = additionalProperty;
    }


    /**
     * Gets the chargeSeq value for this Charge2BillRequestChargeItemList.
     * 
     * @return chargeSeq   * added in CBS C30
     */
    public java.lang.String getChargeSeq() {
        return chargeSeq;
    }


    /**
     * Sets the chargeSeq value for this Charge2BillRequestChargeItemList.
     * 
     * @param chargeSeq   * added in CBS C30
     */
    public void setChargeSeq(java.lang.String chargeSeq) {
        this.chargeSeq = chargeSeq;
    }


    /**
     * Gets the chargeCode value for this Charge2BillRequestChargeItemList.
     * 
     * @return chargeCode
     */
    public java.lang.String getChargeCode() {
        return chargeCode;
    }


    /**
     * Sets the chargeCode value for this Charge2BillRequestChargeItemList.
     * 
     * @param chargeCode
     */
    public void setChargeCode(java.lang.String chargeCode) {
        this.chargeCode = chargeCode;
    }


    /**
     * Gets the salesTime value for this Charge2BillRequestChargeItemList.
     * 
     * @return salesTime
     */
    public java.lang.String getSalesTime() {
        return salesTime;
    }


    /**
     * Sets the salesTime value for this Charge2BillRequestChargeItemList.
     * 
     * @param salesTime
     */
    public void setSalesTime(java.lang.String salesTime) {
        this.salesTime = salesTime;
    }


    /**
     * Gets the invoiceTime value for this Charge2BillRequestChargeItemList.
     * 
     * @return invoiceTime
     */
    public java.lang.String getInvoiceTime() {
        return invoiceTime;
    }


    /**
     * Sets the invoiceTime value for this Charge2BillRequestChargeItemList.
     * 
     * @param invoiceTime
     */
    public void setInvoiceTime(java.lang.String invoiceTime) {
        this.invoiceTime = invoiceTime;
    }


    /**
     * Gets the chargeAmt value for this Charge2BillRequestChargeItemList.
     * 
     * @return chargeAmt
     */
    public long getChargeAmt() {
        return chargeAmt;
    }


    /**
     * Sets the chargeAmt value for this Charge2BillRequestChargeItemList.
     * 
     * @param chargeAmt
     */
    public void setChargeAmt(long chargeAmt) {
        this.chargeAmt = chargeAmt;
    }


    /**
     * Gets the discountAmt value for this Charge2BillRequestChargeItemList.
     * 
     * @return discountAmt
     */
    public java.lang.Long getDiscountAmt() {
        return discountAmt;
    }


    /**
     * Sets the discountAmt value for this Charge2BillRequestChargeItemList.
     * 
     * @param discountAmt
     */
    public void setDiscountAmt(java.lang.Long discountAmt) {
        this.discountAmt = discountAmt;
    }


    /**
     * Gets the waiveAmt value for this Charge2BillRequestChargeItemList.
     * 
     * @return waiveAmt
     */
    public java.lang.Long getWaiveAmt() {
        return waiveAmt;
    }


    /**
     * Sets the waiveAmt value for this Charge2BillRequestChargeItemList.
     * 
     * @param waiveAmt
     */
    public void setWaiveAmt(java.lang.Long waiveAmt) {
        this.waiveAmt = waiveAmt;
    }


    /**
     * Gets the currencyID value for this Charge2BillRequestChargeItemList.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this Charge2BillRequestChargeItemList.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the tax value for this Charge2BillRequestChargeItemList.
     * 
     * @return tax
     */
    public com.huawei.www.bme.cbsinterface.bbcommon.Tax[] getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this Charge2BillRequestChargeItemList.
     * 
     * @param tax
     */
    public void setTax(com.huawei.www.bme.cbsinterface.bbcommon.Tax[] tax) {
        this.tax = tax;
    }

    public com.huawei.www.bme.cbsinterface.bbcommon.Tax getTax(int i) {
        return this.tax[i];
    }

    public void setTax(int i, com.huawei.www.bme.cbsinterface.bbcommon.Tax _value) {
        this.tax[i] = _value;
    }


    /**
     * Gets the additionalInfo value for this Charge2BillRequestChargeItemList.
     * 
     * @return additionalInfo
     */
    public java.lang.String getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this Charge2BillRequestChargeItemList.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(java.lang.String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the additionalProperty value for this Charge2BillRequestChargeItemList.
     * 
     * @return additionalProperty   * It is reserved for future extension
     */
    public com.huawei.www.bme.cbsinterface.bbcommon.SimpleProperty[] getAdditionalProperty() {
        return additionalProperty;
    }


    /**
     * Sets the additionalProperty value for this Charge2BillRequestChargeItemList.
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
        if (!(obj instanceof Charge2BillRequestChargeItemList)) return false;
        Charge2BillRequestChargeItemList other = (Charge2BillRequestChargeItemList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chargeSeq==null && other.getChargeSeq()==null) || 
             (this.chargeSeq!=null &&
              this.chargeSeq.equals(other.getChargeSeq()))) &&
            ((this.chargeCode==null && other.getChargeCode()==null) || 
             (this.chargeCode!=null &&
              this.chargeCode.equals(other.getChargeCode()))) &&
            ((this.salesTime==null && other.getSalesTime()==null) || 
             (this.salesTime!=null &&
              this.salesTime.equals(other.getSalesTime()))) &&
            ((this.invoiceTime==null && other.getInvoiceTime()==null) || 
             (this.invoiceTime!=null &&
              this.invoiceTime.equals(other.getInvoiceTime()))) &&
            this.chargeAmt == other.getChargeAmt() &&
            ((this.discountAmt==null && other.getDiscountAmt()==null) || 
             (this.discountAmt!=null &&
              this.discountAmt.equals(other.getDiscountAmt()))) &&
            ((this.waiveAmt==null && other.getWaiveAmt()==null) || 
             (this.waiveAmt!=null &&
              this.waiveAmt.equals(other.getWaiveAmt()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              java.util.Arrays.equals(this.tax, other.getTax()))) &&
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              this.additionalInfo.equals(other.getAdditionalInfo()))) &&
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
        if (getChargeSeq() != null) {
            _hashCode += getChargeSeq().hashCode();
        }
        if (getChargeCode() != null) {
            _hashCode += getChargeCode().hashCode();
        }
        if (getSalesTime() != null) {
            _hashCode += getSalesTime().hashCode();
        }
        if (getInvoiceTime() != null) {
            _hashCode += getInvoiceTime().hashCode();
        }
        _hashCode += new Long(getChargeAmt()).hashCode();
        if (getDiscountAmt() != null) {
            _hashCode += getDiscountAmt().hashCode();
        }
        if (getWaiveAmt() != null) {
            _hashCode += getWaiveAmt().hashCode();
        }
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
        if (getAdditionalInfo() != null) {
            _hashCode += getAdditionalInfo().hashCode();
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
        new org.apache.axis.description.TypeDesc(Charge2BillRequestChargeItemList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">Charge2BillRequest>ChargeItemList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ChargeSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ChargeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "SalesTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "InvoiceTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ChargeAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "DiscountAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waiveAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "WaiveAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "Tax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
