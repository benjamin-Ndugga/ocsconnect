/**
 * QueryFreeUnitResultShareUsageList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryFreeUnitResultShareUsageList  implements java.io.Serializable {
    private java.lang.String sharedPrimaryIdentity;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultShareUsageListOfferingKey offeringKey;

    private long usedAmount;

    private java.lang.String freeUnitType;

    private java.lang.String measureUnit;

    public QueryFreeUnitResultShareUsageList() {
    }

    public QueryFreeUnitResultShareUsageList(
           java.lang.String sharedPrimaryIdentity,
           com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultShareUsageListOfferingKey offeringKey,
           long usedAmount,
           java.lang.String freeUnitType,
           java.lang.String measureUnit) {
           this.sharedPrimaryIdentity = sharedPrimaryIdentity;
           this.offeringKey = offeringKey;
           this.usedAmount = usedAmount;
           this.freeUnitType = freeUnitType;
           this.measureUnit = measureUnit;
    }


    /**
     * Gets the sharedPrimaryIdentity value for this QueryFreeUnitResultShareUsageList.
     * 
     * @return sharedPrimaryIdentity
     */
    public java.lang.String getSharedPrimaryIdentity() {
        return sharedPrimaryIdentity;
    }


    /**
     * Sets the sharedPrimaryIdentity value for this QueryFreeUnitResultShareUsageList.
     * 
     * @param sharedPrimaryIdentity
     */
    public void setSharedPrimaryIdentity(java.lang.String sharedPrimaryIdentity) {
        this.sharedPrimaryIdentity = sharedPrimaryIdentity;
    }


    /**
     * Gets the offeringKey value for this QueryFreeUnitResultShareUsageList.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultShareUsageListOfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this QueryFreeUnitResultShareUsageList.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultShareUsageListOfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the usedAmount value for this QueryFreeUnitResultShareUsageList.
     * 
     * @return usedAmount
     */
    public long getUsedAmount() {
        return usedAmount;
    }


    /**
     * Sets the usedAmount value for this QueryFreeUnitResultShareUsageList.
     * 
     * @param usedAmount
     */
    public void setUsedAmount(long usedAmount) {
        this.usedAmount = usedAmount;
    }


    /**
     * Gets the freeUnitType value for this QueryFreeUnitResultShareUsageList.
     * 
     * @return freeUnitType
     */
    public java.lang.String getFreeUnitType() {
        return freeUnitType;
    }


    /**
     * Sets the freeUnitType value for this QueryFreeUnitResultShareUsageList.
     * 
     * @param freeUnitType
     */
    public void setFreeUnitType(java.lang.String freeUnitType) {
        this.freeUnitType = freeUnitType;
    }


    /**
     * Gets the measureUnit value for this QueryFreeUnitResultShareUsageList.
     * 
     * @return measureUnit
     */
    public java.lang.String getMeasureUnit() {
        return measureUnit;
    }


    /**
     * Sets the measureUnit value for this QueryFreeUnitResultShareUsageList.
     * 
     * @param measureUnit
     */
    public void setMeasureUnit(java.lang.String measureUnit) {
        this.measureUnit = measureUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryFreeUnitResultShareUsageList)) return false;
        QueryFreeUnitResultShareUsageList other = (QueryFreeUnitResultShareUsageList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sharedPrimaryIdentity==null && other.getSharedPrimaryIdentity()==null) || 
             (this.sharedPrimaryIdentity!=null &&
              this.sharedPrimaryIdentity.equals(other.getSharedPrimaryIdentity()))) &&
            ((this.offeringKey==null && other.getOfferingKey()==null) || 
             (this.offeringKey!=null &&
              this.offeringKey.equals(other.getOfferingKey()))) &&
            this.usedAmount == other.getUsedAmount() &&
            ((this.freeUnitType==null && other.getFreeUnitType()==null) || 
             (this.freeUnitType!=null &&
              this.freeUnitType.equals(other.getFreeUnitType()))) &&
            ((this.measureUnit==null && other.getMeasureUnit()==null) || 
             (this.measureUnit!=null &&
              this.measureUnit.equals(other.getMeasureUnit())));
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
        if (getSharedPrimaryIdentity() != null) {
            _hashCode += getSharedPrimaryIdentity().hashCode();
        }
        if (getOfferingKey() != null) {
            _hashCode += getOfferingKey().hashCode();
        }
        _hashCode += new Long(getUsedAmount()).hashCode();
        if (getFreeUnitType() != null) {
            _hashCode += getFreeUnitType().hashCode();
        }
        if (getMeasureUnit() != null) {
            _hashCode += getMeasureUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryFreeUnitResultShareUsageList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryFreeUnitResult>ShareUsageList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedPrimaryIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "SharedPrimaryIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryFreeUnitResult>ShareUsageList>OfferingKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "UsedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FreeUnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "MeasureUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
