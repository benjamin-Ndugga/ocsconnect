/**
 * ServiceHandleFeeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class ServiceHandleFeeRequest  implements java.io.Serializable {
    private java.lang.String logID;

    private java.lang.String subscriberNo;

    private int requestAction;

    private int operationID;

    private int operationType;

    private java.lang.Integer operationFeeAmt;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.ServiceHandleFeeRequestParamListParam[] paramList;

    private java.lang.Integer operationCount;

    public ServiceHandleFeeRequest() {
    }

    public ServiceHandleFeeRequest(
           java.lang.String logID,
           java.lang.String subscriberNo,
           int requestAction,
           int operationID,
           int operationType,
           java.lang.Integer operationFeeAmt,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.ServiceHandleFeeRequestParamListParam[] paramList,
           java.lang.Integer operationCount) {
           this.logID = logID;
           this.subscriberNo = subscriberNo;
           this.requestAction = requestAction;
           this.operationID = operationID;
           this.operationType = operationType;
           this.operationFeeAmt = operationFeeAmt;
           this.paramList = paramList;
           this.operationCount = operationCount;
    }


    /**
     * Gets the logID value for this ServiceHandleFeeRequest.
     * 
     * @return logID
     */
    public java.lang.String getLogID() {
        return logID;
    }


    /**
     * Sets the logID value for this ServiceHandleFeeRequest.
     * 
     * @param logID
     */
    public void setLogID(java.lang.String logID) {
        this.logID = logID;
    }


    /**
     * Gets the subscriberNo value for this ServiceHandleFeeRequest.
     * 
     * @return subscriberNo
     */
    public java.lang.String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this ServiceHandleFeeRequest.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(java.lang.String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the requestAction value for this ServiceHandleFeeRequest.
     * 
     * @return requestAction
     */
    public int getRequestAction() {
        return requestAction;
    }


    /**
     * Sets the requestAction value for this ServiceHandleFeeRequest.
     * 
     * @param requestAction
     */
    public void setRequestAction(int requestAction) {
        this.requestAction = requestAction;
    }


    /**
     * Gets the operationID value for this ServiceHandleFeeRequest.
     * 
     * @return operationID
     */
    public int getOperationID() {
        return operationID;
    }


    /**
     * Sets the operationID value for this ServiceHandleFeeRequest.
     * 
     * @param operationID
     */
    public void setOperationID(int operationID) {
        this.operationID = operationID;
    }


    /**
     * Gets the operationType value for this ServiceHandleFeeRequest.
     * 
     * @return operationType
     */
    public int getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this ServiceHandleFeeRequest.
     * 
     * @param operationType
     */
    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the operationFeeAmt value for this ServiceHandleFeeRequest.
     * 
     * @return operationFeeAmt
     */
    public java.lang.Integer getOperationFeeAmt() {
        return operationFeeAmt;
    }


    /**
     * Sets the operationFeeAmt value for this ServiceHandleFeeRequest.
     * 
     * @param operationFeeAmt
     */
    public void setOperationFeeAmt(java.lang.Integer operationFeeAmt) {
        this.operationFeeAmt = operationFeeAmt;
    }


    /**
     * Gets the paramList value for this ServiceHandleFeeRequest.
     * 
     * @return paramList
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.ServiceHandleFeeRequestParamListParam[] getParamList() {
        return paramList;
    }


    /**
     * Sets the paramList value for this ServiceHandleFeeRequest.
     * 
     * @param paramList
     */
    public void setParamList(com.huawei.www.bme.cbsinterface.cbs.accountmgr.ServiceHandleFeeRequestParamListParam[] paramList) {
        this.paramList = paramList;
    }


    /**
     * Gets the operationCount value for this ServiceHandleFeeRequest.
     * 
     * @return operationCount
     */
    public java.lang.Integer getOperationCount() {
        return operationCount;
    }


    /**
     * Sets the operationCount value for this ServiceHandleFeeRequest.
     * 
     * @param operationCount
     */
    public void setOperationCount(java.lang.Integer operationCount) {
        this.operationCount = operationCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceHandleFeeRequest)) return false;
        ServiceHandleFeeRequest other = (ServiceHandleFeeRequest) obj;
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
            this.requestAction == other.getRequestAction() &&
            this.operationID == other.getOperationID() &&
            this.operationType == other.getOperationType() &&
            ((this.operationFeeAmt==null && other.getOperationFeeAmt()==null) || 
             (this.operationFeeAmt!=null &&
              this.operationFeeAmt.equals(other.getOperationFeeAmt()))) &&
            ((this.paramList==null && other.getParamList()==null) || 
             (this.paramList!=null &&
              java.util.Arrays.equals(this.paramList, other.getParamList()))) &&
            ((this.operationCount==null && other.getOperationCount()==null) || 
             (this.operationCount!=null &&
              this.operationCount.equals(other.getOperationCount())));
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
        _hashCode += getRequestAction();
        _hashCode += getOperationID();
        _hashCode += getOperationType();
        if (getOperationFeeAmt() != null) {
            _hashCode += getOperationFeeAmt().hashCode();
        }
        if (getParamList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParamList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParamList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperationCount() != null) {
            _hashCode += getOperationCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceHandleFeeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ServiceHandleFeeRequest"));
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
        elemField.setFieldName("requestAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "RequestAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OperationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OperationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationFeeAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OperationFeeAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ParamList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", ">>ServiceHandleFeeRequest>ParamList>Param"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Param"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "OperationCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
