/**
 * QueryChildLimitResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryChildLimitResult  implements java.io.Serializable {
    private int limitation;

    private int consumption;

    private int availableLimitation;

    public QueryChildLimitResult() {
    }

    public QueryChildLimitResult(
           int limitation,
           int consumption,
           int availableLimitation) {
           this.limitation = limitation;
           this.consumption = consumption;
           this.availableLimitation = availableLimitation;
    }


    /**
     * Gets the limitation value for this QueryChildLimitResult.
     * 
     * @return limitation
     */
    public int getLimitation() {
        return limitation;
    }


    /**
     * Sets the limitation value for this QueryChildLimitResult.
     * 
     * @param limitation
     */
    public void setLimitation(int limitation) {
        this.limitation = limitation;
    }


    /**
     * Gets the consumption value for this QueryChildLimitResult.
     * 
     * @return consumption
     */
    public int getConsumption() {
        return consumption;
    }


    /**
     * Sets the consumption value for this QueryChildLimitResult.
     * 
     * @param consumption
     */
    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }


    /**
     * Gets the availableLimitation value for this QueryChildLimitResult.
     * 
     * @return availableLimitation
     */
    public int getAvailableLimitation() {
        return availableLimitation;
    }


    /**
     * Sets the availableLimitation value for this QueryChildLimitResult.
     * 
     * @param availableLimitation
     */
    public void setAvailableLimitation(int availableLimitation) {
        this.availableLimitation = availableLimitation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryChildLimitResult)) return false;
        QueryChildLimitResult other = (QueryChildLimitResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.limitation == other.getLimitation() &&
            this.consumption == other.getConsumption() &&
            this.availableLimitation == other.getAvailableLimitation();
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
        _hashCode += getLimitation();
        _hashCode += getConsumption();
        _hashCode += getAvailableLimitation();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryChildLimitResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryChildLimitResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Limitation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Consumption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableLimitation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "AvailableLimitation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
