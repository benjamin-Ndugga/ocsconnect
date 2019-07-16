/**
 * ModifyAcctFeeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class ModifyAcctFeeType  implements java.io.Serializable {
    private java.lang.String accountType;

    private long currAcctChgAmt;

    private java.lang.Integer GLID;

    private java.lang.Integer minMeasureId;

    private java.lang.String productID;

    private java.lang.Integer addMode;

    private java.lang.Integer validityType;

    private java.lang.Integer validityNum;

    private java.lang.Integer validity;

    private java.lang.String expireTime;

    public ModifyAcctFeeType() {
    }

    public ModifyAcctFeeType(
           java.lang.String accountType,
           long currAcctChgAmt,
           java.lang.Integer GLID,
           java.lang.Integer minMeasureId,
           java.lang.String productID,
           java.lang.Integer addMode,
           java.lang.Integer validityType,
           java.lang.Integer validityNum,
           java.lang.Integer validity,
           java.lang.String expireTime) {
           this.accountType = accountType;
           this.currAcctChgAmt = currAcctChgAmt;
           this.GLID = GLID;
           this.minMeasureId = minMeasureId;
           this.productID = productID;
           this.addMode = addMode;
           this.validityType = validityType;
           this.validityNum = validityNum;
           this.validity = validity;
           this.expireTime = expireTime;
    }


    /**
     * Gets the accountType value for this ModifyAcctFeeType.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this ModifyAcctFeeType.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the currAcctChgAmt value for this ModifyAcctFeeType.
     * 
     * @return currAcctChgAmt
     */
    public long getCurrAcctChgAmt() {
        return currAcctChgAmt;
    }


    /**
     * Sets the currAcctChgAmt value for this ModifyAcctFeeType.
     * 
     * @param currAcctChgAmt
     */
    public void setCurrAcctChgAmt(long currAcctChgAmt) {
        this.currAcctChgAmt = currAcctChgAmt;
    }


    /**
     * Gets the GLID value for this ModifyAcctFeeType.
     * 
     * @return GLID
     */
    public java.lang.Integer getGLID() {
        return GLID;
    }


    /**
     * Sets the GLID value for this ModifyAcctFeeType.
     * 
     * @param GLID
     */
    public void setGLID(java.lang.Integer GLID) {
        this.GLID = GLID;
    }


    /**
     * Gets the minMeasureId value for this ModifyAcctFeeType.
     * 
     * @return minMeasureId
     */
    public java.lang.Integer getMinMeasureId() {
        return minMeasureId;
    }


    /**
     * Sets the minMeasureId value for this ModifyAcctFeeType.
     * 
     * @param minMeasureId
     */
    public void setMinMeasureId(java.lang.Integer minMeasureId) {
        this.minMeasureId = minMeasureId;
    }


    /**
     * Gets the productID value for this ModifyAcctFeeType.
     * 
     * @return productID
     */
    public java.lang.String getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this ModifyAcctFeeType.
     * 
     * @param productID
     */
    public void setProductID(java.lang.String productID) {
        this.productID = productID;
    }


    /**
     * Gets the addMode value for this ModifyAcctFeeType.
     * 
     * @return addMode
     */
    public java.lang.Integer getAddMode() {
        return addMode;
    }


    /**
     * Sets the addMode value for this ModifyAcctFeeType.
     * 
     * @param addMode
     */
    public void setAddMode(java.lang.Integer addMode) {
        this.addMode = addMode;
    }


    /**
     * Gets the validityType value for this ModifyAcctFeeType.
     * 
     * @return validityType
     */
    public java.lang.Integer getValidityType() {
        return validityType;
    }


    /**
     * Sets the validityType value for this ModifyAcctFeeType.
     * 
     * @param validityType
     */
    public void setValidityType(java.lang.Integer validityType) {
        this.validityType = validityType;
    }


    /**
     * Gets the validityNum value for this ModifyAcctFeeType.
     * 
     * @return validityNum
     */
    public java.lang.Integer getValidityNum() {
        return validityNum;
    }


    /**
     * Sets the validityNum value for this ModifyAcctFeeType.
     * 
     * @param validityNum
     */
    public void setValidityNum(java.lang.Integer validityNum) {
        this.validityNum = validityNum;
    }


    /**
     * Gets the validity value for this ModifyAcctFeeType.
     * 
     * @return validity
     */
    public java.lang.Integer getValidity() {
        return validity;
    }


    /**
     * Sets the validity value for this ModifyAcctFeeType.
     * 
     * @param validity
     */
    public void setValidity(java.lang.Integer validity) {
        this.validity = validity;
    }


    /**
     * Gets the expireTime value for this ModifyAcctFeeType.
     * 
     * @return expireTime
     */
    public java.lang.String getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the expireTime value for this ModifyAcctFeeType.
     * 
     * @param expireTime
     */
    public void setExpireTime(java.lang.String expireTime) {
        this.expireTime = expireTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyAcctFeeType)) return false;
        ModifyAcctFeeType other = (ModifyAcctFeeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            this.currAcctChgAmt == other.getCurrAcctChgAmt() &&
            ((this.GLID==null && other.getGLID()==null) || 
             (this.GLID!=null &&
              this.GLID.equals(other.getGLID()))) &&
            ((this.minMeasureId==null && other.getMinMeasureId()==null) || 
             (this.minMeasureId!=null &&
              this.minMeasureId.equals(other.getMinMeasureId()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.addMode==null && other.getAddMode()==null) || 
             (this.addMode!=null &&
              this.addMode.equals(other.getAddMode()))) &&
            ((this.validityType==null && other.getValidityType()==null) || 
             (this.validityType!=null &&
              this.validityType.equals(other.getValidityType()))) &&
            ((this.validityNum==null && other.getValidityNum()==null) || 
             (this.validityNum!=null &&
              this.validityNum.equals(other.getValidityNum()))) &&
            ((this.validity==null && other.getValidity()==null) || 
             (this.validity!=null &&
              this.validity.equals(other.getValidity()))) &&
            ((this.expireTime==null && other.getExpireTime()==null) || 
             (this.expireTime!=null &&
              this.expireTime.equals(other.getExpireTime())));
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
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        _hashCode += new Long(getCurrAcctChgAmt()).hashCode();
        if (getGLID() != null) {
            _hashCode += getGLID().hashCode();
        }
        if (getMinMeasureId() != null) {
            _hashCode += getMinMeasureId().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getAddMode() != null) {
            _hashCode += getAddMode().hashCode();
        }
        if (getValidityType() != null) {
            _hashCode += getValidityType().hashCode();
        }
        if (getValidityNum() != null) {
            _hashCode += getValidityNum().hashCode();
        }
        if (getValidity() != null) {
            _hashCode += getValidity().hashCode();
        }
        if (getExpireTime() != null) {
            _hashCode += getExpireTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyAcctFeeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifyAcctFeeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currAcctChgAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CurrAcctChgAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "GLID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minMeasureId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "MinMeasureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "addMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ValidityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ValidityNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Validity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ExpireTime"));
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
