/**
 * ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct  implements java.io.Serializable {
    private java.lang.String prePaidAcctKey;

    private java.lang.String postPaidAcctKey;

    private java.lang.String DFTAcctKey;

    public ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct() {
    }

    public ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct(
           java.lang.String prePaidAcctKey,
           java.lang.String postPaidAcctKey,
           java.lang.String DFTAcctKey) {
           this.prePaidAcctKey = prePaidAcctKey;
           this.postPaidAcctKey = postPaidAcctKey;
           this.DFTAcctKey = DFTAcctKey;
    }


    /**
     * Gets the prePaidAcctKey value for this ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct.
     * 
     * @return prePaidAcctKey
     */
    public java.lang.String getPrePaidAcctKey() {
        return prePaidAcctKey;
    }


    /**
     * Sets the prePaidAcctKey value for this ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct.
     * 
     * @param prePaidAcctKey
     */
    public void setPrePaidAcctKey(java.lang.String prePaidAcctKey) {
        this.prePaidAcctKey = prePaidAcctKey;
    }


    /**
     * Gets the postPaidAcctKey value for this ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct.
     * 
     * @return postPaidAcctKey
     */
    public java.lang.String getPostPaidAcctKey() {
        return postPaidAcctKey;
    }


    /**
     * Sets the postPaidAcctKey value for this ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct.
     * 
     * @param postPaidAcctKey
     */
    public void setPostPaidAcctKey(java.lang.String postPaidAcctKey) {
        this.postPaidAcctKey = postPaidAcctKey;
    }


    /**
     * Gets the DFTAcctKey value for this ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct.
     * 
     * @return DFTAcctKey
     */
    public java.lang.String getDFTAcctKey() {
        return DFTAcctKey;
    }


    /**
     * Sets the DFTAcctKey value for this ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct.
     * 
     * @param DFTAcctKey
     */
    public void setDFTAcctKey(java.lang.String DFTAcctKey) {
        this.DFTAcctKey = DFTAcctKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct)) return false;
        ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct other = (ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prePaidAcctKey==null && other.getPrePaidAcctKey()==null) || 
             (this.prePaidAcctKey!=null &&
              this.prePaidAcctKey.equals(other.getPrePaidAcctKey()))) &&
            ((this.postPaidAcctKey==null && other.getPostPaidAcctKey()==null) || 
             (this.postPaidAcctKey!=null &&
              this.postPaidAcctKey.equals(other.getPostPaidAcctKey()))) &&
            ((this.DFTAcctKey==null && other.getDFTAcctKey()==null) || 
             (this.DFTAcctKey!=null &&
              this.DFTAcctKey.equals(other.getDFTAcctKey())));
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
        if (getPrePaidAcctKey() != null) {
            _hashCode += getPrePaidAcctKey().hashCode();
        }
        if (getPostPaidAcctKey() != null) {
            _hashCode += getPostPaidAcctKey().hashCode();
        }
        if (getDFTAcctKey() != null) {
            _hashCode += getDFTAcctKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubPaymentModeRequestPaymentModeChangeSubDFTAccountNewDFTAcct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", ">>>ChangeSubPaymentModeRequest>PaymentModeChange>SubDFTAccount>NewDFTAcct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prePaidAcctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PrePaidAcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postPaidAcctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "PostPaidAcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFTAcctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "DFTAcctKey"));
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
