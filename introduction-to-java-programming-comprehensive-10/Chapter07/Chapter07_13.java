//(Random number chooser) Write a method that returns a random number between
//1 and 54, excluding the numbers passed in the argument. The method header is
//specified as follows:
//public static int getRandom(int... numbers)

public class RandomNumberChooser {

	public static void main(String[] args) {
		 int[] input = { 9, 25, 37, 2, 19, 46, 30, 14, 52, 22}; 
		 
		 System.out.println("Numbers in the array are: ");
		 for (int i = 0; i < input.length; i++) {
			System.out.print( input[i] + " ");
		 }
		 
		 System.out.println("\n\n" +  getRandom(input)
				 			+ " is the random number between 1 and 54, excluding the numbers in the array" );
	}
	
	public static int getRandom(int... numbers) {
		int numberExcludingArrayNumbers;
		
		do{
			numberExcludingArrayNumbers = (int)(1 + Math.random() * 54);
			
		}while(foundNumber(numberExcludingArrayNumbers, numbers));
		
		return numberExcludingArrayNumbers;
	}
	
	public static boolean foundNumber(int x, int... numbers) {
		boolean test = false;
		
		for (int i = 0; i < numbers.length; i++) {
			if(x == numbers[i])
				test = true;       //return true if the number was found in the array
		}
		
		return test;
	}

}
