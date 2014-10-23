package br.com.experian;

import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.experian.fault.HelloFault;

@WebService(name="Hello")
public interface Hello  {
	
	public String sayHello(@WebParam (name="parameter") String parameter) throws HelloFault ;

}
