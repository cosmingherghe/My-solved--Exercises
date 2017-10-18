//(Game: hangman) Write a hangman game that randomly generates a word and
//prompts the user to guess one letter at a time, as shown in the sample run. Each
//letter in the word is displayed as an asterisk. When the user makes a correct
//guess, the actual letter is then displayed. When the user finishes a word, display
//the number of misses and ask the user whether to continue to play with another
//word. Declare an array to store words, as follows:
//// Add any words you wish in this array
//String[] words = {"write", "that", ...};

import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] words = {"delightful", "absolutely", "graceful", "efficient", "fabulous", "innovative",
						"lucky", "masterful", "natural", "remarkable", "upstanding", "virtuous", "worthy"};
		
		String continuePlay = "y";
		
		while( continuePlay.equals("y") ) {

			String word = words[ (int)(Math.random() * words.length) ];
			boolean[] asterisks = new boolean[word.length()];
			
			for (int i = 0; i < asterisks.length; i++) 
				 asterisks[i] = false;
			 
			while(guessComplete(asterisks)) {
				checkGuess(word, asterisks);
			}
			
			System.out.println("Do you want to guess another word? Enter y or n: ");
			continuePlay = input.nextLine();
		}
		
		
	}
	
	public static boolean guessComplete(boolean[] asterisks) {
		boolean test = false;
		
		for (int i = 0; i < asterisks.length; i++) {
			if(!asterisks[i])
				test = !asterisks[i]; 
		}
		
		return test;
	}
	
	public static void checkGuess(String word, boolean[] asterisks) {
		String progress = "";
		Scanner input = new Scanner(System.in);
		String checkChar;
		
		for (int i = 0; i < word.length(); i++) {
			if(asterisks[i])
				progress += word.charAt(i) + "";
			else
				progress += "*";
		}
		
		System.out.print("Enter a letter in word " + progress + " < "+ word + " > ");
		
		checkChar = input.nextLine();
		
		for (int i = 0; i < word.length(); i++) {
			
				if(checkChar.charAt(0) == word.charAt(i)) { 
					
					if(asterisks[i])   // char is already in the word
						System.out.println( checkChar + " is already in the word"); 
					else
						asterisks[i] = !asterisks[i];
				}
		}//end for  
	}

}
