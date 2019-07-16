/**
 * QueryAppendSubIdentityResultSubIdentityList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryAppendSubIdentityResultSubIdentityList  implements java.io.Serializable {
    private java.lang.String subIdentity;

    private java.lang.String IMSI;

    private java.lang.Integer subIdentityType;

    public QueryAppendSubIdentityResultSubIdentityList() {
    }

    public QueryAppendSubIdentityResultSubIdentityList(
           java.lang.String subIdentity,
           java.lang.String IMSI,
           java.lang.Integer subIdentityType) {
           this.subIdentity = subIdentity;
           this.IMSI = IMSI;
           this.subIdentityType = subIdentityType;
    }


    /**
     * Gets the subIdentity value for this QueryAppendSubIdentityResultSubIdentityList.
     * 
     * @return subIdentity
     */
    public java.lang.String getSubIdentity() {
        return subIdentity;
    }


    /**
     * Sets the subIdentity value for this QueryAppendSubIdentityResultSubIdentityList.
     * 
     * @param subIdentity
     */
    public void setSubIdentity(java.lang.String subIdentity) {
        this.subIdentity = subIdentity;
    }


    /**
     * Gets the IMSI value for this QueryAppendSubIdentityResultSubIdentityList.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this QueryAppendSubIdentityResultSubIdentityList.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the subIdentityType value for this QueryAppendSubIdentityResultSubIdentityList.
     * 
     * @return subIdentityType
     */
    public java.lang.Integer getSubIdentityType() {
        return subIdentityType;
    }


    /**
     * Sets the subIdentityType value for this QueryAppendSubIdentityResultSubIdentityList.
     * 
     * @param subIdentityType
     */
    public void setSubIdentityType(java.lang.Integer subIdentityType) {
        this.subIdentityType = subIdentityType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryAppendSubIdentityResultSubIdentityList)) return false;
        QueryAppendSubIdentityResultSubIdentityList other = (QueryAppendSubIdentityResultSubIdentityList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subIdentity==null && other.getSubIdentity()==null) || 
             (this.subIdentity!=null &&
              this.subIdentity.equals(other.getSubIdentity()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.subIdentityType==null && other.getSubIdentityType()==null) || 
             (this.subIdentityType!=null &&
              this.subIdentityType.equals(other.getSubIdentityType())));
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
        if (getSubIdentity() != null) {
            _hashCode += getSubIdentity().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getSubIdentityType() != null) {
            _hashCode += getSubIdentityType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryAppendSubIdentityResultSubIdentityList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryAppendSubIdentityResult>SubIdentityList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subIdentityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubIdentityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
