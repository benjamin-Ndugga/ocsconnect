/**
 * ChangeMainProdRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class ChangeMainProdRequest  extends com.huawei.www.bme.cbsinterface.cbs.businessmgr.Common  implements java.io.Serializable {
    private java.lang.String newBrandId;

    private java.lang.String newMainProductId;

    private java.lang.Integer handlingChargeFlag;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.ValidMode validMode;

    private java.lang.String effectiveDate;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequestProduct[] product;

    private com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequestRemovedProduct[] removedProduct;

    private java.lang.String custID;

    private java.lang.Long ppsAcctCredit;

    private java.lang.Long posAcctCredit;

    private java.lang.Long ppsAcctInitBal;

    private java.lang.Long posAcctInitBal;

    private java.lang.Integer newBillcycleType;

    private java.lang.String newCustID;

    private java.lang.String newAcctID;

    private java.lang.String newSubID;

    private java.lang.String localID;

    private java.lang.String IMSI;

    private java.lang.Integer BCChangeMode;

    public ChangeMainProdRequest() {
    }

    public ChangeMainProdRequest(
           java.lang.String subscriberNo,
           java.lang.String newBrandId,
           java.lang.String newMainProductId,
           java.lang.Integer handlingChargeFlag,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.ValidMode validMode,
           java.lang.String effectiveDate,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequestProduct[] product,
           com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequestRemovedProduct[] removedProduct,
           java.lang.String custID,
           java.lang.Long ppsAcctCredit,
           java.lang.Long posAcctCredit,
           java.lang.Long ppsAcctInitBal,
           java.lang.Long posAcctInitBal,
           java.lang.Integer newBillcycleType,
           java.lang.String newCustID,
           java.lang.String newAcctID,
           java.lang.String newSubID,
           java.lang.String localID,
           java.lang.String IMSI,
           java.lang.Integer BCChangeMode) {
        super(
            subscriberNo);
        this.newBrandId = newBrandId;
        this.newMainProductId = newMainProductId;
        this.handlingChargeFlag = handlingChargeFlag;
        this.validMode = validMode;
        this.effectiveDate = effectiveDate;
        this.product = product;
        this.removedProduct = removedProduct;
        this.custID = custID;
        this.ppsAcctCredit = ppsAcctCredit;
        this.posAcctCredit = posAcctCredit;
        this.ppsAcctInitBal = ppsAcctInitBal;
        this.posAcctInitBal = posAcctInitBal;
        this.newBillcycleType = newBillcycleType;
        this.newCustID = newCustID;
        this.newAcctID = newAcctID;
        this.newSubID = newSubID;
        this.localID = localID;
        this.IMSI = IMSI;
        this.BCChangeMode = BCChangeMode;
    }


    /**
     * Gets the newBrandId value for this ChangeMainProdRequest.
     * 
     * @return newBrandId
     */
    public java.lang.String getNewBrandId() {
        return newBrandId;
    }


    /**
     * Sets the newBrandId value for this ChangeMainProdRequest.
     * 
     * @param newBrandId
     */
    public void setNewBrandId(java.lang.String newBrandId) {
        this.newBrandId = newBrandId;
    }


    /**
     * Gets the newMainProductId value for this ChangeMainProdRequest.
     * 
     * @return newMainProductId
     */
    public java.lang.String getNewMainProductId() {
        return newMainProductId;
    }


    /**
     * Sets the newMainProductId value for this ChangeMainProdRequest.
     * 
     * @param newMainProductId
     */
    public void setNewMainProductId(java.lang.String newMainProductId) {
        this.newMainProductId = newMainProductId;
    }


    /**
     * Gets the handlingChargeFlag value for this ChangeMainProdRequest.
     * 
     * @return handlingChargeFlag
     */
    public java.lang.Integer getHandlingChargeFlag() {
        return handlingChargeFlag;
    }


    /**
     * Sets the handlingChargeFlag value for this ChangeMainProdRequest.
     * 
     * @param handlingChargeFlag
     */
    public void setHandlingChargeFlag(java.lang.Integer handlingChargeFlag) {
        this.handlingChargeFlag = handlingChargeFlag;
    }


    /**
     * Gets the validMode value for this ChangeMainProdRequest.
     * 
     * @return validMode
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ValidMode getValidMode() {
        return validMode;
    }


    /**
     * Sets the validMode value for this ChangeMainProdRequest.
     * 
     * @param validMode
     */
    public void setValidMode(com.huawei.www.bme.cbsinterface.cbs.businessmgr.ValidMode validMode) {
        this.validMode = validMode;
    }


    /**
     * Gets the effectiveDate value for this ChangeMainProdRequest.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ChangeMainProdRequest.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the product value for this ChangeMainProdRequest.
     * 
     * @return product
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequestProduct[] getProduct() {
        return product;
    }


    /**
     * Sets the product value for this ChangeMainProdRequest.
     * 
     * @param product
     */
    public void setProduct(com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequestProduct[] product) {
        this.product = product;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequestProduct getProduct(int i) {
        return this.product[i];
    }

    public void setProduct(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequestProduct _value) {
        this.product[i] = _value;
    }


    /**
     * Gets the removedProduct value for this ChangeMainProdRequest.
     * 
     * @return removedProduct
     */
    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequestRemovedProduct[] getRemovedProduct() {
        return removedProduct;
    }


    /**
     * Sets the removedProduct value for this ChangeMainProdRequest.
     * 
     * @param removedProduct
     */
    public void setRemovedProduct(com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequestRemovedProduct[] removedProduct) {
        this.removedProduct = removedProduct;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequestRemovedProduct getRemovedProduct(int i) {
        return this.removedProduct[i];
    }

    public void setRemovedProduct(int i, com.huawei.www.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequestRemovedProduct _value) {
        this.removedProduct[i] = _value;
    }


    /**
     * Gets the custID value for this ChangeMainProdRequest.
     * 
     * @return custID
     */
    public java.lang.String getCustID() {
        return custID;
    }


    /**
     * Sets the custID value for this ChangeMainProdRequest.
     * 
     * @param custID
     */
    public void setCustID(java.lang.String custID) {
        this.custID = custID;
    }


    /**
     * Gets the ppsAcctCredit value for this ChangeMainProdRequest.
     * 
     * @return ppsAcctCredit
     */
    public java.lang.Long getPpsAcctCredit() {
        return ppsAcctCredit;
    }


    /**
     * Sets the ppsAcctCredit value for this ChangeMainProdRequest.
     * 
     * @param ppsAcctCredit
     */
    public void setPpsAcctCredit(java.lang.Long ppsAcctCredit) {
        this.ppsAcctCredit = ppsAcctCredit;
    }


    /**
     * Gets the posAcctCredit value for this ChangeMainProdRequest.
     * 
     * @return posAcctCredit
     */
    public java.lang.Long getPosAcctCredit() {
        return posAcctCredit;
    }


    /**
     * Sets the posAcctCredit value for this ChangeMainProdRequest.
     * 
     * @param posAcctCredit
     */
    public void setPosAcctCredit(java.lang.Long posAcctCredit) {
        this.posAcctCredit = posAcctCredit;
    }


    /**
     * Gets the ppsAcctInitBal value for this ChangeMainProdRequest.
     * 
     * @return ppsAcctInitBal
     */
    public java.lang.Long getPpsAcctInitBal() {
        return ppsAcctInitBal;
    }


    /**
     * Sets the ppsAcctInitBal value for this ChangeMainProdRequest.
     * 
     * @param ppsAcctInitBal
     */
    public void setPpsAcctInitBal(java.lang.Long ppsAcctInitBal) {
        this.ppsAcctInitBal = ppsAcctInitBal;
    }


    /**
     * Gets the posAcctInitBal value for this ChangeMainProdRequest.
     * 
     * @return posAcctInitBal
     */
    public java.lang.Long getPosAcctInitBal() {
        return posAcctInitBal;
    }


    /**
     * Sets the posAcctInitBal value for this ChangeMainProdRequest.
     * 
     * @param posAcctInitBal
     */
    public void setPosAcctInitBal(java.lang.Long posAcctInitBal) {
        this.posAcctInitBal = posAcctInitBal;
    }


    /**
     * Gets the newBillcycleType value for this ChangeMainProdRequest.
     * 
     * @return newBillcycleType
     */
    public java.lang.Integer getNewBillcycleType() {
        return newBillcycleType;
    }


    /**
     * Sets the newBillcycleType value for this ChangeMainProdRequest.
     * 
     * @param newBillcycleType
     */
    public void setNewBillcycleType(java.lang.Integer newBillcycleType) {
        this.newBillcycleType = newBillcycleType;
    }


    /**
     * Gets the newCustID value for this ChangeMainProdRequest.
     * 
     * @return newCustID
     */
    public java.lang.String getNewCustID() {
        return newCustID;
    }


    /**
     * Sets the newCustID value for this ChangeMainProdRequest.
     * 
     * @param newCustID
     */
    public void setNewCustID(java.lang.String newCustID) {
        this.newCustID = newCustID;
    }


    /**
     * Gets the newAcctID value for this ChangeMainProdRequest.
     * 
     * @return newAcctID
     */
    public java.lang.String getNewAcctID() {
        return newAcctID;
    }


    /**
     * Sets the newAcctID value for this ChangeMainProdRequest.
     * 
     * @param newAcctID
     */
    public void setNewAcctID(java.lang.String newAcctID) {
        this.newAcctID = newAcctID;
    }


    /**
     * Gets the newSubID value for this ChangeMainProdRequest.
     * 
     * @return newSubID
     */
    public java.lang.String getNewSubID() {
        return newSubID;
    }


    /**
     * Sets the newSubID value for this ChangeMainProdRequest.
     * 
     * @param newSubID
     */
    public void setNewSubID(java.lang.String newSubID) {
        this.newSubID = newSubID;
    }


    /**
     * Gets the localID value for this ChangeMainProdRequest.
     * 
     * @return localID
     */
    public java.lang.String getLocalID() {
        return localID;
    }


    /**
     * Sets the localID value for this ChangeMainProdRequest.
     * 
     * @param localID
     */
    public void setLocalID(java.lang.String localID) {
        this.localID = localID;
    }


    /**
     * Gets the IMSI value for this ChangeMainProdRequest.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this ChangeMainProdRequest.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the BCChangeMode value for this ChangeMainProdRequest.
     * 
     * @return BCChangeMode
     */
    public java.lang.Integer getBCChangeMode() {
        return BCChangeMode;
    }


    /**
     * Sets the BCChangeMode value for this ChangeMainProdRequest.
     * 
     * @param BCChangeMode
     */
    public void setBCChangeMode(java.lang.Integer BCChangeMode) {
        this.BCChangeMode = BCChangeMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeMainProdRequest)) return false;
        ChangeMainProdRequest other = (ChangeMainProdRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.newBrandId==null && other.getNewBrandId()==null) || 
             (this.newBrandId!=null &&
              this.newBrandId.equals(other.getNewBrandId()))) &&
            ((this.newMainProductId==null && other.getNewMainProductId()==null) || 
             (this.newMainProductId!=null &&
              this.newMainProductId.equals(other.getNewMainProductId()))) &&
            ((this.handlingChargeFlag==null && other.getHandlingChargeFlag()==null) || 
             (this.handlingChargeFlag!=null &&
              this.handlingChargeFlag.equals(other.getHandlingChargeFlag()))) &&
            ((this.validMode==null && other.getValidMode()==null) || 
             (this.validMode!=null &&
              this.validMode.equals(other.getValidMode()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              java.util.Arrays.equals(this.product, other.getProduct()))) &&
            ((this.removedProduct==null && other.getRemovedProduct()==null) || 
             (this.removedProduct!=null &&
              java.util.Arrays.equals(this.removedProduct, other.getRemovedProduct()))) &&
            ((this.custID==null && other.getCustID()==null) || 
             (this.custID!=null &&
              this.custID.equals(other.getCustID()))) &&
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
              this.posAcctInitBal.equals(other.getPosAcctInitBal()))) &&
            ((this.newBillcycleType==null && other.getNewBillcycleType()==null) || 
             (this.newBillcycleType!=null &&
              this.newBillcycleType.equals(other.getNewBillcycleType()))) &&
            ((this.newCustID==null && other.getNewCustID()==null) || 
             (this.newCustID!=null &&
              this.newCustID.equals(other.getNewCustID()))) &&
            ((this.newAcctID==null && other.getNewAcctID()==null) || 
             (this.newAcctID!=null &&
              this.newAcctID.equals(other.getNewAcctID()))) &&
            ((this.newSubID==null && other.getNewSubID()==null) || 
             (this.newSubID!=null &&
              this.newSubID.equals(other.getNewSubID()))) &&
            ((this.localID==null && other.getLocalID()==null) || 
             (this.localID!=null &&
              this.localID.equals(other.getLocalID()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.BCChangeMode==null && other.getBCChangeMode()==null) || 
             (this.BCChangeMode!=null &&
              this.BCChangeMode.equals(other.getBCChangeMode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getNewBrandId() != null) {
            _hashCode += getNewBrandId().hashCode();
        }
        if (getNewMainProductId() != null) {
            _hashCode += getNewMainProductId().hashCode();
        }
        if (getHandlingChargeFlag() != null) {
            _hashCode += getHandlingChargeFlag().hashCode();
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
        if (getCustID() != null) {
            _hashCode += getCustID().hashCode();
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
        if (getNewBillcycleType() != null) {
            _hashCode += getNewBillcycleType().hashCode();
        }
        if (getNewCustID() != null) {
            _hashCode += getNewCustID().hashCode();
        }
        if (getNewAcctID() != null) {
            _hashCode += getNewAcctID().hashCode();
        }
        if (getNewSubID() != null) {
            _hashCode += getNewSubID().hashCode();
        }
        if (getLocalID() != null) {
            _hashCode += getLocalID().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getBCChangeMode() != null) {
            _hashCode += getBCChangeMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeMainProdRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChangeMainProdRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBrandId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewBrandId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMainProductId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NewMainProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingChargeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "HandlingChargeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ChangeMainProdRequest>Product"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removedProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "RemovedProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", ">ChangeMainProdRequest>RemovedProduct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CustID"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "posAcctInitBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBillcycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "newBillcycleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newCustID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "newCustID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAcctID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "newAcctID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSubID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "newSubID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "LocalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BCChangeMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BCChangeMode"));
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
