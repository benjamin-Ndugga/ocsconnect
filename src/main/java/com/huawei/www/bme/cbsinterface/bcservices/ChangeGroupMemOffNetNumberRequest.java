/**
 * ChangeGroupMemOffNetNumberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeGroupMemOffNetNumberRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberRequestGroupMemOffNetNumber[] groupMemOffNetNumber;

    public ChangeGroupMemOffNetNumberRequest() {
    }

    public ChangeGroupMemOffNetNumberRequest(
           com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberRequestGroupMemOffNetNumber[] groupMemOffNetNumber) {
           this.subAccessCode = subAccessCode;
           this.groupMemOffNetNumber = groupMemOffNetNumber;
    }


    /**
     * Gets the subAccessCode value for this ChangeGroupMemOffNetNumberRequest.
     * 
     * @return subAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }


    /**
     * Sets the subAccessCode value for this ChangeGroupMemOffNetNumberRequest.
     * 
     * @param subAccessCode
     */
    public void setSubAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }


    /**
     * Gets the groupMemOffNetNumber value for this ChangeGroupMemOffNetNumberRequest.
     * 
     * @return groupMemOffNetNumber
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberRequestGroupMemOffNetNumber[] getGroupMemOffNetNumber() {
        return groupMemOffNetNumber;
    }


    /**
     * Sets the groupMemOffNetNumber value for this ChangeGroupMemOffNetNumberRequest.
     * 
     * @param groupMemOffNetNumber
     */
    public void setGroupMemOffNetNumber(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberRequestGroupMemOffNetNumber[] groupMemOffNetNumber) {
        this.groupMemOffNetNumber = groupMemOffNetNumber;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberRequestGroupMemOffNetNumber getGroupMemOffNetNumber(int i) {
        return this.groupMemOffNetNumber[i];
    }

    public void setGroupMemOffNetNumber(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberRequestGroupMemOffNetNumber _value) {
        this.groupMemOffNetNumber[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeGroupMemOffNetNumberRequest)) return false;
        ChangeGroupMemOffNetNumberRequest other = (ChangeGroupMemOffNetNumberRequest) obj;
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
            ((this.groupMemOffNetNumber==null && other.getGroupMemOffNetNumber()==null) || 
             (this.groupMemOffNetNumber!=null &&
              java.util.Arrays.equals(this.groupMemOffNetNumber, other.getGroupMemOffNetNumber())));
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
        if (getGroupMemOffNetNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupMemOffNetNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupMemOffNetNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeGroupMemOffNetNumberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeGroupMemOffNetNumberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMemOffNetNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupMemOffNetNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeGroupMemOffNetNumberRequest>GroupMemOffNetNumber"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
