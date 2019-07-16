/**
 * OfferingInst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class OfferingInst  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    private java.lang.String bundledFlag;

    private java.lang.String offeringClass;

    /* If this offering is a member of a bundled offering, this field
     * indicates the corresponding bundled offering subscription instance
     * key. */
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey parentOfferingKey;

    /* If this offering is group member offering, this field indicates
     * the related offering subscription key on group level if it is existed. */
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey relGOfferingKey;

    private java.lang.String status;

    private java.lang.String trialStartTime;

    private java.lang.String trialEndTime;

    private com.huawei.www.bme.cbsinterface.bccommon.ProductInst[] productInst;

    private com.huawei.www.bme.cbsinterface.bccommon.OfferingInstOInstProperty[] OInstProperty;

    public OfferingInst() {
    }

    public OfferingInst(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           java.lang.String bundledFlag,
           java.lang.String offeringClass,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey parentOfferingKey,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey relGOfferingKey,
           java.lang.String status,
           java.lang.String trialStartTime,
           java.lang.String trialEndTime,
           com.huawei.www.bme.cbsinterface.bccommon.ProductInst[] productInst,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingInstOInstProperty[] OInstProperty) {
           this.offeringKey = offeringKey;
           this.bundledFlag = bundledFlag;
           this.offeringClass = offeringClass;
           this.parentOfferingKey = parentOfferingKey;
           this.relGOfferingKey = relGOfferingKey;
           this.status = status;
           this.trialStartTime = trialStartTime;
           this.trialEndTime = trialEndTime;
           this.productInst = productInst;
           this.OInstProperty = OInstProperty;
    }


    /**
     * Gets the offeringKey value for this OfferingInst.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this OfferingInst.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the bundledFlag value for this OfferingInst.
     * 
     * @return bundledFlag
     */
    public java.lang.String getBundledFlag() {
        return bundledFlag;
    }


    /**
     * Sets the bundledFlag value for this OfferingInst.
     * 
     * @param bundledFlag
     */
    public void setBundledFlag(java.lang.String bundledFlag) {
        this.bundledFlag = bundledFlag;
    }


    /**
     * Gets the offeringClass value for this OfferingInst.
     * 
     * @return offeringClass
     */
    public java.lang.String getOfferingClass() {
        return offeringClass;
    }


    /**
     * Sets the offeringClass value for this OfferingInst.
     * 
     * @param offeringClass
     */
    public void setOfferingClass(java.lang.String offeringClass) {
        this.offeringClass = offeringClass;
    }


    /**
     * Gets the parentOfferingKey value for this OfferingInst.
     * 
     * @return parentOfferingKey   * If this offering is a member of a bundled offering, this field
     * indicates the corresponding bundled offering subscription instance
     * key.
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getParentOfferingKey() {
        return parentOfferingKey;
    }


    /**
     * Sets the parentOfferingKey value for this OfferingInst.
     * 
     * @param parentOfferingKey   * If this offering is a member of a bundled offering, this field
     * indicates the corresponding bundled offering subscription instance
     * key.
     */
    public void setParentOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey parentOfferingKey) {
        this.parentOfferingKey = parentOfferingKey;
    }


    /**
     * Gets the relGOfferingKey value for this OfferingInst.
     * 
     * @return relGOfferingKey   * If this offering is group member offering, this field indicates
     * the related offering subscription key on group level if it is existed.
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getRelGOfferingKey() {
        return relGOfferingKey;
    }


    /**
     * Sets the relGOfferingKey value for this OfferingInst.
     * 
     * @param relGOfferingKey   * If this offering is group member offering, this field indicates
     * the related offering subscription key on group level if it is existed.
     */
    public void setRelGOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey relGOfferingKey) {
        this.relGOfferingKey = relGOfferingKey;
    }


    /**
     * Gets the status value for this OfferingInst.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OfferingInst.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the trialStartTime value for this OfferingInst.
     * 
     * @return trialStartTime
     */
    public java.lang.String getTrialStartTime() {
        return trialStartTime;
    }


    /**
     * Sets the trialStartTime value for this OfferingInst.
     * 
     * @param trialStartTime
     */
    public void setTrialStartTime(java.lang.String trialStartTime) {
        this.trialStartTime = trialStartTime;
    }


    /**
     * Gets the trialEndTime value for this OfferingInst.
     * 
     * @return trialEndTime
     */
    public java.lang.String getTrialEndTime() {
        return trialEndTime;
    }


    /**
     * Sets the trialEndTime value for this OfferingInst.
     * 
     * @param trialEndTime
     */
    public void setTrialEndTime(java.lang.String trialEndTime) {
        this.trialEndTime = trialEndTime;
    }


    /**
     * Gets the productInst value for this OfferingInst.
     * 
     * @return productInst
     */
    public com.huawei.www.bme.cbsinterface.bccommon.ProductInst[] getProductInst() {
        return productInst;
    }


    /**
     * Sets the productInst value for this OfferingInst.
     * 
     * @param productInst
     */
    public void setProductInst(com.huawei.www.bme.cbsinterface.bccommon.ProductInst[] productInst) {
        this.productInst = productInst;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.ProductInst getProductInst(int i) {
        return this.productInst[i];
    }

    public void setProductInst(int i, com.huawei.www.bme.cbsinterface.bccommon.ProductInst _value) {
        this.productInst[i] = _value;
    }


    /**
     * Gets the OInstProperty value for this OfferingInst.
     * 
     * @return OInstProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingInstOInstProperty[] getOInstProperty() {
        return OInstProperty;
    }


    /**
     * Sets the OInstProperty value for this OfferingInst.
     * 
     * @param OInstProperty
     */
    public void setOInstProperty(com.huawei.www.bme.cbsinterface.bccommon.OfferingInstOInstProperty[] OInstProperty) {
        this.OInstProperty = OInstProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.OfferingInstOInstProperty getOInstProperty(int i) {
        return this.OInstProperty[i];
    }

    public void setOInstProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.OfferingInstOInstProperty _value) {
        this.OInstProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfferingInst)) return false;
        OfferingInst other = (OfferingInst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offeringKey==null && other.getOfferingKey()==null) || 
             (this.offeringKey!=null &&
              this.offeringKey.equals(other.getOfferingKey()))) &&
            ((this.bundledFlag==null && other.getBundledFlag()==null) || 
             (this.bundledFlag!=null &&
              this.bundledFlag.equals(other.getBundledFlag()))) &&
            ((this.offeringClass==null && other.getOfferingClass()==null) || 
             (this.offeringClass!=null &&
              this.offeringClass.equals(other.getOfferingClass()))) &&
            ((this.parentOfferingKey==null && other.getParentOfferingKey()==null) || 
             (this.parentOfferingKey!=null &&
              this.parentOfferingKey.equals(other.getParentOfferingKey()))) &&
            ((this.relGOfferingKey==null && other.getRelGOfferingKey()==null) || 
             (this.relGOfferingKey!=null &&
              this.relGOfferingKey.equals(other.getRelGOfferingKey()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.trialStartTime==null && other.getTrialStartTime()==null) || 
             (this.trialStartTime!=null &&
              this.trialStartTime.equals(other.getTrialStartTime()))) &&
            ((this.trialEndTime==null && other.getTrialEndTime()==null) || 
             (this.trialEndTime!=null &&
              this.trialEndTime.equals(other.getTrialEndTime()))) &&
            ((this.productInst==null && other.getProductInst()==null) || 
             (this.productInst!=null &&
              java.util.Arrays.equals(this.productInst, other.getProductInst()))) &&
            ((this.OInstProperty==null && other.getOInstProperty()==null) || 
             (this.OInstProperty!=null &&
              java.util.Arrays.equals(this.OInstProperty, other.getOInstProperty())));
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
        if (getOfferingKey() != null) {
            _hashCode += getOfferingKey().hashCode();
        }
        if (getBundledFlag() != null) {
            _hashCode += getBundledFlag().hashCode();
        }
        if (getOfferingClass() != null) {
            _hashCode += getOfferingClass().hashCode();
        }
        if (getParentOfferingKey() != null) {
            _hashCode += getParentOfferingKey().hashCode();
        }
        if (getRelGOfferingKey() != null) {
            _hashCode += getRelGOfferingKey().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTrialStartTime() != null) {
            _hashCode += getTrialStartTime().hashCode();
        }
        if (getTrialEndTime() != null) {
            _hashCode += getTrialEndTime().hashCode();
        }
        if (getProductInst() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductInst());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductInst(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOInstProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOInstProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOInstProperty(), i);
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
        new org.apache.axis.description.TypeDesc(OfferingInst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingInst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundledFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "BundledFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentOfferingKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ParentOfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relGOfferingKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "RelGOfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trialStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "TrialStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trialEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "TrialEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productInst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ProductInst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "ProductInst"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OInstProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OInstProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">OfferingInst>OInstProperty"));
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
