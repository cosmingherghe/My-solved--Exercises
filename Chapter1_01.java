
public class Chapter1_01 {

	/**
	 * EXERCISE 1
	 * (Display three messages) Write a program that displays Welcome to Java , 
	 * 	Welcome to Computer Science , and Programming is fun .
	 */
	
	public static void main(String[] args) {
		
		String newLine = System.getProperty("line.separator");	//This will retrieve line separator dependent on OS.
		
		System.out.println( "Welcome to Java" + newLine + 
					"Welcome to Computer Science" + newLine + 
					"Programming is fun" );
	}

}
