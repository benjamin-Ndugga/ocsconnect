/**
 * SubDeactivationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class SubDeactivationResult  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultAcctBalance acctBalance;

    private java.lang.String activationDate;

    private java.lang.String language;

    private java.lang.String primaryOfferingID;

    private java.lang.String activeEndDate;

    private java.lang.String barringEndDate;

    private java.math.BigInteger suspendDays;

    private java.lang.String poolDays;

    private java.lang.String status;

    public SubDeactivationResult() {
    }

    public SubDeactivationResult(
           com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultAcctBalance acctBalance,
           java.lang.String activationDate,
           java.lang.String language,
           java.lang.String primaryOfferingID,
           java.lang.String activeEndDate,
           java.lang.String barringEndDate,
           java.math.BigInteger suspendDays,
           java.lang.String poolDays,
           java.lang.String status) {
           this.acctBalance = acctBalance;
           this.activationDate = activationDate;
           this.language = language;
           this.primaryOfferingID = primaryOfferingID;
           this.activeEndDate = activeEndDate;
           this.barringEndDate = barringEndDate;
           this.suspendDays = suspendDays;
           this.poolDays = poolDays;
           this.status = status;
    }


    /**
     * Gets the acctBalance value for this SubDeactivationResult.
     * 
     * @return acctBalance
     */
    public com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultAcctBalance getAcctBalance() {
        return acctBalance;
    }


    /**
     * Sets the acctBalance value for this SubDeactivationResult.
     * 
     * @param acctBalance
     */
    public void setAcctBalance(com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultAcctBalance acctBalance) {
        this.acctBalance = acctBalance;
    }


    /**
     * Gets the activationDate value for this SubDeactivationResult.
     * 
     * @return activationDate
     */
    public java.lang.String getActivationDate() {
        return activationDate;
    }


    /**
     * Sets the activationDate value for this SubDeactivationResult.
     * 
     * @param activationDate
     */
    public void setActivationDate(java.lang.String activationDate) {
        this.activationDate = activationDate;
    }


    /**
     * Gets the language value for this SubDeactivationResult.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this SubDeactivationResult.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the primaryOfferingID value for this SubDeactivationResult.
     * 
     * @return primaryOfferingID
     */
    public java.lang.String getPrimaryOfferingID() {
        return primaryOfferingID;
    }


    /**
     * Sets the primaryOfferingID value for this SubDeactivationResult.
     * 
     * @param primaryOfferingID
     */
    public void setPrimaryOfferingID(java.lang.String primaryOfferingID) {
        this.primaryOfferingID = primaryOfferingID;
    }


    /**
     * Gets the activeEndDate value for this SubDeactivationResult.
     * 
     * @return activeEndDate
     */
    public java.lang.String getActiveEndDate() {
        return activeEndDate;
    }


    /**
     * Sets the activeEndDate value for this SubDeactivationResult.
     * 
     * @param activeEndDate
     */
    public void setActiveEndDate(java.lang.String activeEndDate) {
        this.activeEndDate = activeEndDate;
    }


    /**
     * Gets the barringEndDate value for this SubDeactivationResult.
     * 
     * @return barringEndDate
     */
    public java.lang.String getBarringEndDate() {
        return barringEndDate;
    }


    /**
     * Sets the barringEndDate value for this SubDeactivationResult.
     * 
     * @param barringEndDate
     */
    public void setBarringEndDate(java.lang.String barringEndDate) {
        this.barringEndDate = barringEndDate;
    }


    /**
     * Gets the suspendDays value for this SubDeactivationResult.
     * 
     * @return suspendDays
     */
    public java.math.BigInteger getSuspendDays() {
        return suspendDays;
    }


    /**
     * Sets the suspendDays value for this SubDeactivationResult.
     * 
     * @param suspendDays
     */
    public void setSuspendDays(java.math.BigInteger suspendDays) {
        this.suspendDays = suspendDays;
    }


    /**
     * Gets the poolDays value for this SubDeactivationResult.
     * 
     * @return poolDays
     */
    public java.lang.String getPoolDays() {
        return poolDays;
    }


    /**
     * Sets the poolDays value for this SubDeactivationResult.
     * 
     * @param poolDays
     */
    public void setPoolDays(java.lang.String poolDays) {
        this.poolDays = poolDays;
    }


    /**
     * Gets the status value for this SubDeactivationResult.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SubDeactivationResult.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubDeactivationResult)) return false;
        SubDeactivationResult other = (SubDeactivationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctBalance==null && other.getAcctBalance()==null) || 
             (this.acctBalance!=null &&
              this.acctBalance.equals(other.getAcctBalance()))) &&
            ((this.activationDate==null && other.getActivationDate()==null) || 
             (this.activationDate!=null &&
              this.activationDate.equals(other.getActivationDate()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.primaryOfferingID==null && other.getPrimaryOfferingID()==null) || 
             (this.primaryOfferingID!=null &&
              this.primaryOfferingID.equals(other.getPrimaryOfferingID()))) &&
            ((this.activeEndDate==null && other.getActiveEndDate()==null) || 
             (this.activeEndDate!=null &&
              this.activeEndDate.equals(other.getActiveEndDate()))) &&
            ((this.barringEndDate==null && other.getBarringEndDate()==null) || 
             (this.barringEndDate!=null &&
              this.barringEndDate.equals(other.getBarringEndDate()))) &&
            ((this.suspendDays==null && other.getSuspendDays()==null) || 
             (this.suspendDays!=null &&
              this.suspendDays.equals(other.getSuspendDays()))) &&
            ((this.poolDays==null && other.getPoolDays()==null) || 
             (this.poolDays!=null &&
              this.poolDays.equals(other.getPoolDays()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getAcctBalance() != null) {
            _hashCode += getAcctBalance().hashCode();
        }
        if (getActivationDate() != null) {
            _hashCode += getActivationDate().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getPrimaryOfferingID() != null) {
            _hashCode += getPrimaryOfferingID().hashCode();
        }
        if (getActiveEndDate() != null) {
            _hashCode += getActiveEndDate().hashCode();
        }
        if (getBarringEndDate() != null) {
            _hashCode += getBarringEndDate().hashCode();
        }
        if (getSuspendDays() != null) {
            _hashCode += getSuspendDays().hashCode();
        }
        if (getPoolDays() != null) {
            _hashCode += getPoolDays().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubDeactivationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubDeactivationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AcctBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">SubDeactivationResult>AcctBalance"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryOfferingID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrimaryOfferingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ActiveEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barringEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BarringEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SuspendDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poolDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PoolDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Status"));
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
