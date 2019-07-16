/**
 * QueryCustomerInfoResultSubGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryCustomerInfoResultSubGroup  implements java.io.Serializable {
    private java.lang.String subGroupKey;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSubGroupInfo subGroupInfo;

    private com.huawei.www.bme.cbsinterface.bccommon.POfferingInst primaryOffering;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSupplementaryOffering[] supplementaryOffering;

    public QueryCustomerInfoResultSubGroup() {
    }

    public QueryCustomerInfoResultSubGroup(
           java.lang.String subGroupKey,
           com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSubGroupInfo subGroupInfo,
           com.huawei.www.bme.cbsinterface.bccommon.POfferingInst primaryOffering,
           com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSupplementaryOffering[] supplementaryOffering) {
           this.subGroupKey = subGroupKey;
           this.subGroupInfo = subGroupInfo;
           this.primaryOffering = primaryOffering;
           this.supplementaryOffering = supplementaryOffering;
    }


    /**
     * Gets the subGroupKey value for this QueryCustomerInfoResultSubGroup.
     * 
     * @return subGroupKey
     */
    public java.lang.String getSubGroupKey() {
        return subGroupKey;
    }


    /**
     * Sets the subGroupKey value for this QueryCustomerInfoResultSubGroup.
     * 
     * @param subGroupKey
     */
    public void setSubGroupKey(java.lang.String subGroupKey) {
        this.subGroupKey = subGroupKey;
    }


    /**
     * Gets the subGroupInfo value for this QueryCustomerInfoResultSubGroup.
     * 
     * @return subGroupInfo
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSubGroupInfo getSubGroupInfo() {
        return subGroupInfo;
    }


    /**
     * Sets the subGroupInfo value for this QueryCustomerInfoResultSubGroup.
     * 
     * @param subGroupInfo
     */
    public void setSubGroupInfo(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSubGroupInfo subGroupInfo) {
        this.subGroupInfo = subGroupInfo;
    }


    /**
     * Gets the primaryOffering value for this QueryCustomerInfoResultSubGroup.
     * 
     * @return primaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bccommon.POfferingInst getPrimaryOffering() {
        return primaryOffering;
    }


    /**
     * Sets the primaryOffering value for this QueryCustomerInfoResultSubGroup.
     * 
     * @param primaryOffering
     */
    public void setPrimaryOffering(com.huawei.www.bme.cbsinterface.bccommon.POfferingInst primaryOffering) {
        this.primaryOffering = primaryOffering;
    }


    /**
     * Gets the supplementaryOffering value for this QueryCustomerInfoResultSubGroup.
     * 
     * @return supplementaryOffering
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSupplementaryOffering[] getSupplementaryOffering() {
        return supplementaryOffering;
    }


    /**
     * Sets the supplementaryOffering value for this QueryCustomerInfoResultSubGroup.
     * 
     * @param supplementaryOffering
     */
    public void setSupplementaryOffering(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSupplementaryOffering[] supplementaryOffering) {
        this.supplementaryOffering = supplementaryOffering;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSupplementaryOffering getSupplementaryOffering(int i) {
        return this.supplementaryOffering[i];
    }

    public void setSupplementaryOffering(int i, com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSupplementaryOffering _value) {
        this.supplementaryOffering[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCustomerInfoResultSubGroup)) return false;
        QueryCustomerInfoResultSubGroup other = (QueryCustomerInfoResultSubGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subGroupKey==null && other.getSubGroupKey()==null) || 
             (this.subGroupKey!=null &&
              this.subGroupKey.equals(other.getSubGroupKey()))) &&
            ((this.subGroupInfo==null && other.getSubGroupInfo()==null) || 
             (this.subGroupInfo!=null &&
              this.subGroupInfo.equals(other.getSubGroupInfo()))) &&
            ((this.primaryOffering==null && other.getPrimaryOffering()==null) || 
             (this.primaryOffering!=null &&
              this.primaryOffering.equals(other.getPrimaryOffering()))) &&
            ((this.supplementaryOffering==null && other.getSupplementaryOffering()==null) || 
             (this.supplementaryOffering!=null &&
              java.util.Arrays.equals(this.supplementaryOffering, other.getSupplementaryOffering())));
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
        if (getSubGroupKey() != null) {
            _hashCode += getSubGroupKey().hashCode();
        }
        if (getSubGroupInfo() != null) {
            _hashCode += getSubGroupInfo().hashCode();
        }
        if (getPrimaryOffering() != null) {
            _hashCode += getPrimaryOffering().hashCode();
        }
        if (getSupplementaryOffering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupplementaryOffering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupplementaryOffering(), i);
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
        new org.apache.axis.description.TypeDesc(QueryCustomerInfoResultSubGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryCustomerInfoResult>SubGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGroupKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubGroupInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>SubGroup>SubGroupInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrimaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "POfferingInst"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplementaryOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SupplementaryOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>SubGroup>SupplementaryOffering"));
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
