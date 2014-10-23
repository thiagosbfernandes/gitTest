package br.com.experian.sec;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class HelloCallBack implements CallbackHandler {

	@Override
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		
		Callback callback = callbacks[0];
		
		final WSPasswordCallback pc = (WSPasswordCallback) callback;
		System.out.println("==============================================");
		System.out.println("IDENTIFIER : " + pc.getIdentifier());
		System.out.println("PASSWORD : " + pc.getPassword());
		System.out.println("==============================================");
		

	}

}
