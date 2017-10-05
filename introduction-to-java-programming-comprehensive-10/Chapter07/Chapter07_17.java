// (Sort students) Write a program that prompts the user to enter the number of students,
// the students’ names, and their scores, and prints student names in decreasing
// order of their scores.

import java.util.*;

class Main {
    public static void main(String[] args) {
        
        int numberOfStudents = getNumberOfStudents();
        String[] names = getStudentsName(numberOfStudents);
        int[] scores = getStudentsScores(numberOfStudents);
        
        sortScores(names, scores);
        
        for(int i = 0; i < numberOfStudents; i++) {
            System.out.print("Grade " + scores[i] + ", " + names[i]); 
        }
        
    }
    
    public static void sortScores(String[] names, int[] grades) {
        
         for (int i = 0; i < grades.length - 1; i++) {
             
             // Find the minimum in the list[i..grades.length-1]
             int currentMin = grades[i];
             int currentMinIndex = i;
             
             String currentName = names[i];

             for (int j = i + 1; j < grades.length; j++) {
                    if (currentMin > grades[j]) {
                        currentMin = grades[j];
                        currentMinIndex = j;
                        
                        currentName = names[j];
                    }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                    grades[currentMinIndex] = grades[i];
                    grades[i] = currentMin;
                
                    names[currentMinIndex] = names[i];
                    names[i] = currentName;
            }
        }
    }
    
    public static int[] getStudentsScores(int numberOfStudents) {
        int[] gradeBookScores = new int[numberOfStudents];
        
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < gradeBookScores.length; i++){
            System.out.print("For student " + (i + 1) + " enter the score: ");
            gradeBookScores[i] = input.nextInt();
        }
        return gradeBookScores;
    } 
    
    public static String[] getStudentsName(int numberOfStudents) {
        String[] gradeBookNames = new String[numberOfStudents];
        
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < gradeBookNames.length; i++){
            System.out.print("For student " + (i + 1) + " enter the name: ");
            gradeBookNames[i] = input.nextLine();
        }
        return gradeBookNames;
    } 
    
    public static int getNumberOfStudents() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: "); 
        return input.nextInt();
    }
}
