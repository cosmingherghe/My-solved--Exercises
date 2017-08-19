/**    
 * (Simulation: heads or tails) Write a program that simulates flipping a coin one
 * million times and displays the number of heads and tails.
 */
  
public class HelloWorld {
	public static void main(String[] args) {
 	
		int flippingTimes = 1000000;
		int headsTails = 0;
		
		do{
			flippingTimes--;
			if(flippingTimes == 0) headsTails = (int)(Math.random() * 2);
		}while(flippingTimes >0);
		 
		System.out.println("After flipping a coin for one million times the outcome is " + ( (headsTails == 0) ? "Head." : "Tail." ) );

	}
}
