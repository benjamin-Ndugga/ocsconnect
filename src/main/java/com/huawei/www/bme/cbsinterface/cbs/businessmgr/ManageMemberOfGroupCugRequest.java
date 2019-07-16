/**
 * ManageMemberOfGroupCugRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ManageMemberOfGroupCugRequest  implements java.io.Serializable {
    private java.lang.String groupNumber;

    private java.lang.String grpCugId;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManageMemberOfGroupCugRequestGroupMember[] groupMember;

    private int operationType;

    public ManageMemberOfGroupCugRequest() {
    }

    public ManageMemberOfGroupCugRequest(
           java.lang.String groupNumber,
           java.lang.String grpCugId,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManageMemberOfGroupCugRequestGroupMember[] groupMember,
           int operationType) {
           this.groupNumber = groupNumber;
           this.grpCugId = grpCugId;
           this.groupMember = groupMember;
           this.operationType = operationType;
    }


    /**
     * Gets the groupNumber value for this ManageMemberOfGroupCugRequest.
     * 
     * @return groupNumber
     */
    public java.lang.String getGroupNumber() {
        return groupNumber;
    }


    /**
     * Sets the groupNumber value for this ManageMemberOfGroupCugRequest.
     * 
     * @param groupNumber
     */
    public void setGroupNumber(java.lang.String groupNumber) {
        this.groupNumber = groupNumber;
    }


    /**
     * Gets the grpCugId value for this ManageMemberOfGroupCugRequest.
     * 
     * @return grpCugId
     */
    public java.lang.String getGrpCugId() {
        return grpCugId;
    }


    /**
     * Sets the grpCugId value for this ManageMemberOfGroupCugRequest.
     * 
     * @param grpCugId
     */
    public void setGrpCugId(java.lang.String grpCugId) {
        this.grpCugId = grpCugId;
    }


    /**
     * Gets the groupMember value for this ManageMemberOfGroupCugRequest.
     * 
     * @return groupMember
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManageMemberOfGroupCugRequestGroupMember[] getGroupMember() {
        return groupMember;
    }


    /**
     * Sets the groupMember value for this ManageMemberOfGroupCugRequest.
     * 
     * @param groupMember
     */
    public void setGroupMember(com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManageMemberOfGroupCugRequestGroupMember[] groupMember) {
        this.groupMember = groupMember;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManageMemberOfGroupCugRequestGroupMember getGroupMember(int i) {
        return this.groupMember[i];
    }

    public void setGroupMember(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.ManageMemberOfGroupCugRequestGroupMember _value) {
        this.groupMember[i] = _value;
    }


    /**
     * Gets the operationType value for this ManageMemberOfGroupCugRequest.
     * 
     * @return operationType
     */
    public int getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this ManageMemberOfGroupCugRequest.
     * 
     * @param operationType
     */
    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageMemberOfGroupCugRequest)) return false;
        ManageMemberOfGroupCugRequest other = (ManageMemberOfGroupCugRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupNumber==null && other.getGroupNumber()==null) || 
             (this.groupNumber!=null &&
              this.groupNumber.equals(other.getGroupNumber()))) &&
            ((this.grpCugId==null && other.getGrpCugId()==null) || 
             (this.grpCugId!=null &&
              this.grpCugId.equals(other.getGrpCugId()))) &&
            ((this.groupMember==null && other.getGroupMember()==null) || 
             (this.groupMember!=null &&
              java.util.Arrays.equals(this.groupMember, other.getGroupMember()))) &&
            this.operationType == other.getOperationType();
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
        if (getGroupNumber() != null) {
            _hashCode += getGroupNumber().hashCode();
        }
        if (getGrpCugId() != null) {
            _hashCode += getGrpCugId().hashCode();
        }
        if (getGroupMember() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupMember());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupMember(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getOperationType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageMemberOfGroupCugRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ManageMemberOfGroupCugRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "GroupNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpCugId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "GrpCugId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMember");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "GroupMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ManageMemberOfGroupCugRequest>GroupMember"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OperationType"));
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
