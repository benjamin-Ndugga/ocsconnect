/**
 * OrgInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class OrgInfo  implements java.io.Serializable {
    /* It is identification type of a Org. For example: Business Register
     * Number...... */
    private java.lang.String IDType;

    private java.lang.String IDNumber;

    private java.lang.String IDValidity;

    private java.lang.String orgType;

    private java.lang.String orgName;

    private java.lang.String orgShortName;

    private java.lang.String orgLevel;

    private java.lang.String orgAddressKey;

    /* It is the size code of a organization. */
    private java.lang.String orgSize;

    /* It is the industry code the organization belongs to. */
    private java.lang.String industry;

    /* It is the sub-industry code the organization belongs to. */
    private java.lang.String subIndustry;

    private java.lang.String orgPhoneNumber;

    private java.lang.String orgFaxNumber;

    private java.lang.String orgEmail;

    private java.lang.String orgWebSite;

    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] orgProperty;

    public OrgInfo() {
    }

    public OrgInfo(
           java.lang.String IDType,
           java.lang.String IDNumber,
           java.lang.String IDValidity,
           java.lang.String orgType,
           java.lang.String orgName,
           java.lang.String orgShortName,
           java.lang.String orgLevel,
           java.lang.String orgAddressKey,
           java.lang.String orgSize,
           java.lang.String industry,
           java.lang.String subIndustry,
           java.lang.String orgPhoneNumber,
           java.lang.String orgFaxNumber,
           java.lang.String orgEmail,
           java.lang.String orgWebSite,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] orgProperty) {
           this.IDType = IDType;
           this.IDNumber = IDNumber;
           this.IDValidity = IDValidity;
           this.orgType = orgType;
           this.orgName = orgName;
           this.orgShortName = orgShortName;
           this.orgLevel = orgLevel;
           this.orgAddressKey = orgAddressKey;
           this.orgSize = orgSize;
           this.industry = industry;
           this.subIndustry = subIndustry;
           this.orgPhoneNumber = orgPhoneNumber;
           this.orgFaxNumber = orgFaxNumber;
           this.orgEmail = orgEmail;
           this.orgWebSite = orgWebSite;
           this.orgProperty = orgProperty;
    }


    /**
     * Gets the IDType value for this OrgInfo.
     * 
     * @return IDType   * It is identification type of a Org. For example: Business Register
     * Number......
     */
    public java.lang.String getIDType() {
        return IDType;
    }


    /**
     * Sets the IDType value for this OrgInfo.
     * 
     * @param IDType   * It is identification type of a Org. For example: Business Register
     * Number......
     */
    public void setIDType(java.lang.String IDType) {
        this.IDType = IDType;
    }


    /**
     * Gets the IDNumber value for this OrgInfo.
     * 
     * @return IDNumber
     */
    public java.lang.String getIDNumber() {
        return IDNumber;
    }


    /**
     * Sets the IDNumber value for this OrgInfo.
     * 
     * @param IDNumber
     */
    public void setIDNumber(java.lang.String IDNumber) {
        this.IDNumber = IDNumber;
    }


    /**
     * Gets the IDValidity value for this OrgInfo.
     * 
     * @return IDValidity
     */
    public java.lang.String getIDValidity() {
        return IDValidity;
    }


    /**
     * Sets the IDValidity value for this OrgInfo.
     * 
     * @param IDValidity
     */
    public void setIDValidity(java.lang.String IDValidity) {
        this.IDValidity = IDValidity;
    }


    /**
     * Gets the orgType value for this OrgInfo.
     * 
     * @return orgType
     */
    public java.lang.String getOrgType() {
        return orgType;
    }


    /**
     * Sets the orgType value for this OrgInfo.
     * 
     * @param orgType
     */
    public void setOrgType(java.lang.String orgType) {
        this.orgType = orgType;
    }


    /**
     * Gets the orgName value for this OrgInfo.
     * 
     * @return orgName
     */
    public java.lang.String getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this OrgInfo.
     * 
     * @param orgName
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }


    /**
     * Gets the orgShortName value for this OrgInfo.
     * 
     * @return orgShortName
     */
    public java.lang.String getOrgShortName() {
        return orgShortName;
    }


    /**
     * Sets the orgShortName value for this OrgInfo.
     * 
     * @param orgShortName
     */
    public void setOrgShortName(java.lang.String orgShortName) {
        this.orgShortName = orgShortName;
    }


    /**
     * Gets the orgLevel value for this OrgInfo.
     * 
     * @return orgLevel
     */
    public java.lang.String getOrgLevel() {
        return orgLevel;
    }


    /**
     * Sets the orgLevel value for this OrgInfo.
     * 
     * @param orgLevel
     */
    public void setOrgLevel(java.lang.String orgLevel) {
        this.orgLevel = orgLevel;
    }


    /**
     * Gets the orgAddressKey value for this OrgInfo.
     * 
     * @return orgAddressKey
     */
    public java.lang.String getOrgAddressKey() {
        return orgAddressKey;
    }


    /**
     * Sets the orgAddressKey value for this OrgInfo.
     * 
     * @param orgAddressKey
     */
    public void setOrgAddressKey(java.lang.String orgAddressKey) {
        this.orgAddressKey = orgAddressKey;
    }


    /**
     * Gets the orgSize value for this OrgInfo.
     * 
     * @return orgSize   * It is the size code of a organization.
     */
    public java.lang.String getOrgSize() {
        return orgSize;
    }


    /**
     * Sets the orgSize value for this OrgInfo.
     * 
     * @param orgSize   * It is the size code of a organization.
     */
    public void setOrgSize(java.lang.String orgSize) {
        this.orgSize = orgSize;
    }


    /**
     * Gets the industry value for this OrgInfo.
     * 
     * @return industry   * It is the industry code the organization belongs to.
     */
    public java.lang.String getIndustry() {
        return industry;
    }


    /**
     * Sets the industry value for this OrgInfo.
     * 
     * @param industry   * It is the industry code the organization belongs to.
     */
    public void setIndustry(java.lang.String industry) {
        this.industry = industry;
    }


    /**
     * Gets the subIndustry value for this OrgInfo.
     * 
     * @return subIndustry   * It is the sub-industry code the organization belongs to.
     */
    public java.lang.String getSubIndustry() {
        return subIndustry;
    }


    /**
     * Sets the subIndustry value for this OrgInfo.
     * 
     * @param subIndustry   * It is the sub-industry code the organization belongs to.
     */
    public void setSubIndustry(java.lang.String subIndustry) {
        this.subIndustry = subIndustry;
    }


    /**
     * Gets the orgPhoneNumber value for this OrgInfo.
     * 
     * @return orgPhoneNumber
     */
    public java.lang.String getOrgPhoneNumber() {
        return orgPhoneNumber;
    }


    /**
     * Sets the orgPhoneNumber value for this OrgInfo.
     * 
     * @param orgPhoneNumber
     */
    public void setOrgPhoneNumber(java.lang.String orgPhoneNumber) {
        this.orgPhoneNumber = orgPhoneNumber;
    }


    /**
     * Gets the orgFaxNumber value for this OrgInfo.
     * 
     * @return orgFaxNumber
     */
    public java.lang.String getOrgFaxNumber() {
        return orgFaxNumber;
    }


    /**
     * Sets the orgFaxNumber value for this OrgInfo.
     * 
     * @param orgFaxNumber
     */
    public void setOrgFaxNumber(java.lang.String orgFaxNumber) {
        this.orgFaxNumber = orgFaxNumber;
    }


    /**
     * Gets the orgEmail value for this OrgInfo.
     * 
     * @return orgEmail
     */
    public java.lang.String getOrgEmail() {
        return orgEmail;
    }


    /**
     * Sets the orgEmail value for this OrgInfo.
     * 
     * @param orgEmail
     */
    public void setOrgEmail(java.lang.String orgEmail) {
        this.orgEmail = orgEmail;
    }


    /**
     * Gets the orgWebSite value for this OrgInfo.
     * 
     * @return orgWebSite
     */
    public java.lang.String getOrgWebSite() {
        return orgWebSite;
    }


    /**
     * Sets the orgWebSite value for this OrgInfo.
     * 
     * @param orgWebSite
     */
    public void setOrgWebSite(java.lang.String orgWebSite) {
        this.orgWebSite = orgWebSite;
    }


    /**
     * Gets the orgProperty value for this OrgInfo.
     * 
     * @return orgProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getOrgProperty() {
        return orgProperty;
    }


    /**
     * Sets the orgProperty value for this OrgInfo.
     * 
     * @param orgProperty
     */
    public void setOrgProperty(com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] orgProperty) {
        this.orgProperty = orgProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty getOrgProperty(int i) {
        return this.orgProperty[i];
    }

    public void setOrgProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty _value) {
        this.orgProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrgInfo)) return false;
        OrgInfo other = (OrgInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDType==null && other.getIDType()==null) || 
             (this.IDType!=null &&
              this.IDType.equals(other.getIDType()))) &&
            ((this.IDNumber==null && other.getIDNumber()==null) || 
             (this.IDNumber!=null &&
              this.IDNumber.equals(other.getIDNumber()))) &&
            ((this.IDValidity==null && other.getIDValidity()==null) || 
             (this.IDValidity!=null &&
              this.IDValidity.equals(other.getIDValidity()))) &&
            ((this.orgType==null && other.getOrgType()==null) || 
             (this.orgType!=null &&
              this.orgType.equals(other.getOrgType()))) &&
            ((this.orgName==null && other.getOrgName()==null) || 
             (this.orgName!=null &&
              this.orgName.equals(other.getOrgName()))) &&
            ((this.orgShortName==null && other.getOrgShortName()==null) || 
             (this.orgShortName!=null &&
              this.orgShortName.equals(other.getOrgShortName()))) &&
            ((this.orgLevel==null && other.getOrgLevel()==null) || 
             (this.orgLevel!=null &&
              this.orgLevel.equals(other.getOrgLevel()))) &&
            ((this.orgAddressKey==null && other.getOrgAddressKey()==null) || 
             (this.orgAddressKey!=null &&
              this.orgAddressKey.equals(other.getOrgAddressKey()))) &&
            ((this.orgSize==null && other.getOrgSize()==null) || 
             (this.orgSize!=null &&
              this.orgSize.equals(other.getOrgSize()))) &&
            ((this.industry==null && other.getIndustry()==null) || 
             (this.industry!=null &&
              this.industry.equals(other.getIndustry()))) &&
            ((this.subIndustry==null && other.getSubIndustry()==null) || 
             (this.subIndustry!=null &&
              this.subIndustry.equals(other.getSubIndustry()))) &&
            ((this.orgPhoneNumber==null && other.getOrgPhoneNumber()==null) || 
             (this.orgPhoneNumber!=null &&
              this.orgPhoneNumber.equals(other.getOrgPhoneNumber()))) &&
            ((this.orgFaxNumber==null && other.getOrgFaxNumber()==null) || 
             (this.orgFaxNumber!=null &&
              this.orgFaxNumber.equals(other.getOrgFaxNumber()))) &&
            ((this.orgEmail==null && other.getOrgEmail()==null) || 
             (this.orgEmail!=null &&
              this.orgEmail.equals(other.getOrgEmail()))) &&
            ((this.orgWebSite==null && other.getOrgWebSite()==null) || 
             (this.orgWebSite!=null &&
              this.orgWebSite.equals(other.getOrgWebSite()))) &&
            ((this.orgProperty==null && other.getOrgProperty()==null) || 
             (this.orgProperty!=null &&
              java.util.Arrays.equals(this.orgProperty, other.getOrgProperty())));
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
        if (getIDType() != null) {
            _hashCode += getIDType().hashCode();
        }
        if (getIDNumber() != null) {
            _hashCode += getIDNumber().hashCode();
        }
        if (getIDValidity() != null) {
            _hashCode += getIDValidity().hashCode();
        }
        if (getOrgType() != null) {
            _hashCode += getOrgType().hashCode();
        }
        if (getOrgName() != null) {
            _hashCode += getOrgName().hashCode();
        }
        if (getOrgShortName() != null) {
            _hashCode += getOrgShortName().hashCode();
        }
        if (getOrgLevel() != null) {
            _hashCode += getOrgLevel().hashCode();
        }
        if (getOrgAddressKey() != null) {
            _hashCode += getOrgAddressKey().hashCode();
        }
        if (getOrgSize() != null) {
            _hashCode += getOrgSize().hashCode();
        }
        if (getIndustry() != null) {
            _hashCode += getIndustry().hashCode();
        }
        if (getSubIndustry() != null) {
            _hashCode += getSubIndustry().hashCode();
        }
        if (getOrgPhoneNumber() != null) {
            _hashCode += getOrgPhoneNumber().hashCode();
        }
        if (getOrgFaxNumber() != null) {
            _hashCode += getOrgFaxNumber().hashCode();
        }
        if (getOrgEmail() != null) {
            _hashCode += getOrgEmail().hashCode();
        }
        if (getOrgWebSite() != null) {
            _hashCode += getOrgWebSite().hashCode();
        }
        if (getOrgProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrgProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrgProperty(), i);
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
        new org.apache.axis.description.TypeDesc(OrgInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OrgInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "IDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "IDNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "IDValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OrgType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OrgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgShortName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OrgShortName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OrgLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgAddressKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OrgAddressKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OrgSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Industry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subIndustry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubIndustry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OrgPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgFaxNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OrgFaxNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OrgEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgWebSite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OrgWebSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OrgProperty"));
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
