import java.util.*; 

public class HelloWorld {
    public static void main(String[] args) {
	
      int students = 0;
      int score = 0;
      int scoreHighest = 0;
      String studentHighestScore  = "";
      String name = "";
      Scanner input = new Scanner(System.in);

      System.out.print( "Enter the number of students: ");
      students = input.nextInt();

        while(students > 0) { 

          System.out.print( "Enter a name for student number " + students + ": " );
          name = input.nextLine();
          name = input.nextLine();

          System.out.print( "Enter a score for student number " + students + ": " );
          score = input.nextInt();

          System.out.println();

          if(score > scoreHighest) {  
            studentHighestScore = "The student with the highest score (" +  score + ") is: " + name;
            scoreHighest = score;
          }
          students--;
        }

        System.out.println( studentHighestScore );
    }
}
