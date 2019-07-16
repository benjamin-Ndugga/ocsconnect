/**
 * AddGroupMemberRequestGroupMemberSubInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class AddGroupMemberRequestGroupMemberSubInfo  implements java.io.Serializable {
    private java.lang.String networkType;

    private java.lang.String numberType;

    /* It is the written language code of subscriber. */
    private java.lang.String writtenLang;

    /* It is the phonetic language code of subscriber. */
    private java.lang.String IVRLang;

    private java.lang.String displayNumber;

    public AddGroupMemberRequestGroupMemberSubInfo() {
    }

    public AddGroupMemberRequestGroupMemberSubInfo(
           java.lang.String networkType,
           java.lang.String numberType,
           java.lang.String writtenLang,
           java.lang.String IVRLang,
           java.lang.String displayNumber) {
           this.networkType = networkType;
           this.numberType = numberType;
           this.writtenLang = writtenLang;
           this.IVRLang = IVRLang;
           this.displayNumber = displayNumber;
    }


    /**
     * Gets the networkType value for this AddGroupMemberRequestGroupMemberSubInfo.
     * 
     * @return networkType
     */
    public java.lang.String getNetworkType() {
        return networkType;
    }


    /**
     * Sets the networkType value for this AddGroupMemberRequestGroupMemberSubInfo.
     * 
     * @param networkType
     */
    public void setNetworkType(java.lang.String networkType) {
        this.networkType = networkType;
    }


    /**
     * Gets the numberType value for this AddGroupMemberRequestGroupMemberSubInfo.
     * 
     * @return numberType
     */
    public java.lang.String getNumberType() {
        return numberType;
    }


    /**
     * Sets the numberType value for this AddGroupMemberRequestGroupMemberSubInfo.
     * 
     * @param numberType
     */
    public void setNumberType(java.lang.String numberType) {
        this.numberType = numberType;
    }


    /**
     * Gets the writtenLang value for this AddGroupMemberRequestGroupMemberSubInfo.
     * 
     * @return writtenLang   * It is the written language code of subscriber.
     */
    public java.lang.String getWrittenLang() {
        return writtenLang;
    }


    /**
     * Sets the writtenLang value for this AddGroupMemberRequestGroupMemberSubInfo.
     * 
     * @param writtenLang   * It is the written language code of subscriber.
     */
    public void setWrittenLang(java.lang.String writtenLang) {
        this.writtenLang = writtenLang;
    }


    /**
     * Gets the IVRLang value for this AddGroupMemberRequestGroupMemberSubInfo.
     * 
     * @return IVRLang   * It is the phonetic language code of subscriber.
     */
    public java.lang.String getIVRLang() {
        return IVRLang;
    }


    /**
     * Sets the IVRLang value for this AddGroupMemberRequestGroupMemberSubInfo.
     * 
     * @param IVRLang   * It is the phonetic language code of subscriber.
     */
    public void setIVRLang(java.lang.String IVRLang) {
        this.IVRLang = IVRLang;
    }


    /**
     * Gets the displayNumber value for this AddGroupMemberRequestGroupMemberSubInfo.
     * 
     * @return displayNumber
     */
    public java.lang.String getDisplayNumber() {
        return displayNumber;
    }


    /**
     * Sets the displayNumber value for this AddGroupMemberRequestGroupMemberSubInfo.
     * 
     * @param displayNumber
     */
    public void setDisplayNumber(java.lang.String displayNumber) {
        this.displayNumber = displayNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddGroupMemberRequestGroupMemberSubInfo)) return false;
        AddGroupMemberRequestGroupMemberSubInfo other = (AddGroupMemberRequestGroupMemberSubInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkType==null && other.getNetworkType()==null) || 
             (this.networkType!=null &&
              this.networkType.equals(other.getNetworkType()))) &&
            ((this.numberType==null && other.getNumberType()==null) || 
             (this.numberType!=null &&
              this.numberType.equals(other.getNumberType()))) &&
            ((this.writtenLang==null && other.getWrittenLang()==null) || 
             (this.writtenLang!=null &&
              this.writtenLang.equals(other.getWrittenLang()))) &&
            ((this.IVRLang==null && other.getIVRLang()==null) || 
             (this.IVRLang!=null &&
              this.IVRLang.equals(other.getIVRLang()))) &&
            ((this.displayNumber==null && other.getDisplayNumber()==null) || 
             (this.displayNumber!=null &&
              this.displayNumber.equals(other.getDisplayNumber())));
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
        if (getNetworkType() != null) {
            _hashCode += getNetworkType().hashCode();
        }
        if (getNumberType() != null) {
            _hashCode += getNumberType().hashCode();
        }
        if (getWrittenLang() != null) {
            _hashCode += getWrittenLang().hashCode();
        }
        if (getIVRLang() != null) {
            _hashCode += getIVRLang().hashCode();
        }
        if (getDisplayNumber() != null) {
            _hashCode += getDisplayNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddGroupMemberRequestGroupMemberSubInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>AddGroupMemberRequest>GroupMember>SubInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NetworkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "NumberType"));
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
        elemField.setFieldName("displayNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DisplayNumber"));
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
