/**
 * ApplyPrepaymentResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ApplyPrepaymentResult  implements java.io.Serializable {
    private long installmentInstID;

    private long totalAmount;

    private java.math.BigInteger currencyID;

    private java.math.BigInteger totalCycle;

    private java.lang.String contractID;

    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    private com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentResultInatallmentDetail[] inatallmentDetail;

    public ApplyPrepaymentResult() {
    }

    public ApplyPrepaymentResult(
           long installmentInstID,
           long totalAmount,
           java.math.BigInteger currencyID,
           java.math.BigInteger totalCycle,
           java.lang.String contractID,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentResultInatallmentDetail[] inatallmentDetail) {
           this.installmentInstID = installmentInstID;
           this.totalAmount = totalAmount;
           this.currencyID = currencyID;
           this.totalCycle = totalCycle;
           this.contractID = contractID;
           this.offeringKey = offeringKey;
           this.inatallmentDetail = inatallmentDetail;
    }


    /**
     * Gets the installmentInstID value for this ApplyPrepaymentResult.
     * 
     * @return installmentInstID
     */
    public long getInstallmentInstID() {
        return installmentInstID;
    }


    /**
     * Sets the installmentInstID value for this ApplyPrepaymentResult.
     * 
     * @param installmentInstID
     */
    public void setInstallmentInstID(long installmentInstID) {
        this.installmentInstID = installmentInstID;
    }


    /**
     * Gets the totalAmount value for this ApplyPrepaymentResult.
     * 
     * @return totalAmount
     */
    public long getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this ApplyPrepaymentResult.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the currencyID value for this ApplyPrepaymentResult.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this ApplyPrepaymentResult.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the totalCycle value for this ApplyPrepaymentResult.
     * 
     * @return totalCycle
     */
    public java.math.BigInteger getTotalCycle() {
        return totalCycle;
    }


    /**
     * Sets the totalCycle value for this ApplyPrepaymentResult.
     * 
     * @param totalCycle
     */
    public void setTotalCycle(java.math.BigInteger totalCycle) {
        this.totalCycle = totalCycle;
    }


    /**
     * Gets the contractID value for this ApplyPrepaymentResult.
     * 
     * @return contractID
     */
    public java.lang.String getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this ApplyPrepaymentResult.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.String contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the offeringKey value for this ApplyPrepaymentResult.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this ApplyPrepaymentResult.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the inatallmentDetail value for this ApplyPrepaymentResult.
     * 
     * @return inatallmentDetail
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentResultInatallmentDetail[] getInatallmentDetail() {
        return inatallmentDetail;
    }


    /**
     * Sets the inatallmentDetail value for this ApplyPrepaymentResult.
     * 
     * @param inatallmentDetail
     */
    public void setInatallmentDetail(com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentResultInatallmentDetail[] inatallmentDetail) {
        this.inatallmentDetail = inatallmentDetail;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentResultInatallmentDetail getInatallmentDetail(int i) {
        return this.inatallmentDetail[i];
    }

    public void setInatallmentDetail(int i, com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentResultInatallmentDetail _value) {
        this.inatallmentDetail[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyPrepaymentResult)) return false;
        ApplyPrepaymentResult other = (ApplyPrepaymentResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.installmentInstID == other.getInstallmentInstID() &&
            this.totalAmount == other.getTotalAmount() &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.totalCycle==null && other.getTotalCycle()==null) || 
             (this.totalCycle!=null &&
              this.totalCycle.equals(other.getTotalCycle()))) &&
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.offeringKey==null && other.getOfferingKey()==null) || 
             (this.offeringKey!=null &&
              this.offeringKey.equals(other.getOfferingKey()))) &&
            ((this.inatallmentDetail==null && other.getInatallmentDetail()==null) || 
             (this.inatallmentDetail!=null &&
              java.util.Arrays.equals(this.inatallmentDetail, other.getInatallmentDetail())));
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
        _hashCode += new Long(getInstallmentInstID()).hashCode();
        _hashCode += new Long(getTotalAmount()).hashCode();
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getTotalCycle() != null) {
            _hashCode += getTotalCycle().hashCode();
        }
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getOfferingKey() != null) {
            _hashCode += getOfferingKey().hashCode();
        }
        if (getInatallmentDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInatallmentDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInatallmentDetail(), i);
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
        new org.apache.axis.description.TypeDesc(ApplyPrepaymentResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyPrepaymentResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installmentInstID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "InstallmentInstID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "TotalAmount"));
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
        elemField.setFieldName("totalCycle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "TotalCycle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inatallmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "InatallmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyPrepaymentResult>InatallmentDetail"));
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
