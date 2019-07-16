package com.huawei.www.bme.cbsinterface.bbservices;

public class BbServicesProxy implements com.huawei.www.bme.cbsinterface.bbservices.BbServices_PortType {
  private String _endpoint = null;
  private com.huawei.www.bme.cbsinterface.bbservices.BbServices_PortType bbServices_PortType = null;
  
  public BbServicesProxy() {
    _initBbServicesProxy();
  }
  
  public BbServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initBbServicesProxy();
  }
  
  private void _initBbServicesProxy() {
    try {
      bbServices_PortType = (new com.huawei.www.bme.cbsinterface.bbservices.BbServices_ServiceLocator()).getBbServicesPort();
      if (bbServices_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bbServices_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bbServices_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bbServices_PortType != null)
      ((javax.xml.rpc.Stub)bbServices_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.huawei.www.bme.cbsinterface.bbservices.BbServices_PortType getBbServices_PortType() {
    if (bbServices_PortType == null)
      _initBbServicesProxy();
    return bbServices_PortType;
  }
  
  public com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountResultMsg queryUnbilledAmount(com.huawei.www.bme.cbsinterface.bbservices.QueryUnbilledAmountRequestMsg queryUnbilledAmountRequestMsg) throws java.rmi.RemoteException{
    if (bbServices_PortType == null)
      _initBbServicesProxy();
    return bbServices_PortType.queryUnbilledAmount(queryUnbilledAmountRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitResultMsg queryFreeUnit(com.huawei.www.bme.cbsinterface.bbservices.QueryFreeUnitRequestMsg queryFreeUnitRequestMsg) throws java.rmi.RemoteException{
    if (bbServices_PortType == null)
      _initBbServicesProxy();
    return bbServices_PortType.queryFreeUnit(queryFreeUnitRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRResultMsg queryCDR(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRRequestMsg queryCDRRequestMsg) throws java.rmi.RemoteException{
    if (bbServices_PortType == null)
      _initBbServicesProxy();
    return bbServices_PortType.queryCDR(queryCDRRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bbservices.Charge2BillResultMsg charge2Bill(com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRequestMsg charge2BillRequestMsg) throws java.rmi.RemoteException{
    if (bbServices_PortType == null)
      _initBbServicesProxy();
    return bbServices_PortType.charge2Bill(charge2BillRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackResultMsg charge2BillRollback(com.huawei.www.bme.cbsinterface.bbservices.Charge2BillRollbackRequestMsg charge2BillRollbackRequestMsg) throws java.rmi.RemoteException{
    if (bbServices_PortType == null)
      _initBbServicesProxy();
    return bbServices_PortType.charge2BillRollback(charge2BillRollbackRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountResultMsg queryAggregationAmount(com.huawei.www.bme.cbsinterface.bbservices.QueryAggregationAmountRequestMsg queryAggregationAmountRequestMsg) throws java.rmi.RemoteException{
    if (bbServices_PortType == null)
      _initBbServicesProxy();
    return bbServices_PortType.queryAggregationAmount(queryAggregationAmountRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bbservices.BillSuppressResultMsg billSuppress(com.huawei.www.bme.cbsinterface.bbservices.BillSuppressRequestMsg billSuppressRequestMsg) throws java.rmi.RemoteException{
    if (bbServices_PortType == null)
      _initBbServicesProxy();
    return bbServices_PortType.billSuppress(billSuppressRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bbservices.HotBillingResultMsg hotBilling(com.huawei.www.bme.cbsinterface.bbservices.HotBillingRequestMsg hotBillingRequestMsg) throws java.rmi.RemoteException{
    if (bbServices_PortType == null)
      _initBbServicesProxy();
    return bbServices_PortType.hotBilling(hotBillingRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusResultMsg queryHotBillingStatus(com.huawei.www.bme.cbsinterface.bbservices.QueryHotBillingStatusRequestMsg queryHotBillingStatusRequestMsg) throws java.rmi.RemoteException{
    if (bbServices_PortType == null)
      _initBbServicesProxy();
    return bbServices_PortType.queryHotBillingStatus(queryHotBillingStatusRequestMsg);
  }
  
  public com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailResultMsg queryCDRDetail(com.huawei.www.bme.cbsinterface.bbservices.QueryCDRDetailRequestMsg queryCDRDetailRequestMsg) throws java.rmi.RemoteException{
    if (bbServices_PortType == null)
      _initBbServicesProxy();
    return bbServices_PortType.queryCDRDetail(queryCDRDetailRequestMsg);
  }
  
  
}