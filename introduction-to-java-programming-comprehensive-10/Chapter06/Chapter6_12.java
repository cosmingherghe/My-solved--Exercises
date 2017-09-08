/**
*	(Display characters) Write a method that prints characters using the following
*	header:
*	
*	public static void printChars(char ch1, char ch2, int numberPerLine)
*	
*	This method prints the characters between ch1 and ch2 with the specified numbers per line. Write a test program that prints ten characters per line from 1 to Z.
*	Characters are separated by exactly one space.
*/


public class DisplayCharacters {

	public static void main(String[] args) { 
		
		printChars('1', 'z', 10); //test printChars method
	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {
		
		if(ch1 > ch2){
			char temp = ch1;
			ch1 = ch2;
			ch2 = temp;
		}
		 
		
		for(int charInRange = ch1, noOfChars = 1; charInRange <= ch2; charInRange++, noOfChars++){
			
			System.out.print( (char)charInRange );
			
			if(noOfChars % numberPerLine == 0) //add a new line
				System.out.println();
		}
	}
	
}
