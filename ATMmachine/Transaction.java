package com.dj.atm;

import java.util.Date;

public class Transaction {
	public enum Type{
		deposit,withdrawal
	}
	
	int id;
	double amount;
	Type type;
	
	Date date;
}