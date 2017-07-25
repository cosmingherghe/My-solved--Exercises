public class HelloWorld {
  	public static void main(String[] args) {
  
		System.out.println("Kilograms \tPounds");

		for(int i = 1; i < 20; i++) {
			System.out.println( i + " \t\t" + String.format( "%.2f", (i * 2.2) ) );
		}
		
  	}
}
