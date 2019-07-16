/**
 * BbServices_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public interface BbServices_PortType extends java.rmi.Remote {
    public com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultMsg queryUnbilledAmount(com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountRequestMsg queryUnbilledAmountRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultMsg queryFreeUnit(com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitRequestMsg queryFreeUnitRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultMsg queryCDR(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRRequestMsg queryCDRRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.bbservices.Charge2BillResultMsg charge2Bill(com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRequestMsg charge2BillRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackResultMsg charge2BillRollback(com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestMsg charge2BillRollbackRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultMsg queryAggregationAmount(com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountRequestMsg queryAggregationAmountRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.bbservices.BillSuppressResultMsg billSuppress(com.huawei.www.bme.cbsinterface.bbservices.BillSuppressRequestMsg billSuppressRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.bbservices.HotBillingResultMsg hotBilling(com.huawei.www.bme.cbsinterface.bbservices.HotBillingRequestMsg hotBillingRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusResultMsg queryHotBillingStatus(com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusRequestMsg queryHotBillingStatusRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultMsg queryCDRDetail(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailRequestMsg queryCDRDetailRequestMsg) throws java.rmi.RemoteException;
}
