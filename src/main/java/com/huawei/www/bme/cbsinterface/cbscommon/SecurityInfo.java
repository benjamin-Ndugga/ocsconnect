/**
 * SecurityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbscommon;

public class SecurityInfo  implements java.io.Serializable {
    /* It is request system code which is defined in CBS. */
    private java.lang.String loginSystemCode;

    private java.lang.String password;

    private java.lang.String remoteIP;

    public SecurityInfo() {
    }

    public SecurityInfo(
           java.lang.String loginSystemCode,
           java.lang.String password,
           java.lang.String remoteIP) {
           this.loginSystemCode = loginSystemCode;
           this.password = password;
           this.remoteIP = remoteIP;
    }


    /**
     * Gets the loginSystemCode value for this SecurityInfo.
     * 
     * @return loginSystemCode   * It is request system code which is defined in CBS.
     */
    public java.lang.String getLoginSystemCode() {
        return loginSystemCode;
    }


    /**
     * Sets the loginSystemCode value for this SecurityInfo.
     * 
     * @param loginSystemCode   * It is request system code which is defined in CBS.
     */
    public void setLoginSystemCode(java.lang.String loginSystemCode) {
        this.loginSystemCode = loginSystemCode;
    }


    /**
     * Gets the password value for this SecurityInfo.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this SecurityInfo.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the remoteIP value for this SecurityInfo.
     * 
     * @return remoteIP
     */
    public java.lang.String getRemoteIP() {
        return remoteIP;
    }


    /**
     * Sets the remoteIP value for this SecurityInfo.
     * 
     * @param remoteIP
     */
    public void setRemoteIP(java.lang.String remoteIP) {
        this.remoteIP = remoteIP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityInfo)) return false;
        SecurityInfo other = (SecurityInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loginSystemCode==null && other.getLoginSystemCode()==null) || 
             (this.loginSystemCode!=null &&
              this.loginSystemCode.equals(other.getLoginSystemCode()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.remoteIP==null && other.getRemoteIP()==null) || 
             (this.remoteIP!=null &&
              this.remoteIP.equals(other.getRemoteIP())));
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
        if (getLoginSystemCode() != null) {
            _hashCode += getLoginSystemCode().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getRemoteIP() != null) {
            _hashCode += getRemoteIP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecurityInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "SecurityInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginSystemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "LoginSystemCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbscommon", "RemoteIP"));
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
