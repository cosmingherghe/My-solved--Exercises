package Chapter11_08;
 
import java.time.LocalDate;
import java.util.*;
 
class Account {

	private String name;	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private String accDate;
	private ArrayList<Transaction> accTransactions = new ArrayList<Transaction>();
	
	//A no-arg constructor that creates a default account.
	Account(){ 
		accDate = LocalDate.now().toString();
	}


	//A constructor that creates an account with the specified id and initial balance.
	Account(int id, double balance){ 
		accDate = LocalDate.now().toString();
		this.id = id;
		this.balance = balance; 
		this.accTransactions.add(new Transaction(new Date(), 'D', balance, 0.0, "Openning account deposit"));
	}
	
	//Constructor that constructs an account with the specified name, id, and balance
	Account(String name, int id, double balance){ 
		accDate = LocalDate.now().toString();
		this.name = name;
		this.id = id;
		this.balance = balance;
		this.accTransactions.add(new Transaction(new Date(), 'D', balance, 0.0, "Openning account deposit"));
	}
  
	public void setAnnualInterestRate(double annualInterestRate) { 
		this.annualInterestRate = annualInterestRate;
	}
	
	public String getName() {
		return name;
	}

	public int getId() { 
		return id;
	}

	public double getBalance() { 
		return  balance;
	}

	public double getAnnualInterestRate() { 
		return annualInterestRate;
	}

	//accessor method for dateCreated.
	public String getDateCreated() {  
		return accDate;
	}

	//returns the monthly interest.
	public double getMonthlyInterestRate() { 
		return (annualInterestRate / 100) / 12;
	}

  //returns the monthly interest.
  public double getMonthlyInterest() { 
		return balance * getMonthlyInterestRate();
	}
	
  public void withdraw(double amount, String description) { 
    if(this.balance - amount > 0) {
		this.balance -= amount;
    	this.accTransactions.add(new Transaction(new Date(), 'W', amount, balance, description));
    }
    else
    	System.out.println("Not enough funds to complete transaction.");
	}

  public void deposit(double amount, String description) { 
	this.balance += amount;
	this.accTransactions.add(new Transaction(new Date(), 'D', amount, balance, description));
  }

  public ArrayList<Transaction> getAccTransactions() {
	  return accTransactions;
  }

  public String toString() {
	 return  "Account Name: " + getName() + "\nBalance: " + getBalance() + "\nMonthly interest: " + getMonthlyInterest() + " \nDate when this account was created: " + getDateCreated();
  }
  
}
