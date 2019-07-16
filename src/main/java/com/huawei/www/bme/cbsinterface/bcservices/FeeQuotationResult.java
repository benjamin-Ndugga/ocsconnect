/**
 * FeeQuotationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class FeeQuotationResult  implements java.io.Serializable {
    private java.lang.String balanceSufficientFlag;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultAcctBalanceChangeList[] acctBalanceChangeList;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultFreeUnitChangeList[] freeUnitChangeList;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultChargeAmountList[] chargeAmountList;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultCreditLimitChangeList[] creditLimitChangeList;

    private com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultConsumptionLimitChangeList[] consumptionLimitChangeList;

    public FeeQuotationResult() {
    }

    public FeeQuotationResult(
           java.lang.String balanceSufficientFlag,
           com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultAcctBalanceChangeList[] acctBalanceChangeList,
           com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultFreeUnitChangeList[] freeUnitChangeList,
           com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultChargeAmountList[] chargeAmountList,
           com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultCreditLimitChangeList[] creditLimitChangeList,
           com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultConsumptionLimitChangeList[] consumptionLimitChangeList) {
           this.balanceSufficientFlag = balanceSufficientFlag;
           this.acctBalanceChangeList = acctBalanceChangeList;
           this.freeUnitChangeList = freeUnitChangeList;
           this.chargeAmountList = chargeAmountList;
           this.creditLimitChangeList = creditLimitChangeList;
           this.consumptionLimitChangeList = consumptionLimitChangeList;
    }


    /**
     * Gets the balanceSufficientFlag value for this FeeQuotationResult.
     * 
     * @return balanceSufficientFlag
     */
    public java.lang.String getBalanceSufficientFlag() {
        return balanceSufficientFlag;
    }


    /**
     * Sets the balanceSufficientFlag value for this FeeQuotationResult.
     * 
     * @param balanceSufficientFlag
     */
    public void setBalanceSufficientFlag(java.lang.String balanceSufficientFlag) {
        this.balanceSufficientFlag = balanceSufficientFlag;
    }


    /**
     * Gets the acctBalanceChangeList value for this FeeQuotationResult.
     * 
     * @return acctBalanceChangeList
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultAcctBalanceChangeList[] getAcctBalanceChangeList() {
        return acctBalanceChangeList;
    }


    /**
     * Sets the acctBalanceChangeList value for this FeeQuotationResult.
     * 
     * @param acctBalanceChangeList
     */
    public void setAcctBalanceChangeList(com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultAcctBalanceChangeList[] acctBalanceChangeList) {
        this.acctBalanceChangeList = acctBalanceChangeList;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultAcctBalanceChangeList getAcctBalanceChangeList(int i) {
        return this.acctBalanceChangeList[i];
    }

    public void setAcctBalanceChangeList(int i, com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultAcctBalanceChangeList _value) {
        this.acctBalanceChangeList[i] = _value;
    }


    /**
     * Gets the freeUnitChangeList value for this FeeQuotationResult.
     * 
     * @return freeUnitChangeList
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultFreeUnitChangeList[] getFreeUnitChangeList() {
        return freeUnitChangeList;
    }


    /**
     * Sets the freeUnitChangeList value for this FeeQuotationResult.
     * 
     * @param freeUnitChangeList
     */
    public void setFreeUnitChangeList(com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultFreeUnitChangeList[] freeUnitChangeList) {
        this.freeUnitChangeList = freeUnitChangeList;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultFreeUnitChangeList getFreeUnitChangeList(int i) {
        return this.freeUnitChangeList[i];
    }

    public void setFreeUnitChangeList(int i, com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultFreeUnitChangeList _value) {
        this.freeUnitChangeList[i] = _value;
    }


    /**
     * Gets the chargeAmountList value for this FeeQuotationResult.
     * 
     * @return chargeAmountList
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultChargeAmountList[] getChargeAmountList() {
        return chargeAmountList;
    }


    /**
     * Sets the chargeAmountList value for this FeeQuotationResult.
     * 
     * @param chargeAmountList
     */
    public void setChargeAmountList(com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultChargeAmountList[] chargeAmountList) {
        this.chargeAmountList = chargeAmountList;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultChargeAmountList getChargeAmountList(int i) {
        return this.chargeAmountList[i];
    }

    public void setChargeAmountList(int i, com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultChargeAmountList _value) {
        this.chargeAmountList[i] = _value;
    }


    /**
     * Gets the creditLimitChangeList value for this FeeQuotationResult.
     * 
     * @return creditLimitChangeList
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultCreditLimitChangeList[] getCreditLimitChangeList() {
        return creditLimitChangeList;
    }


    /**
     * Sets the creditLimitChangeList value for this FeeQuotationResult.
     * 
     * @param creditLimitChangeList
     */
    public void setCreditLimitChangeList(com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultCreditLimitChangeList[] creditLimitChangeList) {
        this.creditLimitChangeList = creditLimitChangeList;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultCreditLimitChangeList getCreditLimitChangeList(int i) {
        return this.creditLimitChangeList[i];
    }

    public void setCreditLimitChangeList(int i, com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultCreditLimitChangeList _value) {
        this.creditLimitChangeList[i] = _value;
    }


    /**
     * Gets the consumptionLimitChangeList value for this FeeQuotationResult.
     * 
     * @return consumptionLimitChangeList
     */
    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultConsumptionLimitChangeList[] getConsumptionLimitChangeList() {
        return consumptionLimitChangeList;
    }


    /**
     * Sets the consumptionLimitChangeList value for this FeeQuotationResult.
     * 
     * @param consumptionLimitChangeList
     */
    public void setConsumptionLimitChangeList(com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultConsumptionLimitChangeList[] consumptionLimitChangeList) {
        this.consumptionLimitChangeList = consumptionLimitChangeList;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultConsumptionLimitChangeList getConsumptionLimitChangeList(int i) {
        return this.consumptionLimitChangeList[i];
    }

    public void setConsumptionLimitChangeList(int i, com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultConsumptionLimitChangeList _value) {
        this.consumptionLimitChangeList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeQuotationResult)) return false;
        FeeQuotationResult other = (FeeQuotationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balanceSufficientFlag==null && other.getBalanceSufficientFlag()==null) || 
             (this.balanceSufficientFlag!=null &&
              this.balanceSufficientFlag.equals(other.getBalanceSufficientFlag()))) &&
            ((this.acctBalanceChangeList==null && other.getAcctBalanceChangeList()==null) || 
             (this.acctBalanceChangeList!=null &&
              java.util.Arrays.equals(this.acctBalanceChangeList, other.getAcctBalanceChangeList()))) &&
            ((this.freeUnitChangeList==null && other.getFreeUnitChangeList()==null) || 
             (this.freeUnitChangeList!=null &&
              java.util.Arrays.equals(this.freeUnitChangeList, other.getFreeUnitChangeList()))) &&
            ((this.chargeAmountList==null && other.getChargeAmountList()==null) || 
             (this.chargeAmountList!=null &&
              java.util.Arrays.equals(this.chargeAmountList, other.getChargeAmountList()))) &&
            ((this.creditLimitChangeList==null && other.getCreditLimitChangeList()==null) || 
             (this.creditLimitChangeList!=null &&
              java.util.Arrays.equals(this.creditLimitChangeList, other.getCreditLimitChangeList()))) &&
            ((this.consumptionLimitChangeList==null && other.getConsumptionLimitChangeList()==null) || 
             (this.consumptionLimitChangeList!=null &&
              java.util.Arrays.equals(this.consumptionLimitChangeList, other.getConsumptionLimitChangeList())));
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
        if (getBalanceSufficientFlag() != null) {
            _hashCode += getBalanceSufficientFlag().hashCode();
        }
        if (getAcctBalanceChangeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcctBalanceChangeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcctBalanceChangeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFreeUnitChangeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeUnitChangeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeUnitChangeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChargeAmountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChargeAmountList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChargeAmountList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditLimitChangeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditLimitChangeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditLimitChangeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConsumptionLimitChangeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsumptionLimitChangeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConsumptionLimitChangeList(), i);
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
        new org.apache.axis.description.TypeDesc(FeeQuotationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FeeQuotationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceSufficientFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BalanceSufficientFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctBalanceChangeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctBalanceChangeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationResult>AcctBalanceChangeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitChangeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FreeUnitChangeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationResult>FreeUnitChangeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeAmountList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChargeAmountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationResult>ChargeAmountList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimitChangeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreditLimitChangeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationResult>CreditLimitChangeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumptionLimitChangeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ConsumptionLimitChangeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">FeeQuotationResult>ConsumptionLimitChangeList"));
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
