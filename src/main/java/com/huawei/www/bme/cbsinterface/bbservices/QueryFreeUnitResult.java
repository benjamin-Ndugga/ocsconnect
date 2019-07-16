/**
 * QueryFreeUnitResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryFreeUnitResult  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItem[] freeUnitItem;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultShareUsageList[] shareUsageList;

    public QueryFreeUnitResult() {
    }

    public QueryFreeUnitResult(
           com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItem[] freeUnitItem,
           com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultShareUsageList[] shareUsageList) {
           this.freeUnitItem = freeUnitItem;
           this.shareUsageList = shareUsageList;
    }


    /**
     * Gets the freeUnitItem value for this QueryFreeUnitResult.
     * 
     * @return freeUnitItem
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItem[] getFreeUnitItem() {
        return freeUnitItem;
    }


    /**
     * Sets the freeUnitItem value for this QueryFreeUnitResult.
     * 
     * @param freeUnitItem
     */
    public void setFreeUnitItem(com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItem[] freeUnitItem) {
        this.freeUnitItem = freeUnitItem;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItem getFreeUnitItem(int i) {
        return this.freeUnitItem[i];
    }

    public void setFreeUnitItem(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultFreeUnitItem _value) {
        this.freeUnitItem[i] = _value;
    }


    /**
     * Gets the shareUsageList value for this QueryFreeUnitResult.
     * 
     * @return shareUsageList
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultShareUsageList[] getShareUsageList() {
        return shareUsageList;
    }


    /**
     * Sets the shareUsageList value for this QueryFreeUnitResult.
     * 
     * @param shareUsageList
     */
    public void setShareUsageList(com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultShareUsageList[] shareUsageList) {
        this.shareUsageList = shareUsageList;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultShareUsageList getShareUsageList(int i) {
        return this.shareUsageList[i];
    }

    public void setShareUsageList(int i, com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultShareUsageList _value) {
        this.shareUsageList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryFreeUnitResult)) return false;
        QueryFreeUnitResult other = (QueryFreeUnitResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.freeUnitItem==null && other.getFreeUnitItem()==null) || 
             (this.freeUnitItem!=null &&
              java.util.Arrays.equals(this.freeUnitItem, other.getFreeUnitItem()))) &&
            ((this.shareUsageList==null && other.getShareUsageList()==null) || 
             (this.shareUsageList!=null &&
              java.util.Arrays.equals(this.shareUsageList, other.getShareUsageList())));
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
        if (getFreeUnitItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeUnitItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeUnitItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShareUsageList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShareUsageList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShareUsageList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryFreeUnitResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryFreeUnitResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeUnitItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FreeUnitItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryFreeUnitResult>FreeUnitItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shareUsageList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ShareUsageList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryFreeUnitResult>ShareUsageList"));
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
