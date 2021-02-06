package com.tavant.restapi.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EmptyObjectException extends Exception {

	public EmptyObjectException(String message) {
		super(message);
		
	}
	
	@Override
	public String toString() {
		return super.toString() ;
	}
}
