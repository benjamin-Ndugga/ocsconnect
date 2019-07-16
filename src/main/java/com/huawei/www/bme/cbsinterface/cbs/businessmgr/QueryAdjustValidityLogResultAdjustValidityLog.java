/**
 * QueryAdjustValidityLogResultAdjustValidityLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryAdjustValidityLogResultAdjustValidityLog  implements java.io.Serializable {
    private java.lang.String tradeTime;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryAdjustValidityLogResultAdjustValidityLogModifyType modifyType;

    private int validityIncrement;

    private java.lang.String operatorID;

    private java.lang.String oldActiveStop;

    private java.lang.String newActiveStop;

    private java.lang.String oldSuspendStop;

    private java.lang.String newSuspendStop;

    private java.lang.String oldDisableStop;

    private java.lang.String newDisableStop;

    public QueryAdjustValidityLogResultAdjustValidityLog() {
    }

    public QueryAdjustValidityLogResultAdjustValidityLog(
           java.lang.String tradeTime,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryAdjustValidityLogResultAdjustValidityLogModifyType modifyType,
           int validityIncrement,
           java.lang.String operatorID,
           java.lang.String oldActiveStop,
           java.lang.String newActiveStop,
           java.lang.String oldSuspendStop,
           java.lang.String newSuspendStop,
           java.lang.String oldDisableStop,
           java.lang.String newDisableStop) {
           this.tradeTime = tradeTime;
           this.modifyType = modifyType;
           this.validityIncrement = validityIncrement;
           this.operatorID = operatorID;
           this.oldActiveStop = oldActiveStop;
           this.newActiveStop = newActiveStop;
           this.oldSuspendStop = oldSuspendStop;
           this.newSuspendStop = newSuspendStop;
           this.oldDisableStop = oldDisableStop;
           this.newDisableStop = newDisableStop;
    }


    /**
     * Gets the tradeTime value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @return tradeTime
     */
    public java.lang.String getTradeTime() {
        return tradeTime;
    }


    /**
     * Sets the tradeTime value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @param tradeTime
     */
    public void setTradeTime(java.lang.String tradeTime) {
        this.tradeTime = tradeTime;
    }


    /**
     * Gets the modifyType value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @return modifyType
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryAdjustValidityLogResultAdjustValidityLogModifyType getModifyType() {
        return modifyType;
    }


    /**
     * Sets the modifyType value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @param modifyType
     */
    public void setModifyType(com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryAdjustValidityLogResultAdjustValidityLogModifyType modifyType) {
        this.modifyType = modifyType;
    }


    /**
     * Gets the validityIncrement value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @return validityIncrement
     */
    public int getValidityIncrement() {
        return validityIncrement;
    }


    /**
     * Sets the validityIncrement value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @param validityIncrement
     */
    public void setValidityIncrement(int validityIncrement) {
        this.validityIncrement = validityIncrement;
    }


    /**
     * Gets the operatorID value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @return operatorID
     */
    public java.lang.String getOperatorID() {
        return operatorID;
    }


    /**
     * Sets the operatorID value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @param operatorID
     */
    public void setOperatorID(java.lang.String operatorID) {
        this.operatorID = operatorID;
    }


    /**
     * Gets the oldActiveStop value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @return oldActiveStop
     */
    public java.lang.String getOldActiveStop() {
        return oldActiveStop;
    }


    /**
     * Sets the oldActiveStop value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @param oldActiveStop
     */
    public void setOldActiveStop(java.lang.String oldActiveStop) {
        this.oldActiveStop = oldActiveStop;
    }


    /**
     * Gets the newActiveStop value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @return newActiveStop
     */
    public java.lang.String getNewActiveStop() {
        return newActiveStop;
    }


    /**
     * Sets the newActiveStop value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @param newActiveStop
     */
    public void setNewActiveStop(java.lang.String newActiveStop) {
        this.newActiveStop = newActiveStop;
    }


    /**
     * Gets the oldSuspendStop value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @return oldSuspendStop
     */
    public java.lang.String getOldSuspendStop() {
        return oldSuspendStop;
    }


    /**
     * Sets the oldSuspendStop value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @param oldSuspendStop
     */
    public void setOldSuspendStop(java.lang.String oldSuspendStop) {
        this.oldSuspendStop = oldSuspendStop;
    }


    /**
     * Gets the newSuspendStop value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @return newSuspendStop
     */
    public java.lang.String getNewSuspendStop() {
        return newSuspendStop;
    }


    /**
     * Sets the newSuspendStop value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @param newSuspendStop
     */
    public void setNewSuspendStop(java.lang.String newSuspendStop) {
        this.newSuspendStop = newSuspendStop;
    }


    /**
     * Gets the oldDisableStop value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @return oldDisableStop
     */
    public java.lang.String getOldDisableStop() {
        return oldDisableStop;
    }


    /**
     * Sets the oldDisableStop value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @param oldDisableStop
     */
    public void setOldDisableStop(java.lang.String oldDisableStop) {
        this.oldDisableStop = oldDisableStop;
    }


    /**
     * Gets the newDisableStop value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @return newDisableStop
     */
    public java.lang.String getNewDisableStop() {
        return newDisableStop;
    }


    /**
     * Sets the newDisableStop value for this QueryAdjustValidityLogResultAdjustValidityLog.
     * 
     * @param newDisableStop
     */
    public void setNewDisableStop(java.lang.String newDisableStop) {
        this.newDisableStop = newDisableStop;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryAdjustValidityLogResultAdjustValidityLog)) return false;
        QueryAdjustValidityLogResultAdjustValidityLog other = (QueryAdjustValidityLogResultAdjustValidityLog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tradeTime==null && other.getTradeTime()==null) || 
             (this.tradeTime!=null &&
              this.tradeTime.equals(other.getTradeTime()))) &&
            ((this.modifyType==null && other.getModifyType()==null) || 
             (this.modifyType!=null &&
              this.modifyType.equals(other.getModifyType()))) &&
            this.validityIncrement == other.getValidityIncrement() &&
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
        if (getTradeTime() != null) {
            _hashCode += getTradeTime().hashCode();
        }
        if (getModifyType() != null) {
            _hashCode += getModifyType().hashCode();
        }
        _hashCode += getValidityIncrement();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryAdjustValidityLogResultAdjustValidityLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryAdjustValidityLogResult>AdjustValidityLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "TradeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ModifyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>QueryAdjustValidityLogResult>AdjustValidityLog>ModifyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityIncrement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ValidityIncrement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OperatorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldActiveStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OldActiveStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newActiveStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewActiveStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldSuspendStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OldSuspendStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSuspendStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewSuspendStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldDisableStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OldDisableStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDisableStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewDisableStop"));
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
