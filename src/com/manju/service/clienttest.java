package com.manju.service;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class clienttest {
public static void main(String[] args) {
	CalculatorServiceImplServiceLocator loc= new CalculatorServiceImplServiceLocator();
	try {
		CalculatorServiceImpl cal=loc.getCalculatorServiceImpl();
		System.out.println(cal.add(3, 15));
	} catch (ServiceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
