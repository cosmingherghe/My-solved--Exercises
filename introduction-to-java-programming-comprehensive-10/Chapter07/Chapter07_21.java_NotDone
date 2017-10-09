import java.util.*;

	public class BeanMachine {
	
	    public static void main(String[] args) {
	     
	    Scanner input = new Scanner(System.in);
		
		int ballsNumber, slotsNumber;
		
		System.out.print("Enter the number of the balls: ");
		ballsNumber = input.nextInt();
		
		System.out.print("Enter the number of the slots in the machine: ");
		slotsNumber = input.nextInt();
		
		String[] results = playBeanMachine(ballsNumber, slotsNumber);
		displayBallPath(results);
		
		displayBuildupInSlots(results, slotsNumber);
	}

	public static String[] playBeanMachine(int balls, int slots) {
		int leftRight;
		int ballSlotLocation; //0 it's the starting point where the ball hits 
		 
		/** for each ball we have a string with the results 
		+ 1 value for ball location on histogram */
		String[] results = new String[balls + 1]; 
		results[balls] = "";
		
		for(int i = 0; i < balls; i++ ) { 
			results[i] = ""; //starting the path pattern for the ball
			
			ballSlotLocation = 0;  
			
			for(int s = 0; s < slots - 1; s++){  
				leftRight = (int)(Math.random() * 2); //return 0 or 1
				
				results[i] += (leftRight == 0) ? "L" : "R";
				
				if(ballSlotLocation != 0) {
					ballSlotLocation += (leftRight == 0) ? -1 : 1; 
				}
				else
					ballSlotLocation += leftRight;	
			} 
			results[balls] += ballSlotLocation; //add ball location in the slots
		}
		
		return results;	
	}

	public static void displayBallPath(String[] test) {
	    
	    for(int i = 0; i < test.length - 1; i++){
	        System.out.println(test[i]); 
	    }
	    System.out.println(); // new line
	}

	public static void displayBuildupInSlots(String[] test, int slots) {
		int[] buildup = new int[test[test.length - 1].length()];
	
		for(int i = 0; i < buildup.length; i++) //get number of balls in each slots
			buildup[Character.getNumericValue(test[test.length - 1].charAt(i))]++;
	     
		int height = getBiggestNumberOfBallsInSlot(buildup);
 
		/**BuildupInSlots*/
		for(int h = height; h > 0; h--) { 
			for (int i = 0; i < slots; i++) {
				
				if(buildup[i] >= h)
					System.out.print("O ");
				else
					System.out.print("  ");
			}
			System.out.println();
		} 
	}

	public static int getBiggestNumberOfBallsInSlot(int[] slot) {
		int max = slot[0]; 
		
		for(int i = 1; i < slot.length; i++){
	    	if(max < slot[i]) {
	    		max = slot[i];
	    	}
	    } 
	    return max;
	}

}
