/**
 * ChangeAcctOwnershipRequestNewOwnershipAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeAcctOwnershipRequestNewOwnershipAccount  implements java.io.Serializable {
    private java.lang.String prepaidAcctKey;

    private java.lang.String postpaidAcctKey;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel[] autoPayChannel;

    public ChangeAcctOwnershipRequestNewOwnershipAccount() {
    }

    public ChangeAcctOwnershipRequestNewOwnershipAccount(
           java.lang.String prepaidAcctKey,
           java.lang.String postpaidAcctKey,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel[] autoPayChannel) {
           this.prepaidAcctKey = prepaidAcctKey;
           this.postpaidAcctKey = postpaidAcctKey;
           this.autoPayChannel = autoPayChannel;
    }


    /**
     * Gets the prepaidAcctKey value for this ChangeAcctOwnershipRequestNewOwnershipAccount.
     * 
     * @return prepaidAcctKey
     */
    public java.lang.String getPrepaidAcctKey() {
        return prepaidAcctKey;
    }


    /**
     * Sets the prepaidAcctKey value for this ChangeAcctOwnershipRequestNewOwnershipAccount.
     * 
     * @param prepaidAcctKey
     */
    public void setPrepaidAcctKey(java.lang.String prepaidAcctKey) {
        this.prepaidAcctKey = prepaidAcctKey;
    }


    /**
     * Gets the postpaidAcctKey value for this ChangeAcctOwnershipRequestNewOwnershipAccount.
     * 
     * @return postpaidAcctKey
     */
    public java.lang.String getPostpaidAcctKey() {
        return postpaidAcctKey;
    }


    /**
     * Sets the postpaidAcctKey value for this ChangeAcctOwnershipRequestNewOwnershipAccount.
     * 
     * @param postpaidAcctKey
     */
    public void setPostpaidAcctKey(java.lang.String postpaidAcctKey) {
        this.postpaidAcctKey = postpaidAcctKey;
    }


    /**
     * Gets the autoPayChannel value for this ChangeAcctOwnershipRequestNewOwnershipAccount.
     * 
     * @return autoPayChannel
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel[] getAutoPayChannel() {
        return autoPayChannel;
    }


    /**
     * Sets the autoPayChannel value for this ChangeAcctOwnershipRequestNewOwnershipAccount.
     * 
     * @param autoPayChannel
     */
    public void setAutoPayChannel(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel[] autoPayChannel) {
        this.autoPayChannel = autoPayChannel;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel getAutoPayChannel(int i) {
        return this.autoPayChannel[i];
    }

    public void setAutoPayChannel(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestNewOwnershipAccountAutoPayChannel _value) {
        this.autoPayChannel[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAcctOwnershipRequestNewOwnershipAccount)) return false;
        ChangeAcctOwnershipRequestNewOwnershipAccount other = (ChangeAcctOwnershipRequestNewOwnershipAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prepaidAcctKey==null && other.getPrepaidAcctKey()==null) || 
             (this.prepaidAcctKey!=null &&
              this.prepaidAcctKey.equals(other.getPrepaidAcctKey()))) &&
            ((this.postpaidAcctKey==null && other.getPostpaidAcctKey()==null) || 
             (this.postpaidAcctKey!=null &&
              this.postpaidAcctKey.equals(other.getPostpaidAcctKey()))) &&
            ((this.autoPayChannel==null && other.getAutoPayChannel()==null) || 
             (this.autoPayChannel!=null &&
              java.util.Arrays.equals(this.autoPayChannel, other.getAutoPayChannel())));
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
        if (getPrepaidAcctKey() != null) {
            _hashCode += getPrepaidAcctKey().hashCode();
        }
        if (getPostpaidAcctKey() != null) {
            _hashCode += getPostpaidAcctKey().hashCode();
        }
        if (getAutoPayChannel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoPayChannel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoPayChannel(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeAcctOwnershipRequestNewOwnershipAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeAcctOwnershipRequest>NewOwnership>Account"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidAcctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrepaidAcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postpaidAcctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PostpaidAcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPayChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AutoPayChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeAcctOwnershipRequest>NewOwnership>Account>AutoPayChannel"));
        elemField.setMinOccurs(0);
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
