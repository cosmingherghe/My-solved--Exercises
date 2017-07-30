public class HelloWorld {
	public static void main(String[] args) {

		String printLine;
		
		for(int i = 1; i<9; i++){
			
			printLine = "";//for a new line, a new string 
			int num = 1;
			
			for(int j = 1; j<16; j++){
			
				if(j < 9){ 
					//start multiplying num by 2 after the start line
					if(j == 9-i) {
						printLine += num + "\t";
					}
					else if(j < 9-i){
						printLine += "\t";
					}
					else{
						num*=2; 
						printLine += num + "\t" ;
					}
					
				} 
				else{
					num/=2; 
					printLine += (num == 0) ? "\t" : num + "\t" ; 
				} 
			}//end for J
			
			printLine += "\n"; //new line
			System.out.print(printLine); 
		}//end for I
		 
	}
}
