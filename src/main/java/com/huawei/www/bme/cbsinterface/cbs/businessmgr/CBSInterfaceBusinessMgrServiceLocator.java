/**
 * CBSInterfaceBusinessMgrServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.cbs.businessmgr;

public class CBSInterfaceBusinessMgrServiceLocator extends org.apache.axis.client.Service implements com.huawei.www.bme.cbsinterface.cbs.businessmgr.CBSInterfaceBusinessMgrService {

    public CBSInterfaceBusinessMgrServiceLocator() {
    }


    public CBSInterfaceBusinessMgrServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CBSInterfaceBusinessMgrServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CBSInterfaceBusinessMgrServicePort
    private java.lang.String CBSInterfaceBusinessMgrServicePort_address = "http://www.huawei.com/bme/cbsinterface/businessmgr/wsdl/CBSInterface_BusinessMgr.wsdl";

    public java.lang.String getCBSInterfaceBusinessMgrServicePortAddress() {
        return CBSInterfaceBusinessMgrServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CBSInterfaceBusinessMgrServicePortWSDDServiceName = "CBSInterfaceBusinessMgrServicePort";

    public java.lang.String getCBSInterfaceBusinessMgrServicePortWSDDServiceName() {
        return CBSInterfaceBusinessMgrServicePortWSDDServiceName;
    }

    public void setCBSInterfaceBusinessMgrServicePortWSDDServiceName(java.lang.String name) {
        CBSInterfaceBusinessMgrServicePortWSDDServiceName = name;
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.CBSInterfaceBusinessMgr getCBSInterfaceBusinessMgrServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CBSInterfaceBusinessMgrServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCBSInterfaceBusinessMgrServicePort(endpoint);
    }

    public com.huawei.www.bme.cbsinterface.cbs.businessmgr.CBSInterfaceBusinessMgr getCBSInterfaceBusinessMgrServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.huawei.www.bme.cbsinterface.cbs.businessmgr.CBSInterfaceBusinessMgrBindingStub _stub = new com.huawei.www.bme.cbsinterface.cbs.businessmgr.CBSInterfaceBusinessMgrBindingStub(portAddress, this);
            _stub.setPortName(getCBSInterfaceBusinessMgrServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCBSInterfaceBusinessMgrServicePortEndpointAddress(java.lang.String address) {
        CBSInterfaceBusinessMgrServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.huawei.www.bme.cbsinterface.cbs.businessmgr.CBSInterfaceBusinessMgr.class.isAssignableFrom(serviceEndpointInterface)) {
                com.huawei.www.bme.cbsinterface.cbs.businessmgr.CBSInterfaceBusinessMgrBindingStub _stub = new com.huawei.www.bme.cbsinterface.cbs.businessmgr.CBSInterfaceBusinessMgrBindingStub(new java.net.URL(CBSInterfaceBusinessMgrServicePort_address), this);
                _stub.setPortName(getCBSInterfaceBusinessMgrServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CBSInterfaceBusinessMgrServicePort".equals(inputPortName)) {
            return getCBSInterfaceBusinessMgrServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CBSInterfaceBusinessMgrService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CBSInterfaceBusinessMgrServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CBSInterfaceBusinessMgrServicePort".equals(portName)) {
            setCBSInterfaceBusinessMgrServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
