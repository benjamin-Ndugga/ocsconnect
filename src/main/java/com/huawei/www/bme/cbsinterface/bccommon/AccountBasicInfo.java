/**
 * AccountBasicInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class AccountBasicInfo  implements java.io.Serializable {
    private java.lang.String acctName;

    /* It is language code of bill. */
    private java.lang.String billLang;

    private java.lang.String dunningFlag;

    private java.lang.String lateFeeChargeable;

    private java.lang.String redlistFlag;

    private com.huawei.www.bme.cbsinterface.bccommon.Contact contactInfo;

    private com.huawei.www.bme.cbsinterface.bccommon.FreeBillMedium[] freeBillMedium;

    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] acctProperty;

    public AccountBasicInfo() {
    }

    public AccountBasicInfo(
           java.lang.String acctName,
           java.lang.String billLang,
           java.lang.String dunningFlag,
           java.lang.String lateFeeChargeable,
           java.lang.String redlistFlag,
           com.huawei.www.bme.cbsinterface.bccommon.Contact contactInfo,
           com.huawei.www.bme.cbsinterface.bccommon.FreeBillMedium[] freeBillMedium,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] acctProperty) {
           this.acctName = acctName;
           this.billLang = billLang;
           this.dunningFlag = dunningFlag;
           this.lateFeeChargeable = lateFeeChargeable;
           this.redlistFlag = redlistFlag;
           this.contactInfo = contactInfo;
           this.freeBillMedium = freeBillMedium;
           this.acctProperty = acctProperty;
    }


    /**
     * Gets the acctName value for this AccountBasicInfo.
     * 
     * @return acctName
     */
    public java.lang.String getAcctName() {
        return acctName;
    }


    /**
     * Sets the acctName value for this AccountBasicInfo.
     * 
     * @param acctName
     */
    public void setAcctName(java.lang.String acctName) {
        this.acctName = acctName;
    }


    /**
     * Gets the billLang value for this AccountBasicInfo.
     * 
     * @return billLang   * It is language code of bill.
     */
    public java.lang.String getBillLang() {
        return billLang;
    }


    /**
     * Sets the billLang value for this AccountBasicInfo.
     * 
     * @param billLang   * It is language code of bill.
     */
    public void setBillLang(java.lang.String billLang) {
        this.billLang = billLang;
    }


    /**
     * Gets the dunningFlag value for this AccountBasicInfo.
     * 
     * @return dunningFlag
     */
    public java.lang.String getDunningFlag() {
        return dunningFlag;
    }


    /**
     * Sets the dunningFlag value for this AccountBasicInfo.
     * 
     * @param dunningFlag
     */
    public void setDunningFlag(java.lang.String dunningFlag) {
        this.dunningFlag = dunningFlag;
    }


    /**
     * Gets the lateFeeChargeable value for this AccountBasicInfo.
     * 
     * @return lateFeeChargeable
     */
    public java.lang.String getLateFeeChargeable() {
        return lateFeeChargeable;
    }


    /**
     * Sets the lateFeeChargeable value for this AccountBasicInfo.
     * 
     * @param lateFeeChargeable
     */
    public void setLateFeeChargeable(java.lang.String lateFeeChargeable) {
        this.lateFeeChargeable = lateFeeChargeable;
    }


    /**
     * Gets the redlistFlag value for this AccountBasicInfo.
     * 
     * @return redlistFlag
     */
    public java.lang.String getRedlistFlag() {
        return redlistFlag;
    }


    /**
     * Sets the redlistFlag value for this AccountBasicInfo.
     * 
     * @param redlistFlag
     */
    public void setRedlistFlag(java.lang.String redlistFlag) {
        this.redlistFlag = redlistFlag;
    }


    /**
     * Gets the contactInfo value for this AccountBasicInfo.
     * 
     * @return contactInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Contact getContactInfo() {
        return contactInfo;
    }


    /**
     * Sets the contactInfo value for this AccountBasicInfo.
     * 
     * @param contactInfo
     */
    public void setContactInfo(com.huawei.www.bme.cbsinterface.bccommon.Contact contactInfo) {
        this.contactInfo = contactInfo;
    }


    /**
     * Gets the freeBillMedium value for this AccountBasicInfo.
     * 
     * @return freeBillMedium
     */
    public com.huawei.www.bme.cbsinterface.bccommon.FreeBillMedium[] getFreeBillMedium() {
        return freeBillMedium;
    }


    /**
     * Sets the freeBillMedium value for this AccountBasicInfo.
     * 
     * @param freeBillMedium
     */
    public void setFreeBillMedium(com.huawei.www.bme.cbsinterface.bccommon.FreeBillMedium[] freeBillMedium) {
        this.freeBillMedium = freeBillMedium;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.FreeBillMedium getFreeBillMedium(int i) {
        return this.freeBillMedium[i];
    }

    public void setFreeBillMedium(int i, com.huawei.www.bme.cbsinterface.bccommon.FreeBillMedium _value) {
        this.freeBillMedium[i] = _value;
    }


    /**
     * Gets the acctProperty value for this AccountBasicInfo.
     * 
     * @return acctProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getAcctProperty() {
        return acctProperty;
    }


    /**
     * Sets the acctProperty value for this AccountBasicInfo.
     * 
     * @param acctProperty
     */
    public void setAcctProperty(com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] acctProperty) {
        this.acctProperty = acctProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty getAcctProperty(int i) {
        return this.acctProperty[i];
    }

    public void setAcctProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty _value) {
        this.acctProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountBasicInfo)) return false;
        AccountBasicInfo other = (AccountBasicInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctName==null && other.getAcctName()==null) || 
             (this.acctName!=null &&
              this.acctName.equals(other.getAcctName()))) &&
            ((this.billLang==null && other.getBillLang()==null) || 
             (this.billLang!=null &&
              this.billLang.equals(other.getBillLang()))) &&
            ((this.dunningFlag==null && other.getDunningFlag()==null) || 
             (this.dunningFlag!=null &&
              this.dunningFlag.equals(other.getDunningFlag()))) &&
            ((this.lateFeeChargeable==null && other.getLateFeeChargeable()==null) || 
             (this.lateFeeChargeable!=null &&
              this.lateFeeChargeable.equals(other.getLateFeeChargeable()))) &&
            ((this.redlistFlag==null && other.getRedlistFlag()==null) || 
             (this.redlistFlag!=null &&
              this.redlistFlag.equals(other.getRedlistFlag()))) &&
            ((this.contactInfo==null && other.getContactInfo()==null) || 
             (this.contactInfo!=null &&
              this.contactInfo.equals(other.getContactInfo()))) &&
            ((this.freeBillMedium==null && other.getFreeBillMedium()==null) || 
             (this.freeBillMedium!=null &&
              java.util.Arrays.equals(this.freeBillMedium, other.getFreeBillMedium()))) &&
            ((this.acctProperty==null && other.getAcctProperty()==null) || 
             (this.acctProperty!=null &&
              java.util.Arrays.equals(this.acctProperty, other.getAcctProperty())));
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
        if (getAcctName() != null) {
            _hashCode += getAcctName().hashCode();
        }
        if (getBillLang() != null) {
            _hashCode += getBillLang().hashCode();
        }
        if (getDunningFlag() != null) {
            _hashCode += getDunningFlag().hashCode();
        }
        if (getLateFeeChargeable() != null) {
            _hashCode += getLateFeeChargeable().hashCode();
        }
        if (getRedlistFlag() != null) {
            _hashCode += getRedlistFlag().hashCode();
        }
        if (getContactInfo() != null) {
            _hashCode += getContactInfo().hashCode();
        }
        if (getFreeBillMedium() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeBillMedium());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeBillMedium(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAcctProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcctProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcctProperty(), i);
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
        new org.apache.axis.description.TypeDesc(AccountBasicInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AccountBasicInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AcctName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billLang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BillLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dunningFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "DunningFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lateFeeChargeable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "LateFeeChargeable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redlistFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "RedlistFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ContactInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeBillMedium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "FreeBillMedium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "FreeBillMedium"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "AcctProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SimpleProperty"));
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
