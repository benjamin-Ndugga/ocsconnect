/**
 * ChangeOwnerRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ChangeOwnerRequest  implements java.io.Serializable {
    private java.lang.String subscriberNo;

    private java.lang.String name;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.IDType idType;

    private java.lang.String idCode;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.Gender gender;

    private java.lang.String birthday;

    private java.lang.String address;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.CustomerGrade grade;

    private java.lang.String belToAreaID;

    private java.lang.String zipCode;

    private java.lang.String email;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty;

    /* 4050000,Just change customer informatio
     * 4050001,Must new customer
     * 4050002,Must new subscriber
     * 4050003,Must new Account
     * 4050004,all change to new */
    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeOwnerRequestChangeMode changeMode;

    public ChangeOwnerRequest() {
    }

    public ChangeOwnerRequest(
           java.lang.String subscriberNo,
           java.lang.String name,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.IDType idType,
           java.lang.String idCode,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.Gender gender,
           java.lang.String birthday,
           java.lang.String address,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.CustomerGrade grade,
           java.lang.String belToAreaID,
           java.lang.String zipCode,
           java.lang.String email,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeOwnerRequestChangeMode changeMode) {
           this.subscriberNo = subscriberNo;
           this.name = name;
           this.idType = idType;
           this.idCode = idCode;
           this.gender = gender;
           this.birthday = birthday;
           this.address = address;
           this.grade = grade;
           this.belToAreaID = belToAreaID;
           this.zipCode = zipCode;
           this.email = email;
           this.simpleProperty = simpleProperty;
           this.changeMode = changeMode;
    }


    /**
     * Gets the subscriberNo value for this ChangeOwnerRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this ChangeOwnerRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the name value for this ChangeOwnerRequest.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ChangeOwnerRequest.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the idType value for this ChangeOwnerRequest.
     * 
     * @return idType
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.IDType getIdType() {
        return idType;
    }


    /**
     * Sets the idType value for this ChangeOwnerRequest.
     * 
     * @param idType
     */
    public void setIdType(com.huawei.www.bme.cbsinterface.cbs.businessmgr.IDType idType) {
        this.idType = idType;
    }


    /**
     * Gets the idCode value for this ChangeOwnerRequest.
     * 
     * @return idCode
     */
    public java.lang.String getIdCode() {
        return idCode;
    }


    /**
     * Sets the idCode value for this ChangeOwnerRequest.
     * 
     * @param idCode
     */
    public void setIdCode(java.lang.String idCode) {
        this.idCode = idCode;
    }


    /**
     * Gets the gender value for this ChangeOwnerRequest.
     * 
     * @return gender
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.Gender getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this ChangeOwnerRequest.
     * 
     * @param gender
     */
    public void setGender(com.huawei.www.bme.cbsinterface.cbs.businessmgr.Gender gender) {
        this.gender = gender;
    }


    /**
     * Gets the birthday value for this ChangeOwnerRequest.
     * 
     * @return birthday
     */
    public java.lang.String getBirthday() {
        return birthday;
    }


    /**
     * Sets the birthday value for this ChangeOwnerRequest.
     * 
     * @param birthday
     */
    public void setBirthday(java.lang.String birthday) {
        this.birthday = birthday;
    }


    /**
     * Gets the address value for this ChangeOwnerRequest.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ChangeOwnerRequest.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the grade value for this ChangeOwnerRequest.
     * 
     * @return grade
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.CustomerGrade getGrade() {
        return grade;
    }


    /**
     * Sets the grade value for this ChangeOwnerRequest.
     * 
     * @param grade
     */
    public void setGrade(com.huawei.www.bme.cbsinterface.cbs.businessmgr.CustomerGrade grade) {
        this.grade = grade;
    }


    /**
     * Gets the belToAreaID value for this ChangeOwnerRequest.
     * 
     * @return belToAreaID
     */
    public java.lang.String getBelToAreaID() {
        return belToAreaID;
    }


    /**
     * Sets the belToAreaID value for this ChangeOwnerRequest.
     * 
     * @param belToAreaID
     */
    public void setBelToAreaID(java.lang.String belToAreaID) {
        this.belToAreaID = belToAreaID;
    }


    /**
     * Gets the zipCode value for this ChangeOwnerRequest.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this ChangeOwnerRequest.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the email value for this ChangeOwnerRequest.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ChangeOwnerRequest.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the simpleProperty value for this ChangeOwnerRequest.
     * 
     * @return simpleProperty
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] getSimpleProperty() {
        return simpleProperty;
    }


    /**
     * Sets the simpleProperty value for this ChangeOwnerRequest.
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
     * Gets the changeMode value for this ChangeOwnerRequest.
     * 
     * @return changeMode   * 4050000,Just change customer informatio
     * 4050001,Must new customer
     * 4050002,Must new subscriber
     * 4050003,Must new Account
     * 4050004,all change to new
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeOwnerRequestChangeMode getChangeMode() {
        return changeMode;
    }


    /**
     * Sets the changeMode value for this ChangeOwnerRequest.
     * 
     * @param changeMode   * 4050000,Just change customer informatio
     * 4050001,Must new customer
     * 4050002,Must new subscriber
     * 4050003,Must new Account
     * 4050004,all change to new
     */
    public void setChangeMode(com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeOwnerRequestChangeMode changeMode) {
        this.changeMode = changeMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeOwnerRequest)) return false;
        ChangeOwnerRequest other = (ChangeOwnerRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.idType==null && other.getIdType()==null) || 
             (this.idType!=null &&
              this.idType.equals(other.getIdType()))) &&
            ((this.idCode==null && other.getIdCode()==null) || 
             (this.idCode!=null &&
              this.idCode.equals(other.getIdCode()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.birthday==null && other.getBirthday()==null) || 
             (this.birthday!=null &&
              this.birthday.equals(other.getBirthday()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.grade==null && other.getGrade()==null) || 
             (this.grade!=null &&
              this.grade.equals(other.getGrade()))) &&
            ((this.belToAreaID==null && other.getBelToAreaID()==null) || 
             (this.belToAreaID!=null &&
              this.belToAreaID.equals(other.getBelToAreaID()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.simpleProperty==null && other.getSimpleProperty()==null) || 
             (this.simpleProperty!=null &&
              java.util.Arrays.equals(this.simpleProperty, other.getSimpleProperty()))) &&
            ((this.changeMode==null && other.getChangeMode()==null) || 
             (this.changeMode!=null &&
              this.changeMode.equals(other.getChangeMode())));
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
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIdType() != null) {
            _hashCode += getIdType().hashCode();
        }
        if (getIdCode() != null) {
            _hashCode += getIdCode().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getBirthday() != null) {
            _hashCode += getBirthday().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getGrade() != null) {
            _hashCode += getGrade().hashCode();
        }
        if (getBelToAreaID() != null) {
            _hashCode += getBelToAreaID().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
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
        if (getChangeMode() != null) {
            _hashCode += getChangeMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeOwnerRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeOwnerRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IDType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IdCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Gender"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Birthday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Grade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CustomerGrade"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belToAreaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BelToAreaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("changeMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ChangeOwnerRequest>ChangeMode"));
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
