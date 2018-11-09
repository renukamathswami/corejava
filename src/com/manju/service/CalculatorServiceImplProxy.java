package com.manju.service;

public class CalculatorServiceImplProxy implements com.manju.service.CalculatorServiceImpl {
  private String _endpoint = null;
  private com.manju.service.CalculatorServiceImpl calculatorServiceImpl = null;
  
  public CalculatorServiceImplProxy() {
    _initCalculatorServiceImplProxy();
  }
  
  public CalculatorServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculatorServiceImplProxy();
  }
  
  private void _initCalculatorServiceImplProxy() {
    try {
      calculatorServiceImpl = (new com.manju.service.CalculatorServiceImplServiceLocator()).getCalculatorServiceImpl();
      if (calculatorServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculatorServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculatorServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculatorServiceImpl != null)
      ((javax.xml.rpc.Stub)calculatorServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.manju.service.CalculatorServiceImpl getCalculatorServiceImpl() {
    if (calculatorServiceImpl == null)
      _initCalculatorServiceImplProxy();
    return calculatorServiceImpl;
  }
  
  public int add(int x, int y) throws java.rmi.RemoteException{
    if (calculatorServiceImpl == null)
      _initCalculatorServiceImplProxy();
    return calculatorServiceImpl.add(x, y);
  }
  
  public int divide(int x, int y) throws java.rmi.RemoteException{
    if (calculatorServiceImpl == null)
      _initCalculatorServiceImplProxy();
    return calculatorServiceImpl.divide(x, y);
  }
  
  public int subtract(int x, int y) throws java.rmi.RemoteException{
    if (calculatorServiceImpl == null)
      _initCalculatorServiceImplProxy();
    return calculatorServiceImpl.subtract(x, y);
  }
  
  public int multiply(int x, int y) throws java.rmi.RemoteException{
    if (calculatorServiceImpl == null)
      _initCalculatorServiceImplProxy();
    return calculatorServiceImpl.multiply(x, y);
  }
  
  
}