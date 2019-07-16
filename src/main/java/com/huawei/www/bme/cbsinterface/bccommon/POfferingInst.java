/**
 * POfferingInst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class POfferingInst  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    private java.lang.String bundledFlag;

    private java.lang.String offeringClass;

    /* If this offering is a member of a bundled offering, this field
     * indicates the corresponding bundled offering subscription instance
     * key. */
    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey parentOfferingKey;

    private java.lang.String status;

    private java.lang.String trialStartTime;

    private java.lang.String trialEndTime;

    private com.huawei.www.bme.cbsinterface.bccommon.ProductInst[] productInst;

    private com.huawei.www.bme.cbsinterface.bccommon.POfferingInstOfferingInstProperty[] offeringInstProperty;

    public POfferingInst() {
    }

    public POfferingInst(
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           java.lang.String bundledFlag,
           java.lang.String offeringClass,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey parentOfferingKey,
           java.lang.String status,
           java.lang.String trialStartTime,
           java.lang.String trialEndTime,
           com.huawei.www.bme.cbsinterface.bccommon.ProductInst[] productInst,
           com.huawei.www.bme.cbsinterface.bccommon.POfferingInstOfferingInstProperty[] offeringInstProperty) {
           this.offeringKey = offeringKey;
           this.bundledFlag = bundledFlag;
           this.offeringClass = offeringClass;
           this.parentOfferingKey = parentOfferingKey;
           this.status = status;
           this.trialStartTime = trialStartTime;
           this.trialEndTime = trialEndTime;
           this.productInst = productInst;
           this.offeringInstProperty = offeringInstProperty;
    }


    /**
     * Gets the offeringKey value for this POfferingInst.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this POfferingInst.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the bundledFlag value for this POfferingInst.
     * 
     * @return bundledFlag
     */
    public java.lang.String getBundledFlag() {
        return bundledFlag;
    }


    /**
     * Sets the bundledFlag value for this POfferingInst.
     * 
     * @param bundledFlag
     */
    public void setBundledFlag(java.lang.String bundledFlag) {
        this.bundledFlag = bundledFlag;
    }


    /**
     * Gets the offeringClass value for this POfferingInst.
     * 
     * @return offeringClass
     */
    public java.lang.String getOfferingClass() {
        return offeringClass;
    }


    /**
     * Sets the offeringClass value for this POfferingInst.
     * 
     * @param offeringClass
     */
    public void setOfferingClass(java.lang.String offeringClass) {
        this.offeringClass = offeringClass;
    }


    /**
     * Gets the parentOfferingKey value for this POfferingInst.
     * 
     * @return parentOfferingKey   * If this offering is a member of a bundled offering, this field
     * indicates the corresponding bundled offering subscription instance
     * key.
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getParentOfferingKey() {
        return parentOfferingKey;
    }


    /**
     * Sets the parentOfferingKey value for this POfferingInst.
     * 
     * @param parentOfferingKey   * If this offering is a member of a bundled offering, this field
     * indicates the corresponding bundled offering subscription instance
     * key.
     */
    public void setParentOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey parentOfferingKey) {
        this.parentOfferingKey = parentOfferingKey;
    }


    /**
     * Gets the status value for this POfferingInst.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this POfferingInst.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the trialStartTime value for this POfferingInst.
     * 
     * @return trialStartTime
     */
    public java.lang.String getTrialStartTime() {
        return trialStartTime;
    }


    /**
     * Sets the trialStartTime value for this POfferingInst.
     * 
     * @param trialStartTime
     */
    public void setTrialStartTime(java.lang.String trialStartTime) {
        this.trialStartTime = trialStartTime;
    }


    /**
     * Gets the trialEndTime value for this POfferingInst.
     * 
     * @return trialEndTime
     */
    public java.lang.String getTrialEndTime() {
        return trialEndTime;
    }


    /**
     * Sets the trialEndTime value for this POfferingInst.
     * 
     * @param trialEndTime
     */
    public void setTrialEndTime(java.lang.String trialEndTime) {
        this.trialEndTime = trialEndTime;
    }


    /**
     * Gets the productInst value for this POfferingInst.
     * 
     * @return productInst
     */
    public com.huawei.www.bme.cbsinterface.bccommon.ProductInst[] getProductInst() {
        return productInst;
    }


    /**
     * Sets the productInst value for this POfferingInst.
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
     * Gets the offeringInstProperty value for this POfferingInst.
     * 
     * @return offeringInstProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.POfferingInstOfferingInstProperty[] getOfferingInstProperty() {
        return offeringInstProperty;
    }


    /**
     * Sets the offeringInstProperty value for this POfferingInst.
     * 
     * @param offeringInstProperty
     */
    public void setOfferingInstProperty(com.huawei.www.bme.cbsinterface.bccommon.POfferingInstOfferingInstProperty[] offeringInstProperty) {
        this.offeringInstProperty = offeringInstProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.POfferingInstOfferingInstProperty getOfferingInstProperty(int i) {
        return this.offeringInstProperty[i];
    }

    public void setOfferingInstProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.POfferingInstOfferingInstProperty _value) {
        this.offeringInstProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof POfferingInst)) return false;
        POfferingInst other = (POfferingInst) obj;
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
            ((this.offeringInstProperty==null && other.getOfferingInstProperty()==null) || 
             (this.offeringInstProperty!=null &&
              java.util.Arrays.equals(this.offeringInstProperty, other.getOfferingInstProperty())));
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
        if (getOfferingInstProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferingInstProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferingInstProperty(), i);
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
        new org.apache.axis.description.TypeDesc(POfferingInst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "POfferingInst"));
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
        elemField.setFieldName("offeringInstProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingInstProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">POfferingInst>OfferingInstProperty"));
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
