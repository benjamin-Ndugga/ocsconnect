/**
 * ManCUGInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ManCUGInfoRequest  implements java.io.Serializable {
    /* AddCUG/ModifyCUG/DeleteCUG */
    private java.math.BigInteger operationType;

    private java.math.BigInteger CUGID;

    private java.lang.String CUGName;

    private java.lang.String applyTime;

    private java.lang.String expireTime;

    private java.math.BigInteger CUGType;

    public ManCUGInfoRequest() {
    }

    public ManCUGInfoRequest(
           java.math.BigInteger operationType,
           java.math.BigInteger CUGID,
           java.lang.String CUGName,
           java.lang.String applyTime,
           java.lang.String expireTime,
           java.math.BigInteger CUGType) {
           this.operationType = operationType;
           this.CUGID = CUGID;
           this.CUGName = CUGName;
           this.applyTime = applyTime;
           this.expireTime = expireTime;
           this.CUGType = CUGType;
    }


    /**
     * Gets the operationType value for this ManCUGInfoRequest.
     * 
     * @return operationType   * AddCUG/ModifyCUG/DeleteCUG
     */
    public java.math.BigInteger getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this ManCUGInfoRequest.
     * 
     * @param operationType   * AddCUG/ModifyCUG/DeleteCUG
     */
    public void setOperationType(java.math.BigInteger operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the CUGID value for this ManCUGInfoRequest.
     * 
     * @return CUGID
     */
    public java.math.BigInteger getCUGID() {
        return CUGID;
    }


    /**
     * Sets the CUGID value for this ManCUGInfoRequest.
     * 
     * @param CUGID
     */
    public void setCUGID(java.math.BigInteger CUGID) {
        this.CUGID = CUGID;
    }


    /**
     * Gets the CUGName value for this ManCUGInfoRequest.
     * 
     * @return CUGName
     */
    public java.lang.String getCUGName() {
        return CUGName;
    }


    /**
     * Sets the CUGName value for this ManCUGInfoRequest.
     * 
     * @param CUGName
     */
    public void setCUGName(java.lang.String CUGName) {
        this.CUGName = CUGName;
    }


    /**
     * Gets the applyTime value for this ManCUGInfoRequest.
     * 
     * @return applyTime
     */
    public java.lang.String getApplyTime() {
        return applyTime;
    }


    /**
     * Sets the applyTime value for this ManCUGInfoRequest.
     * 
     * @param applyTime
     */
    public void setApplyTime(java.lang.String applyTime) {
        this.applyTime = applyTime;
    }


    /**
     * Gets the expireTime value for this ManCUGInfoRequest.
     * 
     * @return expireTime
     */
    public java.lang.String getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the expireTime value for this ManCUGInfoRequest.
     * 
     * @param expireTime
     */
    public void setExpireTime(java.lang.String expireTime) {
        this.expireTime = expireTime;
    }


    /**
     * Gets the CUGType value for this ManCUGInfoRequest.
     * 
     * @return CUGType
     */
    public java.math.BigInteger getCUGType() {
        return CUGType;
    }


    /**
     * Sets the CUGType value for this ManCUGInfoRequest.
     * 
     * @param CUGType
     */
    public void setCUGType(java.math.BigInteger CUGType) {
        this.CUGType = CUGType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManCUGInfoRequest)) return false;
        ManCUGInfoRequest other = (ManCUGInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType()))) &&
            ((this.CUGID==null && other.getCUGID()==null) || 
             (this.CUGID!=null &&
              this.CUGID.equals(other.getCUGID()))) &&
            ((this.CUGName==null && other.getCUGName()==null) || 
             (this.CUGName!=null &&
              this.CUGName.equals(other.getCUGName()))) &&
            ((this.applyTime==null && other.getApplyTime()==null) || 
             (this.applyTime!=null &&
              this.applyTime.equals(other.getApplyTime()))) &&
            ((this.expireTime==null && other.getExpireTime()==null) || 
             (this.expireTime!=null &&
              this.expireTime.equals(other.getExpireTime()))) &&
            ((this.CUGType==null && other.getCUGType()==null) || 
             (this.CUGType!=null &&
              this.CUGType.equals(other.getCUGType())));
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
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        if (getCUGID() != null) {
            _hashCode += getCUGID().hashCode();
        }
        if (getCUGName() != null) {
            _hashCode += getCUGName().hashCode();
        }
        if (getApplyTime() != null) {
            _hashCode += getApplyTime().hashCode();
        }
        if (getExpireTime() != null) {
            _hashCode += getExpireTime().hashCode();
        }
        if (getCUGType() != null) {
            _hashCode += getCUGType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManCUGInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ManCUGInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "OperationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUGID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CUGID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUGName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CUGName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ApplyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ExpireTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUGType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CUGType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
