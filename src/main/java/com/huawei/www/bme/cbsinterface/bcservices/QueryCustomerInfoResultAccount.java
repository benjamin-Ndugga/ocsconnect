/**
 * QueryCustomerInfoResultAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryCustomerInfoResultAccount  implements java.io.Serializable {
    private java.lang.String acctKey;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfo acctInfo;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountOfferingInst[] offeringInst;

    public QueryCustomerInfoResultAccount() {
    }

    public QueryCustomerInfoResultAccount(
           java.lang.String acctKey,
           com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfo acctInfo,
           com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountOfferingInst[] offeringInst) {
           this.acctKey = acctKey;
           this.acctInfo = acctInfo;
           this.offeringInst = offeringInst;
    }


    /**
     * Gets the acctKey value for this QueryCustomerInfoResultAccount.
     * 
     * @return acctKey
     */
    public java.lang.String getAcctKey() {
        return acctKey;
    }


    /**
     * Sets the acctKey value for this QueryCustomerInfoResultAccount.
     * 
     * @param acctKey
     */
    public void setAcctKey(java.lang.String acctKey) {
        this.acctKey = acctKey;
    }


    /**
     * Gets the acctInfo value for this QueryCustomerInfoResultAccount.
     * 
     * @return acctInfo
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfo getAcctInfo() {
        return acctInfo;
    }


    /**
     * Sets the acctInfo value for this QueryCustomerInfoResultAccount.
     * 
     * @param acctInfo
     */
    public void setAcctInfo(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountAcctInfo acctInfo) {
        this.acctInfo = acctInfo;
    }


    /**
     * Gets the offeringInst value for this QueryCustomerInfoResultAccount.
     * 
     * @return offeringInst
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountOfferingInst[] getOfferingInst() {
        return offeringInst;
    }


    /**
     * Sets the offeringInst value for this QueryCustomerInfoResultAccount.
     * 
     * @param offeringInst
     */
    public void setOfferingInst(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountOfferingInst[] offeringInst) {
        this.offeringInst = offeringInst;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountOfferingInst getOfferingInst(int i) {
        return this.offeringInst[i];
    }

    public void setOfferingInst(int i, com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultAccountOfferingInst _value) {
        this.offeringInst[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCustomerInfoResultAccount)) return false;
        QueryCustomerInfoResultAccount other = (QueryCustomerInfoResultAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctKey==null && other.getAcctKey()==null) || 
             (this.acctKey!=null &&
              this.acctKey.equals(other.getAcctKey()))) &&
            ((this.acctInfo==null && other.getAcctInfo()==null) || 
             (this.acctInfo!=null &&
              this.acctInfo.equals(other.getAcctInfo()))) &&
            ((this.offeringInst==null && other.getOfferingInst()==null) || 
             (this.offeringInst!=null &&
              java.util.Arrays.equals(this.offeringInst, other.getOfferingInst())));
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
        if (getAcctKey() != null) {
            _hashCode += getAcctKey().hashCode();
        }
        if (getAcctInfo() != null) {
            _hashCode += getAcctInfo().hashCode();
        }
        if (getOfferingInst() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferingInst());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferingInst(), i);
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
        new org.apache.axis.description.TypeDesc(QueryCustomerInfoResultAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoResult>Account"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>Account>AcctInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringInst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingInst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>Account>OfferingInst"));
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
