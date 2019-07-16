/**
 * ApplyInstallmentExtendRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ApplyInstallmentExtendRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendRequestApplyObj applyObj;

    private java.lang.String oldContractID;

    private com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendRequestNewInstallment newInstallment;

    public ApplyInstallmentExtendRequest() {
    }

    public ApplyInstallmentExtendRequest(
           com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendRequestApplyObj applyObj,
           java.lang.String oldContractID,
           com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendRequestNewInstallment newInstallment) {
           this.applyObj = applyObj;
           this.oldContractID = oldContractID;
           this.newInstallment = newInstallment;
    }


    /**
     * Gets the applyObj value for this ApplyInstallmentExtendRequest.
     * 
     * @return applyObj
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendRequestApplyObj getApplyObj() {
        return applyObj;
    }


    /**
     * Sets the applyObj value for this ApplyInstallmentExtendRequest.
     * 
     * @param applyObj
     */
    public void setApplyObj(com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendRequestApplyObj applyObj) {
        this.applyObj = applyObj;
    }


    /**
     * Gets the oldContractID value for this ApplyInstallmentExtendRequest.
     * 
     * @return oldContractID
     */
    public java.lang.String getOldContractID() {
        return oldContractID;
    }


    /**
     * Sets the oldContractID value for this ApplyInstallmentExtendRequest.
     * 
     * @param oldContractID
     */
    public void setOldContractID(java.lang.String oldContractID) {
        this.oldContractID = oldContractID;
    }


    /**
     * Gets the newInstallment value for this ApplyInstallmentExtendRequest.
     * 
     * @return newInstallment
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendRequestNewInstallment getNewInstallment() {
        return newInstallment;
    }


    /**
     * Sets the newInstallment value for this ApplyInstallmentExtendRequest.
     * 
     * @param newInstallment
     */
    public void setNewInstallment(com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendRequestNewInstallment newInstallment) {
        this.newInstallment = newInstallment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyInstallmentExtendRequest)) return false;
        ApplyInstallmentExtendRequest other = (ApplyInstallmentExtendRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applyObj==null && other.getApplyObj()==null) || 
             (this.applyObj!=null &&
              this.applyObj.equals(other.getApplyObj()))) &&
            ((this.oldContractID==null && other.getOldContractID()==null) || 
             (this.oldContractID!=null &&
              this.oldContractID.equals(other.getOldContractID()))) &&
            ((this.newInstallment==null && other.getNewInstallment()==null) || 
             (this.newInstallment!=null &&
              this.newInstallment.equals(other.getNewInstallment())));
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
        if (getApplyObj() != null) {
            _hashCode += getApplyObj().hashCode();
        }
        if (getOldContractID() != null) {
            _hashCode += getOldContractID().hashCode();
        }
        if (getNewInstallment() != null) {
            _hashCode += getNewInstallment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplyInstallmentExtendRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyInstallmentExtendRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ApplyObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentExtendRequest>ApplyObj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldContractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newInstallment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "newInstallment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ApplyInstallmentExtendRequest>newInstallment"));
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
