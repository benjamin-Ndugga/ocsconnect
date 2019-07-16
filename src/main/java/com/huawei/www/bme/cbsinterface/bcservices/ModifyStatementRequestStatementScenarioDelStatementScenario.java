/**
 * ModifyStatementRequestStatementScenarioDelStatementScenario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ModifyStatementRequestStatementScenarioDelStatementScenario  implements java.io.Serializable {
    private java.lang.String accountKey;

    private java.lang.String subscriberKey;

    private com.huawei.www.bme.cbsinterface.bccommon.EffectMode expirationTime;

    public ModifyStatementRequestStatementScenarioDelStatementScenario() {
    }

    public ModifyStatementRequestStatementScenarioDelStatementScenario(
           java.lang.String accountKey,
           java.lang.String subscriberKey,
           com.huawei.www.bme.cbsinterface.bccommon.EffectMode expirationTime) {
           this.accountKey = accountKey;
           this.subscriberKey = subscriberKey;
           this.expirationTime = expirationTime;
    }


    /**
     * Gets the accountKey value for this ModifyStatementRequestStatementScenarioDelStatementScenario.
     * 
     * @return accountKey
     */
    public java.lang.String getAccountKey() {
        return accountKey;
    }


    /**
     * Sets the accountKey value for this ModifyStatementRequestStatementScenarioDelStatementScenario.
     * 
     * @param accountKey
     */
    public void setAccountKey(java.lang.String accountKey) {
        this.accountKey = accountKey;
    }


    /**
     * Gets the subscriberKey value for this ModifyStatementRequestStatementScenarioDelStatementScenario.
     * 
     * @return subscriberKey
     */
    public java.lang.String getSubscriberKey() {
        return subscriberKey;
    }


    /**
     * Sets the subscriberKey value for this ModifyStatementRequestStatementScenarioDelStatementScenario.
     * 
     * @param subscriberKey
     */
    public void setSubscriberKey(java.lang.String subscriberKey) {
        this.subscriberKey = subscriberKey;
    }


    /**
     * Gets the expirationTime value for this ModifyStatementRequestStatementScenarioDelStatementScenario.
     * 
     * @return expirationTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.EffectMode getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this ModifyStatementRequestStatementScenarioDelStatementScenario.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(com.huawei.www.bme.cbsinterface.bccommon.EffectMode expirationTime) {
        this.expirationTime = expirationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyStatementRequestStatementScenarioDelStatementScenario)) return false;
        ModifyStatementRequestStatementScenarioDelStatementScenario other = (ModifyStatementRequestStatementScenarioDelStatementScenario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountKey==null && other.getAccountKey()==null) || 
             (this.accountKey!=null &&
              this.accountKey.equals(other.getAccountKey()))) &&
            ((this.subscriberKey==null && other.getSubscriberKey()==null) || 
             (this.subscriberKey!=null &&
              this.subscriberKey.equals(other.getSubscriberKey()))) &&
            ((this.expirationTime==null && other.getExpirationTime()==null) || 
             (this.expirationTime!=null &&
              this.expirationTime.equals(other.getExpirationTime())));
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
        if (getAccountKey() != null) {
            _hashCode += getAccountKey().hashCode();
        }
        if (getSubscriberKey() != null) {
            _hashCode += getSubscriberKey().hashCode();
        }
        if (getExpirationTime() != null) {
            _hashCode += getExpirationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyStatementRequestStatementScenarioDelStatementScenario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ModifyStatementRequest>StatementScenario>DelStatementScenario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AccountKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubscriberKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpirationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "EffectMode"));
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
