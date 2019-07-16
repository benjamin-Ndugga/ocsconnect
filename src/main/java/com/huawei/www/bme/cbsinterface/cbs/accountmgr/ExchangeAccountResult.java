/**
 * ExchangeAccountResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class ExchangeAccountResult  implements java.io.Serializable {
    private java.lang.Long exchangeHandlingCharge;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType oriAcctChgRec;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType desAcctChgRec;

    public ExchangeAccountResult() {
    }

    public ExchangeAccountResult(
           java.lang.Long exchangeHandlingCharge,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType oriAcctChgRec,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType desAcctChgRec) {
           this.exchangeHandlingCharge = exchangeHandlingCharge;
           this.oriAcctChgRec = oriAcctChgRec;
           this.desAcctChgRec = desAcctChgRec;
    }


    /**
     * Gets the exchangeHandlingCharge value for this ExchangeAccountResult.
     * 
     * @return exchangeHandlingCharge
     */
    public java.lang.Long getExchangeHandlingCharge() {
        return exchangeHandlingCharge;
    }


    /**
     * Sets the exchangeHandlingCharge value for this ExchangeAccountResult.
     * 
     * @param exchangeHandlingCharge
     */
    public void setExchangeHandlingCharge(java.lang.Long exchangeHandlingCharge) {
        this.exchangeHandlingCharge = exchangeHandlingCharge;
    }


    /**
     * Gets the oriAcctChgRec value for this ExchangeAccountResult.
     * 
     * @return oriAcctChgRec
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType getOriAcctChgRec() {
        return oriAcctChgRec;
    }


    /**
     * Sets the oriAcctChgRec value for this ExchangeAccountResult.
     * 
     * @param oriAcctChgRec
     */
    public void setOriAcctChgRec(com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType oriAcctChgRec) {
        this.oriAcctChgRec = oriAcctChgRec;
    }


    /**
     * Gets the desAcctChgRec value for this ExchangeAccountResult.
     * 
     * @return desAcctChgRec
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType getDesAcctChgRec() {
        return desAcctChgRec;
    }


    /**
     * Sets the desAcctChgRec value for this ExchangeAccountResult.
     * 
     * @param desAcctChgRec
     */
    public void setDesAcctChgRec(com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType desAcctChgRec) {
        this.desAcctChgRec = desAcctChgRec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExchangeAccountResult)) return false;
        ExchangeAccountResult other = (ExchangeAccountResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exchangeHandlingCharge==null && other.getExchangeHandlingCharge()==null) || 
             (this.exchangeHandlingCharge!=null &&
              this.exchangeHandlingCharge.equals(other.getExchangeHandlingCharge()))) &&
            ((this.oriAcctChgRec==null && other.getOriAcctChgRec()==null) || 
             (this.oriAcctChgRec!=null &&
              this.oriAcctChgRec.equals(other.getOriAcctChgRec()))) &&
            ((this.desAcctChgRec==null && other.getDesAcctChgRec()==null) || 
             (this.desAcctChgRec!=null &&
              this.desAcctChgRec.equals(other.getDesAcctChgRec())));
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
        if (getExchangeHandlingCharge() != null) {
            _hashCode += getExchangeHandlingCharge().hashCode();
        }
        if (getOriAcctChgRec() != null) {
            _hashCode += getOriAcctChgRec().hashCode();
        }
        if (getDesAcctChgRec() != null) {
            _hashCode += getDesAcctChgRec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExchangeAccountResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ExchangeAccountResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeHandlingCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ExchangeHandlingCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oriAcctChgRec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OriAcctChgRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desAcctChgRec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "DesAcctChgRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType"));
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
