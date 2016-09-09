package com.dj.atm;
import java.util.*;
public class TransactionRepository {
	static TransactionRepository instance;
	Map<Integer, Transaction> transactionMap;
	
	private TransactionRepository(){
		transactionMap = new HashMap<>();
	}
	
	public static TransactionRepository getInstance(){
		if(instance == null)
			instance = new TransactionRepository();
		
		return instance;
	}
	
	public Transaction findTransaction(int id){
		if(transactionMap.containsKey(id))
			return transactionMap.get(id);
		
		return null;
	}
}
