/**
 * ChangeSubOwnershipRequestNewOwnershipSubscriber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubOwnershipRequestNewOwnershipSubscriber  implements java.io.Serializable {
    private java.lang.String subscriberKey;

    /* It is actual user customer key of subscriber if the actual
     * user is not same as register customer. */
    private java.lang.String userCustomerKey;

    /* It is the written language code of subscriber. */
    private java.lang.String writtenLang;

    /* It is the phonetic language code of subscriber. */
    private java.lang.String IVRLang;

    private java.lang.String subPassword;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriberSubDFTAcct subDFTAcct;

    private com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriberShiftPayRelation[] shiftPayRelation;

    public ChangeSubOwnershipRequestNewOwnershipSubscriber() {
    }

    public ChangeSubOwnershipRequestNewOwnershipSubscriber(
           java.lang.String subscriberKey,
           java.lang.String userCustomerKey,
           java.lang.String writtenLang,
           java.lang.String IVRLang,
           java.lang.String subPassword,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriberSubDFTAcct subDFTAcct,
           com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriberShiftPayRelation[] shiftPayRelation) {
           this.subscriberKey = subscriberKey;
           this.userCustomerKey = userCustomerKey;
           this.writtenLang = writtenLang;
           this.IVRLang = IVRLang;
           this.subPassword = subPassword;
           this.subDFTAcct = subDFTAcct;
           this.shiftPayRelation = shiftPayRelation;
    }


    /**
     * Gets the subscriberKey value for this ChangeSubOwnershipRequestNewOwnershipSubscriber.
     * 
     * @return subscriberKey
     */
    public java.lang.String getSubscriberKey() {
        return subscriberKey;
    }


    /**
     * Sets the subscriberKey value for this ChangeSubOwnershipRequestNewOwnershipSubscriber.
     * 
     * @param subscriberKey
     */
    public void setSubscriberKey(java.lang.String subscriberKey) {
        this.subscriberKey = subscriberKey;
    }


    /**
     * Gets the userCustomerKey value for this ChangeSubOwnershipRequestNewOwnershipSubscriber.
     * 
     * @return userCustomerKey   * It is actual user customer key of subscriber if the actual
     * user is not same as register customer.
     */
    public java.lang.String getUserCustomerKey() {
        return userCustomerKey;
    }


    /**
     * Sets the userCustomerKey value for this ChangeSubOwnershipRequestNewOwnershipSubscriber.
     * 
     * @param userCustomerKey   * It is actual user customer key of subscriber if the actual
     * user is not same as register customer.
     */
    public void setUserCustomerKey(java.lang.String userCustomerKey) {
        this.userCustomerKey = userCustomerKey;
    }


    /**
     * Gets the writtenLang value for this ChangeSubOwnershipRequestNewOwnershipSubscriber.
     * 
     * @return writtenLang   * It is the written language code of subscriber.
     */
    public java.lang.String getWrittenLang() {
        return writtenLang;
    }


    /**
     * Sets the writtenLang value for this ChangeSubOwnershipRequestNewOwnershipSubscriber.
     * 
     * @param writtenLang   * It is the written language code of subscriber.
     */
    public void setWrittenLang(java.lang.String writtenLang) {
        this.writtenLang = writtenLang;
    }


    /**
     * Gets the IVRLang value for this ChangeSubOwnershipRequestNewOwnershipSubscriber.
     * 
     * @return IVRLang   * It is the phonetic language code of subscriber.
     */
    public java.lang.String getIVRLang() {
        return IVRLang;
    }


    /**
     * Sets the IVRLang value for this ChangeSubOwnershipRequestNewOwnershipSubscriber.
     * 
     * @param IVRLang   * It is the phonetic language code of subscriber.
     */
    public void setIVRLang(java.lang.String IVRLang) {
        this.IVRLang = IVRLang;
    }


    /**
     * Gets the subPassword value for this ChangeSubOwnershipRequestNewOwnershipSubscriber.
     * 
     * @return subPassword
     */
    public java.lang.String getSubPassword() {
        return subPassword;
    }


    /**
     * Sets the subPassword value for this ChangeSubOwnershipRequestNewOwnershipSubscriber.
     * 
     * @param subPassword
     */
    public void setSubPassword(java.lang.String subPassword) {
        this.subPassword = subPassword;
    }


    /**
     * Gets the subDFTAcct value for this ChangeSubOwnershipRequestNewOwnershipSubscriber.
     * 
     * @return subDFTAcct
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriberSubDFTAcct getSubDFTAcct() {
        return subDFTAcct;
    }


    /**
     * Sets the subDFTAcct value for this ChangeSubOwnershipRequestNewOwnershipSubscriber.
     * 
     * @param subDFTAcct
     */
    public void setSubDFTAcct(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriberSubDFTAcct subDFTAcct) {
        this.subDFTAcct = subDFTAcct;
    }


    /**
     * Gets the shiftPayRelation value for this ChangeSubOwnershipRequestNewOwnershipSubscriber.
     * 
     * @return shiftPayRelation
     */
    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriberShiftPayRelation[] getShiftPayRelation() {
        return shiftPayRelation;
    }


    /**
     * Sets the shiftPayRelation value for this ChangeSubOwnershipRequestNewOwnershipSubscriber.
     * 
     * @param shiftPayRelation
     */
    public void setShiftPayRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriberShiftPayRelation[] shiftPayRelation) {
        this.shiftPayRelation = shiftPayRelation;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriberShiftPayRelation getShiftPayRelation(int i) {
        return this.shiftPayRelation[i];
    }

    public void setShiftPayRelation(int i, com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestNewOwnershipSubscriberShiftPayRelation _value) {
        this.shiftPayRelation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubOwnershipRequestNewOwnershipSubscriber)) return false;
        ChangeSubOwnershipRequestNewOwnershipSubscriber other = (ChangeSubOwnershipRequestNewOwnershipSubscriber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberKey==null && other.getSubscriberKey()==null) || 
             (this.subscriberKey!=null &&
              this.subscriberKey.equals(other.getSubscriberKey()))) &&
            ((this.userCustomerKey==null && other.getUserCustomerKey()==null) || 
             (this.userCustomerKey!=null &&
              this.userCustomerKey.equals(other.getUserCustomerKey()))) &&
            ((this.writtenLang==null && other.getWrittenLang()==null) || 
             (this.writtenLang!=null &&
              this.writtenLang.equals(other.getWrittenLang()))) &&
            ((this.IVRLang==null && other.getIVRLang()==null) || 
             (this.IVRLang!=null &&
              this.IVRLang.equals(other.getIVRLang()))) &&
            ((this.subPassword==null && other.getSubPassword()==null) || 
             (this.subPassword!=null &&
              this.subPassword.equals(other.getSubPassword()))) &&
            ((this.subDFTAcct==null && other.getSubDFTAcct()==null) || 
             (this.subDFTAcct!=null &&
              this.subDFTAcct.equals(other.getSubDFTAcct()))) &&
            ((this.shiftPayRelation==null && other.getShiftPayRelation()==null) || 
             (this.shiftPayRelation!=null &&
              java.util.Arrays.equals(this.shiftPayRelation, other.getShiftPayRelation())));
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
        if (getSubscriberKey() != null) {
            _hashCode += getSubscriberKey().hashCode();
        }
        if (getUserCustomerKey() != null) {
            _hashCode += getUserCustomerKey().hashCode();
        }
        if (getWrittenLang() != null) {
            _hashCode += getWrittenLang().hashCode();
        }
        if (getIVRLang() != null) {
            _hashCode += getIVRLang().hashCode();
        }
        if (getSubPassword() != null) {
            _hashCode += getSubPassword().hashCode();
        }
        if (getSubDFTAcct() != null) {
            _hashCode += getSubDFTAcct().hashCode();
        }
        if (getShiftPayRelation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShiftPayRelation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShiftPayRelation(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeSubOwnershipRequestNewOwnershipSubscriber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ChangeSubOwnershipRequest>NewOwnership>Subscriber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubscriberKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCustomerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UserCustomerKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writtenLang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "WrittenLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IVRLang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "IVRLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subDFTAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubDFTAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubOwnershipRequest>NewOwnership>Subscriber>SubDFTAcct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shiftPayRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ShiftPayRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubOwnershipRequest>NewOwnership>Subscriber>ShiftPayRelation"));
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
