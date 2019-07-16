/**
 * AddStatementRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class AddStatementRequest  implements java.io.Serializable {
    /* The customer key of root register customer. */
    private com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode registerCust;

    private com.huawei.www.bme.cbsinterface.bccommon.Statement statement;

    private com.huawei.www.bme.cbsinterface.bccommon.StatementScenario statementScenario;

    private com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo;

    private com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime;

    public AddStatementRequest() {
    }

    public AddStatementRequest(
           com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode registerCust,
           com.huawei.www.bme.cbsinterface.bccommon.Statement statement,
           com.huawei.www.bme.cbsinterface.bccommon.StatementScenario statementScenario,
           com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo,
           com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
           this.registerCust = registerCust;
           this.statement = statement;
           this.statementScenario = statementScenario;
           this.addressInfo = addressInfo;
           this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the registerCust value for this AddStatementRequest.
     * 
     * @return registerCust   * The customer key of root register customer.
     */
    public com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode getRegisterCust() {
        return registerCust;
    }


    /**
     * Sets the registerCust value for this AddStatementRequest.
     * 
     * @param registerCust   * The customer key of root register customer.
     */
    public void setRegisterCust(com.huawei.www.bme.cbsinterface.bccommon.CustAccessCode registerCust) {
        this.registerCust = registerCust;
    }


    /**
     * Gets the statement value for this AddStatementRequest.
     * 
     * @return statement
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Statement getStatement() {
        return statement;
    }


    /**
     * Sets the statement value for this AddStatementRequest.
     * 
     * @param statement
     */
    public void setStatement(com.huawei.www.bme.cbsinterface.bccommon.Statement statement) {
        this.statement = statement;
    }


    /**
     * Gets the statementScenario value for this AddStatementRequest.
     * 
     * @return statementScenario
     */
    public com.huawei.www.bme.cbsinterface.bccommon.StatementScenario getStatementScenario() {
        return statementScenario;
    }


    /**
     * Sets the statementScenario value for this AddStatementRequest.
     * 
     * @param statementScenario
     */
    public void setStatementScenario(com.huawei.www.bme.cbsinterface.bccommon.StatementScenario statementScenario) {
        this.statementScenario = statementScenario;
    }


    /**
     * Gets the addressInfo value for this AddStatementRequest.
     * 
     * @return addressInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Address getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this AddStatementRequest.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo) {
        this.addressInfo = addressInfo;
    }


    /**
     * Gets the effectiveTime value for this AddStatementRequest.
     * 
     * @return effectiveTime
     */
    public com.huawei.www.bme.cbsinterface.bccommon.EffectMode getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this AddStatementRequest.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(com.huawei.www.bme.cbsinterface.bccommon.EffectMode effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddStatementRequest)) return false;
        AddStatementRequest other = (AddStatementRequest) obj;
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
            ((this.statement==null && other.getStatement()==null) || 
             (this.statement!=null &&
              this.statement.equals(other.getStatement()))) &&
            ((this.statementScenario==null && other.getStatementScenario()==null) || 
             (this.statementScenario!=null &&
              this.statementScenario.equals(other.getStatementScenario()))) &&
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              this.addressInfo.equals(other.getAddressInfo()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime())));
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
        if (getStatement() != null) {
            _hashCode += getStatement().hashCode();
        }
        if (getStatementScenario() != null) {
            _hashCode += getStatementScenario().hashCode();
        }
        if (getAddressInfo() != null) {
            _hashCode += getAddressInfo().hashCode();
        }
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddStatementRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddStatementRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerCust");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RegisterCust"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Statement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Statement"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statementScenario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "StatementScenario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "StatementScenario"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffectiveTime"));
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
