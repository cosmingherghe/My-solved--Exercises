/** (Guess the capitals) Write a program that repeatedly prompts the user to enter
  * a capital for a state. Upon receiving the user input, the program reports whether
  * the answer is correct. Assume that 50 states and their capitals are stored in a twodimensional
  * array. The program prompts the user to
  * answer all states’ capitals and displays the total correct count. The user’s answer
  * is not case-sensitive
  */
  
import java.util.Scanner;

public class GuessCapitals {
	public static void main(String[] args) {
	
		String[][] statesAndCapitals = { {"Alabama", "Montgomery"},
						{"Alaska", "Juneau"},
						{"Arizona", "Phoenix"},
						{"Arkansas", "Little Rock"},
						{"California", "Sacramento"},
						{"Colorado", "Denver"},
						{"Connecticut", "Hartford"},
						{"Delaware", "Dover"},
						{"Florida", "Tallahassee"},
						{"Georgia", "Atlanta"},
						{"Hawaii", "Honolulu"},
						{"Idaho", "Boise"},
						{"Illinois", "Springfield"},
						{"Indiana", "Indianapolis"},
						{"Iowa", "Des Moines"},
						{"Kansas", "Topeka"},
						{"Kentucky", "Frankfort"},
						{"Louisiana", "Baton Rouge"},
						{"Maine", "Augusta"},
						{"Maryland", "Annapolis"},
						{"Massachusetts", "Boston"},
						{"Michigan", "Lansing"},
						{"Minnesota", "St. Paul"},
						{"Mississippi", "Jackson"},
						{"Missouri", "Jefferson City"},
						{"Montana", "Helena"},
						{"Nebraska", "Lincoln"},
						{"Nevada", "Carson City"},
						{"New Hampshire", "Concord"},
						{"New Jersey",	"Trenton"},
						{"New Mexico", "Santa Fe"},
						{"New York", "Albany"},
						{"North Carolina", "Raleigh"},
						{"North Dakota", "Bismarck"},
						{"Ohio",  "Columbus"},
						{"Oklahoma", "Oklahoma City"},
						{"Oregon", "Salem"},
						{"Pennsylvania", "Harrisburg"},
						{"Rhode Island", "Providence"},
						{"South Carolina", "Columbia"},
						{"South Dakota", "Pierre"},
						{"Tennessee", "Nashville"},
						{"Texas", "Austin"},
						{"Utah", "Salt Lake City"},
						{"Vermont", "Montpelier"},
						{"Virginia", "Richmond"},
						{"Washington", "Olympia"},
						{"West Virginia", "Charleston"},
						{"Wisconsin", "Madison"},
						{"Wyoming", "Cheyenne"} };
						
		int index = 0;
		int correctAnswers = 0;
		String answer = "";
		String state = "";
		String capital = "";
		Scanner input = new Scanner(System.in);
		
		while(index != statesAndCapitals.length) {
		
			state = statesAndCapitals[index][0];
			capital = statesAndCapitals[index][1];
			
			System.out.printf("What is the capital of %s? ", state );
			answer = input.nextLine();  
			
			System.out.println(answer);
			 			
			if( answer.equalsIgnoreCase(capital) ) {
				System.out.println("Your answer is correct");
				correctAnswers++;
			}
			else  
				System.out.printf("The correct answer should be %s \n", capital);
				
			index++;
		}

		System.out.printf("The correct count is %d", correctAnswers);

	}
}
