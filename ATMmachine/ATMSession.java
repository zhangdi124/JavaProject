package com.dj.atm;

public class ATMSession {
	AccessController access;
	UserInterface ui;
	
	public ATMSession(){
		ui = UserInterface.getInstance();
		access = AccessController.getInstance();
	}
	
	public void start(){
		ui.print("Welcome to Boo Boo Bank!");
		
		if(!access.authenticateUser(ui)){
			ui.print("Could not log in, the authorities have been alerted.Bye!");
			return;
		}
		
		ui.print("Welcome!");
		ui.printUserAccounts(access.getCurrentAccountHolder());
	}
}
