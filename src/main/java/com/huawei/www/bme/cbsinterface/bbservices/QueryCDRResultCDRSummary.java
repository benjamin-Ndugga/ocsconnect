/**
 * QueryCDRResultCDRSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryCDRResultCDRSummary  implements java.io.Serializable {
    /* 业务分类，如 呼叫，短信，彩信 */
    private java.lang.String serviceCategory;

    /* 业务类型，如国内固话呼叫、国内移动呼叫、国际移动呼叫 */
    private java.lang.String seriveType;

    private java.lang.String serviceTypeName;

    /* 例如：MO, MT, MF
     * 对于Voice, SMS, MMS等存在主被叫的业务有效 */
    private java.lang.String flowType;

    private java.lang.String roamFlag;

    private java.lang.String billCycleID;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryVolumeInfo[] volumeInfo;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryTotalChargeInfo[] totalChargeInfo;

    /* It is reserved for future extension */
    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryAdditionalProperty[] additionalProperty;

    public QueryCDRResultCDRSummary() {
    }

    public QueryCDRResultCDRSummary(
           java.lang.String serviceCategory,
           java.lang.String seriveType,
           java.lang.String serviceTypeName,
           java.lang.String flowType,
           java.lang.String roamFlag,
           java.lang.String billCycleID,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryVolumeInfo[] volumeInfo,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryTotalChargeInfo[] totalChargeInfo,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryAdditionalProperty[] additionalProperty) {
           this.serviceCategory = serviceCategory;
           this.seriveType = seriveType;
           this.serviceTypeName = serviceTypeName;
           this.flowType = flowType;
           this.roamFlag = roamFlag;
           this.billCycleID = billCycleID;
           this.volumeInfo = volumeInfo;
           this.totalChargeInfo = totalChargeInfo;
           this.additionalProperty = additionalProperty;
    }


    /**
     * Gets the serviceCategory value for this QueryCDRResultCDRSummary.
     * 
     * @return serviceCategory   * 业务分类，如 呼叫，短信，彩信
     */
    public java.lang.String getServiceCategory() {
        return serviceCategory;
    }


    /**
     * Sets the serviceCategory value for this QueryCDRResultCDRSummary.
     * 
     * @param serviceCategory   * 业务分类，如 呼叫，短信，彩信
     */
    public void setServiceCategory(java.lang.String serviceCategory) {
        this.serviceCategory = serviceCategory;
    }


    /**
     * Gets the seriveType value for this QueryCDRResultCDRSummary.
     * 
     * @return seriveType   * 业务类型，如国内固话呼叫、国内移动呼叫、国际移动呼叫
     */
    public java.lang.String getSeriveType() {
        return seriveType;
    }


    /**
     * Sets the seriveType value for this QueryCDRResultCDRSummary.
     * 
     * @param seriveType   * 业务类型，如国内固话呼叫、国内移动呼叫、国际移动呼叫
     */
    public void setSeriveType(java.lang.String seriveType) {
        this.seriveType = seriveType;
    }


    /**
     * Gets the serviceTypeName value for this QueryCDRResultCDRSummary.
     * 
     * @return serviceTypeName
     */
    public java.lang.String getServiceTypeName() {
        return serviceTypeName;
    }


    /**
     * Sets the serviceTypeName value for this QueryCDRResultCDRSummary.
     * 
     * @param serviceTypeName
     */
    public void setServiceTypeName(java.lang.String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }


    /**
     * Gets the flowType value for this QueryCDRResultCDRSummary.
     * 
     * @return flowType   * 例如：MO, MT, MF
     * 对于Voice, SMS, MMS等存在主被叫的业务有效
     */
    public java.lang.String getFlowType() {
        return flowType;
    }


    /**
     * Sets the flowType value for this QueryCDRResultCDRSummary.
     * 
     * @param flowType   * 例如：MO, MT, MF
     * 对于Voice, SMS, MMS等存在主被叫的业务有效
     */
    public void setFlowType(java.lang.String flowType) {
        this.flowType = flowType;
    }


    /**
     * Gets the roamFlag value for this QueryCDRResultCDRSummary.
     * 
     * @return roamFlag
     */
    public java.lang.String getRoamFlag() {
        return roamFlag;
    }


    /**
     * Sets the roamFlag value for this QueryCDRResultCDRSummary.
     * 
     * @param roamFlag
     */
    public void setRoamFlag(java.lang.String roamFlag) {
        this.roamFlag = roamFlag;
    }


    /**
     * Gets the billCycleID value for this QueryCDRResultCDRSummary.
     * 
     * @return billCycleID
     */
    public java.lang.String getBillCycleID() {
        return billCycleID;
    }


    /**
     * Sets the billCycleID value for this QueryCDRResultCDRSummary.
     * 
     * @param billCycleID
     */
    public void setBillCycleID(java.lang.String billCycleID) {
        this.billCycleID = billCycleID;
    }


    /**
     * Gets the volumeInfo value for this QueryCDRResultCDRSummary.
     * 
     * @return volumeInfo
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryVolumeInfo[] getVolumeInfo() {
        return volumeInfo;
    }


    /**
     * Sets the volumeInfo value for this QueryCDRResultCDRSummary.
     * 
     * @param volumeInfo
     */
    public void setVolumeInfo(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryVolumeInfo[] volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryVolumeInfo getVolumeInfo(int i) {
        return this.volumeInfo[i];
    }

    public void setVolumeInfo(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryVolumeInfo _value) {
        this.volumeInfo[i] = _value;
    }


    /**
     * Gets the totalChargeInfo value for this QueryCDRResultCDRSummary.
     * 
     * @return totalChargeInfo
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryTotalChargeInfo[] getTotalChargeInfo() {
        return totalChargeInfo;
    }


    /**
     * Sets the totalChargeInfo value for this QueryCDRResultCDRSummary.
     * 
     * @param totalChargeInfo
     */
    public void setTotalChargeInfo(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryTotalChargeInfo[] totalChargeInfo) {
        this.totalChargeInfo = totalChargeInfo;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryTotalChargeInfo getTotalChargeInfo(int i) {
        return this.totalChargeInfo[i];
    }

    public void setTotalChargeInfo(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryTotalChargeInfo _value) {
        this.totalChargeInfo[i] = _value;
    }


    /**
     * Gets the additionalProperty value for this QueryCDRResultCDRSummary.
     * 
     * @return additionalProperty   * It is reserved for future extension
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryAdditionalProperty[] getAdditionalProperty() {
        return additionalProperty;
    }


    /**
     * Sets the additionalProperty value for this QueryCDRResultCDRSummary.
     * 
     * @param additionalProperty   * It is reserved for future extension
     */
    public void setAdditionalProperty(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryAdditionalProperty[] additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryAdditionalProperty getAdditionalProperty(int i) {
        return this.additionalProperty[i];
    }

    public void setAdditionalProperty(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultCDRSummaryAdditionalProperty _value) {
        this.additionalProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCDRResultCDRSummary)) return false;
        QueryCDRResultCDRSummary other = (QueryCDRResultCDRSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceCategory==null && other.getServiceCategory()==null) || 
             (this.serviceCategory!=null &&
              this.serviceCategory.equals(other.getServiceCategory()))) &&
            ((this.seriveType==null && other.getSeriveType()==null) || 
             (this.seriveType!=null &&
              this.seriveType.equals(other.getSeriveType()))) &&
            ((this.serviceTypeName==null && other.getServiceTypeName()==null) || 
             (this.serviceTypeName!=null &&
              this.serviceTypeName.equals(other.getServiceTypeName()))) &&
            ((this.flowType==null && other.getFlowType()==null) || 
             (this.flowType!=null &&
              this.flowType.equals(other.getFlowType()))) &&
            ((this.roamFlag==null && other.getRoamFlag()==null) || 
             (this.roamFlag!=null &&
              this.roamFlag.equals(other.getRoamFlag()))) &&
            ((this.billCycleID==null && other.getBillCycleID()==null) || 
             (this.billCycleID!=null &&
              this.billCycleID.equals(other.getBillCycleID()))) &&
            ((this.volumeInfo==null && other.getVolumeInfo()==null) || 
             (this.volumeInfo!=null &&
              java.util.Arrays.equals(this.volumeInfo, other.getVolumeInfo()))) &&
            ((this.totalChargeInfo==null && other.getTotalChargeInfo()==null) || 
             (this.totalChargeInfo!=null &&
              java.util.Arrays.equals(this.totalChargeInfo, other.getTotalChargeInfo()))) &&
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
        if (getServiceCategory() != null) {
            _hashCode += getServiceCategory().hashCode();
        }
        if (getSeriveType() != null) {
            _hashCode += getSeriveType().hashCode();
        }
        if (getServiceTypeName() != null) {
            _hashCode += getServiceTypeName().hashCode();
        }
        if (getFlowType() != null) {
            _hashCode += getFlowType().hashCode();
        }
        if (getRoamFlag() != null) {
            _hashCode += getRoamFlag().hashCode();
        }
        if (getBillCycleID() != null) {
            _hashCode += getBillCycleID().hashCode();
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
        if (getTotalChargeInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotalChargeInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotalChargeInfo(), i);
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
        new org.apache.axis.description.TypeDesc(QueryCDRResultCDRSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRResult>CDRSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ServiceCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seriveType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "SeriveType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ServiceTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FlowType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roamFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "RoamFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "BillCycleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "VolumeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRSummary>VolumeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalChargeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "TotalChargeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRSummary>TotalChargeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AdditionalProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryCDRResult>CDRSummary>AdditionalProperty"));
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
