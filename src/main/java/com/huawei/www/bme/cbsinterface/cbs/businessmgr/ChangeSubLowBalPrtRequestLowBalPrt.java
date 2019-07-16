/**
 * ChangeSubLowBalPrtRequestLowBalPrt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ChangeSubLowBalPrtRequestLowBalPrt  implements java.io.Serializable {
    private int callLowBalType;

    private int balanceUpGate;

    private int balanceLowGate;

    private java.lang.Integer action;

    private java.lang.Integer messageID;

    private int operationType;

    public ChangeSubLowBalPrtRequestLowBalPrt() {
    }

    public ChangeSubLowBalPrtRequestLowBalPrt(
           int callLowBalType,
           int balanceUpGate,
           int balanceLowGate,
           java.lang.Integer action,
           java.lang.Integer messageID,
           int operationType) {
           this.callLowBalType = callLowBalType;
           this.balanceUpGate = balanceUpGate;
           this.balanceLowGate = balanceLowGate;
           this.action = action;
           this.messageID = messageID;
           this.operationType = operationType;
    }


    /**
     * Gets the callLowBalType value for this ChangeSubLowBalPrtRequestLowBalPrt.
     * 
     * @return callLowBalType
     */
    public int getCallLowBalType() {
        return callLowBalType;
    }


    /**
     * Sets the callLowBalType value for this ChangeSubLowBalPrtRequestLowBalPrt.
     * 
     * @param callLowBalType
     */
    public void setCallLowBalType(int callLowBalType) {
        this.callLowBalType = callLowBalType;
    }


    /**
     * Gets the balanceUpGate value for this ChangeSubLowBalPrtRequestLowBalPrt.
     * 
     * @return balanceUpGate
     */
    public int getBalanceUpGate() {
        return balanceUpGate;
    }


    /**
     * Sets the balanceUpGate value for this ChangeSubLowBalPrtRequestLowBalPrt.
     * 
     * @param balanceUpGate
     */
    public void setBalanceUpGate(int balanceUpGate) {
        this.balanceUpGate = balanceUpGate;
    }


    /**
     * Gets the balanceLowGate value for this ChangeSubLowBalPrtRequestLowBalPrt.
     * 
     * @return balanceLowGate
     */
    public int getBalanceLowGate() {
        return balanceLowGate;
    }


    /**
     * Sets the balanceLowGate value for this ChangeSubLowBalPrtRequestLowBalPrt.
     * 
     * @param balanceLowGate
     */
    public void setBalanceLowGate(int balanceLowGate) {
        this.balanceLowGate = balanceLowGate;
    }


    /**
     * Gets the action value for this ChangeSubLowBalPrtRequestLowBalPrt.
     * 
     * @return action
     */
    public java.lang.Integer getAction() {
        return action;
    }


    /**
     * Sets the action value for this ChangeSubLowBalPrtRequestLowBalPrt.
     * 
     * @param action
     */
    public void setAction(java.lang.Integer action) {
        this.action = action;
    }


    /**
     * Gets the messageID value for this ChangeSubLowBalPrtRequestLowBalPrt.
     * 
     * @return messageID
     */
    public java.lang.Integer getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this ChangeSubLowBalPrtRequestLowBalPrt.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.Integer messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the operationType value for this ChangeSubLowBalPrtRequestLowBalPrt.
     * 
     * @return operationType
     */
    public int getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this ChangeSubLowBalPrtRequestLowBalPrt.
     * 
     * @param operationType
     */
    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubLowBalPrtRequestLowBalPrt)) return false;
        ChangeSubLowBalPrtRequestLowBalPrt other = (ChangeSubLowBalPrtRequestLowBalPrt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.callLowBalType == other.getCallLowBalType() &&
            this.balanceUpGate == other.getBalanceUpGate() &&
            this.balanceLowGate == other.getBalanceLowGate() &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            this.operationType == other.getOperationType();
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
        _hashCode += getCallLowBalType();
        _hashCode += getBalanceUpGate();
        _hashCode += getBalanceLowGate();
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        _hashCode += getOperationType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubLowBalPrtRequestLowBalPrt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ChangeSubLowBalPrtRequest>LowBalPrt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callLowBalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CallLowBalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceUpGate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BalanceUpGate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceLowGate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BalanceLowGate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "MessageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OperationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
