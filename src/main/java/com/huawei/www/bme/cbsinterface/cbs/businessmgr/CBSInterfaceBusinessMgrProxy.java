package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class CBSInterfaceBusinessMgrProxy implements com.huawei.www.bme.cbsinterface.cbs.businessmgr.CBSInterfaceBusinessMgr {
  private String _endpoint = null;
  private com.huawei.www.bme.cbsinterface.cbs.businessmgr.CBSInterfaceBusinessMgr cBSInterfaceBusinessMgr = null;
  
  public CBSInterfaceBusinessMgrProxy() {
    _initCBSInterfaceBusinessMgrProxy();
  }
  
  public CBSInterfaceBusinessMgrProxy(String endpoint) {
    _endpoint = endpoint;
    _initCBSInterfaceBusinessMgrProxy();
  }
  
  private void _initCBSInterfaceBusinessMgrProxy() {
    try {
      cBSInterfaceBusinessMgr = (new com.huawei.www.bme.cbsinterface.cbs.businessmgr.CBSInterfaceBusinessMgrServiceLocator()).getCBSInterfaceBusinessMgrServicePort();
      if (cBSInterfaceBusinessMgr != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cBSInterfaceBusinessMgr)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cBSInterfaceBusinessMgr)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cBSInterfaceBusinessMgr != null)
      ((javax.xml.rpc.Stub)cBSInterfaceBusinessMgr)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgr.CBSInterfaceBusinessMgr getCBSInterfaceBusinessMgr() {
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr;
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryBasicInfoResultMsg queryBasicInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryBasicInfoRequestMsg queryBasicInfoRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.queryBasicInfo(queryBasicInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPaymentPlanResultMsg queryPaymentPlan(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPaymentPlanRequestMsg queryPaymentPlanRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.queryPaymentPlan(queryPaymentPlanRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckPasswordResultMsg checkPassword(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckPasswordRequestMsg checkPasswordRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.checkPassword(checkPasswordRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberResultMsg newSubscriber(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberRequestMsg newSubscriberRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.newSubscriber(newSubscriberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReNewSubscriberResultMsg reNewSubscriber(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReNewSubscriberRequestMsg reNewSubscriberRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.reNewSubscriber(reNewSubscriberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberResultMsg deleteSubscriber(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberRequestMsg deleteSubscriberRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.deleteSubscriber(deleteSubscriberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMainProdResultMsg changeMainProd(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMainProdRequestMsg changeMainProdRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.changeMainProd(changeMainProdRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SubscribeAppendantProductResultMsg subscribeAppendantProduct(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SubscribeAppendantProductRequestMsg subscribeAppendantProductRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.subscribeAppendantProduct(subscribeAppendantProductRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAppendantProductResultMsg changeAppendantProduct(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAppendantProductRequestMsg changeAppendantProductRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.changeAppendantProduct(changeAppendantProductRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductResultMsg unSubscribeAppendantProduct(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductRequestMsg unSubscribeAppendantProductRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.unSubscribeAppendantProduct(unSubscribeAppendantProductRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCustBasicInforResultMsg changeCustBasicInfor(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCustBasicInforRequestMsg changeCustBasicInforRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.changeCustBasicInfor(changeCustBasicInforRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubscriberBasicInforResultMsg changeSubscriberBasicInfor(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubscriberBasicInforRequestMsg changeSubscriberBasicInforRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.changeSubscriberBasicInfor(changeSubscriberBasicInforRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAccountBasicInforResultMsg changeAccountBasicInfor(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeAccountBasicInforRequestMsg changeAccountBasicInforRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.changeAccountBasicInfor(changeAccountBasicInforRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePasswordResultMsg changePassword(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePasswordRequestMsg changePasswordRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.changePassword(changePasswordRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ResetPasswordResultMsg resetPassword(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ResetPasswordRequestMsg resetPasswordRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.resetPassword(resetPasswordRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMSISDNResultMsg changeMSISDN(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeMSISDNRequestMsg changeMSISDNRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.changeMSISDN(changeMSISDNRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSIMResultMsg changeSIM(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSIMRequestMsg changeSIMRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.changeSIM(changeSIMRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SyncDDSResultMsg syncDDS(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SyncDDSRequestMsg syncDDSRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.syncDDS(syncDDSRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeServicesResultMsg changeServices(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeServicesRequestMsg changeServicesRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.changeServices(changeServicesRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteRechageBlackResultMsg deleteRechageBlack(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteRechageBlackRequestMsg deleteRechageBlackRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.deleteRechageBlack(deleteRechageBlackRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SuspendResultMsg suspend(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SuspendRequestMsg suspendRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.suspend(suspendRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReconnectResultMsg reconnect(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ReconnectRequestMsg reconnectRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.reconnect(reconnectRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ClaimMissingResultMsg claimMissing(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ClaimMissingRequestMsg claimMissingRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.claimMissing(claimMissingRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DisclaimMissingResultMsg disclaimMissing(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DisclaimMissingRequestMsg disclaimMissingRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.disclaimMissing(disclaimMissingRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BatchOperationResultMsg batchOperation(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BatchOperationRequestMsg batchOperationRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.batchOperation(batchOperationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeOwnerResultMsg changeOwner(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeOwnerRequestMsg changeOwnerRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.changeOwner(changeOwnerRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryUserGroupResultMsg queryUserGroup(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryUserGroupRequestMsg queryUserGroupRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.queryUserGroup(queryUserGroupRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManGroupMemberResultMsg manGroupMember(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManGroupMemberRequestMsg manGroupMemberRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.manGroupMember(manGroupMemberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscribedGroupResultMsg querySubscribedGroup(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscribedGroupRequestMsg querySubscribedGroupRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.querySubscribedGroup(querySubscribedGroupRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberValidityResultMsg modifySubscriberValidity(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberValidityRequestMsg modifySubscriberValidityRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.modifySubscriberValidity(modifySubscriberValidityRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.IntegrationEnquiryResultMsg integrationEnquiry(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.IntegrationEnquiryRequestMsg integrationEnquiryRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.integrationEnquiry(integrationEnquiryRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberProductInfoResultMsg querySubscriberProductInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberProductInfoRequestMsg querySubscriberProductInfoRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.querySubscriberProductInfo(querySubscriberProductInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberServiceInfoResultMsg querySubscriberServiceInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubscriberServiceInfoRequestMsg querySubscriberServiceInfoRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.querySubscriberServiceInfo(querySubscriberServiceInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberStateResultMsg modifySubscriberState(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberStateRequestMsg modifySubscriberStateRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.modifySubscriberState(modifySubscriberStateRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberEmoticonResultMsg modifySubscriberEmoticon(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifySubscriberEmoticonRequestMsg modifySubscriberEmoticonRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.modifySubscriberEmoticon(modifySubscriberEmoticonRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubCallScreenNoResultMsg manSubCallScreenNo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubCallScreenNoRequestMsg manSubCallScreenNoRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.manSubCallScreenNo(manSubCallScreenNoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubFamilyNoResultMsg manSubFamilyNo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubFamilyNoRequestMsg manSubFamilyNoRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.manSubFamilyNo(manSubFamilyNoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubLowBalPrtResultMsg changeSubLowBalPrt(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeSubLowBalPrtRequestMsg changeSubLowBalPrtRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.changeSubLowBalPrt(changeSubLowBalPrtRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubLowBalPrtResultMsg querySubLowBalPrt(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubLowBalPrtRequestMsg querySubLowBalPrtRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.querySubLowBalPrt(querySubLowBalPrtRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubHomeZoneResultMsg manSubHomeZone(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManSubHomeZoneRequestMsg manSubHomeZoneRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.manSubHomeZone(manSubHomeZoneRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyPosUserStateResultMsg modifyPosUserState(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyPosUserStateRequestMsg modifyPosUserStateRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.modifyPosUserState(modifyPosUserStateRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryAdjustValidityLogResultMsg queryAdjustValidityLog(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryAdjustValidityLogRequestMsg queryAdjustValidityLogRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.queryAdjustValidityLog(queryAdjustValidityLogRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubFamilyNoResultMsg querySubFamilyNo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubFamilyNoRequestMsg querySubFamilyNoRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.querySubFamilyNo(querySubFamilyNoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubHomeZoneResultMsg querySubHomeZone(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubHomeZoneRequestMsg querySubHomeZoneRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.querySubHomeZone(querySubHomeZoneRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubCallScreenNoResultMsg querySubCallScreenNo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubCallScreenNoRequestMsg querySubCallScreenNoRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.querySubCallScreenNo(querySubCallScreenNoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryGroupMemberResultMsg queryGroupMember(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryGroupMemberRequestMsg queryGroupMemberRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.queryGroupMember(queryGroupMemberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubChangeLogResultMsg querySubChangeLog(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QuerySubChangeLogRequestMsg querySubChangeLogRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.querySubChangeLog(querySubChangeLogRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManParentChildResultMsg manParentChild(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManParentChildRequestMsg manParentChildRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.manParentChild(manParentChildRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryChildLimitResultMsg queryChildLimit(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryChildLimitRequestMsg queryChildLimitRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.queryChildLimit(queryChildLimitRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyCFNoResultMsg modifyCFNo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ModifyCFNoRequestMsg modifyCFNoRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.modifyCFNo(modifyCFNoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BlockSubscriberResultMsg blockSubscriber(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BlockSubscriberRequestMsg blockSubscriberRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.blockSubscriber(blockSubscriberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberExtResultMsg newSubscriberExt(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.NewSubscriberExtRequestMsg newSubscriberExtRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.newSubscriberExt(newSubscriberExtRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BindProductSubscriberNoResultMsg bindProductSubscriberNo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.BindProductSubscriberNoRequestMsg bindProductSubscriberNoRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.bindProductSubscriberNo(bindProductSubscriberNoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberExtResultMsg deleteSubscriberExt(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.DeleteSubscriberExtRequestMsg deleteSubscriberExtRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.deleteSubscriberExt(deleteSubscriberExtRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductExtResultMsg unSubscribeAppendantProductExt(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.UnSubscribeAppendantProductExtRequestMsg unSubscribeAppendantProductExtRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.unSubscribeAppendantProductExt(unSubscribeAppendantProductExtRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryDefinedZonesInfoResultMsg queryDefinedZonesInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryDefinedZonesInfoRequestMsg queryDefinedZonesInfoRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.queryDefinedZonesInfo(queryDefinedZonesInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckOperatorPasswordResultMsg checkOperatorPassword(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.CheckOperatorPasswordRequestMsg checkOperatorPasswordRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.checkOperatorPassword(checkOperatorPasswordRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCreditLevelResultMsg changeCreditLevel(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangeCreditLevelRequestMsg changeCreditLevelRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.changeCreditLevel(changeCreditLevelRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageLoanSMSResultMsg manageLoanSMS(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageLoanSMSRequestMsg manageLoanSMSRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.manageLoanSMS(manageLoanSMSRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryLoanSMSResultMsg queryLoanSMS(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryLoanSMSRequestMsg queryLoanSMSRequest) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.queryLoanSMS(queryLoanSMSRequest);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ExtendMSFValidityResultMsg extendMSFValidity(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ExtendMSFValidityRequestMsg extendMSFValidityRequest) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.extendMSFValidity(extendMSFValidityRequest);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryInterActLogResultMsg queryInterActLog(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryInterActLogRequestMsg queryInterActLogRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.queryInterActLog(queryInterActLogRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePaymentPlanResultMsg changePaymentPlan(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ChangePaymentPlanRequestMsg changePaymentPlanRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.changePaymentPlan(changePaymentPlanRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManPairNumberResultMsg manPairNumber(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManPairNumberRequestMsg manPairNumberRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.manPairNumber(manPairNumberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPairNumberResultMsg queryPairNumber(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryPairNumberRequestMsg queryPairNumberRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.queryPairNumber(queryPairNumberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManCUGInfoResultMsg manCUGInfo(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManCUGInfoRequestMsg manCUGInfoRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.manCUGInfo(manCUGInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryCUGMembersResultMsg queryCUGMembers(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.QueryCUGMembersRequestMsg queryCUGMembersRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.queryCUGMembers(queryCUGMembersRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageMemberOfGroupCugResultMsg manageMemberOfGroupCug(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.ManageMemberOfGroupCugRequestMsg manageMemberOfGroupCugRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.manageMemberOfGroupCug(manageMemberOfGroupCugRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SetDTNotificationResultMsg setDTNotification(com.huawei.www.bme.cbsinterface.cbs.businessmgrmsg.SetDTNotificationRequestMsg setDTNotificationRequestMsg) throws java.rmi.RemoteException{
    if (cBSInterfaceBusinessMgr == null)
      _initCBSInterfaceBusinessMgrProxy();
    return cBSInterfaceBusinessMgr.setDTNotification(setDTNotificationRequestMsg);
  }
  
  
}