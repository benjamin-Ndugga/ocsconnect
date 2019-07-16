/**
 * ChangeAcctBillCycleRequestAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAcctBillCycleRequestAccount  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccountRootAccount rootAccount;

    /* If this is a account hierarchy, so all accounts in this hierarchy
     * should have same billing cycle type. */
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccountSubAccount[] subAccount;

    public ChangeAcctBillCycleRequestAccount() {
    }

    public ChangeAcctBillCycleRequestAccount(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccountRootAccount rootAccount,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccountSubAccount[] subAccount) {
           this.rootAccount = rootAccount;
           this.subAccount = subAccount;
    }


    /**
     * Gets the rootAccount value for this ChangeAcctBillCycleRequestAccount.
     * 
     * @return rootAccount
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccountRootAccount getRootAccount() {
        return rootAccount;
    }


    /**
     * Sets the rootAccount value for this ChangeAcctBillCycleRequestAccount.
     * 
     * @param rootAccount
     */
    public void setRootAccount(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccountRootAccount rootAccount) {
        this.rootAccount = rootAccount;
    }


    /**
     * Gets the subAccount value for this ChangeAcctBillCycleRequestAccount.
     * 
     * @return subAccount   * If this is a account hierarchy, so all accounts in this hierarchy
     * should have same billing cycle type.
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccountSubAccount[] getSubAccount() {
        return subAccount;
    }


    /**
     * Sets the subAccount value for this ChangeAcctBillCycleRequestAccount.
     * 
     * @param subAccount   * If this is a account hierarchy, so all accounts in this hierarchy
     * should have same billing cycle type.
     */
    public void setSubAccount(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccountSubAccount[] subAccount) {
        this.subAccount = subAccount;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccountSubAccount getSubAccount(int i) {
        return this.subAccount[i];
    }

    public void setSubAccount(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestAccountSubAccount _value) {
        this.subAccount[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAcctBillCycleRequestAccount)) return false;
        ChangeAcctBillCycleRequestAccount other = (ChangeAcctBillCycleRequestAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rootAccount==null && other.getRootAccount()==null) || 
             (this.rootAccount!=null &&
              this.rootAccount.equals(other.getRootAccount()))) &&
            ((this.subAccount==null && other.getSubAccount()==null) || 
             (this.subAccount!=null &&
              java.util.Arrays.equals(this.subAccount, other.getSubAccount())));
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
        if (getRootAccount() != null) {
            _hashCode += getRootAccount().hashCode();
        }
        if (getSubAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubAccount(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeAcctBillCycleRequestAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctBillCycleRequest>Account"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RootAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctBillCycleRequest>Account>RootAccount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctBillCycleRequest>Account>SubAccount"));
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
