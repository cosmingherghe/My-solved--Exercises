package Chapter11_08;

import java.util.Date;

public class Transaction {

	private java.util.Date transactionDate;
	private char transactionType;
	private double amount;
	private double balance;
	private String description;
	
	
	public Transaction(Date transactionDate, char transactionType, double amount, double balance, String description) {
		super();
		this.transactionDate = transactionDate;
		this.transactionType = transactionType;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

	public java.util.Date getTransactionDate() {
		return transactionDate;
	}

	public char getTransactionType() {
		return transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public double getBalance() {
		return balance;
	}

	public String getDescription() {
		return description;
	}

	
}
