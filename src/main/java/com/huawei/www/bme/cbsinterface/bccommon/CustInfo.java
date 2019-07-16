/**
 * CustInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class CustInfo  implements java.io.Serializable {
    private java.lang.String custType;

    private java.lang.String custNodeType;

    private java.lang.String custClass;

    private java.lang.String custCode;

    /* If this customer node has a parent node in the customer hierarchy,
     * this field indicates the customer key of parent node. */
    private java.lang.String parentCustKey;

    private com.huawei.www.bme.cbsinterface.bccommon.CustBasicInfo custBasicInfo;

    private com.huawei.www.bme.cbsinterface.bccommon.CustInfoNoticeSuppress[] noticeSuppress;

    public CustInfo() {
    }

    public CustInfo(
           java.lang.String custType,
           java.lang.String custNodeType,
           java.lang.String custClass,
           java.lang.String custCode,
           java.lang.String parentCustKey,
           com.huawei.www.bme.cbsinterface.bccommon.CustBasicInfo custBasicInfo,
           com.huawei.www.bme.cbsinterface.bccommon.CustInfoNoticeSuppress[] noticeSuppress) {
           this.custType = custType;
           this.custNodeType = custNodeType;
           this.custClass = custClass;
           this.custCode = custCode;
           this.parentCustKey = parentCustKey;
           this.custBasicInfo = custBasicInfo;
           this.noticeSuppress = noticeSuppress;
    }


    /**
     * Gets the custType value for this CustInfo.
     * 
     * @return custType
     */
    public java.lang.String getCustType() {
        return custType;
    }


    /**
     * Sets the custType value for this CustInfo.
     * 
     * @param custType
     */
    public void setCustType(java.lang.String custType) {
        this.custType = custType;
    }


    /**
     * Gets the custNodeType value for this CustInfo.
     * 
     * @return custNodeType
     */
    public java.lang.String getCustNodeType() {
        return custNodeType;
    }


    /**
     * Sets the custNodeType value for this CustInfo.
     * 
     * @param custNodeType
     */
    public void setCustNodeType(java.lang.String custNodeType) {
        this.custNodeType = custNodeType;
    }


    /**
     * Gets the custClass value for this CustInfo.
     * 
     * @return custClass
     */
    public java.lang.String getCustClass() {
        return custClass;
    }


    /**
     * Sets the custClass value for this CustInfo.
     * 
     * @param custClass
     */
    public void setCustClass(java.lang.String custClass) {
        this.custClass = custClass;
    }


    /**
     * Gets the custCode value for this CustInfo.
     * 
     * @return custCode
     */
    public java.lang.String getCustCode() {
        return custCode;
    }


    /**
     * Sets the custCode value for this CustInfo.
     * 
     * @param custCode
     */
    public void setCustCode(java.lang.String custCode) {
        this.custCode = custCode;
    }


    /**
     * Gets the parentCustKey value for this CustInfo.
     * 
     * @return parentCustKey   * If this customer node has a parent node in the customer hierarchy,
     * this field indicates the customer key of parent node.
     */
    public java.lang.String getParentCustKey() {
        return parentCustKey;
    }


    /**
     * Sets the parentCustKey value for this CustInfo.
     * 
     * @param parentCustKey   * If this customer node has a parent node in the customer hierarchy,
     * this field indicates the customer key of parent node.
     */
    public void setParentCustKey(java.lang.String parentCustKey) {
        this.parentCustKey = parentCustKey;
    }


    /**
     * Gets the custBasicInfo value for this CustInfo.
     * 
     * @return custBasicInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.CustBasicInfo getCustBasicInfo() {
        return custBasicInfo;
    }


    /**
     * Sets the custBasicInfo value for this CustInfo.
     * 
     * @param custBasicInfo
     */
    public void setCustBasicInfo(com.huawei.www.bme.cbsinterface.bccommon.CustBasicInfo custBasicInfo) {
        this.custBasicInfo = custBasicInfo;
    }


    /**
     * Gets the noticeSuppress value for this CustInfo.
     * 
     * @return noticeSuppress
     */
    public com.huawei.www.bme.cbsinterface.bccommon.CustInfoNoticeSuppress[] getNoticeSuppress() {
        return noticeSuppress;
    }


    /**
     * Sets the noticeSuppress value for this CustInfo.
     * 
     * @param noticeSuppress
     */
    public void setNoticeSuppress(com.huawei.www.bme.cbsinterface.bccommon.CustInfoNoticeSuppress[] noticeSuppress) {
        this.noticeSuppress = noticeSuppress;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.CustInfoNoticeSuppress getNoticeSuppress(int i) {
        return this.noticeSuppress[i];
    }

    public void setNoticeSuppress(int i, com.huawei.www.bme.cbsinterface.bccommon.CustInfoNoticeSuppress _value) {
        this.noticeSuppress[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustInfo)) return false;
        CustInfo other = (CustInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.custType==null && other.getCustType()==null) || 
             (this.custType!=null &&
              this.custType.equals(other.getCustType()))) &&
            ((this.custNodeType==null && other.getCustNodeType()==null) || 
             (this.custNodeType!=null &&
              this.custNodeType.equals(other.getCustNodeType()))) &&
            ((this.custClass==null && other.getCustClass()==null) || 
             (this.custClass!=null &&
              this.custClass.equals(other.getCustClass()))) &&
            ((this.custCode==null && other.getCustCode()==null) || 
             (this.custCode!=null &&
              this.custCode.equals(other.getCustCode()))) &&
            ((this.parentCustKey==null && other.getParentCustKey()==null) || 
             (this.parentCustKey!=null &&
              this.parentCustKey.equals(other.getParentCustKey()))) &&
            ((this.custBasicInfo==null && other.getCustBasicInfo()==null) || 
             (this.custBasicInfo!=null &&
              this.custBasicInfo.equals(other.getCustBasicInfo()))) &&
            ((this.noticeSuppress==null && other.getNoticeSuppress()==null) || 
             (this.noticeSuppress!=null &&
              java.util.Arrays.equals(this.noticeSuppress, other.getNoticeSuppress())));
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
        if (getCustType() != null) {
            _hashCode += getCustType().hashCode();
        }
        if (getCustNodeType() != null) {
            _hashCode += getCustNodeType().hashCode();
        }
        if (getCustClass() != null) {
            _hashCode += getCustClass().hashCode();
        }
        if (getCustCode() != null) {
            _hashCode += getCustCode().hashCode();
        }
        if (getParentCustKey() != null) {
            _hashCode += getParentCustKey().hashCode();
        }
        if (getCustBasicInfo() != null) {
            _hashCode += getCustBasicInfo().hashCode();
        }
        if (getNoticeSuppress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNoticeSuppress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNoticeSuppress(), i);
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
        new org.apache.axis.description.TypeDesc(CustInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custNodeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustNodeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentCustKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ParentCustKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custBasicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustBasicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustBasicInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noticeSuppress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "NoticeSuppress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">CustInfo>NoticeSuppress"));
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
