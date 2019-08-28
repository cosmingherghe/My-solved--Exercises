/*

(Maximum element in ArrayList) Write the following method that returns the maximum value in an ArrayList of integers. The method returns null if the list is null or the list size is 0.

public static Integer max(ArrayList<Integer> list)

Write a test program that prompts the user to enter a sequence of numbers ending with 0, and invokes this method to return the largest number in the input.

*/

import java.util.*;

public class Main {
 
	public static void main(String[] args) { 
 

    //TEST
    Course economics = new Course("Economics");

    System.out.println("\n\nCouse name: " + economics.getCourseName());

    economics.addStudent("Olivia");
    economics.addStudent("George");
    economics.addStudent("Harry");
    economics.addStudent("Isla");
    economics.addStudent("Ava");

    //Display list
    System.out.println("\nNumber of Students: " + economics.getNumberOfStudents());
    for (int i = 0; i < economics.getStudents().size(); i++) {
			System.out.println(economics.getStudents().get(i));
		}

    System.out.println("\ndropStudent(\"Harry\")\ndropStudent(\"Ava\")"); 
    economics.dropStudent("Harry");
    economics.dropStudent("Ava");
    //Display list
    System.out.println("\nNumber of Students: " + economics.getNumberOfStudents());
    for (int i = 0; i < economics.getStudents().size(); i++) {
			System.out.println(economics.getStudents().get(i));
		}
 
  } 
 
}
