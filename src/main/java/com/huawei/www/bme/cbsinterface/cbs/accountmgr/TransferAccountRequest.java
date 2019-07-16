/**
 * TransferAccountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class TransferAccountRequest  implements java.io.Serializable {
    private java.lang.String logID;

    private java.lang.Integer accessMethod;

    private java.lang.String transfereeNo;

    private java.lang.String transferorNo;

    private java.lang.Integer transferType;

    private java.lang.Long transferHandlingCharge;

    private com.huawei.www.bme.cbsinterface.cbs.accountmgr.ModifyAcctFeeType[] modifyAcctFeeList;

    private java.lang.Integer handlingChargeFlag;

    private java.lang.String custID;

    private java.lang.String password;

    private java.lang.String reserve1;

    private java.lang.String MERCHANT;

    private java.lang.String SERVICE;

    public TransferAccountRequest() {
    }

    public TransferAccountRequest(
           java.lang.String logID,
           java.lang.Integer accessMethod,
           java.lang.String transfereeNo,
           java.lang.String transferorNo,
           java.lang.Integer transferType,
           java.lang.Long transferHandlingCharge,
           com.huawei.www.bme.cbsinterface.cbs.accountmgr.ModifyAcctFeeType[] modifyAcctFeeList,
           java.lang.Integer handlingChargeFlag,
           java.lang.String custID,
           java.lang.String password,
           java.lang.String reserve1,
           java.lang.String MERCHANT,
           java.lang.String SERVICE) {
           this.logID = logID;
           this.accessMethod = accessMethod;
           this.transfereeNo = transfereeNo;
           this.transferorNo = transferorNo;
           this.transferType = transferType;
           this.transferHandlingCharge = transferHandlingCharge;
           this.modifyAcctFeeList = modifyAcctFeeList;
           this.handlingChargeFlag = handlingChargeFlag;
           this.custID = custID;
           this.password = password;
           this.reserve1 = reserve1;
           this.MERCHANT = MERCHANT;
           this.SERVICE = SERVICE;
    }


    /**
     * Gets the logID value for this TransferAccountRequest.
     * 
     * @return logID
     */
    public java.lang.String getLogID() {
        return logID;
    }


    /**
     * Sets the logID value for this TransferAccountRequest.
     * 
     * @param logID
     */
    public void setLogID(java.lang.String logID) {
        this.logID = logID;
    }


    /**
     * Gets the accessMethod value for this TransferAccountRequest.
     * 
     * @return accessMethod
     */
    public java.lang.Integer getAccessMethod() {
        return accessMethod;
    }


    /**
     * Sets the accessMethod value for this TransferAccountRequest.
     * 
     * @param accessMethod
     */
    public void setAccessMethod(java.lang.Integer accessMethod) {
        this.accessMethod = accessMethod;
    }


    /**
     * Gets the transfereeNo value for this TransferAccountRequest.
     * 
     * @return transfereeNo
     */
    public java.lang.String getTransfereeNo() {
        return transfereeNo;
    }


    /**
     * Sets the transfereeNo value for this TransferAccountRequest.
     * 
     * @param transfereeNo
     */
    public void setTransfereeNo(java.lang.String transfereeNo) {
        this.transfereeNo = transfereeNo;
    }


    /**
     * Gets the transferorNo value for this TransferAccountRequest.
     * 
     * @return transferorNo
     */
    public java.lang.String getTransferorNo() {
        return transferorNo;
    }


    /**
     * Sets the transferorNo value for this TransferAccountRequest.
     * 
     * @param transferorNo
     */
    public void setTransferorNo(java.lang.String transferorNo) {
        this.transferorNo = transferorNo;
    }


    /**
     * Gets the transferType value for this TransferAccountRequest.
     * 
     * @return transferType
     */
    public java.lang.Integer getTransferType() {
        return transferType;
    }


    /**
     * Sets the transferType value for this TransferAccountRequest.
     * 
     * @param transferType
     */
    public void setTransferType(java.lang.Integer transferType) {
        this.transferType = transferType;
    }


    /**
     * Gets the transferHandlingCharge value for this TransferAccountRequest.
     * 
     * @return transferHandlingCharge
     */
    public java.lang.Long getTransferHandlingCharge() {
        return transferHandlingCharge;
    }


    /**
     * Sets the transferHandlingCharge value for this TransferAccountRequest.
     * 
     * @param transferHandlingCharge
     */
    public void setTransferHandlingCharge(java.lang.Long transferHandlingCharge) {
        this.transferHandlingCharge = transferHandlingCharge;
    }


    /**
     * Gets the modifyAcctFeeList value for this TransferAccountRequest.
     * 
     * @return modifyAcctFeeList
     */
    public com.huawei.www.bme.cbsinterface.cbs.accountmgr.ModifyAcctFeeType[] getModifyAcctFeeList() {
        return modifyAcctFeeList;
    }


    /**
     * Sets the modifyAcctFeeList value for this TransferAccountRequest.
     * 
     * @param modifyAcctFeeList
     */
    public void setModifyAcctFeeList(com.huawei.www.bme.cbsinterface.cbs.accountmgr.ModifyAcctFeeType[] modifyAcctFeeList) {
        this.modifyAcctFeeList = modifyAcctFeeList;
    }


    /**
     * Gets the handlingChargeFlag value for this TransferAccountRequest.
     * 
     * @return handlingChargeFlag
     */
    public java.lang.Integer getHandlingChargeFlag() {
        return handlingChargeFlag;
    }


    /**
     * Sets the handlingChargeFlag value for this TransferAccountRequest.
     * 
     * @param handlingChargeFlag
     */
    public void setHandlingChargeFlag(java.lang.Integer handlingChargeFlag) {
        this.handlingChargeFlag = handlingChargeFlag;
    }


    /**
     * Gets the custID value for this TransferAccountRequest.
     * 
     * @return custID
     */
    public java.lang.String getCustID() {
        return custID;
    }


    /**
     * Sets the custID value for this TransferAccountRequest.
     * 
     * @param custID
     */
    public void setCustID(java.lang.String custID) {
        this.custID = custID;
    }


    /**
     * Gets the password value for this TransferAccountRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this TransferAccountRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the reserve1 value for this TransferAccountRequest.
     * 
     * @return reserve1
     */
    public java.lang.String getReserve1() {
        return reserve1;
    }


    /**
     * Sets the reserve1 value for this TransferAccountRequest.
     * 
     * @param reserve1
     */
    public void setReserve1(java.lang.String reserve1) {
        this.reserve1 = reserve1;
    }


    /**
     * Gets the MERCHANT value for this TransferAccountRequest.
     * 
     * @return MERCHANT
     */
    public java.lang.String getMERCHANT() {
        return MERCHANT;
    }


    /**
     * Sets the MERCHANT value for this TransferAccountRequest.
     * 
     * @param MERCHANT
     */
    public void setMERCHANT(java.lang.String MERCHANT) {
        this.MERCHANT = MERCHANT;
    }


    /**
     * Gets the SERVICE value for this TransferAccountRequest.
     * 
     * @return SERVICE
     */
    public java.lang.String getSERVICE() {
        return SERVICE;
    }


    /**
     * Sets the SERVICE value for this TransferAccountRequest.
     * 
     * @param SERVICE
     */
    public void setSERVICE(java.lang.String SERVICE) {
        this.SERVICE = SERVICE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferAccountRequest)) return false;
        TransferAccountRequest other = (TransferAccountRequest) obj;
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
            ((this.accessMethod==null && other.getAccessMethod()==null) || 
             (this.accessMethod!=null &&
              this.accessMethod.equals(other.getAccessMethod()))) &&
            ((this.transfereeNo==null && other.getTransfereeNo()==null) || 
             (this.transfereeNo!=null &&
              this.transfereeNo.equals(other.getTransfereeNo()))) &&
            ((this.transferorNo==null && other.getTransferorNo()==null) || 
             (this.transferorNo!=null &&
              this.transferorNo.equals(other.getTransferorNo()))) &&
            ((this.transferType==null && other.getTransferType()==null) || 
             (this.transferType!=null &&
              this.transferType.equals(other.getTransferType()))) &&
            ((this.transferHandlingCharge==null && other.getTransferHandlingCharge()==null) || 
             (this.transferHandlingCharge!=null &&
              this.transferHandlingCharge.equals(other.getTransferHandlingCharge()))) &&
            ((this.modifyAcctFeeList==null && other.getModifyAcctFeeList()==null) || 
             (this.modifyAcctFeeList!=null &&
              java.util.Arrays.equals(this.modifyAcctFeeList, other.getModifyAcctFeeList()))) &&
            ((this.handlingChargeFlag==null && other.getHandlingChargeFlag()==null) || 
             (this.handlingChargeFlag!=null &&
              this.handlingChargeFlag.equals(other.getHandlingChargeFlag()))) &&
            ((this.custID==null && other.getCustID()==null) || 
             (this.custID!=null &&
              this.custID.equals(other.getCustID()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.reserve1==null && other.getReserve1()==null) || 
             (this.reserve1!=null &&
              this.reserve1.equals(other.getReserve1()))) &&
            ((this.MERCHANT==null && other.getMERCHANT()==null) || 
             (this.MERCHANT!=null &&
              this.MERCHANT.equals(other.getMERCHANT()))) &&
            ((this.SERVICE==null && other.getSERVICE()==null) || 
             (this.SERVICE!=null &&
              this.SERVICE.equals(other.getSERVICE())));
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
        if (getAccessMethod() != null) {
            _hashCode += getAccessMethod().hashCode();
        }
        if (getTransfereeNo() != null) {
            _hashCode += getTransfereeNo().hashCode();
        }
        if (getTransferorNo() != null) {
            _hashCode += getTransferorNo().hashCode();
        }
        if (getTransferType() != null) {
            _hashCode += getTransferType().hashCode();
        }
        if (getTransferHandlingCharge() != null) {
            _hashCode += getTransferHandlingCharge().hashCode();
        }
        if (getModifyAcctFeeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModifyAcctFeeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModifyAcctFeeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHandlingChargeFlag() != null) {
            _hashCode += getHandlingChargeFlag().hashCode();
        }
        if (getCustID() != null) {
            _hashCode += getCustID().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getReserve1() != null) {
            _hashCode += getReserve1().hashCode();
        }
        if (getMERCHANT() != null) {
            _hashCode += getMERCHANT().hashCode();
        }
        if (getSERVICE() != null) {
            _hashCode += getSERVICE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferAccountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransferAccountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "LogID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "AccessMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transfereeNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransfereeNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferorNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransferorNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransferType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferHandlingCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "TransferHandlingCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyAcctFeeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifyAcctFeeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifyAcctFeeType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "ModifyAcctFee"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingChargeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "HandlingChargeFlag"));
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
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MERCHANT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "MERCHANT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SERVICE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", "SERVICE"));
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
