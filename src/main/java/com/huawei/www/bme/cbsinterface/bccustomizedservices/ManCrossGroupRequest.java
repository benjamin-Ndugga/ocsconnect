/**
 * ManCrossGroupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccustomizedservices;

public class ManCrossGroupRequest  implements java.io.Serializable {
    /* The group which will build cross-net relation with another
     * group */
    private com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCodeA;

    /* Another group which group A has cross-net relation with */
    private com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCodeB;

    /* Identify which operation to manage share relation
     * 1: Add cross relation from group A to group B
     * 2: Delete exsiting cross relation from group A to group B */
    private java.math.BigInteger operationType;

    public ManCrossGroupRequest() {
    }

    public ManCrossGroupRequest(
           com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCodeA,
           com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCodeB,
           java.math.BigInteger operationType) {
           this.subGroupAccessCodeA = subGroupAccessCodeA;
           this.subGroupAccessCodeB = subGroupAccessCodeB;
           this.operationType = operationType;
    }


    /**
     * Gets the subGroupAccessCodeA value for this ManCrossGroupRequest.
     * 
     * @return subGroupAccessCodeA   * The group which will build cross-net relation with another
     * group
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode getSubGroupAccessCodeA() {
        return subGroupAccessCodeA;
    }


    /**
     * Sets the subGroupAccessCodeA value for this ManCrossGroupRequest.
     * 
     * @param subGroupAccessCodeA   * The group which will build cross-net relation with another
     * group
     */
    public void setSubGroupAccessCodeA(com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCodeA) {
        this.subGroupAccessCodeA = subGroupAccessCodeA;
    }


    /**
     * Gets the subGroupAccessCodeB value for this ManCrossGroupRequest.
     * 
     * @return subGroupAccessCodeB   * Another group which group A has cross-net relation with
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode getSubGroupAccessCodeB() {
        return subGroupAccessCodeB;
    }


    /**
     * Sets the subGroupAccessCodeB value for this ManCrossGroupRequest.
     * 
     * @param subGroupAccessCodeB   * Another group which group A has cross-net relation with
     */
    public void setSubGroupAccessCodeB(com.huawei.www.bme.cbsinterface.bccommon.SubGroupAccessCode subGroupAccessCodeB) {
        this.subGroupAccessCodeB = subGroupAccessCodeB;
    }


    /**
     * Gets the operationType value for this ManCrossGroupRequest.
     * 
     * @return operationType   * Identify which operation to manage share relation
     * 1: Add cross relation from group A to group B
     * 2: Delete exsiting cross relation from group A to group B
     */
    public java.math.BigInteger getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this ManCrossGroupRequest.
     * 
     * @param operationType   * Identify which operation to manage share relation
     * 1: Add cross relation from group A to group B
     * 2: Delete exsiting cross relation from group A to group B
     */
    public void setOperationType(java.math.BigInteger operationType) {
        this.operationType = operationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManCrossGroupRequest)) return false;
        ManCrossGroupRequest other = (ManCrossGroupRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subGroupAccessCodeA==null && other.getSubGroupAccessCodeA()==null) || 
             (this.subGroupAccessCodeA!=null &&
              this.subGroupAccessCodeA.equals(other.getSubGroupAccessCodeA()))) &&
            ((this.subGroupAccessCodeB==null && other.getSubGroupAccessCodeB()==null) || 
             (this.subGroupAccessCodeB!=null &&
              this.subGroupAccessCodeB.equals(other.getSubGroupAccessCodeB()))) &&
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType())));
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
        if (getSubGroupAccessCodeA() != null) {
            _hashCode += getSubGroupAccessCodeA().hashCode();
        }
        if (getSubGroupAccessCodeB() != null) {
            _hashCode += getSubGroupAccessCodeB().hashCode();
        }
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManCrossGroupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "ManCrossGroupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupAccessCodeA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "SubGroupAccessCodeA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupAccessCodeB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "SubGroupAccessCodeB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubGroupAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccustomizedservices", "OperationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
