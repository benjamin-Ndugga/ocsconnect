package com.huawei.www.bme.cbsinterface.cbs.accountmgr;

public class CBSInterfaceAccountMgrProxy implements com.huawei.www.bme.cbsinterface.cbs.accountmgr.CBSInterfaceAccountMgr {
  private String _endpoint = null;
  private com.huawei.www.bme.cbsinterface.cbs.accountmgr.CBSInterfaceAccountMgr cBSInterfaceAccountMgr = null;
  
  public CBSInterfaceAccountMgrProxy() {
    _initCBSInterfaceAccountMgrProxy();
  }
  
  public CBSInterfaceAccountMgrProxy(String endpoint) {
    _endpoint = endpoint;
    _initCBSInterfaceAccountMgrProxy();
  }
  
  private void _initCBSInterfaceAccountMgrProxy() {
    try {
      cBSInterfaceAccountMgr = (new com.huawei.www.bme.cbsinterface.cbs.accountmgr.CBSInterfaceAccountMgrServiceLocator()).getCBSInterfaceAccountMgrServicePort();
      if (cBSInterfaceAccountMgr != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cBSInterfaceAccountMgr)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cBSInterfaceAccountMgr)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cBSInterfaceAccountMgr != null)
      ((javax.xml.rpc.Stub)cBSInterfaceAccountMgr)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgr.CBSInterfaceAccountMgr getCBSInterfaceAccountMgr() {
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr;
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceResultMsg queryBalance(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryBalanceRequestMsg queryBalanceRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.queryBalance(queryBalanceRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeResultMsg voucherRecharge(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeRequestMsg voucherRechargeRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.voucherRecharge(voucherRechargeRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentResultMsg payment(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentRequestMsg paymentRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.payment(paymentRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ActiveFirstResultMsg activeFirst(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ActiveFirstRequestMsg activeFirstRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.activeFirst(activeFirstRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ReversePaymentResultMsg reversePayment(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ReversePaymentRequestMsg reversePaymentRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.reversePayment(reversePaymentRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustAccountResultMsg adjustAccount(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustAccountRequestMsg adjustAccountRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.adjustAccount(adjustAccountRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeEnquiryResultMsg voucherRechargeEnquiry(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeEnquiryRequestMsg voucherRechargeEnquiryRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.voucherRechargeEnquiry(voucherRechargeEnquiryRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransferAccountResultMsg transferAccount(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransferAccountRequestMsg transferAccountRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.transferAccount(transferAccountRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentEnquiryResultMsg paymentEnquiry(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.PaymentEnquiryRequestMsg paymentEnquiryRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.paymentEnquiry(paymentEnquiryRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.CumulateEnquiryResultMsg cumulateEnquiry(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.CumulateEnquiryRequestMsg cumulateEnquiryRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.cumulateEnquiry(cumulateEnquiryRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryBySeqResultMsg voucherEnquiryBySeq(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryBySeqRequestMsg voucherEnquiryBySeqRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.voucherEnquiryBySeq(voucherEnquiryBySeqRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryByPINResultMsg voucherEnquiryByPIN(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherEnquiryByPINRequestMsg voucherEnquiryByPINRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.voucherEnquiryByPIN(voucherEnquiryByPINRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.OneOffDeductionResultMsg oneOffDeduction(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.OneOffDeductionRequestMsg oneOffDeductionRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.oneOffDeduction(oneOffDeductionRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ServiceHandleFeeResultMsg serviceHandleFee(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ServiceHandleFeeRequestMsg serviceHandleFeeRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.serviceHandleFee(serviceHandleFeeRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryTransferLogResultMsg queryTransferLog(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryTransferLogRequestMsg queryTransferLogRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.queryTransferLog(queryTransferLogRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryAdjustmentLogResultMsg queryAdjustmentLog(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.QueryAdjustmentLogRequestMsg queryAdjustmentLogRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.queryAdjustmentLog(queryAdjustmentLogRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModifyVoucherStateResultMsg modifyVoucherState(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModifyVoucherStateRequestMsg modifyVoucherStateRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.modifyVoucherState(modifyVoucherStateRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BalanceToValidityResultMsg balanceToValidity(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BalanceToValidityRequestMsg balanceToValidityRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.balanceToValidity(balanceToValidityRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransInPpsPosResultMsg transInPpsPos(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.TransInPpsPosRequestMsg transInPpsPosRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.transInPpsPos(transInPpsPosRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountResultMsg exchangeAccount(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ExchangeAccountRequestMsg exchangeAccountRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.exchangeAccount(exchangeAccountRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModSubBillCycleTypeResultMsg modSubBillCycleType(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.ModSubBillCycleTypeRequestMsg modSubBillCycleTypeRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.modSubBillCycleType(modSubBillCycleTypeRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustSubAccountResultMsg adjustSubAccount(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.AdjustSubAccountRequestMsg adjustSubAccountRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.adjustSubAccount(adjustSubAccountRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.SubAccountRechargeResultMsg subAccountRecharge(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.SubAccountRechargeRequestMsg subAccountRechargeRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.subAccountRecharge(subAccountRechargeRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeBySeqResultMsg voucherRechargeBySeq(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.VoucherRechargeBySeqRequestMsg voucherRechargeBySeqRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.voucherRechargeBySeq(voucherRechargeBySeqRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BonusValidityResultMsg bonusValidity(com.huawei.www.bme.cbsinterface.cbs.accountmgrmsg.BonusValidityRequestMsg bonusValidityRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceAccountMgr == null)
      _initCBSInterfaceAccountMgrProxy();
    return cBSInterfaceAccountMgr.bonusValidity(bonusValidityRequestMsg);
  }
  
  
}