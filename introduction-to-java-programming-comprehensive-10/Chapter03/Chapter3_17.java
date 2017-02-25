import java.util.Scanner;
 
public class Main
{    
   public static void main(String[ ] args) {
   
      	Scanner input = new Scanner(System.in);
      
        System.out.print("Please enter a number 0, 1, or 2 representing scissor, rock, and paper: " );
	int ug = input.nextInt();
	int cg = (int)(Math.random() * 3);

	String ugStr;
	String cgStr;

	if( (ug == 0 && cg == 1) || (ug == 1 && cg == 2) || (ug == 2 && cg == 0) ) {
		System.out.print(" Computer wins !" );
	}
	else if( (ug == 0 && cg == 2) || (ug == 2 && cg == 0) || (ug == 2 && cg == 1) ) {
		System.out.print(" User wins !");
	}
	else {
		System.out.print(" Draw !");
	}

	if(ug == 0) {
		ugStr = "Scissor";
	} 
	else if(ug == 1) {
		ugStr = "Rock";
	} else {
		ugStr = "Paper";
	}

	if(cg == 0) {
		cgStr = "Scissor";
	} 
	else if(cg == 1) {
		cgStr = "Rock";
	} else {
		cgStr = "Paper";
	}

	System.out.println( " ( " + ugStr + " vs " + cgStr + " )");
   }   
}
