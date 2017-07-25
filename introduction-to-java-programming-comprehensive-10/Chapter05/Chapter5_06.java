public class HelloWorld {
  	public static void main(String[] args) { 
	
		System.out.println("Miles	\tKilometers  \t|  \tKilometers  \tMiles");

		for(int i = 1; i < 11; i++) {
			System.out.println( i + " \t\t" + String.format( "%.3f", (i * 1.609) ) +
			"\t\t|\t" + (i * 5 + 15) +  " \t\t" + String.format( "%.3f", ( (i * 5 + 15) * 0.621371) ) );
		}
		
  	}
}
