/**
*	(Display patterns) Write a method to display a pattern as follows:
*	1
*	2 1
*	3 2 1
*	...
*	n n-1 ... 3 2 1
*	The method header is
*	public static void displayPattern(int n)
*/
 
public class DisplayPatern {

	public static void main(String[] args) {
		
		displayPattern(9);
	}

	public static void displayPattern(int n) {

		for(int i = 1; i <=n ; i++){

			for(int z = n; z > 0; z--){
				if(z > i)
					System.out.print("  ");
				else
					System.out.print(" " + z);
			}//End For z

			System.out.println(); //New Line
		}//End For i
	}

}
