package com.demo.exception;

public class InsufficientBalanceException extends RuntimeException {

	public InsufficientBalanceException() {
		super("balance should be > 1000");
	}
}
