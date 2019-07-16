/**
 * ChangeCustBasicInforRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ChangeCustBasicInforRequest  implements java.io.Serializable {
    private java.lang.String subscriberNo;

    private java.lang.String name;

    private java.lang.String code;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.IDType idType;

    private java.lang.String idCode;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.Gender gender;

    private java.lang.String birthday;

    private java.lang.String address;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.CustomerGrade grade;

    private java.lang.String belToAreaID;

    private java.lang.String email;

    private java.lang.String zipCode;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty;

    private java.math.BigInteger customerType;

    private java.math.BigInteger country;

    private java.math.BigInteger nativePlace;

    private java.math.BigInteger nationType;

    private java.math.BigInteger jobType;

    private java.math.BigInteger education;

    private java.math.BigInteger creditGrade;

    private java.math.BigInteger creditAmount;

    private java.math.BigInteger customerState;

    private java.math.BigInteger maritalStatus;

    private java.lang.String skill;

    private java.lang.String socialNo;

    public ChangeCustBasicInforRequest() {
    }

    public ChangeCustBasicInforRequest(
           java.lang.String subscriberNo,
           java.lang.String name,
           java.lang.String code,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.IDType idType,
           java.lang.String idCode,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.Gender gender,
           java.lang.String birthday,
           java.lang.String address,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.CustomerGrade grade,
           java.lang.String belToAreaID,
           java.lang.String email,
           java.lang.String zipCode,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty,
           java.math.BigInteger customerType,
           java.math.BigInteger country,
           java.math.BigInteger nativePlace,
           java.math.BigInteger nationType,
           java.math.BigInteger jobType,
           java.math.BigInteger education,
           java.math.BigInteger creditGrade,
           java.math.BigInteger creditAmount,
           java.math.BigInteger customerState,
           java.math.BigInteger maritalStatus,
           java.lang.String skill,
           java.lang.String socialNo) {
           this.subscriberNo = subscriberNo;
           this.name = name;
           this.code = code;
           this.idType = idType;
           this.idCode = idCode;
           this.gender = gender;
           this.birthday = birthday;
           this.address = address;
           this.grade = grade;
           this.belToAreaID = belToAreaID;
           this.email = email;
           this.zipCode = zipCode;
           this.simpleProperty = simpleProperty;
           this.customerType = customerType;
           this.country = country;
           this.nativePlace = nativePlace;
           this.nationType = nationType;
           this.jobType = jobType;
           this.education = education;
           this.creditGrade = creditGrade;
           this.creditAmount = creditAmount;
           this.customerState = customerState;
           this.maritalStatus = maritalStatus;
           this.skill = skill;
           this.socialNo = socialNo;
    }


    /**
     * Gets the subscriberNo value for this ChangeCustBasicInforRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this ChangeCustBasicInforRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the name value for this ChangeCustBasicInforRequest.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ChangeCustBasicInforRequest.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the code value for this ChangeCustBasicInforRequest.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this ChangeCustBasicInforRequest.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the idType value for this ChangeCustBasicInforRequest.
     * 
     * @return idType
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.IDType getIdType() {
        return idType;
    }


    /**
     * Sets the idType value for this ChangeCustBasicInforRequest.
     * 
     * @param idType
     */
    public void setIdType(com.huawei.www.bme.cbsinterface.cbs.businessmgr.IDType idType) {
        this.idType = idType;
    }


    /**
     * Gets the idCode value for this ChangeCustBasicInforRequest.
     * 
     * @return idCode
     */
    public java.lang.String getIdCode() {
        return idCode;
    }


    /**
     * Sets the idCode value for this ChangeCustBasicInforRequest.
     * 
     * @param idCode
     */
    public void setIdCode(java.lang.String idCode) {
        this.idCode = idCode;
    }


    /**
     * Gets the gender value for this ChangeCustBasicInforRequest.
     * 
     * @return gender
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.Gender getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this ChangeCustBasicInforRequest.
     * 
     * @param gender
     */
    public void setGender(com.huawei.www.bme.cbsinterface.cbs.businessmgr.Gender gender) {
        this.gender = gender;
    }


    /**
     * Gets the birthday value for this ChangeCustBasicInforRequest.
     * 
     * @return birthday
     */
    public java.lang.String getBirthday() {
        return birthday;
    }


    /**
     * Sets the birthday value for this ChangeCustBasicInforRequest.
     * 
     * @param birthday
     */
    public void setBirthday(java.lang.String birthday) {
        this.birthday = birthday;
    }


    /**
     * Gets the address value for this ChangeCustBasicInforRequest.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ChangeCustBasicInforRequest.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the grade value for this ChangeCustBasicInforRequest.
     * 
     * @return grade
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.CustomerGrade getGrade() {
        return grade;
    }


    /**
     * Sets the grade value for this ChangeCustBasicInforRequest.
     * 
     * @param grade
     */
    public void setGrade(com.huawei.www.bme.cbsinterface.cbs.businessmgr.CustomerGrade grade) {
        this.grade = grade;
    }


    /**
     * Gets the belToAreaID value for this ChangeCustBasicInforRequest.
     * 
     * @return belToAreaID
     */
    public java.lang.String getBelToAreaID() {
        return belToAreaID;
    }


    /**
     * Sets the belToAreaID value for this ChangeCustBasicInforRequest.
     * 
     * @param belToAreaID
     */
    public void setBelToAreaID(java.lang.String belToAreaID) {
        this.belToAreaID = belToAreaID;
    }


    /**
     * Gets the email value for this ChangeCustBasicInforRequest.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ChangeCustBasicInforRequest.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the zipCode value for this ChangeCustBasicInforRequest.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this ChangeCustBasicInforRequest.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the simpleProperty value for this ChangeCustBasicInforRequest.
     * 
     * @return simpleProperty
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] getSimpleProperty() {
        return simpleProperty;
    }


    /**
     * Sets the simpleProperty value for this ChangeCustBasicInforRequest.
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
     * Gets the customerType value for this ChangeCustBasicInforRequest.
     * 
     * @return customerType
     */
    public java.math.BigInteger getCustomerType() {
        return customerType;
    }


    /**
     * Sets the customerType value for this ChangeCustBasicInforRequest.
     * 
     * @param customerType
     */
    public void setCustomerType(java.math.BigInteger customerType) {
        this.customerType = customerType;
    }


    /**
     * Gets the country value for this ChangeCustBasicInforRequest.
     * 
     * @return country
     */
    public java.math.BigInteger getCountry() {
        return country;
    }


    /**
     * Sets the country value for this ChangeCustBasicInforRequest.
     * 
     * @param country
     */
    public void setCountry(java.math.BigInteger country) {
        this.country = country;
    }


    /**
     * Gets the nativePlace value for this ChangeCustBasicInforRequest.
     * 
     * @return nativePlace
     */
    public java.math.BigInteger getNativePlace() {
        return nativePlace;
    }


    /**
     * Sets the nativePlace value for this ChangeCustBasicInforRequest.
     * 
     * @param nativePlace
     */
    public void setNativePlace(java.math.BigInteger nativePlace) {
        this.nativePlace = nativePlace;
    }


    /**
     * Gets the nationType value for this ChangeCustBasicInforRequest.
     * 
     * @return nationType
     */
    public java.math.BigInteger getNationType() {
        return nationType;
    }


    /**
     * Sets the nationType value for this ChangeCustBasicInforRequest.
     * 
     * @param nationType
     */
    public void setNationType(java.math.BigInteger nationType) {
        this.nationType = nationType;
    }


    /**
     * Gets the jobType value for this ChangeCustBasicInforRequest.
     * 
     * @return jobType
     */
    public java.math.BigInteger getJobType() {
        return jobType;
    }


    /**
     * Sets the jobType value for this ChangeCustBasicInforRequest.
     * 
     * @param jobType
     */
    public void setJobType(java.math.BigInteger jobType) {
        this.jobType = jobType;
    }


    /**
     * Gets the education value for this ChangeCustBasicInforRequest.
     * 
     * @return education
     */
    public java.math.BigInteger getEducation() {
        return education;
    }


    /**
     * Sets the education value for this ChangeCustBasicInforRequest.
     * 
     * @param education
     */
    public void setEducation(java.math.BigInteger education) {
        this.education = education;
    }


    /**
     * Gets the creditGrade value for this ChangeCustBasicInforRequest.
     * 
     * @return creditGrade
     */
    public java.math.BigInteger getCreditGrade() {
        return creditGrade;
    }


    /**
     * Sets the creditGrade value for this ChangeCustBasicInforRequest.
     * 
     * @param creditGrade
     */
    public void setCreditGrade(java.math.BigInteger creditGrade) {
        this.creditGrade = creditGrade;
    }


    /**
     * Gets the creditAmount value for this ChangeCustBasicInforRequest.
     * 
     * @return creditAmount
     */
    public java.math.BigInteger getCreditAmount() {
        return creditAmount;
    }


    /**
     * Sets the creditAmount value for this ChangeCustBasicInforRequest.
     * 
     * @param creditAmount
     */
    public void setCreditAmount(java.math.BigInteger creditAmount) {
        this.creditAmount = creditAmount;
    }


    /**
     * Gets the customerState value for this ChangeCustBasicInforRequest.
     * 
     * @return customerState
     */
    public java.math.BigInteger getCustomerState() {
        return customerState;
    }


    /**
     * Sets the customerState value for this ChangeCustBasicInforRequest.
     * 
     * @param customerState
     */
    public void setCustomerState(java.math.BigInteger customerState) {
        this.customerState = customerState;
    }


    /**
     * Gets the maritalStatus value for this ChangeCustBasicInforRequest.
     * 
     * @return maritalStatus
     */
    public java.math.BigInteger getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this ChangeCustBasicInforRequest.
     * 
     * @param maritalStatus
     */
    public void setMaritalStatus(java.math.BigInteger maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    /**
     * Gets the skill value for this ChangeCustBasicInforRequest.
     * 
     * @return skill
     */
    public java.lang.String getSkill() {
        return skill;
    }


    /**
     * Sets the skill value for this ChangeCustBasicInforRequest.
     * 
     * @param skill
     */
    public void setSkill(java.lang.String skill) {
        this.skill = skill;
    }


    /**
     * Gets the socialNo value for this ChangeCustBasicInforRequest.
     * 
     * @return socialNo
     */
    public java.lang.String getSocialNo() {
        return socialNo;
    }


    /**
     * Sets the socialNo value for this ChangeCustBasicInforRequest.
     * 
     * @param socialNo
     */
    public void setSocialNo(java.lang.String socialNo) {
        this.socialNo = socialNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeCustBasicInforRequest)) return false;
        ChangeCustBasicInforRequest other = (ChangeCustBasicInforRequest) obj;
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
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
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
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.simpleProperty==null && other.getSimpleProperty()==null) || 
             (this.simpleProperty!=null &&
              java.util.Arrays.equals(this.simpleProperty, other.getSimpleProperty()))) &&
            ((this.customerType==null && other.getCustomerType()==null) || 
             (this.customerType!=null &&
              this.customerType.equals(other.getCustomerType()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.nativePlace==null && other.getNativePlace()==null) || 
             (this.nativePlace!=null &&
              this.nativePlace.equals(other.getNativePlace()))) &&
            ((this.nationType==null && other.getNationType()==null) || 
             (this.nationType!=null &&
              this.nationType.equals(other.getNationType()))) &&
            ((this.jobType==null && other.getJobType()==null) || 
             (this.jobType!=null &&
              this.jobType.equals(other.getJobType()))) &&
            ((this.education==null && other.getEducation()==null) || 
             (this.education!=null &&
              this.education.equals(other.getEducation()))) &&
            ((this.creditGrade==null && other.getCreditGrade()==null) || 
             (this.creditGrade!=null &&
              this.creditGrade.equals(other.getCreditGrade()))) &&
            ((this.creditAmount==null && other.getCreditAmount()==null) || 
             (this.creditAmount!=null &&
              this.creditAmount.equals(other.getCreditAmount()))) &&
            ((this.customerState==null && other.getCustomerState()==null) || 
             (this.customerState!=null &&
              this.customerState.equals(other.getCustomerState()))) &&
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              this.maritalStatus.equals(other.getMaritalStatus()))) &&
            ((this.skill==null && other.getSkill()==null) || 
             (this.skill!=null &&
              this.skill.equals(other.getSkill()))) &&
            ((this.socialNo==null && other.getSocialNo()==null) || 
             (this.socialNo!=null &&
              this.socialNo.equals(other.getSocialNo())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
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
        if (getCustomerType() != null) {
            _hashCode += getCustomerType().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getNativePlace() != null) {
            _hashCode += getNativePlace().hashCode();
        }
        if (getNationType() != null) {
            _hashCode += getNationType().hashCode();
        }
        if (getJobType() != null) {
            _hashCode += getJobType().hashCode();
        }
        if (getEducation() != null) {
            _hashCode += getEducation().hashCode();
        }
        if (getCreditGrade() != null) {
            _hashCode += getCreditGrade().hashCode();
        }
        if (getCreditAmount() != null) {
            _hashCode += getCreditAmount().hashCode();
        }
        if (getCustomerState() != null) {
            _hashCode += getCustomerState().hashCode();
        }
        if (getMaritalStatus() != null) {
            _hashCode += getMaritalStatus().hashCode();
        }
        if (getSkill() != null) {
            _hashCode += getSkill().hashCode();
        }
        if (getSocialNo() != null) {
            _hashCode += getSocialNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeCustBasicInforRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeCustBasicInforRequest"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IDType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IdCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Gender"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Email"));
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
        elemField.setFieldName("simpleProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SimpleProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SimpleProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CustomerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nativePlace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NativePlace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "JobType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("education");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Education"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditGrade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CreditGrade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CreditAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CustomerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "MaritalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skill");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Skill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SocialNo"));
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
