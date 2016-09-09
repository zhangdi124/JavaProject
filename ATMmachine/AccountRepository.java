package com.dj.atm;

import java.util.HashMap;
import java.util.Map;

public class AccountRepository {
	static AccountRepository instance;
	Map<Integer, Account> accountMap;
	
	private AccountRepository(){
		accountMap = new HashMap<>();
		
		Account account = new Account(0, Account.Type.checking);
		account.addAccountHolder(0);
		account.setBalance(200.0);
		
		accountMap.put(0, account);
	}
	
	public static AccountRepository getInstance(){
		if(instance == null)
			instance = new AccountRepository();
		
		return instance;
	}
	
	public Account findAccount(int number){
		if(accountMap.containsKey(number))
			return accountMap.get(number);
		
		return null;
	}
}
