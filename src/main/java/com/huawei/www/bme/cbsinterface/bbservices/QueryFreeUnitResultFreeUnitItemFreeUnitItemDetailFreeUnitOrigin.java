/**
 * QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin  implements java.io.Serializable {
    private java.lang.String originType;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOriginOfferingKey offeringKey;

    private java.lang.Long planID;

    public QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin() {
    }

    public QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin(
           java.lang.String originType,
           com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOriginOfferingKey offeringKey,
           java.lang.Long planID) {
           this.originType = originType;
           this.offeringKey = offeringKey;
           this.planID = planID;
    }


    /**
     * Gets the originType value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin.
     * 
     * @return originType
     */
    public java.lang.String getOriginType() {
        return originType;
    }


    /**
     * Sets the originType value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin.
     * 
     * @param originType
     */
    public void setOriginType(java.lang.String originType) {
        this.originType = originType;
    }


    /**
     * Gets the offeringKey value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOriginOfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOriginOfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the planID value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin.
     * 
     * @return planID
     */
    public java.lang.Long getPlanID() {
        return planID;
    }


    /**
     * Sets the planID value for this QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin.
     * 
     * @param planID
     */
    public void setPlanID(java.lang.Long planID) {
        this.planID = planID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin)) return false;
        QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin other = (QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originType==null && other.getOriginType()==null) || 
             (this.originType!=null &&
              this.originType.equals(other.getOriginType()))) &&
            ((this.offeringKey==null && other.getOfferingKey()==null) || 
             (this.offeringKey!=null &&
              this.offeringKey.equals(other.getOfferingKey()))) &&
            ((this.planID==null && other.getPlanID()==null) || 
             (this.planID!=null &&
              this.planID.equals(other.getPlanID())));
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
        if (getOriginType() != null) {
            _hashCode += getOriginType().hashCode();
        }
        if (getOfferingKey() != null) {
            _hashCode += getOfferingKey().hashCode();
        }
        if (getPlanID() != null) {
            _hashCode += getPlanID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryFreeUnitResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryFreeUnitResult>FreeUnitItem>FreeUnitItemDetail>FreeUnitOrigin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "OriginType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>>QueryFreeUnitResult>FreeUnitItem>FreeUnitItemDetail>FreeUnitOrigin>OfferingKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "PlanID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
