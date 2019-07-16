/**
 * QueryUnbilledAmountRequestChargeObj.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryUnbilledAmountRequestChargeObj  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode subAccessCode;

    private com.huawei.www.bme.cbsinterface.bbcommon.SubGroupAccessCode subGroupAccessCode;

    private com.huawei.www.bme.cbsinterface.bbcommon.CustAccessCode custAccessCode;

    public QueryUnbilledAmountRequestChargeObj() {
    }

    public QueryUnbilledAmountRequestChargeObj(
           com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode subAccessCode,
           com.huawei.www.bme.cbsinterface.bbcommon.SubGroupAccessCode subGroupAccessCode,
           com.huawei.www.bme.cbsinterface.bbcommon.CustAccessCode custAccessCode) {
           this.subAccessCode = subAccessCode;
           this.subGroupAccessCode = subGroupAccessCode;
           this.custAccessCode = custAccessCode;
    }


    /**
     * Gets the subAccessCode value for this QueryUnbilledAmountRequestChargeObj.
     * 
     * @return subAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }


    /**
     * Sets the subAccessCode value for this QueryUnbilledAmountRequestChargeObj.
     * 
     * @param subAccessCode
     */
    public void setSubAccessCode(com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }


    /**
     * Gets the subGroupAccessCode value for this QueryUnbilledAmountRequestChargeObj.
     * 
     * @return subGroupAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bbcommon.SubGroupAccessCode getSubGroupAccessCode() {
        return subGroupAccessCode;
    }


    /**
     * Sets the subGroupAccessCode value for this QueryUnbilledAmountRequestChargeObj.
     * 
     * @param subGroupAccessCode
     */
    public void setSubGroupAccessCode(com.huawei.www.bme.cbsinterface.bbcommon.SubGroupAccessCode subGroupAccessCode) {
        this.subGroupAccessCode = subGroupAccessCode;
    }


    /**
     * Gets the custAccessCode value for this QueryUnbilledAmountRequestChargeObj.
     * 
     * @return custAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bbcommon.CustAccessCode getCustAccessCode() {
        return custAccessCode;
    }


    /**
     * Sets the custAccessCode value for this QueryUnbilledAmountRequestChargeObj.
     * 
     * @param custAccessCode
     */
    public void setCustAccessCode(com.huawei.www.bme.cbsinterface.bbcommon.CustAccessCode custAccessCode) {
        this.custAccessCode = custAccessCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryUnbilledAmountRequestChargeObj)) return false;
        QueryUnbilledAmountRequestChargeObj other = (QueryUnbilledAmountRequestChargeObj) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subAccessCode==null && other.getSubAccessCode()==null) || 
             (this.subAccessCode!=null &&
              this.subAccessCode.equals(other.getSubAccessCode()))) &&
            ((this.subGroupAccessCode==null && other.getSubGroupAccessCode()==null) || 
             (this.subGroupAccessCode!=null &&
              this.subGroupAccessCode.equals(other.getSubGroupAccessCode()))) &&
            ((this.custAccessCode==null && other.getCustAccessCode()==null) || 
             (this.custAccessCode!=null &&
              this.custAccessCode.equals(other.getCustAccessCode())));
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
        if (getSubAccessCode() != null) {
            _hashCode += getSubAccessCode().hashCode();
        }
        if (getSubGroupAccessCode() != null) {
            _hashCode += getSubGroupAccessCode().hashCode();
        }
        if (getCustAccessCode() != null) {
            _hashCode += getCustAccessCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryUnbilledAmountRequestChargeObj.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryUnbilledAmountRequest>ChargeObj"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "SubAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SubAccessCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "SubGroupAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SubGroupAccessCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CustAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "CustAccessCode"));
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
