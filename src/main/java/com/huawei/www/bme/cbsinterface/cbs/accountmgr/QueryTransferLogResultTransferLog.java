/**
 * QueryTransferLogResultTransferLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class QueryTransferLogResultTransferLog  implements java.io.Serializable {
    private java.lang.String logID;

    private java.lang.String internalSerialNo;

    private java.lang.String peerPartyNo;

    private java.lang.String tradeTime;

    private java.lang.String operatorID;

    private java.lang.Long handlingCharge;

    private java.lang.String oldActiveStop;

    private java.lang.String newActiveStop;

    private java.lang.String oldSuspendStop;

    private java.lang.String newSuspendStop;

    private java.lang.String oldDisableStop;

    private java.lang.String newDisableStop;

    private java.lang.String operationDes;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryTransferLogResultTransferLogTransferAcctItem[] transferAcctItem;

    private java.lang.Integer loanPayment;

    private java.lang.Integer loanPoundage;

    public QueryTransferLogResultTransferLog() {
    }

    public QueryTransferLogResultTransferLog(
           java.lang.String logID,
           java.lang.String internalSerialNo,
           java.lang.String peerPartyNo,
           java.lang.String tradeTime,
           java.lang.String operatorID,
           java.lang.Long handlingCharge,
           java.lang.String oldActiveStop,
           java.lang.String newActiveStop,
           java.lang.String oldSuspendStop,
           java.lang.String newSuspendStop,
           java.lang.String oldDisableStop,
           java.lang.String newDisableStop,
           java.lang.String operationDes,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryTransferLogResultTransferLogTransferAcctItem[] transferAcctItem,
           java.lang.Integer loanPayment,
           java.lang.Integer loanPoundage) {
           this.logID = logID;
           this.internalSerialNo = internalSerialNo;
           this.peerPartyNo = peerPartyNo;
           this.tradeTime = tradeTime;
           this.operatorID = operatorID;
           this.handlingCharge = handlingCharge;
           this.oldActiveStop = oldActiveStop;
           this.newActiveStop = newActiveStop;
           this.oldSuspendStop = oldSuspendStop;
           this.newSuspendStop = newSuspendStop;
           this.oldDisableStop = oldDisableStop;
           this.newDisableStop = newDisableStop;
           this.operationDes = operationDes;
           this.transferAcctItem = transferAcctItem;
           this.loanPayment = loanPayment;
           this.loanPoundage = loanPoundage;
    }


    /**
     * Gets the logID value for this QueryTransferLogResultTransferLog.
     * 
     * @return logID
     */
    public java.lang.String getLogID() {
        return logID;
    }


    /**
     * Sets the logID value for this QueryTransferLogResultTransferLog.
     * 
     * @param logID
     */
    public void setLogID(java.lang.String logID) {
        this.logID = logID;
    }


    /**
     * Gets the internalSerialNo value for this QueryTransferLogResultTransferLog.
     * 
     * @return internalSerialNo
     */
    public java.lang.String getInternalSerialNo() {
        return internalSerialNo;
    }


    /**
     * Sets the internalSerialNo value for this QueryTransferLogResultTransferLog.
     * 
     * @param internalSerialNo
     */
    public void setInternalSerialNo(java.lang.String internalSerialNo) {
        this.internalSerialNo = internalSerialNo;
    }


    /**
     * Gets the peerPartyNo value for this QueryTransferLogResultTransferLog.
     * 
     * @return peerPartyNo
     */
    public java.lang.String getPeerPartyNo() {
        return peerPartyNo;
    }


    /**
     * Sets the peerPartyNo value for this QueryTransferLogResultTransferLog.
     * 
     * @param peerPartyNo
     */
    public void setPeerPartyNo(java.lang.String peerPartyNo) {
        this.peerPartyNo = peerPartyNo;
    }


    /**
     * Gets the tradeTime value for this QueryTransferLogResultTransferLog.
     * 
     * @return tradeTime
     */
    public java.lang.String getTradeTime() {
        return tradeTime;
    }


    /**
     * Sets the tradeTime value for this QueryTransferLogResultTransferLog.
     * 
     * @param tradeTime
     */
    public void setTradeTime(java.lang.String tradeTime) {
        this.tradeTime = tradeTime;
    }


    /**
     * Gets the operatorID value for this QueryTransferLogResultTransferLog.
     * 
     * @return operatorID
     */
    public java.lang.String getOperatorID() {
        return operatorID;
    }


    /**
     * Sets the operatorID value for this QueryTransferLogResultTransferLog.
     * 
     * @param operatorID
     */
    public void setOperatorID(java.lang.String operatorID) {
        this.operatorID = operatorID;
    }


    /**
     * Gets the handlingCharge value for this QueryTransferLogResultTransferLog.
     * 
     * @return handlingCharge
     */
    public java.lang.Long getHandlingCharge() {
        return handlingCharge;
    }


    /**
     * Sets the handlingCharge value for this QueryTransferLogResultTransferLog.
     * 
     * @param handlingCharge
     */
    public void setHandlingCharge(java.lang.Long handlingCharge) {
        this.handlingCharge = handlingCharge;
    }


    /**
     * Gets the oldActiveStop value for this QueryTransferLogResultTransferLog.
     * 
     * @return oldActiveStop
     */
    public java.lang.String getOldActiveStop() {
        return oldActiveStop;
    }


    /**
     * Sets the oldActiveStop value for this QueryTransferLogResultTransferLog.
     * 
     * @param oldActiveStop
     */
    public void setOldActiveStop(java.lang.String oldActiveStop) {
        this.oldActiveStop = oldActiveStop;
    }


    /**
     * Gets the newActiveStop value for this QueryTransferLogResultTransferLog.
     * 
     * @return newActiveStop
     */
    public java.lang.String getNewActiveStop() {
        return newActiveStop;
    }


    /**
     * Sets the newActiveStop value for this QueryTransferLogResultTransferLog.
     * 
     * @param newActiveStop
     */
    public void setNewActiveStop(java.lang.String newActiveStop) {
        this.newActiveStop = newActiveStop;
    }


    /**
     * Gets the oldSuspendStop value for this QueryTransferLogResultTransferLog.
     * 
     * @return oldSuspendStop
     */
    public java.lang.String getOldSuspendStop() {
        return oldSuspendStop;
    }


    /**
     * Sets the oldSuspendStop value for this QueryTransferLogResultTransferLog.
     * 
     * @param oldSuspendStop
     */
    public void setOldSuspendStop(java.lang.String oldSuspendStop) {
        this.oldSuspendStop = oldSuspendStop;
    }


    /**
     * Gets the newSuspendStop value for this QueryTransferLogResultTransferLog.
     * 
     * @return newSuspendStop
     */
    public java.lang.String getNewSuspendStop() {
        return newSuspendStop;
    }


    /**
     * Sets the newSuspendStop value for this QueryTransferLogResultTransferLog.
     * 
     * @param newSuspendStop
     */
    public void setNewSuspendStop(java.lang.String newSuspendStop) {
        this.newSuspendStop = newSuspendStop;
    }


    /**
     * Gets the oldDisableStop value for this QueryTransferLogResultTransferLog.
     * 
     * @return oldDisableStop
     */
    public java.lang.String getOldDisableStop() {
        return oldDisableStop;
    }


    /**
     * Sets the oldDisableStop value for this QueryTransferLogResultTransferLog.
     * 
     * @param oldDisableStop
     */
    public void setOldDisableStop(java.lang.String oldDisableStop) {
        this.oldDisableStop = oldDisableStop;
    }


    /**
     * Gets the newDisableStop value for this QueryTransferLogResultTransferLog.
     * 
     * @return newDisableStop
     */
    public java.lang.String getNewDisableStop() {
        return newDisableStop;
    }


    /**
     * Sets the newDisableStop value for this QueryTransferLogResultTransferLog.
     * 
     * @param newDisableStop
     */
    public void setNewDisableStop(java.lang.String newDisableStop) {
        this.newDisableStop = newDisableStop;
    }


    /**
     * Gets the operationDes value for this QueryTransferLogResultTransferLog.
     * 
     * @return operationDes
     */
    public java.lang.String getOperationDes() {
        return operationDes;
    }


    /**
     * Sets the operationDes value for this QueryTransferLogResultTransferLog.
     * 
     * @param operationDes
     */
    public void setOperationDes(java.lang.String operationDes) {
        this.operationDes = operationDes;
    }


    /**
     * Gets the transferAcctItem value for this QueryTransferLogResultTransferLog.
     * 
     * @return transferAcctItem
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryTransferLogResultTransferLogTransferAcctItem[] getTransferAcctItem() {
        return transferAcctItem;
    }


    /**
     * Sets the transferAcctItem value for this QueryTransferLogResultTransferLog.
     * 
     * @param transferAcctItem
     */
    public void setTransferAcctItem(com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryTransferLogResultTransferLogTransferAcctItem[] transferAcctItem) {
        this.transferAcctItem = transferAcctItem;
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryTransferLogResultTransferLogTransferAcctItem getTransferAcctItem(int i) {
        return this.transferAcctItem[i];
    }

    public void setTransferAcctItem(int i, com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryTransferLogResultTransferLogTransferAcctItem _value) {
        this.transferAcctItem[i] = _value;
    }


    /**
     * Gets the loanPayment value for this QueryTransferLogResultTransferLog.
     * 
     * @return loanPayment
     */
    public java.lang.Integer getLoanPayment() {
        return loanPayment;
    }


    /**
     * Sets the loanPayment value for this QueryTransferLogResultTransferLog.
     * 
     * @param loanPayment
     */
    public void setLoanPayment(java.lang.Integer loanPayment) {
        this.loanPayment = loanPayment;
    }


    /**
     * Gets the loanPoundage value for this QueryTransferLogResultTransferLog.
     * 
     * @return loanPoundage
     */
    public java.lang.Integer getLoanPoundage() {
        return loanPoundage;
    }


    /**
     * Sets the loanPoundage value for this QueryTransferLogResultTransferLog.
     * 
     * @param loanPoundage
     */
    public void setLoanPoundage(java.lang.Integer loanPoundage) {
        this.loanPoundage = loanPoundage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryTransferLogResultTransferLog)) return false;
        QueryTransferLogResultTransferLog other = (QueryTransferLogResultTransferLog) obj;
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
            ((this.internalSerialNo==null && other.getInternalSerialNo()==null) || 
             (this.internalSerialNo!=null &&
              this.internalSerialNo.equals(other.getInternalSerialNo()))) &&
            ((this.peerPartyNo==null && other.getPeerPartyNo()==null) || 
             (this.peerPartyNo!=null &&
              this.peerPartyNo.equals(other.getPeerPartyNo()))) &&
            ((this.tradeTime==null && other.getTradeTime()==null) || 
             (this.tradeTime!=null &&
              this.tradeTime.equals(other.getTradeTime()))) &&
            ((this.operatorID==null && other.getOperatorID()==null) || 
             (this.operatorID!=null &&
              this.operatorID.equals(other.getOperatorID()))) &&
            ((this.handlingCharge==null && other.getHandlingCharge()==null) || 
             (this.handlingCharge!=null &&
              this.handlingCharge.equals(other.getHandlingCharge()))) &&
            ((this.oldActiveStop==null && other.getOldActiveStop()==null) || 
             (this.oldActiveStop!=null &&
              this.oldActiveStop.equals(other.getOldActiveStop()))) &&
            ((this.newActiveStop==null && other.getNewActiveStop()==null) || 
             (this.newActiveStop!=null &&
              this.newActiveStop.equals(other.getNewActiveStop()))) &&
            ((this.oldSuspendStop==null && other.getOldSuspendStop()==null) || 
             (this.oldSuspendStop!=null &&
              this.oldSuspendStop.equals(other.getOldSuspendStop()))) &&
            ((this.newSuspendStop==null && other.getNewSuspendStop()==null) || 
             (this.newSuspendStop!=null &&
              this.newSuspendStop.equals(other.getNewSuspendStop()))) &&
            ((this.oldDisableStop==null && other.getOldDisableStop()==null) || 
             (this.oldDisableStop!=null &&
              this.oldDisableStop.equals(other.getOldDisableStop()))) &&
            ((this.newDisableStop==null && other.getNewDisableStop()==null) || 
             (this.newDisableStop!=null &&
              this.newDisableStop.equals(other.getNewDisableStop()))) &&
            ((this.operationDes==null && other.getOperationDes()==null) || 
             (this.operationDes!=null &&
              this.operationDes.equals(other.getOperationDes()))) &&
            ((this.transferAcctItem==null && other.getTransferAcctItem()==null) || 
             (this.transferAcctItem!=null &&
              java.util.Arrays.equals(this.transferAcctItem, other.getTransferAcctItem()))) &&
            ((this.loanPayment==null && other.getLoanPayment()==null) || 
             (this.loanPayment!=null &&
              this.loanPayment.equals(other.getLoanPayment()))) &&
            ((this.loanPoundage==null && other.getLoanPoundage()==null) || 
             (this.loanPoundage!=null &&
              this.loanPoundage.equals(other.getLoanPoundage())));
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
        if (getInternalSerialNo() != null) {
            _hashCode += getInternalSerialNo().hashCode();
        }
        if (getPeerPartyNo() != null) {
            _hashCode += getPeerPartyNo().hashCode();
        }
        if (getTradeTime() != null) {
            _hashCode += getTradeTime().hashCode();
        }
        if (getOperatorID() != null) {
            _hashCode += getOperatorID().hashCode();
        }
        if (getHandlingCharge() != null) {
            _hashCode += getHandlingCharge().hashCode();
        }
        if (getOldActiveStop() != null) {
            _hashCode += getOldActiveStop().hashCode();
        }
        if (getNewActiveStop() != null) {
            _hashCode += getNewActiveStop().hashCode();
        }
        if (getOldSuspendStop() != null) {
            _hashCode += getOldSuspendStop().hashCode();
        }
        if (getNewSuspendStop() != null) {
            _hashCode += getNewSuspendStop().hashCode();
        }
        if (getOldDisableStop() != null) {
            _hashCode += getOldDisableStop().hashCode();
        }
        if (getNewDisableStop() != null) {
            _hashCode += getNewDisableStop().hashCode();
        }
        if (getOperationDes() != null) {
            _hashCode += getOperationDes().hashCode();
        }
        if (getTransferAcctItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferAcctItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferAcctItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLoanPayment() != null) {
            _hashCode += getLoanPayment().hashCode();
        }
        if (getLoanPoundage() != null) {
            _hashCode += getLoanPoundage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryTransferLogResultTransferLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">QueryTransferLogResult>TransferLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LogID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "InternalSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peerPartyNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "PeerPartyNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TradeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OperatorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "HandlingCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldActiveStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OldActiveStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newActiveStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "NewActiveStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldSuspendStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OldSuspendStop"));
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
        elemField.setFieldName("oldDisableStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OldDisableStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDisableStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "NewDisableStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OperationDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferAcctItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransferAcctItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">>QueryTransferLogResult>TransferLog>TransferAcctItem"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LoanPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanPoundage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LoanPoundage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
