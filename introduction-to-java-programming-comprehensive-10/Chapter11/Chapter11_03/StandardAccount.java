import java.util.*;   
import java.time.*;

public class StandardAccount {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private String accDate; 

	//A no-arg constructor that creates a default account.
	StandardAccount(){
 
		accDate = LocalDate.now().toString();
	}

	//A constructor that creates an account with the specified id and initial balance.
	StandardAccount(int id, double balance){

		accDate = LocalDate.now().toString();
		this.id = id;
		this.balance = balance;		
	}

	//Below accessor and mutator methods for id, balance, and annualInterestRate.
	public void setId() {

		this.id = id;
	}

	public void setBalance() {

		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {

		this.annualInterestRate = annualInterestRate;
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
	
  public void withdraw(double amount) {

    if(this.balance - amount > 0)
		  this.balance -= amount;
    else
      System.out.println("Not enough funds to complete transaction.");
	}

  public void deposit(double amount) {

		this.balance += amount;
	}

  public String toString() { 
    return  "\nClass Name: " + super.getClass().getName() + "\nDate created: " + accDate + "\nAccount number: " + id + "\nAnnual interest rate: " + annualInterestRate + "\nOverdraft: N/A";
  }
	
}
