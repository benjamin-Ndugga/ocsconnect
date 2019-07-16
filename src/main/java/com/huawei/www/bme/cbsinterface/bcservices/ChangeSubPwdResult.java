/**
 * ChangeSubPwdResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubPwdResult  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultAcctBalanceChangeList[] acctBalanceChangeList;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultFreeUnitChangeList[] freeUnitChangeList;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultCreditLimitChangeList[] creditLimitChangeList;

    public ChangeSubPwdResult() {
    }

    public ChangeSubPwdResult(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultAcctBalanceChangeList[] acctBalanceChangeList,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultFreeUnitChangeList[] freeUnitChangeList,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultCreditLimitChangeList[] creditLimitChangeList) {
           this.acctBalanceChangeList = acctBalanceChangeList;
           this.freeUnitChangeList = freeUnitChangeList;
           this.creditLimitChangeList = creditLimitChangeList;
    }


    /**
     * Gets the acctBalanceChangeList value for this ChangeSubPwdResult.
     * 
     * @return acctBalanceChangeList
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultAcctBalanceChangeList[] getAcctBalanceChangeList() {
        return acctBalanceChangeList;
    }


    /**
     * Sets the acctBalanceChangeList value for this ChangeSubPwdResult.
     * 
     * @param acctBalanceChangeList
     */
    public void setAcctBalanceChangeList(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultAcctBalanceChangeList[] acctBalanceChangeList) {
        this.acctBalanceChangeList = acctBalanceChangeList;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultAcctBalanceChangeList getAcctBalanceChangeList(int i) {
        return this.acctBalanceChangeList[i];
    }

    public void setAcctBalanceChangeList(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultAcctBalanceChangeList _value) {
        this.acctBalanceChangeList[i] = _value;
    }


    /**
     * Gets the freeUnitChangeList value for this ChangeSubPwdResult.
     * 
     * @return freeUnitChangeList
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultFreeUnitChangeList[] getFreeUnitChangeList() {
        return freeUnitChangeList;
    }


    /**
     * Sets the freeUnitChangeList value for this ChangeSubPwdResult.
     * 
     * @param freeUnitChangeList
     */
    public void setFreeUnitChangeList(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultFreeUnitChangeList[] freeUnitChangeList) {
        this.freeUnitChangeList = freeUnitChangeList;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultFreeUnitChangeList getFreeUnitChangeList(int i) {
        return this.freeUnitChangeList[i];
    }

    public void setFreeUnitChangeList(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultFreeUnitChangeList _value) {
        this.freeUnitChangeList[i] = _value;
    }


    /**
     * Gets the creditLimitChangeList value for this ChangeSubPwdResult.
     * 
     * @return creditLimitChangeList
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultCreditLimitChangeList[] getCreditLimitChangeList() {
        return creditLimitChangeList;
    }


    /**
     * Sets the creditLimitChangeList value for this ChangeSubPwdResult.
     * 
     * @param creditLimitChangeList
     */
    public void setCreditLimitChangeList(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultCreditLimitChangeList[] creditLimitChangeList) {
        this.creditLimitChangeList = creditLimitChangeList;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultCreditLimitChangeList getCreditLimitChangeList(int i) {
        return this.creditLimitChangeList[i];
    }

    public void setCreditLimitChangeList(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultCreditLimitChangeList _value) {
        this.creditLimitChangeList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubPwdResult)) return false;
        ChangeSubPwdResult other = (ChangeSubPwdResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctBalanceChangeList==null && other.getAcctBalanceChangeList()==null) || 
             (this.acctBalanceChangeList!=null &&
              java.util.Arrays.equals(this.acctBalanceChangeList, other.getAcctBalanceChangeList()))) &&
            ((this.freeUnitChangeList==null && other.getFreeUnitChangeList()==null) || 
             (this.freeUnitChangeList!=null &&
              java.util.Arrays.equals(this.freeUnitChangeList, other.getFreeUnitChangeList()))) &&
            ((this.creditLimitChangeList==null && other.getCreditLimitChangeList()==null) || 
             (this.creditLimitChangeList!=null &&
              java.util.Arrays.equals(this.creditLimitChangeList, other.getCreditLimitChangeList())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubPwdResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubPwdResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctBalanceChangeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctBalanceChangeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPwdResult>AcctBalanceChangeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitChangeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FreeUnitChangeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPwdResult>FreeUnitChangeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimitChangeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CreditLimitChangeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeSubPwdResult>CreditLimitChangeList"));
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
