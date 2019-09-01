package Chapter11_08;
 
public class Main {

	/** 
	1) Write a test program that creates an Account with 
	annual interest rate 1.5%, balance 1000, id 1122, and name George. 
	
	2) Deposit $30, $40, and $50 to the account and withdraw $5, $4, and $2 from the account. 
	
	3) Print an account summary that shows account holder name, interest rate, balance, and all transactions.
	*/
	public static void main(String[] args) {

		// 1)
		Account testAcc = new Account("George", 1122, 1000);
		testAcc.setAnnualInterestRate(1.5);
		
		// 2)
		testAcc.deposit(30, "Dposit Cash machine");
		testAcc.deposit(40, "PayPal Balance Withdrawal");
		testAcc.deposit(50, "Gift from friend");
		
		testAcc.withdraw(5, "payment grocery");  
		testAcc.withdraw(4, "bus ticket"); 
		testAcc.withdraw(2, "vending machine"); 
		
		//Print Account Information
		System.out.println(testAcc.toString());
		
		//Show transactions  
		System.out.println("\nPrint Statement \n\n \t\tDate \t\t\tType  \t\tAmount \t\tBalance \tDescription");
		
		for (int i = 0; i < testAcc.getAccTransactions().size(); i++) {
			System.out.println("\n" + testAcc.getAccTransactions().get(i).getTransactionDate().toString()
						+ "\t\t" + testAcc.getAccTransactions().get(i).getTransactionType()
						+ "\t\t" + testAcc.getAccTransactions().get(i).getAmount()
						+ "\t\t" + testAcc.getAccTransactions().get(i).getBalance()
						+ "\t\t" + testAcc.getAccTransactions().get(i).getDescription() );
		}
		
	}

}
