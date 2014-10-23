package br.com.experian.impl;

import javax.jws.WebService;

import br.com.experian.Hello;
import br.com.experian.fault.HelloFault;


@WebService( endpointInterface="br.com.experian.Hello" , portName = "HelloPort" ,serviceName="HelloService")
public class HelloImpl implements Hello {

	public String sayHello(String parameter) throws HelloFault {
		
		return "Hello";
	}

}
