/**
 * QueryBasicInfoResultSubscriberProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class QueryBasicInfoResultSubscriberProduct  extends com.huawei.www.bme.cbsinterface.cbs.businessmgr.Product  implements java.io.Serializable {
    private java.lang.String productOrderKey;

    private java.lang.String effectiveDate;

    private java.lang.String expiredDate;

    private java.lang.Integer status;

    private java.lang.String curCycleStartTime;

    private java.lang.String curCycleEndTime;

    private java.lang.Integer billStatus;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindSubscriberNo[] bindSubscriberNo;

    public QueryBasicInfoResultSubscriberProduct() {
    }

    public QueryBasicInfoResultSubscriberProduct(
           java.lang.String id,
           java.lang.String name,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.SimpleProperty[] simpleProperty,
           java.lang.String productOrderKey,
           java.lang.String effectiveDate,
           java.lang.String expiredDate,
           java.lang.Integer status,
           java.lang.String curCycleStartTime,
           java.lang.String curCycleEndTime,
           java.lang.Integer billStatus,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindSubscriberNo[] bindSubscriberNo) {
        super(
            id,
            name,
            simpleProperty);
        this.productOrderKey = productOrderKey;
        this.effectiveDate = effectiveDate;
        this.expiredDate = expiredDate;
        this.status = status;
        this.curCycleStartTime = curCycleStartTime;
        this.curCycleEndTime = curCycleEndTime;
        this.billStatus = billStatus;
        this.bindSubscriberNo = bindSubscriberNo;
    }


    /**
     * Gets the productOrderKey value for this QueryBasicInfoResultSubscriberProduct.
     * 
     * @return productOrderKey
     */
    public java.lang.String getProductOrderKey() {
        return productOrderKey;
    }


    /**
     * Sets the productOrderKey value for this QueryBasicInfoResultSubscriberProduct.
     * 
     * @param productOrderKey
     */
    public void setProductOrderKey(java.lang.String productOrderKey) {
        this.productOrderKey = productOrderKey;
    }


    /**
     * Gets the effectiveDate value for this QueryBasicInfoResultSubscriberProduct.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this QueryBasicInfoResultSubscriberProduct.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expiredDate value for this QueryBasicInfoResultSubscriberProduct.
     * 
     * @return expiredDate
     */
    public java.lang.String getExpiredDate() {
        return expiredDate;
    }


    /**
     * Sets the expiredDate value for this QueryBasicInfoResultSubscriberProduct.
     * 
     * @param expiredDate
     */
    public void setExpiredDate(java.lang.String expiredDate) {
        this.expiredDate = expiredDate;
    }


    /**
     * Gets the status value for this QueryBasicInfoResultSubscriberProduct.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this QueryBasicInfoResultSubscriberProduct.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the curCycleStartTime value for this QueryBasicInfoResultSubscriberProduct.
     * 
     * @return curCycleStartTime
     */
    public java.lang.String getCurCycleStartTime() {
        return curCycleStartTime;
    }


    /**
     * Sets the curCycleStartTime value for this QueryBasicInfoResultSubscriberProduct.
     * 
     * @param curCycleStartTime
     */
    public void setCurCycleStartTime(java.lang.String curCycleStartTime) {
        this.curCycleStartTime = curCycleStartTime;
    }


    /**
     * Gets the curCycleEndTime value for this QueryBasicInfoResultSubscriberProduct.
     * 
     * @return curCycleEndTime
     */
    public java.lang.String getCurCycleEndTime() {
        return curCycleEndTime;
    }


    /**
     * Sets the curCycleEndTime value for this QueryBasicInfoResultSubscriberProduct.
     * 
     * @param curCycleEndTime
     */
    public void setCurCycleEndTime(java.lang.String curCycleEndTime) {
        this.curCycleEndTime = curCycleEndTime;
    }


    /**
     * Gets the billStatus value for this QueryBasicInfoResultSubscriberProduct.
     * 
     * @return billStatus
     */
    public java.lang.Integer getBillStatus() {
        return billStatus;
    }


    /**
     * Sets the billStatus value for this QueryBasicInfoResultSubscriberProduct.
     * 
     * @param billStatus
     */
    public void setBillStatus(java.lang.Integer billStatus) {
        this.billStatus = billStatus;
    }


    /**
     * Gets the bindSubscriberNo value for this QueryBasicInfoResultSubscriberProduct.
     * 
     * @return bindSubscriberNo
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindSubscriberNo[] getBindSubscriberNo() {
        return bindSubscriberNo;
    }


    /**
     * Sets the bindSubscriberNo value for this QueryBasicInfoResultSubscriberProduct.
     * 
     * @param bindSubscriberNo
     */
    public void setBindSubscriberNo(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindSubscriberNo[] bindSubscriberNo) {
        this.bindSubscriberNo = bindSubscriberNo;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindSubscriberNo getBindSubscriberNo(int i) {
        return this.bindSubscriberNo[i];
    }

    public void setBindSubscriberNo(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.BindSubscriberNo _value) {
        this.bindSubscriberNo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBasicInfoResultSubscriberProduct)) return false;
        QueryBasicInfoResultSubscriberProduct other = (QueryBasicInfoResultSubscriberProduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.productOrderKey==null && other.getProductOrderKey()==null) || 
             (this.productOrderKey!=null &&
              this.productOrderKey.equals(other.getProductOrderKey()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expiredDate==null && other.getExpiredDate()==null) || 
             (this.expiredDate!=null &&
              this.expiredDate.equals(other.getExpiredDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.curCycleStartTime==null && other.getCurCycleStartTime()==null) || 
             (this.curCycleStartTime!=null &&
              this.curCycleStartTime.equals(other.getCurCycleStartTime()))) &&
            ((this.curCycleEndTime==null && other.getCurCycleEndTime()==null) || 
             (this.curCycleEndTime!=null &&
              this.curCycleEndTime.equals(other.getCurCycleEndTime()))) &&
            ((this.billStatus==null && other.getBillStatus()==null) || 
             (this.billStatus!=null &&
              this.billStatus.equals(other.getBillStatus()))) &&
            ((this.bindSubscriberNo==null && other.getBindSubscriberNo()==null) || 
             (this.bindSubscriberNo!=null &&
              java.util.Arrays.equals(this.bindSubscriberNo, other.getBindSubscriberNo())));
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
        if (getProductOrderKey() != null) {
            _hashCode += getProductOrderKey().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpiredDate() != null) {
            _hashCode += getExpiredDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCurCycleStartTime() != null) {
            _hashCode += getCurCycleStartTime().hashCode();
        }
        if (getCurCycleEndTime() != null) {
            _hashCode += getCurCycleEndTime().hashCode();
        }
        if (getBillStatus() != null) {
            _hashCode += getBillStatus().hashCode();
        }
        if (getBindSubscriberNo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBindSubscriberNo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBindSubscriberNo(), i);
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
        new org.apache.axis.description.TypeDesc(QueryBasicInfoResultSubscriberProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>QueryBasicInfoResult>Subscriber>Product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOrderKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ProductOrderKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiredDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ExpiredDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curCycleStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CurCycleStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curCycleEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CurCycleEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BillStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindSubscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BindSubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BindSubscriberNo"));
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
