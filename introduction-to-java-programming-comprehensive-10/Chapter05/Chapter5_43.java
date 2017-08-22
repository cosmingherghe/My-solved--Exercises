/**    
 * (Math: combinations) Write a program that displays all possible combinations
 * for picking two numbers from integers 1 to 7. Also display the total number of
 * all combinations.
 */
  
public class HelloWorld {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

 		System.out.print("Picking two numbers from integers 1 to 7: ");
 		
 		int firstNumber = input.nextInt();
 		int secondNumber = input.nextInt();
 		int combinations = 0;
 		
		for(int i = firstNumber; i < secondNumber + 1; i++){
			
			for(int j = i; j < secondNumber + 1; j++){
				
				if(i != j) {
					System.out.println(i + " " + j);
					combinations++;
				}
			}
		}
		
		System.out.println("The total number of all combinations is: " + combinations);

	}
}
