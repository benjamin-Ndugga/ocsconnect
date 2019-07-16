/**
 * QuerySubInforToMicroResultSubscriber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QuerySubInforToMicroResultSubscriber  implements java.io.Serializable {
    /* Subscriber type：
     * 0:Prepaid  
     * 1:Postpaid  
     * 2:Hybrid. */
    private java.lang.String subType;

    /* 2003	en_WW	English (Global)
     * 2052	ru_RU	Russian (Russia)
     * 2058	az_AZ	Azerbaijani */
    private java.lang.String language;

    /* Subscriber status：
     * 1:Idle  
     * 2:Active  
     * 3:Baring (B1W)  
     * 4:Suspended (B2W)  
     * 5:Pre-deactivate  
     * 9:Deactive. */
    private java.lang.String subStatus;

    /* Format is YYYYMMDD24hhmmss. */
    private java.lang.String effectiveDate;

    private java.lang.String managementStatus;

    private java.lang.String blacklistStatus;

    public QuerySubInforToMicroResultSubscriber() {
    }

    public QuerySubInforToMicroResultSubscriber(
           java.lang.String subType,
           java.lang.String language,
           java.lang.String subStatus,
           java.lang.String effectiveDate,
           java.lang.String managementStatus,
           java.lang.String blacklistStatus) {
           this.subType = subType;
           this.language = language;
           this.subStatus = subStatus;
           this.effectiveDate = effectiveDate;
           this.managementStatus = managementStatus;
           this.blacklistStatus = blacklistStatus;
    }


    /**
     * Gets the subType value for this QuerySubInforToMicroResultSubscriber.
     * 
     * @return subType   * Subscriber type：
     * 0:Prepaid  
     * 1:Postpaid  
     * 2:Hybrid.
     */
    public java.lang.String getSubType() {
        return subType;
    }


    /**
     * Sets the subType value for this QuerySubInforToMicroResultSubscriber.
     * 
     * @param subType   * Subscriber type：
     * 0:Prepaid  
     * 1:Postpaid  
     * 2:Hybrid.
     */
    public void setSubType(java.lang.String subType) {
        this.subType = subType;
    }


    /**
     * Gets the language value for this QuerySubInforToMicroResultSubscriber.
     * 
     * @return language   * 2003	en_WW	English (Global)
     * 2052	ru_RU	Russian (Russia)
     * 2058	az_AZ	Azerbaijani
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this QuerySubInforToMicroResultSubscriber.
     * 
     * @param language   * 2003	en_WW	English (Global)
     * 2052	ru_RU	Russian (Russia)
     * 2058	az_AZ	Azerbaijani
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the subStatus value for this QuerySubInforToMicroResultSubscriber.
     * 
     * @return subStatus   * Subscriber status：
     * 1:Idle  
     * 2:Active  
     * 3:Baring (B1W)  
     * 4:Suspended (B2W)  
     * 5:Pre-deactivate  
     * 9:Deactive.
     */
    public java.lang.String getSubStatus() {
        return subStatus;
    }


    /**
     * Sets the subStatus value for this QuerySubInforToMicroResultSubscriber.
     * 
     * @param subStatus   * Subscriber status：
     * 1:Idle  
     * 2:Active  
     * 3:Baring (B1W)  
     * 4:Suspended (B2W)  
     * 5:Pre-deactivate  
     * 9:Deactive.
     */
    public void setSubStatus(java.lang.String subStatus) {
        this.subStatus = subStatus;
    }


    /**
     * Gets the effectiveDate value for this QuerySubInforToMicroResultSubscriber.
     * 
     * @return effectiveDate   * Format is YYYYMMDD24hhmmss.
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this QuerySubInforToMicroResultSubscriber.
     * 
     * @param effectiveDate   * Format is YYYYMMDD24hhmmss.
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the managementStatus value for this QuerySubInforToMicroResultSubscriber.
     * 
     * @return managementStatus
     */
    public java.lang.String getManagementStatus() {
        return managementStatus;
    }


    /**
     * Sets the managementStatus value for this QuerySubInforToMicroResultSubscriber.
     * 
     * @param managementStatus
     */
    public void setManagementStatus(java.lang.String managementStatus) {
        this.managementStatus = managementStatus;
    }


    /**
     * Gets the blacklistStatus value for this QuerySubInforToMicroResultSubscriber.
     * 
     * @return blacklistStatus
     */
    public java.lang.String getBlacklistStatus() {
        return blacklistStatus;
    }


    /**
     * Sets the blacklistStatus value for this QuerySubInforToMicroResultSubscriber.
     * 
     * @param blacklistStatus
     */
    public void setBlacklistStatus(java.lang.String blacklistStatus) {
        this.blacklistStatus = blacklistStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubInforToMicroResultSubscriber)) return false;
        QuerySubInforToMicroResultSubscriber other = (QuerySubInforToMicroResultSubscriber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subType==null && other.getSubType()==null) || 
             (this.subType!=null &&
              this.subType.equals(other.getSubType()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.subStatus==null && other.getSubStatus()==null) || 
             (this.subStatus!=null &&
              this.subStatus.equals(other.getSubStatus()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.managementStatus==null && other.getManagementStatus()==null) || 
             (this.managementStatus!=null &&
              this.managementStatus.equals(other.getManagementStatus()))) &&
            ((this.blacklistStatus==null && other.getBlacklistStatus()==null) || 
             (this.blacklistStatus!=null &&
              this.blacklistStatus.equals(other.getBlacklistStatus())));
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
        if (getSubType() != null) {
            _hashCode += getSubType().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getSubStatus() != null) {
            _hashCode += getSubStatus().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getManagementStatus() != null) {
            _hashCode += getManagementStatus().hashCode();
        }
        if (getBlacklistStatus() != null) {
            _hashCode += getBlacklistStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySubInforToMicroResultSubscriber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QuerySubInforToMicroResult>Subscriber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("managementStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ManagementStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blacklistStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BlacklistStatus"));
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
