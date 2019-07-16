/**
 * QueryCUGMembersResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryCUGMembersResult  implements java.io.Serializable {
    private java.lang.String CUGID;

    private java.lang.String CUGName;

    private java.lang.String applyTime;

    private java.lang.String expireTime;

    private java.math.BigInteger CUGType;

    private java.lang.Integer CUGMemberAmt;

    private java.lang.Integer returnedMemberAmt;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryCUGMembersResultCUGMemberList[] CUGMemberList;

    public QueryCUGMembersResult() {
    }

    public QueryCUGMembersResult(
           java.lang.String CUGID,
           java.lang.String CUGName,
           java.lang.String applyTime,
           java.lang.String expireTime,
           java.math.BigInteger CUGType,
           java.lang.Integer CUGMemberAmt,
           java.lang.Integer returnedMemberAmt,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryCUGMembersResultCUGMemberList[] CUGMemberList) {
           this.CUGID = CUGID;
           this.CUGName = CUGName;
           this.applyTime = applyTime;
           this.expireTime = expireTime;
           this.CUGType = CUGType;
           this.CUGMemberAmt = CUGMemberAmt;
           this.returnedMemberAmt = returnedMemberAmt;
           this.CUGMemberList = CUGMemberList;
    }


    /**
     * Gets the CUGID value for this QueryCUGMembersResult.
     * 
     * @return CUGID
     */
    public java.lang.String getCUGID() {
        return CUGID;
    }


    /**
     * Sets the CUGID value for this QueryCUGMembersResult.
     * 
     * @param CUGID
     */
    public void setCUGID(java.lang.String CUGID) {
        this.CUGID = CUGID;
    }


    /**
     * Gets the CUGName value for this QueryCUGMembersResult.
     * 
     * @return CUGName
     */
    public java.lang.String getCUGName() {
        return CUGName;
    }


    /**
     * Sets the CUGName value for this QueryCUGMembersResult.
     * 
     * @param CUGName
     */
    public void setCUGName(java.lang.String CUGName) {
        this.CUGName = CUGName;
    }


    /**
     * Gets the applyTime value for this QueryCUGMembersResult.
     * 
     * @return applyTime
     */
    public java.lang.String getApplyTime() {
        return applyTime;
    }


    /**
     * Sets the applyTime value for this QueryCUGMembersResult.
     * 
     * @param applyTime
     */
    public void setApplyTime(java.lang.String applyTime) {
        this.applyTime = applyTime;
    }


    /**
     * Gets the expireTime value for this QueryCUGMembersResult.
     * 
     * @return expireTime
     */
    public java.lang.String getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the expireTime value for this QueryCUGMembersResult.
     * 
     * @param expireTime
     */
    public void setExpireTime(java.lang.String expireTime) {
        this.expireTime = expireTime;
    }


    /**
     * Gets the CUGType value for this QueryCUGMembersResult.
     * 
     * @return CUGType
     */
    public java.math.BigInteger getCUGType() {
        return CUGType;
    }


    /**
     * Sets the CUGType value for this QueryCUGMembersResult.
     * 
     * @param CUGType
     */
    public void setCUGType(java.math.BigInteger CUGType) {
        this.CUGType = CUGType;
    }


    /**
     * Gets the CUGMemberAmt value for this QueryCUGMembersResult.
     * 
     * @return CUGMemberAmt
     */
    public java.lang.Integer getCUGMemberAmt() {
        return CUGMemberAmt;
    }


    /**
     * Sets the CUGMemberAmt value for this QueryCUGMembersResult.
     * 
     * @param CUGMemberAmt
     */
    public void setCUGMemberAmt(java.lang.Integer CUGMemberAmt) {
        this.CUGMemberAmt = CUGMemberAmt;
    }


    /**
     * Gets the returnedMemberAmt value for this QueryCUGMembersResult.
     * 
     * @return returnedMemberAmt
     */
    public java.lang.Integer getReturnedMemberAmt() {
        return returnedMemberAmt;
    }


    /**
     * Sets the returnedMemberAmt value for this QueryCUGMembersResult.
     * 
     * @param returnedMemberAmt
     */
    public void setReturnedMemberAmt(java.lang.Integer returnedMemberAmt) {
        this.returnedMemberAmt = returnedMemberAmt;
    }


    /**
     * Gets the CUGMemberList value for this QueryCUGMembersResult.
     * 
     * @return CUGMemberList
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryCUGMembersResultCUGMemberList[] getCUGMemberList() {
        return CUGMemberList;
    }


    /**
     * Sets the CUGMemberList value for this QueryCUGMembersResult.
     * 
     * @param CUGMemberList
     */
    public void setCUGMemberList(com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryCUGMembersResultCUGMemberList[] CUGMemberList) {
        this.CUGMemberList = CUGMemberList;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryCUGMembersResultCUGMemberList getCUGMemberList(int i) {
        return this.CUGMemberList[i];
    }

    public void setCUGMemberList(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.QueryCUGMembersResultCUGMemberList _value) {
        this.CUGMemberList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCUGMembersResult)) return false;
        QueryCUGMembersResult other = (QueryCUGMembersResult) obj;
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
            ((this.applyTime==null && other.getApplyTime()==null) || 
             (this.applyTime!=null &&
              this.applyTime.equals(other.getApplyTime()))) &&
            ((this.expireTime==null && other.getExpireTime()==null) || 
             (this.expireTime!=null &&
              this.expireTime.equals(other.getExpireTime()))) &&
            ((this.CUGType==null && other.getCUGType()==null) || 
             (this.CUGType!=null &&
              this.CUGType.equals(other.getCUGType()))) &&
            ((this.CUGMemberAmt==null && other.getCUGMemberAmt()==null) || 
             (this.CUGMemberAmt!=null &&
              this.CUGMemberAmt.equals(other.getCUGMemberAmt()))) &&
            ((this.returnedMemberAmt==null && other.getReturnedMemberAmt()==null) || 
             (this.returnedMemberAmt!=null &&
              this.returnedMemberAmt.equals(other.getReturnedMemberAmt()))) &&
            ((this.CUGMemberList==null && other.getCUGMemberList()==null) || 
             (this.CUGMemberList!=null &&
              java.util.Arrays.equals(this.CUGMemberList, other.getCUGMemberList())));
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
        if (getApplyTime() != null) {
            _hashCode += getApplyTime().hashCode();
        }
        if (getExpireTime() != null) {
            _hashCode += getExpireTime().hashCode();
        }
        if (getCUGType() != null) {
            _hashCode += getCUGType().hashCode();
        }
        if (getCUGMemberAmt() != null) {
            _hashCode += getCUGMemberAmt().hashCode();
        }
        if (getReturnedMemberAmt() != null) {
            _hashCode += getReturnedMemberAmt().hashCode();
        }
        if (getCUGMemberList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCUGMemberList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCUGMemberList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryCUGMembersResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "QueryCUGMembersResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUGID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CUGID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUGMemberAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CUGMemberAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnedMemberAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ReturnedMemberAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUGMemberList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CUGMemberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">QueryCUGMembersResult>CUGMemberList"));
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
