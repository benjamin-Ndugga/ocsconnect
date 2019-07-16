/**
 * ModifyStatementRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ModifyStatementRequest  implements java.io.Serializable {
    /* The customer key of root register customer. */
    private com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode registerCust;

    private java.lang.String smtKey;

    private com.huawei.www.bme.cbsinterface.bccommon.StatementInfo statementInfo;

    private com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenario statementScenario;

    private com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo;

    public ModifyStatementRequest() {
    }

    public ModifyStatementRequest(
           com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode registerCust,
           java.lang.String smtKey,
           com.huawei.www.bme.cbsinterface.bccommon.StatementInfo statementInfo,
           com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenario statementScenario,
           com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo) {
           this.registerCust = registerCust;
           this.smtKey = smtKey;
           this.statementInfo = statementInfo;
           this.statementScenario = statementScenario;
           this.addressInfo = addressInfo;
    }


    /**
     * Gets the registerCust value for this ModifyStatementRequest.
     * 
     * @return registerCust   * The customer key of root register customer.
     */
    public com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode getRegisterCust() {
        return registerCust;
    }


    /**
     * Sets the registerCust value for this ModifyStatementRequest.
     * 
     * @param registerCust   * The customer key of root register customer.
     */
    public void setRegisterCust(com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode registerCust) {
        this.registerCust = registerCust;
    }


    /**
     * Gets the smtKey value for this ModifyStatementRequest.
     * 
     * @return smtKey
     */
    public java.lang.String getSmtKey() {
        return smtKey;
    }


    /**
     * Sets the smtKey value for this ModifyStatementRequest.
     * 
     * @param smtKey
     */
    public void setSmtKey(java.lang.String smtKey) {
        this.smtKey = smtKey;
    }


    /**
     * Gets the statementInfo value for this ModifyStatementRequest.
     * 
     * @return statementInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.StatementInfo getStatementInfo() {
        return statementInfo;
    }


    /**
     * Sets the statementInfo value for this ModifyStatementRequest.
     * 
     * @param statementInfo
     */
    public void setStatementInfo(com.huawei.www.bme.cbsinterface.bccommon.StatementInfo statementInfo) {
        this.statementInfo = statementInfo;
    }


    /**
     * Gets the statementScenario value for this ModifyStatementRequest.
     * 
     * @return statementScenario
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenario getStatementScenario() {
        return statementScenario;
    }


    /**
     * Sets the statementScenario value for this ModifyStatementRequest.
     * 
     * @param statementScenario
     */
    public void setStatementScenario(com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestStatementScenario statementScenario) {
        this.statementScenario = statementScenario;
    }


    /**
     * Gets the addressInfo value for this ModifyStatementRequest.
     * 
     * @return addressInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Address getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this ModifyStatementRequest.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo) {
        this.addressInfo = addressInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyStatementRequest)) return false;
        ModifyStatementRequest other = (ModifyStatementRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registerCust==null && other.getRegisterCust()==null) || 
             (this.registerCust!=null &&
              this.registerCust.equals(other.getRegisterCust()))) &&
            ((this.smtKey==null && other.getSmtKey()==null) || 
             (this.smtKey!=null &&
              this.smtKey.equals(other.getSmtKey()))) &&
            ((this.statementInfo==null && other.getStatementInfo()==null) || 
             (this.statementInfo!=null &&
              this.statementInfo.equals(other.getStatementInfo()))) &&
            ((this.statementScenario==null && other.getStatementScenario()==null) || 
             (this.statementScenario!=null &&
              this.statementScenario.equals(other.getStatementScenario()))) &&
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              this.addressInfo.equals(other.getAddressInfo())));
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
        if (getRegisterCust() != null) {
            _hashCode += getRegisterCust().hashCode();
        }
        if (getSmtKey() != null) {
            _hashCode += getSmtKey().hashCode();
        }
        if (getStatementInfo() != null) {
            _hashCode += getStatementInfo().hashCode();
        }
        if (getStatementScenario() != null) {
            _hashCode += getStatementScenario().hashCode();
        }
        if (getAddressInfo() != null) {
            _hashCode += getAddressInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyStatementRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ModifyStatementRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerCust");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RegisterCust"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smtKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SmtKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statementInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "StatementInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "StatementInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statementScenario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "StatementScenario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">ModifyStatementRequest>StatementScenario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Address"));
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
