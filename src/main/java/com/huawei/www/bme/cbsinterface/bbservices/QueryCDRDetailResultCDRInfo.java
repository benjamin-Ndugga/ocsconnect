/**
 * QueryCDRDetailResultCDRInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryCDRDetailResultCDRInfo  implements java.io.Serializable {
    private java.lang.String cdrSeq;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList[] volumeInfo;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoChargeDetail[] chargeDetail;

    /* It is reserved for future extension */
    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoAdditionalProperty[] additionalProperty;

    public QueryCDRDetailResultCDRInfo() {
    }

    public QueryCDRDetailResultCDRInfo(
           java.lang.String cdrSeq,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList[] volumeInfo,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoChargeDetail[] chargeDetail,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoAdditionalProperty[] additionalProperty) {
           this.cdrSeq = cdrSeq;
           this.volumeInfo = volumeInfo;
           this.chargeDetail = chargeDetail;
           this.additionalProperty = additionalProperty;
    }


    /**
     * Gets the cdrSeq value for this QueryCDRDetailResultCDRInfo.
     * 
     * @return cdrSeq
     */
    public java.lang.String getCdrSeq() {
        return cdrSeq;
    }


    /**
     * Sets the cdrSeq value for this QueryCDRDetailResultCDRInfo.
     * 
     * @param cdrSeq
     */
    public void setCdrSeq(java.lang.String cdrSeq) {
        this.cdrSeq = cdrSeq;
    }


    /**
     * Gets the volumeInfo value for this QueryCDRDetailResultCDRInfo.
     * 
     * @return volumeInfo
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList[] getVolumeInfo() {
        return volumeInfo;
    }


    /**
     * Sets the volumeInfo value for this QueryCDRDetailResultCDRInfo.
     * 
     * @param volumeInfo
     */
    public void setVolumeInfo(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoVolumeInfoFreeUnitList[] volumeInfo) {
        this.volumeInfo = volumeInfo;
    }


    /**
     * Gets the chargeDetail value for this QueryCDRDetailResultCDRInfo.
     * 
     * @return chargeDetail
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoChargeDetail[] getChargeDetail() {
        return chargeDetail;
    }


    /**
     * Sets the chargeDetail value for this QueryCDRDetailResultCDRInfo.
     * 
     * @param chargeDetail
     */
    public void setChargeDetail(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoChargeDetail[] chargeDetail) {
        this.chargeDetail = chargeDetail;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoChargeDetail getChargeDetail(int i) {
        return this.chargeDetail[i];
    }

    public void setChargeDetail(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoChargeDetail _value) {
        this.chargeDetail[i] = _value;
    }


    /**
     * Gets the additionalProperty value for this QueryCDRDetailResultCDRInfo.
     * 
     * @return additionalProperty   * It is reserved for future extension
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoAdditionalProperty[] getAdditionalProperty() {
        return additionalProperty;
    }


    /**
     * Sets the additionalProperty value for this QueryCDRDetailResultCDRInfo.
     * 
     * @param additionalProperty   * It is reserved for future extension
     */
    public void setAdditionalProperty(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoAdditionalProperty[] additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoAdditionalProperty getAdditionalProperty(int i) {
        return this.additionalProperty[i];
    }

    public void setAdditionalProperty(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultCDRInfoAdditionalProperty _value) {
        this.additionalProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCDRDetailResultCDRInfo)) return false;
        QueryCDRDetailResultCDRInfo other = (QueryCDRDetailResultCDRInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdrSeq==null && other.getCdrSeq()==null) || 
             (this.cdrSeq!=null &&
              this.cdrSeq.equals(other.getCdrSeq()))) &&
            ((this.volumeInfo==null && other.getVolumeInfo()==null) || 
             (this.volumeInfo!=null &&
              java.util.Arrays.equals(this.volumeInfo, other.getVolumeInfo()))) &&
            ((this.chargeDetail==null && other.getChargeDetail()==null) || 
             (this.chargeDetail!=null &&
              java.util.Arrays.equals(this.chargeDetail, other.getChargeDetail()))) &&
            ((this.additionalProperty==null && other.getAdditionalProperty()==null) || 
             (this.additionalProperty!=null &&
              java.util.Arrays.equals(this.additionalProperty, other.getAdditionalProperty())));
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
        if (getCdrSeq() != null) {
            _hashCode += getCdrSeq().hashCode();
        }
        if (getVolumeInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVolumeInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVolumeInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChargeDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChargeDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChargeDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdditionalProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalProperty(), i);
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
        new org.apache.axis.description.TypeDesc(QueryCDRDetailResultCDRInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRDetailResult>CDRInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdrSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CdrSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "VolumeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>>QueryCDRDetailResult>CDRInfo>VolumeInfo>FreeUnitList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FreeUnitList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ChargeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRDetailResult>CDRInfo>ChargeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AdditionalProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRDetailResult>CDRInfo>AdditionalProperty"));
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
