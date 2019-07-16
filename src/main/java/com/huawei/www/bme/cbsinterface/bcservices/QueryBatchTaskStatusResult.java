/**
 * QueryBatchTaskStatusResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class QueryBatchTaskStatusResult  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String resultCode;

    private java.lang.String resultDesc;

    private java.math.BigInteger totalNumber;

    private java.math.BigInteger validNumber;

    private java.math.BigInteger processedNumber;

    private java.math.BigInteger successNumber;

    private java.math.BigInteger failedNumber;

    public QueryBatchTaskStatusResult() {
    }

    public QueryBatchTaskStatusResult(
           java.lang.String status,
           java.lang.String resultCode,
           java.lang.String resultDesc,
           java.math.BigInteger totalNumber,
           java.math.BigInteger validNumber,
           java.math.BigInteger processedNumber,
           java.math.BigInteger successNumber,
           java.math.BigInteger failedNumber) {
           this.status = status;
           this.resultCode = resultCode;
           this.resultDesc = resultDesc;
           this.totalNumber = totalNumber;
           this.validNumber = validNumber;
           this.processedNumber = processedNumber;
           this.successNumber = successNumber;
           this.failedNumber = failedNumber;
    }


    /**
     * Gets the status value for this QueryBatchTaskStatusResult.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this QueryBatchTaskStatusResult.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the resultCode value for this QueryBatchTaskStatusResult.
     * 
     * @return resultCode
     */
    public java.lang.String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this QueryBatchTaskStatusResult.
     * 
     * @param resultCode
     */
    public void setResultCode(java.lang.String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultDesc value for this QueryBatchTaskStatusResult.
     * 
     * @return resultDesc
     */
    public java.lang.String getResultDesc() {
        return resultDesc;
    }


    /**
     * Sets the resultDesc value for this QueryBatchTaskStatusResult.
     * 
     * @param resultDesc
     */
    public void setResultDesc(java.lang.String resultDesc) {
        this.resultDesc = resultDesc;
    }


    /**
     * Gets the totalNumber value for this QueryBatchTaskStatusResult.
     * 
     * @return totalNumber
     */
    public java.math.BigInteger getTotalNumber() {
        return totalNumber;
    }


    /**
     * Sets the totalNumber value for this QueryBatchTaskStatusResult.
     * 
     * @param totalNumber
     */
    public void setTotalNumber(java.math.BigInteger totalNumber) {
        this.totalNumber = totalNumber;
    }


    /**
     * Gets the validNumber value for this QueryBatchTaskStatusResult.
     * 
     * @return validNumber
     */
    public java.math.BigInteger getValidNumber() {
        return validNumber;
    }


    /**
     * Sets the validNumber value for this QueryBatchTaskStatusResult.
     * 
     * @param validNumber
     */
    public void setValidNumber(java.math.BigInteger validNumber) {
        this.validNumber = validNumber;
    }


    /**
     * Gets the processedNumber value for this QueryBatchTaskStatusResult.
     * 
     * @return processedNumber
     */
    public java.math.BigInteger getProcessedNumber() {
        return processedNumber;
    }


    /**
     * Sets the processedNumber value for this QueryBatchTaskStatusResult.
     * 
     * @param processedNumber
     */
    public void setProcessedNumber(java.math.BigInteger processedNumber) {
        this.processedNumber = processedNumber;
    }


    /**
     * Gets the successNumber value for this QueryBatchTaskStatusResult.
     * 
     * @return successNumber
     */
    public java.math.BigInteger getSuccessNumber() {
        return successNumber;
    }


    /**
     * Sets the successNumber value for this QueryBatchTaskStatusResult.
     * 
     * @param successNumber
     */
    public void setSuccessNumber(java.math.BigInteger successNumber) {
        this.successNumber = successNumber;
    }


    /**
     * Gets the failedNumber value for this QueryBatchTaskStatusResult.
     * 
     * @return failedNumber
     */
    public java.math.BigInteger getFailedNumber() {
        return failedNumber;
    }


    /**
     * Sets the failedNumber value for this QueryBatchTaskStatusResult.
     * 
     * @param failedNumber
     */
    public void setFailedNumber(java.math.BigInteger failedNumber) {
        this.failedNumber = failedNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBatchTaskStatusResult)) return false;
        QueryBatchTaskStatusResult other = (QueryBatchTaskStatusResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.resultDesc==null && other.getResultDesc()==null) || 
             (this.resultDesc!=null &&
              this.resultDesc.equals(other.getResultDesc()))) &&
            ((this.totalNumber==null && other.getTotalNumber()==null) || 
             (this.totalNumber!=null &&
              this.totalNumber.equals(other.getTotalNumber()))) &&
            ((this.validNumber==null && other.getValidNumber()==null) || 
             (this.validNumber!=null &&
              this.validNumber.equals(other.getValidNumber()))) &&
            ((this.processedNumber==null && other.getProcessedNumber()==null) || 
             (this.processedNumber!=null &&
              this.processedNumber.equals(other.getProcessedNumber()))) &&
            ((this.successNumber==null && other.getSuccessNumber()==null) || 
             (this.successNumber!=null &&
              this.successNumber.equals(other.getSuccessNumber()))) &&
            ((this.failedNumber==null && other.getFailedNumber()==null) || 
             (this.failedNumber!=null &&
              this.failedNumber.equals(other.getFailedNumber())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getResultDesc() != null) {
            _hashCode += getResultDesc().hashCode();
        }
        if (getTotalNumber() != null) {
            _hashCode += getTotalNumber().hashCode();
        }
        if (getValidNumber() != null) {
            _hashCode += getValidNumber().hashCode();
        }
        if (getProcessedNumber() != null) {
            _hashCode += getProcessedNumber().hashCode();
        }
        if (getSuccessNumber() != null) {
            _hashCode += getSuccessNumber().hashCode();
        }
        if (getFailedNumber() != null) {
            _hashCode += getFailedNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryBatchTaskStatusResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "QueryBatchTaskStatusResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ResultDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "TotalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ValidNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processedNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "ProcessedNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SuccessNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FailedNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
