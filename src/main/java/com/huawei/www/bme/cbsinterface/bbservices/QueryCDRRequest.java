/**
 * QueryCDRRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryCDRRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bbcommon.CustAccessCode custAccessCode;

    private com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode subAccessCode;

    private java.lang.String billCycleID;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryCDRRequestTimePeriod timePeriod;

    private java.lang.String serviceCategory;

    private java.lang.String flowType;

    private java.lang.String[] serviceType;

    private java.lang.String otherNumber;

    private java.math.BigInteger totalCDRNum;

    private java.math.BigInteger beginRowNum;

    private java.math.BigInteger fetchRowNum;

    public QueryCDRRequest() {
    }

    public QueryCDRRequest(
           com.huawei.www.bme.cbsinterface.bbcommon.CustAccessCode custAccessCode,
           com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode subAccessCode,
           java.lang.String billCycleID,
           com.huawei.www.bme.cbsinterface.bbservices.QueryCDRRequestTimePeriod timePeriod,
           java.lang.String serviceCategory,
           java.lang.String flowType,
           java.lang.String[] serviceType,
           java.lang.String otherNumber,
           java.math.BigInteger totalCDRNum,
           java.math.BigInteger beginRowNum,
           java.math.BigInteger fetchRowNum) {
           this.custAccessCode = custAccessCode;
           this.subAccessCode = subAccessCode;
           this.billCycleID = billCycleID;
           this.timePeriod = timePeriod;
           this.serviceCategory = serviceCategory;
           this.flowType = flowType;
           this.serviceType = serviceType;
           this.otherNumber = otherNumber;
           this.totalCDRNum = totalCDRNum;
           this.beginRowNum = beginRowNum;
           this.fetchRowNum = fetchRowNum;
    }


    /**
     * Gets the custAccessCode value for this QueryCDRRequest.
     * 
     * @return custAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bbcommon.CustAccessCode getCustAccessCode() {
        return custAccessCode;
    }


    /**
     * Sets the custAccessCode value for this QueryCDRRequest.
     * 
     * @param custAccessCode
     */
    public void setCustAccessCode(com.huawei.www.bme.cbsinterface.bbcommon.CustAccessCode custAccessCode) {
        this.custAccessCode = custAccessCode;
    }


    /**
     * Gets the subAccessCode value for this QueryCDRRequest.
     * 
     * @return subAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }


    /**
     * Sets the subAccessCode value for this QueryCDRRequest.
     * 
     * @param subAccessCode
     */
    public void setSubAccessCode(com.huawei.www.bme.cbsinterface.bbcommon.SubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }


    /**
     * Gets the billCycleID value for this QueryCDRRequest.
     * 
     * @return billCycleID
     */
    public java.lang.String getBillCycleID() {
        return billCycleID;
    }


    /**
     * Sets the billCycleID value for this QueryCDRRequest.
     * 
     * @param billCycleID
     */
    public void setBillCycleID(java.lang.String billCycleID) {
        this.billCycleID = billCycleID;
    }


    /**
     * Gets the timePeriod value for this QueryCDRRequest.
     * 
     * @return timePeriod
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRRequestTimePeriod getTimePeriod() {
        return timePeriod;
    }


    /**
     * Sets the timePeriod value for this QueryCDRRequest.
     * 
     * @param timePeriod
     */
    public void setTimePeriod(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRRequestTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }


    /**
     * Gets the serviceCategory value for this QueryCDRRequest.
     * 
     * @return serviceCategory
     */
    public java.lang.String getServiceCategory() {
        return serviceCategory;
    }


    /**
     * Sets the serviceCategory value for this QueryCDRRequest.
     * 
     * @param serviceCategory
     */
    public void setServiceCategory(java.lang.String serviceCategory) {
        this.serviceCategory = serviceCategory;
    }


    /**
     * Gets the flowType value for this QueryCDRRequest.
     * 
     * @return flowType
     */
    public java.lang.String getFlowType() {
        return flowType;
    }


    /**
     * Sets the flowType value for this QueryCDRRequest.
     * 
     * @param flowType
     */
    public void setFlowType(java.lang.String flowType) {
        this.flowType = flowType;
    }


    /**
     * Gets the serviceType value for this QueryCDRRequest.
     * 
     * @return serviceType
     */
    public java.lang.String[] getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this QueryCDRRequest.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.String[] serviceType) {
        this.serviceType = serviceType;
    }

    public java.lang.String getServiceType(int i) {
        return this.serviceType[i];
    }

    public void setServiceType(int i, java.lang.String _value) {
        this.serviceType[i] = _value;
    }


    /**
     * Gets the otherNumber value for this QueryCDRRequest.
     * 
     * @return otherNumber
     */
    public java.lang.String getOtherNumber() {
        return otherNumber;
    }


    /**
     * Sets the otherNumber value for this QueryCDRRequest.
     * 
     * @param otherNumber
     */
    public void setOtherNumber(java.lang.String otherNumber) {
        this.otherNumber = otherNumber;
    }


    /**
     * Gets the totalCDRNum value for this QueryCDRRequest.
     * 
     * @return totalCDRNum
     */
    public java.math.BigInteger getTotalCDRNum() {
        return totalCDRNum;
    }


    /**
     * Sets the totalCDRNum value for this QueryCDRRequest.
     * 
     * @param totalCDRNum
     */
    public void setTotalCDRNum(java.math.BigInteger totalCDRNum) {
        this.totalCDRNum = totalCDRNum;
    }


    /**
     * Gets the beginRowNum value for this QueryCDRRequest.
     * 
     * @return beginRowNum
     */
    public java.math.BigInteger getBeginRowNum() {
        return beginRowNum;
    }


    /**
     * Sets the beginRowNum value for this QueryCDRRequest.
     * 
     * @param beginRowNum
     */
    public void setBeginRowNum(java.math.BigInteger beginRowNum) {
        this.beginRowNum = beginRowNum;
    }


    /**
     * Gets the fetchRowNum value for this QueryCDRRequest.
     * 
     * @return fetchRowNum
     */
    public java.math.BigInteger getFetchRowNum() {
        return fetchRowNum;
    }


    /**
     * Sets the fetchRowNum value for this QueryCDRRequest.
     * 
     * @param fetchRowNum
     */
    public void setFetchRowNum(java.math.BigInteger fetchRowNum) {
        this.fetchRowNum = fetchRowNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCDRRequest)) return false;
        QueryCDRRequest other = (QueryCDRRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.custAccessCode==null && other.getCustAccessCode()==null) || 
             (this.custAccessCode!=null &&
              this.custAccessCode.equals(other.getCustAccessCode()))) &&
            ((this.subAccessCode==null && other.getSubAccessCode()==null) || 
             (this.subAccessCode!=null &&
              this.subAccessCode.equals(other.getSubAccessCode()))) &&
            ((this.billCycleID==null && other.getBillCycleID()==null) || 
             (this.billCycleID!=null &&
              this.billCycleID.equals(other.getBillCycleID()))) &&
            ((this.timePeriod==null && other.getTimePeriod()==null) || 
             (this.timePeriod!=null &&
              this.timePeriod.equals(other.getTimePeriod()))) &&
            ((this.serviceCategory==null && other.getServiceCategory()==null) || 
             (this.serviceCategory!=null &&
              this.serviceCategory.equals(other.getServiceCategory()))) &&
            ((this.flowType==null && other.getFlowType()==null) || 
             (this.flowType!=null &&
              this.flowType.equals(other.getFlowType()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              java.util.Arrays.equals(this.serviceType, other.getServiceType()))) &&
            ((this.otherNumber==null && other.getOtherNumber()==null) || 
             (this.otherNumber!=null &&
              this.otherNumber.equals(other.getOtherNumber()))) &&
            ((this.totalCDRNum==null && other.getTotalCDRNum()==null) || 
             (this.totalCDRNum!=null &&
              this.totalCDRNum.equals(other.getTotalCDRNum()))) &&
            ((this.beginRowNum==null && other.getBeginRowNum()==null) || 
             (this.beginRowNum!=null &&
              this.beginRowNum.equals(other.getBeginRowNum()))) &&
            ((this.fetchRowNum==null && other.getFetchRowNum()==null) || 
             (this.fetchRowNum!=null &&
              this.fetchRowNum.equals(other.getFetchRowNum())));
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
        if (getCustAccessCode() != null) {
            _hashCode += getCustAccessCode().hashCode();
        }
        if (getSubAccessCode() != null) {
            _hashCode += getSubAccessCode().hashCode();
        }
        if (getBillCycleID() != null) {
            _hashCode += getBillCycleID().hashCode();
        }
        if (getTimePeriod() != null) {
            _hashCode += getTimePeriod().hashCode();
        }
        if (getServiceCategory() != null) {
            _hashCode += getServiceCategory().hashCode();
        }
        if (getFlowType() != null) {
            _hashCode += getFlowType().hashCode();
        }
        if (getServiceType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOtherNumber() != null) {
            _hashCode += getOtherNumber().hashCode();
        }
        if (getTotalCDRNum() != null) {
            _hashCode += getTotalCDRNum().hashCode();
        }
        if (getBeginRowNum() != null) {
            _hashCode += getBeginRowNum().hashCode();
        }
        if (getFetchRowNum() != null) {
            _hashCode += getFetchRowNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCDRRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "QueryCDRRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CustAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "CustAccessCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "SubAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbcommon", "SubAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "BillCycleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "TimePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryCDRRequest>TimePeriod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ServiceCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "OtherNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCDRNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "TotalCDRNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginRowNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "BeginRowNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fetchRowNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "FetchRowNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
