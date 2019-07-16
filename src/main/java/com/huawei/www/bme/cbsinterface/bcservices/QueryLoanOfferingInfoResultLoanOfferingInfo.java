/**
 * QueryLoanOfferingInfoResultLoanOfferingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryLoanOfferingInfoResultLoanOfferingInfo  implements java.io.Serializable {
    private java.math.BigInteger offeringID;

    /* Offering name */
    private java.lang.String offeringName;

    /* Code of an offering */
    private java.lang.String offeringCode;

    /* Description of an offering */
    private java.lang.String description;

    private java.lang.String primaryFlag;

    private java.lang.String paymentMode;

    /* Validity Period Start Time Format:  YYYYMMDDHHMMSS */
    private java.lang.String effDate;

    /* Validity Period End Time Format:  YYYYMMDDHHMMSS */
    private java.lang.String expDate;

    public QueryLoanOfferingInfoResultLoanOfferingInfo() {
    }

    public QueryLoanOfferingInfoResultLoanOfferingInfo(
           java.math.BigInteger offeringID,
           java.lang.String offeringName,
           java.lang.String offeringCode,
           java.lang.String description,
           java.lang.String primaryFlag,
           java.lang.String paymentMode,
           java.lang.String effDate,
           java.lang.String expDate) {
           this.offeringID = offeringID;
           this.offeringName = offeringName;
           this.offeringCode = offeringCode;
           this.description = description;
           this.primaryFlag = primaryFlag;
           this.paymentMode = paymentMode;
           this.effDate = effDate;
           this.expDate = expDate;
    }


    /**
     * Gets the offeringID value for this QueryLoanOfferingInfoResultLoanOfferingInfo.
     * 
     * @return offeringID
     */
    public java.math.BigInteger getOfferingID() {
        return offeringID;
    }


    /**
     * Sets the offeringID value for this QueryLoanOfferingInfoResultLoanOfferingInfo.
     * 
     * @param offeringID
     */
    public void setOfferingID(java.math.BigInteger offeringID) {
        this.offeringID = offeringID;
    }


    /**
     * Gets the offeringName value for this QueryLoanOfferingInfoResultLoanOfferingInfo.
     * 
     * @return offeringName   * Offering name
     */
    public java.lang.String getOfferingName() {
        return offeringName;
    }


    /**
     * Sets the offeringName value for this QueryLoanOfferingInfoResultLoanOfferingInfo.
     * 
     * @param offeringName   * Offering name
     */
    public void setOfferingName(java.lang.String offeringName) {
        this.offeringName = offeringName;
    }


    /**
     * Gets the offeringCode value for this QueryLoanOfferingInfoResultLoanOfferingInfo.
     * 
     * @return offeringCode   * Code of an offering
     */
    public java.lang.String getOfferingCode() {
        return offeringCode;
    }


    /**
     * Sets the offeringCode value for this QueryLoanOfferingInfoResultLoanOfferingInfo.
     * 
     * @param offeringCode   * Code of an offering
     */
    public void setOfferingCode(java.lang.String offeringCode) {
        this.offeringCode = offeringCode;
    }


    /**
     * Gets the description value for this QueryLoanOfferingInfoResultLoanOfferingInfo.
     * 
     * @return description   * Description of an offering
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this QueryLoanOfferingInfoResultLoanOfferingInfo.
     * 
     * @param description   * Description of an offering
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the primaryFlag value for this QueryLoanOfferingInfoResultLoanOfferingInfo.
     * 
     * @return primaryFlag
     */
    public java.lang.String getPrimaryFlag() {
        return primaryFlag;
    }


    /**
     * Sets the primaryFlag value for this QueryLoanOfferingInfoResultLoanOfferingInfo.
     * 
     * @param primaryFlag
     */
    public void setPrimaryFlag(java.lang.String primaryFlag) {
        this.primaryFlag = primaryFlag;
    }


    /**
     * Gets the paymentMode value for this QueryLoanOfferingInfoResultLoanOfferingInfo.
     * 
     * @return paymentMode
     */
    public java.lang.String getPaymentMode() {
        return paymentMode;
    }


    /**
     * Sets the paymentMode value for this QueryLoanOfferingInfoResultLoanOfferingInfo.
     * 
     * @param paymentMode
     */
    public void setPaymentMode(java.lang.String paymentMode) {
        this.paymentMode = paymentMode;
    }


    /**
     * Gets the effDate value for this QueryLoanOfferingInfoResultLoanOfferingInfo.
     * 
     * @return effDate   * Validity Period Start Time Format:  YYYYMMDDHHMMSS
     */
    public java.lang.String getEffDate() {
        return effDate;
    }


    /**
     * Sets the effDate value for this QueryLoanOfferingInfoResultLoanOfferingInfo.
     * 
     * @param effDate   * Validity Period Start Time Format:  YYYYMMDDHHMMSS
     */
    public void setEffDate(java.lang.String effDate) {
        this.effDate = effDate;
    }


    /**
     * Gets the expDate value for this QueryLoanOfferingInfoResultLoanOfferingInfo.
     * 
     * @return expDate   * Validity Period End Time Format:  YYYYMMDDHHMMSS
     */
    public java.lang.String getExpDate() {
        return expDate;
    }


    /**
     * Sets the expDate value for this QueryLoanOfferingInfoResultLoanOfferingInfo.
     * 
     * @param expDate   * Validity Period End Time Format:  YYYYMMDDHHMMSS
     */
    public void setExpDate(java.lang.String expDate) {
        this.expDate = expDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryLoanOfferingInfoResultLoanOfferingInfo)) return false;
        QueryLoanOfferingInfoResultLoanOfferingInfo other = (QueryLoanOfferingInfoResultLoanOfferingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offeringID==null && other.getOfferingID()==null) || 
             (this.offeringID!=null &&
              this.offeringID.equals(other.getOfferingID()))) &&
            ((this.offeringName==null && other.getOfferingName()==null) || 
             (this.offeringName!=null &&
              this.offeringName.equals(other.getOfferingName()))) &&
            ((this.offeringCode==null && other.getOfferingCode()==null) || 
             (this.offeringCode!=null &&
              this.offeringCode.equals(other.getOfferingCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.primaryFlag==null && other.getPrimaryFlag()==null) || 
             (this.primaryFlag!=null &&
              this.primaryFlag.equals(other.getPrimaryFlag()))) &&
            ((this.paymentMode==null && other.getPaymentMode()==null) || 
             (this.paymentMode!=null &&
              this.paymentMode.equals(other.getPaymentMode()))) &&
            ((this.effDate==null && other.getEffDate()==null) || 
             (this.effDate!=null &&
              this.effDate.equals(other.getEffDate()))) &&
            ((this.expDate==null && other.getExpDate()==null) || 
             (this.expDate!=null &&
              this.expDate.equals(other.getExpDate())));
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
        if (getOfferingID() != null) {
            _hashCode += getOfferingID().hashCode();
        }
        if (getOfferingName() != null) {
            _hashCode += getOfferingName().hashCode();
        }
        if (getOfferingCode() != null) {
            _hashCode += getOfferingCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPrimaryFlag() != null) {
            _hashCode += getPrimaryFlag().hashCode();
        }
        if (getPaymentMode() != null) {
            _hashCode += getPaymentMode().hashCode();
        }
        if (getEffDate() != null) {
            _hashCode += getEffDate().hashCode();
        }
        if (getExpDate() != null) {
            _hashCode += getExpDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryLoanOfferingInfoResultLoanOfferingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryLoanOfferingInfoResult>LoanOfferingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrimaryFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PaymentMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "EffDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
