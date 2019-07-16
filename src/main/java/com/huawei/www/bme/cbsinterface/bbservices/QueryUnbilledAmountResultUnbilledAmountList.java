/**
 * QueryUnbilledAmountResultUnbilledAmountList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class QueryUnbilledAmountResultUnbilledAmountList  implements java.io.Serializable {
    private long billChargeID;

    private java.lang.String billCycleID;

    private java.lang.String custKey;

    private java.lang.String acctKey;

    private java.lang.String objType;

    private java.lang.String objKey;

    private java.lang.String primaryIdentity;

    private java.lang.String category;

    private com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountListUnbilledInfo unbilledInfo;

    public QueryUnbilledAmountResultUnbilledAmountList() {
    }

    public QueryUnbilledAmountResultUnbilledAmountList(
           long billChargeID,
           java.lang.String billCycleID,
           java.lang.String custKey,
           java.lang.String acctKey,
           java.lang.String objType,
           java.lang.String objKey,
           java.lang.String primaryIdentity,
           java.lang.String category,
           com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountListUnbilledInfo unbilledInfo) {
           this.billChargeID = billChargeID;
           this.billCycleID = billCycleID;
           this.custKey = custKey;
           this.acctKey = acctKey;
           this.objType = objType;
           this.objKey = objKey;
           this.primaryIdentity = primaryIdentity;
           this.category = category;
           this.unbilledInfo = unbilledInfo;
    }


    /**
     * Gets the billChargeID value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @return billChargeID
     */
    public long getBillChargeID() {
        return billChargeID;
    }


    /**
     * Sets the billChargeID value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @param billChargeID
     */
    public void setBillChargeID(long billChargeID) {
        this.billChargeID = billChargeID;
    }


    /**
     * Gets the billCycleID value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @return billCycleID
     */
    public java.lang.String getBillCycleID() {
        return billCycleID;
    }


    /**
     * Sets the billCycleID value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @param billCycleID
     */
    public void setBillCycleID(java.lang.String billCycleID) {
        this.billCycleID = billCycleID;
    }


    /**
     * Gets the custKey value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @return custKey
     */
    public java.lang.String getCustKey() {
        return custKey;
    }


    /**
     * Sets the custKey value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @param custKey
     */
    public void setCustKey(java.lang.String custKey) {
        this.custKey = custKey;
    }


    /**
     * Gets the acctKey value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @return acctKey
     */
    public java.lang.String getAcctKey() {
        return acctKey;
    }


    /**
     * Sets the acctKey value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @param acctKey
     */
    public void setAcctKey(java.lang.String acctKey) {
        this.acctKey = acctKey;
    }


    /**
     * Gets the objType value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @return objType
     */
    public java.lang.String getObjType() {
        return objType;
    }


    /**
     * Sets the objType value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @param objType
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }


    /**
     * Gets the objKey value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @return objKey
     */
    public java.lang.String getObjKey() {
        return objKey;
    }


    /**
     * Sets the objKey value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @param objKey
     */
    public void setObjKey(java.lang.String objKey) {
        this.objKey = objKey;
    }


    /**
     * Gets the primaryIdentity value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @return primaryIdentity
     */
    public java.lang.String getPrimaryIdentity() {
        return primaryIdentity;
    }


    /**
     * Sets the primaryIdentity value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @param primaryIdentity
     */
    public void setPrimaryIdentity(java.lang.String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }


    /**
     * Gets the category value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the unbilledInfo value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @return unbilledInfo
     */
    public com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountListUnbilledInfo getUnbilledInfo() {
        return unbilledInfo;
    }


    /**
     * Sets the unbilledInfo value for this QueryUnbilledAmountResultUnbilledAmountList.
     * 
     * @param unbilledInfo
     */
    public void setUnbilledInfo(com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultUnbilledAmountListUnbilledInfo unbilledInfo) {
        this.unbilledInfo = unbilledInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryUnbilledAmountResultUnbilledAmountList)) return false;
        QueryUnbilledAmountResultUnbilledAmountList other = (QueryUnbilledAmountResultUnbilledAmountList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.billChargeID == other.getBillChargeID() &&
            ((this.billCycleID==null && other.getBillCycleID()==null) || 
             (this.billCycleID!=null &&
              this.billCycleID.equals(other.getBillCycleID()))) &&
            ((this.custKey==null && other.getCustKey()==null) || 
             (this.custKey!=null &&
              this.custKey.equals(other.getCustKey()))) &&
            ((this.acctKey==null && other.getAcctKey()==null) || 
             (this.acctKey!=null &&
              this.acctKey.equals(other.getAcctKey()))) &&
            ((this.objType==null && other.getObjType()==null) || 
             (this.objType!=null &&
              this.objType.equals(other.getObjType()))) &&
            ((this.objKey==null && other.getObjKey()==null) || 
             (this.objKey!=null &&
              this.objKey.equals(other.getObjKey()))) &&
            ((this.primaryIdentity==null && other.getPrimaryIdentity()==null) || 
             (this.primaryIdentity!=null &&
              this.primaryIdentity.equals(other.getPrimaryIdentity()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.unbilledInfo==null && other.getUnbilledInfo()==null) || 
             (this.unbilledInfo!=null &&
              this.unbilledInfo.equals(other.getUnbilledInfo())));
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
        _hashCode += new Long(getBillChargeID()).hashCode();
        if (getBillCycleID() != null) {
            _hashCode += getBillCycleID().hashCode();
        }
        if (getCustKey() != null) {
            _hashCode += getCustKey().hashCode();
        }
        if (getAcctKey() != null) {
            _hashCode += getAcctKey().hashCode();
        }
        if (getObjType() != null) {
            _hashCode += getObjType().hashCode();
        }
        if (getObjKey() != null) {
            _hashCode += getObjKey().hashCode();
        }
        if (getPrimaryIdentity() != null) {
            _hashCode += getPrimaryIdentity().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getUnbilledInfo() != null) {
            _hashCode += getUnbilledInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryUnbilledAmountResultUnbilledAmountList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">QueryUnbilledAmountResult>UnbilledAmountList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billChargeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "BillChargeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "BillCycleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "CustKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "AcctKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ObjType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "ObjKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "PrimaryIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unbilledInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "UnbilledInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", ">>QueryUnbilledAmountResult>UnbilledAmountList>UnbilledInfo"));
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
