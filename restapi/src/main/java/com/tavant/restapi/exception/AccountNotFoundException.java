package com.tavant.restapi.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AccountNotFoundException extends Exception  {
	
	private static final long serialVersionUID = 1L;

	public AccountNotFoundException(String message) {
		super(message);
		
	}
	
	@Override
	public String toString() {
		return super.toString() ;
	}

}
