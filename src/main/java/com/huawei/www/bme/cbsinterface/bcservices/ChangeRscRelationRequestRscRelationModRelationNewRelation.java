/**
 * ChangeRscRelationRequestRscRelationModRelationNewRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeRscRelationRequestRscRelationModRelationNewRelation  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    private java.lang.String shareRule;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationNewRelationShareLimit shareLimit;

    public ChangeRscRelationRequestRscRelationModRelationNewRelation() {
    }

    public ChangeRscRelationRequestRscRelationModRelationNewRelation(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           java.lang.String shareRule,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationNewRelationShareLimit shareLimit) {
           this.offeringKey = offeringKey;
           this.shareRule = shareRule;
           this.shareLimit = shareLimit;
    }


    /**
     * Gets the offeringKey value for this ChangeRscRelationRequestRscRelationModRelationNewRelation.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this ChangeRscRelationRequestRscRelationModRelationNewRelation.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the shareRule value for this ChangeRscRelationRequestRscRelationModRelationNewRelation.
     * 
     * @return shareRule
     */
    public java.lang.String getShareRule() {
        return shareRule;
    }


    /**
     * Sets the shareRule value for this ChangeRscRelationRequestRscRelationModRelationNewRelation.
     * 
     * @param shareRule
     */
    public void setShareRule(java.lang.String shareRule) {
        this.shareRule = shareRule;
    }


    /**
     * Gets the shareLimit value for this ChangeRscRelationRequestRscRelationModRelationNewRelation.
     * 
     * @return shareLimit
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationNewRelationShareLimit getShareLimit() {
        return shareLimit;
    }


    /**
     * Sets the shareLimit value for this ChangeRscRelationRequestRscRelationModRelationNewRelation.
     * 
     * @param shareLimit
     */
    public void setShareLimit(com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationNewRelationShareLimit shareLimit) {
        this.shareLimit = shareLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeRscRelationRequestRscRelationModRelationNewRelation)) return false;
        ChangeRscRelationRequestRscRelationModRelationNewRelation other = (ChangeRscRelationRequestRscRelationModRelationNewRelation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offeringKey==null && other.getOfferingKey()==null) || 
             (this.offeringKey!=null &&
              this.offeringKey.equals(other.getOfferingKey()))) &&
            ((this.shareRule==null && other.getShareRule()==null) || 
             (this.shareRule!=null &&
              this.shareRule.equals(other.getShareRule()))) &&
            ((this.shareLimit==null && other.getShareLimit()==null) || 
             (this.shareLimit!=null &&
              this.shareLimit.equals(other.getShareLimit())));
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
        if (getOfferingKey() != null) {
            _hashCode += getOfferingKey().hashCode();
        }
        if (getShareRule() != null) {
            _hashCode += getShareRule().hashCode();
        }
        if (getShareLimit() != null) {
            _hashCode += getShareLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeRscRelationRequestRscRelationModRelationNewRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeRscRelationRequest>RscRelation>ModRelation>NewRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("shareLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ShareLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>>ChangeRscRelationRequest>RscRelation>ModRelation>NewRelation>ShareLimit"));
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
