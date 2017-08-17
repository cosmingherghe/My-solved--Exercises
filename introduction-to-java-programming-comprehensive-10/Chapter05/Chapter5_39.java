/**    
 * (Financial application: find the sales amount) You have just started a sales job
 * in a department store. Your pay consists of a base salary and a commission. The
 * base salary is $5,000. The scheme shown below is used to determine the commission rate.
 * Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
 * $5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission 
 * is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
 * Your goal is to earn $30,000 a year. Write a program that finds the minimum sales
 * you have to generate in order to make $30,000.
 */
 
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
 	
		int baseSalary = 5000;
		int trySale, i = 0;
		int percent;
        
		do{ 
			i++;
			trySale = i;
			percent = 0;
			
			if(trySale>10000){
				trySale -= 10000;
				percent += (5000 * 0.08) + (5000 * 0.1) + (trySale * 0.12); 
			}
			else if(trySale>5000){
				trySale -= 5000;
				percent += (5000 * 0.08) + (trySale * 0.1);
			}
			else{
				percent += trySale * 0.08;
			} 
			 
		}while(baseSalary + percent <= 30000);
		
		System.out.println("Minimum sales you have to generate in order to make $30,000 is : " + trySale );

	}
}
