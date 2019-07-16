/**
 * SubscriberBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class SubscriberBasic  implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.String brandId;

    private java.lang.String registrationTime;

    private java.lang.String lang;

    private java.lang.String SMSLang;

    private java.lang.String USSDLang;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.Paymode paidMode;

    private java.lang.Integer initialCredit;

    private java.lang.String belToAreaID;

    private java.lang.String mainProductID;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty;

    private java.lang.String lastRechargeTime;

    private java.lang.String lastCallTime;

    private java.lang.Integer SMSAmount;

    public SubscriberBasic() {
    }

    public SubscriberBasic(
           java.lang.String code,
           java.lang.String brandId,
           java.lang.String registrationTime,
           java.lang.String lang,
           java.lang.String SMSLang,
           java.lang.String USSDLang,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.Paymode paidMode,
           java.lang.Integer initialCredit,
           java.lang.String belToAreaID,
           java.lang.String mainProductID,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty,
           java.lang.String lastRechargeTime,
           java.lang.String lastCallTime,
           java.lang.Integer SMSAmount) {
           this.code = code;
           this.brandId = brandId;
           this.registrationTime = registrationTime;
           this.lang = lang;
           this.SMSLang = SMSLang;
           this.USSDLang = USSDLang;
           this.paidMode = paidMode;
           this.initialCredit = initialCredit;
           this.belToAreaID = belToAreaID;
           this.mainProductID = mainProductID;
           this.simpleProperty = simpleProperty;
           this.lastRechargeTime = lastRechargeTime;
           this.lastCallTime = lastCallTime;
           this.SMSAmount = SMSAmount;
    }


    /**
     * Gets the code value for this SubscriberBasic.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this SubscriberBasic.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the brandId value for this SubscriberBasic.
     * 
     * @return brandId
     */
    public java.lang.String getBrandId() {
        return brandId;
    }


    /**
     * Sets the brandId value for this SubscriberBasic.
     * 
     * @param brandId
     */
    public void setBrandId(java.lang.String brandId) {
        this.brandId = brandId;
    }


    /**
     * Gets the registrationTime value for this SubscriberBasic.
     * 
     * @return registrationTime
     */
    public java.lang.String getRegistrationTime() {
        return registrationTime;
    }


    /**
     * Sets the registrationTime value for this SubscriberBasic.
     * 
     * @param registrationTime
     */
    public void setRegistrationTime(java.lang.String registrationTime) {
        this.registrationTime = registrationTime;
    }


    /**
     * Gets the lang value for this SubscriberBasic.
     * 
     * @return lang
     */
    public java.lang.String getLang() {
        return lang;
    }


    /**
     * Sets the lang value for this SubscriberBasic.
     * 
     * @param lang
     */
    public void setLang(java.lang.String lang) {
        this.lang = lang;
    }


    /**
     * Gets the SMSLang value for this SubscriberBasic.
     * 
     * @return SMSLang
     */
    public java.lang.String getSMSLang() {
        return SMSLang;
    }


    /**
     * Sets the SMSLang value for this SubscriberBasic.
     * 
     * @param SMSLang
     */
    public void setSMSLang(java.lang.String SMSLang) {
        this.SMSLang = SMSLang;
    }


    /**
     * Gets the USSDLang value for this SubscriberBasic.
     * 
     * @return USSDLang
     */
    public java.lang.String getUSSDLang() {
        return USSDLang;
    }


    /**
     * Sets the USSDLang value for this SubscriberBasic.
     * 
     * @param USSDLang
     */
    public void setUSSDLang(java.lang.String USSDLang) {
        this.USSDLang = USSDLang;
    }


    /**
     * Gets the paidMode value for this SubscriberBasic.
     * 
     * @return paidMode
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.Paymode getPaidMode() {
        return paidMode;
    }


    /**
     * Sets the paidMode value for this SubscriberBasic.
     * 
     * @param paidMode
     */
    public void setPaidMode(com.huawei.www.bme.cbsinterface.cbs.businessmgr.Paymode paidMode) {
        this.paidMode = paidMode;
    }


    /**
     * Gets the initialCredit value for this SubscriberBasic.
     * 
     * @return initialCredit
     */
    public java.lang.Integer getInitialCredit() {
        return initialCredit;
    }


    /**
     * Sets the initialCredit value for this SubscriberBasic.
     * 
     * @param initialCredit
     */
    public void setInitialCredit(java.lang.Integer initialCredit) {
        this.initialCredit = initialCredit;
    }


    /**
     * Gets the belToAreaID value for this SubscriberBasic.
     * 
     * @return belToAreaID
     */
    public java.lang.String getBelToAreaID() {
        return belToAreaID;
    }


    /**
     * Sets the belToAreaID value for this SubscriberBasic.
     * 
     * @param belToAreaID
     */
    public void setBelToAreaID(java.lang.String belToAreaID) {
        this.belToAreaID = belToAreaID;
    }


    /**
     * Gets the mainProductID value for this SubscriberBasic.
     * 
     * @return mainProductID
     */
    public java.lang.String getMainProductID() {
        return mainProductID;
    }


    /**
     * Sets the mainProductID value for this SubscriberBasic.
     * 
     * @param mainProductID
     */
    public void setMainProductID(java.lang.String mainProductID) {
        this.mainProductID = mainProductID;
    }


    /**
     * Gets the simpleProperty value for this SubscriberBasic.
     * 
     * @return simpleProperty
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] getSimpleProperty() {
        return simpleProperty;
    }


    /**
     * Sets the simpleProperty value for this SubscriberBasic.
     * 
     * @param simpleProperty
     */
    public void setSimpleProperty(com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty) {
        this.simpleProperty = simpleProperty;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty getSimpleProperty(int i) {
        return this.simpleProperty[i];
    }

    public void setSimpleProperty(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty _value) {
        this.simpleProperty[i] = _value;
    }


    /**
     * Gets the lastRechargeTime value for this SubscriberBasic.
     * 
     * @return lastRechargeTime
     */
    public java.lang.String getLastRechargeTime() {
        return lastRechargeTime;
    }


    /**
     * Sets the lastRechargeTime value for this SubscriberBasic.
     * 
     * @param lastRechargeTime
     */
    public void setLastRechargeTime(java.lang.String lastRechargeTime) {
        this.lastRechargeTime = lastRechargeTime;
    }


    /**
     * Gets the lastCallTime value for this SubscriberBasic.
     * 
     * @return lastCallTime
     */
    public java.lang.String getLastCallTime() {
        return lastCallTime;
    }


    /**
     * Sets the lastCallTime value for this SubscriberBasic.
     * 
     * @param lastCallTime
     */
    public void setLastCallTime(java.lang.String lastCallTime) {
        this.lastCallTime = lastCallTime;
    }


    /**
     * Gets the SMSAmount value for this SubscriberBasic.
     * 
     * @return SMSAmount
     */
    public java.lang.Integer getSMSAmount() {
        return SMSAmount;
    }


    /**
     * Sets the SMSAmount value for this SubscriberBasic.
     * 
     * @param SMSAmount
     */
    public void setSMSAmount(java.lang.Integer SMSAmount) {
        this.SMSAmount = SMSAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberBasic)) return false;
        SubscriberBasic other = (SubscriberBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.brandId==null && other.getBrandId()==null) || 
             (this.brandId!=null &&
              this.brandId.equals(other.getBrandId()))) &&
            ((this.registrationTime==null && other.getRegistrationTime()==null) || 
             (this.registrationTime!=null &&
              this.registrationTime.equals(other.getRegistrationTime()))) &&
            ((this.lang==null && other.getLang()==null) || 
             (this.lang!=null &&
              this.lang.equals(other.getLang()))) &&
            ((this.SMSLang==null && other.getSMSLang()==null) || 
             (this.SMSLang!=null &&
              this.SMSLang.equals(other.getSMSLang()))) &&
            ((this.USSDLang==null && other.getUSSDLang()==null) || 
             (this.USSDLang!=null &&
              this.USSDLang.equals(other.getUSSDLang()))) &&
            ((this.paidMode==null && other.getPaidMode()==null) || 
             (this.paidMode!=null &&
              this.paidMode.equals(other.getPaidMode()))) &&
            ((this.initialCredit==null && other.getInitialCredit()==null) || 
             (this.initialCredit!=null &&
              this.initialCredit.equals(other.getInitialCredit()))) &&
            ((this.belToAreaID==null && other.getBelToAreaID()==null) || 
             (this.belToAreaID!=null &&
              this.belToAreaID.equals(other.getBelToAreaID()))) &&
            ((this.mainProductID==null && other.getMainProductID()==null) || 
             (this.mainProductID!=null &&
              this.mainProductID.equals(other.getMainProductID()))) &&
            ((this.simpleProperty==null && other.getSimpleProperty()==null) || 
             (this.simpleProperty!=null &&
              java.util.Arrays.equals(this.simpleProperty, other.getSimpleProperty()))) &&
            ((this.lastRechargeTime==null && other.getLastRechargeTime()==null) || 
             (this.lastRechargeTime!=null &&
              this.lastRechargeTime.equals(other.getLastRechargeTime()))) &&
            ((this.lastCallTime==null && other.getLastCallTime()==null) || 
             (this.lastCallTime!=null &&
              this.lastCallTime.equals(other.getLastCallTime()))) &&
            ((this.SMSAmount==null && other.getSMSAmount()==null) || 
             (this.SMSAmount!=null &&
              this.SMSAmount.equals(other.getSMSAmount())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getBrandId() != null) {
            _hashCode += getBrandId().hashCode();
        }
        if (getRegistrationTime() != null) {
            _hashCode += getRegistrationTime().hashCode();
        }
        if (getLang() != null) {
            _hashCode += getLang().hashCode();
        }
        if (getSMSLang() != null) {
            _hashCode += getSMSLang().hashCode();
        }
        if (getUSSDLang() != null) {
            _hashCode += getUSSDLang().hashCode();
        }
        if (getPaidMode() != null) {
            _hashCode += getPaidMode().hashCode();
        }
        if (getInitialCredit() != null) {
            _hashCode += getInitialCredit().hashCode();
        }
        if (getBelToAreaID() != null) {
            _hashCode += getBelToAreaID().hashCode();
        }
        if (getMainProductID() != null) {
            _hashCode += getMainProductID().hashCode();
        }
        if (getSimpleProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimpleProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimpleProperty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastRechargeTime() != null) {
            _hashCode += getLastRechargeTime().hashCode();
        }
        if (getLastCallTime() != null) {
            _hashCode += getLastCallTime().hashCode();
        }
        if (getSMSAmount() != null) {
            _hashCode += getSMSAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BrandId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "RegistrationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Lang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSLang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SMSLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USSDLang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "USSDLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "PaidMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Paymode"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "InitialCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belToAreaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BelToAreaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainProductID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "MainProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simpleProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SimpleProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SimpleProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRechargeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "LastRechargeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCallTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "LastCallTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SMSAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
