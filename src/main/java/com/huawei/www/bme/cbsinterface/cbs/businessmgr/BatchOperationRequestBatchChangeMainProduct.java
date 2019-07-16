/**
 * BatchOperationRequestBatchChangeMainProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class BatchOperationRequestBatchChangeMainProduct  implements java.io.Serializable {
    private java.lang.String fileName;

    private java.lang.String newMainProductId;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.ValidMode validMode;

    private java.lang.String effectiveDate;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProductProduct[] product;

    private java.lang.Integer handlingChargeFlag;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProductRemovedProduct[] removedProduct;

    private java.lang.String newBrandId;

    private java.lang.Long ppsAcctCredit;

    private java.lang.Long posAcctCredit;

    private java.lang.Long ppsAcctInitBal;

    private java.lang.Long posAcctInitBal;

    public BatchOperationRequestBatchChangeMainProduct() {
    }

    public BatchOperationRequestBatchChangeMainProduct(
           java.lang.String fileName,
           java.lang.String newMainProductId,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.ValidMode validMode,
           java.lang.String effectiveDate,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProductProduct[] product,
           java.lang.Integer handlingChargeFlag,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProductRemovedProduct[] removedProduct,
           java.lang.String newBrandId,
           java.lang.Long ppsAcctCredit,
           java.lang.Long posAcctCredit,
           java.lang.Long ppsAcctInitBal,
           java.lang.Long posAcctInitBal) {
           this.fileName = fileName;
           this.newMainProductId = newMainProductId;
           this.validMode = validMode;
           this.effectiveDate = effectiveDate;
           this.product = product;
           this.handlingChargeFlag = handlingChargeFlag;
           this.removedProduct = removedProduct;
           this.newBrandId = newBrandId;
           this.ppsAcctCredit = ppsAcctCredit;
           this.posAcctCredit = posAcctCredit;
           this.ppsAcctInitBal = ppsAcctInitBal;
           this.posAcctInitBal = posAcctInitBal;
    }


    /**
     * Gets the fileName value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the newMainProductId value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @return newMainProductId
     */
    public java.lang.String getNewMainProductId() {
        return newMainProductId;
    }


    /**
     * Sets the newMainProductId value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @param newMainProductId
     */
    public void setNewMainProductId(java.lang.String newMainProductId) {
        this.newMainProductId = newMainProductId;
    }


    /**
     * Gets the validMode value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @return validMode
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ValidMode getValidMode() {
        return validMode;
    }


    /**
     * Sets the validMode value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @param validMode
     */
    public void setValidMode(com.huawei.www.bme.cbsinterface.cbs.businessmgr.ValidMode validMode) {
        this.validMode = validMode;
    }


    /**
     * Gets the effectiveDate value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the product value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @return product
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProductProduct[] getProduct() {
        return product;
    }


    /**
     * Sets the product value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @param product
     */
    public void setProduct(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProductProduct[] product) {
        this.product = product;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProductProduct getProduct(int i) {
        return this.product[i];
    }

    public void setProduct(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProductProduct _value) {
        this.product[i] = _value;
    }


    /**
     * Gets the handlingChargeFlag value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @return handlingChargeFlag
     */
    public java.lang.Integer getHandlingChargeFlag() {
        return handlingChargeFlag;
    }


    /**
     * Sets the handlingChargeFlag value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @param handlingChargeFlag
     */
    public void setHandlingChargeFlag(java.lang.Integer handlingChargeFlag) {
        this.handlingChargeFlag = handlingChargeFlag;
    }


    /**
     * Gets the removedProduct value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @return removedProduct
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProductRemovedProduct[] getRemovedProduct() {
        return removedProduct;
    }


    /**
     * Sets the removedProduct value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @param removedProduct
     */
    public void setRemovedProduct(com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProductRemovedProduct[] removedProduct) {
        this.removedProduct = removedProduct;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProductRemovedProduct getRemovedProduct(int i) {
        return this.removedProduct[i];
    }

    public void setRemovedProduct(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.BatchOperationRequestBatchChangeMainProductRemovedProduct _value) {
        this.removedProduct[i] = _value;
    }


    /**
     * Gets the newBrandId value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @return newBrandId
     */
    public java.lang.String getNewBrandId() {
        return newBrandId;
    }


    /**
     * Sets the newBrandId value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @param newBrandId
     */
    public void setNewBrandId(java.lang.String newBrandId) {
        this.newBrandId = newBrandId;
    }


    /**
     * Gets the ppsAcctCredit value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @return ppsAcctCredit
     */
    public java.lang.Long getPpsAcctCredit() {
        return ppsAcctCredit;
    }


    /**
     * Sets the ppsAcctCredit value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @param ppsAcctCredit
     */
    public void setPpsAcctCredit(java.lang.Long ppsAcctCredit) {
        this.ppsAcctCredit = ppsAcctCredit;
    }


    /**
     * Gets the posAcctCredit value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @return posAcctCredit
     */
    public java.lang.Long getPosAcctCredit() {
        return posAcctCredit;
    }


    /**
     * Sets the posAcctCredit value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @param posAcctCredit
     */
    public void setPosAcctCredit(java.lang.Long posAcctCredit) {
        this.posAcctCredit = posAcctCredit;
    }


    /**
     * Gets the ppsAcctInitBal value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @return ppsAcctInitBal
     */
    public java.lang.Long getPpsAcctInitBal() {
        return ppsAcctInitBal;
    }


    /**
     * Sets the ppsAcctInitBal value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @param ppsAcctInitBal
     */
    public void setPpsAcctInitBal(java.lang.Long ppsAcctInitBal) {
        this.ppsAcctInitBal = ppsAcctInitBal;
    }


    /**
     * Gets the posAcctInitBal value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @return posAcctInitBal
     */
    public java.lang.Long getPosAcctInitBal() {
        return posAcctInitBal;
    }


    /**
     * Sets the posAcctInitBal value for this BatchOperationRequestBatchChangeMainProduct.
     * 
     * @param posAcctInitBal
     */
    public void setPosAcctInitBal(java.lang.Long posAcctInitBal) {
        this.posAcctInitBal = posAcctInitBal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchOperationRequestBatchChangeMainProduct)) return false;
        BatchOperationRequestBatchChangeMainProduct other = (BatchOperationRequestBatchChangeMainProduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.newMainProductId==null && other.getNewMainProductId()==null) || 
             (this.newMainProductId!=null &&
              this.newMainProductId.equals(other.getNewMainProductId()))) &&
            ((this.validMode==null && other.getValidMode()==null) || 
             (this.validMode!=null &&
              this.validMode.equals(other.getValidMode()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              java.util.Arrays.equals(this.product, other.getProduct()))) &&
            ((this.handlingChargeFlag==null && other.getHandlingChargeFlag()==null) || 
             (this.handlingChargeFlag!=null &&
              this.handlingChargeFlag.equals(other.getHandlingChargeFlag()))) &&
            ((this.removedProduct==null && other.getRemovedProduct()==null) || 
             (this.removedProduct!=null &&
              java.util.Arrays.equals(this.removedProduct, other.getRemovedProduct()))) &&
            ((this.newBrandId==null && other.getNewBrandId()==null) || 
             (this.newBrandId!=null &&
              this.newBrandId.equals(other.getNewBrandId()))) &&
            ((this.ppsAcctCredit==null && other.getPpsAcctCredit()==null) || 
             (this.ppsAcctCredit!=null &&
              this.ppsAcctCredit.equals(other.getPpsAcctCredit()))) &&
            ((this.posAcctCredit==null && other.getPosAcctCredit()==null) || 
             (this.posAcctCredit!=null &&
              this.posAcctCredit.equals(other.getPosAcctCredit()))) &&
            ((this.ppsAcctInitBal==null && other.getPpsAcctInitBal()==null) || 
             (this.ppsAcctInitBal!=null &&
              this.ppsAcctInitBal.equals(other.getPpsAcctInitBal()))) &&
            ((this.posAcctInitBal==null && other.getPosAcctInitBal()==null) || 
             (this.posAcctInitBal!=null &&
              this.posAcctInitBal.equals(other.getPosAcctInitBal())));
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
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getNewMainProductId() != null) {
            _hashCode += getNewMainProductId().hashCode();
        }
        if (getValidMode() != null) {
            _hashCode += getValidMode().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProduct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHandlingChargeFlag() != null) {
            _hashCode += getHandlingChargeFlag().hashCode();
        }
        if (getRemovedProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemovedProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemovedProduct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewBrandId() != null) {
            _hashCode += getNewBrandId().hashCode();
        }
        if (getPpsAcctCredit() != null) {
            _hashCode += getPpsAcctCredit().hashCode();
        }
        if (getPosAcctCredit() != null) {
            _hashCode += getPosAcctCredit().hashCode();
        }
        if (getPpsAcctInitBal() != null) {
            _hashCode += getPpsAcctInitBal().hashCode();
        }
        if (getPosAcctInitBal() != null) {
            _hashCode += getPosAcctInitBal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchOperationRequestBatchChangeMainProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">BatchOperationRequest>BatchChangeMainProduct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMainProductId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewMainProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ValidMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ValidMode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>BatchOperationRequest>BatchChangeMainProduct>Product"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingChargeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "HandlingChargeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removedProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "RemovedProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">>BatchOperationRequest>BatchChangeMainProduct>RemovedProduct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBrandId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewBrandId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppsAcctCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ppsAcctCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posAcctCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "posAcctCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppsAcctInitBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ppsAcctInitBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posAcctInitBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "PosAcctInitBal"));
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
