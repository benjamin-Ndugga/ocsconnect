/**
 * CustInfoNoticeSuppress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class CustInfoNoticeSuppress  implements java.io.Serializable {
    private java.lang.String channelType;

    private java.lang.String noticeType;

    private java.lang.String subNoticeType;

    public CustInfoNoticeSuppress() {
    }

    public CustInfoNoticeSuppress(
           java.lang.String channelType,
           java.lang.String noticeType,
           java.lang.String subNoticeType) {
           this.channelType = channelType;
           this.noticeType = noticeType;
           this.subNoticeType = subNoticeType;
    }


    /**
     * Gets the channelType value for this CustInfoNoticeSuppress.
     * 
     * @return channelType
     */
    public java.lang.String getChannelType() {
        return channelType;
    }


    /**
     * Sets the channelType value for this CustInfoNoticeSuppress.
     * 
     * @param channelType
     */
    public void setChannelType(java.lang.String channelType) {
        this.channelType = channelType;
    }


    /**
     * Gets the noticeType value for this CustInfoNoticeSuppress.
     * 
     * @return noticeType
     */
    public java.lang.String getNoticeType() {
        return noticeType;
    }


    /**
     * Sets the noticeType value for this CustInfoNoticeSuppress.
     * 
     * @param noticeType
     */
    public void setNoticeType(java.lang.String noticeType) {
        this.noticeType = noticeType;
    }


    /**
     * Gets the subNoticeType value for this CustInfoNoticeSuppress.
     * 
     * @return subNoticeType
     */
    public java.lang.String getSubNoticeType() {
        return subNoticeType;
    }


    /**
     * Sets the subNoticeType value for this CustInfoNoticeSuppress.
     * 
     * @param subNoticeType
     */
    public void setSubNoticeType(java.lang.String subNoticeType) {
        this.subNoticeType = subNoticeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustInfoNoticeSuppress)) return false;
        CustInfoNoticeSuppress other = (CustInfoNoticeSuppress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.channelType==null && other.getChannelType()==null) || 
             (this.channelType!=null &&
              this.channelType.equals(other.getChannelType()))) &&
            ((this.noticeType==null && other.getNoticeType()==null) || 
             (this.noticeType!=null &&
              this.noticeType.equals(other.getNoticeType()))) &&
            ((this.subNoticeType==null && other.getSubNoticeType()==null) || 
             (this.subNoticeType!=null &&
              this.subNoticeType.equals(other.getSubNoticeType())));
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
        if (getChannelType() != null) {
            _hashCode += getChannelType().hashCode();
        }
        if (getNoticeType() != null) {
            _hashCode += getNoticeType().hashCode();
        }
        if (getSubNoticeType() != null) {
            _hashCode += getSubNoticeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustInfoNoticeSuppress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">CustInfo>NoticeSuppress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ChannelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noticeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "NoticeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subNoticeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubNoticeType"));
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
