/**
 * LocateServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class LocateServiceLocator extends org.apache.axis.client.Service implements com.microsretail.Locate.LocateService {

    public LocateServiceLocator() {
    }


    public LocateServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocateServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocatePort
    private java.lang.String LocatePort_address = "http://ana-dev-loc:8080/Locate/LocateServices";

    public java.lang.String getLocatePortAddress() {
        return LocatePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocatePortWSDDServiceName = "LocatePort";

    public java.lang.String getLocatePortWSDDServiceName() {
        return LocatePortWSDDServiceName;
    }

    public void setLocatePortWSDDServiceName(java.lang.String name) {
        LocatePortWSDDServiceName = name;
    }

    public com.microsretail.Locate.Locate getLocatePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocatePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocatePort(endpoint);
    }

    public com.microsretail.Locate.Locate getLocatePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsretail.Locate.LocateServiceSoapBindingStub _stub = new com.microsretail.Locate.LocateServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getLocatePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocatePortEndpointAddress(java.lang.String address) {
        LocatePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.microsretail.Locate.Locate.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsretail.Locate.LocateServiceSoapBindingStub _stub = new com.microsretail.Locate.LocateServiceSoapBindingStub(new java.net.URL(LocatePort_address), this);
                _stub.setPortName(getLocatePortWSDDServiceName());
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
        if ("LocatePort".equals(inputPortName)) {
            return getLocatePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocatePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocatePort".equals(portName)) {
            setLocatePortEndpointAddress(address);
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
