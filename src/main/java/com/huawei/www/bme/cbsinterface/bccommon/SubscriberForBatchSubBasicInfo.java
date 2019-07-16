/**
 * SubscriberForBatchSubBasicInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bccommon;

public class SubscriberForBatchSubBasicInfo  implements java.io.Serializable {
    private java.lang.String writtenLang;

    private java.lang.String IVRLang;

    private java.lang.String subLevel;

    private java.lang.String dunningFlag;

    private com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] subProperty;

    public SubscriberForBatchSubBasicInfo() {
    }

    public SubscriberForBatchSubBasicInfo(
           java.lang.String writtenLang,
           java.lang.String IVRLang,
           java.lang.String subLevel,
           java.lang.String dunningFlag,
           com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] subProperty) {
           this.writtenLang = writtenLang;
           this.IVRLang = IVRLang;
           this.subLevel = subLevel;
           this.dunningFlag = dunningFlag;
           this.subProperty = subProperty;
    }


    /**
     * Gets the writtenLang value for this SubscriberForBatchSubBasicInfo.
     * 
     * @return writtenLang
     */
    public java.lang.String getWrittenLang() {
        return writtenLang;
    }


    /**
     * Sets the writtenLang value for this SubscriberForBatchSubBasicInfo.
     * 
     * @param writtenLang
     */
    public void setWrittenLang(java.lang.String writtenLang) {
        this.writtenLang = writtenLang;
    }


    /**
     * Gets the IVRLang value for this SubscriberForBatchSubBasicInfo.
     * 
     * @return IVRLang
     */
    public java.lang.String getIVRLang() {
        return IVRLang;
    }


    /**
     * Sets the IVRLang value for this SubscriberForBatchSubBasicInfo.
     * 
     * @param IVRLang
     */
    public void setIVRLang(java.lang.String IVRLang) {
        this.IVRLang = IVRLang;
    }


    /**
     * Gets the subLevel value for this SubscriberForBatchSubBasicInfo.
     * 
     * @return subLevel
     */
    public java.lang.String getSubLevel() {
        return subLevel;
    }


    /**
     * Sets the subLevel value for this SubscriberForBatchSubBasicInfo.
     * 
     * @param subLevel
     */
    public void setSubLevel(java.lang.String subLevel) {
        this.subLevel = subLevel;
    }


    /**
     * Gets the dunningFlag value for this SubscriberForBatchSubBasicInfo.
     * 
     * @return dunningFlag
     */
    public java.lang.String getDunningFlag() {
        return dunningFlag;
    }


    /**
     * Sets the dunningFlag value for this SubscriberForBatchSubBasicInfo.
     * 
     * @param dunningFlag
     */
    public void setDunningFlag(java.lang.String dunningFlag) {
        this.dunningFlag = dunningFlag;
    }


    /**
     * Gets the subProperty value for this SubscriberForBatchSubBasicInfo.
     * 
     * @return subProperty
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] getSubProperty() {
        return subProperty;
    }


    /**
     * Sets the subProperty value for this SubscriberForBatchSubBasicInfo.
     * 
     * @param subProperty
     */
    public void setSubProperty(com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty[] subProperty) {
        this.subProperty = subProperty;
    }

    public com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty getSubProperty(int i) {
        return this.subProperty[i];
    }

    public void setSubProperty(int i, com.huawei.www.bme.cbsinterface.bccommon.SimpleProperty _value) {
        this.subProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberForBatchSubBasicInfo)) return false;
        SubscriberForBatchSubBasicInfo other = (SubscriberForBatchSubBasicInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.writtenLang==null && other.getWrittenLang()==null) || 
             (this.writtenLang!=null &&
              this.writtenLang.equals(other.getWrittenLang()))) &&
            ((this.IVRLang==null && other.getIVRLang()==null) || 
             (this.IVRLang!=null &&
              this.IVRLang.equals(other.getIVRLang()))) &&
            ((this.subLevel==null && other.getSubLevel()==null) || 
             (this.subLevel!=null &&
              this.subLevel.equals(other.getSubLevel()))) &&
            ((this.dunningFlag==null && other.getDunningFlag()==null) || 
             (this.dunningFlag!=null &&
              this.dunningFlag.equals(other.getDunningFlag()))) &&
            ((this.subProperty==null && other.getSubProperty()==null) || 
             (this.subProperty!=null &&
              java.util.Arrays.equals(this.subProperty, other.getSubProperty())));
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
        if (getWrittenLang() != null) {
            _hashCode += getWrittenLang().hashCode();
        }
        if (getIVRLang() != null) {
            _hashCode += getIVRLang().hashCode();
        }
        if (getSubLevel() != null) {
            _hashCode += getSubLevel().hashCode();
        }
        if (getDunningFlag() != null) {
            _hashCode += getDunningFlag().hashCode();
        }
        if (getSubProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubProperty(), i);
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
        new org.apache.axis.description.TypeDesc(SubscriberForBatchSubBasicInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", ">SubscriberForBatch>SubBasicInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writtenLang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "WrittenLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IVRLang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "IVRLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubLevel"));
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
        elemField.setFieldName("subProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubProperty"));
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
