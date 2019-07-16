/**
 * AdjustAccountResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class AdjustAccountResult  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] acctChgRec;

    private java.lang.String lifeCycleState;

    private java.lang.String activeStop;

    private java.lang.String suspendStop;

    private java.lang.String disableStop;

    public AdjustAccountResult() {
    }

    public AdjustAccountResult(
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] acctChgRec,
           java.lang.String lifeCycleState,
           java.lang.String activeStop,
           java.lang.String suspendStop,
           java.lang.String disableStop) {
           this.acctChgRec = acctChgRec;
           this.lifeCycleState = lifeCycleState;
           this.activeStop = activeStop;
           this.suspendStop = suspendStop;
           this.disableStop = disableStop;
    }


    /**
     * Gets the acctChgRec value for this AdjustAccountResult.
     * 
     * @return acctChgRec
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.AcctChgRecType[] getAcctChgRec() {
        return acctChgRec;
    }


    /**
     * Sets the acctChgRec value for this AdjustAccountResult.
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


    /**
     * Gets the lifeCycleState value for this AdjustAccountResult.
     * 
     * @return lifeCycleState
     */
    public java.lang.String getLifeCycleState() {
        return lifeCycleState;
    }


    /**
     * Sets the lifeCycleState value for this AdjustAccountResult.
     * 
     * @param lifeCycleState
     */
    public void setLifeCycleState(java.lang.String lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }


    /**
     * Gets the activeStop value for this AdjustAccountResult.
     * 
     * @return activeStop
     */
    public java.lang.String getActiveStop() {
        return activeStop;
    }


    /**
     * Sets the activeStop value for this AdjustAccountResult.
     * 
     * @param activeStop
     */
    public void setActiveStop(java.lang.String activeStop) {
        this.activeStop = activeStop;
    }


    /**
     * Gets the suspendStop value for this AdjustAccountResult.
     * 
     * @return suspendStop
     */
    public java.lang.String getSuspendStop() {
        return suspendStop;
    }


    /**
     * Sets the suspendStop value for this AdjustAccountResult.
     * 
     * @param suspendStop
     */
    public void setSuspendStop(java.lang.String suspendStop) {
        this.suspendStop = suspendStop;
    }


    /**
     * Gets the disableStop value for this AdjustAccountResult.
     * 
     * @return disableStop
     */
    public java.lang.String getDisableStop() {
        return disableStop;
    }


    /**
     * Sets the disableStop value for this AdjustAccountResult.
     * 
     * @param disableStop
     */
    public void setDisableStop(java.lang.String disableStop) {
        this.disableStop = disableStop;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdjustAccountResult)) return false;
        AdjustAccountResult other = (AdjustAccountResult) obj;
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
              java.util.Arrays.equals(this.acctChgRec, other.getAcctChgRec()))) &&
            ((this.lifeCycleState==null && other.getLifeCycleState()==null) || 
             (this.lifeCycleState!=null &&
              this.lifeCycleState.equals(other.getLifeCycleState()))) &&
            ((this.activeStop==null && other.getActiveStop()==null) || 
             (this.activeStop!=null &&
              this.activeStop.equals(other.getActiveStop()))) &&
            ((this.suspendStop==null && other.getSuspendStop()==null) || 
             (this.suspendStop!=null &&
              this.suspendStop.equals(other.getSuspendStop()))) &&
            ((this.disableStop==null && other.getDisableStop()==null) || 
             (this.disableStop!=null &&
              this.disableStop.equals(other.getDisableStop())));
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
        if (getLifeCycleState() != null) {
            _hashCode += getLifeCycleState().hashCode();
        }
        if (getActiveStop() != null) {
            _hashCode += getActiveStop().hashCode();
        }
        if (getSuspendStop() != null) {
            _hashCode += getSuspendStop().hashCode();
        }
        if (getDisableStop() != null) {
            _hashCode += getDisableStop().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdjustAccountResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AdjustAccountResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctChgRec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AcctChgRecType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeCycleState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LifeCycleState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ActiveStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SuspendStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "DisableStop"));
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
