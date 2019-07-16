/**
 * OneOffDeductionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class OneOffDeductionRequest  implements java.io.Serializable {
    private java.lang.String logID;

    private java.lang.String subscriberNo;

    private java.lang.Integer operationID;

    private long deductAmt;

    private java.lang.Integer minMeasureId;

    private java.lang.String additionalInfo;

    private java.lang.Integer operationType;

    private java.lang.String custID;

    private java.lang.Integer deductFromParent;

    private java.lang.String reserve1;

    public OneOffDeductionRequest() {
    }

    public OneOffDeductionRequest(
           java.lang.String logID,
           java.lang.String subscriberNo,
           java.lang.Integer operationID,
           long deductAmt,
           java.lang.Integer minMeasureId,
           java.lang.String additionalInfo,
           java.lang.Integer operationType,
           java.lang.String custID,
           java.lang.Integer deductFromParent,
           java.lang.String reserve1) {
           this.logID = logID;
           this.subscriberNo = subscriberNo;
           this.operationID = operationID;
           this.deductAmt = deductAmt;
           this.minMeasureId = minMeasureId;
           this.additionalInfo = additionalInfo;
           this.operationType = operationType;
           this.custID = custID;
           this.deductFromParent = deductFromParent;
           this.reserve1 = reserve1;
    }


    /**
     * Gets the logID value for this OneOffDeductionRequest.
     * 
     * @return logID
     */
    public java.lang.String getLogID() {
        return logID;
    }


    /**
     * Sets the logID value for this OneOffDeductionRequest.
     * 
     * @param logID
     */
    public void setLogID(java.lang.String logID) {
        this.logID = logID;
    }


    /**
     * Gets the subscriberNo value for this OneOffDeductionRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this OneOffDeductionRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the operationID value for this OneOffDeductionRequest.
     * 
     * @return operationID
     */
    public java.lang.Integer getOperationID() {
        return operationID;
    }


    /**
     * Sets the operationID value for this OneOffDeductionRequest.
     * 
     * @param operationID
     */
    public void setOperationID(java.lang.Integer operationID) {
        this.operationID = operationID;
    }


    /**
     * Gets the deductAmt value for this OneOffDeductionRequest.
     * 
     * @return deductAmt
     */
    public long getDeductAmt() {
        return deductAmt;
    }


    /**
     * Sets the deductAmt value for this OneOffDeductionRequest.
     * 
     * @param deductAmt
     */
    public void setDeductAmt(long deductAmt) {
        this.deductAmt = deductAmt;
    }


    /**
     * Gets the minMeasureId value for this OneOffDeductionRequest.
     * 
     * @return minMeasureId
     */
    public java.lang.Integer getMinMeasureId() {
        return minMeasureId;
    }


    /**
     * Sets the minMeasureId value for this OneOffDeductionRequest.
     * 
     * @param minMeasureId
     */
    public void setMinMeasureId(java.lang.Integer minMeasureId) {
        this.minMeasureId = minMeasureId;
    }


    /**
     * Gets the additionalInfo value for this OneOffDeductionRequest.
     * 
     * @return additionalInfo
     */
    public java.lang.String getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this OneOffDeductionRequest.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(java.lang.String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the operationType value for this OneOffDeductionRequest.
     * 
     * @return operationType
     */
    public java.lang.Integer getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this OneOffDeductionRequest.
     * 
     * @param operationType
     */
    public void setOperationType(java.lang.Integer operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the custID value for this OneOffDeductionRequest.
     * 
     * @return custID
     */
    public java.lang.String getCustID() {
        return custID;
    }


    /**
     * Sets the custID value for this OneOffDeductionRequest.
     * 
     * @param custID
     */
    public void setCustID(java.lang.String custID) {
        this.custID = custID;
    }


    /**
     * Gets the deductFromParent value for this OneOffDeductionRequest.
     * 
     * @return deductFromParent
     */
    public java.lang.Integer getDeductFromParent() {
        return deductFromParent;
    }


    /**
     * Sets the deductFromParent value for this OneOffDeductionRequest.
     * 
     * @param deductFromParent
     */
    public void setDeductFromParent(java.lang.Integer deductFromParent) {
        this.deductFromParent = deductFromParent;
    }


    /**
     * Gets the reserve1 value for this OneOffDeductionRequest.
     * 
     * @return reserve1
     */
    public java.lang.String getReserve1() {
        return reserve1;
    }


    /**
     * Sets the reserve1 value for this OneOffDeductionRequest.
     * 
     * @param reserve1
     */
    public void setReserve1(java.lang.String reserve1) {
        this.reserve1 = reserve1;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OneOffDeductionRequest)) return false;
        OneOffDeductionRequest other = (OneOffDeductionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.logID==null && other.getLogID()==null) || 
             (this.logID!=null &&
              this.logID.equals(other.getLogID()))) &&
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            ((this.operationID==null && other.getOperationID()==null) || 
             (this.operationID!=null &&
              this.operationID.equals(other.getOperationID()))) &&
            this.deductAmt == other.getDeductAmt() &&
            ((this.minMeasureId==null && other.getMinMeasureId()==null) || 
             (this.minMeasureId!=null &&
              this.minMeasureId.equals(other.getMinMeasureId()))) &&
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              this.additionalInfo.equals(other.getAdditionalInfo()))) &&
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType()))) &&
            ((this.custID==null && other.getCustID()==null) || 
             (this.custID!=null &&
              this.custID.equals(other.getCustID()))) &&
            ((this.deductFromParent==null && other.getDeductFromParent()==null) || 
             (this.deductFromParent!=null &&
              this.deductFromParent.equals(other.getDeductFromParent()))) &&
            ((this.reserve1==null && other.getReserve1()==null) || 
             (this.reserve1!=null &&
              this.reserve1.equals(other.getReserve1())));
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
        if (getLogID() != null) {
            _hashCode += getLogID().hashCode();
        }
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        if (getOperationID() != null) {
            _hashCode += getOperationID().hashCode();
        }
        _hashCode += new Long(getDeductAmt()).hashCode();
        if (getMinMeasureId() != null) {
            _hashCode += getMinMeasureId().hashCode();
        }
        if (getAdditionalInfo() != null) {
            _hashCode += getAdditionalInfo().hashCode();
        }
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        if (getCustID() != null) {
            _hashCode += getCustID().hashCode();
        }
        if (getDeductFromParent() != null) {
            _hashCode += getDeductFromParent().hashCode();
        }
        if (getReserve1() != null) {
            _hashCode += getReserve1().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OneOffDeductionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OneOffDeductionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LogID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OperationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "DeductAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minMeasureId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "MinMeasureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OperationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "CustID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductFromParent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "DeductFromParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserve1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Reserve1"));
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
