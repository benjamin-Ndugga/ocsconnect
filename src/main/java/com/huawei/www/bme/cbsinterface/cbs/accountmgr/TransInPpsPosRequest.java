/**
 * TransInPpsPosRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class TransInPpsPosRequest  implements java.io.Serializable {
    private java.lang.String logID;

    private java.lang.String transfereeNo;

    private java.lang.String transferorNo;

    private int transferFlag;

    private long transferAmt;

    private java.lang.String custID;

    public TransInPpsPosRequest() {
    }

    public TransInPpsPosRequest(
           java.lang.String logID,
           java.lang.String transfereeNo,
           java.lang.String transferorNo,
           int transferFlag,
           long transferAmt,
           java.lang.String custID) {
           this.logID = logID;
           this.transfereeNo = transfereeNo;
           this.transferorNo = transferorNo;
           this.transferFlag = transferFlag;
           this.transferAmt = transferAmt;
           this.custID = custID;
    }


    /**
     * Gets the logID value for this TransInPpsPosRequest.
     * 
     * @return logID
     */
    public java.lang.String getLogID() {
        return logID;
    }


    /**
     * Sets the logID value for this TransInPpsPosRequest.
     * 
     * @param logID
     */
    public void setLogID(java.lang.String logID) {
        this.logID = logID;
    }


    /**
     * Gets the transfereeNo value for this TransInPpsPosRequest.
     * 
     * @return transfereeNo
     */
    public java.lang.String getTransfereeNo() {
        return transfereeNo;
    }


    /**
     * Sets the transfereeNo value for this TransInPpsPosRequest.
     * 
     * @param transfereeNo
     */
    public void setTransfereeNo(java.lang.String transfereeNo) {
        this.transfereeNo = transfereeNo;
    }


    /**
     * Gets the transferorNo value for this TransInPpsPosRequest.
     * 
     * @return transferorNo
     */
    public java.lang.String getTransferorNo() {
        return transferorNo;
    }


    /**
     * Sets the transferorNo value for this TransInPpsPosRequest.
     * 
     * @param transferorNo
     */
    public void setTransferorNo(java.lang.String transferorNo) {
        this.transferorNo = transferorNo;
    }


    /**
     * Gets the transferFlag value for this TransInPpsPosRequest.
     * 
     * @return transferFlag
     */
    public int getTransferFlag() {
        return transferFlag;
    }


    /**
     * Sets the transferFlag value for this TransInPpsPosRequest.
     * 
     * @param transferFlag
     */
    public void setTransferFlag(int transferFlag) {
        this.transferFlag = transferFlag;
    }


    /**
     * Gets the transferAmt value for this TransInPpsPosRequest.
     * 
     * @return transferAmt
     */
    public long getTransferAmt() {
        return transferAmt;
    }


    /**
     * Sets the transferAmt value for this TransInPpsPosRequest.
     * 
     * @param transferAmt
     */
    public void setTransferAmt(long transferAmt) {
        this.transferAmt = transferAmt;
    }


    /**
     * Gets the custID value for this TransInPpsPosRequest.
     * 
     * @return custID
     */
    public java.lang.String getCustID() {
        return custID;
    }


    /**
     * Sets the custID value for this TransInPpsPosRequest.
     * 
     * @param custID
     */
    public void setCustID(java.lang.String custID) {
        this.custID = custID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransInPpsPosRequest)) return false;
        TransInPpsPosRequest other = (TransInPpsPosRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.logID==null && other.getLogID()==null) || 
             (this.logID!=null &&
              this.logID.equals(other.getLogID()))) &&
            ((this.transfereeNo==null && other.getTransfereeNo()==null) || 
             (this.transfereeNo!=null &&
              this.transfereeNo.equals(other.getTransfereeNo()))) &&
            ((this.transferorNo==null && other.getTransferorNo()==null) || 
             (this.transferorNo!=null &&
              this.transferorNo.equals(other.getTransferorNo()))) &&
            this.transferFlag == other.getTransferFlag() &&
            this.transferAmt == other.getTransferAmt() &&
            ((this.custID==null && other.getCustID()==null) || 
             (this.custID!=null &&
              this.custID.equals(other.getCustID())));
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
        if (getLogID() != null) {
            _hashCode += getLogID().hashCode();
        }
        if (getTransfereeNo() != null) {
            _hashCode += getTransfereeNo().hashCode();
        }
        if (getTransferorNo() != null) {
            _hashCode += getTransferorNo().hashCode();
        }
        _hashCode += getTransferFlag();
        _hashCode += new Long(getTransferAmt()).hashCode();
        if (getCustID() != null) {
            _hashCode += getCustID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransInPpsPosRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransInPpsPosRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LogID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transfereeNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransfereeNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferorNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransferorNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransferFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransferAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CustID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
