import java.util.Scanner;

/*
 * (Analyze scores) Write a program that reads an unspecified number of scores and
 * determines how many scores are above or equal to the average and how many
 * scores are below the average. Enter a negative number to signify the end of the
 * input. Assume that the maximum number of scores is 100.
 */
public class AnalyzeScore { 
	
	public static void main(String[] args) {

		 int[] test = getScores();
		 
		 showAboveBelowOrEqualToTheAverage(test);
	}
	
	public static void showAboveBelowOrEqualToTheAverage(int[] x) {
		int sum = 0;
		int average;
		int aboveAverage = 0;
		int belowAverage = 0;
		int equalAverage = 0;
		
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		average = sum / x.length;
		
		for (int i = 0; i < x.length; i++) {
			
			if(x[i] > average) aboveAverage++;
			else if (x[i] < average) belowAverage++;
			else equalAverage++;
		}
		
		System.out.println(x.length + " numbers.\n" 
							+ aboveAverage + " above the average.\n"
							+ equalAverage + " equal to the average\n"
							+ belowAverage + " below the average");
	}
	
	public static int[] getScores() {
		Scanner input = new Scanner(System.in); 
		int numberOfNumbers = 0;
		int[] scores;
		
		System.out.print("Enter up to 100 scores: ");
		String userInput = input.nextLine();
		
		//check how long the array should be
		Scanner countNumbers = new Scanner(userInput);
		while(countNumbers.hasNextInt()){
				countNumbers.nextInt();
			numberOfNumbers++;
		}
		
		//create the array
		countNumbers = new Scanner(userInput);
		scores = new int[numberOfNumbers];
		
		//add values in the array
		for (int i = 0; i < scores.length; i++) {
			scores[i] = countNumbers.nextInt();
		} 
		
		return scores;
	}

}
