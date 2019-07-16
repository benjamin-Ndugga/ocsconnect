/**
 * CBSInterfaceAccountMgr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public interface CBSInterfaceAccountMgr extends java.rmi.Remote {
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceResultMsg queryBalance(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceRequestMsg queryBalanceRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeResultMsg voucherRecharge(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeRequestMsg voucherRechargeRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentResultMsg payment(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentRequestMsg paymentRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ActiveFirstResultMsg activeFirst(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ActiveFirstRequestMsg activeFirstRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ReversePaymentResultMsg reversePayment(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ReversePaymentRequestMsg reversePaymentRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustAccountResultMsg adjustAccount(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustAccountRequestMsg adjustAccountRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeEnquiryResultMsg voucherRechargeEnquiry(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeEnquiryRequestMsg voucherRechargeEnquiryRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransferAccountResultMsg transferAccount(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransferAccountRequestMsg transferAccountRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentEnquiryResultMsg paymentEnquiry(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentEnquiryRequestMsg paymentEnquiryRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.CumulateEnquiryResultMsg cumulateEnquiry(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.CumulateEnquiryRequestMsg cumulateEnquiryRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryBySeqResultMsg voucherEnquiryBySeq(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryBySeqRequestMsg voucherEnquiryBySeqRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryByPINResultMsg voucherEnquiryByPIN(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryByPINRequestMsg voucherEnquiryByPINRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.OneOffDeductionResultMsg oneOffDeduction(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.OneOffDeductionRequestMsg oneOffDeductionRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ServiceHandleFeeResultMsg serviceHandleFee(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ServiceHandleFeeRequestMsg serviceHandleFeeRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryTransferLogResultMsg queryTransferLog(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryTransferLogRequestMsg queryTransferLogRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryAdjustmentLogResultMsg queryAdjustmentLog(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryAdjustmentLogRequestMsg queryAdjustmentLogRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModifyVoucherStateResultMsg modifyVoucherState(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModifyVoucherStateRequestMsg modifyVoucherStateRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BalanceToValidityResultMsg balanceToValidity(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BalanceToValidityRequestMsg balanceToValidityRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransInPpsPosResultMsg transInPpsPos(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransInPpsPosRequestMsg transInPpsPosRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountResultMsg exchangeAccount(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountRequestMsg exchangeAccountRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModSubBillCycleTypeResultMsg modSubBillCycleType(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModSubBillCycleTypeRequestMsg modSubBillCycleTypeRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustSubAccountResultMsg adjustSubAccount(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustSubAccountRequestMsg adjustSubAccountRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.SubAccountRechargeResultMsg subAccountRecharge(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.SubAccountRechargeRequestMsg subAccountRechargeRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeBySeqResultMsg voucherRechargeBySeq(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeBySeqRequestMsg voucherRechargeBySeqRequestMsg) throws java.rmi.RemoteException;
    public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BonusValidityResultMsg bonusValidity(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BonusValidityRequestMsg bonusValidityRequestMsg) throws java.rmi.RemoteException;
}
