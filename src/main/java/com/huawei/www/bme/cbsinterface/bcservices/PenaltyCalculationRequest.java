/**
 * PenaltyCalculationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class PenaltyCalculationRequest  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode;

    private java.lang.Long opType;

    private com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationRequestPenaltyOfferingInstInfoList[] penaltyOfferingInstInfoList;

    public PenaltyCalculationRequest() {
    }

    public PenaltyCalculationRequest(
           com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode,
           java.lang.Long opType,
           com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationRequestPenaltyOfferingInstInfoList[] penaltyOfferingInstInfoList) {
           this.subAccessCode = subAccessCode;
           this.opType = opType;
           this.penaltyOfferingInstInfoList = penaltyOfferingInstInfoList;
    }


    /**
     * Gets the subAccessCode value for this PenaltyCalculationRequest.
     * 
     * @return subAccessCode
     */
    public com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }


    /**
     * Sets the subAccessCode value for this PenaltyCalculationRequest.
     * 
     * @param subAccessCode
     */
    public void setSubAccessCode(com.huawei.www.bme.cbsinterface.bccommon.SubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }


    /**
     * Gets the opType value for this PenaltyCalculationRequest.
     * 
     * @return opType
     */
    public java.lang.Long getOpType() {
        return opType;
    }


    /**
     * Sets the opType value for this PenaltyCalculationRequest.
     * 
     * @param opType
     */
    public void setOpType(java.lang.Long opType) {
        this.opType = opType;
    }


    /**
     * Gets the penaltyOfferingInstInfoList value for this PenaltyCalculationRequest.
     * 
     * @return penaltyOfferingInstInfoList
     */
    public com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationRequestPenaltyOfferingInstInfoList[] getPenaltyOfferingInstInfoList() {
        return penaltyOfferingInstInfoList;
    }


    /**
     * Sets the penaltyOfferingInstInfoList value for this PenaltyCalculationRequest.
     * 
     * @param penaltyOfferingInstInfoList
     */
    public void setPenaltyOfferingInstInfoList(com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationRequestPenaltyOfferingInstInfoList[] penaltyOfferingInstInfoList) {
        this.penaltyOfferingInstInfoList = penaltyOfferingInstInfoList;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationRequestPenaltyOfferingInstInfoList getPenaltyOfferingInstInfoList(int i) {
        return this.penaltyOfferingInstInfoList[i];
    }

    public void setPenaltyOfferingInstInfoList(int i, com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationRequestPenaltyOfferingInstInfoList _value) {
        this.penaltyOfferingInstInfoList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PenaltyCalculationRequest)) return false;
        PenaltyCalculationRequest other = (PenaltyCalculationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subAccessCode==null && other.getSubAccessCode()==null) || 
             (this.subAccessCode!=null &&
              this.subAccessCode.equals(other.getSubAccessCode()))) &&
            ((this.opType==null && other.getOpType()==null) || 
             (this.opType!=null &&
              this.opType.equals(other.getOpType()))) &&
            ((this.penaltyOfferingInstInfoList==null && other.getPenaltyOfferingInstInfoList()==null) || 
             (this.penaltyOfferingInstInfoList!=null &&
              java.util.Arrays.equals(this.penaltyOfferingInstInfoList, other.getPenaltyOfferingInstInfoList())));
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
        if (getSubAccessCode() != null) {
            _hashCode += getSubAccessCode().hashCode();
        }
        if (getOpType() != null) {
            _hashCode += getOpType().hashCode();
        }
        if (getPenaltyOfferingInstInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPenaltyOfferingInstInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPenaltyOfferingInstInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(PenaltyCalculationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PenaltyCalculationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "SubAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bccommon", "SubAccessCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OpType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("penaltyOfferingInstInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PenaltyOfferingInstInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">PenaltyCalculationRequest>PenaltyOfferingInstInfoList"));
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
