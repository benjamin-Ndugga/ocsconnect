/**
 * QueryCustomerInfoResultSubGroupSubGroupInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryCustomerInfoResultSubGroupSubGroupInfo  extends com.huawei.www.bme.cbsinterface.bccommon.SubGroup  implements java.io.Serializable {
    private java.lang.String groupType;

    private java.lang.String status;

    private java.lang.String statusDetail;

    private com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSubGroupInfoUserCustomer userCustomer;

    private com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo;

    private java.lang.String RGroupKey;

    public QueryCustomerInfoResultSubGroupSubGroupInfo() {
    }

    public QueryCustomerInfoResultSubGroupSubGroupInfo(
           java.lang.String subGroupClass,
           java.lang.String subGroupCode,
           java.lang.String userCustomerKey,
           java.lang.String PGroupKey,
           java.lang.String password,
           com.huawei.www.bme.cbsinterface.bccommon.SubGroupBasicInfo subGroupBasicInfo,
           java.lang.String groupType,
           java.lang.String status,
           java.lang.String statusDetail,
           com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSubGroupInfoUserCustomer userCustomer,
           com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo,
           java.lang.String RGroupKey) {
        super(
            subGroupClass,
            subGroupCode,
            userCustomerKey,
            PGroupKey,
            password,
            subGroupBasicInfo);
        this.groupType = groupType;
        this.status = status;
        this.statusDetail = statusDetail;
        this.userCustomer = userCustomer;
        this.addressInfo = addressInfo;
        this.RGroupKey = RGroupKey;
    }


    /**
     * Gets the groupType value for this QueryCustomerInfoResultSubGroupSubGroupInfo.
     * 
     * @return groupType
     */
    public java.lang.String getGroupType() {
        return groupType;
    }


    /**
     * Sets the groupType value for this QueryCustomerInfoResultSubGroupSubGroupInfo.
     * 
     * @param groupType
     */
    public void setGroupType(java.lang.String groupType) {
        this.groupType = groupType;
    }


    /**
     * Gets the status value for this QueryCustomerInfoResultSubGroupSubGroupInfo.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this QueryCustomerInfoResultSubGroupSubGroupInfo.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the statusDetail value for this QueryCustomerInfoResultSubGroupSubGroupInfo.
     * 
     * @return statusDetail
     */
    public java.lang.String getStatusDetail() {
        return statusDetail;
    }


    /**
     * Sets the statusDetail value for this QueryCustomerInfoResultSubGroupSubGroupInfo.
     * 
     * @param statusDetail
     */
    public void setStatusDetail(java.lang.String statusDetail) {
        this.statusDetail = statusDetail;
    }


    /**
     * Gets the userCustomer value for this QueryCustomerInfoResultSubGroupSubGroupInfo.
     * 
     * @return userCustomer
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSubGroupInfoUserCustomer getUserCustomer() {
        return userCustomer;
    }


    /**
     * Sets the userCustomer value for this QueryCustomerInfoResultSubGroupSubGroupInfo.
     * 
     * @param userCustomer
     */
    public void setUserCustomer(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultSubGroupSubGroupInfoUserCustomer userCustomer) {
        this.userCustomer = userCustomer;
    }


    /**
     * Gets the addressInfo value for this QueryCustomerInfoResultSubGroupSubGroupInfo.
     * 
     * @return addressInfo
     */
    public com.huawei.www.bme.cbsinterface.bccommon.Address getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this QueryCustomerInfoResultSubGroupSubGroupInfo.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(com.huawei.www.bme.cbsinterface.bccommon.Address addressInfo) {
        this.addressInfo = addressInfo;
    }


    /**
     * Gets the RGroupKey value for this QueryCustomerInfoResultSubGroupSubGroupInfo.
     * 
     * @return RGroupKey
     */
    public java.lang.String getRGroupKey() {
        return RGroupKey;
    }


    /**
     * Sets the RGroupKey value for this QueryCustomerInfoResultSubGroupSubGroupInfo.
     * 
     * @param RGroupKey
     */
    public void setRGroupKey(java.lang.String RGroupKey) {
        this.RGroupKey = RGroupKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCustomerInfoResultSubGroupSubGroupInfo)) return false;
        QueryCustomerInfoResultSubGroupSubGroupInfo other = (QueryCustomerInfoResultSubGroupSubGroupInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.groupType==null && other.getGroupType()==null) || 
             (this.groupType!=null &&
              this.groupType.equals(other.getGroupType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDetail==null && other.getStatusDetail()==null) || 
             (this.statusDetail!=null &&
              this.statusDetail.equals(other.getStatusDetail()))) &&
            ((this.userCustomer==null && other.getUserCustomer()==null) || 
             (this.userCustomer!=null &&
              this.userCustomer.equals(other.getUserCustomer()))) &&
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              this.addressInfo.equals(other.getAddressInfo()))) &&
            ((this.RGroupKey==null && other.getRGroupKey()==null) || 
             (this.RGroupKey!=null &&
              this.RGroupKey.equals(other.getRGroupKey())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getGroupType() != null) {
            _hashCode += getGroupType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDetail() != null) {
            _hashCode += getStatusDetail().hashCode();
        }
        if (getUserCustomer() != null) {
            _hashCode += getUserCustomer().hashCode();
        }
        if (getAddressInfo() != null) {
            _hashCode += getAddressInfo().hashCode();
        }
        if (getRGroupKey() != null) {
            _hashCode += getRGroupKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCustomerInfoResultSubGroupSubGroupInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryCustomerInfoResult>SubGroup>SubGroupInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "GroupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "StatusDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "UserCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>QueryCustomerInfoResult>SubGroup>SubGroupInfo>UserCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "AddressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RGroupKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "RGroupKey"));
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
