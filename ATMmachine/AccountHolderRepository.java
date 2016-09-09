package com.dj.atm;

import java.util.HashMap;
import java.util.Map;

public class AccountHolderRepository {
	static AccountHolderRepository instance;
	
	Map<Integer, AccountHolder> accountHolderMap;
	
	private AccountHolderRepository(){
		accountHolderMap = new HashMap<>();
		
		AccountHolder holder = new AccountHolder(0);
		holder.setFirstName("Boo Boo");
		holder.setLastName("Bi");
		holder.setPin(1234);
		holder.addAccount(0);
		
		accountHolderMap.put(0, holder);
	}
	
	public static AccountHolderRepository getInstance(){
		if(instance == null)
			instance = new AccountHolderRepository();
		
		return instance;
	}
	
	public AccountHolder findAccountHolder(int id){
		if(accountHolderMap.containsKey(id))
			return accountHolderMap.get(id);

		return null;
	}
}
