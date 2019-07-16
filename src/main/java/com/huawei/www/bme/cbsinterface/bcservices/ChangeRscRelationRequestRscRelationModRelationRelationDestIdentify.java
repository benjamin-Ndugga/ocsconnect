/**
 * ChangeRscRelationRequestRscRelationModRelationRelationDestIdentify.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeRscRelationRequestRscRelationModRelationRelationDestIdentify  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subIdentify;

    public ChangeRscRelationRequestRscRelationModRelationRelationDestIdentify() {
    }

    public ChangeRscRelationRequestRscRelationModRelationRelationDestIdentify(
           com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subIdentify) {
           this.subIdentify = subIdentify;
    }


    /**
     * Gets the subIdentify value for this ChangeRscRelationRequestRscRelationModRelationRelationDestIdentify.
     * 
     * @return subIdentify
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode getSubIdentify() {
        return subIdentify;
    }


    /**
     * Sets the subIdentify value for this ChangeRscRelationRequestRscRelationModRelationRelationDestIdentify.
     * 
     * @param subIdentify
     */
    public void setSubIdentify(com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subIdentify) {
        this.subIdentify = subIdentify;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeRscRelationRequestRscRelationModRelationRelationDestIdentify)) return false;
        ChangeRscRelationRequestRscRelationModRelationRelationDestIdentify other = (ChangeRscRelationRequestRscRelationModRelationRelationDestIdentify) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subIdentify==null && other.getSubIdentify()==null) || 
             (this.subIdentify!=null &&
              this.subIdentify.equals(other.getSubIdentify())));
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
        if (getSubIdentify() != null) {
            _hashCode += getSubIdentify().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeRscRelationRequestRscRelationModRelationRelationDestIdentify.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeRscRelationRequest>RscRelation>ModRelation>RelationDestIdentify"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subIdentify");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubIdentify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubAccessCode"));
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
