/**
 * CustomerForBatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class CustomerForBatch  implements java.io.Serializable {
    private java.lang.String custType;

    private java.lang.String custSegment;

    /* The default password of this customer. */
    private java.lang.String DFTPwd;

    /* The default written language code of this customer. */
    private java.lang.String DFTWrittenLang;

    /* The default phonetic language code of this customer */
    private java.lang.String DFTIVRLang;

    /* The default billing cycle type of this customer */
    private java.lang.String DFTBillCycleType;

    /* The default currency code of this customer */
    private java.math.BigInteger DFTCurrencyID;

    private java.lang.String custLevel;

    private java.lang.String custLoyalty;

    private java.lang.String dunningFlag;

    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] custProperty;

    public CustomerForBatch() {
    }

    public CustomerForBatch(
           java.lang.String custType,
           java.lang.String custSegment,
           java.lang.String DFTPwd,
           java.lang.String DFTWrittenLang,
           java.lang.String DFTIVRLang,
           java.lang.String DFTBillCycleType,
           java.math.BigInteger DFTCurrencyID,
           java.lang.String custLevel,
           java.lang.String custLoyalty,
           java.lang.String dunningFlag,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] custProperty) {
           this.custType = custType;
           this.custSegment = custSegment;
           this.DFTPwd = DFTPwd;
           this.DFTWrittenLang = DFTWrittenLang;
           this.DFTIVRLang = DFTIVRLang;
           this.DFTBillCycleType = DFTBillCycleType;
           this.DFTCurrencyID = DFTCurrencyID;
           this.custLevel = custLevel;
           this.custLoyalty = custLoyalty;
           this.dunningFlag = dunningFlag;
           this.custProperty = custProperty;
    }


    /**
     * Gets the custType value for this CustomerForBatch.
     * 
     * @return custType
     */
    public java.lang.String getCustType() {
        return custType;
    }


    /**
     * Sets the custType value for this CustomerForBatch.
     * 
     * @param custType
     */
    public void setCustType(java.lang.String custType) {
        this.custType = custType;
    }


    /**
     * Gets the custSegment value for this CustomerForBatch.
     * 
     * @return custSegment
     */
    public java.lang.String getCustSegment() {
        return custSegment;
    }


    /**
     * Sets the custSegment value for this CustomerForBatch.
     * 
     * @param custSegment
     */
    public void setCustSegment(java.lang.String custSegment) {
        this.custSegment = custSegment;
    }


    /**
     * Gets the DFTPwd value for this CustomerForBatch.
     * 
     * @return DFTPwd   * The default password of this customer.
     */
    public java.lang.String getDFTPwd() {
        return DFTPwd;
    }


    /**
     * Sets the DFTPwd value for this CustomerForBatch.
     * 
     * @param DFTPwd   * The default password of this customer.
     */
    public void setDFTPwd(java.lang.String DFTPwd) {
        this.DFTPwd = DFTPwd;
    }


    /**
     * Gets the DFTWrittenLang value for this CustomerForBatch.
     * 
     * @return DFTWrittenLang   * The default written language code of this customer.
     */
    public java.lang.String getDFTWrittenLang() {
        return DFTWrittenLang;
    }


    /**
     * Sets the DFTWrittenLang value for this CustomerForBatch.
     * 
     * @param DFTWrittenLang   * The default written language code of this customer.
     */
    public void setDFTWrittenLang(java.lang.String DFTWrittenLang) {
        this.DFTWrittenLang = DFTWrittenLang;
    }


    /**
     * Gets the DFTIVRLang value for this CustomerForBatch.
     * 
     * @return DFTIVRLang   * The default phonetic language code of this customer
     */
    public java.lang.String getDFTIVRLang() {
        return DFTIVRLang;
    }


    /**
     * Sets the DFTIVRLang value for this CustomerForBatch.
     * 
     * @param DFTIVRLang   * The default phonetic language code of this customer
     */
    public void setDFTIVRLang(java.lang.String DFTIVRLang) {
        this.DFTIVRLang = DFTIVRLang;
    }


    /**
     * Gets the DFTBillCycleType value for this CustomerForBatch.
     * 
     * @return DFTBillCycleType   * The default billing cycle type of this customer
     */
    public java.lang.String getDFTBillCycleType() {
        return DFTBillCycleType;
    }


    /**
     * Sets the DFTBillCycleType value for this CustomerForBatch.
     * 
     * @param DFTBillCycleType   * The default billing cycle type of this customer
     */
    public void setDFTBillCycleType(java.lang.String DFTBillCycleType) {
        this.DFTBillCycleType = DFTBillCycleType;
    }


    /**
     * Gets the DFTCurrencyID value for this CustomerForBatch.
     * 
     * @return DFTCurrencyID   * The default currency code of this customer
     */
    public java.math.BigInteger getDFTCurrencyID() {
        return DFTCurrencyID;
    }


    /**
     * Sets the DFTCurrencyID value for this CustomerForBatch.
     * 
     * @param DFTCurrencyID   * The default currency code of this customer
     */
    public void setDFTCurrencyID(java.math.BigInteger DFTCurrencyID) {
        this.DFTCurrencyID = DFTCurrencyID;
    }


    /**
     * Gets the custLevel value for this CustomerForBatch.
     * 
     * @return custLevel
     */
    public java.lang.String getCustLevel() {
        return custLevel;
    }


    /**
     * Sets the custLevel value for this CustomerForBatch.
     * 
     * @param custLevel
     */
    public void setCustLevel(java.lang.String custLevel) {
        this.custLevel = custLevel;
    }


    /**
     * Gets the custLoyalty value for this CustomerForBatch.
     * 
     * @return custLoyalty
     */
    public java.lang.String getCustLoyalty() {
        return custLoyalty;
    }


    /**
     * Sets the custLoyalty value for this CustomerForBatch.
     * 
     * @param custLoyalty
     */
    public void setCustLoyalty(java.lang.String custLoyalty) {
        this.custLoyalty = custLoyalty;
    }


    /**
     * Gets the dunningFlag value for this CustomerForBatch.
     * 
     * @return dunningFlag
     */
    public java.lang.String getDunningFlag() {
        return dunningFlag;
    }


    /**
     * Sets the dunningFlag value for this CustomerForBatch.
     * 
     * @param dunningFlag
     */
    public void setDunningFlag(java.lang.String dunningFlag) {
        this.dunningFlag = dunningFlag;
    }


    /**
     * Gets the custProperty value for this CustomerForBatch.
     * 
     * @return custProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getCustProperty() {
        return custProperty;
    }


    /**
     * Sets the custProperty value for this CustomerForBatch.
     * 
     * @param custProperty
     */
    public void setCustProperty(com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] custProperty) {
        this.custProperty = custProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty getCustProperty(int i) {
        return this.custProperty[i];
    }

    public void setCustProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty _value) {
        this.custProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerForBatch)) return false;
        CustomerForBatch other = (CustomerForBatch) obj;
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
            ((this.custSegment==null && other.getCustSegment()==null) || 
             (this.custSegment!=null &&
              this.custSegment.equals(other.getCustSegment()))) &&
            ((this.DFTPwd==null && other.getDFTPwd()==null) || 
             (this.DFTPwd!=null &&
              this.DFTPwd.equals(other.getDFTPwd()))) &&
            ((this.DFTWrittenLang==null && other.getDFTWrittenLang()==null) || 
             (this.DFTWrittenLang!=null &&
              this.DFTWrittenLang.equals(other.getDFTWrittenLang()))) &&
            ((this.DFTIVRLang==null && other.getDFTIVRLang()==null) || 
             (this.DFTIVRLang!=null &&
              this.DFTIVRLang.equals(other.getDFTIVRLang()))) &&
            ((this.DFTBillCycleType==null && other.getDFTBillCycleType()==null) || 
             (this.DFTBillCycleType!=null &&
              this.DFTBillCycleType.equals(other.getDFTBillCycleType()))) &&
            ((this.DFTCurrencyID==null && other.getDFTCurrencyID()==null) || 
             (this.DFTCurrencyID!=null &&
              this.DFTCurrencyID.equals(other.getDFTCurrencyID()))) &&
            ((this.custLevel==null && other.getCustLevel()==null) || 
             (this.custLevel!=null &&
              this.custLevel.equals(other.getCustLevel()))) &&
            ((this.custLoyalty==null && other.getCustLoyalty()==null) || 
             (this.custLoyalty!=null &&
              this.custLoyalty.equals(other.getCustLoyalty()))) &&
            ((this.dunningFlag==null && other.getDunningFlag()==null) || 
             (this.dunningFlag!=null &&
              this.dunningFlag.equals(other.getDunningFlag()))) &&
            ((this.custProperty==null && other.getCustProperty()==null) || 
             (this.custProperty!=null &&
              java.util.Arrays.equals(this.custProperty, other.getCustProperty())));
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
        if (getCustSegment() != null) {
            _hashCode += getCustSegment().hashCode();
        }
        if (getDFTPwd() != null) {
            _hashCode += getDFTPwd().hashCode();
        }
        if (getDFTWrittenLang() != null) {
            _hashCode += getDFTWrittenLang().hashCode();
        }
        if (getDFTIVRLang() != null) {
            _hashCode += getDFTIVRLang().hashCode();
        }
        if (getDFTBillCycleType() != null) {
            _hashCode += getDFTBillCycleType().hashCode();
        }
        if (getDFTCurrencyID() != null) {
            _hashCode += getDFTCurrencyID().hashCode();
        }
        if (getCustLevel() != null) {
            _hashCode += getCustLevel().hashCode();
        }
        if (getCustLoyalty() != null) {
            _hashCode += getCustLoyalty().hashCode();
        }
        if (getDunningFlag() != null) {
            _hashCode += getDunningFlag().hashCode();
        }
        if (getCustProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustProperty(), i);
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
        new org.apache.axis.description.TypeDesc(CustomerForBatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustomerForBatch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFTPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "DFTPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFTWrittenLang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "DFTWrittenLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFTIVRLang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "DFTIVRLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFTBillCycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "DFTBillCycleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFTCurrencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "DFTCurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custLoyalty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustLoyalty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dunningFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "DunningFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SimpleProperty"));
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
