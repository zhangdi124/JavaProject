package com.dj.atm;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	static UserInterface instance;
	
	Scanner scanner;
	
	private UserInterface(){
		scanner = new Scanner(System.in);
	}
	
	public static UserInterface getInstance(){
		if(instance == null)
			instance = new UserInterface();
		
		return instance;
	}
	
	public void print(String message){
		System.out.println(message);
	}
	
	public String getString(){
		return scanner.nextLine();
	}
	
	public int getInt(){
		return Integer.parseInt(getString());
	}
	
	public void printUserAccounts(AccountHolder holder){
		List<Account> accounts = holder.getAccounts();
		print("You have the following account(s):");
		for(int i = 0; i < accounts.size(); ++i){
			Account account = accounts.get(i);
			print(String.format("%d. %s", i, account.type));
		}
	}
}
