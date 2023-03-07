package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import com.demo.model.Account;
import com.demo.service.AccountService;

public class TestAccount {

	public static void main(String[] args) {
		Set<Account> accountSet = new HashSet<>();
		
		AccountService.addAccount(accountSet);
		AccountService.closeAccount(accountSet);
		
		System.out.println(accountSet);

	}

}
