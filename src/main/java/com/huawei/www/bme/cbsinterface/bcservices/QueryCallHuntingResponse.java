/**
 * QueryCallHuntingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryCallHuntingResponse  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode;

    private java.lang.String huntingNumber;

    private java.lang.String huntingMainNumber;

    private java.lang.String effectiveTime;

    private java.lang.String expireTime;

    private java.math.BigInteger priority;

    private java.lang.String userState;

    public QueryCallHuntingResponse() {
    }

    public QueryCallHuntingResponse(
           com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode,
           java.lang.String huntingNumber,
           java.lang.String huntingMainNumber,
           java.lang.String effectiveTime,
           java.lang.String expireTime,
           java.math.BigInteger priority,
           java.lang.String userState) {
           this.subGroupAccessCode = subGroupAccessCode;
           this.huntingNumber = huntingNumber;
           this.huntingMainNumber = huntingMainNumber;
           this.effectiveTime = effectiveTime;
           this.expireTime = expireTime;
           this.priority = priority;
           this.userState = userState;
    }


    /**
     * Gets the subGroupAccessCode value for this QueryCallHuntingResponse.
     * 
     * @return subGroupAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode getSubGroupAccessCode() {
        return subGroupAccessCode;
    }


    /**
     * Sets the subGroupAccessCode value for this QueryCallHuntingResponse.
     * 
     * @param subGroupAccessCode
     */
    public void setSubGroupAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCode) {
        this.subGroupAccessCode = subGroupAccessCode;
    }


    /**
     * Gets the huntingNumber value for this QueryCallHuntingResponse.
     * 
     * @return huntingNumber
     */
    public java.lang.String getHuntingNumber() {
        return huntingNumber;
    }


    /**
     * Sets the huntingNumber value for this QueryCallHuntingResponse.
     * 
     * @param huntingNumber
     */
    public void setHuntingNumber(java.lang.String huntingNumber) {
        this.huntingNumber = huntingNumber;
    }


    /**
     * Gets the huntingMainNumber value for this QueryCallHuntingResponse.
     * 
     * @return huntingMainNumber
     */
    public java.lang.String getHuntingMainNumber() {
        return huntingMainNumber;
    }


    /**
     * Sets the huntingMainNumber value for this QueryCallHuntingResponse.
     * 
     * @param huntingMainNumber
     */
    public void setHuntingMainNumber(java.lang.String huntingMainNumber) {
        this.huntingMainNumber = huntingMainNumber;
    }


    /**
     * Gets the effectiveTime value for this QueryCallHuntingResponse.
     * 
     * @return effectiveTime
     */
    public java.lang.String getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this QueryCallHuntingResponse.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(java.lang.String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the expireTime value for this QueryCallHuntingResponse.
     * 
     * @return expireTime
     */
    public java.lang.String getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the expireTime value for this QueryCallHuntingResponse.
     * 
     * @param expireTime
     */
    public void setExpireTime(java.lang.String expireTime) {
        this.expireTime = expireTime;
    }


    /**
     * Gets the priority value for this QueryCallHuntingResponse.
     * 
     * @return priority
     */
    public java.math.BigInteger getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this QueryCallHuntingResponse.
     * 
     * @param priority
     */
    public void setPriority(java.math.BigInteger priority) {
        this.priority = priority;
    }


    /**
     * Gets the userState value for this QueryCallHuntingResponse.
     * 
     * @return userState
     */
    public java.lang.String getUserState() {
        return userState;
    }


    /**
     * Sets the userState value for this QueryCallHuntingResponse.
     * 
     * @param userState
     */
    public void setUserState(java.lang.String userState) {
        this.userState = userState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCallHuntingResponse)) return false;
        QueryCallHuntingResponse other = (QueryCallHuntingResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subGroupAccessCode==null && other.getSubGroupAccessCode()==null) || 
             (this.subGroupAccessCode!=null &&
              this.subGroupAccessCode.equals(other.getSubGroupAccessCode()))) &&
            ((this.huntingNumber==null && other.getHuntingNumber()==null) || 
             (this.huntingNumber!=null &&
              this.huntingNumber.equals(other.getHuntingNumber()))) &&
            ((this.huntingMainNumber==null && other.getHuntingMainNumber()==null) || 
             (this.huntingMainNumber!=null &&
              this.huntingMainNumber.equals(other.getHuntingMainNumber()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime()))) &&
            ((this.expireTime==null && other.getExpireTime()==null) || 
             (this.expireTime!=null &&
              this.expireTime.equals(other.getExpireTime()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.userState==null && other.getUserState()==null) || 
             (this.userState!=null &&
              this.userState.equals(other.getUserState())));
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
        if (getSubGroupAccessCode() != null) {
            _hashCode += getSubGroupAccessCode().hashCode();
        }
        if (getHuntingNumber() != null) {
            _hashCode += getHuntingNumber().hashCode();
        }
        if (getHuntingMainNumber() != null) {
            _hashCode += getHuntingMainNumber().hashCode();
        }
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        if (getExpireTime() != null) {
            _hashCode += getExpireTime().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getUserState() != null) {
            _hashCode += getUserState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCallHuntingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryCallHuntingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGroupAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huntingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "HuntingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huntingMainNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "HuntingMainNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpireTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UserState"));
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
