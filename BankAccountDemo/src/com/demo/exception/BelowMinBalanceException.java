package com.demo.exception;

public class BelowMinBalanceException extends RuntimeException {
	
	public BelowMinBalanceException(String msg) {
		super(msg);
	}

}
