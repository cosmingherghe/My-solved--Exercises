public class HelloWorld {
	public static void main(String[] args) {
  
	  	int lineNumbers = 6;
	  	int numbersPerLine = 6;
	  	int numberOfPatterns = 4;
	  	
	  	
	  	numbersPerLine++;
	  	for(int line = 0; line<lineNumbers; line++){ //i = number of the line
	  		
	  		//Start line
	  		String lineOut = ""; //Each line, a new String
	  		
	  		while(numberOfPatterns>0) {
	  		
	  			if(numberOfPatterns%2 == 0) {
			  		//Print Pattern Type A
			  		for(int i = 1; i<numbersPerLine; i++){
		
			  			lineOut += (i<line+2) ? i+ " " : "__";
			  		}
		  		}
		  		else {
			  		//Print Pattern Type B
			  		for(int j = 1;  j<numbersPerLine; j++){
		
			  		  	lineOut += (numbersPerLine - line > j) ? j + " " : "__"; 
			  		}
		  		}
		  		
		  		numberOfPatterns--;
			}//End while
			
	  		System.out.println(lineOut + "\t"); //Print lineOut and Start a new line
	  	}
  	 
  	}
}
