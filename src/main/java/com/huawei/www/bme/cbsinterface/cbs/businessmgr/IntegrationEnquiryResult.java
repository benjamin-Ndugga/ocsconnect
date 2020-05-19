/**
 * IntegrationEnquiryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */
package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class IntegrationEnquiryResult implements java.io.Serializable {

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BalanceRecordType[] balanceRecordList;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberState subscriberState;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultBillingCycleDate billingCycleDate;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberInfo subscriberInfo;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultCumulativeItemListCumulativeItem[] cumulativeItemList;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultUserGroupListUserGroup[] userGroupList;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubAttachedInfo subAttachedInfo;

    public IntegrationEnquiryResult() {
    }

    public IntegrationEnquiryResult(
            com.huawei.www.bme.cbsinterface.cbs.businessmgr.BalanceRecordType[] balanceRecordList,
            com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberState subscriberState,
            com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultBillingCycleDate billingCycleDate,
            com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberInfo subscriberInfo,
            com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultCumulativeItemListCumulativeItem[] cumulativeItemList,
            com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultUserGroupListUserGroup[] userGroupList,
            com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubAttachedInfo subAttachedInfo) {
        this.balanceRecordList = balanceRecordList;
        this.subscriberState = subscriberState;
        this.billingCycleDate = billingCycleDate;
        this.subscriberInfo = subscriberInfo;
        this.cumulativeItemList = cumulativeItemList;
        this.userGroupList = userGroupList;
        this.subAttachedInfo = subAttachedInfo;
    }

    /**
     * Gets the balanceRecordList value for this IntegrationEnquiryResult.
     *
     * @return balanceRecordList
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BalanceRecordType[] getBalanceRecordList() {
        return balanceRecordList;
    }

    /**
     * Sets the balanceRecordList value for this IntegrationEnquiryResult.
     *
     * @param balanceRecordList
     */
    public void setBalanceRecordList(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BalanceRecordType[] balanceRecordList) {
        this.balanceRecordList = balanceRecordList;
    }

    /**
     * Gets the subscriberState value for this IntegrationEnquiryResult.
     *
     * @return subscriberState
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberState getSubscriberState() {
        return subscriberState;
    }

    /**
     * Sets the subscriberState value for this IntegrationEnquiryResult.
     *
     * @param subscriberState
     */
    public void setSubscriberState(com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberState subscriberState) {
        this.subscriberState = subscriberState;
    }

    /**
     * Gets the billingCycleDate value for this IntegrationEnquiryResult.
     *
     * @return billingCycleDate
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultBillingCycleDate getBillingCycleDate() {
        return billingCycleDate;
    }

    /**
     * Sets the billingCycleDate value for this IntegrationEnquiryResult.
     *
     * @param billingCycleDate
     */
    public void setBillingCycleDate(com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultBillingCycleDate billingCycleDate) {
        this.billingCycleDate = billingCycleDate;
    }

    /**
     * Gets the subscriberInfo value for this IntegrationEnquiryResult.
     *
     * @return subscriberInfo
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberInfo getSubscriberInfo() {
        return subscriberInfo;
    }

    /**
     * Sets the subscriberInfo value for this IntegrationEnquiryResult.
     *
     * @param subscriberInfo
     */
    public void setSubscriberInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubscriberInfo subscriberInfo) {
        this.subscriberInfo = subscriberInfo;
    }

    /**
     * Gets the cumulativeItemList value for this IntegrationEnquiryResult.
     *
     * @return cumulativeItemList
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultCumulativeItemListCumulativeItem[] getCumulativeItemList() {
        return cumulativeItemList;
    }

    /**
     * Sets the cumulativeItemList value for this IntegrationEnquiryResult.
     *
     * @param cumulativeItemList
     */
    public void setCumulativeItemList(com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultCumulativeItemListCumulativeItem[] cumulativeItemList) {
        this.cumulativeItemList = cumulativeItemList;
    }

    /**
     * Gets the userGroupList value for this IntegrationEnquiryResult.
     *
     * @return userGroupList
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultUserGroupListUserGroup[] getUserGroupList() {
        return userGroupList;
    }

    /**
     * Sets the userGroupList value for this IntegrationEnquiryResult.
     *
     * @param userGroupList
     */
    public void setUserGroupList(com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultUserGroupListUserGroup[] userGroupList) {
        this.userGroupList = userGroupList;
    }

    /**
     * Gets the subAttachedInfo value for this IntegrationEnquiryResult.
     *
     * @return subAttachedInfo
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubAttachedInfo getSubAttachedInfo() {
        return subAttachedInfo;
    }

    /**
     * Sets the subAttachedInfo value for this IntegrationEnquiryResult.
     *
     * @param subAttachedInfo
     */
    public void setSubAttachedInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResultSubAttachedInfo subAttachedInfo) {
        this.subAttachedInfo = subAttachedInfo;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegrationEnquiryResult)) {
            return false;
        }
        IntegrationEnquiryResult other = (IntegrationEnquiryResult) obj;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true
                && ((this.balanceRecordList == null && other.getBalanceRecordList() == null)
                || (this.balanceRecordList != null
                && java.util.Arrays.equals(this.balanceRecordList, other.getBalanceRecordList())))
                && ((this.subscriberState == null && other.getSubscriberState() == null)
                || (this.subscriberState != null
                && this.subscriberState.equals(other.getSubscriberState())))
                && ((this.billingCycleDate == null && other.getBillingCycleDate() == null)
                || (this.billingCycleDate != null
                && this.billingCycleDate.equals(other.getBillingCycleDate())))
                && ((this.subscriberInfo == null && other.getSubscriberInfo() == null)
                || (this.subscriberInfo != null
                && this.subscriberInfo.equals(other.getSubscriberInfo())))
                && ((this.cumulativeItemList == null && other.getCumulativeItemList() == null)
                || (this.cumulativeItemList != null
                && java.util.Arrays.equals(this.cumulativeItemList, other.getCumulativeItemList())))
                && ((this.userGroupList == null && other.getUserGroupList() == null)
                || (this.userGroupList != null
                && java.util.Arrays.equals(this.userGroupList, other.getUserGroupList())))
                && ((this.subAttachedInfo == null && other.getSubAttachedInfo() == null)
                || (this.subAttachedInfo != null
                && this.subAttachedInfo.equals(other.getSubAttachedInfo())));
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
        if (getBalanceRecordList() != null) {
            for (int i = 0;
                    i < java.lang.reflect.Array.getLength(getBalanceRecordList());
                    i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalanceRecordList(), i);
                if (obj != null
                        && !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriberState() != null) {
            _hashCode += getSubscriberState().hashCode();
        }
        if (getBillingCycleDate() != null) {
            _hashCode += getBillingCycleDate().hashCode();
        }
        if (getSubscriberInfo() != null) {
            _hashCode += getSubscriberInfo().hashCode();
        }
        if (getCumulativeItemList() != null) {
            for (int i = 0;
                    i < java.lang.reflect.Array.getLength(getCumulativeItemList());
                    i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCumulativeItemList(), i);
                if (obj != null
                        && !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserGroupList() != null) {
            for (int i = 0;
                    i < java.lang.reflect.Array.getLength(getUserGroupList());
                    i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserGroupList(), i);
                if (obj != null
                        && !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubAttachedInfo() != null) {
            _hashCode += getSubAttachedInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc
            = new org.apache.axis.description.TypeDesc(IntegrationEnquiryResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IntegrationEnquiryResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceRecordList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BalanceRecordList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BalanceRecordType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BalanceRecord"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">IntegrationEnquiryResult>SubscriberState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCycleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BillingCycleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">IntegrationEnquiryResult>BillingCycleDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubscriberInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">IntegrationEnquiryResult>SubscriberInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cumulativeItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CumulativeItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>IntegrationEnquiryResult>CumulativeItemList>CumulativeItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CumulativeItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "UserGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>IntegrationEnquiryResult>UserGroupList>UserGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "UserGroup"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAttachedInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SubAttachedInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">IntegrationEnquiryResult>SubAttachedInfo"));
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
        return new org.apache.axis.encoding.ser.BeanSerializer(
                _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanDeserializer(
                _javaType, _xmlType, typeDesc);
    }

}
