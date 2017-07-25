public class HelloWorld {
    public static void main(String[] args) {
    
   	System.out.println("Miles \tKilometers");
	
        for(int i = 1; i < 11; i++) {
          System.out.println( i + " \t" + String.format( "%.3f", (i * 1.609) ) );
        }
	
    }
}
