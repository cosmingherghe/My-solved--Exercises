 
/*
(Game: ATM machine) Use the Account class created in Programming Exercise 9.7 to 
simulate an ATM machine. Create ten accounts in an array with id
0, 1, . . . , 9, and initial balance $100. The system prompts the user to enter an
id. If the id is entered incorrectly, ask the user to enter a correct id. Once an id
is accepted, the main menu is displayed as shown in the sample run. You can
enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for
depositing money, and 4 for exiting the main menu. Once you exit, the system
will prompt for an id again. Thus, once the system starts, it will not stop.
*/

import java.util.Scanner;
import java.time.LocalDate;
 
public class Main {
 
	public static void main(String[] args) {  
		
		//Create ten accounts in an array
		Account[] accounts = new Account[10];

		//and IDs and an initial balance of $100 each
		for (int i = 0; i < accounts.length; i++) { 
			accounts[i] = new Account(i, 100); 
		}	
		
		//Start the ATM machine
		ATMmachine ATM = new ATMmachine(accounts);
		ATM.start();
	}
}

 

class ATMmachine {

	private static Scanner input = new Scanner(System.in); 
	private Account[] accounts;
	private String[] options; 
	
	ATMmachine(Account[] accounts){
		setOptions();
		this.accounts = accounts;
	}
	
	public void setOptions() {
		options = new String[4];
		options[0] =  "check balance";
		options[1] =  "withdraw";
		options[2] =  "deposit";
		options[3] =  "exit";
	}
	
	public void start(){  
		while(true) {
			System.out.print( "Enter an id: " );
			int id = input.nextInt();
			if(isAnAcc(id)) {
				getAccInfo( id, accounts );
			}
		}
		
	}
	
	public void getAccInfo(int accID, Account[] accounts){ 
		int optionID = getMenuOption();
		
		while( !options[3].equals(options[optionID]) ) { 
			
			switch (optionID) {
			case 0:
				System.out.println( "The balance is " + accounts[accID].getBalance() );
				break;
			case 1:
				System.out.print( "Enter an amount to withdraw: " );
				accounts[accID].withdraw( input.nextDouble() );
				break;
			case 2:
				System.out.println( "Enter an amount to deposit: " ); 
				accounts[accID].deposit( input.nextDouble() );
				break;
			default:
				break;
			}
			
			optionID = getMenuOption();
		} 
	}
	
	private int getMenuOption() {
		System.out.print( "\nMain menu \n");
		for (int i = 0; i < options.length; i++) {
			System.out.print( (i + 1) + " : " + options[i] + "\n");
		}
		System.out.print(  "Enter a choice: ");
		return input.nextInt() - 1;
	}
	
	private boolean isAnAcc(int id) {
		if(id >= 0 && id < accounts.length)
			return true;
		else {
			System.out.println( "The id is entered incorrectly, ask the user to enter a correct id.");
			return false;
		}
	}
}





class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private String accDate; 

	//A no-arg constructor that creates a default account.
	Account(){ 
		accDate = LocalDate.now().toString(); 
	}

	//A constructor that creates an account with the specified id and initial balance.
	Account(int id, double balance){ 
		
		accDate = LocalDate.now().toString();
		this.id = id;
		this.balance = balance;		
	}

	//Below accessor and mutator methods for id, balance, and annualInterestRate.
	public void setId(int id) {

		this.id = id;
	}

	public void setBalance(int balance) {

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
}
