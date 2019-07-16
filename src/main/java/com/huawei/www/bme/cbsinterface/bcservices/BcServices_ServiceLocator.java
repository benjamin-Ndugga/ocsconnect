/**
 * BcServices_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bcservices;

public class BcServices_ServiceLocator extends org.apache.axis.client.Service implements com.huawei.www.bme.cbsinterface.bcservices.BcServices_Service {

    public BcServices_ServiceLocator() {
    }


    public BcServices_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BcServices_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BcServicesPort
    private java.lang.String BcServicesPort_address = "http://www.huawei.com/bme/cbsinterface/bcservices/wsdl/CBSInterface_BC_Services.wsdl";

    public java.lang.String getBcServicesPortAddress() {
        return BcServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BcServicesPortWSDDServiceName = "BcServicesPort";

    public java.lang.String getBcServicesPortWSDDServiceName() {
        return BcServicesPortWSDDServiceName;
    }

    public void setBcServicesPortWSDDServiceName(java.lang.String name) {
        BcServicesPortWSDDServiceName = name;
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BcServices_PortType getBcServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BcServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBcServicesPort(endpoint);
    }

    public com.huawei.www.bme.cbsinterface.bcservices.BcServices_PortType getBcServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.huawei.www.bme.cbsinterface.bcservices.BcServicsBindingStub _stub = new com.huawei.www.bme.cbsinterface.bcservices.BcServicsBindingStub(portAddress, this);
            _stub.setPortName(getBcServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBcServicesPortEndpointAddress(java.lang.String address) {
        BcServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.huawei.www.bme.cbsinterface.bcservices.BcServices_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.huawei.www.bme.cbsinterface.bcservices.BcServicsBindingStub _stub = new com.huawei.www.bme.cbsinterface.bcservices.BcServicsBindingStub(new java.net.URL(BcServicesPort_address), this);
                _stub.setPortName(getBcServicesPortWSDDServiceName());
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
        if ("BcServicesPort".equals(inputPortName)) {
            return getBcServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BcServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bcservices", "BcServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BcServicesPort".equals(portName)) {
            setBcServicesPortEndpointAddress(address);
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
