/**
 * ManageGrpCallScreenNoRequestCallScreenNoInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ManageGrpCallScreenNoRequestCallScreenNoInfo  implements java.io.Serializable {
    private java.lang.String callScreenNo;

    private java.math.BigInteger screenNoType;

    private java.lang.String effectiveDate;

    private java.lang.String expireDate;

    private java.math.BigInteger weekStart;

    private java.math.BigInteger weekStop;

    private java.lang.String timeStart;

    private java.lang.String timeStop;

    private java.lang.String routeNumber;

    private java.math.BigInteger routingMethod;

    public ManageGrpCallScreenNoRequestCallScreenNoInfo() {
    }

    public ManageGrpCallScreenNoRequestCallScreenNoInfo(
           java.lang.String callScreenNo,
           java.math.BigInteger screenNoType,
           java.lang.String effectiveDate,
           java.lang.String expireDate,
           java.math.BigInteger weekStart,
           java.math.BigInteger weekStop,
           java.lang.String timeStart,
           java.lang.String timeStop,
           java.lang.String routeNumber,
           java.math.BigInteger routingMethod) {
           this.callScreenNo = callScreenNo;
           this.screenNoType = screenNoType;
           this.effectiveDate = effectiveDate;
           this.expireDate = expireDate;
           this.weekStart = weekStart;
           this.weekStop = weekStop;
           this.timeStart = timeStart;
           this.timeStop = timeStop;
           this.routeNumber = routeNumber;
           this.routingMethod = routingMethod;
    }


    /**
     * Gets the callScreenNo value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return callScreenNo
     */
    public java.lang.String getCallScreenNo() {
        return callScreenNo;
    }


    /**
     * Sets the callScreenNo value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param callScreenNo
     */
    public void setCallScreenNo(java.lang.String callScreenNo) {
        this.callScreenNo = callScreenNo;
    }


    /**
     * Gets the screenNoType value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return screenNoType
     */
    public java.math.BigInteger getScreenNoType() {
        return screenNoType;
    }


    /**
     * Sets the screenNoType value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param screenNoType
     */
    public void setScreenNoType(java.math.BigInteger screenNoType) {
        this.screenNoType = screenNoType;
    }


    /**
     * Gets the effectiveDate value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expireDate value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the weekStart value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return weekStart
     */
    public java.math.BigInteger getWeekStart() {
        return weekStart;
    }


    /**
     * Sets the weekStart value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param weekStart
     */
    public void setWeekStart(java.math.BigInteger weekStart) {
        this.weekStart = weekStart;
    }


    /**
     * Gets the weekStop value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return weekStop
     */
    public java.math.BigInteger getWeekStop() {
        return weekStop;
    }


    /**
     * Sets the weekStop value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param weekStop
     */
    public void setWeekStop(java.math.BigInteger weekStop) {
        this.weekStop = weekStop;
    }


    /**
     * Gets the timeStart value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return timeStart
     */
    public java.lang.String getTimeStart() {
        return timeStart;
    }


    /**
     * Sets the timeStart value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param timeStart
     */
    public void setTimeStart(java.lang.String timeStart) {
        this.timeStart = timeStart;
    }


    /**
     * Gets the timeStop value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return timeStop
     */
    public java.lang.String getTimeStop() {
        return timeStop;
    }


    /**
     * Sets the timeStop value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param timeStop
     */
    public void setTimeStop(java.lang.String timeStop) {
        this.timeStop = timeStop;
    }


    /**
     * Gets the routeNumber value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return routeNumber
     */
    public java.lang.String getRouteNumber() {
        return routeNumber;
    }


    /**
     * Sets the routeNumber value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param routeNumber
     */
    public void setRouteNumber(java.lang.String routeNumber) {
        this.routeNumber = routeNumber;
    }


    /**
     * Gets the routingMethod value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @return routingMethod
     */
    public java.math.BigInteger getRoutingMethod() {
        return routingMethod;
    }


    /**
     * Sets the routingMethod value for this ManageGrpCallScreenNoRequestCallScreenNoInfo.
     * 
     * @param routingMethod
     */
    public void setRoutingMethod(java.math.BigInteger routingMethod) {
        this.routingMethod = routingMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageGrpCallScreenNoRequestCallScreenNoInfo)) return false;
        ManageGrpCallScreenNoRequestCallScreenNoInfo other = (ManageGrpCallScreenNoRequestCallScreenNoInfo) obj;
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
            ((this.screenNoType==null && other.getScreenNoType()==null) || 
             (this.screenNoType!=null &&
              this.screenNoType.equals(other.getScreenNoType()))) &&
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
            ((this.timeStart==null && other.getTimeStart()==null) || 
             (this.timeStart!=null &&
              this.timeStart.equals(other.getTimeStart()))) &&
            ((this.timeStop==null && other.getTimeStop()==null) || 
             (this.timeStop!=null &&
              this.timeStop.equals(other.getTimeStop()))) &&
            ((this.routeNumber==null && other.getRouteNumber()==null) || 
             (this.routeNumber!=null &&
              this.routeNumber.equals(other.getRouteNumber()))) &&
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
        if (getScreenNoType() != null) {
            _hashCode += getScreenNoType().hashCode();
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
        if (getTimeStart() != null) {
            _hashCode += getTimeStart().hashCode();
        }
        if (getTimeStop() != null) {
            _hashCode += getTimeStop().hashCode();
        }
        if (getRouteNumber() != null) {
            _hashCode += getRouteNumber().hashCode();
        }
        if (getRoutingMethod() != null) {
            _hashCode += getRoutingMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageGrpCallScreenNoRequestCallScreenNoInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ManageGrpCallScreenNoRequest>CallScreenNoInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callScreenNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CallScreenNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screenNoType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ScreenNoType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weekStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "WeekStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weekStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "WeekStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "TimeStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "TimeStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RouteNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RoutingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
