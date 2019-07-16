/**
 * ServiceHandleFeeResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class ServiceHandleFeeResult  implements java.io.Serializable {
    private java.lang.Integer deductionAmt;

    private java.lang.Integer residualFreeTimes;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] acctChgRec;

    public ServiceHandleFeeResult() {
    }

    public ServiceHandleFeeResult(
           java.lang.Integer deductionAmt,
           java.lang.Integer residualFreeTimes,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] acctChgRec) {
           this.deductionAmt = deductionAmt;
           this.residualFreeTimes = residualFreeTimes;
           this.acctChgRec = acctChgRec;
    }


    /**
     * Gets the deductionAmt value for this ServiceHandleFeeResult.
     * 
     * @return deductionAmt
     */
    public java.lang.Integer getDeductionAmt() {
        return deductionAmt;
    }


    /**
     * Sets the deductionAmt value for this ServiceHandleFeeResult.
     * 
     * @param deductionAmt
     */
    public void setDeductionAmt(java.lang.Integer deductionAmt) {
        this.deductionAmt = deductionAmt;
    }


    /**
     * Gets the residualFreeTimes value for this ServiceHandleFeeResult.
     * 
     * @return residualFreeTimes
     */
    public java.lang.Integer getResidualFreeTimes() {
        return residualFreeTimes;
    }


    /**
     * Sets the residualFreeTimes value for this ServiceHandleFeeResult.
     * 
     * @param residualFreeTimes
     */
    public void setResidualFreeTimes(java.lang.Integer residualFreeTimes) {
        this.residualFreeTimes = residualFreeTimes;
    }


    /**
     * Gets the acctChgRec value for this ServiceHandleFeeResult.
     * 
     * @return acctChgRec
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] getAcctChgRec() {
        return acctChgRec;
    }


    /**
     * Sets the acctChgRec value for this ServiceHandleFeeResult.
     * 
     * @param acctChgRec
     */
    public void setAcctChgRec(com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] acctChgRec) {
        this.acctChgRec = acctChgRec;
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType getAcctChgRec(int i) {
        return this.acctChgRec[i];
    }

    public void setAcctChgRec(int i, com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType _value) {
        this.acctChgRec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceHandleFeeResult)) return false;
        ServiceHandleFeeResult other = (ServiceHandleFeeResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deductionAmt==null && other.getDeductionAmt()==null) || 
             (this.deductionAmt!=null &&
              this.deductionAmt.equals(other.getDeductionAmt()))) &&
            ((this.residualFreeTimes==null && other.getResidualFreeTimes()==null) || 
             (this.residualFreeTimes!=null &&
              this.residualFreeTimes.equals(other.getResidualFreeTimes()))) &&
            ((this.acctChgRec==null && other.getAcctChgRec()==null) || 
             (this.acctChgRec!=null &&
              java.util.Arrays.equals(this.acctChgRec, other.getAcctChgRec())));
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
        if (getDeductionAmt() != null) {
            _hashCode += getDeductionAmt().hashCode();
        }
        if (getResidualFreeTimes() != null) {
            _hashCode += getResidualFreeTimes().hashCode();
        }
        if (getAcctChgRec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcctChgRec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcctChgRec(), i);
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
        new org.apache.axis.description.TypeDesc(ServiceHandleFeeResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ServiceHandleFeeResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductionAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "DeductionAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residualFreeTimes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ResidualFreeTimes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctChgRec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType"));
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
