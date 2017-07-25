public class HelloWorld {
    public static void main(String[] args) {
	
    int tuition = 10000;
    int tuitionInTenYears = 10000; 

      for(int i = 1; i < 15; i++) {
        tuition += tuition * 0.5;
        if(i == 10) {
          System.out.println( "Tuition in ten years : " + tuition );
          tuitionInTenYears = tuition;
        }
        System.out.println( i + " Tuition in ten years : " + tuition );
      }

      System.out.println("The total cost of four years’ worth of tuition after the tenth year is: " + (tuition - tuitionInTenYears) );
    }
}
