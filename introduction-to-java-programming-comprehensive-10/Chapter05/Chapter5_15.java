public class HelloWorld {
	public static void main(String[] args) {
	     
	     String characters = "";
	   
		for(int i = 33; i < 127; i++) {
			characters +=  Character.toString ((char) i) + " "; 
		}

		System.out.println(characters);  
	}
}
