// (Count single digits) Write a program that generates 100 random integers between
// 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
// say counts, to store the counts for the number of 0s, 1s, ..., 9s.)

public class CountSingleDigits {

	public static void main(String[] args) {

		displaysCountOfNumbers(get100RandomInts());
	}
	
	private static void displaysCountOfNumbers(int[] x) {
		int[] countNumbers = new int[10];
		
		for (int i = 0; i < x.length; i++) {
			countNumbers[x[i]]++;
		}
		
		for (int i = 0; i < countNumbers.length; i++) {
			System.out.println(i + " occurs " + countNumbers[i] + " times");
		}
	}
	
	private static int[] get100RandomInts() {
		
		int[] randomInts = new int[100];
		
		for (int i = 0; i < randomInts.length; i++) {
			randomInts[i] = (int)(Math.random() * 10);
		}
		
		return randomInts;
	}

}
