/**
 * ManCUGInfoResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ManCUGInfoResult  implements java.io.Serializable {
    private java.math.BigInteger CUGID;

    private java.lang.String CUGName;

    private java.math.BigInteger CUGType;

    private java.lang.Integer CUGMemberAmt;

    public ManCUGInfoResult() {
    }

    public ManCUGInfoResult(
           java.math.BigInteger CUGID,
           java.lang.String CUGName,
           java.math.BigInteger CUGType,
           java.lang.Integer CUGMemberAmt) {
           this.CUGID = CUGID;
           this.CUGName = CUGName;
           this.CUGType = CUGType;
           this.CUGMemberAmt = CUGMemberAmt;
    }


    /**
     * Gets the CUGID value for this ManCUGInfoResult.
     * 
     * @return CUGID
     */
    public java.math.BigInteger getCUGID() {
        return CUGID;
    }


    /**
     * Sets the CUGID value for this ManCUGInfoResult.
     * 
     * @param CUGID
     */
    public void setCUGID(java.math.BigInteger CUGID) {
        this.CUGID = CUGID;
    }


    /**
     * Gets the CUGName value for this ManCUGInfoResult.
     * 
     * @return CUGName
     */
    public java.lang.String getCUGName() {
        return CUGName;
    }


    /**
     * Sets the CUGName value for this ManCUGInfoResult.
     * 
     * @param CUGName
     */
    public void setCUGName(java.lang.String CUGName) {
        this.CUGName = CUGName;
    }


    /**
     * Gets the CUGType value for this ManCUGInfoResult.
     * 
     * @return CUGType
     */
    public java.math.BigInteger getCUGType() {
        return CUGType;
    }


    /**
     * Sets the CUGType value for this ManCUGInfoResult.
     * 
     * @param CUGType
     */
    public void setCUGType(java.math.BigInteger CUGType) {
        this.CUGType = CUGType;
    }


    /**
     * Gets the CUGMemberAmt value for this ManCUGInfoResult.
     * 
     * @return CUGMemberAmt
     */
    public java.lang.Integer getCUGMemberAmt() {
        return CUGMemberAmt;
    }


    /**
     * Sets the CUGMemberAmt value for this ManCUGInfoResult.
     * 
     * @param CUGMemberAmt
     */
    public void setCUGMemberAmt(java.lang.Integer CUGMemberAmt) {
        this.CUGMemberAmt = CUGMemberAmt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManCUGInfoResult)) return false;
        ManCUGInfoResult other = (ManCUGInfoResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CUGID==null && other.getCUGID()==null) || 
             (this.CUGID!=null &&
              this.CUGID.equals(other.getCUGID()))) &&
            ((this.CUGName==null && other.getCUGName()==null) || 
             (this.CUGName!=null &&
              this.CUGName.equals(other.getCUGName()))) &&
            ((this.CUGType==null && other.getCUGType()==null) || 
             (this.CUGType!=null &&
              this.CUGType.equals(other.getCUGType()))) &&
            ((this.CUGMemberAmt==null && other.getCUGMemberAmt()==null) || 
             (this.CUGMemberAmt!=null &&
              this.CUGMemberAmt.equals(other.getCUGMemberAmt())));
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
        if (getCUGID() != null) {
            _hashCode += getCUGID().hashCode();
        }
        if (getCUGName() != null) {
            _hashCode += getCUGName().hashCode();
        }
        if (getCUGType() != null) {
            _hashCode += getCUGType().hashCode();
        }
        if (getCUGMemberAmt() != null) {
            _hashCode += getCUGMemberAmt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManCUGInfoResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ManCUGInfoResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUGID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CUGID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("CUGType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CUGType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUGMemberAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CUGMemberAmt"));
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
