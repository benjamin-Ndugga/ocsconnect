/**
 * ManSubCallScreenNoRequestCallScreenNoInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ManSubCallScreenNoRequestCallScreenNoInfo  implements java.io.Serializable {
    private java.lang.String callScreenNo;

    private java.lang.String effectiveDate;

    private java.lang.String expireDate;

    private java.lang.String weekStart;

    private java.lang.String weekStop;

    private java.lang.String routeNumber;

    private java.lang.Integer IRRouteFlag;

    private java.lang.Integer routingMethod;

    public ManSubCallScreenNoRequestCallScreenNoInfo() {
    }

    public ManSubCallScreenNoRequestCallScreenNoInfo(
           java.lang.String callScreenNo,
           java.lang.String effectiveDate,
           java.lang.String expireDate,
           java.lang.String weekStart,
           java.lang.String weekStop,
           java.lang.String routeNumber,
           java.lang.Integer IRRouteFlag,
           java.lang.Integer routingMethod) {
           this.callScreenNo = callScreenNo;
           this.effectiveDate = effectiveDate;
           this.expireDate = expireDate;
           this.weekStart = weekStart;
           this.weekStop = weekStop;
           this.routeNumber = routeNumber;
           this.IRRouteFlag = IRRouteFlag;
           this.routingMethod = routingMethod;
    }


    /**
     * Gets the callScreenNo value for this ManSubCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return callScreenNo
     */
    public java.lang.String getCallScreenNo() {
        return callScreenNo;
    }


    /**
     * Sets the callScreenNo value for this ManSubCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param callScreenNo
     */
    public void setCallScreenNo(java.lang.String callScreenNo) {
        this.callScreenNo = callScreenNo;
    }


    /**
     * Gets the effectiveDate value for this ManSubCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ManSubCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expireDate value for this ManSubCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this ManSubCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the weekStart value for this ManSubCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return weekStart
     */
    public java.lang.String getWeekStart() {
        return weekStart;
    }


    /**
     * Sets the weekStart value for this ManSubCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param weekStart
     */
    public void setWeekStart(java.lang.String weekStart) {
        this.weekStart = weekStart;
    }


    /**
     * Gets the weekStop value for this ManSubCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return weekStop
     */
    public java.lang.String getWeekStop() {
        return weekStop;
    }


    /**
     * Sets the weekStop value for this ManSubCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param weekStop
     */
    public void setWeekStop(java.lang.String weekStop) {
        this.weekStop = weekStop;
    }


    /**
     * Gets the routeNumber value for this ManSubCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return routeNumber
     */
    public java.lang.String getRouteNumber() {
        return routeNumber;
    }


    /**
     * Sets the routeNumber value for this ManSubCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param routeNumber
     */
    public void setRouteNumber(java.lang.String routeNumber) {
        this.routeNumber = routeNumber;
    }


    /**
     * Gets the IRRouteFlag value for this ManSubCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return IRRouteFlag
     */
    public java.lang.Integer getIRRouteFlag() {
        return IRRouteFlag;
    }


    /**
     * Sets the IRRouteFlag value for this ManSubCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param IRRouteFlag
     */
    public void setIRRouteFlag(java.lang.Integer IRRouteFlag) {
        this.IRRouteFlag = IRRouteFlag;
    }


    /**
     * Gets the routingMethod value for this ManSubCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return routingMethod
     */
    public java.lang.Integer getRoutingMethod() {
        return routingMethod;
    }


    /**
     * Sets the routingMethod value for this ManSubCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param routingMethod
     */
    public void setRoutingMethod(java.lang.Integer routingMethod) {
        this.routingMethod = routingMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManSubCallScreenNoRequestCallScreenNoInfo)) return false;
        ManSubCallScreenNoRequestCallScreenNoInfo other = (ManSubCallScreenNoRequestCallScreenNoInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.callScreenNo==null && other.getCallScreenNo()==null) || 
             (this.callScreenNo!=null &&
              this.callScreenNo.equals(other.getCallScreenNo()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.weekStart==null && other.getWeekStart()==null) || 
             (this.weekStart!=null &&
              this.weekStart.equals(other.getWeekStart()))) &&
            ((this.weekStop==null && other.getWeekStop()==null) || 
             (this.weekStop!=null &&
              this.weekStop.equals(other.getWeekStop()))) &&
            ((this.routeNumber==null && other.getRouteNumber()==null) || 
             (this.routeNumber!=null &&
              this.routeNumber.equals(other.getRouteNumber()))) &&
            ((this.IRRouteFlag==null && other.getIRRouteFlag()==null) || 
             (this.IRRouteFlag!=null &&
              this.IRRouteFlag.equals(other.getIRRouteFlag()))) &&
            ((this.routingMethod==null && other.getRoutingMethod()==null) || 
             (this.routingMethod!=null &&
              this.routingMethod.equals(other.getRoutingMethod())));
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
        if (getCallScreenNo() != null) {
            _hashCode += getCallScreenNo().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getWeekStart() != null) {
            _hashCode += getWeekStart().hashCode();
        }
        if (getWeekStop() != null) {
            _hashCode += getWeekStop().hashCode();
        }
        if (getRouteNumber() != null) {
            _hashCode += getRouteNumber().hashCode();
        }
        if (getIRRouteFlag() != null) {
            _hashCode += getIRRouteFlag().hashCode();
        }
        if (getRoutingMethod() != null) {
            _hashCode += getRoutingMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManSubCallScreenNoRequestCallScreenNoInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ManSubCallScreenNoRequest>CallScreenNoInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callScreenNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "callScreenNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weekStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "weekStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weekStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "weekStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "routeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IRRouteFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IRRouteFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "RoutingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
