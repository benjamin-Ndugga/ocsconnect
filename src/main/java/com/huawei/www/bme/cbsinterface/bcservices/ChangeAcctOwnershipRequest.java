/**
 * ChangeAcctOwnershipRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAcctOwnershipRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestOldOwnership oldOwnership;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnership newOwnership;

    public ChangeAcctOwnershipRequest() {
    }

    public ChangeAcctOwnershipRequest(
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestOldOwnership oldOwnership,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnership newOwnership) {
           this.oldOwnership = oldOwnership;
           this.newOwnership = newOwnership;
    }


    /**
     * Gets the oldOwnership value for this ChangeAcctOwnershipRequest.
     * 
     * @return oldOwnership
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestOldOwnership getOldOwnership() {
        return oldOwnership;
    }


    /**
     * Sets the oldOwnership value for this ChangeAcctOwnershipRequest.
     * 
     * @param oldOwnership
     */
    public void setOldOwnership(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestOldOwnership oldOwnership) {
        this.oldOwnership = oldOwnership;
    }


    /**
     * Gets the newOwnership value for this ChangeAcctOwnershipRequest.
     * 
     * @return newOwnership
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnership getNewOwnership() {
        return newOwnership;
    }


    /**
     * Sets the newOwnership value for this ChangeAcctOwnershipRequest.
     * 
     * @param newOwnership
     */
    public void setNewOwnership(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnership newOwnership) {
        this.newOwnership = newOwnership;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAcctOwnershipRequest)) return false;
        ChangeAcctOwnershipRequest other = (ChangeAcctOwnershipRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldOwnership==null && other.getOldOwnership()==null) || 
             (this.oldOwnership!=null &&
              this.oldOwnership.equals(other.getOldOwnership()))) &&
            ((this.newOwnership==null && other.getNewOwnership()==null) || 
             (this.newOwnership!=null &&
              this.newOwnership.equals(other.getNewOwnership())));
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
        if (getOldOwnership() != null) {
            _hashCode += getOldOwnership().hashCode();
        }
        if (getNewOwnership() != null) {
            _hashCode += getNewOwnership().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeAcctOwnershipRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ChangeAcctOwnershipRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldOwnership");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldOwnership"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctOwnershipRequest>OldOwnership"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newOwnership");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewOwnership"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ChangeAcctOwnershipRequest>NewOwnership"));
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
