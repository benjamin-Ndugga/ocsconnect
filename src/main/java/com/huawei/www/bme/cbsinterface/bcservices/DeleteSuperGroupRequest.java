/**
 * DeleteSuperGroupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;


/**
 * 删除一个超级群时，自动将与超级群与超级群成员之间的关系解除
 */
public class DeleteSuperGroupRequest  implements java.io.Serializable {
    /* SuperGroup id/code信息 */
    private com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupRequestSuperGroupAccess superGroupAccess;

    public DeleteSuperGroupRequest() {
    }

    public DeleteSuperGroupRequest(
           com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupRequestSuperGroupAccess superGroupAccess) {
           this.superGroupAccess = superGroupAccess;
    }


    /**
     * Gets the superGroupAccess value for this DeleteSuperGroupRequest.
     * 
     * @return superGroupAccess   * SuperGroup id/code信息
     */
    public com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupRequestSuperGroupAccess getSuperGroupAccess() {
        return superGroupAccess;
    }


    /**
     * Sets the superGroupAccess value for this DeleteSuperGroupRequest.
     * 
     * @param superGroupAccess   * SuperGroup id/code信息
     */
    public void setSuperGroupAccess(com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupRequestSuperGroupAccess superGroupAccess) {
        this.superGroupAccess = superGroupAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteSuperGroupRequest)) return false;
        DeleteSuperGroupRequest other = (DeleteSuperGroupRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.superGroupAccess==null && other.getSuperGroupAccess()==null) || 
             (this.superGroupAccess!=null &&
              this.superGroupAccess.equals(other.getSuperGroupAccess())));
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
        if (getSuperGroupAccess() != null) {
            _hashCode += getSuperGroupAccess().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteSuperGroupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DeleteSuperGroupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superGroupAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SuperGroupAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">DeleteSuperGroupRequest>SuperGroupAccess"));
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
