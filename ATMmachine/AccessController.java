package com.dj.atm;

public class AccessController {
	static AccessController instance;
	
	AccountHolder currentUser;
	
	private AccessController(){ }
	
	public static AccessController getInstance(){
		if(instance == null)
			instance = new AccessController();
		return instance;
	}
	
	public boolean authenticateUser(int id, int pin){
		AccountHolder user = AccountHolderRepository.getInstance().findAccountHolder(id);
		
		currentUser = user;
		
		return user != null && user.pin == pin;
	}
	
	public boolean authenticateUser(UserInterface ui){
		if(ui == null)
			return false;
		
		ui.print("Please enter your User ID");
		
		int id = ui.getInt();
		
		ui.print("Please enter your PIN");
		
		int pin = ui.getInt();
		
		return authenticateUser(id, pin);
	}
	
	public AccountHolder getCurrentAccountHolder(){
		return currentUser;
	}
}
