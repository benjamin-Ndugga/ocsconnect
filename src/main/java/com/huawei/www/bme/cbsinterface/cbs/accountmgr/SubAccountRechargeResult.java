/**
 * SubAccountRechargeResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class SubAccountRechargeResult  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType acctChgRec;

    public SubAccountRechargeResult() {
    }

    public SubAccountRechargeResult(
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType acctChgRec) {
           this.acctChgRec = acctChgRec;
    }


    /**
     * Gets the acctChgRec value for this SubAccountRechargeResult.
     * 
     * @return acctChgRec
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType getAcctChgRec() {
        return acctChgRec;
    }


    /**
     * Sets the acctChgRec value for this SubAccountRechargeResult.
     * 
     * @param acctChgRec
     */
    public void setAcctChgRec(com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType acctChgRec) {
        this.acctChgRec = acctChgRec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubAccountRechargeResult)) return false;
        SubAccountRechargeResult other = (SubAccountRechargeResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctChgRec==null && other.getAcctChgRec()==null) || 
             (this.acctChgRec!=null &&
              this.acctChgRec.equals(other.getAcctChgRec())));
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
        if (getAcctChgRec() != null) {
            _hashCode += getAcctChgRec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubAccountRechargeResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SubAccountRechargeResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctChgRec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
