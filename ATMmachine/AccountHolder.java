package com.dj.atm;

import java.util.*;
import java.util.stream.Collectors;

public class AccountHolder {
	int id;
	String firstName;
	String lastName;
	
	int pin;
	
	List<Integer> accountNumbers;
	
	public AccountHolder(int id){
		this.id = id;
		accountNumbers = new ArrayList<>();
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setPin(int pin){
		this.pin = pin;
	}
	
	public void addAccount(int number){
		this.accountNumbers.add(number);
	}
	public void addAccount(Account account){
		addAccount(account.number);
	}
	
	public List<Integer> getAccountNumbers(){
		return accountNumbers;
	}
	
	public List<Account> getAccounts(){
		final AccountRepository accountRepository = AccountRepository.getInstance();
		return getAccountNumbers()
				.parallelStream()
				.map(number -> accountRepository.findAccount(number))
				.collect(Collectors.toList());
	}
	
	public int getId(){ return id; }
	
	public int getPin(){ return pin; }
	
	public String getFirstName(){ return firstName; }
	public String getLastName(){ return lastName; }
}
