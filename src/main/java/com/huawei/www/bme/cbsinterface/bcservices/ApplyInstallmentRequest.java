/**
 * ApplyInstallmentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ApplyInstallmentRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentRequestApplyObj applyObj;

    private java.lang.String contractID;

    private long totalAmount;

    private java.math.BigInteger currencyID;

    private java.math.BigInteger totalCycle;

    private java.lang.String cycleType;

    private java.math.BigInteger cycleLength;

    private java.math.BigInteger cycleRefDate;

    private java.lang.String chargeCode;

    private com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentRequestInatallmentPlan inatallmentPlan;

    /* It is reserved for future extension */
    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] additionalProperty;

    public ApplyInstallmentRequest() {
    }

    public ApplyInstallmentRequest(
           com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentRequestApplyObj applyObj,
           java.lang.String contractID,
           long totalAmount,
           java.math.BigInteger currencyID,
           java.math.BigInteger totalCycle,
           java.lang.String cycleType,
           java.math.BigInteger cycleLength,
           java.math.BigInteger cycleRefDate,
           java.lang.String chargeCode,
           com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentRequestInatallmentPlan inatallmentPlan,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] additionalProperty) {
           this.applyObj = applyObj;
           this.contractID = contractID;
           this.totalAmount = totalAmount;
           this.currencyID = currencyID;
           this.totalCycle = totalCycle;
           this.cycleType = cycleType;
           this.cycleLength = cycleLength;
           this.cycleRefDate = cycleRefDate;
           this.chargeCode = chargeCode;
           this.inatallmentPlan = inatallmentPlan;
           this.additionalProperty = additionalProperty;
    }


    /**
     * Gets the applyObj value for this ApplyInstallmentRequest.
     * 
     * @return applyObj
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentRequestApplyObj getApplyObj() {
        return applyObj;
    }


    /**
     * Sets the applyObj value for this ApplyInstallmentRequest.
     * 
     * @param applyObj
     */
    public void setApplyObj(com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentRequestApplyObj applyObj) {
        this.applyObj = applyObj;
    }


    /**
     * Gets the contractID value for this ApplyInstallmentRequest.
     * 
     * @return contractID
     */
    public java.lang.String getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this ApplyInstallmentRequest.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.String contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the totalAmount value for this ApplyInstallmentRequest.
     * 
     * @return totalAmount
     */
    public long getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this ApplyInstallmentRequest.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the currencyID value for this ApplyInstallmentRequest.
     * 
     * @return currencyID
     */
    public java.math.BigInteger getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this ApplyInstallmentRequest.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.math.BigInteger currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the totalCycle value for this ApplyInstallmentRequest.
     * 
     * @return totalCycle
     */
    public java.math.BigInteger getTotalCycle() {
        return totalCycle;
    }


    /**
     * Sets the totalCycle value for this ApplyInstallmentRequest.
     * 
     * @param totalCycle
     */
    public void setTotalCycle(java.math.BigInteger totalCycle) {
        this.totalCycle = totalCycle;
    }


    /**
     * Gets the cycleType value for this ApplyInstallmentRequest.
     * 
     * @return cycleType
     */
    public java.lang.String getCycleType() {
        return cycleType;
    }


    /**
     * Sets the cycleType value for this ApplyInstallmentRequest.
     * 
     * @param cycleType
     */
    public void setCycleType(java.lang.String cycleType) {
        this.cycleType = cycleType;
    }


    /**
     * Gets the cycleLength value for this ApplyInstallmentRequest.
     * 
     * @return cycleLength
     */
    public java.math.BigInteger getCycleLength() {
        return cycleLength;
    }


    /**
     * Sets the cycleLength value for this ApplyInstallmentRequest.
     * 
     * @param cycleLength
     */
    public void setCycleLength(java.math.BigInteger cycleLength) {
        this.cycleLength = cycleLength;
    }


    /**
     * Gets the cycleRefDate value for this ApplyInstallmentRequest.
     * 
     * @return cycleRefDate
     */
    public java.math.BigInteger getCycleRefDate() {
        return cycleRefDate;
    }


    /**
     * Sets the cycleRefDate value for this ApplyInstallmentRequest.
     * 
     * @param cycleRefDate
     */
    public void setCycleRefDate(java.math.BigInteger cycleRefDate) {
        this.cycleRefDate = cycleRefDate;
    }


    /**
     * Gets the chargeCode value for this ApplyInstallmentRequest.
     * 
     * @return chargeCode
     */
    public java.lang.String getChargeCode() {
        return chargeCode;
    }


    /**
     * Sets the chargeCode value for this ApplyInstallmentRequest.
     * 
     * @param chargeCode
     */
    public void setChargeCode(java.lang.String chargeCode) {
        this.chargeCode = chargeCode;
    }


    /**
     * Gets the inatallmentPlan value for this ApplyInstallmentRequest.
     * 
     * @return inatallmentPlan
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentRequestInatallmentPlan getInatallmentPlan() {
        return inatallmentPlan;
    }


    /**
     * Sets the inatallmentPlan value for this ApplyInstallmentRequest.
     * 
     * @param inatallmentPlan
     */
    public void setInatallmentPlan(com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentRequestInatallmentPlan inatallmentPlan) {
        this.inatallmentPlan = inatallmentPlan;
    }


    /**
     * Gets the additionalProperty value for this ApplyInstallmentRequest.
     * 
     * @return additionalProperty   * It is reserved for future extension
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getAdditionalProperty() {
        return additionalProperty;
    }


    /**
     * Sets the additionalProperty value for this ApplyInstallmentRequest.
     * 
     * @param additionalProperty   * It is reserved for future extension
     */
    public void setAdditionalProperty(com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty getAdditionalProperty(int i) {
        return this.additionalProperty[i];
    }

    public void setAdditionalProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty _value) {
        this.additionalProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyInstallmentRequest)) return false;
        ApplyInstallmentRequest other = (ApplyInstallmentRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applyObj==null && other.getApplyObj()==null) || 
             (this.applyObj!=null &&
              this.applyObj.equals(other.getApplyObj()))) &&
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            this.totalAmount == other.getTotalAmount() &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.totalCycle==null && other.getTotalCycle()==null) || 
             (this.totalCycle!=null &&
              this.totalCycle.equals(other.getTotalCycle()))) &&
            ((this.cycleType==null && other.getCycleType()==null) || 
             (this.cycleType!=null &&
              this.cycleType.equals(other.getCycleType()))) &&
            ((this.cycleLength==null && other.getCycleLength()==null) || 
             (this.cycleLength!=null &&
              this.cycleLength.equals(other.getCycleLength()))) &&
            ((this.cycleRefDate==null && other.getCycleRefDate()==null) || 
             (this.cycleRefDate!=null &&
              this.cycleRefDate.equals(other.getCycleRefDate()))) &&
            ((this.chargeCode==null && other.getChargeCode()==null) || 
             (this.chargeCode!=null &&
              this.chargeCode.equals(other.getChargeCode()))) &&
            ((this.inatallmentPlan==null && other.getInatallmentPlan()==null) || 
             (this.inatallmentPlan!=null &&
              this.inatallmentPlan.equals(other.getInatallmentPlan()))) &&
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
        if (getApplyObj() != null) {
            _hashCode += getApplyObj().hashCode();
        }
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        _hashCode += new Long(getTotalAmount()).hashCode();
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getTotalCycle() != null) {
            _hashCode += getTotalCycle().hashCode();
        }
        if (getCycleType() != null) {
            _hashCode += getCycleType().hashCode();
        }
        if (getCycleLength() != null) {
            _hashCode += getCycleLength().hashCode();
        }
        if (getCycleRefDate() != null) {
            _hashCode += getCycleRefDate().hashCode();
        }
        if (getChargeCode() != null) {
            _hashCode += getChargeCode().hashCode();
        }
        if (getInatallmentPlan() != null) {
            _hashCode += getInatallmentPlan().hashCode();
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
        new org.apache.axis.description.TypeDesc(ApplyInstallmentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyInstallmentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentRequest>ApplyObj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("cycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CycleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CycleLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleRefDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CycleRefDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChargeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inatallmentPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "InatallmentPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentRequest>InatallmentPlan"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AdditionalProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SimpleProperty"));
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
