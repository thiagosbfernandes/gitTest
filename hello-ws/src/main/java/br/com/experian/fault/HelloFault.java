package br.com.experian.fault;

public class HelloFault extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1131148450852454273L;

	public HelloFault () {}
	
	
	
	public HelloFault (String message) {
		
		super(message);
	}
	
	public HelloFault (Throwable cause) {
		
		super(cause);
	}
	public HelloFault (String message, Throwable cause) {
		
		super(message,cause);
	}

	
}
