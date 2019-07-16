/**
 * ApplyInstallmentExtendRequestNewInstallmentInatallmentPlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ApplyInstallmentExtendRequestNewInstallmentInatallmentPlan  implements java.io.Serializable {
    private java.lang.String planType;

    private java.lang.Long firstCycleAmount;

    private java.lang.Long finalCycleAmount;

    public ApplyInstallmentExtendRequestNewInstallmentInatallmentPlan() {
    }

    public ApplyInstallmentExtendRequestNewInstallmentInatallmentPlan(
           java.lang.String planType,
           java.lang.Long firstCycleAmount,
           java.lang.Long finalCycleAmount) {
           this.planType = planType;
           this.firstCycleAmount = firstCycleAmount;
           this.finalCycleAmount = finalCycleAmount;
    }


    /**
     * Gets the planType value for this ApplyInstallmentExtendRequestNewInstallmentInatallmentPlan.
     * 
     * @return planType
     */
    public java.lang.String getPlanType() {
        return planType;
    }


    /**
     * Sets the planType value for this ApplyInstallmentExtendRequestNewInstallmentInatallmentPlan.
     * 
     * @param planType
     */
    public void setPlanType(java.lang.String planType) {
        this.planType = planType;
    }


    /**
     * Gets the firstCycleAmount value for this ApplyInstallmentExtendRequestNewInstallmentInatallmentPlan.
     * 
     * @return firstCycleAmount
     */
    public java.lang.Long getFirstCycleAmount() {
        return firstCycleAmount;
    }


    /**
     * Sets the firstCycleAmount value for this ApplyInstallmentExtendRequestNewInstallmentInatallmentPlan.
     * 
     * @param firstCycleAmount
     */
    public void setFirstCycleAmount(java.lang.Long firstCycleAmount) {
        this.firstCycleAmount = firstCycleAmount;
    }


    /**
     * Gets the finalCycleAmount value for this ApplyInstallmentExtendRequestNewInstallmentInatallmentPlan.
     * 
     * @return finalCycleAmount
     */
    public java.lang.Long getFinalCycleAmount() {
        return finalCycleAmount;
    }


    /**
     * Sets the finalCycleAmount value for this ApplyInstallmentExtendRequestNewInstallmentInatallmentPlan.
     * 
     * @param finalCycleAmount
     */
    public void setFinalCycleAmount(java.lang.Long finalCycleAmount) {
        this.finalCycleAmount = finalCycleAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyInstallmentExtendRequestNewInstallmentInatallmentPlan)) return false;
        ApplyInstallmentExtendRequestNewInstallmentInatallmentPlan other = (ApplyInstallmentExtendRequestNewInstallmentInatallmentPlan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.planType==null && other.getPlanType()==null) || 
             (this.planType!=null &&
              this.planType.equals(other.getPlanType()))) &&
            ((this.firstCycleAmount==null && other.getFirstCycleAmount()==null) || 
             (this.firstCycleAmount!=null &&
              this.firstCycleAmount.equals(other.getFirstCycleAmount()))) &&
            ((this.finalCycleAmount==null && other.getFinalCycleAmount()==null) || 
             (this.finalCycleAmount!=null &&
              this.finalCycleAmount.equals(other.getFinalCycleAmount())));
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
        if (getPlanType() != null) {
            _hashCode += getPlanType().hashCode();
        }
        if (getFirstCycleAmount() != null) {
            _hashCode += getFirstCycleAmount().hashCode();
        }
        if (getFinalCycleAmount() != null) {
            _hashCode += getFinalCycleAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplyInstallmentExtendRequestNewInstallmentInatallmentPlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>ApplyInstallmentExtendRequest>newInstallment>InatallmentPlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PlanType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstCycleAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FirstCycleAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalCycleAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "FinalCycleAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
