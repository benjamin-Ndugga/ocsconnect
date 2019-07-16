/**
 * BalanceToValidityResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class BalanceToValidityResult  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType acctChgRec;

    private java.lang.String newActiveStop;

    private java.lang.String newSuspendStop;

    private java.lang.String newDisableStop;

    public BalanceToValidityResult() {
    }

    public BalanceToValidityResult(
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType acctChgRec,
           java.lang.String newActiveStop,
           java.lang.String newSuspendStop,
           java.lang.String newDisableStop) {
           this.acctChgRec = acctChgRec;
           this.newActiveStop = newActiveStop;
           this.newSuspendStop = newSuspendStop;
           this.newDisableStop = newDisableStop;
    }


    /**
     * Gets the acctChgRec value for this BalanceToValidityResult.
     * 
     * @return acctChgRec
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType getAcctChgRec() {
        return acctChgRec;
    }


    /**
     * Sets the acctChgRec value for this BalanceToValidityResult.
     * 
     * @param acctChgRec
     */
    public void setAcctChgRec(com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType acctChgRec) {
        this.acctChgRec = acctChgRec;
    }


    /**
     * Gets the newActiveStop value for this BalanceToValidityResult.
     * 
     * @return newActiveStop
     */
    public java.lang.String getNewActiveStop() {
        return newActiveStop;
    }


    /**
     * Sets the newActiveStop value for this BalanceToValidityResult.
     * 
     * @param newActiveStop
     */
    public void setNewActiveStop(java.lang.String newActiveStop) {
        this.newActiveStop = newActiveStop;
    }


    /**
     * Gets the newSuspendStop value for this BalanceToValidityResult.
     * 
     * @return newSuspendStop
     */
    public java.lang.String getNewSuspendStop() {
        return newSuspendStop;
    }


    /**
     * Sets the newSuspendStop value for this BalanceToValidityResult.
     * 
     * @param newSuspendStop
     */
    public void setNewSuspendStop(java.lang.String newSuspendStop) {
        this.newSuspendStop = newSuspendStop;
    }


    /**
     * Gets the newDisableStop value for this BalanceToValidityResult.
     * 
     * @return newDisableStop
     */
    public java.lang.String getNewDisableStop() {
        return newDisableStop;
    }


    /**
     * Sets the newDisableStop value for this BalanceToValidityResult.
     * 
     * @param newDisableStop
     */
    public void setNewDisableStop(java.lang.String newDisableStop) {
        this.newDisableStop = newDisableStop;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceToValidityResult)) return false;
        BalanceToValidityResult other = (BalanceToValidityResult) obj;
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
              this.acctChgRec.equals(other.getAcctChgRec()))) &&
            ((this.newActiveStop==null && other.getNewActiveStop()==null) || 
             (this.newActiveStop!=null &&
              this.newActiveStop.equals(other.getNewActiveStop()))) &&
            ((this.newSuspendStop==null && other.getNewSuspendStop()==null) || 
             (this.newSuspendStop!=null &&
              this.newSuspendStop.equals(other.getNewSuspendStop()))) &&
            ((this.newDisableStop==null && other.getNewDisableStop()==null) || 
             (this.newDisableStop!=null &&
              this.newDisableStop.equals(other.getNewDisableStop())));
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
        if (getNewActiveStop() != null) {
            _hashCode += getNewActiveStop().hashCode();
        }
        if (getNewSuspendStop() != null) {
            _hashCode += getNewSuspendStop().hashCode();
        }
        if (getNewDisableStop() != null) {
            _hashCode += getNewDisableStop().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalanceToValidityResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "BalanceToValidityResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctChgRec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newActiveStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "NewActiveStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSuspendStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "NewSuspendStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDisableStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "NewDisableStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
