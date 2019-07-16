/**
 * ChangeSubValidityResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubValidityResponse  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String activeEndDate;

    private java.lang.String barringEndDate;

    private java.lang.String suspendEndDate;

    private java.lang.Long mainBalance;

    private java.lang.String activationDate;

    public ChangeSubValidityResponse() {
    }

    public ChangeSubValidityResponse(
           java.lang.String status,
           java.lang.String activeEndDate,
           java.lang.String barringEndDate,
           java.lang.String suspendEndDate,
           java.lang.Long mainBalance,
           java.lang.String activationDate) {
           this.status = status;
           this.activeEndDate = activeEndDate;
           this.barringEndDate = barringEndDate;
           this.suspendEndDate = suspendEndDate;
           this.mainBalance = mainBalance;
           this.activationDate = activationDate;
    }


    /**
     * Gets the status value for this ChangeSubValidityResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ChangeSubValidityResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the activeEndDate value for this ChangeSubValidityResponse.
     * 
     * @return activeEndDate
     */
    public java.lang.String getActiveEndDate() {
        return activeEndDate;
    }


    /**
     * Sets the activeEndDate value for this ChangeSubValidityResponse.
     * 
     * @param activeEndDate
     */
    public void setActiveEndDate(java.lang.String activeEndDate) {
        this.activeEndDate = activeEndDate;
    }


    /**
     * Gets the barringEndDate value for this ChangeSubValidityResponse.
     * 
     * @return barringEndDate
     */
    public java.lang.String getBarringEndDate() {
        return barringEndDate;
    }


    /**
     * Sets the barringEndDate value for this ChangeSubValidityResponse.
     * 
     * @param barringEndDate
     */
    public void setBarringEndDate(java.lang.String barringEndDate) {
        this.barringEndDate = barringEndDate;
    }


    /**
     * Gets the suspendEndDate value for this ChangeSubValidityResponse.
     * 
     * @return suspendEndDate
     */
    public java.lang.String getSuspendEndDate() {
        return suspendEndDate;
    }


    /**
     * Sets the suspendEndDate value for this ChangeSubValidityResponse.
     * 
     * @param suspendEndDate
     */
    public void setSuspendEndDate(java.lang.String suspendEndDate) {
        this.suspendEndDate = suspendEndDate;
    }


    /**
     * Gets the mainBalance value for this ChangeSubValidityResponse.
     * 
     * @return mainBalance
     */
    public java.lang.Long getMainBalance() {
        return mainBalance;
    }


    /**
     * Sets the mainBalance value for this ChangeSubValidityResponse.
     * 
     * @param mainBalance
     */
    public void setMainBalance(java.lang.Long mainBalance) {
        this.mainBalance = mainBalance;
    }


    /**
     * Gets the activationDate value for this ChangeSubValidityResponse.
     * 
     * @return activationDate
     */
    public java.lang.String getActivationDate() {
        return activationDate;
    }


    /**
     * Sets the activationDate value for this ChangeSubValidityResponse.
     * 
     * @param activationDate
     */
    public void setActivationDate(java.lang.String activationDate) {
        this.activationDate = activationDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubValidityResponse)) return false;
        ChangeSubValidityResponse other = (ChangeSubValidityResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.activeEndDate==null && other.getActiveEndDate()==null) || 
             (this.activeEndDate!=null &&
              this.activeEndDate.equals(other.getActiveEndDate()))) &&
            ((this.barringEndDate==null && other.getBarringEndDate()==null) || 
             (this.barringEndDate!=null &&
              this.barringEndDate.equals(other.getBarringEndDate()))) &&
            ((this.suspendEndDate==null && other.getSuspendEndDate()==null) || 
             (this.suspendEndDate!=null &&
              this.suspendEndDate.equals(other.getSuspendEndDate()))) &&
            ((this.mainBalance==null && other.getMainBalance()==null) || 
             (this.mainBalance!=null &&
              this.mainBalance.equals(other.getMainBalance()))) &&
            ((this.activationDate==null && other.getActivationDate()==null) || 
             (this.activationDate!=null &&
              this.activationDate.equals(other.getActivationDate())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getActiveEndDate() != null) {
            _hashCode += getActiveEndDate().hashCode();
        }
        if (getBarringEndDate() != null) {
            _hashCode += getBarringEndDate().hashCode();
        }
        if (getSuspendEndDate() != null) {
            _hashCode += getSuspendEndDate().hashCode();
        }
        if (getMainBalance() != null) {
            _hashCode += getMainBalance().hashCode();
        }
        if (getActivationDate() != null) {
            _hashCode += getActivationDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubValidityResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeSubValidityResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ActiveEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barringEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BarringEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SuspendEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "MainBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ActivationDate"));
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
