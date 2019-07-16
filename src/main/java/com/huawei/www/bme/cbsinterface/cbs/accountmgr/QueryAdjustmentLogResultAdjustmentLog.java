/**
 * QueryAdjustmentLogResultAdjustmentLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class QueryAdjustmentLogResultAdjustmentLog  implements java.io.Serializable {
    private java.lang.String logID;

    private java.lang.String internalSerialNo;

    private java.lang.String tradeTime;

    private java.lang.String operatorID;

    private java.lang.String oldActiveStop;

    private java.lang.String newActiveStop;

    private java.lang.String oldSuspendStop;

    private java.lang.String newSuspendStop;

    private java.lang.String oldDisableStop;

    private java.lang.String newDisableStop;

    private java.lang.String operationDes;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryAdjustmentLogResultAdjustmentLogAdjustmentItem[] adjustmentItem;

    public QueryAdjustmentLogResultAdjustmentLog() {
    }

    public QueryAdjustmentLogResultAdjustmentLog(
           java.lang.String logID,
           java.lang.String internalSerialNo,
           java.lang.String tradeTime,
           java.lang.String operatorID,
           java.lang.String oldActiveStop,
           java.lang.String newActiveStop,
           java.lang.String oldSuspendStop,
           java.lang.String newSuspendStop,
           java.lang.String oldDisableStop,
           java.lang.String newDisableStop,
           java.lang.String operationDes,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryAdjustmentLogResultAdjustmentLogAdjustmentItem[] adjustmentItem) {
           this.logID = logID;
           this.internalSerialNo = internalSerialNo;
           this.tradeTime = tradeTime;
           this.operatorID = operatorID;
           this.oldActiveStop = oldActiveStop;
           this.newActiveStop = newActiveStop;
           this.oldSuspendStop = oldSuspendStop;
           this.newSuspendStop = newSuspendStop;
           this.oldDisableStop = oldDisableStop;
           this.newDisableStop = newDisableStop;
           this.operationDes = operationDes;
           this.adjustmentItem = adjustmentItem;
    }


    /**
     * Gets the logID value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @return logID
     */
    public java.lang.String getLogID() {
        return logID;
    }


    /**
     * Sets the logID value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @param logID
     */
    public void setLogID(java.lang.String logID) {
        this.logID = logID;
    }


    /**
     * Gets the internalSerialNo value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @return internalSerialNo
     */
    public java.lang.String getInternalSerialNo() {
        return internalSerialNo;
    }


    /**
     * Sets the internalSerialNo value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @param internalSerialNo
     */
    public void setInternalSerialNo(java.lang.String internalSerialNo) {
        this.internalSerialNo = internalSerialNo;
    }


    /**
     * Gets the tradeTime value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @return tradeTime
     */
    public java.lang.String getTradeTime() {
        return tradeTime;
    }


    /**
     * Sets the tradeTime value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @param tradeTime
     */
    public void setTradeTime(java.lang.String tradeTime) {
        this.tradeTime = tradeTime;
    }


    /**
     * Gets the operatorID value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @return operatorID
     */
    public java.lang.String getOperatorID() {
        return operatorID;
    }


    /**
     * Sets the operatorID value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @param operatorID
     */
    public void setOperatorID(java.lang.String operatorID) {
        this.operatorID = operatorID;
    }


    /**
     * Gets the oldActiveStop value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @return oldActiveStop
     */
    public java.lang.String getOldActiveStop() {
        return oldActiveStop;
    }


    /**
     * Sets the oldActiveStop value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @param oldActiveStop
     */
    public void setOldActiveStop(java.lang.String oldActiveStop) {
        this.oldActiveStop = oldActiveStop;
    }


    /**
     * Gets the newActiveStop value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @return newActiveStop
     */
    public java.lang.String getNewActiveStop() {
        return newActiveStop;
    }


    /**
     * Sets the newActiveStop value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @param newActiveStop
     */
    public void setNewActiveStop(java.lang.String newActiveStop) {
        this.newActiveStop = newActiveStop;
    }


    /**
     * Gets the oldSuspendStop value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @return oldSuspendStop
     */
    public java.lang.String getOldSuspendStop() {
        return oldSuspendStop;
    }


    /**
     * Sets the oldSuspendStop value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @param oldSuspendStop
     */
    public void setOldSuspendStop(java.lang.String oldSuspendStop) {
        this.oldSuspendStop = oldSuspendStop;
    }


    /**
     * Gets the newSuspendStop value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @return newSuspendStop
     */
    public java.lang.String getNewSuspendStop() {
        return newSuspendStop;
    }


    /**
     * Sets the newSuspendStop value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @param newSuspendStop
     */
    public void setNewSuspendStop(java.lang.String newSuspendStop) {
        this.newSuspendStop = newSuspendStop;
    }


    /**
     * Gets the oldDisableStop value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @return oldDisableStop
     */
    public java.lang.String getOldDisableStop() {
        return oldDisableStop;
    }


    /**
     * Sets the oldDisableStop value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @param oldDisableStop
     */
    public void setOldDisableStop(java.lang.String oldDisableStop) {
        this.oldDisableStop = oldDisableStop;
    }


    /**
     * Gets the newDisableStop value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @return newDisableStop
     */
    public java.lang.String getNewDisableStop() {
        return newDisableStop;
    }


    /**
     * Sets the newDisableStop value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @param newDisableStop
     */
    public void setNewDisableStop(java.lang.String newDisableStop) {
        this.newDisableStop = newDisableStop;
    }


    /**
     * Gets the operationDes value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @return operationDes
     */
    public java.lang.String getOperationDes() {
        return operationDes;
    }


    /**
     * Sets the operationDes value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @param operationDes
     */
    public void setOperationDes(java.lang.String operationDes) {
        this.operationDes = operationDes;
    }


    /**
     * Gets the adjustmentItem value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @return adjustmentItem
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryAdjustmentLogResultAdjustmentLogAdjustmentItem[] getAdjustmentItem() {
        return adjustmentItem;
    }


    /**
     * Sets the adjustmentItem value for this QueryAdjustmentLogResultAdjustmentLog.
     * 
     * @param adjustmentItem
     */
    public void setAdjustmentItem(com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryAdjustmentLogResultAdjustmentLogAdjustmentItem[] adjustmentItem) {
        this.adjustmentItem = adjustmentItem;
    }

    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryAdjustmentLogResultAdjustmentLogAdjustmentItem getAdjustmentItem(int i) {
        return this.adjustmentItem[i];
    }

    public void setAdjustmentItem(int i, com.huawei.www.bme.cbsinterface.cbs.accountmgr.QueryAdjustmentLogResultAdjustmentLogAdjustmentItem _value) {
        this.adjustmentItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryAdjustmentLogResultAdjustmentLog)) return false;
        QueryAdjustmentLogResultAdjustmentLog other = (QueryAdjustmentLogResultAdjustmentLog) obj;
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
            ((this.tradeTime==null && other.getTradeTime()==null) || 
             (this.tradeTime!=null &&
              this.tradeTime.equals(other.getTradeTime()))) &&
            ((this.operatorID==null && other.getOperatorID()==null) || 
             (this.operatorID!=null &&
              this.operatorID.equals(other.getOperatorID()))) &&
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
            ((this.adjustmentItem==null && other.getAdjustmentItem()==null) || 
             (this.adjustmentItem!=null &&
              java.util.Arrays.equals(this.adjustmentItem, other.getAdjustmentItem())));
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
        if (getTradeTime() != null) {
            _hashCode += getTradeTime().hashCode();
        }
        if (getOperatorID() != null) {
            _hashCode += getOperatorID().hashCode();
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
        if (getAdjustmentItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdjustmentItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdjustmentItem(), i);
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
        new org.apache.axis.description.TypeDesc(QueryAdjustmentLogResultAdjustmentLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">QueryAdjustmentLogResult>AdjustmentLog"));
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
        elemField.setFieldName("adjustmentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AdjustmentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">>QueryAdjustmentLogResult>AdjustmentLog>AdjustmentItem"));
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
