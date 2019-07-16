/**
 * QuerySubLowBalPrtResultSubLowBalPrt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QuerySubLowBalPrtResultSubLowBalPrt  implements java.io.Serializable {
    private java.lang.Integer callLowBalType;

    private java.lang.Integer balanceUpGate;

    private java.lang.Integer balanceLowGate;

    private java.lang.Integer action;

    private java.lang.Integer messageID;

    public QuerySubLowBalPrtResultSubLowBalPrt() {
    }

    public QuerySubLowBalPrtResultSubLowBalPrt(
           java.lang.Integer callLowBalType,
           java.lang.Integer balanceUpGate,
           java.lang.Integer balanceLowGate,
           java.lang.Integer action,
           java.lang.Integer messageID) {
           this.callLowBalType = callLowBalType;
           this.balanceUpGate = balanceUpGate;
           this.balanceLowGate = balanceLowGate;
           this.action = action;
           this.messageID = messageID;
    }


    /**
     * Gets the callLowBalType value for this QuerySubLowBalPrtResultSubLowBalPrt.
     * 
     * @return callLowBalType
     */
    public java.lang.Integer getCallLowBalType() {
        return callLowBalType;
    }


    /**
     * Sets the callLowBalType value for this QuerySubLowBalPrtResultSubLowBalPrt.
     * 
     * @param callLowBalType
     */
    public void setCallLowBalType(java.lang.Integer callLowBalType) {
        this.callLowBalType = callLowBalType;
    }


    /**
     * Gets the balanceUpGate value for this QuerySubLowBalPrtResultSubLowBalPrt.
     * 
     * @return balanceUpGate
     */
    public java.lang.Integer getBalanceUpGate() {
        return balanceUpGate;
    }


    /**
     * Sets the balanceUpGate value for this QuerySubLowBalPrtResultSubLowBalPrt.
     * 
     * @param balanceUpGate
     */
    public void setBalanceUpGate(java.lang.Integer balanceUpGate) {
        this.balanceUpGate = balanceUpGate;
    }


    /**
     * Gets the balanceLowGate value for this QuerySubLowBalPrtResultSubLowBalPrt.
     * 
     * @return balanceLowGate
     */
    public java.lang.Integer getBalanceLowGate() {
        return balanceLowGate;
    }


    /**
     * Sets the balanceLowGate value for this QuerySubLowBalPrtResultSubLowBalPrt.
     * 
     * @param balanceLowGate
     */
    public void setBalanceLowGate(java.lang.Integer balanceLowGate) {
        this.balanceLowGate = balanceLowGate;
    }


    /**
     * Gets the action value for this QuerySubLowBalPrtResultSubLowBalPrt.
     * 
     * @return action
     */
    public java.lang.Integer getAction() {
        return action;
    }


    /**
     * Sets the action value for this QuerySubLowBalPrtResultSubLowBalPrt.
     * 
     * @param action
     */
    public void setAction(java.lang.Integer action) {
        this.action = action;
    }


    /**
     * Gets the messageID value for this QuerySubLowBalPrtResultSubLowBalPrt.
     * 
     * @return messageID
     */
    public java.lang.Integer getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this QuerySubLowBalPrtResultSubLowBalPrt.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.Integer messageID) {
        this.messageID = messageID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubLowBalPrtResultSubLowBalPrt)) return false;
        QuerySubLowBalPrtResultSubLowBalPrt other = (QuerySubLowBalPrtResultSubLowBalPrt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.callLowBalType==null && other.getCallLowBalType()==null) || 
             (this.callLowBalType!=null &&
              this.callLowBalType.equals(other.getCallLowBalType()))) &&
            ((this.balanceUpGate==null && other.getBalanceUpGate()==null) || 
             (this.balanceUpGate!=null &&
              this.balanceUpGate.equals(other.getBalanceUpGate()))) &&
            ((this.balanceLowGate==null && other.getBalanceLowGate()==null) || 
             (this.balanceLowGate!=null &&
              this.balanceLowGate.equals(other.getBalanceLowGate()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID())));
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
        if (getCallLowBalType() != null) {
            _hashCode += getCallLowBalType().hashCode();
        }
        if (getBalanceUpGate() != null) {
            _hashCode += getBalanceUpGate().hashCode();
        }
        if (getBalanceLowGate() != null) {
            _hashCode += getBalanceLowGate().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySubLowBalPrtResultSubLowBalPrt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QuerySubLowBalPrtResult>SubLowBalPrt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callLowBalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CallLowBalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceUpGate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BalanceUpGate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceLowGate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BalanceLowGate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "MessageID"));
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
