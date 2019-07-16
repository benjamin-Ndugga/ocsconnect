package com.huawei.www.bme.cbsinterface.bcservices;

public class BcServicesProxy implements com.huawei.www.bme.cbsinterface.bcservices.BcServices_PortType {
  private String _endpoint = null;
  private com.huawei.www.bme.cbsinterface.bcservices.BcServices_PortType bcServices_PortType = null;
  
  public BcServicesProxy() {
    _initBcServicesProxy();
  }
  
  public BcServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initBcServicesProxy();
  }
  
  private void _initBcServicesProxy() {
    try {
      bcServices_PortType = (new com.huawei.www.bme.cbsinterface.bcservices.BcServices_ServiceLocator()).getBcServicesPort();
      if (bcServices_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bcServices_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bcServices_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bcServices_PortType != null)
      ((javax.xml.rpc.Stub)bcServices_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BcServices_PortType getBcServices_PortType() {
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType;
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpResultMsg chkPrefixOp(com.huawei.www.bme.cbsinterface.bcservices.ChkPrefixOpRequestMsg chkPrefixOpRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.chkPrefixOp(chkPrefixOpRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationResultMsg penaltyCalculation(com.huawei.www.bme.cbsinterface.bcservices.PenaltyCalculationRequestMsg penaltyCalculationRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.penaltyCalculation(penaltyCalculationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeScatteredAcctInfoResultMsg batchChangeScatteredAcctInfo(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeScatteredAcctInfoRequestMsg batchChangeScatteredAcctInfoRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchChangeScatteredAcctInfo(batchChangeScatteredAcctInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendResultMsg applyInstallmentExtend(com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentExtendRequestMsg applyInstallmentExtendRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.applyInstallmentExtend(applyInstallmentExtendRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeCustInfoResultMsg batchChangeCustInfo(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeCustInfoRequestMsg batchChangeCustInfoRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchChangeCustInfo(batchChangeCustInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyResultMsg batchChangeOfferingProperty(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeOfferingPropertyRequestMsg batchChangeOfferingPropertyRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchChangeOfferingProperty(batchChangeOfferingPropertyRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ManFphCallerResultMsg manFphCaller(com.huawei.www.bme.cbsinterface.bcservices.ManFphCallerRequestMsg manFphCallerRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.manFphCaller(manFphCallerRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryFphCallerResultMsg queryFphCaller(com.huawei.www.bme.cbsinterface.bcservices.QueryFphCallerRequestMsg queryFphCallerRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryFphCaller(queryFphCallerRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryZoneMappingResultMsg queryZoneMapping(com.huawei.www.bme.cbsinterface.bcservices.QueryZoneMappingRequestMsg queryZoneMappingRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryZoneMapping(queryZoneMappingRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.AuthSubPwdResultMsg authSubPwd(com.huawei.www.bme.cbsinterface.bcservices.AuthSubPwdRequestMsg authSubPwdRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.authSubPwd(authSubPwdRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentResultMsg applyPrepayment(com.huawei.www.bme.cbsinterface.bcservices.ApplyPrepaymentRequestMsg applyPrepaymentRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.applyPrepayment(applyPrepaymentRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentResultMsg applyInstallment(com.huawei.www.bme.cbsinterface.bcservices.ApplyInstallmentRequestMsg applyInstallmentRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.applyInstallment(applyInstallmentRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentResultMsg queryInstallment(com.huawei.www.bme.cbsinterface.bcservices.QueryInstallmentRequestMsg queryInstallmentRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryInstallment(queryInstallmentRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageResultMsg queryAccumulationUsage(com.huawei.www.bme.cbsinterface.bcservices.QueryAccumulationUsageRequestMsg queryAccumulationUsageRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryAccumulationUsage(queryAccumulationUsageRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupResultMsg checkSubscribersGroup(com.huawei.www.bme.cbsinterface.bcservices.CheckSubscribersGroupRequestMsg checkSubscribersGroupRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.checkSubscribersGroup(checkSubscribersGroupRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityResultMsg applyProdFreeValidity(com.huawei.www.bme.cbsinterface.bcservices.ApplyProdFreeValidityRequestMsg applyProdFreeValidityRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.applyProdFreeValidity(applyProdFreeValidityRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageResultMsg queryDataPackageUsage(com.huawei.www.bme.cbsinterface.bcservices.QueryDataPackageUsageRequestMsg queryDataPackageUsageRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryDataPackageUsage(queryDataPackageUsageRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationResultMsg changeRscRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangeRscRelationRequestMsg changeRscRelationRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeRscRelation(changeRscRelationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagResultMsg changeRedFlag(com.huawei.www.bme.cbsinterface.bcservices.ChangeRedFlagRequestMsg changeRedFlagRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeRedFlag(changeRedFlagRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.SynDTUserGroupResultMsg synDTUserGroup(com.huawei.www.bme.cbsinterface.bcservices.SynDTUserGroupRequestMsg synDTUserGroupRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.synDTUserGroup(synDTUserGroupRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryBatchTaskStatusResultMsg queryBatchTaskStatus(com.huawei.www.bme.cbsinterface.bcservices.QueryBatchTaskStatusRequestMsg queryBatchTaskStatusRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryBatchTaskStatus(queryBatchTaskStatusRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryZoneInfoResultMsg queryZoneInfo(com.huawei.www.bme.cbsinterface.bcservices.QueryZoneInfoRequestMsg queryZoneInfoRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryZoneInfo(queryZoneInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoResultMsg queryLoanOffering(com.huawei.www.bme.cbsinterface.bcservices.QueryLoanOfferingInfoRequestMsg queryLoanOfferingInfoRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryLoanOffering(queryLoanOfferingInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationResultMsg queryPaymentRelation(com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentRelationRequestMsg queryPaymentRelationRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryPaymentRelation(queryPaymentRelationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyResultMsg queryOfferingInstProperty(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingInstPropertyRequestMsg queryOfferingInstPropertyRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryOfferingInstProperty(queryOfferingInstPropertyRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListResultMsg queryGroupMemberList(com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemberListRequestMsg queryGroupMemberListRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryGroupMemberList(queryGroupMemberListRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberResultMsg queryGroupListBySubscriber(com.huawei.www.bme.cbsinterface.bcservices.QueryGroupListBySubscriberRequestMsg queryGroupListBySubscriberRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryGroupListBySubscriber(queryGroupListBySubscriberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoResultMsg queryCustomerInfo(com.huawei.www.bme.cbsinterface.bcservices.QueryCustomerInfoRequestMsg queryCustomerInfoRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryCustomerInfo(queryCustomerInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipResultMsg changeAcctOwnership(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctOwnershipRequestMsg changeAcctOwnershipRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeAcctOwnership(changeAcctOwnershipRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipResultMsg changeSubOwnership(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOwnershipRequestMsg changeSubOwnershipRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeSubOwnership(changeSubOwnershipRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressResultMsg changeCustNoticeSuppress(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustNoticeSuppressRequestMsg changeCustNoticeSuppressRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeCustNoticeSuppress(changeCustNoticeSuppressRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.CleanUpCustDataResultMsg cleanUpCustData(com.huawei.www.bme.cbsinterface.bcservices.CleanUpCustDataRequestMsg cleanUpCustDataRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.cleanUpCustData(cleanUpCustDataRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionResultMsg feeDeduction(com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRequestMsg feeDeductionRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.feeDeduction(feeDeductionRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackResultMsg feeDeductionRollBack(com.huawei.www.bme.cbsinterface.bcservices.FeeDeductionRollBackRequestMsg feeDeductionRollBackRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.feeDeductionRollBack(feeDeductionRollBackRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitResultMsg changeConsumptionLimit(com.huawei.www.bme.cbsinterface.bcservices.ChangeConsumptionLimitRequestMsg changeConsumptionLimitRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeConsumptionLimit(changeConsumptionLimitRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.CustDeactivationResultMsg custDeactivation(com.huawei.www.bme.cbsinterface.bcservices.CustDeactivationRequestMsg custDeactivationRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.custDeactivation(custDeactivationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.AcctDeactivationResultMsg acctDeactivation(com.huawei.www.bme.cbsinterface.bcservices.AcctDeactivationRequestMsg acctDeactivationRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.acctDeactivation(acctDeactivationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionResultMsg changeTaxExemption(com.huawei.www.bme.cbsinterface.bcservices.ChangeTaxExemptionRequestMsg changeTaxExemptionRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeTaxExemption(changeTaxExemptionRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.DelStatementResultMsg delStatement(com.huawei.www.bme.cbsinterface.bcservices.DelStatementRequestMsg delStatementRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.delStatement(delStatementRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementResultMsg modifyStatement(com.huawei.www.bme.cbsinterface.bcservices.ModifyStatementRequestMsg modifyStatementRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.modifyStatement(modifyStatementRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.AddStatementResultMsg addStatement(com.huawei.www.bme.cbsinterface.bcservices.AddStatementRequestMsg addStatementRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.addStatement(addStatementRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberShortNoResultMsg batchChangeMemberShortNo(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberShortNoRequestMsg batchChangeMemberShortNoRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchChangeMemberShortNo(batchChangeMemberShortNoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchSubDeactivationResultMsg batchSubDeactivation(com.huawei.www.bme.cbsinterface.bcservices.BatchSubDeactivationRequestMsg batchSubDeactivationRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchSubDeactivation(batchSubDeactivationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberStatusResultMsg batchChangeMemberStatus(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeMemberStatusRequestMsg batchChangeMemberStatusRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchChangeMemberStatus(batchChangeMemberStatusRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchDelGroupMemberResultMsg batchDelGroupMember(com.huawei.www.bme.cbsinterface.bcservices.BatchDelGroupMemberRequestMsg batchDelGroupMemberRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchDelGroupMember(batchDelGroupMemberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubBasicInfoResultMsg batchChangeSubBasicInfo(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubBasicInfoRequestMsg batchChangeSubBasicInfoRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchChangeSubBasicInfo(batchChangeSubBasicInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubValidityResultMsg batchChangeSubValidity(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubValidityRequestMsg batchChangeSubValidityRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchChangeSubValidity(batchChangeSubValidityRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberResultMsg batchAddGroupMember(com.huawei.www.bme.cbsinterface.bcservices.BatchAddGroupMemberRequestMsg batchAddGroupMemberRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchAddGroupMember(batchAddGroupMemberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberResultMsg batchSwitchGroupMember(com.huawei.www.bme.cbsinterface.bcservices.BatchSwitchGroupMemberRequestMsg batchSwitchGroupMemberRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchSwitchGroupMember(batchSwitchGroupMemberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubInitBalanceResultMsg batchChangeSubInitBalance(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubInitBalanceRequestMsg batchChangeSubInitBalanceRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchChangeSubInitBalance(batchChangeSubInitBalanceRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingResultMsg batchChangeSubOffering(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubOfferingRequestMsg batchChangeSubOfferingRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchChangeSubOffering(batchChangeSubOfferingRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberShortNoResultMsg changeMemberShortNo(com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberShortNoRequestMsg changeMemberShortNoRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeMemberShortNo(changeMemberShortNoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberStatusResultMsg changeMemberStatus(com.huawei.www.bme.cbsinterface.bcservices.ChangeMemberStatusRequestMsg changeMemberStatusRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeMemberStatus(changeMemberStatusRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberInfoResultMsg changeGroupMemberInfo(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberInfoRequestMsg changeGroupMemberInfoRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeGroupMemberInfo(changeGroupMemberInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupStatusResultMsg changeGroupStatus(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupStatusRequestMsg changeGroupStatusRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeGroupStatus(changeGroupStatusRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.GroupDeactivationResultMsg groupDeactivation(com.huawei.www.bme.cbsinterface.bcservices.GroupDeactivationRequestMsg groupDeactivationRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.groupDeactivation(groupDeactivationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingResultMsg changeGroupOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOfferingRequestMsg changeGroupOfferingRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeGroupOffering(changeGroupOfferingRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingResultMsg changeGroupMemberOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemberOfferingRequestMsg changeGroupMemberOfferingRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeGroupMemberOffering(changeGroupMemberOfferingRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupBasicInfoResultMsg changeGroupBasicInfo(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupBasicInfoRequestMsg changeGroupBasicInfoRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeGroupBasicInfo(changeGroupBasicInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberResultMsg delGroupMember(com.huawei.www.bme.cbsinterface.bcservices.DelGroupMemberRequestMsg delGroupMemberRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.delGroupMember(delGroupMemberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberResultMsg addGroupMember(com.huawei.www.bme.cbsinterface.bcservices.AddGroupMemberRequestMsg addGroupMemberRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.addGroupMember(addGroupMemberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.CreateGroupResultMsg createGroup(com.huawei.www.bme.cbsinterface.bcservices.CreateGroupRequestMsg createGroupRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.createGroup(createGroupRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctResultMsg changeSubDFTAcct(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubDFTAcctRequestMsg changeSubDFTAcctRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeSubDFTAcct(changeSubDFTAcctRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpDFTAcctResultMsg changeSubGrpDFTAcct(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpDFTAcctRequestMsg changeSubGrpDFTAcctRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeSubGrpDFTAcct(changeSubGrpDFTAcctRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctResultMsg changeCustDFTAcct(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustDFTAcctRequestMsg changeCustDFTAcctRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeCustDFTAcct(changeCustDFTAcctRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileResultMsg supplementProfile(com.huawei.www.bme.cbsinterface.bcservices.SupplementProfileRequestMsg supplementProfileRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.supplementProfile(supplementProfileRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubInfoResultMsg changeSubInfo(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubInfoRequestMsg changeSubInfoRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeSubInfo(changeSubInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustInfoResultMsg changeCustInfo(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustInfoRequestMsg changeCustInfoRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeCustInfo(changeCustInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoResultMsg changeAcctInfo(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctInfoRequestMsg changeAcctInfoRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeAcctInfo(changeAcctInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationResultMsg changePayRelation(com.huawei.www.bme.cbsinterface.bcservices.ChangePayRelationRequestMsg changePayRelationRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changePayRelation(changePayRelationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleResultMsg changeAcctBillCycle(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctBillCycleRequestMsg changeAcctBillCycleRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeAcctBillCycle(changeAcctBillCycleRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberResultMsg createSubscriber(com.huawei.www.bme.cbsinterface.bcservices.CreateSubscriberRequestMsg createSubscriberRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.createSubscriber(createSubscriberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerResultMsg createCustomer(com.huawei.www.bme.cbsinterface.bcservices.CreateCustomerRequestMsg createCustomerRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.createCustomer(createCustomerRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.CreateAccountResultMsg createAccount(com.huawei.www.bme.cbsinterface.bcservices.CreateAccountRequestMsg createAccountRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.createAccount(createAccountRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.SubActivationResultMsg subActivation(com.huawei.www.bme.cbsinterface.bcservices.SubActivationRequestMsg subActivationRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.subActivation(subActivationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubStatusResultMsg changeSubStatus(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubStatusRequestMsg changeSubStatusRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeSubStatus(changeSubStatusRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdResultMsg changeSubPwd(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPwdRequestMsg changeSubPwdRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeSubPwd(changeSubPwdRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpPwdResultMsg changeSubGrpPwd(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubGrpPwdRequestMsg changeSubGrpPwdRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeSubGrpPwd(changeSubGrpPwdRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationResultMsg subDeactivation(com.huawei.www.bme.cbsinterface.bcservices.SubDeactivationRequestMsg changeSubGrpPwdRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.subDeactivation(changeSubGrpPwdRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.CancelPreDeactivationResultMsg cancelPreDeactivation(com.huawei.www.bme.cbsinterface.bcservices.CancelPreDeactivationRequestMsg cancelPreDeactivationRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.cancelPreDeactivation(cancelPreDeactivationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingResultMsg changeSubOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubOfferingRequestMsg changeSubOfferingRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeSubOffering(changeSubOfferingRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubValidityResultMsg changeSubValidity(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubValidityRequestMsg changeSubValidityRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeSubValidity(changeSubValidityRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeResultMsg changeSubPaymentMode(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubPaymentModeRequestMsg changeSubPaymentModeRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeSubPaymentMode(changeSubPaymentModeRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ActivateOfferingResultMsg activateOffering(com.huawei.www.bme.cbsinterface.bcservices.ActivateOfferingRequestMsg activateOfferingRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.activateOffering(activateOfferingRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusResultMsg changeOfferingStatus(com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingStatusRequestMsg changeOfferingStatusRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeOfferingStatus(changeOfferingStatusRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusResultMsg changeProductStatus(com.huawei.www.bme.cbsinterface.bcservices.ChangeProductStatusRequestMsg changeProductStatusRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeProductStatus(changeProductStatusRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitResultMsg changeAcctCreditLimit(com.huawei.www.bme.cbsinterface.bcservices.ChangeAcctCreditLimitRequestMsg changeAcctCreditLimitRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeAcctCreditLimit(changeAcctCreditLimitRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeRechageBlacklistResultMsg changeRechageBlacklist(com.huawei.www.bme.cbsinterface.bcservices.ChangeRechageBlacklistRequestMsg changeRechageBlacklistRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeRechageBlacklist(changeRechageBlacklistRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyResultMsg changeOfferingProperty(com.huawei.www.bme.cbsinterface.bcservices.ChangeOfferingPropertyRequestMsg changeOfferingPropertyRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeOfferingProperty(changeOfferingPropertyRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingResultMsg changeAccountOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeAccountOfferingRequestMsg changeAccountOfferingRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeAccountOffering(changeAccountOfferingRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingResultMsg changeCustOffering(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustOfferingRequestMsg changeCustOfferingRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeCustOffering(changeCustOfferingRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityResultMsg changeSubIdentity(com.huawei.www.bme.cbsinterface.bcservices.ChangeSubIdentityRequestMsg changeSubIdentityRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeSubIdentity(changeSubIdentityRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubStatusResultMsg batchChangeSubStatus(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubStatusRequestMsg batchChangeSubStatusRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchChangeSubStatus(batchChangeSubStatusRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationResultMsg batchSubActivation(com.huawei.www.bme.cbsinterface.bcservices.BatchSubActivationRequestMsg batchSubActivationRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchSubActivation(batchSubActivationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberResultMsg batchCreateSubscriber(com.huawei.www.bme.cbsinterface.bcservices.BatchCreateSubscriberRequestMsg batchCreateSubscriberRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchCreateSubscriber(batchCreateSubscriberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubActiveLimitDateResultMsg batchChangeSubActiveLimitDate(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeSubActiveLimitDateRequestMsg batchChangeSubActiveLimitDateRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchChangeSubActiveLimitDate(batchChangeSubActiveLimitDateRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleResultMsg querySubLifeCycle(com.huawei.www.bme.cbsinterface.bcservices.QuerySubLifeCycleRequestMsg querySubLifeCycleRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.querySubLifeCycle(querySubLifeCycleRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleResultMsg queryOfferingRentCycle(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentCycleRequestMsg queryOfferingRentCycleRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryOfferingRentCycle(queryOfferingRentCycleRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationResultMsg feeQuotation(com.huawei.www.bme.cbsinterface.bcservices.FeeQuotationRequestMsg feeQuotationRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.feeQuotation(feeQuotationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitResultMsg queryConsumptionLimitUsage(com.huawei.www.bme.cbsinterface.bcservices.QueryConsumptionLimitRequestMsg queryConsumptionLimitRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryConsumptionLimitUsage(queryConsumptionLimitRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageResultMsg queryPaymentLimitUsage(com.huawei.www.bme.cbsinterface.bcservices.QueryPaymentLimitUsageRequestMsg queryPaymentLimitUsageRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryPaymentLimitUsage(queryPaymentLimitUsageRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.SynDTDiscountResultMsg synDTDiscount(com.huawei.www.bme.cbsinterface.bcservices.SynDTDiscountRequestMsg synDTDiscountRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.synDTDiscount(synDTDiscountRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeInitCreditLimitResultMsg batchChangeInitCreditLimit(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeInitCreditLimitRequestMsg batchChangeInitCreditLimitRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchChangeInitCreditLimit(batchChangeInitCreditLimitRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyResultMsg changeCustHierachy(com.huawei.www.bme.cbsinterface.bcservices.ChangeCustHierachyRequestMsg changeCustHierachyRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeCustHierachy(changeCustHierachyRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingResultMsg batchChangeAcctOffering(com.huawei.www.bme.cbsinterface.bcservices.BatchChangeAcctOfferingRequestMsg batchChangeAcctOfferingRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchChangeAcctOffering(batchChangeAcctOfferingRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemOffNetNumberResultMsg queryGroupMemOffNetNumber(com.huawei.www.bme.cbsinterface.bcservices.QueryGroupMemOffNetNumberRequestMsg queryGroupMemOffNetNumberRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryGroupMemOffNetNumber(queryGroupMemOffNetNumberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryGroupOffNetNumberResultMsg queryGroupOffNetNumber(com.huawei.www.bme.cbsinterface.bcservices.QueryGroupOffNetNumberRequestMsg queryGroupOffNetNumberRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryGroupOffNetNumber(queryGroupOffNetNumberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberResultMsg changeGroupMemOffNetNumber(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupMemOffNetNumberRequestMsg changeGroupMemOffNetNumberRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeGroupMemOffNetNumber(changeGroupMemOffNetNumberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOffNetNumberResultMsg changeGroupOffNetNumber(com.huawei.www.bme.cbsinterface.bcservices.ChangeGroupOffNetNumberRequestMsg changeGroupOffNetNumberRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.changeGroupOffNetNumber(changeGroupOffNetNumberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryRebateResultMsg queryRebate(com.huawei.www.bme.cbsinterface.bcservices.QueryRebateRequestMsg queryRebateRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryRebate(queryRebateRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityResultMsg manAppendSubIdentity(com.huawei.www.bme.cbsinterface.bcservices.ManAppendSubIdentityRequestMsg manAppendSubIdentityRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.manAppendSubIdentity(manAppendSubIdentityRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryAppendSubIdentityResultMsg queryAppendSubIdentity(com.huawei.www.bme.cbsinterface.bcservices.QueryAppendSubIdentityRequestMsg manAppendSubIdentityRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryAppendSubIdentity(manAppendSubIdentityRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.GroupDelMemberResultMsg groupDelMember(com.huawei.www.bme.cbsinterface.bcservices.GroupDelMemberRequestMsg groupDelMemberRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.groupDelMember(groupDelMemberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ManCrossGroupResultMsg manCrossGroup(com.huawei.www.bme.cbsinterface.bcservices.ManCrossGroupRequestMsg manCrossGroupRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.manCrossGroup(manCrossGroupRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupResultMsg createSuperGroup(com.huawei.www.bme.cbsinterface.bcservices.CreateSuperGroupRequestMsg createSuperGroupRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.createSuperGroup(createSuperGroupRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupResultMsg joinSuperGroup(com.huawei.www.bme.cbsinterface.bcservices.JoinSuperGroupRequestMsg joinSuperGroupRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.joinSuperGroup(joinSuperGroupRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupResultMsg deleteSuperGroup(com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupRequestMsg deleteSuperGroupRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.deleteSuperGroup(deleteSuperGroupRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberResultMsg deleteSuperGroupMember(com.huawei.www.bme.cbsinterface.bcservices.DeleteSuperGroupMemberRequestMsg deleteSuperGroupMemberRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.deleteSuperGroupMember(deleteSuperGroupMemberRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QuerySubInforToMicroResultMsg querySubInforToMicro(com.huawei.www.bme.cbsinterface.bcservices.QuerySubInforToMicroRequestMsg querySubInforToMicroRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.querySubInforToMicro(querySubInforToMicroRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeResultMsg querySubInfoExToCube(com.huawei.www.bme.cbsinterface.bcservices.QuerySubInfoExToCubeRequestMsg querySubInfoExToCubeRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.querySubInfoExToCube(querySubInfoExToCubeRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroResultMsg queryExpireSubToMicro(com.huawei.www.bme.cbsinterface.bcservices.QueryExpireSubToMicroRequestMsg queryExpireSubToMicroRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryExpireSubToMicro(queryExpireSubToMicroRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeResultMsg queryOfferingRentFailedFee(com.huawei.www.bme.cbsinterface.bcservices.QueryOfferingRentFailedFeeRequestMsg queryOfferingRentFailedFeeRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryOfferingRentFailedFee(queryOfferingRentFailedFeeRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationResultMsg batchChangePayRelation(com.huawei.www.bme.cbsinterface.bcservices.BatchChangePayRelationRequestMsg batchChangePayRelationRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchChangePayRelation(batchChangePayRelationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchScatteredSubActivationResultMsg batchScatteredSubActivation(com.huawei.www.bme.cbsinterface.bcservices.BatchScatteredSubActivationRequestMsg batchScatteredSubActivationRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchScatteredSubActivation(batchScatteredSubActivationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ManageCallHuntingResultMsg manageCallHunting(com.huawei.www.bme.cbsinterface.bcservices.ManageCallHuntingRequestMsg manageCallHuntingRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.manageCallHunting(manageCallHuntingRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryCallHuntingResponseMsg queryCallHunting(com.huawei.www.bme.cbsinterface.bcservices.QueryCallHuntingRequestMsg queryCallHuntingRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryCallHunting(queryCallHuntingRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoResultMsg manageGrpCallScreenNo(com.huawei.www.bme.cbsinterface.bcservices.ManageGrpCallScreenNoRequestMsg manageGrpCallScreenNoRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.manageGrpCallScreenNo(manageGrpCallScreenNoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoResultMsg queryGrpCallScreenNo(com.huawei.www.bme.cbsinterface.bcservices.QueryGrpCallScreenNoRequestMsg queryGrpCallScreenNoRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.queryGrpCallScreenNo(queryGrpCallScreenNoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentResultMsg batchAdjustment(com.huawei.www.bme.cbsinterface.bcservices.BatchAdjustmentRequestMsg batchAdjustmentRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchAdjustment(batchAdjustmentRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bcservices.BatchSupplementCustInfoResultMsg batchSupplementCustInfo(com.huawei.www.bme.cbsinterface.bcservices.BatchSupplementCustInfoRequestMsg batchSupplementCustInfoRequestMsg) throws java.rmi.RemoteException{
    if (bcServices_PortType == null)
      _initBcServicesProxy();
    return bcServices_PortType.batchSupplementCustInfo(batchSupplementCustInfoRequestMsg);
  }
  
  
}