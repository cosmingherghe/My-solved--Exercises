import java.util.Scanner;

public class Chapter3_02 {

	/**
	 * Game: add three numbers
	 */
	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int randomNumber = 0;
		
		System.out.print("Enter the sum of these three integers: ");
		
		for (int i = 0; i < 3 ; i++) {
			
			randomNumber = (int)(Math.random() * 10 + 1);
			System.out.print( randomNumber + " ");
			sum += randomNumber;
		}
		
		int userGuess = input.nextInt();
		
		System.out.println( (sum == userGuess) ? "Correct!" : "False!" );
	}

}
