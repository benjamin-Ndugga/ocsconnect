/**
 * PenaltyCalculationRequestPenaltyOfferingInstInfoList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class PenaltyCalculationRequestPenaltyOfferingInstInfoList  implements java.io.Serializable {
    private com.huawei.www.bme.cbsinterface.bcservices.OfferingInstInfo cancelOfferingInst;

    private com.huawei.www.bme.cbsinterface.bcservices.OfferingInstInfo downgradeOfferingInst;

    private com.huawei.www.bme.cbsinterface.bcservices.OfferingInstInfo promotionOfferingInst;

    public PenaltyCalculationRequestPenaltyOfferingInstInfoList() {
    }

    public PenaltyCalculationRequestPenaltyOfferingInstInfoList(
           com.huawei.www.bme.cbsinterface.bcservices.OfferingInstInfo cancelOfferingInst,
           com.huawei.www.bme.cbsinterface.bcservices.OfferingInstInfo downgradeOfferingInst,
           com.huawei.www.bme.cbsinterface.bcservices.OfferingInstInfo promotionOfferingInst) {
           this.cancelOfferingInst = cancelOfferingInst;
           this.downgradeOfferingInst = downgradeOfferingInst;
           this.promotionOfferingInst = promotionOfferingInst;
    }


    /**
     * Gets the cancelOfferingInst value for this PenaltyCalculationRequestPenaltyOfferingInstInfoList.
     * 
     * @return cancelOfferingInst
     */
    public com.huawei.www.bme.cbsinterface.bcservices.OfferingInstInfo getCancelOfferingInst() {
        return cancelOfferingInst;
    }


    /**
     * Sets the cancelOfferingInst value for this PenaltyCalculationRequestPenaltyOfferingInstInfoList.
     * 
     * @param cancelOfferingInst
     */
    public void setCancelOfferingInst(com.huawei.www.bme.cbsinterface.bcservices.OfferingInstInfo cancelOfferingInst) {
        this.cancelOfferingInst = cancelOfferingInst;
    }


    /**
     * Gets the downgradeOfferingInst value for this PenaltyCalculationRequestPenaltyOfferingInstInfoList.
     * 
     * @return downgradeOfferingInst
     */
    public com.huawei.www.bme.cbsinterface.bcservices.OfferingInstInfo getDowngradeOfferingInst() {
        return downgradeOfferingInst;
    }


    /**
     * Sets the downgradeOfferingInst value for this PenaltyCalculationRequestPenaltyOfferingInstInfoList.
     * 
     * @param downgradeOfferingInst
     */
    public void setDowngradeOfferingInst(com.huawei.www.bme.cbsinterface.bcservices.OfferingInstInfo downgradeOfferingInst) {
        this.downgradeOfferingInst = downgradeOfferingInst;
    }


    /**
     * Gets the promotionOfferingInst value for this PenaltyCalculationRequestPenaltyOfferingInstInfoList.
     * 
     * @return promotionOfferingInst
     */
    public com.huawei.www.bme.cbsinterface.bcservices.OfferingInstInfo getPromotionOfferingInst() {
        return promotionOfferingInst;
    }


    /**
     * Sets the promotionOfferingInst value for this PenaltyCalculationRequestPenaltyOfferingInstInfoList.
     * 
     * @param promotionOfferingInst
     */
    public void setPromotionOfferingInst(com.huawei.www.bme.cbsinterface.bcservices.OfferingInstInfo promotionOfferingInst) {
        this.promotionOfferingInst = promotionOfferingInst;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PenaltyCalculationRequestPenaltyOfferingInstInfoList)) return false;
        PenaltyCalculationRequestPenaltyOfferingInstInfoList other = (PenaltyCalculationRequestPenaltyOfferingInstInfoList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cancelOfferingInst==null && other.getCancelOfferingInst()==null) || 
             (this.cancelOfferingInst!=null &&
              this.cancelOfferingInst.equals(other.getCancelOfferingInst()))) &&
            ((this.downgradeOfferingInst==null && other.getDowngradeOfferingInst()==null) || 
             (this.downgradeOfferingInst!=null &&
              this.downgradeOfferingInst.equals(other.getDowngradeOfferingInst()))) &&
            ((this.promotionOfferingInst==null && other.getPromotionOfferingInst()==null) || 
             (this.promotionOfferingInst!=null &&
              this.promotionOfferingInst.equals(other.getPromotionOfferingInst())));
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
        if (getCancelOfferingInst() != null) {
            _hashCode += getCancelOfferingInst().hashCode();
        }
        if (getDowngradeOfferingInst() != null) {
            _hashCode += getDowngradeOfferingInst().hashCode();
        }
        if (getPromotionOfferingInst() != null) {
            _hashCode += getPromotionOfferingInst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PenaltyCalculationRequestPenaltyOfferingInstInfoList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">PenaltyCalculationRequest>PenaltyOfferingInstInfoList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelOfferingInst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "CancelOfferingInst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingInstInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downgradeOfferingInst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DowngradeOfferingInst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingInstInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionOfferingInst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PromotionOfferingInst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "OfferingInstInfo"));
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
