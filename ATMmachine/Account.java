package com.dj.atm;
import java.util.*;
import java.util.stream.Collectors;

public class Account {
	public enum Type{
		checking,savings
	}
	
	int number;
	boolean active;
	Type type;
	List<Integer> accountHolderIds;
	double balance;

	
	List<Integer> transactionIds;
	
	public Account(int number, Type type){
		this.number = number;
		this.type = type;
		
		this.accountHolderIds = new ArrayList<>();
		this.active = true;
	}
	
	//We can overload constructors.
	//using this(...) on the first line of an overloaded constructor
	// (IT HAS TO BE THE FIRSTLINE) we are able to call another constructor
	// and then build upon it.
	public Account(int number, Type type, boolean active){
		this(number, type);
		this.active = active;
	}
	
	public void addAccountHolder(int id){
		this.accountHolderIds.add(id);
	}
	
	public void addAccountHolder(AccountHolder accountHolder){
		addAccountHolder(accountHolder.id);
	}
	
	public void activate(){
		this.active = true;
	}
	
	public void deactivate(){
		this.active = false;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public void adjustBalance(double adjustment){
		this.balance += adjustment;
	}
	
	public void increaseBalance(double increase){
		adjustBalance(increase);
	}
	
	public void decreaseBalance(double decrease){
		adjustBalance(-decrease);
	}
	
	public void addTransaction(Transaction transaction){
		if(transaction == null)
			return;
		
		transactionIds.add(transaction.id);
		if(transaction.type == Transaction.Type.deposit)
			increaseBalance(transaction.amount);
		else if(transaction.type == Transaction.Type.withdrawal)
			decreaseBalance(transaction.amount);
	}
	public void addTransaction(int id){
		addTransaction(TransactionRepository.getInstance().findTransaction(id));
	}
	
	public int getNumber(){ return number; }
	public boolean isActive(){ return active; }
	public Type getType(){ return type; }
	
	public List<Integer> getAccountHolderIds(){
		return accountHolderIds;
	}
	
	public List<AccountHolder> getAccountHolders(){
		final AccountHolderRepository repository = AccountHolderRepository.getInstance();
		return getAccountHolderIds()
				.parallelStream()
				.map(id -> repository.findAccountHolder(id))
				.collect(Collectors.toList());
	}
	
	public double getBalance(){ return balance; }
	
	public List<Integer> getTransactionIds(){ return transactionIds; }
	
	public List<Transaction> getTransactions(){
		final TransactionRepository repo = TransactionRepository.getInstance();
		return getTransactionIds()
				.parallelStream()
				.map(id -> repo.findTransaction(id))
				.collect(Collectors.toList());
	}
}
