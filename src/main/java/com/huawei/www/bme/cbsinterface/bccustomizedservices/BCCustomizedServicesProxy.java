package com.huawei.www.bme.cbsinterface.bccustomizedservices;

public class BCCustomizedServicesProxy implements com.huawei.www.bme.cbsinterface.bccustomizedservices.BCCustomizedServices_PortType {
  private String _endpoint = null;
  private com.huawei.www.bme.cbsinterface.bccustomizedservices.BCCustomizedServices_PortType bCCustomizedServices_PortType = null;
  
  public BCCustomizedServicesProxy() {
    _initBCCustomizedServicesProxy();
  }
  
  public BCCustomizedServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initBCCustomizedServicesProxy();
  }
  
  private void _initBCCustomizedServicesProxy() {
    try {
      bCCustomizedServices_PortType = (new com.huawei.www.bme.cbsinterface.bccustomizedservices.BCCustomizedServices_ServiceLocator()).getBCCustomizedServicesPort();
      if (bCCustomizedServices_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bCCustomizedServices_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bCCustomizedServices_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bCCustomizedServices_PortType != null)
      ((javax.xml.rpc.Stub)bCCustomizedServices_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.huawei.www.bme.cbsinterface.bccustomizedservices.BCCustomizedServices_PortType getBCCustomizedServices_PortType() {
    if (bCCustomizedServices_PortType == null)
      _initBCCustomizedServicesProxy();
    return bCCustomizedServices_PortType;
  }
  
  public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeSubIdentityResultMsg batchChangeSubIdentity(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeSubIdentityRequestMsg batchChangeSubIdentityRequestMsg) throws java.rmi.RemoteException{
    if (bCCustomizedServices_PortType == null)
      _initBCCustomizedServicesProxy();
    return bCCustomizedServices_PortType.batchChangeSubIdentity(batchChangeSubIdentityRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchSupplementScatteredProfileResultMsg batchSupplementScatteredProfile(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchSupplementScatteredProfileRequestMsg batchSupplementScatteredProfileRequestMsg) throws java.rmi.RemoteException{
    if (bCCustomizedServices_PortType == null)
      _initBCCustomizedServicesProxy();
    return bCCustomizedServices_PortType.batchSupplementScatteredProfile(batchSupplementScatteredProfileRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchCancelPreDeactivationResultMsg batchCancelPreDeactivation(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchCancelPreDeactivationRequestMsg batchCancelPreDeactivationRequestMsg) throws java.rmi.RemoteException{
    if (bCCustomizedServices_PortType == null)
      _initBCCustomizedServicesProxy();
    return bCCustomizedServices_PortType.batchCancelPreDeactivation(batchCancelPreDeactivationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctBillCycleResultMsg batchChangeAcctBillCycle(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctBillCycleRequestMsg batchChangeAcctBillCycleRequestMsg) throws java.rmi.RemoteException{
    if (bCCustomizedServices_PortType == null)
      _initBCCustomizedServicesProxy();
    return bCCustomizedServices_PortType.batchChangeAcctBillCycle(batchChangeAcctBillCycleRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyResultMsg batchChangeOfferingProperty(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeOfferingPropertyRequestMsg batchChangeOfferingPropertyRequestMsg) throws java.rmi.RemoteException{
    if (bCCustomizedServices_PortType == null)
      _initBCCustomizedServicesProxy();
    return bCCustomizedServices_PortType.batchChangeOfferingProperty(batchChangeOfferingPropertyRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeScatteredSubOwnershipResultMsg batchChangeScatteredSubOwnership(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeScatteredSubOwnershipRequestMsg batchChangeScatteredSubOwnershipRequestMsg) throws java.rmi.RemoteException{
    if (bCCustomizedServices_PortType == null)
      _initBCCustomizedServicesProxy();
    return bCCustomizedServices_PortType.batchChangeScatteredSubOwnership(batchChangeScatteredSubOwnershipRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bccustomizedservices.ManCrossGroupResultMsg manCrossGroup(com.huawei.www.bme.cbsinterface.bccustomizedservices.ManCrossGroupRequestMsg manCrossGroupRequestMsg) throws java.rmi.RemoteException{
    if (bCCustomizedServices_PortType == null)
      _initBCCustomizedServicesProxy();
    return bCCustomizedServices_PortType.manCrossGroup(manCrossGroupRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctInfoResultMsg batchChangeAcctInfo(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchChangeAcctInfoRequestMsg batchChangeAcctInfoRequestMsg) throws java.rmi.RemoteException{
    if (bCCustomizedServices_PortType == null)
      _initBCCustomizedServicesProxy();
    return bCCustomizedServices_PortType.batchChangeAcctInfo(batchChangeAcctInfoRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationResultMsg batchScatteredSubActivation(com.huawei.www.bme.cbsinterface.bccustomizedservices.BatchScatteredSubActivationRequestMsg batchScatteredSubActivationRequestMsg) throws java.rmi.RemoteException{
    if (bCCustomizedServices_PortType == null)
      _initBCCustomizedServicesProxy();
    return bCCustomizedServices_PortType.batchScatteredSubActivation(batchScatteredSubActivationRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bccustomizedservices.CreateSuperGroupResultMsg createSuperGroup(com.huawei.www.bme.cbsinterface.bccustomizedservices.CreateSuperGroupRequestMsg createSuperGroupRequestMsg) throws java.rmi.RemoteException{
    if (bCCustomizedServices_PortType == null)
      _initBCCustomizedServicesProxy();
    return bCCustomizedServices_PortType.createSuperGroup(createSuperGroupRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bccustomizedservices.JoinSuperGroupResultMsg joinSuperGroup(com.huawei.www.bme.cbsinterface.bccustomizedservices.JoinSuperGroupRequestMsg joinSuperGroupRequestMsg) throws java.rmi.RemoteException{
    if (bCCustomizedServices_PortType == null)
      _initBCCustomizedServicesProxy();
    return bCCustomizedServices_PortType.joinSuperGroup(joinSuperGroupRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupResultMsg deleteSuperGroup(com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupRequestMsg deleteSuperGroupRequestMsg) throws java.rmi.RemoteException{
    if (bCCustomizedServices_PortType == null)
      _initBCCustomizedServicesProxy();
    return bCCustomizedServices_PortType.deleteSuperGroup(deleteSuperGroupRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupMemberResultMsg deleteSuperGroupMember(com.huawei.www.bme.cbsinterface.bccustomizedservices.DeleteSuperGroupMemberRequestMsg deleteSuperGroupMemberRequestMsg) throws java.rmi.RemoteException{
    if (bCCustomizedServices_PortType == null)
      _initBCCustomizedServicesProxy();
    return bCCustomizedServices_PortType.deleteSuperGroupMember(deleteSuperGroupMemberRequestMsg);
  }
  
  
}