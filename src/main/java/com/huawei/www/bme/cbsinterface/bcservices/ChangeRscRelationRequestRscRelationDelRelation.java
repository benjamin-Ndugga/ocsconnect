/**
 * ChangeRscRelationRequestRscRelationDelRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeRscRelationRequestRscRelationDelRelation  implements java.io.Serializable {
    private java.lang.String relationObjType;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationDelRelationRelationDestIdentify relationDestIdentify;

    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    private java.lang.String shareRule;

    private java.lang.String startTime;

    private java.lang.String endTime;

    public ChangeRscRelationRequestRscRelationDelRelation() {
    }

    public ChangeRscRelationRequestRscRelationDelRelation(
           java.lang.String relationObjType,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationDelRelationRelationDestIdentify relationDestIdentify,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           java.lang.String shareRule,
           java.lang.String startTime,
           java.lang.String endTime) {
           this.relationObjType = relationObjType;
           this.relationDestIdentify = relationDestIdentify;
           this.offeringKey = offeringKey;
           this.shareRule = shareRule;
           this.startTime = startTime;
           this.endTime = endTime;
    }


    /**
     * Gets the relationObjType value for this ChangeRscRelationRequestRscRelationDelRelation.
     * 
     * @return relationObjType
     */
    public java.lang.String getRelationObjType() {
        return relationObjType;
    }


    /**
     * Sets the relationObjType value for this ChangeRscRelationRequestRscRelationDelRelation.
     * 
     * @param relationObjType
     */
    public void setRelationObjType(java.lang.String relationObjType) {
        this.relationObjType = relationObjType;
    }


    /**
     * Gets the relationDestIdentify value for this ChangeRscRelationRequestRscRelationDelRelation.
     * 
     * @return relationDestIdentify
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationDelRelationRelationDestIdentify getRelationDestIdentify() {
        return relationDestIdentify;
    }


    /**
     * Sets the relationDestIdentify value for this ChangeRscRelationRequestRscRelationDelRelation.
     * 
     * @param relationDestIdentify
     */
    public void setRelationDestIdentify(com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationDelRelationRelationDestIdentify relationDestIdentify) {
        this.relationDestIdentify = relationDestIdentify;
    }


    /**
     * Gets the offeringKey value for this ChangeRscRelationRequestRscRelationDelRelation.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this ChangeRscRelationRequestRscRelationDelRelation.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the shareRule value for this ChangeRscRelationRequestRscRelationDelRelation.
     * 
     * @return shareRule
     */
    public java.lang.String getShareRule() {
        return shareRule;
    }


    /**
     * Sets the shareRule value for this ChangeRscRelationRequestRscRelationDelRelation.
     * 
     * @param shareRule
     */
    public void setShareRule(java.lang.String shareRule) {
        this.shareRule = shareRule;
    }


    /**
     * Gets the startTime value for this ChangeRscRelationRequestRscRelationDelRelation.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this ChangeRscRelationRequestRscRelationDelRelation.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this ChangeRscRelationRequestRscRelationDelRelation.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this ChangeRscRelationRequestRscRelationDelRelation.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeRscRelationRequestRscRelationDelRelation)) return false;
        ChangeRscRelationRequestRscRelationDelRelation other = (ChangeRscRelationRequestRscRelationDelRelation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.relationObjType==null && other.getRelationObjType()==null) || 
             (this.relationObjType!=null &&
              this.relationObjType.equals(other.getRelationObjType()))) &&
            ((this.relationDestIdentify==null && other.getRelationDestIdentify()==null) || 
             (this.relationDestIdentify!=null &&
              this.relationDestIdentify.equals(other.getRelationDestIdentify()))) &&
            ((this.offeringKey==null && other.getOfferingKey()==null) || 
             (this.offeringKey!=null &&
              this.offeringKey.equals(other.getOfferingKey()))) &&
            ((this.shareRule==null && other.getShareRule()==null) || 
             (this.shareRule!=null &&
              this.shareRule.equals(other.getShareRule()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime())));
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
        if (getRelationObjType() != null) {
            _hashCode += getRelationObjType().hashCode();
        }
        if (getRelationDestIdentify() != null) {
            _hashCode += getRelationDestIdentify().hashCode();
        }
        if (getOfferingKey() != null) {
            _hashCode += getOfferingKey().hashCode();
        }
        if (getShareRule() != null) {
            _hashCode += getShareRule().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeRscRelationRequestRscRelationDelRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeRscRelationRequest>RscRelation>DelRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationObjType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RelationObjType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationDestIdentify");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RelationDestIdentify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeRscRelationRequest>RscRelation>DelRelation>RelationDestIdentify"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shareRule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ShareRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EndTime"));
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
