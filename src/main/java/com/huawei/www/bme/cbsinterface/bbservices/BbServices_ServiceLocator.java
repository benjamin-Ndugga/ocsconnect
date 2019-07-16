/**
 * BbServices_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.huawei.www.bme.cbsinterface.bbservices;

public class BbServices_ServiceLocator extends org.apache.axis.client.Service implements com.huawei.www.bme.cbsinterface.bbservices.BbServices_Service {

    public BbServices_ServiceLocator() {
    }


    public BbServices_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BbServices_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BbServicesPort
    private java.lang.String BbServicesPort_address = "http://www.huawei.com/bme/cbsinterface/bbservices/wsdl/CBSInterface_BB_Services.wsdl";

    public java.lang.String getBbServicesPortAddress() {
        return BbServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BbServicesPortWSDDServiceName = "BbServicesPort";

    public java.lang.String getBbServicesPortWSDDServiceName() {
        return BbServicesPortWSDDServiceName;
    }

    public void setBbServicesPortWSDDServiceName(java.lang.String name) {
        BbServicesPortWSDDServiceName = name;
    }

    public com.huawei.www.bme.cbsinterface.bbservices.BbServices_PortType getBbServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BbServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBbServicesPort(endpoint);
    }

    public com.huawei.www.bme.cbsinterface.bbservices.BbServices_PortType getBbServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.huawei.www.bme.cbsinterface.bbservices.BbServicsBindingStub _stub = new com.huawei.www.bme.cbsinterface.bbservices.BbServicsBindingStub(portAddress, this);
            _stub.setPortName(getBbServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBbServicesPortEndpointAddress(java.lang.String address) {
        BbServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.huawei.www.bme.cbsinterface.bbservices.BbServices_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.huawei.www.bme.cbsinterface.bbservices.BbServicsBindingStub _stub = new com.huawei.www.bme.cbsinterface.bbservices.BbServicsBindingStub(new java.net.URL(BbServicesPort_address), this);
                _stub.setPortName(getBbServicesPortWSDDServiceName());
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
        if ("BbServicesPort".equals(inputPortName)) {
            return getBbServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "BbServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.huawei.com/bme/cbsinterface/bbservices", "BbServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BbServicesPort".equals(portName)) {
            setBbServicesPortEndpointAddress(address);
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
