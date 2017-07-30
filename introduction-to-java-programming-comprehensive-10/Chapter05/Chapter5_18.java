public class HelloWorld {
	public static void main(String[] args) {
  
	  	int lineNumbers = 6;
	  	int numbersPerLine = 6;
 
	  	numbersPerLine++;
	  	
	  	System.out.println("Pattern A       Pattern B         Pattern C       Pattern D");
	  	
	  	for(int line = 0; line<lineNumbers; line++){ //i = number of the line
	  		
	  		//Start line
	  		String lineOut = ""; //Each line, a new String
 		
			  		//Print Pattern Type A
			  		for(int i = 1; i<numbersPerLine; i++){
		
			  			lineOut += (i<line+2) ? i+ " " : "  ";
			  		} 
			  		lineOut += "    ";
			  		
			  		//Print Pattern Type B
			  		for(int i = 1;  i<numbersPerLine; i++){
		
			  		  	lineOut += (numbersPerLine - line > i) ? i + " " : "  "; 
			  		}
			  		lineOut += "    ";
			  		
			  		//Print Pattern Type C
			  		for(int i = numbersPerLine; i>0; i--){
		
			  		  	lineOut += (line + 2 > i) ? i + " " : "  "; 
			  		}
			  		lineOut += "    ";
			  		
			  		//Print Pattern Type D
			  		for(int i = 1;  i<numbersPerLine; i++){
		
			  		  	lineOut += (line < i) ? (i - line)  + " " : "  ";  
			  		}
			  		
			  		 	
	  		System.out.println(lineOut + "\t"); //Print lineOut and Start a new line
	  	}
  	 
  	}
}
