/**
 * QueryOfferingRentFailedFeeRequestOfferingInst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryOfferingRentFailedFeeRequestOfferingInst  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeRequestOfferingInstOfferingOwner offeringOwner;

    private com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey;

    /* if not sent, CBS will query data of current bill cycle */
    private java.lang.String billCycleId;

    public QueryOfferingRentFailedFeeRequestOfferingInst() {
    }

    public QueryOfferingRentFailedFeeRequestOfferingInst(
           com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeRequestOfferingInstOfferingOwner offeringOwner,
           com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey,
           java.lang.String billCycleId) {
           this.offeringOwner = offeringOwner;
           this.offeringKey = offeringKey;
           this.billCycleId = billCycleId;
    }


    /**
     * Gets the offeringOwner value for this QueryOfferingRentFailedFeeRequestOfferingInst.
     * 
     * @return offeringOwner
     */
    public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeRequestOfferingInstOfferingOwner getOfferingOwner() {
        return offeringOwner;
    }


    /**
     * Sets the offeringOwner value for this QueryOfferingRentFailedFeeRequestOfferingInst.
     * 
     * @param offeringOwner
     */
    public void setOfferingOwner(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeRequestOfferingInstOfferingOwner offeringOwner) {
        this.offeringOwner = offeringOwner;
    }


    /**
     * Gets the offeringKey value for this QueryOfferingRentFailedFeeRequestOfferingInst.
     * 
     * @return offeringKey
     */
    public com.huawei.www.bme.cbsinterface.bccommon.OfferingKey getOfferingKey() {
        return offeringKey;
    }


    /**
     * Sets the offeringKey value for this QueryOfferingRentFailedFeeRequestOfferingInst.
     * 
     * @param offeringKey
     */
    public void setOfferingKey(com.huawei.www.bme.cbsinterface.bccommon.OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }


    /**
     * Gets the billCycleId value for this QueryOfferingRentFailedFeeRequestOfferingInst.
     * 
     * @return billCycleId   * if not sent, CBS will query data of current bill cycle
     */
    public java.lang.String getBillCycleId() {
        return billCycleId;
    }


    /**
     * Sets the billCycleId value for this QueryOfferingRentFailedFeeRequestOfferingInst.
     * 
     * @param billCycleId   * if not sent, CBS will query data of current bill cycle
     */
    public void setBillCycleId(java.lang.String billCycleId) {
        this.billCycleId = billCycleId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryOfferingRentFailedFeeRequestOfferingInst)) return false;
        QueryOfferingRentFailedFeeRequestOfferingInst other = (QueryOfferingRentFailedFeeRequestOfferingInst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offeringOwner==null && other.getOfferingOwner()==null) || 
             (this.offeringOwner!=null &&
              this.offeringOwner.equals(other.getOfferingOwner()))) &&
            ((this.offeringKey==null && other.getOfferingKey()==null) || 
             (this.offeringKey!=null &&
              this.offeringKey.equals(other.getOfferingKey()))) &&
            ((this.billCycleId==null && other.getBillCycleId()==null) || 
             (this.billCycleId!=null &&
              this.billCycleId.equals(other.getBillCycleId())));
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
        if (getOfferingOwner() != null) {
            _hashCode += getOfferingOwner().hashCode();
        }
        if (getOfferingKey() != null) {
            _hashCode += getOfferingKey().hashCode();
        }
        if (getBillCycleId() != null) {
            _hashCode += getBillCycleId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryOfferingRentFailedFeeRequestOfferingInst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">QueryOfferingRentFailedFeeRequest>OfferingInst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>QueryOfferingRentFailedFeeRequest>OfferingInst>OfferingOwner"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BillCycleId"));
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
