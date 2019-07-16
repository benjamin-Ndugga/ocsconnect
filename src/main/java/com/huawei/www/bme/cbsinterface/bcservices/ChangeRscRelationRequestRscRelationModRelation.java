/**
 * ChangeRscRelationRequestRscRelationModRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeRscRelationRequestRscRelationModRelation  implements java.io.Serializable {
    private java.lang.String relationObjType;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationRelationDestIdentify relationDestIdentify;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationOldRelation oldRelation;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationNewRelation newRelation;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationNewDestIdentify newDestIdentify;

    private java.lang.String effTime;

    public ChangeRscRelationRequestRscRelationModRelation() {
    }

    public ChangeRscRelationRequestRscRelationModRelation(
           java.lang.String relationObjType,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationRelationDestIdentify relationDestIdentify,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationOldRelation oldRelation,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationNewRelation newRelation,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationNewDestIdentify newDestIdentify,
           java.lang.String effTime) {
           this.relationObjType = relationObjType;
           this.relationDestIdentify = relationDestIdentify;
           this.oldRelation = oldRelation;
           this.newRelation = newRelation;
           this.newDestIdentify = newDestIdentify;
           this.effTime = effTime;
    }


    /**
     * Gets the relationObjType value for this ChangeRscRelationRequestRscRelationModRelation.
     * 
     * @return relationObjType
     */
    public java.lang.String getRelationObjType() {
        return relationObjType;
    }


    /**
     * Sets the relationObjType value for this ChangeRscRelationRequestRscRelationModRelation.
     * 
     * @param relationObjType
     */
    public void setRelationObjType(java.lang.String relationObjType) {
        this.relationObjType = relationObjType;
    }


    /**
     * Gets the relationDestIdentify value for this ChangeRscRelationRequestRscRelationModRelation.
     * 
     * @return relationDestIdentify
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationRelationDestIdentify getRelationDestIdentify() {
        return relationDestIdentify;
    }


    /**
     * Sets the relationDestIdentify value for this ChangeRscRelationRequestRscRelationModRelation.
     * 
     * @param relationDestIdentify
     */
    public void setRelationDestIdentify(com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationRelationDestIdentify relationDestIdentify) {
        this.relationDestIdentify = relationDestIdentify;
    }


    /**
     * Gets the oldRelation value for this ChangeRscRelationRequestRscRelationModRelation.
     * 
     * @return oldRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationOldRelation getOldRelation() {
        return oldRelation;
    }


    /**
     * Sets the oldRelation value for this ChangeRscRelationRequestRscRelationModRelation.
     * 
     * @param oldRelation
     */
    public void setOldRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationOldRelation oldRelation) {
        this.oldRelation = oldRelation;
    }


    /**
     * Gets the newRelation value for this ChangeRscRelationRequestRscRelationModRelation.
     * 
     * @return newRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationNewRelation getNewRelation() {
        return newRelation;
    }


    /**
     * Sets the newRelation value for this ChangeRscRelationRequestRscRelationModRelation.
     * 
     * @param newRelation
     */
    public void setNewRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationNewRelation newRelation) {
        this.newRelation = newRelation;
    }


    /**
     * Gets the newDestIdentify value for this ChangeRscRelationRequestRscRelationModRelation.
     * 
     * @return newDestIdentify
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationNewDestIdentify getNewDestIdentify() {
        return newDestIdentify;
    }


    /**
     * Sets the newDestIdentify value for this ChangeRscRelationRequestRscRelationModRelation.
     * 
     * @param newDestIdentify
     */
    public void setNewDestIdentify(com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestRscRelationModRelationNewDestIdentify newDestIdentify) {
        this.newDestIdentify = newDestIdentify;
    }


    /**
     * Gets the effTime value for this ChangeRscRelationRequestRscRelationModRelation.
     * 
     * @return effTime
     */
    public java.lang.String getEffTime() {
        return effTime;
    }


    /**
     * Sets the effTime value for this ChangeRscRelationRequestRscRelationModRelation.
     * 
     * @param effTime
     */
    public void setEffTime(java.lang.String effTime) {
        this.effTime = effTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeRscRelationRequestRscRelationModRelation)) return false;
        ChangeRscRelationRequestRscRelationModRelation other = (ChangeRscRelationRequestRscRelationModRelation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.relationObjType==null && other.getRelationObjType()==null) || 
             (this.relationObjType!=null &&
              this.relationObjType.equals(other.getRelationObjType()))) &&
            ((this.relationDestIdentify==null && other.getRelationDestIdentify()==null) || 
             (this.relationDestIdentify!=null &&
              this.relationDestIdentify.equals(other.getRelationDestIdentify()))) &&
            ((this.oldRelation==null && other.getOldRelation()==null) || 
             (this.oldRelation!=null &&
              this.oldRelation.equals(other.getOldRelation()))) &&
            ((this.newRelation==null && other.getNewRelation()==null) || 
             (this.newRelation!=null &&
              this.newRelation.equals(other.getNewRelation()))) &&
            ((this.newDestIdentify==null && other.getNewDestIdentify()==null) || 
             (this.newDestIdentify!=null &&
              this.newDestIdentify.equals(other.getNewDestIdentify()))) &&
            ((this.effTime==null && other.getEffTime()==null) || 
             (this.effTime!=null &&
              this.effTime.equals(other.getEffTime())));
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
        if (getRelationObjType() != null) {
            _hashCode += getRelationObjType().hashCode();
        }
        if (getRelationDestIdentify() != null) {
            _hashCode += getRelationDestIdentify().hashCode();
        }
        if (getOldRelation() != null) {
            _hashCode += getOldRelation().hashCode();
        }
        if (getNewRelation() != null) {
            _hashCode += getNewRelation().hashCode();
        }
        if (getNewDestIdentify() != null) {
            _hashCode += getNewDestIdentify().hashCode();
        }
        if (getEffTime() != null) {
            _hashCode += getEffTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeRscRelationRequestRscRelationModRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeRscRelationRequest>RscRelation>ModRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationObjType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RelationObjType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationDestIdentify");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RelationDestIdentify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeRscRelationRequest>RscRelation>ModRelation>RelationDestIdentify"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OldRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeRscRelationRequest>RscRelation>ModRelation>OldRelation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeRscRelationRequest>RscRelation>ModRelation>NewRelation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDestIdentify");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NewDestIdentify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeRscRelationRequest>RscRelation>ModRelation>NewDestIdentify"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
