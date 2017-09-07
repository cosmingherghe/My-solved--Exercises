/**
*	(Financial application: compute commissions) Write a method that computes the
*	commission, using the scheme in Programming Exercise 5.39. The header of the
*	method is as follows:
*	public static double computeCommission(double salesAmount)
*	Write a test program that displays the following table:
*	
*	Sales Amount 	Commission
*	10000 		900.0
*	15000 		1500.0
*	...
*	95000 		11100.0
*	100000 		11700.0
*/


public class ComputeCommissions {

	public static void main(String[] args) {
		 
		System.out.println("Sales Amount \tCommission");
		System.out.println("__________________________");
		
		for(int salesAmount = 10000; salesAmount <= 100000; salesAmount +=5000){
			System.out.printf("%11d \t %8.1f \n", salesAmount, computeCommission(salesAmount));
		}
		
	}
	
	public static double computeCommission(double salesAmount) {
		int baseSalary = 5000; 
		int percent  = 0;
			
		if(salesAmount>10000){
			salesAmount -= 10000;
			percent += (5000 * 0.08) + (5000 * 0.1) + (salesAmount * 0.12); 
		}
		else if(salesAmount>5000){
			salesAmount -= 5000;
			percent += (5000 * 0.08) + (salesAmount * 0.1);
		}
		else{
			percent += salesAmount * 0.08;
		} 
		
		return percent;	  
	}

}
