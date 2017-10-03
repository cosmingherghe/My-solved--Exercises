/*
 * (Assign grades) Write a program that reads student scores, gets the best score,
 * and then assigns grades based on the following scheme:
 * Grade is A if score is Ú best - 10
 * Grade is B if score is Ú best - 20;
 * Grade is C if score is Ú best - 30;
 * Grade is D if score is Ú best - 40;
 * Grade is F otherwise.
 * The program prompts the user to enter the total number of students, then prompts
 * the user to enter all of the scores, and concludes by displaying the grades.
 */

import java.util.*;

public class AssignGrades {

	public static void main(String[] args) {

		int best = 100;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int[] students = new int[input.nextInt()];
		
		//Enter scores for N students
		enterScores(students.length, students);
		
		//Display grades
		displayingGrades(best, students);
	}
	
	public static void enterScores(int x, int[] students) { 
		Scanner input = new Scanner(System.in);

		System.out.print("Enter " + x + " scores: ");
		for(int i = 0; i < x; i++){
			students[i] = input.nextInt();
		}
	}
	
	public static void displayingGrades(int best, int[] students) {
		for(int i = 0; i<students.length; i++) {
			if(students[i] >= best - 10)
				System.out.println("Student " + i + " score is " + students[i] + " and the grade is A");
			else if(students[i] >= best - 20)
				System.out.println("Student " + i + " score is " + students[i] + " and the grade is B");
			else if(students[i] >= best - 30)
				System.out.println("Student " + i + " score is " + students[i] + " and the grade is C");
			else if(students[i] >= best - 40)
				System.out.println("Student " + i + " score is " + students[i] + " and the grade is D");
			else
				System.out.println("Student " + i + " score is " + students[i] + " and the grade is F");
		}
	}

}
