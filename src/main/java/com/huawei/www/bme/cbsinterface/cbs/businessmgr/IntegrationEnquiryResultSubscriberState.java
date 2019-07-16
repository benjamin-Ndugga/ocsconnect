/**
 * IntegrationEnquiryResultSubscriberState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class IntegrationEnquiryResultSubscriberState  implements java.io.Serializable {
    private java.lang.String firstActiveDate;

    private java.lang.String activeCAC;

    private java.lang.String activeStop;

    private java.lang.String suspendStop;

    private java.lang.String disableStop;

    private java.lang.Integer lifeCycleState;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberStateDPFlag DPFlag;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberStateFraudState fraudState;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberStateLossFlag lossFlag;

    private java.lang.Integer POSUserState;

    private java.lang.Integer lockedFlag;

    private java.lang.String DPEndDate;

    private java.lang.Integer ETUFraudState;

    private java.lang.String lastCallTime;

    public IntegrationEnquiryResultSubscriberState() {
    }

    public IntegrationEnquiryResultSubscriberState(
           java.lang.String firstActiveDate,
           java.lang.String activeCAC,
           java.lang.String activeStop,
           java.lang.String suspendStop,
           java.lang.String disableStop,
           java.lang.Integer lifeCycleState,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberStateDPFlag DPFlag,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberStateFraudState fraudState,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberStateLossFlag lossFlag,
           java.lang.Integer POSUserState,
           java.lang.Integer lockedFlag,
           java.lang.String DPEndDate,
           java.lang.Integer ETUFraudState,
           java.lang.String lastCallTime) {
           this.firstActiveDate = firstActiveDate;
           this.activeCAC = activeCAC;
           this.activeStop = activeStop;
           this.suspendStop = suspendStop;
           this.disableStop = disableStop;
           this.lifeCycleState = lifeCycleState;
           this.DPFlag = DPFlag;
           this.fraudState = fraudState;
           this.lossFlag = lossFlag;
           this.POSUserState = POSUserState;
           this.lockedFlag = lockedFlag;
           this.DPEndDate = DPEndDate;
           this.ETUFraudState = ETUFraudState;
           this.lastCallTime = lastCallTime;
    }


    /**
     * Gets the firstActiveDate value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @return firstActiveDate
     */
    public java.lang.String getFirstActiveDate() {
        return firstActiveDate;
    }


    /**
     * Sets the firstActiveDate value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @param firstActiveDate
     */
    public void setFirstActiveDate(java.lang.String firstActiveDate) {
        this.firstActiveDate = firstActiveDate;
    }


    /**
     * Gets the activeCAC value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @return activeCAC
     */
    public java.lang.String getActiveCAC() {
        return activeCAC;
    }


    /**
     * Sets the activeCAC value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @param activeCAC
     */
    public void setActiveCAC(java.lang.String activeCAC) {
        this.activeCAC = activeCAC;
    }


    /**
     * Gets the activeStop value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @return activeStop
     */
    public java.lang.String getActiveStop() {
        return activeStop;
    }


    /**
     * Sets the activeStop value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @param activeStop
     */
    public void setActiveStop(java.lang.String activeStop) {
        this.activeStop = activeStop;
    }


    /**
     * Gets the suspendStop value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @return suspendStop
     */
    public java.lang.String getSuspendStop() {
        return suspendStop;
    }


    /**
     * Sets the suspendStop value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @param suspendStop
     */
    public void setSuspendStop(java.lang.String suspendStop) {
        this.suspendStop = suspendStop;
    }


    /**
     * Gets the disableStop value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @return disableStop
     */
    public java.lang.String getDisableStop() {
        return disableStop;
    }


    /**
     * Sets the disableStop value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @param disableStop
     */
    public void setDisableStop(java.lang.String disableStop) {
        this.disableStop = disableStop;
    }


    /**
     * Gets the lifeCycleState value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @return lifeCycleState
     */
    public java.lang.Integer getLifeCycleState() {
        return lifeCycleState;
    }


    /**
     * Sets the lifeCycleState value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @param lifeCycleState
     */
    public void setLifeCycleState(java.lang.Integer lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }


    /**
     * Gets the DPFlag value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @return DPFlag
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberStateDPFlag getDPFlag() {
        return DPFlag;
    }


    /**
     * Sets the DPFlag value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @param DPFlag
     */
    public void setDPFlag(com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberStateDPFlag DPFlag) {
        this.DPFlag = DPFlag;
    }


    /**
     * Gets the fraudState value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @return fraudState
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberStateFraudState getFraudState() {
        return fraudState;
    }


    /**
     * Sets the fraudState value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @param fraudState
     */
    public void setFraudState(com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberStateFraudState fraudState) {
        this.fraudState = fraudState;
    }


    /**
     * Gets the lossFlag value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @return lossFlag
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberStateLossFlag getLossFlag() {
        return lossFlag;
    }


    /**
     * Sets the lossFlag value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @param lossFlag
     */
    public void setLossFlag(com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberStateLossFlag lossFlag) {
        this.lossFlag = lossFlag;
    }


    /**
     * Gets the POSUserState value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @return POSUserState
     */
    public java.lang.Integer getPOSUserState() {
        return POSUserState;
    }


    /**
     * Sets the POSUserState value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @param POSUserState
     */
    public void setPOSUserState(java.lang.Integer POSUserState) {
        this.POSUserState = POSUserState;
    }


    /**
     * Gets the lockedFlag value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @return lockedFlag
     */
    public java.lang.Integer getLockedFlag() {
        return lockedFlag;
    }


    /**
     * Sets the lockedFlag value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @param lockedFlag
     */
    public void setLockedFlag(java.lang.Integer lockedFlag) {
        this.lockedFlag = lockedFlag;
    }


    /**
     * Gets the DPEndDate value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @return DPEndDate
     */
    public java.lang.String getDPEndDate() {
        return DPEndDate;
    }


    /**
     * Sets the DPEndDate value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @param DPEndDate
     */
    public void setDPEndDate(java.lang.String DPEndDate) {
        this.DPEndDate = DPEndDate;
    }


    /**
     * Gets the ETUFraudState value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @return ETUFraudState
     */
    public java.lang.Integer getETUFraudState() {
        return ETUFraudState;
    }


    /**
     * Sets the ETUFraudState value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @param ETUFraudState
     */
    public void setETUFraudState(java.lang.Integer ETUFraudState) {
        this.ETUFraudState = ETUFraudState;
    }


    /**
     * Gets the lastCallTime value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @return lastCallTime
     */
    public java.lang.String getLastCallTime() {
        return lastCallTime;
    }


    /**
     * Sets the lastCallTime value for this IntegrationEnquiryResultSubscriberState.
     * 
     * @param lastCallTime
     */
    public void setLastCallTime(java.lang.String lastCallTime) {
        this.lastCallTime = lastCallTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegrationEnquiryResultSubscriberState)) return false;
        IntegrationEnquiryResultSubscriberState other = (IntegrationEnquiryResultSubscriberState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.firstActiveDate==null && other.getFirstActiveDate()==null) || 
             (this.firstActiveDate!=null &&
              this.firstActiveDate.equals(other.getFirstActiveDate()))) &&
            ((this.activeCAC==null && other.getActiveCAC()==null) || 
             (this.activeCAC!=null &&
              this.activeCAC.equals(other.getActiveCAC()))) &&
            ((this.activeStop==null && other.getActiveStop()==null) || 
             (this.activeStop!=null &&
              this.activeStop.equals(other.getActiveStop()))) &&
            ((this.suspendStop==null && other.getSuspendStop()==null) || 
             (this.suspendStop!=null &&
              this.suspendStop.equals(other.getSuspendStop()))) &&
            ((this.disableStop==null && other.getDisableStop()==null) || 
             (this.disableStop!=null &&
              this.disableStop.equals(other.getDisableStop()))) &&
            ((this.lifeCycleState==null && other.getLifeCycleState()==null) || 
             (this.lifeCycleState!=null &&
              this.lifeCycleState.equals(other.getLifeCycleState()))) &&
            ((this.DPFlag==null && other.getDPFlag()==null) || 
             (this.DPFlag!=null &&
              this.DPFlag.equals(other.getDPFlag()))) &&
            ((this.fraudState==null && other.getFraudState()==null) || 
             (this.fraudState!=null &&
              this.fraudState.equals(other.getFraudState()))) &&
            ((this.lossFlag==null && other.getLossFlag()==null) || 
             (this.lossFlag!=null &&
              this.lossFlag.equals(other.getLossFlag()))) &&
            ((this.POSUserState==null && other.getPOSUserState()==null) || 
             (this.POSUserState!=null &&
              this.POSUserState.equals(other.getPOSUserState()))) &&
            ((this.lockedFlag==null && other.getLockedFlag()==null) || 
             (this.lockedFlag!=null &&
              this.lockedFlag.equals(other.getLockedFlag()))) &&
            ((this.DPEndDate==null && other.getDPEndDate()==null) || 
             (this.DPEndDate!=null &&
              this.DPEndDate.equals(other.getDPEndDate()))) &&
            ((this.ETUFraudState==null && other.getETUFraudState()==null) || 
             (this.ETUFraudState!=null &&
              this.ETUFraudState.equals(other.getETUFraudState()))) &&
            ((this.lastCallTime==null && other.getLastCallTime()==null) || 
             (this.lastCallTime!=null &&
              this.lastCallTime.equals(other.getLastCallTime())));
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
        if (getFirstActiveDate() != null) {
            _hashCode += getFirstActiveDate().hashCode();
        }
        if (getActiveCAC() != null) {
            _hashCode += getActiveCAC().hashCode();
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
        if (getLifeCycleState() != null) {
            _hashCode += getLifeCycleState().hashCode();
        }
        if (getDPFlag() != null) {
            _hashCode += getDPFlag().hashCode();
        }
        if (getFraudState() != null) {
            _hashCode += getFraudState().hashCode();
        }
        if (getLossFlag() != null) {
            _hashCode += getLossFlag().hashCode();
        }
        if (getPOSUserState() != null) {
            _hashCode += getPOSUserState().hashCode();
        }
        if (getLockedFlag() != null) {
            _hashCode += getLockedFlag().hashCode();
        }
        if (getDPEndDate() != null) {
            _hashCode += getDPEndDate().hashCode();
        }
        if (getETUFraudState() != null) {
            _hashCode += getETUFraudState().hashCode();
        }
        if (getLastCallTime() != null) {
            _hashCode += getLastCallTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntegrationEnquiryResultSubscriberState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">IntegrationEnquiryResult>SubscriberState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstActiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "FirstActiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeCAC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ActiveCAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ActiveStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SuspendStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "DisableStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeCycleState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "LifeCycleState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "DPFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>IntegrationEnquiryResult>SubscriberState>DPFlag"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "FraudState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>IntegrationEnquiryResult>SubscriberState>FraudState"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "LossFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>IntegrationEnquiryResult>SubscriberState>LossFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POSUserState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "POSUserState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockedFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "LockedFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "DPEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ETUFraudState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ETUFraudState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCallTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "LastCallTime"));
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
