/**
(Financial tsunami) Banks lend money to each other. In tough economic times,
if a bank goes bankrupt, it may not be able to pay back the loan. A bank’s
total assets are its current balance plus its loans to other banks. The diagram in
Figure 8.8 shows five banks. The banks’ current balances are 25, 125, 175, 75,
and 181 million dollars, respectively. The directed edge from node 1 to node 2
indicates that bank 1 lends 40 million dollars to bank 2.
 
If a bank’s total assets are under a certain limit, the bank is unsafe. The money it
borrowed cannot be returned to the lender, and the lender cannot count the loan in
its total assets. Consequently, the lender may also be unsafe, if its total assets are
under the limit. Write a program to find all the unsafe banks. Your program reads
the input as follows. It first reads two integers n and limit, where n indicates the
number of banks and limit is the minimum total assets for keeping a bank safe. It
then reads n lines that describe the information for n banks with IDs from 0 to n-1.
The first number in the line is the bank’s balance, the second number indicates
the number of banks that borrowed money from the bank, and the rest are pairs
of two numbers. Each pair describes a borrower. The first number in the pair
is the borrower’s ID and the second is the amount borrowed. For example, the
input for the five banks in Figure 8.8 is as follows (note that the limit is 201):

5 201
25 2 1 100.5 4 320.5
125 2 2 40 3 85
175 2 0 125 3 75
75 1 0 125
181 1 2 125

The total assets of bank 3 are (75 + 125), which is under 201, so bank 3 is
unsafe. After bank 3 becomes unsafe, the total assets of bank 1 fall below
(125 + 40). Thus, bank 1 is also unsafe. The output of the program should be

Unsafe banks are 3 1

(Hint: Use a two-dimensional array borrowers to represent loans.
borrowers[i][j] indicates the loan that bank i loans to bank j. Once bank j
becomes unsafe, borrowers[i][j] should be set to 0.)

 */

import java.util.*;

public class FinancialTsunami {

	public static void main(String[] args) {
		
		int limit = 201;
		double[][] borrowers = getBanksBorrowers();
		double[] bankBalance = getBanksBalance();

		displayBankBananceAndBorrowers(bankBalance, borrowers, limit);

		displayUnsafeBanks(bankBalance, borrowers, limit);
	}
	
	public static void displayUnsafeBanks(double[] banks, double[][] bors, int lim) {
		
		double[][] unsafeBanksLoop = bors;
		
		//unsafeBank[i] = 1 if the number(index) is unsafe
		int[] unsafeBank = new int[bors.length];
		boolean newUnsafeBank = false;
		String subtract = "";
		String becomesUnsafe = "";

		do{
			newUnsafeBank = false;
			for (int i = 0; i < unsafeBanksLoop.length; i++) {
	
				double borrowedMoney = 0;
				 
				for (int j = 0; j < unsafeBanksLoop.length; j++) {

					if(unsafeBank[j] == 1) {  
						if(unsafeBanksLoop[i][j] > 0) {
							subtract += " After bank " + j + " becomes unsafe, we subtract " + unsafeBanksLoop[i][j] + " from the total assets of bank " + i + "\n";
							unsafeBanksLoop[i][j] = 0;  //if bank is unsafe void assets from other banks
						}
					}

					if(unsafeBanksLoop[i][j] > 0) {
						borrowedMoney += unsafeBanksLoop[i][j];
					}
					 
				}

				if( banks[i] + borrowedMoney < lim && unsafeBank[i] != 1) {
					unsafeBank[i] = 1; //add to unsafe banks
					newUnsafeBank = true; //check if after bank i becomes unsafe if another bank becomes unsafe
					becomesUnsafe += " The total assets of bank " + i +  " are (" + banks[i] + " + " + borrowedMoney + "), which is under " + lim + "\n";
				}
			} 
		}while(newUnsafeBank); 
		
		System.out.print(subtract + "\n" + becomesUnsafe);
	}
	
	public static void displayBankBananceAndBorrowers(double[] banks, double[][] bors, int lim) {
		 
		System.out.printf("Banks: %d \nThe limit is: %d\n\n", banks.length, lim);
		
		String bankInfo = "";
		for (int i = 0; i < bors.length; i++) {
			
			int countBorrowedMoney = 0;
			String borrowed = "";
			for (int j = 0; j < bors.length; j++) {
				if(bors[i][j] > 0) {
					countBorrowedMoney++;
					borrowed += "\tBank " + j + " borrowed " + bors[i][j] + ". ";
				}
			}
			bankInfo += "Bank " + i + " balance: " + banks[i] + ". \t" + countBorrowedMoney + " banks that borrowed money from it. " +
						borrowed + "\n";
		}
		System.out.println(bankInfo);
	}
	
	public static double[] getBanksBalance() {
		double[] bank = new double[5];
		 
		bank[0] = 25;
		bank[1] = 125;
		bank[2] = 175;
		bank[3] = 75;
		bank[4] = 181;
		
		return bank;
	}

	public static double[][] getBanksBorrowers() {
		double[][] borr = new double[5][5];
		
		for (int i = 0; i < borr.length; i++) {
			for (int j = 0; j < borr.length; j++) {
				borr[i][j] = 0;
			}
		}

		borr[0][1] = 100.5;
		borr[0][4] = 320.5;
		borr[1][3] = 85;
		borr[1][2] = 40;
		borr[2][3] = 75;
		borr[2][0] = 125;
		borr[3][0] = 125;
		borr[4][2] = 125;

		return borr;
	}

}
